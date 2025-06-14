package com.blackhub.bronline.game.gui.taxiorder;

import com.blackhub.bronline.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TaxiOrderViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.taxiorder.TaxiOrderViewModel$initJson$1", f = "TaxiOrderViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nTaxiOrderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiOrderViewModel.kt\ncom/blackhub/bronline/game/gui/taxiorder/TaxiOrderViewModel$initJson$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,309:1\n1855#2,2:310\n230#3,5:312\n*S KotlinDebug\n*F\n+ 1 TaxiOrderViewModel.kt\ncom/blackhub/bronline/game/gui/taxiorder/TaxiOrderViewModel$initJson$1\n*L\n65#1:310,2\n76#1:312,5\n*E\n"})
/* loaded from: classes3.dex */
public final class TaxiOrderViewModel$initJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ TaxiOrderViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderViewModel$initJson$1(JSONObject jSONObject, TaxiOrderViewModel taxiOrderViewModel, Continuation<? super TaxiOrderViewModel$initJson$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = taxiOrderViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TaxiOrderViewModel$initJson$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TaxiOrderViewModel$initJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        List extractPrices;
        TaxiOrderUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String optString = this.$json.optString("pl");
        CoordinatesModel coordinatesModel = new CoordinatesModel(this.$json.optDouble("x", 0.0d), this.$json.optDouble("y", 0.0d));
        extractPrices = this.this$0.extractPrices(this.$json);
        int optInt = this.$json.optInt("f");
        int optInt2 = this.$json.optInt("s");
        int optInt3 = this.$json.optInt("m");
        int optInt4 = this.$json.optInt("ca");
        for (TaxiCompanyEnum taxiCompanyEnum : TaxiCompanyEnum.getEntries()) {
            if (optInt == taxiCompanyEnum.getIndex()) {
                taxiCompanyEnum.setFastestOrDemanded(true);
                taxiCompanyEnum.setDescriptionId(R.string.taxi_the_fastest);
            }
            if (optInt2 == taxiCompanyEnum.getIndex()) {
                taxiCompanyEnum.setFastestOrDemanded(true);
                taxiCompanyEnum.setDescriptionId(R.string.taxi_increased_demand);
            }
        }
        MutableStateFlow<? extends TaxiOrderUiState> mutableStateFlow = this.this$0.get_uiState();
        while (true) {
            TaxiOrderUiState value = mutableStateFlow.getValue();
            Intrinsics.checkNotNull(optString);
            MutableStateFlow<? extends TaxiOrderUiState> mutableStateFlow2 = mutableStateFlow;
            int i = optInt2;
            int i2 = optInt;
            copy = r3.copy((r39 & 1) != 0 ? r3.placeName : optString, (r39 & 2) != 0 ? r3.moneyCash : optInt3, (r39 & 4) != 0 ? r3.moneyCard : optInt4, (r39 & 8) != 0 ? r3.fastestIndex : Boxing.boxInt(optInt), (r39 & 16) != 0 ? r3.demandedIndex : Boxing.boxInt(optInt2), (r39 & 32) != 0 ? r3.prices : extractPrices, (r39 & 64) != 0 ? r3.coordinatesCurrent : coordinatesModel, (r39 & 128) != 0 ? r3.coordinates : null, (r39 & 256) != 0 ? r3.selectedCompany : null, (r39 & 512) != 0 ? r3.selectedRate : null, (r39 & 1024) != 0 ? r3.selectedPayment : null, (r39 & 2048) != 0 ? r3.comment : null, (r39 & 4096) != 0 ? r3.driverName : null, (r39 & 8192) != 0 ? r3.driverNumber : null, (r39 & 16384) != 0 ? r3.driverAuto : null, (r39 & 32768) != 0 ? r3.isAddressSelected : false, (r39 & 65536) != 0 ? r3.isMapOpened : false, (r39 & 131072) != 0 ? r3.isNeedClose : false, (r39 & 262144) != 0 ? r3.isPointSelected : false, (r39 & 524288) != 0 ? r3.isWaitingWindowOpened : false, (r39 & 1048576) != 0 ? value.isOrderWindowVisible : false);
            if (mutableStateFlow2.compareAndSet(value, copy)) {
                return Unit.INSTANCE;
            }
            mutableStateFlow = mutableStateFlow2;
            optInt2 = i;
            optInt = i2;
        }
    }
}
