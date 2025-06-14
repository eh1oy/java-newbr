package com.blackhub.bronline.game.gui.cases;

import androidx.media3.common.C;
import com.blackhub.bronline.game.gui.cases.model.Case;
import com.blackhub.bronline.game.gui.cases.network.CasesActionWithJSON;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$openSuperCase$1", f = "CasesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$openSuperCase$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1945:1\n1549#2:1946\n1620#2,3:1947\n230#3,5:1950\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$openSuperCase$1\n*L\n1047#1:1946\n1047#1:1947,3\n1058#1:1950,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CasesViewModel$openSuperCase$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ CasesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CasesViewModel$openSuperCase$1(CasesViewModel casesViewModel, Continuation<? super CasesViewModel$openSuperCase$1> continuation) {
        super(2, continuation);
        this.this$0 = casesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CasesViewModel$openSuperCase$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CasesViewModel$openSuperCase$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CasesActionWithJSON casesActionWithJSON;
        CasesActionWithJSON casesActionWithJSON2;
        Case findSelectedCase;
        CasesUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int legendaryCaseId = this.this$0.get_uiState().getValue().getLegendaryCaseId();
        casesActionWithJSON = this.this$0.actionWithJSON;
        casesActionWithJSON.openSuperCase();
        casesActionWithJSON2 = this.this$0.actionWithJSON;
        casesActionWithJSON2.selectCase(legendaryCaseId);
        List<Case> casesList = this.this$0.get_uiState().getValue().getCasesList();
        CasesViewModel casesViewModel = this.this$0;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(casesList, 10));
        for (Case r16 : casesList) {
            if (r16.getId() == legendaryCaseId && casesViewModel.get_uiState().getValue().isNeedAddCountSuperCase()) {
                r16 = r16.copy((r34 & 1) != 0 ? r16.id : 0, (r34 & 2) != 0 ? r16.name : null, (r34 & 4) != 0 ? r16.imageBitmap : null, (r34 & 8) != 0 ? r16.bgImageBitmap : null, (r34 & 16) != 0 ? r16.count : r16.getCount() + 1, (r34 & 32) != 0 ? r16.isUsedSale : false, (r34 & 64) != 0 ? r16.type : 0, (r34 & 128) != 0 ? r16.dates : null, (r34 & 256) != 0 ? r16.price : null, (r34 & 512) != 0 ? r16.discount : null, (r34 & 1024) != 0 ? r16.discountType : 0, (r34 & 2048) != 0 ? r16.isSale : false, (r34 & 4096) != 0 ? r16.caseRewardList : null, (r34 & 8192) != 0 ? r16.scrolledReward : null, (r34 & 16384) != 0 ? r16.scrolledPosition : 0, (r34 & 32768) != 0 ? r16.caseBonusList : null);
            }
            arrayList.add(r16);
        }
        findSelectedCase = this.this$0.findSelectedCase(legendaryCaseId, arrayList);
        int indexOf = arrayList.indexOf(findSelectedCase);
        if (indexOf < 0) {
            indexOf = 0;
        }
        int i = indexOf;
        MutableStateFlow<? extends CasesUiState> mutableStateFlow = this.this$0.get_uiState();
        while (true) {
            CasesUiState value = mutableStateFlow.getValue();
            MutableStateFlow<? extends CasesUiState> mutableStateFlow2 = mutableStateFlow;
            Case r72 = findSelectedCase;
            ArrayList arrayList2 = arrayList;
            copy = r2.copy((r88 & 1) != 0 ? r2.currentScreen : 1, (r88 & 2) != 0 ? r2.casesStrings : null, (r88 & 4) != 0 ? r2.legendaryCaseId : 0, (r88 & 8) != 0 ? r2.dailyCaseId : 0, (r88 & 16) != 0 ? r2.bcAmount : null, (r88 & 32) != 0 ? r2.valueOfBc : 0, (r88 & 64) != 0 ? r2.widthOfImage : 0, (r88 & 128) != 0 ? r2.heightOfImage : 0, (r88 & 256) != 0 ? r2.bannerAttachment : null, (r88 & 512) != 0 ? r2.selectedReward : null, (r88 & 1024) != 0 ? r2.selectedRewardPos : 0, (r88 & 2048) != 0 ? r2.caseCount : 0, (r88 & 4096) != 0 ? r2.selectedCaseId : legendaryCaseId, (r88 & 8192) != 0 ? r2.goToCasePos : i, (r88 & 16384) != 0 ? r2.selectedCase : r72, (r88 & 32768) != 0 ? r2.currentReward : null, (r88 & 65536) != 0 ? r2.casesList : arrayList2, (r88 & 131072) != 0 ? r2.selectedBonuses : null, (r88 & 262144) != 0 ? r2.progressBarBonusPercentList : null, (r88 & 524288) != 0 ? r2.selectedRewards : null, (r88 & 1048576) != 0 ? r2.currentRewardIndex : 0, (r88 & 2097152) != 0 ? r2.currentRewardNumberForUi : 0, (r88 & 4194304) != 0 ? r2.allRewardsOpened : false, (r88 & 8388608) != 0 ? r2.gettingTenRewardsList : null, (r88 & 16777216) != 0 ? r2.gettingSelectedRewardIdList : null, (r88 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.sprayedRewardIdList : null, (r88 & 67108864) != 0 ? r2.attachmentForServer : null, (r88 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.totalSprayedDust : 0, (r88 & 268435456) != 0 ? r2.selectedSprayedDust : 0, (r88 & 536870912) != 0 ? r2.isSprayed : false, (r88 & 1073741824) != 0 ? r2.isNeedShowButtonSpray : false, (r88 & Integer.MIN_VALUE) != 0 ? r2.openingsCount : 0, (r89 & 1) != 0 ? r2.openingsProgressBarState : 0, (r89 & 2) != 0 ? r2.casePrices : null, (r89 & 4) != 0 ? r2.casePricesForGuide : null, (r89 & 8) != 0 ? r2.isNeedClose : false, (r89 & 16) != 0 ? r2.valueOfCurrentDust : 0, (r89 & 32) != 0 ? r2.valueOfMaxDust : 0, (r89 & 64) != 0 ? r2.isHintsOpened : false, (r89 & 128) != 0 ? r2.isMainHintDialogOpened : false, (r89 & 256) != 0 ? r2.isHintsBonusInfoOpened : false, (r89 & 512) != 0 ? r2.casesBonusHintAttachment : null, (r89 & 1024) != 0 ? r2.casesResponse : null, (r89 & 2048) != 0 ? r2.awardResponse : null, (r89 & 4096) != 0 ? r2.bgImage : null, (r89 & 8192) != 0 ? r2.bitmapMap : null, (r89 & 16384) != 0 ? r2.prizesBgPattern : null, (r89 & 32768) != 0 ? r2.buttonPurchaseType : 0, (r89 & 65536) != 0 ? r2.isShowDialogConfirmation : false, (r89 & 131072) != 0 ? r2.buttonApplyText : null, (r89 & 262144) != 0 ? r2.dialogConfirmationContextType : 0, (r89 & 524288) != 0 ? r2.titleOpeningCase : null, (r89 & 1048576) != 0 ? r2.valueOfOpenedCases : 0, (r89 & 2097152) != 0 ? r2.priceBcOpeningCases : 0, (r89 & 4194304) != 0 ? r2.getValueOfDust : 0, (r89 & 8388608) != 0 ? r2.isShowDialogPreviewReward : false, (r89 & 16777216) != 0 ? r2.selectedBonusReward : null, (r89 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.rewardImage : null, (r89 & 67108864) != 0 ? r2.selectedBonusRewardId : 0, (r89 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isGettingBonusReward : false, (r89 & 268435456) != 0 ? r2.isNeedAddCountSuperCase : false, (r89 & 536870912) != 0 ? r2.isAnimationNeed : false, (r89 & 1073741824) != 0 ? value.isShowingShimmer : false);
            if (mutableStateFlow2.compareAndSet(value, copy)) {
                return Unit.INSTANCE;
            }
            mutableStateFlow = mutableStateFlow2;
            findSelectedCase = r72;
            arrayList = arrayList2;
        }
    }
}
