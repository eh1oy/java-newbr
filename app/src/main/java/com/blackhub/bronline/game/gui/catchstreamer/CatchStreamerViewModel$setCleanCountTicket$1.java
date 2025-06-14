package com.blackhub.bronline.game.gui.catchstreamer;

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

/* compiled from: CatchStreamerViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerViewModel$setCleanCountTicket$1", f = "CatchStreamerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCatchStreamerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatchStreamerViewModel.kt\ncom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerViewModel$setCleanCountTicket$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,174:1\n230#2,5:175\n*S KotlinDebug\n*F\n+ 1 CatchStreamerViewModel.kt\ncom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerViewModel$setCleanCountTicket$1\n*L\n128#1:175,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CatchStreamerViewModel$setCleanCountTicket$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ CatchStreamerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchStreamerViewModel$setCleanCountTicket$1(CatchStreamerViewModel catchStreamerViewModel, Continuation<? super CatchStreamerViewModel$setCleanCountTicket$1> continuation) {
        super(2, continuation);
        this.this$0 = catchStreamerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CatchStreamerViewModel$setCleanCountTicket$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CatchStreamerViewModel$setCleanCountTicket$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CatchStreamerUiState value;
        CatchStreamerUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MutableStateFlow<? extends CatchStreamerUiState> mutableStateFlow = this.this$0.get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r1.copy((r22 & 1) != 0 ? r1.screen : 0, (r22 & 2) != 0 ? r1.donate : 0, (r22 & 4) != 0 ? r1.games : 0, (r22 & 8) != 0 ? r1.currentCost : 0, (r22 & 16) != 0 ? r1.countPlayers : 0, (r22 & 32) != 0 ? r1.selectCountTickets : 1, (r22 & 64) != 0 ? r1.countBuyTickets : 0, (r22 & 128) != 0 ? r1.isPurchaseValid : false, (r22 & 256) != 0 ? r1.isNeedClose : false, (r22 & 512) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        return Unit.INSTANCE;
    }
}
