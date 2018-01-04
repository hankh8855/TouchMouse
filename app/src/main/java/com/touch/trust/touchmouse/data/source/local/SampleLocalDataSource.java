package com.touch.trust.touchmouse.data.source.local;

import android.content.Context;
import android.support.annotation.NonNull;

import com.touch.trust.touchmouse.data.SampleData;
import com.touch.trust.touchmouse.data.source.SampleDataSource;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Han on 2017-04-19.
 */

public class SampleLocalDataSource implements SampleDataSource {

    private static SampleLocalDataSource INSTANCE;
    private SampleDbHelper mDbHelper;

    private SampleLocalDataSource(@NonNull Context context){
        checkNotNull(context);
        mDbHelper = new SampleDbHelper(context);
    }

    public static SampleLocalDataSource getInstance(@NonNull Context context){
        if(INSTANCE ==null){
            INSTANCE = new SampleLocalDataSource(context);
        }
        return  INSTANCE;
    }

//    @Override
//    public void getWeeklyList(@NonNull LoadWeeklyListCallback callback) {
//        List<Weekly> weeklyList = new ArrayList<Weekly>();
//        SQLiteDatabase db = mDbHelper.getReadableDatabase();
//
//        String[] projection = {
//                WeeklyEntry.COLOUM_NAME_WEEKLY_ID,
//                WeeklyEntry.COLOUM_NAME_MEMO,
//                WeeklyEntry.COLOUM_NAME_ADDRESS,
//                WeeklyEntry.COLOUM_NAME_DATE
//        };
//
//        Cursor cursor = db.query(WeeklyEntry.TABLE_NAME,projection,null,null,null,null,null);
//        if (cursor != null && cursor.getCount() > 0){
//            while (cursor.moveToNext()){
//                String weeklyId = cursor.getString(cursor.getColumnIndexOrThrow(WeeklyEntry.COLOUM_NAME_WEEKLY_ID));
//                String memo = cursor.getString(cursor.getColumnIndexOrThrow(WeeklyEntry.COLOUM_NAME_MEMO));
//                String address = cursor.getString(cursor.getColumnIndexOrThrow(WeeklyEntry.COLOUM_NAME_ADDRESS));
//                String date = cursor.getString(cursor.getColumnIndexOrThrow(WeeklyEntry.COLOUM_NAME_DATE));
//                Weekly weekly = new Weekly(weeklyId, memo, address, date);
//                weeklyList.add(weekly);
//            }
//        }
//        if (cursor !=null) {
//            cursor.close();
//        }
//        db.close();
//
//        if (weeklyList.isEmpty()) {
//            callback.onDataNotAvailable();
//        }else {
//            callback.onWeeklyListLoaded(weeklyList);
//        }
//
//    }

    @Override
    public void saveWeekly(@NonNull SampleData sampleData) {
        checkNotNull(sampleData);
//        SQLiteDatabase db = mDbHelper.getWritableDatabase();
//
//        ContentValues values = new ContentValues();
//        values.put(WeeklyEntry.COLOUM_NAME_WEEKLY_ID,weekly.getId());
//
//        db.insert(WeeklyEntry.TABLE_NAME,null,values);
//        db.close();
    }

    @Override
    public void clearAct() {

    }
}
