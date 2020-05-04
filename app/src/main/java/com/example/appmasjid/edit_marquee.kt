package com.example.appmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONArrayRequestListener
import kotlinx.android.synthetic.main.activity_edit_marquee.*
import org.json.JSONArray

class edit_marquee : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_marquee)

        val context=this

        update2.setOnClickListener {
            var data_marquee=datamarquee.text.toString()

            postkeserver(data_marquee)


            intent = Intent(context,MainActivity::class.java)
            startActivity(intent)
            finish()


        }
        btnbck2.setOnClickListener {
            intent = Intent(context,marquee::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun postkeserver(datamarquee:String)
    {
        AndroidNetworking.post("http://10.35.150.220/mter/coba/proses-marquee.php")
            .addBodyParameter("isi_marquee", datamarquee)
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
