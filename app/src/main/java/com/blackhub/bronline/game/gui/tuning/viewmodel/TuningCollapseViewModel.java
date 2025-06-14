package com.blackhub.bronline.game.gui.tuning.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.gui.tuning.CostCalculation;
import com.blackhub.bronline.game.gui.tuning.network.TuningActionWithJSON;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TuningCollapseViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\nJ\u0006\u0010.\u001a\u00020,J\u0006\u0010/\u001a\u00020,J\u000e\u00100\u001a\u00020,2\u0006\u00101\u001a\u000202J\u0016\u00103\u001a\u00020,2\u0006\u00104\u001a\u00020\n2\u0006\u0010-\u001a\u00020\nJ\u000e\u00105\u001a\u00020,2\u0006\u00101\u001a\u000202J\u0010\u00106\u001a\u00020,2\u0006\u00107\u001a\u00020\nH\u0002J\u0010\u00108\u001a\u00020,2\u0006\u00107\u001a\u00020\nH\u0002J\u0010\u00109\u001a\u00020,2\u0006\u00107\u001a\u00020\nH\u0002J\u0010\u0010:\u001a\u00020,2\u0006\u00107\u001a\u00020\nH\u0002J\u0010\u0010;\u001a\u00020,2\u0006\u00107\u001a\u00020\nH\u0002J\u0010\u0010<\u001a\u00020,2\u0006\u00107\u001a\u00020\nH\u0002J\u000e\u0010=\u001a\u00020,2\u0006\u00107\u001a\u00020\nJ\u0010\u0010>\u001a\u00020,2\u0006\u00107\u001a\u00020\nH\u0002J\u0010\u0010?\u001a\u00020,2\u0006\u00107\u001a\u00020\nH\u0002J\u0010\u0010@\u001a\u00020,2\u0006\u00107\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u0016¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u0016¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\u0016¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\u0016¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\u0016¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018¨\u0006A"}, d2 = {"Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningCollapseViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "actionWithJson", "Lcom/blackhub/bronline/game/gui/tuning/network/TuningActionWithJSON;", "costCalculation", "Lcom/blackhub/bronline/game/gui/tuning/CostCalculation;", "(Lcom/blackhub/bronline/game/gui/tuning/network/TuningActionWithJSON;Lcom/blackhub/bronline/game/gui/tuning/CostCalculation;)V", "mutableCollapseBack", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "mutableCollapseFront", "mutableCurrentCost", "mutableDepartureBackWheels", "mutableDepartureFrontWheels", "mutableFullClearance", "mutableGosCost", "mutableIndividualClearance", "mutableRadiusWheels", "mutableWidthFrontWheels", "mutableWithBackWheels", "newCollapseBack", "Lkotlinx/coroutines/flow/StateFlow;", "getNewCollapseBack", "()Lkotlinx/coroutines/flow/StateFlow;", "newCollapseFront", "getNewCollapseFront", "newCurrentCost", "getNewCurrentCost", "newDepartureBackWheels", "getNewDepartureBackWheels", "newDepartureFrontWheels", "getNewDepartureFrontWheels", "newFullClearance", "getNewFullClearance", "newIndividualClearance", "getNewIndividualClearance", "newRadiusWheels", "getNewRadiusWheels", "newWidthFrontWheels", "getNewWidthFrontWheels", "newWithBackWheels", "getNewWithBackWheels", "calculateTheCost", "", "currentSelector", "getCollapse", "getCollapseAfterReset", "initCollapse", "jsonObject", "Lorg/json/JSONObject;", "sendBuyCollapse", "valueOfCollapse", "setGosCost", "updateCollapseBack", "newValue", "updateCollapseFront", "updateDepartureBackWheels", "updateDepartureFrontWheels", "updateFullClearance", "updateIndividualClearance", "updateParamsForPreview", "updateRadiusWheels", "updateWidthFrontWheels", "updateWithBackWheels", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TuningCollapseViewModel extends ViewModel implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final TuningActionWithJSON actionWithJson;

    @NotNull
    public final CostCalculation costCalculation;

    @NotNull
    public final MutableStateFlow<Integer> mutableCollapseBack;

    @NotNull
    public final MutableStateFlow<Integer> mutableCollapseFront;

    @NotNull
    public final MutableStateFlow<Integer> mutableCurrentCost;

    @NotNull
    public final MutableStateFlow<Integer> mutableDepartureBackWheels;

    @NotNull
    public final MutableStateFlow<Integer> mutableDepartureFrontWheels;

    @NotNull
    public final MutableStateFlow<Integer> mutableFullClearance;

    @NotNull
    public final MutableStateFlow<Integer> mutableGosCost;

    @NotNull
    public final MutableStateFlow<Integer> mutableIndividualClearance;

    @NotNull
    public final MutableStateFlow<Integer> mutableRadiusWheels;

    @NotNull
    public final MutableStateFlow<Integer> mutableWidthFrontWheels;

    @NotNull
    public final MutableStateFlow<Integer> mutableWithBackWheels;

    @NotNull
    public final StateFlow<Integer> newCollapseBack;

    @NotNull
    public final StateFlow<Integer> newCollapseFront;

    @NotNull
    public final StateFlow<Integer> newCurrentCost;

    @NotNull
    public final StateFlow<Integer> newDepartureBackWheels;

    @NotNull
    public final StateFlow<Integer> newDepartureFrontWheels;

    @NotNull
    public final StateFlow<Integer> newFullClearance;

    @NotNull
    public final StateFlow<Integer> newIndividualClearance;

    @NotNull
    public final StateFlow<Integer> newRadiusWheels;

    @NotNull
    public final StateFlow<Integer> newWidthFrontWheels;

    @NotNull
    public final StateFlow<Integer> newWithBackWheels;

    @Inject
    public TuningCollapseViewModel(@NotNull TuningActionWithJSON actionWithJson, @NotNull CostCalculation costCalculation) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        Intrinsics.checkNotNullParameter(costCalculation, "costCalculation");
        this.actionWithJson = actionWithJson;
        this.costCalculation = costCalculation;
        this.mutableGosCost = StateFlowKt.MutableStateFlow(0);
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.mutableCurrentCost = MutableStateFlow;
        this.newCurrentCost = MutableStateFlow;
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(0);
        this.mutableFullClearance = MutableStateFlow2;
        this.newFullClearance = MutableStateFlow2;
        MutableStateFlow<Integer> MutableStateFlow3 = StateFlowKt.MutableStateFlow(0);
        this.mutableIndividualClearance = MutableStateFlow3;
        this.newIndividualClearance = MutableStateFlow3;
        MutableStateFlow<Integer> MutableStateFlow4 = StateFlowKt.MutableStateFlow(0);
        this.mutableDepartureFrontWheels = MutableStateFlow4;
        this.newDepartureFrontWheels = MutableStateFlow4;
        MutableStateFlow<Integer> MutableStateFlow5 = StateFlowKt.MutableStateFlow(0);
        this.mutableDepartureBackWheels = MutableStateFlow5;
        this.newDepartureBackWheels = MutableStateFlow5;
        MutableStateFlow<Integer> MutableStateFlow6 = StateFlowKt.MutableStateFlow(0);
        this.mutableCollapseFront = MutableStateFlow6;
        this.newCollapseFront = MutableStateFlow6;
        MutableStateFlow<Integer> MutableStateFlow7 = StateFlowKt.MutableStateFlow(0);
        this.mutableCollapseBack = MutableStateFlow7;
        this.newCollapseBack = MutableStateFlow7;
        MutableStateFlow<Integer> MutableStateFlow8 = StateFlowKt.MutableStateFlow(0);
        this.mutableWidthFrontWheels = MutableStateFlow8;
        this.newWidthFrontWheels = MutableStateFlow8;
        MutableStateFlow<Integer> MutableStateFlow9 = StateFlowKt.MutableStateFlow(0);
        this.mutableWithBackWheels = MutableStateFlow9;
        this.newWithBackWheels = MutableStateFlow9;
        MutableStateFlow<Integer> MutableStateFlow10 = StateFlowKt.MutableStateFlow(0);
        this.mutableRadiusWheels = MutableStateFlow10;
        this.newRadiusWheels = MutableStateFlow10;
    }

    @NotNull
    public final StateFlow<Integer> getNewCurrentCost() {
        return this.newCurrentCost;
    }

    @NotNull
    public final StateFlow<Integer> getNewFullClearance() {
        return this.newFullClearance;
    }

    @NotNull
    public final StateFlow<Integer> getNewIndividualClearance() {
        return this.newIndividualClearance;
    }

    @NotNull
    public final StateFlow<Integer> getNewDepartureFrontWheels() {
        return this.newDepartureFrontWheels;
    }

    @NotNull
    public final StateFlow<Integer> getNewDepartureBackWheels() {
        return this.newDepartureBackWheels;
    }

    @NotNull
    public final StateFlow<Integer> getNewCollapseFront() {
        return this.newCollapseFront;
    }

    @NotNull
    public final StateFlow<Integer> getNewCollapseBack() {
        return this.newCollapseBack;
    }

    @NotNull
    public final StateFlow<Integer> getNewWidthFrontWheels() {
        return this.newWidthFrontWheels;
    }

    @NotNull
    public final StateFlow<Integer> getNewWithBackWheels() {
        return this.newWithBackWheels;
    }

    @NotNull
    public final StateFlow<Integer> getNewRadiusWheels() {
        return this.newRadiusWheels;
    }

    public final void initCollapse(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new TuningCollapseViewModel$initCollapse$1(jsonObject, this, null), 2, null);
    }

    public final void setGosCost(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.mutableGosCost.setValue(Integer.valueOf(jsonObject.optInt("j")));
    }

    public final void calculateTheCost(int currentSelector) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new TuningCollapseViewModel$calculateTheCost$1(this, currentSelector, null), 2, null);
    }

    public final void updateFullClearance(int newValue) {
        this.mutableFullClearance.setValue(Integer.valueOf(newValue));
    }

    public final void updateIndividualClearance(int newValue) {
        this.mutableIndividualClearance.setValue(Integer.valueOf(newValue));
    }

    public final void updateDepartureFrontWheels(int newValue) {
        this.mutableDepartureFrontWheels.setValue(Integer.valueOf(newValue));
    }

    public final void updateDepartureBackWheels(int newValue) {
        this.mutableDepartureBackWheels.setValue(Integer.valueOf(newValue));
    }

    public final void updateCollapseFront(int newValue) {
        this.mutableCollapseFront.setValue(Integer.valueOf(newValue));
    }

    public final void updateCollapseBack(int newValue) {
        this.mutableCollapseBack.setValue(Integer.valueOf(newValue));
    }

    public final void updateWidthFrontWheels(int newValue) {
        this.mutableWidthFrontWheels.setValue(Integer.valueOf(newValue));
    }

    public final void updateWithBackWheels(int newValue) {
        this.mutableWithBackWheels.setValue(Integer.valueOf(newValue));
    }

    public final void updateRadiusWheels(int newValue) {
        this.mutableRadiusWheels.setValue(Integer.valueOf(newValue));
    }

    public final void updateParamsForPreview(int newValue) {
        this.actionWithJson.putDetailOrCollapseToClient(24, newValue);
    }

    public final void getCollapseAfterReset() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TuningCollapseViewModel$getCollapseAfterReset$1(this, null), 3, null);
    }

    public final void getCollapse() {
        this.actionWithJson.putPlayersActionToServer(28);
    }

    public final void sendBuyCollapse(int valueOfCollapse, int currentSelector) {
        this.actionWithJson.putIntegerDataWithSelectorIDToServer(12, valueOfCollapse, currentSelector);
        switch (currentSelector) {
            case 22:
                updateFullClearance(valueOfCollapse);
                break;
            case 23:
                updateIndividualClearance(valueOfCollapse);
                break;
            case 24:
                updateDepartureFrontWheels(valueOfCollapse);
                break;
            case 25:
                updateDepartureBackWheels(valueOfCollapse);
                break;
            case 26:
                updateCollapseFront(valueOfCollapse);
                break;
            case 27:
                updateCollapseBack(valueOfCollapse);
                break;
            case 28:
                updateWidthFrontWheels(valueOfCollapse);
                break;
            case 29:
                updateWithBackWheels(valueOfCollapse);
                break;
            case 30:
                updateRadiusWheels(valueOfCollapse);
                break;
        }
    }
}
