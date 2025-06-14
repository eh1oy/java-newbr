package com.blackhub.bronline.game.gui.holidayevents;

import android.app.Application;
import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.extension.FloatExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.attachment.ImageModel;
import com.blackhub.bronline.game.core.utils.attachment.main.CommonButtonCategory;
import com.blackhub.bronline.game.core.utils.attachment.rating.CommonRatingModel;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskModel;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.holidayevents.model.HolidayEventsGainBlockData;
import com.blackhub.bronline.game.gui.holidayevents.model.HolidayEventsGameItemModel;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsResponse;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsEventLevel;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsLimitUpgrades;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsMiniGames;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsResponse;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: HolidayEventsViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ \u0010\u0014\u001a\u0004\u0018\u00010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J \u0010\u001b\u001a\u00020\u001c2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00172\u0006\u0010\u001f\u001a\u00020\u001cH\u0002JM\u0010 \u001a\u0004\u0018\u00010\u00152\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00172\u0006\u0010\"\u001a\u00020\u001c2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001c2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0002\u0010%J:\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00172\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0017J\u0006\u00102\u001a\u00020'J\u000e\u00103\u001a\u00020'2\u0006\u00104\u001a\u000205J\u0006\u00106\u001a\u00020'J\u0006\u00107\u001a\u00020'J\u0006\u00108\u001a\u00020'J\u000e\u00109\u001a\u00020'2\u0006\u0010:\u001a\u00020;J\u0006\u0010<\u001a\u00020'J\u0010\u0010=\u001a\u00020'2\b\b\u0002\u0010>\u001a\u00020\u001aJ\u0006\u0010?\u001a\u00020'J\u0006\u0010@\u001a\u00020'J\u0006\u0010A\u001a\u00020'J\u0006\u0010B\u001a\u00020'J\u000e\u0010C\u001a\u00020'2\u0006\u0010D\u001a\u00020\u001aJ\u000e\u0010E\u001a\u00020'2\u0006\u0010F\u001a\u00020GJ\u0018\u0010H\u001a\u00020'2\u0006\u0010I\u001a\u00020\u001c2\b\u0010J\u001a\u0004\u0018\u00010\u0015J\u0006\u0010K\u001a\u00020'J\u0006\u0010L\u001a\u00020'J\u0006\u0010M\u001a\u00020'J\u000e\u0010N\u001a\u00020'2\u0006\u0010O\u001a\u00020PJ\u0006\u0010Q\u001a\u00020'J\u0006\u0010R\u001a\u00020'J\u000e\u0010S\u001a\u00020'2\u0006\u0010T\u001a\u00020UJ\u000e\u0010V\u001a\u00020'2\u0006\u0010W\u001a\u00020\u0018JJ\u0010X\u001a\u00020Y2\u000e\b\u0002\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0\u00172\b\b\u0002\u0010\\\u001a\u00020\u001c2\b\b\u0002\u0010]\u001a\u00020\u001c2\b\b\u0002\u0010^\u001a\u00020\u001c2\b\b\u0002\u0010_\u001a\u00020\u001a2\b\b\u0002\u0010`\u001a\u00020\u001aH\u0002J\u001c\u0010a\u001a\b\u0012\u0004\u0012\u00020G0\u00172\f\u0010b\u001a\b\u0012\u0004\u0012\u00020c0\u0017H\u0002J\u000e\u0010d\u001a\u00020'2\u0006\u0010(\u001a\u00020)R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006e"}, d2 = {"Lcom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/holidayevents/HolidayEventsUiState;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/holidayevents/HolidayEventsActionsWithJSON;", "stringResource", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "application", "Landroid/app/Application;", "(Lcom/blackhub/bronline/game/gui/holidayevents/HolidayEventsActionsWithJSON;Lcom/blackhub/bronline/game/core/resources/StringResource;Landroid/app/Application;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getStringResource", "()Lcom/blackhub/bronline/game/core/resources/StringResource;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "getCategoryImage", "Landroid/graphics/Bitmap;", "objectImages", "", "", "isSpecial", "", "getMaxProgressOfProgressBar", "", "eventLevels", "Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsEventLevel;", "nextRewardLevel", "getTreeImage", "objectGrades", "rewardLevel", "oldRewardLevel", "treeImage", "(Ljava/util/List;ILjava/lang/Integer;Ljava/util/List;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "initJson", "", "jsonObject", "Lorg/json/JSONObject;", "holidayEventsJson", "Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsResponse;", "awardsJson", "Lcom/blackhub/bronline/game/model/remote/response/bprewards/BpRewardsResponse;", "skinsList", "Lcom/blackhub/bronline/game/model/remote/response/skins/SkinsDTO;", "vehiclesList", "Lcom/blackhub/bronline/game/model/remote/response/vehicles/VehiclesDTO;", "onButtonBpOfferClick", "onButtonChooseScreenClick", "button", "Lcom/blackhub/bronline/game/core/utils/attachment/main/CommonButtonCategory;", "onButtonGainLvlUp", "onBuyDarkEnergyClick", "onCancelGameSearch", "onCategoryTaskClick", "categoryId", "", "onClickGoToPurchaseBc", "onClickPlusButton", "isNeedToShowLastChance", "onCloseClick", "onCloseDialogBuyCurrency", "onCloseDialogNotEnoughBc", "onCloseTutorialClick", "onExpandButtonClick", "isTopClicked", "onGameClick", "gameItem", "Lcom/blackhub/bronline/game/gui/holidayevents/model/HolidayEventsGameItemModel;", "onItemClick", FirebaseAnalytics.Param.INDEX, "bitmap", "onLastChanceClick", "onPlayClick", "onPreviewDialogButtonClick", "onRatingItemClick", "item", "Lcom/blackhub/bronline/game/core/utils/attachment/rating/CommonRatingModel;", "onRefreshRatingClick", "onShowTutorialClick", "onTaskClick", "task", "Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskModel;", "onTextEnteredInBuyDialog", "textValue", "parseGainBlockDataFromJSON", "Lcom/blackhub/bronline/game/gui/holidayevents/model/HolidayEventsGainBlockData;", "limitUpgrades", "Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsLimitUpgrades;", "currentGainLevel", "bpLimit", "bpMultiplier", "isWithPremium", "isUpdate", "parseListOfGames", "miniGames", "Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsMiniGames;", "updateJson", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHolidayEventsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1302:1\n230#2,5:1303\n230#2,5:1308\n230#2,5:1313\n230#2,5:1318\n230#2,5:1324\n230#2,5:1329\n230#2,5:1334\n230#2,5:1339\n230#2,5:1344\n1#3:1323\n1549#4:1349\n1620#4,3:1350\n*S KotlinDebug\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel\n*L\n824#1:1303,5\n934#1:1308,5\n957#1:1313,5\n989#1:1318,5\n1040#1:1324,5\n1078#1:1329,5\n1106#1:1334,5\n1114#1:1339,5\n1128#1:1344,5\n1144#1:1349\n1144#1:1350,3\n*E\n"})
/* loaded from: classes3.dex */
public final class HolidayEventsViewModel extends BaseViewModel<HolidayEventsUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<HolidayEventsUiState> _uiState;

    @NotNull
    public final HolidayEventsActionsWithJSON actionWithJSON;

    @NotNull
    public final Application application;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<HolidayEventsUiState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Inject
    public HolidayEventsViewModel(@NotNull HolidayEventsActionsWithJSON actionWithJSON, @NotNull StringResource stringResource, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        Intrinsics.checkNotNullParameter(application, "application");
        this.actionWithJSON = actionWithJSON;
        this.stringResource = stringResource;
        this.application = application;
        this._uiState = StateFlowKt.MutableStateFlow(new HolidayEventsUiState(null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -1, 1073741823, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends HolidayEventsUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<HolidayEventsUiState> getUiState() {
        return this.uiState;
    }

    public final void initJson(@NotNull JSONObject jsonObject, @NotNull HolidayEventsResponse holidayEventsJson, @NotNull BpRewardsResponse awardsJson, @NotNull List<SkinsDTO> skinsList, @NotNull List<VehiclesDTO> vehiclesList) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(holidayEventsJson, "holidayEventsJson");
        Intrinsics.checkNotNullParameter(awardsJson, "awardsJson");
        Intrinsics.checkNotNullParameter(skinsList, "skinsList");
        Intrinsics.checkNotNullParameter(vehiclesList, "vehiclesList");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new HolidayEventsViewModel$initJson$1(jsonObject, holidayEventsJson, this, awardsJson, vehiclesList, skinsList, null), 1, null);
    }

    public final void updateJson(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new HolidayEventsViewModel$updateJson$1(jsonObject, this, null), 1, null);
    }

    public final void onRatingItemClick(@NotNull CommonRatingModel item) {
        HolidayEventsUiState value;
        Intrinsics.checkNotNullParameter(item, "item");
        ImageModel rewardImageModel = item.getRewardImageModel();
        String name = rewardImageModel != null ? rewardImageModel.getName() : null;
        if (name == null) {
            name = "";
        }
        String str = name;
        ImageModel rewardImageModel2 = item.getRewardImageModel();
        if (rewardImageModel2 == null) {
            rewardImageModel2 = new ImageModel(0, null, null, null, null, 31, null);
        }
        CommonRewardModel commonRewardModel = new CommonRewardModel(0, str, null, null, item.getImageBitmap(), 0, 0, null, false, false, 0, null, null, false, false, null, 0, rewardImageModel2, 131053, null);
        MutableStateFlow<? extends HolidayEventsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, HolidayEventsUiState.m6942copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, commonRewardModel, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, true, false, false, -1, 939524063, null)));
    }

    public final void onCancelGameSearch() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new HolidayEventsViewModel$onCancelGameSearch$1(this, null), 1, null);
    }

    public final void onButtonBpOfferClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new HolidayEventsViewModel$onButtonBpOfferClick$1(this, null), 1, null);
    }

    public final void onBuyDarkEnergyClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new HolidayEventsViewModel$onBuyDarkEnergyClick$1(this, null), 1, null);
    }

    public final void onTextEnteredInBuyDialog(@NotNull String textValue) {
        Intrinsics.checkNotNullParameter(textValue, "textValue");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new HolidayEventsViewModel$onTextEnteredInBuyDialog$1(textValue, this, null), 1, null);
    }

    public final void onExpandButtonClick(boolean isTopClicked) {
        HolidayEventsUiState value;
        MutableStateFlow<? extends HolidayEventsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, HolidayEventsUiState.m6942copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, isTopClicked, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -1048577, 1073741823, null)));
    }

    public static /* synthetic */ void onClickPlusButton$default(HolidayEventsViewModel holidayEventsViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = holidayEventsViewModel.getUiState().getValue().isNeedToShowLastChance();
        }
        holidayEventsViewModel.onClickPlusButton(z);
    }

    public final void onClickPlusButton(boolean isNeedToShowLastChance) {
        Useful useful = Useful.INSTANCE;
        AnnotatedString annotatedString = ComposeExtensionKt.toAnnotatedString(useful.getTextWithHtmlStyles(getStringResource().getString(R.string.holiday_events_you_spend, Integer.valueOf(getUiState().getValue().getOfferCost()))));
        AnnotatedString annotatedString2 = ComposeExtensionKt.toAnnotatedString(useful.getTextWithHtmlStyles(getStringResource().getString(R.string.holiday_events_you_get, Integer.valueOf(getUiState().getValue().getOfferValue()))));
        MutableStateFlow<? extends HolidayEventsUiState> mutableStateFlow = get_uiState();
        while (true) {
            HolidayEventsUiState value = mutableStateFlow.getValue();
            MutableStateFlow<? extends HolidayEventsUiState> mutableStateFlow2 = mutableStateFlow;
            if (mutableStateFlow2.compareAndSet(value, HolidayEventsUiState.m6942copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, "1", annotatedString, annotatedString2, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, isNeedToShowLastChance, false, false, false, false, false, false, false, true, false, -1879048193, 804257791, null))) {
                return;
            } else {
                mutableStateFlow = mutableStateFlow2;
            }
        }
    }

    public final void onButtonChooseScreenClick(@NotNull CommonButtonCategory button) {
        Intrinsics.checkNotNullParameter(button, "button");
        ViewModelExtensionKt.launchOnIO$default(this, null, new HolidayEventsViewModel$onButtonChooseScreenClick$1(button, this, null), 1, null);
    }

    public final void onCloseDialogBuyCurrency() {
        HolidayEventsUiState value;
        MutableStateFlow<? extends HolidayEventsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, HolidayEventsUiState.m6942copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -1, 805306367, null)));
    }

    public final void onCloseClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new HolidayEventsViewModel$onCloseClick$1(this, null), 1, null);
    }

    public final void onGameClick(@NotNull HolidayEventsGameItemModel gameItem) {
        Intrinsics.checkNotNullParameter(gameItem, "gameItem");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new HolidayEventsViewModel$onGameClick$1(this, gameItem, null), 1, null);
    }

    public final void onPlayClick() {
        Object obj;
        Iterator<T> it = getUiState().getValue().getListOfGames().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((HolidayEventsGameItemModel) obj).isSelected()) {
                    break;
                }
            }
        }
        HolidayEventsGameItemModel holidayEventsGameItemModel = (HolidayEventsGameItemModel) obj;
        Integer valueOf = holidayEventsGameItemModel != null ? Integer.valueOf(holidayEventsGameItemModel.getId()) : null;
        if (valueOf != null) {
            ViewModelExtensionKt.launchOnIO$default(this, null, new HolidayEventsViewModel$onPlayClick$1(this, valueOf, null), 1, null);
        }
    }

    public final void onCategoryTaskClick(byte categoryId) {
        HolidayEventsUiState value;
        MutableStateFlow<? extends HolidayEventsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, HolidayEventsUiState.m6942copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, categoryId, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -16385, 1073741823, null)));
    }

    public final void onTaskClick(@NotNull CommonTaskModel task) {
        Intrinsics.checkNotNullParameter(task, "task");
        ViewModelExtensionKt.launchOnIO$default(this, null, new HolidayEventsViewModel$onTaskClick$1(task, this, null), 1, null);
    }

    public final void onRefreshRatingClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new HolidayEventsViewModel$onRefreshRatingClick$1(this, null), 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0019, code lost:
    
        r0 = r1.copy((r36 & 1) != 0 ? r1.rewardId : 0, (r36 & 2) != 0 ? r1.rewardName : null, (r36 & 4) != 0 ? r1.rewardDescription : null, (r36 & 8) != 0 ? r1.bottomText : null, (r36 & 16) != 0 ? r1.image : r94, (r36 & 32) != 0 ? r1.typeId : 0, (r36 & 64) != 0 ? r1.awardId : 0, (r36 & 128) != 0 ? r1.imageNameFromCdn : null, (r36 & 256) != 0 ? r1.isSuperReward : false, (r36 & 512) != 0 ? r1.isNeedToShowLvl : false, (r36 & 1024) != 0 ? r1.lvl : 0, (r36 & 2048) != 0 ? r1.mainRewardState : null, (r36 & 4096) != 0 ? r1.bonusRewardState : null, (r36 & 8192) != 0 ? r1.isCalendarReward : false, (r36 & 16384) != 0 ? r1.isBpOrEventsReward : false, (r36 & 32768) != 0 ? r1.rarityState : null, (r36 & 65536) != 0 ? r1.fromList : 0, (r36 & 131072) != 0 ? r1.imageModel : null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onItemClick(int r93, @org.jetbrains.annotations.Nullable android.graphics.Bitmap r94) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel.onItemClick(int, android.graphics.Bitmap):void");
    }

    public final void onPreviewDialogButtonClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new HolidayEventsViewModel$onPreviewDialogButtonClick$1(this, null), 1, null);
    }

    public final void onButtonGainLvlUp() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new HolidayEventsViewModel$onButtonGainLvlUp$1(this, null), 1, null);
    }

    public final void onShowTutorialClick() {
        HolidayEventsUiState value;
        MutableStateFlow<? extends HolidayEventsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, HolidayEventsUiState.m6942copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, true, false, false, false, -1, 1006632959, null)));
    }

    public final void onCloseTutorialClick() {
        HolidayEventsUiState value;
        MutableStateFlow<? extends HolidayEventsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, HolidayEventsUiState.m6942copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -1, 1006632959, null)));
    }

    public final void onClickGoToPurchaseBc() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new HolidayEventsViewModel$onClickGoToPurchaseBc$1(this, null), 1, null);
    }

    public final void onCloseDialogNotEnoughBc() {
        HolidayEventsUiState value;
        MutableStateFlow<? extends HolidayEventsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, HolidayEventsUiState.m6942copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -1, 1056964607, null)));
    }

    public final void onLastChanceClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new HolidayEventsViewModel$onLastChanceClick$1(this, null), 1, null);
    }

    public final List<HolidayEventsGameItemModel> parseListOfGames(List<HolidayEventsMiniGames> miniGames) {
        List<HolidayEventsMiniGames> list = miniGames;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (HolidayEventsMiniGames holidayEventsMiniGames : list) {
            arrayList.add(new HolidayEventsGameItemModel(holidayEventsMiniGames.getId(), holidayEventsMiniGames.getId() == 1, IntExtensionKt.isOne(holidayEventsMiniGames.getPlayable()), holidayEventsMiniGames.getName(), BitmapUtilsKt.getBitmapFromZip$default(this.application, holidayEventsMiniGames.getImageName(), ImageTypePathInCDNEnum.IMAGE, 0.0f, 0.0f, 24, null)));
        }
        List<HolidayEventsGameItemModel> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        while (mutableList.size() < 4) {
            mutableList.add(new HolidayEventsGameItemModel(0, false, false, null, null, 31, null));
        }
        return mutableList;
    }

    public static /* synthetic */ HolidayEventsGainBlockData parseGainBlockDataFromJSON$default(HolidayEventsViewModel holidayEventsViewModel, List list, int i, int i2, int i3, boolean z, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = holidayEventsViewModel.getUiState().getValue().getLimitUpgrades();
        }
        if ((i4 & 2) != 0) {
            i = holidayEventsViewModel.getUiState().getValue().getGainLevel();
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = holidayEventsViewModel.getUiState().getValue().getBpDailyLimit();
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = holidayEventsViewModel.getUiState().getValue().getBpDailyMultiplier();
        }
        int i7 = i3;
        if ((i4 & 16) != 0) {
            z = holidayEventsViewModel.getUiState().getValue().isWithPremium();
        }
        boolean z3 = z;
        if ((i4 & 32) != 0) {
            z2 = false;
        }
        return holidayEventsViewModel.parseGainBlockDataFromJSON(list, i5, i6, i7, z3, z2);
    }

    public final HolidayEventsGainBlockData parseGainBlockDataFromJSON(List<HolidayEventsLimitUpgrades> limitUpgrades, int currentGainLevel, int bpLimit, int bpMultiplier, boolean isWithPremium, boolean isUpdate) {
        Object obj;
        Object obj2;
        int orZero;
        int orZero2;
        int i = currentGainLevel + 1;
        HolidayEventsGainBlockData holidayEventsGainBlockData = getUiState().getValue().getHolidayEventsGainBlockData();
        List<HolidayEventsLimitUpgrades> list = limitUpgrades;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((HolidayEventsLimitUpgrades) obj).getId() == currentGainLevel) {
                break;
            }
        }
        HolidayEventsLimitUpgrades holidayEventsLimitUpgrades = (HolidayEventsLimitUpgrades) obj;
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((HolidayEventsLimitUpgrades) obj2).getId() == i) {
                break;
            }
        }
        HolidayEventsLimitUpgrades holidayEventsLimitUpgrades2 = (HolidayEventsLimitUpgrades) obj2;
        if (isWithPremium) {
            orZero = IntExtensionKt.getOrZero(holidayEventsLimitUpgrades != null ? Integer.valueOf(holidayEventsLimitUpgrades.getLimitEventRes()) : null) + bpLimit;
        } else {
            orZero = IntExtensionKt.getOrZero(holidayEventsLimitUpgrades != null ? Integer.valueOf(holidayEventsLimitUpgrades.getLimitEventRes()) : null);
        }
        if (isWithPremium) {
            orZero2 = IntExtensionKt.getOrZero(holidayEventsLimitUpgrades2 != null ? Integer.valueOf(holidayEventsLimitUpgrades2.getLimitEventRes()) : null) + bpLimit;
        } else {
            orZero2 = IntExtensionKt.getOrZero(holidayEventsLimitUpgrades2 != null ? Integer.valueOf(holidayEventsLimitUpgrades2.getLimitEventRes()) : null);
        }
        float orZero3 = FloatExtensionKt.getOrZero(holidayEventsLimitUpgrades != null ? Float.valueOf(holidayEventsLimitUpgrades.getMultEventRes()) : null) + (isWithPremium ? bpMultiplier : 0.0f);
        float orZero4 = FloatExtensionKt.getOrZero(holidayEventsLimitUpgrades2 != null ? Float.valueOf(holidayEventsLimitUpgrades2.getMultEventRes()) : null);
        float f = isWithPremium ? bpMultiplier : 0.0f;
        String replace$default = StringsKt__StringsJVMKt.replace$default(getStringResource().getString(R.string.holiday_events_x, Float.valueOf(orZero3)), ',', '.', false, 4, (Object) null);
        String replace$default2 = StringsKt__StringsJVMKt.replace$default(getStringResource().getString(R.string.holiday_events_x, Float.valueOf(orZero4 + f)), ',', '.', false, 4, (Object) null);
        String string = getStringResource().getString(R.string.common_value_of_rubles_string, UsefulKt.getPriceWithSpaces(Integer.valueOf(IntExtensionKt.getOrZero(holidayEventsLimitUpgrades2 != null ? holidayEventsLimitUpgrades2.getCostSoft() : null))));
        int orZero5 = IntExtensionKt.getOrZero(holidayEventsLimitUpgrades2 != null ? holidayEventsLimitUpgrades2.getEventResGift() : null);
        if (!isUpdate) {
            return holidayEventsGainBlockData.copy(String.valueOf(orZero), replace$default, String.valueOf(orZero2), replace$default2, string, orZero5);
        }
        return holidayEventsGainBlockData.copy(String.valueOf(orZero), replace$default, String.valueOf(orZero2), replace$default2, string, orZero5);
    }

    public final Bitmap getCategoryImage(List<String> objectImages, boolean isSpecial) {
        String str;
        if (isSpecial) {
            str = (String) CollectionsKt___CollectionsKt.lastOrNull((List) objectImages);
        } else {
            str = (String) CollectionsKt___CollectionsKt.firstOrNull((List) objectImages);
        }
        if (str == null) {
            str = "";
        }
        return BitmapUtilsKt.getBitmapFromZip$default(this.application, str, ImageTypePathInCDNEnum.IMAGE, 0.0f, 0.0f, 24, null);
    }

    public final Bitmap getTreeImage(List<Integer> objectGrades, int rewardLevel, Integer oldRewardLevel, List<String> objectImages, Bitmap treeImage) {
        int i = 1;
        int orOne = IntExtensionKt.getOrOne(objectGrades != null ? (Integer) CollectionsKt___CollectionsKt.getOrNull(objectGrades, 1) : null);
        int orOne2 = IntExtensionKt.getOrOne(objectGrades != null ? (Integer) CollectionsKt___CollectionsKt.getOrNull(objectGrades, 2) : null);
        int i2 = (orOne > rewardLevel || rewardLevel >= orOne2) ? rewardLevel >= orOne2 ? 2 : 0 : 1;
        if (oldRewardLevel == null) {
            i = -1;
        } else if (!RangesKt___RangesKt.until(orOne, orOne2).contains(oldRewardLevel.intValue())) {
            i = oldRewardLevel.intValue() >= orOne2 ? 2 : 0;
        }
        if (i2 <= i) {
            return treeImage;
        }
        String str = (String) CollectionsKt___CollectionsKt.getOrNull(objectImages, i2);
        if (str == null) {
            str = "";
        }
        return BitmapUtilsKt.getBitmapFromZip$default(this.application, str, ImageTypePathInCDNEnum.IMAGE, 0.0f, 0.0f, 24, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ int getMaxProgressOfProgressBar$default(HolidayEventsViewModel holidayEventsViewModel, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = holidayEventsViewModel.getUiState().getValue().getEventLevels();
        }
        return holidayEventsViewModel.getMaxProgressOfProgressBar(list, i);
    }

    public final int getMaxProgressOfProgressBar(List<HolidayEventsEventLevel> eventLevels, int nextRewardLevel) {
        Object obj;
        Iterator<T> it = eventLevels.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((HolidayEventsEventLevel) obj).getId() == nextRewardLevel) {
                break;
            }
        }
        HolidayEventsEventLevel holidayEventsEventLevel = (HolidayEventsEventLevel) obj;
        if (holidayEventsEventLevel != null) {
            return holidayEventsEventLevel.getCost();
        }
        HolidayEventsEventLevel holidayEventsEventLevel2 = (HolidayEventsEventLevel) CollectionsKt___CollectionsKt.lastOrNull((List) eventLevels);
        return IntExtensionKt.getOrOne(holidayEventsEventLevel2 != null ? Integer.valueOf(holidayEventsEventLevel2.getCost()) : null);
    }
}
