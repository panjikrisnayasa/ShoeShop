package com.panjikrisnayasa.submissionandroidpemula;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ShoesAdapter extends RecyclerView.Adapter<ShoesAdapter.ShoesHolder> {

    private ArrayList<Shoe> listShoes;

    ShoesAdapter(ArrayList<Shoe> listShoes) {
        this.listShoes = listShoes;
    }

    @NonNull
    @Override
    public ShoesHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_card_shoes, viewGroup, false);
        return new ShoesHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ShoesHolder shoesHolder, int i) {
        Shoe shoe = listShoes.get(i);

        Glide.with(shoesHolder.itemView.getContext())
                .load(shoe.getPhoto())
                .apply(new RequestOptions())
                .into(shoesHolder.mImageView);

        shoesHolder.mShoesName.setText(shoe.getName());
        shoesHolder.mShoesCategory.setText(shoe.getCategory());
        shoesHolder.mShoesPrice.setText(shoe.getPrice());

        shoesHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shoe shoe = new Shoe();
                shoe.setName(listShoes.get(shoesHolder.getAdapterPosition()).getName());
                shoe.setPhoto(listShoes.get(shoesHolder.getAdapterPosition()).getPhoto());
                shoe.setCategory(listShoes.get(shoesHolder.getAdapterPosition()).getCategory());
                shoe.setPrice(listShoes.get(shoesHolder.getAdapterPosition()).getPrice());
                shoe.setDescription(listShoes.get(shoesHolder.getAdapterPosition()).getDescription());

                Intent detailShoeIntent = new Intent(v.getContext(), DetailShoeActivity.class);
                detailShoeIntent.putExtra(DetailShoeActivity.EXTRA_SHOE, shoe);
                v.getContext().startActivity(detailShoeIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listShoes.size();
    }

    class ShoesHolder extends RecyclerView.ViewHolder {

        ImageView mImageView;
        TextView mShoesName, mShoesCategory, mShoesPrice;

        ShoesHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.image_item);
            mShoesName = itemView.findViewById(R.id.text_item_shoe_name);
            mShoesCategory = itemView.findViewById(R.id.text_item_shoe_category);
            mShoesPrice = itemView.findViewById(R.id.text_item_shoe_price);

            mImageView.setClipToOutline(true);
        }
    }
}
