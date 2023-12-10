package com.example.midterm_mobileprogramming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvHeroes: RecyclerView
    private val list = ArrayList<Goal>()

    private lateinit var rvCategory: RecyclerView
    private val catList = ArrayList<category>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_profile)

        rvHeroes = findViewById(R.id.rv_heroes)
        rvHeroes.setHasFixedSize(true)

        rvCategory = findViewById(R.id.catView)
        rvCategory.setHasFixedSize(true)

        list.addAll(getListHeroes())
        catList.addAll(getListCategory())
        showRecyclerList()
    }
    private fun getListHeroes(): ArrayList<Goal> {
        val dataName = resources.getStringArray(R.array.data_goal)
        val listHero = ArrayList<Goal>()
        for (i in dataName.indices) {
            val goal = Goal(dataName[i])
            listHero.add(goal)
        }
        return listHero
    }

    private fun getListCategory(): ArrayList<category> {
        val dataName = resources.getStringArray(R.array.data_category)
        val dataPhoto = resources.obtainTypedArray(R.array.data_category_photo)
        val listHero = ArrayList<category>()
        for (i in dataName.indices) {
            val goal = category(dataName[i], dataPhoto.getResourceId(i, -1))
            listHero.add(goal)
        }
        return listHero
    }



    private fun showRecyclerList() {
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val listGoalAdapter = ListGoalAdapter(list)
        rvHeroes.adapter = listGoalAdapter
        rvHeroes.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        rvCategory.layoutManager = LinearLayoutManager(this)
        val listCategoryAdapter = ListCategoryAdapter(catList)
        rvCategory.adapter = listCategoryAdapter
        rvCategory.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }

}