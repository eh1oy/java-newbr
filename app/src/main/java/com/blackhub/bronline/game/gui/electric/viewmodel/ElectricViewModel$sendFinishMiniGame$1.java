package com.blackhub.bronline.game.gui.electric.viewmodel;

import com.blackhub.bronline.game.gui.electric.network.ElectricActionWithJSON;
import com.blackhub.bronline.game.gui.electric.state.ElectricUiState;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: ElectricViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.electric.viewmodel.ElectricViewModel$sendFinishMiniGame$1", f = "ElectricViewModel.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nElectricViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectricViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/ElectricViewModel$sendFinishMiniGame$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,96:1\n230#2,5:97\n*S KotlinDebug\n*F\n+ 1 ElectricViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/ElectricViewModel$sendFinishMiniGame$1\n*L\n82#1:97,5\n*E\n"})
/* loaded from: classes3.dex */
public final class ElectricViewModel$sendFinishMiniGame$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ boolean $isWin;
    public int label;
    public final /* synthetic */ ElectricViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ElectricViewModel$sendFinishMiniGame$1(boolean z, ElectricViewModel electricViewModel, Continuation<? super ElectricViewModel$sendFinishMiniGame$1> continuation) {
        super(2, continuation);
        this.$isWin = z;
        this.this$0 = electricViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ElectricViewModel$sendFinishMiniGame$1(this.$isWin, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ElectricViewModel$sendFinishMiniGame$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ElectricActionWithJSON electricActionWithJSON;
        ElectricUiState value;
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
        int i2 = this.$isWin ? 2 : 3;
        electricActionWithJSON = this.this$0.actionWithJSON;
        electricActionWithJSON.sendFinishGame(i2);
        MutableStateFlow<? extends ElectricUiState> mutableStateFlow = this.this$0.get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ElectricUiState.copy$default(value, 0, null, 0, 0, true, false, 47, null)));
        return Unit.INSTANCE;
    }
}
