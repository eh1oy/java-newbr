package com.blackhub.bronline.game.gui.electric.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DragAndDropCallback;
import com.blackhub.bronline.game.gui.electric.state.SumContactsUiState;
import java.util.ArrayList;
import java.util.List;
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
/* compiled from: SumContactsViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001%B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\rJ\b\u0010\u0019\u001a\u00020\u0015H\u0002J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u0015J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\u0006\u0010\u001f\u001a\u00020\u0015J\u0006\u0010 \u001a\u00020\u0015J\u000e\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020\u0015R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Lcom/blackhub/bronline/game/gui/electric/viewmodel/SumContactsViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/electric/state/SumContactsUiState;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "preferencesRepository", "Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;", "(Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "cartridgeBusyList", "", "", "getCartridgeBusyList", "()Ljava/util/List;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "closeHint", "", "closeInstruction", "initArgs", "screenArgs", "initPreferences", "isTargetOnArea", "dragAndDropCallback", "Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DragAndDropCallback;", "onDarkClick", "randomNumbers", "setHintThree", "setHintTwo", "setWin", "isWin", "", "showHint", "Companion", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSumContactsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SumContactsViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/SumContactsViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,321:1\n230#2,5:322\n230#2,5:327\n230#2,5:332\n230#2,5:337\n230#2,5:342\n230#2,5:347\n*S KotlinDebug\n*F\n+ 1 SumContactsViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/SumContactsViewModel\n*L\n208#1:322,5\n216#1:327,5\n224#1:332,5\n233#1:337,5\n241#1:342,5\n271#1:347,5\n*E\n"})
/* loaded from: classes3.dex */
public final class SumContactsViewModel extends BaseViewModel<SumContactsUiState> implements ViewModelProvider.Factory {
    public static final int MAX_INT_IN_GAME = 9;
    public static final int MINUS_TEN = -10;
    public static final long WIN_DELAY = 300;

    @NotNull
    public final MutableStateFlow<SumContactsUiState> _uiState;

    @NotNull
    public final List<String> cartridgeBusyList;

    @NotNull
    public final PreferencesRepository preferencesRepository;

    @NotNull
    public final StateFlow<SumContactsUiState> uiState;
    public static final int $stable = 8;

    public final void onDarkClick() {
    }

    @Inject
    public SumContactsViewModel(@NotNull PreferencesRepository preferencesRepository) {
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.preferencesRepository = preferencesRepository;
        this._uiState = StateFlowKt.MutableStateFlow(new SumContactsUiState(null, null, false, false, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, null, false, 4194303, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
        this.cartridgeBusyList = new ArrayList();
        randomNumbers();
        initPreferences();
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends SumContactsUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<SumContactsUiState> getUiState() {
        return this.uiState;
    }

    @NotNull
    public final List<String> getCartridgeBusyList() {
        return this.cartridgeBusyList;
    }

    public final void isTargetOnArea(@NotNull DragAndDropCallback dragAndDropCallback) {
        Intrinsics.checkNotNullParameter(dragAndDropCallback, "dragAndDropCallback");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new SumContactsViewModel$isTargetOnArea$1(dragAndDropCallback, this, null), 1, null);
    }

    public final void setWin(boolean isWin) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new SumContactsViewModel$setWin$1(this, isWin, null), 1, null);
    }

    public final void initArgs(@NotNull String screenArgs) {
        Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new SumContactsViewModel$initArgs$1(screenArgs, this, null), 1, null);
    }

    public final void setHintTwo() {
        SumContactsUiState value;
        SumContactsUiState copy;
        MutableStateFlow<? extends SumContactsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r40 & 1) != 0 ? r2.instructionsAndHints : null, (r40 & 2) != 0 ? r2.gameInstructionsItemList : null, (r40 & 4) != 0 ? r2.isInstructionsShow : false, (r40 & 8) != 0 ? r2.isHintShow : false, (r40 & 16) != 0 ? r2.isHandShow : false, (r40 & 32) != 0 ? r2.countHint : 2, (r40 & 64) != 0 ? r2.sumOne : 0, (r40 & 128) != 0 ? r2.sumTwo : 0, (r40 & 256) != 0 ? r2.sumThree : 0, (r40 & 512) != 0 ? r2.bulbTextOne : 0, (r40 & 1024) != 0 ? r2.bulbTextTwo : 0, (r40 & 2048) != 0 ? r2.bulbTextThree : 0, (r40 & 4096) != 0 ? r2.textOne : 0, (r40 & 8192) != 0 ? r2.textTwo : 0, (r40 & 16384) != 0 ? r2.textThree : 0, (r40 & 32768) != 0 ? r2.countError : 0, (r40 & 65536) != 0 ? r2.isBulbOneOnTarget : false, (r40 & 131072) != 0 ? r2.isBulbTwoOnTarget : false, (r40 & 262144) != 0 ? r2.isBulbThreeOnTarget : false, (r40 & 524288) != 0 ? r2.isFirstGame : false, (r40 & 1048576) != 0 ? r2.isWin : null, (r40 & 2097152) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void setHintThree() {
        SumContactsUiState value;
        SumContactsUiState copy;
        MutableStateFlow<? extends SumContactsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r40 & 1) != 0 ? r2.instructionsAndHints : null, (r40 & 2) != 0 ? r2.gameInstructionsItemList : null, (r40 & 4) != 0 ? r2.isInstructionsShow : false, (r40 & 8) != 0 ? r2.isHintShow : false, (r40 & 16) != 0 ? r2.isHandShow : false, (r40 & 32) != 0 ? r2.countHint : 3, (r40 & 64) != 0 ? r2.sumOne : 0, (r40 & 128) != 0 ? r2.sumTwo : 0, (r40 & 256) != 0 ? r2.sumThree : 0, (r40 & 512) != 0 ? r2.bulbTextOne : 0, (r40 & 1024) != 0 ? r2.bulbTextTwo : 0, (r40 & 2048) != 0 ? r2.bulbTextThree : 0, (r40 & 4096) != 0 ? r2.textOne : 0, (r40 & 8192) != 0 ? r2.textTwo : 0, (r40 & 16384) != 0 ? r2.textThree : 0, (r40 & 32768) != 0 ? r2.countError : 0, (r40 & 65536) != 0 ? r2.isBulbOneOnTarget : false, (r40 & 131072) != 0 ? r2.isBulbTwoOnTarget : false, (r40 & 262144) != 0 ? r2.isBulbThreeOnTarget : false, (r40 & 524288) != 0 ? r2.isFirstGame : false, (r40 & 1048576) != 0 ? r2.isWin : null, (r40 & 2097152) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void closeInstruction() {
        SumContactsUiState value;
        SumContactsUiState copy;
        MutableStateFlow<? extends SumContactsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r40 & 1) != 0 ? r2.instructionsAndHints : null, (r40 & 2) != 0 ? r2.gameInstructionsItemList : null, (r40 & 4) != 0 ? r2.isInstructionsShow : false, (r40 & 8) != 0 ? r2.isHintShow : getUiState().getValue().isFirstGame(), (r40 & 16) != 0 ? r2.isHandShow : false, (r40 & 32) != 0 ? r2.countHint : 0, (r40 & 64) != 0 ? r2.sumOne : 0, (r40 & 128) != 0 ? r2.sumTwo : 0, (r40 & 256) != 0 ? r2.sumThree : 0, (r40 & 512) != 0 ? r2.bulbTextOne : 0, (r40 & 1024) != 0 ? r2.bulbTextTwo : 0, (r40 & 2048) != 0 ? r2.bulbTextThree : 0, (r40 & 4096) != 0 ? r2.textOne : 0, (r40 & 8192) != 0 ? r2.textTwo : 0, (r40 & 16384) != 0 ? r2.textThree : 0, (r40 & 32768) != 0 ? r2.countError : 0, (r40 & 65536) != 0 ? r2.isBulbOneOnTarget : false, (r40 & 131072) != 0 ? r2.isBulbTwoOnTarget : false, (r40 & 262144) != 0 ? r2.isBulbThreeOnTarget : false, (r40 & 524288) != 0 ? r2.isFirstGame : false, (r40 & 1048576) != 0 ? r2.isWin : null, (r40 & 2097152) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void showHint() {
        SumContactsUiState value;
        SumContactsUiState copy;
        MutableStateFlow<? extends SumContactsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r40 & 1) != 0 ? r2.instructionsAndHints : null, (r40 & 2) != 0 ? r2.gameInstructionsItemList : null, (r40 & 4) != 0 ? r2.isInstructionsShow : false, (r40 & 8) != 0 ? r2.isHintShow : true, (r40 & 16) != 0 ? r2.isHandShow : false, (r40 & 32) != 0 ? r2.countHint : 0, (r40 & 64) != 0 ? r2.sumOne : 0, (r40 & 128) != 0 ? r2.sumTwo : 0, (r40 & 256) != 0 ? r2.sumThree : 0, (r40 & 512) != 0 ? r2.bulbTextOne : 0, (r40 & 1024) != 0 ? r2.bulbTextTwo : 0, (r40 & 2048) != 0 ? r2.bulbTextThree : 0, (r40 & 4096) != 0 ? r2.textOne : 0, (r40 & 8192) != 0 ? r2.textTwo : 0, (r40 & 16384) != 0 ? r2.textThree : 0, (r40 & 32768) != 0 ? r2.countError : 0, (r40 & 65536) != 0 ? r2.isBulbOneOnTarget : false, (r40 & 131072) != 0 ? r2.isBulbTwoOnTarget : false, (r40 & 262144) != 0 ? r2.isBulbThreeOnTarget : false, (r40 & 524288) != 0 ? r2.isFirstGame : false, (r40 & 1048576) != 0 ? r2.isWin : null, (r40 & 2097152) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void closeHint() {
        SumContactsUiState value;
        SumContactsUiState copy;
        MutableStateFlow<? extends SumContactsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r40 & 1) != 0 ? r2.instructionsAndHints : null, (r40 & 2) != 0 ? r2.gameInstructionsItemList : null, (r40 & 4) != 0 ? r2.isInstructionsShow : false, (r40 & 8) != 0 ? r2.isHintShow : false, (r40 & 16) != 0 ? r2.isHandShow : false, (r40 & 32) != 0 ? r2.countHint : 0, (r40 & 64) != 0 ? r2.sumOne : 0, (r40 & 128) != 0 ? r2.sumTwo : 0, (r40 & 256) != 0 ? r2.sumThree : 0, (r40 & 512) != 0 ? r2.bulbTextOne : 0, (r40 & 1024) != 0 ? r2.bulbTextTwo : 0, (r40 & 2048) != 0 ? r2.bulbTextThree : 0, (r40 & 4096) != 0 ? r2.textOne : 0, (r40 & 8192) != 0 ? r2.textTwo : 0, (r40 & 16384) != 0 ? r2.textThree : 0, (r40 & 32768) != 0 ? r2.countError : 0, (r40 & 65536) != 0 ? r2.isBulbOneOnTarget : false, (r40 & 131072) != 0 ? r2.isBulbTwoOnTarget : false, (r40 & 262144) != 0 ? r2.isBulbThreeOnTarget : false, (r40 & 524288) != 0 ? r2.isFirstGame : false, (r40 & 1048576) != 0 ? r2.isWin : null, (r40 & 2097152) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    private final void initPreferences() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new SumContactsViewModel$initPreferences$1(this, null), 1, null);
    }

    public final void randomNumbers() {
        SumContactsUiState value;
        SumContactsUiState copy;
        if (!get_uiState().getValue().isBlockingLoading()) {
            MutableStateFlow<? extends SumContactsUiState> mutableStateFlow = get_uiState();
            do {
                value = mutableStateFlow.getValue();
                copy = r3.copy((r40 & 1) != 0 ? r3.instructionsAndHints : null, (r40 & 2) != 0 ? r3.gameInstructionsItemList : null, (r40 & 4) != 0 ? r3.isInstructionsShow : false, (r40 & 8) != 0 ? r3.isHintShow : false, (r40 & 16) != 0 ? r3.isHandShow : false, (r40 & 32) != 0 ? r3.countHint : 0, (r40 & 64) != 0 ? r3.sumOne : 0, (r40 & 128) != 0 ? r3.sumTwo : 0, (r40 & 256) != 0 ? r3.sumThree : 0, (r40 & 512) != 0 ? r3.bulbTextOne : 0, (r40 & 1024) != 0 ? r3.bulbTextTwo : 0, (r40 & 2048) != 0 ? r3.bulbTextThree : 0, (r40 & 4096) != 0 ? r3.textOne : 0, (r40 & 8192) != 0 ? r3.textTwo : 0, (r40 & 16384) != 0 ? r3.textThree : 0, (r40 & 32768) != 0 ? r3.countError : 0, (r40 & 65536) != 0 ? r3.isBulbOneOnTarget : false, (r40 & 131072) != 0 ? r3.isBulbTwoOnTarget : false, (r40 & 262144) != 0 ? r3.isBulbThreeOnTarget : false, (r40 & 524288) != 0 ? r3.isFirstGame : false, (r40 & 1048576) != 0 ? r3.isWin : null, (r40 & 2097152) != 0 ? value.isBlockingLoading : true);
            } while (!mutableStateFlow.compareAndSet(value, copy));
        }
        ViewModelExtensionKt.launchOnDefault$default(this, null, new SumContactsViewModel$randomNumbers$2(this, null), 1, null);
    }
}
