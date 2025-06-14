package com.blackhub.bronline.game.gui.marketplace;

import androidx.core.view.ViewCompat;
import androidx.media3.common.C;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceProduct;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickHistoryProduct$1", f = "MarketplaceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickHistoryProduct$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n1864#2,3:1770\n230#3,5:1773\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickHistoryProduct$1\n*L\n1138#1:1770,3\n1157#1:1773,5\n*E\n"})
/* loaded from: classes3.dex */
public final class MarketplaceViewModel$onClickHistoryProduct$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $indexElement;
    public int label;
    public final /* synthetic */ MarketplaceViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplaceViewModel$onClickHistoryProduct$1(MarketplaceViewModel marketplaceViewModel, int i, Continuation<? super MarketplaceViewModel$onClickHistoryProduct$1> continuation) {
        super(2, continuation);
        this.this$0 = marketplaceViewModel;
        this.$indexElement = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MarketplaceViewModel$onClickHistoryProduct$1(this.this$0, this.$indexElement, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MarketplaceViewModel$onClickHistoryProduct$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.blackhub.bronline.game.gui.marketplace.model.MarketplaceProduct] */
    /* JADX WARN: Type inference failed for: r6v3, types: [T, com.blackhub.bronline.game.gui.marketplace.model.MarketplaceProduct] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MarketplaceActionWithJson marketplaceActionWithJson;
        MarketplaceUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.this$0.get_uiState().getValue().getProducts());
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new MarketplaceProduct(false, null, null, null, null, 0, null, 0, 0, 0, 0, 0L, 0, null, null, null, 0.0d, 0, null, false, false, false, false, null, ViewCompat.MEASURED_SIZE_MASK, null);
        int i = this.$indexElement;
        int i2 = 0;
        for (Object obj2 : mutableList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ?? r6 = (MarketplaceProduct) obj2;
            if (i2 == i) {
                r6.setSelected(true);
                objectRef.element = r6;
            } else if (r6.isSelected()) {
                r6.setSelected(false);
            }
            i2 = i3;
        }
        marketplaceActionWithJson = this.this$0.actionWithJSON;
        marketplaceActionWithJson.sendClickHistoryCard(((MarketplaceProduct) objectRef.element).getId());
        MutableStateFlow<? extends MarketplaceUiState> mutableStateFlow = this.this$0.get_uiState();
        while (true) {
            MarketplaceUiState value = mutableStateFlow.getValue();
            MutableStateFlow<? extends MarketplaceUiState> mutableStateFlow2 = mutableStateFlow;
            Ref.ObjectRef objectRef2 = objectRef;
            copy = r2.copy((r52 & 1) != 0 ? r2.profileInfo : null, (r52 & 2) != 0 ? r2.bottomSheetInfo : null, (r52 & 4) != 0 ? r2.marketplaceLimits : null, (r52 & 8) != 0 ? r2.money : 0, (r52 & 16) != 0 ? r2.isHasPlatinumVip : false, (r52 & 32) != 0 ? r2.allInventoryItems : null, (r52 & 64) != 0 ? r2.products : mutableList, (r52 & 128) != 0 ? r2.inventoryProducts : null, (r52 & 256) != 0 ? r2.tabs : null, (r52 & 512) != 0 ? r2.filterList : null, (r52 & 1024) != 0 ? r2.listOfChosenFilterIds : null, (r52 & 2048) != 0 ? r2.likedList : null, (r52 & 4096) != 0 ? r2.selectedTab : null, (r52 & 8192) != 0 ? r2.selectedProduct : (MarketplaceProduct) objectRef.element, (r52 & 16384) != 0 ? r2.currentPage : 0, (r52 & 32768) != 0 ? r2.totalPages : 0, (r52 & 65536) != 0 ? r2.priceVip : 0, (r52 & 131072) != 0 ? r2.typeVip : 0, (r52 & 262144) != 0 ? r2.timeVipCard : 0, (r52 & 524288) != 0 ? r2.pagesToShow : null, (r52 & 1048576) != 0 ? r2.currentSortFilter : null, (r52 & 2097152) != 0 ? r2.bestMarketplaceProduct : null, (r52 & 4194304) != 0 ? r2.modalBottomWindowText : null, (r52 & 8388608) != 0 ? r2.modalWindowState : null, (r52 & 16777216) != 0 ? r2.isModalWindowVisible : false, (r52 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.isScrollBarVisible : false, (r52 & 67108864) != 0 ? r2.isBottomSheetBlockVisible : false, (r52 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isNeedToShowFilter : false, (r52 & 268435456) != 0 ? r2.isHintsOpened : false, (r52 & 536870912) != 0 ? r2.isWithIndicationFilter : false, (r52 & 1073741824) != 0 ? r2.isWaitingServerResponseForPublishing : false, (r52 & Integer.MIN_VALUE) != 0 ? r2.isCanPublishProductCards : false, (r53 & 1) != 0 ? r2.bgMarketplace : null, (r53 & 2) != 0 ? value.isNeedClose : false);
            if (mutableStateFlow2.compareAndSet(value, copy)) {
                return Unit.INSTANCE;
            }
            mutableStateFlow = mutableStateFlow2;
            objectRef = objectRef2;
        }
    }
}
