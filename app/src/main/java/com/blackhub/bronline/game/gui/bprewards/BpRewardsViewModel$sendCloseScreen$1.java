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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$sendCloseScreen$1", f = "BpRewardsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nBpRewardsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$sendCloseScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,736:1\n230#2,5:737\n*S KotlinDebug\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$sendCloseScreen$1\n*L\n427#1:737,5\n*E\n"})
/* loaded from: classes3.dex */
public final class BpRewardsViewModel$sendCloseScreen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ BpRewardsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BpRewardsViewModel$sendCloseScreen$1(BpRewardsViewModel bpRewardsViewModel, Continuation<? super BpRewardsViewModel$sendCloseScreen$1> continuation) {
        super(2, continuation);
        this.this$0 = bpRewardsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BpRewardsViewModel$sendCloseScreen$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BpRewardsViewModel$sendCloseScreen$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        BpRewardsActionWithJSON bpRewardsActionWithJSON;
        BpRewardsUiState value;
        BpRewardsUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            bpRewardsActionWithJSON = this.this$0.actionWithJSON;
            bpRewardsActionWithJSON.sendCloseScreen();
            MutableStateFlow<? extends BpRewardsUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                copy = r3.copy((r38 & 1) != 0 ? r3.isBpRewardsScreen : false, (r38 & 2) != 0 ? r3.annotatedText : null, (r38 & 4) != 0 ? r3.bpRewardsLists : null, (r38 & 8) != 0 ? r3.imagesForFilterList : null, (r38 & 16) != 0 ? r3.topHintList : null, (r38 & 32) != 0 ? r3.bottomHintList : null, (r38 & 64) != 0 ? r3.refreshButtonBitmap : null, (r38 & 128) != 0 ? r3.sizeOfImage : 0, (r38 & 256) != 0 ? r3.isNeedToShowDialog : false, (r38 & 512) != 0 ? r3.isSprayForDialog : false, (r38 & 1024) != 0 ? r3.rewardNameForDialog : null, (r38 & 2048) != 0 ? r3.idForDialog : 0, (r38 & 4096) != 0 ? r3.sprayPriceForDialog : null, (r38 & 8192) != 0 ? r3.sprayTextForDialog : null, (r38 & 16384) != 0 ? r3.filterState : 0, (r38 & 32768) != 0 ? r3.isHasTanpin : false, (r38 & 65536) != 0 ? r3.isTutorialEnabled : false, (r38 & 131072) != 0 ? r3.isButtonFilterBlocked : false, (r38 & 262144) != 0 ? r3.isScreenBlocked : false, (r38 & 524288) != 0 ? value.isNeedClose : true);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
