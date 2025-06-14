package com.blackhub.bronline.game.gui.radialmenuforcar.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.blackhub.bronline.game.gui.radialmenuforcar.netrowk.RadialMenuActionWithJSON;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: RadialMenuViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/blackhub/bronline/game/gui/radialmenuforcar/viewmodel/RadialMenuViewModel;", "Landroidx/lifecycle/ViewModel;", "actionWithJson", "Lcom/blackhub/bronline/game/gui/radialmenuforcar/netrowk/RadialMenuActionWithJSON;", "(Lcom/blackhub/bronline/game/gui/radialmenuforcar/netrowk/RadialMenuActionWithJSON;)V", "sendServerThisOperation", "", "valueKey", "", "showMessageError", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RadialMenuViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final RadialMenuActionWithJSON actionWithJson;

    @Inject
    public RadialMenuViewModel(@NotNull RadialMenuActionWithJSON actionWithJson) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        this.actionWithJson = actionWithJson;
    }

    public final void sendServerThisOperation(int valueKey) {
        this.actionWithJson.sendServerThisOperation(valueKey);
    }

    public final void showMessageError() {
        this.actionWithJson.showMessageError();
    }
}
