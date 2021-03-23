package com.example.profilesekolahapp.model

import com.squareup.moshi.Json

data class ItemRV (
 @Json(name = "urlGambar")
 var urlGambar: String = "",
 @Json(name = "title")
 var title: String = "",
 @Json(name = "deskripsi")
 var deskripsi : String = "",
 var type : String = ""
)
