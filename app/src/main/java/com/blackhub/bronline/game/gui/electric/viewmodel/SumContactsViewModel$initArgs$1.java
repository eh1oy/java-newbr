package com.blackhub.bronline.game.gui.electric.viewmodel;

import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsItem;
import com.blackhub.bronline.game.gui.electric.model.ElectricInstructionsAndHintsModel;
import com.blackhub.bronline.game.gui.electric.state.SumContactsUiState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SumContactsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.electric.viewmodel.SumContactsViewModel$initArgs$1", f = "SumContactsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nSumContactsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SumContactsViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/SumContactsViewModel$initArgs$1\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,321:1\n96#2:322\n230#3,5:323\n*S KotlinDebug\n*F\n+ 1 SumContactsViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/SumContactsViewModel$initArgs$1\n*L\n180#1:322\n187#1:323,5\n*E\n"})
/* loaded from: classes3.dex */
public final class SumContactsViewModel$initArgs$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $screenArgs;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SumContactsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SumContactsViewModel$initArgs$1(String str, SumContactsViewModel sumContactsViewModel, Continuation<? super SumContactsViewModel$initArgs$1> continuation) {
        super(2, continuation);
        this.$screenArgs = str;
        this.this$0 = sumContactsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SumContactsViewModel$initArgs$1 sumContactsViewModel$initArgs$1 = new SumContactsViewModel$initArgs$1(this.$screenArgs, this.this$0, continuation);
        sumContactsViewModel$initArgs$1.L$0 = obj;
        return sumContactsViewModel$initArgs$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SumContactsViewModel$initArgs$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String empty;
        SumContactsUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Json.Companion companion = Json.INSTANCE;
        String str = this.$screenArgs;
        companion.getSerializersModule();
        List list = (List) companion.decodeFromString(new ArrayListSerializer(ElectricInstructionsAndHintsModel.INSTANCE.serializer()), str);
        ElectricInstructionsAndHintsModel electricInstructionsAndHintsModel = (ElectricInstructionsAndHintsModel) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (electricInstructionsAndHintsModel == null || (empty = electricInstructionsAndHintsModel.getTextInstructions()) == null) {
            empty = AnyExtensionKt.empty(coroutineScope);
        }
        List listOf = CollectionsKt__CollectionsJVMKt.listOf(new GameInstructionsItem(R.drawable.img_instructions_sum_contacts, empty));
        MutableStateFlow<? extends SumContactsUiState> mutableStateFlow = this.this$0.get_uiState();
        while (true) {
            SumContactsUiState value = mutableStateFlow.getValue();
            MutableStateFlow<? extends SumContactsUiState> mutableStateFlow2 = mutableStateFlow;
            copy = r3.copy((r40 & 1) != 0 ? r3.instructionsAndHints : list, (r40 & 2) != 0 ? r3.gameInstructionsItemList : listOf, (r40 & 4) != 0 ? r3.isInstructionsShow : true, (r40 & 8) != 0 ? r3.isHintShow : false, (r40 & 16) != 0 ? r3.isHandShow : false, (r40 & 32) != 0 ? r3.countHint : 0, (r40 & 64) != 0 ? r3.sumOne : 0, (r40 & 128) != 0 ? r3.sumTwo : 0, (r40 & 256) != 0 ? r3.sumThree : 0, (r40 & 512) != 0 ? r3.bulbTextOne : 0, (r40 & 1024) != 0 ? r3.bulbTextTwo : 0, (r40 & 2048) != 0 ? r3.bulbTextThree : 0, (r40 & 4096) != 0 ? r3.textOne : 0, (r40 & 8192) != 0 ? r3.textTwo : 0, (r40 & 16384) != 0 ? r3.textThree : 0, (r40 & 32768) != 0 ? r3.countError : 0, (r40 & 65536) != 0 ? r3.isBulbOneOnTarget : false, (r40 & 131072) != 0 ? r3.isBulbTwoOnTarget : false, (r40 & 262144) != 0 ? r3.isBulbThreeOnTarget : false, (r40 & 524288) != 0 ? r3.isFirstGame : false, (r40 & 1048576) != 0 ? r3.isWin : null, (r40 & 2097152) != 0 ? value.isBlockingLoading : false);
            if (mutableStateFlow2.compareAndSet(value, copy)) {
                return Unit.INSTANCE;
            }
            mutableStateFlow = mutableStateFlow2;
        }
    }
}
