package com.blackhub.bronline.game.core.utils.draganddrop.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CurrentElement.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/blackhub/bronline/game/core/utils/draganddrop/enums/CurrentElement;", "", "(Ljava/lang/String;I)V", "ELEMENT_ONE", "ELEMENT_TWO", "ELEMENT_THREE", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CurrentElement {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ CurrentElement[] $VALUES;
    public static final CurrentElement ELEMENT_ONE = new CurrentElement("ELEMENT_ONE", 0);
    public static final CurrentElement ELEMENT_TWO = new CurrentElement("ELEMENT_TWO", 1);
    public static final CurrentElement ELEMENT_THREE = new CurrentElement("ELEMENT_THREE", 2);

    public static final /* synthetic */ CurrentElement[] $values() {
        return new CurrentElement[]{ELEMENT_ONE, ELEMENT_TWO, ELEMENT_THREE};
    }

    @NotNull
    public static EnumEntries<CurrentElement> getEntries() {
        return $ENTRIES;
    }

    public static CurrentElement valueOf(String str) {
        return (CurrentElement) Enum.valueOf(CurrentElement.class, str);
    }

    public static CurrentElement[] values() {
        return (CurrentElement[]) $VALUES.clone();
    }

    public CurrentElement(String str, int i) {
    }

    static {
        CurrentElement[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
