package com.blackhub.bronline.game.fingerprint;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.blackhub.bronline.game.fingerprint.FingerprintApi;

@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes3.dex */
public final class SamsungFingerprintApi extends FingerprintApi {
    public static final String PERMISSION = "com.samsung.android.providers.context.permission.WRITE_USE_APP_FEATURE_SURVEY";
    public static SamsungFingerprintApi instance;
    public final Activity activity;
    public final SamsungFingerprintHandler fingerprintHandler;

    public static synchronized SamsungFingerprintApi getInstance(@NonNull Activity activity) {
        SamsungFingerprintApi samsungFingerprintApi;
        synchronized (SamsungFingerprintApi.class) {
            try {
                if (instance == null) {
                    instance = new SamsungFingerprintApi(activity);
                }
                samsungFingerprintApi = instance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return samsungFingerprintApi;
    }

    public SamsungFingerprintApi(Activity activity) {
        this.activity = activity;
        this.fingerprintHandler = new SamsungFingerprintHandler(activity);
    }

    @Override // com.blackhub.bronline.game.fingerprint.FingerprintApi
    public boolean isFingerprintSupported() {
        if (ContextCompat.checkSelfPermission(this.activity, PERMISSION) != 0) {
            ActivityCompat.requestPermissions(this.activity, new String[]{PERMISSION}, FingerprintApi.PERMISSION_FINGERPRINT);
            return false;
        }
        return this.fingerprintHandler.hasRegisteredFinger();
    }

    @Override // com.blackhub.bronline.game.fingerprint.FingerprintApi
    public void start(@NonNull FingerprintApi.Callback callback) {
        this.fingerprintHandler.setCallback(callback);
        this.fingerprintHandler.start();
    }

    @Override // com.blackhub.bronline.game.fingerprint.FingerprintApi
    public void cancel() {
        this.fingerprintHandler.cancel();
    }
}
