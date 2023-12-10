package com.example.midterm_mobileprogramming

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Goal (
    val name: String
):Parcelable
