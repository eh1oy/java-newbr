package com.blackhub.bronline.game.gui.donate.viewmodel;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.apache.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: DonateTileViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$removeSaleItemInfoAndUpdateLimit$1", f = "DonateTileViewModel.kt", i = {}, l = {405, HttpStatus.SC_NOT_ACCEPTABLE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class DonateTileViewModel$removeSaleItemInfoAndUpdateLimit$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $jsonObject;
    public int label;
    public final /* synthetic */ DonateTileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DonateTileViewModel$removeSaleItemInfoAndUpdateLimit$1(DonateTileViewModel donateTileViewModel, JSONObject jSONObject, Continuation<? super DonateTileViewModel$removeSaleItemInfoAndUpdateLimit$1> continuation) {
        super(2, continuation);
        this.this$0 = donateTileViewModel;
        this.$jsonObject = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DonateTileViewModel$removeSaleItemInfoAndUpdateLimit$1(this.this$0, this.$jsonObject, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DonateTileViewModel$removeSaleItemInfoAndUpdateLimit$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object lRemoveSaleItemInfo;
        Object updateValueOfLimitForCurrentItem;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DonateTileViewModel donateTileViewModel = this.this$0;
            int optInt = this.$jsonObject.optInt("g");
            this.label = 1;
            lRemoveSaleItemInfo = donateTileViewModel.lRemoveSaleItemInfo(optInt, this);
            if (lRemoveSaleItemInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        DonateTileViewModel donateTileViewModel2 = this.this$0;
        int optInt2 = this.$jsonObject.optInt("id");
        this.label = 2;
        updateValueOfLimitForCurrentItem = donateTileViewModel2.updateValueOfLimitForCurrentItem(optInt2, this);
        if (updateValueOfLimitForCurrentItem == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
