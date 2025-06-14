package com.blackhub.bronline.game.gui.bprewards;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.extension.FloatExtensionKt;
import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.BitmapResource;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsServerItemModel;
import com.blackhub.bronline.game.gui.craft.model.response.CraftJsonItemCategoryFilter;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: BpRewardsViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0!H\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001bH\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020&H\u0002J\\\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u001e2\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u001e2\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001e2\f\u00104\u001a\b\u0012\u0004\u0012\u0002050\u001e2\u0006\u00106\u001a\u00020\u001b2\f\u00107\u001a\b\u0012\u0004\u0012\u0002080\u001eJ\u0006\u00109\u001a\u00020+J\u0006\u0010:\u001a\u00020+J/\u0010;\u001a\u00020+2\u0006\u0010<\u001a\u00020\u001b2\u0006\u0010=\u001a\u00020\u001b2\b\u0010>\u001a\u0004\u0018\u00010#2\b\u0010?\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010@J\u0006\u0010A\u001a\u00020+J\u000e\u0010B\u001a\u00020+2\u0006\u0010C\u001a\u00020\u001bJ\u0016\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001b0!2\u0006\u0010,\u001a\u00020-H\u0002Jj\u0010E\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u001e2\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u0002010\u001e2\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001e2\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u0002050\u001e2\b\b\u0002\u00106\u001a\u00020\u001b2\b\b\u0002\u0010F\u001a\u00020(H\u0082@¢\u0006\u0002\u0010GJ$\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010<\u001a\u00020\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u0016\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010<\u001a\u00020\u001bH\u0002J\u0006\u0010J\u001a\u00020+J\u0006\u0010K\u001a\u00020+J\u0006\u0010L\u001a\u00020+J\u000e\u0010M\u001a\u00020+2\u0006\u0010N\u001a\u00020#J\u000e\u0010O\u001a\u00020+2\u0006\u0010P\u001a\u00020(J\u000e\u0010Q\u001a\u00020+2\u0006\u0010,\u001a\u00020-R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u0006X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006R"}, d2 = {"Lcom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/bprewards/BpRewardsUiState;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/bprewards/BpRewardsActionWithJSON;", "stringResource", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "application", "Landroid/app/Application;", "bitmapResource", "Lcom/blackhub/bronline/game/core/resources/BitmapResource;", "(Lcom/blackhub/bronline/game/gui/bprewards/BpRewardsActionWithJSON;Lcom/blackhub/bronline/game/core/resources/StringResource;Lcom/blackhub/bronline/game/common/LocalNotification;Landroid/app/Application;Lcom/blackhub/bronline/game/core/resources/BitmapResource;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getLocalNotification", "()Lcom/blackhub/bronline/game/common/LocalNotification;", "getStringResource", "()Lcom/blackhub/bronline/game/core/resources/StringResource;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "calculateDaysLeft", "", "timeFromServer", "fillListUntilNine", "", "Lcom/blackhub/bronline/game/gui/bprewards/model/BpRewardsServerItemModel;", IFramePlayerOptions.Builder.LIST, "", "getDaysTextInItem", "", "days", "getTitleText", "Landroidx/compose/ui/text/AnnotatedString;", "isBpRewardsScreen", "", "getTutorialOpenCasesText", "initJson", "", "json", "Lorg/json/JSONObject;", "listOfAwardsTypes", "Lcom/blackhub/bronline/game/model/remote/response/bprewards/BpRewardsAwardsDto;", "invItemsFromJson", "Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", "vehiclesList", "Lcom/blackhub/bronline/game/model/remote/response/vehicles/VehiclesDTO;", "skinsList", "Lcom/blackhub/bronline/game/model/remote/response/skins/SkinsDTO;", "sizeOfImage", "marketDeliveryFilters", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftJsonItemCategoryFilter;", "onDialogButtonNoClick", "onDialogButtonYesClick", "onItemClick", "id", "typeOfClickedButton", "itemNameForDialog", "sprayPriceForDialog", "(IILjava/lang/String;Ljava/lang/Integer;)V", "onItemsRequested", "onStartFilterButtonPressed", "filterState", "parseAlarmsForFilterButtons", "parseJsonAndGetListOfItems", "isUpdateList", "(Lorg/json/JSONObject;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeAlarmFromItem", "removeItemFromList", "sendButtonCasesPressed", "sendCloseScreen", "sendUpdateTanpin", "showErrorMessage", ThrowableDeserializer.PROP_NAME_MESSAGE, "showTutorial", "isNeedShowTutorial", "updateJson", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBpRewardsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 4 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,736:1\n230#2,5:737\n230#2,5:742\n230#2,5:775\n51#3,5:747\n56#3,11:761\n8#4,9:752\n1855#5,2:772\n1549#5:780\n1620#5,3:781\n819#5:784\n847#5,2:785\n1#6:774\n*S KotlinDebug\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel\n*L\n401#1:737,5\n419#1:742,5\n643#1:775,5\n447#1:747,5\n447#1:761,11\n447#1:752,9\n451#1:772,2\n658#1:780\n658#1:781,3\n684#1:784\n684#1:785,2\n*E\n"})
/* loaded from: classes3.dex */
public final class BpRewardsViewModel extends BaseViewModel<BpRewardsUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<BpRewardsUiState> _uiState;

    @NotNull
    public final BpRewardsActionWithJSON actionWithJSON;

    @NotNull
    public final Application application;

    @NotNull
    public final BitmapResource bitmapResource;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<BpRewardsUiState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Inject
    public BpRewardsViewModel(@NotNull BpRewardsActionWithJSON actionWithJSON, @NotNull StringResource stringResource, @NotNull LocalNotification localNotification, @NotNull Application application, @NotNull BitmapResource bitmapResource) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(bitmapResource, "bitmapResource");
        this.actionWithJSON = actionWithJSON;
        this.stringResource = stringResource;
        this.localNotification = localNotification;
        this.application = application;
        this.bitmapResource = bitmapResource;
        this._uiState = StateFlowKt.MutableStateFlow(new BpRewardsUiState(false, null, null, null, null, null, null, 0, false, false, null, 0, null, null, 0, false, false, false, false, false, 1048575, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends BpRewardsUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<BpRewardsUiState> getUiState() {
        return this.uiState;
    }

    public final void initJson(@NotNull JSONObject json, @NotNull List<BpRewardsAwardsDto> listOfAwardsTypes, @NotNull List<InvItems> invItemsFromJson, @NotNull List<VehiclesDTO> vehiclesList, @NotNull List<SkinsDTO> skinsList, int sizeOfImage, @NotNull List<CraftJsonItemCategoryFilter> marketDeliveryFilters) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(listOfAwardsTypes, "listOfAwardsTypes");
        Intrinsics.checkNotNullParameter(invItemsFromJson, "invItemsFromJson");
        Intrinsics.checkNotNullParameter(vehiclesList, "vehiclesList");
        Intrinsics.checkNotNullParameter(skinsList, "skinsList");
        Intrinsics.checkNotNullParameter(marketDeliveryFilters, "marketDeliveryFilters");
        ViewModelExtensionKt.launchOnIO$default(this, null, new BpRewardsViewModel$initJson$1(json, this, marketDeliveryFilters, listOfAwardsTypes, invItemsFromJson, vehiclesList, skinsList, sizeOfImage, null), 1, null);
    }

    public final void updateJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new BpRewardsViewModel$updateJson$1(json, this, null), 1, null);
    }

    public final void onItemClick(int id, int typeOfClickedButton, @Nullable String itemNameForDialog, @Nullable Integer sprayPriceForDialog) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new BpRewardsViewModel$onItemClick$1(itemNameForDialog, typeOfClickedButton, this, id, sprayPriceForDialog, null), 1, null);
    }

    public final void onItemsRequested() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new BpRewardsViewModel$onItemsRequested$1(this, null), 1, null);
    }

    public final void onStartFilterButtonPressed(int filterState) {
        if (filterState != get_uiState().getValue().getFilterState()) {
            ViewModelExtensionKt.launchOnIO$default(this, null, new BpRewardsViewModel$onStartFilterButtonPressed$1(this, filterState, null), 1, null);
        }
    }

    public final void onDialogButtonYesClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new BpRewardsViewModel$onDialogButtonYesClick$1(this, null), 1, null);
    }

    public final void onDialogButtonNoClick() {
        BpRewardsUiState value;
        BpRewardsUiState copy;
        MutableStateFlow<? extends BpRewardsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r38 & 1) != 0 ? r2.isBpRewardsScreen : false, (r38 & 2) != 0 ? r2.annotatedText : null, (r38 & 4) != 0 ? r2.bpRewardsLists : null, (r38 & 8) != 0 ? r2.imagesForFilterList : null, (r38 & 16) != 0 ? r2.topHintList : null, (r38 & 32) != 0 ? r2.bottomHintList : null, (r38 & 64) != 0 ? r2.refreshButtonBitmap : null, (r38 & 128) != 0 ? r2.sizeOfImage : 0, (r38 & 256) != 0 ? r2.isNeedToShowDialog : false, (r38 & 512) != 0 ? r2.isSprayForDialog : false, (r38 & 1024) != 0 ? r2.rewardNameForDialog : null, (r38 & 2048) != 0 ? r2.idForDialog : 0, (r38 & 4096) != 0 ? r2.sprayPriceForDialog : null, (r38 & 8192) != 0 ? r2.sprayTextForDialog : null, (r38 & 16384) != 0 ? r2.filterState : 0, (r38 & 32768) != 0 ? r2.isHasTanpin : false, (r38 & 65536) != 0 ? r2.isTutorialEnabled : false, (r38 & 131072) != 0 ? r2.isButtonFilterBlocked : false, (r38 & 262144) != 0 ? r2.isScreenBlocked : false, (r38 & 524288) != 0 ? value.isNeedClose : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void sendButtonCasesPressed() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new BpRewardsViewModel$sendButtonCasesPressed$1(this, null), 1, null);
    }

    public final void sendUpdateTanpin() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new BpRewardsViewModel$sendUpdateTanpin$1(this, null), 1, null);
    }

    public final void showTutorial(boolean isNeedShowTutorial) {
        BpRewardsUiState value;
        BpRewardsUiState copy;
        MutableStateFlow<? extends BpRewardsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r38 & 1) != 0 ? r2.isBpRewardsScreen : false, (r38 & 2) != 0 ? r2.annotatedText : null, (r38 & 4) != 0 ? r2.bpRewardsLists : null, (r38 & 8) != 0 ? r2.imagesForFilterList : null, (r38 & 16) != 0 ? r2.topHintList : null, (r38 & 32) != 0 ? r2.bottomHintList : null, (r38 & 64) != 0 ? r2.refreshButtonBitmap : null, (r38 & 128) != 0 ? r2.sizeOfImage : 0, (r38 & 256) != 0 ? r2.isNeedToShowDialog : false, (r38 & 512) != 0 ? r2.isSprayForDialog : false, (r38 & 1024) != 0 ? r2.rewardNameForDialog : null, (r38 & 2048) != 0 ? r2.idForDialog : 0, (r38 & 4096) != 0 ? r2.sprayPriceForDialog : null, (r38 & 8192) != 0 ? r2.sprayTextForDialog : null, (r38 & 16384) != 0 ? r2.filterState : 0, (r38 & 32768) != 0 ? r2.isHasTanpin : false, (r38 & 65536) != 0 ? r2.isTutorialEnabled : isNeedShowTutorial, (r38 & 131072) != 0 ? r2.isButtonFilterBlocked : false, (r38 & 262144) != 0 ? r2.isScreenBlocked : false, (r38 & 524288) != 0 ? value.isNeedClose : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void sendCloseScreen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new BpRewardsViewModel$sendCloseScreen$1(this, null), 1, null);
    }

    public final void showErrorMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        getLocalNotification().showErrorNotification(message);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x01a5 -> B:30:0x01b0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object parseJsonAndGetListOfItems(org.json.JSONObject r42, java.util.List<com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto> r43, java.util.List<com.blackhub.bronline.game.gui.inventory.data.InvItems> r44, java.util.List<com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO> r45, java.util.List<com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO> r46, int r47, boolean r48, kotlin.coroutines.Continuation<? super kotlin.Unit> r49) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel.parseJsonAndGetListOfItems(org.json.JSONObject, java.util.List, java.util.List, java.util.List, java.util.List, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final List<BpRewardsServerItemModel> removeAlarmFromItem(int id, List<BpRewardsServerItemModel> list) {
        List<BpRewardsServerItemModel> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (BpRewardsServerItemModel bpRewardsServerItemModel : list2) {
            if (bpRewardsServerItemModel.getItemIdOnServer() == id && bpRewardsServerItemModel.isHaveAlarm() > 0) {
                bpRewardsServerItemModel = bpRewardsServerItemModel.copy((r32 & 1) != 0 ? bpRewardsServerItemModel.itemIdOnServer : 0, (r32 & 2) != 0 ? bpRewardsServerItemModel.itemName : null, (r32 & 4) != 0 ? bpRewardsServerItemModel.prizeType : 0, (r32 & 8) != 0 ? bpRewardsServerItemModel.isHaveAlarm : 0, (r32 & 16) != 0 ? bpRewardsServerItemModel.idForImages : null, (r32 & 32) != 0 ? bpRewardsServerItemModel.skinModelId : null, (r32 & 64) != 0 ? bpRewardsServerItemModel.daysLeft : 0, (r32 & 128) != 0 ? bpRewardsServerItemModel.sprayPrice : 0, (r32 & 256) != 0 ? bpRewardsServerItemModel.plateText : null, (r32 & 512) != 0 ? bpRewardsServerItemModel.rarity : 0, (r32 & 1024) != 0 ? bpRewardsServerItemModel.quantity : 0, (r32 & 2048) != 0 ? bpRewardsServerItemModel.isEmptyItem : false, (r32 & 4096) != 0 ? bpRewardsServerItemModel.rewardDays : null, (r32 & 8192) != 0 ? bpRewardsServerItemModel.imageModel : null, (r32 & 16384) != 0 ? bpRewardsServerItemModel.itemNameForPreview : null);
            }
            arrayList.add(bpRewardsServerItemModel);
        }
        return arrayList;
    }

    public final List<Integer> parseAlarmsForFilterButtons(JSONObject json) {
        JSONArray optJSONArray = json.optJSONArray(BpRewardsKeys.LIST_OF_ALARMS_FOR_BUTTONS_KEY);
        List mutableList = optJSONArray != null ? JsonArrayExtensionKt.toMutableList(optJSONArray) : null;
        if (mutableList != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(CollectionsKt___CollectionsKt.sumOfInt(mutableList)));
            arrayList.addAll(mutableList);
            return arrayList;
        }
        return get_uiState().getValue().getBpRewardsLists().getListOfAlarmsForButtons();
    }

    public final List<BpRewardsServerItemModel> removeItemFromList(int id) {
        List list = CollectionsKt___CollectionsKt.toList(get_uiState().getValue().getBpRewardsLists().getListWithItems());
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((BpRewardsServerItemModel) obj).getItemIdOnServer() != id) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final String getDaysTextInItem(int days) {
        if (days > 0) {
            return getStringResource().getQuantityString(R.plurals.bp_rewards_days, days);
        }
        return getStringResource().getString(R.string.bp_rewards_unlimited);
    }

    public final int calculateDaysLeft(int timeFromServer) {
        if (timeFromServer == 0) {
            return 0;
        }
        int roundToIntSafely = FloatExtensionKt.roundToIntSafely(timeFromServer / 86400.0f);
        if (roundToIntSafely < 0 || roundToIntSafely >= 1) {
            return roundToIntSafely;
        }
        return 1;
    }

    public final List<BpRewardsServerItemModel> fillListUntilNine(List<BpRewardsServerItemModel> list) {
        while (list.size() < 9) {
            list.add(new BpRewardsServerItemModel(0, null, 0, 0, null, null, 0, 0, null, 0, 0, true, null, null, null, 30719, null));
        }
        return list;
    }

    public final AnnotatedString getTitleText(boolean isBpRewardsScreen) {
        if (isBpRewardsScreen) {
            String upperCase = getStringResource().getString(R.string.bp_rewards_title_text).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return StringExtensionKt.htmlTextToAnnotatedString(upperCase);
        }
        String upperCase2 = getStringResource().getString(R.string.marketplace_delivery_title_text).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        return StringExtensionKt.htmlTextToAnnotatedString(upperCase2);
    }

    public final AnnotatedString getTutorialOpenCasesText() {
        return StringExtensionKt.htmlTextToAnnotatedString(getStringResource().getString(R.string.bp_rewards_tutorial_btn_cases));
    }
}
