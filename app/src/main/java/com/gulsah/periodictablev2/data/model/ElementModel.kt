package com.gulsah.periodictablev2.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ElementModel(
    @SerializedName("atomicNumber")
    @Expose
    var atomicNumber : Int,
    @SerializedName("symbol")
    @Expose
    var symbol : String,
    @SerializedName("name")
    @Expose
    var name: String,
    @SerializedName("groupBlock")
    @Expose
    var group: String
) {
}