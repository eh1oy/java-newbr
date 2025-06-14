package com.blackhub.bronline.game.gui.tuning.viewmodel;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TuningCollapseViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningCollapseViewModel$initCollapse$1", f = "TuningCollapseViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class TuningCollapseViewModel$initCollapse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $jsonObject;
    public int label;
    public final /* synthetic */ TuningCollapseViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TuningCollapseViewModel$initCollapse$1(JSONObject jSONObject, TuningCollapseViewModel tuningCollapseViewModel, Continuation<? super TuningCollapseViewModel$initCollapse$1> continuation) {
        super(2, continuation);
        this.$jsonObject = jSONObject;
        this.this$0 = tuningCollapseViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TuningCollapseViewModel$initCollapse$1(this.$jsonObject, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TuningCollapseViewModel$initCollapse$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        MutableStateFlow mutableStateFlow4;
        MutableStateFlow mutableStateFlow5;
        MutableStateFlow mutableStateFlow6;
        MutableStateFlow mutableStateFlow7;
        MutableStateFlow mutableStateFlow8;
        MutableStateFlow mutableStateFlow9;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            JSONArray optJSONArray = this.$jsonObject.optJSONArray("u");
            if (optJSONArray != null && optJSONArray.length() == 9) {
                mutableStateFlow = this.this$0.mutableFullClearance;
                Object obj2 = optJSONArray.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                mutableStateFlow.setValue((Integer) obj2);
                mutableStateFlow2 = this.this$0.mutableIndividualClearance;
                Object obj3 = optJSONArray.get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                mutableStateFlow2.setValue((Integer) obj3);
                mutableStateFlow3 = this.this$0.mutableDepartureFrontWheels;
                Object obj4 = optJSONArray.get(2);
                Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
                mutableStateFlow3.setValue((Integer) obj4);
                mutableStateFlow4 = this.this$0.mutableDepartureBackWheels;
                Object obj5 = optJSONArray.get(3);
                Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Int");
                mutableStateFlow4.setValue((Integer) obj5);
                mutableStateFlow5 = this.this$0.mutableCollapseFront;
                Object obj6 = optJSONArray.get(4);
                Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Int");
                mutableStateFlow5.setValue((Integer) obj6);
                mutableStateFlow6 = this.this$0.mutableCollapseBack;
                Object obj7 = optJSONArray.get(5);
                Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Int");
                mutableStateFlow6.setValue((Integer) obj7);
                mutableStateFlow7 = this.this$0.mutableWidthFrontWheels;
                Object obj8 = optJSONArray.get(6);
                Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Int");
                mutableStateFlow7.setValue((Integer) obj8);
                mutableStateFlow8 = this.this$0.mutableWithBackWheels;
                Object obj9 = optJSONArray.get(7);
                Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type kotlin.Int");
                mutableStateFlow8.setValue((Integer) obj9);
                mutableStateFlow9 = this.this$0.mutableRadiusWheels;
                Object obj10 = optJSONArray.get(8);
                Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Int");
                mutableStateFlow9.setValue((Integer) obj10);
            }
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
        return Unit.INSTANCE;
    }
}
