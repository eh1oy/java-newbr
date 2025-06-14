package com.blackhub.bronline.game.gui.electric.viewmodel;

import androidx.media3.common.C;
import com.blackhub.bronline.game.core.utils.draganddrop.enums.CurrentDraggableItem;
import com.blackhub.bronline.game.core.utils.draganddrop.enums.CurrentTargetArea;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DataTargetArea;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DragAndDropCallback;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel$isTargetOnArea$1", f = "FindProblemViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nFindProblemViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindProblemViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel$isTargetOnArea$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,526:1\n230#2,5:527\n230#2,5:532\n230#2,5:537\n230#2,5:542\n230#2,5:547\n230#2,5:552\n230#2,5:557\n230#2,5:562\n230#2,5:567\n230#2,5:572\n*S KotlinDebug\n*F\n+ 1 FindProblemViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel$isTargetOnArea$1\n*L\n160#1:527,5\n186#1:532,5\n205#1:537,5\n224#1:542,5\n243#1:547,5\n261#1:552,5\n285#1:557,5\n296#1:562,5\n306#1:567,5\n316#1:572,5\n*E\n"})
/* loaded from: classes3.dex */
public final class FindProblemViewModel$isTargetOnArea$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ DragAndDropCallback $dragAndDropCallback;
    public int label;
    public final /* synthetic */ FindProblemViewModel this$0;

    /* compiled from: FindProblemViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CurrentTargetArea.values().length];
            try {
                iArr[CurrentTargetArea.TARGET_AREA_ONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CurrentTargetArea.TARGET_AREA_TWO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CurrentTargetArea.TARGET_AREA_THREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CurrentTargetArea.TARGET_AREA_FOUR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CurrentTargetArea.TARGET_AREA_FUSE_ONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CurrentTargetArea.TARGET_AREA_FUSE_TWO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CurrentTargetArea.TARGET_AREA_FUSE_THREE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CurrentTargetArea.TARGET_AREA_FUSE_FOUR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CurrentDraggableItem.values().length];
            try {
                iArr2[CurrentDraggableItem.PROBE_BLACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CurrentDraggableItem.PROBE_RED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CurrentDraggableItem.ELEMENT_TWO.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FindProblemViewModel$isTargetOnArea$1(DragAndDropCallback dragAndDropCallback, FindProblemViewModel findProblemViewModel, Continuation<? super FindProblemViewModel$isTargetOnArea$1> continuation) {
        super(2, continuation);
        this.$dragAndDropCallback = dragAndDropCallback;
        this.this$0 = findProblemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FindProblemViewModel$isTargetOnArea$1(this.$dragAndDropCallback, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FindProblemViewModel$isTargetOnArea$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        FindProblemUiState copy;
        CurrentTargetArea currentTargetArea;
        int i;
        FindProblemUiState value;
        FindProblemUiState copy2;
        FindProblemUiState value2;
        FindProblemUiState copy3;
        FindProblemUiState value3;
        FindProblemUiState copy4;
        FindProblemUiState value4;
        FindProblemUiState copy5;
        FindProblemUiState value5;
        FindProblemUiState copy6;
        String innerData;
        FindProblemUiState value6;
        FindProblemUiState copy7;
        FindProblemUiState value7;
        FindProblemUiState copy8;
        FindProblemUiState value8;
        FindProblemUiState copy9;
        FindProblemUiState value9;
        FindProblemUiState copy10;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int i2 = WhenMappings.$EnumSwitchMapping$1[this.$dragAndDropCallback.getCurrentDraggableItem().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                boolean isHintShow = (this.$dragAndDropCallback.getOnTarget() && this.this$0.get_uiState().getValue().isHintShow() && this.this$0.get_uiState().getValue().getCountHint() == 7) ? false : this.this$0.get_uiState().getValue().isHintShow();
                DataTargetArea dataTargetArea = this.$dragAndDropCallback.getDataTargetArea();
                currentTargetArea = dataTargetArea != null ? dataTargetArea.getCurrentTargetArea() : null;
                i = currentTargetArea != null ? WhenMappings.$EnumSwitchMapping$0[currentTargetArea.ordinal()] : -1;
                if (i == 1) {
                    int countHint = (this.$dragAndDropCallback.getOnTarget() && this.this$0.get_uiState().getValue().getCountHint() == 3) ? 4 : this.this$0.get_uiState().getValue().getCountHint();
                    MutableStateFlow<? extends FindProblemUiState> mutableStateFlow = this.this$0.get_uiState();
                    DragAndDropCallback dragAndDropCallback = this.$dragAndDropCallback;
                    FindProblemViewModel findProblemViewModel = this.this$0;
                    do {
                        value = mutableStateFlow.getValue();
                        FindProblemUiState findProblemUiState = value;
                        boolean onTarget = dragAndDropCallback.getOnTarget();
                        String innerData2 = dragAndDropCallback.getDataTargetArea().getInnerData();
                        copy2 = findProblemUiState.copy((r50 & 1) != 0 ? findProblemUiState.screenArgs : null, (r50 & 2) != 0 ? findProblemUiState.instructionsAndHints : null, (r50 & 4) != 0 ? findProblemUiState.gameInstructionsItemList : null, (r50 & 8) != 0 ? findProblemUiState.isInstructionsShow : false, (r50 & 16) != 0 ? findProblemUiState.isHintShow : isHintShow, (r50 & 32) != 0 ? findProblemUiState.isHandShow : false, (r50 & 64) != 0 ? findProblemUiState.countHint : countHint, (r50 & 128) != 0 ? findProblemUiState.textOhmOnTable : null, (r50 & 256) != 0 ? findProblemUiState.textOhmOnMultimeter : innerData2 == null ? FindProblemViewModel.OHM_ZERO : innerData2, (r50 & 512) != 0 ? findProblemUiState.probeBlackOnTarget : false, (r50 & 1024) != 0 ? findProblemUiState.probeRedOnTarget : onTarget, (r50 & 2048) != 0 ? findProblemUiState.isMultimeterVisible : false, (r50 & 4096) != 0 ? findProblemUiState.isFuseRedOneWithProbeVisible : !dragAndDropCallback.getOnTarget() && findProblemViewModel.get_uiState().getValue().isFuseGrayOneVisible(), (r50 & 8192) != 0 ? findProblemUiState.isFuseRedTwoWithProbeVisible : false, (r50 & 16384) != 0 ? findProblemUiState.isFuseRedThreeWithProbeVisible : false, (r50 & 32768) != 0 ? findProblemUiState.isFuseRedFourWithProbeVisible : false, (r50 & 65536) != 0 ? findProblemUiState.isFuseGrayOneVisible : false, (r50 & 131072) != 0 ? findProblemUiState.isFuseGrayTwoVisible : false, (r50 & 262144) != 0 ? findProblemUiState.isFuseGrayThreeVisible : false, (r50 & 524288) != 0 ? findProblemUiState.isFuseGrayFourVisible : false, (r50 & 1048576) != 0 ? findProblemUiState.isFuseFillOne : false, (r50 & 2097152) != 0 ? findProblemUiState.isFuseFillTwo : false, (r50 & 4194304) != 0 ? findProblemUiState.isFuseFillThree : false, (r50 & 8388608) != 0 ? findProblemUiState.isFuseFillFour : false, (r50 & 16777216) != 0 ? findProblemUiState.isElementTwoOneHasListener : false, (r50 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState.isElementTwoTwoHasListener : false, (r50 & 67108864) != 0 ? findProblemUiState.isElementTwoThreeHasListener : false, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState.isElementTwoFourHasListener : false, (r50 & 268435456) != 0 ? findProblemUiState.isFirstGame : false, (r50 & 536870912) != 0 ? findProblemUiState.isNextGame : false, (r50 & 1073741824) != 0 ? findProblemUiState.isWin : false, (r50 & Integer.MIN_VALUE) != 0 ? findProblemUiState.isBlockingLoading : false);
                    } while (!mutableStateFlow.compareAndSet(value, copy2));
                } else if (i == 2) {
                    int countHint2 = this.$dragAndDropCallback.getOnTarget() ? 7 : this.this$0.get_uiState().getValue().getCountHint();
                    MutableStateFlow<? extends FindProblemUiState> mutableStateFlow2 = this.this$0.get_uiState();
                    DragAndDropCallback dragAndDropCallback2 = this.$dragAndDropCallback;
                    FindProblemViewModel findProblemViewModel2 = this.this$0;
                    do {
                        value2 = mutableStateFlow2.getValue();
                        FindProblemUiState findProblemUiState2 = value2;
                        boolean onTarget2 = dragAndDropCallback2.getOnTarget();
                        String innerData3 = dragAndDropCallback2.getDataTargetArea().getInnerData();
                        copy3 = findProblemUiState2.copy((r50 & 1) != 0 ? findProblemUiState2.screenArgs : null, (r50 & 2) != 0 ? findProblemUiState2.instructionsAndHints : null, (r50 & 4) != 0 ? findProblemUiState2.gameInstructionsItemList : null, (r50 & 8) != 0 ? findProblemUiState2.isInstructionsShow : false, (r50 & 16) != 0 ? findProblemUiState2.isHintShow : isHintShow, (r50 & 32) != 0 ? findProblemUiState2.isHandShow : false, (r50 & 64) != 0 ? findProblemUiState2.countHint : countHint2, (r50 & 128) != 0 ? findProblemUiState2.textOhmOnTable : null, (r50 & 256) != 0 ? findProblemUiState2.textOhmOnMultimeter : innerData3 == null ? FindProblemViewModel.OHM_ZERO : innerData3, (r50 & 512) != 0 ? findProblemUiState2.probeBlackOnTarget : false, (r50 & 1024) != 0 ? findProblemUiState2.probeRedOnTarget : onTarget2, (r50 & 2048) != 0 ? findProblemUiState2.isMultimeterVisible : false, (r50 & 4096) != 0 ? findProblemUiState2.isFuseRedOneWithProbeVisible : false, (r50 & 8192) != 0 ? findProblemUiState2.isFuseRedTwoWithProbeVisible : !dragAndDropCallback2.getOnTarget() && findProblemViewModel2.get_uiState().getValue().isFuseGrayTwoVisible(), (r50 & 16384) != 0 ? findProblemUiState2.isFuseRedThreeWithProbeVisible : false, (r50 & 32768) != 0 ? findProblemUiState2.isFuseRedFourWithProbeVisible : false, (r50 & 65536) != 0 ? findProblemUiState2.isFuseGrayOneVisible : false, (r50 & 131072) != 0 ? findProblemUiState2.isFuseGrayTwoVisible : false, (r50 & 262144) != 0 ? findProblemUiState2.isFuseGrayThreeVisible : false, (r50 & 524288) != 0 ? findProblemUiState2.isFuseGrayFourVisible : false, (r50 & 1048576) != 0 ? findProblemUiState2.isFuseFillOne : false, (r50 & 2097152) != 0 ? findProblemUiState2.isFuseFillTwo : false, (r50 & 4194304) != 0 ? findProblemUiState2.isFuseFillThree : false, (r50 & 8388608) != 0 ? findProblemUiState2.isFuseFillFour : false, (r50 & 16777216) != 0 ? findProblemUiState2.isElementTwoOneHasListener : false, (r50 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState2.isElementTwoTwoHasListener : false, (r50 & 67108864) != 0 ? findProblemUiState2.isElementTwoThreeHasListener : false, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState2.isElementTwoFourHasListener : false, (r50 & 268435456) != 0 ? findProblemUiState2.isFirstGame : false, (r50 & 536870912) != 0 ? findProblemUiState2.isNextGame : false, (r50 & 1073741824) != 0 ? findProblemUiState2.isWin : false, (r50 & Integer.MIN_VALUE) != 0 ? findProblemUiState2.isBlockingLoading : false);
                    } while (!mutableStateFlow2.compareAndSet(value2, copy3));
                } else if (i == 3) {
                    int countHint3 = this.$dragAndDropCallback.getOnTarget() ? 7 : this.this$0.get_uiState().getValue().getCountHint();
                    MutableStateFlow<? extends FindProblemUiState> mutableStateFlow3 = this.this$0.get_uiState();
                    DragAndDropCallback dragAndDropCallback3 = this.$dragAndDropCallback;
                    FindProblemViewModel findProblemViewModel3 = this.this$0;
                    do {
                        value3 = mutableStateFlow3.getValue();
                        FindProblemUiState findProblemUiState3 = value3;
                        boolean onTarget3 = dragAndDropCallback3.getOnTarget();
                        String innerData4 = dragAndDropCallback3.getDataTargetArea().getInnerData();
                        copy4 = findProblemUiState3.copy((r50 & 1) != 0 ? findProblemUiState3.screenArgs : null, (r50 & 2) != 0 ? findProblemUiState3.instructionsAndHints : null, (r50 & 4) != 0 ? findProblemUiState3.gameInstructionsItemList : null, (r50 & 8) != 0 ? findProblemUiState3.isInstructionsShow : false, (r50 & 16) != 0 ? findProblemUiState3.isHintShow : isHintShow, (r50 & 32) != 0 ? findProblemUiState3.isHandShow : false, (r50 & 64) != 0 ? findProblemUiState3.countHint : countHint3, (r50 & 128) != 0 ? findProblemUiState3.textOhmOnTable : null, (r50 & 256) != 0 ? findProblemUiState3.textOhmOnMultimeter : innerData4 == null ? FindProblemViewModel.OHM_ZERO : innerData4, (r50 & 512) != 0 ? findProblemUiState3.probeBlackOnTarget : false, (r50 & 1024) != 0 ? findProblemUiState3.probeRedOnTarget : onTarget3, (r50 & 2048) != 0 ? findProblemUiState3.isMultimeterVisible : false, (r50 & 4096) != 0 ? findProblemUiState3.isFuseRedOneWithProbeVisible : false, (r50 & 8192) != 0 ? findProblemUiState3.isFuseRedTwoWithProbeVisible : false, (r50 & 16384) != 0 ? findProblemUiState3.isFuseRedThreeWithProbeVisible : !dragAndDropCallback3.getOnTarget() && findProblemViewModel3.get_uiState().getValue().isFuseGrayThreeVisible(), (r50 & 32768) != 0 ? findProblemUiState3.isFuseRedFourWithProbeVisible : false, (r50 & 65536) != 0 ? findProblemUiState3.isFuseGrayOneVisible : false, (r50 & 131072) != 0 ? findProblemUiState3.isFuseGrayTwoVisible : false, (r50 & 262144) != 0 ? findProblemUiState3.isFuseGrayThreeVisible : false, (r50 & 524288) != 0 ? findProblemUiState3.isFuseGrayFourVisible : false, (r50 & 1048576) != 0 ? findProblemUiState3.isFuseFillOne : false, (r50 & 2097152) != 0 ? findProblemUiState3.isFuseFillTwo : false, (r50 & 4194304) != 0 ? findProblemUiState3.isFuseFillThree : false, (r50 & 8388608) != 0 ? findProblemUiState3.isFuseFillFour : false, (r50 & 16777216) != 0 ? findProblemUiState3.isElementTwoOneHasListener : false, (r50 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState3.isElementTwoTwoHasListener : false, (r50 & 67108864) != 0 ? findProblemUiState3.isElementTwoThreeHasListener : false, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState3.isElementTwoFourHasListener : false, (r50 & 268435456) != 0 ? findProblemUiState3.isFirstGame : false, (r50 & 536870912) != 0 ? findProblemUiState3.isNextGame : false, (r50 & 1073741824) != 0 ? findProblemUiState3.isWin : false, (r50 & Integer.MIN_VALUE) != 0 ? findProblemUiState3.isBlockingLoading : false);
                    } while (!mutableStateFlow3.compareAndSet(value3, copy4));
                } else if (i == 4) {
                    int countHint4 = this.$dragAndDropCallback.getOnTarget() ? 7 : this.this$0.get_uiState().getValue().getCountHint();
                    MutableStateFlow<? extends FindProblemUiState> mutableStateFlow4 = this.this$0.get_uiState();
                    DragAndDropCallback dragAndDropCallback4 = this.$dragAndDropCallback;
                    FindProblemViewModel findProblemViewModel4 = this.this$0;
                    do {
                        value4 = mutableStateFlow4.getValue();
                        FindProblemUiState findProblemUiState4 = value4;
                        boolean onTarget4 = dragAndDropCallback4.getOnTarget();
                        String innerData5 = dragAndDropCallback4.getDataTargetArea().getInnerData();
                        copy5 = findProblemUiState4.copy((r50 & 1) != 0 ? findProblemUiState4.screenArgs : null, (r50 & 2) != 0 ? findProblemUiState4.instructionsAndHints : null, (r50 & 4) != 0 ? findProblemUiState4.gameInstructionsItemList : null, (r50 & 8) != 0 ? findProblemUiState4.isInstructionsShow : false, (r50 & 16) != 0 ? findProblemUiState4.isHintShow : isHintShow, (r50 & 32) != 0 ? findProblemUiState4.isHandShow : false, (r50 & 64) != 0 ? findProblemUiState4.countHint : countHint4, (r50 & 128) != 0 ? findProblemUiState4.textOhmOnTable : null, (r50 & 256) != 0 ? findProblemUiState4.textOhmOnMultimeter : innerData5 == null ? FindProblemViewModel.OHM_ZERO : innerData5, (r50 & 512) != 0 ? findProblemUiState4.probeBlackOnTarget : false, (r50 & 1024) != 0 ? findProblemUiState4.probeRedOnTarget : onTarget4, (r50 & 2048) != 0 ? findProblemUiState4.isMultimeterVisible : false, (r50 & 4096) != 0 ? findProblemUiState4.isFuseRedOneWithProbeVisible : false, (r50 & 8192) != 0 ? findProblemUiState4.isFuseRedTwoWithProbeVisible : false, (r50 & 16384) != 0 ? findProblemUiState4.isFuseRedThreeWithProbeVisible : false, (r50 & 32768) != 0 ? findProblemUiState4.isFuseRedFourWithProbeVisible : !dragAndDropCallback4.getOnTarget() && findProblemViewModel4.get_uiState().getValue().isFuseGrayFourVisible(), (r50 & 65536) != 0 ? findProblemUiState4.isFuseGrayOneVisible : false, (r50 & 131072) != 0 ? findProblemUiState4.isFuseGrayTwoVisible : false, (r50 & 262144) != 0 ? findProblemUiState4.isFuseGrayThreeVisible : false, (r50 & 524288) != 0 ? findProblemUiState4.isFuseGrayFourVisible : false, (r50 & 1048576) != 0 ? findProblemUiState4.isFuseFillOne : false, (r50 & 2097152) != 0 ? findProblemUiState4.isFuseFillTwo : false, (r50 & 4194304) != 0 ? findProblemUiState4.isFuseFillThree : false, (r50 & 8388608) != 0 ? findProblemUiState4.isFuseFillFour : false, (r50 & 16777216) != 0 ? findProblemUiState4.isElementTwoOneHasListener : false, (r50 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState4.isElementTwoTwoHasListener : false, (r50 & 67108864) != 0 ? findProblemUiState4.isElementTwoThreeHasListener : false, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState4.isElementTwoFourHasListener : false, (r50 & 268435456) != 0 ? findProblemUiState4.isFirstGame : false, (r50 & 536870912) != 0 ? findProblemUiState4.isNextGame : false, (r50 & 1073741824) != 0 ? findProblemUiState4.isWin : false, (r50 & Integer.MIN_VALUE) != 0 ? findProblemUiState4.isBlockingLoading : false);
                    } while (!mutableStateFlow4.compareAndSet(value4, copy5));
                } else {
                    int countHint5 = this.$dragAndDropCallback.getOnTarget() ? 7 : this.this$0.get_uiState().getValue().getCountHint();
                    MutableStateFlow<? extends FindProblemUiState> mutableStateFlow5 = this.this$0.get_uiState();
                    DragAndDropCallback dragAndDropCallback5 = this.$dragAndDropCallback;
                    do {
                        value5 = mutableStateFlow5.getValue();
                        FindProblemUiState findProblemUiState5 = value5;
                        boolean onTarget5 = dragAndDropCallback5.getOnTarget();
                        DataTargetArea dataTargetArea2 = dragAndDropCallback5.getDataTargetArea();
                        copy6 = findProblemUiState5.copy((r50 & 1) != 0 ? findProblemUiState5.screenArgs : null, (r50 & 2) != 0 ? findProblemUiState5.instructionsAndHints : null, (r50 & 4) != 0 ? findProblemUiState5.gameInstructionsItemList : null, (r50 & 8) != 0 ? findProblemUiState5.isInstructionsShow : false, (r50 & 16) != 0 ? findProblemUiState5.isHintShow : false, (r50 & 32) != 0 ? findProblemUiState5.isHandShow : false, (r50 & 64) != 0 ? findProblemUiState5.countHint : countHint5, (r50 & 128) != 0 ? findProblemUiState5.textOhmOnTable : null, (r50 & 256) != 0 ? findProblemUiState5.textOhmOnMultimeter : (dataTargetArea2 == null || (innerData = dataTargetArea2.getInnerData()) == null) ? FindProblemViewModel.OHM_ZERO : innerData, (r50 & 512) != 0 ? findProblemUiState5.probeBlackOnTarget : false, (r50 & 1024) != 0 ? findProblemUiState5.probeRedOnTarget : onTarget5, (r50 & 2048) != 0 ? findProblemUiState5.isMultimeterVisible : false, (r50 & 4096) != 0 ? findProblemUiState5.isFuseRedOneWithProbeVisible : !dragAndDropCallback5.getOnTarget(), (r50 & 8192) != 0 ? findProblemUiState5.isFuseRedTwoWithProbeVisible : !dragAndDropCallback5.getOnTarget(), (r50 & 16384) != 0 ? findProblemUiState5.isFuseRedThreeWithProbeVisible : !dragAndDropCallback5.getOnTarget(), (r50 & 32768) != 0 ? findProblemUiState5.isFuseRedFourWithProbeVisible : !dragAndDropCallback5.getOnTarget(), (r50 & 65536) != 0 ? findProblemUiState5.isFuseGrayOneVisible : false, (r50 & 131072) != 0 ? findProblemUiState5.isFuseGrayTwoVisible : false, (r50 & 262144) != 0 ? findProblemUiState5.isFuseGrayThreeVisible : false, (r50 & 524288) != 0 ? findProblemUiState5.isFuseGrayFourVisible : false, (r50 & 1048576) != 0 ? findProblemUiState5.isFuseFillOne : false, (r50 & 2097152) != 0 ? findProblemUiState5.isFuseFillTwo : false, (r50 & 4194304) != 0 ? findProblemUiState5.isFuseFillThree : false, (r50 & 8388608) != 0 ? findProblemUiState5.isFuseFillFour : false, (r50 & 16777216) != 0 ? findProblemUiState5.isElementTwoOneHasListener : false, (r50 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState5.isElementTwoTwoHasListener : false, (r50 & 67108864) != 0 ? findProblemUiState5.isElementTwoThreeHasListener : false, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState5.isElementTwoFourHasListener : false, (r50 & 268435456) != 0 ? findProblemUiState5.isFirstGame : false, (r50 & 536870912) != 0 ? findProblemUiState5.isNextGame : false, (r50 & 1073741824) != 0 ? findProblemUiState5.isWin : false, (r50 & Integer.MIN_VALUE) != 0 ? findProblemUiState5.isBlockingLoading : false);
                    } while (!mutableStateFlow5.compareAndSet(value5, copy6));
                }
            } else if (i2 == 3 && this.$dragAndDropCallback.getOnTarget()) {
                if (this.this$0.getRandomOhmForTargetList().contains(this.this$0.get_uiState().getValue().getTextMultimeter())) {
                    this.this$0.getRandomOhmForTargetList().remove(this.this$0.get_uiState().getValue().getTextMultimeter());
                }
                DataTargetArea dataTargetArea3 = this.$dragAndDropCallback.getDataTargetArea();
                currentTargetArea = dataTargetArea3 != null ? dataTargetArea3.getCurrentTargetArea() : null;
                i = currentTargetArea != null ? WhenMappings.$EnumSwitchMapping$0[currentTargetArea.ordinal()] : -1;
                if (i != 5) {
                    if (i != 6) {
                        if (i == 7) {
                            if (this.this$0.get_uiState().getValue().getProbeBlackOnTarget() && this.this$0.get_uiState().getValue().getProbeRedOnTarget()) {
                                MutableStateFlow<? extends FindProblemUiState> mutableStateFlow6 = this.this$0.get_uiState();
                                do {
                                    value8 = mutableStateFlow6.getValue();
                                    copy9 = r3.copy((r50 & 1) != 0 ? r3.screenArgs : null, (r50 & 2) != 0 ? r3.instructionsAndHints : null, (r50 & 4) != 0 ? r3.gameInstructionsItemList : null, (r50 & 8) != 0 ? r3.isInstructionsShow : false, (r50 & 16) != 0 ? r3.isHintShow : false, (r50 & 32) != 0 ? r3.isHandShow : false, (r50 & 64) != 0 ? r3.countHint : 0, (r50 & 128) != 0 ? r3.textOhmOnTable : null, (r50 & 256) != 0 ? r3.textOhmOnMultimeter : null, (r50 & 512) != 0 ? r3.probeBlackOnTarget : false, (r50 & 1024) != 0 ? r3.probeRedOnTarget : false, (r50 & 2048) != 0 ? r3.isMultimeterVisible : false, (r50 & 4096) != 0 ? r3.isFuseRedOneWithProbeVisible : false, (r50 & 8192) != 0 ? r3.isFuseRedTwoWithProbeVisible : false, (r50 & 16384) != 0 ? r3.isFuseRedThreeWithProbeVisible : false, (r50 & 32768) != 0 ? r3.isFuseRedFourWithProbeVisible : false, (r50 & 65536) != 0 ? r3.isFuseGrayOneVisible : false, (r50 & 131072) != 0 ? r3.isFuseGrayTwoVisible : false, (r50 & 262144) != 0 ? r3.isFuseGrayThreeVisible : false, (r50 & 524288) != 0 ? r3.isFuseGrayFourVisible : false, (r50 & 1048576) != 0 ? r3.isFuseFillOne : false, (r50 & 2097152) != 0 ? r3.isFuseFillTwo : false, (r50 & 4194304) != 0 ? r3.isFuseFillThree : true, (r50 & 8388608) != 0 ? r3.isFuseFillFour : false, (r50 & 16777216) != 0 ? r3.isElementTwoOneHasListener : false, (r50 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r3.isElementTwoTwoHasListener : false, (r50 & 67108864) != 0 ? r3.isElementTwoThreeHasListener : false, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.isElementTwoFourHasListener : false, (r50 & 268435456) != 0 ? r3.isFirstGame : false, (r50 & 536870912) != 0 ? r3.isNextGame : false, (r50 & 1073741824) != 0 ? r3.isWin : false, (r50 & Integer.MIN_VALUE) != 0 ? value8.isBlockingLoading : false);
                                } while (!mutableStateFlow6.compareAndSet(value8, copy9));
                            }
                        } else if (i == 8 && this.this$0.get_uiState().getValue().getProbeBlackOnTarget() && this.this$0.get_uiState().getValue().getProbeRedOnTarget()) {
                            MutableStateFlow<? extends FindProblemUiState> mutableStateFlow7 = this.this$0.get_uiState();
                            do {
                                value9 = mutableStateFlow7.getValue();
                                copy10 = r3.copy((r50 & 1) != 0 ? r3.screenArgs : null, (r50 & 2) != 0 ? r3.instructionsAndHints : null, (r50 & 4) != 0 ? r3.gameInstructionsItemList : null, (r50 & 8) != 0 ? r3.isInstructionsShow : false, (r50 & 16) != 0 ? r3.isHintShow : false, (r50 & 32) != 0 ? r3.isHandShow : false, (r50 & 64) != 0 ? r3.countHint : 0, (r50 & 128) != 0 ? r3.textOhmOnTable : null, (r50 & 256) != 0 ? r3.textOhmOnMultimeter : null, (r50 & 512) != 0 ? r3.probeBlackOnTarget : false, (r50 & 1024) != 0 ? r3.probeRedOnTarget : false, (r50 & 2048) != 0 ? r3.isMultimeterVisible : false, (r50 & 4096) != 0 ? r3.isFuseRedOneWithProbeVisible : false, (r50 & 8192) != 0 ? r3.isFuseRedTwoWithProbeVisible : false, (r50 & 16384) != 0 ? r3.isFuseRedThreeWithProbeVisible : false, (r50 & 32768) != 0 ? r3.isFuseRedFourWithProbeVisible : false, (r50 & 65536) != 0 ? r3.isFuseGrayOneVisible : false, (r50 & 131072) != 0 ? r3.isFuseGrayTwoVisible : false, (r50 & 262144) != 0 ? r3.isFuseGrayThreeVisible : false, (r50 & 524288) != 0 ? r3.isFuseGrayFourVisible : false, (r50 & 1048576) != 0 ? r3.isFuseFillOne : false, (r50 & 2097152) != 0 ? r3.isFuseFillTwo : false, (r50 & 4194304) != 0 ? r3.isFuseFillThree : false, (r50 & 8388608) != 0 ? r3.isFuseFillFour : true, (r50 & 16777216) != 0 ? r3.isElementTwoOneHasListener : false, (r50 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r3.isElementTwoTwoHasListener : false, (r50 & 67108864) != 0 ? r3.isElementTwoThreeHasListener : false, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.isElementTwoFourHasListener : false, (r50 & 268435456) != 0 ? r3.isFirstGame : false, (r50 & 536870912) != 0 ? r3.isNextGame : false, (r50 & 1073741824) != 0 ? r3.isWin : false, (r50 & Integer.MIN_VALUE) != 0 ? value9.isBlockingLoading : false);
                            } while (!mutableStateFlow7.compareAndSet(value9, copy10));
                        }
                    } else if (this.this$0.get_uiState().getValue().getProbeBlackOnTarget() && this.this$0.get_uiState().getValue().getProbeRedOnTarget()) {
                        MutableStateFlow<? extends FindProblemUiState> mutableStateFlow8 = this.this$0.get_uiState();
                        do {
                            value7 = mutableStateFlow8.getValue();
                            copy8 = r3.copy((r50 & 1) != 0 ? r3.screenArgs : null, (r50 & 2) != 0 ? r3.instructionsAndHints : null, (r50 & 4) != 0 ? r3.gameInstructionsItemList : null, (r50 & 8) != 0 ? r3.isInstructionsShow : false, (r50 & 16) != 0 ? r3.isHintShow : false, (r50 & 32) != 0 ? r3.isHandShow : false, (r50 & 64) != 0 ? r3.countHint : 0, (r50 & 128) != 0 ? r3.textOhmOnTable : null, (r50 & 256) != 0 ? r3.textOhmOnMultimeter : null, (r50 & 512) != 0 ? r3.probeBlackOnTarget : false, (r50 & 1024) != 0 ? r3.probeRedOnTarget : false, (r50 & 2048) != 0 ? r3.isMultimeterVisible : false, (r50 & 4096) != 0 ? r3.isFuseRedOneWithProbeVisible : false, (r50 & 8192) != 0 ? r3.isFuseRedTwoWithProbeVisible : false, (r50 & 16384) != 0 ? r3.isFuseRedThreeWithProbeVisible : false, (r50 & 32768) != 0 ? r3.isFuseRedFourWithProbeVisible : false, (r50 & 65536) != 0 ? r3.isFuseGrayOneVisible : false, (r50 & 131072) != 0 ? r3.isFuseGrayTwoVisible : false, (r50 & 262144) != 0 ? r3.isFuseGrayThreeVisible : false, (r50 & 524288) != 0 ? r3.isFuseGrayFourVisible : false, (r50 & 1048576) != 0 ? r3.isFuseFillOne : false, (r50 & 2097152) != 0 ? r3.isFuseFillTwo : true, (r50 & 4194304) != 0 ? r3.isFuseFillThree : false, (r50 & 8388608) != 0 ? r3.isFuseFillFour : false, (r50 & 16777216) != 0 ? r3.isElementTwoOneHasListener : false, (r50 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r3.isElementTwoTwoHasListener : false, (r50 & 67108864) != 0 ? r3.isElementTwoThreeHasListener : false, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.isElementTwoFourHasListener : false, (r50 & 268435456) != 0 ? r3.isFirstGame : false, (r50 & 536870912) != 0 ? r3.isNextGame : false, (r50 & 1073741824) != 0 ? r3.isWin : false, (r50 & Integer.MIN_VALUE) != 0 ? value7.isBlockingLoading : false);
                        } while (!mutableStateFlow8.compareAndSet(value7, copy8));
                    }
                } else if (this.this$0.get_uiState().getValue().getProbeBlackOnTarget() && this.this$0.get_uiState().getValue().getProbeRedOnTarget()) {
                    MutableStateFlow<? extends FindProblemUiState> mutableStateFlow9 = this.this$0.get_uiState();
                    do {
                        value6 = mutableStateFlow9.getValue();
                        copy7 = r3.copy((r50 & 1) != 0 ? r3.screenArgs : null, (r50 & 2) != 0 ? r3.instructionsAndHints : null, (r50 & 4) != 0 ? r3.gameInstructionsItemList : null, (r50 & 8) != 0 ? r3.isInstructionsShow : false, (r50 & 16) != 0 ? r3.isHintShow : false, (r50 & 32) != 0 ? r3.isHandShow : false, (r50 & 64) != 0 ? r3.countHint : 7, (r50 & 128) != 0 ? r3.textOhmOnTable : null, (r50 & 256) != 0 ? r3.textOhmOnMultimeter : null, (r50 & 512) != 0 ? r3.probeBlackOnTarget : false, (r50 & 1024) != 0 ? r3.probeRedOnTarget : false, (r50 & 2048) != 0 ? r3.isMultimeterVisible : false, (r50 & 4096) != 0 ? r3.isFuseRedOneWithProbeVisible : false, (r50 & 8192) != 0 ? r3.isFuseRedTwoWithProbeVisible : false, (r50 & 16384) != 0 ? r3.isFuseRedThreeWithProbeVisible : false, (r50 & 32768) != 0 ? r3.isFuseRedFourWithProbeVisible : false, (r50 & 65536) != 0 ? r3.isFuseGrayOneVisible : false, (r50 & 131072) != 0 ? r3.isFuseGrayTwoVisible : false, (r50 & 262144) != 0 ? r3.isFuseGrayThreeVisible : false, (r50 & 524288) != 0 ? r3.isFuseGrayFourVisible : false, (r50 & 1048576) != 0 ? r3.isFuseFillOne : true, (r50 & 2097152) != 0 ? r3.isFuseFillTwo : false, (r50 & 4194304) != 0 ? r3.isFuseFillThree : false, (r50 & 8388608) != 0 ? r3.isFuseFillFour : false, (r50 & 16777216) != 0 ? r3.isElementTwoOneHasListener : false, (r50 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r3.isElementTwoTwoHasListener : false, (r50 & 67108864) != 0 ? r3.isElementTwoThreeHasListener : false, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.isElementTwoFourHasListener : false, (r50 & 268435456) != 0 ? r3.isFirstGame : false, (r50 & 536870912) != 0 ? r3.isNextGame : false, (r50 & 1073741824) != 0 ? r3.isWin : false, (r50 & Integer.MIN_VALUE) != 0 ? value6.isBlockingLoading : false);
                    } while (!mutableStateFlow9.compareAndSet(value6, copy7));
                }
            }
        } else {
            int countHint6 = this.$dragAndDropCallback.getOnTarget() ? 3 : this.this$0.get_uiState().getValue().getCountHint();
            MutableStateFlow<? extends FindProblemUiState> mutableStateFlow10 = this.this$0.get_uiState();
            DragAndDropCallback dragAndDropCallback6 = this.$dragAndDropCallback;
            while (true) {
                FindProblemUiState value10 = mutableStateFlow10.getValue();
                DragAndDropCallback dragAndDropCallback7 = dragAndDropCallback6;
                copy = r3.copy((r50 & 1) != 0 ? r3.screenArgs : null, (r50 & 2) != 0 ? r3.instructionsAndHints : null, (r50 & 4) != 0 ? r3.gameInstructionsItemList : null, (r50 & 8) != 0 ? r3.isInstructionsShow : false, (r50 & 16) != 0 ? r3.isHintShow : false, (r50 & 32) != 0 ? r3.isHandShow : false, (r50 & 64) != 0 ? r3.countHint : countHint6, (r50 & 128) != 0 ? r3.textOhmOnTable : null, (r50 & 256) != 0 ? r3.textOhmOnMultimeter : null, (r50 & 512) != 0 ? r3.probeBlackOnTarget : dragAndDropCallback6.getOnTarget(), (r50 & 1024) != 0 ? r3.probeRedOnTarget : false, (r50 & 2048) != 0 ? r3.isMultimeterVisible : false, (r50 & 4096) != 0 ? r3.isFuseRedOneWithProbeVisible : false, (r50 & 8192) != 0 ? r3.isFuseRedTwoWithProbeVisible : false, (r50 & 16384) != 0 ? r3.isFuseRedThreeWithProbeVisible : false, (r50 & 32768) != 0 ? r3.isFuseRedFourWithProbeVisible : false, (r50 & 65536) != 0 ? r3.isFuseGrayOneVisible : false, (r50 & 131072) != 0 ? r3.isFuseGrayTwoVisible : false, (r50 & 262144) != 0 ? r3.isFuseGrayThreeVisible : false, (r50 & 524288) != 0 ? r3.isFuseGrayFourVisible : false, (r50 & 1048576) != 0 ? r3.isFuseFillOne : false, (r50 & 2097152) != 0 ? r3.isFuseFillTwo : false, (r50 & 4194304) != 0 ? r3.isFuseFillThree : false, (r50 & 8388608) != 0 ? r3.isFuseFillFour : false, (r50 & 16777216) != 0 ? r3.isElementTwoOneHasListener : false, (r50 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r3.isElementTwoTwoHasListener : false, (r50 & 67108864) != 0 ? r3.isElementTwoThreeHasListener : false, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.isElementTwoFourHasListener : false, (r50 & 268435456) != 0 ? r3.isFirstGame : false, (r50 & 536870912) != 0 ? r3.isNextGame : false, (r50 & 1073741824) != 0 ? r3.isWin : false, (r50 & Integer.MIN_VALUE) != 0 ? value10.isBlockingLoading : false);
                if (mutableStateFlow10.compareAndSet(value10, copy)) {
                    break;
                }
                dragAndDropCallback6 = dragAndDropCallback7;
            }
        }
        return Unit.INSTANCE;
    }
}
