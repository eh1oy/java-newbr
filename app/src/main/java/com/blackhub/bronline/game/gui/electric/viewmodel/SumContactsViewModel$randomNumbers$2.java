package com.blackhub.bronline.game.gui.electric.viewmodel;

import com.blackhub.bronline.game.gui.electric.state.SumContactsUiState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SumContactsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.electric.viewmodel.SumContactsViewModel$randomNumbers$2", f = "SumContactsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nSumContactsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SumContactsViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/SumContactsViewModel$randomNumbers$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,321:1\n230#2,5:322\n*S KotlinDebug\n*F\n+ 1 SumContactsViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/SumContactsViewModel$randomNumbers$2\n*L\n308#1:322,5\n*E\n"})
/* loaded from: classes3.dex */
public final class SumContactsViewModel$randomNumbers$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ SumContactsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SumContactsViewModel$randomNumbers$2(SumContactsViewModel sumContactsViewModel, Continuation<? super SumContactsViewModel$randomNumbers$2> continuation) {
        super(2, continuation);
        this.this$0 = sumContactsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SumContactsViewModel$randomNumbers$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SumContactsViewModel$randomNumbers$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        SumContactsUiState value;
        SumContactsUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Ref.IntRef intRef = new Ref.IntRef();
        Ref.IntRef intRef2 = new Ref.IntRef();
        Ref.IntRef intRef3 = new Ref.IntRef();
        boolean z = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z2 = true;
            if (z) {
                break;
            }
            IntRange intRange = new IntRange(1, 9);
            Random.Companion companion = Random.INSTANCE;
            intRef.element = RangesKt___RangesKt.random(intRange, companion);
            int random = RangesKt___RangesKt.random(new IntRange(1, intRef.element), companion);
            int i4 = intRef.element - random;
            int random2 = RangesKt___RangesKt.random(new IntRange(i4, 9), companion);
            intRef2.element = random2;
            int i5 = random2 - i4;
            int i6 = random + i5;
            intRef3.element = i6;
            if (random == i4 || random == i5 || i4 == i5 || random == 0 || i4 == 0 || i5 == 0 || i6 > 9 || intRef.element - random <= 0) {
                z2 = false;
            }
            i = random;
            z = z2;
            i3 = i5;
            i2 = i4;
        }
        List shuffled = CollectionsKt__CollectionsJVMKt.shuffled(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(i), Boxing.boxInt(i2), Boxing.boxInt(i3)}));
        Integer num = (Integer) CollectionsKt___CollectionsKt.getOrNull(shuffled, 0);
        int intValue = num != null ? num.intValue() : 0;
        Integer num2 = (Integer) CollectionsKt___CollectionsKt.getOrNull(shuffled, 1);
        int intValue2 = num2 != null ? num2.intValue() : 0;
        Integer num3 = (Integer) CollectionsKt___CollectionsKt.getOrNull(shuffled, 2);
        int intValue3 = num3 != null ? num3.intValue() : 0;
        MutableStateFlow<? extends SumContactsUiState> mutableStateFlow = this.this$0.get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r10.copy((r40 & 1) != 0 ? r10.instructionsAndHints : null, (r40 & 2) != 0 ? r10.gameInstructionsItemList : null, (r40 & 4) != 0 ? r10.isInstructionsShow : false, (r40 & 8) != 0 ? r10.isHintShow : false, (r40 & 16) != 0 ? r10.isHandShow : false, (r40 & 32) != 0 ? r10.countHint : 0, (r40 & 64) != 0 ? r10.sumOne : intRef.element, (r40 & 128) != 0 ? r10.sumTwo : intRef3.element, (r40 & 256) != 0 ? r10.sumThree : intRef2.element, (r40 & 512) != 0 ? r10.bulbTextOne : intValue, (r40 & 1024) != 0 ? r10.bulbTextTwo : intValue2, (r40 & 2048) != 0 ? r10.bulbTextThree : intValue3, (r40 & 4096) != 0 ? r10.textOne : 0, (r40 & 8192) != 0 ? r10.textTwo : 0, (r40 & 16384) != 0 ? r10.textThree : 0, (r40 & 32768) != 0 ? r10.countError : 0, (r40 & 65536) != 0 ? r10.isBulbOneOnTarget : false, (r40 & 131072) != 0 ? r10.isBulbTwoOnTarget : false, (r40 & 262144) != 0 ? r10.isBulbThreeOnTarget : false, (r40 & 524288) != 0 ? r10.isFirstGame : false, (r40 & 1048576) != 0 ? r10.isWin : null, (r40 & 2097152) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        return Unit.INSTANCE;
    }
}
