package com.example.appmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONObjectRequestListener
import kotlinx.android.synthetic.main.activity_marquee.*
import org.json.JSONObject

class marquee : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marquee)

        getdariserver5()

        val context=this

        btn8.setOnClickListener {
            intent = Intent(context,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        keupdate2.setOnClickListener {
            intent = Intent(context,edit_marquee::class.java)
            startActivity(intent)
            finish()
        }

    }

    fun getdariserver5(){
        AndroidNetworking.get("http://10.35.150.220/mter/coba/marquee_json.php")
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONObject(object : JSONObjectRequestListener {
                override fun onResponse(response: JSONObject){
                    Log.e("_kotlinResponse", response.toString())

                    val jsonArray = response.getJSONArray("result")
                    for (i in 0 until jsonArray.length()){
                        val jsonObject = jsonArray.getJSONObject(i)
                        Log.e("_kotlinTitle", jsonObject.optString("Isi"))
                        marku.setText(jsonObject.optString("Isi"))
                    }
                }

                override fun onError(anError: ANError) {
                    Log.i("_err", anError.toString())
                }
            })
    }
}
