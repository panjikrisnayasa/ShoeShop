package com.panjikrisnayasa.submissionandroidpemula;

import android.os.Parcel;
import android.os.Parcelable;

class Shoe implements Parcelable {

    private String name, category, price, description, photo;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getCategory() {
        return category;
    }

    void setCategory(String category) {
        this.category = category;
    }

    String getPrice() {
        return price;
    }

    void setPrice(String price) {
        this.price = price;
    }

    String getDescription() {
        return description;
    }

    void setDescription(String description) {
        this.description = description;
    }

    String getPhoto() {
        return photo;
    }

    void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.category);
        dest.writeString(this.price);
        dest.writeString(this.description);
        dest.writeString(this.photo);
    }

    public Shoe() {
    }

    protected Shoe(Parcel in) {
        this.name = in.readString();
        this.category = in.readString();
        this.price = in.readString();
        this.description = in.readString();
        this.photo = in.readString();
    }

    public static final Parcelable.Creator<Shoe> CREATOR = new Parcelable.Creator<Shoe>() {
        @Override
        public Shoe createFromParcel(Parcel source) {
            return new Shoe(source);
        }

        @Override
        public Shoe[] newArray(int size) {
            return new Shoe[size];
        }
    };
}
