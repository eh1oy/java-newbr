package com.blackhub.bronline.game.gui.marketplace;

import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceProduct;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: MarketplaceViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickLike$1", f = "MarketplaceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickLike$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n1549#2:1770\n1620#2,2:1771\n1622#2:1774\n1#3:1773\n230#4,5:1775\n230#4,5:1780\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickLike$1\n*L\n1372#1:1770\n1372#1:1771,2\n1372#1:1774\n1377#1:1775,5\n1388#1:1780,5\n*E\n"})
/* loaded from: classes3.dex */
public final class MarketplaceViewModel$onClickLike$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MarketplaceProduct $likedProduct;
    public int label;
    public final /* synthetic */ MarketplaceViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplaceViewModel$onClickLike$1(MarketplaceProduct marketplaceProduct, MarketplaceViewModel marketplaceViewModel, Continuation<? super MarketplaceViewModel$onClickLike$1> continuation) {
        super(2, continuation);
        this.$likedProduct = marketplaceProduct;
        this.this$0 = marketplaceViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MarketplaceViewModel$onClickLike$1(this.$likedProduct, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MarketplaceViewModel$onClickLike$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        r4 = r11.copy((r44 & 1) != 0 ? r11.isPlatinumVipProduct : false, (r44 & 2) != 0 ? r11.name : null, (r44 & 4) != 0 ? r11.imageName : null, (r44 & 8) != 0 ? r11.rarity : null, (r44 & 16) != 0 ? r11.typeProductCard : null, (r44 & 32) != 0 ? r11.id : 0, (r44 & 64) != 0 ? r11.notificationType : null, (r44 & 128) != 0 ? r11.timeVipCard : 0, (r44 & 256) != 0 ? r11.time : 0, (r44 & 512) != 0 ? r11.timeTemplate : 0, (r44 & 1024) != 0 ? r11.inventoryId : 0, (r44 & 2048) != 0 ? r11.price : 0, (r44 & 4096) != 0 ? r11.count : 0, (r44 & 8192) != 0 ? r11.seller : null, (r44 & 16384) != 0 ? r11.description : null, (r44 & 32768) != 0 ? r11.timeText : null, (r44 & 65536) != 0 ? r11.weight : 0.0d, (r44 & 131072) != 0 ? r11.typeTextRes : 0, (262144 & r44) != 0 ? r11.statusForHistory : null, (r44 & 524288) != 0 ? r11.isSelected : false, (r44 & 1048576) != 0 ? r11.isUser : false, (r44 & 2097152) != 0 ? r11.isPublished : false, (r44 & 4194304) != 0 ? r11.isHaveLike : !r3.isHaveLike(), (r44 & 8388608) != 0 ? r11.renderInfo : null);
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r45) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickLike$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
