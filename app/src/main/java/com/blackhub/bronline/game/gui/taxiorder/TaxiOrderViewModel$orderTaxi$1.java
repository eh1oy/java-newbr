package com.blackhub.bronline.game.gui.taxiorder;

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

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TaxiOrderViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.taxiorder.TaxiOrderViewModel$orderTaxi$1", f = "TaxiOrderViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nTaxiOrderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiOrderViewModel.kt\ncom/blackhub/bronline/game/gui/taxiorder/TaxiOrderViewModel$orderTaxi$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,309:1\n230#2,5:310\n*S KotlinDebug\n*F\n+ 1 TaxiOrderViewModel.kt\ncom/blackhub/bronline/game/gui/taxiorder/TaxiOrderViewModel$orderTaxi$1\n*L\n240#1:310,5\n*E\n"})
/* loaded from: classes3.dex */
public final class TaxiOrderViewModel$orderTaxi$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $comment;
    public int label;
    public final /* synthetic */ TaxiOrderViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderViewModel$orderTaxi$1(TaxiOrderViewModel taxiOrderViewModel, String str, Continuation<? super TaxiOrderViewModel$orderTaxi$1> continuation) {
        super(2, continuation);
        this.this$0 = taxiOrderViewModel;
        this.$comment = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TaxiOrderViewModel$orderTaxi$1(this.this$0, this.$comment, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TaxiOrderViewModel$orderTaxi$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        TaxiOrderActionWithJSON taxiOrderActionWithJSON;
        TaxiOrderUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        TaxiOrderData taxiOrderData = new TaxiOrderData(this.this$0.getUiState().getValue().getCoordinates().getX(), this.this$0.getUiState().getValue().getCoordinates().getY(), this.this$0.getUiState().getValue().getSelectedCompany().getIndex(), this.this$0.getUiState().getValue().getSelectedPayment().getIndex(), this.this$0.getUiState().getValue().getSelectedRate().getIndex(), this.$comment, this.this$0.getUiState().getValue().getPrices().get((this.this$0.getUiState().getValue().getSelectedCompany().getIndex() * 3) + this.this$0.getUiState().getValue().getSelectedRate().getIndex()).intValue());
        taxiOrderActionWithJSON = this.this$0.actionWithJSON;
        taxiOrderActionWithJSON.orderTaxi(taxiOrderData);
        MutableStateFlow<? extends TaxiOrderUiState> mutableStateFlow = this.this$0.get_uiState();
        String str = this.$comment;
        while (true) {
            TaxiOrderUiState value = mutableStateFlow.getValue();
            String str2 = str;
            copy = r2.copy((r39 & 1) != 0 ? r2.placeName : null, (r39 & 2) != 0 ? r2.moneyCash : 0, (r39 & 4) != 0 ? r2.moneyCard : 0, (r39 & 8) != 0 ? r2.fastestIndex : null, (r39 & 16) != 0 ? r2.demandedIndex : null, (r39 & 32) != 0 ? r2.prices : null, (r39 & 64) != 0 ? r2.coordinatesCurrent : null, (r39 & 128) != 0 ? r2.coordinates : null, (r39 & 256) != 0 ? r2.selectedCompany : null, (r39 & 512) != 0 ? r2.selectedRate : null, (r39 & 1024) != 0 ? r2.selectedPayment : null, (r39 & 2048) != 0 ? r2.comment : str, (r39 & 4096) != 0 ? r2.driverName : null, (r39 & 8192) != 0 ? r2.driverNumber : null, (r39 & 16384) != 0 ? r2.driverAuto : null, (r39 & 32768) != 0 ? r2.isAddressSelected : false, (r39 & 65536) != 0 ? r2.isMapOpened : false, (r39 & 131072) != 0 ? r2.isNeedClose : false, (r39 & 262144) != 0 ? r2.isPointSelected : false, (r39 & 524288) != 0 ? r2.isWaitingWindowOpened : true, (r39 & 1048576) != 0 ? value.isOrderWindowVisible : false);
            if (mutableStateFlow.compareAndSet(value, copy)) {
                return Unit.INSTANCE;
            }
            str = str2;
        }
    }
}
