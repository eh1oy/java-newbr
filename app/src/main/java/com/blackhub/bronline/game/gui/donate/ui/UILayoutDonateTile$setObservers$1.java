package com.blackhub.bronline.game.gui.donate.ui;

import android.content.Context;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.blackhub.bronline.game.gui.donate.data.DonateTileObj;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel;
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
/* compiled from: UILayoutDonateTile.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile$setObservers$1", f = "UILayoutDonateTile.kt", i = {}, l = {210}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class UILayoutDonateTile$setObservers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Context $fragmentContext;
    public int label;
    public final /* synthetic */ UILayoutDonateTile this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UILayoutDonateTile$setObservers$1(UILayoutDonateTile uILayoutDonateTile, Context context, Continuation<? super UILayoutDonateTile$setObservers$1> continuation) {
        super(2, continuation);
        this.this$0 = uILayoutDonateTile;
        this.$fragmentContext = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UILayoutDonateTile$setObservers$1(this.this$0, this.$fragmentContext, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UILayoutDonateTile$setObservers$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        DonateTileViewModel donateTileViewModel;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            donateTileViewModel = this.this$0.getDonateTileViewModel();
            SharedFlow<DonateTileObj> newCurrentItems = donateTileViewModel.getNewCurrentItems();
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            Flow flowWithLifecycle = FlowExtKt.flowWithLifecycle(newCurrentItems, lifecycle, Lifecycle.State.STARTED);
            final UILayoutDonateTile uILayoutDonateTile = this.this$0;
            final Context context = this.$fragmentContext;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile$setObservers$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((DonateTileObj) obj2, (Continuation<? super Unit>) continuation);
                }

                /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
                
                    if (r6 != r5.getItems().size()) goto L9;
                 */
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(@org.jetbrains.annotations.NotNull com.blackhub.bronline.game.gui.donate.data.DonateTileObj r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                    /*
                        r4 = this;
                        com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile r6 = com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile.this
                        com.blackhub.bronline.game.gui.donate.adapters.DonateTileAdapter r6 = com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile.access$getDonateBodyAdapter$p(r6)
                        if (r6 == 0) goto Lb
                        r6.initBodyItems(r5)
                    Lb:
                        com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile r6 = com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile.this
                        int r6 = com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile.access$getOldPage$p(r6)
                        int r0 = r5.getPage()
                        if (r6 != r0) goto L27
                        com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile r6 = com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile.this
                        int r6 = com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile.access$getOldSize$p(r6)
                        java.util.List r0 = r5.getItems()
                        int r0 = r0.size()
                        if (r6 == r0) goto L6a
                    L27:
                        com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile r6 = com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile.this
                        int r0 = r5.getPage()
                        com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile.access$setOldPage$p(r6, r0)
                        com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile r6 = com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile.this
                        java.util.List r0 = r5.getItems()
                        int r0 = r0.size()
                        com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile.access$setOldSize$p(r6, r0)
                        com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile r6 = com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile.this
                        com.blackhub.bronline.databinding.DonateTileLayoutBinding r6 = com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile.access$getBinding(r6)
                        androidx.recyclerview.widget.RecyclerView r6 = r6.mainRV
                        r0 = 0
                        r6.smoothScrollToPosition(r0)
                        java.util.List r6 = r5.getItems()
                        int r6 = r6.size()
                        double r0 = (double) r6
                        r6 = 4
                        double r2 = (double) r6
                        double r0 = r0 / r2
                        double r0 = java.lang.Math.ceil(r0)
                        int r6 = (int) r0
                        com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile r0 = com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile.this
                        com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile.access$initIndicator(r0, r6)
                        com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile r6 = com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile.this
                        int r5 = r5.getPage()
                        android.content.Context r0 = r2
                        com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile.access$initTitlePage(r6, r5, r0)
                    L6a:
                        kotlin.Unit r5 = kotlin.Unit.INSTANCE
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile$setObservers$1.AnonymousClass1.emit(com.blackhub.bronline.game.gui.donate.data.DonateTileObj, kotlin.coroutines.Continuation):java.lang.Object");
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
