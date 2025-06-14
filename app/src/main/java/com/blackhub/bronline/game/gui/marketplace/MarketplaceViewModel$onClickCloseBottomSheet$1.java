package com.blackhub.bronline.game.gui.marketplace;

import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceProduct;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: MarketplaceViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickCloseBottomSheet$1", f = "MarketplaceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class MarketplaceViewModel$onClickCloseBottomSheet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ MarketplaceViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplaceViewModel$onClickCloseBottomSheet$1(MarketplaceViewModel marketplaceViewModel, Continuation<? super MarketplaceViewModel$onClickCloseBottomSheet$1> continuation) {
        super(2, continuation);
        this.this$0 = marketplaceViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MarketplaceViewModel$onClickCloseBottomSheet$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MarketplaceViewModel$onClickCloseBottomSheet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MarketplaceProduct copy;
        MarketplaceActionWithJson marketplaceActionWithJson;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MarketplaceProduct selectedProduct = this.this$0.get_uiState().getValue().getSelectedProduct();
        copy = selectedProduct.copy((r44 & 1) != 0 ? selectedProduct.isPlatinumVipProduct : false, (r44 & 2) != 0 ? selectedProduct.name : null, (r44 & 4) != 0 ? selectedProduct.imageName : null, (r44 & 8) != 0 ? selectedProduct.rarity : null, (r44 & 16) != 0 ? selectedProduct.typeProductCard : null, (r44 & 32) != 0 ? selectedProduct.id : 0, (r44 & 64) != 0 ? selectedProduct.notificationType : null, (r44 & 128) != 0 ? selectedProduct.timeVipCard : 0, (r44 & 256) != 0 ? selectedProduct.time : 0, (r44 & 512) != 0 ? selectedProduct.timeTemplate : 0, (r44 & 1024) != 0 ? selectedProduct.inventoryId : 0, (r44 & 2048) != 0 ? selectedProduct.price : -1L, (r44 & 4096) != 0 ? selectedProduct.count : 0, (r44 & 8192) != 0 ? selectedProduct.seller : null, (r44 & 16384) != 0 ? selectedProduct.description : null, (r44 & 32768) != 0 ? selectedProduct.timeText : null, (r44 & 65536) != 0 ? selectedProduct.weight : 0.0d, (r44 & 131072) != 0 ? selectedProduct.typeTextRes : 0, (262144 & r44) != 0 ? selectedProduct.statusForHistory : null, (r44 & 524288) != 0 ? selectedProduct.isSelected : false, (r44 & 1048576) != 0 ? selectedProduct.isUser : false, (r44 & 2097152) != 0 ? selectedProduct.isPublished : false, (r44 & 4194304) != 0 ? selectedProduct.isHaveLike : false, (r44 & 8388608) != 0 ? selectedProduct.renderInfo : null);
        marketplaceActionWithJson = this.this$0.actionWithJSON;
        marketplaceActionWithJson.sendConfirmEdit(copy, selectedProduct.isHot());
        return Unit.INSTANCE;
    }
}
