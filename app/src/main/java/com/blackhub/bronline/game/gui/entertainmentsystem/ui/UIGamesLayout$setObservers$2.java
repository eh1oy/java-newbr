package com.blackhub.bronline.game.gui.entertainmentsystem.ui;

import com.blackhub.bronline.game.gui.entertainmentsystem.adapters.EntertainmentSystemActionsAdapter;
import com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel;
import java.util.List;
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
/* compiled from: UIGamesLayout.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$setObservers$2", f = "UIGamesLayout.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class UIGamesLayout$setObservers$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ UIGamesLayout this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIGamesLayout$setObservers$2(UIGamesLayout uIGamesLayout, Continuation<? super UIGamesLayout$setObservers$2> continuation) {
        super(2, continuation);
        this.this$0 = uIGamesLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UIGamesLayout$setObservers$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UIGamesLayout$setObservers$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        EntertainmentGamesViewModel gamesViewModel;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            gamesViewModel = this.this$0.getGamesViewModel();
            StateFlow<List<Integer>> allQueue = gamesViewModel.getAllQueue();
            final UIGamesLayout uIGamesLayout = this.this$0;
            FlowCollector<? super List<Integer>> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$setObservers$2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List<Integer>) obj2, (Continuation<? super Unit>) continuation);
                }

                @Nullable
                public final Object emit(@NotNull List<Integer> list, @NotNull Continuation<? super Unit> continuation) {
                    EntertainmentSystemActionsAdapter entertainmentSystemActionsAdapter;
                    entertainmentSystemActionsAdapter = UIGamesLayout.this.gamesAdapter;
                    if (entertainmentSystemActionsAdapter != null) {
                        entertainmentSystemActionsAdapter.updateQueue(list);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (allQueue.collect(flowCollector, this) == coroutine_suspended) {
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
