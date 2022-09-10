package com.example.challengechapter3

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Huruf (
    val isiHuruf: Char,
    val detailKata: Array<String>
    ) : Parcelable