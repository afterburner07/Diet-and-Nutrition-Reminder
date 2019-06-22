package com.example.dietnutritionreminder.dietandnutritionreminder;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;

import android.database.Cursor;
import android.database.SQLException;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;

import android.net.Uri;
import android.text.TextUtils;

public class DBNutritionValues extends ContentProvider {
    static final String PROVIDER_NAME = "com.example.dietnutritionreminder.dietandnutritionreminder";
    static final String URL = "content://" + PROVIDER_NAME + "/Nutrition_values";
    static final Uri CONTENT_URI = Uri.parse(URL);

    static final String _ID = "_id";
    static final String NAME = "name";
    static final String YEAR = "year";
    static final String BATCH_YEAR = "batchyear";
    static final String CURRENT_CITY = "currentcity";
    static final String PROFESSION = "profession";
    static final String EMAIL = "email";
    static final String ROLL_NO = "rollno";
//    static final String GRADE = "grade";

//    private static HashMap<String, String> STUDENTS_PROJECTION_MAP;

    static final int NUTRITION_VALUES = 1;
    static final int NUTRITION_VALUES_ID = 2;

    static final UriMatcher uriMatcher;
    static{
        uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
        uriMatcher.addURI(PROVIDER_NAME, "Nutrition_values", NUTRITION_VALUES);
        uriMatcher.addURI(PROVIDER_NAME, "Nutrition_values/#", NUTRITION_VALUES_ID);
    }

    /**
     * Database specific constant declarations
     */

    private SQLiteDatabase db;
    static final String DATABASE_NAME = "Nutrition_values";
    static final String NUTRITION_VALUES_TABLE_NAME = "Nutrition_values";
    static final int DATABASE_VERSION = 1;
    // Creating Table using direct variable nameing
    static final String CREATE_DB_TABLE =
            " CREATE TABLE " + NUTRITION_VALUES_TABLE_NAME +
                    " (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    NAME+" TEXT NOT NULL, " +
                    YEAR+" TEXT NOT NULL, " +
                    BATCH_YEAR+" TEXT NOT NULL, " +
                    CURRENT_CITY+" TEXT NOT NULL, " +
                    PROFESSION+" TEXT NOT NULL, " +
                    EMAIL+" TEXT NOT NULL, " +
                    ROLL_NO+" TEXT NOT NULL);";
//                    " grade TEXT NOT NULL);";

    /**
     * Helper class that actually creates and manages
     * the provider's underlying data repository.
     */

    private static class DatabaseHelper extends SQLiteOpenHelper {
        DatabaseHelper(Context context){
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(CREATE_DB_TABLE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + NUTRITION_VALUES_TABLE_NAME);
            onCreate(db);
        }
    }

    @Override
    public boolean onCreate() {
        Context context = getContext();
        DatabaseHelper dbHelper = new DatabaseHelper(context);

        /**
         * Create a write able database which will trigger its
         * creation if it doesn't already exist.
         */

        db = dbHelper.getWritableDatabase();
        return (db == null)? false:true;
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        /**
         * Add a new student record
         */
        long rowID = db.insert(NUTRITION_VALUES_TABLE_NAME, "", values);

        /**
         * If record is added successfully
         */
        if (rowID > 0) {
            Uri _uri = ContentUris.withAppendedId(CONTENT_URI, rowID);
            getContext().getContentResolver().notifyChange(_uri, null);
            return _uri;
        }

        throw new SQLException("Failed to add a record into " + uri);
    }

    @Override
    public Cursor query(Uri uri, String[] projection,
                        String selection,String[] selectionArgs, String sortOrder) {
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
        qb.setTables(NUTRITION_VALUES_TABLE_NAME);

        switch (uriMatcher.match(uri)) {
            case NUTRITION_VALUES:
//                qb.setProjectionMap(STUDENTS_PROJECTION_MAP);
                break;

            case NUTRITION_VALUES_ID:
                qb.appendWhere( _ID + "=" + uri.getPathSegments().get(1));
                break;

            default:
        }

        if (sortOrder == null || sortOrder == ""){
            /**
             * By default sort on student names
             */
            sortOrder = NAME;
        }

        Cursor c = qb.query(db,	projection,	selection,
                selectionArgs,null, null, sortOrder);
        /**
         * register to watch a content URI for changes
         */
        c.setNotificationUri(getContext().getContentResolver(), uri);
        return c;
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        int count = 0;
        switch (uriMatcher.match(uri)){
            case NUTRITION_VALUES:
                count = db.delete(NUTRITION_VALUES_TABLE_NAME, selection, selectionArgs);
                break;

            case NUTRITION_VALUES_ID:
                String id = uri.getPathSegments().get(1);
                count = db.delete(NUTRITION_VALUES_TABLE_NAME, _ID +  " = " + id +
                        (!TextUtils.isEmpty(selection) ? "AND (" + selection + ')' : ""), selectionArgs);
                break;
            default:
                throw new IllegalArgumentException("Unknown URI " + uri);
        }

        getContext().getContentResolver().notifyChange(uri, null);
        return count;
    }

    @Override
    public int update(Uri uri, ContentValues values,
                      String selection, String[] selectionArgs) {
        int count = 0;
        switch (uriMatcher.match(uri)) {
            case NUTRITION_VALUES:
                count = db.update(NUTRITION_VALUES_TABLE_NAME, values, selection, selectionArgs);
                break;

            case NUTRITION_VALUES_ID:
                count = db.update(NUTRITION_VALUES_TABLE_NAME, values,
                        _ID + " = " + uri.getPathSegments().get(1) +
                                (!TextUtils.isEmpty(selection) ? "AND (" +selection + ')' : ""), selectionArgs);
                break;
            default:
                throw new IllegalArgumentException("Unknown URI " + uri );
        }

        getContext().getContentResolver().notifyChange(uri, null);
        return count;
    }

    @Override
    public String getType(Uri uri) {
        switch (uriMatcher.match(uri)){
            /**
             * Get all student records
             */
            case NUTRITION_VALUES:
                return "vnd.android.cursor.dir/vnd.example.nutrition_values";
            /**
             * Get a particular student
             */
            case NUTRITION_VALUES_ID:
                return "vnd.android.cursor.item/vnd.example.nutrition_values";
            default:
                throw new IllegalArgumentException("Unsupported URI: " + uri);
        }
    }
}

