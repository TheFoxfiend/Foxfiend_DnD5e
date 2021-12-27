package com.example.foxfienddnd5e.model.spells


import com.google.gson.annotations.SerializedName

data class SpellsList(
    @SerializedName("count")
    val count: Int,
    @SerializedName("results")
    val results: List<Result>
)