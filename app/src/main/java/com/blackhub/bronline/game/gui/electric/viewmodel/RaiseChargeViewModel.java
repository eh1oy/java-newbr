package com.blackhub.bronline.game.gui.electric.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.gui.electric.state.RaiseChargeUiState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: RaiseChargeViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001eB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u0019\u001a\u00020\u0010J\u000e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/blackhub/bronline/game/gui/electric/viewmodel/RaiseChargeViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/electric/state/RaiseChargeUiState;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "preferencesRepository", "Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;", "(Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "closeHint", "", "closeInstruction", "hideHand", "initArgs", "screenArgs", "", "initPreferences", "raiseCount", "resetData", "setTwoHint", "setWin", "isWin", "", "showHint", "Companion", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRaiseChargeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RaiseChargeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/RaiseChargeViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,148:1\n230#2,5:149\n230#2,5:154\n230#2,5:159\n230#2,5:164\n230#2,5:169\n230#2,5:174\n*S KotlinDebug\n*F\n+ 1 RaiseChargeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/RaiseChargeViewModel\n*L\n41#1:149,5\n86#1:154,5\n94#1:159,5\n102#1:164,5\n111#1:169,5\n119#1:174,5\n*E\n"})
/* loaded from: classes3.dex */
public final class RaiseChargeViewModel extends BaseViewModel<RaiseChargeUiState> implements ViewModelProvider.Factory {
    public static final int NEGATIVE_NUMBER = -10;
    public static final int NUMBER_ONE = 1;
    public static final long SET_WIN_DELAY = 500;

    @NotNull
    public final MutableStateFlow<RaiseChargeUiState> _uiState;

    @NotNull
    public final PreferencesRepository preferencesRepository;

    @NotNull
    public final StateFlow<RaiseChargeUiState> uiState;
    public static final int $stable = 8;

    @Inject
    public RaiseChargeViewModel(@NotNull PreferencesRepository preferencesRepository) {
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.preferencesRepository = preferencesRepository;
        this._uiState = StateFlowKt.MutableStateFlow(new RaiseChargeUiState(null, null, false, false, false, 0, false, null, 0, 511, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
        initPreferences();
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends RaiseChargeUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<RaiseChargeUiState> getUiState() {
        return this.uiState;
    }

    public final void raiseCount() {
        RaiseChargeUiState value;
        RaiseChargeUiState copy;
        MutableStateFlow<? extends RaiseChargeUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r20 & 1) != 0 ? r2.instructionsAndHints : null, (r20 & 2) != 0 ? r2.gameInstructionsItemList : null, (r20 & 4) != 0 ? r2.isInstructionsShow : false, (r20 & 8) != 0 ? r2.isHintShow : false, (r20 & 16) != 0 ? r2.isHandShow : false, (r20 & 32) != 0 ? r2.countHint : 3, (r20 & 64) != 0 ? r2.isFirstGame : false, (r20 & 128) != 0 ? r2.isWin : null, (r20 & 256) != 0 ? value.count : get_uiState().getValue().getCount() + 1);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void setWin(boolean isWin) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new RaiseChargeViewModel$setWin$1(this, isWin, null), 1, null);
    }

    public final void initArgs(@NotNull String screenArgs) {
        Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new RaiseChargeViewModel$initArgs$1(screenArgs, this, null), 1, null);
    }

    public final void setTwoHint() {
        RaiseChargeUiState value;
        RaiseChargeUiState copy;
        MutableStateFlow<? extends RaiseChargeUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r20 & 1) != 0 ? r2.instructionsAndHints : null, (r20 & 2) != 0 ? r2.gameInstructionsItemList : null, (r20 & 4) != 0 ? r2.isInstructionsShow : false, (r20 & 8) != 0 ? r2.isHintShow : false, (r20 & 16) != 0 ? r2.isHandShow : false, (r20 & 32) != 0 ? r2.countHint : 2, (r20 & 64) != 0 ? r2.isFirstGame : false, (r20 & 128) != 0 ? r2.isWin : null, (r20 & 256) != 0 ? value.count : 0);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void hideHand() {
        RaiseChargeUiState value;
        RaiseChargeUiState copy;
        MutableStateFlow<? extends RaiseChargeUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r20 & 1) != 0 ? r2.instructionsAndHints : null, (r20 & 2) != 0 ? r2.gameInstructionsItemList : null, (r20 & 4) != 0 ? r2.isInstructionsShow : false, (r20 & 8) != 0 ? r2.isHintShow : false, (r20 & 16) != 0 ? r2.isHandShow : false, (r20 & 32) != 0 ? r2.countHint : 0, (r20 & 64) != 0 ? r2.isFirstGame : false, (r20 & 128) != 0 ? r2.isWin : null, (r20 & 256) != 0 ? value.count : 0);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void closeInstruction() {
        RaiseChargeUiState value;
        RaiseChargeUiState copy;
        MutableStateFlow<? extends RaiseChargeUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r20 & 1) != 0 ? r2.instructionsAndHints : null, (r20 & 2) != 0 ? r2.gameInstructionsItemList : null, (r20 & 4) != 0 ? r2.isInstructionsShow : false, (r20 & 8) != 0 ? r2.isHintShow : getUiState().getValue().isFirstGame(), (r20 & 16) != 0 ? r2.isHandShow : false, (r20 & 32) != 0 ? r2.countHint : 0, (r20 & 64) != 0 ? r2.isFirstGame : false, (r20 & 128) != 0 ? r2.isWin : null, (r20 & 256) != 0 ? value.count : 0);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void showHint() {
        RaiseChargeUiState value;
        RaiseChargeUiState copy;
        MutableStateFlow<? extends RaiseChargeUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r20 & 1) != 0 ? r2.instructionsAndHints : null, (r20 & 2) != 0 ? r2.gameInstructionsItemList : null, (r20 & 4) != 0 ? r2.isInstructionsShow : false, (r20 & 8) != 0 ? r2.isHintShow : true, (r20 & 16) != 0 ? r2.isHandShow : false, (r20 & 32) != 0 ? r2.countHint : 0, (r20 & 64) != 0 ? r2.isFirstGame : false, (r20 & 128) != 0 ? r2.isWin : null, (r20 & 256) != 0 ? value.count : 0);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void closeHint() {
        RaiseChargeUiState value;
        RaiseChargeUiState copy;
        MutableStateFlow<? extends RaiseChargeUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r20 & 1) != 0 ? r2.instructionsAndHints : null, (r20 & 2) != 0 ? r2.gameInstructionsItemList : null, (r20 & 4) != 0 ? r2.isInstructionsShow : false, (r20 & 8) != 0 ? r2.isHintShow : false, (r20 & 16) != 0 ? r2.isHandShow : false, (r20 & 32) != 0 ? r2.countHint : 0, (r20 & 64) != 0 ? r2.isFirstGame : false, (r20 & 128) != 0 ? r2.isWin : null, (r20 & 256) != 0 ? value.count : 0);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void resetData() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new RaiseChargeViewModel$resetData$1(this, null), 1, null);
    }

    private final void initPreferences() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new RaiseChargeViewModel$initPreferences$1(this, null), 1, null);
    }
}
