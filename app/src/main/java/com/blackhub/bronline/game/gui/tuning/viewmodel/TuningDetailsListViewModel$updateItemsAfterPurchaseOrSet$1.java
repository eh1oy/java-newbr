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
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TuningDetailsListViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$updateItemsAfterPurchaseOrSet$1", f = "TuningDetailsListViewModel.kt", i = {}, l = {283}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class TuningDetailsListViewModel$updateItemsAfterPurchaseOrSet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public final /* synthetic */ int $newCurrentStatus;
    public int label;
    public final /* synthetic */ TuningDetailsListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TuningDetailsListViewModel$updateItemsAfterPurchaseOrSet$1(TuningDetailsListViewModel tuningDetailsListViewModel, JSONObject jSONObject, int i, Continuation<? super TuningDetailsListViewModel$updateItemsAfterPurchaseOrSet$1> continuation) {
        super(2, continuation);
        this.this$0 = tuningDetailsListViewModel;
        this.$json = jSONObject;
        this.$newCurrentStatus = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TuningDetailsListViewModel$updateItemsAfterPurchaseOrSet$1(this.this$0, this.$json, this.$newCurrentStatus, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TuningDetailsListViewModel$updateItemsAfterPurchaseOrSet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object updateItemStatus;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TuningDetailsListViewModel tuningDetailsListViewModel = this.this$0;
                JSONObject jSONObject = this.$json;
                int i2 = this.$newCurrentStatus;
                this.label = 1;
                updateItemStatus = tuningDetailsListViewModel.updateItemStatus(jSONObject, i2, this);
                if (updateItemStatus == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
        return Unit.INSTANCE;
    }
}
