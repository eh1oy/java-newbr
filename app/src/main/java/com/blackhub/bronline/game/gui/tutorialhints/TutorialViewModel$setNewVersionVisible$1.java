package com.blackhub.bronline.game.gui.tutorialhints;

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

/* compiled from: TutorialViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tutorialhints.TutorialViewModel$setNewVersionVisible$1", f = "TutorialViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nTutorialViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TutorialViewModel.kt\ncom/blackhub/bronline/game/gui/tutorialhints/TutorialViewModel$setNewVersionVisible$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,260:1\n230#2,5:261\n*S KotlinDebug\n*F\n+ 1 TutorialViewModel.kt\ncom/blackhub/bronline/game/gui/tutorialhints/TutorialViewModel$setNewVersionVisible$1\n*L\n234#1:261,5\n*E\n"})
/* loaded from: classes3.dex */
public final class TutorialViewModel$setNewVersionVisible$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ boolean $isVisible;
    public int label;
    public final /* synthetic */ TutorialViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TutorialViewModel$setNewVersionVisible$1(TutorialViewModel tutorialViewModel, boolean z, Continuation<? super TutorialViewModel$setNewVersionVisible$1> continuation) {
        super(2, continuation);
        this.this$0 = tutorialViewModel;
        this.$isVisible = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TutorialViewModel$setNewVersionVisible$1(this.this$0, this.$isVisible, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TutorialViewModel$setNewVersionVisible$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        TutorialUiState value;
        TutorialUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MutableStateFlow<? extends TutorialUiState> mutableStateFlow = this.this$0.get_uiState();
        boolean z = this.$isVisible;
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r22 & 1) != 0 ? r2.avatarNumber : 0, (r22 & 2) != 0 ? r2.hintScreenType : null, (r22 & 4) != 0 ? r2.hintTitle : null, (r22 & 8) != 0 ? r2.hintDesc : null, (r22 & 16) != 0 ? r2.mainTask : null, (r22 & 32) != 0 ? r2.additionalTasksList : null, (r22 & 64) != 0 ? r2.isNewVersionVisible : z, (r22 & 128) != 0 ? r2.isInterfaceVisible : false, (r22 & 256) != 0 ? r2.isNeedClose : false, (r22 & 512) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        return Unit.INSTANCE;
    }
}
