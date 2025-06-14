package com.blackhub.bronline.game.gui.halloweenaward;

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
/* compiled from: HalloweenAwardViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.halloweenaward.HalloweenAwardViewModel$sendType$1", f = "HalloweenAwardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nHalloweenAwardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HalloweenAwardViewModel.kt\ncom/blackhub/bronline/game/gui/halloweenaward/HalloweenAwardViewModel$sendType$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,55:1\n230#2,5:56\n*S KotlinDebug\n*F\n+ 1 HalloweenAwardViewModel.kt\ncom/blackhub/bronline/game/gui/halloweenaward/HalloweenAwardViewModel$sendType$1\n*L\n50#1:56,5\n*E\n"})
/* loaded from: classes3.dex */
public final class HalloweenAwardViewModel$sendType$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $type;
    public int label;
    public final /* synthetic */ HalloweenAwardViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HalloweenAwardViewModel$sendType$1(HalloweenAwardViewModel halloweenAwardViewModel, int i, Continuation<? super HalloweenAwardViewModel$sendType$1> continuation) {
        super(2, continuation);
        this.this$0 = halloweenAwardViewModel;
        this.$type = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new HalloweenAwardViewModel$sendType$1(this.this$0, this.$type, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((HalloweenAwardViewModel$sendType$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        HalloweenAwardActionWithJSON halloweenAwardActionWithJSON;
        HalloweenAwardActionWithJSON halloweenAwardActionWithJSON2;
        HalloweenAwardUiState value;
        HalloweenAwardUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            halloweenAwardActionWithJSON = this.this$0.actionWithJSON;
            halloweenAwardActionWithJSON.sendType(this.$type);
            halloweenAwardActionWithJSON2 = this.this$0.actionWithJSON;
            halloweenAwardActionWithJSON2.sendCloseScreen();
            MutableStateFlow<? extends HalloweenAwardUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                copy = r1.copy((r18 & 1) != 0 ? r1.titleText : null, (r18 & 2) != 0 ? r1.premium : 0, (r18 & 4) != 0 ? r1.money : 0, (r18 & 8) != 0 ? r1.moneyBP : 0, (r18 & 16) != 0 ? r1.scoreBP : 0, (r18 & 32) != 0 ? r1.xpBP : 0, (r18 & 64) != 0 ? r1.isNeedClose : true, (r18 & 128) != 0 ? value.isBlockingLoading : false);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
