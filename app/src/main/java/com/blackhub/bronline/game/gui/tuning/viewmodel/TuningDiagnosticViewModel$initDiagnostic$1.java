package com.blackhub.bronline.game.gui.tuning.viewmodel;

import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.gui.tuning.CostCalculation;
import com.blackhub.bronline.game.gui.tuning.data.TuningDetailDiagnosticItemObj;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TuningDiagnosticViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel$initDiagnostic$1", f = "TuningDiagnosticViewModel.kt", i = {0}, l = {194}, m = "invokeSuspend", n = {"gosCost"}, s = {"I$0"})
/* loaded from: classes3.dex */
public final class TuningDiagnosticViewModel$initDiagnostic$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $jsonObject;
    public int I$0;
    public int label;
    public final /* synthetic */ TuningDiagnosticViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TuningDiagnosticViewModel$initDiagnostic$1(JSONObject jSONObject, TuningDiagnosticViewModel tuningDiagnosticViewModel, Continuation<? super TuningDiagnosticViewModel$initDiagnostic$1> continuation) {
        super(2, continuation);
        this.$jsonObject = jSONObject;
        this.this$0 = tuningDiagnosticViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TuningDiagnosticViewModel$initDiagnostic$1(this.$jsonObject, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TuningDiagnosticViewModel$initDiagnostic$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CostCalculation costCalculation;
        CostCalculation costCalculation2;
        CostCalculation costCalculation3;
        MutableSharedFlow mutableSharedFlow;
        List list;
        int i;
        CostCalculation costCalculation4;
        CostCalculation costCalculation5;
        CostCalculation costCalculation6;
        CostCalculation costCalculation7;
        CostCalculation costCalculation8;
        CostCalculation costCalculation9;
        CostCalculation costCalculation10;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        CostCalculation costCalculation11;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        try {
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            int optInt = this.$jsonObject.optInt("j");
            JSONArray optJSONArray = this.$jsonObject.optJSONArray("d");
            List<Integer> mutableIntList = optJSONArray != null ? JsonArrayExtensionKt.toMutableIntList(optJSONArray) : null;
            if (mutableIntList != null) {
                int size = mutableIntList.size();
                if (size == 3) {
                    TuningDiagnosticViewModel tuningDiagnosticViewModel = this.this$0;
                    costCalculation = this.this$0.costCalculation;
                    TuningDetailDiagnosticItemObj tuningDetailDiagnosticItemObj = new TuningDetailDiagnosticItemObj(0, "Электродвигатель", "t_electro_engine_icon", costCalculation.getFinalCost(optInt, 1.0d, 0), mutableIntList.get(0).intValue());
                    costCalculation2 = this.this$0.costCalculation;
                    TuningDetailDiagnosticItemObj tuningDetailDiagnosticItemObj2 = new TuningDetailDiagnosticItemObj(1, "Подвеска", "t_suspension_icon", costCalculation2.getFinalCost(optInt, 0.005d, 2000), mutableIntList.get(1).intValue());
                    costCalculation3 = this.this$0.costCalculation;
                    tuningDiagnosticViewModel.finalListWithItems = CollectionsKt__CollectionsKt.mutableListOf(tuningDetailDiagnosticItemObj, tuningDetailDiagnosticItemObj2, new TuningDetailDiagnosticItemObj(2, "Аккумулятор", "t_battery_icon", costCalculation3.getFinalCost(optInt, 0.5d, 0), mutableIntList.get(2).intValue()));
                } else if (size == 7) {
                    TuningDiagnosticViewModel tuningDiagnosticViewModel2 = this.this$0;
                    costCalculation4 = this.this$0.costCalculation;
                    TuningDetailDiagnosticItemObj tuningDetailDiagnosticItemObj3 = new TuningDetailDiagnosticItemObj(0, "Двигатель", "t_engine_icon", costCalculation4.getFinalCost(optInt, 1.0d, 0), mutableIntList.get(0).intValue());
                    costCalculation5 = this.this$0.costCalculation;
                    TuningDetailDiagnosticItemObj tuningDetailDiagnosticItemObj4 = new TuningDetailDiagnosticItemObj(1, "Воздушный фильтр", "t_air_filter_icon", costCalculation5.getFinalCost(optInt, 0.005d, 2000), mutableIntList.get(1).intValue());
                    costCalculation6 = this.this$0.costCalculation;
                    TuningDetailDiagnosticItemObj tuningDetailDiagnosticItemObj5 = new TuningDetailDiagnosticItemObj(2, "Топливная система", "t_fuel_system_icon", costCalculation6.getFinalCost(optInt, 0.5d, 0), mutableIntList.get(2).intValue());
                    costCalculation7 = this.this$0.costCalculation;
                    TuningDetailDiagnosticItemObj tuningDetailDiagnosticItemObj6 = new TuningDetailDiagnosticItemObj(3, "Трансмиссия", "t_transmission_icon", costCalculation7.getFinalCost(optInt, 1.0d, 0), mutableIntList.get(3).intValue());
                    costCalculation8 = this.this$0.costCalculation;
                    TuningDetailDiagnosticItemObj tuningDetailDiagnosticItemObj7 = new TuningDetailDiagnosticItemObj(4, "Подвеска", "t_suspension_icon", costCalculation8.getFinalCost(optInt, 0.5d, 0), mutableIntList.get(4).intValue());
                    costCalculation9 = this.this$0.costCalculation;
                    TuningDetailDiagnosticItemObj tuningDetailDiagnosticItemObj8 = new TuningDetailDiagnosticItemObj(5, "Свечи зажигания", "t_spark_plug_icon", costCalculation9.getFinalCost(optInt, 0.005d, 500), mutableIntList.get(5).intValue());
                    costCalculation10 = this.this$0.costCalculation;
                    tuningDiagnosticViewModel2.finalListWithItems = CollectionsKt__CollectionsKt.mutableListOf(tuningDetailDiagnosticItemObj3, tuningDetailDiagnosticItemObj4, tuningDetailDiagnosticItemObj5, tuningDetailDiagnosticItemObj6, tuningDetailDiagnosticItemObj7, tuningDetailDiagnosticItemObj8, new TuningDetailDiagnosticItemObj(6, "Аккумулятор", "t_battery_engine_icon", costCalculation10.getFinalCost(optInt, 0.005d, 5000), mutableIntList.get(5).intValue()));
                }
                mutableSharedFlow = this.this$0.mutableValueOfStates;
                list = this.this$0.finalListWithItems;
                this.I$0 = optInt;
                this.label = 1;
                if (mutableSharedFlow.emit(list, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = optInt;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = this.I$0;
        ResultKt.throwOnFailure(obj);
        mutableStateFlow = this.this$0.mutableGosCost;
        mutableStateFlow.setValue(Boxing.boxInt(i));
        mutableStateFlow2 = this.this$0.mutableCostOfDiagnostic;
        costCalculation11 = this.this$0.costCalculation;
        mutableStateFlow2.setValue(Boxing.boxInt(costCalculation11.getFinalCost(i, 0.005d, 2000)));
        return Unit.INSTANCE;
    }
}
