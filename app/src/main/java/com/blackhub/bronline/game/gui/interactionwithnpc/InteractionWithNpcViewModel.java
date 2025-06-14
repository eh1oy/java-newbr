package com.blackhub.bronline.game.gui.interactionwithnpc;

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
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: InteractionWithNpcViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0015J\u0016\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcUiState;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcActionWithJSON;", "(Lcom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcActionWithJSON;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "clearScrollPosition", "", "initJson", "json", "Lorg/json/JSONObject;", "sendButtonClick", "buttonKey", "", "sendCloseScreen", "screen", "setRender", "widthSwScreen", "renderId", "updateJson", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInteractionWithNpcViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractionWithNpcViewModel.kt\ncom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,143:1\n230#2,5:144\n230#2,5:149\n*S KotlinDebug\n*F\n+ 1 InteractionWithNpcViewModel.kt\ncom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcViewModel\n*L\n40#1:144,5\n139#1:149,5\n*E\n"})
/* loaded from: classes3.dex */
public final class InteractionWithNpcViewModel extends BaseViewModel<InteractionWithNpcUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<InteractionWithNpcUiState> _uiState;

    @NotNull
    public final InteractionWithNpcActionWithJSON actionWithJSON;

    @NotNull
    public final StateFlow<InteractionWithNpcUiState> uiState;

    @Inject
    public InteractionWithNpcViewModel(@NotNull InteractionWithNpcActionWithJSON actionWithJSON) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        this.actionWithJSON = actionWithJSON;
        this._uiState = StateFlowKt.MutableStateFlow(new InteractionWithNpcUiState(0, null, null, 0L, false, null, 0, null, false, false, false, false, UnixStat.PERM_MASK, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends InteractionWithNpcUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<InteractionWithNpcUiState> getUiState() {
        return this.uiState;
    }

    public final void initJson(@NotNull JSONObject json) {
        InteractionWithNpcUiState value;
        InteractionWithNpcUiState copy;
        Intrinsics.checkNotNullParameter(json, "json");
        MutableStateFlow<? extends InteractionWithNpcUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r4.copy((r28 & 1) != 0 ? r4.screen : 0, (r28 & 2) != 0 ? r4.textTitle : null, (r28 & 4) != 0 ? r4.textDesc : null, (r28 & 8) != 0 ? r4.typingSpeed : 0L, (r28 & 16) != 0 ? r4.isSkipText : false, (r28 & 32) != 0 ? r4.buttonList : null, (r28 & 64) != 0 ? r4.renderId : -1, (r28 & 128) != 0 ? r4.bitmap : null, (r28 & 256) != 0 ? r4.isRenderNew : false, (r28 & 512) != 0 ? r4.isNeedStartPosition : false, (r28 & 1024) != 0 ? r4.isNeedClose : false, (r28 & 2048) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        ViewModelExtensionKt.launchOnDefault$default(this, null, new InteractionWithNpcViewModel$initJson$2(json, this, null), 1, null);
    }

    public final void updateJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new InteractionWithNpcViewModel$updateJson$1(json, this, null), 1, null);
    }

    public final void sendButtonClick(int buttonKey) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new InteractionWithNpcViewModel$sendButtonClick$1(this, buttonKey, null), 1, null);
    }

    public final void sendCloseScreen(int screen) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new InteractionWithNpcViewModel$sendCloseScreen$1(this, screen, null), 1, null);
    }

    public final void setRender(int widthSwScreen, int renderId) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new InteractionWithNpcViewModel$setRender$1(renderId, widthSwScreen, this, null), 1, null);
    }

    public final void clearScrollPosition() {
        InteractionWithNpcUiState value;
        InteractionWithNpcUiState copy;
        MutableStateFlow<? extends InteractionWithNpcUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r28 & 1) != 0 ? r2.screen : 0, (r28 & 2) != 0 ? r2.textTitle : null, (r28 & 4) != 0 ? r2.textDesc : null, (r28 & 8) != 0 ? r2.typingSpeed : 0L, (r28 & 16) != 0 ? r2.isSkipText : false, (r28 & 32) != 0 ? r2.buttonList : null, (r28 & 64) != 0 ? r2.renderId : 0, (r28 & 128) != 0 ? r2.bitmap : null, (r28 & 256) != 0 ? r2.isRenderNew : false, (r28 & 512) != 0 ? r2.isNeedStartPosition : false, (r28 & 1024) != 0 ? r2.isNeedClose : false, (r28 & 2048) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }
}
