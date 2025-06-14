package com.blackhub.bronline.game.gui.chat.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: ChatActionsWithJson.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/blackhub/bronline/game/gui/chat/network/ChatActionsWithJson;", "", "guiManager", "Lcom/blackhub/bronline/game/GUIManager;", "(Lcom/blackhub/bronline/game/GUIManager;)V", "getGuiManager", "()Lcom/blackhub/bronline/game/GUIManager;", "screenId", "", "getScreenId", "()I", "sendOnVoteClick", "", "sendText", "text", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatActionsWithJson {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screenId;

    public ChatActionsWithJson(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screenId = 80;
    }

    @NotNull
    public final GUIManager getGuiManager() {
        return this.guiManager;
    }

    public final int getScreenId() {
        return this.screenId;
    }

    public final void sendOnVoteClick() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 2);
        jSONObject.put("tx", text);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }
}
