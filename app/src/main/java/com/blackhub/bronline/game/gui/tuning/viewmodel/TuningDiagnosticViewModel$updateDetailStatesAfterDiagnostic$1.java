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
/* compiled from: TuningDiagnosticViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel$updateDetailStatesAfterDiagnostic$1", f = "TuningDiagnosticViewModel.kt", i = {0}, l = {213, 218, 221}, m = "invokeSuspend", n = {"finalListJson"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class TuningDiagnosticViewModel$updateDetailStatesAfterDiagnostic$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $jsonObject;
    public Object L$0;
    public int label;
    public final /* synthetic */ TuningDiagnosticViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TuningDiagnosticViewModel$updateDetailStatesAfterDiagnostic$1(JSONObject jSONObject, TuningDiagnosticViewModel tuningDiagnosticViewModel, Continuation<? super TuningDiagnosticViewModel$updateDetailStatesAfterDiagnostic$1> continuation) {
        super(2, continuation);
        this.$jsonObject = jSONObject;
        this.this$0 = tuningDiagnosticViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TuningDiagnosticViewModel$updateDetailStatesAfterDiagnostic$1(this.$jsonObject, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TuningDiagnosticViewModel$updateDetailStatesAfterDiagnostic$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009b A[RETURN] */
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
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L2e
            if (r1 == r5) goto L26
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Exception -> L17
            goto La3
        L17:
            r11 = move-exception
            goto L9c
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Exception -> L17
            goto L8f
        L26:
            java.lang.Object r1 = r10.L$0
            java.util.List r1 = (java.util.List) r1
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Exception -> L17
            goto L53
        L2e:
            kotlin.ResultKt.throwOnFailure(r11)
            org.json.JSONObject r11 = r10.$jsonObject     // Catch: java.lang.Exception -> L17
            java.lang.String r1 = "d"
            org.json.JSONArray r11 = r11.optJSONArray(r1)     // Catch: java.lang.Exception -> L17
            if (r11 == 0) goto L41
            java.util.List r11 = com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt.toMutableIntList(r11)     // Catch: java.lang.Exception -> L17
            r1 = r11
            goto L42
        L41:
            r1 = r4
        L42:
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel r11 = r10.this$0     // Catch: java.lang.Exception -> L17
            kotlinx.coroutines.flow.MutableSharedFlow r11 = com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel.access$getMutableValueOfStates$p(r11)     // Catch: java.lang.Exception -> L17
            r10.L$0 = r1     // Catch: java.lang.Exception -> L17
            r10.label = r5     // Catch: java.lang.Exception -> L17
            java.lang.Object r11 = kotlinx.coroutines.flow.FlowKt.first(r11, r10)     // Catch: java.lang.Exception -> L17
            if (r11 != r0) goto L53
            return r0
        L53:
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Exception -> L17
            if (r1 == 0) goto L8f
            int r6 = r1.size()     // Catch: java.lang.Exception -> L17
            int r7 = r11.size()     // Catch: java.lang.Exception -> L17
            if (r6 != r7) goto L8f
            int r6 = r1.size()     // Catch: java.lang.Exception -> L17
            r7 = 0
        L66:
            if (r7 >= r6) goto L7e
            java.lang.Object r8 = r11.get(r7)     // Catch: java.lang.Exception -> L17
            com.blackhub.bronline.game.gui.tuning.data.TuningDetailDiagnosticItemObj r8 = (com.blackhub.bronline.game.gui.tuning.data.TuningDetailDiagnosticItemObj) r8     // Catch: java.lang.Exception -> L17
            java.lang.Object r9 = r1.get(r7)     // Catch: java.lang.Exception -> L17
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Exception -> L17
            int r9 = r9.intValue()     // Catch: java.lang.Exception -> L17
            r8.setValueState(r9)     // Catch: java.lang.Exception -> L17
            int r7 = r7 + 1
            goto L66
        L7e:
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel r1 = r10.this$0     // Catch: java.lang.Exception -> L17
            kotlinx.coroutines.flow.MutableSharedFlow r1 = com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel.access$getMutableValueOfStates$p(r1)     // Catch: java.lang.Exception -> L17
            r10.L$0 = r4     // Catch: java.lang.Exception -> L17
            r10.label = r3     // Catch: java.lang.Exception -> L17
            java.lang.Object r11 = r1.emit(r11, r10)     // Catch: java.lang.Exception -> L17
            if (r11 != r0) goto L8f
            return r0
        L8f:
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel r11 = r10.this$0     // Catch: java.lang.Exception -> L17
            r10.L$0 = r4     // Catch: java.lang.Exception -> L17
            r10.label = r2     // Catch: java.lang.Exception -> L17
            java.lang.Object r11 = com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel.access$changeStatusOfDiagnostic(r11, r5, r10)     // Catch: java.lang.Exception -> L17
            if (r11 != r0) goto La3
            return r0
        L9c:
            com.google.firebase.crashlytics.FirebaseCrashlytics r0 = com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance()
            r0.recordException(r11)
        La3:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel$updateDetailStatesAfterDiagnostic$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
