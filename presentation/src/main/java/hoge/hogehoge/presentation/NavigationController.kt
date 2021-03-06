package hoge.hogehoge.presentation

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import hoge.hogehoge.presentation.article.articlepager.ArticlePagerFragment
import hoge.hogehoge.presentation.article.articleremoteviewer.ArticleRemoteViewerFragment
import hoge.hogehoge.presentation.article.articlesavedviewer.ArticleSavedViewerFragment
import javax.inject.Inject

class NavigationController @Inject constructor(
    activity: AppCompatActivity
) {
    private val containerId: Int = R.id.container
    private val fragmentManager = activity.supportFragmentManager

    fun toArticlePagerFragment() {
        replaceFragment(ArticlePagerFragment.newInstance())
    }

    fun toArticleRemoteViewerFragment(articleId: String) {
        replaceFragment(ArticleRemoteViewerFragment.newInstance(articleId))
    }

    fun toArticleSavedViewerFragment(articleId: String) {
        replaceFragment(ArticleSavedViewerFragment.newInstance(articleId))
    }

    fun popFragment() {
        fragmentManager.popBackStack()
    }

    private fun addFragment(fragment: Fragment) {
        fragmentManager
            .beginTransaction()
            .add(containerId, fragment, fragment::class.java.simpleName)
            .addToBackStack(fragment::class.java.simpleName)
            .commit()
    }

    private fun replaceFragment(fragment: Fragment) {
        fragmentManager
            .beginTransaction()
            .replace(containerId, fragment, fragment::class.java.simpleName)
            .addToBackStack(fragment::class.java.simpleName)
            .commit()
    }
}
