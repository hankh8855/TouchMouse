package com.touch.trust.touchmouse.data.source.local;

import android.provider.BaseColumns;

/**
 * Created by Han on 2017-04-19.
 */

public class SamplePersistenceContract {

    //singleton
    private SamplePersistenceContract(){}

    public static abstract class SampleEntry implements BaseColumns{
        public static final String TABLE_NAME = "sample";
        public static final String COLOUM_NAME_x = "x";
        public static final String COLOUM_NAME_y = "y";
        public static final String COLOUM_NAME_act = "act";
        public static final String COLOUM_NAME_DATE = "date";
    }

}
