package com.blackhub.bronline.game.gui.entertainmentsystem.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: EntertainmentPlayersData.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/blackhub/bronline/game/gui/entertainmentsystem/data/EntertainmentPlayersData;", "", "position", "", "playersNick", "", "thisGame", "allGames", "leftIcon", "rightIcon", "(ILjava/lang/String;ILjava/lang/String;II)V", "getAllGames", "()Ljava/lang/String;", "getLeftIcon", "()I", "getPlayersNick", "getPosition", "getRightIcon", "getThisGame", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EntertainmentPlayersData {
    public static final int $stable = 0;

    @NotNull
    public final String allGames;
    public final int leftIcon;

    @NotNull
    public final String playersNick;
    public final int position;
    public final int rightIcon;
    public final int thisGame;

    public static /* synthetic */ EntertainmentPlayersData copy$default(EntertainmentPlayersData entertainmentPlayersData, int i, String str, int i2, String str2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = entertainmentPlayersData.position;
        }
        if ((i5 & 2) != 0) {
            str = entertainmentPlayersData.playersNick;
        }
        String str3 = str;
        if ((i5 & 4) != 0) {
            i2 = entertainmentPlayersData.thisGame;
        }
        int i6 = i2;
        if ((i5 & 8) != 0) {
            str2 = entertainmentPlayersData.allGames;
        }
        String str4 = str2;
        if ((i5 & 16) != 0) {
            i3 = entertainmentPlayersData.leftIcon;
        }
        int i7 = i3;
        if ((i5 & 32) != 0) {
            i4 = entertainmentPlayersData.rightIcon;
        }
        return entertainmentPlayersData.copy(i, str3, i6, str4, i7, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPlayersNick() {
        return this.playersNick;
    }

    /* renamed from: component3, reason: from getter */
    public final int getThisGame() {
        return this.thisGame;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getAllGames() {
        return this.allGames;
    }

    /* renamed from: component5, reason: from getter */
    public final int getLeftIcon() {
        return this.leftIcon;
    }

    /* renamed from: component6, reason: from getter */
    public final int getRightIcon() {
        return this.rightIcon;
    }

    @NotNull
    public final EntertainmentPlayersData copy(int position, @NotNull String playersNick, int thisGame, @NotNull String allGames, int leftIcon, int rightIcon) {
        Intrinsics.checkNotNullParameter(playersNick, "playersNick");
        Intrinsics.checkNotNullParameter(allGames, "allGames");
        return new EntertainmentPlayersData(position, playersNick, thisGame, allGames, leftIcon, rightIcon);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntertainmentPlayersData)) {
            return false;
        }
        EntertainmentPlayersData entertainmentPlayersData = (EntertainmentPlayersData) other;
        return this.position == entertainmentPlayersData.position && Intrinsics.areEqual(this.playersNick, entertainmentPlayersData.playersNick) && this.thisGame == entertainmentPlayersData.thisGame && Intrinsics.areEqual(this.allGames, entertainmentPlayersData.allGames) && this.leftIcon == entertainmentPlayersData.leftIcon && this.rightIcon == entertainmentPlayersData.rightIcon;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.position) * 31) + this.playersNick.hashCode()) * 31) + Integer.hashCode(this.thisGame)) * 31) + this.allGames.hashCode()) * 31) + Integer.hashCode(this.leftIcon)) * 31) + Integer.hashCode(this.rightIcon);
    }

    @NotNull
    public String toString() {
        return "EntertainmentPlayersData(position=" + this.position + ", playersNick=" + this.playersNick + ", thisGame=" + this.thisGame + ", allGames=" + this.allGames + ", leftIcon=" + this.leftIcon + ", rightIcon=" + this.rightIcon + ")";
    }

    public EntertainmentPlayersData(int i, @NotNull String playersNick, int i2, @NotNull String allGames, int i3, int i4) {
        Intrinsics.checkNotNullParameter(playersNick, "playersNick");
        Intrinsics.checkNotNullParameter(allGames, "allGames");
        this.position = i;
        this.playersNick = playersNick;
        this.thisGame = i2;
        this.allGames = allGames;
        this.leftIcon = i3;
        this.rightIcon = i4;
    }

    public final int getPosition() {
        return this.position;
    }

    @NotNull
    public final String getPlayersNick() {
        return this.playersNick;
    }

    public final int getThisGame() {
        return this.thisGame;
    }

    @NotNull
    public final String getAllGames() {
        return this.allGames;
    }

    public final int getLeftIcon() {
        return this.leftIcon;
    }

    public final int getRightIcon() {
        return this.rightIcon;
    }
}
