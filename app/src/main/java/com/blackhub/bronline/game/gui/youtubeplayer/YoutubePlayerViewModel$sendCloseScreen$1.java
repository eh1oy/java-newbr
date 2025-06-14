package com.blackhub.bronline.game.gui.youtubeplayer;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: YoutubePlayerViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.youtubeplayer.YoutubePlayerViewModel$sendCloseScreen$1", f = "YoutubePlayerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nYoutubePlayerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YoutubePlayerViewModel.kt\ncom/blackhub/bronline/game/gui/youtubeplayer/YoutubePlayerViewModel$sendCloseScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,63:1\n230#2,5:64\n*S KotlinDebug\n*F\n+ 1 YoutubePlayerViewModel.kt\ncom/blackhub/bronline/game/gui/youtubeplayer/YoutubePlayerViewModel$sendCloseScreen$1\n*L\n55#1:64,5\n*E\n"})
/* loaded from: classes3.dex */
public final class YoutubePlayerViewModel$sendCloseScreen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ boolean $isDestroyEnable;
    public final /* synthetic */ int $time;
    public int label;
    public final /* synthetic */ YoutubePlayerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YoutubePlayerViewModel$sendCloseScreen$1(YoutubePlayerViewModel youtubePlayerViewModel, int i, boolean z, Continuation<? super YoutubePlayerViewModel$sendCloseScreen$1> continuation) {
        super(2, continuation);
        this.this$0 = youtubePlayerViewModel;
        this.$time = i;
        this.$isDestroyEnable = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new YoutubePlayerViewModel$sendCloseScreen$1(this.this$0, this.$time, this.$isDestroyEnable, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((YoutubePlayerViewModel$sendCloseScreen$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        YoutubePlayerActionWithJSON youtubePlayerActionWithJSON;
        YoutubePlayerUiState value;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            youtubePlayerActionWithJSON = this.this$0.actionWithJSON;
            youtubePlayerActionWithJSON.sendCloseScreen(this.$time);
            MutableStateFlow<? extends YoutubePlayerUiState> mutableStateFlow = this.this$0.get_uiState();
            boolean z = this.$isDestroyEnable;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, YoutubePlayerUiState.copy$default(value, null, 0, z, true, 3, null)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
