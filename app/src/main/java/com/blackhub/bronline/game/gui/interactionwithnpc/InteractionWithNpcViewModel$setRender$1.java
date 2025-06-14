package com.blackhub.bronline.game.gui.interactionwithnpc;

import android.graphics.Bitmap;
import com.blackhub.bronline.game.GameRender;
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

/* compiled from: InteractionWithNpcViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcViewModel$setRender$1", f = "InteractionWithNpcViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nInteractionWithNpcViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractionWithNpcViewModel.kt\ncom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcViewModel$setRender$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,143:1\n230#2,5:144\n*S KotlinDebug\n*F\n+ 1 InteractionWithNpcViewModel.kt\ncom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcViewModel$setRender$1\n*L\n128#1:144,5\n*E\n"})
/* loaded from: classes3.dex */
public final class InteractionWithNpcViewModel$setRender$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $renderId;
    public final /* synthetic */ int $widthSwScreen;
    public int label;
    public final /* synthetic */ InteractionWithNpcViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractionWithNpcViewModel$setRender$1(int i, int i2, InteractionWithNpcViewModel interactionWithNpcViewModel, Continuation<? super InteractionWithNpcViewModel$setRender$1> continuation) {
        super(2, continuation);
        this.$renderId = i;
        this.$widthSwScreen = i2;
        this.this$0 = interactionWithNpcViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new InteractionWithNpcViewModel$setRender$1(this.$renderId, this.$widthSwScreen, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InteractionWithNpcViewModel$setRender$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        GameRender gameRender = GameRender.getInstance();
        int i = this.$renderId;
        int i2 = this.$widthSwScreen;
        gameRender.RequestRenderWithSize(2, 1, i, 0, 0, 0.0f, 180.0f, 0.0f, 1.0f, i2, i2 * 2, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcViewModel$setRender$1$$ExternalSyntheticLambda0
            public /* synthetic */ InteractionWithNpcViewModel$setRender$1$$ExternalSyntheticLambda0() {
            }

            @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
            public final void OnRenderComplete(int i3, Bitmap bitmap) {
                InteractionWithNpcViewModel$setRender$1.invokeSuspend$lambda$1(InteractionWithNpcViewModel.this, i3, bitmap);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void invokeSuspend$lambda$1(InteractionWithNpcViewModel interactionWithNpcViewModel, int i, Bitmap bitmap) {
        InteractionWithNpcUiState value;
        InteractionWithNpcUiState copy;
        MutableStateFlow<? extends InteractionWithNpcUiState> mutableStateFlow = interactionWithNpcViewModel.get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r28 & 1) != 0 ? r2.screen : 0, (r28 & 2) != 0 ? r2.textTitle : null, (r28 & 4) != 0 ? r2.textDesc : null, (r28 & 8) != 0 ? r2.typingSpeed : 0L, (r28 & 16) != 0 ? r2.isSkipText : false, (r28 & 32) != 0 ? r2.buttonList : null, (r28 & 64) != 0 ? r2.renderId : 0, (r28 & 128) != 0 ? r2.bitmap : bitmap, (r28 & 256) != 0 ? r2.isRenderNew : false, (r28 & 512) != 0 ? r2.isNeedStartPosition : false, (r28 & 1024) != 0 ? r2.isNeedClose : false, (r28 & 2048) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }
}
