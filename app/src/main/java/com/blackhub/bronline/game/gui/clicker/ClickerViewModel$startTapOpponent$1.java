package com.blackhub.bronline.game.gui.clicker;

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
/* compiled from: ClickerViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.clicker.ClickerViewModel$startTapOpponent$1", f = "ClickerViewModel.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nClickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickerViewModel.kt\ncom/blackhub/bronline/game/gui/clicker/ClickerViewModel$startTapOpponent$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,204:1\n230#2,5:205\n230#2,5:210\n*S KotlinDebug\n*F\n+ 1 ClickerViewModel.kt\ncom/blackhub/bronline/game/gui/clicker/ClickerViewModel$startTapOpponent$1\n*L\n165#1:205,5\n172#1:210,5\n*E\n"})
/* loaded from: classes3.dex */
public final class ClickerViewModel$startTapOpponent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ ClickerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickerViewModel$startTapOpponent$1(ClickerViewModel clickerViewModel, Continuation<? super ClickerViewModel$startTapOpponent$1> continuation) {
        super(2, continuation);
        this.this$0 = clickerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ClickerViewModel$startTapOpponent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ClickerViewModel$startTapOpponent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0058  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0032 -> B:5:0x0035). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L19
            if (r2 != r3) goto L11
            kotlin.ResultKt.throwOnFailure(r21)
            goto L35
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L19:
            kotlin.ResultKt.throwOnFailure(r21)
        L1c:
            com.blackhub.bronline.game.gui.clicker.ClickerViewModel r2 = r0.this$0
            kotlinx.coroutines.flow.StateFlow r2 = r2.getUiState()
            java.lang.Object r2 = r2.getValue()
            com.blackhub.bronline.game.gui.clicker.ClickerUiState r2 = (com.blackhub.bronline.game.gui.clicker.ClickerUiState) r2
            long r4 = r2.getDelayBitOpponentInMilliseconds()
            r0.label = r3
            java.lang.Object r2 = kotlinx.coroutines.DelayKt.delay(r4, r0)
            if (r2 != r1) goto L35
            return r1
        L35:
            com.blackhub.bronline.game.gui.clicker.ClickerViewModel r2 = r0.this$0
            kotlinx.coroutines.flow.StateFlow r2 = r2.getUiState()
            java.lang.Object r2 = r2.getValue()
            com.blackhub.bronline.game.gui.clicker.ClickerUiState r2 = (com.blackhub.bronline.game.gui.clicker.ClickerUiState) r2
            int r2 = r2.getCurrentProgress()
            com.blackhub.bronline.game.gui.clicker.ClickerViewModel r4 = r0.this$0
            kotlinx.coroutines.flow.StateFlow r4 = r4.getUiState()
            java.lang.Object r4 = r4.getValue()
            com.blackhub.bronline.game.gui.clicker.ClickerUiState r4 = (com.blackhub.bronline.game.gui.clicker.ClickerUiState) r4
            int r4 = r4.getValueOfPercentPerClick()
            int r2 = r2 - r4
            if (r2 > 0) goto L8d
            com.blackhub.bronline.game.gui.clicker.ClickerViewModel r4 = r0.this$0
            com.blackhub.bronline.game.gui.clicker.ClickerViewModel.access$gameOver(r4, r3)
            com.blackhub.bronline.game.gui.clicker.ClickerViewModel r4 = r0.this$0
            kotlinx.coroutines.flow.MutableStateFlow r4 = r4.get_uiState()
        L63:
            java.lang.Object r15 = r4.getValue()
            r5 = r15
            com.blackhub.bronline.game.gui.clicker.ClickerUiState r5 = (com.blackhub.bronline.game.gui.clicker.ClickerUiState) r5
            r17 = 507(0x1fb, float:7.1E-43)
            r18 = 0
            r6 = 0
            r7 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r19 = 1
            r9 = r2
            r3 = r15
            r15 = r16
            r16 = r19
            com.blackhub.bronline.game.gui.clicker.ClickerUiState r5 = com.blackhub.bronline.game.gui.clicker.ClickerUiState.copy$default(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r3 = r4.compareAndSet(r3, r5)
            if (r3 == 0) goto L8b
            goto Lb4
        L8b:
            r3 = 1
            goto L63
        L8d:
            com.blackhub.bronline.game.gui.clicker.ClickerViewModel r3 = r0.this$0
            kotlinx.coroutines.flow.MutableStateFlow r3 = r3.get_uiState()
        L93:
            java.lang.Object r4 = r3.getValue()
            r5 = r4
            com.blackhub.bronline.game.gui.clicker.ClickerUiState r5 = (com.blackhub.bronline.game.gui.clicker.ClickerUiState) r5
            r17 = 1019(0x3fb, float:1.428E-42)
            r18 = 0
            r6 = 0
            r7 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r2
            com.blackhub.bronline.game.gui.clicker.ClickerUiState r5 = com.blackhub.bronline.game.gui.clicker.ClickerUiState.copy$default(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r4 = r3.compareAndSet(r4, r5)
            if (r4 == 0) goto L93
        Lb4:
            r3 = 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.clicker.ClickerViewModel$startTapOpponent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
