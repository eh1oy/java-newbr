package com.blackhub.bronline.game.gui.tutorialhints;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
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
/* compiled from: TutorialViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010\u0019\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/blackhub/bronline/game/gui/tutorialhints/TutorialViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/tutorialhints/TutorialUiState;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/tutorialhints/TutorialHintActionWithJSON;", "preferencesRepository", "Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;", "(Lcom/blackhub/bronline/game/gui/tutorialhints/TutorialHintActionWithJSON;Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getPreferencesRepository", "()Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "getHudVersion", "", "initJson", "", "json", "Lorg/json/JSONObject;", "onClickTask", "sendCloseScreen", "setInterfaceVisible", "isVisible", "", "setNewVersionVisible", "updateJson", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTutorialViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TutorialViewModel.kt\ncom/blackhub/bronline/game/gui/tutorialhints/TutorialViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,260:1\n230#2,5:261\n*S KotlinDebug\n*F\n+ 1 TutorialViewModel.kt\ncom/blackhub/bronline/game/gui/tutorialhints/TutorialViewModel\n*L\n241#1:261,5\n*E\n"})
/* loaded from: classes3.dex */
public final class TutorialViewModel extends BaseViewModel<TutorialUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<TutorialUiState> _uiState;

    @NotNull
    public final TutorialHintActionWithJSON actionWithJSON;

    @NotNull
    public final PreferencesRepository preferencesRepository;

    @NotNull
    public final StateFlow<TutorialUiState> uiState;

    @NotNull
    public final PreferencesRepository getPreferencesRepository() {
        return this.preferencesRepository;
    }

    @Inject
    public TutorialViewModel(@NotNull TutorialHintActionWithJSON actionWithJSON, @NotNull PreferencesRepository preferencesRepository) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.actionWithJSON = actionWithJSON;
        this.preferencesRepository = preferencesRepository;
        this._uiState = StateFlowKt.MutableStateFlow(new TutorialUiState(0, null, null, null, null, null, false, false, false, false, 1023, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends TutorialUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<TutorialUiState> getUiState() {
        return this.uiState;
    }

    public final void initJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new TutorialViewModel$initJson$1(this, json, null), 1, null);
    }

    public final void updateJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new TutorialViewModel$updateJson$1(json, this, null), 1, null);
    }

    public final void onClickTask() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new TutorialViewModel$onClickTask$1(this, null), 1, null);
    }

    public final void setNewVersionVisible(boolean isVisible) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new TutorialViewModel$setNewVersionVisible$1(this, isVisible, null), 1, null);
    }

    public final void setInterfaceVisible(boolean isVisible) {
        TutorialUiState value;
        TutorialUiState copy;
        MutableStateFlow<? extends TutorialUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r22 & 1) != 0 ? r2.avatarNumber : 0, (r22 & 2) != 0 ? r2.hintScreenType : null, (r22 & 4) != 0 ? r2.hintTitle : null, (r22 & 8) != 0 ? r2.hintDesc : null, (r22 & 16) != 0 ? r2.mainTask : null, (r22 & 32) != 0 ? r2.additionalTasksList : null, (r22 & 64) != 0 ? r2.isNewVersionVisible : false, (r22 & 128) != 0 ? r2.isInterfaceVisible : isVisible, (r22 & 256) != 0 ? r2.isNeedClose : false, (r22 & 512) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void sendCloseScreen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new TutorialViewModel$sendCloseScreen$1(this, null), 1, null);
    }

    public final int getHudVersion() {
        return PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.HUD_VERSION, 0, 2, null);
    }
}
