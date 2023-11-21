package com.loc.newsapp.domain.usecases.news

import com.loc.newsapp.data.local.Dao
import com.loc.newsapp.domain.model.Article

class DeleteArticle(
    private val dao: Dao
) {
    suspend operator fun invoke(article: Article){
        dao.delete(article)
    }
}