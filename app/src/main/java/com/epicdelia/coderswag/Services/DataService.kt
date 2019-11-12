package com.epicdelia.coderswag.Services

import com.epicdelia.coderswag.Models.Categories
import com.epicdelia.coderswag.Models.Product

object DataService {

    val Categories = listOf(
        Categories("SHIRTS", "shirtimage"),
        Categories("HOODES", "hoodieimage"),
        Categories("HATS", "hatimage"),
        Categories("DIGITAL", "digitalgoodsimage"),
        Categories("SHIRTS", "shirtimage"),
        Categories("HOODES", "hoodieimage"),
        Categories("HATS", "hatimage"),
        Categories("DIGITAL", "digitalgoodsimage"),
        Categories("SHIRTS", "shirtimage"),
        Categories("HOODES", "hoodieimage"),
        Categories("HATS", "hatimage"),
        Categories("DIGITAL", "digitalgoodsimage")


    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat01"),
        Product("Devslopes Graphic Beanie", "$12", "hat02"),
        Product("Devslopes Graphic Beanie", "$23", "hat03"),
        Product("Devslopes Graphic Beanie", "$28", "hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Grey", "$18", "hoodie01"),
        Product("Devslopes Hoodie Red", "$12", "hoodie02"),
        Product("Devslopes Graphic Grey Hoodie", "$23", "hoodie03"),
        Product("Devslopes Black Hoodie", "$28", "hoodie04")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$18", "shirt01"),
        Product("Devslopes Shirt Grey", "$12", "shirt02"),
        Product("Devslopes Hustle", "$23", "shirt03"),
        Product("Devslopes Kickflip Studios", "$28", "shirt04")
    )

    val digital = listOf(
        Product("Devslopes Shirt Black", "$18", "shirt01"),
        Product("Devslopes Shirt Grey", "$12", "shirt02"),
        Product("Devslopes Hustle", "$23", "shirt03"),
        Product("Devslopes Kickflip Studios", "$28", "shirt04")
    )



}