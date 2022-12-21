package com.mcode.ccp.data

import com.mcode.ccp.R
import java.util.*

data class CountryData(
    private var cCodes: String,
    val countryPhoneCode: String = "+91",
    val cNames:String = "in",
    val flagResID: Int = R.drawable.`in`
) {
    val countryCode = cCodes.lowercase(Locale.getDefault())
}
