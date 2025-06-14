package com.blackhub.bronline.game.gui.tuning.ui;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel;
import java.util.List;
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
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UILayoutTuningDetailsList.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$5", f = "UILayoutTuningDetailsList.kt", i = {}, l = {264}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class UILayoutTuningDetailsList$setObservers$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ UILayoutTuningDetailsList this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UILayoutTuningDetailsList$setObservers$5(UILayoutTuningDetailsList uILayoutTuningDetailsList, Continuation<? super UILayoutTuningDetailsList$setObservers$5> continuation) {
        super(2, continuation);
        this.this$0 = uILayoutTuningDetailsList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UILayoutTuningDetailsList$setObservers$5(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UILayoutTuningDetailsList$setObservers$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        TuningDetailsListViewModel detailsListViewModel;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            detailsListViewModel = this.this$0.getDetailsListViewModel();
            StateFlow<List<Integer>> newNewAndOldDetails = detailsListViewModel.getNewNewAndOldDetails();
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            Flow flowWithLifecycle = FlowExtKt.flowWithLifecycle(newNewAndOldDetails, lifecycle, Lifecycle.State.STARTED);
            final UILayoutTuningDetailsList uILayoutTuningDetailsList = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$5.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List<Integer>) obj2, (Continuation<? super Unit>) continuation);
                }

                /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
                
                    r6 = r1.detailsAdapter;
                 */
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(@org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                    /*
                        r4 = this;
                        r6 = r5
                        java.util.Collection r6 = (java.util.Collection) r6
                        boolean r6 = r6.isEmpty()
                        r6 = r6 ^ 1
                        if (r6 == 0) goto L46
                        com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList r6 = com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList.this
                        com.blackhub.bronline.game.gui.tuning.adapters.TuningDetailsAdapter r6 = com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList.access$getDetailsAdapter$p(r6)
                        if (r6 == 0) goto L46
                        com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList r0 = com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList.this
                        r6.updateItemStatus(r5)
                        java.util.List r6 = r6.getLDetailsItems()
                        java.lang.Iterable r6 = (java.lang.Iterable) r6
                        java.util.Iterator r6 = r6.iterator()
                    L22:
                        boolean r1 = r6.hasNext()
                        if (r1 == 0) goto L40
                        java.lang.Object r1 = r6.next()
                        r2 = r1
                        com.blackhub.bronline.game.gui.tuning.data.TuneObj r2 = (com.blackhub.bronline.game.gui.tuning.data.TuneObj) r2
                        int r2 = r2.getId()
                        java.lang.Object r3 = kotlin.collections.CollectionsKt___CollectionsKt.first(r5)
                        java.lang.Number r3 = (java.lang.Number) r3
                        int r3 = r3.intValue()
                        if (r2 != r3) goto L22
                        goto L41
                    L40:
                        r1 = 0
                    L41:
                        com.blackhub.bronline.game.gui.tuning.data.TuneObj r1 = (com.blackhub.bronline.game.gui.tuning.data.TuneObj) r1
                        com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList.access$updateButtonViewForDetail(r0, r1)
                    L46:
                        kotlin.Unit r5 = kotlin.Unit.INSTANCE
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$5.AnonymousClass1.emit(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
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
