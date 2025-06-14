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
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: ElectricViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.electric.viewmodel.ElectricViewModel$sendCloseScreen$1", f = "ElectricViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nElectricViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectricViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/ElectricViewModel$sendCloseScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,96:1\n230#2,5:97\n*S KotlinDebug\n*F\n+ 1 ElectricViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/ElectricViewModel$sendCloseScreen$1\n*L\n91#1:97,5\n*E\n"})
/* loaded from: classes3.dex */
public final class ElectricViewModel$sendCloseScreen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ ElectricViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ElectricViewModel$sendCloseScreen$1(ElectricViewModel electricViewModel, Continuation<? super ElectricViewModel$sendCloseScreen$1> continuation) {
        super(2, continuation);
        this.this$0 = electricViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ElectricViewModel$sendCloseScreen$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ElectricViewModel$sendCloseScreen$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ElectricActionWithJSON electricActionWithJSON;
        ElectricUiState value;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            electricActionWithJSON = this.this$0.actionWithJSON;
            electricActionWithJSON.sendCloseScreen();
            MutableStateFlow<? extends ElectricUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, ElectricUiState.copy$default(value, 0, null, 0, 0, true, false, 47, null)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
