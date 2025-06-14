package com.blackhub.bronline.game.gui.taxiorder;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TaxiOrderViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.taxiorder.TaxiOrderViewModel$updateJson$1", f = "TaxiOrderViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class TaxiOrderViewModel$updateJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ TaxiOrderViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderViewModel$updateJson$1(JSONObject jSONObject, TaxiOrderViewModel taxiOrderViewModel, Continuation<? super TaxiOrderViewModel$updateJson$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = taxiOrderViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TaxiOrderViewModel$updateJson$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TaxiOrderViewModel$updateJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int optInt = this.$json.optInt("t", -2);
        if (optInt == 0) {
            String optString = this.$json.optString("n");
            String optString2 = this.$json.optString(TaxiOrderKeys.NUMBER_KEY);
            String optString3 = this.$json.optString("a");
            TaxiOrderViewModel taxiOrderViewModel = this.this$0;
            Intrinsics.checkNotNull(optString);
            Intrinsics.checkNotNull(optString2);
            Intrinsics.checkNotNull(optString3);
            taxiOrderViewModel.setOrderInfo(optString, optString2, optString3);
        } else if (optInt == 1) {
            this.this$0.openMap();
        } else if (optInt == 2) {
            this.this$0.selectAddressAndCountPrices(new CoordinatesModel(this.$json.optDouble("x"), this.$json.optDouble("y")));
        }
        return Unit.INSTANCE;
    }
}
