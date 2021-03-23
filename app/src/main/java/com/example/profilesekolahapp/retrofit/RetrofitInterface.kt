package com.example.profilesekolahapp.retrofit

import androidx.lifecycle.LiveData
import com.example.profilesekolahapp.model.ItemRV
import retrofit2.Response
import retrofit2.http.GET


interface RetrofitInterface {
    @GET("data/ekskul.json")
    fun getDataEkskul() : LiveData<List<ItemRV>>

    @GET("data/galeri.json")
    fun getDataGaleri() : LiveData<List<ItemRV>>
}