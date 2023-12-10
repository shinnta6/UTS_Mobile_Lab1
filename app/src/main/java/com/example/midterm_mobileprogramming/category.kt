package com.example.midterm_mobileprogramming

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class category(
    val name: String,
    val photo: Int
) : Parcelable
