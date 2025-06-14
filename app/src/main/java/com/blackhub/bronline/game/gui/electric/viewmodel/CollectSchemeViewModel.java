package com.blackhub.bronline.game.gui.electric.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.gui.electric.enums.ColorTrafficLight;
import com.blackhub.bronline.game.gui.electric.state.CollectSchemeUiState;
import com.fasterxml.jackson.core.io.schubfach.DoubleToDecimal;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CollectSchemeViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\u0006\u0010\u001b\u001a\u00020\u0014J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\u000e\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0019J\u0006\u0010\"\u001a\u00020\u0014J\u0006\u0010#\u001a\u00020\u0014J\u0006\u0010$\u001a\u00020\u0014R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, d2 = {"Lcom/blackhub/bronline/game/gui/electric/viewmodel/CollectSchemeViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/electric/state/CollectSchemeUiState;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "preferencesRepository", "Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;", "(Lcom/blackhub/bronline/game/common/LocalNotification;Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getLocalNotification", "()Lcom/blackhub/bronline/game/common/LocalNotification;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "changeColorTrafficLight", "", "closeHint", "closeInstruction", "initArgs", "screenArgs", "", "initPreferences", "onBgHintClick", "setColorTrafficLight", "colorTrafficLight", "Lcom/blackhub/bronline/game/gui/electric/enums/ColorTrafficLight;", "setWin", "showErrorMessage", ThrowableDeserializer.PROP_NAME_MESSAGE, "showHint", "startTimer", "turnOnHintThree", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCollectSchemeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectSchemeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/CollectSchemeViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,186:1\n230#2,5:187\n230#2,5:192\n230#2,5:197\n230#2,5:202\n230#2,5:207\n230#2,5:212\n230#2,5:217\n230#2,5:222\n230#2,5:227\n*S KotlinDebug\n*F\n+ 1 CollectSchemeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/CollectSchemeViewModel\n*L\n86#1:187,5\n94#1:192,5\n106#1:197,5\n114#1:202,5\n122#1:207,5\n131#1:212,5\n139#1:217,5\n151#1:222,5\n179#1:227,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CollectSchemeViewModel extends BaseViewModel<CollectSchemeUiState> implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<CollectSchemeUiState> _uiState;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final PreferencesRepository preferencesRepository;

    @NotNull
    public final StateFlow<CollectSchemeUiState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Inject
    public CollectSchemeViewModel(@NotNull LocalNotification localNotification, @NotNull PreferencesRepository preferencesRepository) {
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.localNotification = localNotification;
        this.preferencesRepository = preferencesRepository;
        this._uiState = StateFlowKt.MutableStateFlow(new CollectSchemeUiState(null, null, false, false, false, 0, false, false, null, null, false, DoubleToDecimal.BQ_MASK, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
        initPreferences();
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends CollectSchemeUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<CollectSchemeUiState> getUiState() {
        return this.uiState;
    }

    public final void changeColorTrafficLight() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CollectSchemeViewModel$changeColorTrafficLight$1(this, null), 3, null);
    }

    public final void initArgs(@NotNull String screenArgs) {
        Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new CollectSchemeViewModel$initArgs$1(screenArgs, this, null), 1, null);
    }

    public final void onBgHintClick() {
        CollectSchemeUiState value;
        CollectSchemeUiState copy;
        CollectSchemeUiState value2;
        CollectSchemeUiState copy2;
        int countHint = get_uiState().getValue().getCountHint();
        if (countHint == 1) {
            MutableStateFlow<? extends CollectSchemeUiState> mutableStateFlow = get_uiState();
            do {
                value = mutableStateFlow.getValue();
                copy = r2.copy((r24 & 1) != 0 ? r2.instructionsAndHints : null, (r24 & 2) != 0 ? r2.gameInstructionsItemList : null, (r24 & 4) != 0 ? r2.isInstructionsShow : false, (r24 & 8) != 0 ? r2.isHintShow : false, (r24 & 16) != 0 ? r2.isHandShow : false, (r24 & 32) != 0 ? r2.countHint : 2, (r24 & 64) != 0 ? r2.isFirstGame : false, (r24 & 128) != 0 ? r2.isTimerStart : false, (r24 & 256) != 0 ? r2.isWin : null, (r24 & 512) != 0 ? r2.colorTrafficLight : null, (r24 & 1024) != 0 ? value.isBlockingLoading : false);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            return;
        }
        if (countHint != 3) {
            return;
        }
        MutableStateFlow<? extends CollectSchemeUiState> mutableStateFlow2 = get_uiState();
        do {
            value2 = mutableStateFlow2.getValue();
            copy2 = r2.copy((r24 & 1) != 0 ? r2.instructionsAndHints : null, (r24 & 2) != 0 ? r2.gameInstructionsItemList : null, (r24 & 4) != 0 ? r2.isInstructionsShow : false, (r24 & 8) != 0 ? r2.isHintShow : false, (r24 & 16) != 0 ? r2.isHandShow : false, (r24 & 32) != 0 ? r2.countHint : 0, (r24 & 64) != 0 ? r2.isFirstGame : false, (r24 & 128) != 0 ? r2.isTimerStart : false, (r24 & 256) != 0 ? r2.isWin : null, (r24 & 512) != 0 ? r2.colorTrafficLight : null, (r24 & 1024) != 0 ? value2.isBlockingLoading : false);
        } while (!mutableStateFlow2.compareAndSet(value2, copy2));
    }

    public final void turnOnHintThree() {
        CollectSchemeUiState value;
        CollectSchemeUiState copy;
        MutableStateFlow<? extends CollectSchemeUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r24 & 1) != 0 ? r2.instructionsAndHints : null, (r24 & 2) != 0 ? r2.gameInstructionsItemList : null, (r24 & 4) != 0 ? r2.isInstructionsShow : false, (r24 & 8) != 0 ? r2.isHintShow : false, (r24 & 16) != 0 ? r2.isHandShow : false, (r24 & 32) != 0 ? r2.countHint : 3, (r24 & 64) != 0 ? r2.isFirstGame : false, (r24 & 128) != 0 ? r2.isTimerStart : false, (r24 & 256) != 0 ? r2.isWin : null, (r24 & 512) != 0 ? r2.colorTrafficLight : null, (r24 & 1024) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void startTimer() {
        CollectSchemeUiState value;
        CollectSchemeUiState copy;
        MutableStateFlow<? extends CollectSchemeUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r24 & 1) != 0 ? r2.instructionsAndHints : null, (r24 & 2) != 0 ? r2.gameInstructionsItemList : null, (r24 & 4) != 0 ? r2.isInstructionsShow : false, (r24 & 8) != 0 ? r2.isHintShow : false, (r24 & 16) != 0 ? r2.isHandShow : false, (r24 & 32) != 0 ? r2.countHint : 0, (r24 & 64) != 0 ? r2.isFirstGame : false, (r24 & 128) != 0 ? r2.isTimerStart : true, (r24 & 256) != 0 ? r2.isWin : null, (r24 & 512) != 0 ? r2.colorTrafficLight : null, (r24 & 1024) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void closeInstruction() {
        CollectSchemeUiState value;
        CollectSchemeUiState copy;
        MutableStateFlow<? extends CollectSchemeUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r24 & 1) != 0 ? r2.instructionsAndHints : null, (r24 & 2) != 0 ? r2.gameInstructionsItemList : null, (r24 & 4) != 0 ? r2.isInstructionsShow : false, (r24 & 8) != 0 ? r2.isHintShow : getUiState().getValue().isFirstGame(), (r24 & 16) != 0 ? r2.isHandShow : false, (r24 & 32) != 0 ? r2.countHint : 0, (r24 & 64) != 0 ? r2.isFirstGame : false, (r24 & 128) != 0 ? r2.isTimerStart : false, (r24 & 256) != 0 ? r2.isWin : null, (r24 & 512) != 0 ? r2.colorTrafficLight : null, (r24 & 1024) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void showHint() {
        CollectSchemeUiState value;
        CollectSchemeUiState copy;
        MutableStateFlow<? extends CollectSchemeUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r24 & 1) != 0 ? r2.instructionsAndHints : null, (r24 & 2) != 0 ? r2.gameInstructionsItemList : null, (r24 & 4) != 0 ? r2.isInstructionsShow : false, (r24 & 8) != 0 ? r2.isHintShow : true, (r24 & 16) != 0 ? r2.isHandShow : false, (r24 & 32) != 0 ? r2.countHint : 0, (r24 & 64) != 0 ? r2.isFirstGame : false, (r24 & 128) != 0 ? r2.isTimerStart : false, (r24 & 256) != 0 ? r2.isWin : null, (r24 & 512) != 0 ? r2.colorTrafficLight : null, (r24 & 1024) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void closeHint() {
        CollectSchemeUiState value;
        CollectSchemeUiState copy;
        MutableStateFlow<? extends CollectSchemeUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r24 & 1) != 0 ? r2.instructionsAndHints : null, (r24 & 2) != 0 ? r2.gameInstructionsItemList : null, (r24 & 4) != 0 ? r2.isInstructionsShow : false, (r24 & 8) != 0 ? r2.isHintShow : false, (r24 & 16) != 0 ? r2.isHandShow : false, (r24 & 32) != 0 ? r2.countHint : 0, (r24 & 64) != 0 ? r2.isFirstGame : false, (r24 & 128) != 0 ? r2.isTimerStart : false, (r24 & 256) != 0 ? r2.isWin : null, (r24 & 512) != 0 ? r2.colorTrafficLight : null, (r24 & 1024) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void showErrorMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        getLocalNotification().showErrorNotification(message);
    }

    public final void setColorTrafficLight(ColorTrafficLight colorTrafficLight) {
        CollectSchemeUiState value;
        CollectSchemeUiState copy;
        MutableStateFlow<? extends CollectSchemeUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r24 & 1) != 0 ? r2.instructionsAndHints : null, (r24 & 2) != 0 ? r2.gameInstructionsItemList : null, (r24 & 4) != 0 ? r2.isInstructionsShow : false, (r24 & 8) != 0 ? r2.isHintShow : false, (r24 & 16) != 0 ? r2.isHandShow : false, (r24 & 32) != 0 ? r2.countHint : 0, (r24 & 64) != 0 ? r2.isFirstGame : false, (r24 & 128) != 0 ? r2.isTimerStart : false, (r24 & 256) != 0 ? r2.isWin : null, (r24 & 512) != 0 ? r2.colorTrafficLight : colorTrafficLight, (r24 & 1024) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    private final void initPreferences() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new CollectSchemeViewModel$initPreferences$1(this, null), 1, null);
    }

    public final void setWin() {
        CollectSchemeUiState value;
        CollectSchemeUiState copy;
        MutableStateFlow<? extends CollectSchemeUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r24 & 1) != 0 ? r2.instructionsAndHints : null, (r24 & 2) != 0 ? r2.gameInstructionsItemList : null, (r24 & 4) != 0 ? r2.isInstructionsShow : false, (r24 & 8) != 0 ? r2.isHintShow : false, (r24 & 16) != 0 ? r2.isHandShow : false, (r24 & 32) != 0 ? r2.countHint : 0, (r24 & 64) != 0 ? r2.isFirstGame : false, (r24 & 128) != 0 ? r2.isTimerStart : false, (r24 & 256) != 0 ? r2.isWin : Boolean.TRUE, (r24 & 512) != 0 ? r2.colorTrafficLight : null, (r24 & 1024) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }
}
