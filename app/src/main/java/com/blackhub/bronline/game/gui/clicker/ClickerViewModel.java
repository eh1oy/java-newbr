package com.blackhub.bronline.game.gui.clicker;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.gui.clicker.network.ClickerActionsWithJson;
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
/* compiled from: ClickerViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u0013J\b\u0010 \u001a\u00020\u0013H\u0002R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006!"}, d2 = {"Lcom/blackhub/bronline/game/gui/clicker/ClickerViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/clicker/ClickerUiState;", "actionsWithJson", "Lcom/blackhub/bronline/game/gui/clicker/network/ClickerActionsWithJson;", "application", "Landroid/app/Application;", "(Lcom/blackhub/bronline/game/gui/clicker/network/ClickerActionsWithJson;Landroid/app/Application;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "isStartGame", "", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "closeInterface", "", "finishTimer", "gameOver", "gameResult", "", "getDelayForBitOpponent", "", "intensityAiClickPerSeconds", "", "initInterface", "jsonObject", "Lorg/json/JSONObject;", "onTapScreen", "startTapOpponent", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClickerViewModel extends BaseViewModel<ClickerUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<ClickerUiState> _uiState;

    @NotNull
    public final ClickerActionsWithJson actionsWithJson;

    @NotNull
    public final Application application;
    public boolean isStartGame;

    @NotNull
    public final StateFlow<ClickerUiState> uiState;

    @Inject
    public ClickerViewModel(@NotNull ClickerActionsWithJson actionsWithJson, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(actionsWithJson, "actionsWithJson");
        Intrinsics.checkNotNullParameter(application, "application");
        this.actionsWithJson = actionsWithJson;
        this.application = application;
        this._uiState = StateFlowKt.MutableStateFlow(new ClickerUiState(0, 0L, 0, 0, null, null, null, null, null, false, 1023, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends ClickerUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<ClickerUiState> getUiState() {
        return this.uiState;
    }

    public final void initInterface(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new ClickerViewModel$initInterface$1(jsonObject, this, null), 1, null);
    }

    public final void onTapScreen() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new ClickerViewModel$onTapScreen$1(this, null), 1, null);
    }

    public final void closeInterface() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new ClickerViewModel$closeInterface$1(this, null), 1, null);
    }

    public final void finishTimer() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new ClickerViewModel$finishTimer$1(this, null), 1, null);
    }

    public final void startTapOpponent() {
        this.isStartGame = true;
        ViewModelExtensionKt.launchOnDefault$default(this, null, new ClickerViewModel$startTapOpponent$1(this, null), 1, null);
    }

    public final void gameOver(int gameResult) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new ClickerViewModel$gameOver$1(this, gameResult, null), 1, null);
    }

    public final long getDelayForBitOpponent(double intensityAiClickPerSeconds) {
        if (intensityAiClickPerSeconds < 0.1d) {
            intensityAiClickPerSeconds = 0.1d;
        }
        return 1000 / ((int) (intensityAiClickPerSeconds * 10));
    }
}
