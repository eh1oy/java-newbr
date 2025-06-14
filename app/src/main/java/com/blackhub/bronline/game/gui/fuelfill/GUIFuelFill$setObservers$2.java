package com.blackhub.bronline.game.gui.fuelfill;

import com.blackhub.bronline.game.gui.fuelfill.viewmodel.FuelFillViewModel;
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
/* compiled from: GUIFuelFill.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill$setObservers$2", f = "GUIFuelFill.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class GUIFuelFill$setObservers$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ GUIFuelFill this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GUIFuelFill$setObservers$2(GUIFuelFill gUIFuelFill, Continuation<? super GUIFuelFill$setObservers$2> continuation) {
        super(2, continuation);
        this.this$0 = gUIFuelFill;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GUIFuelFill$setObservers$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((GUIFuelFill$setObservers$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        FuelFillViewModel fuelFillViewModel;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            fuelFillViewModel = this.this$0.getFuelFillViewModel();
            StateFlow<String> currentTypeOfFuel = fuelFillViewModel.getCurrentTypeOfFuel();
            final GUIFuelFill gUIFuelFill = this.this$0;
            FlowCollector<? super String> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill$setObservers$2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((String) obj2, (Continuation<? super Unit>) continuation);
                }

                @Nullable
                public final Object emit(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
                    GUIFuelFill.access$getBinding(GUIFuelFill.this).fflRecommendFuel.setText(str);
                    GUIFuelFill.this.updatePrice();
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (currentTypeOfFuel.collect(flowCollector, this) == coroutine_suspended) {
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
