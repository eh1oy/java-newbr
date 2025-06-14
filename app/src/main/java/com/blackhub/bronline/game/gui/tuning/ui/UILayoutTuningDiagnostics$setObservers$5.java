package com.blackhub.bronline.game.gui.tuning.ui;

import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UILayoutTuningDiagnostics.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$setObservers$5", f = "UILayoutTuningDiagnostics.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class UILayoutTuningDiagnostics$setObservers$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ UILayoutTuningDiagnostics this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UILayoutTuningDiagnostics$setObservers$5(UILayoutTuningDiagnostics uILayoutTuningDiagnostics, Continuation<? super UILayoutTuningDiagnostics$setObservers$5> continuation) {
        super(2, continuation);
        this.this$0 = uILayoutTuningDiagnostics;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UILayoutTuningDiagnostics$setObservers$5(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UILayoutTuningDiagnostics$setObservers$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        TuningDiagnosticViewModel diagnosticViewModel;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            diagnosticViewModel = this.this$0.getDiagnosticViewModel();
            StateFlow<Boolean> newStatusOfApplyRepair = diagnosticViewModel.getNewStatusOfApplyRepair();
            final UILayoutTuningDiagnostics uILayoutTuningDiagnostics = this.this$0;
            FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$setObservers$5.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                }

                /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
                
                    r2 = r1.tuningDialogApply;
                 */
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(boolean r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                    /*
                        r1 = this;
                        if (r2 == 0) goto L14
                        com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics r2 = com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics.this
                        com.blackhub.bronline.game.gui.tuning.ui.TuningDialogApply r2 = com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics.access$getTuningDialogApply$p(r2)
                        if (r2 == 0) goto L14
                        com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics r3 = com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics.this
                        int r3 = com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics.access$getDetailsCost$p(r3)
                        r0 = 0
                        r2.showDialogApply(r0, r3, r0)
                    L14:
                        kotlin.Unit r2 = kotlin.Unit.INSTANCE
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$setObservers$5.AnonymousClass1.emit(boolean, kotlin.coroutines.Continuation):java.lang.Object");
                }
            };
            this.label = 1;
            if (newStatusOfApplyRepair.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
