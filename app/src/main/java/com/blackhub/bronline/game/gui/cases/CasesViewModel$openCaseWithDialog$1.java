package com.blackhub.bronline.game.gui.cases;

import androidx.compose.ui.text.AnnotatedString;
import androidx.media3.common.C;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.cases.model.CasePricesModel;
import com.blackhub.bronline.game.gui.cases.model.CasesText;
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
import kotlin.jvm.internal.StringCompanionObject;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$openCaseWithDialog$1", f = "CasesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$openCaseWithDialog$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1945:1\n230#2,5:1946\n230#2,5:1951\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$openCaseWithDialog$1\n*L\n838#1:1946,5\n875#1:1951,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CasesViewModel$openCaseWithDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ float $btnWidth;
    public final /* synthetic */ int $buttonType;
    public int label;
    public final /* synthetic */ CasesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CasesViewModel$openCaseWithDialog$1(float f, CasesViewModel casesViewModel, int i, Continuation<? super CasesViewModel$openCaseWithDialog$1> continuation) {
        super(2, continuation);
        this.$btnWidth = f;
        this.this$0 = casesViewModel;
        this.$buttonType = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CasesViewModel$openCaseWithDialog$1(this.$btnWidth, this.this$0, this.$buttonType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CasesViewModel$openCaseWithDialog$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        float count;
        int priceTenCases;
        Integer boxInt;
        StringResource stringResource;
        AnnotatedString htmlTextToAnnotatedString;
        AnnotatedString annotatedString;
        CasesUiState value;
        StringResource stringResource2;
        CasesUiState copy;
        StringResource stringResource3;
        StringResource stringResource4;
        StringResource stringResource5;
        CasesUiState value2;
        StringResource stringResource6;
        CasesUiState copy2;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int i = 0;
        boolean z = this.$btnWidth == 0.5f;
        CasePricesModel casePrices = this.this$0.get_uiState().getValue().getCasePrices();
        String name = this.this$0.get_uiState().getValue().getSelectedCase().getName();
        int i2 = this.$buttonType;
        int i3 = i2 == 1 ? 1 : 10;
        if (i2 == 1) {
            int typeOpenOneCaseButton = this.this$0.get_uiState().getValue().getCasePrices().getTypeOpenOneCaseButton();
            if (typeOpenOneCaseButton == 1) {
                boxInt = Boxing.boxInt(this.this$0.get_uiState().getValue().getCasePrices().getPriceOneCase());
            } else if (typeOpenOneCaseButton == 2) {
                boxInt = this.this$0.get_uiState().getValue().getCasePrices().getSalePriceOneCase();
            } else {
                boxInt = Boxing.boxInt(0);
            }
        } else {
            int typeOpenTenCaseButton = this.this$0.get_uiState().getValue().getCasePrices().getTypeOpenTenCaseButton();
            if (typeOpenTenCaseButton == 1) {
                count = (10 - r5.getCount()) / 10.0f;
                priceTenCases = casePrices.getPriceTenCases();
            } else {
                if (typeOpenTenCaseButton == 2) {
                    count = (10 - r5.getCount()) / 10.0f;
                    priceTenCases = IntExtensionKt.getOrOne(casePrices.getSalePriceTenCases());
                }
                boxInt = Boxing.boxInt(i);
            }
            i = (int) (count * priceTenCases);
            boxInt = Boxing.boxInt(i);
        }
        int orZero = IntExtensionKt.getOrZero(boxInt);
        if (orZero > this.this$0.get_uiState().getValue().getValueOfBc()) {
            stringResource5 = this.this$0.stringResources;
            CasesText copy$default = CasesText.copy$default(this.this$0.get_uiState().getValue().getCasesStrings(), null, null, null, null, StringExtensionKt.htmlTextToAnnotatedString(stringResource5.getString(R.string.common_not_enough_bc)), new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null), null, 79, null);
            MutableStateFlow<? extends CasesUiState> mutableStateFlow = this.this$0.get_uiState();
            CasesViewModel casesViewModel = this.this$0;
            do {
                value2 = mutableStateFlow.getValue();
                stringResource6 = casesViewModel.stringResources;
                copy2 = r12.copy((r88 & 1) != 0 ? r12.currentScreen : 0, (r88 & 2) != 0 ? r12.casesStrings : copy$default, (r88 & 4) != 0 ? r12.legendaryCaseId : 0, (r88 & 8) != 0 ? r12.dailyCaseId : 0, (r88 & 16) != 0 ? r12.bcAmount : null, (r88 & 32) != 0 ? r12.valueOfBc : 0, (r88 & 64) != 0 ? r12.widthOfImage : 0, (r88 & 128) != 0 ? r12.heightOfImage : 0, (r88 & 256) != 0 ? r12.bannerAttachment : null, (r88 & 512) != 0 ? r12.selectedReward : null, (r88 & 1024) != 0 ? r12.selectedRewardPos : 0, (r88 & 2048) != 0 ? r12.caseCount : 0, (r88 & 4096) != 0 ? r12.selectedCaseId : 0, (r88 & 8192) != 0 ? r12.goToCasePos : 0, (r88 & 16384) != 0 ? r12.selectedCase : null, (r88 & 32768) != 0 ? r12.currentReward : null, (r88 & 65536) != 0 ? r12.casesList : null, (r88 & 131072) != 0 ? r12.selectedBonuses : null, (r88 & 262144) != 0 ? r12.progressBarBonusPercentList : null, (r88 & 524288) != 0 ? r12.selectedRewards : null, (r88 & 1048576) != 0 ? r12.currentRewardIndex : 0, (r88 & 2097152) != 0 ? r12.currentRewardNumberForUi : 0, (r88 & 4194304) != 0 ? r12.allRewardsOpened : false, (r88 & 8388608) != 0 ? r12.gettingTenRewardsList : null, (r88 & 16777216) != 0 ? r12.gettingSelectedRewardIdList : null, (r88 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r12.sprayedRewardIdList : null, (r88 & 67108864) != 0 ? r12.attachmentForServer : null, (r88 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r12.totalSprayedDust : 0, (r88 & 268435456) != 0 ? r12.selectedSprayedDust : 0, (r88 & 536870912) != 0 ? r12.isSprayed : false, (r88 & 1073741824) != 0 ? r12.isNeedShowButtonSpray : false, (r88 & Integer.MIN_VALUE) != 0 ? r12.openingsCount : 0, (r89 & 1) != 0 ? r12.openingsProgressBarState : 0, (r89 & 2) != 0 ? r12.casePrices : null, (r89 & 4) != 0 ? r12.casePricesForGuide : null, (r89 & 8) != 0 ? r12.isNeedClose : false, (r89 & 16) != 0 ? r12.valueOfCurrentDust : 0, (r89 & 32) != 0 ? r12.valueOfMaxDust : 0, (r89 & 64) != 0 ? r12.isHintsOpened : false, (r89 & 128) != 0 ? r12.isMainHintDialogOpened : false, (r89 & 256) != 0 ? r12.isHintsBonusInfoOpened : false, (r89 & 512) != 0 ? r12.casesBonusHintAttachment : null, (r89 & 1024) != 0 ? r12.casesResponse : null, (r89 & 2048) != 0 ? r12.awardResponse : null, (r89 & 4096) != 0 ? r12.bgImage : null, (r89 & 8192) != 0 ? r12.bitmapMap : null, (r89 & 16384) != 0 ? r12.prizesBgPattern : null, (r89 & 32768) != 0 ? r12.buttonPurchaseType : 0, (r89 & 65536) != 0 ? r12.isShowDialogConfirmation : true, (r89 & 131072) != 0 ? r12.buttonApplyText : stringResource6.getString(R.string.common_yes), (r89 & 262144) != 0 ? r12.dialogConfirmationContextType : 3, (r89 & 524288) != 0 ? r12.titleOpeningCase : null, (r89 & 1048576) != 0 ? r12.valueOfOpenedCases : 0, (r89 & 2097152) != 0 ? r12.priceBcOpeningCases : 0, (r89 & 4194304) != 0 ? r12.getValueOfDust : 0, (r89 & 8388608) != 0 ? r12.isShowDialogPreviewReward : false, (r89 & 16777216) != 0 ? r12.selectedBonusReward : null, (r89 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r12.rewardImage : null, (r89 & 67108864) != 0 ? r12.selectedBonusRewardId : 0, (r89 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r12.isGettingBonusReward : false, (r89 & 268435456) != 0 ? r12.isNeedAddCountSuperCase : false, (r89 & 536870912) != 0 ? r12.isAnimationNeed : false, (r89 & 1073741824) != 0 ? value2.isShowingShimmer : false);
            } while (!mutableStateFlow.compareAndSet(value2, copy2));
        } else {
            if (z) {
                stringResource4 = this.this$0.stringResources;
                htmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(stringResource4.casesPurchaseCase(name, i3, orZero));
            } else {
                stringResource = this.this$0.stringResources;
                htmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(stringResource.casesOpenCase(name, i3));
            }
            AnnotatedString annotatedString2 = htmlTextToAnnotatedString;
            if (z) {
                stringResource3 = this.this$0.stringResources;
                annotatedString = StringExtensionKt.htmlTextToAnnotatedString(stringResource3.getString(R.string.cases_opening_case_info));
            } else {
                annotatedString = new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null);
            }
            CasesText copy$default2 = CasesText.copy$default(this.this$0.get_uiState().getValue().getCasesStrings(), null, null, null, null, annotatedString2, annotatedString, null, 79, null);
            int i4 = z ? 1 : 2;
            MutableStateFlow<? extends CasesUiState> mutableStateFlow2 = this.this$0.get_uiState();
            CasesViewModel casesViewModel2 = this.this$0;
            int i5 = this.$buttonType;
            do {
                value = mutableStateFlow2.getValue();
                stringResource2 = casesViewModel2.stringResources;
                copy = r21.copy((r88 & 1) != 0 ? r21.currentScreen : 0, (r88 & 2) != 0 ? r21.casesStrings : copy$default2, (r88 & 4) != 0 ? r21.legendaryCaseId : 0, (r88 & 8) != 0 ? r21.dailyCaseId : 0, (r88 & 16) != 0 ? r21.bcAmount : null, (r88 & 32) != 0 ? r21.valueOfBc : 0, (r88 & 64) != 0 ? r21.widthOfImage : 0, (r88 & 128) != 0 ? r21.heightOfImage : 0, (r88 & 256) != 0 ? r21.bannerAttachment : null, (r88 & 512) != 0 ? r21.selectedReward : null, (r88 & 1024) != 0 ? r21.selectedRewardPos : 0, (r88 & 2048) != 0 ? r21.caseCount : 0, (r88 & 4096) != 0 ? r21.selectedCaseId : 0, (r88 & 8192) != 0 ? r21.goToCasePos : 0, (r88 & 16384) != 0 ? r21.selectedCase : null, (r88 & 32768) != 0 ? r21.currentReward : null, (r88 & 65536) != 0 ? r21.casesList : null, (r88 & 131072) != 0 ? r21.selectedBonuses : null, (r88 & 262144) != 0 ? r21.progressBarBonusPercentList : null, (r88 & 524288) != 0 ? r21.selectedRewards : null, (r88 & 1048576) != 0 ? r21.currentRewardIndex : 0, (r88 & 2097152) != 0 ? r21.currentRewardNumberForUi : 0, (r88 & 4194304) != 0 ? r21.allRewardsOpened : false, (r88 & 8388608) != 0 ? r21.gettingTenRewardsList : null, (r88 & 16777216) != 0 ? r21.gettingSelectedRewardIdList : null, (r88 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r21.sprayedRewardIdList : null, (r88 & 67108864) != 0 ? r21.attachmentForServer : null, (r88 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r21.totalSprayedDust : 0, (r88 & 268435456) != 0 ? r21.selectedSprayedDust : 0, (r88 & 536870912) != 0 ? r21.isSprayed : false, (r88 & 1073741824) != 0 ? r21.isNeedShowButtonSpray : false, (r88 & Integer.MIN_VALUE) != 0 ? r21.openingsCount : 0, (r89 & 1) != 0 ? r21.openingsProgressBarState : 0, (r89 & 2) != 0 ? r21.casePrices : null, (r89 & 4) != 0 ? r21.casePricesForGuide : null, (r89 & 8) != 0 ? r21.isNeedClose : false, (r89 & 16) != 0 ? r21.valueOfCurrentDust : 0, (r89 & 32) != 0 ? r21.valueOfMaxDust : 0, (r89 & 64) != 0 ? r21.isHintsOpened : false, (r89 & 128) != 0 ? r21.isMainHintDialogOpened : false, (r89 & 256) != 0 ? r21.isHintsBonusInfoOpened : false, (r89 & 512) != 0 ? r21.casesBonusHintAttachment : null, (r89 & 1024) != 0 ? r21.casesResponse : null, (r89 & 2048) != 0 ? r21.awardResponse : null, (r89 & 4096) != 0 ? r21.bgImage : null, (r89 & 8192) != 0 ? r21.bitmapMap : null, (r89 & 16384) != 0 ? r21.prizesBgPattern : null, (r89 & 32768) != 0 ? r21.buttonPurchaseType : i5, (r89 & 65536) != 0 ? r21.isShowDialogConfirmation : true, (r89 & 131072) != 0 ? r21.buttonApplyText : stringResource2.getString(R.string.common_apply), (r89 & 262144) != 0 ? r21.dialogConfirmationContextType : i4, (r89 & 524288) != 0 ? r21.titleOpeningCase : null, (r89 & 1048576) != 0 ? r21.valueOfOpenedCases : 0, (r89 & 2097152) != 0 ? r21.priceBcOpeningCases : 0, (r89 & 4194304) != 0 ? r21.getValueOfDust : 0, (r89 & 8388608) != 0 ? r21.isShowDialogPreviewReward : false, (r89 & 16777216) != 0 ? r21.selectedBonusReward : null, (r89 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r21.rewardImage : null, (r89 & 67108864) != 0 ? r21.selectedBonusRewardId : 0, (r89 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r21.isGettingBonusReward : false, (r89 & 268435456) != 0 ? r21.isNeedAddCountSuperCase : false, (r89 & 536870912) != 0 ? r21.isAnimationNeed : false, (r89 & 1073741824) != 0 ? value.isShowingShimmer : false);
            } while (!mutableStateFlow2.compareAndSet(value, copy));
        }
        return Unit.INSTANCE;
    }
}
