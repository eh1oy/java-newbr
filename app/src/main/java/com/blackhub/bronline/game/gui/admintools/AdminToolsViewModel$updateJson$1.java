package com.blackhub.bronline.game.gui.admintools;

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
/* compiled from: AdminToolsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$updateJson$1", f = "AdminToolsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nAdminToolsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$updateJson$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 4 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,467:1\n230#2,5:468\n230#2,5:473\n230#2,5:503\n230#2,5:508\n230#2,5:513\n230#2,5:519\n230#2,5:524\n230#2,5:529\n230#2,5:534\n230#2,5:539\n51#3,5:478\n56#3,11:492\n8#4,9:483\n1#5:518\n*S KotlinDebug\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$updateJson$1\n*L\n111#1:468,5\n119#1:473,5\n136#1:503,5\n150#1:508,5\n165#1:513,5\n186#1:519,5\n205#1:524,5\n219#1:529,5\n229#1:534,5\n241#1:539,5\n134#1:478,5\n134#1:492,11\n134#1:483,9\n*E\n"})
/* loaded from: classes3.dex */
public final class AdminToolsViewModel$updateJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ AdminToolsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdminToolsViewModel$updateJson$1(JSONObject jSONObject, AdminToolsViewModel adminToolsViewModel, Continuation<? super AdminToolsViewModel$updateJson$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = adminToolsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AdminToolsViewModel$updateJson$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AdminToolsViewModel$updateJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0467 A[LOOP:9: B:77:0x0432->B:79:0x0467, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x046b A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$updateJson$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
