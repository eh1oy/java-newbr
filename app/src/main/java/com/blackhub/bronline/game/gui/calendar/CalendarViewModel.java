package com.blackhub.bronline.game.gui.calendar;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.C;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.utils.attachment.ImageModel;
import com.blackhub.bronline.game.core.utils.attachment.RenderAttachment;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState;
import com.blackhub.bronline.game.gui.calendar.model.CalendarBonusRewardState;
import com.blackhub.bronline.game.gui.calendar.model.CalendarScreenType;
import com.blackhub.bronline.game.gui.calendar.network.CalendarActionWithJSON;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.calendar.CalendarResponse;
import com.blackhub.bronline.game.model.remote.response.calendar.CalendarRewardsDto;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CalendarViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010\u0019\u001a\u00020\u0015Jl\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u001b2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u001b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u001bH\u0082@¢\u0006\u0002\u0010)J$\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u000200H\u0002J\u001e\u00101\u001a\u00020\u00172\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0016\u00103\u001a\u00020\u00172\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u001bH\u0002JH\u00104\u001a\u00020\u00152\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u001b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u001b2\u0006\u00109\u001a\u00020:J\b\u0010;\u001a\u00020\u0015H\u0014J\u0006\u0010<\u001a\u00020\u0015J\u0006\u0010=\u001a\u00020\u0015J \u0010>\u001a\u00020\u00152\u0006\u0010?\u001a\u00020\u00172\u0006\u0010@\u001a\u00020\u001f2\b\u0010A\u001a\u0004\u0018\u00010BJ\u000e\u0010C\u001a\u00020\u00152\u0006\u00105\u001a\u000206J\u0006\u0010D\u001a\u00020\u0015J\u000e\u0010E\u001a\u00020\u00152\u0006\u0010F\u001a\u00020\u001fJ\u000e\u0010G\u001a\u00020\u00152\u0006\u0010H\u001a\u00020:J:\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u001b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u001bH\u0002J\u000e\u0010L\u001a\u00020\u00152\u0006\u0010M\u001a\u00020+R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006N"}, d2 = {"Lcom/blackhub/bronline/game/gui/calendar/CalendarViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/calendar/CalendarUiState;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/calendar/network/CalendarActionWithJSON;", "stringResources", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "(Lcom/blackhub/bronline/game/gui/calendar/network/CalendarActionWithJSON;Lcom/blackhub/bronline/game/core/resources/StringResource;Lcom/blackhub/bronline/game/common/LocalNotification;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getLocalNotification", "()Lcom/blackhub/bronline/game/common/LocalNotification;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "buttonClick", "", "buttonId", "", "closeAllRewards", "closeHint", "convertJsonArrayToRewards", "", "Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardModel;", "level", "isMainRewards", "", "intArray", "rewards", "Lcom/blackhub/bronline/game/model/remote/response/calendar/CalendarRewardsDto;", "vehiclesList", "Lcom/blackhub/bronline/game/model/remote/response/vehicles/VehiclesDTO;", "skinsList", "Lcom/blackhub/bronline/game/model/remote/response/skins/SkinsDTO;", "listOfAwardsTypes", "Lcom/blackhub/bronline/game/model/remote/response/bprewards/BpRewardsAwardsDto;", "(IZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActualBottomText", "", "initBottomText", "mainRewardState", "Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardState;", "bonusRewardState", "Lcom/blackhub/bronline/game/gui/calendar/model/CalendarBonusRewardState;", "getLastScrollIndexAndFindLastOpenedReward", "allRewards", "getRewardPosWithTimer", "initInterface", "json", "Lorg/json/JSONObject;", "calendarInfo", "Lcom/blackhub/bronline/game/model/remote/response/calendar/CalendarResponse;", "savedPage", "Lcom/blackhub/bronline/game/gui/calendar/model/CalendarScreenType;", "onCleared", "onCloseClicked", "onDialogButtonClick", "onItemClick", FirebaseAnalytics.Param.INDEX, "isFromMainList", "bitmap", "Landroid/graphics/Bitmap;", "onPacketIncoming", "onShowAllRewardsClick", "onTutorialCLick", "isMainList", "selectPage", "selectedPage", "setImageModel", "Lcom/blackhub/bronline/game/core/utils/attachment/ImageModel;", "reward", "showErrorNotification", ThrowableDeserializer.PROP_NAME_MESSAGE, "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCalendarViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarViewModel.kt\ncom/blackhub/bronline/game/gui/calendar/CalendarViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,899:1\n1855#2,2:900\n1855#2,2:902\n1559#2:934\n1590#2,4:935\n350#2,7:939\n350#2,7:946\n378#2,7:953\n378#2,7:960\n230#3,5:904\n230#3,5:909\n230#3,5:914\n230#3,5:919\n230#3,5:924\n230#3,5:929\n1#4:967\n*S KotlinDebug\n*F\n+ 1 CalendarViewModel.kt\ncom/blackhub/bronline/game/gui/calendar/CalendarViewModel\n*L\n99#1:900,2\n102#1:902,2\n649#1:934\n649#1:935,4\n758#1:939,7\n770#1:946,7\n777#1:953,7\n789#1:960,7\n497#1:904,5\n504#1:909,5\n510#1:914,5\n587#1:919,5\n627#1:924,5\n633#1:929,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CalendarViewModel extends BaseViewModel<CalendarUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<CalendarUiState> _uiState;

    @NotNull
    public final CalendarActionWithJSON actionWithJSON;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final StringResource stringResources;

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: CalendarViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CommonRewardState.values().length];
            try {
                iArr[CommonRewardState.EPIC_NOT_RECEIVED_LOW_LEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommonRewardState.EPIC_TIMER_LOW_LEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommonRewardState.EPIC_AVAILABLE_LOW_LEVEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommonRewardState.NORM_RECEIVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CommonRewardState.EPIC_RECEIVED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CommonRewardState.NORM_AVAILABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CommonRewardState.EPIC_AVAILABLE_NORW_LEVEL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CalendarBonusRewardState.values().length];
            try {
                iArr2[CalendarBonusRewardState.AVAILABLE_LOW_LEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CalendarBonusRewardState.NOT_RECEIVED_LOW_LEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CalendarBonusRewardState.RECEIVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CalendarBonusRewardState.AVAILABLE_NORM_LEVEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Inject
    public CalendarViewModel(@NotNull CalendarActionWithJSON actionWithJSON, @NotNull StringResource stringResources, @NotNull LocalNotification localNotification) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(stringResources, "stringResources");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        this.actionWithJSON = actionWithJSON;
        this.stringResources = stringResources;
        this.localNotification = localNotification;
        this._uiState = StateFlowKt.MutableStateFlow(new CalendarUiState(false, null, null, null, null, null, null, 0L, 0L, 0L, false, false, null, 0, 0, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, null, null, null, null, null, 0, 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, -1, 131071, null));
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends CalendarUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<CalendarUiState> getUiState() {
        return FlowKt.asStateFlow(get_uiState());
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Bitmap image = get_uiState().getValue().getItemForPreviewDialog().getImage();
        if (image != null) {
            image.recycle();
        }
        Iterator<T> it = get_uiState().getValue().getMainRewardsList().iterator();
        while (it.hasNext()) {
            Bitmap image2 = ((CommonRewardModel) it.next()).getImage();
            if (image2 != null) {
                image2.recycle();
            }
        }
        Iterator<T> it2 = get_uiState().getValue().getBonusRewardsList().iterator();
        while (it2.hasNext()) {
            Bitmap image3 = ((CommonRewardModel) it2.next()).getImage();
            if (image3 != null) {
                image3.recycle();
            }
        }
    }

    public final void initInterface(@NotNull JSONObject json, @NotNull CalendarResponse calendarInfo, @NotNull List<VehiclesDTO> vehiclesList, @NotNull List<SkinsDTO> skinsList, @NotNull List<BpRewardsAwardsDto> listOfAwardsTypes, @NotNull CalendarScreenType savedPage) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(calendarInfo, "calendarInfo");
        Intrinsics.checkNotNullParameter(vehiclesList, "vehiclesList");
        Intrinsics.checkNotNullParameter(skinsList, "skinsList");
        Intrinsics.checkNotNullParameter(listOfAwardsTypes, "listOfAwardsTypes");
        Intrinsics.checkNotNullParameter(savedPage, "savedPage");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new CalendarViewModel$initInterface$1(calendarInfo, json, savedPage, this, vehiclesList, skinsList, listOfAwardsTypes, null), 1, null);
    }

    public final void onPacketIncoming(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new CalendarViewModel$onPacketIncoming$1(json, this, null), 1, null);
    }

    public final void onDialogButtonClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new CalendarViewModel$onDialogButtonClick$1(this, null), 1, null);
    }

    public final void onShowAllRewardsClick() {
        CalendarUiState value;
        CalendarUiState m6879copySbi3iaU;
        MutableStateFlow<? extends CalendarUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            m6879copySbi3iaU = r2.m6879copySbi3iaU((r72 & 1) != 0 ? r2.isInitInterface : false, (r72 & 2) != 0 ? r2.nameOfEvent : null, (r72 & 4) != 0 ? r2.nameOfComebackEvent : null, (r72 & 8) != 0 ? r2.bgOfEventBitmapName : null, (r72 & 16) != 0 ? r2.icOfEventBitmapName : null, (r72 & 32) != 0 ? r2.bgComeBackEventBitmapName : null, (r72 & 64) != 0 ? r2.icComeBackEventBitmapName : null, (r72 & 128) != 0 ? r2.colorOfEvent : 0L, (r72 & 256) != 0 ? r2.textSeasonFirstColor : 0L, (r72 & 512) != 0 ? r2.textSeasonSecondColor : 0L, (r72 & 1024) != 0 ? r2.isNeedShowAllRewards : true, (r72 & 2048) != 0 ? r2.isNeedShowRewardDialog : false, (r72 & 4096) != 0 ? r2.itemForPreviewDialog : null, (r72 & 8192) != 0 ? r2.posItemForPreviewDialog : 0, (r72 & 16384) != 0 ? r2.rewardList : 0, (r72 & 32768) != 0 ? r2.isNeedGetReward : false, (r72 & 65536) != 0 ? r2.daysForEndSeasonMain : 0, (r72 & 131072) != 0 ? r2.daysForEndSeasonComeBack : 0, (r72 & 262144) != 0 ? r2.secondsForNewDay : 0, (r72 & 524288) != 0 ? r2.secondsForReward : 0, (r72 & 1048576) != 0 ? r2.minRewardLevel : 0, (r72 & 2097152) != 0 ? r2.currentLevel : 0, (r72 & 4194304) != 0 ? r2.minComeBackRewardLevel : 0, (r72 & 8388608) != 0 ? r2.mainDaysGame : 0, (r72 & 16777216) != 0 ? r2.comeBackDaysGame : 0, (r72 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.rewardIndexWithTimer : 0, (r72 & 67108864) != 0 ? r2.comeBackSubtitle : null, (r72 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.totalDaysMain : 0, (r72 & 268435456) != 0 ? r2.totalDaysComeBack : 0, (r72 & 536870912) != 0 ? r2.selectedPage : null, (r72 & 1073741824) != 0 ? r2.mainRewardsList : null, (r72 & Integer.MIN_VALUE) != 0 ? r2.bonusRewardsList : null, (r73 & 1) != 0 ? r2.comeBackMainRewardsList : null, (r73 & 2) != 0 ? r2.comeBackBonusRewardsList : null, (r73 & 4) != 0 ? r2.lastOpenedMainReward : 0, (r73 & 8) != 0 ? r2.lastOpenedBonusReward : 0, (r73 & 16) != 0 ? r2.lastOpenedComeBackMainReward : 0, (r73 & 32) != 0 ? r2.lastOpenedComeBackBonusReward : 0, (r73 & 64) != 0 ? r2.isNeedToShowComebackButton : false, (r73 & 128) != 0 ? r2.isNeedToShowNotificationMain : false, (r73 & 256) != 0 ? r2.isNeedToShowNotificationComeBack : false, (r73 & 512) != 0 ? r2.isFinishedSeason : false, (r73 & 1024) != 0 ? r2.isAllRewardsReceived : false, (r73 & 2048) != 0 ? r2.isShowingNewSeasonBp : false, (r73 & 4096) != 0 ? r2.isNeedShowingBpLottieAnimation : false, (r73 & 8192) != 0 ? r2.isShowingTutorial : false, (r73 & 16384) != 0 ? r2.isShowingMainTutorial : false, (r73 & 32768) != 0 ? r2.isShowingBonusTutorial : false, (r73 & 65536) != 0 ? value.isNeedClose : false);
        } while (!mutableStateFlow.compareAndSet(value, m6879copySbi3iaU));
    }

    public final void onTutorialCLick(boolean isMainList) {
        CalendarUiState value;
        CalendarUiState m6879copySbi3iaU;
        CalendarUiState value2;
        CalendarUiState m6879copySbi3iaU2;
        if (isMainList) {
            MutableStateFlow<? extends CalendarUiState> mutableStateFlow = get_uiState();
            do {
                value2 = mutableStateFlow.getValue();
                m6879copySbi3iaU2 = r2.m6879copySbi3iaU((r72 & 1) != 0 ? r2.isInitInterface : false, (r72 & 2) != 0 ? r2.nameOfEvent : null, (r72 & 4) != 0 ? r2.nameOfComebackEvent : null, (r72 & 8) != 0 ? r2.bgOfEventBitmapName : null, (r72 & 16) != 0 ? r2.icOfEventBitmapName : null, (r72 & 32) != 0 ? r2.bgComeBackEventBitmapName : null, (r72 & 64) != 0 ? r2.icComeBackEventBitmapName : null, (r72 & 128) != 0 ? r2.colorOfEvent : 0L, (r72 & 256) != 0 ? r2.textSeasonFirstColor : 0L, (r72 & 512) != 0 ? r2.textSeasonSecondColor : 0L, (r72 & 1024) != 0 ? r2.isNeedShowAllRewards : false, (r72 & 2048) != 0 ? r2.isNeedShowRewardDialog : false, (r72 & 4096) != 0 ? r2.itemForPreviewDialog : null, (r72 & 8192) != 0 ? r2.posItemForPreviewDialog : 0, (r72 & 16384) != 0 ? r2.rewardList : 0, (r72 & 32768) != 0 ? r2.isNeedGetReward : false, (r72 & 65536) != 0 ? r2.daysForEndSeasonMain : 0, (r72 & 131072) != 0 ? r2.daysForEndSeasonComeBack : 0, (r72 & 262144) != 0 ? r2.secondsForNewDay : 0, (r72 & 524288) != 0 ? r2.secondsForReward : 0, (r72 & 1048576) != 0 ? r2.minRewardLevel : 0, (r72 & 2097152) != 0 ? r2.currentLevel : 0, (r72 & 4194304) != 0 ? r2.minComeBackRewardLevel : 0, (r72 & 8388608) != 0 ? r2.mainDaysGame : 0, (r72 & 16777216) != 0 ? r2.comeBackDaysGame : 0, (r72 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.rewardIndexWithTimer : 0, (r72 & 67108864) != 0 ? r2.comeBackSubtitle : null, (r72 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.totalDaysMain : 0, (r72 & 268435456) != 0 ? r2.totalDaysComeBack : 0, (r72 & 536870912) != 0 ? r2.selectedPage : null, (r72 & 1073741824) != 0 ? r2.mainRewardsList : null, (r72 & Integer.MIN_VALUE) != 0 ? r2.bonusRewardsList : null, (r73 & 1) != 0 ? r2.comeBackMainRewardsList : null, (r73 & 2) != 0 ? r2.comeBackBonusRewardsList : null, (r73 & 4) != 0 ? r2.lastOpenedMainReward : 0, (r73 & 8) != 0 ? r2.lastOpenedBonusReward : 0, (r73 & 16) != 0 ? r2.lastOpenedComeBackMainReward : 0, (r73 & 32) != 0 ? r2.lastOpenedComeBackBonusReward : 0, (r73 & 64) != 0 ? r2.isNeedToShowComebackButton : false, (r73 & 128) != 0 ? r2.isNeedToShowNotificationMain : false, (r73 & 256) != 0 ? r2.isNeedToShowNotificationComeBack : false, (r73 & 512) != 0 ? r2.isFinishedSeason : false, (r73 & 1024) != 0 ? r2.isAllRewardsReceived : false, (r73 & 2048) != 0 ? r2.isShowingNewSeasonBp : false, (r73 & 4096) != 0 ? r2.isNeedShowingBpLottieAnimation : false, (r73 & 8192) != 0 ? r2.isShowingTutorial : false, (r73 & 16384) != 0 ? r2.isShowingMainTutorial : true, (r73 & 32768) != 0 ? r2.isShowingBonusTutorial : false, (r73 & 65536) != 0 ? value2.isNeedClose : false);
            } while (!mutableStateFlow.compareAndSet(value2, m6879copySbi3iaU2));
            return;
        }
        MutableStateFlow<? extends CalendarUiState> mutableStateFlow2 = get_uiState();
        do {
            value = mutableStateFlow2.getValue();
            m6879copySbi3iaU = r2.m6879copySbi3iaU((r72 & 1) != 0 ? r2.isInitInterface : false, (r72 & 2) != 0 ? r2.nameOfEvent : null, (r72 & 4) != 0 ? r2.nameOfComebackEvent : null, (r72 & 8) != 0 ? r2.bgOfEventBitmapName : null, (r72 & 16) != 0 ? r2.icOfEventBitmapName : null, (r72 & 32) != 0 ? r2.bgComeBackEventBitmapName : null, (r72 & 64) != 0 ? r2.icComeBackEventBitmapName : null, (r72 & 128) != 0 ? r2.colorOfEvent : 0L, (r72 & 256) != 0 ? r2.textSeasonFirstColor : 0L, (r72 & 512) != 0 ? r2.textSeasonSecondColor : 0L, (r72 & 1024) != 0 ? r2.isNeedShowAllRewards : false, (r72 & 2048) != 0 ? r2.isNeedShowRewardDialog : false, (r72 & 4096) != 0 ? r2.itemForPreviewDialog : null, (r72 & 8192) != 0 ? r2.posItemForPreviewDialog : 0, (r72 & 16384) != 0 ? r2.rewardList : 0, (r72 & 32768) != 0 ? r2.isNeedGetReward : false, (r72 & 65536) != 0 ? r2.daysForEndSeasonMain : 0, (r72 & 131072) != 0 ? r2.daysForEndSeasonComeBack : 0, (r72 & 262144) != 0 ? r2.secondsForNewDay : 0, (r72 & 524288) != 0 ? r2.secondsForReward : 0, (r72 & 1048576) != 0 ? r2.minRewardLevel : 0, (r72 & 2097152) != 0 ? r2.currentLevel : 0, (r72 & 4194304) != 0 ? r2.minComeBackRewardLevel : 0, (r72 & 8388608) != 0 ? r2.mainDaysGame : 0, (r72 & 16777216) != 0 ? r2.comeBackDaysGame : 0, (r72 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.rewardIndexWithTimer : 0, (r72 & 67108864) != 0 ? r2.comeBackSubtitle : null, (r72 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.totalDaysMain : 0, (r72 & 268435456) != 0 ? r2.totalDaysComeBack : 0, (r72 & 536870912) != 0 ? r2.selectedPage : null, (r72 & 1073741824) != 0 ? r2.mainRewardsList : null, (r72 & Integer.MIN_VALUE) != 0 ? r2.bonusRewardsList : null, (r73 & 1) != 0 ? r2.comeBackMainRewardsList : null, (r73 & 2) != 0 ? r2.comeBackBonusRewardsList : null, (r73 & 4) != 0 ? r2.lastOpenedMainReward : 0, (r73 & 8) != 0 ? r2.lastOpenedBonusReward : 0, (r73 & 16) != 0 ? r2.lastOpenedComeBackMainReward : 0, (r73 & 32) != 0 ? r2.lastOpenedComeBackBonusReward : 0, (r73 & 64) != 0 ? r2.isNeedToShowComebackButton : false, (r73 & 128) != 0 ? r2.isNeedToShowNotificationMain : false, (r73 & 256) != 0 ? r2.isNeedToShowNotificationComeBack : false, (r73 & 512) != 0 ? r2.isFinishedSeason : false, (r73 & 1024) != 0 ? r2.isAllRewardsReceived : false, (r73 & 2048) != 0 ? r2.isShowingNewSeasonBp : false, (r73 & 4096) != 0 ? r2.isNeedShowingBpLottieAnimation : false, (r73 & 8192) != 0 ? r2.isShowingTutorial : false, (r73 & 16384) != 0 ? r2.isShowingMainTutorial : false, (r73 & 32768) != 0 ? r2.isShowingBonusTutorial : true, (r73 & 65536) != 0 ? value.isNeedClose : false);
        } while (!mutableStateFlow2.compareAndSet(value, m6879copySbi3iaU));
    }

    public final void onItemClick(int index, boolean isFromMainList, @Nullable Bitmap bitmap) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new CalendarViewModel$onItemClick$1(this, isFromMainList, index, bitmap, null), 1, null);
    }

    public final void onCloseClicked() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new CalendarViewModel$onCloseClicked$1(this, null), 1, null);
    }

    public final void buttonClick(int buttonId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new CalendarViewModel$buttonClick$1(this, buttonId, null), 1, null);
    }

    public final void closeAllRewards() {
        CalendarUiState value;
        CalendarUiState m6879copySbi3iaU;
        MutableStateFlow<? extends CalendarUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            m6879copySbi3iaU = r2.m6879copySbi3iaU((r72 & 1) != 0 ? r2.isInitInterface : false, (r72 & 2) != 0 ? r2.nameOfEvent : null, (r72 & 4) != 0 ? r2.nameOfComebackEvent : null, (r72 & 8) != 0 ? r2.bgOfEventBitmapName : null, (r72 & 16) != 0 ? r2.icOfEventBitmapName : null, (r72 & 32) != 0 ? r2.bgComeBackEventBitmapName : null, (r72 & 64) != 0 ? r2.icComeBackEventBitmapName : null, (r72 & 128) != 0 ? r2.colorOfEvent : 0L, (r72 & 256) != 0 ? r2.textSeasonFirstColor : 0L, (r72 & 512) != 0 ? r2.textSeasonSecondColor : 0L, (r72 & 1024) != 0 ? r2.isNeedShowAllRewards : false, (r72 & 2048) != 0 ? r2.isNeedShowRewardDialog : false, (r72 & 4096) != 0 ? r2.itemForPreviewDialog : null, (r72 & 8192) != 0 ? r2.posItemForPreviewDialog : 0, (r72 & 16384) != 0 ? r2.rewardList : 0, (r72 & 32768) != 0 ? r2.isNeedGetReward : false, (r72 & 65536) != 0 ? r2.daysForEndSeasonMain : 0, (r72 & 131072) != 0 ? r2.daysForEndSeasonComeBack : 0, (r72 & 262144) != 0 ? r2.secondsForNewDay : 0, (r72 & 524288) != 0 ? r2.secondsForReward : 0, (r72 & 1048576) != 0 ? r2.minRewardLevel : 0, (r72 & 2097152) != 0 ? r2.currentLevel : 0, (r72 & 4194304) != 0 ? r2.minComeBackRewardLevel : 0, (r72 & 8388608) != 0 ? r2.mainDaysGame : 0, (r72 & 16777216) != 0 ? r2.comeBackDaysGame : 0, (r72 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.rewardIndexWithTimer : 0, (r72 & 67108864) != 0 ? r2.comeBackSubtitle : null, (r72 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.totalDaysMain : 0, (r72 & 268435456) != 0 ? r2.totalDaysComeBack : 0, (r72 & 536870912) != 0 ? r2.selectedPage : null, (r72 & 1073741824) != 0 ? r2.mainRewardsList : null, (r72 & Integer.MIN_VALUE) != 0 ? r2.bonusRewardsList : null, (r73 & 1) != 0 ? r2.comeBackMainRewardsList : null, (r73 & 2) != 0 ? r2.comeBackBonusRewardsList : null, (r73 & 4) != 0 ? r2.lastOpenedMainReward : 0, (r73 & 8) != 0 ? r2.lastOpenedBonusReward : 0, (r73 & 16) != 0 ? r2.lastOpenedComeBackMainReward : 0, (r73 & 32) != 0 ? r2.lastOpenedComeBackBonusReward : 0, (r73 & 64) != 0 ? r2.isNeedToShowComebackButton : false, (r73 & 128) != 0 ? r2.isNeedToShowNotificationMain : false, (r73 & 256) != 0 ? r2.isNeedToShowNotificationComeBack : false, (r73 & 512) != 0 ? r2.isFinishedSeason : false, (r73 & 1024) != 0 ? r2.isAllRewardsReceived : false, (r73 & 2048) != 0 ? r2.isShowingNewSeasonBp : false, (r73 & 4096) != 0 ? r2.isNeedShowingBpLottieAnimation : false, (r73 & 8192) != 0 ? r2.isShowingTutorial : false, (r73 & 16384) != 0 ? r2.isShowingMainTutorial : false, (r73 & 32768) != 0 ? r2.isShowingBonusTutorial : false, (r73 & 65536) != 0 ? value.isNeedClose : false);
        } while (!mutableStateFlow.compareAndSet(value, m6879copySbi3iaU));
    }

    public final void closeHint() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new CalendarViewModel$closeHint$1(this, null), 1, null);
    }

    public final void showErrorNotification(@NotNull String message) {
        CalendarUiState value;
        CalendarUiState m6879copySbi3iaU;
        Intrinsics.checkNotNullParameter(message, "message");
        getLocalNotification().showErrorNotification(message);
        MutableStateFlow<? extends CalendarUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            m6879copySbi3iaU = r2.m6879copySbi3iaU((r72 & 1) != 0 ? r2.isInitInterface : false, (r72 & 2) != 0 ? r2.nameOfEvent : null, (r72 & 4) != 0 ? r2.nameOfComebackEvent : null, (r72 & 8) != 0 ? r2.bgOfEventBitmapName : null, (r72 & 16) != 0 ? r2.icOfEventBitmapName : null, (r72 & 32) != 0 ? r2.bgComeBackEventBitmapName : null, (r72 & 64) != 0 ? r2.icComeBackEventBitmapName : null, (r72 & 128) != 0 ? r2.colorOfEvent : 0L, (r72 & 256) != 0 ? r2.textSeasonFirstColor : 0L, (r72 & 512) != 0 ? r2.textSeasonSecondColor : 0L, (r72 & 1024) != 0 ? r2.isNeedShowAllRewards : false, (r72 & 2048) != 0 ? r2.isNeedShowRewardDialog : false, (r72 & 4096) != 0 ? r2.itemForPreviewDialog : null, (r72 & 8192) != 0 ? r2.posItemForPreviewDialog : 0, (r72 & 16384) != 0 ? r2.rewardList : 0, (r72 & 32768) != 0 ? r2.isNeedGetReward : false, (r72 & 65536) != 0 ? r2.daysForEndSeasonMain : 0, (r72 & 131072) != 0 ? r2.daysForEndSeasonComeBack : 0, (r72 & 262144) != 0 ? r2.secondsForNewDay : 0, (r72 & 524288) != 0 ? r2.secondsForReward : 0, (r72 & 1048576) != 0 ? r2.minRewardLevel : 0, (r72 & 2097152) != 0 ? r2.currentLevel : 0, (r72 & 4194304) != 0 ? r2.minComeBackRewardLevel : 0, (r72 & 8388608) != 0 ? r2.mainDaysGame : 0, (r72 & 16777216) != 0 ? r2.comeBackDaysGame : 0, (r72 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.rewardIndexWithTimer : 0, (r72 & 67108864) != 0 ? r2.comeBackSubtitle : null, (r72 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.totalDaysMain : 0, (r72 & 268435456) != 0 ? r2.totalDaysComeBack : 0, (r72 & 536870912) != 0 ? r2.selectedPage : null, (r72 & 1073741824) != 0 ? r2.mainRewardsList : null, (r72 & Integer.MIN_VALUE) != 0 ? r2.bonusRewardsList : null, (r73 & 1) != 0 ? r2.comeBackMainRewardsList : null, (r73 & 2) != 0 ? r2.comeBackBonusRewardsList : null, (r73 & 4) != 0 ? r2.lastOpenedMainReward : 0, (r73 & 8) != 0 ? r2.lastOpenedBonusReward : 0, (r73 & 16) != 0 ? r2.lastOpenedComeBackMainReward : 0, (r73 & 32) != 0 ? r2.lastOpenedComeBackBonusReward : 0, (r73 & 64) != 0 ? r2.isNeedToShowComebackButton : false, (r73 & 128) != 0 ? r2.isNeedToShowNotificationMain : false, (r73 & 256) != 0 ? r2.isNeedToShowNotificationComeBack : false, (r73 & 512) != 0 ? r2.isFinishedSeason : false, (r73 & 1024) != 0 ? r2.isAllRewardsReceived : false, (r73 & 2048) != 0 ? r2.isShowingNewSeasonBp : false, (r73 & 4096) != 0 ? r2.isNeedShowingBpLottieAnimation : false, (r73 & 8192) != 0 ? r2.isShowingTutorial : false, (r73 & 16384) != 0 ? r2.isShowingMainTutorial : false, (r73 & 32768) != 0 ? r2.isShowingBonusTutorial : false, (r73 & 65536) != 0 ? value.isNeedClose : true);
        } while (!mutableStateFlow.compareAndSet(value, m6879copySbi3iaU));
    }

    public final void selectPage(@NotNull CalendarScreenType selectedPage) {
        CalendarUiState value;
        CalendarUiState m6879copySbi3iaU;
        Intrinsics.checkNotNullParameter(selectedPage, "selectedPage");
        MutableStateFlow<? extends CalendarUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            m6879copySbi3iaU = r1.m6879copySbi3iaU((r72 & 1) != 0 ? r1.isInitInterface : false, (r72 & 2) != 0 ? r1.nameOfEvent : null, (r72 & 4) != 0 ? r1.nameOfComebackEvent : null, (r72 & 8) != 0 ? r1.bgOfEventBitmapName : null, (r72 & 16) != 0 ? r1.icOfEventBitmapName : null, (r72 & 32) != 0 ? r1.bgComeBackEventBitmapName : null, (r72 & 64) != 0 ? r1.icComeBackEventBitmapName : null, (r72 & 128) != 0 ? r1.colorOfEvent : 0L, (r72 & 256) != 0 ? r1.textSeasonFirstColor : 0L, (r72 & 512) != 0 ? r1.textSeasonSecondColor : 0L, (r72 & 1024) != 0 ? r1.isNeedShowAllRewards : false, (r72 & 2048) != 0 ? r1.isNeedShowRewardDialog : false, (r72 & 4096) != 0 ? r1.itemForPreviewDialog : null, (r72 & 8192) != 0 ? r1.posItemForPreviewDialog : 0, (r72 & 16384) != 0 ? r1.rewardList : 0, (r72 & 32768) != 0 ? r1.isNeedGetReward : false, (r72 & 65536) != 0 ? r1.daysForEndSeasonMain : 0, (r72 & 131072) != 0 ? r1.daysForEndSeasonComeBack : 0, (r72 & 262144) != 0 ? r1.secondsForNewDay : 0, (r72 & 524288) != 0 ? r1.secondsForReward : 0, (r72 & 1048576) != 0 ? r1.minRewardLevel : 0, (r72 & 2097152) != 0 ? r1.currentLevel : 0, (r72 & 4194304) != 0 ? r1.minComeBackRewardLevel : 0, (r72 & 8388608) != 0 ? r1.mainDaysGame : 0, (r72 & 16777216) != 0 ? r1.comeBackDaysGame : 0, (r72 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r1.rewardIndexWithTimer : 0, (r72 & 67108864) != 0 ? r1.comeBackSubtitle : null, (r72 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r1.totalDaysMain : 0, (r72 & 268435456) != 0 ? r1.totalDaysComeBack : 0, (r72 & 536870912) != 0 ? r1.selectedPage : selectedPage, (r72 & 1073741824) != 0 ? r1.mainRewardsList : null, (r72 & Integer.MIN_VALUE) != 0 ? r1.bonusRewardsList : null, (r73 & 1) != 0 ? r1.comeBackMainRewardsList : null, (r73 & 2) != 0 ? r1.comeBackBonusRewardsList : null, (r73 & 4) != 0 ? r1.lastOpenedMainReward : 0, (r73 & 8) != 0 ? r1.lastOpenedBonusReward : 0, (r73 & 16) != 0 ? r1.lastOpenedComeBackMainReward : 0, (r73 & 32) != 0 ? r1.lastOpenedComeBackBonusReward : 0, (r73 & 64) != 0 ? r1.isNeedToShowComebackButton : false, (r73 & 128) != 0 ? r1.isNeedToShowNotificationMain : false, (r73 & 256) != 0 ? r1.isNeedToShowNotificationComeBack : false, (r73 & 512) != 0 ? r1.isFinishedSeason : false, (r73 & 1024) != 0 ? r1.isAllRewardsReceived : false, (r73 & 2048) != 0 ? r1.isShowingNewSeasonBp : false, (r73 & 4096) != 0 ? r1.isNeedShowingBpLottieAnimation : false, (r73 & 8192) != 0 ? r1.isShowingTutorial : false, (r73 & 16384) != 0 ? r1.isShowingMainTutorial : false, (r73 & 32768) != 0 ? r1.isShowingBonusTutorial : false, (r73 & 65536) != 0 ? value.isNeedClose : false);
        } while (!mutableStateFlow.compareAndSet(value, m6879copySbi3iaU));
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x015b, code lost:
    
        if (r0 != 3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x015d, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0173, code lost:
    
        if (r0 != 2) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01d1 -> B:10:0x01ed). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object convertJsonArrayToRewards(int r38, boolean r39, java.util.List<java.lang.Integer> r40, java.util.List<com.blackhub.bronline.game.model.remote.response.calendar.CalendarRewardsDto> r41, java.util.List<com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO> r42, java.util.List<com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO> r43, java.util.List<com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto> r44, kotlin.coroutines.Continuation<? super java.util.List<com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel>> r45) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.calendar.CalendarViewModel.convertJsonArrayToRewards(int, boolean, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ String getActualBottomText$default(CalendarViewModel calendarViewModel, String str, CommonRewardState commonRewardState, CalendarBonusRewardState calendarBonusRewardState, int i, Object obj) {
        if ((i & 2) != 0) {
            commonRewardState = CommonRewardState.NONE;
        }
        if ((i & 4) != 0) {
            calendarBonusRewardState = CalendarBonusRewardState.NONE;
        }
        return calendarViewModel.getActualBottomText(str, commonRewardState, calendarBonusRewardState);
    }

    public final String getActualBottomText(String initBottomText, CommonRewardState mainRewardState, CalendarBonusRewardState bonusRewardState) {
        int i = WhenMappings.$EnumSwitchMapping$0[mainRewardState.ordinal()];
        if (i != 3) {
            if (i == 4 || i == 5) {
                return this.stringResources.calendarBottomTextIsReceived();
            }
            if (i != 6 && i != 7) {
                int i2 = WhenMappings.$EnumSwitchMapping$1[bonusRewardState.ordinal()];
                if (i2 != 1) {
                    if (i2 == 3) {
                        return this.stringResources.calendarBottomTextIsReceived();
                    }
                    if (i2 != 4) {
                        return initBottomText;
                    }
                }
                return this.stringResources.calendarBottomTextIsAvailable();
            }
        }
        return this.stringResources.calendarBottomTextIsAvailable();
    }

    public final ImageModel setImageModel(CalendarRewardsDto reward, List<VehiclesDTO> vehiclesList, List<SkinsDTO> skinsList, List<BpRewardsAwardsDto> listOfAwardsTypes) {
        Object obj;
        List<String> imageList;
        Object obj2;
        String imageName;
        Object obj3;
        List<String> imageList2;
        Object obj4;
        String imageName2;
        String str;
        Integer typeId = reward.getTypeId();
        String str2 = null;
        r1 = null;
        String str3 = null;
        str2 = null;
        if (typeId != null && typeId.intValue() == 11) {
            Iterator<T> it = skinsList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it.next();
                if (Intrinsics.areEqual(((SkinsDTO) obj4).getModelId(), reward.getAwardId())) {
                    break;
                }
            }
            SkinsDTO skinsDTO = (SkinsDTO) obj4;
            String str4 = ((skinsDTO == null || (imageName2 = skinsDTO.getImageName()) == null) && (imageName2 = reward.getImageName()) == null) ? "" : imageName2;
            return new ImageModel(IntExtensionKt.getOrZero(reward.getId()), str4.length() <= 0 ? new RenderAttachment(0, IntExtensionKt.getOrZero(reward.getId()), IntExtensionKt.getOrZero(reward.getAwardId()), 3, 0.78f, 20.0f, 180.0f, 45.0f) : null, str4, ((skinsDTO == null || (str = skinsDTO.getName()) == null) && (str = (String) UtilsKt.buildTypeMerge(reward.getName(), reward.getNameStore())) == null) ? "" : str, AnyExtensionKt.isNotNull(skinsDTO) ? ImageTypePathInCDNEnum.SKIN : ImageTypePathInCDNEnum.ACCESSORY);
        }
        if ((typeId != null && typeId.intValue() == 4) || (typeId != null && typeId.intValue() == 9)) {
            Integer typeId2 = reward.getTypeId();
            ImageTypePathInCDNEnum imageTypePathInCDNEnum = (typeId2 != null && typeId2.intValue() == 4) ? ImageTypePathInCDNEnum.IMAGE : ImageTypePathInCDNEnum.ICON;
            Iterator<T> it2 = listOfAwardsTypes.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it2.next();
                int id = ((BpRewardsAwardsDto) obj3).getId();
                Integer typeId3 = reward.getTypeId();
                if (typeId3 != null && id == typeId3.intValue()) {
                    break;
                }
            }
            BpRewardsAwardsDto bpRewardsAwardsDto = (BpRewardsAwardsDto) obj3;
            if (bpRewardsAwardsDto != null && (imageList2 = bpRewardsAwardsDto.getImageList()) != null) {
                str3 = (String) CollectionsKt___CollectionsKt.getOrNull(imageList2, IntExtensionKt.getOrOne(reward.getAwardId()) - 1);
            }
            String str5 = str3 == null ? "" : str3;
            int orZero = IntExtensionKt.getOrZero(reward.getId());
            String str6 = (String) UtilsKt.buildTypeMerge(reward.getName(), reward.getNameStore());
            return new ImageModel(orZero, null, str5, str6 == null ? "" : str6, imageTypePathInCDNEnum, 2, null);
        }
        if (typeId != null && typeId.intValue() == 5) {
            Iterator<T> it3 = vehiclesList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it3.next();
                if (Intrinsics.areEqual(((VehiclesDTO) obj2).getModelId(), reward.getAwardId())) {
                    break;
                }
            }
            VehiclesDTO vehiclesDTO = (VehiclesDTO) obj2;
            int orZero2 = IntExtensionKt.getOrZero(reward.getId());
            String str7 = ((vehiclesDTO == null || (imageName = vehiclesDTO.getImageName()) == null) && (imageName = reward.getImageName()) == null) ? "" : imageName;
            String str8 = (String) UtilsKt.buildTypeMerge(vehiclesDTO != null ? vehiclesDTO.getName() : null, vehiclesDTO != null ? vehiclesDTO.getNameStore() : null);
            return new ImageModel(orZero2, null, str7, str8 == null ? "" : str8, ImageTypePathInCDNEnum.VEHICLE, 2, null);
        }
        if (typeId != null && typeId.intValue() == -1) {
            int orZero3 = IntExtensionKt.getOrZero(reward.getId());
            String imageName3 = reward.getImageName();
            String str9 = imageName3 == null ? "" : imageName3;
            String str10 = (String) UtilsKt.buildTypeMerge(reward.getName(), reward.getNameStore());
            return new ImageModel(orZero3, null, str9, str10 == null ? "" : str10, ImageTypePathInCDNEnum.IMAGE, 2, null);
        }
        Iterator<T> it4 = listOfAwardsTypes.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj = null;
                break;
            }
            obj = it4.next();
            int id2 = ((BpRewardsAwardsDto) obj).getId();
            Integer typeId4 = reward.getTypeId();
            if (typeId4 != null && id2 == typeId4.intValue()) {
                break;
            }
        }
        BpRewardsAwardsDto bpRewardsAwardsDto2 = (BpRewardsAwardsDto) obj;
        if (bpRewardsAwardsDto2 != null && (imageList = bpRewardsAwardsDto2.getImageList()) != null) {
            str2 = (String) CollectionsKt___CollectionsKt.getOrNull(imageList, 0);
        }
        String str11 = str2 == null ? "" : str2;
        int orZero4 = IntExtensionKt.getOrZero(reward.getId());
        String str12 = (String) UtilsKt.buildTypeMerge(reward.getName(), reward.getNameStore());
        return new ImageModel(orZero4, null, str11, str12 == null ? "" : str12, ImageTypePathInCDNEnum.ICON, 2, null);
    }

    public final int getRewardPosWithTimer(List<Integer> intArray) {
        Iterator<Integer> it = intArray.iterator();
        int i = 0;
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            CommonRewardState.Companion companion = CommonRewardState.INSTANCE;
            if (companion.fromInt(intValue) == CommonRewardState.NORM_TIMER || companion.fromInt(intValue) == CommonRewardState.EPIC_TIMER_NORM_LEVEL || companion.fromInt(intValue) == CommonRewardState.EPIC_TIMER_LOW_LEVEL) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        r7 = r7.listIterator(r7.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r7.hasPrevious() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        r8 = r7.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r8.getMainRewardState() == com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState.NORM_RECEIVED) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r8.getMainRewardState() != com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState.EPIC_RECEIVED) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        r0 = r7.nextIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r2 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int getLastScrollIndexAndFindLastOpenedReward(java.util.List<com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel> r7, boolean r8) {
        /*
            r6 = this;
            r0 = -1
            r1 = 0
            if (r8 == 0) goto L62
            java.util.Iterator r8 = r7.iterator()
            r2 = r1
        L9:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r8.next()
            com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel r3 = (com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel) r3
            com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState r4 = r3.getMainRewardState()
            com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState r5 = com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState.NORM_AVAILABLE
            if (r4 == r5) goto L32
            com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState r4 = r3.getMainRewardState()
            com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState r5 = com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState.EPIC_AVAILABLE_NORW_LEVEL
            if (r4 == r5) goto L32
            com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState r3 = r3.getMainRewardState()
            com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState r4 = com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState.EPIC_AVAILABLE_LOW_LEVEL
            if (r3 != r4) goto L2e
            goto L32
        L2e:
            int r2 = r2 + 1
            goto L9
        L31:
            r2 = r0
        L32:
            if (r2 >= 0) goto L5d
            int r8 = r7.size()
            java.util.ListIterator r7 = r7.listIterator(r8)
        L3c:
            boolean r8 = r7.hasPrevious()
            if (r8 == 0) goto L5c
            java.lang.Object r8 = r7.previous()
            com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel r8 = (com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel) r8
            com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState r2 = r8.getMainRewardState()
            com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState r3 = com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState.NORM_RECEIVED
            if (r2 == r3) goto L58
            com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState r8 = r8.getMainRewardState()
            com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState r2 = com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState.EPIC_RECEIVED
            if (r8 != r2) goto L3c
        L58:
            int r0 = r7.nextIndex()
        L5c:
            r2 = r0
        L5d:
            if (r2 >= 0) goto L60
            goto L86
        L60:
            r1 = r2
            goto L86
        L62:
            int r8 = r7.size()
            java.util.ListIterator r7 = r7.listIterator(r8)
        L6a:
            boolean r8 = r7.hasPrevious()
            if (r8 == 0) goto L82
            java.lang.Object r8 = r7.previous()
            com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel r8 = (com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel) r8
            com.blackhub.bronline.game.gui.calendar.model.CalendarBonusRewardState r8 = r8.getBonusRewardState()
            com.blackhub.bronline.game.gui.calendar.model.CalendarBonusRewardState r2 = com.blackhub.bronline.game.gui.calendar.model.CalendarBonusRewardState.RECEIVED
            if (r8 != r2) goto L6a
            int r0 = r7.nextIndex()
        L82:
            if (r0 >= 0) goto L85
            goto L86
        L85:
            r1 = r0
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.calendar.CalendarViewModel.getLastScrollIndexAndFindLastOpenedReward(java.util.List, boolean):int");
    }
}
