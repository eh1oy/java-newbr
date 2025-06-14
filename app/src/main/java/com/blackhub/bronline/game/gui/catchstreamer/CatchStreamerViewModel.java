package com.blackhub.bronline.game.gui.catchstreamer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
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
/* compiled from: CatchStreamerViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0013J\u000e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0018J\u0006\u0010 \u001a\u00020\u0013J\u0006\u0010!\u001a\u00020\u0013J\u0006\u0010\"\u001a\u00020\u0013J\u000e\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0018J\u0006\u0010%\u001a\u00020\u0013J\u000e\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006("}, d2 = {"Lcom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerUiState;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerActionWithJSON;", "(Lcom/blackhub/bronline/game/common/LocalNotification;Lcom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerActionWithJSON;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getLocalNotification", "()Lcom/blackhub/bronline/game/common/LocalNotification;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "addBuyTicket", "", "buyTickets", "emailOrSocial", "", "countTickets", "", "clearSellValid", "getAnswer", "json", "Lorg/json/JSONObject;", "initScreen", "isParticipate", "isSuccess", "removeBuyTicket", "sendClickGame", "sendClickParticipate", "sendCloseScreen", "screen", "setCleanCountTicket", "showErrorMessage", ThrowableDeserializer.PROP_NAME_MESSAGE, "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCatchStreamerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatchStreamerViewModel.kt\ncom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,174:1\n230#2,5:175\n230#2,5:180\n230#2,5:185\n*S KotlinDebug\n*F\n+ 1 CatchStreamerViewModel.kt\ncom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerViewModel\n*L\n69#1:175,5\n75#1:180,5\n166#1:185,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CatchStreamerViewModel extends BaseViewModel<CatchStreamerUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<CatchStreamerUiState> _uiState;

    @NotNull
    public final CatchStreamerActionWithJSON actionWithJSON;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final StateFlow<CatchStreamerUiState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Inject
    public CatchStreamerViewModel(@NotNull LocalNotification localNotification, @NotNull CatchStreamerActionWithJSON actionWithJSON) {
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        this.localNotification = localNotification;
        this.actionWithJSON = actionWithJSON;
        this._uiState = StateFlowKt.MutableStateFlow(new CatchStreamerUiState(0, 0, 0, 0, 0, 0, 0, false, false, false, 1023, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends CatchStreamerUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<CatchStreamerUiState> getUiState() {
        return this.uiState;
    }

    public final void initScreen(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new CatchStreamerViewModel$initScreen$1(json.optInt("t", 0), json, this, null), 1, null);
    }

    public final void addBuyTicket() {
        CatchStreamerUiState value;
        CatchStreamerUiState copy;
        MutableStateFlow<? extends CatchStreamerUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            CatchStreamerUiState catchStreamerUiState = value;
            copy = catchStreamerUiState.copy((r22 & 1) != 0 ? catchStreamerUiState.screen : 0, (r22 & 2) != 0 ? catchStreamerUiState.donate : 0, (r22 & 4) != 0 ? catchStreamerUiState.games : 0, (r22 & 8) != 0 ? catchStreamerUiState.currentCost : 0, (r22 & 16) != 0 ? catchStreamerUiState.countPlayers : 0, (r22 & 32) != 0 ? catchStreamerUiState.selectCountTickets : catchStreamerUiState.getSelectCountTickets() + 1, (r22 & 64) != 0 ? catchStreamerUiState.countBuyTickets : 0, (r22 & 128) != 0 ? catchStreamerUiState.isPurchaseValid : false, (r22 & 256) != 0 ? catchStreamerUiState.isNeedClose : false, (r22 & 512) != 0 ? catchStreamerUiState.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void removeBuyTicket() {
        CatchStreamerUiState value;
        CatchStreamerUiState copy;
        MutableStateFlow<? extends CatchStreamerUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r22 & 1) != 0 ? r2.screen : 0, (r22 & 2) != 0 ? r2.donate : 0, (r22 & 4) != 0 ? r2.games : 0, (r22 & 8) != 0 ? r2.currentCost : 0, (r22 & 16) != 0 ? r2.countPlayers : 0, (r22 & 32) != 0 ? r2.selectCountTickets : r2.getSelectCountTickets() - 1, (r22 & 64) != 0 ? r2.countBuyTickets : 0, (r22 & 128) != 0 ? r2.isPurchaseValid : false, (r22 & 256) != 0 ? r2.isNeedClose : false, (r22 & 512) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void buyTickets(@NotNull String emailOrSocial, int countTickets) {
        Intrinsics.checkNotNullParameter(emailOrSocial, "emailOrSocial");
        ViewModelExtensionKt.launchOnIO$default(this, null, new CatchStreamerViewModel$buyTickets$1(this, emailOrSocial, countTickets, null), 1, null);
    }

    public final void getAnswer(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new CatchStreamerViewModel$getAnswer$1(json, this, null), 1, null);
    }

    public final void setCleanCountTicket() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new CatchStreamerViewModel$setCleanCountTicket$1(this, null), 1, null);
    }

    public final void sendClickGame() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new CatchStreamerViewModel$sendClickGame$1(this, null), 1, null);
    }

    public final void isParticipate(int isSuccess) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new CatchStreamerViewModel$isParticipate$1(this, isSuccess, null), 1, null);
    }

    public final void sendClickParticipate() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new CatchStreamerViewModel$sendClickParticipate$1(this, null), 1, null);
    }

    public final void sendCloseScreen(int screen) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new CatchStreamerViewModel$sendCloseScreen$1(this, screen, null), 1, null);
    }

    public final void clearSellValid() {
        CatchStreamerUiState value;
        CatchStreamerUiState copy;
        MutableStateFlow<? extends CatchStreamerUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r22 & 1) != 0 ? r2.screen : 0, (r22 & 2) != 0 ? r2.donate : 0, (r22 & 4) != 0 ? r2.games : 0, (r22 & 8) != 0 ? r2.currentCost : 0, (r22 & 16) != 0 ? r2.countPlayers : 0, (r22 & 32) != 0 ? r2.selectCountTickets : 0, (r22 & 64) != 0 ? r2.countBuyTickets : 0, (r22 & 128) != 0 ? r2.isPurchaseValid : false, (r22 & 256) != 0 ? r2.isNeedClose : false, (r22 & 512) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void showErrorMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        getLocalNotification().showErrorNotification(message);
    }
}
