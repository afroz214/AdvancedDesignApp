package com.smartherd.advanceddesignapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_game_fragment.*

/**
 * A simple [Fragment] subclass.
 */
class game_fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val layout = inflater.inflate(R.layout.fragment_game_fragment, container, false)

            val item = ArrayList<Custom_class>()

            item.add(Custom_class("background_one", R.drawable.background_one))
            item.add(Custom_class("background_two", R.drawable.background_two))
            item.add(Custom_class("background_three", R.drawable.background_three))
            item.add(Custom_class("background_one", R.drawable.background_one))
            item.add(Custom_class("background_two", R.drawable.background_two))
            item.add(Custom_class("background_three", R.drawable.background_three))
            item.add(Custom_class("background_one", R.drawable.background_one))
            item.add(Custom_class("background_two", R.drawable.background_two))
            item.add(Custom_class("background_three", R.drawable.background_three))

            val recycler = layout.findViewById<RecyclerView>(R.id.recycler)

            val adapter = Adapter(item, activity!!.applicationContext)
            recycler.layoutManager = GridLayoutManager(activity!!.applicationContext,2) as RecyclerView.LayoutManager?
            recycler.adapter = adapter

        return layout


    }



}
