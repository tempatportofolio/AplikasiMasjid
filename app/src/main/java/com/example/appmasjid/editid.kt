package com.example.appmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONArrayRequestListener
import kotlinx.android.synthetic.main.activity_editid.*
import org.json.JSONArray

class editid : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editid)

        val context=this

        update.setOnClickListener {
            var data_namamasjid=data1.text.toString()
            var data_alamatmasjid=data2.text.toString()

            postkeserver(data_namamasjid,data_alamatmasjid)


            intent = Intent(context,MainActivity::class.java)
            startActivity(intent)
            finish()


        }

        btnbck.setOnClickListener {
            intent = Intent(context,identitas::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun postkeserver(data1:String,data2:String)
    {
        AndroidNetworking.post("http://10.35.150.220/mter/coba/proses-identitas.php")
            .addBodyParameter("nama_masjid", data1)
            .addBodyParameter("alamat_masjid", data2)
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONArray(object : JSONArrayRequestListener {
                override fun onResponse(response: JSONArray?) {
                    //To change body of created functions use File | Settings | File Templates.
                }

                override fun onError(error: ANError) {

                }
            })
    }
}
