package com.blackhub.bronline.launcher.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
/* compiled from: MainActivityViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$checkUpdate$1", f = "MainActivityViewModel.kt", i = {}, l = {224, 227, 360, 371}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class MainActivityViewModel$checkUpdate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ MainActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityViewModel$checkUpdate$1(MainActivityViewModel mainActivityViewModel, Continuation<? super MainActivityViewModel$checkUpdate$1> continuation) {
        super(2, continuation);
        this.this$0 = mainActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MainActivityViewModel$checkUpdate$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MainActivityViewModel$checkUpdate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x02b5 A[LOOP:0: B:25:0x00d7->B:34:0x02b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02b4 A[EDGE_INSN: B:35:0x02b4->B:36:0x02b4 BREAK  A[LOOP:0: B:25:0x00d7->B:34:0x02b5], SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 983
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$checkUpdate$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
