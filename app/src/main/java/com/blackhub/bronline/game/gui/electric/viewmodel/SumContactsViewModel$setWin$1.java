package com.blackhub.bronline.game.gui.electric.viewmodel;

import com.blackhub.bronline.game.gui.electric.state.SumContactsUiState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SumContactsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.electric.viewmodel.SumContactsViewModel$setWin$1", f = "SumContactsViewModel.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nSumContactsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SumContactsViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/SumContactsViewModel$setWin$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,321:1\n230#2,5:322\n*S KotlinDebug\n*F\n+ 1 SumContactsViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/SumContactsViewModel$setWin$1\n*L\n169#1:322,5\n*E\n"})
/* loaded from: classes3.dex */
public final class SumContactsViewModel$setWin$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ boolean $isWin;
    public int label;
    public final /* synthetic */ SumContactsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SumContactsViewModel$setWin$1(SumContactsViewModel sumContactsViewModel, boolean z, Continuation<? super SumContactsViewModel$setWin$1> continuation) {
        super(2, continuation);
        this.this$0 = sumContactsViewModel;
        this.$isWin = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SumContactsViewModel$setWin$1(this.this$0, this.$isWin, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SumContactsViewModel$setWin$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        SumContactsUiState value;
        SumContactsUiState copy;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(300L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        MutableStateFlow<? extends SumContactsUiState> mutableStateFlow = this.this$0.get_uiState();
        boolean z = this.$isWin;
        do {
            value = mutableStateFlow.getValue();
            copy = r4.copy((r40 & 1) != 0 ? r4.instructionsAndHints : null, (r40 & 2) != 0 ? r4.gameInstructionsItemList : null, (r40 & 4) != 0 ? r4.isInstructionsShow : false, (r40 & 8) != 0 ? r4.isHintShow : false, (r40 & 16) != 0 ? r4.isHandShow : false, (r40 & 32) != 0 ? r4.countHint : 0, (r40 & 64) != 0 ? r4.sumOne : 0, (r40 & 128) != 0 ? r4.sumTwo : 0, (r40 & 256) != 0 ? r4.sumThree : 0, (r40 & 512) != 0 ? r4.bulbTextOne : 0, (r40 & 1024) != 0 ? r4.bulbTextTwo : 0, (r40 & 2048) != 0 ? r4.bulbTextThree : 0, (r40 & 4096) != 0 ? r4.textOne : 0, (r40 & 8192) != 0 ? r4.textTwo : 0, (r40 & 16384) != 0 ? r4.textThree : 0, (r40 & 32768) != 0 ? r4.countError : 0, (r40 & 65536) != 0 ? r4.isBulbOneOnTarget : false, (r40 & 131072) != 0 ? r4.isBulbTwoOnTarget : false, (r40 & 262144) != 0 ? r4.isBulbThreeOnTarget : false, (r40 & 524288) != 0 ? r4.isFirstGame : false, (r40 & 1048576) != 0 ? r4.isWin : Boxing.boxBoolean(z), (r40 & 2097152) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        return Unit.INSTANCE;
    }
}
