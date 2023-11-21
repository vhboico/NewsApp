package com.loc.newsapp.domain.usecases.news

import com.loc.newsapp.data.local.Dao
import com.loc.newsapp.domain.model.Article
import kotlinx.coroutines.flow.Flow

class SelectArticles(
    private val dao: Dao
) {
    operator fun invoke(): Flow<List<Article>> {
        return dao.getArticles()
    }
}