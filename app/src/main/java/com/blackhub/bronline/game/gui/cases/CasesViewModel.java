package com.blackhub.bronline.game.gui.cases;

import android.app.Application;
import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.media3.common.C;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.LongExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.DateFormatter;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.cases.model.BonusRewardWithStatus;
import com.blackhub.bronline.game.gui.cases.model.Case;
import com.blackhub.bronline.game.gui.cases.model.CaseBonus;
import com.blackhub.bronline.game.gui.cases.model.CaseRenderAttachment;
import com.blackhub.bronline.game.gui.cases.model.CaseReward;
import com.blackhub.bronline.game.gui.cases.model.CaseSprayedInfoAttachment;
import com.blackhub.bronline.game.gui.cases.model.CaseWithStatusModel;
import com.blackhub.bronline.game.gui.cases.model.CasesBannerSelectedCase;
import com.blackhub.bronline.game.gui.cases.model.CasesSortedListWithScrolledPos;
import com.blackhub.bronline.game.gui.cases.network.CasesActionWithJSON;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.cases.CasesAwardDto;
import com.blackhub.bronline.game.model.remote.response.cases.CasesBonusDto;
import com.blackhub.bronline.game.model.remote.response.cases.CasesCaseTypeDto;
import com.blackhub.bronline.game.model.remote.response.cases.CasesResponse;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
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
/* compiled from: CasesViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0017J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\u0006\u0010\u001b\u001a\u00020\u0017J\u0016\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J\u001e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u001fH\u0002J\"\u0010&\u001a\u00020$2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\b\u0010(\u001a\u0004\u0018\u00010 H\u0002J\u0016\u0010)\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020$H\u0002J.\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020$2\u0006\u00102\u001a\u00020$2\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\u001f2\u0006\u00105\u001a\u00020$H\u0002J*\u00106\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\f\u00107\u001a\b\u0012\u0004\u0012\u00020$0\u001fH\u0002J$\u00108\u001a\b\u0012\u0004\u0012\u0002090\u001f2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u001f2\u0006\u0010<\u001a\u00020$H\u0002J4\u0010=\u001a\u00020>2\u0006\u0010#\u001a\u00020$2\u0006\u0010?\u001a\u00020@2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u001f2\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\u001fH\u0002J\u0010\u0010C\u001a\u00020*2\u0006\u0010D\u001a\u00020EH\u0002J@\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020$2\u0006\u0010I\u001a\u00020$2\u0006\u0010J\u001a\u00020$2\u0006\u0010K\u001a\u00020$2\u0006\u0010L\u001a\u00020$2\u0006\u0010M\u001a\u00020*2\u0006\u0010N\u001a\u00020*H\u0002JB\u0010O\u001a\u00020\u00172\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020@2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u001f2\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\u001f2\u0006\u0010S\u001a\u00020$2\u0006\u0010T\u001a\u00020$J@\u0010U\u001a\b\u0012\u0004\u0012\u00020\"0\u001f2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020W0\u001f2\u0006\u0010?\u001a\u00020@2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020B0\u001f2\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\u001fH\u0002J\u0006\u0010Y\u001a\u00020\u0017J\u0018\u0010Z\u001a\u00020\u00172\u0006\u0010[\u001a\u00020;2\b\u0010\\\u001a\u0004\u0018\u00010]J\u0006\u0010^\u001a\u00020\u0017J\u0006\u0010_\u001a\u00020\u0017J\u0006\u0010`\u001a\u00020\u0017J\u000e\u0010a\u001a\u00020\u00172\u0006\u0010b\u001a\u00020$J\u0006\u0010c\u001a\u00020\u0017J\u0006\u0010d\u001a\u00020\u0017J\u0006\u0010e\u001a\u00020\u0017J\u0006\u0010f\u001a\u00020\u0017J\u0018\u0010g\u001a\u00020\u00172\u0010\b\u0002\u0010h\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fJ\b\u0010i\u001a\u00020\u0017H\u0002J\b\u0010j\u001a\u00020\u0017H\u0002J\u0006\u0010k\u001a\u00020\u0017J\u0006\u0010l\u001a\u00020\u0017J\u0006\u0010m\u001a\u00020\u0017J\u0010\u0010n\u001a\u00020\u00172\b\u0010P\u001a\u0004\u0018\u00010QJ\u0016\u0010o\u001a\u00020\u00172\u0006\u0010(\u001a\u00020 2\u0006\u0010p\u001a\u00020$J\u0010\u0010q\u001a\u00020\u00172\u0006\u0010r\u001a\u00020$H\u0002J\u0016\u0010s\u001a\u00020\u00172\u0006\u0010r\u001a\u00020$2\u0006\u0010t\u001a\u000209J\u0006\u0010u\u001a\u00020\u0017J\u000e\u0010v\u001a\u00020\u00172\u0006\u0010w\u001a\u00020\"J\u000e\u0010x\u001a\u00020\u00172\u0006\u0010p\u001a\u00020$J\u000e\u0010y\u001a\u00020\u00172\u0006\u0010z\u001a\u00020{J\u0016\u0010|\u001a\u00020}2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J\u000e\u0010~\u001a\u00020\u00172\u0006\u0010\u007f\u001a\u00020*J.\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020;0\u001f2\r\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020;0\u001f2\u000e\u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010\u001fH\u0002J-\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\u001f2\r\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\u001f2\r\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020W0\u001fH\u0002J*\u0010\u0087\u0001\u001a\u00020;*\u00030\u0088\u00012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u001f2\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\u001fH\u0002J*\u0010\u0089\u0001\u001a\u00020 *\u00030\u008a\u00012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u001f2\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\u001fH\u0002R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u008b\u0001"}, d2 = {"Lcom/blackhub/bronline/game/gui/cases/CasesViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/cases/CasesUiState;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/cases/network/CasesActionWithJSON;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "stringResources", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "application", "Landroid/app/Application;", "(Lcom/blackhub/bronline/game/gui/cases/network/CasesActionWithJSON;Lcom/blackhub/bronline/game/common/LocalNotification;Lcom/blackhub/bronline/game/core/resources/StringResource;Landroid/app/Application;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getLocalNotification", "()Lcom/blackhub/bronline/game/common/LocalNotification;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "closeDialogConfirmation", "", "closeDialogPreview", "closeHint", "closeInterface", "dialogConfirmationApply", "findNotSprayedRewards", "Lcom/blackhub/bronline/game/gui/cases/model/CaseSprayedInfoAttachment;", "allRewardsList", "", "Lcom/blackhub/bronline/game/gui/cases/model/CaseReward;", "findSelectedCase", "Lcom/blackhub/bronline/game/gui/cases/model/Case;", "caseId", "", "cases", "findSelectedRewardPos", "rewardList", "reward", "findSprayRewards", "", "allRewards", "getBCAmountString", "Landroidx/compose/ui/text/AnnotatedString;", "bcAmount", "getCaseRenderAttachment", "Lcom/blackhub/bronline/game/gui/cases/model/CaseRenderAttachment;", "type", "internalId", "inventoryList", "Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", CatchStreamerKeys.COUNT_KEY, "getOpeningRewards", "arrayRewardIdList", "getProgressBarValues", "", "caseBonusList", "Lcom/blackhub/bronline/game/gui/cases/model/CaseBonus;", "openingsCount", "getSelectedCaseForBanner", "Lcom/blackhub/bronline/game/gui/cases/model/CasesBannerSelectedCase;", "caseResponse", "Lcom/blackhub/bronline/game/model/remote/response/cases/CasesResponse;", "awards", "Lcom/blackhub/bronline/game/model/remote/response/bprewards/BpRewardsAwardsDto;", "ifTimeHasPassed", "unixTimeStamp", "", "initCasePricesModel", "Lcom/blackhub/bronline/game/gui/cases/model/CasePricesModel;", "priceOne", "discountOne", "priceTen", "discountTen", "caseValue", "isUsedSale", "isSale", "initInterface", "json", "Lorg/json/JSONObject;", "casesResponse", "widthOfImage", "heightOfImage", "mapArrayToCaseList", "caseStatus", "Lcom/blackhub/bronline/game/gui/cases/model/CaseWithStatusModel;", "awardList", "onBcButtonClick", "onBonusClick", "bonus", "rewardImage", "Landroid/graphics/Bitmap;", "onBonusInfoClick", "onBonusInfoClose", "onBpRewardsClick", "onClickBottomItem", "rewardPos", "onClickCloseBanner", "onClickNextReward", "onClickOpenCasesFromBanner", "onClickSkipAnim", "onClickTakeRewards", "rewardListIsAllRewardsSprayed", "onClickToSprayOneReward", "onClickToSprayRewards", "onClickToSprayRewardsWithDialog", "onCloseClick", "onInfoClick", "onPacketIncoming", "onSelectOpeningReward", "rewardIndex", "openCase", "buttonType", "openCaseWithDialog", "btnWidth", "openSuperCase", "selectCase", "case", "selectReward", "showErrorNotification", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "sortingRewards", "Lcom/blackhub/bronline/game/gui/cases/model/CasesSortedListWithScrolledPos;", "updateAnimationState", "newState", "updateBonusStatus", "oldBonusList", "newBonusStatusList", "Lcom/blackhub/bronline/game/gui/cases/model/BonusRewardWithStatus;", "updateCasesValue", "oldCaseList", "newCaseCountList", "toCaseBonus", "Lcom/blackhub/bronline/game/model/remote/response/cases/CasesBonusDto;", "toCaseReward", "Lcom/blackhub/bronline/game/model/remote/response/cases/CasesAwardDto;", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1945:1\n230#2,5:1946\n230#2,5:1951\n230#2,5:1956\n230#2,5:1961\n230#2,5:1966\n230#2,5:1971\n230#2,5:1976\n230#2,5:1981\n230#2,5:1986\n230#2,5:1991\n230#2,5:1996\n1864#3,3:2001\n1855#3:2004\n1549#3:2005\n1620#3,3:2006\n1549#3:2009\n1620#3,3:2010\n1856#3:2013\n1549#3:2015\n1620#3,3:2016\n1549#3:2019\n1620#3,3:2020\n1549#3:2023\n1620#3,3:2024\n1045#3:2027\n766#3:2028\n857#3,2:2029\n766#3:2031\n857#3,2:2032\n766#3:2034\n857#3,2:2035\n766#3:2037\n857#3,2:2038\n766#3:2040\n857#3,2:2041\n1#4:2014\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel\n*L\n681#1:1946,5\n694#1:1951,5\n745#1:1956,5\n753#1:1961,5\n889#1:1966,5\n907#1:1971,5\n915#1:1976,5\n1032#1:1981,5\n1087#1:1986,5\n1122#1:1991,5\n1168#1:1996,5\n1264#1:2001,3\n1307#1:2004\n1320#1:2005\n1320#1:2006,3\n1329#1:2009\n1329#1:2010,3\n1307#1:2013\n1690#1:2015\n1690#1:2016,3\n1732#1:2019\n1732#1:2020,3\n1802#1:2023\n1802#1:2024,3\n1865#1:2027\n1867#1:2028\n1867#1:2029,2\n1870#1:2031\n1870#1:2032,2\n1873#1:2034\n1873#1:2035,2\n1876#1:2037\n1876#1:2038,2\n1879#1:2040\n1879#1:2041,2\n*E\n"})
/* loaded from: classes3.dex */
public final class CasesViewModel extends BaseViewModel<CasesUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<CasesUiState> _uiState;

    @NotNull
    public final CasesActionWithJSON actionWithJSON;

    @NotNull
    public final Application application;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final StringResource stringResources;

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: CasesViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommonRarityEnum.values().length];
            try {
                iArr[CommonRarityEnum.LEGENDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommonRarityEnum.EPIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommonRarityEnum.RARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommonRarityEnum.UNCOMMON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Inject
    public CasesViewModel(@NotNull CasesActionWithJSON actionWithJSON, @NotNull LocalNotification localNotification, @NotNull StringResource stringResources, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        Intrinsics.checkNotNullParameter(stringResources, "stringResources");
        Intrinsics.checkNotNullParameter(application, "application");
        this.actionWithJSON = actionWithJSON;
        this.localNotification = localNotification;
        this.stringResources = stringResources;
        this.application = application;
        this._uiState = StateFlowKt.MutableStateFlow(new CasesUiState(0, null, 0, 0, null, 0, 0, 0, null, null, 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, false, null, null, null, null, 0, 0, false, false, 0, 0, null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, 0, false, null, 0, null, 0, 0, 0, false, null, null, 0, false, false, false, false, -1, Integer.MAX_VALUE, null));
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends CasesUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<CasesUiState> getUiState() {
        return FlowKt.asStateFlow(get_uiState());
    }

    public final void initInterface(@NotNull JSONObject json, @NotNull CasesResponse casesResponse, @NotNull List<BpRewardsAwardsDto> awards, @NotNull List<InvItems> inventoryList, int widthOfImage, int heightOfImage) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(casesResponse, "casesResponse");
        Intrinsics.checkNotNullParameter(awards, "awards");
        Intrinsics.checkNotNullParameter(inventoryList, "inventoryList");
        ViewModelExtensionKt.launchOnIO$default(this, null, new CasesViewModel$initInterface$1(this, casesResponse, awards, json, inventoryList, widthOfImage, heightOfImage, null), 1, null);
    }

    public final void onPacketIncoming(@Nullable JSONObject json) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new CasesViewModel$onPacketIncoming$1(json, this, null), 1, null);
    }

    public final void onCloseClick() {
        CasesUiState value;
        CasesUiState copy;
        if (get_uiState().getValue().isHintsOpened()) {
            MutableStateFlow<? extends CasesUiState> mutableStateFlow = get_uiState();
            do {
                value = mutableStateFlow.getValue();
                copy = r3.copy((r88 & 1) != 0 ? r3.currentScreen : 0, (r88 & 2) != 0 ? r3.casesStrings : null, (r88 & 4) != 0 ? r3.legendaryCaseId : 0, (r88 & 8) != 0 ? r3.dailyCaseId : 0, (r88 & 16) != 0 ? r3.bcAmount : null, (r88 & 32) != 0 ? r3.valueOfBc : 0, (r88 & 64) != 0 ? r3.widthOfImage : 0, (r88 & 128) != 0 ? r3.heightOfImage : 0, (r88 & 256) != 0 ? r3.bannerAttachment : null, (r88 & 512) != 0 ? r3.selectedReward : null, (r88 & 1024) != 0 ? r3.selectedRewardPos : 0, (r88 & 2048) != 0 ? r3.caseCount : 0, (r88 & 4096) != 0 ? r3.selectedCaseId : 0, (r88 & 8192) != 0 ? r3.goToCasePos : 0, (r88 & 16384) != 0 ? r3.selectedCase : null, (r88 & 32768) != 0 ? r3.currentReward : null, (r88 & 65536) != 0 ? r3.casesList : null, (r88 & 131072) != 0 ? r3.selectedBonuses : null, (r88 & 262144) != 0 ? r3.progressBarBonusPercentList : null, (r88 & 524288) != 0 ? r3.selectedRewards : null, (r88 & 1048576) != 0 ? r3.currentRewardIndex : 0, (r88 & 2097152) != 0 ? r3.currentRewardNumberForUi : 0, (r88 & 4194304) != 0 ? r3.allRewardsOpened : false, (r88 & 8388608) != 0 ? r3.gettingTenRewardsList : null, (r88 & 16777216) != 0 ? r3.gettingSelectedRewardIdList : null, (r88 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r3.sprayedRewardIdList : null, (r88 & 67108864) != 0 ? r3.attachmentForServer : null, (r88 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.totalSprayedDust : 0, (r88 & 268435456) != 0 ? r3.selectedSprayedDust : 0, (r88 & 536870912) != 0 ? r3.isSprayed : false, (r88 & 1073741824) != 0 ? r3.isNeedShowButtonSpray : false, (r88 & Integer.MIN_VALUE) != 0 ? r3.openingsCount : 0, (r89 & 1) != 0 ? r3.openingsProgressBarState : 0, (r89 & 2) != 0 ? r3.casePrices : null, (r89 & 4) != 0 ? r3.casePricesForGuide : null, (r89 & 8) != 0 ? r3.isNeedClose : false, (r89 & 16) != 0 ? r3.valueOfCurrentDust : 0, (r89 & 32) != 0 ? r3.valueOfMaxDust : 0, (r89 & 64) != 0 ? r3.isHintsOpened : false, (r89 & 128) != 0 ? r3.isMainHintDialogOpened : false, (r89 & 256) != 0 ? r3.isHintsBonusInfoOpened : false, (r89 & 512) != 0 ? r3.casesBonusHintAttachment : null, (r89 & 1024) != 0 ? r3.casesResponse : null, (r89 & 2048) != 0 ? r3.awardResponse : null, (r89 & 4096) != 0 ? r3.bgImage : null, (r89 & 8192) != 0 ? r3.bitmapMap : null, (r89 & 16384) != 0 ? r3.prizesBgPattern : null, (r89 & 32768) != 0 ? r3.buttonPurchaseType : 0, (r89 & 65536) != 0 ? r3.isShowDialogConfirmation : false, (r89 & 131072) != 0 ? r3.buttonApplyText : null, (r89 & 262144) != 0 ? r3.dialogConfirmationContextType : 0, (r89 & 524288) != 0 ? r3.titleOpeningCase : null, (r89 & 1048576) != 0 ? r3.valueOfOpenedCases : 0, (r89 & 2097152) != 0 ? r3.priceBcOpeningCases : 0, (r89 & 4194304) != 0 ? r3.getValueOfDust : 0, (r89 & 8388608) != 0 ? r3.isShowDialogPreviewReward : false, (r89 & 16777216) != 0 ? r3.selectedBonusReward : null, (r89 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r3.rewardImage : null, (r89 & 67108864) != 0 ? r3.selectedBonusRewardId : 0, (r89 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.isGettingBonusReward : false, (r89 & 268435456) != 0 ? r3.isNeedAddCountSuperCase : false, (r89 & 536870912) != 0 ? r3.isAnimationNeed : false, (r89 & 1073741824) != 0 ? value.isShowingShimmer : false);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            return;
        }
        ViewModelExtensionKt.launchOnIO$default(this, null, new CasesViewModel$onCloseClick$2(this, null), 1, null);
    }

    public final void closeHint() {
        CasesUiState value;
        CasesUiState copy;
        MutableStateFlow<? extends CasesUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r88 & 1) != 0 ? r2.currentScreen : 0, (r88 & 2) != 0 ? r2.casesStrings : null, (r88 & 4) != 0 ? r2.legendaryCaseId : 0, (r88 & 8) != 0 ? r2.dailyCaseId : 0, (r88 & 16) != 0 ? r2.bcAmount : null, (r88 & 32) != 0 ? r2.valueOfBc : 0, (r88 & 64) != 0 ? r2.widthOfImage : 0, (r88 & 128) != 0 ? r2.heightOfImage : 0, (r88 & 256) != 0 ? r2.bannerAttachment : null, (r88 & 512) != 0 ? r2.selectedReward : null, (r88 & 1024) != 0 ? r2.selectedRewardPos : 0, (r88 & 2048) != 0 ? r2.caseCount : 0, (r88 & 4096) != 0 ? r2.selectedCaseId : 0, (r88 & 8192) != 0 ? r2.goToCasePos : 0, (r88 & 16384) != 0 ? r2.selectedCase : null, (r88 & 32768) != 0 ? r2.currentReward : null, (r88 & 65536) != 0 ? r2.casesList : null, (r88 & 131072) != 0 ? r2.selectedBonuses : null, (r88 & 262144) != 0 ? r2.progressBarBonusPercentList : null, (r88 & 524288) != 0 ? r2.selectedRewards : null, (r88 & 1048576) != 0 ? r2.currentRewardIndex : 0, (r88 & 2097152) != 0 ? r2.currentRewardNumberForUi : 0, (r88 & 4194304) != 0 ? r2.allRewardsOpened : false, (r88 & 8388608) != 0 ? r2.gettingTenRewardsList : null, (r88 & 16777216) != 0 ? r2.gettingSelectedRewardIdList : null, (r88 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.sprayedRewardIdList : null, (r88 & 67108864) != 0 ? r2.attachmentForServer : null, (r88 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.totalSprayedDust : 0, (r88 & 268435456) != 0 ? r2.selectedSprayedDust : 0, (r88 & 536870912) != 0 ? r2.isSprayed : false, (r88 & 1073741824) != 0 ? r2.isNeedShowButtonSpray : false, (r88 & Integer.MIN_VALUE) != 0 ? r2.openingsCount : 0, (r89 & 1) != 0 ? r2.openingsProgressBarState : 0, (r89 & 2) != 0 ? r2.casePrices : null, (r89 & 4) != 0 ? r2.casePricesForGuide : null, (r89 & 8) != 0 ? r2.isNeedClose : false, (r89 & 16) != 0 ? r2.valueOfCurrentDust : 0, (r89 & 32) != 0 ? r2.valueOfMaxDust : 0, (r89 & 64) != 0 ? r2.isHintsOpened : false, (r89 & 128) != 0 ? r2.isMainHintDialogOpened : false, (r89 & 256) != 0 ? r2.isHintsBonusInfoOpened : false, (r89 & 512) != 0 ? r2.casesBonusHintAttachment : null, (r89 & 1024) != 0 ? r2.casesResponse : null, (r89 & 2048) != 0 ? r2.awardResponse : null, (r89 & 4096) != 0 ? r2.bgImage : null, (r89 & 8192) != 0 ? r2.bitmapMap : null, (r89 & 16384) != 0 ? r2.prizesBgPattern : null, (r89 & 32768) != 0 ? r2.buttonPurchaseType : 0, (r89 & 65536) != 0 ? r2.isShowDialogConfirmation : false, (r89 & 131072) != 0 ? r2.buttonApplyText : null, (r89 & 262144) != 0 ? r2.dialogConfirmationContextType : 0, (r89 & 524288) != 0 ? r2.titleOpeningCase : null, (r89 & 1048576) != 0 ? r2.valueOfOpenedCases : 0, (r89 & 2097152) != 0 ? r2.priceBcOpeningCases : 0, (r89 & 4194304) != 0 ? r2.getValueOfDust : 0, (r89 & 8388608) != 0 ? r2.isShowDialogPreviewReward : false, (r89 & 16777216) != 0 ? r2.selectedBonusReward : null, (r89 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.rewardImage : null, (r89 & 67108864) != 0 ? r2.selectedBonusRewardId : 0, (r89 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isGettingBonusReward : false, (r89 & 268435456) != 0 ? r2.isNeedAddCountSuperCase : false, (r89 & 536870912) != 0 ? r2.isAnimationNeed : false, (r89 & 1073741824) != 0 ? value.isShowingShimmer : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onBonusClick(@NotNull CaseBonus bonus, @Nullable Bitmap rewardImage) {
        Intrinsics.checkNotNullParameter(bonus, "bonus");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new CasesViewModel$onBonusClick$1(bonus, this, rewardImage, null), 1, null);
    }

    public final void closeDialogPreview() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new CasesViewModel$closeDialogPreview$1(this, null), 1, null);
    }

    public final void onBonusInfoClick() {
        CasesUiState value;
        CasesUiState copy;
        MutableStateFlow<? extends CasesUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r88 & 1) != 0 ? r2.currentScreen : 0, (r88 & 2) != 0 ? r2.casesStrings : null, (r88 & 4) != 0 ? r2.legendaryCaseId : 0, (r88 & 8) != 0 ? r2.dailyCaseId : 0, (r88 & 16) != 0 ? r2.bcAmount : null, (r88 & 32) != 0 ? r2.valueOfBc : 0, (r88 & 64) != 0 ? r2.widthOfImage : 0, (r88 & 128) != 0 ? r2.heightOfImage : 0, (r88 & 256) != 0 ? r2.bannerAttachment : null, (r88 & 512) != 0 ? r2.selectedReward : null, (r88 & 1024) != 0 ? r2.selectedRewardPos : 0, (r88 & 2048) != 0 ? r2.caseCount : 0, (r88 & 4096) != 0 ? r2.selectedCaseId : 0, (r88 & 8192) != 0 ? r2.goToCasePos : 0, (r88 & 16384) != 0 ? r2.selectedCase : null, (r88 & 32768) != 0 ? r2.currentReward : null, (r88 & 65536) != 0 ? r2.casesList : null, (r88 & 131072) != 0 ? r2.selectedBonuses : null, (r88 & 262144) != 0 ? r2.progressBarBonusPercentList : null, (r88 & 524288) != 0 ? r2.selectedRewards : null, (r88 & 1048576) != 0 ? r2.currentRewardIndex : 0, (r88 & 2097152) != 0 ? r2.currentRewardNumberForUi : 0, (r88 & 4194304) != 0 ? r2.allRewardsOpened : false, (r88 & 8388608) != 0 ? r2.gettingTenRewardsList : null, (r88 & 16777216) != 0 ? r2.gettingSelectedRewardIdList : null, (r88 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.sprayedRewardIdList : null, (r88 & 67108864) != 0 ? r2.attachmentForServer : null, (r88 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.totalSprayedDust : 0, (r88 & 268435456) != 0 ? r2.selectedSprayedDust : 0, (r88 & 536870912) != 0 ? r2.isSprayed : false, (r88 & 1073741824) != 0 ? r2.isNeedShowButtonSpray : false, (r88 & Integer.MIN_VALUE) != 0 ? r2.openingsCount : 0, (r89 & 1) != 0 ? r2.openingsProgressBarState : 0, (r89 & 2) != 0 ? r2.casePrices : null, (r89 & 4) != 0 ? r2.casePricesForGuide : null, (r89 & 8) != 0 ? r2.isNeedClose : false, (r89 & 16) != 0 ? r2.valueOfCurrentDust : 0, (r89 & 32) != 0 ? r2.valueOfMaxDust : 0, (r89 & 64) != 0 ? r2.isHintsOpened : false, (r89 & 128) != 0 ? r2.isMainHintDialogOpened : false, (r89 & 256) != 0 ? r2.isHintsBonusInfoOpened : true, (r89 & 512) != 0 ? r2.casesBonusHintAttachment : null, (r89 & 1024) != 0 ? r2.casesResponse : null, (r89 & 2048) != 0 ? r2.awardResponse : null, (r89 & 4096) != 0 ? r2.bgImage : null, (r89 & 8192) != 0 ? r2.bitmapMap : null, (r89 & 16384) != 0 ? r2.prizesBgPattern : null, (r89 & 32768) != 0 ? r2.buttonPurchaseType : 0, (r89 & 65536) != 0 ? r2.isShowDialogConfirmation : false, (r89 & 131072) != 0 ? r2.buttonApplyText : null, (r89 & 262144) != 0 ? r2.dialogConfirmationContextType : 0, (r89 & 524288) != 0 ? r2.titleOpeningCase : null, (r89 & 1048576) != 0 ? r2.valueOfOpenedCases : 0, (r89 & 2097152) != 0 ? r2.priceBcOpeningCases : 0, (r89 & 4194304) != 0 ? r2.getValueOfDust : 0, (r89 & 8388608) != 0 ? r2.isShowDialogPreviewReward : false, (r89 & 16777216) != 0 ? r2.selectedBonusReward : null, (r89 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.rewardImage : null, (r89 & 67108864) != 0 ? r2.selectedBonusRewardId : 0, (r89 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isGettingBonusReward : false, (r89 & 268435456) != 0 ? r2.isNeedAddCountSuperCase : false, (r89 & 536870912) != 0 ? r2.isAnimationNeed : false, (r89 & 1073741824) != 0 ? value.isShowingShimmer : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onBonusInfoClose() {
        CasesUiState value;
        CasesUiState copy;
        MutableStateFlow<? extends CasesUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r88 & 1) != 0 ? r2.currentScreen : 0, (r88 & 2) != 0 ? r2.casesStrings : null, (r88 & 4) != 0 ? r2.legendaryCaseId : 0, (r88 & 8) != 0 ? r2.dailyCaseId : 0, (r88 & 16) != 0 ? r2.bcAmount : null, (r88 & 32) != 0 ? r2.valueOfBc : 0, (r88 & 64) != 0 ? r2.widthOfImage : 0, (r88 & 128) != 0 ? r2.heightOfImage : 0, (r88 & 256) != 0 ? r2.bannerAttachment : null, (r88 & 512) != 0 ? r2.selectedReward : null, (r88 & 1024) != 0 ? r2.selectedRewardPos : 0, (r88 & 2048) != 0 ? r2.caseCount : 0, (r88 & 4096) != 0 ? r2.selectedCaseId : 0, (r88 & 8192) != 0 ? r2.goToCasePos : 0, (r88 & 16384) != 0 ? r2.selectedCase : null, (r88 & 32768) != 0 ? r2.currentReward : null, (r88 & 65536) != 0 ? r2.casesList : null, (r88 & 131072) != 0 ? r2.selectedBonuses : null, (r88 & 262144) != 0 ? r2.progressBarBonusPercentList : null, (r88 & 524288) != 0 ? r2.selectedRewards : null, (r88 & 1048576) != 0 ? r2.currentRewardIndex : 0, (r88 & 2097152) != 0 ? r2.currentRewardNumberForUi : 0, (r88 & 4194304) != 0 ? r2.allRewardsOpened : false, (r88 & 8388608) != 0 ? r2.gettingTenRewardsList : null, (r88 & 16777216) != 0 ? r2.gettingSelectedRewardIdList : null, (r88 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.sprayedRewardIdList : null, (r88 & 67108864) != 0 ? r2.attachmentForServer : null, (r88 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.totalSprayedDust : 0, (r88 & 268435456) != 0 ? r2.selectedSprayedDust : 0, (r88 & 536870912) != 0 ? r2.isSprayed : false, (r88 & 1073741824) != 0 ? r2.isNeedShowButtonSpray : false, (r88 & Integer.MIN_VALUE) != 0 ? r2.openingsCount : 0, (r89 & 1) != 0 ? r2.openingsProgressBarState : 0, (r89 & 2) != 0 ? r2.casePrices : null, (r89 & 4) != 0 ? r2.casePricesForGuide : null, (r89 & 8) != 0 ? r2.isNeedClose : false, (r89 & 16) != 0 ? r2.valueOfCurrentDust : 0, (r89 & 32) != 0 ? r2.valueOfMaxDust : 0, (r89 & 64) != 0 ? r2.isHintsOpened : false, (r89 & 128) != 0 ? r2.isMainHintDialogOpened : false, (r89 & 256) != 0 ? r2.isHintsBonusInfoOpened : false, (r89 & 512) != 0 ? r2.casesBonusHintAttachment : null, (r89 & 1024) != 0 ? r2.casesResponse : null, (r89 & 2048) != 0 ? r2.awardResponse : null, (r89 & 4096) != 0 ? r2.bgImage : null, (r89 & 8192) != 0 ? r2.bitmapMap : null, (r89 & 16384) != 0 ? r2.prizesBgPattern : null, (r89 & 32768) != 0 ? r2.buttonPurchaseType : 0, (r89 & 65536) != 0 ? r2.isShowDialogConfirmation : false, (r89 & 131072) != 0 ? r2.buttonApplyText : null, (r89 & 262144) != 0 ? r2.dialogConfirmationContextType : 0, (r89 & 524288) != 0 ? r2.titleOpeningCase : null, (r89 & 1048576) != 0 ? r2.valueOfOpenedCases : 0, (r89 & 2097152) != 0 ? r2.priceBcOpeningCases : 0, (r89 & 4194304) != 0 ? r2.getValueOfDust : 0, (r89 & 8388608) != 0 ? r2.isShowDialogPreviewReward : false, (r89 & 16777216) != 0 ? r2.selectedBonusReward : null, (r89 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.rewardImage : null, (r89 & 67108864) != 0 ? r2.selectedBonusRewardId : 0, (r89 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isGettingBonusReward : false, (r89 & 268435456) != 0 ? r2.isNeedAddCountSuperCase : false, (r89 & 536870912) != 0 ? r2.isAnimationNeed : false, (r89 & 1073741824) != 0 ? value.isShowingShimmer : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void selectCase(@NotNull Case r3) {
        Intrinsics.checkNotNullParameter(r3, "case");
        ViewModelExtensionKt.launchOnIO$default(this, null, new CasesViewModel$selectCase$1(this, r3, null), 1, null);
    }

    public final void onBcButtonClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new CasesViewModel$onBcButtonClick$1(this, null), 1, null);
    }

    public final void showErrorNotification(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ViewModelExtensionKt.launchOnIO$default(this, null, new CasesViewModel$showErrorNotification$1(this, message, null), 1, null);
    }

    public final void openCaseWithDialog(int buttonType, float btnWidth) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new CasesViewModel$openCaseWithDialog$1(btnWidth, this, buttonType, null), 1, null);
    }

    public final void onInfoClick() {
        CasesUiState value;
        CasesUiState copy;
        MutableStateFlow<? extends CasesUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r88 & 1) != 0 ? r2.currentScreen : 0, (r88 & 2) != 0 ? r2.casesStrings : null, (r88 & 4) != 0 ? r2.legendaryCaseId : 0, (r88 & 8) != 0 ? r2.dailyCaseId : 0, (r88 & 16) != 0 ? r2.bcAmount : null, (r88 & 32) != 0 ? r2.valueOfBc : 0, (r88 & 64) != 0 ? r2.widthOfImage : 0, (r88 & 128) != 0 ? r2.heightOfImage : 0, (r88 & 256) != 0 ? r2.bannerAttachment : null, (r88 & 512) != 0 ? r2.selectedReward : null, (r88 & 1024) != 0 ? r2.selectedRewardPos : 0, (r88 & 2048) != 0 ? r2.caseCount : 0, (r88 & 4096) != 0 ? r2.selectedCaseId : 0, (r88 & 8192) != 0 ? r2.goToCasePos : 0, (r88 & 16384) != 0 ? r2.selectedCase : null, (r88 & 32768) != 0 ? r2.currentReward : null, (r88 & 65536) != 0 ? r2.casesList : null, (r88 & 131072) != 0 ? r2.selectedBonuses : null, (r88 & 262144) != 0 ? r2.progressBarBonusPercentList : null, (r88 & 524288) != 0 ? r2.selectedRewards : null, (r88 & 1048576) != 0 ? r2.currentRewardIndex : 0, (r88 & 2097152) != 0 ? r2.currentRewardNumberForUi : 0, (r88 & 4194304) != 0 ? r2.allRewardsOpened : false, (r88 & 8388608) != 0 ? r2.gettingTenRewardsList : null, (r88 & 16777216) != 0 ? r2.gettingSelectedRewardIdList : null, (r88 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.sprayedRewardIdList : null, (r88 & 67108864) != 0 ? r2.attachmentForServer : null, (r88 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.totalSprayedDust : 0, (r88 & 268435456) != 0 ? r2.selectedSprayedDust : 0, (r88 & 536870912) != 0 ? r2.isSprayed : false, (r88 & 1073741824) != 0 ? r2.isNeedShowButtonSpray : false, (r88 & Integer.MIN_VALUE) != 0 ? r2.openingsCount : 0, (r89 & 1) != 0 ? r2.openingsProgressBarState : 0, (r89 & 2) != 0 ? r2.casePrices : null, (r89 & 4) != 0 ? r2.casePricesForGuide : null, (r89 & 8) != 0 ? r2.isNeedClose : false, (r89 & 16) != 0 ? r2.valueOfCurrentDust : 0, (r89 & 32) != 0 ? r2.valueOfMaxDust : 0, (r89 & 64) != 0 ? r2.isHintsOpened : true, (r89 & 128) != 0 ? r2.isMainHintDialogOpened : false, (r89 & 256) != 0 ? r2.isHintsBonusInfoOpened : false, (r89 & 512) != 0 ? r2.casesBonusHintAttachment : null, (r89 & 1024) != 0 ? r2.casesResponse : null, (r89 & 2048) != 0 ? r2.awardResponse : null, (r89 & 4096) != 0 ? r2.bgImage : null, (r89 & 8192) != 0 ? r2.bitmapMap : null, (r89 & 16384) != 0 ? r2.prizesBgPattern : null, (r89 & 32768) != 0 ? r2.buttonPurchaseType : 0, (r89 & 65536) != 0 ? r2.isShowDialogConfirmation : false, (r89 & 131072) != 0 ? r2.buttonApplyText : null, (r89 & 262144) != 0 ? r2.dialogConfirmationContextType : 0, (r89 & 524288) != 0 ? r2.titleOpeningCase : null, (r89 & 1048576) != 0 ? r2.valueOfOpenedCases : 0, (r89 & 2097152) != 0 ? r2.priceBcOpeningCases : 0, (r89 & 4194304) != 0 ? r2.getValueOfDust : 0, (r89 & 8388608) != 0 ? r2.isShowDialogPreviewReward : false, (r89 & 16777216) != 0 ? r2.selectedBonusReward : null, (r89 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.rewardImage : null, (r89 & 67108864) != 0 ? r2.selectedBonusRewardId : 0, (r89 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isGettingBonusReward : false, (r89 & 268435456) != 0 ? r2.isNeedAddCountSuperCase : false, (r89 & 536870912) != 0 ? r2.isAnimationNeed : false, (r89 & 1073741824) != 0 ? value.isShowingShimmer : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onBpRewardsClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new CasesViewModel$onBpRewardsClick$1(this, null), 1, null);
    }

    public final void selectReward(int rewardIndex) {
        CasesUiState copy;
        CaseReward caseReward = (CaseReward) CollectionsKt___CollectionsKt.getOrNull(get_uiState().getValue().getSelectedRewards(), rewardIndex);
        MutableStateFlow<? extends CasesUiState> mutableStateFlow = get_uiState();
        while (true) {
            CasesUiState value = mutableStateFlow.getValue();
            MutableStateFlow<? extends CasesUiState> mutableStateFlow2 = mutableStateFlow;
            copy = r1.copy((r88 & 1) != 0 ? r1.currentScreen : 0, (r88 & 2) != 0 ? r1.casesStrings : null, (r88 & 4) != 0 ? r1.legendaryCaseId : 0, (r88 & 8) != 0 ? r1.dailyCaseId : 0, (r88 & 16) != 0 ? r1.bcAmount : null, (r88 & 32) != 0 ? r1.valueOfBc : 0, (r88 & 64) != 0 ? r1.widthOfImage : 0, (r88 & 128) != 0 ? r1.heightOfImage : 0, (r88 & 256) != 0 ? r1.bannerAttachment : null, (r88 & 512) != 0 ? r1.selectedReward : caseReward, (r88 & 1024) != 0 ? r1.selectedRewardPos : 0, (r88 & 2048) != 0 ? r1.caseCount : 0, (r88 & 4096) != 0 ? r1.selectedCaseId : 0, (r88 & 8192) != 0 ? r1.goToCasePos : 0, (r88 & 16384) != 0 ? r1.selectedCase : null, (r88 & 32768) != 0 ? r1.currentReward : null, (r88 & 65536) != 0 ? r1.casesList : null, (r88 & 131072) != 0 ? r1.selectedBonuses : null, (r88 & 262144) != 0 ? r1.progressBarBonusPercentList : null, (r88 & 524288) != 0 ? r1.selectedRewards : null, (r88 & 1048576) != 0 ? r1.currentRewardIndex : 0, (r88 & 2097152) != 0 ? r1.currentRewardNumberForUi : 0, (r88 & 4194304) != 0 ? r1.allRewardsOpened : false, (r88 & 8388608) != 0 ? r1.gettingTenRewardsList : null, (r88 & 16777216) != 0 ? r1.gettingSelectedRewardIdList : null, (r88 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r1.sprayedRewardIdList : null, (r88 & 67108864) != 0 ? r1.attachmentForServer : null, (r88 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r1.totalSprayedDust : 0, (r88 & 268435456) != 0 ? r1.selectedSprayedDust : 0, (r88 & 536870912) != 0 ? r1.isSprayed : false, (r88 & 1073741824) != 0 ? r1.isNeedShowButtonSpray : false, (r88 & Integer.MIN_VALUE) != 0 ? r1.openingsCount : 0, (r89 & 1) != 0 ? r1.openingsProgressBarState : 0, (r89 & 2) != 0 ? r1.casePrices : null, (r89 & 4) != 0 ? r1.casePricesForGuide : null, (r89 & 8) != 0 ? r1.isNeedClose : false, (r89 & 16) != 0 ? r1.valueOfCurrentDust : 0, (r89 & 32) != 0 ? r1.valueOfMaxDust : 0, (r89 & 64) != 0 ? r1.isHintsOpened : false, (r89 & 128) != 0 ? r1.isMainHintDialogOpened : false, (r89 & 256) != 0 ? r1.isHintsBonusInfoOpened : false, (r89 & 512) != 0 ? r1.casesBonusHintAttachment : null, (r89 & 1024) != 0 ? r1.casesResponse : null, (r89 & 2048) != 0 ? r1.awardResponse : null, (r89 & 4096) != 0 ? r1.bgImage : null, (r89 & 8192) != 0 ? r1.bitmapMap : null, (r89 & 16384) != 0 ? r1.prizesBgPattern : null, (r89 & 32768) != 0 ? r1.buttonPurchaseType : 0, (r89 & 65536) != 0 ? r1.isShowDialogConfirmation : false, (r89 & 131072) != 0 ? r1.buttonApplyText : null, (r89 & 262144) != 0 ? r1.dialogConfirmationContextType : 0, (r89 & 524288) != 0 ? r1.titleOpeningCase : null, (r89 & 1048576) != 0 ? r1.valueOfOpenedCases : 0, (r89 & 2097152) != 0 ? r1.priceBcOpeningCases : 0, (r89 & 4194304) != 0 ? r1.getValueOfDust : 0, (r89 & 8388608) != 0 ? r1.isShowDialogPreviewReward : false, (r89 & 16777216) != 0 ? r1.selectedBonusReward : null, (r89 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r1.rewardImage : null, (r89 & 67108864) != 0 ? r1.selectedBonusRewardId : 0, (r89 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r1.isGettingBonusReward : false, (r89 & 268435456) != 0 ? r1.isNeedAddCountSuperCase : false, (r89 & 536870912) != 0 ? r1.isAnimationNeed : false, (r89 & 1073741824) != 0 ? value.isShowingShimmer : false);
            if (mutableStateFlow2.compareAndSet(value, copy)) {
                return;
            } else {
                mutableStateFlow = mutableStateFlow2;
            }
        }
    }

    public final void onClickBottomItem(int rewardPos) {
        CasesUiState value;
        CasesUiState copy;
        MutableStateFlow<? extends CasesUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r88 & 1) != 0 ? r2.currentScreen : 0, (r88 & 2) != 0 ? r2.casesStrings : null, (r88 & 4) != 0 ? r2.legendaryCaseId : 0, (r88 & 8) != 0 ? r2.dailyCaseId : 0, (r88 & 16) != 0 ? r2.bcAmount : null, (r88 & 32) != 0 ? r2.valueOfBc : 0, (r88 & 64) != 0 ? r2.widthOfImage : 0, (r88 & 128) != 0 ? r2.heightOfImage : 0, (r88 & 256) != 0 ? r2.bannerAttachment : null, (r88 & 512) != 0 ? r2.selectedReward : null, (r88 & 1024) != 0 ? r2.selectedRewardPos : rewardPos, (r88 & 2048) != 0 ? r2.caseCount : 0, (r88 & 4096) != 0 ? r2.selectedCaseId : 0, (r88 & 8192) != 0 ? r2.goToCasePos : 0, (r88 & 16384) != 0 ? r2.selectedCase : null, (r88 & 32768) != 0 ? r2.currentReward : null, (r88 & 65536) != 0 ? r2.casesList : null, (r88 & 131072) != 0 ? r2.selectedBonuses : null, (r88 & 262144) != 0 ? r2.progressBarBonusPercentList : null, (r88 & 524288) != 0 ? r2.selectedRewards : null, (r88 & 1048576) != 0 ? r2.currentRewardIndex : 0, (r88 & 2097152) != 0 ? r2.currentRewardNumberForUi : 0, (r88 & 4194304) != 0 ? r2.allRewardsOpened : false, (r88 & 8388608) != 0 ? r2.gettingTenRewardsList : null, (r88 & 16777216) != 0 ? r2.gettingSelectedRewardIdList : null, (r88 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.sprayedRewardIdList : null, (r88 & 67108864) != 0 ? r2.attachmentForServer : null, (r88 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.totalSprayedDust : 0, (r88 & 268435456) != 0 ? r2.selectedSprayedDust : 0, (r88 & 536870912) != 0 ? r2.isSprayed : false, (r88 & 1073741824) != 0 ? r2.isNeedShowButtonSpray : false, (r88 & Integer.MIN_VALUE) != 0 ? r2.openingsCount : 0, (r89 & 1) != 0 ? r2.openingsProgressBarState : 0, (r89 & 2) != 0 ? r2.casePrices : null, (r89 & 4) != 0 ? r2.casePricesForGuide : null, (r89 & 8) != 0 ? r2.isNeedClose : false, (r89 & 16) != 0 ? r2.valueOfCurrentDust : 0, (r89 & 32) != 0 ? r2.valueOfMaxDust : 0, (r89 & 64) != 0 ? r2.isHintsOpened : false, (r89 & 128) != 0 ? r2.isMainHintDialogOpened : false, (r89 & 256) != 0 ? r2.isHintsBonusInfoOpened : false, (r89 & 512) != 0 ? r2.casesBonusHintAttachment : null, (r89 & 1024) != 0 ? r2.casesResponse : null, (r89 & 2048) != 0 ? r2.awardResponse : null, (r89 & 4096) != 0 ? r2.bgImage : null, (r89 & 8192) != 0 ? r2.bitmapMap : null, (r89 & 16384) != 0 ? r2.prizesBgPattern : null, (r89 & 32768) != 0 ? r2.buttonPurchaseType : 0, (r89 & 65536) != 0 ? r2.isShowDialogConfirmation : false, (r89 & 131072) != 0 ? r2.buttonApplyText : null, (r89 & 262144) != 0 ? r2.dialogConfirmationContextType : 0, (r89 & 524288) != 0 ? r2.titleOpeningCase : null, (r89 & 1048576) != 0 ? r2.valueOfOpenedCases : 0, (r89 & 2097152) != 0 ? r2.priceBcOpeningCases : 0, (r89 & 4194304) != 0 ? r2.getValueOfDust : 0, (r89 & 8388608) != 0 ? r2.isShowDialogPreviewReward : false, (r89 & 16777216) != 0 ? r2.selectedBonusReward : null, (r89 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.rewardImage : null, (r89 & 67108864) != 0 ? r2.selectedBonusRewardId : 0, (r89 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isGettingBonusReward : false, (r89 & 268435456) != 0 ? r2.isNeedAddCountSuperCase : false, (r89 & 536870912) != 0 ? r2.isAnimationNeed : false, (r89 & 1073741824) != 0 ? value.isShowingShimmer : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onSelectOpeningReward(@NotNull CaseReward reward, int rewardIndex) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new CasesViewModel$onSelectOpeningReward$1(this, rewardIndex, reward, null), 1, null);
    }

    public final void onClickToSprayRewardsWithDialog() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new CasesViewModel$onClickToSprayRewardsWithDialog$1(this, null), 1, null);
    }

    public final void dialogConfirmationApply() {
        int dialogConfirmationContextType = get_uiState().getValue().getDialogConfirmationContextType();
        if (dialogConfirmationContextType == 1) {
            openCase(get_uiState().getValue().getButtonPurchaseType());
            return;
        }
        if (dialogConfirmationContextType == 2) {
            openCase(get_uiState().getValue().getButtonPurchaseType());
            return;
        }
        if (dialogConfirmationContextType == 3) {
            onBcButtonClick();
            return;
        }
        if (dialogConfirmationContextType == 5) {
            onClickToSprayRewards();
            return;
        }
        if (dialogConfirmationContextType == 6) {
            onClickToSprayOneReward();
            return;
        }
        UtilsKt.crashlyticsRecordNewException("dialogConfirmationApply, _uiState.value.dialogConfirmationContextType=" + get_uiState().getValue().getDialogConfirmationContextType());
        closeDialogConfirmation();
    }

    public final void closeDialogConfirmation() {
        CasesUiState value;
        CasesUiState copy;
        MutableStateFlow<? extends CasesUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r88 & 1) != 0 ? r2.currentScreen : 0, (r88 & 2) != 0 ? r2.casesStrings : null, (r88 & 4) != 0 ? r2.legendaryCaseId : 0, (r88 & 8) != 0 ? r2.dailyCaseId : 0, (r88 & 16) != 0 ? r2.bcAmount : null, (r88 & 32) != 0 ? r2.valueOfBc : 0, (r88 & 64) != 0 ? r2.widthOfImage : 0, (r88 & 128) != 0 ? r2.heightOfImage : 0, (r88 & 256) != 0 ? r2.bannerAttachment : null, (r88 & 512) != 0 ? r2.selectedReward : null, (r88 & 1024) != 0 ? r2.selectedRewardPos : 0, (r88 & 2048) != 0 ? r2.caseCount : 0, (r88 & 4096) != 0 ? r2.selectedCaseId : 0, (r88 & 8192) != 0 ? r2.goToCasePos : 0, (r88 & 16384) != 0 ? r2.selectedCase : null, (r88 & 32768) != 0 ? r2.currentReward : null, (r88 & 65536) != 0 ? r2.casesList : null, (r88 & 131072) != 0 ? r2.selectedBonuses : null, (r88 & 262144) != 0 ? r2.progressBarBonusPercentList : null, (r88 & 524288) != 0 ? r2.selectedRewards : null, (r88 & 1048576) != 0 ? r2.currentRewardIndex : 0, (r88 & 2097152) != 0 ? r2.currentRewardNumberForUi : 0, (r88 & 4194304) != 0 ? r2.allRewardsOpened : false, (r88 & 8388608) != 0 ? r2.gettingTenRewardsList : null, (r88 & 16777216) != 0 ? r2.gettingSelectedRewardIdList : null, (r88 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.sprayedRewardIdList : null, (r88 & 67108864) != 0 ? r2.attachmentForServer : null, (r88 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.totalSprayedDust : 0, (r88 & 268435456) != 0 ? r2.selectedSprayedDust : 0, (r88 & 536870912) != 0 ? r2.isSprayed : false, (r88 & 1073741824) != 0 ? r2.isNeedShowButtonSpray : false, (r88 & Integer.MIN_VALUE) != 0 ? r2.openingsCount : 0, (r89 & 1) != 0 ? r2.openingsProgressBarState : 0, (r89 & 2) != 0 ? r2.casePrices : null, (r89 & 4) != 0 ? r2.casePricesForGuide : null, (r89 & 8) != 0 ? r2.isNeedClose : false, (r89 & 16) != 0 ? r2.valueOfCurrentDust : 0, (r89 & 32) != 0 ? r2.valueOfMaxDust : 0, (r89 & 64) != 0 ? r2.isHintsOpened : false, (r89 & 128) != 0 ? r2.isMainHintDialogOpened : false, (r89 & 256) != 0 ? r2.isHintsBonusInfoOpened : false, (r89 & 512) != 0 ? r2.casesBonusHintAttachment : null, (r89 & 1024) != 0 ? r2.casesResponse : null, (r89 & 2048) != 0 ? r2.awardResponse : null, (r89 & 4096) != 0 ? r2.bgImage : null, (r89 & 8192) != 0 ? r2.bitmapMap : null, (r89 & 16384) != 0 ? r2.prizesBgPattern : null, (r89 & 32768) != 0 ? r2.buttonPurchaseType : 0, (r89 & 65536) != 0 ? r2.isShowDialogConfirmation : false, (r89 & 131072) != 0 ? r2.buttonApplyText : null, (r89 & 262144) != 0 ? r2.dialogConfirmationContextType : 0, (r89 & 524288) != 0 ? r2.titleOpeningCase : null, (r89 & 1048576) != 0 ? r2.valueOfOpenedCases : 0, (r89 & 2097152) != 0 ? r2.priceBcOpeningCases : 0, (r89 & 4194304) != 0 ? r2.getValueOfDust : 0, (r89 & 8388608) != 0 ? r2.isShowDialogPreviewReward : false, (r89 & 16777216) != 0 ? r2.selectedBonusReward : null, (r89 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.rewardImage : null, (r89 & 67108864) != 0 ? r2.selectedBonusRewardId : 0, (r89 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isGettingBonusReward : false, (r89 & 268435456) != 0 ? r2.isNeedAddCountSuperCase : false, (r89 & 536870912) != 0 ? r2.isAnimationNeed : false, (r89 & 1073741824) != 0 ? value.isShowingShimmer : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void openSuperCase() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new CasesViewModel$openSuperCase$1(this, null), 1, null);
    }

    public final void onClickCloseBanner() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new CasesViewModel$onClickCloseBanner$1(this, null), 1, null);
    }

    public final void onClickOpenCasesFromBanner() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new CasesViewModel$onClickOpenCasesFromBanner$1(this, null), 1, null);
    }

    public final void updateAnimationState(boolean newState) {
        CasesUiState value;
        CasesUiState copy;
        MutableStateFlow<? extends CasesUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r88 & 1) != 0 ? r2.currentScreen : 0, (r88 & 2) != 0 ? r2.casesStrings : null, (r88 & 4) != 0 ? r2.legendaryCaseId : 0, (r88 & 8) != 0 ? r2.dailyCaseId : 0, (r88 & 16) != 0 ? r2.bcAmount : null, (r88 & 32) != 0 ? r2.valueOfBc : 0, (r88 & 64) != 0 ? r2.widthOfImage : 0, (r88 & 128) != 0 ? r2.heightOfImage : 0, (r88 & 256) != 0 ? r2.bannerAttachment : null, (r88 & 512) != 0 ? r2.selectedReward : null, (r88 & 1024) != 0 ? r2.selectedRewardPos : 0, (r88 & 2048) != 0 ? r2.caseCount : 0, (r88 & 4096) != 0 ? r2.selectedCaseId : 0, (r88 & 8192) != 0 ? r2.goToCasePos : 0, (r88 & 16384) != 0 ? r2.selectedCase : null, (r88 & 32768) != 0 ? r2.currentReward : null, (r88 & 65536) != 0 ? r2.casesList : null, (r88 & 131072) != 0 ? r2.selectedBonuses : null, (r88 & 262144) != 0 ? r2.progressBarBonusPercentList : null, (r88 & 524288) != 0 ? r2.selectedRewards : null, (r88 & 1048576) != 0 ? r2.currentRewardIndex : 0, (r88 & 2097152) != 0 ? r2.currentRewardNumberForUi : 0, (r88 & 4194304) != 0 ? r2.allRewardsOpened : false, (r88 & 8388608) != 0 ? r2.gettingTenRewardsList : null, (r88 & 16777216) != 0 ? r2.gettingSelectedRewardIdList : null, (r88 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.sprayedRewardIdList : null, (r88 & 67108864) != 0 ? r2.attachmentForServer : null, (r88 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.totalSprayedDust : 0, (r88 & 268435456) != 0 ? r2.selectedSprayedDust : 0, (r88 & 536870912) != 0 ? r2.isSprayed : false, (r88 & 1073741824) != 0 ? r2.isNeedShowButtonSpray : false, (r88 & Integer.MIN_VALUE) != 0 ? r2.openingsCount : 0, (r89 & 1) != 0 ? r2.openingsProgressBarState : 0, (r89 & 2) != 0 ? r2.casePrices : null, (r89 & 4) != 0 ? r2.casePricesForGuide : null, (r89 & 8) != 0 ? r2.isNeedClose : false, (r89 & 16) != 0 ? r2.valueOfCurrentDust : 0, (r89 & 32) != 0 ? r2.valueOfMaxDust : 0, (r89 & 64) != 0 ? r2.isHintsOpened : false, (r89 & 128) != 0 ? r2.isMainHintDialogOpened : false, (r89 & 256) != 0 ? r2.isHintsBonusInfoOpened : false, (r89 & 512) != 0 ? r2.casesBonusHintAttachment : null, (r89 & 1024) != 0 ? r2.casesResponse : null, (r89 & 2048) != 0 ? r2.awardResponse : null, (r89 & 4096) != 0 ? r2.bgImage : null, (r89 & 8192) != 0 ? r2.bitmapMap : null, (r89 & 16384) != 0 ? r2.prizesBgPattern : null, (r89 & 32768) != 0 ? r2.buttonPurchaseType : 0, (r89 & 65536) != 0 ? r2.isShowDialogConfirmation : false, (r89 & 131072) != 0 ? r2.buttonApplyText : null, (r89 & 262144) != 0 ? r2.dialogConfirmationContextType : 0, (r89 & 524288) != 0 ? r2.titleOpeningCase : null, (r89 & 1048576) != 0 ? r2.valueOfOpenedCases : 0, (r89 & 2097152) != 0 ? r2.priceBcOpeningCases : 0, (r89 & 4194304) != 0 ? r2.getValueOfDust : 0, (r89 & 8388608) != 0 ? r2.isShowDialogPreviewReward : false, (r89 & 16777216) != 0 ? r2.selectedBonusReward : null, (r89 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.rewardImage : null, (r89 & 67108864) != 0 ? r2.selectedBonusRewardId : 0, (r89 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isGettingBonusReward : false, (r89 & 268435456) != 0 ? r2.isNeedAddCountSuperCase : false, (r89 & 536870912) != 0 ? r2.isAnimationNeed : newState, (r89 & 1073741824) != 0 ? value.isShowingShimmer : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onClickNextReward() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new CasesViewModel$onClickNextReward$1(this, null), 1, null);
    }

    public final void onClickSkipAnim() {
        CasesUiState value;
        CasesUiState copy;
        MutableStateFlow<? extends CasesUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r88 & 1) != 0 ? r2.currentScreen : 0, (r88 & 2) != 0 ? r2.casesStrings : null, (r88 & 4) != 0 ? r2.legendaryCaseId : 0, (r88 & 8) != 0 ? r2.dailyCaseId : 0, (r88 & 16) != 0 ? r2.bcAmount : null, (r88 & 32) != 0 ? r2.valueOfBc : 0, (r88 & 64) != 0 ? r2.widthOfImage : 0, (r88 & 128) != 0 ? r2.heightOfImage : 0, (r88 & 256) != 0 ? r2.bannerAttachment : null, (r88 & 512) != 0 ? r2.selectedReward : null, (r88 & 1024) != 0 ? r2.selectedRewardPos : 0, (r88 & 2048) != 0 ? r2.caseCount : 0, (r88 & 4096) != 0 ? r2.selectedCaseId : 0, (r88 & 8192) != 0 ? r2.goToCasePos : 0, (r88 & 16384) != 0 ? r2.selectedCase : null, (r88 & 32768) != 0 ? r2.currentReward : null, (r88 & 65536) != 0 ? r2.casesList : null, (r88 & 131072) != 0 ? r2.selectedBonuses : null, (r88 & 262144) != 0 ? r2.progressBarBonusPercentList : null, (r88 & 524288) != 0 ? r2.selectedRewards : null, (r88 & 1048576) != 0 ? r2.currentRewardIndex : 0, (r88 & 2097152) != 0 ? r2.currentRewardNumberForUi : 1, (r88 & 4194304) != 0 ? r2.allRewardsOpened : true, (r88 & 8388608) != 0 ? r2.gettingTenRewardsList : null, (r88 & 16777216) != 0 ? r2.gettingSelectedRewardIdList : null, (r88 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.sprayedRewardIdList : null, (r88 & 67108864) != 0 ? r2.attachmentForServer : null, (r88 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.totalSprayedDust : 0, (r88 & 268435456) != 0 ? r2.selectedSprayedDust : 0, (r88 & 536870912) != 0 ? r2.isSprayed : false, (r88 & 1073741824) != 0 ? r2.isNeedShowButtonSpray : false, (r88 & Integer.MIN_VALUE) != 0 ? r2.openingsCount : 0, (r89 & 1) != 0 ? r2.openingsProgressBarState : 0, (r89 & 2) != 0 ? r2.casePrices : null, (r89 & 4) != 0 ? r2.casePricesForGuide : null, (r89 & 8) != 0 ? r2.isNeedClose : false, (r89 & 16) != 0 ? r2.valueOfCurrentDust : 0, (r89 & 32) != 0 ? r2.valueOfMaxDust : 0, (r89 & 64) != 0 ? r2.isHintsOpened : false, (r89 & 128) != 0 ? r2.isMainHintDialogOpened : false, (r89 & 256) != 0 ? r2.isHintsBonusInfoOpened : false, (r89 & 512) != 0 ? r2.casesBonusHintAttachment : null, (r89 & 1024) != 0 ? r2.casesResponse : null, (r89 & 2048) != 0 ? r2.awardResponse : null, (r89 & 4096) != 0 ? r2.bgImage : null, (r89 & 8192) != 0 ? r2.bitmapMap : null, (r89 & 16384) != 0 ? r2.prizesBgPattern : null, (r89 & 32768) != 0 ? r2.buttonPurchaseType : 0, (r89 & 65536) != 0 ? r2.isShowDialogConfirmation : false, (r89 & 131072) != 0 ? r2.buttonApplyText : null, (r89 & 262144) != 0 ? r2.dialogConfirmationContextType : 0, (r89 & 524288) != 0 ? r2.titleOpeningCase : null, (r89 & 1048576) != 0 ? r2.valueOfOpenedCases : 0, (r89 & 2097152) != 0 ? r2.priceBcOpeningCases : 0, (r89 & 4194304) != 0 ? r2.getValueOfDust : 0, (r89 & 8388608) != 0 ? r2.isShowDialogPreviewReward : false, (r89 & 16777216) != 0 ? r2.selectedBonusReward : null, (r89 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.rewardImage : null, (r89 & 67108864) != 0 ? r2.selectedBonusRewardId : 0, (r89 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isGettingBonusReward : false, (r89 & 268435456) != 0 ? r2.isNeedAddCountSuperCase : false, (r89 & 536870912) != 0 ? r2.isAnimationNeed : false, (r89 & 1073741824) != 0 ? value.isShowingShimmer : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onClickTakeRewards$default(CasesViewModel casesViewModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        casesViewModel.onClickTakeRewards(list);
    }

    public final void onClickTakeRewards(@Nullable List<CaseReward> rewardListIsAllRewardsSprayed) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new CasesViewModel$onClickTakeRewards$1(rewardListIsAllRewardsSprayed, this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeInterface() {
        CasesUiState value;
        CasesUiState copy;
        MutableStateFlow<? extends CasesUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r88 & 1) != 0 ? r2.currentScreen : 0, (r88 & 2) != 0 ? r2.casesStrings : null, (r88 & 4) != 0 ? r2.legendaryCaseId : 0, (r88 & 8) != 0 ? r2.dailyCaseId : 0, (r88 & 16) != 0 ? r2.bcAmount : null, (r88 & 32) != 0 ? r2.valueOfBc : 0, (r88 & 64) != 0 ? r2.widthOfImage : 0, (r88 & 128) != 0 ? r2.heightOfImage : 0, (r88 & 256) != 0 ? r2.bannerAttachment : null, (r88 & 512) != 0 ? r2.selectedReward : null, (r88 & 1024) != 0 ? r2.selectedRewardPos : 0, (r88 & 2048) != 0 ? r2.caseCount : 0, (r88 & 4096) != 0 ? r2.selectedCaseId : 0, (r88 & 8192) != 0 ? r2.goToCasePos : 0, (r88 & 16384) != 0 ? r2.selectedCase : null, (r88 & 32768) != 0 ? r2.currentReward : null, (r88 & 65536) != 0 ? r2.casesList : null, (r88 & 131072) != 0 ? r2.selectedBonuses : null, (r88 & 262144) != 0 ? r2.progressBarBonusPercentList : null, (r88 & 524288) != 0 ? r2.selectedRewards : null, (r88 & 1048576) != 0 ? r2.currentRewardIndex : 0, (r88 & 2097152) != 0 ? r2.currentRewardNumberForUi : 0, (r88 & 4194304) != 0 ? r2.allRewardsOpened : false, (r88 & 8388608) != 0 ? r2.gettingTenRewardsList : null, (r88 & 16777216) != 0 ? r2.gettingSelectedRewardIdList : null, (r88 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.sprayedRewardIdList : null, (r88 & 67108864) != 0 ? r2.attachmentForServer : null, (r88 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.totalSprayedDust : 0, (r88 & 268435456) != 0 ? r2.selectedSprayedDust : 0, (r88 & 536870912) != 0 ? r2.isSprayed : false, (r88 & 1073741824) != 0 ? r2.isNeedShowButtonSpray : false, (r88 & Integer.MIN_VALUE) != 0 ? r2.openingsCount : 0, (r89 & 1) != 0 ? r2.openingsProgressBarState : 0, (r89 & 2) != 0 ? r2.casePrices : null, (r89 & 4) != 0 ? r2.casePricesForGuide : null, (r89 & 8) != 0 ? r2.isNeedClose : true, (r89 & 16) != 0 ? r2.valueOfCurrentDust : 0, (r89 & 32) != 0 ? r2.valueOfMaxDust : 0, (r89 & 64) != 0 ? r2.isHintsOpened : false, (r89 & 128) != 0 ? r2.isMainHintDialogOpened : false, (r89 & 256) != 0 ? r2.isHintsBonusInfoOpened : false, (r89 & 512) != 0 ? r2.casesBonusHintAttachment : null, (r89 & 1024) != 0 ? r2.casesResponse : null, (r89 & 2048) != 0 ? r2.awardResponse : null, (r89 & 4096) != 0 ? r2.bgImage : null, (r89 & 8192) != 0 ? r2.bitmapMap : null, (r89 & 16384) != 0 ? r2.prizesBgPattern : null, (r89 & 32768) != 0 ? r2.buttonPurchaseType : 0, (r89 & 65536) != 0 ? r2.isShowDialogConfirmation : false, (r89 & 131072) != 0 ? r2.buttonApplyText : null, (r89 & 262144) != 0 ? r2.dialogConfirmationContextType : 0, (r89 & 524288) != 0 ? r2.titleOpeningCase : null, (r89 & 1048576) != 0 ? r2.valueOfOpenedCases : 0, (r89 & 2097152) != 0 ? r2.priceBcOpeningCases : 0, (r89 & 4194304) != 0 ? r2.getValueOfDust : 0, (r89 & 8388608) != 0 ? r2.isShowDialogPreviewReward : false, (r89 & 16777216) != 0 ? r2.selectedBonusReward : null, (r89 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.rewardImage : null, (r89 & 67108864) != 0 ? r2.selectedBonusRewardId : 0, (r89 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isGettingBonusReward : false, (r89 & 268435456) != 0 ? r2.isNeedAddCountSuperCase : false, (r89 & 536870912) != 0 ? r2.isAnimationNeed : false, (r89 & 1073741824) != 0 ? value.isShowingShimmer : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void openCase(int buttonType) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new CasesViewModel$openCase$1(this, buttonType, null), 1, null);
    }

    public final void onClickToSprayRewards() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new CasesViewModel$onClickToSprayRewards$1(this, null), 1, null);
    }

    public final void onClickToSprayOneReward() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new CasesViewModel$onClickToSprayOneReward$1(this, null), 1, null);
    }

    public final List<Float> getProgressBarValues(List<CaseBonus> caseBonusList, int openingsCount) {
        ArrayList arrayList = new ArrayList();
        int size = caseBonusList.size() - 1;
        int i = 0;
        for (Object obj : caseBonusList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            float f = 1.0f;
            if (openingsCount < ((CaseBonus) obj).getOpeningsCountRequired()) {
                if (i != size) {
                    int openingsCountRequired = caseBonusList.get(i2).getOpeningsCountRequired();
                    if (openingsCountRequired != openingsCount && openingsCountRequired <= openingsCount) {
                        f = 1.0f / ((r4.getOpeningsCountRequired() - openingsCountRequired) / (openingsCount - openingsCountRequired));
                    }
                    f = 0.0f;
                } else {
                    if (openingsCount != 0) {
                        f = 1.0f / (r4.getOpeningsCountRequired() / openingsCount);
                    }
                    f = 0.0f;
                }
            }
            arrayList.add(Float.valueOf(f));
            i = i2;
        }
        return arrayList;
    }

    public final AnnotatedString getBCAmountString(int bcAmount) {
        return StringExtensionKt.htmlTextToAnnotatedString(this.stringResources.getString(R.string.cases_bc, UsefulKt.getPriceWithSpaces(Integer.valueOf(bcAmount))));
    }

    public final List<Case> mapArrayToCaseList(List<CaseWithStatusModel> caseStatus, CasesResponse caseResponse, List<BpRewardsAwardsDto> awardList, List<InvItems> inventoryList) {
        String str;
        Object obj;
        int i;
        boolean z;
        Long l;
        int i2;
        ArrayList arrayList = new ArrayList();
        for (CasesCaseTypeDto casesCaseTypeDto : caseResponse.getCases()) {
            int i3 = 1;
            boolean ifTimeHasPassed = ifTimeHasPassed(LongExtensionKt.getOrZero((Long) CollectionsKt___CollectionsKt.getOrNull(casesCaseTypeDto.getDates(), 1)));
            Iterator<T> it = caseStatus.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((CaseWithStatusModel) obj).getIdCase() == casesCaseTypeDto.getId()) {
                    break;
                }
            }
            CaseWithStatusModel caseWithStatusModel = (CaseWithStatusModel) obj;
            if (caseWithStatusModel != null) {
                int valueOfCases = caseWithStatusModel.getValueOfCases();
                z = IntExtensionKt.isOne(Integer.valueOf(caseWithStatusModel.isUsedSale()));
                i = valueOfCases;
            } else {
                i = 0;
                z = false;
            }
            if ((ifTimeHasPassed && i > 0) || !ifTimeHasPassed) {
                List<CasesAwardDto> awards = casesCaseTypeDto.getAwards();
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(awards, 10));
                Iterator<T> it2 = awards.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(toCaseReward((CasesAwardDto) it2.next(), awardList, inventoryList));
                }
                CasesSortedListWithScrolledPos sortingRewards = sortingRewards(arrayList2);
                int findSelectedRewardPos = findSelectedRewardPos(sortingRewards.getSortedRewards(), sortingRewards.getScrolledReward());
                List<CasesBonusDto> bonus = casesCaseTypeDto.getBonus();
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(bonus, 10));
                Iterator<T> it3 = bonus.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(toCaseBonus((CasesBonusDto) it3.next(), awardList, inventoryList));
                }
                Bitmap pngBitmapFromZip = BitmapUtilsKt.getPngBitmapFromZip(this.application, casesCaseTypeDto.getImage(), ImageTypePathInCDNEnum.IMAGE);
                Bitmap pngBitmapFromZip2 = BitmapUtilsKt.getPngBitmapFromZip(this.application, casesCaseTypeDto.getBgImage(), ImageTypePathInCDNEnum.BACKGROUND);
                Long l2 = (Long) CollectionsKt___CollectionsKt.getOrNull(casesCaseTypeDto.getDates(), 0);
                if ((l2 == null || l2.longValue() != 0) && ((l = (Long) CollectionsKt___CollectionsKt.getOrNull(casesCaseTypeDto.getDates(), 1)) == null || l.longValue() != 0)) {
                    DateFormatter dateFormatter = DateFormatter.INSTANCE;
                    str = this.stringResources.getString(R.string.cases_format_date, dateFormatter.formatToDate(LongExtensionKt.getOrZero((Long) CollectionsKt___CollectionsKt.getOrNull(casesCaseTypeDto.getDates(), 0)) * 1000, DateFormatter.DD_MM_YYYY), dateFormatter.formatToDate(LongExtensionKt.getOrZero((Long) CollectionsKt___CollectionsKt.getOrNull(casesCaseTypeDto.getDates(), 1)) * 1000, "dd.MM.yyyy HH:mm"));
                }
                String str2 = str;
                boolean z2 = IntExtensionKt.isNotZero(Integer.valueOf(IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(casesCaseTypeDto.getDiscount(), 0)))) || IntExtensionKt.isNotZero(Integer.valueOf(IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(casesCaseTypeDto.getDiscount(), 1))));
                if (((IntExtensionKt.isZero(Integer.valueOf(casesCaseTypeDto.getDiscountType())) && z2 && !z) || (IntExtensionKt.isOne(Integer.valueOf(casesCaseTypeDto.getDiscountType())) && z2)) && AnyExtensionKt.isNotNull(str2)) {
                    i3 = 3;
                } else if (AnyExtensionKt.isNotNull(str2)) {
                    i3 = 2;
                } else if ((!IntExtensionKt.isZero(Integer.valueOf(casesCaseTypeDto.getDiscountType())) || z || !z2) && (!IntExtensionKt.isOne(Integer.valueOf(casesCaseTypeDto.getDiscountType())) || !z2)) {
                    i2 = 0;
                    arrayList.add(new Case(casesCaseTypeDto.getId(), casesCaseTypeDto.getName(), pngBitmapFromZip, pngBitmapFromZip2, i, z, i2, str2, casesCaseTypeDto.getPrice(), casesCaseTypeDto.getDiscount(), casesCaseTypeDto.getDiscountType(), IntExtensionKt.isOne(Integer.valueOf(casesCaseTypeDto.getSale())), sortingRewards.getSortedRewards(), sortingRewards.getScrolledReward(), findSelectedRewardPos, arrayList3));
                }
                i2 = i3;
                arrayList.add(new Case(casesCaseTypeDto.getId(), casesCaseTypeDto.getName(), pngBitmapFromZip, pngBitmapFromZip2, i, z, i2, str2, casesCaseTypeDto.getPrice(), casesCaseTypeDto.getDiscount(), casesCaseTypeDto.getDiscountType(), IntExtensionKt.isOne(Integer.valueOf(casesCaseTypeDto.getSale())), sortingRewards.getSortedRewards(), sortingRewards.getScrolledReward(), findSelectedRewardPos, arrayList3));
            }
        }
        return arrayList;
    }

    public final CaseReward toCaseReward(CasesAwardDto casesAwardDto, List<BpRewardsAwardsDto> list, List<InvItems> list2) {
        String renderId;
        String str;
        boolean z;
        String str2;
        Object obj;
        List<String> imageList;
        CaseRenderAttachment caseRenderAttachment = new CaseRenderAttachment(0, 0, 0, 0.0f, null, null, null, null, null, null, 1023, null);
        String empty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        if (casesAwardDto.getType() == 5 || casesAwardDto.getType() == 11) {
            if (casesAwardDto.getRenderId() == null) {
                caseRenderAttachment = getCaseRenderAttachment(casesAwardDto.getType(), casesAwardDto.getInternalId(), list2, casesAwardDto.getCount());
                str = empty;
                z = true;
                return new CaseReward(casesAwardDto.getId(), casesAwardDto.getType(), casesAwardDto.getName(), casesAwardDto.getNameStore(), this.stringResources.getString(R.string.common_plus_value, Integer.valueOf(casesAwardDto.getPriceSprayed())), String.valueOf(casesAwardDto.getPriceSprayed()), casesAwardDto.getPriceSprayed(), null, CommonRarityEnum.INSTANCE.fromInt(casesAwardDto.getRarity()), IntExtensionKt.isNotZero(Integer.valueOf(casesAwardDto.getPriceSprayed())), false, false, casesAwardDto.getCount(), z, caseRenderAttachment, str, casesAwardDto.getInternalId(), 128, null);
            }
            renderId = casesAwardDto.getRenderId();
        } else {
            renderId = casesAwardDto.getRenderId();
            if (renderId == null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    str2 = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((BpRewardsAwardsDto) obj).getId() == casesAwardDto.getType()) {
                        break;
                    }
                }
                BpRewardsAwardsDto bpRewardsAwardsDto = (BpRewardsAwardsDto) obj;
                if (bpRewardsAwardsDto != null && (imageList = bpRewardsAwardsDto.getImageList()) != null) {
                    str2 = (String) CollectionsKt___CollectionsKt.getOrNull(imageList, casesAwardDto.getInternalId() - 1);
                }
                renderId = str2 == null ? "" : str2;
            }
        }
        str = renderId;
        z = false;
        return new CaseReward(casesAwardDto.getId(), casesAwardDto.getType(), casesAwardDto.getName(), casesAwardDto.getNameStore(), this.stringResources.getString(R.string.common_plus_value, Integer.valueOf(casesAwardDto.getPriceSprayed())), String.valueOf(casesAwardDto.getPriceSprayed()), casesAwardDto.getPriceSprayed(), null, CommonRarityEnum.INSTANCE.fromInt(casesAwardDto.getRarity()), IntExtensionKt.isNotZero(Integer.valueOf(casesAwardDto.getPriceSprayed())), false, false, casesAwardDto.getCount(), z, caseRenderAttachment, str, casesAwardDto.getInternalId(), 128, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.blackhub.bronline.game.gui.cases.model.CaseBonus toCaseBonus(com.blackhub.bronline.game.model.remote.response.cases.CasesBonusDto r30, java.util.List<com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto> r31, java.util.List<com.blackhub.bronline.game.gui.inventory.data.InvItems> r32) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.cases.CasesViewModel.toCaseBonus(com.blackhub.bronline.game.model.remote.response.cases.CasesBonusDto, java.util.List, java.util.List):com.blackhub.bronline.game.gui.cases.model.CaseBonus");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.blackhub.bronline.game.gui.cases.model.CaseRenderAttachment getCaseRenderAttachment(int r18, int r19, java.util.List<com.blackhub.bronline.game.gui.inventory.data.InvItems> r20, int r21) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.cases.CasesViewModel.getCaseRenderAttachment(int, int, java.util.List, int):com.blackhub.bronline.game.gui.cases.model.CaseRenderAttachment");
    }

    public final Case findSelectedCase(int caseId, List<Case> cases) {
        Object obj;
        Iterator<T> it = cases.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Case) obj).getId() == caseId) {
                break;
            }
        }
        Case r1 = (Case) obj;
        return r1 == null ? new Case(0, null, null, null, 0, false, 0, null, null, null, 0, false, null, null, 0, null, 65535, null) : r1;
    }

    public final int findSelectedRewardPos(List<CaseReward> rewardList, CaseReward reward) {
        Integer valueOf = rewardList != null ? Integer.valueOf(CollectionsKt___CollectionsKt.indexOf((List<? extends CaseReward>) rewardList, reward)) : null;
        if (valueOf != null && valueOf.intValue() == -1) {
            valueOf = 0;
        }
        return IntExtensionKt.getOrZero(valueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.blackhub.bronline.game.gui.cases.model.CasePricesModel initCasePricesModel(int r22, int r23, int r24, int r25, int r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.cases.CasesViewModel.initCasePricesModel(int, int, int, int, int, boolean, boolean):com.blackhub.bronline.game.gui.cases.model.CasePricesModel");
    }

    public final List<Case> updateCasesValue(List<Case> oldCaseList, List<CaseWithStatusModel> newCaseCountList) {
        Object obj;
        int i;
        boolean z;
        int i2;
        Case copy;
        List<Case> list = oldCaseList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Case r3 : list) {
            Iterator<T> it = newCaseCountList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((CaseWithStatusModel) obj).getIdCase() == r3.getId()) {
                    break;
                }
            }
            CaseWithStatusModel caseWithStatusModel = (CaseWithStatusModel) obj;
            int i3 = 0;
            if (caseWithStatusModel != null) {
                int valueOfCases = caseWithStatusModel.getValueOfCases();
                z = IntExtensionKt.isOne(Integer.valueOf(caseWithStatusModel.isUsedSale()));
                i = valueOfCases;
            } else {
                i = 0;
                z = false;
            }
            boolean z2 = IntExtensionKt.isNotZero(Integer.valueOf(IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(r3.getDiscount(), 0)))) || IntExtensionKt.isNotZero(Integer.valueOf(IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(r3.getDiscount(), 1))));
            if (((IntExtensionKt.isZero(Integer.valueOf(r3.getDiscountType())) && z2 && !z) || (IntExtensionKt.isOne(Integer.valueOf(r3.getDiscountType())) && z2)) && AnyExtensionKt.isNotNull(r3.getDates())) {
                i3 = 3;
            } else if (AnyExtensionKt.isNotNull(r3.getDates())) {
                i3 = 2;
            } else if ((IntExtensionKt.isZero(Integer.valueOf(r3.getDiscountType())) && !z && z2) || (IntExtensionKt.isOne(Integer.valueOf(r3.getDiscountType())) && z2)) {
                i2 = 1;
                copy = r3.copy((r34 & 1) != 0 ? r3.id : 0, (r34 & 2) != 0 ? r3.name : null, (r34 & 4) != 0 ? r3.imageBitmap : null, (r34 & 8) != 0 ? r3.bgImageBitmap : null, (r34 & 16) != 0 ? r3.count : i, (r34 & 32) != 0 ? r3.isUsedSale : z, (r34 & 64) != 0 ? r3.type : i2, (r34 & 128) != 0 ? r3.dates : null, (r34 & 256) != 0 ? r3.price : null, (r34 & 512) != 0 ? r3.discount : null, (r34 & 1024) != 0 ? r3.discountType : 0, (r34 & 2048) != 0 ? r3.isSale : false, (r34 & 4096) != 0 ? r3.caseRewardList : null, (r34 & 8192) != 0 ? r3.scrolledReward : null, (r34 & 16384) != 0 ? r3.scrolledPosition : 0, (r34 & 32768) != 0 ? r3.caseBonusList : null);
                arrayList.add(copy);
            }
            i2 = i3;
            copy = r3.copy((r34 & 1) != 0 ? r3.id : 0, (r34 & 2) != 0 ? r3.name : null, (r34 & 4) != 0 ? r3.imageBitmap : null, (r34 & 8) != 0 ? r3.bgImageBitmap : null, (r34 & 16) != 0 ? r3.count : i, (r34 & 32) != 0 ? r3.isUsedSale : z, (r34 & 64) != 0 ? r3.type : i2, (r34 & 128) != 0 ? r3.dates : null, (r34 & 256) != 0 ? r3.price : null, (r34 & 512) != 0 ? r3.discount : null, (r34 & 1024) != 0 ? r3.discountType : 0, (r34 & 2048) != 0 ? r3.isSale : false, (r34 & 4096) != 0 ? r3.caseRewardList : null, (r34 & 8192) != 0 ? r3.scrolledReward : null, (r34 & 16384) != 0 ? r3.scrolledPosition : 0, (r34 & 32768) != 0 ? r3.caseBonusList : null);
            arrayList.add(copy);
        }
        return arrayList;
    }

    public final List<CaseBonus> updateBonusStatus(List<CaseBonus> oldBonusList, List<BonusRewardWithStatus> newBonusStatusList) {
        Integer num;
        Object obj;
        CaseBonus copy;
        List<CaseBonus> list = oldBonusList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (CaseBonus caseBonus : list) {
            Iterator<T> it = newBonusStatusList.iterator();
            while (true) {
                num = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((BonusRewardWithStatus) obj).getIdReward() == caseBonus.getId()) {
                    break;
                }
            }
            BonusRewardWithStatus bonusRewardWithStatus = (BonusRewardWithStatus) obj;
            if (bonusRewardWithStatus != null) {
                num = Integer.valueOf(bonusRewardWithStatus.getStateReward());
            }
            copy = caseBonus.copy((r26 & 1) != 0 ? caseBonus.id : 0, (r26 & 2) != 0 ? caseBonus.typeCasesBonusDto : 0, (r26 & 4) != 0 ? caseBonus.name : null, (r26 & 8) != 0 ? caseBonus.imageBitmap : null, (r26 & 16) != 0 ? caseBonus.state : IntExtensionKt.getOrZero(num), (r26 & 32) != 0 ? caseBonus.openingsCountRequired : 0, (r26 & 64) != 0 ? caseBonus.rarity : null, (r26 & 128) != 0 ? caseBonus.count : 0, (r26 & 256) != 0 ? caseBonus.isRender : false, (r26 & 512) != 0 ? caseBonus.renderAttachment : null, (r26 & 1024) != 0 ? caseBonus.imageName : null, (r26 & 2048) != 0 ? caseBonus.internalId : 0);
            arrayList.add(copy);
        }
        return arrayList;
    }

    public final List<CaseReward> getOpeningRewards(List<CaseReward> allRewardsList, List<Integer> arrayRewardIdList) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = arrayRewardIdList.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            Iterator<T> it2 = allRewardsList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((CaseReward) obj).getRewardId() == intValue) {
                    break;
                }
            }
            CaseReward caseReward = (CaseReward) obj;
            if (caseReward != null) {
                arrayList.add(caseReward);
            }
        }
        return arrayList;
    }

    public final boolean findSprayRewards(List<CaseReward> allRewards) {
        Object obj;
        Iterator<T> it = allRewards.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CaseReward) obj).getSprayed()) {
                break;
            }
        }
        return AnyExtensionKt.isNotNull(obj);
    }

    public final CaseSprayedInfoAttachment findNotSprayedRewards(List<CaseReward> allRewardsList) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (CaseReward caseReward : allRewardsList) {
            if (caseReward.isSprayedReward()) {
                arrayList2.add(Integer.valueOf(caseReward.getRewardId()));
            } else {
                arrayList.add(Integer.valueOf(caseReward.getRewardId()));
            }
        }
        return new CaseSprayedInfoAttachment(arrayList, arrayList2);
    }

    public final CasesBannerSelectedCase getSelectedCaseForBanner(int caseId, CasesResponse caseResponse, List<BpRewardsAwardsDto> awards, List<InvItems> inventoryList) {
        Object obj;
        boolean add;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String empty = AnyExtensionKt.empty(stringCompanionObject);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        String empty2 = AnyExtensionKt.empty(stringCompanionObject);
        Iterator<T> it = caseResponse.getCases().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CasesCaseTypeDto) obj).getId() == caseId) {
                break;
            }
        }
        CasesCaseTypeDto casesCaseTypeDto = (CasesCaseTypeDto) obj;
        if (casesCaseTypeDto != null) {
            empty = casesCaseTypeDto.getName();
            empty2 = casesCaseTypeDto.getImage();
            List<CasesAwardDto> awards2 = casesCaseTypeDto.getAwards();
            ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(awards2, 10));
            for (CasesAwardDto casesAwardDto : awards2) {
                int i = WhenMappings.$EnumSwitchMapping$0[casesAwardDto.getRarityFromEnum().ordinal()];
                if (i == 1) {
                    add = arrayList5.add(toCaseReward(casesAwardDto, awards, inventoryList));
                } else if (i == 2) {
                    add = arrayList4.add(toCaseReward(casesAwardDto, awards, inventoryList));
                } else if (i == 3) {
                    add = arrayList3.add(toCaseReward(casesAwardDto, awards, inventoryList));
                } else if (i == 4) {
                    add = arrayList2.add(toCaseReward(casesAwardDto, awards, inventoryList));
                } else {
                    add = arrayList.add(toCaseReward(casesAwardDto, awards, inventoryList));
                }
                arrayList6.add(Boolean.valueOf(add));
            }
        }
        String str = empty2;
        String str2 = empty;
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList5);
        arrayList7.addAll(arrayList4);
        arrayList7.addAll(arrayList3);
        arrayList7.addAll(arrayList2);
        arrayList7.addAll(arrayList);
        ArrayList arrayList8 = new ArrayList();
        for (int i2 = 0; i2 < 6; i2++) {
            CaseReward caseReward = (CaseReward) CollectionsKt___CollectionsKt.getOrNull(arrayList7, i2);
            if (caseReward != null) {
                arrayList8.add(caseReward);
            }
        }
        return new CasesBannerSelectedCase(arrayList8, str, null, str2, 4, null);
    }

    public final CasesSortedListWithScrolledPos sortingRewards(List<CaseReward> allRewards) {
        CaseReward caseReward;
        List sortedWith = CollectionsKt___CollectionsKt.sortedWith(allRewards, new Comparator() { // from class: com.blackhub.bronline.game.gui.cases.CasesViewModel$sortingRewards$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(((CaseReward) t).getRarity(), ((CaseReward) t2).getRarity());
            }
        });
        ArrayList arrayList = new ArrayList();
        for (Object obj : sortedWith) {
            if (((CaseReward) obj).getRarity() == CommonRarityEnum.LEGENDARY) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : sortedWith) {
            if (((CaseReward) obj2).getRarity() == CommonRarityEnum.EPIC) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : sortedWith) {
            if (((CaseReward) obj3).getRarity() == CommonRarityEnum.RARE) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : sortedWith) {
            if (((CaseReward) obj4).getRarity() == CommonRarityEnum.UNCOMMON) {
                arrayList4.add(obj4);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : sortedWith) {
            if (((CaseReward) obj5).getRarity() == CommonRarityEnum.COMMON) {
                arrayList5.add(obj5);
            }
        }
        int size = arrayList5.size() / 2;
        int size2 = arrayList4.size() / 2;
        int size3 = arrayList3.size() / 2;
        int size4 = arrayList2.size() / 2;
        if (!arrayList.isEmpty()) {
            caseReward = (CaseReward) CollectionsKt___CollectionsKt.getOrNull(arrayList, arrayList.size() / 2);
            if (caseReward == null) {
                caseReward = new CaseReward(0, 0, null, null, null, null, 0, null, null, false, false, false, 0, false, null, null, 0, 131071, null);
            }
        } else if (!arrayList2.isEmpty()) {
            caseReward = (CaseReward) CollectionsKt___CollectionsKt.getOrNull(arrayList2, size4);
            if (caseReward == null) {
                caseReward = new CaseReward(0, 0, null, null, null, null, 0, null, null, false, false, false, 0, false, null, null, 0, 131071, null);
            }
        } else if (!arrayList3.isEmpty()) {
            caseReward = (CaseReward) CollectionsKt___CollectionsKt.getOrNull(arrayList3, size3);
            if (caseReward == null) {
                caseReward = new CaseReward(0, 0, null, null, null, null, 0, null, null, false, false, false, 0, false, null, null, 0, 131071, null);
            }
        } else if (!arrayList4.isEmpty()) {
            caseReward = (CaseReward) CollectionsKt___CollectionsKt.getOrNull(arrayList4, size2);
            if (caseReward == null) {
                caseReward = new CaseReward(0, 0, null, null, null, null, 0, null, null, false, false, false, 0, false, null, null, 0, 131071, null);
            }
        } else if (!arrayList5.isEmpty()) {
            caseReward = (CaseReward) CollectionsKt___CollectionsKt.getOrNull(arrayList5, size);
            if (caseReward == null) {
                caseReward = new CaseReward(0, 0, null, null, null, null, 0, null, null, false, false, false, 0, false, null, null, 0, 131071, null);
            }
        } else {
            caseReward = new CaseReward(0, 0, null, null, null, null, 0, null, null, false, false, false, 0, false, null, null, 0, 131071, null);
        }
        ArrayList arrayList6 = new ArrayList();
        arrayList6.addAll(CollectionsKt___CollectionsKt.take(arrayList5, size));
        arrayList6.addAll(CollectionsKt___CollectionsKt.take(arrayList4, size2));
        arrayList6.addAll(CollectionsKt___CollectionsKt.take(arrayList3, size3));
        arrayList6.addAll(CollectionsKt___CollectionsKt.take(arrayList2, size4));
        arrayList6.addAll(arrayList);
        arrayList6.addAll(CollectionsKt___CollectionsKt.drop(arrayList2, size4));
        arrayList6.addAll(CollectionsKt___CollectionsKt.drop(arrayList3, size3));
        arrayList6.addAll(CollectionsKt___CollectionsKt.drop(arrayList4, size2));
        arrayList6.addAll(CollectionsKt___CollectionsKt.drop(arrayList5, size));
        return new CasesSortedListWithScrolledPos(arrayList6, caseReward);
    }

    public final boolean ifTimeHasPassed(long unixTimeStamp) {
        return unixTimeStamp != 0 && unixTimeStamp < System.currentTimeMillis() / 1000;
    }
}
