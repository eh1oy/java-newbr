package com.blackhub.bronline.game.core.utils.attachment.reward;

import android.graphics.Bitmap;
import androidx.annotation.DimenRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.attachment.ImageModel;
import com.blackhub.bronline.game.gui.calendar.model.CalendarBonusRewardState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CommonRewardModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\bC\b\u0087\b\u0018\u00002\u00020\u0001B½\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b¢\u0006\u0002\u0010\u001cJ\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u000eHÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0012HÆ\u0003J\t\u0010N\u001a\u00020\u0014HÆ\u0003J\t\u0010O\u001a\u00020\u000eHÆ\u0003J\t\u0010P\u001a\u00020\u000eHÆ\u0003J\t\u0010Q\u001a\u00020\u0018HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u001bHÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u0005HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010[\u001a\u00020\u000eHÆ\u0003JÁ\u0001\u0010\\\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u001bHÆ\u0001J\u0013\u0010]\u001a\u00020\u000e2\b\u0010^\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010_\u001a\u00020\u0003HÖ\u0001J\t\u0010`\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u001d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b+\u0010\"R\u0011\u0010,\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b-\u0010\"R\u0011\u0010.\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b/\u0010\"R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0011\u00101\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b2\u0010\"R\u0011\u00103\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b4\u0010\"R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010)R\u0011\u0010\u0016\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010:R\u0011\u0010\u0015\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010:R\u0011\u0010;\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b;\u0010:R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010:R\u0011\u0010<\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b<\u0010:R\u0011\u0010=\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b=\u0010:R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010:R\u0011\u0010>\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b>\u0010:R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bD\u0010)R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bF\u0010)R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010\"R\u0011\u0010H\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\bI\u0010\"¨\u0006a"}, d2 = {"Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardModel;", "", "rewardId", "", "rewardName", "", "rewardDescription", "bottomText", "image", "Landroid/graphics/Bitmap;", "typeId", "awardId", "imageNameFromCdn", "isSuperReward", "", "isNeedToShowLvl", "lvl", "mainRewardState", "Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardState;", "bonusRewardState", "Lcom/blackhub/bronline/game/gui/calendar/model/CalendarBonusRewardState;", "isCalendarReward", "isBpOrEventsReward", "rarityState", "Lcom/blackhub/bronline/game/core/enums/CommonRarityEnum;", "fromList", "imageModel", "Lcom/blackhub/bronline/game/core/utils/attachment/ImageModel;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;IILjava/lang/String;ZZILcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardState;Lcom/blackhub/bronline/game/gui/calendar/model/CalendarBonusRewardState;ZZLcom/blackhub/bronline/game/core/enums/CommonRarityEnum;ILcom/blackhub/bronline/game/core/utils/attachment/ImageModel;)V", "alfaForCard", "", "getAlfaForCard", "()F", "getAwardId", "()I", "getBonusRewardState", "()Lcom/blackhub/bronline/game/gui/calendar/model/CalendarBonusRewardState;", "borderDim", "getBorderDim", "()Ljava/lang/Integer;", "getBottomText", "()Ljava/lang/String;", "colorIdForBgBottomText", "getColorIdForBgBottomText", "colorIdForPrizeItem", "getColorIdForPrizeItem", "colorIdForPrizeItemBorder", "getColorIdForPrizeItemBorder", "getFromList", "heightOfGetButtonBPOrEvents", "getHeightOfGetButtonBPOrEvents", "heightOfRewardItemBPOrEvents", "getHeightOfRewardItemBPOrEvents", "getImage", "()Landroid/graphics/Bitmap;", "getImageModel", "()Lcom/blackhub/bronline/game/core/utils/attachment/ImageModel;", "getImageNameFromCdn", "()Z", "isNeedShowingLottieAnim", "isNotReceivedOrTimer", "isReceived", "isTimer", "getLvl", "getMainRewardState", "()Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardState;", "getRarityState", "()Lcom/blackhub/bronline/game/core/enums/CommonRarityEnum;", "getRewardDescription", "getRewardId", "getRewardName", "getTypeId", "widthOfRewardItemBPOrEvents", "getWidthOfRewardItemBPOrEvents", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CommonRewardModel {
    public static final int $stable = 8;
    public final int awardId;

    @NotNull
    public final CalendarBonusRewardState bonusRewardState;

    @NotNull
    public final String bottomText;
    public final int fromList;

    @Nullable
    public final Bitmap image;

    @NotNull
    public final ImageModel imageModel;

    @Nullable
    public final String imageNameFromCdn;
    public final boolean isBpOrEventsReward;
    public final boolean isCalendarReward;
    public final boolean isNeedToShowLvl;
    public final boolean isSuperReward;
    public final int lvl;

    @NotNull
    public final CommonRewardState mainRewardState;

    @NotNull
    public final CommonRarityEnum rarityState;

    @NotNull
    public final String rewardDescription;
    public final int rewardId;

    @NotNull
    public final String rewardName;
    public final int typeId;

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: CommonRewardModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CalendarBonusRewardState.values().length];
            try {
                iArr[CalendarBonusRewardState.RECEIVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CalendarBonusRewardState.NOT_RECEIVED_LOW_LEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CalendarBonusRewardState.NOT_RECEIVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CalendarBonusRewardState.AVAILABLE_LOW_LEVEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CalendarBonusRewardState.AVAILABLE_NORM_LEVEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CommonRewardState.values().length];
            try {
                iArr2[CommonRewardState.EPIC_RECEIVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CommonRewardState.NORM_RECEIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CommonRewardState.NORM_TIMER.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CommonRewardState.EPIC_TIMER_NORM_LEVEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CommonRewardState.EPIC_TIMER_LOW_LEVEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CommonRewardState.NORM_NOT_RECEIVED.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CommonRewardState.EPIC_NOT_RECEIVED_NORW_LEVEL.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CommonRewardState.EPIC_NOT_RECEIVED_LOW_LEVEL.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[CommonRewardState.EPIC_AVAILABLE_LOW_LEVEL.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[CommonRewardState.NORM_AVAILABLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[CommonRewardState.EPIC_AVAILABLE_NORW_LEVEL.ordinal()] = 11;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CommonRarityEnum.values().length];
            try {
                iArr3[CommonRarityEnum.COMMON.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[CommonRarityEnum.UNCOMMON.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[CommonRarityEnum.RARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[CommonRarityEnum.EPIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[CommonRarityEnum.LEGENDARY.ordinal()] = 5;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public CommonRewardModel() {
        this(0, null, null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262143, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRewardId() {
        return this.rewardId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsNeedToShowLvl() {
        return this.isNeedToShowLvl;
    }

    /* renamed from: component11, reason: from getter */
    public final int getLvl() {
        return this.lvl;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final CommonRewardState getMainRewardState() {
        return this.mainRewardState;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final CalendarBonusRewardState getBonusRewardState() {
        return this.bonusRewardState;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsCalendarReward() {
        return this.isCalendarReward;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsBpOrEventsReward() {
        return this.isBpOrEventsReward;
    }

    @NotNull
    /* renamed from: component16, reason: from getter */
    public final CommonRarityEnum getRarityState() {
        return this.rarityState;
    }

    /* renamed from: component17, reason: from getter */
    public final int getFromList() {
        return this.fromList;
    }

    @NotNull
    /* renamed from: component18, reason: from getter */
    public final ImageModel getImageModel() {
        return this.imageModel;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getRewardName() {
        return this.rewardName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getRewardDescription() {
        return this.rewardDescription;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getBottomText() {
        return this.bottomText;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Bitmap getImage() {
        return this.image;
    }

    /* renamed from: component6, reason: from getter */
    public final int getTypeId() {
        return this.typeId;
    }

    /* renamed from: component7, reason: from getter */
    public final int getAwardId() {
        return this.awardId;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getImageNameFromCdn() {
        return this.imageNameFromCdn;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsSuperReward() {
        return this.isSuperReward;
    }

    @NotNull
    public final CommonRewardModel copy(int rewardId, @NotNull String rewardName, @NotNull String rewardDescription, @NotNull String bottomText, @Nullable Bitmap image, int typeId, int awardId, @Nullable String imageNameFromCdn, boolean isSuperReward, boolean isNeedToShowLvl, int lvl, @NotNull CommonRewardState mainRewardState, @NotNull CalendarBonusRewardState bonusRewardState, boolean isCalendarReward, boolean isBpOrEventsReward, @NotNull CommonRarityEnum rarityState, int fromList, @NotNull ImageModel imageModel) {
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        Intrinsics.checkNotNullParameter(rewardDescription, "rewardDescription");
        Intrinsics.checkNotNullParameter(bottomText, "bottomText");
        Intrinsics.checkNotNullParameter(mainRewardState, "mainRewardState");
        Intrinsics.checkNotNullParameter(bonusRewardState, "bonusRewardState");
        Intrinsics.checkNotNullParameter(rarityState, "rarityState");
        Intrinsics.checkNotNullParameter(imageModel, "imageModel");
        return new CommonRewardModel(rewardId, rewardName, rewardDescription, bottomText, image, typeId, awardId, imageNameFromCdn, isSuperReward, isNeedToShowLvl, lvl, mainRewardState, bonusRewardState, isCalendarReward, isBpOrEventsReward, rarityState, fromList, imageModel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonRewardModel)) {
            return false;
        }
        CommonRewardModel commonRewardModel = (CommonRewardModel) other;
        return this.rewardId == commonRewardModel.rewardId && Intrinsics.areEqual(this.rewardName, commonRewardModel.rewardName) && Intrinsics.areEqual(this.rewardDescription, commonRewardModel.rewardDescription) && Intrinsics.areEqual(this.bottomText, commonRewardModel.bottomText) && Intrinsics.areEqual(this.image, commonRewardModel.image) && this.typeId == commonRewardModel.typeId && this.awardId == commonRewardModel.awardId && Intrinsics.areEqual(this.imageNameFromCdn, commonRewardModel.imageNameFromCdn) && this.isSuperReward == commonRewardModel.isSuperReward && this.isNeedToShowLvl == commonRewardModel.isNeedToShowLvl && this.lvl == commonRewardModel.lvl && this.mainRewardState == commonRewardModel.mainRewardState && this.bonusRewardState == commonRewardModel.bonusRewardState && this.isCalendarReward == commonRewardModel.isCalendarReward && this.isBpOrEventsReward == commonRewardModel.isBpOrEventsReward && this.rarityState == commonRewardModel.rarityState && this.fromList == commonRewardModel.fromList && Intrinsics.areEqual(this.imageModel, commonRewardModel.imageModel);
    }

    @DimenRes
    public final int getHeightOfGetButtonBPOrEvents() {
        return R.dimen._15wdp;
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.rewardId) * 31) + this.rewardName.hashCode()) * 31) + this.rewardDescription.hashCode()) * 31) + this.bottomText.hashCode()) * 31;
        Bitmap bitmap = this.image;
        int hashCode2 = (((((hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Integer.hashCode(this.typeId)) * 31) + Integer.hashCode(this.awardId)) * 31;
        String str = this.imageNameFromCdn;
        return ((((((((((((((((((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSuperReward)) * 31) + Boolean.hashCode(this.isNeedToShowLvl)) * 31) + Integer.hashCode(this.lvl)) * 31) + this.mainRewardState.hashCode()) * 31) + this.bonusRewardState.hashCode()) * 31) + Boolean.hashCode(this.isCalendarReward)) * 31) + Boolean.hashCode(this.isBpOrEventsReward)) * 31) + this.rarityState.hashCode()) * 31) + Integer.hashCode(this.fromList)) * 31) + this.imageModel.hashCode();
    }

    @NotNull
    public String toString() {
        return "CommonRewardModel(rewardId=" + this.rewardId + ", rewardName=" + this.rewardName + ", rewardDescription=" + this.rewardDescription + ", bottomText=" + this.bottomText + ", image=" + this.image + ", typeId=" + this.typeId + ", awardId=" + this.awardId + ", imageNameFromCdn=" + this.imageNameFromCdn + ", isSuperReward=" + this.isSuperReward + ", isNeedToShowLvl=" + this.isNeedToShowLvl + ", lvl=" + this.lvl + ", mainRewardState=" + this.mainRewardState + ", bonusRewardState=" + this.bonusRewardState + ", isCalendarReward=" + this.isCalendarReward + ", isBpOrEventsReward=" + this.isBpOrEventsReward + ", rarityState=" + this.rarityState + ", fromList=" + this.fromList + ", imageModel=" + this.imageModel + ")";
    }

    public CommonRewardModel(int i, @NotNull String rewardName, @NotNull String rewardDescription, @NotNull String bottomText, @Nullable Bitmap bitmap, int i2, int i3, @Nullable String str, boolean z, boolean z2, int i4, @NotNull CommonRewardState mainRewardState, @NotNull CalendarBonusRewardState bonusRewardState, boolean z3, boolean z4, @NotNull CommonRarityEnum rarityState, int i5, @NotNull ImageModel imageModel) {
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        Intrinsics.checkNotNullParameter(rewardDescription, "rewardDescription");
        Intrinsics.checkNotNullParameter(bottomText, "bottomText");
        Intrinsics.checkNotNullParameter(mainRewardState, "mainRewardState");
        Intrinsics.checkNotNullParameter(bonusRewardState, "bonusRewardState");
        Intrinsics.checkNotNullParameter(rarityState, "rarityState");
        Intrinsics.checkNotNullParameter(imageModel, "imageModel");
        this.rewardId = i;
        this.rewardName = rewardName;
        this.rewardDescription = rewardDescription;
        this.bottomText = bottomText;
        this.image = bitmap;
        this.typeId = i2;
        this.awardId = i3;
        this.imageNameFromCdn = str;
        this.isSuperReward = z;
        this.isNeedToShowLvl = z2;
        this.lvl = i4;
        this.mainRewardState = mainRewardState;
        this.bonusRewardState = bonusRewardState;
        this.isCalendarReward = z3;
        this.isBpOrEventsReward = z4;
        this.rarityState = rarityState;
        this.fromList = i5;
        this.imageModel = imageModel;
    }

    public final int getRewardId() {
        return this.rewardId;
    }

    public /* synthetic */ CommonRewardModel(int i, String str, String str2, String str3, Bitmap bitmap, int i2, int i3, String str4, boolean z, boolean z2, int i4, CommonRewardState commonRewardState, CalendarBonusRewardState calendarBonusRewardState, boolean z3, boolean z4, CommonRarityEnum commonRarityEnum, int i5, ImageModel imageModel, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i6 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i6 & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i6 & 16) != 0 ? null : bitmap, (i6 & 32) != 0 ? 0 : i2, (i6 & 64) != 0 ? 0 : i3, (i6 & 128) == 0 ? str4 : null, (i6 & 256) != 0 ? false : z, (i6 & 512) != 0 ? false : z2, (i6 & 1024) != 0 ? 0 : i4, (i6 & 2048) != 0 ? CommonRewardState.NONE : commonRewardState, (i6 & 4096) != 0 ? CalendarBonusRewardState.NONE : calendarBonusRewardState, (i6 & 8192) != 0 ? true : z3, (i6 & 16384) != 0 ? false : z4, (i6 & 32768) != 0 ? CommonRarityEnum.COMMON : commonRarityEnum, (i6 & 65536) == 0 ? i5 : 1, (i6 & 131072) != 0 ? new ImageModel(0, null, null, null, null, 31, null) : imageModel);
    }

    @NotNull
    public final String getRewardName() {
        return this.rewardName;
    }

    @NotNull
    public final String getRewardDescription() {
        return this.rewardDescription;
    }

    @NotNull
    public final String getBottomText() {
        return this.bottomText;
    }

    @Nullable
    public final Bitmap getImage() {
        return this.image;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    public final int getAwardId() {
        return this.awardId;
    }

    @Nullable
    public final String getImageNameFromCdn() {
        return this.imageNameFromCdn;
    }

    public final boolean isSuperReward() {
        return this.isSuperReward;
    }

    public final boolean isNeedToShowLvl() {
        return this.isNeedToShowLvl;
    }

    public final int getLvl() {
        return this.lvl;
    }

    @NotNull
    public final CommonRewardState getMainRewardState() {
        return this.mainRewardState;
    }

    @NotNull
    public final CalendarBonusRewardState getBonusRewardState() {
        return this.bonusRewardState;
    }

    public final boolean isCalendarReward() {
        return this.isCalendarReward;
    }

    public final boolean isBpOrEventsReward() {
        return this.isBpOrEventsReward;
    }

    @NotNull
    public final CommonRarityEnum getRarityState() {
        return this.rarityState;
    }

    public final int getFromList() {
        return this.fromList;
    }

    @NotNull
    public final ImageModel getImageModel() {
        return this.imageModel;
    }

    public final boolean isReceived() {
        int i = WhenMappings.$EnumSwitchMapping$1[this.mainRewardState.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        return WhenMappings.$EnumSwitchMapping$0[this.bonusRewardState.ordinal()] == 1;
    }

    public final boolean isTimer() {
        int i = WhenMappings.$EnumSwitchMapping$1[this.mainRewardState.ordinal()];
        return i == 3 || i == 4 || i == 5;
    }

    public final boolean isNotReceivedOrTimer() {
        switch (WhenMappings.$EnumSwitchMapping$1[this.mainRewardState.ordinal()]) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            default:
                int i = WhenMappings.$EnumSwitchMapping$0[this.bonusRewardState.ordinal()];
                if (i == 2 || i == 3 || i == 4) {
                }
                break;
        }
        return true;
    }

    public final int getColorIdForBgBottomText() {
        switch (WhenMappings.$EnumSwitchMapping$1[this.mainRewardState.ordinal()]) {
            case 1:
            case 2:
                return R.color.black;
            case 3:
            case 4:
            case 5:
                return R.color.red;
            case 6:
            case 7:
            case 8:
            default:
                int i = WhenMappings.$EnumSwitchMapping$0[this.bonusRewardState.ordinal()];
                if (i == 1) {
                    return R.color.black;
                }
                if (i != 4 && i != 5) {
                    return R.color.total_black;
                }
                break;
            case 9:
            case 10:
            case 11:
                break;
        }
        return R.color.yellow;
    }

    public final int getColorIdForPrizeItemBorder() {
        CommonRewardState commonRewardState = this.mainRewardState;
        if (commonRewardState == CommonRewardState.NORM_TIMER || commonRewardState == CommonRewardState.EPIC_TIMER_NORM_LEVEL || commonRewardState == CommonRewardState.EPIC_TIMER_LOW_LEVEL) {
            return R.color.red;
        }
        if (this.isBpOrEventsReward && commonRewardState == CommonRewardState.NORM_AVAILABLE) {
            return R.color.yellow;
        }
        int i = WhenMappings.$EnumSwitchMapping$2[this.rarityState.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? R.color.white : R.color.yellow : R.color.purple : R.color.light_blue : R.color.green : R.color.gray;
    }

    public final int getColorIdForPrizeItem() {
        int i = WhenMappings.$EnumSwitchMapping$2[this.rarityState.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? R.color.white : R.color.yellow : R.color.purple : R.color.light_blue : R.color.green : R.color.gray;
    }

    public final boolean isNeedShowingLottieAnim() {
        if (!this.isSuperReward) {
            return false;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[this.mainRewardState.ordinal()];
        return i == 7 || i == 8;
    }

    public final float getAlfaForCard() {
        return isReceived() ? 0.7f : 1.0f;
    }

    @DimenRes
    @Nullable
    public final Integer getBorderDim() {
        if (this.isSuperReward || isTimer() || (this.isBpOrEventsReward && this.mainRewardState == CommonRewardState.NORM_AVAILABLE)) {
            return Integer.valueOf(R.dimen._1wdp);
        }
        return null;
    }

    @DimenRes
    public final int getHeightOfRewardItemBPOrEvents() {
        return this.isSuperReward ? R.dimen._100wdp : R.dimen._80wdp;
    }

    @DimenRes
    public final int getWidthOfRewardItemBPOrEvents() {
        return this.isSuperReward ? R.dimen._88wdp : R.dimen._70wdp;
    }
}
