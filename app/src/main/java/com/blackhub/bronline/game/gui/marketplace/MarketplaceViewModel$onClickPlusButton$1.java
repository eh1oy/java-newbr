package com.blackhub.bronline.game.gui.marketplace;

import androidx.media3.common.C;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceBottomSheetInfo;
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
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MarketplaceViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickPlusButton$1", f = "MarketplaceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickPlusButton$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n230#2,5:1770\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickPlusButton$1\n*L\n1023#1:1770,5\n*E\n"})
/* loaded from: classes3.dex */
public final class MarketplaceViewModel$onClickPlusButton$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ MarketplaceViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplaceViewModel$onClickPlusButton$1(MarketplaceViewModel marketplaceViewModel, Continuation<? super MarketplaceViewModel$onClickPlusButton$1> continuation) {
        super(2, continuation);
        this.this$0 = marketplaceViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MarketplaceViewModel$onClickPlusButton$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MarketplaceViewModel$onClickPlusButton$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MarketplaceBottomSheetInfo copy;
        MarketplaceUiState value;
        MarketplaceUiState copy2;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        float sellTax = (this.this$0.get_uiState().getValue().getSelectedTab().getTabValue() == 5 || this.this$0.get_uiState().getValue().getSelectedTab().getTabValue() == 6) ? (100.0f - this.this$0.get_uiState().getValue().getMarketplaceLimits().getSellTax()) / 100.0f : 1.0f;
        copy = r3.copy((r20 & 1) != 0 ? r3.tabValue : 0, (r20 & 2) != 0 ? r3.isCheckBoxChecked : false, (r20 & 4) != 0 ? r3.productCount : this.this$0.get_uiState().getValue().getBottomSheetInfo().getProductCount() + 1, (r20 & 8) != 0 ? r3.price : 0L, (r20 & 16) != 0 ? r3.priceForAll : (long) (r6 * this.this$0.get_uiState().getValue().getBottomSheetInfo().getPrice() * sellTax), (r20 & 32) != 0 ? r3.priceForPublish : 0, (r20 & 64) != 0 ? this.this$0.get_uiState().getValue().getBottomSheetInfo().addsValue : 0);
        MutableStateFlow<? extends MarketplaceUiState> mutableStateFlow = this.this$0.get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy2 = r15.copy((r52 & 1) != 0 ? r15.profileInfo : null, (r52 & 2) != 0 ? r15.bottomSheetInfo : copy, (r52 & 4) != 0 ? r15.marketplaceLimits : null, (r52 & 8) != 0 ? r15.money : 0, (r52 & 16) != 0 ? r15.isHasPlatinumVip : false, (r52 & 32) != 0 ? r15.allInventoryItems : null, (r52 & 64) != 0 ? r15.products : null, (r52 & 128) != 0 ? r15.inventoryProducts : null, (r52 & 256) != 0 ? r15.tabs : null, (r52 & 512) != 0 ? r15.filterList : null, (r52 & 1024) != 0 ? r15.listOfChosenFilterIds : null, (r52 & 2048) != 0 ? r15.likedList : null, (r52 & 4096) != 0 ? r15.selectedTab : null, (r52 & 8192) != 0 ? r15.selectedProduct : null, (r52 & 16384) != 0 ? r15.currentPage : 0, (r52 & 32768) != 0 ? r15.totalPages : 0, (r52 & 65536) != 0 ? r15.priceVip : 0, (r52 & 131072) != 0 ? r15.typeVip : 0, (r52 & 262144) != 0 ? r15.timeVipCard : 0, (r52 & 524288) != 0 ? r15.pagesToShow : null, (r52 & 1048576) != 0 ? r15.currentSortFilter : null, (r52 & 2097152) != 0 ? r15.bestMarketplaceProduct : null, (r52 & 4194304) != 0 ? r15.modalBottomWindowText : null, (r52 & 8388608) != 0 ? r15.modalWindowState : null, (r52 & 16777216) != 0 ? r15.isModalWindowVisible : false, (r52 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r15.isScrollBarVisible : false, (r52 & 67108864) != 0 ? r15.isBottomSheetBlockVisible : false, (r52 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r15.isNeedToShowFilter : false, (r52 & 268435456) != 0 ? r15.isHintsOpened : false, (r52 & 536870912) != 0 ? r15.isWithIndicationFilter : false, (r52 & 1073741824) != 0 ? r15.isWaitingServerResponseForPublishing : false, (r52 & Integer.MIN_VALUE) != 0 ? r15.isCanPublishProductCards : false, (r53 & 1) != 0 ? r15.bgMarketplace : null, (r53 & 2) != 0 ? value.isNeedClose : false);
        } while (!mutableStateFlow.compareAndSet(value, copy2));
        return Unit.INSTANCE;
    }
}
