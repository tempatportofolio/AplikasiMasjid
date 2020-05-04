package com.example.appmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONObjectRequestListener
import kotlinx.android.synthetic.main.activity_identitas.*
import org.json.JSONObject

class identitas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_identitas)

        val context=this

        getdariserver2()


        btn2.setOnClickListener {
            val intent2 = Intent(context,MainActivity::class.java)
            startActivity(intent2)
            finish()
        }

        keupdate.setOnClickListener {
            intent = Intent(context,editid::class.java)
            startActivity(intent)
            finish()
        }

    }

    fun getdariserver2() {
        AndroidNetworking.get("http://10.35.150.220/mter/coba/nama_masjid_json.php")
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONObject(object : JSONObjectRequestListener {
                override fun onResponse(response: JSONObject){
                    Log.e("_kotlinResponse", response.toString())

                    val jsonArray = response.getJSONArray("result")
                    for (i in 0 until jsonArray.length()){
                        val jsonObject = jsonArray.getJSONObject(i)
                        Log.e("_kotlinTitle", jsonObject.optString("Nama"))
                        nama.setText(jsonObject.optString("Nama"))
                        alamat.setText(jsonObject.optString("Alamat"))
                    }
                }

                override fun onError(anError: ANError) {
                    Log.i("_err", anError.toString())
                }
            })
    }
}
