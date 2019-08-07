package com.panjikrisnayasa.submissionandroidpemula;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailShoeActivity extends AppCompatActivity {

    public static final String EXTRA_SHOE = "EXTRA_SHOE";

    Toolbar mToolbar;
    ImageView mShoeImage;
    TextView mTextShoeName, mTextShoeCategory, mTextShoePrice, mTextShoeDesciption;
    Button mButtonBuyNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_shoe);

        mToolbar = findViewById(R.id.toolbar_detail);
        mShoeImage = findViewById(R.id.image_detail_shoe_photo);
        mTextShoeName = findViewById(R.id.text_detail_shoe_name);
        mTextShoeCategory = findViewById(R.id.text_detail_shoe_category);
        mTextShoePrice = findViewById(R.id.text_detail_shoe_price);
        mTextShoeDesciption = findViewById(R.id.text_detail_shoe_description);
        mButtonBuyNow = findViewById(R.id.button_detail_buy_now);

        final Shoe shoe = getIntent().getParcelableExtra(EXTRA_SHOE);

        Glide.with(this)
                .load(shoe.getPhoto())
                .apply(new RequestOptions())
                .into(mShoeImage);

        mTextShoeName.setText(shoe.getName());
        mTextShoeCategory.setText(shoe.getCategory());
        mTextShoePrice.setText(shoe.getPrice());
        mTextShoeDesciption.setText(shoe.getDescription());

        mToolbar.setTitle(shoe.getName());
        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_24px);

        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mButtonBuyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "You ordered " + shoe.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
