package com.blackhub.bronline.game.gui.smieditor.viewmodel;

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
  C:\javanew\classes3.dex
 */
/* compiled from: SmiEditorViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$setSecondColumn$1", f = "SmiEditorViewModel.kt", i = {}, l = {110, 112, 116, 118}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class SmiEditorViewModel$setSecondColumn$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $currentPos;
    public int label;
    public final /* synthetic */ SmiEditorViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmiEditorViewModel$setSecondColumn$1(int i, SmiEditorViewModel smiEditorViewModel, Continuation<? super SmiEditorViewModel$setSecondColumn$1> continuation) {
        super(2, continuation);
        this.$currentPos = i;
        this.this$0 = smiEditorViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SmiEditorViewModel$setSecondColumn$1(this.$currentPos, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SmiEditorViewModel$setSecondColumn$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2d
            if (r1 == r6) goto L29
            if (r1 == r5) goto L15
            if (r1 == r4) goto L25
            if (r1 != r3) goto L1d
        L15:
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Exception -> L1a
            goto Laf
        L1a:
            r8 = move-exception
            goto La8
        L1d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L25:
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Exception -> L1a
            goto L8f
        L29:
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Exception -> L1a
            goto L55
        L2d:
            kotlin.ResultKt.throwOnFailure(r8)
            int r8 = r7.$currentPos     // Catch: java.lang.Exception -> L1a
            if (r8 != r5) goto L6e
            com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel r8 = r7.this$0     // Catch: java.lang.Exception -> L1a
            java.util.List r8 = com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel.access$getMutableBodyFromJSON$p(r8)     // Catch: java.lang.Exception -> L1a
            java.lang.Object r8 = r8.get(r6)     // Catch: java.lang.Exception -> L1a
            com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj r8 = (com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj) r8     // Catch: java.lang.Exception -> L1a
            java.util.List r8 = r8.getBody()     // Catch: java.lang.Exception -> L1a
            if (r8 == 0) goto L55
            com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel r1 = r7.this$0     // Catch: java.lang.Exception -> L1a
            kotlinx.coroutines.flow.MutableSharedFlow r1 = com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel.access$getMutableSecondColumn$p(r1)     // Catch: java.lang.Exception -> L1a
            r7.label = r6     // Catch: java.lang.Exception -> L1a
            java.lang.Object r8 = r1.emit(r8, r7)     // Catch: java.lang.Exception -> L1a
            if (r8 != r0) goto L55
            return r0
        L55:
            com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel r8 = r7.this$0     // Catch: java.lang.Exception -> L1a
            java.util.List r1 = com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel.access$getMutableBodyFromJSON$p(r8)     // Catch: java.lang.Exception -> L1a
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Exception -> L1a
            com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj r1 = (com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj) r1     // Catch: java.lang.Exception -> L1a
            java.lang.String r1 = r1.getTitle()     // Catch: java.lang.Exception -> L1a
            r7.label = r5     // Catch: java.lang.Exception -> L1a
            java.lang.Object r8 = com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel.access$initTitleForSecondColumn(r8, r1, r7)     // Catch: java.lang.Exception -> L1a
            if (r8 != r0) goto Laf
            return r0
        L6e:
            com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel r8 = r7.this$0     // Catch: java.lang.Exception -> L1a
            java.util.List r8 = com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel.access$getMutableBodyFromJSON$p(r8)     // Catch: java.lang.Exception -> L1a
            java.lang.Object r8 = r8.get(r2)     // Catch: java.lang.Exception -> L1a
            com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj r8 = (com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj) r8     // Catch: java.lang.Exception -> L1a
            java.util.List r8 = r8.getBody()     // Catch: java.lang.Exception -> L1a
            if (r8 == 0) goto L8f
            com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel r1 = r7.this$0     // Catch: java.lang.Exception -> L1a
            kotlinx.coroutines.flow.MutableSharedFlow r1 = com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel.access$getMutableSecondColumn$p(r1)     // Catch: java.lang.Exception -> L1a
            r7.label = r4     // Catch: java.lang.Exception -> L1a
            java.lang.Object r8 = r1.emit(r8, r7)     // Catch: java.lang.Exception -> L1a
            if (r8 != r0) goto L8f
            return r0
        L8f:
            com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel r8 = r7.this$0     // Catch: java.lang.Exception -> L1a
            java.util.List r1 = com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel.access$getMutableBodyFromJSON$p(r8)     // Catch: java.lang.Exception -> L1a
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L1a
            com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj r1 = (com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj) r1     // Catch: java.lang.Exception -> L1a
            java.lang.String r1 = r1.getTitle()     // Catch: java.lang.Exception -> L1a
            r7.label = r3     // Catch: java.lang.Exception -> L1a
            java.lang.Object r8 = com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel.access$initTitleForSecondColumn(r8, r1, r7)     // Catch: java.lang.Exception -> L1a
            if (r8 != r0) goto Laf
            return r0
        La8:
            com.google.firebase.crashlytics.FirebaseCrashlytics r0 = com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance()
            r0.recordException(r8)
        Laf:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$setSecondColumn$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
