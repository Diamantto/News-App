package com.example.mvvmnews.util

import com.example.mvvmnews.BuildConfig

class Constants {
    companion object {
        const val API_KEY = BuildConfig.API_KEY
        const val BASE_URL = "https://newsapi.org"
        const val SEARCH_NEWS_TIME_DELAY = 500L
        const val QUERY_PAGE_SIZE = 20
        const val COUNTRY_CODE = "ua"
    }
}