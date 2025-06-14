package com.blackhub.bronline.game.gui.fishing;

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

/* compiled from: FishingViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.fishing.FishingViewModel$isShowTackleDescription$1", f = "FishingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nFishingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FishingViewModel.kt\ncom/blackhub/bronline/game/gui/fishing/FishingViewModel$isShowTackleDescription$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,394:1\n230#2,5:395\n*S KotlinDebug\n*F\n+ 1 FishingViewModel.kt\ncom/blackhub/bronline/game/gui/fishing/FishingViewModel$isShowTackleDescription$1\n*L\n387#1:395,5\n*E\n"})
/* loaded from: classes3.dex */
public final class FishingViewModel$isShowTackleDescription$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ boolean $isShowing;
    public int label;
    public final /* synthetic */ FishingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FishingViewModel$isShowTackleDescription$1(FishingViewModel fishingViewModel, boolean z, Continuation<? super FishingViewModel$isShowTackleDescription$1> continuation) {
        super(2, continuation);
        this.this$0 = fishingViewModel;
        this.$isShowing = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FishingViewModel$isShowTackleDescription$1(this.this$0, this.$isShowing, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FishingViewModel$isShowTackleDescription$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.blackhub.bronline.game.gui.fishing.FishingUiState.copy$default(com.blackhub.bronline.game.gui.fishing.FishingUiState, int, float, long, int, int, float, int, com.blackhub.bronline.game.gui.fishing.data.FishingBaitObj, com.blackhub.bronline.game.gui.fishing.data.FishingBaitObj, com.blackhub.bronline.game.gui.fishing.data.FishingBaitObj, int, com.blackhub.bronline.game.gui.fishing.data.enums.AudioType, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, java.lang.Object):com.blackhub.bronline.game.gui.fishing.FishingUiState
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
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r28) {
        /*
            r27 = this;
            r0 = r27
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.label
            if (r1 != 0) goto L57
            kotlin.ResultKt.throwOnFailure(r28)
            com.blackhub.bronline.game.gui.fishing.FishingViewModel r1 = r0.this$0
            kotlinx.coroutines.flow.MutableStateFlow r1 = r1.get_uiState()
            boolean r2 = r0.$isShowing
        L14:
            java.lang.Object r15 = r1.getValue()
            r22 = r15
            com.blackhub.bronline.game.gui.fishing.FishingUiState r22 = (com.blackhub.bronline.game.gui.fishing.FishingUiState) r22
            r23 = 262143(0x3ffff, float:3.6734E-40)
            r24 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r25 = r15
            r15 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r26 = r2
            r2 = r22
            r22 = r26
            com.blackhub.bronline.game.gui.fishing.FishingUiState r2 = com.blackhub.bronline.game.gui.fishing.FishingUiState.copy$default(r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r3 = r25
            boolean r2 = r1.compareAndSet(r3, r2)
            if (r2 == 0) goto L54
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L54:
            r2 = r26
            goto L14
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.fishing.FishingViewModel$isShowTackleDescription$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
