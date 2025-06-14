package com.blackhub.bronline.game.gui.marketplace;

import androidx.core.view.ViewCompat;
import androidx.media3.common.C;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceBottomSheetInfo;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceProduct;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: MarketplaceViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickCardMainButton$1", f = "MarketplaceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickCardMainButton$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n230#2,5:1770\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickCardMainButton$1\n*L\n1216#1:1770,5\n*E\n"})
/* loaded from: classes3.dex */
public final class MarketplaceViewModel$onClickCardMainButton$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $productIndex;
    public int label;
    public final /* synthetic */ MarketplaceViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplaceViewModel$onClickCardMainButton$1(MarketplaceViewModel marketplaceViewModel, int i, Continuation<? super MarketplaceViewModel$onClickCardMainButton$1> continuation) {
        super(2, continuation);
        this.this$0 = marketplaceViewModel;
        this.$productIndex = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MarketplaceViewModel$onClickCardMainButton$1(this.this$0, this.$productIndex, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MarketplaceViewModel$onClickCardMainButton$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Pair pair;
        MarketplaceBottomSheetInfo copy;
        MarketplaceActionWithJson marketplaceActionWithJson;
        MarketplaceUiState value;
        MarketplaceUiState copy2;
        MarketplaceActionWithJson marketplaceActionWithJson2;
        MarketplaceActionWithJson marketplaceActionWithJson3;
        StringResource stringResource;
        MarketplaceActionWithJson marketplaceActionWithJson4;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MarketplaceProduct marketplaceProduct = (MarketplaceProduct) CollectionsKt___CollectionsKt.getOrNull(this.this$0.get_uiState().getValue().getProducts(), this.$productIndex);
        if (marketplaceProduct == null) {
            marketplaceProduct = new MarketplaceProduct(false, null, null, null, null, 0, null, 0, 0, 0, 0, 0L, 0, null, null, null, 0.0d, 0, null, false, false, false, false, null, ViewCompat.MEASURED_SIZE_MASK, null);
        }
        float sellTax = (100.0f - this.this$0.get_uiState().getValue().getMarketplaceLimits().getSellTax()) / 100.0f;
        boolean z = true;
        if (this.this$0.get_uiState().getValue().getSelectedTab().getTabValue() == 5) {
            pair = TuplesKt.to(Boxing.boxLong((long) (marketplaceProduct.getPrice() * marketplaceProduct.getCount() * sellTax)), Boxing.boxInt(marketplaceProduct.getCount()));
        } else {
            pair = TuplesKt.to(Boxing.boxLong(marketplaceProduct.getPrice()), Boxing.boxInt(1));
        }
        copy = r6.copy((r20 & 1) != 0 ? r6.tabValue : 0, (r20 & 2) != 0 ? r6.isCheckBoxChecked : marketplaceProduct.isHot(), (r20 & 4) != 0 ? r6.productCount : ((Number) pair.component2()).intValue(), (r20 & 8) != 0 ? r6.price : marketplaceProduct.getPrice(), (r20 & 16) != 0 ? r6.priceForAll : ((Number) pair.component1()).longValue(), (r20 & 32) != 0 ? r6.priceForPublish : this.this$0.get_uiState().getValue().getMarketplaceLimits().getPriceForPublish(), (r20 & 64) != 0 ? this.this$0.get_uiState().getValue().getBottomSheetInfo().addsValue : this.this$0.get_uiState().getValue().getMarketplaceLimits().getHotProductCardsCanSell());
        int tabValue = this.this$0.get_uiState().getValue().getSelectedTab().getTabValue();
        if (tabValue == 2 || tabValue == 4) {
            marketplaceActionWithJson = this.this$0.actionWithJSON;
            marketplaceActionWithJson.sendClickBuy(marketplaceProduct.getId());
        } else if (tabValue == 5) {
            marketplaceActionWithJson2 = this.this$0.actionWithJSON;
            marketplaceActionWithJson2.sendEditProduct(marketplaceProduct.getId());
        } else if (tabValue == 6) {
            if (this.this$0.get_uiState().getValue().isCanPublishProductCards()) {
                marketplaceActionWithJson4 = this.this$0.actionWithJSON;
                marketplaceActionWithJson4.sendClickToSellButton(marketplaceProduct.getId());
            } else {
                if (!this.this$0.get_uiState().getValue().isHasPlatinumVip()) {
                    marketplaceActionWithJson3 = this.this$0.actionWithJSON;
                    marketplaceActionWithJson3.sendNotifyBuyVip();
                } else {
                    LocalNotification localNotification = this.this$0.getLocalNotification();
                    stringResource = this.this$0.stringResources;
                    localNotification.showErrorNotification(stringResource.getString(R.string.marketplace_error_limits_vip_text));
                }
                z = false;
            }
        }
        MutableStateFlow<? extends MarketplaceUiState> mutableStateFlow = this.this$0.get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy2 = r31.copy((r52 & 1) != 0 ? r31.profileInfo : null, (r52 & 2) != 0 ? r31.bottomSheetInfo : copy, (r52 & 4) != 0 ? r31.marketplaceLimits : null, (r52 & 8) != 0 ? r31.money : 0, (r52 & 16) != 0 ? r31.isHasPlatinumVip : false, (r52 & 32) != 0 ? r31.allInventoryItems : null, (r52 & 64) != 0 ? r31.products : null, (r52 & 128) != 0 ? r31.inventoryProducts : null, (r52 & 256) != 0 ? r31.tabs : null, (r52 & 512) != 0 ? r31.filterList : null, (r52 & 1024) != 0 ? r31.listOfChosenFilterIds : null, (r52 & 2048) != 0 ? r31.likedList : null, (r52 & 4096) != 0 ? r31.selectedTab : null, (r52 & 8192) != 0 ? r31.selectedProduct : marketplaceProduct, (r52 & 16384) != 0 ? r31.currentPage : 0, (r52 & 32768) != 0 ? r31.totalPages : 0, (r52 & 65536) != 0 ? r31.priceVip : 0, (r52 & 131072) != 0 ? r31.typeVip : 0, (r52 & 262144) != 0 ? r31.timeVipCard : 0, (r52 & 524288) != 0 ? r31.pagesToShow : null, (r52 & 1048576) != 0 ? r31.currentSortFilter : null, (r52 & 2097152) != 0 ? r31.bestMarketplaceProduct : null, (r52 & 4194304) != 0 ? r31.modalBottomWindowText : null, (r52 & 8388608) != 0 ? r31.modalWindowState : null, (r52 & 16777216) != 0 ? r31.isModalWindowVisible : false, (r52 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r31.isScrollBarVisible : false, (r52 & 67108864) != 0 ? r31.isBottomSheetBlockVisible : z, (r52 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r31.isNeedToShowFilter : false, (r52 & 268435456) != 0 ? r31.isHintsOpened : false, (r52 & 536870912) != 0 ? r31.isWithIndicationFilter : false, (r52 & 1073741824) != 0 ? r31.isWaitingServerResponseForPublishing : false, (r52 & Integer.MIN_VALUE) != 0 ? r31.isCanPublishProductCards : false, (r53 & 1) != 0 ? r31.bgMarketplace : null, (r53 & 2) != 0 ? value.isNeedClose : false);
        } while (!mutableStateFlow.compareAndSet(value, copy2));
        return Unit.INSTANCE;
    }
}
