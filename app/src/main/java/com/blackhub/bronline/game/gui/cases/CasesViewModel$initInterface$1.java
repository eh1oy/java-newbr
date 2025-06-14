package com.blackhub.bronline.game.gui.cases;

import android.app.Application;
import android.graphics.Bitmap;
import androidx.compose.ui.text.AnnotatedString;
import androidx.media3.common.C;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.constants.resources.PngConstantsId73;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.gui.cases.model.Case;
import com.blackhub.bronline.game.gui.cases.model.CasePricesModel;
import com.blackhub.bronline.game.gui.cases.model.CaseReward;
import com.blackhub.bronline.game.gui.cases.model.CasesBannerAttachment;
import com.blackhub.bronline.game.gui.cases.model.CasesBannerSelectedCase;
import com.blackhub.bronline.game.gui.cases.model.CasesBonusHintAttachment;
import com.blackhub.bronline.game.gui.cases.model.CasesText;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.cases.CasesResponse;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CasesViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$initInterface$1", f = "CasesViewModel.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {351}, m = "invokeSuspend", n = {"prizesBgPattern", "casesStrings", "casesBonusHintAttachment", "images", "bgImage", "valueOfMaxDust", "legendaryCaseId", "dailyCaseId", "bcAmountString", "valueOfBc", "valueOfCurrentDust", "isShowingTutorial", "valueOfOpenedCases", "selectedCaseId", "casesList", "selectedCase", "selectedCasePos", "selectedBonuses", "casePrices", "casePricesForGuide", "dpProgress"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "L$20"})
@SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$initInterface$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1945:1\n230#2,5:1946\n230#2,5:1951\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$initInterface$1\n*L\n360#1:1946,5\n437#1:1951,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CasesViewModel$initInterface$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ List<BpRewardsAwardsDto> $awards;
    public final /* synthetic */ CasesResponse $casesResponse;
    public final /* synthetic */ int $heightOfImage;
    public final /* synthetic */ List<InvItems> $inventoryList;
    public final /* synthetic */ JSONObject $json;
    public final /* synthetic */ int $widthOfImage;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$10;
    public Object L$11;
    public Object L$12;
    public Object L$13;
    public Object L$14;
    public Object L$15;
    public Object L$16;
    public Object L$17;
    public Object L$18;
    public Object L$19;
    public Object L$2;
    public Object L$20;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;
    public final /* synthetic */ CasesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CasesViewModel$initInterface$1(CasesViewModel casesViewModel, CasesResponse casesResponse, List<BpRewardsAwardsDto> list, JSONObject jSONObject, List<InvItems> list2, int i, int i2, Continuation<? super CasesViewModel$initInterface$1> continuation) {
        super(2, continuation);
        this.this$0 = casesViewModel;
        this.$casesResponse = casesResponse;
        this.$awards = list;
        this.$json = jSONObject;
        this.$inventoryList = list2;
        this.$widthOfImage = i;
        this.$heightOfImage = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        CasesViewModel$initInterface$1 casesViewModel$initInterface$1 = new CasesViewModel$initInterface$1(this.this$0, this.$casesResponse, this.$awards, this.$json, this.$inventoryList, this.$widthOfImage, this.$heightOfImage, continuation);
        casesViewModel$initInterface$1.L$0 = obj;
        return casesViewModel$initInterface$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CasesViewModel$initInterface$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15, types: [T, com.blackhub.bronline.game.gui.cases.model.CasesText] */
    /* JADX WARN: Type inference failed for: r4v16, types: [T, com.blackhub.bronline.game.gui.cases.model.CasesBonusHintAttachment] */
    /* JADX WARN: Type inference failed for: r4v17, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v18, types: [T, androidx.compose.ui.text.AnnotatedString] */
    /* JADX WARN: Type inference failed for: r4v20, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v22, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v24, types: [T, com.blackhub.bronline.game.gui.cases.model.CasePricesModel] */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, com.blackhub.bronline.game.gui.cases.model.Case] */
    /* JADX WARN: Type inference failed for: r5v7, types: [T, com.blackhub.bronline.game.gui.cases.model.CasePricesModel] */
    /* JADX WARN: Type inference failed for: r5v9, types: [T, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Application application;
        StringResource stringResource;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Ref.IntRef intRef;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        Ref.IntRef intRef2;
        Ref.IntRef intRef3;
        Deferred async$default;
        Deferred async$default2;
        Ref.IntRef intRef4;
        Ref.ObjectRef objectRef6;
        Ref.IntRef intRef5;
        Bitmap bitmap;
        Ref.ObjectRef objectRef7;
        Ref.ObjectRef objectRef8;
        Ref.IntRef intRef6;
        Ref.IntRef intRef7;
        Ref.BooleanRef booleanRef;
        Ref.IntRef intRef8;
        Ref.ObjectRef objectRef9;
        Ref.ObjectRef objectRef10;
        Ref.ObjectRef objectRef11;
        CasesBannerSelectedCase selectedCaseForBanner;
        Application application2;
        Application application3;
        Application application4;
        StringResource stringResource2;
        StringResource stringResource3;
        StringResource stringResource4;
        StringResource stringResource5;
        StringResource stringResource6;
        CasesUiState value;
        CasesUiState copy;
        CasesUiState copy2;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            application = this.this$0.application;
            Bitmap drawableToBitmap = BitmapUtilsKt.drawableToBitmap(application, R.drawable.reward_card_bg_pattern);
            if ((!this.$casesResponse.getCases().isEmpty()) && (!this.$awards.isEmpty())) {
                int optInt = this.$json.optInt("t");
                if (optInt == 1) {
                    objectRef = new Ref.ObjectRef();
                    objectRef.element = new CasesText(null, null, null, null, null, null, null, 127, null);
                    Ref.ObjectRef objectRef12 = new Ref.ObjectRef();
                    objectRef12.element = new CasesBonusHintAttachment(null, null, null, null, null, null, 63, null);
                    objectRef2 = new Ref.ObjectRef();
                    objectRef2.element = MapsKt__MapsKt.emptyMap();
                    objectRef3 = new Ref.ObjectRef();
                    intRef = new Ref.IntRef();
                    Ref.IntRef intRef9 = new Ref.IntRef();
                    Ref.IntRef intRef10 = new Ref.IntRef();
                    Ref.ObjectRef objectRef13 = new Ref.ObjectRef();
                    objectRef13.element = new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null);
                    Ref.IntRef intRef11 = new Ref.IntRef();
                    Ref.IntRef intRef12 = new Ref.IntRef();
                    Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    Ref.IntRef intRef13 = new Ref.IntRef();
                    Ref.IntRef intRef14 = new Ref.IntRef();
                    Ref.ObjectRef objectRef14 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef15 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef16 = new Ref.ObjectRef();
                    objectRef16.element = CollectionsKt__CollectionsKt.emptyList();
                    Ref.ObjectRef objectRef17 = new Ref.ObjectRef();
                    objectRef17.element = new Case(0, null, null, null, 0, false, 0, null, null, null, 0, false, null, null, 0, null, 65535, null);
                    Ref.IntRef intRef15 = new Ref.IntRef();
                    Ref.IntRef intRef16 = new Ref.IntRef();
                    Ref.ObjectRef objectRef18 = new Ref.ObjectRef();
                    objectRef18.element = CollectionsKt__CollectionsKt.emptyList();
                    Ref.ObjectRef objectRef19 = new Ref.ObjectRef();
                    objectRef19.element = new CasePricesModel(null, null, 0, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 16383, null);
                    Ref.ObjectRef objectRef20 = new Ref.ObjectRef();
                    objectRef20.element = new CasePricesModel(null, null, 0, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 16383, null);
                    Ref.ObjectRef objectRef21 = new Ref.ObjectRef();
                    objectRef21.element = CollectionsKt__CollectionsKt.emptyList();
                    objectRef4 = objectRef21;
                    objectRef5 = objectRef19;
                    intRef2 = intRef16;
                    intRef3 = intRef9;
                    async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CasesViewModel$initInterface$1$deferredTasks$1(objectRef2, this.this$0, objectRef3, objectRef, objectRef12, null), 3, null);
                    async$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CasesViewModel$initInterface$1$deferredTasks$2(intRef, this.$casesResponse, intRef9, intRef10, intRef11, this.$json, objectRef13, this.this$0, intRef12, booleanRef2, intRef13, intRef14, objectRef14, objectRef15, objectRef16, this.$awards, this.$inventoryList, objectRef17, intRef15, intRef16, objectRef18, objectRef19, objectRef20, objectRef21, null), 3, null);
                    List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Deferred[]{async$default, async$default2});
                    this.L$0 = drawableToBitmap;
                    this.L$1 = objectRef;
                    this.L$2 = objectRef12;
                    this.L$3 = objectRef2;
                    this.L$4 = objectRef3;
                    this.L$5 = intRef;
                    this.L$6 = intRef3;
                    this.L$7 = intRef10;
                    this.L$8 = objectRef13;
                    this.L$9 = intRef11;
                    this.L$10 = intRef12;
                    this.L$11 = booleanRef2;
                    this.L$12 = intRef13;
                    this.L$13 = intRef14;
                    this.L$14 = objectRef16;
                    this.L$15 = objectRef17;
                    this.L$16 = intRef2;
                    this.L$17 = objectRef18;
                    this.L$18 = objectRef5;
                    this.L$19 = objectRef20;
                    this.L$20 = objectRef4;
                    this.label = 1;
                    if (AwaitKt.awaitAll(listOf, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    intRef4 = intRef13;
                    objectRef6 = objectRef13;
                    intRef5 = intRef11;
                    bitmap = drawableToBitmap;
                    objectRef7 = objectRef12;
                    objectRef8 = objectRef18;
                    intRef6 = intRef10;
                    intRef7 = intRef12;
                    booleanRef = booleanRef2;
                    intRef8 = intRef14;
                    objectRef9 = objectRef17;
                    objectRef10 = objectRef20;
                    objectRef11 = objectRef16;
                } else if (optInt == 2) {
                    selectedCaseForBanner = this.this$0.getSelectedCaseForBanner(this.$casesResponse.getBanner().getCaseRewardsPreviewId(), this.$casesResponse, this.$awards, this.$inventoryList);
                    application2 = this.this$0.application;
                    ImageTypePathInCDNEnum imageTypePathInCDNEnum = ImageTypePathInCDNEnum.IMAGE;
                    Bitmap bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(application2, PngConstantsId73.IMG_BANNER_RIGHT_IMAGE, imageTypePathInCDNEnum, 0.0f, 0.0f, 24, null);
                    application3 = this.this$0.application;
                    Bitmap bitmapFromZip$default2 = BitmapUtilsKt.getBitmapFromZip$default(application3, PngConstantsId73.BG_CASES_BANNER, ImageTypePathInCDNEnum.BACKGROUND, 0.0f, 0.0f, 24, null);
                    application4 = this.this$0.application;
                    Bitmap pngBitmapFromZip = BitmapUtilsKt.getPngBitmapFromZip(application4, selectedCaseForBanner.getCaseImage(), imageTypePathInCDNEnum);
                    stringResource2 = this.this$0.stringResources;
                    String string = stringResource2.getString(R.string.common_open);
                    stringResource3 = this.this$0.stringResources;
                    String string2 = stringResource3.getString(R.string.cases_current_event_case);
                    stringResource4 = this.this$0.stringResources;
                    String string3 = stringResource4.getString(R.string.cases_congratulation);
                    stringResource5 = this.this$0.stringResources;
                    String string4 = stringResource5.getString(R.string.cases_current_prizes_of_event);
                    AnnotatedString htmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(this.$casesResponse.getBanner().getBackGroundTitle());
                    AnnotatedString htmlTextToAnnotatedString2 = StringExtensionKt.htmlTextToAnnotatedString(this.$casesResponse.getBanner().getBackGroundDescription());
                    stringResource6 = this.this$0.stringResources;
                    CasesBannerAttachment casesBannerAttachment = new CasesBannerAttachment(bitmapFromZip$default2, pngBitmapFromZip, bitmapFromZip$default, string2, string3, string4, htmlTextToAnnotatedString, htmlTextToAnnotatedString2, StringExtensionKt.htmlTextToAnnotatedString(stringResource6.getString(R.string.cases_instruction_two)), string, selectedCaseForBanner);
                    MutableStateFlow<? extends CasesUiState> mutableStateFlow = this.this$0.get_uiState();
                    do {
                        value = mutableStateFlow.getValue();
                        copy = r17.copy((r88 & 1) != 0 ? r17.currentScreen : 5, (r88 & 2) != 0 ? r17.casesStrings : null, (r88 & 4) != 0 ? r17.legendaryCaseId : 0, (r88 & 8) != 0 ? r17.dailyCaseId : 0, (r88 & 16) != 0 ? r17.bcAmount : null, (r88 & 32) != 0 ? r17.valueOfBc : 0, (r88 & 64) != 0 ? r17.widthOfImage : 0, (r88 & 128) != 0 ? r17.heightOfImage : 0, (r88 & 256) != 0 ? r17.bannerAttachment : casesBannerAttachment, (r88 & 512) != 0 ? r17.selectedReward : null, (r88 & 1024) != 0 ? r17.selectedRewardPos : 0, (r88 & 2048) != 0 ? r17.caseCount : 0, (r88 & 4096) != 0 ? r17.selectedCaseId : 0, (r88 & 8192) != 0 ? r17.goToCasePos : 0, (r88 & 16384) != 0 ? r17.selectedCase : null, (r88 & 32768) != 0 ? r17.currentReward : null, (r88 & 65536) != 0 ? r17.casesList : null, (r88 & 131072) != 0 ? r17.selectedBonuses : null, (r88 & 262144) != 0 ? r17.progressBarBonusPercentList : null, (r88 & 524288) != 0 ? r17.selectedRewards : null, (r88 & 1048576) != 0 ? r17.currentRewardIndex : 0, (r88 & 2097152) != 0 ? r17.currentRewardNumberForUi : 0, (r88 & 4194304) != 0 ? r17.allRewardsOpened : false, (r88 & 8388608) != 0 ? r17.gettingTenRewardsList : null, (r88 & 16777216) != 0 ? r17.gettingSelectedRewardIdList : null, (r88 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r17.sprayedRewardIdList : null, (r88 & 67108864) != 0 ? r17.attachmentForServer : null, (r88 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r17.totalSprayedDust : 0, (r88 & 268435456) != 0 ? r17.selectedSprayedDust : 0, (r88 & 536870912) != 0 ? r17.isSprayed : false, (r88 & 1073741824) != 0 ? r17.isNeedShowButtonSpray : false, (r88 & Integer.MIN_VALUE) != 0 ? r17.openingsCount : 0, (r89 & 1) != 0 ? r17.openingsProgressBarState : 0, (r89 & 2) != 0 ? r17.casePrices : null, (r89 & 4) != 0 ? r17.casePricesForGuide : null, (r89 & 8) != 0 ? r17.isNeedClose : false, (r89 & 16) != 0 ? r17.valueOfCurrentDust : 0, (r89 & 32) != 0 ? r17.valueOfMaxDust : 0, (r89 & 64) != 0 ? r17.isHintsOpened : false, (r89 & 128) != 0 ? r17.isMainHintDialogOpened : false, (r89 & 256) != 0 ? r17.isHintsBonusInfoOpened : false, (r89 & 512) != 0 ? r17.casesBonusHintAttachment : null, (r89 & 1024) != 0 ? r17.casesResponse : null, (r89 & 2048) != 0 ? r17.awardResponse : null, (r89 & 4096) != 0 ? r17.bgImage : null, (r89 & 8192) != 0 ? r17.bitmapMap : null, (r89 & 16384) != 0 ? r17.prizesBgPattern : drawableToBitmap, (r89 & 32768) != 0 ? r17.buttonPurchaseType : 0, (r89 & 65536) != 0 ? r17.isShowDialogConfirmation : false, (r89 & 131072) != 0 ? r17.buttonApplyText : null, (r89 & 262144) != 0 ? r17.dialogConfirmationContextType : 0, (r89 & 524288) != 0 ? r17.titleOpeningCase : null, (r89 & 1048576) != 0 ? r17.valueOfOpenedCases : 0, (r89 & 2097152) != 0 ? r17.priceBcOpeningCases : 0, (r89 & 4194304) != 0 ? r17.getValueOfDust : 0, (r89 & 8388608) != 0 ? r17.isShowDialogPreviewReward : false, (r89 & 16777216) != 0 ? r17.selectedBonusReward : null, (r89 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r17.rewardImage : null, (r89 & 67108864) != 0 ? r17.selectedBonusRewardId : 0, (r89 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r17.isGettingBonusReward : false, (r89 & 268435456) != 0 ? r17.isNeedAddCountSuperCase : false, (r89 & 536870912) != 0 ? r17.isAnimationNeed : false, (r89 & 1073741824) != 0 ? value.isShowingShimmer : false);
                    } while (!mutableStateFlow.compareAndSet(value, copy));
                }
            } else {
                CasesViewModel casesViewModel = this.this$0;
                stringResource = casesViewModel.stringResources;
                casesViewModel.showErrorNotification(stringResource.getString(R.string.common_error_with_key, Boxing.boxInt(73)));
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Ref.ObjectRef objectRef22 = (Ref.ObjectRef) this.L$20;
        Ref.ObjectRef objectRef23 = (Ref.ObjectRef) this.L$19;
        Ref.ObjectRef objectRef24 = (Ref.ObjectRef) this.L$18;
        Ref.ObjectRef objectRef25 = (Ref.ObjectRef) this.L$17;
        Ref.IntRef intRef17 = (Ref.IntRef) this.L$16;
        Ref.ObjectRef objectRef26 = (Ref.ObjectRef) this.L$15;
        Ref.ObjectRef objectRef27 = (Ref.ObjectRef) this.L$14;
        Ref.IntRef intRef18 = (Ref.IntRef) this.L$13;
        Ref.IntRef intRef19 = (Ref.IntRef) this.L$12;
        Ref.BooleanRef booleanRef3 = (Ref.BooleanRef) this.L$11;
        Ref.IntRef intRef20 = (Ref.IntRef) this.L$10;
        Ref.IntRef intRef21 = (Ref.IntRef) this.L$9;
        Ref.ObjectRef objectRef28 = (Ref.ObjectRef) this.L$8;
        Ref.IntRef intRef22 = (Ref.IntRef) this.L$7;
        Ref.IntRef intRef23 = (Ref.IntRef) this.L$6;
        Ref.IntRef intRef24 = (Ref.IntRef) this.L$5;
        Ref.ObjectRef objectRef29 = (Ref.ObjectRef) this.L$4;
        Ref.ObjectRef objectRef30 = (Ref.ObjectRef) this.L$3;
        Ref.ObjectRef objectRef31 = (Ref.ObjectRef) this.L$2;
        Ref.ObjectRef objectRef32 = (Ref.ObjectRef) this.L$1;
        Bitmap bitmap2 = (Bitmap) this.L$0;
        ResultKt.throwOnFailure(obj);
        bitmap = bitmap2;
        objectRef10 = objectRef23;
        objectRef5 = objectRef24;
        objectRef8 = objectRef25;
        intRef2 = intRef17;
        intRef4 = intRef19;
        intRef7 = intRef20;
        intRef5 = intRef21;
        intRef6 = intRef22;
        objectRef4 = objectRef22;
        intRef = intRef24;
        objectRef2 = objectRef30;
        objectRef7 = objectRef31;
        intRef3 = intRef23;
        intRef8 = intRef18;
        booleanRef = booleanRef3;
        objectRef6 = objectRef28;
        objectRef3 = objectRef29;
        objectRef = objectRef32;
        objectRef11 = objectRef27;
        objectRef9 = objectRef26;
        Ref.IntRef intRef25 = intRef8;
        int i2 = this.this$0.get_uiState().getValue().getCurrentScreen() == 4 ? 4 : 1;
        MutableStateFlow<? extends CasesUiState> mutableStateFlow2 = this.this$0.get_uiState();
        int i3 = this.$widthOfImage;
        int i4 = this.$heightOfImage;
        CasesResponse casesResponse = this.$casesResponse;
        while (true) {
            CasesUiState value2 = mutableStateFlow2.getValue();
            CasesUiState casesUiState = value2;
            int i5 = intRef3.element;
            Ref.IntRef intRef26 = intRef3;
            int i6 = intRef6.element;
            Ref.IntRef intRef27 = intRef6;
            CasesText casesText = (CasesText) objectRef.element;
            Bitmap bitmap3 = (Bitmap) objectRef3.element;
            Map map = (Map) objectRef2.element;
            AnnotatedString annotatedString = (AnnotatedString) objectRef6.element;
            int i7 = intRef5.element;
            Ref.ObjectRef objectRef33 = objectRef6;
            int i8 = intRef7.element;
            Ref.IntRef intRef28 = intRef7;
            int i9 = intRef.element;
            Ref.IntRef intRef29 = intRef5;
            boolean z = booleanRef.element;
            Ref.ObjectRef objectRef34 = objectRef;
            int i10 = intRef4.element;
            Ref.IntRef intRef30 = intRef4;
            List list = (List) objectRef11.element;
            T t = objectRef9.element;
            Case r32 = (Case) t;
            Ref.ObjectRef objectRef35 = objectRef11;
            Ref.IntRef intRef31 = intRef25;
            Ref.BooleanRef booleanRef4 = booleanRef;
            int i11 = intRef31.element;
            Ref.IntRef intRef32 = intRef2;
            Ref.ObjectRef objectRef36 = objectRef2;
            int i12 = intRef32.element;
            CaseReward scrolledReward = ((Case) t).getScrolledReward();
            Ref.ObjectRef objectRef37 = objectRef8;
            List list2 = (List) objectRef37.element;
            Ref.ObjectRef objectRef38 = objectRef4;
            List list3 = (List) objectRef38.element;
            List<CaseReward> caseRewardList = ((Case) objectRef9.element).getCaseRewardList();
            Ref.ObjectRef objectRef39 = objectRef5;
            Ref.ObjectRef objectRef40 = objectRef9;
            Ref.ObjectRef objectRef41 = objectRef10;
            Ref.ObjectRef objectRef42 = objectRef7;
            copy2 = casesUiState.copy((r88 & 1) != 0 ? casesUiState.currentScreen : i2, (r88 & 2) != 0 ? casesUiState.casesStrings : casesText, (r88 & 4) != 0 ? casesUiState.legendaryCaseId : i5, (r88 & 8) != 0 ? casesUiState.dailyCaseId : i6, (r88 & 16) != 0 ? casesUiState.bcAmount : annotatedString, (r88 & 32) != 0 ? casesUiState.valueOfBc : i7, (r88 & 64) != 0 ? casesUiState.widthOfImage : i3, (r88 & 128) != 0 ? casesUiState.heightOfImage : i4, (r88 & 256) != 0 ? casesUiState.bannerAttachment : null, (r88 & 512) != 0 ? casesUiState.selectedReward : scrolledReward, (r88 & 1024) != 0 ? casesUiState.selectedRewardPos : ((Case) objectRef9.element).getScrolledPosition(), (r88 & 2048) != 0 ? casesUiState.caseCount : 0, (r88 & 4096) != 0 ? casesUiState.selectedCaseId : i11, (r88 & 8192) != 0 ? casesUiState.goToCasePos : i12, (r88 & 16384) != 0 ? casesUiState.selectedCase : r32, (r88 & 32768) != 0 ? casesUiState.currentReward : null, (r88 & 65536) != 0 ? casesUiState.casesList : list, (r88 & 131072) != 0 ? casesUiState.selectedBonuses : list2, (r88 & 262144) != 0 ? casesUiState.progressBarBonusPercentList : list3, (r88 & 524288) != 0 ? casesUiState.selectedRewards : caseRewardList, (r88 & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, (r88 & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 0, (r88 & 4194304) != 0 ? casesUiState.allRewardsOpened : false, (r88 & 8388608) != 0 ? casesUiState.gettingTenRewardsList : null, (r88 & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : null, (r88 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : null, (r88 & 67108864) != 0 ? casesUiState.attachmentForServer : null, (r88 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : 0, (r88 & 268435456) != 0 ? casesUiState.selectedSprayedDust : 0, (r88 & 536870912) != 0 ? casesUiState.isSprayed : false, (r88 & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, (r88 & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : i10, (r89 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (r89 & 2) != 0 ? casesUiState.casePrices : (CasePricesModel) objectRef39.element, (r89 & 4) != 0 ? casesUiState.casePricesForGuide : (CasePricesModel) objectRef41.element, (r89 & 8) != 0 ? casesUiState.isNeedClose : false, (r89 & 16) != 0 ? casesUiState.valueOfCurrentDust : i8, (r89 & 32) != 0 ? casesUiState.valueOfMaxDust : i9, (r89 & 64) != 0 ? casesUiState.isHintsOpened : false, (r89 & 128) != 0 ? casesUiState.isMainHintDialogOpened : z, (r89 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : false, (r89 & 512) != 0 ? casesUiState.casesBonusHintAttachment : (CasesBonusHintAttachment) objectRef42.element, (r89 & 1024) != 0 ? casesUiState.casesResponse : casesResponse, (r89 & 2048) != 0 ? casesUiState.awardResponse : null, (r89 & 4096) != 0 ? casesUiState.bgImage : bitmap3, (r89 & 8192) != 0 ? casesUiState.bitmapMap : map, (r89 & 16384) != 0 ? casesUiState.prizesBgPattern : bitmap, (r89 & 32768) != 0 ? casesUiState.buttonPurchaseType : 0, (r89 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : false, (r89 & 131072) != 0 ? casesUiState.buttonApplyText : null, (r89 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : 0, (r89 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (r89 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (r89 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (r89 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (r89 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : false, (r89 & 16777216) != 0 ? casesUiState.selectedBonusReward : null, (r89 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : null, (r89 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : 0, (r89 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : false, (r89 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (r89 & 536870912) != 0 ? casesUiState.isAnimationNeed : false, (r89 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false);
            if (mutableStateFlow2.compareAndSet(value2, copy2)) {
                break;
            }
            objectRef9 = objectRef40;
            objectRef2 = objectRef36;
            booleanRef = booleanRef4;
            intRef3 = intRef26;
            intRef6 = intRef27;
            objectRef6 = objectRef33;
            intRef7 = intRef28;
            intRef5 = intRef29;
            objectRef = objectRef34;
            intRef25 = intRef31;
            objectRef5 = objectRef39;
            intRef2 = intRef32;
            objectRef10 = objectRef41;
            objectRef8 = objectRef37;
            objectRef7 = objectRef42;
            objectRef4 = objectRef38;
            intRef4 = intRef30;
            objectRef11 = objectRef35;
        }
        return Unit.INSTANCE;
    }
}
