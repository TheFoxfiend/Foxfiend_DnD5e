package com.example.foxfienddnd5e.model.spells


import com.google.gson.annotations.SerializedName

data class Spell(
    //annotation key: a = always return, n = not always applicable
    @SerializedName("attack_type")  //  n
    val attackType: String,
    @SerializedName("casting_time") //a
    val castingTime: String,
    @SerializedName("classes")      //a         model class associated
    val classes: List<Classe>,
    @SerializedName("components")   //a     possible responses: any combination of "V", "S", "M", for Verbal, Somatic, and Material respectively
    val components: List<String>,
    @SerializedName("concentration")//a
    val concentration: Boolean,
    @SerializedName("damage")       //  n       model class associated
    val damage: Damage,
    @SerializedName("desc")         //a
    val desc: List<String>,
    @SerializedName("duration")     //a
    val duration: String,
    @SerializedName("higher_level") //  n
    val higherLevel: List<String>,
    @SerializedName("index")        //a
    val index: String,
    @SerializedName("level")        //a
    val level: Int,
    @SerializedName("material")     //  n   only when one of "components" list is "M"
    val material: String,
    @SerializedName("name")         //a
    val name: String,
    @SerializedName("range")        //a
    val range: String,
    @SerializedName("ritual")       //a
    val ritual: Boolean,
    @SerializedName("school")       //a         model class associated
    val school: School,
    @SerializedName("subclasses")   //a     Can sometimes be an empty list, model class associated
    val subclasses: List<Subclasse>,
    @SerializedName("url")          //a     self referential
    val url: String
)