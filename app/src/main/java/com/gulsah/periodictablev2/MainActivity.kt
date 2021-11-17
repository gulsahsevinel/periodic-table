package com.gulsah.periodictablev2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.gulsah.periodictablev2.data.model.ElementModel
import com.gulsah.periodictablev2.data.retrofit.ApiUtils
import com.gulsah.periodictablev2.data.retrofit.ElementDaoInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

private lateinit var daoi : ElementDaoInterface
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        daoi = ApiUtils.getElemenetDaoInterface()
        elements()
    }

    fun elements(){
        daoi.allElements().enqueue(object : Callback<List<ElementModel>> {
            override fun onResponse(
                call: Call<List<ElementModel>>,
                response: Response<List<ElementModel>>
            ) {
                val list = response.body()
                if (list != null) {
                    for (k in list){
                        Log.e("adı", k.name)
                    }
                }
            }

            override fun onFailure(call: Call<List<ElementModel>>, t: Throwable) {
                Log.e("adı", "faiilll")
            }

        })
    }
}