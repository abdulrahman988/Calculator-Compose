package com.example.composecalculator.util

import android.app.DownloadManager
import android.content.Context
import android.os.Environment
import androidx.core.net.toUri

class Downloader (
    context: Context
) {
    private val downloadManager = context.getSystemService(DownloadManager::class.java)

    fun downloadFile(url: String,fileName: String)
    {
        val request = DownloadManager.Request(url.toUri())
            .setMimeType("*/*")
            .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI)
            .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_MOBILE)
            .setAllowedOverMetered(true)
            .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
            .setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName)
            .setTitle(fileName)
        downloadManager.enqueue(request)
    }
}