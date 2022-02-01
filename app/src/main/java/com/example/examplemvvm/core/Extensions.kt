package com.example.examplemvvm.core

import android.app.Activity
import android.widget.Toast
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

/**
Created by Omy on 20,agosto,2021
 */
fun String.carita():String{
    return "$this :)"
}
//@colorRess indica que solo va aceptar enteres que esten en el archivo de color
fun Activity.color(@ColorRes color:Int):Int{
    return ContextCompat.getColor(this,color)
}

fun Any?.esNull() = this == null

fun Activity.toast(mensaje:String,duraccion:Int = Toast.LENGTH_SHORT){
    Toast.makeText(this,mensaje,duraccion).show()
}
