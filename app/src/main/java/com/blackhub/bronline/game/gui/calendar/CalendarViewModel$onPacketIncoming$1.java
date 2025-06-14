package com.blackhub.bronline.game.gui.calendar;

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
/* compiled from: CalendarViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.calendar.CalendarViewModel$onPacketIncoming$1", f = "CalendarViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCalendarViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarViewModel.kt\ncom/blackhub/bronline/game/gui/calendar/CalendarViewModel$onPacketIncoming$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,899:1\n1559#2:900\n1590#2,4:901\n1747#2,3:905\n1747#2,3:908\n1559#2:916\n1590#2,4:917\n1747#2,3:921\n1559#2:929\n1590#2,4:930\n1559#2:934\n1590#2,4:935\n1747#2,3:939\n1747#2,3:942\n230#3,5:911\n230#3,5:924\n230#3,5:945\n*S KotlinDebug\n*F\n+ 1 CalendarViewModel.kt\ncom/blackhub/bronline/game/gui/calendar/CalendarViewModel$onPacketIncoming$1\n*L\n331#1:900\n331#1:901,4\n346#1:905,3\n348#1:908,3\n360#1:916\n360#1:917,4\n379#1:921,3\n401#1:929\n401#1:930,4\n419#1:934\n419#1:935,4\n437#1:939,3\n444#1:942,3\n350#1:911,5\n383#1:924,5\n448#1:945,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CalendarViewModel$onPacketIncoming$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ CalendarViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarViewModel$onPacketIncoming$1(JSONObject jSONObject, CalendarViewModel calendarViewModel, Continuation<? super CalendarViewModel$onPacketIncoming$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = calendarViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CalendarViewModel$onPacketIncoming$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CalendarViewModel$onPacketIncoming$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0415 A[LOOP:6: B:126:0x039c->B:128:0x0415, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0575 A[EDGE_INSN: B:129:0x0575->B:102:0x0575 BREAK  A[LOOP:6: B:126:0x039c->B:128:0x0415], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v5, types: [T, java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v8, types: [T, java.util.ArrayList, java.util.Collection] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r66) {
        /*
            Method dump skipped, instructions count: 1408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.calendar.CalendarViewModel$onPacketIncoming$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
