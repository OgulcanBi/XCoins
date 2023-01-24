package com.definex.navigationcomponent

import android.content.Context
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.definex.navigationcomponent.R
import java.net.URL

import com.bumptech.glide.request.RequestOptions as RequestOptions1

fun ImageView.downloadImage(url: String?,placeholder: CircularProgressDrawable){

    val options = RequestOptions1().placeholder(placeholder).error(R.drawable.definex)
    Glide.with(context).setDefaultRequestOptions(options).load(url).into(this)

}
fun createPlaceHolder(contex: Context):CircularProgressDrawable{
    return CircularProgressDrawable(contex).apply {
        strokeWidth = 8f
        centerRadius = 40f
        start()
    }
}

@BindingAdapter("android:downloadImage")
fun downloadImage(view: ImageView,url: String?){
    view.downloadImage(url, createPlaceHolder(view.context))

}