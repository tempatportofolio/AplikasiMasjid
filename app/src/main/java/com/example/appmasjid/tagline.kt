package com.example.appmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONObjectRequestListener
import kotlinx.android.synthetic.main.activity_tagline.*
import org.json.JSONObject

class tagline : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tagline)

        getdariserver4()

        val context=this

        btn6.setOnClickListener {
            intent = Intent(context,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        keupdate3.setOnClickListener {
            intent = Intent(context,edit_tagline::class.java)
            startActivity(intent)
            finish()
        }


    }
    fun getdariserver4(){
        AndroidNetworking.get("http://10.35.150.220/mter/coba/tagline_json.php")
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONObject(object : JSONObjectRequestListener {
                override fun onResponse(response: JSONObject){
                    Log.e("_kotlinResponse", response.toString())

                    val jsonArray = response.getJSONArray("result")
                    for (i in 0 until jsonArray.length()){
                        val jsonObject = jsonArray.getJSONObject(i)
                        Log.e("_kotlinTitle", jsonObject.optString("Isi"))
                        tagline.setText(jsonObject.optString("Isi"))
                    }
                }

                override fun onError(anError: ANError) {
                    Log.i("_err", anError.toString())
                }
            })
    }




}
