package com.blackhub.bronline.game.gui.entertainmentsystem.ui;

import com.blackhub.bronline.R;
import com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.FinalWindowViewModel;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUIEntertainmentSystemFinalWindow.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.entertainmentsystem.ui.GUIEntertainmentSystemFinalWindow$setObservers$1", f = "GUIEntertainmentSystemFinalWindow.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class GUIEntertainmentSystemFinalWindow$setObservers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ GUIEntertainmentSystemFinalWindow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GUIEntertainmentSystemFinalWindow$setObservers$1(GUIEntertainmentSystemFinalWindow gUIEntertainmentSystemFinalWindow, Continuation<? super GUIEntertainmentSystemFinalWindow$setObservers$1> continuation) {
        super(2, continuation);
        this.this$0 = gUIEntertainmentSystemFinalWindow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GUIEntertainmentSystemFinalWindow$setObservers$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((GUIEntertainmentSystemFinalWindow$setObservers$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        FinalWindowViewModel finalWindowViewModel;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            finalWindowViewModel = this.this$0.getFinalWindowViewModel();
            StateFlow<Boolean> isWinner = finalWindowViewModel.isWinner();
            final GUIEntertainmentSystemFinalWindow gUIEntertainmentSystemFinalWindow = this.this$0;
            FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.GUIEntertainmentSystemFinalWindow$setObservers$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                }

                @Nullable
                public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                    if (z) {
                        GUIEntertainmentSystemFinalWindow gUIEntertainmentSystemFinalWindow2 = GUIEntertainmentSystemFinalWindow.this;
                        String string = gUIEntertainmentSystemFinalWindow2.requireActivity().getString(R.string.final_window_if_winner);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        gUIEntertainmentSystemFinalWindow2.setTextStyle(string);
                    } else if (!z) {
                        GUIEntertainmentSystemFinalWindow gUIEntertainmentSystemFinalWindow3 = GUIEntertainmentSystemFinalWindow.this;
                        String string2 = gUIEntertainmentSystemFinalWindow3.requireActivity().getString(R.string.final_window_if_lose);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        gUIEntertainmentSystemFinalWindow3.setTextStyle(string2);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (isWinner.collect(flowCollector, this) == coroutine_suspended) {
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
