package com.touch.trust.touchmouse.data.source;

import android.support.annotation.NonNull;

import com.touch.trust.touchmouse.data.SampleData;

/**
 * Created by Han on 2017-04-19.
 */

public interface SampleDataSource {

//    interface LoadWeeklyListCallback {
//        void onWeeklyListLoaded(List<SampleData> sampleData);
//        void onDataNotAvailable();
//    }

//    void getWeeklyList(@NonNull LoadWeeklyListCallback callback);

    void saveWeekly(@NonNull SampleData sampleData);
    void clearAct();

}
