package com.blackhub.bronline.game.gui.blackpass.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TimerHoursAndMinutes.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/blackhub/bronline/game/gui/blackpass/data/TimerHoursAndMinutes;", "", "hours", "", "minutes", "(II)V", "getHours", "()I", "setHours", "(I)V", "getMinutes", "setMinutes", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TimerHoursAndMinutes {
    public static final int $stable = 8;
    public int hours;
    public int minutes;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TimerHoursAndMinutes() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.blackpass.data.TimerHoursAndMinutes.<init>():void");
    }

    public static /* synthetic */ TimerHoursAndMinutes copy$default(TimerHoursAndMinutes timerHoursAndMinutes, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = timerHoursAndMinutes.hours;
        }
        if ((i3 & 2) != 0) {
            i2 = timerHoursAndMinutes.minutes;
        }
        return timerHoursAndMinutes.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getHours() {
        return this.hours;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMinutes() {
        return this.minutes;
    }

    @NotNull
    public final TimerHoursAndMinutes copy(int hours, int minutes) {
        return new TimerHoursAndMinutes(hours, minutes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerHoursAndMinutes)) {
            return false;
        }
        TimerHoursAndMinutes timerHoursAndMinutes = (TimerHoursAndMinutes) other;
        return this.hours == timerHoursAndMinutes.hours && this.minutes == timerHoursAndMinutes.minutes;
    }

    public int hashCode() {
        return (Integer.hashCode(this.hours) * 31) + Integer.hashCode(this.minutes);
    }

    @NotNull
    public String toString() {
        return "TimerHoursAndMinutes(hours=" + this.hours + ", minutes=" + this.minutes + ")";
    }

    public TimerHoursAndMinutes(int i, int i2) {
        this.hours = i;
        this.minutes = i2;
    }

    public /* synthetic */ TimerHoursAndMinutes(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public final int getHours() {
        return this.hours;
    }

    public final void setHours(int i) {
        this.hours = i;
    }

    public final int getMinutes() {
        return this.minutes;
    }

    public final void setMinutes(int i) {
        this.minutes = i;
    }
}
