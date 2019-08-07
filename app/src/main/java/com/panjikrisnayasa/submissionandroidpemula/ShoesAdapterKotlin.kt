package com.panjikrisnayasa.submissionandroidpemula

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ShoesAdapterKotlin(private val listShoes: ArrayList<ShoeKotlin>): RecyclerView.Adapter<ShoesAdapterKotlin.ShoesHolderKotlin>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ShoesHolderKotlin {
        val view: View = LayoutInflater.from(p0.context).inflate(R.layout.item_card_shoes, p0, false)
        return ShoesHolderKotlin(view)
    }

    override fun getItemCount(): Int {
        return listShoes.size
    }

    override fun onBindViewHolder(p0: ShoesHolderKotlin, p1: Int) {
        p0.mImageView.clipToOutline = true

        val (name, category, price, description, photo) = listShoes[p1]

        Glide.with(p0.itemView.context)
                .load(photo)
                .apply(RequestOptions())
                .into(p0.mImageView)

        p0.mShoesName.text = name
        p0.mShoesCategory.text = category
        p0.mShoesPrice.text = price

        p0.itemView.setOnClickListener {
            val shoeKotlin = ShoeKotlin()
            shoeKotlin.name = name
            shoeKotlin.category = category
            shoeKotlin.price = price
            shoeKotlin.description = description
            shoeKotlin.photo = photo

            val detailShoeKotlinIntent = Intent(it.context, DetailShoeKotlinActivity::class.java)
            detailShoeKotlinIntent.putExtra(DetailShoeKotlinActivity.EXTRA_SHOE, shoeKotlin)
            it.context.startActivity(detailShoeKotlinIntent)
        }
    }

    inner class ShoesHolderKotlin(itemView: View): RecyclerView.ViewHolder(itemView) {
        var mImageView: ImageView = itemView.findViewById(R.id.image_item)
        var mShoesName: TextView = itemView.findViewById(R.id.text_item_shoe_name)
        var mShoesCategory: TextView = itemView.findViewById(R.id.text_item_shoe_category)
        var mShoesPrice: TextView = itemView.findViewById(R.id.text_item_shoe_price)
    }
}