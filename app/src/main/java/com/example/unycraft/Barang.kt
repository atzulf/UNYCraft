package com.example.unycraft

import android.os.Parcelable
import android.provider.ContactsContract.Contacts.Photo
import android.util.EventLogTags.Description
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Barang(
    val name:String,
    val description: String,
    val photo: Int
) : Parcelable
