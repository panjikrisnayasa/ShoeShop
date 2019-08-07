package com.panjikrisnayasa.submissionandroidpemula

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailShoeKotlinActivity : AppCompatActivity() {

    private lateinit var mImage: ImageView
    private lateinit var mTextShoeName: TextView
    private lateinit var mTextShoeCategory: TextView
    private lateinit var mTextShoePrice: TextView
    private lateinit var mTextShoeDescription: TextView
    private lateinit var mButtonBuyNow: Button
    private lateinit var mToolbar: Toolbar

    companion object {
        const val EXTRA_SHOE = "extra_shoe"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_shoe)

        mImage = findViewById(R.id.image_detail_shoe_photo)
        mTextShoeName = findViewById(R.id.text_detail_shoe_name)
        mTextShoeCategory = findViewById(R.id.text_detail_shoe_category)
        mTextShoePrice = findViewById(R.id.text_detail_shoe_price)
        mTextShoeDescription = findViewById(R.id.text_detail_shoe_description)
        mButtonBuyNow = findViewById(R.id.button_detail_buy_now)
        mToolbar = findViewById(R.id.toolbar_detail)

        val shoeKotlin: ShoeKotlin = intent.getParcelableExtra(EXTRA_SHOE)

        mToolbar.title = shoeKotlin.name
        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_24px)
        mToolbar.setNavigationOnClickListener {
            finish()
        }

        Glide.with(this)
                .load(shoeKotlin.photo)
                .apply(RequestOptions())
                .into(mImage)

        mTextShoeName.text = shoeKotlin.name
        mTextShoeCategory.text = shoeKotlin.category
        mTextShoePrice.text = shoeKotlin.price
        mTextShoeDescription.text = shoeKotlin.description

        mButtonBuyNow.setOnClickListener {
            Toast.makeText(this@DetailShoeKotlinActivity, "You ordered ${shoeKotlin.name}", Toast.LENGTH_SHORT).show()
        }
    }
}