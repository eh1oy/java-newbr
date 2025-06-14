package com.blackhub.bronline.game.gui.gasmangame.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.gui.gasmangame.network.GasmanActionsWithJson;
import com.blackhub.bronline.game.gui.gasmangame.uistate.GasmanParentUIState;
import com.blackhub.bronline.game.gui.gasmangame.uistate.GasmanSizesItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GasmanParentViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u000e\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/blackhub/bronline/game/gui/gasmangame/viewmodel/GasmanParentViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/gasmangame/uistate/GasmanParentUIState;", "actionsWithJson", "Lcom/blackhub/bronline/game/gui/gasmangame/network/GasmanActionsWithJson;", "(Lcom/blackhub/bronline/game/gui/gasmangame/network/GasmanActionsWithJson;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "calculateGames", "", "gasAnimated", "sendButtonExitPressed", "sendGameEnded", "setCurrentFragmentNumber", "fragmentNumber", "", "setLoadingFragmentEnded", "value", "", "setNeedToShowDialog", "jsonObj", "Lorg/json/JSONObject;", "setResultOfGames", "setTubesSizes", "width", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGasmanParentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GasmanParentViewModel.kt\ncom/blackhub/bronline/game/gui/gasmangame/viewmodel/GasmanParentViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,107:1\n230#2,5:108\n230#2,5:113\n230#2,5:118\n230#2,5:123\n230#2,5:128\n230#2,5:133\n*S KotlinDebug\n*F\n+ 1 GasmanParentViewModel.kt\ncom/blackhub/bronline/game/gui/gasmangame/viewmodel/GasmanParentViewModel\n*L\n29#1:108,5\n37#1:113,5\n45#1:118,5\n53#1:123,5\n68#1:128,5\n76#1:133,5\n*E\n"})
/* loaded from: classes3.dex */
public final class GasmanParentViewModel extends BaseViewModel<GasmanParentUIState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<GasmanParentUIState> _uiState;

    @NotNull
    public final GasmanActionsWithJson actionsWithJson;

    @Inject
    public GasmanParentViewModel(@NotNull GasmanActionsWithJson actionsWithJson) {
        Intrinsics.checkNotNullParameter(actionsWithJson, "actionsWithJson");
        this.actionsWithJson = actionsWithJson;
        this._uiState = StateFlowKt.MutableStateFlow(new GasmanParentUIState(false, 0, null, null, false, 0, null, 127, null));
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends GasmanParentUIState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<GasmanParentUIState> getUiState() {
        return FlowKt.asStateFlow(get_uiState());
    }

    public final void setTubesSizes(int width) {
        MutableStateFlow<? extends GasmanParentUIState> mutableStateFlow = get_uiState();
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), GasmanParentUIState.copy$default(get_uiState().getValue(), false, 0, null, null, false, 0, new GasmanSizesItem(width, 0, 0, 0, 0, 0, 0, 126, null), 63, null))) {
        }
    }

    public final void setCurrentFragmentNumber(int fragmentNumber) {
        MutableStateFlow<? extends GasmanParentUIState> mutableStateFlow = get_uiState();
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), GasmanParentUIState.copy$default(get_uiState().getValue(), false, 0, null, null, false, fragmentNumber, null, 95, null))) {
        }
    }

    public final void setLoadingFragmentEnded(boolean value) {
        MutableStateFlow<? extends GasmanParentUIState> mutableStateFlow = get_uiState();
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), GasmanParentUIState.copy$default(get_uiState().getValue(), value, 0, null, null, false, 0, null, 126, null))) {
        }
    }

    public final void calculateGames() {
        MutableStateFlow<? extends GasmanParentUIState> mutableStateFlow = get_uiState();
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), GasmanParentUIState.copy$default(get_uiState().getValue(), false, 0, SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.take(SequencesKt___SequencesKt.distinct(SequencesKt__SequencesKt.generateSequence(new Function0<Integer>() { // from class: com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanParentViewModel$calculateGames$1$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Integer invoke() {
                return Integer.valueOf(Random.INSTANCE.nextInt(1, 11));
            }
        })), 3)), null, false, 0, null, 122, null))) {
        }
    }

    public final void setResultOfGames(@Nullable JSONObject jsonObj) {
        GasmanParentUIState value;
        GasmanParentUIState value2;
        List<Integer> emptyList;
        JSONArray optJSONArray = jsonObj != null ? jsonObj.optJSONArray("p") : null;
        MutableStateFlow<? extends GasmanParentUIState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            value2 = get_uiState().getValue();
            if (optJSONArray == null || (emptyList = JsonArrayExtensionKt.toMutableIntList(optJSONArray)) == null) {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
            }
        } while (!mutableStateFlow.compareAndSet(value, GasmanParentUIState.copy$default(value2, false, 0, null, emptyList, false, 0, null, 119, null)));
    }

    public final void setNeedToShowDialog(@Nullable JSONObject jsonObj) {
        MutableStateFlow<? extends GasmanParentUIState> mutableStateFlow = get_uiState();
        do {
        } while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), GasmanParentUIState.copy$default(get_uiState().getValue(), false, 0, null, null, jsonObj != null && jsonObj.optInt("i") == 1, 0, null, 111, null)));
    }

    public final void gasAnimated() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GasmanParentViewModel$gasAnimated$1(this, null), 3, null);
    }

    public final void sendGameEnded() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GasmanParentViewModel$sendGameEnded$1(this, null), 3, null);
    }

    public final void sendButtonExitPressed() {
        this.actionsWithJson.sendExit(2);
    }
}
