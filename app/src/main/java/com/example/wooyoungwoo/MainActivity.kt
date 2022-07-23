package com.example.wooyoungwoo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = mutableListOf<CastInfo>()
        list.add(
            CastInfo(
                poster = ContextCompat.getDrawable(
                    this, R.drawable.woo_yeong_u
                )!!, name = "박은빈", nickName = "우영우"
            )
        )
        list.add(
            CastInfo(
                poster = ContextCompat.getDrawable(
                    this, R.drawable.lee_joon_ho
                )!!, name = "강태오", nickName = "이준호"
            )
        )
        val adapter = RecyclerCastInfoAdapter(list)
        recyclerView = findViewById(R.id.recycler_view)
        recyclerView?.adapter = adapter


    }
}