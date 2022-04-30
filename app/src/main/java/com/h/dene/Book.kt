package com.h.dene

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ  │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com  │
//│ ──────────────────────── │
//│ 28.04.2022               │
//└──────────────────────────┘
@Parcelize
class Book(
    val bookName: String,
    val publisher: String,
    val authorName: String,
    val price: Int
) :
    Parcelable