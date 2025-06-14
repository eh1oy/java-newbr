package com.blackhub.bronline.game.gui.marketplace;

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
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: MarketplaceViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onPacketIncoming$1", f = "MarketplaceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onPacketIncoming$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1769:1\n1#2:1770\n230#3,5:1771\n230#3,5:1776\n230#3,5:1783\n230#3,5:1788\n230#3,5:1793\n230#3,5:1798\n230#3,5:1803\n230#3,5:1808\n230#3,5:1813\n230#3,5:1818\n230#3,5:1823\n230#3,5:1832\n230#3,5:1841\n230#3,5:1846\n230#3,5:1851\n230#3,5:1856\n230#3,5:1861\n230#3,5:1870\n230#3,5:1875\n1855#4,2:1781\n1549#4:1828\n1620#4,3:1829\n1549#4:1837\n1620#4,3:1838\n1549#4:1866\n1620#4,3:1867\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onPacketIncoming$1\n*L\n353#1:1771,5\n380#1:1776,5\n428#1:1783,5\n483#1:1788,5\n532#1:1793,5\n559#1:1798,5\n573#1:1803,5\n585#1:1808,5\n596#1:1813,5\n609#1:1818,5\n618#1:1823,5\n637#1:1832,5\n684#1:1841,5\n714#1:1846,5\n732#1:1851,5\n771#1:1856,5\n797#1:1861,5\n828#1:1870,5\n845#1:1875,5\n412#1:1781,2\n632#1:1828\n632#1:1829,3\n675#1:1837\n675#1:1838,3\n821#1:1866\n821#1:1867,3\n*E\n"})
/* loaded from: classes3.dex */
public final class MarketplaceViewModel$onPacketIncoming$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ MarketplaceViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplaceViewModel$onPacketIncoming$1(JSONObject jSONObject, MarketplaceViewModel marketplaceViewModel, Continuation<? super MarketplaceViewModel$onPacketIncoming$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = marketplaceViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MarketplaceViewModel$onPacketIncoming$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MarketplaceViewModel$onPacketIncoming$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x05e1, code lost:
    
        r5 = r9.copy((r44 & 1) != 0 ? r9.isPlatinumVipProduct : false, (r44 & 2) != 0 ? r9.name : null, (r44 & 4) != 0 ? r9.imageName : null, (r44 & 8) != 0 ? r9.rarity : null, (r44 & 16) != 0 ? r9.typeProductCard : null, (r44 & 32) != 0 ? r9.id : 0, (r44 & 64) != 0 ? r9.notificationType : null, (r44 & 128) != 0 ? r9.timeVipCard : 0, (r44 & 256) != 0 ? r9.time : 0, (r44 & 512) != 0 ? r9.timeTemplate : 0, (r44 & 1024) != 0 ? r9.inventoryId : 0, (r44 & 2048) != 0 ? r9.price : 0, (r44 & 4096) != 0 ? r9.count : 0, (r44 & 8192) != 0 ? r9.seller : null, (r44 & 16384) != 0 ? r9.description : null, (r44 & 32768) != 0 ? r9.timeText : null, (r44 & 65536) != 0 ? r9.weight : 0.0d, (r44 & 131072) != 0 ? r9.typeTextRes : 0, (262144 & r44) != 0 ? r9.statusForHistory : null, (r44 & 524288) != 0 ? r9.isSelected : false, (r44 & 1048576) != 0 ? r9.isUser : false, (r44 & 2097152) != 0 ? r9.isPublished : false, (r44 & 4194304) != 0 ? r9.isHaveLike : false, (r44 & 8388608) != 0 ? r9.renderInfo : null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x101d, code lost:
    
        if (r7 == r10.getValue()) goto L316;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r77) {
        /*
            Method dump skipped, instructions count: 4430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onPacketIncoming$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
