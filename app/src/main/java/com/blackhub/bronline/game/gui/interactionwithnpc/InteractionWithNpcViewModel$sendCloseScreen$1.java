package com.blackhub.bronline.game.gui.interactionwithnpc;

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
/* compiled from: InteractionWithNpcViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcViewModel$sendCloseScreen$1", f = "InteractionWithNpcViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nInteractionWithNpcViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractionWithNpcViewModel.kt\ncom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcViewModel$sendCloseScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,143:1\n230#2,5:144\n*S KotlinDebug\n*F\n+ 1 InteractionWithNpcViewModel.kt\ncom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcViewModel$sendCloseScreen$1\n*L\n107#1:144,5\n*E\n"})
/* loaded from: classes3.dex */
public final class InteractionWithNpcViewModel$sendCloseScreen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $screen;
    public int label;
    public final /* synthetic */ InteractionWithNpcViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractionWithNpcViewModel$sendCloseScreen$1(InteractionWithNpcViewModel interactionWithNpcViewModel, int i, Continuation<? super InteractionWithNpcViewModel$sendCloseScreen$1> continuation) {
        super(2, continuation);
        this.this$0 = interactionWithNpcViewModel;
        this.$screen = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new InteractionWithNpcViewModel$sendCloseScreen$1(this.this$0, this.$screen, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InteractionWithNpcViewModel$sendCloseScreen$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        InteractionWithNpcActionWithJSON interactionWithNpcActionWithJSON;
        InteractionWithNpcUiState value;
        InteractionWithNpcUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            interactionWithNpcActionWithJSON = this.this$0.actionWithJSON;
            interactionWithNpcActionWithJSON.sendCloseScreen(this.$screen);
            MutableStateFlow<? extends InteractionWithNpcUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                copy = r3.copy((r28 & 1) != 0 ? r3.screen : 0, (r28 & 2) != 0 ? r3.textTitle : null, (r28 & 4) != 0 ? r3.textDesc : null, (r28 & 8) != 0 ? r3.typingSpeed : 0L, (r28 & 16) != 0 ? r3.isSkipText : false, (r28 & 32) != 0 ? r3.buttonList : null, (r28 & 64) != 0 ? r3.renderId : 0, (r28 & 128) != 0 ? r3.bitmap : null, (r28 & 256) != 0 ? r3.isRenderNew : false, (r28 & 512) != 0 ? r3.isNeedStartPosition : false, (r28 & 1024) != 0 ? r3.isNeedClose : true, (r28 & 2048) != 0 ? value.isBlockingLoading : false);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
