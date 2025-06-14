package com.blackhub.bronline.game.gui.craft;

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
/* compiled from: CraftViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$sendCloseScreen$1", f = "CraftViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$sendCloseScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1753:1\n230#2,5:1754\n*S KotlinDebug\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$sendCloseScreen$1\n*L\n855#1:1754,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CraftViewModel$sendCloseScreen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ CraftViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CraftViewModel$sendCloseScreen$1(CraftViewModel craftViewModel, Continuation<? super CraftViewModel$sendCloseScreen$1> continuation) {
        super(2, continuation);
        this.this$0 = craftViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CraftViewModel$sendCloseScreen$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CraftViewModel$sendCloseScreen$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.blackhub.bronline.game.gui.craft.CraftUiState.copy$default(com.blackhub.bronline.game.gui.craft.CraftUiState, com.blackhub.bronline.game.gui.craft.enums.CraftScreenTypeEnum, com.blackhub.bronline.game.gui.craft.model.CraftScreenTypeObject, com.blackhub.bronline.game.gui.craft.model.CraftItemTextBlock, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, int, int, int, boolean, int, java.util.Map, java.util.List, java.util.List, java.util.List, android.graphics.Bitmap, com.blackhub.bronline.game.gui.craft.model.ButtonAnimatedAttachment, boolean, boolean, boolean, boolean, boolean, boolean, boolean, com.blackhub.bronline.game.gui.craft.model.CraftElement, java.util.List, java.util.List, com.blackhub.bronline.game.core.utils.attachment.main.CommonButtonCategory, java.util.List, java.lang.String, com.blackhub.bronline.game.gui.craft.model.CraftCraftingControl, int, int, boolean, com.blackhub.bronline.game.gui.craft.model.CraftDialogConfirmationAttachment, boolean, java.util.List, boolean, int, int, java.lang.Object):com.blackhub.bronline.game.gui.craft.CraftUiState
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:79)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:49)
        Caused by: java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList.removeIf(ArrayList.java:1685)
        	at java.base/java.util.ArrayList.removeIf(ArrayList.java:1660)
        	at jadx.core.dex.instructions.args.SSAVar.removeUse(SSAVar.java:141)
        	at jadx.core.dex.instructions.args.SSAVar.use(SSAVar.java:134)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:92)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1122)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1131)
        	at jadx.core.dex.visitors.InlineMethods.inlineMethod(InlineMethods.java:118)
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:77)
        	... 1 more
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r50) {
        /*
            r49 = this;
            r0 = r49
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.label
            if (r1 != 0) goto L7e
            kotlin.ResultKt.throwOnFailure(r50)
            com.blackhub.bronline.game.gui.craft.CraftViewModel r1 = r0.this$0
            com.blackhub.bronline.game.gui.craft.CraftActionWithJSON r1 = com.blackhub.bronline.game.gui.craft.CraftViewModel.access$getActionWithJSON$p(r1)
            r1.sendCloseScreen()
            com.blackhub.bronline.game.gui.craft.CraftViewModel r1 = r0.this$0
            kotlinx.coroutines.flow.MutableStateFlow r1 = r1.get_uiState()
        L1b:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            com.blackhub.bronline.game.gui.craft.CraftUiState r3 = (com.blackhub.bronline.game.gui.craft.CraftUiState) r3
            r47 = 1023(0x3ff, float:1.434E-42)
            r48 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 1
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = -67108865(0xfffffffffbffffff, float:-2.6584558E36)
            com.blackhub.bronline.game.gui.craft.CraftUiState r3 = com.blackhub.bronline.game.gui.craft.CraftUiState.copy$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            boolean r2 = r1.compareAndSet(r2, r3)
            if (r2 == 0) goto L1b
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L7e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.craft.CraftViewModel$sendCloseScreen$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
