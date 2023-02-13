package com.example.mvvmnews.api

import com.example.mvvmnews.models.NewsResponse
import com.example.mvvmnews.util.Constants.Companion.API_KEY
import com.example.mvvmnews.util.Constants.Companion.COUNTRY_CODE
import com.example.mvvmnews.util.Constants.Companion.QUERY_PAGE_SIZE
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode: String = COUNTRY_CODE,
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = API_KEY
    ): Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q")
        searchQuery: String,
        @Query("pageSize")
        pageSize: Int = QUERY_PAGE_SIZE,
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = API_KEY
    ): Response<NewsResponse>
}