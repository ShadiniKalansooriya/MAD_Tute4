package com.example.tute4.Database;

import android.provider.BaseColumns;

public final class UsersMaster {
    private UsersMaster(){}

    public static class Users implements BaseColumns{

        public static final String TABLE_NAME = "users";
        public static final String COLOUMN_NAME_USERNAME = "username";
        public static final String COLOUMN_NAME_PASSWORD = "password";

    }

}