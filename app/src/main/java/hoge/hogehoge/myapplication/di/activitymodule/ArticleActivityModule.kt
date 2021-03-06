package hoge.hogehoge.myapplication.di.activitymodule

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap
import hoge.hogehoge.core.di.viewmodel.ViewModelKey
import hoge.hogehoge.presentation.article.ArticleActivity
import hoge.hogehoge.presentation.article.articlepager.ArticlePagerFragment
import hoge.hogehoge.presentation.article.articlepager.ArticlePagerViewModel
import hoge.hogehoge.presentation.article.articleremote.popular.ArticlePopularFragment
import hoge.hogehoge.presentation.article.articleremote.popular.ArticlePopularViewModel
import hoge.hogehoge.presentation.article.articleremote.timeline.ArticleTimelineFragment
import hoge.hogehoge.presentation.article.articleremote.timeline.ArticleTimelineViewModel
import hoge.hogehoge.presentation.article.articleremote.trend.ArticleTrendFragment
import hoge.hogehoge.presentation.article.articleremote.trend.ArticleTrendViewModel
import hoge.hogehoge.presentation.article.articleremoteviewer.ArticleRemoteViewerFragment
import hoge.hogehoge.presentation.article.articleremoteviewer.ArticleRemoteViewerViewModel
import hoge.hogehoge.presentation.article.articlesaved.ArticleSavedFragment
import hoge.hogehoge.presentation.article.articlesaved.ArticleSavedViewModel
import hoge.hogehoge.presentation.article.articlesavedviewer.ArticleSavedViewerFragment
import hoge.hogehoge.presentation.article.articlesavedviewer.ArticleSavedViewerViewModel

@Module
interface ArticleActivityModule {
    @Binds
    fun bindsArticleActivity(articleActivity: ArticleActivity): AppCompatActivity

    @ContributesAndroidInjector
    fun contributeArticleRemoteViewerFragment(): ArticleRemoteViewerFragment

    @ContributesAndroidInjector
    fun contributeArticleSavedViewerFragment(): ArticleSavedViewerFragment

    @ContributesAndroidInjector
    fun contributeArticlePagerFragment(): ArticlePagerFragment

    @ContributesAndroidInjector
    fun contributeArticleTrendFragment(): ArticleTrendFragment

    @ContributesAndroidInjector
    fun contributeArticlePopularFragment(): ArticlePopularFragment

    @ContributesAndroidInjector
    fun contributeArticleTimelineFragment(): ArticleTimelineFragment

    @ContributesAndroidInjector
    fun contributeArticleSavedFragment(): ArticleSavedFragment

    @Binds
    @IntoMap
    @ViewModelKey(ArticlePagerViewModel::class)
    fun bindsArticlePagerViewModel(
        articlePagerViewModel: ArticlePagerViewModel
    ): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ArticleRemoteViewerViewModel::class)
    fun bindsArticleRemoteViewerViewModel(
        articleRemoteViewModel: ArticleRemoteViewerViewModel
    ): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ArticleSavedViewerViewModel::class)
    fun bindsArticleSavedViewerViewModel(
        articleSavedViewModel: ArticleSavedViewerViewModel
    ): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ArticleTrendViewModel::class)
    fun bindsArticleTrendViewModel(
        articleTrendViewModel: ArticleTrendViewModel
    ): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ArticlePopularViewModel::class)
    fun bindsArticlePopularViewModel(
        articlePopularViewModel: ArticlePopularViewModel
    ): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ArticleTimelineViewModel::class)
    fun bindsArticleTimelineViewModel(
        articleTimelineViewModel: ArticleTimelineViewModel
    ): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ArticleSavedViewModel::class)
    fun bindsArticleSavedViewModel(
        articleSavedViewModel: ArticleSavedViewModel
    ): ViewModel
}
