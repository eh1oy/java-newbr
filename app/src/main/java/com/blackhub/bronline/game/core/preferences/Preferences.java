package com.blackhub.bronline.game.core.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public class Preferences {
    public static final String EMAIL = "EMAIL";
    public static final String NAME = "preferences";
    public static final String PREVIOUS_VERSION = "PREVIOUS_VERSION";
    public static final String PRIVACY = "PRIVACY";
    public static final String USER_ACCOUNT_ID = "USER_ACCOUNT_ID";
    public static final String USER_APPMETRICA_DEVICE_ID = "USER_APPMETRICA_DEVICE_ID";
    public static final String USER_SERVER = "USER_SERVER";

    public static <T> void putObject(Context context, String key, T object) {
        SharedPreferences.Editor edit = context.getSharedPreferences(NAME, 0).edit();
        edit.putString(key, new Gson().toJson(object));
        edit.apply();
    }

    public static void putString(Context context, String key, String value) {
        SharedPreferences.Editor edit = context.getSharedPreferences(NAME, 0).edit();
        edit.putString(key, value);
        edit.apply();
    }

    public static String getString(Context context, String key) {
        if (context == null) {
            return "";
        }
        return context.getSharedPreferences(NAME, 0).getString(key, "");
    }

    public static String getString(Context context, String key, String def) {
        if (context != null) {
            return context.getSharedPreferences(NAME, 0).getString(key, def);
        }
        return "";
    }

    public static void putBoolean(Context context, String key, boolean value) {
        SharedPreferences.Editor edit = context.getSharedPreferences(NAME, 0).edit();
        edit.putBoolean(key, value);
        edit.apply();
    }

    public static boolean getBoolean(Context context, String key) {
        return context.getSharedPreferences(NAME, 0).getBoolean(key, false);
    }

    public static void clear(Context context, String key) {
        context.getSharedPreferences(NAME, 0).edit().remove(key).apply();
    }

    public static void putInteger(Context context, String key, int value) {
        SharedPreferences.Editor edit = context.getSharedPreferences(NAME, 0).edit();
        edit.putInt(key, value);
        edit.apply();
    }

    public static int getInteger(Context context, String key) {
        return context.getSharedPreferences(NAME, 0).getInt(key, -1);
    }

    public static int getInteger(Context context, String key, int defValue) {
        return context.getSharedPreferences(NAME, 0).getInt(key, defValue);
    }

    public static void putFloat(Context context, String key, float value) {
        SharedPreferences.Editor edit = context.getSharedPreferences(NAME, 0).edit();
        edit.putFloat(key, value);
        edit.apply();
    }

    public static float getFloat(Context context, String key) {
        return context.getSharedPreferences(NAME, 0).getFloat(key, -1.0f);
    }
}
