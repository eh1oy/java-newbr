package com.blackhub.bronline.game.gui.cases;

import androidx.media3.common.C;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.cases.model.CaseReward;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$onClickToSprayRewards$1", f = "CasesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onClickToSprayRewards$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1945:1\n1549#2:1946\n1620#2,3:1947\n230#3,5:1950\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onClickToSprayRewards$1\n*L\n1197#1:1946\n1197#1:1947,3\n1218#1:1950,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CasesViewModel$onClickToSprayRewards$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ CasesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CasesViewModel$onClickToSprayRewards$1(CasesViewModel casesViewModel, Continuation<? super CasesViewModel$onClickToSprayRewards$1> continuation) {
        super(2, continuation);
        this.this$0 = casesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CasesViewModel$onClickToSprayRewards$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CasesViewModel$onClickToSprayRewards$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        StringResource stringResource;
        CasesUiState copy;
        StringResource stringResource2;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Ref.IntRef intRef = new Ref.IntRef();
        List<Integer> gettingSelectedRewardIdList = this.this$0.get_uiState().getValue().getGettingSelectedRewardIdList();
        List<Integer> sprayedRewardIdList = this.this$0.get_uiState().getValue().getSprayedRewardIdList();
        sprayedRewardIdList.addAll(gettingSelectedRewardIdList);
        List<CaseReward> gettingTenRewardsList = this.this$0.get_uiState().getValue().getGettingTenRewardsList();
        CasesViewModel casesViewModel = this.this$0;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(gettingTenRewardsList, 10));
        for (CaseReward caseReward : gettingTenRewardsList) {
            if (caseReward.getAlreadySprayed() || caseReward.isSelected()) {
                intRef.element++;
            }
            if (caseReward.isSelected()) {
                CommonRarityEnum commonRarityEnum = CommonRarityEnum.SPRAYED;
                stringResource2 = casesViewModel.stringResources;
                caseReward = caseReward.copy((r35 & 1) != 0 ? caseReward.rewardId : 0, (r35 & 2) != 0 ? caseReward.rewardType : 0, (r35 & 4) != 0 ? caseReward.rewardName : stringResource2.getString(R.string.cases_sprayed), (r35 & 8) != 0 ? caseReward.rewardNameStore : null, (r35 & 16) != 0 ? caseReward.dustCountText : null, (r35 & 32) != 0 ? caseReward.dustSprayedText : null, (r35 & 64) != 0 ? caseReward.dustValue : 0, (r35 & 128) != 0 ? caseReward.imageBitmap : null, (r35 & 256) != 0 ? caseReward.rarity : commonRarityEnum, (r35 & 512) != 0 ? caseReward.sprayed : false, (r35 & 1024) != 0 ? caseReward.alreadySprayed : true, (r35 & 2048) != 0 ? caseReward.isSelected : false, (r35 & 4096) != 0 ? caseReward.count : 0, (r35 & 8192) != 0 ? caseReward.isRender : false, (r35 & 16384) != 0 ? caseReward.renderAttachment : null, (r35 & 32768) != 0 ? caseReward.imageName : null, (r35 & 65536) != 0 ? caseReward.internalId : 0);
            }
            arrayList.add(caseReward);
        }
        LocalNotification localNotification = this.this$0.getLocalNotification();
        stringResource = this.this$0.stringResources;
        localNotification.showPositiveNotification(stringResource.getString(R.string.cases_main_notification_rewards_sprayed));
        if (intRef.element == arrayList.size()) {
            this.this$0.onClickTakeRewards(arrayList);
        } else {
            MutableStateFlow<? extends CasesUiState> mutableStateFlow = this.this$0.get_uiState();
            CasesViewModel casesViewModel2 = this.this$0;
            while (true) {
                CasesUiState value = mutableStateFlow.getValue();
                ArrayList arrayList2 = arrayList;
                copy = r4.copy((r88 & 1) != 0 ? r4.currentScreen : 0, (r88 & 2) != 0 ? r4.casesStrings : null, (r88 & 4) != 0 ? r4.legendaryCaseId : 0, (r88 & 8) != 0 ? r4.dailyCaseId : 0, (r88 & 16) != 0 ? r4.bcAmount : null, (r88 & 32) != 0 ? r4.valueOfBc : 0, (r88 & 64) != 0 ? r4.widthOfImage : 0, (r88 & 128) != 0 ? r4.heightOfImage : 0, (r88 & 256) != 0 ? r4.bannerAttachment : null, (r88 & 512) != 0 ? r4.selectedReward : null, (r88 & 1024) != 0 ? r4.selectedRewardPos : 0, (r88 & 2048) != 0 ? r4.caseCount : 0, (r88 & 4096) != 0 ? r4.selectedCaseId : 0, (r88 & 8192) != 0 ? r4.goToCasePos : 0, (r88 & 16384) != 0 ? r4.selectedCase : null, (r88 & 32768) != 0 ? r4.currentReward : null, (r88 & 65536) != 0 ? r4.casesList : null, (r88 & 131072) != 0 ? r4.selectedBonuses : null, (r88 & 262144) != 0 ? r4.progressBarBonusPercentList : null, (r88 & 524288) != 0 ? r4.selectedRewards : null, (r88 & 1048576) != 0 ? r4.currentRewardIndex : 0, (r88 & 2097152) != 0 ? r4.currentRewardNumberForUi : 0, (r88 & 4194304) != 0 ? r4.allRewardsOpened : false, (r88 & 8388608) != 0 ? r4.gettingTenRewardsList : arrayList2, (r88 & 16777216) != 0 ? r4.gettingSelectedRewardIdList : new ArrayList(), (r88 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r4.sprayedRewardIdList : sprayedRewardIdList, (r88 & 67108864) != 0 ? r4.attachmentForServer : null, (r88 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r4.totalSprayedDust : 0, (r88 & 268435456) != 0 ? r4.selectedSprayedDust : 0, (r88 & 536870912) != 0 ? r4.isSprayed : true, (r88 & 1073741824) != 0 ? r4.isNeedShowButtonSpray : false, (r88 & Integer.MIN_VALUE) != 0 ? r4.openingsCount : 0, (r89 & 1) != 0 ? r4.openingsProgressBarState : 0, (r89 & 2) != 0 ? r4.casePrices : null, (r89 & 4) != 0 ? r4.casePricesForGuide : null, (r89 & 8) != 0 ? r4.isNeedClose : false, (r89 & 16) != 0 ? r4.valueOfCurrentDust : casesViewModel2.get_uiState().getValue().getGetValueOfPreviewDust(), (r89 & 32) != 0 ? r4.valueOfMaxDust : 0, (r89 & 64) != 0 ? r4.isHintsOpened : false, (r89 & 128) != 0 ? r4.isMainHintDialogOpened : false, (r89 & 256) != 0 ? r4.isHintsBonusInfoOpened : false, (r89 & 512) != 0 ? r4.casesBonusHintAttachment : null, (r89 & 1024) != 0 ? r4.casesResponse : null, (r89 & 2048) != 0 ? r4.awardResponse : null, (r89 & 4096) != 0 ? r4.bgImage : null, (r89 & 8192) != 0 ? r4.bitmapMap : null, (r89 & 16384) != 0 ? r4.prizesBgPattern : null, (r89 & 32768) != 0 ? r4.buttonPurchaseType : 0, (r89 & 65536) != 0 ? r4.isShowDialogConfirmation : false, (r89 & 131072) != 0 ? r4.buttonApplyText : null, (r89 & 262144) != 0 ? r4.dialogConfirmationContextType : 0, (r89 & 524288) != 0 ? r4.titleOpeningCase : null, (r89 & 1048576) != 0 ? r4.valueOfOpenedCases : 0, (r89 & 2097152) != 0 ? r4.priceBcOpeningCases : 0, (r89 & 4194304) != 0 ? r4.getValueOfDust : 0, (r89 & 8388608) != 0 ? r4.isShowDialogPreviewReward : false, (r89 & 16777216) != 0 ? r4.selectedBonusReward : null, (r89 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r4.rewardImage : null, (r89 & 67108864) != 0 ? r4.selectedBonusRewardId : 0, (r89 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r4.isGettingBonusReward : false, (r89 & 268435456) != 0 ? r4.isNeedAddCountSuperCase : false, (r89 & 536870912) != 0 ? r4.isAnimationNeed : false, (r89 & 1073741824) != 0 ? value.isShowingShimmer : false);
                if (mutableStateFlow.compareAndSet(value, copy)) {
                    break;
                }
                arrayList = arrayList2;
            }
        }
        return Unit.INSTANCE;
    }
}
