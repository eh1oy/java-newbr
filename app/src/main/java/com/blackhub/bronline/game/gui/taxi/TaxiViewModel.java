package com.blackhub.bronline.game.gui.taxi;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import javax.inject.Inject;
import kotlin.Metadata;
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
/* compiled from: TaxiViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0018J\u0006\u0010\u001c\u001a\u00020\u0018J\u0006\u0010\u001d\u001a\u00020\u0018J\u0006\u0010\u001e\u001a\u00020\u0018J\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, d2 = {"Lcom/blackhub/bronline/game/gui/taxi/TaxiViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/taxi/TaxiUiState;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "stringResource", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/taxi/TaxiActionWithJSON;", "(Lcom/blackhub/bronline/game/common/LocalNotification;Lcom/blackhub/bronline/game/core/resources/StringResource;Lcom/blackhub/bronline/game/gui/taxi/TaxiActionWithJSON;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getLocalNotification", "()Lcom/blackhub/bronline/game/common/LocalNotification;", "getStringResource", "()Lcom/blackhub/bronline/game/core/resources/StringResource;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "initJson", "", "json", "Lorg/json/JSONObject;", "sendAccept", "sendCloseScreen", "sendNext", "sendPrew", "setCommentVisible", "isVisible", "", "showErrorMessage", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "updateJson", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTaxiViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiViewModel.kt\ncom/blackhub/bronline/game/gui/taxi/TaxiViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,132:1\n230#2,5:133\n230#2,5:138\n*S KotlinDebug\n*F\n+ 1 TaxiViewModel.kt\ncom/blackhub/bronline/game/gui/taxi/TaxiViewModel\n*L\n39#1:133,5\n112#1:138,5\n*E\n"})
/* loaded from: classes3.dex */
public final class TaxiViewModel extends BaseViewModel<TaxiUiState> implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<TaxiUiState> _uiState;

    @NotNull
    public final TaxiActionWithJSON actionWithJSON;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<TaxiUiState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Inject
    public TaxiViewModel(@NotNull LocalNotification localNotification, @NotNull StringResource stringResource, @NotNull TaxiActionWithJSON actionWithJSON) {
        TaxiUiState value;
        TaxiUiState copy;
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        this.localNotification = localNotification;
        this.stringResource = stringResource;
        this.actionWithJSON = actionWithJSON;
        this._uiState = StateFlowKt.MutableStateFlow(new TaxiUiState(null, null, null, null, null, null, null, null, null, null, false, false, false, 8191, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
        MutableStateFlow<? extends TaxiUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r28 & 1) != 0 ? r3.brTaxiStart : getStringResource().taxiStartPoint(AnyExtensionKt.empty(this)), (r28 & 2) != 0 ? r3.brTaxiEnd : getStringResource().taxiEndPoint(AnyExtensionKt.empty(this)), (r28 & 4) != 0 ? r3.brTaxiDist : getStringResource().taxiDistance(AnyExtensionKt.empty(this)), (r28 & 8) != 0 ? r3.brTaxiTime : getStringResource().taxiTime(AnyExtensionKt.empty(this)), (r28 & 16) != 0 ? r3.comment : null, (r28 & 32) != 0 ? r3.brTaxiPrice : null, (r28 & 64) != 0 ? r3.brTaxiTypeText : null, (r28 & 128) != 0 ? r3.brTaxiRating : null, (r28 & 256) != 0 ? r3.brTaxiCountOrders : null, (r28 & 512) != 0 ? r3.brTaxiCash : null, (r28 & 1024) != 0 ? r3.isHasComment : false, (r28 & 2048) != 0 ? r3.isCommentVisible : false, (r28 & 4096) != 0 ? value.isNeedClose : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends TaxiUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<TaxiUiState> getUiState() {
        return this.uiState;
    }

    public final void initJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new TaxiViewModel$initJson$1(json, this, null), 1, null);
    }

    public final void updateJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new TaxiViewModel$updateJson$1(json, this, null), 1, null);
    }

    public final void sendNext() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new TaxiViewModel$sendNext$1(this, null), 1, null);
    }

    public final void sendPrew() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new TaxiViewModel$sendPrew$1(this, null), 1, null);
    }

    public final void sendAccept() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new TaxiViewModel$sendAccept$1(this, null), 1, null);
    }

    public final void setCommentVisible(boolean isVisible) {
        TaxiUiState value;
        TaxiUiState copy;
        MutableStateFlow<? extends TaxiUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r28 & 1) != 0 ? r2.brTaxiStart : null, (r28 & 2) != 0 ? r2.brTaxiEnd : null, (r28 & 4) != 0 ? r2.brTaxiDist : null, (r28 & 8) != 0 ? r2.brTaxiTime : null, (r28 & 16) != 0 ? r2.comment : null, (r28 & 32) != 0 ? r2.brTaxiPrice : null, (r28 & 64) != 0 ? r2.brTaxiTypeText : null, (r28 & 128) != 0 ? r2.brTaxiRating : null, (r28 & 256) != 0 ? r2.brTaxiCountOrders : null, (r28 & 512) != 0 ? r2.brTaxiCash : null, (r28 & 1024) != 0 ? r2.isHasComment : false, (r28 & 2048) != 0 ? r2.isCommentVisible : isVisible, (r28 & 4096) != 0 ? value.isNeedClose : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void sendCloseScreen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new TaxiViewModel$sendCloseScreen$1(this, null), 1, null);
    }

    public final void showErrorMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        getLocalNotification().showErrorNotification(message);
        sendCloseScreen();
    }
}
