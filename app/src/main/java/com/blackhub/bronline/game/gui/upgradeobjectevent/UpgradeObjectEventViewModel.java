package com.blackhub.bronline.game.gui.upgradeobjectevent;

import android.app.Application;
import androidx.annotation.IntRange;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.repository.UpgradeObjectRepository;
import com.blackhub.bronline.launcher.network.Server;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UpgradeObjectEventViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0007\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001DB/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bJ*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002J\u001e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020#2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u001eH\u0002J\u0010\u0010*\u001a\u0004\u0018\u00010!H\u0082@¢\u0006\u0002\u0010+J\u001c\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u001eJ\u000e\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u000201J\u000e\u00102\u001a\u00020\u001b2\u0006\u00100\u001a\u000201J\u000e\u00103\u001a\u00020\u001b2\u0006\u00100\u001a\u000201J\u0010\u00104\u001a\u00020\u001b2\b\b\u0001\u00105\u001a\u00020#J\u0006\u00106\u001a\u00020\u001bJ.\u00107\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u00108\u001a\u0002012\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u001eH\u0082@¢\u0006\u0002\u00109J\u0006\u0010:\u001a\u00020\u001bJ\u0006\u0010;\u001a\u00020\u001bJ\u0010\u0010<\u001a\u00020\u001b2\b\b\u0001\u0010=\u001a\u00020#J\u0010\u0010>\u001a\u00020\u001b2\b\b\u0001\u0010?\u001a\u00020#J\u000e\u0010@\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020&J\u0006\u0010B\u001a\u00020\u001bJ\u000e\u0010C\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventUiState;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventActionWithJSON;", "upgradeObjectRepository", "Lcom/blackhub/bronline/game/repository/UpgradeObjectRepository;", "stringResource", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "application", "Landroid/app/Application;", "(Lcom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventActionWithJSON;Lcom/blackhub/bronline/game/repository/UpgradeObjectRepository;Lcom/blackhub/bronline/game/core/resources/StringResource;Lcom/blackhub/bronline/game/common/LocalNotification;Landroid/app/Application;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getLocalNotification", "()Lcom/blackhub/bronline/game/common/LocalNotification;", "getStringResource", "()Lcom/blackhub/bronline/game/core/resources/StringResource;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "closeInfoScreen", "", "closeTopListOpen", "getAwardsLevelList", "", "Lcom/blackhub/bronline/game/gui/upgradeobjectevent/model/GiftPrizeModel;", "awardsResponse", "Lcom/blackhub/bronline/game/model/remote/response/upgradeobjectevent/UpgradeObjectAwardsResponse;", "upgradeObjectLevel", "", "currentCurrency", "getServerName", "", "serverId", "servers", "Lcom/blackhub/bronline/launcher/network/Server;", "getUpgradeObjectAwardsResponse", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initJson", "json", "Lorg/json/JSONObject;", "isEnergyInfoOpen", "isOpen", "", "isGiftQuestionOpen", "isLevelUpgradeObjectOpen", "onBuyUpgradeClick", "positionUpgrade", "openInfoScreen", "parseJson", "isUpdating", "(Lorg/json/JSONObject;ZLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendCloseScreen", "sendGiftOpen", "sendOpenTypeUpgradeObject", "typeUpgradeObject", "sendTopListOpen", "typeTopList", "showErrorMessage", ThrowableDeserializer.PROP_NAME_MESSAGE, "turnBlockingLoading", "updateJson", "Companion", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUpgradeObjectEventViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpgradeObjectEventViewModel.kt\ncom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 4 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,706:1\n230#2,5:707\n230#2,5:712\n230#2,5:717\n230#2,5:722\n230#2,5:727\n230#2,5:732\n230#2,5:737\n230#2,5:742\n230#2,5:747\n230#2,5:752\n230#2,5:757\n230#2,5:762\n230#2,5:798\n230#2,5:803\n230#2,5:808\n230#2,5:813\n230#2,5:818\n230#2,5:823\n230#2,5:828\n230#2,5:867\n51#3,5:767\n56#3,11:781\n51#3,5:833\n56#3,11:847\n8#4,9:772\n8#4,9:838\n1559#5:792\n1590#5,4:793\n1559#5:858\n1590#5,4:859\n288#5,2:863\n288#5,2:865\n1559#5:872\n1590#5,4:873\n1#6:797\n*S KotlinDebug\n*F\n+ 1 UpgradeObjectEventViewModel.kt\ncom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventViewModel\n*L\n128#1:707,5\n134#1:712,5\n143#1:717,5\n158#1:722,5\n170#1:727,5\n179#1:732,5\n185#1:737,5\n191#1:742,5\n210#1:747,5\n239#1:752,5\n254#1:757,5\n315#1:762,5\n421#1:798,5\n446#1:803,5\n479#1:808,5\n500#1:813,5\n516#1:818,5\n532#1:823,5\n549#1:828,5\n597#1:867,5\n349#1:767,5\n349#1:781,11\n570#1:833,5\n570#1:847,11\n349#1:772,9\n570#1:838,9\n355#1:792\n355#1:793,4\n573#1:858\n573#1:859,4\n590#1:863,2\n593#1:865,2\n642#1:872\n642#1:873,4\n*E\n"})
/* loaded from: classes3.dex */
public final class UpgradeObjectEventViewModel extends BaseViewModel<UpgradeObjectEventUiState> {
    public static final double COEFFICIENT = 1.05d;
    public static final float COEFFICIENT_DAU = 0.5f;
    public static final int COUNT_UPGRADE = 3;
    public static final float HALF_PERCENT = 0.5f;
    public static final int MATH_CONSTANT = 10;
    public static final float ONE_HUNDRED_FLOAT = 100.0f;
    public static final int ONE_HUNDRED_INT = 100;
    public static final int START_EXP = 500;

    @NotNull
    public final MutableStateFlow<UpgradeObjectEventUiState> _uiState;

    @NotNull
    public final UpgradeObjectEventActionWithJSON actionWithJSON;

    @NotNull
    public final Application application;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<UpgradeObjectEventUiState> uiState;

    @NotNull
    public final UpgradeObjectRepository upgradeObjectRepository;
    public static final int $stable = 8;

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
    public UpgradeObjectEventViewModel(@NotNull UpgradeObjectEventActionWithJSON actionWithJSON, @NotNull UpgradeObjectRepository upgradeObjectRepository, @NotNull StringResource stringResource, @NotNull LocalNotification localNotification, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(upgradeObjectRepository, "upgradeObjectRepository");
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        Intrinsics.checkNotNullParameter(application, "application");
        this.actionWithJSON = actionWithJSON;
        this.upgradeObjectRepository = upgradeObjectRepository;
        this.stringResource = stringResource;
        this.localNotification = localNotification;
        this.application = application;
        this._uiState = StateFlowKt.MutableStateFlow(new UpgradeObjectEventUiState(0, null, null, 0, false, null, null, false, false, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, false, false, false, null, 0, 0, null, null, 0, null, null, null, false, false, -1, 511, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends UpgradeObjectEventUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<UpgradeObjectEventUiState> getUiState() {
        return this.uiState;
    }

    public final void initJson(@NotNull JSONObject json, @NotNull List<Server> servers) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(servers, "servers");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new UpgradeObjectEventViewModel$initJson$1(this, json, servers, null), 1, null);
    }

    public final void updateJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new UpgradeObjectEventViewModel$updateJson$1(this, json, null), 1, null);
    }

    public final void sendOpenTypeUpgradeObject(@IntRange(from = 1, to = 2) int typeUpgradeObject) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new UpgradeObjectEventViewModel$sendOpenTypeUpgradeObject$1(this, typeUpgradeObject, null), 1, null);
    }

    public final void isLevelUpgradeObjectOpen(boolean isOpen) {
        UpgradeObjectEventUiState value;
        MutableStateFlow<? extends UpgradeObjectEventUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, UpgradeObjectEventUiState.copy$default(value, 0, null, null, 0, false, null, null, isOpen, false, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, false, false, false, null, 0, 0, null, null, 0, null, null, null, false, false, -129, 511, null)));
    }

    public final void isEnergyInfoOpen(boolean isOpen) {
        UpgradeObjectEventUiState value;
        MutableStateFlow<? extends UpgradeObjectEventUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, UpgradeObjectEventUiState.copy$default(value, 0, null, null, 0, false, null, null, false, false, isOpen, false, false, false, false, false, false, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, false, false, false, null, 0, 0, null, null, 0, null, null, null, false, false, -513, 255, null)));
    }

    public final void onBuyUpgradeClick(@IntRange(from = 1, to = 3) int positionUpgrade) {
        UpgradeObjectEventUiState value;
        MutableStateFlow<? extends UpgradeObjectEventUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, UpgradeObjectEventUiState.copy$default(value, 0, null, null, 0, false, null, null, false, false, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, false, false, false, null, 0, 0, null, null, 0, null, null, null, false, true, -1, 255, null)));
        ViewModelExtensionKt.launchOnDefault$default(this, null, new UpgradeObjectEventViewModel$onBuyUpgradeClick$2(this, positionUpgrade, null), 1, null);
    }

    public final void isGiftQuestionOpen(boolean isOpen) {
        UpgradeObjectEventUiState value;
        MutableStateFlow<? extends UpgradeObjectEventUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, UpgradeObjectEventUiState.copy$default(value, 0, null, null, 0, false, null, null, false, false, false, isOpen, false, false, false, false, false, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, false, false, false, null, 0, 0, null, null, 0, null, null, null, false, false, -1025, 511, null)));
    }

    public final void sendGiftOpen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new UpgradeObjectEventViewModel$sendGiftOpen$1(this, null), 1, null);
    }

    public final void sendTopListOpen(@IntRange(from = 4, to = 5) int typeTopList) {
        UpgradeObjectEventUiState value;
        MutableStateFlow<? extends UpgradeObjectEventUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, UpgradeObjectEventUiState.copy$default(value, 0, null, null, 0, false, null, null, false, false, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, false, false, false, null, 0, 0, null, null, 0, null, null, null, false, true, -1, 255, null)));
        ViewModelExtensionKt.launchOnIO$default(this, null, new UpgradeObjectEventViewModel$sendTopListOpen$2(this, typeTopList, null), 1, null);
    }

    public final void closeTopListOpen() {
        UpgradeObjectEventUiState value;
        MutableStateFlow<? extends UpgradeObjectEventUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, UpgradeObjectEventUiState.copy$default(value, 0, null, null, 0, false, null, null, false, false, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, false, false, false, null, 0, 0, null, null, 0, null, null, null, false, false, -4097, 511, null)));
    }

    public final void openInfoScreen() {
        UpgradeObjectEventUiState value;
        MutableStateFlow<? extends UpgradeObjectEventUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, UpgradeObjectEventUiState.copy$default(value, 0, null, null, 0, false, null, null, false, false, false, false, false, false, false, false, true, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, false, false, false, null, 0, 0, null, null, 0, null, null, null, false, false, -32769, 511, null)));
    }

    public final void closeInfoScreen() {
        UpgradeObjectEventUiState value;
        MutableStateFlow<? extends UpgradeObjectEventUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, UpgradeObjectEventUiState.copy$default(value, 0, null, null, 0, false, null, null, false, false, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, false, false, false, null, 0, 0, null, null, 0, null, null, null, false, false, -32769, 511, null)));
    }

    public final void sendCloseScreen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new UpgradeObjectEventViewModel$sendCloseScreen$1(this, null), 1, null);
    }

    public final void showErrorMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        getLocalNotification().showErrorNotification(message);
    }

    public final void turnBlockingLoading() {
        UpgradeObjectEventUiState value;
        MutableStateFlow<? extends UpgradeObjectEventUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, UpgradeObjectEventUiState.copy$default(value, 0, null, null, 0, false, null, null, false, false, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, false, false, false, null, 0, 0, null, null, 0, null, null, null, false, true, -1, 255, null)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0348, code lost:
    
        if (((com.blackhub.bronline.game.core.utils.attachment.CommonEventTopListModel) r27) == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0319, code lost:
    
        if (((com.blackhub.bronline.game.core.utils.attachment.CommonEventTopListModel) r27) == null) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0208 A[Catch: Exception -> 0x0210, TRY_LEAVE, TryCatch #0 {Exception -> 0x0210, blocks: (B:112:0x01c0, B:114:0x01cd, B:122:0x0208, B:128:0x01f6), top: B:111:0x01c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0212 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x069a A[Catch: Exception -> 0x06a2, TRY_LEAVE, TryCatch #4 {Exception -> 0x06a2, blocks: (B:233:0x0650, B:235:0x065d, B:243:0x069a, B:249:0x0688), top: B:232:0x0650 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x06a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03c7 A[LOOP:3: B:88:0x0356->B:90:0x03c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0ad1 A[EDGE_INSN: B:91:0x0ad1->B:16:0x0ad1 BREAK  A[LOOP:3: B:88:0x0356->B:90:0x03c7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0324  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object parseJson(org.json.JSONObject r66, boolean r67, java.util.List<com.blackhub.bronline.launcher.network.Server> r68, kotlin.coroutines.Continuation<? super kotlin.Unit> r69) {
        /*
            Method dump skipped, instructions count: 2772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel.parseJson(org.json.JSONObject, boolean, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object parseJson$default(UpgradeObjectEventViewModel upgradeObjectEventViewModel, JSONObject jSONObject, boolean z, List list, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            list = upgradeObjectEventViewModel.get_uiState().getValue().getServers();
        }
        return upgradeObjectEventViewModel.parseJson(jSONObject, z, list, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[Catch: Exception -> 0x002a, TRY_LEAVE, TryCatch #0 {Exception -> 0x002a, blocks: (B:10:0x0026, B:11:0x0042, B:13:0x004c, B:24:0x0037), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getUpgradeObjectAwardsResponse(kotlin.coroutines.Continuation<? super com.blackhub.bronline.game.model.remote.response.upgradeobjectevent.UpgradeObjectAwardsResponse> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$getUpgradeObjectAwardsResponse$1
            if (r0 == 0) goto L13
            r0 = r6
            com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$getUpgradeObjectAwardsResponse$1 r0 = (com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$getUpgradeObjectAwardsResponse$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$getUpgradeObjectAwardsResponse$1 r0 = new com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$getUpgradeObjectAwardsResponse$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Exception -> L2a
            goto L42
        L2a:
            r6 = move-exception
            goto L54
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.ResultKt.throwOnFailure(r6)
            com.blackhub.bronline.game.repository.UpgradeObjectRepository r6 = r5.upgradeObjectRepository     // Catch: java.lang.Exception -> L2a
            r0.label = r3     // Catch: java.lang.Exception -> L2a
            java.lang.Object r6 = r6.getNewYearAwards(r0)     // Catch: java.lang.Exception -> L2a
            if (r6 != r1) goto L42
            return r1
        L42:
            retrofit2.Response r6 = (retrofit2.Response) r6     // Catch: java.lang.Exception -> L2a
            java.lang.Object r0 = r6.body()     // Catch: java.lang.Exception -> L2a
            com.blackhub.bronline.game.model.remote.response.upgradeobjectevent.UpgradeObjectAwardsResponse r0 = (com.blackhub.bronline.game.model.remote.response.upgradeobjectevent.UpgradeObjectAwardsResponse) r0     // Catch: java.lang.Exception -> L2a
            if (r0 == 0) goto L68
            boolean r6 = r6.isSuccessful()     // Catch: java.lang.Exception -> L2a
            if (r6 == 0) goto L68
            r4 = r0
            goto L68
        L54:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getUpgradeObjectAwardsResponse exception: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog(r6)
        L68:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel.getUpgradeObjectAwardsResponse(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.blackhub.bronline.game.gui.upgradeobjectevent.model.GiftPrizeModel> getAwardsLevelList(com.blackhub.bronline.game.model.remote.response.upgradeobjectevent.UpgradeObjectAwardsResponse r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel.getAwardsLevelList(com.blackhub.bronline.game.model.remote.response.upgradeobjectevent.UpgradeObjectAwardsResponse, int, int):java.util.List");
    }

    public final String getServerName(int serverId, List<Server> servers) {
        String firstName;
        Server server = (Server) CollectionsKt___CollectionsKt.getOrNull(servers, serverId - 1);
        if (server != null && (firstName = server.getFirstName()) != null) {
            return firstName;
        }
        String upperCase = getStringResource().getUnknown().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
