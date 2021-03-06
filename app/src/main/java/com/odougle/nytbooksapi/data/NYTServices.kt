package com.odougle.nytbooksapi.data

import com.odougle.nytbooksapi.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NYTServices {
    @GET("lists.json")
    fun getBooks(
        @Query("api-key") apiKey: String = "jAge5QLXBC5YSJ4hCEKF9vrRfakq4cJ7",
        @Query("list") list: String = "hardcover-fiction"
    ): Call<BookBodyResponse>
}