package com.touch.trust.touchmouse.data.source;

import android.support.annotation.NonNull;

import com.touch.trust.touchmouse.data.SampleData;

import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Han on 2017-04-19.
 */

public class SampleRepository implements SampleDataSource {

    private static SampleRepository INSTANCE = null;
    private final SampleDataSource mSampleLocalDataSource;

    Map<String, SampleData> mCachedData;
    boolean mCacheIsDirty = false;

    private SampleRepository(@NonNull SampleDataSource sampleLocalDataSource){
        mSampleLocalDataSource = checkNotNull(sampleLocalDataSource);
    }

    public static SampleRepository getInstance(SampleDataSource sampleLocalDataSource){
        if (INSTANCE == null){
            INSTANCE = new SampleRepository(sampleLocalDataSource);
        }
        return INSTANCE;
    }

    public static void destroyInstance(){
        INSTANCE = null;
    }

    @Override
    public void saveWeekly(@NonNull SampleData sampleData) {

    }

    @Override
    public void clearAct() {

    }
}
