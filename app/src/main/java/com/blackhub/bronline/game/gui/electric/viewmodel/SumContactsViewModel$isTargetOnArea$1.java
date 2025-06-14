package com.blackhub.bronline.game.gui.electric.viewmodel;

import com.blackhub.bronline.game.core.utils.draganddrop.enums.CurrentDraggableItem;
import com.blackhub.bronline.game.core.utils.draganddrop.enums.CurrentTargetArea;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DataTargetArea;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DragAndDropCallback;
import com.blackhub.bronline.game.gui.electric.state.SumContactsUiState;
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

/* compiled from: SumContactsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.electric.viewmodel.SumContactsViewModel$isTargetOnArea$1", f = "SumContactsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nSumContactsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SumContactsViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/SumContactsViewModel$isTargetOnArea$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,321:1\n230#2,5:322\n230#2,5:327\n230#2,5:332\n*S KotlinDebug\n*F\n+ 1 SumContactsViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/SumContactsViewModel$isTargetOnArea$1\n*L\n87#1:322,5\n117#1:327,5\n147#1:332,5\n*E\n"})
/* loaded from: classes3.dex */
public final class SumContactsViewModel$isTargetOnArea$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ DragAndDropCallback $dragAndDropCallback;
    public int label;
    public final /* synthetic */ SumContactsViewModel this$0;

    /* compiled from: SumContactsViewModel.kt */
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
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CurrentDraggableItem.values().length];
            try {
                iArr2[CurrentDraggableItem.ELEMENT_BULB.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SumContactsViewModel$isTargetOnArea$1(DragAndDropCallback dragAndDropCallback, SumContactsViewModel sumContactsViewModel, Continuation<? super SumContactsViewModel$isTargetOnArea$1> continuation) {
        super(2, continuation);
        this.$dragAndDropCallback = dragAndDropCallback;
        this.this$0 = sumContactsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SumContactsViewModel$isTargetOnArea$1(this.$dragAndDropCallback, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SumContactsViewModel$isTargetOnArea$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        int countError;
        SumContactsUiState copy;
        int countError2;
        SumContactsUiState copy2;
        int countError3;
        SumContactsUiState copy3;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int innerData = (this.$dragAndDropCallback.getDataDragAndDrop() == null || !this.$dragAndDropCallback.getOnTarget()) ? -10 : this.$dragAndDropCallback.getDataDragAndDrop().getInnerData();
        SumContactsUiState value = this.this$0.getUiState().getValue();
        if (WhenMappings.$EnumSwitchMapping$1[this.$dragAndDropCallback.getCurrentDraggableItem().ordinal()] == 1) {
            DataTargetArea dataTargetArea = this.$dragAndDropCallback.getDataTargetArea();
            CurrentTargetArea currentTargetArea = dataTargetArea != null ? dataTargetArea.getCurrentTargetArea() : null;
            int i = currentTargetArea == null ? -1 : WhenMappings.$EnumSwitchMapping$0[currentTargetArea.ordinal()];
            if (i == 1) {
                boolean z = value.getTextTwo() + innerData == value.getSumOne();
                boolean z2 = value.getTextThree() + innerData == value.getSumTwo();
                if (innerData != -10 && ((value.getTextTwo() != -10 && !z) || (value.getTextThree() != -10 && !z2))) {
                    countError = this.this$0.get_uiState().getValue().getCountError() + 1;
                } else {
                    countError = this.this$0.get_uiState().getValue().getCountError();
                }
                boolean isHintShow = (this.$dragAndDropCallback.getOnTarget() || !this.this$0.get_uiState().getValue().isNeedHintClose()) ? this.this$0.get_uiState().getValue().isHintShow() : false;
                MutableStateFlow<? extends SumContactsUiState> mutableStateFlow = this.this$0.get_uiState();
                DragAndDropCallback dragAndDropCallback = this.$dragAndDropCallback;
                while (true) {
                    SumContactsUiState value2 = mutableStateFlow.getValue();
                    DragAndDropCallback dragAndDropCallback2 = dragAndDropCallback;
                    MutableStateFlow<? extends SumContactsUiState> mutableStateFlow2 = mutableStateFlow;
                    copy = r16.copy((r40 & 1) != 0 ? r16.instructionsAndHints : null, (r40 & 2) != 0 ? r16.gameInstructionsItemList : null, (r40 & 4) != 0 ? r16.isInstructionsShow : false, (r40 & 8) != 0 ? r16.isHintShow : isHintShow, (r40 & 16) != 0 ? r16.isHandShow : false, (r40 & 32) != 0 ? r16.countHint : 0, (r40 & 64) != 0 ? r16.sumOne : 0, (r40 & 128) != 0 ? r16.sumTwo : 0, (r40 & 256) != 0 ? r16.sumThree : 0, (r40 & 512) != 0 ? r16.bulbTextOne : 0, (r40 & 1024) != 0 ? r16.bulbTextTwo : 0, (r40 & 2048) != 0 ? r16.bulbTextThree : 0, (r40 & 4096) != 0 ? r16.textOne : innerData, (r40 & 8192) != 0 ? r16.textTwo : 0, (r40 & 16384) != 0 ? r16.textThree : 0, (r40 & 32768) != 0 ? r16.countError : countError, (r40 & 65536) != 0 ? r16.isBulbOneOnTarget : dragAndDropCallback.getOnTarget(), (r40 & 131072) != 0 ? r16.isBulbTwoOnTarget : false, (r40 & 262144) != 0 ? r16.isBulbThreeOnTarget : false, (r40 & 524288) != 0 ? r16.isFirstGame : false, (r40 & 1048576) != 0 ? r16.isWin : null, (r40 & 2097152) != 0 ? value2.isBlockingLoading : false);
                    if (mutableStateFlow2.compareAndSet(value2, copy)) {
                        break;
                    }
                    mutableStateFlow = mutableStateFlow2;
                    dragAndDropCallback = dragAndDropCallback2;
                }
            } else if (i == 2) {
                boolean z3 = value.getTextTwo() + innerData == value.getSumOne();
                boolean z4 = value.getTextTwo() + innerData == value.getSumThree();
                if (innerData != -10 && ((value.getTextOne() != -10 && !z3) || (value.getTextThree() != -10 && !z4))) {
                    countError2 = this.this$0.get_uiState().getValue().getCountError() + 1;
                } else {
                    countError2 = this.this$0.get_uiState().getValue().getCountError();
                }
                int i2 = countError2;
                boolean isHintShow2 = (this.$dragAndDropCallback.getOnTarget() || !this.this$0.get_uiState().getValue().isNeedHintClose()) ? this.this$0.get_uiState().getValue().isHintShow() : false;
                MutableStateFlow<? extends SumContactsUiState> mutableStateFlow3 = this.this$0.get_uiState();
                DragAndDropCallback dragAndDropCallback3 = this.$dragAndDropCallback;
                while (true) {
                    SumContactsUiState value3 = mutableStateFlow3.getValue();
                    DragAndDropCallback dragAndDropCallback4 = dragAndDropCallback3;
                    copy2 = r17.copy((r40 & 1) != 0 ? r17.instructionsAndHints : null, (r40 & 2) != 0 ? r17.gameInstructionsItemList : null, (r40 & 4) != 0 ? r17.isInstructionsShow : false, (r40 & 8) != 0 ? r17.isHintShow : isHintShow2, (r40 & 16) != 0 ? r17.isHandShow : false, (r40 & 32) != 0 ? r17.countHint : 0, (r40 & 64) != 0 ? r17.sumOne : 0, (r40 & 128) != 0 ? r17.sumTwo : 0, (r40 & 256) != 0 ? r17.sumThree : 0, (r40 & 512) != 0 ? r17.bulbTextOne : 0, (r40 & 1024) != 0 ? r17.bulbTextTwo : 0, (r40 & 2048) != 0 ? r17.bulbTextThree : 0, (r40 & 4096) != 0 ? r17.textOne : 0, (r40 & 8192) != 0 ? r17.textTwo : innerData, (r40 & 16384) != 0 ? r17.textThree : 0, (r40 & 32768) != 0 ? r17.countError : i2, (r40 & 65536) != 0 ? r17.isBulbOneOnTarget : false, (r40 & 131072) != 0 ? r17.isBulbTwoOnTarget : dragAndDropCallback3.getOnTarget(), (r40 & 262144) != 0 ? r17.isBulbThreeOnTarget : false, (r40 & 524288) != 0 ? r17.isFirstGame : false, (r40 & 1048576) != 0 ? r17.isWin : null, (r40 & 2097152) != 0 ? value3.isBlockingLoading : false);
                    if (mutableStateFlow3.compareAndSet(value3, copy2)) {
                        break;
                    }
                    dragAndDropCallback3 = dragAndDropCallback4;
                }
            } else if (i == 3) {
                boolean z5 = value.getTextOne() + innerData == value.getSumTwo();
                boolean z6 = value.getTextTwo() + innerData == value.getSumThree();
                if (innerData != -10 && ((value.getTextOne() != -10 && !z5) || (value.getTextTwo() != -10 && !z6))) {
                    countError3 = this.this$0.get_uiState().getValue().getCountError() + 1;
                } else {
                    countError3 = this.this$0.get_uiState().getValue().getCountError();
                }
                int i3 = countError3;
                boolean isHintShow3 = (this.$dragAndDropCallback.getOnTarget() || !this.this$0.get_uiState().getValue().isNeedHintClose()) ? this.this$0.get_uiState().getValue().isHintShow() : false;
                MutableStateFlow<? extends SumContactsUiState> mutableStateFlow4 = this.this$0.get_uiState();
                DragAndDropCallback dragAndDropCallback5 = this.$dragAndDropCallback;
                while (true) {
                    SumContactsUiState value4 = mutableStateFlow4.getValue();
                    DragAndDropCallback dragAndDropCallback6 = dragAndDropCallback5;
                    copy3 = r18.copy((r40 & 1) != 0 ? r18.instructionsAndHints : null, (r40 & 2) != 0 ? r18.gameInstructionsItemList : null, (r40 & 4) != 0 ? r18.isInstructionsShow : false, (r40 & 8) != 0 ? r18.isHintShow : isHintShow3, (r40 & 16) != 0 ? r18.isHandShow : false, (r40 & 32) != 0 ? r18.countHint : 0, (r40 & 64) != 0 ? r18.sumOne : 0, (r40 & 128) != 0 ? r18.sumTwo : 0, (r40 & 256) != 0 ? r18.sumThree : 0, (r40 & 512) != 0 ? r18.bulbTextOne : 0, (r40 & 1024) != 0 ? r18.bulbTextTwo : 0, (r40 & 2048) != 0 ? r18.bulbTextThree : 0, (r40 & 4096) != 0 ? r18.textOne : 0, (r40 & 8192) != 0 ? r18.textTwo : 0, (r40 & 16384) != 0 ? r18.textThree : innerData, (r40 & 32768) != 0 ? r18.countError : i3, (r40 & 65536) != 0 ? r18.isBulbOneOnTarget : false, (r40 & 131072) != 0 ? r18.isBulbTwoOnTarget : false, (r40 & 262144) != 0 ? r18.isBulbThreeOnTarget : dragAndDropCallback5.getOnTarget(), (r40 & 524288) != 0 ? r18.isFirstGame : false, (r40 & 1048576) != 0 ? r18.isWin : null, (r40 & 2097152) != 0 ? value4.isBlockingLoading : false);
                    if (mutableStateFlow4.compareAndSet(value4, copy3)) {
                        break;
                    }
                    dragAndDropCallback5 = dragAndDropCallback6;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
