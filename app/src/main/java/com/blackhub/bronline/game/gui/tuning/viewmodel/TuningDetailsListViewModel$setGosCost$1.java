package com.blackhub.bronline.game.gui.tuning.viewmodel;

import com.blackhub.bronline.game.gui.tuning.CostCalculation;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TuningDetailsListViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$setGosCost$1", f = "TuningDetailsListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class TuningDetailsListViewModel$setGosCost$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $jsonObject;
    public int label;
    public final /* synthetic */ TuningDetailsListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TuningDetailsListViewModel$setGosCost$1(JSONObject jSONObject, TuningDetailsListViewModel tuningDetailsListViewModel, Continuation<? super TuningDetailsListViewModel$setGosCost$1> continuation) {
        super(2, continuation);
        this.$jsonObject = jSONObject;
        this.this$0 = tuningDetailsListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TuningDetailsListViewModel$setGosCost$1(this.$jsonObject, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TuningDetailsListViewModel$setGosCost$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        CostCalculation costCalculation;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            int optInt = this.$jsonObject.optInt("j");
            mutableStateFlow = this.this$0.mutableGosCost;
            mutableStateFlow.setValue(Boxing.boxInt(optInt));
            mutableStateFlow2 = this.this$0.mutableVinylCost;
            costCalculation = this.this$0.costCalculation;
            mutableStateFlow2.setValue(Boxing.boxInt(costCalculation.setCost(2, optInt)));
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
        return Unit.INSTANCE;
    }
}
