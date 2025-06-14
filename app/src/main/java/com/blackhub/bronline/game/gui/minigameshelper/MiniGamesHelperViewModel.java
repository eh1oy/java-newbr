package com.blackhub.bronline.game.gui.minigameshelper;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: MiniGamesHelperViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperUiState;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperWithJSON;", "(Lcom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperWithJSON;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "initJson", "", "json", "Lorg/json/JSONObject;", "onCloseButtonClick", "onEndOfTime", "onHitLine", "isHit", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MiniGamesHelperViewModel extends BaseViewModel<MiniGamesHelperUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<MiniGamesHelperUiState> _uiState;

    @NotNull
    public final MiniGamesHelperWithJSON actionWithJSON;

    @NotNull
    public final StateFlow<MiniGamesHelperUiState> uiState;

    @Inject
    public MiniGamesHelperViewModel(@NotNull MiniGamesHelperWithJSON actionWithJSON) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        this.actionWithJSON = actionWithJSON;
        this._uiState = StateFlowKt.MutableStateFlow(new MiniGamesHelperUiState(null, null, null, null, 0, 0, 0, null, 0, 0L, 0, false, false, 8191, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends MiniGamesHelperUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<MiniGamesHelperUiState> getUiState() {
        return this.uiState;
    }

    public final void initJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new MiniGamesHelperViewModel$initJson$1(json, this, null), 1, null);
    }

    public final void onCloseButtonClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new MiniGamesHelperViewModel$onCloseButtonClick$1(this, null), 1, null);
    }

    public final void onEndOfTime() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new MiniGamesHelperViewModel$onEndOfTime$1(this, null), 1, null);
    }

    public final void onHitLine(boolean isHit) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new MiniGamesHelperViewModel$onHitLine$1(isHit, this, null), 1, null);
    }
}
