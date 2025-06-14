package com.blackhub.bronline.game.gui.tuning.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.gui.tuning.CostCalculation;
import com.blackhub.bronline.game.gui.tuning.data.TuningDetailDiagnosticItemObj;
import com.blackhub.bronline.game.gui.tuning.network.TuningActionWithJSON;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TuningDiagnosticViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010&J\u000e\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\rJ\u0006\u0010,\u001a\u00020$J\u000e\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020\rJ\u000e\u0010/\u001a\u00020$2\u0006\u0010.\u001a\u00020\rJ\u000e\u00100\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0011J\u000e\u00101\u001a\u00020$2\u0006\u0010(\u001a\u00020)R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u0016¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u001d\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001c¨\u00062"}, d2 = {"Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningDiagnosticViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "actionWithJson", "Lcom/blackhub/bronline/game/gui/tuning/network/TuningActionWithJSON;", "costCalculation", "Lcom/blackhub/bronline/game/gui/tuning/CostCalculation;", "(Lcom/blackhub/bronline/game/gui/tuning/network/TuningActionWithJSON;Lcom/blackhub/bronline/game/gui/tuning/CostCalculation;)V", "finalListWithItems", "", "Lcom/blackhub/bronline/game/gui/tuning/data/TuningDetailDiagnosticItemObj;", "mutableCostOfDiagnostic", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "mutableGosCost", "mutablePosForUpdateItem", "mutableStatusOfApplyRepair", "", "mutableStatusOfDiagnostic", "mutableValueOfStates", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "newCostOfDiagnostic", "Lkotlinx/coroutines/flow/StateFlow;", "getNewCostOfDiagnostic", "()Lkotlinx/coroutines/flow/StateFlow;", "newPosForUpdateItem", "Lkotlinx/coroutines/flow/SharedFlow;", "getNewPosForUpdateItem", "()Lkotlinx/coroutines/flow/SharedFlow;", "newStatusOfApplyRepair", "getNewStatusOfApplyRepair", "newStatusOfDiagnostic", "getNewStatusOfDiagnostic", "newValueOfStates", "getNewValueOfStates", "changeStatusOfDiagnostic", "", "newStatus", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initDiagnostic", "jsonObject", "Lorg/json/JSONObject;", "repairDetail", "position", "sendApplyDiagnostic", "sendRepairDetailForBuy", "itemId", "sendRepairDetailForCheck", "setStatusOfApplyRepair", "updateDetailStatesAfterDiagnostic", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TuningDiagnosticViewModel extends ViewModel implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final TuningActionWithJSON actionWithJson;

    @NotNull
    public final CostCalculation costCalculation;

    @NotNull
    public List<TuningDetailDiagnosticItemObj> finalListWithItems;

    @NotNull
    public final MutableStateFlow<Integer> mutableCostOfDiagnostic;

    @NotNull
    public final MutableStateFlow<Integer> mutableGosCost;

    @NotNull
    public final MutableStateFlow<Integer> mutablePosForUpdateItem;

    @NotNull
    public final MutableStateFlow<Boolean> mutableStatusOfApplyRepair;

    @NotNull
    public final MutableStateFlow<Integer> mutableStatusOfDiagnostic;

    @NotNull
    public final MutableSharedFlow<List<TuningDetailDiagnosticItemObj>> mutableValueOfStates;

    @NotNull
    public final StateFlow<Integer> newCostOfDiagnostic;

    @NotNull
    public final SharedFlow<Integer> newPosForUpdateItem;

    @NotNull
    public final StateFlow<Boolean> newStatusOfApplyRepair;

    @NotNull
    public final StateFlow<Integer> newStatusOfDiagnostic;

    @NotNull
    public final SharedFlow<List<TuningDetailDiagnosticItemObj>> newValueOfStates;

    @Inject
    public TuningDiagnosticViewModel(@NotNull TuningActionWithJSON actionWithJson, @NotNull CostCalculation costCalculation) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        Intrinsics.checkNotNullParameter(costCalculation, "costCalculation");
        this.actionWithJson = actionWithJson;
        this.costCalculation = costCalculation;
        this.mutableGosCost = StateFlowKt.MutableStateFlow(0);
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.mutableStatusOfDiagnostic = MutableStateFlow;
        this.newStatusOfDiagnostic = MutableStateFlow;
        MutableSharedFlow<List<TuningDetailDiagnosticItemObj>> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableValueOfStates = MutableSharedFlow$default;
        this.newValueOfStates = MutableSharedFlow$default;
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(-1);
        this.mutablePosForUpdateItem = MutableStateFlow2;
        this.newPosForUpdateItem = MutableStateFlow2;
        this.finalListWithItems = CollectionsKt__CollectionsKt.emptyList();
        MutableStateFlow<Integer> MutableStateFlow3 = StateFlowKt.MutableStateFlow(0);
        this.mutableCostOfDiagnostic = MutableStateFlow3;
        this.newCostOfDiagnostic = MutableStateFlow3;
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.mutableStatusOfApplyRepair = MutableStateFlow4;
        this.newStatusOfApplyRepair = MutableStateFlow4;
    }

    @NotNull
    public final StateFlow<Integer> getNewStatusOfDiagnostic() {
        return this.newStatusOfDiagnostic;
    }

    @NotNull
    public final SharedFlow<List<TuningDetailDiagnosticItemObj>> getNewValueOfStates() {
        return this.newValueOfStates;
    }

    @NotNull
    public final SharedFlow<Integer> getNewPosForUpdateItem() {
        return this.newPosForUpdateItem;
    }

    @NotNull
    public final StateFlow<Integer> getNewCostOfDiagnostic() {
        return this.newCostOfDiagnostic;
    }

    @NotNull
    public final StateFlow<Boolean> getNewStatusOfApplyRepair() {
        return this.newStatusOfApplyRepair;
    }

    public final void initDiagnostic(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new TuningDiagnosticViewModel$initDiagnostic$1(jsonObject, this, null), 2, null);
    }

    public final void updateDetailStatesAfterDiagnostic(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new TuningDiagnosticViewModel$updateDetailStatesAfterDiagnostic$1(jsonObject, this, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object changeStatusOfDiagnostic(int r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel$changeStatusOfDiagnostic$1
            if (r0 == 0) goto L13
            r0 = r6
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel$changeStatusOfDiagnostic$1 r0 = (com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel$changeStatusOfDiagnostic$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel$changeStatusOfDiagnostic$1 r0 = new com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel$changeStatusOfDiagnostic$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r5 = r0.I$0
            java.lang.Object r0 = r0.L$0
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel r0 = (com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.L$0 = r4
            r0.I$0 = r5
            r0.label = r3
            r2 = 2100(0x834, double:1.0375E-320)
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r2, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            r0 = r4
        L4a:
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> r6 = r0.mutableStatusOfDiagnostic
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r5)
            r6.setValue(r5)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel.changeStatusOfDiagnostic(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void repairDetail(int position) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new TuningDiagnosticViewModel$repairDetail$1(this, position, null), 2, null);
    }

    public final void sendRepairDetailForCheck(int itemId) {
        this.actionWithJson.putIntegerDataToServer(9, itemId);
    }

    public final void sendRepairDetailForBuy(int itemId) {
        this.actionWithJson.putIntegerDataToServer(8, itemId);
    }

    public final void sendApplyDiagnostic() {
        this.actionWithJson.putPlayersActionToServer(6);
    }

    public final void setStatusOfApplyRepair(boolean newStatus) {
        this.mutableStatusOfApplyRepair.setValue(Boolean.valueOf(newStatus));
    }
}
