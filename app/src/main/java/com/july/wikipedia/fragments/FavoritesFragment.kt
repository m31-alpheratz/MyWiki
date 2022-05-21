package com.july.wikipedia.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.july.wikipedia.R
import com.july.wikipedia.WikiApplication
import com.july.wikipedia.managers.WikiManager


class FavoritesFragment : Fragment() {
    private var wikiManager: WikiManager? = null
    var favoritesRecycler: RecyclerView? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)

        wikiManager = (activity?.applicationContext as WikiApplication).wikiManager
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_favorites, container, false)

        favoritesRecycler = view.findViewById<RecyclerView>(R.id.favorite_article_recycler)
        favoritesRecycler!!.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        return view
    }


    override fun onResume() {
        super.onResume()

//        doAsync {
//            val favoriteArticles = wikiManager!!.getFavorites()
//            adapter?.currentResults?.clear()
//            adapter?.currentResults?.addAll(favoriteArticles as ArrayList<WikiPage>)
//
//            activity?.runOnUiThread { adapter?.notifyDataSetChanged() }
//        }
    }

}