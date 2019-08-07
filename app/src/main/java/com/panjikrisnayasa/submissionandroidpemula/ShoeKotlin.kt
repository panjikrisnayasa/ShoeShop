package com.panjikrisnayasa.submissionandroidpemula

import android.os.Parcel
import android.os.Parcelable

data class ShoeKotlin(
        var name: String = "",
        var category: String = "",
        var price: String = "",
        var description: String = "",
        var photo: String = "") : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(category)
        parcel.writeString(price)
        parcel.writeString(description)
        parcel.writeString(photo)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ShoeKotlin> {
        override fun createFromParcel(parcel: Parcel): ShoeKotlin {
            return ShoeKotlin(parcel)
        }

        override fun newArray(size: Int): Array<ShoeKotlin?> {
            return arrayOfNulls(size)
        }
    }
}