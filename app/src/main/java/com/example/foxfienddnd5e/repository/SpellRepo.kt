package com.example.foxfienddnd5e.repository

import com.apollographql.apollo.api.Response
import com.example.foxfienddnd5e.SpellListQuery

interface SpellRepo {

    suspend fun querySpellsList(): Response<SpellListQuery.Data>
}