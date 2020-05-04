package com.example.appmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONArrayRequestListener
import kotlinx.android.synthetic.main.activity_edit_pengumuman.*
import org.json.JSONArray

class edit_pengumuman : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_pengumuman)

        var context=this

        update5.setOnClickListener {
            var data_jdl=jdlpeng.text.toString()
            var data_isi=isipeng.text.toString()

            postkeserver(data_jdl,data_isi)


            intent = Intent(context,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnbck5.setOnClickListener {
            intent = Intent(context,pengumuman::class.java)
            startActivity(intent)
            finish()
        }
    }
    fun postkeserver(jdlpeng:String, isipeng:String)
    {
        AndroidNetworking.post("http://10.35.150.220/mter/coba/proses-pengumuman.php")
            .addBodyParameter("judul_pengumuman", jdlpeng)
            .addBodyParameter("isi_pengumuman", isipeng)
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
