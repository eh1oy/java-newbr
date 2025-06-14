package com.blackhub.bronline.game.gui.entertainmentsystem.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: EntertainmentSystemActionsWithJSON.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/blackhub/bronline/game/gui/entertainmentsystem/network/EntertainmentSystemActionsWithJSON;", "", "guiManager", "Lcom/blackhub/bronline/game/GUIManager;", "(Lcom/blackhub/bronline/game/GUIManager;)V", "sendGetLobby", "", "lobbiesNumber", "", "sendPressButton", "typeKey", "fragmentId", "sendPressButtonForEntertainmentSystem", "sendPressButtonForFinalWindow", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EntertainmentSystemActionsWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;

    public EntertainmentSystemActionsWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
    }

    public final void sendPressButtonForEntertainmentSystem(int typeKey) {
        sendPressButton(typeKey, 42);
    }

    public final void sendPressButtonForFinalWindow(int typeKey) {
        sendPressButton(typeKey, 43);
    }

    public final void sendPressButton(int typeKey, int fragmentId) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", typeKey);
            this.guiManager.sendJsonData(fragmentId, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void sendGetLobby(int lobbiesNumber) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", 1);
            jSONObject.put("g", lobbiesNumber);
            this.guiManager.sendJsonData(42, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }
}
