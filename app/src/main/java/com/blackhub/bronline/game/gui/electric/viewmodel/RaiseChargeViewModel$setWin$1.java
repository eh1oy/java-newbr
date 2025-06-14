package com.blackhub.bronline.game.gui.electric.viewmodel;

import com.blackhub.bronline.game.gui.electric.state.RaiseChargeUiState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RaiseChargeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.electric.viewmodel.RaiseChargeViewModel$setWin$1", f = "RaiseChargeViewModel.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nRaiseChargeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RaiseChargeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/RaiseChargeViewModel$setWin$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,148:1\n230#2,5:149\n*S KotlinDebug\n*F\n+ 1 RaiseChargeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/RaiseChargeViewModel$setWin$1\n*L\n52#1:149,5\n*E\n"})
/* loaded from: classes3.dex */
public final class RaiseChargeViewModel$setWin$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ boolean $isWin;
    public int label;
    public final /* synthetic */ RaiseChargeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RaiseChargeViewModel$setWin$1(RaiseChargeViewModel raiseChargeViewModel, boolean z, Continuation<? super RaiseChargeViewModel$setWin$1> continuation) {
        super(2, continuation);
        this.this$0 = raiseChargeViewModel;
        this.$isWin = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new RaiseChargeViewModel$setWin$1(this.this$0, this.$isWin, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((RaiseChargeViewModel$setWin$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        RaiseChargeUiState value;
        RaiseChargeUiState copy;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        MutableStateFlow<? extends RaiseChargeUiState> mutableStateFlow = this.this$0.get_uiState();
        boolean z = this.$isWin;
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r20 & 1) != 0 ? r2.instructionsAndHints : null, (r20 & 2) != 0 ? r2.gameInstructionsItemList : null, (r20 & 4) != 0 ? r2.isInstructionsShow : false, (r20 & 8) != 0 ? r2.isHintShow : false, (r20 & 16) != 0 ? r2.isHandShow : false, (r20 & 32) != 0 ? r2.countHint : 0, (r20 & 64) != 0 ? r2.isFirstGame : false, (r20 & 128) != 0 ? r2.isWin : Boxing.boxBoolean(z), (r20 & 256) != 0 ? value.count : -10);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        return Unit.INSTANCE;
    }
}
