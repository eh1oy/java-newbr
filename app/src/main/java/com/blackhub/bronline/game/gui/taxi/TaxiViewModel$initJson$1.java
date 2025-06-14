package com.blackhub.bronline.game.gui.taxi;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: TaxiViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.taxi.TaxiViewModel$initJson$1", f = "TaxiViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nTaxiViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiViewModel.kt\ncom/blackhub/bronline/game/gui/taxi/TaxiViewModel$initJson$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,132:1\n230#2,5:133\n*S KotlinDebug\n*F\n+ 1 TaxiViewModel.kt\ncom/blackhub/bronline/game/gui/taxi/TaxiViewModel$initJson$1\n*L\n54#1:133,5\n*E\n"})
/* loaded from: classes3.dex */
public final class TaxiViewModel$initJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ TaxiViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiViewModel$initJson$1(JSONObject jSONObject, TaxiViewModel taxiViewModel, Continuation<? super TaxiViewModel$initJson$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = taxiViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TaxiViewModel$initJson$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TaxiViewModel$initJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        TaxiUiState value;
        TaxiUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        double optDouble = this.$json.optDouble("r", 0.0d);
        int optInt = this.$json.optInt("n", 0);
        int optInt2 = this.$json.optInt("m", 0);
        MutableStateFlow<? extends TaxiUiState> mutableStateFlow = this.this$0.get_uiState();
        TaxiViewModel taxiViewModel = this.this$0;
        do {
            value = mutableStateFlow.getValue();
            copy = r8.copy((r28 & 1) != 0 ? r8.brTaxiStart : null, (r28 & 2) != 0 ? r8.brTaxiEnd : null, (r28 & 4) != 0 ? r8.brTaxiDist : null, (r28 & 8) != 0 ? r8.brTaxiTime : null, (r28 & 16) != 0 ? r8.comment : null, (r28 & 32) != 0 ? r8.brTaxiPrice : null, (r28 & 64) != 0 ? r8.brTaxiTypeText : null, (r28 & 128) != 0 ? r8.brTaxiRating : taxiViewModel.getStringResource().taxiRating(optDouble), (r28 & 256) != 0 ? r8.brTaxiCountOrders : taxiViewModel.getStringResource().taxiCountOrders(optInt), (r28 & 512) != 0 ? r8.brTaxiCash : taxiViewModel.getStringResource().taxiTotalCash(optInt2), (r28 & 1024) != 0 ? r8.isHasComment : false, (r28 & 2048) != 0 ? r8.isCommentVisible : false, (r28 & 4096) != 0 ? value.isNeedClose : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        return Unit.INSTANCE;
    }
}
