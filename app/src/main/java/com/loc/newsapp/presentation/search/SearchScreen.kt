package com.loc.newsapp.presentation.search

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.paging.compose.collectAsLazyPagingItems
import com.loc.newsapp.domain.model.Article
import com.loc.newsapp.presentation.Dimens.MediumPadding1
import com.loc.newsapp.presentation.commom.ArticleList
import com.loc.newsapp.presentation.commom.SearchBar

@Composable
fun SearchScreen(
    state: SearchState,
    event: (SearchEvent) -> Unit,
    navigationToDetails: (Article) -> Unit
) {
    Column(
        modifier = Modifier
            .padding(
                start = MediumPadding1,
                top = MediumPadding1,
                end = MediumPadding1
            )
            .statusBarsPadding()
            .fillMaxSize()
    ) {

        SearchBar(
            text = state.searchQuery,
            readOnly = false,
            onValueChange = { event(SearchEvent.UpdateSearchEvent(it)) },
            onSearch = {event(SearchEvent.SearchNews)})

        Spacer(modifier = Modifier.height(MediumPadding1))

        state.article?.let {
            val article = it.collectAsLazyPagingItems()
            ArticleList(articles = article, onClick = {navigationToDetails(it)})
        }
    }

}