package com.blackhub.bronline.game.gui.bprewards;

import android.graphics.Bitmap;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsFilterStateEnum;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsLists;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsText;
import com.blackhub.bronline.game.ui.bprewards.BpRewardsFilterButtonImageItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BpRewardsUiState.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bç\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003¢\u0006\u0002\u0010\u001fJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010;\u001a\u00020\u0011HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00103J\u000b\u0010=\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\t\u0010>\u001a\u00020\u0011HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0007HÆ\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010G\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003J\u000f\u0010H\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010J\u001a\u00020\u0011HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003Jð\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0015\u001a\u00020\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010MJ\u0013\u0010N\u001a\u00020\u00032\b\u0010O\u001a\u0004\u0018\u00010PHÖ\u0003J\t\u0010Q\u001a\u00020\u0011HÖ\u0001J\t\u0010R\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u0019\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0011\u0010\u0015\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010,R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010,R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010,R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010,R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010,R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010,R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010,R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010,R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#¨\u0006S"}, d2 = {"Lcom/blackhub/bronline/game/gui/bprewards/BpRewardsUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "isBpRewardsScreen", "", "annotatedText", "Lcom/blackhub/bronline/game/gui/bprewards/model/BpRewardsText;", "bpRewardsLists", "Lcom/blackhub/bronline/game/gui/bprewards/model/BpRewardsLists;", "imagesForFilterList", "", "Lcom/blackhub/bronline/game/ui/bprewards/BpRewardsFilterButtonImageItem;", "topHintList", "", "bottomHintList", "refreshButtonBitmap", "Landroid/graphics/Bitmap;", "sizeOfImage", "", "isNeedToShowDialog", "isSprayForDialog", "rewardNameForDialog", "idForDialog", "sprayPriceForDialog", "sprayTextForDialog", "Landroidx/compose/ui/text/AnnotatedString;", "filterState", "isHasTanpin", "isTutorialEnabled", "isButtonFilterBlocked", "isScreenBlocked", "isNeedClose", "(ZLcom/blackhub/bronline/game/gui/bprewards/model/BpRewardsText;Lcom/blackhub/bronline/game/gui/bprewards/model/BpRewardsLists;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroid/graphics/Bitmap;IZZLjava/lang/String;ILjava/lang/Integer;Landroidx/compose/ui/text/AnnotatedString;IZZZZZ)V", "getAnnotatedText", "()Lcom/blackhub/bronline/game/gui/bprewards/model/BpRewardsText;", "getBottomHintList", "()Ljava/util/List;", "getBpRewardsLists", "()Lcom/blackhub/bronline/game/gui/bprewards/model/BpRewardsLists;", "emptyIconRes", "getEmptyIconRes", "()I", "getFilterState", "getIdForDialog", "getImagesForFilterList", "()Z", "getRefreshButtonBitmap", "()Landroid/graphics/Bitmap;", "getRewardNameForDialog", "()Ljava/lang/String;", "getSizeOfImage", "getSprayPriceForDialog", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSprayTextForDialog", "()Landroidx/compose/ui/text/AnnotatedString;", "getTopHintList", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZLcom/blackhub/bronline/game/gui/bprewards/model/BpRewardsText;Lcom/blackhub/bronline/game/gui/bprewards/model/BpRewardsLists;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroid/graphics/Bitmap;IZZLjava/lang/String;ILjava/lang/Integer;Landroidx/compose/ui/text/AnnotatedString;IZZZZZ)Lcom/blackhub/bronline/game/gui/bprewards/BpRewardsUiState;", "equals", "other", "", "hashCode", "toString", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BpRewardsUiState implements UiState {
    public static final int $stable = 8;

    @NotNull
    public final BpRewardsText annotatedText;

    @NotNull
    public final List<String> bottomHintList;

    @NotNull
    public final BpRewardsLists bpRewardsLists;
    public final int filterState;
    public final int idForDialog;

    @NotNull
    public final List<BpRewardsFilterButtonImageItem> imagesForFilterList;
    public final boolean isBpRewardsScreen;
    public final boolean isButtonFilterBlocked;
    public final boolean isHasTanpin;
    public final boolean isNeedClose;
    public final boolean isNeedToShowDialog;
    public final boolean isScreenBlocked;
    public final boolean isSprayForDialog;
    public final boolean isTutorialEnabled;

    @Nullable
    public final Bitmap refreshButtonBitmap;

    @Nullable
    public final String rewardNameForDialog;
    public final int sizeOfImage;

    @Nullable
    public final Integer sprayPriceForDialog;

    @Nullable
    public final AnnotatedString sprayTextForDialog;

    @NotNull
    public final List<String> topHintList;

    public BpRewardsUiState() {
        this(false, null, null, null, null, null, null, 0, false, false, null, 0, null, null, 0, false, false, false, false, false, 1048575, null);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsBpRewardsScreen() {
        return this.isBpRewardsScreen;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsSprayForDialog() {
        return this.isSprayForDialog;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getRewardNameForDialog() {
        return this.rewardNameForDialog;
    }

    /* renamed from: component12, reason: from getter */
    public final int getIdForDialog() {
        return this.idForDialog;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getSprayPriceForDialog() {
        return this.sprayPriceForDialog;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final AnnotatedString getSprayTextForDialog() {
        return this.sprayTextForDialog;
    }

    /* renamed from: component15, reason: from getter */
    public final int getFilterState() {
        return this.filterState;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsHasTanpin() {
        return this.isHasTanpin;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getIsTutorialEnabled() {
        return this.isTutorialEnabled;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsButtonFilterBlocked() {
        return this.isButtonFilterBlocked;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsScreenBlocked() {
        return this.isScreenBlocked;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BpRewardsText getAnnotatedText() {
        return this.annotatedText;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BpRewardsLists getBpRewardsLists() {
        return this.bpRewardsLists;
    }

    @NotNull
    public final List<BpRewardsFilterButtonImageItem> component4() {
        return this.imagesForFilterList;
    }

    @NotNull
    public final List<String> component5() {
        return this.topHintList;
    }

    @NotNull
    public final List<String> component6() {
        return this.bottomHintList;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Bitmap getRefreshButtonBitmap() {
        return this.refreshButtonBitmap;
    }

    /* renamed from: component8, reason: from getter */
    public final int getSizeOfImage() {
        return this.sizeOfImage;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsNeedToShowDialog() {
        return this.isNeedToShowDialog;
    }

    @NotNull
    public final BpRewardsUiState copy(boolean isBpRewardsScreen, @NotNull BpRewardsText annotatedText, @NotNull BpRewardsLists bpRewardsLists, @NotNull List<BpRewardsFilterButtonImageItem> imagesForFilterList, @NotNull List<String> topHintList, @NotNull List<String> bottomHintList, @Nullable Bitmap refreshButtonBitmap, int sizeOfImage, boolean isNeedToShowDialog, boolean isSprayForDialog, @Nullable String rewardNameForDialog, int idForDialog, @Nullable Integer sprayPriceForDialog, @Nullable AnnotatedString sprayTextForDialog, int filterState, boolean isHasTanpin, boolean isTutorialEnabled, boolean isButtonFilterBlocked, boolean isScreenBlocked, boolean isNeedClose) {
        Intrinsics.checkNotNullParameter(annotatedText, "annotatedText");
        Intrinsics.checkNotNullParameter(bpRewardsLists, "bpRewardsLists");
        Intrinsics.checkNotNullParameter(imagesForFilterList, "imagesForFilterList");
        Intrinsics.checkNotNullParameter(topHintList, "topHintList");
        Intrinsics.checkNotNullParameter(bottomHintList, "bottomHintList");
        return new BpRewardsUiState(isBpRewardsScreen, annotatedText, bpRewardsLists, imagesForFilterList, topHintList, bottomHintList, refreshButtonBitmap, sizeOfImage, isNeedToShowDialog, isSprayForDialog, rewardNameForDialog, idForDialog, sprayPriceForDialog, sprayTextForDialog, filterState, isHasTanpin, isTutorialEnabled, isButtonFilterBlocked, isScreenBlocked, isNeedClose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BpRewardsUiState)) {
            return false;
        }
        BpRewardsUiState bpRewardsUiState = (BpRewardsUiState) other;
        return this.isBpRewardsScreen == bpRewardsUiState.isBpRewardsScreen && Intrinsics.areEqual(this.annotatedText, bpRewardsUiState.annotatedText) && Intrinsics.areEqual(this.bpRewardsLists, bpRewardsUiState.bpRewardsLists) && Intrinsics.areEqual(this.imagesForFilterList, bpRewardsUiState.imagesForFilterList) && Intrinsics.areEqual(this.topHintList, bpRewardsUiState.topHintList) && Intrinsics.areEqual(this.bottomHintList, bpRewardsUiState.bottomHintList) && Intrinsics.areEqual(this.refreshButtonBitmap, bpRewardsUiState.refreshButtonBitmap) && this.sizeOfImage == bpRewardsUiState.sizeOfImage && this.isNeedToShowDialog == bpRewardsUiState.isNeedToShowDialog && this.isSprayForDialog == bpRewardsUiState.isSprayForDialog && Intrinsics.areEqual(this.rewardNameForDialog, bpRewardsUiState.rewardNameForDialog) && this.idForDialog == bpRewardsUiState.idForDialog && Intrinsics.areEqual(this.sprayPriceForDialog, bpRewardsUiState.sprayPriceForDialog) && Intrinsics.areEqual(this.sprayTextForDialog, bpRewardsUiState.sprayTextForDialog) && this.filterState == bpRewardsUiState.filterState && this.isHasTanpin == bpRewardsUiState.isHasTanpin && this.isTutorialEnabled == bpRewardsUiState.isTutorialEnabled && this.isButtonFilterBlocked == bpRewardsUiState.isButtonFilterBlocked && this.isScreenBlocked == bpRewardsUiState.isScreenBlocked && this.isNeedClose == bpRewardsUiState.isNeedClose;
    }

    public int hashCode() {
        int hashCode = ((((((((((Boolean.hashCode(this.isBpRewardsScreen) * 31) + this.annotatedText.hashCode()) * 31) + this.bpRewardsLists.hashCode()) * 31) + this.imagesForFilterList.hashCode()) * 31) + this.topHintList.hashCode()) * 31) + this.bottomHintList.hashCode()) * 31;
        Bitmap bitmap = this.refreshButtonBitmap;
        int hashCode2 = (((((((hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Integer.hashCode(this.sizeOfImage)) * 31) + Boolean.hashCode(this.isNeedToShowDialog)) * 31) + Boolean.hashCode(this.isSprayForDialog)) * 31;
        String str = this.rewardNameForDialog;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.idForDialog)) * 31;
        Integer num = this.sprayPriceForDialog;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        AnnotatedString annotatedString = this.sprayTextForDialog;
        return ((((((((((((hashCode4 + (annotatedString != null ? annotatedString.hashCode() : 0)) * 31) + Integer.hashCode(this.filterState)) * 31) + Boolean.hashCode(this.isHasTanpin)) * 31) + Boolean.hashCode(this.isTutorialEnabled)) * 31) + Boolean.hashCode(this.isButtonFilterBlocked)) * 31) + Boolean.hashCode(this.isScreenBlocked)) * 31) + Boolean.hashCode(this.isNeedClose);
    }

    @NotNull
    public String toString() {
        boolean z = this.isBpRewardsScreen;
        BpRewardsText bpRewardsText = this.annotatedText;
        BpRewardsLists bpRewardsLists = this.bpRewardsLists;
        List<BpRewardsFilterButtonImageItem> list = this.imagesForFilterList;
        List<String> list2 = this.topHintList;
        List<String> list3 = this.bottomHintList;
        Bitmap bitmap = this.refreshButtonBitmap;
        int i = this.sizeOfImage;
        boolean z2 = this.isNeedToShowDialog;
        boolean z3 = this.isSprayForDialog;
        String str = this.rewardNameForDialog;
        int i2 = this.idForDialog;
        Integer num = this.sprayPriceForDialog;
        AnnotatedString annotatedString = this.sprayTextForDialog;
        return "BpRewardsUiState(isBpRewardsScreen=" + z + ", annotatedText=" + bpRewardsText + ", bpRewardsLists=" + bpRewardsLists + ", imagesForFilterList=" + list + ", topHintList=" + list2 + ", bottomHintList=" + list3 + ", refreshButtonBitmap=" + bitmap + ", sizeOfImage=" + i + ", isNeedToShowDialog=" + z2 + ", isSprayForDialog=" + z3 + ", rewardNameForDialog=" + str + ", idForDialog=" + i2 + ", sprayPriceForDialog=" + num + ", sprayTextForDialog=" + ((Object) annotatedString) + ", filterState=" + this.filterState + ", isHasTanpin=" + this.isHasTanpin + ", isTutorialEnabled=" + this.isTutorialEnabled + ", isButtonFilterBlocked=" + this.isButtonFilterBlocked + ", isScreenBlocked=" + this.isScreenBlocked + ", isNeedClose=" + this.isNeedClose + ")";
    }

    public BpRewardsUiState(boolean z, @NotNull BpRewardsText annotatedText, @NotNull BpRewardsLists bpRewardsLists, @NotNull List<BpRewardsFilterButtonImageItem> imagesForFilterList, @NotNull List<String> topHintList, @NotNull List<String> bottomHintList, @Nullable Bitmap bitmap, int i, boolean z2, boolean z3, @Nullable String str, int i2, @Nullable Integer num, @Nullable AnnotatedString annotatedString, int i3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        Intrinsics.checkNotNullParameter(annotatedText, "annotatedText");
        Intrinsics.checkNotNullParameter(bpRewardsLists, "bpRewardsLists");
        Intrinsics.checkNotNullParameter(imagesForFilterList, "imagesForFilterList");
        Intrinsics.checkNotNullParameter(topHintList, "topHintList");
        Intrinsics.checkNotNullParameter(bottomHintList, "bottomHintList");
        this.isBpRewardsScreen = z;
        this.annotatedText = annotatedText;
        this.bpRewardsLists = bpRewardsLists;
        this.imagesForFilterList = imagesForFilterList;
        this.topHintList = topHintList;
        this.bottomHintList = bottomHintList;
        this.refreshButtonBitmap = bitmap;
        this.sizeOfImage = i;
        this.isNeedToShowDialog = z2;
        this.isSprayForDialog = z3;
        this.rewardNameForDialog = str;
        this.idForDialog = i2;
        this.sprayPriceForDialog = num;
        this.sprayTextForDialog = annotatedString;
        this.filterState = i3;
        this.isHasTanpin = z4;
        this.isTutorialEnabled = z5;
        this.isButtonFilterBlocked = z6;
        this.isScreenBlocked = z7;
        this.isNeedClose = z8;
    }

    public final boolean isBpRewardsScreen() {
        return this.isBpRewardsScreen;
    }

    public /* synthetic */ BpRewardsUiState(boolean z, BpRewardsText bpRewardsText, BpRewardsLists bpRewardsLists, List list, List list2, List list3, Bitmap bitmap, int i, boolean z2, boolean z3, String str, int i2, Integer num, AnnotatedString annotatedString, int i3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? true : z, (i4 & 2) != 0 ? new BpRewardsText(null, null, 3, null) : bpRewardsText, (i4 & 4) != 0 ? new BpRewardsLists(null, null, null, null, null, null, null, 127, null) : bpRewardsLists, (i4 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i4 & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i4 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, (i4 & 64) != 0 ? null : bitmap, (i4 & 128) != 0 ? 512 : i, (i4 & 256) != 0 ? false : z2, (i4 & 512) != 0 ? false : z3, (i4 & 1024) != 0 ? null : str, (i4 & 2048) != 0 ? -1 : i2, (i4 & 4096) != 0 ? null : num, (i4 & 8192) != 0 ? null : annotatedString, (i4 & 16384) != 0 ? BpRewardsFilterStateEnum.ALL.getFilterState() : i3, (i4 & 32768) != 0 ? false : z4, (i4 & 65536) != 0 ? false : z5, (i4 & 131072) != 0 ? false : z6, (i4 & 262144) != 0 ? false : z7, (i4 & 524288) != 0 ? false : z8);
    }

    @NotNull
    public final BpRewardsText getAnnotatedText() {
        return this.annotatedText;
    }

    @NotNull
    public final BpRewardsLists getBpRewardsLists() {
        return this.bpRewardsLists;
    }

    @NotNull
    public final List<BpRewardsFilterButtonImageItem> getImagesForFilterList() {
        return this.imagesForFilterList;
    }

    @NotNull
    public final List<String> getTopHintList() {
        return this.topHintList;
    }

    @NotNull
    public final List<String> getBottomHintList() {
        return this.bottomHintList;
    }

    @Nullable
    public final Bitmap getRefreshButtonBitmap() {
        return this.refreshButtonBitmap;
    }

    public final int getSizeOfImage() {
        return this.sizeOfImage;
    }

    public final boolean isNeedToShowDialog() {
        return this.isNeedToShowDialog;
    }

    public final boolean isSprayForDialog() {
        return this.isSprayForDialog;
    }

    @Nullable
    public final String getRewardNameForDialog() {
        return this.rewardNameForDialog;
    }

    public final int getIdForDialog() {
        return this.idForDialog;
    }

    @Nullable
    public final Integer getSprayPriceForDialog() {
        return this.sprayPriceForDialog;
    }

    @Nullable
    public final AnnotatedString getSprayTextForDialog() {
        return this.sprayTextForDialog;
    }

    public final int getFilterState() {
        return this.filterState;
    }

    public final boolean isHasTanpin() {
        return this.isHasTanpin;
    }

    public final boolean isTutorialEnabled() {
        return this.isTutorialEnabled;
    }

    public final boolean isButtonFilterBlocked() {
        return this.isButtonFilterBlocked;
    }

    public final boolean isScreenBlocked() {
        return this.isScreenBlocked;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }

    @DrawableRes
    public final int getEmptyIconRes() {
        return this.isBpRewardsScreen ? R.drawable.ic_reward : R.drawable.ic_marketplace;
    }
}
