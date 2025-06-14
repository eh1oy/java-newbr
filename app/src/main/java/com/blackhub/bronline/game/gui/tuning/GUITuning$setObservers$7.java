package com.blackhub.bronline.game.gui.tuning;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.blackhub.bronline.game.gui.tuning.data.TuneGuiNodeObj;
import com.blackhub.bronline.game.gui.tuning.ui.DialogSubmenu;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel;
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
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUITuning.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tuning.GUITuning$setObservers$7", f = "GUITuning.kt", i = {}, l = {427}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class GUITuning$setObservers$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ GUITuning this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GUITuning$setObservers$7(GUITuning gUITuning, Continuation<? super GUITuning$setObservers$7> continuation) {
        super(2, continuation);
        this.this$0 = gUITuning;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GUITuning$setObservers$7(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((GUITuning$setObservers$7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            SharedFlow<List<TuneGuiNodeObj>> newAllItemsForSubmenu = detailsListViewModel.getNewAllItemsForSubmenu();
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            Flow flowWithLifecycle = FlowExtKt.flowWithLifecycle(newAllItemsForSubmenu, lifecycle, Lifecycle.State.STARTED);
            final GUITuning gUITuning = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$setObservers$7.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List<TuneGuiNodeObj>) obj2, (Continuation<? super Unit>) continuation);
                }

                @Nullable
                public final Object emit(@NotNull List<TuneGuiNodeObj> list, @NotNull Continuation<? super Unit> continuation) {
                    TuningMainViewModel tuningViewModel;
                    TuningMainViewModel tuningViewModel2;
                    DialogSubmenu dialogSubmenu;
                    if (!list.isEmpty()) {
                        tuningViewModel2 = GUITuning.this.getTuningViewModel();
                        tuningViewModel2.setVisibleMainRoot(false);
                        dialogSubmenu = GUITuning.this.dialogSubmenu;
                        if (dialogSubmenu != null) {
                            dialogSubmenu.showSubmenu(list);
                        }
                    } else {
                        tuningViewModel = GUITuning.this.getTuningViewModel();
                        tuningViewModel.showGameWarning();
                    }
                    return Unit.INSTANCE;
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
