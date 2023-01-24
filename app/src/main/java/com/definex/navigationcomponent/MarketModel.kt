package com.definex.navigationcomponent

data class MarketModel(

    val imageResource:String?,
    val shortName:String?,
    val longName:String?,
    val currentPrice:String?,
    val changeRatio:String?,
    var profitLossColor: Int = R.color.profitTextColor
    )
