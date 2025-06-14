package com.blackhub.bronline.game.gui.upgradeobjectevent;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UpgradeObjectEventImages.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0013\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u0011\u0010\t\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0007R\u0011\u0010\u001a\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0007R\u0011\u0010\u001c\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0007R\u0011\u0010\u001e\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0007¨\u0006("}, d2 = {"Lcom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventImages;", "", "eventId", "", "(I)V", "currencyEventImage", "getCurrencyEventImage", "()I", "getEventId", "eventObjectIcon", "getEventObjectIcon", "giftBag", "getGiftBag", "()Ljava/lang/Integer;", "giftFourImage", "getGiftFourImage", "giftImage", "getGiftImage", "giftInfoImage", "getGiftInfoImage", "giftOneImage", "getGiftOneImage", "giftThreeImage", "getGiftThreeImage", "giftTwoImage", "getGiftTwoImage", "icButtonBg", "getIcButtonBg", "icReward", "getIcReward", "upgradeImage", "getUpgradeImage", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UpgradeObjectEventImages {
    public static final int $stable = 0;
    public final int eventId;

    public UpgradeObjectEventImages() {
        this(0, 1, null);
    }

    public static /* synthetic */ UpgradeObjectEventImages copy$default(UpgradeObjectEventImages upgradeObjectEventImages, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = upgradeObjectEventImages.eventId;
        }
        return upgradeObjectEventImages.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getEventId() {
        return this.eventId;
    }

    @NotNull
    public final UpgradeObjectEventImages copy(int eventId) {
        return new UpgradeObjectEventImages(eventId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UpgradeObjectEventImages) && this.eventId == ((UpgradeObjectEventImages) other).eventId;
    }

    public int hashCode() {
        return Integer.hashCode(this.eventId);
    }

    @NotNull
    public String toString() {
        return "UpgradeObjectEventImages(eventId=" + this.eventId + ")";
    }

    public UpgradeObjectEventImages(int i) {
        this.eventId = i;
    }

    public /* synthetic */ UpgradeObjectEventImages(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i);
    }

    public final int getEventId() {
        return this.eventId;
    }

    @DrawableRes
    public final int getCurrencyEventImage() {
        int i = this.eventId;
        return (i == 0 || i != 1) ? R.drawable.ic_christmas_tree_energy : R.drawable.ic_host_machine_chip;
    }

    @DrawableRes
    public final int getEventObjectIcon() {
        int i = this.eventId;
        return (i == 0 || i != 1) ? R.drawable.ic_christmas_tree : R.drawable.ic_data_storage_white;
    }

    @DrawableRes
    public final int getUpgradeImage() {
        int i = this.eventId;
        return (i == 0 || i != 1) ? R.drawable.ic_new_years_ball : R.drawable.ic_host_image_ram;
    }

    @DrawableRes
    public final int getGiftImage() {
        int i = this.eventId;
        return (i == 0 || i != 1) ? R.drawable.ic_gift_green_small : R.drawable.ic_green_host_gift;
    }

    @DrawableRes
    public final int getGiftOneImage() {
        int i = this.eventId;
        return (i == 0 || i != 1) ? R.drawable.ic_gift_red : R.drawable.ic_giftbox_blue;
    }

    @DrawableRes
    public final int getGiftTwoImage() {
        int i = this.eventId;
        return i != 0 ? i != 1 ? R.drawable.ic_gift_red : R.drawable.ic_giftbox_pink : R.drawable.ic_gift_green;
    }

    @DrawableRes
    public final int getGiftThreeImage() {
        int i = this.eventId;
        return i != 0 ? i != 1 ? R.drawable.ic_gift_red : R.drawable.ic_giftbox_pink_heart : R.drawable.ic_gift_blue;
    }

    @DrawableRes
    public final int getGiftFourImage() {
        int i = this.eventId;
        return i != 0 ? i != 1 ? R.drawable.ic_gift_red : R.drawable.ic_giftbox_red : R.drawable.ic_gift_white_red;
    }

    @DrawableRes
    public final int getIcReward() {
        int i = this.eventId;
        return (i == 0 || i != 1) ? R.drawable.ic_reward : R.drawable.ic_reward_grey;
    }

    @DrawableRes
    @Nullable
    public final Integer getGiftBag() {
        if (this.eventId == 0) {
            return Integer.valueOf(R.drawable.ic_bag_front);
        }
        return null;
    }

    @DrawableRes
    public final int getGiftInfoImage() {
        int i = this.eventId;
        return (i == 0 || i != 1) ? R.drawable.ic_lot_gifts : R.drawable.ic_lot_host_gift;
    }

    @DrawableRes
    public final int getIcButtonBg() {
        int i = this.eventId;
        return i != 0 ? i != 1 ? R.drawable.ic_bag_front : R.drawable.ic_server : R.drawable.ic_christmas_tree_gray;
    }
}
