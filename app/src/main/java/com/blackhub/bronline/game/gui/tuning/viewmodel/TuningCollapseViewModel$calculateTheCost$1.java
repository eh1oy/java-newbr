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

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TuningCollapseViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningCollapseViewModel$calculateTheCost$1", f = "TuningCollapseViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class TuningCollapseViewModel$calculateTheCost$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $currentSelector;
    public int label;
    public final /* synthetic */ TuningCollapseViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TuningCollapseViewModel$calculateTheCost$1(TuningCollapseViewModel tuningCollapseViewModel, int i, Continuation<? super TuningCollapseViewModel$calculateTheCost$1> continuation) {
        super(2, continuation);
        this.this$0 = tuningCollapseViewModel;
        this.$currentSelector = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TuningCollapseViewModel$calculateTheCost$1(this.this$0, this.$currentSelector, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TuningCollapseViewModel$calculateTheCost$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        CostCalculation costCalculation;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                mutableStateFlow = this.this$0.mutableGosCost;
                int intValue = ((Number) mutableStateFlow.getValue()).intValue();
                mutableStateFlow2 = this.this$0.mutableCurrentCost;
                costCalculation = this.this$0.costCalculation;
                mutableStateFlow2.setValue(Boxing.boxInt(costCalculation.setCost(this.$currentSelector, intValue)));
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
