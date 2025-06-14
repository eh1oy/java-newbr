package com.blackhub.bronline.game.gui.rateapp;

import androidx.annotation.DimenRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.R;
import com.blackhub.bronline.common.AppMetricaDescription;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: RateAppUiState.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0002\u0010\fJ\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\t\u0010%\u001a\u00020\u0004HÆ\u0003JU\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\u0013\u0010'\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u0006HÖ\u0001J\t\u0010+\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0017R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u001d\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012¨\u0006,"}, d2 = {"Lcom/blackhub/bronline/game/gui/rateapp/RateAppUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "listOfCheckedStars", "", "", "starChecked", "", "categoryId", "isFiveStars", "isButtonEnabled", "isNeedToRequestReview", "isNeedClose", "(Ljava/util/List;IIZZZZ)V", "categoryDescription", "", "getCategoryDescription", "()Ljava/lang/String;", "getCategoryId", "()I", "heightForButtonRatePlusShadow", "getHeightForButtonRatePlusShadow", "heightForItem", "getHeightForItem", "()Z", "getListOfCheckedStars", "()Ljava/util/List;", "paddingForButtonRate", "getPaddingForButtonRate", "getStarChecked", "widthForButtonRatePlusShadow", "getWidthForButtonRatePlusShadow", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "toString", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRateAppUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RateAppUiState.kt\ncom/blackhub/bronline/game/gui/rateapp/RateAppUiState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
/* loaded from: classes3.dex */
public final /* data */ class RateAppUiState implements UiState {
    public static final int $stable = 8;
    public final int categoryId;
    public final boolean isButtonEnabled;
    public final boolean isFiveStars;
    public final boolean isNeedClose;
    public final boolean isNeedToRequestReview;

    @NotNull
    public final List<Boolean> listOfCheckedStars;
    public final int starChecked;

    public RateAppUiState() {
        this(null, 0, 0, false, false, false, false, 127, null);
    }

    public static /* synthetic */ RateAppUiState copy$default(RateAppUiState rateAppUiState, List list, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = rateAppUiState.listOfCheckedStars;
        }
        if ((i3 & 2) != 0) {
            i = rateAppUiState.starChecked;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = rateAppUiState.categoryId;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            z = rateAppUiState.isFiveStars;
        }
        boolean z5 = z;
        if ((i3 & 16) != 0) {
            z2 = rateAppUiState.isButtonEnabled;
        }
        boolean z6 = z2;
        if ((i3 & 32) != 0) {
            z3 = rateAppUiState.isNeedToRequestReview;
        }
        boolean z7 = z3;
        if ((i3 & 64) != 0) {
            z4 = rateAppUiState.isNeedClose;
        }
        return rateAppUiState.copy(list, i4, i5, z5, z6, z7, z4);
    }

    @NotNull
    public final List<Boolean> component1() {
        return this.listOfCheckedStars;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStarChecked() {
        return this.starChecked;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCategoryId() {
        return this.categoryId;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsFiveStars() {
        return this.isFiveStars;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsButtonEnabled() {
        return this.isButtonEnabled;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsNeedToRequestReview() {
        return this.isNeedToRequestReview;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    @NotNull
    public final RateAppUiState copy(@NotNull List<Boolean> listOfCheckedStars, int starChecked, int categoryId, boolean isFiveStars, boolean isButtonEnabled, boolean isNeedToRequestReview, boolean isNeedClose) {
        Intrinsics.checkNotNullParameter(listOfCheckedStars, "listOfCheckedStars");
        return new RateAppUiState(listOfCheckedStars, starChecked, categoryId, isFiveStars, isButtonEnabled, isNeedToRequestReview, isNeedClose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateAppUiState)) {
            return false;
        }
        RateAppUiState rateAppUiState = (RateAppUiState) other;
        return Intrinsics.areEqual(this.listOfCheckedStars, rateAppUiState.listOfCheckedStars) && this.starChecked == rateAppUiState.starChecked && this.categoryId == rateAppUiState.categoryId && this.isFiveStars == rateAppUiState.isFiveStars && this.isButtonEnabled == rateAppUiState.isButtonEnabled && this.isNeedToRequestReview == rateAppUiState.isNeedToRequestReview && this.isNeedClose == rateAppUiState.isNeedClose;
    }

    public int hashCode() {
        return (((((((((((this.listOfCheckedStars.hashCode() * 31) + Integer.hashCode(this.starChecked)) * 31) + Integer.hashCode(this.categoryId)) * 31) + Boolean.hashCode(this.isFiveStars)) * 31) + Boolean.hashCode(this.isButtonEnabled)) * 31) + Boolean.hashCode(this.isNeedToRequestReview)) * 31) + Boolean.hashCode(this.isNeedClose);
    }

    @NotNull
    public String toString() {
        return "RateAppUiState(listOfCheckedStars=" + this.listOfCheckedStars + ", starChecked=" + this.starChecked + ", categoryId=" + this.categoryId + ", isFiveStars=" + this.isFiveStars + ", isButtonEnabled=" + this.isButtonEnabled + ", isNeedToRequestReview=" + this.isNeedToRequestReview + ", isNeedClose=" + this.isNeedClose + ")";
    }

    public RateAppUiState(@NotNull List<Boolean> listOfCheckedStars, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(listOfCheckedStars, "listOfCheckedStars");
        this.listOfCheckedStars = listOfCheckedStars;
        this.starChecked = i;
        this.categoryId = i2;
        this.isFiveStars = z;
        this.isButtonEnabled = z2;
        this.isNeedToRequestReview = z3;
        this.isNeedClose = z4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ RateAppUiState(java.util.List r9, int r10, int r11, boolean r12, boolean r13, boolean r14, boolean r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 1
            r1 = 0
            if (r0 == 0) goto L16
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 5
            r0.<init>(r2)
            r3 = r1
        Lc:
            if (r3 >= r2) goto L17
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r0.add(r4)
            int r3 = r3 + 1
            goto Lc
        L16:
            r0 = r9
        L17:
            r2 = r16 & 2
            if (r2 == 0) goto L1d
            r2 = r1
            goto L1e
        L1d:
            r2 = r10
        L1e:
            r3 = r16 & 4
            if (r3 == 0) goto L24
            r3 = r1
            goto L25
        L24:
            r3 = r11
        L25:
            r4 = r16 & 8
            if (r4 == 0) goto L2b
            r4 = r1
            goto L2c
        L2b:
            r4 = r12
        L2c:
            r5 = r16 & 16
            if (r5 == 0) goto L32
            r5 = r1
            goto L33
        L32:
            r5 = r13
        L33:
            r6 = r16 & 32
            if (r6 == 0) goto L39
            r6 = r1
            goto L3a
        L39:
            r6 = r14
        L3a:
            r7 = r16 & 64
            if (r7 == 0) goto L3f
            goto L40
        L3f:
            r1 = r15
        L40:
            r9 = r8
            r10 = r0
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.rateapp.RateAppUiState.<init>(java.util.List, int, int, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public final List<Boolean> getListOfCheckedStars() {
        return this.listOfCheckedStars;
    }

    public final int getStarChecked() {
        return this.starChecked;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public final boolean isFiveStars() {
        return this.isFiveStars;
    }

    public final boolean isButtonEnabled() {
        return this.isButtonEnabled;
    }

    public final boolean isNeedToRequestReview() {
        return this.isNeedToRequestReview;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }

    @DimenRes
    public final int getHeightForItem() {
        return this.isFiveStars ? R.dimen._141sdp : R.dimen._170sdp;
    }

    @DimenRes
    public final int getHeightForButtonRatePlusShadow() {
        return this.isButtonEnabled ? R.dimen._40sdp : R.dimen._30sdp;
    }

    @DimenRes
    public final int getWidthForButtonRatePlusShadow() {
        return this.isButtonEnabled ? R.dimen._130sdp : R.dimen._117sdp;
    }

    @DimenRes
    public final int getPaddingForButtonRate() {
        return this.isButtonEnabled ? R.dimen.zero_dp : R.dimen._5sdp;
    }

    @NotNull
    public final String getCategoryDescription() {
        switch (this.categoryId) {
            case 1:
                return AppMetricaDescription.BOUGHT_HOUSE;
            case 2:
                return AppMetricaDescription.BOUGHT_CAR;
            case 3:
                return AppMetricaDescription.OPENED_CASE;
            case 4:
                return AppMetricaDescription.BOUGHT_BUSINESS;
            case 5:
                return AppMetricaDescription.DONATE;
            case 6:
                return AppMetricaDescription.JOINED_FAMILY_OR_FRACTION;
            case 7:
                return AppMetricaDescription.GOT_INCREASE_IN_FRACTION;
            case 8:
                return AppMetricaDescription.TASK_COMPLETED;
            case 9:
                return AppMetricaDescription.BOUGHT_SOMETHING_IN_DONATE;
            case 10:
                return AppMetricaDescription.SUCCESSFULLY_OPENED_CONTAINER;
            case 11:
                return AppMetricaDescription.BOUGHT_ACCESSORY;
            case 12:
                return AppMetricaDescription.BOUGHT_CLOTHES;
            case 13:
                return AppMetricaDescription.SET_LEADER;
            case 14:
                return AppMetricaDescription.SET_ADMIN;
            case 15:
                return AppMetricaDescription.WON_IN_CASINO;
            case 16:
                return AppMetricaDescription.AFTER_WORK;
            default:
                return AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        }
    }
}
