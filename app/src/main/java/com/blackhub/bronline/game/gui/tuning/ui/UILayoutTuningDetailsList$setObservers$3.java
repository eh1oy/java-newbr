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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$3", f = "UILayoutTuningDetailsList.kt", i = {}, l = {228}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class UILayoutTuningDetailsList$setObservers$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ UILayoutTuningDetailsList this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UILayoutTuningDetailsList$setObservers$3(UILayoutTuningDetailsList uILayoutTuningDetailsList, Continuation<? super UILayoutTuningDetailsList$setObservers$3> continuation) {
        super(2, continuation);
        this.this$0 = uILayoutTuningDetailsList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UILayoutTuningDetailsList$setObservers$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UILayoutTuningDetailsList$setObservers$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            StateFlow<List<Integer>> newNewAndOldVinyls = detailsListViewModel.getNewNewAndOldVinyls();
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            Flow flowWithLifecycle = FlowExtKt.flowWithLifecycle(newNewAndOldVinyls, lifecycle, Lifecycle.State.STARTED);
            final UILayoutTuningDetailsList uILayoutTuningDetailsList = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$3.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List<Integer>) obj2, (Continuation<? super Unit>) continuation);
                }

                /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
                
                    r5 = r1.tuningVinylsAdapter;
                 */
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(@org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                    /*
                        r3 = this;
                        r5 = r4
                        java.util.Collection r5 = (java.util.Collection) r5
                        boolean r5 = r5.isEmpty()
                        r5 = r5 ^ 1
                        if (r5 == 0) goto L3c
                        com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList r5 = com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList.this
                        com.blackhub.bronline.game.gui.tuning.adapters.TuningVinylsAdapter r5 = com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList.access$getTuningVinylsAdapter$p(r5)
                        if (r5 == 0) goto L3c
                        com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList r0 = com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList.this
                        r5.updateStartVinyl(r4)
                        java.lang.Object r1 = kotlin.collections.CollectionsKt___CollectionsKt.first(r4)
                        java.lang.Number r1 = (java.lang.Number) r1
                        int r1 = r1.intValue()
                        r2 = -1
                        if (r1 == r2) goto L3c
                        java.util.List r5 = r5.getTuneVinylObjs()
                        java.lang.Object r4 = kotlin.collections.CollectionsKt___CollectionsKt.first(r4)
                        java.lang.Number r4 = (java.lang.Number) r4
                        int r4 = r4.intValue()
                        java.lang.Object r4 = r5.get(r4)
                        com.blackhub.bronline.game.gui.tuning.data.TuneVinylsObj r4 = (com.blackhub.bronline.game.gui.tuning.data.TuneVinylsObj) r4
                        com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList.access$updateButtonViewForVinyl(r0, r4)
                    L3c:
                        kotlin.Unit r4 = kotlin.Unit.INSTANCE
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$3.AnonymousClass1.emit(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
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
