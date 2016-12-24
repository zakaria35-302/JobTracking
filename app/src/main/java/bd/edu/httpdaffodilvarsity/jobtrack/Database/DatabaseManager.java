package bd.edu.httpdaffodilvarsity.jobtrack.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Zakaria on 10-Dec-16.
 */

public class DatabaseManager {

    SQLiteDatabase db;
    Context context;
    DatabaseHelper helper;
    SQLiteOpenHelper sqLiteOpenHelper;

    public DatabaseManager(Context context) {
        this.context = context;
        helper=new DatabaseHelper(context);
        db=sqLiteOpenHelper.getWritableDatabase();
    }


    private void open() {
        db=helper.getWritableDatabase();
    }

    /*private void close() {
        helper.close();
    }*/
    // closing database
    public void closeDB() {
        db = helper.getReadableDatabase();
        if (db != null && db.isOpen())
            db.close();
    }
}
