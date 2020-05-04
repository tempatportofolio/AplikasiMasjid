package com.example.appmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONObjectRequestListener
import kotlinx.android.synthetic.main.activity_slideshow.*
import org.json.JSONObject

class slideshow : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slideshow)

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager= LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val users=ArrayList<User>()

        var context=this

        btnbck6.setOnClickListener {
            intent = Intent(context,MainActivity::class.java)
            startActivity(intent)
            finish()
        }


        AndroidNetworking.get("http://192.168.100.182/mter/coba/slideshow_json.php")
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONObject(object : JSONObjectRequestListener {
                override fun onResponse(response: JSONObject) {
                    Log.e("_kotlinResponse", response.toString())

                    val jsonArray = response.getJSONArray("result")
                    for (i in 0 until jsonArray.length()) {
                        val jsonObject = jsonArray.getJSONObject(i)
                        Log.e("_kotlinTitle", jsonObject.optString("shubuh"))

                        // txt1.setText(jsonObject.optString("shubuh"))
                        var isi1=jsonObject.optString("judul").toString()
                        var isi2=jsonObject.optString("Alamat").toString()

                        users.add(User("$isi1", "$isi2"))


                    }

                    val adapter=CustomAdapter(users)
                    recyclerView.adapter=adapter


                }

                override fun onError(anError: ANError) {
                    Log.i("_err", anError.toString())
                }
            })

    }
}
