package com.example.wooyoungwoo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerCastInfoAdapter(
    private val items: MutableList<CastInfo>
) : RecyclerView.Adapter<RecyclerCastInfoAdapter.ViewHolder>() {

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(
        holder: RecyclerCastInfoAdapter.ViewHolder,
        position: Int
    ) {

        val item = items[position]

        holder.apply {
            poster.setImageDrawable(item.poster)
            name.text = item.name
            nicKName.text = item.nickName

            itemView.tag = item
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val inflatedView = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_item, parent, false)
        return RecyclerCastInfoAdapter.ViewHolder(inflatedView)
    }

    // 각 항목에 필요한 기능을 구현
    class ViewHolder(
        view: View
    ) : RecyclerView.ViewHolder(view) {

        var poster: ImageView
        var name: TextView
        var nicKName: TextView

        init {
            poster = view.findViewById(R.id.poster)
            name = view.findViewById(R.id.name)
            nicKName = view.findViewById(R.id.nick_name)
        }
    }
}