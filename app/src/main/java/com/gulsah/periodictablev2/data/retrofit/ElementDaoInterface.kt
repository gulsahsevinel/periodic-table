package com.gulsah.periodictablev2.data.retrofit

import com.gulsah.periodictablev2.data.model.ElementModel
import retrofit2.Call
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET

interface ElementDaoInterface {
    @GET("elements")
    fun allElements() : Call<List<ElementModel>>
}