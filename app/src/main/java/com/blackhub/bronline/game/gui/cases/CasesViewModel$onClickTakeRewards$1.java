package com.blackhub.bronline.game.gui.cases;

import androidx.media3.common.C;
import com.blackhub.bronline.game.gui.cases.model.CaseReward;
import com.blackhub.bronline.game.gui.cases.model.CaseSprayedInfoAttachment;
import com.blackhub.bronline.game.gui.cases.network.CasesActionWithJSON;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$onClickTakeRewards$1", f = "CasesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onClickTakeRewards$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1945:1\n1#2:1946\n230#3,5:1947\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onClickTakeRewards$1\n*L\n1149#1:1947,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CasesViewModel$onClickTakeRewards$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ List<CaseReward> $rewardListIsAllRewardsSprayed;
    public int label;
    public final /* synthetic */ CasesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CasesViewModel$onClickTakeRewards$1(List<CaseReward> list, CasesViewModel casesViewModel, Continuation<? super CasesViewModel$onClickTakeRewards$1> continuation) {
        super(2, continuation);
        this.$rewardListIsAllRewardsSprayed = list;
        this.this$0 = casesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CasesViewModel$onClickTakeRewards$1(this.$rewardListIsAllRewardsSprayed, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CasesViewModel$onClickTakeRewards$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CaseSprayedInfoAttachment findNotSprayedRewards;
        CasesActionWithJSON casesActionWithJSON;
        CasesUiState value;
        CasesUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<CaseReward> list = this.$rewardListIsAllRewardsSprayed;
        if (list == null) {
            list = this.this$0.get_uiState().getValue().getGettingTenRewardsList();
        }
        findNotSprayedRewards = this.this$0.findNotSprayedRewards(list);
        List<Integer> notSprayedRewardIdList = findNotSprayedRewards.getNotSprayedRewardIdList();
        if (notSprayedRewardIdList.isEmpty()) {
            notSprayedRewardIdList = null;
        }
        List<Integer> list2 = notSprayedRewardIdList;
        List<Integer> sprayedRewardIdList = findNotSprayedRewards.getSprayedRewardIdList();
        if (sprayedRewardIdList.isEmpty()) {
            sprayedRewardIdList = null;
        }
        casesActionWithJSON = this.this$0.actionWithJSON;
        casesActionWithJSON.takeRewards(list2, sprayedRewardIdList);
        MutableStateFlow<? extends CasesUiState> mutableStateFlow = this.this$0.get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r5.copy((r88 & 1) != 0 ? r5.currentScreen : 1, (r88 & 2) != 0 ? r5.casesStrings : null, (r88 & 4) != 0 ? r5.legendaryCaseId : 0, (r88 & 8) != 0 ? r5.dailyCaseId : 0, (r88 & 16) != 0 ? r5.bcAmount : null, (r88 & 32) != 0 ? r5.valueOfBc : 0, (r88 & 64) != 0 ? r5.widthOfImage : 0, (r88 & 128) != 0 ? r5.heightOfImage : 0, (r88 & 256) != 0 ? r5.bannerAttachment : null, (r88 & 512) != 0 ? r5.selectedReward : null, (r88 & 1024) != 0 ? r5.selectedRewardPos : 0, (r88 & 2048) != 0 ? r5.caseCount : 0, (r88 & 4096) != 0 ? r5.selectedCaseId : 0, (r88 & 8192) != 0 ? r5.goToCasePos : 0, (r88 & 16384) != 0 ? r5.selectedCase : null, (r88 & 32768) != 0 ? r5.currentReward : null, (r88 & 65536) != 0 ? r5.casesList : null, (r88 & 131072) != 0 ? r5.selectedBonuses : null, (r88 & 262144) != 0 ? r5.progressBarBonusPercentList : null, (r88 & 524288) != 0 ? r5.selectedRewards : null, (r88 & 1048576) != 0 ? r5.currentRewardIndex : 0, (r88 & 2097152) != 0 ? r5.currentRewardNumberForUi : 1, (r88 & 4194304) != 0 ? r5.allRewardsOpened : false, (r88 & 8388608) != 0 ? r5.gettingTenRewardsList : CollectionsKt__CollectionsKt.emptyList(), (r88 & 16777216) != 0 ? r5.gettingSelectedRewardIdList : new ArrayList(), (r88 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r5.sprayedRewardIdList : null, (r88 & 67108864) != 0 ? r5.attachmentForServer : new CaseSprayedInfoAttachment(null, null, 3, null), (r88 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r5.totalSprayedDust : 0, (r88 & 268435456) != 0 ? r5.selectedSprayedDust : 0, (r88 & 536870912) != 0 ? r5.isSprayed : false, (r88 & 1073741824) != 0 ? r5.isNeedShowButtonSpray : false, (r88 & Integer.MIN_VALUE) != 0 ? r5.openingsCount : 0, (r89 & 1) != 0 ? r5.openingsProgressBarState : 0, (r89 & 2) != 0 ? r5.casePrices : null, (r89 & 4) != 0 ? r5.casePricesForGuide : null, (r89 & 8) != 0 ? r5.isNeedClose : false, (r89 & 16) != 0 ? r5.valueOfCurrentDust : 0, (r89 & 32) != 0 ? r5.valueOfMaxDust : 0, (r89 & 64) != 0 ? r5.isHintsOpened : false, (r89 & 128) != 0 ? r5.isMainHintDialogOpened : false, (r89 & 256) != 0 ? r5.isHintsBonusInfoOpened : false, (r89 & 512) != 0 ? r5.casesBonusHintAttachment : null, (r89 & 1024) != 0 ? r5.casesResponse : null, (r89 & 2048) != 0 ? r5.awardResponse : null, (r89 & 4096) != 0 ? r5.bgImage : null, (r89 & 8192) != 0 ? r5.bitmapMap : null, (r89 & 16384) != 0 ? r5.prizesBgPattern : null, (r89 & 32768) != 0 ? r5.buttonPurchaseType : 0, (r89 & 65536) != 0 ? r5.isShowDialogConfirmation : false, (r89 & 131072) != 0 ? r5.buttonApplyText : null, (r89 & 262144) != 0 ? r5.dialogConfirmationContextType : 0, (r89 & 524288) != 0 ? r5.titleOpeningCase : null, (r89 & 1048576) != 0 ? r5.valueOfOpenedCases : 0, (r89 & 2097152) != 0 ? r5.priceBcOpeningCases : 0, (r89 & 4194304) != 0 ? r5.getValueOfDust : 0, (r89 & 8388608) != 0 ? r5.isShowDialogPreviewReward : false, (r89 & 16777216) != 0 ? r5.selectedBonusReward : null, (r89 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r5.rewardImage : null, (r89 & 67108864) != 0 ? r5.selectedBonusRewardId : 0, (r89 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r5.isGettingBonusReward : false, (r89 & 268435456) != 0 ? r5.isNeedAddCountSuperCase : false, (r89 & 536870912) != 0 ? r5.isAnimationNeed : false, (r89 & 1073741824) != 0 ? value.isShowingShimmer : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        return Unit.INSTANCE;
    }
}
