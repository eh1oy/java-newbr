package com.blackhub.bronline.game.gui.tanpinbanner;

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
/* compiled from: TanpinBannerViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tanpinbanner.TanpinBannerViewModel$onClickToClose$1", f = "TanpinBannerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nTanpinBannerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TanpinBannerViewModel.kt\ncom/blackhub/bronline/game/gui/tanpinbanner/TanpinBannerViewModel$onClickToClose$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,129:1\n230#2,5:130\n*S KotlinDebug\n*F\n+ 1 TanpinBannerViewModel.kt\ncom/blackhub/bronline/game/gui/tanpinbanner/TanpinBannerViewModel$onClickToClose$1\n*L\n81#1:130,5\n*E\n"})
/* loaded from: classes3.dex */
public final class TanpinBannerViewModel$onClickToClose$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ TanpinBannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TanpinBannerViewModel$onClickToClose$1(TanpinBannerViewModel tanpinBannerViewModel, Continuation<? super TanpinBannerViewModel$onClickToClose$1> continuation) {
        super(2, continuation);
        this.this$0 = tanpinBannerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TanpinBannerViewModel$onClickToClose$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TanpinBannerViewModel$onClickToClose$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        TanpinBannerActionWithJSON tanpinBannerActionWithJSON;
        TanpinBannerUiState value;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            tanpinBannerActionWithJSON = this.this$0.actionWithJSON;
            tanpinBannerActionWithJSON.sendClickToClose();
            MutableStateFlow<? extends TanpinBannerUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, TanpinBannerUiState.copy$default(value, null, true, 1, null)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
