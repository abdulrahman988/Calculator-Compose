package com.example.composecalculator.util

import android.app.AlertDialog
import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.provider.Settings
import android.view.View


object Utils {
//    fun <T : Any> handleApiError(resp: Response<T>): AppResult.Error {
//        val error = ApiErrorUtils.parseError(resp)
//        return AppResult.Error(Exception(error.error), resp.code())
//    }
//
//    fun <T : Any> handleSuccess(response: Response<T>): AppResult<T> {
//        response.body()?.let {
//            return AppResult.Success(it)
//        } ?: return handleApiError(response)
//    }
//
//    fun getDeviceId(context: Context): String? {
//        return Settings.Secure.getString(
//            context.contentResolver,
//            Settings.Secure.ANDROID_ID
//        )
//    }
//
//    fun getRank(rank: Int?): String? {
//        return when (rank) {
//            1 -> "First"
//            2 -> "Second"
//            3 -> "third"
//            else -> {
//                return null
//            }
//        }
//    }
//
//
//    //
////    fun takeScreenshot(dialog: AlertDialog?): Bitmap? {
////        // Check if the dialog is not null and its window is not null
////        if (dialog != null && dialog.window != null) {
////            // Get the decor view of the dialog's window
////            val dialogView = dialog.window!!.decorView
////            // Enable drawing cache for the dialog view
////            dialogView.isDrawingCacheEnabled = true
////            // Create a bitmap from the drawing cache of the dialog view
////            val bitmap = Bitmap.createBitmap(dialogView.width, dialogView.height, Bitmap.Config.ARGB_8888)
////            // Create a canvas using the bitmap
////            val canvas = Canvas(bitmap)
////            // Draw the dialog view onto the canvas
////            dialogView.draw(canvas)
////            // Return the bitmap
////            return bitmap
////        } else {
////            // If the dialog or its window is null, return null
////            return null
////        }
////    }
//    fun takeScreenshotOfDialog(dialog: AlertDialog?): Bitmap? {
//        if (dialog != null && dialog.window != null) {
//            val dialogView = dialog.window!!.decorView
//            val bitmap =
//                Bitmap.createBitmap(dialogView.width, dialogView.height, Bitmap.Config.ARGB_8888)
//            val canvas = Canvas(bitmap)
//            dialogView.draw(canvas)
//            return bitmap
//        } else {
//            return null
//        }
//    }
//

}
