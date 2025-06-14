package com.blackhub.bronline.game.gui.smieditor.viewmodel;

import androidx.media3.extractor.text.cea.Cea708Decoder;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$setThirdColumn$1", f = "SmiEditorViewModel.kt", i = {0}, l = {Cea708Decoder.COMMAND_DLW, 147, 156}, m = "invokeSuspend", n = {"it"}, s = {"L$1"})
/* loaded from: classes3.dex */
public final class SmiEditorViewModel$setThirdColumn$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Object $currentObj;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ SmiEditorViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmiEditorViewModel$setThirdColumn$1(Object obj, SmiEditorViewModel smiEditorViewModel, Continuation<? super SmiEditorViewModel$setThirdColumn$1> continuation) {
        super(2, continuation);
        this.$currentObj = obj;
        this.this$0 = smiEditorViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SmiEditorViewModel$setThirdColumn$1(this.$currentObj, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SmiEditorViewModel$setThirdColumn$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0052, code lost:
    
        r8 = r6.mutableCarsAndAccessories;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a3 A[Catch: Exception -> 0x0017, TRY_LEAVE, TryCatch #0 {Exception -> 0x0017, blocks: (B:7:0x0012, B:13:0x0022, B:14:0x0099, B:16:0x00a3, B:20:0x002f, B:22:0x0092, B:24:0x0036, B:26:0x003c, B:28:0x0044, B:33:0x0052, B:35:0x0058, B:37:0x005e, B:40:0x006b, B:42:0x0073, B:44:0x007f), top: B:2:0x000a }] */
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
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L33
            if (r1 == r5) goto L27
            if (r1 == r4) goto L22
            if (r1 != r3) goto L1a
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Exception -> L17
            goto Lc4
        L17:
            r8 = move-exception
            goto Lbd
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L22:
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Exception -> L17
            goto L99
        L27:
            java.lang.Object r1 = r7.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r4 = r7.L$0
            com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel r4 = (com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel) r4
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Exception -> L17
            goto L91
        L33:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.$currentObj     // Catch: java.lang.Exception -> L17
            boolean r1 = r8 instanceof com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj     // Catch: java.lang.Exception -> L17
            if (r1 == 0) goto Lc4
            com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj r8 = (com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj) r8     // Catch: java.lang.Exception -> L17
            java.lang.Integer r8 = r8.getType()     // Catch: java.lang.Exception -> L17
            if (r8 == 0) goto L99
            java.lang.Object r1 = r7.$currentObj     // Catch: java.lang.Exception -> L17
            com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel r6 = r7.this$0     // Catch: java.lang.Exception -> L17
            int r8 = r8.intValue()     // Catch: java.lang.Exception -> L17
            if (r8 == 0) goto L6b
            r1 = 6
            if (r8 == r1) goto L52
            goto L99
        L52:
            com.blackhub.bronline.game.gui.smieditor.data.SmiList r8 = com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel.access$getMutableCarsAndAccessories$p(r6)     // Catch: java.lang.Exception -> L17
            if (r8 == 0) goto L99
            java.util.ArrayList r8 = r8.getAccessoriesList()     // Catch: java.lang.Exception -> L17
            if (r8 == 0) goto L99
            kotlinx.coroutines.flow.MutableSharedFlow r1 = com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel.access$getMutableThirdColumn$p(r6)     // Catch: java.lang.Exception -> L17
            r7.label = r4     // Catch: java.lang.Exception -> L17
            java.lang.Object r8 = r1.emit(r8, r7)     // Catch: java.lang.Exception -> L17
            if (r8 != r0) goto L99
            return r0
        L6b:
            com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj r1 = (com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj) r1     // Catch: java.lang.Exception -> L17
            java.util.List r1 = r1.getBody()     // Catch: java.lang.Exception -> L17
            if (r1 == 0) goto L99
            java.lang.Object r8 = r1.get(r2)     // Catch: java.lang.Exception -> L17
            com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj r8 = (com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj) r8     // Catch: java.lang.Exception -> L17
            java.util.List r8 = r8.getBody()     // Catch: java.lang.Exception -> L17
            if (r8 == 0) goto L92
            kotlinx.coroutines.flow.MutableSharedFlow r4 = com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel.access$getMutableThirdColumn$p(r6)     // Catch: java.lang.Exception -> L17
            r7.L$0 = r6     // Catch: java.lang.Exception -> L17
            r7.L$1 = r1     // Catch: java.lang.Exception -> L17
            r7.label = r5     // Catch: java.lang.Exception -> L17
            java.lang.Object r8 = r4.emit(r8, r7)     // Catch: java.lang.Exception -> L17
            if (r8 != r0) goto L90
            return r0
        L90:
            r4 = r6
        L91:
            r6 = r4
        L92:
            kotlinx.coroutines.flow.MutableStateFlow r8 = com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel.access$getMutableObjForNavigation$p(r6)     // Catch: java.lang.Exception -> L17
            r8.setValue(r1)     // Catch: java.lang.Exception -> L17
        L99:
            java.lang.Object r8 = r7.$currentObj     // Catch: java.lang.Exception -> L17
            com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj r8 = (com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj) r8     // Catch: java.lang.Exception -> L17
            java.util.List r8 = r8.getBody()     // Catch: java.lang.Exception -> L17
            if (r8 == 0) goto Lc4
            com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel r1 = r7.this$0     // Catch: java.lang.Exception -> L17
            java.lang.Object r8 = r8.get(r2)     // Catch: java.lang.Exception -> L17
            com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj r8 = (com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj) r8     // Catch: java.lang.Exception -> L17
            java.lang.String r8 = r8.getTitle()     // Catch: java.lang.Exception -> L17
            r2 = 0
            r7.L$0 = r2     // Catch: java.lang.Exception -> L17
            r7.L$1 = r2     // Catch: java.lang.Exception -> L17
            r7.label = r3     // Catch: java.lang.Exception -> L17
            java.lang.Object r8 = com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel.access$initTitleForThirdColumn(r1, r8, r7)     // Catch: java.lang.Exception -> L17
            if (r8 != r0) goto Lc4
            return r0
        Lbd:
            com.google.firebase.crashlytics.FirebaseCrashlytics r0 = com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance()
            r0.recordException(r8)
        Lc4:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$setThirdColumn$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
