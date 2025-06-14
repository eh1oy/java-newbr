package com.blackhub.bronline.game.gui.cases;

import androidx.compose.ui.text.AnnotatedString;
import androidx.media3.common.C;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.cases.model.CasesText;
import java.util.List;
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

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CasesViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$onClickToSprayRewardsWithDialog$1", f = "CasesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onClickToSprayRewardsWithDialog$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1945:1\n230#2,5:1946\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onClickToSprayRewardsWithDialog$1\n*L\n986#1:1946,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CasesViewModel$onClickToSprayRewardsWithDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ CasesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CasesViewModel$onClickToSprayRewardsWithDialog$1(CasesViewModel casesViewModel, Continuation<? super CasesViewModel$onClickToSprayRewardsWithDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = casesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CasesViewModel$onClickToSprayRewardsWithDialog$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CasesViewModel$onClickToSprayRewardsWithDialog$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        StringResource stringResource;
        StringResource stringResource2;
        CasesUiState value;
        StringResource stringResource3;
        CasesUiState copy;
        StringResource stringResource4;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<Integer> gettingSelectedRewardIdList = this.this$0.get_uiState().getValue().getGettingSelectedRewardIdList();
        int currentScreen = this.this$0.get_uiState().getValue().getCurrentScreen();
        CasesUiState value2 = this.this$0.get_uiState().getValue();
        int dustValue = currentScreen == 3 ? value2.getSingleFirstReward().getDustValue() : value2.getSelectedSprayedDust();
        if (currentScreen == 3 || (!gettingSelectedRewardIdList.isEmpty())) {
            stringResource = this.this$0.stringResources;
            AnnotatedString htmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(stringResource.getString(R.string.cases_spray_request));
            stringResource2 = this.this$0.stringResources;
            CasesText copy$default = CasesText.copy$default(this.this$0.get_uiState().getValue().getCasesStrings(), null, null, null, null, htmlTextToAnnotatedString, StringExtensionKt.htmlTextToAnnotatedString(stringResource2.casesSprayRewards(dustValue)), null, 79, null);
            int i = currentScreen == 3 ? 6 : 5;
            MutableStateFlow<? extends CasesUiState> mutableStateFlow = this.this$0.get_uiState();
            CasesViewModel casesViewModel = this.this$0;
            do {
                value = mutableStateFlow.getValue();
                stringResource3 = casesViewModel.stringResources;
                copy = r15.copy((r88 & 1) != 0 ? r15.currentScreen : 0, (r88 & 2) != 0 ? r15.casesStrings : copy$default, (r88 & 4) != 0 ? r15.legendaryCaseId : 0, (r88 & 8) != 0 ? r15.dailyCaseId : 0, (r88 & 16) != 0 ? r15.bcAmount : null, (r88 & 32) != 0 ? r15.valueOfBc : 0, (r88 & 64) != 0 ? r15.widthOfImage : 0, (r88 & 128) != 0 ? r15.heightOfImage : 0, (r88 & 256) != 0 ? r15.bannerAttachment : null, (r88 & 512) != 0 ? r15.selectedReward : null, (r88 & 1024) != 0 ? r15.selectedRewardPos : 0, (r88 & 2048) != 0 ? r15.caseCount : 0, (r88 & 4096) != 0 ? r15.selectedCaseId : 0, (r88 & 8192) != 0 ? r15.goToCasePos : 0, (r88 & 16384) != 0 ? r15.selectedCase : null, (r88 & 32768) != 0 ? r15.currentReward : null, (r88 & 65536) != 0 ? r15.casesList : null, (r88 & 131072) != 0 ? r15.selectedBonuses : null, (r88 & 262144) != 0 ? r15.progressBarBonusPercentList : null, (r88 & 524288) != 0 ? r15.selectedRewards : null, (r88 & 1048576) != 0 ? r15.currentRewardIndex : 0, (r88 & 2097152) != 0 ? r15.currentRewardNumberForUi : 0, (r88 & 4194304) != 0 ? r15.allRewardsOpened : false, (r88 & 8388608) != 0 ? r15.gettingTenRewardsList : null, (r88 & 16777216) != 0 ? r15.gettingSelectedRewardIdList : null, (r88 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r15.sprayedRewardIdList : null, (r88 & 67108864) != 0 ? r15.attachmentForServer : null, (r88 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r15.totalSprayedDust : 0, (r88 & 268435456) != 0 ? r15.selectedSprayedDust : 0, (r88 & 536870912) != 0 ? r15.isSprayed : false, (r88 & 1073741824) != 0 ? r15.isNeedShowButtonSpray : false, (r88 & Integer.MIN_VALUE) != 0 ? r15.openingsCount : 0, (r89 & 1) != 0 ? r15.openingsProgressBarState : 0, (r89 & 2) != 0 ? r15.casePrices : null, (r89 & 4) != 0 ? r15.casePricesForGuide : null, (r89 & 8) != 0 ? r15.isNeedClose : false, (r89 & 16) != 0 ? r15.valueOfCurrentDust : 0, (r89 & 32) != 0 ? r15.valueOfMaxDust : 0, (r89 & 64) != 0 ? r15.isHintsOpened : false, (r89 & 128) != 0 ? r15.isMainHintDialogOpened : false, (r89 & 256) != 0 ? r15.isHintsBonusInfoOpened : false, (r89 & 512) != 0 ? r15.casesBonusHintAttachment : null, (r89 & 1024) != 0 ? r15.casesResponse : null, (r89 & 2048) != 0 ? r15.awardResponse : null, (r89 & 4096) != 0 ? r15.bgImage : null, (r89 & 8192) != 0 ? r15.bitmapMap : null, (r89 & 16384) != 0 ? r15.prizesBgPattern : null, (r89 & 32768) != 0 ? r15.buttonPurchaseType : 0, (r89 & 65536) != 0 ? r15.isShowDialogConfirmation : true, (r89 & 131072) != 0 ? r15.buttonApplyText : stringResource3.getString(R.string.common_yes), (r89 & 262144) != 0 ? r15.dialogConfirmationContextType : i, (r89 & 524288) != 0 ? r15.titleOpeningCase : null, (r89 & 1048576) != 0 ? r15.valueOfOpenedCases : 0, (r89 & 2097152) != 0 ? r15.priceBcOpeningCases : 0, (r89 & 4194304) != 0 ? r15.getValueOfDust : 0, (r89 & 8388608) != 0 ? r15.isShowDialogPreviewReward : false, (r89 & 16777216) != 0 ? r15.selectedBonusReward : null, (r89 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r15.rewardImage : null, (r89 & 67108864) != 0 ? r15.selectedBonusRewardId : 0, (r89 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r15.isGettingBonusReward : false, (r89 & 268435456) != 0 ? r15.isNeedAddCountSuperCase : false, (r89 & 536870912) != 0 ? r15.isAnimationNeed : false, (r89 & 1073741824) != 0 ? value.isShowingShimmer : false);
            } while (!mutableStateFlow.compareAndSet(value, copy));
        } else {
            LocalNotification localNotification = this.this$0.getLocalNotification();
            stringResource4 = this.this$0.stringResources;
            localNotification.showErrorNotification(stringResource4.getString(R.string.cases_spray_message_if_not_selected_items));
        }
        return Unit.INSTANCE;
    }
}
