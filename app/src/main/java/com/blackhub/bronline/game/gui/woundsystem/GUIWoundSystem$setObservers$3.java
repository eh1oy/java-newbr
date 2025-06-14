package com.blackhub.bronline.game.gui.woundsystem;

import androidx.appcompat.widget.AppCompatButton;
import com.blackhub.bronline.game.gui.woundsystem.viewmodel.WoundSystemViewModel;
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
/* compiled from: GUIWoundSystem.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem$setObservers$3", f = "GUIWoundSystem.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class GUIWoundSystem$setObservers$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ GUIWoundSystem this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GUIWoundSystem$setObservers$3(GUIWoundSystem gUIWoundSystem, Continuation<? super GUIWoundSystem$setObservers$3> continuation) {
        super(2, continuation);
        this.this$0 = gUIWoundSystem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GUIWoundSystem$setObservers$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((GUIWoundSystem$setObservers$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        WoundSystemViewModel woundSystemViewModel;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            woundSystemViewModel = this.this$0.getWoundSystemViewModel();
            StateFlow<Boolean> isButtonHospitalBlocked = woundSystemViewModel.isButtonHospitalBlocked();
            final GUIWoundSystem gUIWoundSystem = this.this$0;
            FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem$setObservers$3.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                }

                @Nullable
                public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                    float f;
                    float f2;
                    if (z) {
                        AppCompatButton appCompatButton = GUIWoundSystem.access$getBinding(GUIWoundSystem.this).buttonNeedHospital;
                        f2 = GUIWoundSystem.this.alphaIfNotActive;
                        appCompatButton.setAlpha(f2);
                        appCompatButton.setClickable(false);
                        GUIWoundSystem.access$getBinding(GUIWoundSystem.this).woundSystemHospitalTimerGroup.setVisibility(0);
                    } else {
                        AppCompatButton appCompatButton2 = GUIWoundSystem.access$getBinding(GUIWoundSystem.this).buttonNeedHospital;
                        f = GUIWoundSystem.this.alphaIfActive;
                        appCompatButton2.setAlpha(f);
                        appCompatButton2.setClickable(true);
                        GUIWoundSystem.access$getBinding(GUIWoundSystem.this).woundSystemHospitalTimerGroup.setVisibility(4);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (isButtonHospitalBlocked.collect(flowCollector, this) == coroutine_suspended) {
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
