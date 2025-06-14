package com.blackhub.bronline.game.gui.videoplayer;

import android.app.Application;
import com.blackhub.bronline.game.model.remote.response.videoplayer.PlayerResponse;
import com.blackhub.bronline.game.model.remote.response.videoplayer.PlayerResponseKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: VideoPlayerViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.videoplayer.VideoPlayerViewModel$init$1", f = "VideoPlayerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nVideoPlayerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoPlayerViewModel.kt\ncom/blackhub/bronline/game/gui/videoplayer/VideoPlayerViewModel$init$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,118:1\n230#2,5:119\n*S KotlinDebug\n*F\n+ 1 VideoPlayerViewModel.kt\ncom/blackhub/bronline/game/gui/videoplayer/VideoPlayerViewModel$init$1\n*L\n45#1:119,5\n*E\n"})
/* loaded from: classes3.dex */
public final class VideoPlayerViewModel$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public final /* synthetic */ PlayerResponse $playerResponse;
    public int label;
    public final /* synthetic */ VideoPlayerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPlayerViewModel$init$1(JSONObject jSONObject, PlayerResponse playerResponse, VideoPlayerViewModel videoPlayerViewModel, Continuation<? super VideoPlayerViewModel$init$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.$playerResponse = playerResponse;
        this.this$0 = videoPlayerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new VideoPlayerViewModel$init$1(this.$json, this.$playerResponse, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((VideoPlayerViewModel$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        VideoPlayerTypeScreen videoPlayerTypeScreen;
        Application application;
        VideoPlayerUiState value;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String optString = this.$json.optString(VideoPlayerKeys.VIDEO_URL_KEY);
        if (this.$json.optInt("t") == 1) {
            videoPlayerTypeScreen = VideoPlayerTypeScreen.MODAL_WINDOW;
        } else {
            videoPlayerTypeScreen = VideoPlayerTypeScreen.PLAYER;
        }
        PlayerResponse playerResponse = this.$playerResponse;
        application = this.this$0.application;
        Intrinsics.checkNotNull(optString);
        VideoConfiguration videoConfiguration = PlayerResponseKt.toVideoConfiguration(playerResponse, application, optString);
        long skipButtonTime = (long) (this.$playerResponse.getSkipButtonTime() * 1000.0f);
        MutableStateFlow<? extends VideoPlayerUiState> mutableStateFlow = this.this$0.get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, VideoPlayerUiState.copy$default(value, videoPlayerTypeScreen, videoConfiguration, false, skipButtonTime, false, 20, null)));
        return Unit.INSTANCE;
    }
}
