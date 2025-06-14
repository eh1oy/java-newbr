package com.blackhub.bronline.game.gui.fishing;

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
/* compiled from: FishingViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.fishing.FishingViewModel$hookAFish$1", f = "FishingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nFishingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FishingViewModel.kt\ncom/blackhub/bronline/game/gui/fishing/FishingViewModel$hookAFish$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,394:1\n230#2,5:395\n*S KotlinDebug\n*F\n+ 1 FishingViewModel.kt\ncom/blackhub/bronline/game/gui/fishing/FishingViewModel$hookAFish$1\n*L\n76#1:395,5\n*E\n"})
/* loaded from: classes3.dex */
public final class FishingViewModel$hookAFish$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ boolean $offsetState;
    public int label;
    public final /* synthetic */ FishingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FishingViewModel$hookAFish$1(boolean z, FishingViewModel fishingViewModel, Continuation<? super FishingViewModel$hookAFish$1> continuation) {
        super(2, continuation);
        this.$offsetState = z;
        this.this$0 = fishingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FishingViewModel$hookAFish$1(this.$offsetState, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FishingViewModel$hookAFish$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        FishingActionWithJSON fishingActionWithJSON;
        FishingUiState value;
        FishingUiState copy;
        FishingActionWithJSON fishingActionWithJSON2;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$offsetState) {
            this.this$0.startWindowWithProgress();
            fishingActionWithJSON2 = this.this$0.actionWithJSON;
            fishingActionWithJSON2.sendInfoToServer(1);
        } else {
            fishingActionWithJSON = this.this$0.actionWithJSON;
            fishingActionWithJSON.fishingResult(0);
            MutableStateFlow<? extends FishingUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                copy = r3.copy((r38 & 1) != 0 ? r3.screen : 0, (r38 & 2) != 0 ? r3.fishFallStep : 0.0f, (r38 & 4) != 0 ? r3.fishingTimer : 0L, (r38 & 8) != 0 ? r3.progressTimer : 0, (r38 & 16) != 0 ? r3.progressStep : 0, (r38 & 32) != 0 ? r3.progressRotate : 0.0f, (r38 & 64) != 0 ? r3.currentProgress : 0, (r38 & 128) != 0 ? r3.baitObj : null, (r38 & 256) != 0 ? r3.tackleObj : null, (r38 & 512) != 0 ? r3.fishingObj : null, (r38 & 1024) != 0 ? r3.currentOffsetState : 0, (r38 & 2048) != 0 ? r3.fishingAudioType : null, (r38 & 4096) != 0 ? r3.isNeedNullableMediaPlayer : false, (r38 & 8192) != 0 ? r3.isNeedPlaySound : false, (r38 & 16384) != 0 ? r3.isHideFloat : false, (r38 & 32768) != 0 ? r3.isHideProgress : false, (r38 & 65536) != 0 ? r3.isNeedClose : true, (r38 & 131072) != 0 ? r3.isShowBaitDescription : false, (r38 & 262144) != 0 ? value.isShowTackleDescription : false);
            } while (!mutableStateFlow.compareAndSet(value, copy));
        }
        return Unit.INSTANCE;
    }
}
