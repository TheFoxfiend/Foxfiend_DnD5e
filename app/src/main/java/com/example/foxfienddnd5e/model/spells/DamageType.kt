package com.example.foxfienddnd5e.model.spells


import com.google.gson.annotations.SerializedName

data class DamageType(
    @SerializedName("index")
    val index: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)