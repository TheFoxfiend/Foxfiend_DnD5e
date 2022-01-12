package com.example.foxfienddnd5e.di

import com.example.foxfienddnd5e.networking.FoxfiendDnD5eApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Singleton
    @Provides
    fun provideWebService() = FoxfiendDnD5eApi()
}