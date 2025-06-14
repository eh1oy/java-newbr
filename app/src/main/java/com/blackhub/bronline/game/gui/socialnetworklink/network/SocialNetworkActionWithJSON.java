package com.blackhub.bronline.game.gui.socialnetworklink.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.gui.socialnetworklink.SocialNetworkLinkUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: SocialNetworkActionWithJSON.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/blackhub/bronline/game/gui/socialnetworklink/network/SocialNetworkActionWithJSON;", "", "guiManager", "Lcom/blackhub/bronline/game/GUIManager;", "(Lcom/blackhub/bronline/game/GUIManager;)V", "guiId", "", "clickOnButton", "", "buttonId", "ifActiveCheckbox", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SocialNetworkActionWithJSON {
    public static final int $stable = 8;
    public final int guiId = 52;

    @Nullable
    public final GUIManager guiManager;

    public SocialNetworkActionWithJSON(@Nullable GUIManager gUIManager) {
        this.guiManager = gUIManager;
    }

    public final void clickOnButton(int buttonId) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 1);
        jSONObject.put(SocialNetworkLinkUtils.KEY_BUTTON_ID, buttonId);
        GUIManager gUIManager = this.guiManager;
        if (gUIManager != null) {
            gUIManager.sendJsonData(this.guiId, jSONObject);
        }
    }

    public final void ifActiveCheckbox() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 2);
        jSONObject.put("s", 1);
        GUIManager gUIManager = this.guiManager;
        if (gUIManager != null) {
            gUIManager.sendJsonData(this.guiId, jSONObject);
        }
    }
}
