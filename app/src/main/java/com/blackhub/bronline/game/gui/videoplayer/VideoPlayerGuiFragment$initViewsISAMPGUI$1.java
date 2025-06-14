package com.blackhub.bronline.game.gui.videoplayer;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.blackhub.bronline.game.core.model.ConfigurationJsonModel;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: VideoPlayerGuiFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.videoplayer.VideoPlayerGuiFragment$initViewsISAMPGUI$1", f = "VideoPlayerGuiFragment.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class VideoPlayerGuiFragment$initViewsISAMPGUI$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ VideoPlayerGuiFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPlayerGuiFragment$initViewsISAMPGUI$1(VideoPlayerGuiFragment videoPlayerGuiFragment, Continuation<? super VideoPlayerGuiFragment$initViewsISAMPGUI$1> continuation) {
        super(2, continuation);
        this.this$0 = videoPlayerGuiFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new VideoPlayerGuiFragment$initViewsISAMPGUI$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((VideoPlayerGuiFragment$initViewsISAMPGUI$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        JNIActivityViewModel mainViewModel;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mainViewModel = this.this$0.getMainViewModel();
            StateFlow<ConfigurationJsonModel> configurationJsons = mainViewModel.getConfigurationJsons();
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            Flow flowWithLifecycle = FlowExtKt.flowWithLifecycle(configurationJsons, lifecycle, Lifecycle.State.STARTED);
            final VideoPlayerGuiFragment videoPlayerGuiFragment = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.videoplayer.VideoPlayerGuiFragment$initViewsISAMPGUI$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((ConfigurationJsonModel) obj2, (Continuation<? super Unit>) continuation);
                }

                /* JADX WARN: Code restructure failed: missing block: B:3:0x0012, code lost:
                
                    r3 = r1.getJsonObj();
                 */
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(@org.jetbrains.annotations.NotNull com.blackhub.bronline.game.core.model.ConfigurationJsonModel r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                    /*
                        r1 = this;
                        com.blackhub.bronline.game.model.remote.response.videoplayer.PlayerResponse r3 = r2.getVideoPlayerModel()
                        java.util.List r3 = r3.getVideos()
                        java.util.Collection r3 = (java.util.Collection) r3
                        boolean r3 = r3.isEmpty()
                        r3 = r3 ^ 1
                        if (r3 == 0) goto L27
                        com.blackhub.bronline.game.gui.videoplayer.VideoPlayerGuiFragment r3 = com.blackhub.bronline.game.gui.videoplayer.VideoPlayerGuiFragment.this
                        org.json.JSONObject r3 = com.blackhub.bronline.game.gui.videoplayer.VideoPlayerGuiFragment.access$getJsonObj(r3)
                        if (r3 == 0) goto L27
                        com.blackhub.bronline.game.gui.videoplayer.VideoPlayerGuiFragment r0 = com.blackhub.bronline.game.gui.videoplayer.VideoPlayerGuiFragment.this
                        com.blackhub.bronline.game.gui.videoplayer.VideoPlayerViewModel r0 = r0.getViewModel()
                        com.blackhub.bronline.game.model.remote.response.videoplayer.PlayerResponse r2 = r2.getVideoPlayerModel()
                        r0.init(r3, r2)
                    L27:
                        kotlin.Unit r2 = kotlin.Unit.INSTANCE
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.videoplayer.VideoPlayerGuiFragment$initViewsISAMPGUI$1.AnonymousClass1.emit(com.blackhub.bronline.game.core.model.ConfigurationJsonModel, kotlin.coroutines.Continuation):java.lang.Object");
                }
            };
            this.label = 1;
            if (flowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
