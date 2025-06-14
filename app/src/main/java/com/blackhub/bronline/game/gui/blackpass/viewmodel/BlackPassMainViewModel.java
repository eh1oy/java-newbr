package com.blackhub.bronline.game.gui.blackpass.viewmodel;

import android.app.Application;
import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.common.C;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.utils.attachment.BaseModel;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskModel;
import com.blackhub.bronline.game.gui.blackpass.BlackPassMainUIState;
import com.blackhub.bronline.game.gui.blackpass.data.BPLastChanceItemModel;
import com.blackhub.bronline.game.gui.blackpass.data.RewardModel;
import com.blackhub.bronline.game.gui.blackpass.network.BlackPassActionWithJSON;
import com.blackhub.bronline.game.gui.donate.data.ItemForDialogConfirmation;
import com.blackhub.bronline.game.gui.donate.data.ObjForResultDialog;
import com.blackhub.bronline.game.model.remote.response.blackpass.BlackPassItems;
import com.blackhub.bronline.game.model.remote.response.blackpass.LevelsInfo;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: BlackPassMainViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020)J\u000e\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020\fJ\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.J\u001e\u00100\u001a\u00020)2\u0006\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\fJ\u0016\u00104\u001a\u00020)2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208J@\u00109\u001a\u00020)2\u0006\u0010:\u001a\u00020;2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020@0=2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020B0=2\u0006\u0010C\u001a\u00020\fJ\u001a\u0010D\u001a\u00020)2\b\b\u0002\u0010E\u001a\u00020\f2\b\b\u0002\u0010F\u001a\u00020\fJZ\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010F\u001a\u00020\f2\u0006\u0010M\u001a\u00020\f2\u0006\u0010N\u001a\u00020L2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020@0=2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020B0=H\u0002J\u0088\u0001\u0010O\u001a\b\u0012\u0004\u0012\u00020P0=2\u0016\u0010Q\u001a\u0012\u0012\u0004\u0012\u00020J0Rj\b\u0012\u0004\u0012\u00020J`S2\u0016\u0010T\u001a\u0012\u0012\u0004\u0012\u00020J0Rj\b\u0012\u0004\u0012\u00020J`S2\u0006\u0010K\u001a\u00020L2\u0006\u0010F\u001a\u00020\f2\u0006\u0010U\u001a\u00020L2\u0006\u0010V\u001a\u00020L2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020@0=2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020B0=H\u0002J\u0006\u0010W\u001a\u00020)J\u0006\u0010X\u001a\u00020)J\u000e\u0010Y\u001a\u00020)2\u0006\u0010Z\u001a\u00020[J\b\u0010\\\u001a\u00020)H\u0014J\u000e\u0010]\u001a\u00020)2\u0006\u0010^\u001a\u00020\fJ\u0006\u0010_\u001a\u00020)J\u0010\u0010`\u001a\u00020)2\b\u0010a\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010b\u001a\u00020)2\u0006\u0010a\u001a\u00020\u000fJ\u000e\u0010c\u001a\u00020)2\u0006\u0010d\u001a\u00020\fJ\u0006\u0010e\u001a\u00020)J\u000e\u0010f\u001a\u00020)2\u0006\u0010g\u001a\u00020\fJ\u000e\u0010h\u001a\u00020)2\u0006\u0010i\u001a\u00020\fJ\u0006\u0010j\u001a\u00020)J\u000e\u0010k\u001a\u00020)2\u0006\u0010l\u001a\u00020\fJ[\u0010m\u001a\u00020)2\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\f2\u0006\u0010n\u001a\u0002082\u0006\u0010o\u001a\u00020\f2\n\b\u0002\u0010p\u001a\u0004\u0018\u00010\f2\u0006\u0010q\u001a\u0002082\u0006\u0010r\u001a\u0002082\u0006\u0010s\u001a\u0002082\u0006\u0010t\u001a\u0002082\u0006\u0010u\u001a\u00020\f¢\u0006\u0002\u0010vJ6\u0010w\u001a\u00020)2\u0006\u0010x\u001a\u0002082\u0006\u0010y\u001a\u00020\f2\u0006\u0010z\u001a\u0002082\u0006\u0010r\u001a\u0002082\u0006\u0010{\u001a\u0002082\u0006\u0010|\u001a\u00020\fJ\u000e\u0010}\u001a\u00020)2\u0006\u0010:\u001a\u00020;J4\u0010~\u001a\u00020)2\u0006\u0010:\u001a\u00020;2\u0006\u00101\u001a\u00020\f2\u000e\u0010\u007f\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010=2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020B0=J\u0010\u0010\u0080\u0001\u001a\u00020)2\u0007\u0010\u0081\u0001\u001a\u00020\fJ*\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u0006\u0010F\u001a\u00020\f2\u0006\u0010M\u001a\u00020\f2\u0006\u0010K\u001a\u00020L2\u0006\u0010N\u001a\u00020LH\u0002J\u0018\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020P0=2\u0007\u0010\u0085\u0001\u001a\u00020\fH\u0002R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u0006X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u001f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!¨\u0006\u0086\u0001"}, d2 = {"Lcom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/blackpass/BlackPassMainUIState;", "actionWithJson", "Lcom/blackhub/bronline/game/gui/blackpass/network/BlackPassActionWithJSON;", "stringResource", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "application", "Landroid/app/Application;", "(Lcom/blackhub/bronline/game/gui/blackpass/network/BlackPassActionWithJSON;Lcom/blackhub/bronline/game/core/resources/StringResource;Landroid/app/Application;)V", "_priceForBPLevel", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_startLayout", "_taskPreviewItem", "Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskModel;", "_uiState", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "mutableObjForDialogConfirmation", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/blackhub/bronline/game/gui/donate/data/ItemForDialogConfirmation;", "mutableObjForDialogResult", "Lcom/blackhub/bronline/game/gui/donate/data/ObjForResultDialog;", "objForDialogConfirmation", "Lkotlinx/coroutines/flow/SharedFlow;", "getObjForDialogConfirmation", "()Lkotlinx/coroutines/flow/SharedFlow;", "objForDialogResult", "getObjForDialogResult", "startLayout", "Lkotlinx/coroutines/flow/StateFlow;", "getStartLayout", "()Lkotlinx/coroutines/flow/StateFlow;", "getStringResource", "()Lcom/blackhub/bronline/game/core/resources/StringResource;", "taskPreviewItem", "getTaskPreviewItem", "uiState", "getUiState", "clearData", "", "clearViewModel", "customDialogConfirmationLevelUp", "levelsToBuy", "gelListOfChanceItemView", "", "Lcom/blackhub/bronline/game/gui/blackpass/data/BPLastChanceItemModel;", "getPrize", "currentLayout", "id", "isPremium", "initDataFromJson", "blackPassItems", "Lcom/blackhub/bronline/game/model/remote/response/blackpass/BlackPassItems;", "calendarSeasonColor", "", "initInterface", "json", "Lorg/json/JSONObject;", "vehiclesList", "", "Lcom/blackhub/bronline/game/model/remote/response/vehicles/VehiclesDTO;", "skinsList", "Lcom/blackhub/bronline/game/model/remote/response/skins/SkinsDTO;", "listOfAwardsTypes", "Lcom/blackhub/bronline/game/model/remote/response/bprewards/BpRewardsAwardsDto;", "premiumStatus", "levelUp", "valueOfExperience", "bpLevel", "mapLevelsInfoToRewardModel", "Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardModel;", "levelInfo", "Lcom/blackhub/bronline/game/model/remote/response/blackpass/LevelsInfo;", "isWithVip", "", "elementPos", "isNotReceived", "mapRewardsListFromJson", "Lcom/blackhub/bronline/game/gui/blackpass/data/RewardModel;", "standardLevel", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "premiumLevel", "standardIsNotReceived", "premiumIsNotReceived", "onButtonBuyPremiumClick", "onButtonBuyPremiumDeluxeClick", "onCategoryTaskClick", "categoryId", "", "onCleared", "onClickSelectLayout", "selectedLayout", "onRefreshRatingClick", "onShowTaskDialog", "task", "onTaskClick", "purchasePremium", "premiumId", "requestInitData", "sendExchangeTask", "taskId", "sendShowCurrentLayout", "layoutId", "setPremiumStatusSuccessfullyBought", "setStartLayout", TtmlNode.TAG_LAYOUT, "showDialogConfirmation", "bodyMessage", FirebaseAnalytics.Param.PRICE, "levels", "priceText", "caption", "textForButtonOK", "textForButtonCancel", "action", "(Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "showDialogResult", ThrowableDeserializer.PROP_NAME_MESSAGE, FirebaseAnalytics.Param.SUCCESS, "boldMessage", "buttonOK", "currentAction", "updateAfterGetPrize", "updateJson", "bpRewards", "updateMyPosition", "myPlaceInRating", "updateRewardState", "Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardState;", "updateRewardsList", "posByLevel", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBlackPassMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1001:1\n230#2,5:1002\n230#2,5:1007\n230#2,5:1014\n230#2,5:1019\n230#2,5:1024\n1855#3,2:1012\n1559#3:1029\n1590#3,4:1030\n*S KotlinDebug\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel\n*L\n299#1:1002,5\n311#1:1007,5\n478#1:1014,5\n762#1:1019,5\n790#1:1024,5\n401#1:1012,2\n927#1:1029\n927#1:1030,4\n*E\n"})
/* loaded from: classes3.dex */
public final class BlackPassMainViewModel extends BaseViewModel<BlackPassMainUIState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<Integer> _priceForBPLevel;

    @NotNull
    public final MutableStateFlow<Integer> _startLayout;

    @NotNull
    public final MutableStateFlow<CommonTaskModel> _taskPreviewItem;

    @NotNull
    public final MutableStateFlow<BlackPassMainUIState> _uiState;

    @NotNull
    public final BlackPassActionWithJSON actionWithJson;

    @NotNull
    public final Application application;

    @NotNull
    public final MutableSharedFlow<ItemForDialogConfirmation> mutableObjForDialogConfirmation;

    @NotNull
    public final MutableSharedFlow<ObjForResultDialog> mutableObjForDialogResult;

    @NotNull
    public final SharedFlow<ItemForDialogConfirmation> objForDialogConfirmation;

    @NotNull
    public final SharedFlow<ObjForResultDialog> objForDialogResult;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<CommonTaskModel> taskPreviewItem;

    @NotNull
    public final StateFlow<BlackPassMainUIState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Inject
    public BlackPassMainViewModel(@NotNull BlackPassActionWithJSON actionWithJson, @NotNull StringResource stringResource, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        Intrinsics.checkNotNullParameter(application, "application");
        this.actionWithJson = actionWithJson;
        this.stringResource = stringResource;
        this.application = application;
        this._uiState = StateFlowKt.MutableStateFlow(new BlackPassMainUIState(0, 0, 0, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, 0, null, null, null, (byte) 0, null, null, null, null, null, null, null, 0, 0, 0, null, 0, null, null, null, null, null, null, null, null, -1, 1023, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
        MutableSharedFlow<ItemForDialogConfirmation> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableObjForDialogConfirmation = MutableSharedFlow$default;
        this.objForDialogConfirmation = MutableSharedFlow$default;
        MutableSharedFlow<ObjForResultDialog> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableObjForDialogResult = MutableSharedFlow$default2;
        this.objForDialogResult = MutableSharedFlow$default2;
        this._startLayout = StateFlowKt.MutableStateFlow(0);
        MutableStateFlow<CommonTaskModel> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._taskPreviewItem = MutableStateFlow;
        this.taskPreviewItem = FlowKt.asStateFlow(MutableStateFlow);
        this._priceForBPLevel = StateFlowKt.MutableStateFlow(150);
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends BlackPassMainUIState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<BlackPassMainUIState> getUiState() {
        return this.uiState;
    }

    @NotNull
    public final SharedFlow<ItemForDialogConfirmation> getObjForDialogConfirmation() {
        return this.objForDialogConfirmation;
    }

    @NotNull
    public final SharedFlow<ObjForResultDialog> getObjForDialogResult() {
        return this.objForDialogResult;
    }

    @NotNull
    public final StateFlow<Integer> getStartLayout() {
        return FlowKt.asStateFlow(this._startLayout);
    }

    @NotNull
    public final StateFlow<CommonTaskModel> getTaskPreviewItem() {
        return this.taskPreviewItem;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        clearData();
        super.onCleared();
    }

    public final void initDataFromJson(@NotNull BlackPassItems blackPassItems, @NotNull String calendarSeasonColor) {
        Intrinsics.checkNotNullParameter(blackPassItems, "blackPassItems");
        Intrinsics.checkNotNullParameter(calendarSeasonColor, "calendarSeasonColor");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new BlackPassMainViewModel$initDataFromJson$1(blackPassItems, this, calendarSeasonColor, null), 1, null);
    }

    public final void initInterface(@NotNull JSONObject json, @NotNull List<VehiclesDTO> vehiclesList, @NotNull List<SkinsDTO> skinsList, @NotNull List<BpRewardsAwardsDto> listOfAwardsTypes, int premiumStatus) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(vehiclesList, "vehiclesList");
        Intrinsics.checkNotNullParameter(skinsList, "skinsList");
        Intrinsics.checkNotNullParameter(listOfAwardsTypes, "listOfAwardsTypes");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new BlackPassMainViewModel$initInterface$1(this, json, listOfAwardsTypes, vehiclesList, skinsList, premiumStatus, null), 1, null);
    }

    public final void onClickSelectLayout(int selectedLayout) {
        BlackPassMainUIState value;
        BlackPassMainUIState copy;
        MutableStateFlow<? extends BlackPassMainUIState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r60 & 1) != 0 ? r2.bpLevel : 0, (r60 & 2) != 0 ? r2.maxBpLevel : 0, (r60 & 4) != 0 ? r2.selectedLayout : selectedLayout, (r60 & 8) != 0 ? r2.seasonName : null, (r60 & 16) != 0 ? r2.seasonBg : null, (r60 & 32) != 0 ? r2.seasonColor : 0, (r60 & 64) != 0 ? r2.timerDaysAndHours : null, (r60 & 128) != 0 ? r2.valueOfExperience : 0, (r60 & 256) != 0 ? r2.maxLevelExp : 0, (r60 & 512) != 0 ? r2.bpProperties : null, (r60 & 1024) != 0 ? r2.premiumBitmapImage : null, (r60 & 2048) != 0 ? r2.seasonBitmapImage : null, (r60 & 4096) != 0 ? r2.seasonBitmapImageForRewards : null, (r60 & 8192) != 0 ? r2.vipState : null, (r60 & 16384) != 0 ? r2.rewardsList : null, (r60 & 32768) != 0 ? r2.standardLevelArray : null, (r60 & 65536) != 0 ? r2.premiumLevelArray : null, (r60 & 131072) != 0 ? r2.myPlaceInRating : 0, (r60 & 262144) != 0 ? r2.ratingList : null, (r60 & 524288) != 0 ? r2.ratingBgImage : null, (r60 & 1048576) != 0 ? r2.bpExpBitmap : null, (r60 & 2097152) != 0 ? r2.selectedCategoryTask : (byte) 0, (r60 & 4194304) != 0 ? r2.tasksFromJsonList : null, (r60 & 8388608) != 0 ? r2.specialTasksList : null, (r60 & 16777216) != 0 ? r2.dailyTasksList : null, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.specialCategoryImageBitmap : null, (r60 & 67108864) != 0 ? r2.dailyCategoryImageBitmap : null, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.weeklyTimerForEndCategory : null, (r60 & 268435456) != 0 ? r2.imgRubBitmap : null, (r60 & 536870912) != 0 ? r2.activatePremiumCounter : 0, (r60 & 1073741824) != 0 ? r2.premiumStatus : 0, (r60 & Integer.MIN_VALUE) != 0 ? r2.premiumPriceInt : 0, (r61 & 1) != 0 ? r2.premiumPrice : null, (r61 & 2) != 0 ? r2.premiumDeluxePriceInt : 0, (r61 & 4) != 0 ? r2.premiumDeluxePrice : null, (r61 & 8) != 0 ? r2.imgOfferSplit : null, (r61 & 16) != 0 ? r2.imgDeluxeCar : null, (r61 & 32) != 0 ? r2.nameDeluxeCar : null, (r61 & 64) != 0 ? r2.activatePremiumSubtitle : null, (r61 & 128) != 0 ? r2.activatePremiumDeluxeSubtitle : null, (r61 & 256) != 0 ? r2.bannerTitlePrize1 : null, (r61 & 512) != 0 ? value.imageDustBitmap : null);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void setStartLayout(int layout) {
        this._startLayout.setValue(Integer.valueOf(layout));
    }

    public final void setPremiumStatusSuccessfullyBought() {
        BlackPassMainUIState value;
        BlackPassMainUIState copy;
        MutableStateFlow<? extends BlackPassMainUIState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r60 & 1) != 0 ? r2.bpLevel : 0, (r60 & 2) != 0 ? r2.maxBpLevel : 0, (r60 & 4) != 0 ? r2.selectedLayout : 0, (r60 & 8) != 0 ? r2.seasonName : null, (r60 & 16) != 0 ? r2.seasonBg : null, (r60 & 32) != 0 ? r2.seasonColor : 0, (r60 & 64) != 0 ? r2.timerDaysAndHours : null, (r60 & 128) != 0 ? r2.valueOfExperience : 0, (r60 & 256) != 0 ? r2.maxLevelExp : 0, (r60 & 512) != 0 ? r2.bpProperties : null, (r60 & 1024) != 0 ? r2.premiumBitmapImage : null, (r60 & 2048) != 0 ? r2.seasonBitmapImage : null, (r60 & 4096) != 0 ? r2.seasonBitmapImageForRewards : null, (r60 & 8192) != 0 ? r2.vipState : null, (r60 & 16384) != 0 ? r2.rewardsList : null, (r60 & 32768) != 0 ? r2.standardLevelArray : null, (r60 & 65536) != 0 ? r2.premiumLevelArray : null, (r60 & 131072) != 0 ? r2.myPlaceInRating : 0, (r60 & 262144) != 0 ? r2.ratingList : null, (r60 & 524288) != 0 ? r2.ratingBgImage : null, (r60 & 1048576) != 0 ? r2.bpExpBitmap : null, (r60 & 2097152) != 0 ? r2.selectedCategoryTask : (byte) 0, (r60 & 4194304) != 0 ? r2.tasksFromJsonList : null, (r60 & 8388608) != 0 ? r2.specialTasksList : null, (r60 & 16777216) != 0 ? r2.dailyTasksList : null, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.specialCategoryImageBitmap : null, (r60 & 67108864) != 0 ? r2.dailyCategoryImageBitmap : null, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.weeklyTimerForEndCategory : null, (r60 & 268435456) != 0 ? r2.imgRubBitmap : null, (r60 & 536870912) != 0 ? r2.activatePremiumCounter : 1, (r60 & 1073741824) != 0 ? r2.premiumStatus : 2, (r60 & Integer.MIN_VALUE) != 0 ? r2.premiumPriceInt : 0, (r61 & 1) != 0 ? r2.premiumPrice : null, (r61 & 2) != 0 ? r2.premiumDeluxePriceInt : 0, (r61 & 4) != 0 ? r2.premiumDeluxePrice : null, (r61 & 8) != 0 ? r2.imgOfferSplit : null, (r61 & 16) != 0 ? r2.imgDeluxeCar : null, (r61 & 32) != 0 ? r2.nameDeluxeCar : null, (r61 & 64) != 0 ? r2.activatePremiumSubtitle : null, (r61 & 128) != 0 ? r2.activatePremiumDeluxeSubtitle : null, (r61 & 256) != 0 ? r2.bannerTitlePrize1 : null, (r61 & 512) != 0 ? value.imageDustBitmap : null);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void requestInitData() {
        this.actionWithJson.requestInitData();
    }

    public static /* synthetic */ void showDialogConfirmation$default(BlackPassMainViewModel blackPassMainViewModel, Integer num, String str, int i, Integer num2, String str2, String str3, String str4, String str5, int i2, int i3, Object obj) {
        blackPassMainViewModel.showDialogConfirmation((i3 & 1) != 0 ? null : num, str, i, (i3 & 8) != 0 ? null : num2, str2, str3, str4, str5, i2);
    }

    public final void showDialogConfirmation(@Nullable Integer taskId, @NotNull String bodyMessage, int price, @Nullable Integer levels, @NotNull String priceText, @NotNull String caption, @NotNull String textForButtonOK, @NotNull String textForButtonCancel, int action) {
        Intrinsics.checkNotNullParameter(bodyMessage, "bodyMessage");
        Intrinsics.checkNotNullParameter(priceText, "priceText");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(textForButtonOK, "textForButtonOK");
        Intrinsics.checkNotNullParameter(textForButtonCancel, "textForButtonCancel");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BlackPassMainViewModel$showDialogConfirmation$1(action, levels, this, price, priceText, caption, textForButtonOK, textForButtonCancel, taskId, bodyMessage, null), 3, null);
    }

    public final void showDialogResult(@NotNull String message, int success, @NotNull String boldMessage, @NotNull String caption, @NotNull String buttonOK, int currentAction) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(boldMessage, "boldMessage");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(buttonOK, "buttonOK");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BlackPassMainViewModel$showDialogResult$1(this, message, success, boldMessage, caption, buttonOK, currentAction, null), 3, null);
    }

    public final void customDialogConfirmationLevelUp(int levelsToBuy) {
        this.actionWithJson.confirmationLevelUp(levelsToBuy);
    }

    @NotNull
    public final List<BPLastChanceItemModel> gelListOfChanceItemView() {
        ArrayList arrayList = new ArrayList();
        int maxBpLevel = getUiState().getValue().getMaxBpLevel() - get_uiState().getValue().getBpLevel();
        Iterator<T> it = getStringResource().bpBoostListOfLevels().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            boolean z = intValue == 1 || intValue == 10;
            int i = intValue != 1 ? (intValue == 5 || intValue == 10) ? R.dimen._10wdp : R.dimen._20wdp : R.dimen._05wdp;
            if (intValue < maxBpLevel) {
                arrayList.add(new BPLastChanceItemModel(getStringResource().bpHeader(intValue), intValue, intValue * this._priceForBPLevel.getValue().intValue(), z, i));
            }
        }
        if (maxBpLevel >= 1) {
            arrayList.add(new BPLastChanceItemModel(getStringResource().bpHeaderMax(), maxBpLevel, maxBpLevel * this._priceForBPLevel.getValue().intValue(), true, R.dimen._30wdp));
        }
        return arrayList;
    }

    public static /* synthetic */ void levelUp$default(BlackPassMainViewModel blackPassMainViewModel, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        blackPassMainViewModel.levelUp(i, i2);
    }

    public final void levelUp(int valueOfExperience, int bpLevel) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new BlackPassMainViewModel$levelUp$1(valueOfExperience, bpLevel, this, null), 1, null);
    }

    public final void sendShowCurrentLayout(int layoutId) {
        this.actionWithJson.showCurrentLayout(layoutId);
    }

    public final void clearViewModel() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new BlackPassMainViewModel$clearViewModel$1(this, null), 2, null);
    }

    public final void clearData() {
        Bitmap seasonBitmapImage = get_uiState().getValue().getSeasonBitmapImage();
        if (seasonBitmapImage != null) {
            seasonBitmapImage.recycle();
        }
        Bitmap seasonBg = get_uiState().getValue().getSeasonBg();
        if (seasonBg != null) {
            seasonBg.recycle();
        }
        MutableStateFlow<? extends BlackPassMainUIState> mutableStateFlow = get_uiState();
        do {
        } while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new BlackPassMainUIState(0, 0, 0, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, 0, null, null, null, (byte) 0, null, null, null, null, null, null, null, 0, 0, 0, null, 0, null, null, null, null, null, null, null, null, -1, 1023, null)));
    }

    public final void updateAfterGetPrize(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new BlackPassMainViewModel$updateAfterGetPrize$1(json, this, null), 1, null);
    }

    public final void getPrize(int currentLayout, int id, int isPremium) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new BlackPassMainViewModel$getPrize$1(this, currentLayout, id, isPremium, null), 1, null);
    }

    public final void updateJson(@NotNull JSONObject json, int currentLayout, @Nullable List<LevelsInfo> bpRewards, @NotNull List<BpRewardsAwardsDto> listOfAwardsTypes) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(listOfAwardsTypes, "listOfAwardsTypes");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new BlackPassMainViewModel$updateJson$1(currentLayout, this, json, bpRewards, listOfAwardsTypes, null), 1, null);
    }

    public final void purchasePremium(int premiumId) {
        this.actionWithJson.purchasePremium(premiumId);
    }

    public final void onCategoryTaskClick(byte categoryId) {
        BlackPassMainUIState value;
        BlackPassMainUIState copy;
        MutableStateFlow<? extends BlackPassMainUIState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r60 & 1) != 0 ? r2.bpLevel : 0, (r60 & 2) != 0 ? r2.maxBpLevel : 0, (r60 & 4) != 0 ? r2.selectedLayout : 0, (r60 & 8) != 0 ? r2.seasonName : null, (r60 & 16) != 0 ? r2.seasonBg : null, (r60 & 32) != 0 ? r2.seasonColor : 0, (r60 & 64) != 0 ? r2.timerDaysAndHours : null, (r60 & 128) != 0 ? r2.valueOfExperience : 0, (r60 & 256) != 0 ? r2.maxLevelExp : 0, (r60 & 512) != 0 ? r2.bpProperties : null, (r60 & 1024) != 0 ? r2.premiumBitmapImage : null, (r60 & 2048) != 0 ? r2.seasonBitmapImage : null, (r60 & 4096) != 0 ? r2.seasonBitmapImageForRewards : null, (r60 & 8192) != 0 ? r2.vipState : null, (r60 & 16384) != 0 ? r2.rewardsList : null, (r60 & 32768) != 0 ? r2.standardLevelArray : null, (r60 & 65536) != 0 ? r2.premiumLevelArray : null, (r60 & 131072) != 0 ? r2.myPlaceInRating : 0, (r60 & 262144) != 0 ? r2.ratingList : null, (r60 & 524288) != 0 ? r2.ratingBgImage : null, (r60 & 1048576) != 0 ? r2.bpExpBitmap : null, (r60 & 2097152) != 0 ? r2.selectedCategoryTask : categoryId, (r60 & 4194304) != 0 ? r2.tasksFromJsonList : null, (r60 & 8388608) != 0 ? r2.specialTasksList : null, (r60 & 16777216) != 0 ? r2.dailyTasksList : null, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.specialCategoryImageBitmap : null, (r60 & 67108864) != 0 ? r2.dailyCategoryImageBitmap : null, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.weeklyTimerForEndCategory : null, (r60 & 268435456) != 0 ? r2.imgRubBitmap : null, (r60 & 536870912) != 0 ? r2.activatePremiumCounter : 0, (r60 & 1073741824) != 0 ? r2.premiumStatus : 0, (r60 & Integer.MIN_VALUE) != 0 ? r2.premiumPriceInt : 0, (r61 & 1) != 0 ? r2.premiumPrice : null, (r61 & 2) != 0 ? r2.premiumDeluxePriceInt : 0, (r61 & 4) != 0 ? r2.premiumDeluxePrice : null, (r61 & 8) != 0 ? r2.imgOfferSplit : null, (r61 & 16) != 0 ? r2.imgDeluxeCar : null, (r61 & 32) != 0 ? r2.nameDeluxeCar : null, (r61 & 64) != 0 ? r2.activatePremiumSubtitle : null, (r61 & 128) != 0 ? r2.activatePremiumDeluxeSubtitle : null, (r61 & 256) != 0 ? r2.bannerTitlePrize1 : null, (r61 & 512) != 0 ? value.imageDustBitmap : null);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onTaskClick(@NotNull CommonTaskModel task) {
        Intrinsics.checkNotNullParameter(task, "task");
        ViewModelExtensionKt.launchOnIO$default(this, null, new BlackPassMainViewModel$onTaskClick$1(this, task, null), 1, null);
    }

    public final void sendExchangeTask(int taskId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new BlackPassMainViewModel$sendExchangeTask$1(this, taskId, null), 1, null);
    }

    public final void onRefreshRatingClick() {
        this.actionWithJson.sendRefreshRating();
    }

    public final void onShowTaskDialog(@Nullable CommonTaskModel task) {
        this._taskPreviewItem.tryEmit(task);
    }

    public final void updateMyPosition(int myPlaceInRating) {
        BlackPassMainUIState value;
        BlackPassMainUIState copy;
        MutableStateFlow<? extends BlackPassMainUIState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r60 & 1) != 0 ? r2.bpLevel : 0, (r60 & 2) != 0 ? r2.maxBpLevel : 0, (r60 & 4) != 0 ? r2.selectedLayout : 0, (r60 & 8) != 0 ? r2.seasonName : null, (r60 & 16) != 0 ? r2.seasonBg : null, (r60 & 32) != 0 ? r2.seasonColor : 0, (r60 & 64) != 0 ? r2.timerDaysAndHours : null, (r60 & 128) != 0 ? r2.valueOfExperience : 0, (r60 & 256) != 0 ? r2.maxLevelExp : 0, (r60 & 512) != 0 ? r2.bpProperties : null, (r60 & 1024) != 0 ? r2.premiumBitmapImage : null, (r60 & 2048) != 0 ? r2.seasonBitmapImage : null, (r60 & 4096) != 0 ? r2.seasonBitmapImageForRewards : null, (r60 & 8192) != 0 ? r2.vipState : null, (r60 & 16384) != 0 ? r2.rewardsList : null, (r60 & 32768) != 0 ? r2.standardLevelArray : null, (r60 & 65536) != 0 ? r2.premiumLevelArray : null, (r60 & 131072) != 0 ? r2.myPlaceInRating : myPlaceInRating, (r60 & 262144) != 0 ? r2.ratingList : null, (r60 & 524288) != 0 ? r2.ratingBgImage : null, (r60 & 1048576) != 0 ? r2.bpExpBitmap : null, (r60 & 2097152) != 0 ? r2.selectedCategoryTask : (byte) 0, (r60 & 4194304) != 0 ? r2.tasksFromJsonList : null, (r60 & 8388608) != 0 ? r2.specialTasksList : null, (r60 & 16777216) != 0 ? r2.dailyTasksList : null, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.specialCategoryImageBitmap : null, (r60 & 67108864) != 0 ? r2.dailyCategoryImageBitmap : null, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.weeklyTimerForEndCategory : null, (r60 & 268435456) != 0 ? r2.imgRubBitmap : null, (r60 & 536870912) != 0 ? r2.activatePremiumCounter : 0, (r60 & 1073741824) != 0 ? r2.premiumStatus : 0, (r60 & Integer.MIN_VALUE) != 0 ? r2.premiumPriceInt : 0, (r61 & 1) != 0 ? r2.premiumPrice : null, (r61 & 2) != 0 ? r2.premiumDeluxePriceInt : 0, (r61 & 4) != 0 ? r2.premiumDeluxePrice : null, (r61 & 8) != 0 ? r2.imgOfferSplit : null, (r61 & 16) != 0 ? r2.imgDeluxeCar : null, (r61 & 32) != 0 ? r2.nameDeluxeCar : null, (r61 & 64) != 0 ? r2.activatePremiumSubtitle : null, (r61 & 128) != 0 ? r2.activatePremiumDeluxeSubtitle : null, (r61 & 256) != 0 ? r2.bannerTitlePrize1 : null, (r61 & 512) != 0 ? value.imageDustBitmap : null);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final List<RewardModel> mapRewardsListFromJson(ArrayList<LevelsInfo> standardLevel, ArrayList<LevelsInfo> premiumLevel, boolean isWithVip, int bpLevel, boolean standardIsNotReceived, boolean premiumIsNotReceived, List<VehiclesDTO> vehiclesList, List<SkinsDTO> skinsList, List<BpRewardsAwardsDto> listOfAwardsTypes) {
        ArrayList arrayList = new ArrayList();
        int size = standardLevel.size();
        for (int i = 0; i < size; i++) {
            LevelsInfo levelsInfo = (LevelsInfo) CollectionsKt___CollectionsKt.getOrNull(standardLevel, i);
            if (levelsInfo == null) {
                levelsInfo = new LevelsInfo(0, null, null, null, null, 0, 0, null, 0, 0, null, null, null, null, 0, 0, 65535, null);
            }
            CommonRewardModel mapLevelsInfoToRewardModel = mapLevelsInfoToRewardModel(levelsInfo, true, bpLevel, i, standardIsNotReceived, vehiclesList, skinsList, listOfAwardsTypes);
            LevelsInfo levelsInfo2 = (LevelsInfo) CollectionsKt___CollectionsKt.getOrNull(premiumLevel, i);
            if (levelsInfo2 == null) {
                levelsInfo2 = new LevelsInfo(0, null, null, null, null, 0, 0, null, 0, 0, null, null, null, null, 0, 0, 65535, null);
            }
            arrayList.add(new RewardModel(mapLevelsInfoToRewardModel, mapLevelsInfoToRewardModel(levelsInfo2, isWithVip, bpLevel, i, premiumIsNotReceived, vehiclesList, skinsList, listOfAwardsTypes)));
        }
        return arrayList;
    }

    public final CommonRewardModel mapLevelsInfoToRewardModel(LevelsInfo levelInfo, boolean isWithVip, int bpLevel, int elementPos, boolean isNotReceived, List<VehiclesDTO> vehiclesList, List<SkinsDTO> skinsList, List<BpRewardsAwardsDto> listOfAwardsTypes) {
        boolean isOne = IntExtensionKt.isOne(Integer.valueOf(levelInfo.getTypeReward()));
        CommonRewardState updateRewardState = updateRewardState(bpLevel, elementPos, isWithVip, isNotReceived);
        BaseModel baseModel = new BaseModel(levelInfo.getId(), levelInfo.getTypeId(), levelInfo.getAwardId(), levelInfo.getRenderId(), levelInfo.getName(), levelInfo.getNameStore());
        int id = levelInfo.getId();
        String str = (String) UtilsKt.buildTypeMerge(levelInfo.getName(), levelInfo.getNameStore());
        String str2 = str == null ? "" : str;
        String str3 = (String) UtilsKt.buildTypeMerge(levelInfo.getDescription(), levelInfo.getDescriptionStore());
        return new CommonRewardModel(id, str2, str3 == null ? "" : str3, getStringResource().getString(R.string.common_get), null, levelInfo.getTypeId(), levelInfo.getAwardId(), null, isOne, false, 0, updateRewardState, null, false, true, CommonRarityEnum.INSTANCE.fromInt(levelInfo.getRarity()), 0, UtilsKt.setImageModel(baseModel, vehiclesList, skinsList, listOfAwardsTypes), 71312, null);
    }

    public final CommonRewardState updateRewardState(int bpLevel, int elementPos, boolean isWithVip, boolean isNotReceived) {
        int i = elementPos + 1;
        if (bpLevel > i) {
            if (isWithVip) {
                return CommonRewardState.NORM_RECEIVED;
            }
            return CommonRewardState.NORM_NOT_RECEIVED;
        }
        if (bpLevel != i) {
            return CommonRewardState.NORM_NOT_RECEIVED;
        }
        if (!isWithVip) {
            return CommonRewardState.NORM_NOT_RECEIVED;
        }
        if (isNotReceived) {
            return CommonRewardState.NORM_AVAILABLE;
        }
        return CommonRewardState.NORM_RECEIVED;
    }

    public final List<RewardModel> updateRewardsList(int posByLevel) {
        CommonRewardModel copy;
        CommonRewardModel copy2;
        List<RewardModel> rewardsList = get_uiState().getValue().getRewardsList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(rewardsList, 10));
        int i = 0;
        for (Object obj : rewardsList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            RewardModel rewardModel = (RewardModel) obj;
            if (posByLevel <= i) {
                CommonRewardState updateRewardState = updateRewardState(posByLevel, i, get_uiState().getValue().isActiveVip(), posByLevel == i);
                CommonRewardState updateRewardState2 = updateRewardState(posByLevel, i, get_uiState().getValue().isActiveVip(), posByLevel == i);
                copy = r11.copy((r36 & 1) != 0 ? r11.rewardId : 0, (r36 & 2) != 0 ? r11.rewardName : null, (r36 & 4) != 0 ? r11.rewardDescription : null, (r36 & 8) != 0 ? r11.bottomText : null, (r36 & 16) != 0 ? r11.image : null, (r36 & 32) != 0 ? r11.typeId : 0, (r36 & 64) != 0 ? r11.awardId : 0, (r36 & 128) != 0 ? r11.imageNameFromCdn : null, (r36 & 256) != 0 ? r11.isSuperReward : false, (r36 & 512) != 0 ? r11.isNeedToShowLvl : false, (r36 & 1024) != 0 ? r11.lvl : 0, (r36 & 2048) != 0 ? r11.mainRewardState : updateRewardState, (r36 & 4096) != 0 ? r11.bonusRewardState : null, (r36 & 8192) != 0 ? r11.isCalendarReward : false, (r36 & 16384) != 0 ? r11.isBpOrEventsReward : false, (r36 & 32768) != 0 ? r11.rarityState : null, (r36 & 65536) != 0 ? r11.fromList : 0, (r36 & 131072) != 0 ? rewardModel.getStandardReward().imageModel : null);
                copy2 = r32.copy((r36 & 1) != 0 ? r32.rewardId : 0, (r36 & 2) != 0 ? r32.rewardName : null, (r36 & 4) != 0 ? r32.rewardDescription : null, (r36 & 8) != 0 ? r32.bottomText : null, (r36 & 16) != 0 ? r32.image : null, (r36 & 32) != 0 ? r32.typeId : 0, (r36 & 64) != 0 ? r32.awardId : 0, (r36 & 128) != 0 ? r32.imageNameFromCdn : null, (r36 & 256) != 0 ? r32.isSuperReward : false, (r36 & 512) != 0 ? r32.isNeedToShowLvl : false, (r36 & 1024) != 0 ? r32.lvl : 0, (r36 & 2048) != 0 ? r32.mainRewardState : updateRewardState2, (r36 & 4096) != 0 ? r32.bonusRewardState : null, (r36 & 8192) != 0 ? r32.isCalendarReward : false, (r36 & 16384) != 0 ? r32.isBpOrEventsReward : false, (r36 & 32768) != 0 ? r32.rarityState : null, (r36 & 65536) != 0 ? r32.fromList : 0, (r36 & 131072) != 0 ? rewardModel.getPremiumReward().imageModel : null);
                rewardModel = rewardModel.copy(copy, copy2);
            }
            arrayList.add(rewardModel);
            i = i2;
        }
        return arrayList;
    }

    public final void onButtonBuyPremiumClick() {
        showDialogConfirmation$default(this, null, getStringResource().getString(R.string.black_pass_activate_text_body), getUiState().getValue().getPremiumPriceInt(), null, getStringResource().getString(R.string.common_bc), getStringResource().getString(R.string.common_confirmation), getStringResource().getString(R.string.common_yes), getStringResource().getString(R.string.common_no), 3, 9, null);
    }

    public final void onButtonBuyPremiumDeluxeClick() {
        showDialogConfirmation$default(this, null, getStringResource().getString(R.string.black_pass_activate_text_body), getUiState().getValue().getPremiumDeluxePriceInt(), null, getStringResource().getString(R.string.common_bc), getStringResource().getString(R.string.common_confirmation), getStringResource().getString(R.string.common_yes), getStringResource().getString(R.string.common_no), 4, 9, null);
    }
}
