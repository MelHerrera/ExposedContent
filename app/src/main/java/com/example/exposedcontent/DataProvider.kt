package com.example.exposedcontent

import android.content.ContentProvider
import android.content.ContentValues
import android.content.IntentFilter
import android.content.UriMatcher
import android.database.Cursor
import android.net.Uri
import com.example.exposedcontent.Constants.AUTHORITY

class DataProvider:ContentProvider() {
    private var dbHelper:DBHelper ? = null
    private val DATABASE_NAME = "Table.db"
    private val DATABASE_VERSION = 1
    private val DATUM_TABLE_NAME = "t1"
    private var sUriMatcher = UriMatcher(UriMatcher.NO_MATCH)
    private val DATUM = 1
    private val DATUM_ID = 2
    private val projMap = mutableMapOf<String, String>()

    init {
        sUriMatcher.addURI(AUTHORITY, DATUM_TABLE_NAME, DATUM)
        sUriMatcher.addURI(AUTHORITY, "$DATUM_TABLE_NAME/#", DATUM_ID)
        projMap.put(Constants.ID, Constants.ID)
        projMap.put(Constants.TEXT, Constants.TEXT)
    }

    override fun onCreate(): Boolean {
        TODO("Not yet implemented")
    }

    override fun query(
        p0: Uri,
        p1: Array<out String>?,
        p2: String?,
        p3: Array<out String>?,
        p4: String?
    ): Cursor? {
        TODO("Not yet implemented")
    }

    override fun getType(p0: Uri): String? {
        TODO("Not yet implemented")
    }

    override fun insert(p0: Uri, p1: ContentValues?): Uri? {
        TODO("Not yet implemented")
    }

    override fun delete(p0: Uri, p1: String?, p2: Array<out String>?): Int {
        TODO("Not yet implemented")
    }

    override fun update(p0: Uri, p1: ContentValues?, p2: String?, p3: Array<out String>?): Int {
        TODO("Not yet implemented")
    }


    inner class DBHelper{

    }
}