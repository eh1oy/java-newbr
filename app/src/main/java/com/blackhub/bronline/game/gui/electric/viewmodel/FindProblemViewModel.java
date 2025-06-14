package com.blackhub.bronline.game.gui.electric.viewmodel;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.common.C;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.extension.ListExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.draganddrop.enums.CurrentTargetArea;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DragAndDropCallback;
import com.blackhub.bronline.game.gui.electric.state.FindProblemUiState;
import com.blackhub.bronline.game.gui.electric.utils.ElectricConstants;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: FindProblemViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001@B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020!J\u0006\u0010%\u001a\u00020!J\b\u0010&\u001a\u00020!H\u0003J\u0016\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020*J\b\u0010+\u001a\u00020!H\u0002J\u000e\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020.J\u0006\u0010/\u001a\u00020!J\u000e\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020*J\u0006\u00102\u001a\u00020!J\b\u00103\u001a\u00020!H\u0002J\u000e\u00104\u001a\u00020!2\u0006\u00105\u001a\u000206J\u0006\u00107\u001a\u00020!J\b\u00108\u001a\u00020!H\u0002J\u000e\u00109\u001a\u00020!2\u0006\u0010:\u001a\u00020#J\u000e\u0010;\u001a\u00020!2\u0006\u0010<\u001a\u00020\u0011J\u0006\u0010=\u001a\u00020!J\u0006\u0010>\u001a\u00020!J\u0006\u0010?\u001a\u00020!R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006A"}, d2 = {"Lcom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/electric/state/FindProblemUiState;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "stringResource", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "preferencesRepository", "Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;", "(Lcom/blackhub/bronline/game/core/resources/StringResource;Lcom/blackhub/bronline/game/common/LocalNotification;Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "fuseBusyList", "", "", "getFuseBusyList", "()Ljava/util/List;", "getLocalNotification", "()Lcom/blackhub/bronline/game/common/LocalNotification;", "randomOhmForPointList", "getRandomOhmForPointList", "randomOhmForTargetList", "getRandomOhmForTargetList", "getStringResource", "()Lcom/blackhub/bronline/game/core/resources/StringResource;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "changeMultimeterVisible", "", "visible", "", "closeHint", "closeInstruction", "createRandomOhm", "initArgs", "screenArgs", "levelCounter", "", "initPreferences", "isTargetOnArea", "dragAndDropCallback", "Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DragAndDropCallback;", "onDarkClick", "onFuseGrayClick", "number", "selectNextGame", "setClearStateAndCreateRandomList", "setFuseGrayInvisible", "currentTargetArea", "Lcom/blackhub/bronline/game/core/utils/draganddrop/enums/CurrentTargetArea;", "setHintEight", "setRandomOhmForTarget", "setWin", "isWin", "showErrorMessage", ThrowableDeserializer.PROP_NAME_MESSAGE, "showErrorMessageForBulb", "showErrorMessageForFuse", "showHint", "Companion", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFindProblemViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindProblemViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,526:1\n230#2,5:527\n230#2,5:532\n230#2,5:537\n230#2,5:542\n230#2,5:547\n230#2,5:552\n230#2,5:557\n230#2,5:562\n230#2,5:567\n*S KotlinDebug\n*F\n+ 1 FindProblemViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel\n*L\n336#1:527,5\n345#1:532,5\n354#1:537,5\n374#1:542,5\n383#1:547,5\n431#1:552,5\n440#1:557,5\n448#1:562,5\n488#1:567,5\n*E\n"})
/* loaded from: classes3.dex */
public final class FindProblemViewModel extends BaseViewModel<FindProblemUiState> implements ViewModelProvider.Factory {
    public static final int COUNT_RANDOM_MAX = 3;
    public static final long LOADER_MILLIS = 1000;
    public static final double MAX_RANDOM_OHM = 9.99d;
    public static final int NUMBER_COUNT = 4;

    @NotNull
    public static final String OHM_ZERO = "0.00";

    @NotNull
    public final MutableStateFlow<FindProblemUiState> _uiState;

    @NotNull
    public final List<String> fuseBusyList;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final PreferencesRepository preferencesRepository;

    @NotNull
    public final List<String> randomOhmForPointList;

    @NotNull
    public final List<String> randomOhmForTargetList;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<FindProblemUiState> uiState;
    public static final int $stable = 8;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Inject
    public FindProblemViewModel(@NotNull StringResource stringResource, @NotNull LocalNotification localNotification, @NotNull PreferencesRepository preferencesRepository) {
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.stringResource = stringResource;
        this.localNotification = localNotification;
        this.preferencesRepository = preferencesRepository;
        this._uiState = StateFlowKt.MutableStateFlow(new FindProblemUiState(null, null, null, false, false, false, 0, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, -1, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
        this.fuseBusyList = CollectionsKt__CollectionsKt.mutableListOf(ElectricConstants.FUSE_BUSY_ONE, ElectricConstants.FUSE_BUSY_TWO, ElectricConstants.FUSE_BUSY_THREE, ElectricConstants.FUSE_BUSY_FOUR);
        this.randomOhmForPointList = new ArrayList();
        this.randomOhmForTargetList = new ArrayList();
        setClearStateAndCreateRandomList();
        initPreferences();
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends FindProblemUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<FindProblemUiState> getUiState() {
        return this.uiState;
    }

    @NotNull
    public final List<String> getFuseBusyList() {
        return this.fuseBusyList;
    }

    @NotNull
    public final List<String> getRandomOhmForPointList() {
        return this.randomOhmForPointList;
    }

    @NotNull
    public final List<String> getRandomOhmForTargetList() {
        return this.randomOhmForTargetList;
    }

    public final void initArgs(@NotNull String screenArgs, int levelCounter) {
        Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new FindProblemViewModel$initArgs$1(screenArgs, this, levelCounter, null), 1, null);
    }

    public final void setFuseGrayInvisible(@NotNull CurrentTargetArea currentTargetArea) {
        Intrinsics.checkNotNullParameter(currentTargetArea, "currentTargetArea");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new FindProblemViewModel$setFuseGrayInvisible$1(currentTargetArea, this, null), 1, null);
    }

    public final void isTargetOnArea(@NotNull DragAndDropCallback dragAndDropCallback) {
        Intrinsics.checkNotNullParameter(dragAndDropCallback, "dragAndDropCallback");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new FindProblemViewModel$isTargetOnArea$1(dragAndDropCallback, this, null), 1, null);
    }

    public final void changeMultimeterVisible(boolean visible) {
        FindProblemUiState value;
        FindProblemUiState copy;
        MutableStateFlow<? extends FindProblemUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r50 & 1) != 0 ? r2.screenArgs : null, (r50 & 2) != 0 ? r2.instructionsAndHints : null, (r50 & 4) != 0 ? r2.gameInstructionsItemList : null, (r50 & 8) != 0 ? r2.isInstructionsShow : false, (r50 & 16) != 0 ? r2.isHintShow : false, (r50 & 32) != 0 ? r2.isHandShow : false, (r50 & 64) != 0 ? r2.countHint : 2, (r50 & 128) != 0 ? r2.textOhmOnTable : null, (r50 & 256) != 0 ? r2.textOhmOnMultimeter : null, (r50 & 512) != 0 ? r2.probeBlackOnTarget : false, (r50 & 1024) != 0 ? r2.probeRedOnTarget : false, (r50 & 2048) != 0 ? r2.isMultimeterVisible : visible, (r50 & 4096) != 0 ? r2.isFuseRedOneWithProbeVisible : false, (r50 & 8192) != 0 ? r2.isFuseRedTwoWithProbeVisible : false, (r50 & 16384) != 0 ? r2.isFuseRedThreeWithProbeVisible : false, (r50 & 32768) != 0 ? r2.isFuseRedFourWithProbeVisible : false, (r50 & 65536) != 0 ? r2.isFuseGrayOneVisible : false, (r50 & 131072) != 0 ? r2.isFuseGrayTwoVisible : false, (r50 & 262144) != 0 ? r2.isFuseGrayThreeVisible : false, (r50 & 524288) != 0 ? r2.isFuseGrayFourVisible : false, (r50 & 1048576) != 0 ? r2.isFuseFillOne : false, (r50 & 2097152) != 0 ? r2.isFuseFillTwo : false, (r50 & 4194304) != 0 ? r2.isFuseFillThree : false, (r50 & 8388608) != 0 ? r2.isFuseFillFour : false, (r50 & 16777216) != 0 ? r2.isElementTwoOneHasListener : false, (r50 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.isElementTwoTwoHasListener : false, (r50 & 67108864) != 0 ? r2.isElementTwoThreeHasListener : false, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isElementTwoFourHasListener : false, (r50 & 268435456) != 0 ? r2.isFirstGame : false, (r50 & 536870912) != 0 ? r2.isNextGame : false, (r50 & 1073741824) != 0 ? r2.isWin : false, (r50 & Integer.MIN_VALUE) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void setHintEight() {
        FindProblemUiState value;
        FindProblemUiState copy;
        MutableStateFlow<? extends FindProblemUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r50 & 1) != 0 ? r2.screenArgs : null, (r50 & 2) != 0 ? r2.instructionsAndHints : null, (r50 & 4) != 0 ? r2.gameInstructionsItemList : null, (r50 & 8) != 0 ? r2.isInstructionsShow : false, (r50 & 16) != 0 ? r2.isHintShow : false, (r50 & 32) != 0 ? r2.isHandShow : false, (r50 & 64) != 0 ? r2.countHint : 8, (r50 & 128) != 0 ? r2.textOhmOnTable : null, (r50 & 256) != 0 ? r2.textOhmOnMultimeter : null, (r50 & 512) != 0 ? r2.probeBlackOnTarget : false, (r50 & 1024) != 0 ? r2.probeRedOnTarget : false, (r50 & 2048) != 0 ? r2.isMultimeterVisible : false, (r50 & 4096) != 0 ? r2.isFuseRedOneWithProbeVisible : false, (r50 & 8192) != 0 ? r2.isFuseRedTwoWithProbeVisible : false, (r50 & 16384) != 0 ? r2.isFuseRedThreeWithProbeVisible : false, (r50 & 32768) != 0 ? r2.isFuseRedFourWithProbeVisible : false, (r50 & 65536) != 0 ? r2.isFuseGrayOneVisible : false, (r50 & 131072) != 0 ? r2.isFuseGrayTwoVisible : false, (r50 & 262144) != 0 ? r2.isFuseGrayThreeVisible : false, (r50 & 524288) != 0 ? r2.isFuseGrayFourVisible : false, (r50 & 1048576) != 0 ? r2.isFuseFillOne : false, (r50 & 2097152) != 0 ? r2.isFuseFillTwo : false, (r50 & 4194304) != 0 ? r2.isFuseFillThree : false, (r50 & 8388608) != 0 ? r2.isFuseFillFour : false, (r50 & 16777216) != 0 ? r2.isElementTwoOneHasListener : false, (r50 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.isElementTwoTwoHasListener : false, (r50 & 67108864) != 0 ? r2.isElementTwoThreeHasListener : false, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isElementTwoFourHasListener : false, (r50 & 268435456) != 0 ? r2.isFirstGame : false, (r50 & 536870912) != 0 ? r2.isNextGame : false, (r50 & 1073741824) != 0 ? r2.isWin : false, (r50 & Integer.MIN_VALUE) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void selectNextGame() {
        FindProblemUiState value;
        FindProblemUiState copy;
        if (get_uiState().getValue().isMultimeterVisible()) {
            MutableStateFlow<? extends FindProblemUiState> mutableStateFlow = get_uiState();
            do {
                value = mutableStateFlow.getValue();
                copy = r3.copy((r50 & 1) != 0 ? r3.screenArgs : null, (r50 & 2) != 0 ? r3.instructionsAndHints : null, (r50 & 4) != 0 ? r3.gameInstructionsItemList : null, (r50 & 8) != 0 ? r3.isInstructionsShow : false, (r50 & 16) != 0 ? r3.isHintShow : false, (r50 & 32) != 0 ? r3.isHandShow : false, (r50 & 64) != 0 ? r3.countHint : 0, (r50 & 128) != 0 ? r3.textOhmOnTable : null, (r50 & 256) != 0 ? r3.textOhmOnMultimeter : null, (r50 & 512) != 0 ? r3.probeBlackOnTarget : false, (r50 & 1024) != 0 ? r3.probeRedOnTarget : false, (r50 & 2048) != 0 ? r3.isMultimeterVisible : false, (r50 & 4096) != 0 ? r3.isFuseRedOneWithProbeVisible : false, (r50 & 8192) != 0 ? r3.isFuseRedTwoWithProbeVisible : false, (r50 & 16384) != 0 ? r3.isFuseRedThreeWithProbeVisible : false, (r50 & 32768) != 0 ? r3.isFuseRedFourWithProbeVisible : false, (r50 & 65536) != 0 ? r3.isFuseGrayOneVisible : false, (r50 & 131072) != 0 ? r3.isFuseGrayTwoVisible : false, (r50 & 262144) != 0 ? r3.isFuseGrayThreeVisible : false, (r50 & 524288) != 0 ? r3.isFuseGrayFourVisible : false, (r50 & 1048576) != 0 ? r3.isFuseFillOne : false, (r50 & 2097152) != 0 ? r3.isFuseFillTwo : false, (r50 & 4194304) != 0 ? r3.isFuseFillThree : false, (r50 & 8388608) != 0 ? r3.isFuseFillFour : false, (r50 & 16777216) != 0 ? r3.isElementTwoOneHasListener : false, (r50 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r3.isElementTwoTwoHasListener : false, (r50 & 67108864) != 0 ? r3.isElementTwoThreeHasListener : false, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.isElementTwoFourHasListener : false, (r50 & 268435456) != 0 ? r3.isFirstGame : false, (r50 & 536870912) != 0 ? r3.isNextGame : false, (r50 & 1073741824) != 0 ? r3.isWin : false, (r50 & Integer.MIN_VALUE) != 0 ? value.isBlockingLoading : true);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            ViewModelExtensionKt.launchOnDefault$default(this, null, new FindProblemViewModel$selectNextGame$2(this, null), 1, null);
            return;
        }
        showErrorMessage(getStringResource().findProblemMultimeterIsNotVisible());
    }

    public final void setWin(boolean isWin) {
        FindProblemUiState value;
        FindProblemUiState copy;
        MutableStateFlow<? extends FindProblemUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r50 & 1) != 0 ? r2.screenArgs : null, (r50 & 2) != 0 ? r2.instructionsAndHints : null, (r50 & 4) != 0 ? r2.gameInstructionsItemList : null, (r50 & 8) != 0 ? r2.isInstructionsShow : false, (r50 & 16) != 0 ? r2.isHintShow : false, (r50 & 32) != 0 ? r2.isHandShow : false, (r50 & 64) != 0 ? r2.countHint : 0, (r50 & 128) != 0 ? r2.textOhmOnTable : null, (r50 & 256) != 0 ? r2.textOhmOnMultimeter : null, (r50 & 512) != 0 ? r2.probeBlackOnTarget : false, (r50 & 1024) != 0 ? r2.probeRedOnTarget : false, (r50 & 2048) != 0 ? r2.isMultimeterVisible : false, (r50 & 4096) != 0 ? r2.isFuseRedOneWithProbeVisible : false, (r50 & 8192) != 0 ? r2.isFuseRedTwoWithProbeVisible : false, (r50 & 16384) != 0 ? r2.isFuseRedThreeWithProbeVisible : false, (r50 & 32768) != 0 ? r2.isFuseRedFourWithProbeVisible : false, (r50 & 65536) != 0 ? r2.isFuseGrayOneVisible : false, (r50 & 131072) != 0 ? r2.isFuseGrayTwoVisible : false, (r50 & 262144) != 0 ? r2.isFuseGrayThreeVisible : false, (r50 & 524288) != 0 ? r2.isFuseGrayFourVisible : false, (r50 & 1048576) != 0 ? r2.isFuseFillOne : false, (r50 & 2097152) != 0 ? r2.isFuseFillTwo : false, (r50 & 4194304) != 0 ? r2.isFuseFillThree : false, (r50 & 8388608) != 0 ? r2.isFuseFillFour : false, (r50 & 16777216) != 0 ? r2.isElementTwoOneHasListener : false, (r50 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.isElementTwoTwoHasListener : false, (r50 & 67108864) != 0 ? r2.isElementTwoThreeHasListener : false, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isElementTwoFourHasListener : false, (r50 & 268435456) != 0 ? r2.isFirstGame : false, (r50 & 536870912) != 0 ? r2.isNextGame : false, (r50 & 1073741824) != 0 ? r2.isWin : isWin, (r50 & Integer.MIN_VALUE) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onDarkClick() {
        FindProblemUiState value;
        FindProblemUiState copy;
        if (get_uiState().getValue().getCountHint() == 4) {
            MutableStateFlow<? extends FindProblemUiState> mutableStateFlow = get_uiState();
            do {
                value = mutableStateFlow.getValue();
                copy = r2.copy((r50 & 1) != 0 ? r2.screenArgs : null, (r50 & 2) != 0 ? r2.instructionsAndHints : null, (r50 & 4) != 0 ? r2.gameInstructionsItemList : null, (r50 & 8) != 0 ? r2.isInstructionsShow : false, (r50 & 16) != 0 ? r2.isHintShow : false, (r50 & 32) != 0 ? r2.isHandShow : false, (r50 & 64) != 0 ? r2.countHint : 5, (r50 & 128) != 0 ? r2.textOhmOnTable : null, (r50 & 256) != 0 ? r2.textOhmOnMultimeter : null, (r50 & 512) != 0 ? r2.probeBlackOnTarget : false, (r50 & 1024) != 0 ? r2.probeRedOnTarget : false, (r50 & 2048) != 0 ? r2.isMultimeterVisible : false, (r50 & 4096) != 0 ? r2.isFuseRedOneWithProbeVisible : false, (r50 & 8192) != 0 ? r2.isFuseRedTwoWithProbeVisible : false, (r50 & 16384) != 0 ? r2.isFuseRedThreeWithProbeVisible : false, (r50 & 32768) != 0 ? r2.isFuseRedFourWithProbeVisible : false, (r50 & 65536) != 0 ? r2.isFuseGrayOneVisible : false, (r50 & 131072) != 0 ? r2.isFuseGrayTwoVisible : false, (r50 & 262144) != 0 ? r2.isFuseGrayThreeVisible : false, (r50 & 524288) != 0 ? r2.isFuseGrayFourVisible : false, (r50 & 1048576) != 0 ? r2.isFuseFillOne : false, (r50 & 2097152) != 0 ? r2.isFuseFillTwo : false, (r50 & 4194304) != 0 ? r2.isFuseFillThree : false, (r50 & 8388608) != 0 ? r2.isFuseFillFour : false, (r50 & 16777216) != 0 ? r2.isElementTwoOneHasListener : false, (r50 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.isElementTwoTwoHasListener : false, (r50 & 67108864) != 0 ? r2.isElementTwoThreeHasListener : false, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isElementTwoFourHasListener : false, (r50 & 268435456) != 0 ? r2.isFirstGame : false, (r50 & 536870912) != 0 ? r2.isNextGame : false, (r50 & 1073741824) != 0 ? r2.isWin : false, (r50 & Integer.MIN_VALUE) != 0 ? value.isBlockingLoading : false);
            } while (!mutableStateFlow.compareAndSet(value, copy));
        }
    }

    public final void onFuseGrayClick(int number) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new FindProblemViewModel$onFuseGrayClick$1(number, this, null), 1, null);
    }

    public final void closeInstruction() {
        FindProblemUiState value;
        FindProblemUiState copy;
        MutableStateFlow<? extends FindProblemUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r50 & 1) != 0 ? r2.screenArgs : null, (r50 & 2) != 0 ? r2.instructionsAndHints : null, (r50 & 4) != 0 ? r2.gameInstructionsItemList : null, (r50 & 8) != 0 ? r2.isInstructionsShow : false, (r50 & 16) != 0 ? r2.isHintShow : getUiState().getValue().isFirstGame(), (r50 & 32) != 0 ? r2.isHandShow : false, (r50 & 64) != 0 ? r2.countHint : 0, (r50 & 128) != 0 ? r2.textOhmOnTable : null, (r50 & 256) != 0 ? r2.textOhmOnMultimeter : null, (r50 & 512) != 0 ? r2.probeBlackOnTarget : false, (r50 & 1024) != 0 ? r2.probeRedOnTarget : false, (r50 & 2048) != 0 ? r2.isMultimeterVisible : false, (r50 & 4096) != 0 ? r2.isFuseRedOneWithProbeVisible : false, (r50 & 8192) != 0 ? r2.isFuseRedTwoWithProbeVisible : false, (r50 & 16384) != 0 ? r2.isFuseRedThreeWithProbeVisible : false, (r50 & 32768) != 0 ? r2.isFuseRedFourWithProbeVisible : false, (r50 & 65536) != 0 ? r2.isFuseGrayOneVisible : false, (r50 & 131072) != 0 ? r2.isFuseGrayTwoVisible : false, (r50 & 262144) != 0 ? r2.isFuseGrayThreeVisible : false, (r50 & 524288) != 0 ? r2.isFuseGrayFourVisible : false, (r50 & 1048576) != 0 ? r2.isFuseFillOne : false, (r50 & 2097152) != 0 ? r2.isFuseFillTwo : false, (r50 & 4194304) != 0 ? r2.isFuseFillThree : false, (r50 & 8388608) != 0 ? r2.isFuseFillFour : false, (r50 & 16777216) != 0 ? r2.isElementTwoOneHasListener : false, (r50 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.isElementTwoTwoHasListener : false, (r50 & 67108864) != 0 ? r2.isElementTwoThreeHasListener : false, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isElementTwoFourHasListener : false, (r50 & 268435456) != 0 ? r2.isFirstGame : false, (r50 & 536870912) != 0 ? r2.isNextGame : false, (r50 & 1073741824) != 0 ? r2.isWin : false, (r50 & Integer.MIN_VALUE) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void showHint() {
        FindProblemUiState value;
        FindProblemUiState copy;
        MutableStateFlow<? extends FindProblemUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r50 & 1) != 0 ? r2.screenArgs : null, (r50 & 2) != 0 ? r2.instructionsAndHints : null, (r50 & 4) != 0 ? r2.gameInstructionsItemList : null, (r50 & 8) != 0 ? r2.isInstructionsShow : false, (r50 & 16) != 0 ? r2.isHintShow : true, (r50 & 32) != 0 ? r2.isHandShow : false, (r50 & 64) != 0 ? r2.countHint : 0, (r50 & 128) != 0 ? r2.textOhmOnTable : null, (r50 & 256) != 0 ? r2.textOhmOnMultimeter : null, (r50 & 512) != 0 ? r2.probeBlackOnTarget : false, (r50 & 1024) != 0 ? r2.probeRedOnTarget : false, (r50 & 2048) != 0 ? r2.isMultimeterVisible : false, (r50 & 4096) != 0 ? r2.isFuseRedOneWithProbeVisible : false, (r50 & 8192) != 0 ? r2.isFuseRedTwoWithProbeVisible : false, (r50 & 16384) != 0 ? r2.isFuseRedThreeWithProbeVisible : false, (r50 & 32768) != 0 ? r2.isFuseRedFourWithProbeVisible : false, (r50 & 65536) != 0 ? r2.isFuseGrayOneVisible : false, (r50 & 131072) != 0 ? r2.isFuseGrayTwoVisible : false, (r50 & 262144) != 0 ? r2.isFuseGrayThreeVisible : false, (r50 & 524288) != 0 ? r2.isFuseGrayFourVisible : false, (r50 & 1048576) != 0 ? r2.isFuseFillOne : false, (r50 & 2097152) != 0 ? r2.isFuseFillTwo : false, (r50 & 4194304) != 0 ? r2.isFuseFillThree : false, (r50 & 8388608) != 0 ? r2.isFuseFillFour : false, (r50 & 16777216) != 0 ? r2.isElementTwoOneHasListener : false, (r50 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.isElementTwoTwoHasListener : false, (r50 & 67108864) != 0 ? r2.isElementTwoThreeHasListener : false, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isElementTwoFourHasListener : false, (r50 & 268435456) != 0 ? r2.isFirstGame : false, (r50 & 536870912) != 0 ? r2.isNextGame : false, (r50 & 1073741824) != 0 ? r2.isWin : false, (r50 & Integer.MIN_VALUE) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void closeHint() {
        FindProblemUiState value;
        FindProblemUiState copy;
        MutableStateFlow<? extends FindProblemUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r50 & 1) != 0 ? r2.screenArgs : null, (r50 & 2) != 0 ? r2.instructionsAndHints : null, (r50 & 4) != 0 ? r2.gameInstructionsItemList : null, (r50 & 8) != 0 ? r2.isInstructionsShow : false, (r50 & 16) != 0 ? r2.isHintShow : false, (r50 & 32) != 0 ? r2.isHandShow : false, (r50 & 64) != 0 ? r2.countHint : 0, (r50 & 128) != 0 ? r2.textOhmOnTable : null, (r50 & 256) != 0 ? r2.textOhmOnMultimeter : null, (r50 & 512) != 0 ? r2.probeBlackOnTarget : false, (r50 & 1024) != 0 ? r2.probeRedOnTarget : false, (r50 & 2048) != 0 ? r2.isMultimeterVisible : false, (r50 & 4096) != 0 ? r2.isFuseRedOneWithProbeVisible : false, (r50 & 8192) != 0 ? r2.isFuseRedTwoWithProbeVisible : false, (r50 & 16384) != 0 ? r2.isFuseRedThreeWithProbeVisible : false, (r50 & 32768) != 0 ? r2.isFuseRedFourWithProbeVisible : false, (r50 & 65536) != 0 ? r2.isFuseGrayOneVisible : false, (r50 & 131072) != 0 ? r2.isFuseGrayTwoVisible : false, (r50 & 262144) != 0 ? r2.isFuseGrayThreeVisible : false, (r50 & 524288) != 0 ? r2.isFuseGrayFourVisible : false, (r50 & 1048576) != 0 ? r2.isFuseFillOne : false, (r50 & 2097152) != 0 ? r2.isFuseFillTwo : false, (r50 & 4194304) != 0 ? r2.isFuseFillThree : false, (r50 & 8388608) != 0 ? r2.isFuseFillFour : false, (r50 & 16777216) != 0 ? r2.isElementTwoOneHasListener : false, (r50 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.isElementTwoTwoHasListener : false, (r50 & 67108864) != 0 ? r2.isElementTwoThreeHasListener : false, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isElementTwoFourHasListener : false, (r50 & 268435456) != 0 ? r2.isFirstGame : false, (r50 & 536870912) != 0 ? r2.isNextGame : false, (r50 & 1073741824) != 0 ? r2.isWin : false, (r50 & Integer.MIN_VALUE) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void showErrorMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        getLocalNotification().showErrorNotification(message);
    }

    public final void showErrorMessageForBulb() {
        showErrorMessage(getStringResource().findProblemEarly());
    }

    public final void showErrorMessageForFuse() {
        showErrorMessage(getStringResource().findProblemFuseRanOut());
    }

    private final void initPreferences() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new FindProblemViewModel$initPreferences$1(this, null), 1, null);
    }

    public final void setClearStateAndCreateRandomList() {
        FindProblemUiState value;
        FindProblemUiState copy;
        MutableStateFlow<? extends FindProblemUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r50 & 1) != 0 ? r3.screenArgs : null, (r50 & 2) != 0 ? r3.instructionsAndHints : null, (r50 & 4) != 0 ? r3.gameInstructionsItemList : null, (r50 & 8) != 0 ? r3.isInstructionsShow : false, (r50 & 16) != 0 ? r3.isHintShow : false, (r50 & 32) != 0 ? r3.isHandShow : false, (r50 & 64) != 0 ? r3.countHint : 0, (r50 & 128) != 0 ? r3.textOhmOnTable : null, (r50 & 256) != 0 ? r3.textOhmOnMultimeter : null, (r50 & 512) != 0 ? r3.probeBlackOnTarget : false, (r50 & 1024) != 0 ? r3.probeRedOnTarget : false, (r50 & 2048) != 0 ? r3.isMultimeterVisible : false, (r50 & 4096) != 0 ? r3.isFuseRedOneWithProbeVisible : false, (r50 & 8192) != 0 ? r3.isFuseRedTwoWithProbeVisible : false, (r50 & 16384) != 0 ? r3.isFuseRedThreeWithProbeVisible : false, (r50 & 32768) != 0 ? r3.isFuseRedFourWithProbeVisible : false, (r50 & 65536) != 0 ? r3.isFuseGrayOneVisible : false, (r50 & 131072) != 0 ? r3.isFuseGrayTwoVisible : false, (r50 & 262144) != 0 ? r3.isFuseGrayThreeVisible : false, (r50 & 524288) != 0 ? r3.isFuseGrayFourVisible : false, (r50 & 1048576) != 0 ? r3.isFuseFillOne : false, (r50 & 2097152) != 0 ? r3.isFuseFillTwo : false, (r50 & 4194304) != 0 ? r3.isFuseFillThree : false, (r50 & 8388608) != 0 ? r3.isFuseFillFour : false, (r50 & 16777216) != 0 ? r3.isElementTwoOneHasListener : false, (r50 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r3.isElementTwoTwoHasListener : false, (r50 & 67108864) != 0 ? r3.isElementTwoThreeHasListener : false, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.isElementTwoFourHasListener : false, (r50 & 268435456) != 0 ? r3.isFirstGame : false, (r50 & 536870912) != 0 ? r3.isNextGame : false, (r50 & 1073741824) != 0 ? r3.isWin : false, (r50 & Integer.MIN_VALUE) != 0 ? value.isBlockingLoading : true);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        ViewModelExtensionKt.launchOnDefault$default(this, null, new FindProblemViewModel$setClearStateAndCreateRandomList$2(this, null), 1, null);
    }

    @SuppressLint({"DefaultLocale"})
    public final void createRandomOhm() {
        for (int i = 0; i < 4; i++) {
            double nextDouble = Random.INSTANCE.nextDouble(0.0d, 9.99d);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(nextDouble)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            this.randomOhmForPointList.add(format);
        }
        if (ListExtensionKt.isHasDuplicates(this.randomOhmForPointList)) {
            this.randomOhmForPointList.clear();
            createRandomOhm();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setRandomOhmForTarget() {
        int random = RangesKt___RangesKt.random(new IntRange(1, 3), Random.INSTANCE);
        List<String> list = this.randomOhmForTargetList;
        list.add(CollectionsKt___CollectionsKt.first((List) this.randomOhmForPointList));
        List shuffled = CollectionsKt__CollectionsJVMKt.shuffled(CollectionsKt___CollectionsKt.drop(this.randomOhmForPointList, 1));
        if (random >= 2) {
            list.addAll(CollectionsKt___CollectionsKt.take(shuffled, random - 1));
        }
    }
}
