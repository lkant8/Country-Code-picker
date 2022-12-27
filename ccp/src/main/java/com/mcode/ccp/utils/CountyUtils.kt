package com.mcode.ccp.utils


import android.content.Context
import com.google.gson.Gson
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.google.gson.reflect.TypeToken
import java.io.IOException

fun countryList(context: Context): MutableList<Country> {
    val jsonFileString = getJsonDataFromAsset(context, "Countries.json")
    val type = object : TypeToken<List<Country>>() {}.type
    return Gson().fromJson(jsonFileString, type)
}

fun localeToEmoji(countryCode: String): String {
    val firstLetter = Character.codePointAt(countryCode, 0) - 0x41 + 0x1F1E6
    val secondLetter = Character.codePointAt(countryCode, 1) - 0x41 + 0x1F1E6
    return String(Character.toChars(firstLetter)) + String(Character.toChars(secondLetter))
}
fun String.toCountryCode(it:Country?):String{
    val code = it?.dial_code.toString()

    return "${code}"
}
fun String.toFlagEmoji(): String {
    // INdia code IN bitmapEMOJI
    if (this.length != 2) {
        return this
    }
    val countryCodeCaps = this.toUpperCase()
    val firstLetter = Character.codePointAt(countryCodeCaps, 0) - 0x41 + 0x1F1E6
    val secondLetter = Character.codePointAt(countryCodeCaps, 1) - 0x41 + 0x1F1E6
    if (!countryCodeCaps[0].isLetter() || !countryCodeCaps[1].isLetter()) {
        return this
    }
    return String(Character.toChars(firstLetter)) + String(Character.toChars(secondLetter))
}

fun getJsonDataFromAsset(context: Context, fileName: String): String? {
    val jsonString: String
    try {
        jsonString = context.assets.open(fileName).bufferedReader().use { it.readText() }
    } catch (ioException: IOException) {
        ioException.printStackTrace()
        return null
    }
    return jsonString
}

fun List<Country>.searchCountryList(countryName: String): MutableList<Country> {
    val countryList = mutableListOf<Country>()
    this.forEach {
        if (it.name.lowercase().contains(countryName.lowercase()) ||
            it.dial_code.contains(countryName.lowercase()) ||
                    it.code.contains(countryName.lowercase())
        ) {
            countryList.add(it)
        }
    }
    return countryList
}

fun List<Country>.searchCountry(countryName: String): List<Country> {
    val countryList = ArrayList<Country>()
    forEach {
        if (it.name.lowercase().contains(countryName.lowercase()) ||
            it.dial_code.contains(countryName.lowercase())
        ) {
            countryList.add(it)
        }
    }
    return countryList
}

data class Country(
    @SerializedName("name")
    @Expose
    val name: String="",
    @SerializedName("dial_code")
    @Expose
    val dial_code: String="",
    @SerializedName("code")
    @Expose
    val code: String=""
)