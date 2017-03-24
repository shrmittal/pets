package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by SHREYA on 3/23/2017.
 */
public final class PetContract {



    private PetContract() {
    }

    public final static String CONTENT_AUTHORITY="content://com.example..android.pets";
    public final static String PATH_PETS="pets";

    public static final class PetEntry implements BaseColumns{

        public final static String _ID=BaseColumns._ID;
        public final static String TABLE_NAME="pets";
        public final static String COLUMN_PET_NAME="name";
        public final static String COLUMN_PET_BREED="breed";
        public final static String COLUMN_PET_GENDER="gender";
        public final static String COLUMN_PET_WEIGHT="weight";

        public final static int GENDER_UNKNOWN=0;
        public final static int GENDER_MALE=1;
        public final static int GENDER_FEMALE=2;


    }
}
