package com.blackhub.bronline.game.gui.tuning.viewmodel;

import androidx.media3.extractor.mkv.MatroskaExtractor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TuningDetailsListViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$setDetailsWithIdAndStatus$1", f = "TuningDetailsListViewModel.kt", i = {}, l = {159, MatroskaExtractor.ID_BLOCK, 164, MatroskaExtractor.ID_BLOCK_ADDITIONAL}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class TuningDetailsListViewModel$setDetailsWithIdAndStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONArray $jsonArray;
    public int label;
    public final /* synthetic */ TuningDetailsListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TuningDetailsListViewModel$setDetailsWithIdAndStatus$1(JSONArray jSONArray, TuningDetailsListViewModel tuningDetailsListViewModel, Continuation<? super TuningDetailsListViewModel$setDetailsWithIdAndStatus$1> continuation) {
        super(2, continuation);
        this.$jsonArray = jSONArray;
        this.this$0 = tuningDetailsListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TuningDetailsListViewModel$setDetailsWithIdAndStatus$1(this.$jsonArray, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TuningDetailsListViewModel$setDetailsWithIdAndStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0093 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:8:0x0014, B:14:0x0024, B:15:0x008a, B:17:0x0093, B:19:0x009b, B:22:0x0028, B:23:0x0068, B:25:0x007b, B:29:0x002f, B:31:0x0033, B:34:0x0048), top: B:2:0x000a }] */
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
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2c
            if (r1 == r5) goto L28
            if (r1 == r4) goto L28
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Exception -> L19
            goto Lad
        L19:
            r8 = move-exception
            goto La6
        L1c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L24:
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Exception -> L19
            goto L8a
        L28:
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Exception -> L19
            goto L68
        L2c:
            kotlin.ResultKt.throwOnFailure(r8)
            org.json.JSONArray r8 = r7.$jsonArray     // Catch: java.lang.Exception -> L19
            if (r8 == 0) goto L48
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel r8 = r7.this$0     // Catch: java.lang.Exception -> L19
            kotlinx.coroutines.flow.MutableSharedFlow r8 = com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel.access$getMutableDetailsWithIdAndStatus$p(r8)     // Catch: java.lang.Exception -> L19
            org.json.JSONArray r1 = r7.$jsonArray     // Catch: java.lang.Exception -> L19
            java.util.List r1 = com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt.toMutableIntList(r1)     // Catch: java.lang.Exception -> L19
            r7.label = r5     // Catch: java.lang.Exception -> L19
            java.lang.Object r8 = r8.emit(r1, r7)     // Catch: java.lang.Exception -> L19
            if (r8 != r0) goto L68
            return r0
        L48:
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel r8 = r7.this$0     // Catch: java.lang.Exception -> L19
            kotlinx.coroutines.flow.MutableSharedFlow r8 = com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel.access$getMutableDetailsWithIdAndStatus$p(r8)     // Catch: java.lang.Exception -> L19
            r1 = -1
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)     // Catch: java.lang.Exception -> L19
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)     // Catch: java.lang.Exception -> L19
            java.lang.Integer[] r1 = new java.lang.Integer[]{r6, r1}     // Catch: java.lang.Exception -> L19
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.mutableListOf(r1)     // Catch: java.lang.Exception -> L19
            r7.label = r4     // Catch: java.lang.Exception -> L19
            java.lang.Object r8 = r8.emit(r1, r7)     // Catch: java.lang.Exception -> L19
            if (r8 != r0) goto L68
            return r0
        L68:
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel r8 = r7.this$0     // Catch: java.lang.Exception -> L19
            kotlinx.coroutines.flow.MutableStateFlow r8 = com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel.access$getMutableTuneItems$p(r8)     // Catch: java.lang.Exception -> L19
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Exception -> L19
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Exception -> L19
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Exception -> L19
            r8 = r8 ^ r5
            if (r8 == 0) goto Lad
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel r8 = r7.this$0     // Catch: java.lang.Exception -> L19
            kotlinx.coroutines.flow.MutableSharedFlow r8 = com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel.access$getMutableDetailsWithIdAndStatus$p(r8)     // Catch: java.lang.Exception -> L19
            r7.label = r3     // Catch: java.lang.Exception -> L19
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.first(r8, r7)     // Catch: java.lang.Exception -> L19
            if (r8 != r0) goto L8a
            return r0
        L8a:
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Exception -> L19
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Exception -> L19
            r8 = r8 ^ r5
            if (r8 == 0) goto Lad
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel r8 = r7.this$0     // Catch: java.lang.Exception -> L19
            boolean r8 = com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel.access$getIfInitSelectors$p(r8)     // Catch: java.lang.Exception -> L19
            if (r8 != 0) goto Lad
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel r8 = r7.this$0     // Catch: java.lang.Exception -> L19
            r7.label = r2     // Catch: java.lang.Exception -> L19
            java.lang.Object r8 = com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel.access$initCurrentSelectors(r8, r7)     // Catch: java.lang.Exception -> L19
            if (r8 != r0) goto Lad
            return r0
        La6:
            com.google.firebase.crashlytics.FirebaseCrashlytics r0 = com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance()
            r0.recordException(r8)
        Lad:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$setDetailsWithIdAndStatus$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
