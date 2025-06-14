package com.blackhub.bronline.game.gui.electric.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.gui.electric.network.ElectricActionWithJSON;
import com.blackhub.bronline.game.gui.electric.state.ElectricUiState;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: ElectricViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001!B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0014J\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001aJ\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\""}, d2 = {"Lcom/blackhub/bronline/game/gui/electric/viewmodel/ElectricViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/electric/state/ElectricUiState;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/electric/network/ElectricActionWithJSON;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "(Lcom/blackhub/bronline/game/gui/electric/network/ElectricActionWithJSON;Lcom/blackhub/bronline/game/common/LocalNotification;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getLocalNotification", "()Lcom/blackhub/bronline/game/common/LocalNotification;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "initJson", "", "json", "Lorg/json/JSONObject;", "sendCloseScreen", "sendFinishMiniGame", "isWin", "", "sendStartMiniGame", "setLevelCounter", "win", "showErrorMessage", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "Companion", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nElectricViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectricViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/ElectricViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,96:1\n230#2,5:97\n*S KotlinDebug\n*F\n+ 1 ElectricViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/ElectricViewModel\n*L\n59#1:97,5\n*E\n"})
/* loaded from: classes3.dex */
public final class ElectricViewModel extends BaseViewModel<ElectricUiState> implements ViewModelProvider.Factory {
    public static final long FINISH_GAME_DELAY = 500;

    @NotNull
    public final MutableStateFlow<ElectricUiState> _uiState;

    @NotNull
    public final ElectricActionWithJSON actionWithJSON;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final StateFlow<ElectricUiState> uiState;
    public static final int $stable = 8;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Inject
    public ElectricViewModel(@NotNull ElectricActionWithJSON actionWithJSON, @NotNull LocalNotification localNotification) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        this.actionWithJSON = actionWithJSON;
        this.localNotification = localNotification;
        this._uiState = StateFlowKt.MutableStateFlow(new ElectricUiState(0, null, 0, 0, false, false, 63, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends ElectricUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<ElectricUiState> getUiState() {
        return this.uiState;
    }

    public final void initJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new ElectricViewModel$initJson$1(json, this, null), 1, null);
    }

    public final void setLevelCounter(boolean win) {
        ElectricUiState value;
        int levelCounter = getUiState().getValue().getLevelCounter();
        int countWin = win ? getUiState().getValue().getCountWin() + 1 : getUiState().getValue().getCountWin();
        MutableStateFlow<? extends ElectricUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ElectricUiState.copy$default(value, 0, null, levelCounter + 1, countWin, false, false, 51, null)));
    }

    public final void showErrorMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        getLocalNotification().showErrorNotification(message);
    }

    public final void sendStartMiniGame() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new ElectricViewModel$sendStartMiniGame$1(this, null), 1, null);
    }

    public final void sendFinishMiniGame(boolean isWin) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new ElectricViewModel$sendFinishMiniGame$1(isWin, this, null), 1, null);
    }

    public final void sendCloseScreen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new ElectricViewModel$sendCloseScreen$1(this, null), 1, null);
    }
}
