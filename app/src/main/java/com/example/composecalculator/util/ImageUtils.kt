package com.example.composecalculator.util

import android.content.ContentResolver
import android.content.Context
import android.net.Uri
import android.os.Environment
import android.provider.OpenableColumns
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object ImageUtils {
    private lateinit var currentPhotoPath: String

    @Throws(IOException::class)
    fun createImageFile(context: Context): File? {
        // Create an image file name
        val timeStamp: String = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(Date())
        val storageDir: File? = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES)
        return File.createTempFile(
            "${timeStamp}_", /* prefix */
            ".jpg", /* suffix */
            storageDir /* directory */
        ).apply {
            // Save a file: path for use with ACTION_VIEW intents
            currentPhotoPath = absolutePath
        }
    }

    fun getCachedFile(uri: Uri, context: Context): File? {
        val parcelFileDescriptor =
            context.contentResolver.openFileDescriptor(
                uri, "r", null
            ) ?: return null

        val inputStream = FileInputStream(parcelFileDescriptor.fileDescriptor)

        val file = if(uri.scheme!! == "content"){
            File(
                context.cacheDir, context.contentResolver.getFileName(uri)
            )
        }else{
            File(
                context.cacheDir, getName(uri)
            )
        }


        /*val file = File(
            context.cacheDir, context.contentResolver.getFileName(uri)
        )*/
        FileOutputStream(file).use { out ->
            inputStream.use { ins ->
                ins.copyTo(out)

            }
        }
        return file

    }

    fun ContentResolver.getFileName(fileUri: Uri): String {
        var name = ""
        val returnCursor = this.query(fileUri, null, null, null, null)
        if (returnCursor != null  ) {
            val nameIndex = returnCursor.getColumnIndex(OpenableColumns.DISPLAY_NAME)
            returnCursor.moveToFirst()
            name = returnCursor.getString(nameIndex)
            returnCursor.close()
        }
        return name
    }


    fun getName(fileUri: Uri) : String{
        val file = File(fileUri.path)
        return file.name
    }

}