package com.blackhub.bronline.game.gui.cases;

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

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CasesViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$onPacketIncoming$1", f = "CasesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onPacketIncoming$1\n+ 2 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 3 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1945:1\n51#2,5:1946\n56#2,11:1960\n51#2,5:1986\n56#2,11:2000\n51#2,5:2011\n56#2,11:2025\n8#3,9:1951\n8#3,9:1991\n8#3,9:2016\n230#4,5:1971\n230#4,5:1976\n230#4,5:1981\n230#4,5:2036\n230#4,5:2041\n230#4,5:2050\n1549#5:2046\n1620#5,3:2047\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onPacketIncoming$1\n*L\n468#1:1946,5\n468#1:1960,11\n576#1:1986,5\n576#1:2000,11\n579#1:2011,5\n579#1:2025,11\n468#1:1951,9\n576#1:1991,9\n579#1:2016,9\n492#1:1971,5\n527#1:1976,5\n555#1:1981,5\n608#1:2036,5\n640#1:2041,5\n662#1:2050,5\n654#1:2046\n654#1:2047,3\n*E\n"})
/* loaded from: classes3.dex */
public final class CasesViewModel$onPacketIncoming$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ CasesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CasesViewModel$onPacketIncoming$1(JSONObject jSONObject, CasesViewModel casesViewModel, Continuation<? super CasesViewModel$onPacketIncoming$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = casesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CasesViewModel$onPacketIncoming$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CasesViewModel$onPacketIncoming$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0411 A[LOOP:3: B:60:0x0378->B:62:0x0411, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x076c A[EDGE_INSN: B:63:0x076c->B:30:0x076c BREAK  A[LOOP:3: B:60:0x0378->B:62:0x0411], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x027c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r90) {
        /*
            Method dump skipped, instructions count: 1913
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.cases.CasesViewModel$onPacketIncoming$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
