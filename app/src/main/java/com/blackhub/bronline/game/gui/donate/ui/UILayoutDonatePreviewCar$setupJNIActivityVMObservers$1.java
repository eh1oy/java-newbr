package com.blackhub.bronline.game.gui.donate.ui;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.blackhub.bronline.game.core.model.ConfigurationJsonModel;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$setupJNIActivityVMObservers$1", f = "UILayoutDonatePreviewCar.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class UILayoutDonatePreviewCar$setupJNIActivityVMObservers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ UILayoutDonatePreviewCar this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UILayoutDonatePreviewCar$setupJNIActivityVMObservers$1(UILayoutDonatePreviewCar uILayoutDonatePreviewCar, Continuation<? super UILayoutDonatePreviewCar$setupJNIActivityVMObservers$1> continuation) {
        super(2, continuation);
        this.this$0 = uILayoutDonatePreviewCar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UILayoutDonatePreviewCar$setupJNIActivityVMObservers$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UILayoutDonatePreviewCar$setupJNIActivityVMObservers$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        JNIActivityViewModel jniActivityViewModel;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            jniActivityViewModel = this.this$0.getJniActivityViewModel();
            StateFlow<ConfigurationJsonModel> configurationJsons = jniActivityViewModel.getConfigurationJsons();
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            Flow flowWithLifecycle = FlowExtKt.flowWithLifecycle(configurationJsons, lifecycle, Lifecycle.State.STARTED);
            final UILayoutDonatePreviewCar uILayoutDonatePreviewCar = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$setupJNIActivityVMObservers$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((ConfigurationJsonModel) obj2, (Continuation<? super Unit>) continuation);
                }

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
                
                    r5 = r1.donateCarColorAdapter;
                 */
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(@org.jetbrains.annotations.NotNull com.blackhub.bronline.game.core.model.ConfigurationJsonModel r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                    /*
                        r3 = this;
                        java.util.List r4 = r4.getCarColorItems()
                        r5 = r4
                        java.util.Collection r5 = (java.util.Collection) r5
                        boolean r5 = r5.isEmpty()
                        r0 = 1
                        r5 = r5 ^ r0
                        if (r5 == 0) goto L30
                        r5 = r4
                        java.lang.Iterable r5 = (java.lang.Iterable) r5
                        java.util.Iterator r5 = r5.iterator()
                    L16:
                        boolean r1 = r5.hasNext()
                        r2 = 0
                        if (r1 == 0) goto L27
                        java.lang.Object r1 = r5.next()
                        com.blackhub.bronline.game.gui.donate.data.CarColorItem r1 = (com.blackhub.bronline.game.gui.donate.data.CarColorItem) r1
                        r1.setSelected(r2)
                        goto L16
                    L27:
                        java.lang.Object r5 = r4.get(r2)
                        com.blackhub.bronline.game.gui.donate.data.CarColorItem r5 = (com.blackhub.bronline.game.gui.donate.data.CarColorItem) r5
                        r5.setSelected(r0)
                    L30:
                        com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar r5 = com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar.this
                        com.blackhub.bronline.game.gui.donate.adapters.DonateCarColorAdapter r5 = com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar.access$getDonateCarColorAdapter$p(r5)
                        if (r5 == 0) goto L44
                        com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar r5 = com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar.this
                        com.blackhub.bronline.game.gui.donate.adapters.DonateCarColorAdapter r5 = com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar.access$getDonateCarColorAdapter$p(r5)
                        if (r5 != 0) goto L41
                        goto L44
                    L41:
                        r5.setCarColors(r4)
                    L44:
                        kotlin.Unit r4 = kotlin.Unit.INSTANCE
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$setupJNIActivityVMObservers$1.AnonymousClass1.emit(com.blackhub.bronline.game.core.model.ConfigurationJsonModel, kotlin.coroutines.Continuation):java.lang.Object");
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
