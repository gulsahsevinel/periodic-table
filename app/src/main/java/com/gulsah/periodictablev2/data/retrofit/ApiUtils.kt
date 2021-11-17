package com.gulsah.periodictablev2.data.retrofit

class ApiUtils {
    companion object{
        val BASE_URL = "https://periodic-table-elements-info.herokuapp.com/"
        fun getElemenetDaoInterface():ElementDaoInterface{
            return RetrofitClient.getClient(BASE_URL).create(ElementDaoInterface::class.java)
        }
    }
}