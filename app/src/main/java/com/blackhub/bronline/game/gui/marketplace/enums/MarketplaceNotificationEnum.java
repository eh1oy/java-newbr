package com.blackhub.bronline.game.gui.marketplace.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketplaceNotificationEnum.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/blackhub/bronline/game/gui/marketplace/enums/MarketplaceNotificationEnum;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NOTHING", "HOT", "THE_BEST", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MarketplaceNotificationEnum {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ MarketplaceNotificationEnum[] $VALUES;
    public final int value;
    public static final MarketplaceNotificationEnum NOTHING = new MarketplaceNotificationEnum("NOTHING", 0, 0);
    public static final MarketplaceNotificationEnum HOT = new MarketplaceNotificationEnum("HOT", 1, 1);
    public static final MarketplaceNotificationEnum THE_BEST = new MarketplaceNotificationEnum("THE_BEST", 2, 2);

    public static final /* synthetic */ MarketplaceNotificationEnum[] $values() {
        return new MarketplaceNotificationEnum[]{NOTHING, HOT, THE_BEST};
    }

    @NotNull
    public static EnumEntries<MarketplaceNotificationEnum> getEntries() {
        return $ENTRIES;
    }

    public static MarketplaceNotificationEnum valueOf(String str) {
        return (MarketplaceNotificationEnum) Enum.valueOf(MarketplaceNotificationEnum.class, str);
    }

    public static MarketplaceNotificationEnum[] values() {
        return (MarketplaceNotificationEnum[]) $VALUES.clone();
    }

    public MarketplaceNotificationEnum(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        MarketplaceNotificationEnum[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
