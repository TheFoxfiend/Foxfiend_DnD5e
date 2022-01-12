package com.example.foxfienddnd5e.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.apollographql.apollo.api.Response
import com.apollographql.apollo.exception.ApolloException
import com.example.foxfienddnd5e.SpellListQuery
import com.example.foxfienddnd5e.repository.SpellRepo
import com.example.foxfienddnd5e.view.state.ViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import javax.inject.Inject

@ExperimentalCoroutinesApi
@HiltViewModel
class DnD5eViewModel @Inject constructor(
    private val repository: SpellRepo,
) : ViewModel() {

    private val _SpellList by lazy { MutableLiveData<ViewState<Response<SpellListQuery.Data>>>() }

    val SpellList: LiveData<ViewState<Response<SpellListQuery.Data>>>
        get() = _SpellList

    fun querySpellList() = viewModelScope.launch {
        _SpellList.postValue(ViewState.Loading())
        try {
            val response = repository.querySpellsList()
            _SpellList.postValue(ViewState.Success(response))
        } catch (e: ApolloException){
            Log.d("Apollo Exception", "Failure", e)
            _SpellList.postValue(ViewState.Error("Error fetching spells"))
        }
    }
}

