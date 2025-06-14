package com.blackhub.bronline.game.gui.bprewards;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: BpRewardsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$onStartFilterButtonPressed$1", f = "BpRewardsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nBpRewardsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$onStartFilterButtonPressed$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,736:1\n230#2,5:737\n*S KotlinDebug\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$onStartFilterButtonPressed$1\n*L\n371#1:737,5\n*E\n"})
/* loaded from: classes3.dex */
public final class BpRewardsViewModel$onStartFilterButtonPressed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $filterState;
    public int label;
    public final /* synthetic */ BpRewardsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BpRewardsViewModel$onStartFilterButtonPressed$1(BpRewardsViewModel bpRewardsViewModel, int i, Continuation<? super BpRewardsViewModel$onStartFilterButtonPressed$1> continuation) {
        super(2, continuation);
        this.this$0 = bpRewardsViewModel;
        this.$filterState = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BpRewardsViewModel$onStartFilterButtonPressed$1(this.this$0, this.$filterState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BpRewardsViewModel$onStartFilterButtonPressed$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        BpRewardsActionWithJSON bpRewardsActionWithJSON;
        BpRewardsUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            bpRewardsActionWithJSON = this.this$0.actionWithJSON;
            bpRewardsActionWithJSON.sendButtonFilterPressed(this.$filterState);
            MutableStateFlow<? extends BpRewardsUiState> mutableStateFlow = this.this$0.get_uiState();
            int i = this.$filterState;
            while (true) {
                BpRewardsUiState value = mutableStateFlow.getValue();
                int i2 = i;
                copy = r2.copy((r38 & 1) != 0 ? r2.isBpRewardsScreen : false, (r38 & 2) != 0 ? r2.annotatedText : null, (r38 & 4) != 0 ? r2.bpRewardsLists : null, (r38 & 8) != 0 ? r2.imagesForFilterList : null, (r38 & 16) != 0 ? r2.topHintList : null, (r38 & 32) != 0 ? r2.bottomHintList : null, (r38 & 64) != 0 ? r2.refreshButtonBitmap : null, (r38 & 128) != 0 ? r2.sizeOfImage : 0, (r38 & 256) != 0 ? r2.isNeedToShowDialog : false, (r38 & 512) != 0 ? r2.isSprayForDialog : false, (r38 & 1024) != 0 ? r2.rewardNameForDialog : null, (r38 & 2048) != 0 ? r2.idForDialog : 0, (r38 & 4096) != 0 ? r2.sprayPriceForDialog : null, (r38 & 8192) != 0 ? r2.sprayTextForDialog : null, (r38 & 16384) != 0 ? r2.filterState : i2, (r38 & 32768) != 0 ? r2.isHasTanpin : false, (r38 & 65536) != 0 ? r2.isTutorialEnabled : false, (r38 & 131072) != 0 ? r2.isButtonFilterBlocked : true, (r38 & 262144) != 0 ? r2.isScreenBlocked : false, (r38 & 524288) != 0 ? value.isNeedClose : false);
                if (mutableStateFlow.compareAndSet(value, copy)) {
                    return Unit.INSTANCE;
                }
                i = i2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
