package com.blackhub.bronline.game.gui.rateapp.viewmodel;

import com.blackhub.bronline.game.gui.rateapp.RateAppUiState;
import java.util.ArrayList;
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
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RateAppViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.rateapp.viewmodel.RateAppViewModel$onStarClick$1", f = "RateAppViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nRateAppViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RateAppViewModel.kt\ncom/blackhub/bronline/game/gui/rateapp/viewmodel/RateAppViewModel$onStarClick$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,145:1\n1#2:146\n230#3,5:147\n*S KotlinDebug\n*F\n+ 1 RateAppViewModel.kt\ncom/blackhub/bronline/game/gui/rateapp/viewmodel/RateAppViewModel$onStarClick$1\n*L\n124#1:147,5\n*E\n"})
/* loaded from: classes3.dex */
public final class RateAppViewModel$onStarClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $index;
    public int label;
    public final /* synthetic */ RateAppViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateAppViewModel$onStarClick$1(int i, RateAppViewModel rateAppViewModel, Continuation<? super RateAppViewModel$onStarClick$1> continuation) {
        super(2, continuation);
        this.$index = i;
        this.this$0 = rateAppViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new RateAppViewModel$onStarClick$1(this.$index, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((RateAppViewModel$onStarClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        RateAppUiState value;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = new ArrayList(5);
        for (int i = 0; i < 5; i++) {
            arrayList.add(Boxing.boxBoolean(false));
        }
        for (int i2 = 0; i2 < 6; i2++) {
            if (i2 <= this.$index) {
                arrayList.set(i2, Boxing.boxBoolean(true));
            }
        }
        MutableStateFlow<? extends RateAppUiState> mutableStateFlow = this.this$0.get_uiState();
        int i3 = this.$index;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, RateAppUiState.copy$default(value, arrayList, i3 + 1, 0, false, true, false, false, 108, null)));
        return Unit.INSTANCE;
    }
}
