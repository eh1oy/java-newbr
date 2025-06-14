package com.blackhub.bronline.game.gui.gasmangame.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GasmanActionsWithJson.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/blackhub/bronline/game/gui/gasmangame/network/GasmanActionsWithJson;", "", "guiManager", "Lcom/blackhub/bronline/game/GUIManager;", "(Lcom/blackhub/bronline/game/GUIManager;)V", "sendExit", "", "value", "", "sendGasAnimated", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GasmanActionsWithJson {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;

    public GasmanActionsWithJson(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
    }

    public final void sendExit(int value) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("c", value);
        this.guiManager.sendJsonData(58, jSONObject);
    }

    public final void sendGasAnimated() {
        GUIManager gUIManager = this.guiManager;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("s", 1);
        Unit unit = Unit.INSTANCE;
        gUIManager.sendJsonData(58, jSONObject);
    }
}
