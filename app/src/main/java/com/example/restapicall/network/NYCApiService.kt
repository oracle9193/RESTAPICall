package com.example.restapicall.network
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com"
private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface NYCApiService {
    @GET("photos")
    suspend  fun getPhotos(): String
}

object NYCApi{
    val retrofitService : NYCApiService by lazy {
        retrofit.create(NYCApiService::class.java)
    }
}