package com.blackhub.bronline.game.gui.marketplace;

import com.blackhub.bronline.game.gui.craft.model.response.CraftJsonCategoryFilter;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.model.remote.response.marketplace.MarketplaceConfig;
import java.util.List;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$initJson$1", f = "MarketplaceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$initJson$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n1549#2:1770\n1620#2,2:1771\n1549#2:1773\n1620#2,3:1774\n1622#2:1777\n230#3,5:1778\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$initJson$1\n*L\n205#1:1770\n205#1:1771,2\n206#1:1773\n206#1:1774,3\n205#1:1777\n279#1:1778,5\n*E\n"})
/* loaded from: classes3.dex */
public final class MarketplaceViewModel$initJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ List<InvItems> $inventoryItems;
    public final /* synthetic */ JSONObject $json;
    public final /* synthetic */ List<CraftJsonCategoryFilter> $marketplaceCategoriesFilters;
    public final /* synthetic */ List<MarketplaceConfig> $marketplaceConfigList;
    public int label;
    public final /* synthetic */ MarketplaceViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplaceViewModel$initJson$1(MarketplaceViewModel marketplaceViewModel, JSONObject jSONObject, List<InvItems> list, List<MarketplaceConfig> list2, List<CraftJsonCategoryFilter> list3, Continuation<? super MarketplaceViewModel$initJson$1> continuation) {
        super(2, continuation);
        this.this$0 = marketplaceViewModel;
        this.$json = jSONObject;
        this.$inventoryItems = list;
        this.$marketplaceConfigList = list2;
        this.$marketplaceCategoriesFilters = list3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MarketplaceViewModel$initJson$1(this.this$0, this.$json, this.$inventoryItems, this.$marketplaceConfigList, this.$marketplaceCategoriesFilters, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MarketplaceViewModel$initJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0174 A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:6:0x001d, B:8:0x004e, B:10:0x0077, B:11:0x007b, B:14:0x0089, B:17:0x0096, B:19:0x00a6, B:21:0x00b9, B:23:0x00bf, B:25:0x00cb, B:36:0x00ef, B:38:0x00f5, B:39:0x00fe, B:41:0x0104, B:42:0x010d, B:44:0x0113, B:45:0x011c, B:47:0x0122, B:48:0x012b, B:51:0x0143, B:53:0x015d, B:54:0x016e, B:56:0x0174, B:57:0x018d, B:59:0x0193, B:62:0x01bf, B:66:0x01c9, B:69:0x01f4, B:73:0x0211, B:74:0x0306, B:78:0x036e), top: B:5:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0372 A[LOOP:2: B:74:0x0306->B:76:0x0372, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x036e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r59) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$initJson$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
