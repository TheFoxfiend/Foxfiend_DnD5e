package com.example.foxfienddnd5e.di

import com.example.foxfienddnd5e.repository.SpellRepo
import com.example.foxfienddnd5e.repository.SpellRepoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class ViewModelModule {

    @Binds
    @ViewModelScoped
    abstract fun bindRepository(repo: SpellRepoImpl): SpellRepo
}