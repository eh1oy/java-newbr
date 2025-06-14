package com.blackhub.bronline.game.gui.calendar;

import androidx.media3.common.C;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState;
import com.blackhub.bronline.game.gui.calendar.model.CalendarBonusRewardState;
import com.blackhub.bronline.game.gui.calendar.model.CalendarScreenType;
import com.blackhub.bronline.game.gui.calendar.network.CalendarActionWithJSON;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CalendarViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.calendar.CalendarViewModel$onDialogButtonClick$1", f = "CalendarViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCalendarViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarViewModel.kt\ncom/blackhub/bronline/game/gui/calendar/CalendarViewModel$onDialogButtonClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,899:1\n230#2,5:900\n*S KotlinDebug\n*F\n+ 1 CalendarViewModel.kt\ncom/blackhub/bronline/game/gui/calendar/CalendarViewModel$onDialogButtonClick$1\n*L\n490#1:900,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CalendarViewModel$onDialogButtonClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ CalendarViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarViewModel$onDialogButtonClick$1(CalendarViewModel calendarViewModel, Continuation<? super CalendarViewModel$onDialogButtonClick$1> continuation) {
        super(2, continuation);
        this.this$0 = calendarViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CalendarViewModel$onDialogButtonClick$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CalendarViewModel$onDialogButtonClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        StringResource stringResource;
        CalendarUiState value;
        CalendarUiState m6879copySbi3iaU;
        CalendarActionWithJSON calendarActionWithJSON;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int posItemForPreviewDialog = this.this$0.get_uiState().getValue().getPosItemForPreviewDialog();
        boolean isNeedGetReward = this.this$0.get_uiState().getValue().isNeedGetReward();
        int rewardList = this.this$0.get_uiState().getValue().getRewardList();
        boolean z = this.this$0.get_uiState().getValue().getItemForPreviewDialog().getMainRewardState() == CommonRewardState.EPIC_AVAILABLE_LOW_LEVEL || this.this$0.get_uiState().getValue().getItemForPreviewDialog().getBonusRewardState() == CalendarBonusRewardState.AVAILABLE_LOW_LEVEL;
        int i = this.this$0.getUiState().getValue().getSelectedPage() == CalendarScreenType.MAIN ? 2 : 4;
        if (isNeedGetReward) {
            calendarActionWithJSON = this.this$0.actionWithJSON;
            calendarActionWithJSON.getReward(i, posItemForPreviewDialog, rewardList);
        } else if (z) {
            stringResource = this.this$0.stringResources;
            this.this$0.getLocalNotification().showErrorNotification(stringResource.getString(R.string.calendar_hint_need_lvl_to_get_reward, Boxing.boxInt(this.this$0.get_uiState().getValue().getMinRewardLevel())));
        }
        MutableStateFlow<? extends CalendarUiState> mutableStateFlow = this.this$0.get_uiState();
        do {
            value = mutableStateFlow.getValue();
            m6879copySbi3iaU = r3.m6879copySbi3iaU((r72 & 1) != 0 ? r3.isInitInterface : false, (r72 & 2) != 0 ? r3.nameOfEvent : null, (r72 & 4) != 0 ? r3.nameOfComebackEvent : null, (r72 & 8) != 0 ? r3.bgOfEventBitmapName : null, (r72 & 16) != 0 ? r3.icOfEventBitmapName : null, (r72 & 32) != 0 ? r3.bgComeBackEventBitmapName : null, (r72 & 64) != 0 ? r3.icComeBackEventBitmapName : null, (r72 & 128) != 0 ? r3.colorOfEvent : 0L, (r72 & 256) != 0 ? r3.textSeasonFirstColor : 0L, (r72 & 512) != 0 ? r3.textSeasonSecondColor : 0L, (r72 & 1024) != 0 ? r3.isNeedShowAllRewards : false, (r72 & 2048) != 0 ? r3.isNeedShowRewardDialog : false, (r72 & 4096) != 0 ? r3.itemForPreviewDialog : null, (r72 & 8192) != 0 ? r3.posItemForPreviewDialog : 0, (r72 & 16384) != 0 ? r3.rewardList : 0, (r72 & 32768) != 0 ? r3.isNeedGetReward : false, (r72 & 65536) != 0 ? r3.daysForEndSeasonMain : 0, (r72 & 131072) != 0 ? r3.daysForEndSeasonComeBack : 0, (r72 & 262144) != 0 ? r3.secondsForNewDay : 0, (r72 & 524288) != 0 ? r3.secondsForReward : 0, (r72 & 1048576) != 0 ? r3.minRewardLevel : 0, (r72 & 2097152) != 0 ? r3.currentLevel : 0, (r72 & 4194304) != 0 ? r3.minComeBackRewardLevel : 0, (r72 & 8388608) != 0 ? r3.mainDaysGame : 0, (r72 & 16777216) != 0 ? r3.comeBackDaysGame : 0, (r72 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r3.rewardIndexWithTimer : 0, (r72 & 67108864) != 0 ? r3.comeBackSubtitle : null, (r72 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.totalDaysMain : 0, (r72 & 268435456) != 0 ? r3.totalDaysComeBack : 0, (r72 & 536870912) != 0 ? r3.selectedPage : null, (r72 & 1073741824) != 0 ? r3.mainRewardsList : null, (r72 & Integer.MIN_VALUE) != 0 ? r3.bonusRewardsList : null, (r73 & 1) != 0 ? r3.comeBackMainRewardsList : null, (r73 & 2) != 0 ? r3.comeBackBonusRewardsList : null, (r73 & 4) != 0 ? r3.lastOpenedMainReward : 0, (r73 & 8) != 0 ? r3.lastOpenedBonusReward : 0, (r73 & 16) != 0 ? r3.lastOpenedComeBackMainReward : 0, (r73 & 32) != 0 ? r3.lastOpenedComeBackBonusReward : 0, (r73 & 64) != 0 ? r3.isNeedToShowComebackButton : false, (r73 & 128) != 0 ? r3.isNeedToShowNotificationMain : false, (r73 & 256) != 0 ? r3.isNeedToShowNotificationComeBack : false, (r73 & 512) != 0 ? r3.isFinishedSeason : false, (r73 & 1024) != 0 ? r3.isAllRewardsReceived : false, (r73 & 2048) != 0 ? r3.isShowingNewSeasonBp : false, (r73 & 4096) != 0 ? r3.isNeedShowingBpLottieAnimation : false, (r73 & 8192) != 0 ? r3.isShowingTutorial : false, (r73 & 16384) != 0 ? r3.isShowingMainTutorial : false, (r73 & 32768) != 0 ? r3.isShowingBonusTutorial : false, (r73 & 65536) != 0 ? value.isNeedClose : false);
        } while (!mutableStateFlow.compareAndSet(value, m6879copySbi3iaU));
        return Unit.INSTANCE;
    }
}
