package com.blackhub.bronline.game.gui.electric.viewmodel;

import com.blackhub.bronline.game.gui.electric.state.ChangeBulbUiState;
import com.blackhub.bronline.game.gui.electric.utils.ElectricConstants;
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

/* compiled from: ChangeBulbViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.electric.viewmodel.ChangeBulbViewModel$setBulbBrokeInvisible$1", f = "ChangeBulbViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nChangeBulbViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeBulbViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/ChangeBulbViewModel$setBulbBrokeInvisible$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,111:1\n230#2,5:112\n*S KotlinDebug\n*F\n+ 1 ChangeBulbViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/ChangeBulbViewModel$setBulbBrokeInvisible$1\n*L\n43#1:112,5\n*E\n"})
/* loaded from: classes3.dex */
public final class ChangeBulbViewModel$setBulbBrokeInvisible$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ ChangeBulbViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeBulbViewModel$setBulbBrokeInvisible$1(ChangeBulbViewModel changeBulbViewModel, Continuation<? super ChangeBulbViewModel$setBulbBrokeInvisible$1> continuation) {
        super(2, continuation);
        this.this$0 = changeBulbViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ChangeBulbViewModel$setBulbBrokeInvisible$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ChangeBulbViewModel$setBulbBrokeInvisible$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ChangeBulbUiState value;
        ChangeBulbUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.getBulbBusyList().remove(ElectricConstants.BULB_BUSY);
        MutableStateFlow<? extends ChangeBulbUiState> mutableStateFlow = this.this$0.get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r1.copy((r18 & 1) != 0 ? r1.instructionsAndHints : null, (r18 & 2) != 0 ? r1.isHintShow : false, (r18 & 4) != 0 ? r1.isHandShow : false, (r18 & 8) != 0 ? r1.countHint : 2, (r18 & 16) != 0 ? r1.isBulbBrokeVisible : false, (r18 & 32) != 0 ? r1.isBulbFullVisible : false, (r18 & 64) != 0 ? r1.isFirstGame : false, (r18 & 128) != 0 ? value.isWin : null);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        return Unit.INSTANCE;
    }
}
