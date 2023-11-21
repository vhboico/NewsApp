package com.loc.newsapp.domain.usecases.news

import com.loc.newsapp.data.local.Dao
import com.loc.newsapp.domain.model.Article

class UpsertArticle(
    private val dao: Dao
) {

    suspend operator fun invoke(article: Article){
        dao.upsert(article)
    }
}