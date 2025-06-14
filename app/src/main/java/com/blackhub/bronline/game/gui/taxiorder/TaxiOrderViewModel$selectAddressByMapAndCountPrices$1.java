package com.blackhub.bronline.game.gui.taxiorder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TaxiOrderViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.taxiorder.TaxiOrderViewModel$selectAddressByMapAndCountPrices$1", f = "TaxiOrderViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nTaxiOrderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiOrderViewModel.kt\ncom/blackhub/bronline/game/gui/taxiorder/TaxiOrderViewModel$selectAddressByMapAndCountPrices$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,309:1\n1549#2:310\n1620#2,3:311\n230#3,5:314\n*S KotlinDebug\n*F\n+ 1 TaxiOrderViewModel.kt\ncom/blackhub/bronline/game/gui/taxiorder/TaxiOrderViewModel$selectAddressByMapAndCountPrices$1\n*L\n185#1:310\n185#1:311,3\n189#1:314,5\n*E\n"})
/* loaded from: classes3.dex */
public final class TaxiOrderViewModel$selectAddressByMapAndCountPrices$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ CoordinatesModel $coordinates;
    public final /* synthetic */ float $viewEdgeLength;
    public int label;
    public final /* synthetic */ TaxiOrderViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderViewModel$selectAddressByMapAndCountPrices$1(CoordinatesModel coordinatesModel, float f, TaxiOrderViewModel taxiOrderViewModel, Continuation<? super TaxiOrderViewModel$selectAddressByMapAndCountPrices$1> continuation) {
        super(2, continuation);
        this.$coordinates = coordinatesModel;
        this.$viewEdgeLength = f;
        this.this$0 = taxiOrderViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TaxiOrderViewModel$selectAddressByMapAndCountPrices$1(this.$coordinates, this.$viewEdgeLength, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TaxiOrderViewModel$selectAddressByMapAndCountPrices$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        TaxiOrderUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        float x = (float) this.$coordinates.getX();
        float y = (float) this.$coordinates.getY();
        float f = this.$viewEdgeLength;
        float f2 = (y - (f / 2.0f)) * (7000.0f / f);
        double d = (x - (f / 2.0f)) * (7000.0f / f);
        double d2 = f2;
        CoordinatesModel coordinatesModel = new CoordinatesModel(d, d2);
        double sqrt = Math.sqrt(Math.pow(d - this.this$0.getUiState().getValue().getCoordinatesCurrent().getX(), 2.0d) + Math.pow(d2 - this.this$0.getUiState().getValue().getCoordinatesCurrent().getY(), 2.0d)) / 1000.0f;
        List<Integer> prices = this.this$0.getUiState().getValue().getPrices();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(prices, 10));
        Iterator<T> it = prices.iterator();
        while (it.hasNext()) {
            arrayList.add(Boxing.boxInt((((int) sqrt) + 3) * ((Number) it.next()).intValue()));
        }
        MutableStateFlow<? extends TaxiOrderUiState> mutableStateFlow = this.this$0.get_uiState();
        while (true) {
            TaxiOrderUiState value = mutableStateFlow.getValue();
            ArrayList arrayList2 = arrayList;
            CoordinatesModel coordinatesModel2 = coordinatesModel;
            copy = r3.copy((r39 & 1) != 0 ? r3.placeName : null, (r39 & 2) != 0 ? r3.moneyCash : 0, (r39 & 4) != 0 ? r3.moneyCard : 0, (r39 & 8) != 0 ? r3.fastestIndex : null, (r39 & 16) != 0 ? r3.demandedIndex : null, (r39 & 32) != 0 ? r3.prices : arrayList, (r39 & 64) != 0 ? r3.coordinatesCurrent : null, (r39 & 128) != 0 ? r3.coordinates : coordinatesModel, (r39 & 256) != 0 ? r3.selectedCompany : null, (r39 & 512) != 0 ? r3.selectedRate : null, (r39 & 1024) != 0 ? r3.selectedPayment : null, (r39 & 2048) != 0 ? r3.comment : null, (r39 & 4096) != 0 ? r3.driverName : null, (r39 & 8192) != 0 ? r3.driverNumber : null, (r39 & 16384) != 0 ? r3.driverAuto : null, (r39 & 32768) != 0 ? r3.isAddressSelected : true, (r39 & 65536) != 0 ? r3.isMapOpened : false, (r39 & 131072) != 0 ? r3.isNeedClose : false, (r39 & 262144) != 0 ? r3.isPointSelected : false, (r39 & 524288) != 0 ? r3.isWaitingWindowOpened : false, (r39 & 1048576) != 0 ? value.isOrderWindowVisible : false);
            if (mutableStateFlow.compareAndSet(value, copy)) {
                return Unit.INSTANCE;
            }
            arrayList = arrayList2;
            coordinatesModel = coordinatesModel2;
        }
    }
}
