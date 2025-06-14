package com.blackhub.bronline.game.gui.taxi;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TaxiActionWithJSON.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/blackhub/bronline/game/gui/taxi/TaxiActionWithJSON;", "", "guiManager", "Lcom/blackhub/bronline/game/GUIManager;", "(Lcom/blackhub/bronline/game/GUIManager;)V", "screen", "", "sendAccept", "", "sendCloseScreen", "sendNext", "sendPrew", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TaxiActionWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screen;

    public TaxiActionWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screen = 16;
    }

    public final void sendNext() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 0);
        jSONObject.put("b", 0);
        this.guiManager.sendJsonData(this.screen, jSONObject);
    }

    public final void sendPrew() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 0);
        jSONObject.put("b", 1);
        this.guiManager.sendJsonData(this.screen, jSONObject);
    }

    public final void sendAccept() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 0);
        jSONObject.put("b", 2);
        this.guiManager.sendJsonData(this.screen, jSONObject);
    }

    public final void sendCloseScreen() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", -1);
        this.guiManager.sendJsonData(this.screen, jSONObject);
    }
}
