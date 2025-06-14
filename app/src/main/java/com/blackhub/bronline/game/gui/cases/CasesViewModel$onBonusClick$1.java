package com.blackhub.bronline.game.gui.cases;

import android.graphics.Bitmap;
import androidx.media3.common.C;
import com.blackhub.bronline.game.gui.cases.model.CaseBonus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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

/* compiled from: CasesViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$onBonusClick$1", f = "CasesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onBonusClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1945:1\n230#2,5:1946\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onBonusClick$1\n*L\n705#1:1946,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CasesViewModel$onBonusClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ CaseBonus $bonus;
    public final /* synthetic */ Bitmap $rewardImage;
    public int label;
    public final /* synthetic */ CasesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CasesViewModel$onBonusClick$1(CaseBonus caseBonus, CasesViewModel casesViewModel, Bitmap bitmap, Continuation<? super CasesViewModel$onBonusClick$1> continuation) {
        super(2, continuation);
        this.$bonus = caseBonus;
        this.this$0 = casesViewModel;
        this.$rewardImage = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CasesViewModel$onBonusClick$1(this.$bonus, this.this$0, this.$rewardImage, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CasesViewModel$onBonusClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CasesUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        boolean z = this.$bonus.getState() == 2;
        MutableStateFlow<? extends CasesUiState> mutableStateFlow = this.this$0.get_uiState();
        CaseBonus caseBonus = this.$bonus;
        Bitmap bitmap = this.$rewardImage;
        while (true) {
            CasesUiState value = mutableStateFlow.getValue();
            Bitmap bitmap2 = bitmap;
            CaseBonus caseBonus2 = caseBonus;
            MutableStateFlow<? extends CasesUiState> mutableStateFlow2 = mutableStateFlow;
            copy = r59.copy((r88 & 1) != 0 ? r59.currentScreen : 0, (r88 & 2) != 0 ? r59.casesStrings : null, (r88 & 4) != 0 ? r59.legendaryCaseId : 0, (r88 & 8) != 0 ? r59.dailyCaseId : 0, (r88 & 16) != 0 ? r59.bcAmount : null, (r88 & 32) != 0 ? r59.valueOfBc : 0, (r88 & 64) != 0 ? r59.widthOfImage : 0, (r88 & 128) != 0 ? r59.heightOfImage : 0, (r88 & 256) != 0 ? r59.bannerAttachment : null, (r88 & 512) != 0 ? r59.selectedReward : null, (r88 & 1024) != 0 ? r59.selectedRewardPos : 0, (r88 & 2048) != 0 ? r59.caseCount : 0, (r88 & 4096) != 0 ? r59.selectedCaseId : 0, (r88 & 8192) != 0 ? r59.goToCasePos : 0, (r88 & 16384) != 0 ? r59.selectedCase : null, (r88 & 32768) != 0 ? r59.currentReward : null, (r88 & 65536) != 0 ? r59.casesList : null, (r88 & 131072) != 0 ? r59.selectedBonuses : null, (r88 & 262144) != 0 ? r59.progressBarBonusPercentList : null, (r88 & 524288) != 0 ? r59.selectedRewards : null, (r88 & 1048576) != 0 ? r59.currentRewardIndex : 0, (r88 & 2097152) != 0 ? r59.currentRewardNumberForUi : 0, (r88 & 4194304) != 0 ? r59.allRewardsOpened : false, (r88 & 8388608) != 0 ? r59.gettingTenRewardsList : null, (r88 & 16777216) != 0 ? r59.gettingSelectedRewardIdList : null, (r88 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r59.sprayedRewardIdList : null, (r88 & 67108864) != 0 ? r59.attachmentForServer : null, (r88 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r59.totalSprayedDust : 0, (r88 & 268435456) != 0 ? r59.selectedSprayedDust : 0, (r88 & 536870912) != 0 ? r59.isSprayed : false, (r88 & 1073741824) != 0 ? r59.isNeedShowButtonSpray : false, (r88 & Integer.MIN_VALUE) != 0 ? r59.openingsCount : 0, (r89 & 1) != 0 ? r59.openingsProgressBarState : 0, (r89 & 2) != 0 ? r59.casePrices : null, (r89 & 4) != 0 ? r59.casePricesForGuide : null, (r89 & 8) != 0 ? r59.isNeedClose : false, (r89 & 16) != 0 ? r59.valueOfCurrentDust : 0, (r89 & 32) != 0 ? r59.valueOfMaxDust : 0, (r89 & 64) != 0 ? r59.isHintsOpened : false, (r89 & 128) != 0 ? r59.isMainHintDialogOpened : false, (r89 & 256) != 0 ? r59.isHintsBonusInfoOpened : false, (r89 & 512) != 0 ? r59.casesBonusHintAttachment : null, (r89 & 1024) != 0 ? r59.casesResponse : null, (r89 & 2048) != 0 ? r59.awardResponse : null, (r89 & 4096) != 0 ? r59.bgImage : null, (r89 & 8192) != 0 ? r59.bitmapMap : null, (r89 & 16384) != 0 ? r59.prizesBgPattern : null, (r89 & 32768) != 0 ? r59.buttonPurchaseType : 0, (r89 & 65536) != 0 ? r59.isShowDialogConfirmation : false, (r89 & 131072) != 0 ? r59.buttonApplyText : null, (r89 & 262144) != 0 ? r59.dialogConfirmationContextType : 0, (r89 & 524288) != 0 ? r59.titleOpeningCase : null, (r89 & 1048576) != 0 ? r59.valueOfOpenedCases : 0, (r89 & 2097152) != 0 ? r59.priceBcOpeningCases : 0, (r89 & 4194304) != 0 ? r59.getValueOfDust : 0, (r89 & 8388608) != 0 ? r59.isShowDialogPreviewReward : true, (r89 & 16777216) != 0 ? r59.selectedBonusReward : caseBonus2, (r89 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r59.rewardImage : bitmap2, (r89 & 67108864) != 0 ? r59.selectedBonusRewardId : 0, (r89 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r59.isGettingBonusReward : z, (r89 & 268435456) != 0 ? r59.isNeedAddCountSuperCase : false, (r89 & 536870912) != 0 ? r59.isAnimationNeed : false, (r89 & 1073741824) != 0 ? value.isShowingShimmer : false);
            if (mutableStateFlow2.compareAndSet(value, copy)) {
                return Unit.INSTANCE;
            }
            mutableStateFlow = mutableStateFlow2;
            bitmap = bitmap2;
            caseBonus = caseBonus2;
        }
    }
}
