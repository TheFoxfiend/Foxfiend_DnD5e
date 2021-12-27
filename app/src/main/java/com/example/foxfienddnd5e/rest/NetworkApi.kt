package com.example.foxfienddnd5e.rest

import com.example.foxfienddnd5e.model.spells.Spell
import com.example.foxfienddnd5e.model.spells.SpellsList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface NetworkApi {

    //functions for retrieving the spells
    @GET(SPELL_LIST)
    suspend fun retrieveSpellList(): Response<SpellsList>

    @GET(SPELL_DETAILS)
    suspend fun retrieveSpell(@Path("spellName") spellName:String): Response<Spell>

    companion object{
        //our urls that we need, BASE_URL is going to be needed publicly
        const val BASE_URL = "https://www.dnd5eapi.co/"

        private const val SPELL_LIST = "api/spells"
        private const val SPELL_DETAILS = "api/spells/{spellName}"
    }
}