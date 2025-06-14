package com.blackhub.bronline.game.gui.gasmangame.viewmodel;

import com.blackhub.bronline.game.gui.gasmangame.network.GasmanActionsWithJson;
import com.blackhub.bronline.game.gui.gasmangame.uistate.GasmanParentUIState;
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
/* compiled from: GasmanParentViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanParentViewModel$gasAnimated$1", f = "GasmanParentViewModel.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nGasmanParentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GasmanParentViewModel.kt\ncom/blackhub/bronline/game/gui/gasmangame/viewmodel/GasmanParentViewModel$gasAnimated$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,107:1\n230#2,5:108\n*S KotlinDebug\n*F\n+ 1 GasmanParentViewModel.kt\ncom/blackhub/bronline/game/gui/gasmangame/viewmodel/GasmanParentViewModel$gasAnimated$1\n*L\n89#1:108,5\n*E\n"})
/* loaded from: classes3.dex */
public final class GasmanParentViewModel$gasAnimated$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ GasmanParentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GasmanParentViewModel$gasAnimated$1(GasmanParentViewModel gasmanParentViewModel, Continuation<? super GasmanParentViewModel$gasAnimated$1> continuation) {
        super(2, continuation);
        this.this$0 = gasmanParentViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GasmanParentViewModel$gasAnimated$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((GasmanParentViewModel$gasAnimated$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        GasmanActionsWithJson gasmanActionsWithJson;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        gasmanActionsWithJson = this.this$0.actionsWithJson;
        gasmanActionsWithJson.sendGasAnimated();
        int quantityOfChecks = this.this$0.get_uiState().getValue().getQuantityOfChecks();
        MutableStateFlow<? extends GasmanParentUIState> mutableStateFlow = this.this$0.get_uiState();
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), GasmanParentUIState.copy$default(this.this$0.get_uiState().getValue(), false, quantityOfChecks + 1, null, null, false, 0, null, 125, null))) {
        }
        return Unit.INSTANCE;
    }
}
