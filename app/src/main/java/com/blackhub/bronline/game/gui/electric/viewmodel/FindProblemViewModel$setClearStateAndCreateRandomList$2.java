package com.blackhub.bronline.game.gui.electric.viewmodel;

import androidx.media3.common.C;
import com.blackhub.bronline.game.gui.electric.state.FindProblemUiState;
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
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: FindProblemViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel$setClearStateAndCreateRandomList$2", f = "FindProblemViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nFindProblemViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindProblemViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel$setClearStateAndCreateRandomList$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,526:1\n230#2,5:527\n*S KotlinDebug\n*F\n+ 1 FindProblemViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel$setClearStateAndCreateRandomList$2\n*L\n497#1:527,5\n*E\n"})
/* loaded from: classes3.dex */
public final class FindProblemViewModel$setClearStateAndCreateRandomList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ FindProblemViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FindProblemViewModel$setClearStateAndCreateRandomList$2(FindProblemViewModel findProblemViewModel, Continuation<? super FindProblemViewModel$setClearStateAndCreateRandomList$2> continuation) {
        super(2, continuation);
        this.this$0 = findProblemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FindProblemViewModel$setClearStateAndCreateRandomList$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FindProblemViewModel$setClearStateAndCreateRandomList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        FindProblemUiState value;
        FindProblemUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.createRandomOhm();
            this.this$0.setRandomOhmForTarget();
            MutableStateFlow<? extends FindProblemUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                copy = r3.copy((r50 & 1) != 0 ? r3.screenArgs : null, (r50 & 2) != 0 ? r3.instructionsAndHints : null, (r50 & 4) != 0 ? r3.gameInstructionsItemList : null, (r50 & 8) != 0 ? r3.isInstructionsShow : false, (r50 & 16) != 0 ? r3.isHintShow : false, (r50 & 32) != 0 ? r3.isHandShow : false, (r50 & 64) != 0 ? r3.countHint : 0, (r50 & 128) != 0 ? r3.textOhmOnTable : null, (r50 & 256) != 0 ? r3.textOhmOnMultimeter : null, (r50 & 512) != 0 ? r3.probeBlackOnTarget : false, (r50 & 1024) != 0 ? r3.probeRedOnTarget : false, (r50 & 2048) != 0 ? r3.isMultimeterVisible : false, (r50 & 4096) != 0 ? r3.isFuseRedOneWithProbeVisible : false, (r50 & 8192) != 0 ? r3.isFuseRedTwoWithProbeVisible : false, (r50 & 16384) != 0 ? r3.isFuseRedThreeWithProbeVisible : false, (r50 & 32768) != 0 ? r3.isFuseRedFourWithProbeVisible : false, (r50 & 65536) != 0 ? r3.isFuseGrayOneVisible : false, (r50 & 131072) != 0 ? r3.isFuseGrayTwoVisible : false, (r50 & 262144) != 0 ? r3.isFuseGrayThreeVisible : false, (r50 & 524288) != 0 ? r3.isFuseGrayFourVisible : false, (r50 & 1048576) != 0 ? r3.isFuseFillOne : false, (r50 & 2097152) != 0 ? r3.isFuseFillTwo : false, (r50 & 4194304) != 0 ? r3.isFuseFillThree : false, (r50 & 8388608) != 0 ? r3.isFuseFillFour : false, (r50 & 16777216) != 0 ? r3.isElementTwoOneHasListener : false, (r50 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r3.isElementTwoTwoHasListener : false, (r50 & 67108864) != 0 ? r3.isElementTwoThreeHasListener : false, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.isElementTwoFourHasListener : false, (r50 & 268435456) != 0 ? r3.isFirstGame : false, (r50 & 536870912) != 0 ? r3.isNextGame : false, (r50 & 1073741824) != 0 ? r3.isWin : false, (r50 & Integer.MIN_VALUE) != 0 ? value.isBlockingLoading : false);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
