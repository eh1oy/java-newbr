package com.blackhub.bronline.game.gui.marketplace;

import androidx.media3.common.C;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceSortFilter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: MarketplaceViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickSort$1", f = "MarketplaceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickSort$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n230#2,5:1770\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickSort$1\n*L\n1464#1:1770,5\n*E\n"})
/* loaded from: classes3.dex */
public final class MarketplaceViewModel$onClickSort$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ MarketplaceViewModel this$0;

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketplaceSortFilter.values().length];
            try {
                iArr[MarketplaceSortFilter.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketplaceSortFilter.OLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MarketplaceSortFilter.DESCENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MarketplaceSortFilter.ASCENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplaceViewModel$onClickSort$1(MarketplaceViewModel marketplaceViewModel, Continuation<? super MarketplaceViewModel$onClickSort$1> continuation) {
        super(2, continuation);
        this.this$0 = marketplaceViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MarketplaceViewModel$onClickSort$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MarketplaceViewModel$onClickSort$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MarketplaceSortFilter marketplaceSortFilter;
        MarketplaceActionWithJson marketplaceActionWithJson;
        MarketplaceUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int i = WhenMappings.$EnumSwitchMapping$0[this.this$0.get_uiState().getValue().getCurrentSortFilter().ordinal()];
        if (i == 1) {
            marketplaceSortFilter = MarketplaceSortFilter.OLD;
        } else if (i == 2) {
            marketplaceSortFilter = MarketplaceSortFilter.NEW;
        } else if (i == 3) {
            marketplaceSortFilter = MarketplaceSortFilter.ASCENDING;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            marketplaceSortFilter = MarketplaceSortFilter.DESCENDING;
        }
        marketplaceActionWithJson = this.this$0.actionWithJSON;
        marketplaceActionWithJson.sendSortFilter(marketplaceSortFilter.getValue());
        MutableStateFlow<? extends MarketplaceUiState> mutableStateFlow = this.this$0.get_uiState();
        while (true) {
            MarketplaceUiState value = mutableStateFlow.getValue();
            MutableStateFlow<? extends MarketplaceUiState> mutableStateFlow2 = mutableStateFlow;
            copy = r2.copy((r52 & 1) != 0 ? r2.profileInfo : null, (r52 & 2) != 0 ? r2.bottomSheetInfo : null, (r52 & 4) != 0 ? r2.marketplaceLimits : null, (r52 & 8) != 0 ? r2.money : 0, (r52 & 16) != 0 ? r2.isHasPlatinumVip : false, (r52 & 32) != 0 ? r2.allInventoryItems : null, (r52 & 64) != 0 ? r2.products : null, (r52 & 128) != 0 ? r2.inventoryProducts : null, (r52 & 256) != 0 ? r2.tabs : null, (r52 & 512) != 0 ? r2.filterList : null, (r52 & 1024) != 0 ? r2.listOfChosenFilterIds : null, (r52 & 2048) != 0 ? r2.likedList : null, (r52 & 4096) != 0 ? r2.selectedTab : null, (r52 & 8192) != 0 ? r2.selectedProduct : null, (r52 & 16384) != 0 ? r2.currentPage : 1, (r52 & 32768) != 0 ? r2.totalPages : 0, (r52 & 65536) != 0 ? r2.priceVip : 0, (r52 & 131072) != 0 ? r2.typeVip : 0, (r52 & 262144) != 0 ? r2.timeVipCard : 0, (r52 & 524288) != 0 ? r2.pagesToShow : null, (r52 & 1048576) != 0 ? r2.currentSortFilter : marketplaceSortFilter, (r52 & 2097152) != 0 ? r2.bestMarketplaceProduct : null, (r52 & 4194304) != 0 ? r2.modalBottomWindowText : null, (r52 & 8388608) != 0 ? r2.modalWindowState : null, (r52 & 16777216) != 0 ? r2.isModalWindowVisible : false, (r52 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.isScrollBarVisible : false, (r52 & 67108864) != 0 ? r2.isBottomSheetBlockVisible : false, (r52 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isNeedToShowFilter : false, (r52 & 268435456) != 0 ? r2.isHintsOpened : false, (r52 & 536870912) != 0 ? r2.isWithIndicationFilter : false, (r52 & 1073741824) != 0 ? r2.isWaitingServerResponseForPublishing : false, (r52 & Integer.MIN_VALUE) != 0 ? r2.isCanPublishProductCards : false, (r53 & 1) != 0 ? r2.bgMarketplace : null, (r53 & 2) != 0 ? value.isNeedClose : false);
            if (mutableStateFlow2.compareAndSet(value, copy)) {
                return Unit.INSTANCE;
            }
            mutableStateFlow = mutableStateFlow2;
        }
    }
}
