package com.blackhub.bronline.game.gui.holidayevents;

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
/* compiled from: HolidayEventsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$updateJson$1", f = "HolidayEventsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nHolidayEventsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$updateJson$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 5 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 6 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 7 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,1302:1\n1#2:1303\n1549#3:1304\n1620#3,3:1305\n1549#3:1313\n1620#3,3:1314\n1559#3:1347\n1590#3,4:1348\n1549#3:1357\n1620#3,3:1358\n1855#3:1386\n1856#3:1394\n1747#3,3:1395\n1747#3,3:1398\n1549#3:1401\n1620#3,3:1402\n1045#3:1405\n1045#3:1406\n230#4,5:1308\n230#4,5:1317\n230#4,5:1352\n230#4,5:1407\n230#4,5:1412\n230#4,5:1417\n51#5,5:1322\n56#5,11:1336\n51#5,5:1361\n56#5,11:1375\n8#6,9:1327\n8#6,9:1366\n1099#7:1387\n928#7,6:1388\n*S KotlinDebug\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$updateJson$1\n*L\n455#1:1304\n455#1:1305,3\n528#1:1313\n528#1:1314,3\n588#1:1347\n588#1:1348,4\n635#1:1357\n635#1:1358,3\n687#1:1386\n687#1:1394\n736#1:1395,3\n738#1:1398,3\n740#1:1401\n740#1:1402,3\n750#1:1405\n752#1:1406\n492#1:1308,5\n565#1:1317,5\n616#1:1352,5\n754#1:1407,5\n779#1:1412,5\n786#1:1417,5\n584#1:1322,5\n584#1:1336,11\n681#1:1361,5\n681#1:1375,11\n584#1:1327,9\n681#1:1366,9\n693#1:1387\n696#1:1388,6\n*E\n"})
/* loaded from: classes3.dex */
public final class HolidayEventsViewModel$updateJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $jsonObject;
    public int label;
    public final /* synthetic */ HolidayEventsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HolidayEventsViewModel$updateJson$1(JSONObject jSONObject, HolidayEventsViewModel holidayEventsViewModel, Continuation<? super HolidayEventsViewModel$updateJson$1> continuation) {
        super(2, continuation);
        this.$jsonObject = jSONObject;
        this.this$0 = holidayEventsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new HolidayEventsViewModel$updateJson$1(this.$jsonObject, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((HolidayEventsViewModel$updateJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0196  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r113) {
        /*
            Method dump skipped, instructions count: 3147
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$updateJson$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
