package com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel;

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
/* compiled from: EntertainmentGamesViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel$showCurrentGameTop$1", f = "EntertainmentGamesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class EntertainmentGamesViewModel$showCurrentGameTop$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Integer $gameId;
    public int label;
    public final /* synthetic */ EntertainmentGamesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntertainmentGamesViewModel$showCurrentGameTop$1(Integer num, EntertainmentGamesViewModel entertainmentGamesViewModel, Continuation<? super EntertainmentGamesViewModel$showCurrentGameTop$1> continuation) {
        super(2, continuation);
        this.$gameId = num;
        this.this$0 = entertainmentGamesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new EntertainmentGamesViewModel$showCurrentGameTop$1(this.$gameId, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((EntertainmentGamesViewModel$showCurrentGameTop$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r3) {
        /*
            r2 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r2.label
            if (r0 != 0) goto L94
            kotlin.ResultKt.throwOnFailure(r3)
            java.lang.Integer r3 = r2.$gameId
            if (r3 == 0) goto L13
        Le:
            int r3 = r3.intValue()
            goto L23
        L13:
            com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel r3 = r2.this$0
            kotlinx.coroutines.flow.MutableStateFlow r3 = com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel.access$getMutableSavedGameIdForTop$p(r3)
            java.lang.Object r3 = r3.getValue()
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L22
            goto Le
        L22:
            r3 = 0
        L23:
            com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel r0 = r2.this$0
            kotlinx.coroutines.flow.MutableStateFlow r0 = com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel.access$getMutableAllTopList$p(r0)
            r1 = 1
            if (r3 == r1) goto L79
            r1 = 2
            if (r3 == r1) goto L6c
            r1 = 3
            if (r3 == r1) goto L5f
            r1 = 4
            if (r3 == r1) goto L52
            r1 = 5
            if (r3 == r1) goto L45
            com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel r1 = r2.this$0
            kotlinx.coroutines.flow.MutableStateFlow r1 = com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel.access$getMutableTop0$p(r1)
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            goto L85
        L45:
            com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel r1 = r2.this$0
            kotlinx.coroutines.flow.MutableStateFlow r1 = com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel.access$getMutableTop5$p(r1)
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            goto L85
        L52:
            com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel r1 = r2.this$0
            kotlinx.coroutines.flow.MutableStateFlow r1 = com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel.access$getMutableTop4$p(r1)
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            goto L85
        L5f:
            com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel r1 = r2.this$0
            kotlinx.coroutines.flow.MutableStateFlow r1 = com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel.access$getMutableTop3$p(r1)
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            goto L85
        L6c:
            com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel r1 = r2.this$0
            kotlinx.coroutines.flow.MutableStateFlow r1 = com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel.access$getMutableTop2$p(r1)
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            goto L85
        L79:
            com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel r1 = r2.this$0
            kotlinx.coroutines.flow.MutableStateFlow r1 = com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel.access$getMutableTop1$p(r1)
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
        L85:
            r0.setValue(r1)
            com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel r0 = r2.this$0
            java.lang.Integer r3 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r3)
            com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel.access$createMyTopPos(r0, r3)
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L94:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel$showCurrentGameTop$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
