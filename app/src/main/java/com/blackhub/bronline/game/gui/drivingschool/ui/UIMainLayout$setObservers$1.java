package com.blackhub.bronline.game.gui.drivingschool.ui;

import com.blackhub.bronline.game.gui.drivingschool.data.DrivingMainType;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolMainViewModel;
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
/* compiled from: UIMainLayout.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$setObservers$1", f = "UIMainLayout.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class UIMainLayout$setObservers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ UIMainLayout this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIMainLayout$setObservers$1(UIMainLayout uIMainLayout, Continuation<? super UIMainLayout$setObservers$1> continuation) {
        super(2, continuation);
        this.this$0 = uIMainLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UIMainLayout$setObservers$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UIMainLayout$setObservers$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        DrivingSchoolMainViewModel currentViewModel;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            currentViewModel = this.this$0.getCurrentViewModel();
            StateFlow<List<DrivingMainType>> driverLicenseType = currentViewModel.getDriverLicenseType();
            final UIMainLayout uIMainLayout = this.this$0;
            FlowCollector<? super List<DrivingMainType>> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$setObservers$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List<DrivingMainType>) obj2, (Continuation<? super Unit>) continuation);
                }

                /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
                
                    r2 = r1.typeSchoolsAdapter;
                 */
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(@org.jetbrains.annotations.NotNull java.util.List<com.blackhub.bronline.game.gui.drivingschool.data.DrivingMainType> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                    /*
                        r0 = this;
                        r2 = r1
                        java.util.Collection r2 = (java.util.Collection) r2
                        boolean r2 = r2.isEmpty()
                        r2 = r2 ^ 1
                        if (r2 == 0) goto L16
                        com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout r2 = com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout.this
                        com.blackhub.bronline.game.gui.drivingschool.adapters.DrivingSchoolMainTypeAdapter r2 = com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout.access$getTypeSchoolsAdapter$p(r2)
                        if (r2 == 0) goto L16
                        r2.initItems(r1)
                    L16:
                        kotlin.Unit r1 = kotlin.Unit.INSTANCE
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$setObservers$1.AnonymousClass1.emit(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
                }
            };
            this.label = 1;
            if (driverLicenseType.collect(flowCollector, this) == coroutine_suspended) {
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
