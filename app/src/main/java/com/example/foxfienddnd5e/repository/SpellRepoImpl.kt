package com.example.foxfienddnd5e.repository

import com.apollographql.apollo.api.Response
import com.apollographql.apollo.coroutines.await
import com.example.foxfienddnd5e.SpellListQuery
import com.example.foxfienddnd5e.networking.FoxfiendDnD5eApi
import javax.inject.Inject

class SpellRepoImpl @Inject constructor(
    private val webService: FoxfiendDnD5eApi
) : SpellRepo{
    override suspend fun querySpellsList(): Response<SpellListQuery.Data> {
        return webService.getApolloClient().query(SpellListQuery()).await()
    }
}