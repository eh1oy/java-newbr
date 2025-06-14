package com.blackhub.bronline.game.gui.marketplace.model;

import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceRarityEnum;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: MarketplaceProduct.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a[\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012\u001a$\u0010\u0013\u001a\u00020\b*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017¨\u0006\u0018"}, d2 = {"getMarketplaceRenderInfo", "Lcom/blackhub/bronline/game/gui/cases/model/CaseRenderAttachment;", "invItem", "Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", CatchStreamerKeys.COUNT_KEY, "", "mapToMarketplaceProducts", "", "Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceProduct;", "Lorg/json/JSONArray;", "inventoryItems", "isPublished", "", "isUser", "isHaveLike", "timePlacement", "cardTypeInventory", "Lcom/blackhub/bronline/game/gui/marketplace/enums/MarketplaceTypeProductCardEnum;", "(Lorg/json/JSONArray;Ljava/util/List;ZZLjava/lang/Boolean;Ljava/lang/Integer;Lcom/blackhub/bronline/game/gui/marketplace/enums/MarketplaceTypeProductCardEnum;)Ljava/util/List;", "toMarketplaceProduct", "rarity", "Lcom/blackhub/bronline/game/gui/marketplace/enums/MarketplaceRarityEnum;", "name", "", "app_siteRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMarketplaceProduct.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceProduct.kt\ncom/blackhub/bronline/game/gui/marketplace/model/MarketplaceProductKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,433:1\n1#2:434\n*E\n"})
/* loaded from: classes3.dex */
public final class MarketplaceProductKt {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x010c, code lost:
    
        if (r3 == null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00c0 A[SYNTHETIC] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List<com.blackhub.bronline.game.gui.marketplace.model.MarketplaceProduct> mapToMarketplaceProducts(@org.jetbrains.annotations.NotNull org.json.JSONArray r39, @org.jetbrains.annotations.NotNull java.util.List<com.blackhub.bronline.game.gui.inventory.data.InvItems> r40, boolean r41, boolean r42, @org.jetbrains.annotations.Nullable java.lang.Boolean r43, @org.jetbrains.annotations.Nullable java.lang.Integer r44, @org.jetbrains.annotations.Nullable com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceTypeProductCardEnum r45) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.marketplace.model.MarketplaceProductKt.mapToMarketplaceProducts(org.json.JSONArray, java.util.List, boolean, boolean, java.lang.Boolean, java.lang.Integer, com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceTypeProductCardEnum):java.util.List");
    }

    public static /* synthetic */ MarketplaceProduct toMarketplaceProduct$default(InvItems invItems, int i, MarketplaceRarityEnum marketplaceRarityEnum, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return toMarketplaceProduct(invItems, i, marketplaceRarityEnum, str);
    }

    @NotNull
    public static final MarketplaceProduct toMarketplaceProduct(@NotNull InvItems invItems, int i, @NotNull MarketplaceRarityEnum rarity, @NotNull String name) {
        String str;
        Intrinsics.checkNotNullParameter(invItems, "<this>");
        Intrinsics.checkNotNullParameter(rarity, "rarity");
        Intrinsics.checkNotNullParameter(name, "name");
        if (name.length() == 0) {
            String str2 = (String) UtilsKt.buildTypeMerge(invItems.get_name(), invItems.get_nameStore());
            if (str2 == null) {
                str2 = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
            }
            str = str2;
        } else {
            str = name;
        }
        return new MarketplaceProduct(false, str, null, rarity, null, 0, null, 0, 0, 0, 0, 0L, 0, null, null, null, 0.0d, 0, null, false, false, false, false, getMarketplaceRenderInfo(invItems, i), 8388597, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.blackhub.bronline.game.gui.cases.model.CaseRenderAttachment getMarketplaceRenderInfo(@org.jetbrains.annotations.NotNull com.blackhub.bronline.game.gui.inventory.data.InvItems r16, int r17) {
        /*
            java.lang.String r0 = "invItem"
            r1 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r16.getId()
            r2 = 134(0x86, float:1.88E-43)
            r3 = 0
            r4 = 2
            if (r0 != r2) goto L13
            r6 = r4
            goto L14
        L13:
            r6 = r3
        L14:
            if (r6 == 0) goto L21
            if (r6 == r4) goto L1e
            int r0 = r16.getId()
        L1c:
            r7 = r0
            goto L2e
        L1e:
            r7 = r17
            goto L2e
        L21:
            int r0 = r16.getModelid()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = com.blackhub.bronline.game.core.extension.IntExtensionKt.getOrZero(r0)
            goto L1c
        L2e:
            if (r6 == 0) goto L3f
            r0 = 0
            if (r6 == r4) goto L3b
            r2 = 1061662228(0x3f47ae14, float:0.78)
        L36:
            r4 = r0
            r9 = r2
            r8 = r3
            r3 = r4
            goto L67
        L3b:
            r3 = 1
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L36
        L3f:
            float r0 = r16.getZoom()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            float r0 = com.blackhub.bronline.game.core.extension.FloatExtensionKt.getOrOne(r0)
            java.lang.Float r2 = r16.get_shiftX()
            float r2 = com.blackhub.bronline.game.core.extension.FloatExtensionKt.getOrOne(r2)
            java.lang.Float r3 = r16.get_shiftY()
            float r3 = com.blackhub.bronline.game.core.extension.FloatExtensionKt.getOrOne(r3)
            java.lang.Float r4 = r16.get_shiftZ()
            float r4 = com.blackhub.bronline.game.core.extension.FloatExtensionKt.getOrOne(r4)
            r5 = 3
            r9 = r0
            r0 = r2
            r8 = r5
        L67:
            com.blackhub.bronline.game.gui.cases.model.CaseRenderAttachment r2 = new com.blackhub.bronline.game.gui.cases.model.CaseRenderAttachment
            java.lang.Float r10 = r16.get_x()
            java.lang.Float r11 = r16.get_y()
            java.lang.Float r12 = r16.get_z()
            java.lang.Float r13 = java.lang.Float.valueOf(r0)
            java.lang.Float r14 = java.lang.Float.valueOf(r3)
            java.lang.Float r15 = java.lang.Float.valueOf(r4)
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.marketplace.model.MarketplaceProductKt.getMarketplaceRenderInfo(com.blackhub.bronline.game.gui.inventory.data.InvItems, int):com.blackhub.bronline.game.gui.cases.model.CaseRenderAttachment");
    }
}
