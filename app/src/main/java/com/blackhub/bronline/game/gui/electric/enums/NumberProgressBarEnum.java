package com.blackhub.bronline.game.gui.electric.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NumberProgressBarEnum.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/blackhub/bronline/game/gui/electric/enums/NumberProgressBarEnum;", "", "(Ljava/lang/String;I)V", "PROGRESS_BAR_ONE", "PROGRESS_BAR_TWO", "PROGRESS_BAR_THREE", "PROGRESS_BAR_FOUR", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NumberProgressBarEnum {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ NumberProgressBarEnum[] $VALUES;
    public static final NumberProgressBarEnum PROGRESS_BAR_ONE = new NumberProgressBarEnum("PROGRESS_BAR_ONE", 0);
    public static final NumberProgressBarEnum PROGRESS_BAR_TWO = new NumberProgressBarEnum("PROGRESS_BAR_TWO", 1);
    public static final NumberProgressBarEnum PROGRESS_BAR_THREE = new NumberProgressBarEnum("PROGRESS_BAR_THREE", 2);
    public static final NumberProgressBarEnum PROGRESS_BAR_FOUR = new NumberProgressBarEnum("PROGRESS_BAR_FOUR", 3);

    public static final /* synthetic */ NumberProgressBarEnum[] $values() {
        return new NumberProgressBarEnum[]{PROGRESS_BAR_ONE, PROGRESS_BAR_TWO, PROGRESS_BAR_THREE, PROGRESS_BAR_FOUR};
    }

    @NotNull
    public static EnumEntries<NumberProgressBarEnum> getEntries() {
        return $ENTRIES;
    }

    public static NumberProgressBarEnum valueOf(String str) {
        return (NumberProgressBarEnum) Enum.valueOf(NumberProgressBarEnum.class, str);
    }

    public static NumberProgressBarEnum[] values() {
        return (NumberProgressBarEnum[]) $VALUES.clone();
    }

    public NumberProgressBarEnum(String str, int i) {
    }

    static {
        NumberProgressBarEnum[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
