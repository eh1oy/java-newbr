package com.blackhub.bronline.game.gui.blackpass;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel;
import com.blackhub.bronline.game.gui.donate.data.ObjForResultDialog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUIBlackPassMain.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$setObservers$3", f = "GUIBlackPassMain.kt", i = {}, l = {321}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class GUIBlackPassMain$setObservers$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ GUIBlackPassMain this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GUIBlackPassMain$setObservers$3(GUIBlackPassMain gUIBlackPassMain, Continuation<? super GUIBlackPassMain$setObservers$3> continuation) {
        super(2, continuation);
        this.this$0 = gUIBlackPassMain;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GUIBlackPassMain$setObservers$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((GUIBlackPassMain$setObservers$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        BlackPassMainViewModel blackPassMainViewModel;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            blackPassMainViewModel = this.this$0.getBlackPassMainViewModel();
            SharedFlow<ObjForResultDialog> objForDialogResult = blackPassMainViewModel.getObjForDialogResult();
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            Flow flowWithLifecycle = FlowExtKt.flowWithLifecycle(objForDialogResult, lifecycle, Lifecycle.State.STARTED);
            final GUIBlackPassMain gUIBlackPassMain = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$setObservers$3.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((ObjForResultDialog) obj2, (Continuation<? super Unit>) continuation);
                }

                /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
                
                    r2 = r1.customDialog;
                 */
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(@org.jetbrains.annotations.Nullable com.blackhub.bronline.game.gui.donate.data.ObjForResultDialog r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                    /*
                        r0 = this;
                        if (r1 == 0) goto Ld
                        com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain r2 = com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.this
                        com.blackhub.bronline.game.gui.blackpass.ui.BlackPassCustomDialog r2 = com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.access$getCustomDialog$p(r2)
                        if (r2 == 0) goto Ld
                        r2.showResultDialog(r1)
                    Ld:
                        kotlin.Unit r1 = kotlin.Unit.INSTANCE
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$setObservers$3.AnonymousClass1.emit(com.blackhub.bronline.game.gui.donate.data.ObjForResultDialog, kotlin.coroutines.Continuation):java.lang.Object");
                }
            };
            this.label = 1;
            if (flowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
