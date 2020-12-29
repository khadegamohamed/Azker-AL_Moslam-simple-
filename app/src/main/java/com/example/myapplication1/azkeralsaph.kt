package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class azkeralsaph : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var recycler:RecyclerView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_azkeralsaph)
        val azkeralspah = mutableListOf<azker>()
        azkeralspah.add( azker(R.drawable.ic_android_black_24dp,"ايه الكرسي"))
        azkeralspah.add( azker(R.drawable.ic_android_black_24dp,"سوره الاخلاص تلاته مرات "))
        azkeralspah.add( azker(R.drawable.ic_android_black_24dp,"سوره الفلق تلاته مرات "))
        azkeralspah.add( azker(R.drawable.ic_android_black_24dp,"سوره الناس تلاته مرات "))
        azkeralspah.add( azker(R.drawable.ic_android_black_24dp,"سيد الاستغفار"))
        azkeralspah.add( azker(R.drawable.ic_android_black_24dp,"لا اله الا الله وحده لاشريك له له الملك وله الحمد وهو علي كل شي قدير  100 مره"))
        azkeralspah.add( azker(R.drawable.ic_android_black_24dp,"سبحان الله وبحمده سبحان الله العظيم 100 مره"))
        azkeralspah.add( azker(R.drawable.ic_android_black_24dp,"اللهم بك اصبحنا وبك امسينا وبك نحيا وبك نموت واليك النشور"))
        azkeralspah.add( azker(R.drawable.ic_android_black_24dp,"سبحان الله 33 مره "))
        azkeralspah.add( azker(R.drawable.ic_android_black_24dp,"الحمدلله 33 مره "))
        azkeralspah.add( azker(R.drawable.ic_android_black_24dp,"الله اكبر 33 مره"))
        azkeralspah.add( azker(R.drawable.ic_android_black_24dp,"حسبي الله لا اله الا هو عليه توكلت وهو رب العرش العظيم "))
        recycler  = findViewById(R.id.recycler_view)
        recycler.adapter = recycleradepter(azkeralspah)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.setHasFixedSize(true)




    }
}