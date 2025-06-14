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
import org.json.JSONObject;

/* compiled from: CatchStreamerViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerViewModel$initScreen$1", f = "CatchStreamerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCatchStreamerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatchStreamerViewModel.kt\ncom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerViewModel$initScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,174:1\n230#2,5:175\n230#2,5:180\n*S KotlinDebug\n*F\n+ 1 CatchStreamerViewModel.kt\ncom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerViewModel$initScreen$1\n*L\n40#1:175,5\n53#1:180,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CatchStreamerViewModel$initScreen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public final /* synthetic */ int $type;
    public int label;
    public final /* synthetic */ CatchStreamerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchStreamerViewModel$initScreen$1(int i, JSONObject jSONObject, CatchStreamerViewModel catchStreamerViewModel, Continuation<? super CatchStreamerViewModel$initScreen$1> continuation) {
        super(2, continuation);
        this.$type = i;
        this.$json = jSONObject;
        this.this$0 = catchStreamerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CatchStreamerViewModel$initScreen$1(this.$type, this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CatchStreamerViewModel$initScreen$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CatchStreamerUiState value;
        CatchStreamerUiState copy;
        CatchStreamerUiState value2;
        CatchStreamerUiState copy2;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int i = this.$type;
        if (i == 1) {
            int optInt = this.$json.optInt(CatchStreamerKeys.PLAYERS_KEY, 0);
            MutableStateFlow<? extends CatchStreamerUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                copy = r4.copy((r22 & 1) != 0 ? r4.screen : 1, (r22 & 2) != 0 ? r4.donate : 0, (r22 & 4) != 0 ? r4.games : 0, (r22 & 8) != 0 ? r4.currentCost : 0, (r22 & 16) != 0 ? r4.countPlayers : optInt, (r22 & 32) != 0 ? r4.selectCountTickets : 0, (r22 & 64) != 0 ? r4.countBuyTickets : 0, (r22 & 128) != 0 ? r4.isPurchaseValid : false, (r22 & 256) != 0 ? r4.isNeedClose : false, (r22 & 512) != 0 ? value.isBlockingLoading : false);
            } while (!mutableStateFlow.compareAndSet(value, copy));
        } else if (i == 2) {
            int optInt2 = this.$json.optInt(CatchStreamerKeys.DONATE_KEY, 0);
            int optInt3 = this.$json.optInt(CatchStreamerKeys.COST_KEY, 0);
            int optInt4 = this.$json.optInt(CatchStreamerKeys.GAMES_KEY, 0);
            MutableStateFlow<? extends CatchStreamerUiState> mutableStateFlow2 = this.this$0.get_uiState();
            do {
                value2 = mutableStateFlow2.getValue();
                copy2 = r4.copy((r22 & 1) != 0 ? r4.screen : 2, (r22 & 2) != 0 ? r4.donate : optInt2, (r22 & 4) != 0 ? r4.games : optInt4, (r22 & 8) != 0 ? r4.currentCost : optInt3, (r22 & 16) != 0 ? r4.countPlayers : 0, (r22 & 32) != 0 ? r4.selectCountTickets : 0, (r22 & 64) != 0 ? r4.countBuyTickets : 0, (r22 & 128) != 0 ? r4.isPurchaseValid : false, (r22 & 256) != 0 ? r4.isNeedClose : false, (r22 & 512) != 0 ? value2.isBlockingLoading : false);
            } while (!mutableStateFlow2.compareAndSet(value2, copy2));
        }
        return Unit.INSTANCE;
    }
}
