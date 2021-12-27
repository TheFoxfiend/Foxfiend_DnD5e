package com.example.foxfienddnd5e.model.spells


import com.google.gson.annotations.SerializedName

data class Damage(
    @SerializedName("damage_at_slot_level")
    val damageAtSlotLevel: DamageAtSlotLevel,
    @SerializedName("damage_type")
    val damageType: DamageType
)