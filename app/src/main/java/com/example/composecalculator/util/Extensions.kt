package com.example.composecalculator.util

import android.content.Context
import android.content.res.Resources
import android.net.Uri
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.composecalculator.R
import java.text.SimpleDateFormat
import java.util.*

fun Context.noNetworkConnectivityError(): AppResult.Error {
    return AppResult.Error(Exception(this.resources.getString(R.string.app_name)))
}

fun Int.toPx() = (this * Resources.getSystem().displayMetrics.density).toInt()

fun Long.convertLongToTime(): String {
    val sdfTime = SimpleDateFormat("h:mm a")
    val dateTime = Date(this)
    val gmtTime = sdfTime.format(dateTime)
    return gmtTime
}

fun Context.getTypeOfMedia(item: Uri): String? {
    return this.contentResolver.getType(item)
}

fun View.margin(left: Float? = null, top: Float? = null, right: Float? = null, bottom: Float? = null) {
    layoutParams<ViewGroup.MarginLayoutParams> {
        left?.run { leftMargin = dpToPx(this) }
        top?.run { topMargin = dpToPx(this) }
        right?.run { rightMargin = dpToPx(this) }
        bottom?.run { bottomMargin = dpToPx(this) }
    }
}

inline fun <reified T : ViewGroup.LayoutParams> View.layoutParams(block: T.() -> Unit) {
    if (layoutParams is T) block(layoutParams as T)
}

fun View.dpToPx(dp: Float): Int = context.dpToPx(dp)
fun Context.dpToPx(dp: Float): Int = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, resources.displayMetrics).toInt()
