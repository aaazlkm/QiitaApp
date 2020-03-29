package hoge.hogehoge.myapplication.infra.api.qiita

import hoge.hogehoge.myapplication.infra.api.qiita.model.ArticleInAPI
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.QueryMap
import retrofit2.http.Url

interface QiitaService {

    @GET
    fun fetchArticles(@Url url: String, @QueryMap parameters: Map<String, String>): Single<List<ArticleInAPI>>
}
