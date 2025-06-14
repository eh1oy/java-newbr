package com.blackhub.bronline.game.gui.chooseserver;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
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
/* compiled from: ChooseServerGuiFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$setObservers$4", f = "ChooseServerGuiFragment.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class ChooseServerGuiFragment$setObservers$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ ChooseServerGuiFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseServerGuiFragment$setObservers$4(ChooseServerGuiFragment chooseServerGuiFragment, Continuation<? super ChooseServerGuiFragment$setObservers$4> continuation) {
        super(2, continuation);
        this.this$0 = chooseServerGuiFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ChooseServerGuiFragment$setObservers$4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ChooseServerGuiFragment$setObservers$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: ChooseServerGuiFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "counterOfRequests", "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$setObservers$4$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements FlowCollector {
        public final /* synthetic */ ChooseServerGuiFragment this$0;

        public AnonymousClass1(ChooseServerGuiFragment chooseServerGuiFragment) {
            this.this$0 = chooseServerGuiFragment;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(int r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$setObservers$4$1$emit$1
                if (r0 == 0) goto L13
                r0 = r7
                com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$setObservers$4$1$emit$1 r0 = (com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$setObservers$4$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$setObservers$4$1$emit$1 r0 = new com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$setObservers$4$1$emit$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L36
                if (r2 != r4) goto L2e
                java.lang.Object r6 = r0.L$0
                com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$setObservers$4$1 r6 = (com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$setObservers$4.AnonymousClass1) r6
                kotlin.ResultKt.throwOnFailure(r7)
                goto L5e
            L2e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L36:
                kotlin.ResultKt.throwOnFailure(r7)
                java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r6)
                boolean r7 = com.blackhub.bronline.game.core.extension.IntExtensionKt.isNotZero(r7)
                if (r7 == 0) goto L83
                com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment r7 = r5.this$0
                com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment.access$setProgress(r7, r6, r3)
                com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment r7 = r5.this$0
                int r7 = com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment.access$getTotalValueOfRequests$p(r7)
                if (r7 != r6) goto L83
                r0.L$0 = r5
                r0.label = r4
                r6 = 500(0x1f4, double:2.47E-321)
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r6, r0)
                if (r6 != r1) goto L5d
                return r1
            L5d:
                r6 = r5
            L5e:
                com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment r7 = r6.this$0
                com.blackhub.bronline.databinding.ServerSelectWithLoadProgressBinding r7 = com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment.access$getBinding(r7)
                android.widget.LinearLayout r7 = r7.chooseServerRootChoose
                r7.setVisibility(r3)
                com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment r7 = r6.this$0
                com.blackhub.bronline.databinding.ServerSelectWithLoadProgressBinding r7 = com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment.access$getBinding(r7)
                android.widget.LinearLayout r7 = r7.chooseServerRootChoose
                r0 = 1065353216(0x3f800000, float:1.0)
                r7.setAlpha(r0)
                com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment r6 = r6.this$0
                com.blackhub.bronline.databinding.ServerSelectWithLoadProgressBinding r6 = com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment.access$getBinding(r6)
                androidx.constraintlayout.widget.ConstraintLayout r6 = r6.chooseServerRootLoading
                r7 = 8
                r6.setVisibility(r7)
            L83:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$setObservers$4.AnonymousClass1.emit(int, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit(((Number) obj).intValue(), (Continuation<? super Unit>) continuation);
        }
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
            StateFlow<Integer> counterOfRequests = jniActivityViewModel.getCounterOfRequests();
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            Flow flowWithLifecycle = FlowExtKt.flowWithLifecycle(counterOfRequests, lifecycle, Lifecycle.State.STARTED);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (flowWithLifecycle.collect(anonymousClass1, this) == coroutine_suspended) {
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
