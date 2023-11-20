package com.loc.newsapp.presentation.onboarding.componentes

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        "Just a simple text",
        "A biggest description to test if my page will be a good page for the users ",
        R.drawable.onboarding1
    ),
    Page(
        "Just a simple text",
        "A biggest description to test if my page will be a good page for the users ",
        R.drawable.onboarding2
    ),
    Page(
        "Just a simple text",
        "A biggest description to test if my page will be a good page for the users ",
        R.drawable.onboarding3
    )
)