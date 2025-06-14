package com.blackhub.bronline.game.gui.donate.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: ItemForDialogConfirmation.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J|\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0003HÖ\u0001J\t\u00108\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u001b\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015¨\u00069"}, d2 = {"Lcom/blackhub/bronline/game/gui/donate/data/ItemForDialogConfirmation;", "", "taskId", "", "bodyMessage", "", FirebaseAnalytics.Param.PRICE, "levels", "priceCurrency", "caption", "textForButtonOK", "textForButtonCancel", "carColor", "action", "(Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAction", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBodyMessage", "()Ljava/lang/String;", "setBodyMessage", "(Ljava/lang/String;)V", "getCaption", "setCaption", "getCarColor", "setCarColor", "(Ljava/lang/Integer;)V", "getLevels", "getPrice", "()I", "setPrice", "(I)V", "getPriceCurrency", "setPriceCurrency", "getTaskId", "setTaskId", "getTextForButtonCancel", "setTextForButtonCancel", "getTextForButtonOK", "setTextForButtonOK", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/blackhub/bronline/game/gui/donate/data/ItemForDialogConfirmation;", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ItemForDialogConfirmation {
    public static final int $stable = 8;

    @Nullable
    public final Integer action;

    @NotNull
    public String bodyMessage;

    @NotNull
    public String caption;

    @Nullable
    public Integer carColor;

    @Nullable
    public final Integer levels;
    public int price;

    @Nullable
    public String priceCurrency;

    @Nullable
    public Integer taskId;

    @NotNull
    public String textForButtonCancel;

    @NotNull
    public String textForButtonOK;

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getTaskId() {
        return this.taskId;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getAction() {
        return this.action;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBodyMessage() {
        return this.bodyMessage;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPrice() {
        return this.price;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getLevels() {
        return this.levels;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getPriceCurrency() {
        return this.priceCurrency;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getTextForButtonOK() {
        return this.textForButtonOK;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getTextForButtonCancel() {
        return this.textForButtonCancel;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getCarColor() {
        return this.carColor;
    }

    @NotNull
    public final ItemForDialogConfirmation copy(@Nullable Integer taskId, @NotNull String bodyMessage, int price, @Nullable Integer levels, @Nullable String priceCurrency, @NotNull String caption, @NotNull String textForButtonOK, @NotNull String textForButtonCancel, @Nullable Integer carColor, @Nullable Integer action) {
        Intrinsics.checkNotNullParameter(bodyMessage, "bodyMessage");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(textForButtonOK, "textForButtonOK");
        Intrinsics.checkNotNullParameter(textForButtonCancel, "textForButtonCancel");
        return new ItemForDialogConfirmation(taskId, bodyMessage, price, levels, priceCurrency, caption, textForButtonOK, textForButtonCancel, carColor, action);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemForDialogConfirmation)) {
            return false;
        }
        ItemForDialogConfirmation itemForDialogConfirmation = (ItemForDialogConfirmation) other;
        return Intrinsics.areEqual(this.taskId, itemForDialogConfirmation.taskId) && Intrinsics.areEqual(this.bodyMessage, itemForDialogConfirmation.bodyMessage) && this.price == itemForDialogConfirmation.price && Intrinsics.areEqual(this.levels, itemForDialogConfirmation.levels) && Intrinsics.areEqual(this.priceCurrency, itemForDialogConfirmation.priceCurrency) && Intrinsics.areEqual(this.caption, itemForDialogConfirmation.caption) && Intrinsics.areEqual(this.textForButtonOK, itemForDialogConfirmation.textForButtonOK) && Intrinsics.areEqual(this.textForButtonCancel, itemForDialogConfirmation.textForButtonCancel) && Intrinsics.areEqual(this.carColor, itemForDialogConfirmation.carColor) && Intrinsics.areEqual(this.action, itemForDialogConfirmation.action);
    }

    public int hashCode() {
        Integer num = this.taskId;
        int hashCode = (((((num == null ? 0 : num.hashCode()) * 31) + this.bodyMessage.hashCode()) * 31) + Integer.hashCode(this.price)) * 31;
        Integer num2 = this.levels;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.priceCurrency;
        int hashCode3 = (((((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.caption.hashCode()) * 31) + this.textForButtonOK.hashCode()) * 31) + this.textForButtonCancel.hashCode()) * 31;
        Integer num3 = this.carColor;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.action;
        return hashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ItemForDialogConfirmation(taskId=" + this.taskId + ", bodyMessage=" + this.bodyMessage + ", price=" + this.price + ", levels=" + this.levels + ", priceCurrency=" + this.priceCurrency + ", caption=" + this.caption + ", textForButtonOK=" + this.textForButtonOK + ", textForButtonCancel=" + this.textForButtonCancel + ", carColor=" + this.carColor + ", action=" + this.action + ")";
    }

    public ItemForDialogConfirmation(@Nullable Integer num, @NotNull String bodyMessage, int i, @Nullable Integer num2, @Nullable String str, @NotNull String caption, @NotNull String textForButtonOK, @NotNull String textForButtonCancel, @Nullable Integer num3, @Nullable Integer num4) {
        Intrinsics.checkNotNullParameter(bodyMessage, "bodyMessage");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(textForButtonOK, "textForButtonOK");
        Intrinsics.checkNotNullParameter(textForButtonCancel, "textForButtonCancel");
        this.taskId = num;
        this.bodyMessage = bodyMessage;
        this.price = i;
        this.levels = num2;
        this.priceCurrency = str;
        this.caption = caption;
        this.textForButtonOK = textForButtonOK;
        this.textForButtonCancel = textForButtonCancel;
        this.carColor = num3;
        this.action = num4;
    }

    @Nullable
    public final Integer getTaskId() {
        return this.taskId;
    }

    public final void setTaskId(@Nullable Integer num) {
        this.taskId = num;
    }

    @NotNull
    public final String getBodyMessage() {
        return this.bodyMessage;
    }

    public final void setBodyMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bodyMessage = str;
    }

    public final int getPrice() {
        return this.price;
    }

    public final void setPrice(int i) {
        this.price = i;
    }

    @Nullable
    public final Integer getLevels() {
        return this.levels;
    }

    public /* synthetic */ ItemForDialogConfirmation(Integer num, String str, int i, Integer num2, String str2, String str3, String str4, String str5, Integer num3, Integer num4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, str, i, (i2 & 8) != 0 ? null : num2, (i2 & 16) != 0 ? "" : str2, str3, str4, str5, (i2 & 256) != 0 ? null : num3, (i2 & 512) != 0 ? null : num4);
    }

    @Nullable
    public final String getPriceCurrency() {
        return this.priceCurrency;
    }

    public final void setPriceCurrency(@Nullable String str) {
        this.priceCurrency = str;
    }

    @NotNull
    public final String getCaption() {
        return this.caption;
    }

    public final void setCaption(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.caption = str;
    }

    @NotNull
    public final String getTextForButtonOK() {
        return this.textForButtonOK;
    }

    public final void setTextForButtonOK(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.textForButtonOK = str;
    }

    @NotNull
    public final String getTextForButtonCancel() {
        return this.textForButtonCancel;
    }

    public final void setTextForButtonCancel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.textForButtonCancel = str;
    }

    @Nullable
    public final Integer getCarColor() {
        return this.carColor;
    }

    public final void setCarColor(@Nullable Integer num) {
        this.carColor = num;
    }

    @Nullable
    public final Integer getAction() {
        return this.action;
    }
}
