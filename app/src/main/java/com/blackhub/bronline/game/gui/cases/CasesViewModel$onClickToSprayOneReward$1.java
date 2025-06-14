package com.blackhub.bronline.game.gui.cases;

import androidx.media3.common.C;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.cases.model.CaseReward;
import com.blackhub.bronline.game.gui.cases.network.CasesActionWithJSON;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
/* compiled from: CasesViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$onClickToSprayOneReward$1", f = "CasesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onClickToSprayOneReward$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1945:1\n230#2,5:1946\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onClickToSprayOneReward$1\n*L\n1244#1:1946,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CasesViewModel$onClickToSprayOneReward$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ CasesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CasesViewModel$onClickToSprayOneReward$1(CasesViewModel casesViewModel, Continuation<? super CasesViewModel$onClickToSprayOneReward$1> continuation) {
        super(2, continuation);
        this.this$0 = casesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CasesViewModel$onClickToSprayOneReward$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CasesViewModel$onClickToSprayOneReward$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CasesActionWithJSON casesActionWithJSON;
        StringResource stringResource;
        CasesUiState value;
        CasesUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CaseReward singleFirstReward = this.this$0.get_uiState().getValue().getSingleFirstReward();
        casesActionWithJSON = this.this$0.actionWithJSON;
        casesActionWithJSON.takeRewards(null, CollectionsKt__CollectionsJVMKt.listOf(Boxing.boxInt(singleFirstReward.getRewardId())));
        LocalNotification localNotification = this.this$0.getLocalNotification();
        stringResource = this.this$0.stringResources;
        localNotification.showPositiveNotification(stringResource.getString(R.string.cases_main_notification_reward_sprayed));
        MutableStateFlow<? extends CasesUiState> mutableStateFlow = this.this$0.get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r88 & 1) != 0 ? r3.currentScreen : 1, (r88 & 2) != 0 ? r3.casesStrings : null, (r88 & 4) != 0 ? r3.legendaryCaseId : 0, (r88 & 8) != 0 ? r3.dailyCaseId : 0, (r88 & 16) != 0 ? r3.bcAmount : null, (r88 & 32) != 0 ? r3.valueOfBc : 0, (r88 & 64) != 0 ? r3.widthOfImage : 0, (r88 & 128) != 0 ? r3.heightOfImage : 0, (r88 & 256) != 0 ? r3.bannerAttachment : null, (r88 & 512) != 0 ? r3.selectedReward : null, (r88 & 1024) != 0 ? r3.selectedRewardPos : 0, (r88 & 2048) != 0 ? r3.caseCount : 0, (r88 & 4096) != 0 ? r3.selectedCaseId : 0, (r88 & 8192) != 0 ? r3.goToCasePos : 0, (r88 & 16384) != 0 ? r3.selectedCase : null, (r88 & 32768) != 0 ? r3.currentReward : null, (r88 & 65536) != 0 ? r3.casesList : null, (r88 & 131072) != 0 ? r3.selectedBonuses : null, (r88 & 262144) != 0 ? r3.progressBarBonusPercentList : null, (r88 & 524288) != 0 ? r3.selectedRewards : null, (r88 & 1048576) != 0 ? r3.currentRewardIndex : 0, (r88 & 2097152) != 0 ? r3.currentRewardNumberForUi : 0, (r88 & 4194304) != 0 ? r3.allRewardsOpened : false, (r88 & 8388608) != 0 ? r3.gettingTenRewardsList : CollectionsKt__CollectionsKt.emptyList(), (r88 & 16777216) != 0 ? r3.gettingSelectedRewardIdList : new ArrayList(), (r88 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r3.sprayedRewardIdList : null, (r88 & 67108864) != 0 ? r3.attachmentForServer : null, (r88 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.totalSprayedDust : 0, (r88 & 268435456) != 0 ? r3.selectedSprayedDust : 0, (r88 & 536870912) != 0 ? r3.isSprayed : false, (r88 & 1073741824) != 0 ? r3.isNeedShowButtonSpray : false, (r88 & Integer.MIN_VALUE) != 0 ? r3.openingsCount : 0, (r89 & 1) != 0 ? r3.openingsProgressBarState : 0, (r89 & 2) != 0 ? r3.casePrices : null, (r89 & 4) != 0 ? r3.casePricesForGuide : null, (r89 & 8) != 0 ? r3.isNeedClose : false, (r89 & 16) != 0 ? r3.valueOfCurrentDust : 0, (r89 & 32) != 0 ? r3.valueOfMaxDust : 0, (r89 & 64) != 0 ? r3.isHintsOpened : false, (r89 & 128) != 0 ? r3.isMainHintDialogOpened : false, (r89 & 256) != 0 ? r3.isHintsBonusInfoOpened : false, (r89 & 512) != 0 ? r3.casesBonusHintAttachment : null, (r89 & 1024) != 0 ? r3.casesResponse : null, (r89 & 2048) != 0 ? r3.awardResponse : null, (r89 & 4096) != 0 ? r3.bgImage : null, (r89 & 8192) != 0 ? r3.bitmapMap : null, (r89 & 16384) != 0 ? r3.prizesBgPattern : null, (r89 & 32768) != 0 ? r3.buttonPurchaseType : 0, (r89 & 65536) != 0 ? r3.isShowDialogConfirmation : false, (r89 & 131072) != 0 ? r3.buttonApplyText : null, (r89 & 262144) != 0 ? r3.dialogConfirmationContextType : 0, (r89 & 524288) != 0 ? r3.titleOpeningCase : null, (r89 & 1048576) != 0 ? r3.valueOfOpenedCases : 0, (r89 & 2097152) != 0 ? r3.priceBcOpeningCases : 0, (r89 & 4194304) != 0 ? r3.getValueOfDust : 0, (r89 & 8388608) != 0 ? r3.isShowDialogPreviewReward : false, (r89 & 16777216) != 0 ? r3.selectedBonusReward : null, (r89 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r3.rewardImage : null, (r89 & 67108864) != 0 ? r3.selectedBonusRewardId : 0, (r89 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.isGettingBonusReward : false, (r89 & 268435456) != 0 ? r3.isNeedAddCountSuperCase : false, (r89 & 536870912) != 0 ? r3.isAnimationNeed : false, (r89 & 1073741824) != 0 ? value.isShowingShimmer : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        return Unit.INSTANCE;
    }
}
