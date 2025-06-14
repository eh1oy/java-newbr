package com.blackhub.bronline.game.fingerprint;

import android.app.Activity;
import android.hardware.fingerprint.FingerprintManager;
import androidx.annotation.NonNull;
import com.google.android.datatransport.cct.CctTransportBackend;
import com.samsung.android.sdk.pass.Spass;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public abstract class FingerprintApi {
    public static final int PERMISSION_FINGERPRINT = 100500;

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    public interface Callback {
        void onError(int errorCode);

        void onFailure();

        void onSuccess(String publicKey);
    }

    public abstract void cancel();

    public abstract boolean isFingerprintSupported();

    public abstract void start(@NonNull Callback callback);

    public static FingerprintApi create(@NonNull Activity activity) {
        FingerprintManager fingerprintManager = (FingerprintManager) activity.getSystemService(CctTransportBackend.KEY_FINGERPRINT);
        Spass spass = new Spass();
        FingerprintApi fingerprintApi = null;
        if (fingerprintManager != null) {
            try {
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (fingerprintManager.isHardwareDetected()) {
                fingerprintApi = MarshmallowFingerprintApi.getInstance(activity);
                return fingerprintApi;
            }
        }
        spass.initialize(activity);
        if (spass.isFeatureEnabled(0)) {
            fingerprintApi = SamsungFingerprintApi.getInstance(activity);
        }
        return fingerprintApi;
    }
}
