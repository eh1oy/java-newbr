package com.blackhub.bronline.game.gui.marketplace;

import androidx.media3.common.C;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceBottomSheetInfo;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceTab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
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

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: MarketplaceViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickToPlusButton$1", f = "MarketplaceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickToPlusButton$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n1549#2:1770\n1620#2,3:1771\n230#3,5:1774\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickToPlusButton$1\n*L\n1316#1:1770\n1316#1:1771,3\n1329#1:1774,5\n*E\n"})
/* loaded from: classes3.dex */
public final class MarketplaceViewModel$onClickToPlusButton$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ MarketplaceViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplaceViewModel$onClickToPlusButton$1(MarketplaceViewModel marketplaceViewModel, Continuation<? super MarketplaceViewModel$onClickToPlusButton$1> continuation) {
        super(2, continuation);
        this.this$0 = marketplaceViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MarketplaceViewModel$onClickToPlusButton$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MarketplaceViewModel$onClickToPlusButton$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MarketplaceActionWithJson marketplaceActionWithJson;
        StringResource stringResource;
        MarketplaceUiState copy;
        MarketplaceTab copy2;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            marketplaceActionWithJson = this.this$0.actionWithJSON;
            marketplaceActionWithJson.sendClickToCreateProductLot();
            List<MarketplaceTab> tabs = this.this$0.get_uiState().getValue().getTabs();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(tabs, 10));
            Iterator<T> it = tabs.iterator();
            while (it.hasNext()) {
                copy2 = r3.copy((r18 & 1) != 0 ? r3.isHasPlatinumVip : false, (r18 & 2) != 0 ? r3.tabValue : 0, (r18 & 4) != 0 ? r3.tabName : null, (r18 & 8) != 0 ? r3.icon : 0, (r18 & 16) != 0 ? r3.titleIcon : 0, (r18 & 32) != 0 ? r3.isSelected : false, (r18 & 64) != 0 ? r3.isHaveUpdates : false, (r18 & 128) != 0 ? ((MarketplaceTab) it.next()).savedSortFilter : null);
                arrayList.add(copy2);
            }
            boolean isHasPlatinumVip = this.this$0.get_uiState().getValue().isHasPlatinumVip();
            stringResource = this.this$0.stringResources;
            MarketplaceTab marketplaceTab = new MarketplaceTab(isHasPlatinumVip, 6, stringResource.getString(R.string.marketplace_inventory_tab), R.drawable.ic_boxes, R.drawable.ic_boxes, false, false, null, 224, null);
            MarketplaceBottomSheetInfo marketplaceBottomSheetInfo = new MarketplaceBottomSheetInfo(6, false, 0, 0L, 0L, 0, 0, 126, null);
            MutableStateFlow<? extends MarketplaceUiState> mutableStateFlow = this.this$0.get_uiState();
            while (true) {
                MarketplaceUiState value = mutableStateFlow.getValue();
                MutableStateFlow<? extends MarketplaceUiState> mutableStateFlow2 = mutableStateFlow;
                ArrayList arrayList2 = arrayList;
                copy = r2.copy((r52 & 1) != 0 ? r2.profileInfo : null, (r52 & 2) != 0 ? r2.bottomSheetInfo : marketplaceBottomSheetInfo, (r52 & 4) != 0 ? r2.marketplaceLimits : null, (r52 & 8) != 0 ? r2.money : 0, (r52 & 16) != 0 ? r2.isHasPlatinumVip : false, (r52 & 32) != 0 ? r2.allInventoryItems : null, (r52 & 64) != 0 ? r2.products : CollectionsKt__CollectionsKt.emptyList(), (r52 & 128) != 0 ? r2.inventoryProducts : null, (r52 & 256) != 0 ? r2.tabs : arrayList, (r52 & 512) != 0 ? r2.filterList : null, (r52 & 1024) != 0 ? r2.listOfChosenFilterIds : null, (r52 & 2048) != 0 ? r2.likedList : null, (r52 & 4096) != 0 ? r2.selectedTab : marketplaceTab, (r52 & 8192) != 0 ? r2.selectedProduct : null, (r52 & 16384) != 0 ? r2.currentPage : 1, (r52 & 32768) != 0 ? r2.totalPages : 0, (r52 & 65536) != 0 ? r2.priceVip : 0, (r52 & 131072) != 0 ? r2.typeVip : 0, (r52 & 262144) != 0 ? r2.timeVipCard : 0, (r52 & 524288) != 0 ? r2.pagesToShow : null, (r52 & 1048576) != 0 ? r2.currentSortFilter : null, (r52 & 2097152) != 0 ? r2.bestMarketplaceProduct : null, (r52 & 4194304) != 0 ? r2.modalBottomWindowText : null, (r52 & 8388608) != 0 ? r2.modalWindowState : null, (r52 & 16777216) != 0 ? r2.isModalWindowVisible : false, (r52 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.isScrollBarVisible : false, (r52 & 67108864) != 0 ? r2.isBottomSheetBlockVisible : false, (r52 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isNeedToShowFilter : false, (r52 & 268435456) != 0 ? r2.isHintsOpened : false, (r52 & 536870912) != 0 ? r2.isWithIndicationFilter : false, (r52 & 1073741824) != 0 ? r2.isWaitingServerResponseForPublishing : false, (r52 & Integer.MIN_VALUE) != 0 ? r2.isCanPublishProductCards : false, (r53 & 1) != 0 ? r2.bgMarketplace : null, (r53 & 2) != 0 ? value.isNeedClose : false);
                if (mutableStateFlow2.compareAndSet(value, copy)) {
                    return Unit.INSTANCE;
                }
                mutableStateFlow = mutableStateFlow2;
                arrayList = arrayList2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
