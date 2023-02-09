package com.example.mvvmnews.ui.fragments

import androidx.fragment.app.Fragment
import com.example.mvvmnews.adapters.NewsAdapter
import com.example.mvvmnews.ui.NewsViewModel

abstract class BaseFragment(
    layoutId: Int,
) : Fragment(layoutId) {
    lateinit var viewModel: NewsViewModel
    lateinit var newsAdapter: NewsAdapter
}