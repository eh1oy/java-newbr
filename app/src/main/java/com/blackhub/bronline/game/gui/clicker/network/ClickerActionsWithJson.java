package com.blackhub.bronline.game.gui.clicker.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: ClickerActionsWithJson.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/blackhub/bronline/game/gui/clicker/network/ClickerActionsWithJson;", "", "guiManager", "Lcom/blackhub/bronline/game/GUIManager;", "(Lcom/blackhub/bronline/game/GUIManager;)V", "getGuiManager", "()Lcom/blackhub/bronline/game/GUIManager;", "screenId", "", "sendCloseInterface", "", "sendGameOverWithResult", "gameResult", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClickerActionsWithJson {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screenId;

    public ClickerActionsWithJson(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screenId = 79;
    }

    @NotNull
    public final GUIManager getGuiManager() {
        return this.guiManager;
    }

    public final void sendCloseInterface() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("c", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendGameOverWithResult(int gameResult) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", gameResult);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }
}
