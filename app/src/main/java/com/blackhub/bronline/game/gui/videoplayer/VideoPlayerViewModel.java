package com.blackhub.bronline.game.gui.videoplayer;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.model.remote.response.videoplayer.PlayerResponse;
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
/* compiled from: VideoPlayerViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0012J\u0006\u0010\u0018\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0012J\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010\u001b\u001a\u00020\u0012R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/blackhub/bronline/game/gui/videoplayer/VideoPlayerViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/videoplayer/VideoPlayerUiState;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/videoplayer/VideoPlayerActionWithJson;", "application", "Landroid/app/Application;", "(Lcom/blackhub/bronline/game/gui/videoplayer/VideoPlayerActionWithJson;Landroid/app/Application;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "init", "", "json", "Lorg/json/JSONObject;", "playerResponse", "Lcom/blackhub/bronline/game/model/remote/response/videoplayer/PlayerResponse;", "onClickConfirmInModalWindow", "onClickDismissInModalWindow", "onCloseScreen", "onResumeApp", "onScreenClick", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVideoPlayerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoPlayerViewModel.kt\ncom/blackhub/bronline/game/gui/videoplayer/VideoPlayerViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,118:1\n230#2,5:119\n230#2,5:124\n*S KotlinDebug\n*F\n+ 1 VideoPlayerViewModel.kt\ncom/blackhub/bronline/game/gui/videoplayer/VideoPlayerViewModel\n*L\n81#1:119,5\n100#1:124,5\n*E\n"})
/* loaded from: classes3.dex */
public final class VideoPlayerViewModel extends BaseViewModel<VideoPlayerUiState> implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<VideoPlayerUiState> _uiState;

    @NotNull
    public final VideoPlayerActionWithJson actionWithJSON;

    @NotNull
    public final Application application;

    @NotNull
    public final StateFlow<VideoPlayerUiState> uiState;

    @Inject
    public VideoPlayerViewModel(@NotNull VideoPlayerActionWithJson actionWithJSON, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(application, "application");
        this.actionWithJSON = actionWithJSON;
        this.application = application;
        this._uiState = StateFlowKt.MutableStateFlow(new VideoPlayerUiState(null, null, false, 0L, false, 31, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends VideoPlayerUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<VideoPlayerUiState> getUiState() {
        return this.uiState;
    }

    public final void init(@NotNull JSONObject json, @NotNull PlayerResponse playerResponse) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(playerResponse, "playerResponse");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new VideoPlayerViewModel$init$1(json, playerResponse, this, null), 1, null);
    }

    public final void onClickConfirmInModalWindow() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new VideoPlayerViewModel$onClickConfirmInModalWindow$1(this, null), 1, null);
    }

    public final void onClickDismissInModalWindow() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new VideoPlayerViewModel$onClickDismissInModalWindow$1(this, null), 1, null);
    }

    public final void onScreenClick() {
        VideoPlayerUiState value;
        MutableStateFlow<? extends VideoPlayerUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, VideoPlayerUiState.copy$default(value, null, null, true, 0L, false, 27, null)));
        ViewModelExtensionKt.launchOnDefault$default(this, null, new VideoPlayerViewModel$onScreenClick$2(this, null), 1, null);
    }

    public final void onResumeApp() {
        VideoPlayerUiState value;
        MutableStateFlow<? extends VideoPlayerUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, VideoPlayerUiState.copy$default(value, null, null, false, 0L, false, 27, null)));
    }

    public final void onCloseScreen() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new VideoPlayerViewModel$onCloseScreen$1(this, null), 1, null);
    }
}
