package com.blackhub.bronline.game.gui.tanpinbanner;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.gui.cases.model.CasesBannerAttachment;
import com.fasterxml.jackson.core.io.schubfach.DoubleToDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TanpinBannerUiState.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/blackhub/bronline/game/gui/tanpinbanner/TanpinBannerUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "bannerAttachment", "Lcom/blackhub/bronline/game/gui/cases/model/CasesBannerAttachment;", "isNeedToClose", "", "(Lcom/blackhub/bronline/game/gui/cases/model/CasesBannerAttachment;Z)V", "getBannerAttachment", "()Lcom/blackhub/bronline/game/gui/cases/model/CasesBannerAttachment;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TanpinBannerUiState implements UiState {
    public static final int $stable = 8;

    @NotNull
    public final CasesBannerAttachment bannerAttachment;
    public final boolean isNeedToClose;

    public TanpinBannerUiState() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TanpinBannerUiState copy$default(TanpinBannerUiState tanpinBannerUiState, CasesBannerAttachment casesBannerAttachment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            casesBannerAttachment = tanpinBannerUiState.bannerAttachment;
        }
        if ((i & 2) != 0) {
            z = tanpinBannerUiState.isNeedToClose;
        }
        return tanpinBannerUiState.copy(casesBannerAttachment, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CasesBannerAttachment getBannerAttachment() {
        return this.bannerAttachment;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsNeedToClose() {
        return this.isNeedToClose;
    }

    @NotNull
    public final TanpinBannerUiState copy(@NotNull CasesBannerAttachment bannerAttachment, boolean isNeedToClose) {
        Intrinsics.checkNotNullParameter(bannerAttachment, "bannerAttachment");
        return new TanpinBannerUiState(bannerAttachment, isNeedToClose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TanpinBannerUiState)) {
            return false;
        }
        TanpinBannerUiState tanpinBannerUiState = (TanpinBannerUiState) other;
        return Intrinsics.areEqual(this.bannerAttachment, tanpinBannerUiState.bannerAttachment) && this.isNeedToClose == tanpinBannerUiState.isNeedToClose;
    }

    public int hashCode() {
        return (this.bannerAttachment.hashCode() * 31) + Boolean.hashCode(this.isNeedToClose);
    }

    @NotNull
    public String toString() {
        return "TanpinBannerUiState(bannerAttachment=" + this.bannerAttachment + ", isNeedToClose=" + this.isNeedToClose + ")";
    }

    public TanpinBannerUiState(@NotNull CasesBannerAttachment bannerAttachment, boolean z) {
        Intrinsics.checkNotNullParameter(bannerAttachment, "bannerAttachment");
        this.bannerAttachment = bannerAttachment;
        this.isNeedToClose = z;
    }

    public /* synthetic */ TanpinBannerUiState(CasesBannerAttachment casesBannerAttachment, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CasesBannerAttachment(null, null, null, null, null, null, null, null, null, null, null, DoubleToDecimal.BQ_MASK, null) : casesBannerAttachment, (i & 2) != 0 ? false : z);
    }

    @NotNull
    public final CasesBannerAttachment getBannerAttachment() {
        return this.bannerAttachment;
    }

    public final boolean isNeedToClose() {
        return this.isNeedToClose;
    }
}
