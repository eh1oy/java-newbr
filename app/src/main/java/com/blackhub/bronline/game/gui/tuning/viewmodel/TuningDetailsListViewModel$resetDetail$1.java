package com.blackhub.bronline.game.gui.tuning.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TuningDetailsListViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$resetDetail$1", f = "TuningDetailsListViewModel.kt", i = {0, 1, 1, 2}, l = {371, 379, 385}, m = "invokeSuspend", n = {"oldDetailId", "allItems", "oldDetailId", "oldDetailId"}, s = {"I$0", "L$0", "I$0", "I$0"})
/* loaded from: classes3.dex */
public final class TuningDetailsListViewModel$resetDetail$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int I$0;
    public Object L$0;
    public int label;
    public final /* synthetic */ TuningDetailsListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TuningDetailsListViewModel$resetDetail$1(JSONObject jSONObject, TuningDetailsListViewModel tuningDetailsListViewModel, Continuation<? super TuningDetailsListViewModel$resetDetail$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = tuningDetailsListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TuningDetailsListViewModel$resetDetail$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TuningDetailsListViewModel$resetDetail$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.label
            r2 = 0
            r3 = -1
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L35
            if (r1 == r6) goto L2f
            if (r1 == r5) goto L25
            if (r1 != r4) goto L1d
            int r0 = r10.I$0
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Exception -> L1a
            goto L9d
        L1a:
            r11 = move-exception
            goto Laf
        L1d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L25:
            int r1 = r10.I$0
            java.lang.Object r3 = r10.L$0
            java.util.List r3 = (java.util.List) r3
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Exception -> L1a
            goto L89
        L2f:
            int r1 = r10.I$0
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Exception -> L1a
            goto L54
        L35:
            kotlin.ResultKt.throwOnFailure(r11)
            org.json.JSONObject r11 = r10.$json     // Catch: java.lang.Exception -> L1a
            java.lang.String r1 = "r"
            int r1 = r11.optInt(r1)     // Catch: java.lang.Exception -> L1a
            if (r1 == r3) goto Lb6
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel r11 = r10.this$0     // Catch: java.lang.Exception -> L1a
            kotlinx.coroutines.flow.MutableSharedFlow r11 = com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel.access$getMutableDetailsList$p(r11)     // Catch: java.lang.Exception -> L1a
            r10.I$0 = r1     // Catch: java.lang.Exception -> L1a
            r10.label = r6     // Catch: java.lang.Exception -> L1a
            java.lang.Object r11 = kotlinx.coroutines.flow.FlowKt.first(r11, r10)     // Catch: java.lang.Exception -> L1a
            if (r11 != r0) goto L54
            return r0
        L54:
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Exception -> L1a
            r7 = r11
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: java.lang.Exception -> L1a
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Exception -> L1a
        L5d:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Exception -> L1a
            if (r8 == 0) goto L71
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Exception -> L1a
            r9 = r8
            com.blackhub.bronline.game.gui.tuning.data.TuneObj r9 = (com.blackhub.bronline.game.gui.tuning.data.TuneObj) r9     // Catch: java.lang.Exception -> L1a
            int r9 = r9.getId()     // Catch: java.lang.Exception -> L1a
            if (r9 != r1) goto L5d
            goto L72
        L71:
            r8 = r2
        L72:
            com.blackhub.bronline.game.gui.tuning.data.TuneObj r8 = (com.blackhub.bronline.game.gui.tuning.data.TuneObj) r8     // Catch: java.lang.Exception -> L1a
            if (r8 == 0) goto L79
            r8.setThisLocation(r6)     // Catch: java.lang.Exception -> L1a
        L79:
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel r6 = r10.this$0     // Catch: java.lang.Exception -> L1a
            r10.L$0 = r11     // Catch: java.lang.Exception -> L1a
            r10.I$0 = r1     // Catch: java.lang.Exception -> L1a
            r10.label = r5     // Catch: java.lang.Exception -> L1a
            java.lang.Object r3 = com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel.access$updateDetailInfo(r6, r3, r1, r5, r10)     // Catch: java.lang.Exception -> L1a
            if (r3 != r0) goto L88
            return r0
        L88:
            r3 = r11
        L89:
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel r11 = r10.this$0     // Catch: java.lang.Exception -> L1a
            kotlinx.coroutines.flow.MutableSharedFlow r11 = com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel.access$getMutableDetailsList$p(r11)     // Catch: java.lang.Exception -> L1a
            r10.L$0 = r2     // Catch: java.lang.Exception -> L1a
            r10.I$0 = r1     // Catch: java.lang.Exception -> L1a
            r10.label = r4     // Catch: java.lang.Exception -> L1a
            java.lang.Object r11 = r11.emit(r3, r10)     // Catch: java.lang.Exception -> L1a
            if (r11 != r0) goto L9c
            return r0
        L9c:
            r0 = r1
        L9d:
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel r11 = r10.this$0     // Catch: java.lang.Exception -> L1a
            kotlinx.coroutines.flow.MutableStateFlow r11 = com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel.access$getMutableNewAndOldDetails$p(r11)     // Catch: java.lang.Exception -> L1a
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)     // Catch: java.lang.Exception -> L1a
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsJVMKt.listOf(r0)     // Catch: java.lang.Exception -> L1a
            r11.setValue(r0)     // Catch: java.lang.Exception -> L1a
            goto Lb6
        Laf:
            com.google.firebase.crashlytics.FirebaseCrashlytics r0 = com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance()
            r0.recordException(r11)
        Lb6:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$resetDetail$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
