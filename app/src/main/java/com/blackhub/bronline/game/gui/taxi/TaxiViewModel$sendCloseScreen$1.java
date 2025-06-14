package com.blackhub.bronline.game.gui.taxi;

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
/* compiled from: TaxiViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.taxi.TaxiViewModel$sendCloseScreen$1", f = "TaxiViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nTaxiViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiViewModel.kt\ncom/blackhub/bronline/game/gui/taxi/TaxiViewModel$sendCloseScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,132:1\n230#2,5:133\n*S KotlinDebug\n*F\n+ 1 TaxiViewModel.kt\ncom/blackhub/bronline/game/gui/taxi/TaxiViewModel$sendCloseScreen$1\n*L\n122#1:133,5\n*E\n"})
/* loaded from: classes3.dex */
public final class TaxiViewModel$sendCloseScreen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ TaxiViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiViewModel$sendCloseScreen$1(TaxiViewModel taxiViewModel, Continuation<? super TaxiViewModel$sendCloseScreen$1> continuation) {
        super(2, continuation);
        this.this$0 = taxiViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TaxiViewModel$sendCloseScreen$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TaxiViewModel$sendCloseScreen$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        TaxiActionWithJSON taxiActionWithJSON;
        TaxiUiState value;
        TaxiUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            taxiActionWithJSON = this.this$0.actionWithJSON;
            taxiActionWithJSON.sendCloseScreen();
            MutableStateFlow<? extends TaxiUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                copy = r3.copy((r28 & 1) != 0 ? r3.brTaxiStart : null, (r28 & 2) != 0 ? r3.brTaxiEnd : null, (r28 & 4) != 0 ? r3.brTaxiDist : null, (r28 & 8) != 0 ? r3.brTaxiTime : null, (r28 & 16) != 0 ? r3.comment : null, (r28 & 32) != 0 ? r3.brTaxiPrice : null, (r28 & 64) != 0 ? r3.brTaxiTypeText : null, (r28 & 128) != 0 ? r3.brTaxiRating : null, (r28 & 256) != 0 ? r3.brTaxiCountOrders : null, (r28 & 512) != 0 ? r3.brTaxiCash : null, (r28 & 1024) != 0 ? r3.isHasComment : false, (r28 & 2048) != 0 ? r3.isCommentVisible : false, (r28 & 4096) != 0 ? value.isNeedClose : true);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
