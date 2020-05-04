package com.example.appmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONObjectRequestListener
import kotlinx.android.synthetic.main.activity_pengumuman.*
import org.json.JSONObject

class pengumuman : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengumuman)

        getdariserver3()

        val context=this

        btn4.setOnClickListener {
            intent = Intent(context,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        keupdate5.setOnClickListener {
            intent = Intent(context,edit_pengumuman::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun getdariserver3(){
        AndroidNetworking.get("http://10.35.150.220/mter/coba/pengumuman_json.php")
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONObject(object : JSONObjectRequestListener {
                override fun onResponse(response: JSONObject){
                    Log.e("_kotlinResponse", response.toString())

                    val jsonArray = response.getJSONArray("result")
                    for (i in 0 until jsonArray.length()){
                        val jsonObject = jsonArray.getJSONObject(i)
                        Log.e("_kotlinTitle", jsonObject.optString("judul"))
                        judul.setText(jsonObject.optString("judul"))
                        isi.setText(jsonObject.optString("isi"))
                    }
                }

                override fun onError(anError: ANError) {
                    Log.i("_err", anError.toString())
                }
            })
    }
}
