package com.blackhub.bronline.game.gui.electric.ui;

import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: RaiseChargeFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$startPulseImageCharge$1", f = "RaiseChargeFragment.kt", i = {0, 1}, l = {306, 309}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
public final class RaiseChargeFragment$startPulseImageCharge$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ AppCompatImageView $imageView;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ RaiseChargeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RaiseChargeFragment$startPulseImageCharge$1(RaiseChargeFragment raiseChargeFragment, AppCompatImageView appCompatImageView, Continuation<? super RaiseChargeFragment$startPulseImageCharge$1> continuation) {
        super(2, continuation);
        this.this$0 = raiseChargeFragment;
        this.$imageView = appCompatImageView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        RaiseChargeFragment$startPulseImageCharge$1 raiseChargeFragment$startPulseImageCharge$1 = new RaiseChargeFragment$startPulseImageCharge$1(this.this$0, this.$imageView, continuation);
        raiseChargeFragment$startPulseImageCharge$1.L$0 = obj;
        return raiseChargeFragment$startPulseImageCharge$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((RaiseChargeFragment$startPulseImageCharge$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0058 -> B:6:0x0015). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L27
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.throwOnFailure(r9)
        L15:
            r9 = r1
            goto L2e
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L4e
        L27:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
        L2e:
            boolean r1 = kotlinx.coroutines.CoroutineScopeKt.isActive(r9)
            if (r1 == 0) goto L5b
            kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
            com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$startPulseImageCharge$1$1 r4 = new com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$startPulseImageCharge$1$1
            com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment r5 = r8.this$0
            androidx.appcompat.widget.AppCompatImageView r6 = r8.$imageView
            r7 = 0
            r4.<init>(r5, r6, r7)
            r8.L$0 = r9
            r8.label = r3
            java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r1, r4, r8)
            if (r1 != r0) goto L4d
            return r0
        L4d:
            r1 = r9
        L4e:
            r8.L$0 = r1
            r8.label = r2
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r4, r8)
            if (r9 != r0) goto L15
            return r0
        L5b:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$startPulseImageCharge$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: RaiseChargeFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$startPulseImageCharge$1$1", f = "RaiseChargeFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$startPulseImageCharge$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ AppCompatImageView $imageView;
        public int label;
        public final /* synthetic */ RaiseChargeFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RaiseChargeFragment raiseChargeFragment, AppCompatImageView appCompatImageView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = raiseChargeFragment;
            this.$imageView = appCompatImageView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$imageView, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.animateImageCharge(this.$imageView);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
