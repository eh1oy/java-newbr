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

/* compiled from: FindProblemViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel$onFuseGrayClick$1", f = "FindProblemViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nFindProblemViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindProblemViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel$onFuseGrayClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,526:1\n230#2,5:527\n230#2,5:532\n230#2,5:537\n230#2,5:542\n*S KotlinDebug\n*F\n+ 1 FindProblemViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel$onFuseGrayClick$1\n*L\n395#1:527,5\n404#1:532,5\n412#1:537,5\n420#1:542,5\n*E\n"})
/* loaded from: classes3.dex */
public final class FindProblemViewModel$onFuseGrayClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $number;
    public int label;
    public final /* synthetic */ FindProblemViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FindProblemViewModel$onFuseGrayClick$1(int i, FindProblemViewModel findProblemViewModel, Continuation<? super FindProblemViewModel$onFuseGrayClick$1> continuation) {
        super(2, continuation);
        this.$number = i;
        this.this$0 = findProblemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FindProblemViewModel$onFuseGrayClick$1(this.$number, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FindProblemViewModel$onFuseGrayClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        FindProblemUiState value;
        FindProblemUiState copy;
        FindProblemUiState value2;
        FindProblemUiState copy2;
        FindProblemUiState value3;
        FindProblemUiState copy3;
        FindProblemUiState value4;
        FindProblemUiState copy4;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int i = this.$number;
        if (i == 1) {
            MutableStateFlow<? extends FindProblemUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                copy = r3.copy((r50 & 1) != 0 ? r3.screenArgs : null, (r50 & 2) != 0 ? r3.instructionsAndHints : null, (r50 & 4) != 0 ? r3.gameInstructionsItemList : null, (r50 & 8) != 0 ? r3.isInstructionsShow : false, (r50 & 16) != 0 ? r3.isHintShow : false, (r50 & 32) != 0 ? r3.isHandShow : false, (r50 & 64) != 0 ? r3.countHint : 6, (r50 & 128) != 0 ? r3.textOhmOnTable : null, (r50 & 256) != 0 ? r3.textOhmOnMultimeter : null, (r50 & 512) != 0 ? r3.probeBlackOnTarget : false, (r50 & 1024) != 0 ? r3.probeRedOnTarget : false, (r50 & 2048) != 0 ? r3.isMultimeterVisible : false, (r50 & 4096) != 0 ? r3.isFuseRedOneWithProbeVisible : false, (r50 & 8192) != 0 ? r3.isFuseRedTwoWithProbeVisible : false, (r50 & 16384) != 0 ? r3.isFuseRedThreeWithProbeVisible : false, (r50 & 32768) != 0 ? r3.isFuseRedFourWithProbeVisible : false, (r50 & 65536) != 0 ? r3.isFuseGrayOneVisible : false, (r50 & 131072) != 0 ? r3.isFuseGrayTwoVisible : false, (r50 & 262144) != 0 ? r3.isFuseGrayThreeVisible : false, (r50 & 524288) != 0 ? r3.isFuseGrayFourVisible : false, (r50 & 1048576) != 0 ? r3.isFuseFillOne : false, (r50 & 2097152) != 0 ? r3.isFuseFillTwo : false, (r50 & 4194304) != 0 ? r3.isFuseFillThree : false, (r50 & 8388608) != 0 ? r3.isFuseFillFour : false, (r50 & 16777216) != 0 ? r3.isElementTwoOneHasListener : false, (r50 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r3.isElementTwoTwoHasListener : false, (r50 & 67108864) != 0 ? r3.isElementTwoThreeHasListener : false, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.isElementTwoFourHasListener : false, (r50 & 268435456) != 0 ? r3.isFirstGame : false, (r50 & 536870912) != 0 ? r3.isNextGame : false, (r50 & 1073741824) != 0 ? r3.isWin : false, (r50 & Integer.MIN_VALUE) != 0 ? value.isBlockingLoading : false);
            } while (!mutableStateFlow.compareAndSet(value, copy));
        } else if (i == 2) {
            MutableStateFlow<? extends FindProblemUiState> mutableStateFlow2 = this.this$0.get_uiState();
            do {
                value2 = mutableStateFlow2.getValue();
                copy2 = r3.copy((r50 & 1) != 0 ? r3.screenArgs : null, (r50 & 2) != 0 ? r3.instructionsAndHints : null, (r50 & 4) != 0 ? r3.gameInstructionsItemList : null, (r50 & 8) != 0 ? r3.isInstructionsShow : false, (r50 & 16) != 0 ? r3.isHintShow : false, (r50 & 32) != 0 ? r3.isHandShow : false, (r50 & 64) != 0 ? r3.countHint : 0, (r50 & 128) != 0 ? r3.textOhmOnTable : null, (r50 & 256) != 0 ? r3.textOhmOnMultimeter : null, (r50 & 512) != 0 ? r3.probeBlackOnTarget : false, (r50 & 1024) != 0 ? r3.probeRedOnTarget : false, (r50 & 2048) != 0 ? r3.isMultimeterVisible : false, (r50 & 4096) != 0 ? r3.isFuseRedOneWithProbeVisible : false, (r50 & 8192) != 0 ? r3.isFuseRedTwoWithProbeVisible : false, (r50 & 16384) != 0 ? r3.isFuseRedThreeWithProbeVisible : false, (r50 & 32768) != 0 ? r3.isFuseRedFourWithProbeVisible : false, (r50 & 65536) != 0 ? r3.isFuseGrayOneVisible : false, (r50 & 131072) != 0 ? r3.isFuseGrayTwoVisible : false, (r50 & 262144) != 0 ? r3.isFuseGrayThreeVisible : false, (r50 & 524288) != 0 ? r3.isFuseGrayFourVisible : false, (r50 & 1048576) != 0 ? r3.isFuseFillOne : false, (r50 & 2097152) != 0 ? r3.isFuseFillTwo : false, (r50 & 4194304) != 0 ? r3.isFuseFillThree : false, (r50 & 8388608) != 0 ? r3.isFuseFillFour : false, (r50 & 16777216) != 0 ? r3.isElementTwoOneHasListener : false, (r50 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r3.isElementTwoTwoHasListener : false, (r50 & 67108864) != 0 ? r3.isElementTwoThreeHasListener : false, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.isElementTwoFourHasListener : false, (r50 & 268435456) != 0 ? r3.isFirstGame : false, (r50 & 536870912) != 0 ? r3.isNextGame : false, (r50 & 1073741824) != 0 ? r3.isWin : false, (r50 & Integer.MIN_VALUE) != 0 ? value2.isBlockingLoading : false);
            } while (!mutableStateFlow2.compareAndSet(value2, copy2));
        } else if (i == 3) {
            MutableStateFlow<? extends FindProblemUiState> mutableStateFlow3 = this.this$0.get_uiState();
            do {
                value3 = mutableStateFlow3.getValue();
                copy3 = r3.copy((r50 & 1) != 0 ? r3.screenArgs : null, (r50 & 2) != 0 ? r3.instructionsAndHints : null, (r50 & 4) != 0 ? r3.gameInstructionsItemList : null, (r50 & 8) != 0 ? r3.isInstructionsShow : false, (r50 & 16) != 0 ? r3.isHintShow : false, (r50 & 32) != 0 ? r3.isHandShow : false, (r50 & 64) != 0 ? r3.countHint : 0, (r50 & 128) != 0 ? r3.textOhmOnTable : null, (r50 & 256) != 0 ? r3.textOhmOnMultimeter : null, (r50 & 512) != 0 ? r3.probeBlackOnTarget : false, (r50 & 1024) != 0 ? r3.probeRedOnTarget : false, (r50 & 2048) != 0 ? r3.isMultimeterVisible : false, (r50 & 4096) != 0 ? r3.isFuseRedOneWithProbeVisible : false, (r50 & 8192) != 0 ? r3.isFuseRedTwoWithProbeVisible : false, (r50 & 16384) != 0 ? r3.isFuseRedThreeWithProbeVisible : false, (r50 & 32768) != 0 ? r3.isFuseRedFourWithProbeVisible : false, (r50 & 65536) != 0 ? r3.isFuseGrayOneVisible : false, (r50 & 131072) != 0 ? r3.isFuseGrayTwoVisible : false, (r50 & 262144) != 0 ? r3.isFuseGrayThreeVisible : false, (r50 & 524288) != 0 ? r3.isFuseGrayFourVisible : false, (r50 & 1048576) != 0 ? r3.isFuseFillOne : false, (r50 & 2097152) != 0 ? r3.isFuseFillTwo : false, (r50 & 4194304) != 0 ? r3.isFuseFillThree : false, (r50 & 8388608) != 0 ? r3.isFuseFillFour : false, (r50 & 16777216) != 0 ? r3.isElementTwoOneHasListener : false, (r50 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r3.isElementTwoTwoHasListener : false, (r50 & 67108864) != 0 ? r3.isElementTwoThreeHasListener : false, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.isElementTwoFourHasListener : false, (r50 & 268435456) != 0 ? r3.isFirstGame : false, (r50 & 536870912) != 0 ? r3.isNextGame : false, (r50 & 1073741824) != 0 ? r3.isWin : false, (r50 & Integer.MIN_VALUE) != 0 ? value3.isBlockingLoading : false);
            } while (!mutableStateFlow3.compareAndSet(value3, copy3));
        } else if (i == 4) {
            MutableStateFlow<? extends FindProblemUiState> mutableStateFlow4 = this.this$0.get_uiState();
            do {
                value4 = mutableStateFlow4.getValue();
                copy4 = r3.copy((r50 & 1) != 0 ? r3.screenArgs : null, (r50 & 2) != 0 ? r3.instructionsAndHints : null, (r50 & 4) != 0 ? r3.gameInstructionsItemList : null, (r50 & 8) != 0 ? r3.isInstructionsShow : false, (r50 & 16) != 0 ? r3.isHintShow : false, (r50 & 32) != 0 ? r3.isHandShow : false, (r50 & 64) != 0 ? r3.countHint : 0, (r50 & 128) != 0 ? r3.textOhmOnTable : null, (r50 & 256) != 0 ? r3.textOhmOnMultimeter : null, (r50 & 512) != 0 ? r3.probeBlackOnTarget : false, (r50 & 1024) != 0 ? r3.probeRedOnTarget : false, (r50 & 2048) != 0 ? r3.isMultimeterVisible : false, (r50 & 4096) != 0 ? r3.isFuseRedOneWithProbeVisible : false, (r50 & 8192) != 0 ? r3.isFuseRedTwoWithProbeVisible : false, (r50 & 16384) != 0 ? r3.isFuseRedThreeWithProbeVisible : false, (r50 & 32768) != 0 ? r3.isFuseRedFourWithProbeVisible : false, (r50 & 65536) != 0 ? r3.isFuseGrayOneVisible : false, (r50 & 131072) != 0 ? r3.isFuseGrayTwoVisible : false, (r50 & 262144) != 0 ? r3.isFuseGrayThreeVisible : false, (r50 & 524288) != 0 ? r3.isFuseGrayFourVisible : false, (r50 & 1048576) != 0 ? r3.isFuseFillOne : false, (r50 & 2097152) != 0 ? r3.isFuseFillTwo : false, (r50 & 4194304) != 0 ? r3.isFuseFillThree : false, (r50 & 8388608) != 0 ? r3.isFuseFillFour : false, (r50 & 16777216) != 0 ? r3.isElementTwoOneHasListener : false, (r50 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r3.isElementTwoTwoHasListener : false, (r50 & 67108864) != 0 ? r3.isElementTwoThreeHasListener : false, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.isElementTwoFourHasListener : false, (r50 & 268435456) != 0 ? r3.isFirstGame : false, (r50 & 536870912) != 0 ? r3.isNextGame : false, (r50 & 1073741824) != 0 ? r3.isWin : false, (r50 & Integer.MIN_VALUE) != 0 ? value4.isBlockingLoading : false);
            } while (!mutableStateFlow4.compareAndSet(value4, copy4));
        }
        return Unit.INSTANCE;
    }
}
