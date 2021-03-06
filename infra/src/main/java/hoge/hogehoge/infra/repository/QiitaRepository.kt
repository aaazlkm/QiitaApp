package hoge.hogehoge.infra.repository

import hoge.hogehoge.infra.api.qiita.api.GetArticleAPI
import hoge.hogehoge.infra.api.qiita.api.GetArticlesAPI
import hoge.hogehoge.infra.api.qiita.model.ArticleInAPI
import hoge.hogehoge.infra.database.entity.ArticleInDB
import io.reactivex.Completable
import io.reactivex.Maybe
import io.reactivex.Single

interface QiitaRepository {
    fun fetchArticle(request: GetArticleAPI.Request): Single<ArticleInAPI>

    fun fetchArticles(request: GetArticlesAPI.Request): Single<List<ArticleInAPI>>

    fun fetchSavedArticle(articleId: String): Maybe<ArticleInDB>

    fun fetchSavedArticles(): Single<List<ArticleInDB>>

    fun upsertSavedArticles(vararg articles: ArticleInDB): Completable

    fun deleteSavedArticle(article: ArticleInDB): Completable
}
