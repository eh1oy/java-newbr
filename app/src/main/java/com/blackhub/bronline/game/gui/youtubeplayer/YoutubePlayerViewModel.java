package com.blackhub.bronline.game.gui.youtubeplayer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
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
/* compiled from: YoutubePlayerViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0018R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/blackhub/bronline/game/gui/youtubeplayer/YoutubePlayerViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/youtubeplayer/YoutubePlayerUiState;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/youtubeplayer/YoutubePlayerActionWithJSON;", "(Lcom/blackhub/bronline/game/gui/youtubeplayer/YoutubePlayerActionWithJSON;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "init", "", "json", "Lorg/json/JSONObject;", "saveTime", "time", "", "sendCloseScreen", "isDestroyEnable", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nYoutubePlayerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YoutubePlayerViewModel.kt\ncom/blackhub/bronline/game/gui/youtubeplayer/YoutubePlayerViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,63:1\n230#2,5:64\n*S KotlinDebug\n*F\n+ 1 YoutubePlayerViewModel.kt\ncom/blackhub/bronline/game/gui/youtubeplayer/YoutubePlayerViewModel\n*L\n45#1:64,5\n*E\n"})
/* loaded from: classes3.dex */
public final class YoutubePlayerViewModel extends BaseViewModel<YoutubePlayerUiState> implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<YoutubePlayerUiState> _uiState;

    @NotNull
    public final YoutubePlayerActionWithJSON actionWithJSON;

    @NotNull
    public final StateFlow<YoutubePlayerUiState> uiState;

    @Inject
    public YoutubePlayerViewModel(@NotNull YoutubePlayerActionWithJSON actionWithJSON) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        this.actionWithJSON = actionWithJSON;
        this._uiState = StateFlowKt.MutableStateFlow(new YoutubePlayerUiState(null, 0, false, false, 15, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends YoutubePlayerUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<YoutubePlayerUiState> getUiState() {
        return this.uiState;
    }

    public final void init(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new YoutubePlayerViewModel$init$1(json, this, null), 1, null);
    }

    public final void saveTime(int time) {
        YoutubePlayerUiState value;
        MutableStateFlow<? extends YoutubePlayerUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, YoutubePlayerUiState.copy$default(value, null, time, false, false, 13, null)));
    }

    public static /* synthetic */ void sendCloseScreen$default(YoutubePlayerViewModel youtubePlayerViewModel, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        youtubePlayerViewModel.sendCloseScreen(i, z);
    }

    public final void sendCloseScreen(int time, boolean isDestroyEnable) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new YoutubePlayerViewModel$sendCloseScreen$1(this, time, isDestroyEnable, null), 1, null);
    }
}
