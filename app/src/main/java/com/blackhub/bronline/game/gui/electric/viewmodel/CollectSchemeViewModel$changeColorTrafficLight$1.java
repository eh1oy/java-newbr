package com.blackhub.bronline.game.gui.electric.viewmodel;

import com.blackhub.bronline.game.gui.electric.state.CollectSchemeUiState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CollectSchemeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel$changeColorTrafficLight$1", f = "CollectSchemeViewModel.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCollectSchemeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectSchemeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/CollectSchemeViewModel$changeColorTrafficLight$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,186:1\n230#2,5:187\n*S KotlinDebug\n*F\n+ 1 CollectSchemeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/CollectSchemeViewModel$changeColorTrafficLight$1\n*L\n46#1:187,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CollectSchemeViewModel$changeColorTrafficLight$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ CollectSchemeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectSchemeViewModel$changeColorTrafficLight$1(CollectSchemeViewModel collectSchemeViewModel, Continuation<? super CollectSchemeViewModel$changeColorTrafficLight$1> continuation) {
        super(2, continuation);
        this.this$0 = collectSchemeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CollectSchemeViewModel$changeColorTrafficLight$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CollectSchemeViewModel$changeColorTrafficLight$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CollectSchemeUiState value;
        CollectSchemeUiState copy;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MutableStateFlow<? extends CollectSchemeUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                copy = r5.copy((r24 & 1) != 0 ? r5.instructionsAndHints : null, (r24 & 2) != 0 ? r5.gameInstructionsItemList : null, (r24 & 4) != 0 ? r5.isInstructionsShow : false, (r24 & 8) != 0 ? r5.isHintShow : false, (r24 & 16) != 0 ? r5.isHandShow : false, (r24 & 32) != 0 ? r5.countHint : 0, (r24 & 64) != 0 ? r5.isFirstGame : false, (r24 & 128) != 0 ? r5.isTimerStart : false, (r24 & 256) != 0 ? r5.isWin : null, (r24 & 512) != 0 ? r5.colorTrafficLight : null, (r24 & 1024) != 0 ? value.isBlockingLoading : true);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (BuildersKt.withContext(main, anonymousClass2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: CollectSchemeViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel$changeColorTrafficLight$1$2", f = "CollectSchemeViewModel.kt", i = {}, l = {53, 55, 57}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel$changeColorTrafficLight$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;
        public final /* synthetic */ CollectSchemeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CollectSchemeViewModel collectSchemeViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = collectSchemeViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 500(0x1f4, double:2.47E-321)
                if (r1 == 0) goto L27
                if (r1 == r4) goto L23
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                kotlin.ResultKt.throwOnFailure(r8)
                goto L5a
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L4a
            L23:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L3a
            L27:
                kotlin.ResultKt.throwOnFailure(r8)
                com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel r8 = r7.this$0
                com.blackhub.bronline.game.gui.electric.enums.ColorTrafficLight r1 = com.blackhub.bronline.game.gui.electric.enums.ColorTrafficLight.RED
                com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel.access$setColorTrafficLight(r8, r1)
                r7.label = r4
                java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r5, r7)
                if (r8 != r0) goto L3a
                return r0
            L3a:
                com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel r8 = r7.this$0
                com.blackhub.bronline.game.gui.electric.enums.ColorTrafficLight r1 = com.blackhub.bronline.game.gui.electric.enums.ColorTrafficLight.YELLOW
                com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel.access$setColorTrafficLight(r8, r1)
                r7.label = r3
                java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r5, r7)
                if (r8 != r0) goto L4a
                return r0
            L4a:
                com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel r8 = r7.this$0
                com.blackhub.bronline.game.gui.electric.enums.ColorTrafficLight r1 = com.blackhub.bronline.game.gui.electric.enums.ColorTrafficLight.GREEN
                com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel.access$setColorTrafficLight(r8, r1)
                r7.label = r2
                java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r5, r7)
                if (r8 != r0) goto L5a
                return r0
            L5a:
                com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel r8 = r7.this$0
                com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel.access$setWin(r8)
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel$changeColorTrafficLight$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
