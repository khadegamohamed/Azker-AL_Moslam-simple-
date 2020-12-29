package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class azkeralmasa : AppCompatActivity() {
    lateinit var reycler2:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_azkeralmasa)
        reycler2 = findViewById(R.id.recycler2)
        val azkeralspahh = mutableListOf<azker>()
        azkeralspahh.add(azker(R.drawable.ic_android_black_24dp,"ايه الكرسي"))
        azkeralspahh.add(azker(R.drawable.ic_android_black_24dp,"استغفارالله العظيم من كل ذنب عظيم واتوب ايه  "))
        azkeralspahh.add(azker(R.drawable.ic_android_black_24dp,"استغفارالله العظيم من كل ذنب عظيم واتوب ايه  "))
        azkeralspahh.add(azker(R.drawable.ic_android_black_24dp,"استغفارالله العظيم من كل ذنب عظيم واتوب ايه  "))
        azkeralspahh.add(azker(R.drawable.ic_android_black_24dp,"استغفارالله العظيم من كل ذنب عظيم واتوب ايه  "))
        azkeralspahh.add(azker(R.drawable.ic_android_black_24dp,"استغفارالله العظيم من كل ذنب عظيم واتوب ايه  "))
        azkeralspahh.add(azker(R.drawable.ic_android_black_24dp,"استغفارالله العظيم من كل ذنب عظيم واتوب ايه  "))
        azkeralspahh.add(azker(R.drawable.ic_android_black_24dp,"استغفارالله العظيم من كل ذنب عظيم واتوب ايه  "))
        azkeralspahh.add(azker(R.drawable.ic_android_black_24dp,"استغفارالله العظيم من كل ذنب عظيم واتوب ايه  "))
        azkeralspahh.add(azker(R.drawable.ic_android_black_24dp,"استغفارالله العظيم من كل ذنب عظيم واتوب ايه  "))
        azkeralspahh.add(azker(R.drawable.ic_android_black_24dp,"استغفارالله العظيم من كل ذنب عظيم واتوب ايه  "))
        azkeralspahh.add(azker(R.drawable.ic_android_black_24dp,"استغفارالله العظيم من كل ذنب عظيم واتوب ايه  "))
        azkeralspahh.add(azker(R.drawable.ic_android_black_24dp,"استغفارالله العظيم من كل ذنب عظيم واتوب ايه  "))
        azkeralspahh.add(azker(R.drawable.ic_android_black_24dp,"استغفارالله العظيم من كل ذنب عظيم واتوب ايه  "))
        azkeralspahh.add(azker(R.drawable.ic_android_black_24dp,"استغفارالله العظيم من كل ذنب عظيم واتوب ايه  "))
        azkeralspahh.add(azker(R.drawable.ic_android_black_24dp,"  لا حول ولا قوه الا بالله العلي العظيم"))
        reycler2.adapter = recycleradepter(azkeralspahh)
        reycler2.layoutManager = LinearLayoutManager(this)
        reycler2.setHasFixedSize(true)

    }
}