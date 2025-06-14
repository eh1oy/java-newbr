package com.blackhub.bronline.game.gui.interactionwithnpc;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: InteractionWithNpcViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcViewModel$initJson$2", f = "InteractionWithNpcViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nInteractionWithNpcViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractionWithNpcViewModel.kt\ncom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcViewModel$initJson$2\n+ 2 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 3 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,143:1\n51#2,5:144\n56#2,11:158\n8#3,9:149\n230#4,5:169\n*S KotlinDebug\n*F\n+ 1 InteractionWithNpcViewModel.kt\ncom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcViewModel$initJson$2\n*L\n50#1:144,5\n50#1:158,11\n50#1:149,9\n55#1:169,5\n*E\n"})
/* loaded from: classes3.dex */
public final class InteractionWithNpcViewModel$initJson$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ InteractionWithNpcViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractionWithNpcViewModel$initJson$2(JSONObject jSONObject, InteractionWithNpcViewModel interactionWithNpcViewModel, Continuation<? super InteractionWithNpcViewModel$initJson$2> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = interactionWithNpcViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        InteractionWithNpcViewModel$initJson$2 interactionWithNpcViewModel$initJson$2 = new InteractionWithNpcViewModel$initJson$2(this.$json, this.this$0, continuation);
        interactionWithNpcViewModel$initJson$2.L$0 = obj;
        return interactionWithNpcViewModel$initJson$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InteractionWithNpcViewModel$initJson$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0104 A[LOOP:0: B:7:0x00c0->B:9:0x0104, LOOP_END] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcViewModel$initJson$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
