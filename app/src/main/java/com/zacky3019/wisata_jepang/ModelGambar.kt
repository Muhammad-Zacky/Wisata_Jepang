package com.zacky3019.wisata_jepang

import android.os.Parcel
import android.os.Parcelable

data class ModelGambar(
    val nama: String,
    val lokasi: String,
    val gambar: Int,
    val tanggal: String,
    val detail: String
) : Parcelable{
    constructor(parcel: Parcel):this(
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readInt(),
        parcel.readString()?:"",
        parcel.readString()?:""
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nama)
        parcel.writeString(lokasi)
        parcel.writeInt(gambar)
        parcel.writeString(tanggal)
        parcel.writeString(detail)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ModelGambar> {
        override fun createFromParcel(parcel: Parcel): ModelGambar {
            return ModelGambar(parcel)
        }

        override fun newArray(size: Int): Array<ModelGambar?> {
            return arrayOfNulls(size)
        }
    }
}