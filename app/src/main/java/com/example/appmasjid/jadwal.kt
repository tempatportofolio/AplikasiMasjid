package com.example.appmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONObjectRequestListener
import kotlinx.android.synthetic.main.activity_jadwal.*
import org.json.JSONObject

class jadwal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jadwal)

        getdariserver()

        val context=this

        btn1.setOnClickListener {
            val intent = Intent(context,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        upjad.setOnClickListener {
            val intent = Intent(context,edit_jadwal::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun getdariserver(){
        AndroidNetworking.get("https://192.168.100.182/contoh_jadwal_json.php")
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONObject(object : JSONObjectRequestListener {
                override fun onResponse(response: JSONObject){
                    Log.e("_kotlinResponse", response.toString())

                    val jsonArray = response.getJSONArray("result")
                    for (i in 0 until jsonArray.length()){
                        val jsonObject = jsonArray.getJSONObject(i)
                        Log.e("_kotlinTitle", jsonObject.optString("shubuh"))
                        txt1.setText(jsonObject.optString("Tes" +"shubuh"))
                        txt2.setText(jsonObject.optString("dhuhur"))
                        txt3.setText(jsonObject.optString("ashar"))
                        txt4.setText(jsonObject.optString("maghrib"))
                        txt5.setText(jsonObject.optString("isha"))
                        txt6.setText(jsonObject.optString("dhuha"))
                    }
                }

                override fun onError(anError: ANError) {
                    Log.i("_err", anError.toString())
                }
            })
    }
}
