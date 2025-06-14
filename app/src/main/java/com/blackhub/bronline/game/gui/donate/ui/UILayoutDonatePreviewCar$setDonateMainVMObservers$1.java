package com.blackhub.bronline.game.gui.donate.ui;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel;
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
/* compiled from: UILayoutDonatePreviewCar.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$setDonateMainVMObservers$1", f = "UILayoutDonatePreviewCar.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class UILayoutDonatePreviewCar$setDonateMainVMObservers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ UILayoutDonatePreviewCar this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UILayoutDonatePreviewCar$setDonateMainVMObservers$1(UILayoutDonatePreviewCar uILayoutDonatePreviewCar, Continuation<? super UILayoutDonatePreviewCar$setDonateMainVMObservers$1> continuation) {
        super(2, continuation);
        this.this$0 = uILayoutDonatePreviewCar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UILayoutDonatePreviewCar$setDonateMainVMObservers$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UILayoutDonatePreviewCar$setDonateMainVMObservers$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        DonateMainViewModel donateMainViewModel;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            donateMainViewModel = this.this$0.getDonateMainViewModel();
            StateFlow<Integer> colorPrice = donateMainViewModel.getColorPrice();
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            Flow flowWithLifecycle = FlowExtKt.flowWithLifecycle(colorPrice, lifecycle, Lifecycle.State.STARTED);
            final UILayoutDonatePreviewCar uILayoutDonatePreviewCar = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$setDonateMainVMObservers$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                }

                /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
                
                    r2 = r1.donateCarColorAdapter;
                 */
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(int r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                    /*
                        r0 = this;
                        com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar r2 = com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar.this
                        com.blackhub.bronline.game.gui.donate.adapters.DonateCarColorAdapter r2 = com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar.access$getDonateCarColorAdapter$p(r2)
                        if (r2 == 0) goto L14
                        com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar r2 = com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar.this
                        com.blackhub.bronline.game.gui.donate.adapters.DonateCarColorAdapter r2 = com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar.access$getDonateCarColorAdapter$p(r2)
                        if (r2 != 0) goto L11
                        goto L14
                    L11:
                        r2.setPriceForColour(r1)
                    L14:
                        kotlin.Unit r1 = kotlin.Unit.INSTANCE
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$setDonateMainVMObservers$1.AnonymousClass1.emit(int, kotlin.coroutines.Continuation):java.lang.Object");
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
