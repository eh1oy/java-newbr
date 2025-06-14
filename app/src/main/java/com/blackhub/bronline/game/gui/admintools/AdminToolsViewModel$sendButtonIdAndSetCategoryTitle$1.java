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

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: AdminToolsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendButtonIdAndSetCategoryTitle$1", f = "AdminToolsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nAdminToolsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$sendButtonIdAndSetCategoryTitle$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,467:1\n230#2,5:468\n230#2,5:473\n*S KotlinDebug\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$sendButtonIdAndSetCategoryTitle$1\n*L\n309#1:468,5\n317#1:473,5\n*E\n"})
/* loaded from: classes3.dex */
public final class AdminToolsViewModel$sendButtonIdAndSetCategoryTitle$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $buttonId;
    public final /* synthetic */ String $categoryTitle;
    public final /* synthetic */ int $screenType;
    public int label;
    public final /* synthetic */ AdminToolsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdminToolsViewModel$sendButtonIdAndSetCategoryTitle$1(AdminToolsViewModel adminToolsViewModel, int i, int i2, String str, Continuation<? super AdminToolsViewModel$sendButtonIdAndSetCategoryTitle$1> continuation) {
        super(2, continuation);
        this.this$0 = adminToolsViewModel;
        this.$screenType = i;
        this.$buttonId = i2;
        this.$categoryTitle = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AdminToolsViewModel$sendButtonIdAndSetCategoryTitle$1(this.this$0, this.$screenType, this.$buttonId, this.$categoryTitle, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AdminToolsViewModel$sendButtonIdAndSetCategoryTitle$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r1 != 7) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.label
            if (r1 != 0) goto L9e
            kotlin.ResultKt.throwOnFailure(r25)
            com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel r1 = r0.this$0
            com.blackhub.bronline.game.gui.admintools.AdminToolsActionWithJSON r1 = com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel.access$getActionWithJSON$p(r1)
            int r2 = r0.$screenType
            int r3 = r0.$buttonId
            r1.sendButtonId(r2, r3)
            int r1 = r0.$screenType
            r2 = 1
            if (r1 == r2) goto L61
            r2 = 6
            if (r1 == r2) goto L26
            r2 = 7
            if (r1 == r2) goto L61
            goto L98
        L26:
            com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel r1 = r0.this$0
            kotlinx.coroutines.flow.MutableStateFlow r1 = r1.get_uiState()
            java.lang.String r10 = r0.$categoryTitle
        L2e:
            java.lang.Object r15 = r1.getValue()
            r2 = r15
            com.blackhub.bronline.game.gui.admintools.AdminToolsUiState r2 = (com.blackhub.bronline.game.gui.admintools.AdminToolsUiState) r2
            r19 = 65407(0xff7f, float:9.1655E-41)
            r20 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r21 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r22 = r10
            com.blackhub.bronline.game.gui.admintools.AdminToolsUiState r2 = com.blackhub.bronline.game.gui.admintools.AdminToolsUiState.copy$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r3 = r21
            boolean r2 = r1.compareAndSet(r3, r2)
            if (r2 == 0) goto L5e
            goto L98
        L5e:
            r10 = r22
            goto L2e
        L61:
            com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel r1 = r0.this$0
            kotlinx.coroutines.flow.MutableStateFlow r1 = r1.get_uiState()
            int r11 = r0.$buttonId
        L69:
            java.lang.Object r15 = r1.getValue()
            r2 = r15
            com.blackhub.bronline.game.gui.admintools.AdminToolsUiState r2 = (com.blackhub.bronline.game.gui.admintools.AdminToolsUiState) r2
            r19 = 65279(0xfeff, float:9.1475E-41)
            r20 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r23 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r21 = r11
            com.blackhub.bronline.game.gui.admintools.AdminToolsUiState r2 = com.blackhub.bronline.game.gui.admintools.AdminToolsUiState.copy$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r3 = r23
            boolean r2 = r1.compareAndSet(r3, r2)
            if (r2 == 0) goto L9b
        L98:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L9b:
            r11 = r21
            goto L69
        L9e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendButtonIdAndSetCategoryTitle$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
