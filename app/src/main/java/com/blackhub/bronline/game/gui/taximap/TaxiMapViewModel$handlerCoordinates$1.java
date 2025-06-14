package com.blackhub.bronline.game.gui.taximap;

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

/* compiled from: TaxiMapViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.taximap.TaxiMapViewModel$handlerCoordinates$1", f = "TaxiMapViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nTaxiMapViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiMapViewModel.kt\ncom/blackhub/bronline/game/gui/taximap/TaxiMapViewModel$handlerCoordinates$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,65:1\n230#2,5:66\n*S KotlinDebug\n*F\n+ 1 TaxiMapViewModel.kt\ncom/blackhub/bronline/game/gui/taximap/TaxiMapViewModel$handlerCoordinates$1\n*L\n40#1:66,5\n*E\n"})
/* loaded from: classes3.dex */
public final class TaxiMapViewModel$handlerCoordinates$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ float $coordinateX;
    public final /* synthetic */ float $coordinateY;
    public final /* synthetic */ float $heightView;
    public final /* synthetic */ float $widthView;
    public int label;
    public final /* synthetic */ TaxiMapViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiMapViewModel$handlerCoordinates$1(float f, float f2, float f3, float f4, TaxiMapViewModel taxiMapViewModel, Continuation<? super TaxiMapViewModel$handlerCoordinates$1> continuation) {
        super(2, continuation);
        this.$coordinateX = f;
        this.$coordinateY = f2;
        this.$widthView = f3;
        this.$heightView = f4;
        this.this$0 = taxiMapViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TaxiMapViewModel$handlerCoordinates$1(this.$coordinateX, this.$coordinateY, this.$widthView, this.$heightView, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TaxiMapViewModel$handlerCoordinates$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        TaxiMapUiState value;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        float f = this.$coordinateX;
        float f2 = this.$coordinateY;
        float f3 = this.$widthView;
        float f4 = this.$heightView;
        float f5 = (f - (f3 / 2.0f)) * (6000.0f / f3);
        float f6 = (f2 - (f4 / 2.0f)) * (6000.0f / f4) * (-1.0f);
        MutableStateFlow<? extends TaxiMapUiState> mutableStateFlow = this.this$0.get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, TaxiMapUiState.copy$default(value, f5, f6, true, false, 8, null)));
        return Unit.INSTANCE;
    }
}
