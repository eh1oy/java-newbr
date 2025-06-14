package com.blackhub.bronline.game.gui.activetask;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
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
/* compiled from: ActiveTaskViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u000fJ\u0006\u0010\u0018\u001a\u00020\u000fJ\u000e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/blackhub/bronline/game/gui/activetask/ActiveTaskViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/activetask/ActiveTaskUiState;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/activetask/ActiveTaskActionWithJSON;", "(Lcom/blackhub/bronline/game/gui/activetask/ActiveTaskActionWithJSON;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "hideInterface", "", "initJson", "json", "Lorg/json/JSONObject;", "onEndOfTime", "sendClickId", "id", "", "sendCloseScreen", "showInterface", "updateJson", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nActiveTaskViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActiveTaskViewModel.kt\ncom/blackhub/bronline/game/gui/activetask/ActiveTaskViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,136:1\n230#2,5:137\n230#2,5:142\n*S KotlinDebug\n*F\n+ 1 ActiveTaskViewModel.kt\ncom/blackhub/bronline/game/gui/activetask/ActiveTaskViewModel\n*L\n117#1:137,5\n123#1:142,5\n*E\n"})
/* loaded from: classes3.dex */
public final class ActiveTaskViewModel extends BaseViewModel<ActiveTaskUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<ActiveTaskUiState> _uiState;

    @NotNull
    public final ActiveTaskActionWithJSON actionWithJSON;

    @NotNull
    public final StateFlow<ActiveTaskUiState> uiState;

    @Inject
    public ActiveTaskViewModel(@NotNull ActiveTaskActionWithJSON actionWithJSON) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        this.actionWithJSON = actionWithJSON;
        this._uiState = StateFlowKt.MutableStateFlow(new ActiveTaskUiState(0, null, null, null, null, 0, false, false, false, 511, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends ActiveTaskUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<ActiveTaskUiState> getUiState() {
        return this.uiState;
    }

    public final void initJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new ActiveTaskViewModel$initJson$1(json, this, null), 1, null);
    }

    public final void updateJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new ActiveTaskViewModel$updateJson$1(json, this, null), 1, null);
    }

    public final void sendClickId(int id) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new ActiveTaskViewModel$sendClickId$1(this, id, null), 1, null);
    }

    public final void onEndOfTime() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new ActiveTaskViewModel$onEndOfTime$1(this, null), 1, null);
    }

    public final void hideInterface() {
        ActiveTaskUiState value;
        ActiveTaskUiState copy;
        MutableStateFlow<? extends ActiveTaskUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r20 & 1) != 0 ? r2.hintNumber : 0, (r20 & 2) != 0 ? r2.hintScreen : null, (r20 & 4) != 0 ? r2.hintTitle : null, (r20 & 8) != 0 ? r2.hintDesc : null, (r20 & 16) != 0 ? r2.btnText : null, (r20 & 32) != 0 ? r2.hintTime : 0, (r20 & 64) != 0 ? r2.isInterfaceVisible : false, (r20 & 128) != 0 ? r2.isNeedClose : false, (r20 & 256) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void showInterface() {
        ActiveTaskUiState value;
        ActiveTaskUiState copy;
        MutableStateFlow<? extends ActiveTaskUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r20 & 1) != 0 ? r2.hintNumber : 0, (r20 & 2) != 0 ? r2.hintScreen : null, (r20 & 4) != 0 ? r2.hintTitle : null, (r20 & 8) != 0 ? r2.hintDesc : null, (r20 & 16) != 0 ? r2.btnText : null, (r20 & 32) != 0 ? r2.hintTime : 0, (r20 & 64) != 0 ? r2.isInterfaceVisible : true, (r20 & 128) != 0 ? r2.isNeedClose : false, (r20 & 256) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void sendCloseScreen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new ActiveTaskViewModel$sendCloseScreen$1(this, null), 1, null);
    }
}
