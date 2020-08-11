package com.lmonkey.entity;

public class LMONKEY_USER {
    private final String USER_ID;
    private final String USER_NAME;
    private final String USER_PASSWORD;
    private final String USER_SEX;
    private final String USER_BIRTHDAY;
    private final String USER_IDENITY_CODE;
    private final String USER_EMAIL;
    private final String USER_MOBILE;
    private final String USER_ADDRESS;
    private final int USER_STATUS;

    public LMONKEY_USER(String USER_ID, String USER_NAME, String USER_PASSWORD, String USER_SEX, String USER_BIRTHDAY, String USER_IDENITY_CODE, String USER_EMAIL, String USER_MOBILE, String USER_ADDRESS, int USER_STATUS) {
        this.USER_ID = USER_ID;
        this.USER_NAME = USER_NAME;
        this.USER_PASSWORD = USER_PASSWORD;
        this.USER_SEX = USER_SEX;
        this.USER_BIRTHDAY = USER_BIRTHDAY;
        this.USER_IDENITY_CODE = USER_IDENITY_CODE;
        this.USER_EMAIL = USER_EMAIL;
        this.USER_MOBILE = USER_MOBILE;
        this.USER_ADDRESS = USER_ADDRESS;
        this.USER_STATUS = USER_STATUS;
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public String getUSER_PASSWORD() {
        return USER_PASSWORD;
    }

    public String getUSER_SEX() {
        return USER_SEX;
    }

    public String getUSER_BIRTHDAY() {
        return USER_BIRTHDAY;
    }

    public String getUSER_IDENITY_CODE() {
        return USER_IDENITY_CODE;
    }

    public String getUSER_EMAIL() {
        return USER_EMAIL;
    }

    public String getUSER_MOBILE() {
        return USER_MOBILE;
    }

    public String getUSER_ADDRESS() {
        return USER_ADDRESS;
    }

    public int getUSER_STATUS() {
        return USER_STATUS;
    }
}
