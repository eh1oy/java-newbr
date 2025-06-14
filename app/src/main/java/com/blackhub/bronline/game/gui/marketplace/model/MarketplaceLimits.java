package com.blackhub.bronline.game.gui.marketplace.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: MarketplaceLimits.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\""}, d2 = {"Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceLimits;", "", "productCardsCanSell", "", "hotProductCardsCanSell", "priceForPublish", "hotTicketCost", "canUseAdds", "", "sellTax", "placementHours", "(IIIIZII)V", "getCanUseAdds", "()Z", "getHotProductCardsCanSell", "()I", "getHotTicketCost", "getPlacementHours", "getPriceForPublish", "getProductCardsCanSell", "getSellTax", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MarketplaceLimits {
    public static final int $stable = 0;
    public final boolean canUseAdds;
    public final int hotProductCardsCanSell;
    public final int hotTicketCost;
    public final int placementHours;
    public final int priceForPublish;
    public final int productCardsCanSell;
    public final int sellTax;

    public MarketplaceLimits() {
        this(0, 0, 0, 0, false, 0, 0, 127, null);
    }

    public static /* synthetic */ MarketplaceLimits copy$default(MarketplaceLimits marketplaceLimits, int i, int i2, int i3, int i4, boolean z, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = marketplaceLimits.productCardsCanSell;
        }
        if ((i7 & 2) != 0) {
            i2 = marketplaceLimits.hotProductCardsCanSell;
        }
        int i8 = i2;
        if ((i7 & 4) != 0) {
            i3 = marketplaceLimits.priceForPublish;
        }
        int i9 = i3;
        if ((i7 & 8) != 0) {
            i4 = marketplaceLimits.hotTicketCost;
        }
        int i10 = i4;
        if ((i7 & 16) != 0) {
            z = marketplaceLimits.canUseAdds;
        }
        boolean z2 = z;
        if ((i7 & 32) != 0) {
            i5 = marketplaceLimits.sellTax;
        }
        int i11 = i5;
        if ((i7 & 64) != 0) {
            i6 = marketplaceLimits.placementHours;
        }
        return marketplaceLimits.copy(i, i8, i9, i10, z2, i11, i6);
    }

    /* renamed from: component1, reason: from getter */
    public final int getProductCardsCanSell() {
        return this.productCardsCanSell;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHotProductCardsCanSell() {
        return this.hotProductCardsCanSell;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPriceForPublish() {
        return this.priceForPublish;
    }

    /* renamed from: component4, reason: from getter */
    public final int getHotTicketCost() {
        return this.hotTicketCost;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getCanUseAdds() {
        return this.canUseAdds;
    }

    /* renamed from: component6, reason: from getter */
    public final int getSellTax() {
        return this.sellTax;
    }

    /* renamed from: component7, reason: from getter */
    public final int getPlacementHours() {
        return this.placementHours;
    }

    @NotNull
    public final MarketplaceLimits copy(int productCardsCanSell, int hotProductCardsCanSell, int priceForPublish, int hotTicketCost, boolean canUseAdds, int sellTax, int placementHours) {
        return new MarketplaceLimits(productCardsCanSell, hotProductCardsCanSell, priceForPublish, hotTicketCost, canUseAdds, sellTax, placementHours);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketplaceLimits)) {
            return false;
        }
        MarketplaceLimits marketplaceLimits = (MarketplaceLimits) other;
        return this.productCardsCanSell == marketplaceLimits.productCardsCanSell && this.hotProductCardsCanSell == marketplaceLimits.hotProductCardsCanSell && this.priceForPublish == marketplaceLimits.priceForPublish && this.hotTicketCost == marketplaceLimits.hotTicketCost && this.canUseAdds == marketplaceLimits.canUseAdds && this.sellTax == marketplaceLimits.sellTax && this.placementHours == marketplaceLimits.placementHours;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.productCardsCanSell) * 31) + Integer.hashCode(this.hotProductCardsCanSell)) * 31) + Integer.hashCode(this.priceForPublish)) * 31) + Integer.hashCode(this.hotTicketCost)) * 31) + Boolean.hashCode(this.canUseAdds)) * 31) + Integer.hashCode(this.sellTax)) * 31) + Integer.hashCode(this.placementHours);
    }

    @NotNull
    public String toString() {
        return "MarketplaceLimits(productCardsCanSell=" + this.productCardsCanSell + ", hotProductCardsCanSell=" + this.hotProductCardsCanSell + ", priceForPublish=" + this.priceForPublish + ", hotTicketCost=" + this.hotTicketCost + ", canUseAdds=" + this.canUseAdds + ", sellTax=" + this.sellTax + ", placementHours=" + this.placementHours + ")";
    }

    public MarketplaceLimits(int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
        this.productCardsCanSell = i;
        this.hotProductCardsCanSell = i2;
        this.priceForPublish = i3;
        this.hotTicketCost = i4;
        this.canUseAdds = z;
        this.sellTax = i5;
        this.placementHours = i6;
    }

    public /* synthetic */ MarketplaceLimits(int i, int i2, int i3, int i4, boolean z, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? 1000 : i3, (i7 & 8) != 0 ? 0 : i4, (i7 & 16) != 0 ? false : z, (i7 & 32) != 0 ? 0 : i5, (i7 & 64) != 0 ? 0 : i6);
    }

    public final int getProductCardsCanSell() {
        return this.productCardsCanSell;
    }

    public final int getHotProductCardsCanSell() {
        return this.hotProductCardsCanSell;
    }

    public final int getPriceForPublish() {
        return this.priceForPublish;
    }

    public final int getHotTicketCost() {
        return this.hotTicketCost;
    }

    public final boolean getCanUseAdds() {
        return this.canUseAdds;
    }

    public final int getSellTax() {
        return this.sellTax;
    }

    public final int getPlacementHours() {
        return this.placementHours;
    }
}
