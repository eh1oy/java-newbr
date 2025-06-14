package com.blackhub.bronline.game.gui.upgradeobjectevent;

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
/* compiled from: UpgradeObjectEventViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$sendCloseScreen$1", f = "UpgradeObjectEventViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nUpgradeObjectEventViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpgradeObjectEventViewModel.kt\ncom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventViewModel$sendCloseScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,706:1\n230#2,5:707\n*S KotlinDebug\n*F\n+ 1 UpgradeObjectEventViewModel.kt\ncom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventViewModel$sendCloseScreen$1\n*L\n199#1:707,5\n*E\n"})
/* loaded from: classes3.dex */
public final class UpgradeObjectEventViewModel$sendCloseScreen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ UpgradeObjectEventViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeObjectEventViewModel$sendCloseScreen$1(UpgradeObjectEventViewModel upgradeObjectEventViewModel, Continuation<? super UpgradeObjectEventViewModel$sendCloseScreen$1> continuation) {
        super(2, continuation);
        this.this$0 = upgradeObjectEventViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UpgradeObjectEventViewModel$sendCloseScreen$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UpgradeObjectEventViewModel$sendCloseScreen$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        UpgradeObjectEventActionWithJSON upgradeObjectEventActionWithJSON;
        UpgradeObjectEventUiState value;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            upgradeObjectEventActionWithJSON = this.this$0.actionWithJSON;
            upgradeObjectEventActionWithJSON.sendCloseScreen();
            MutableStateFlow<? extends UpgradeObjectEventUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, UpgradeObjectEventUiState.copy$default(value, 0, null, null, 0, false, null, null, false, false, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, false, false, false, null, 0, 0, null, null, 0, null, null, null, true, false, -1, 383, null)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
