package com.blackhub.bronline.game.gui.tutorialhints;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TutorialGuiFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tutorialhints.TutorialGuiFragment$newBackPress$1", f = "TutorialGuiFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class TutorialGuiFragment$newBackPress$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ TutorialGuiFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TutorialGuiFragment$newBackPress$1(TutorialGuiFragment tutorialGuiFragment, Continuation<? super TutorialGuiFragment$newBackPress$1> continuation) {
        super(2, continuation);
        this.this$0 = tutorialGuiFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TutorialGuiFragment$newBackPress$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TutorialGuiFragment$newBackPress$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.this$0.getActivity() != null && this.this$0.isAdded()) {
            int hudVersion = this.this$0.getViewModel().getHudVersion();
            if (TutorialGuiFragment.access$getBinding(this.this$0).getRoot().getVisibility() == 0) {
                TutorialGuiFragment.access$getBinding(this.this$0).getRoot().setVisibility(8);
                this.this$0.getViewModel().setInterfaceVisible(false);
            } else {
                TutorialGuiFragment.access$getBinding(this.this$0).getRoot().setVisibility(0);
                this.this$0.getViewModel().setInterfaceVisible(true);
            }
            this.this$0.getViewModel().setNewVersionVisible(hudVersion == 1);
        }
        return Unit.INSTANCE;
    }
}
