package hoge.hogehoge.myapplication.infra.api.qiita.api

import hoge.hogehoge.myapplication.infra.api.qiita.QiitaAPIConfiguration
import hoge.hogehoge.myapplication.infra.api.template.APIConfiguration
import hoge.hogehoge.myapplication.infra.api.template.APIRequest

object GetArticleAPI {
    data class Request(
        val itemId: String
    ) : APIRequest {
        override var configuration: APIConfiguration = QiitaAPIConfiguration.GET_ARTICLE

        override val parameters: Map<String, String>
            get() = mapOf()

        override val path: String
            get() = configuration.path + "/$itemId"
    }
}
