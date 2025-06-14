package com.blackhub.bronline.game.gui.clicker;

import com.blackhub.bronline.game.gui.clicker.network.ClickerActionsWithJson;
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
/* compiled from: ClickerViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.clicker.ClickerViewModel$finishTimer$1", f = "ClickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nClickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickerViewModel.kt\ncom/blackhub/bronline/game/gui/clicker/ClickerViewModel$finishTimer$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,204:1\n230#2,5:205\n*S KotlinDebug\n*F\n+ 1 ClickerViewModel.kt\ncom/blackhub/bronline/game/gui/clicker/ClickerViewModel$finishTimer$1\n*L\n146#1:205,5\n*E\n"})
/* loaded from: classes3.dex */
public final class ClickerViewModel$finishTimer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ ClickerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickerViewModel$finishTimer$1(ClickerViewModel clickerViewModel, Continuation<? super ClickerViewModel$finishTimer$1> continuation) {
        super(2, continuation);
        this.this$0 = clickerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ClickerViewModel$finishTimer$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ClickerViewModel$finishTimer$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ClickerActionsWithJson clickerActionsWithJson;
        ClickerUiState value;
        ClickerUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int i = this.this$0.get_uiState().getValue().getCurrentProgress() >= 50 ? 2 : 1;
        clickerActionsWithJson = this.this$0.actionsWithJson;
        clickerActionsWithJson.sendGameOverWithResult(i);
        MutableStateFlow<? extends ClickerUiState> mutableStateFlow = this.this$0.get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r24 & 1) != 0 ? r3.valueOfPercentPerClick : 0, (r24 & 2) != 0 ? r3.delayBitOpponentInMilliseconds : 0L, (r24 & 4) != 0 ? r3.currentProgress : 0, (r24 & 8) != 0 ? r3.totalTimerInSeconds : 0, (r24 & 16) != 0 ? r3.myNick : null, (r24 & 32) != 0 ? r3.opponentNick : null, (r24 & 64) != 0 ? r3.textDescription : null, (r24 & 128) != 0 ? r3.bgImageBitmap : null, (r24 & 256) != 0 ? r3.imgClickEffectBitmap : null, (r24 & 512) != 0 ? value.isNeedToClose : true);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        return Unit.INSTANCE;
    }
}
