package com.blackhub.bronline.game.gui.electric.viewmodel;

import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsItem;
import com.blackhub.bronline.game.gui.electric.model.ElectricInstructionsAndHintsModel;
import com.blackhub.bronline.game.gui.electric.state.RaiseChargeUiState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
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

/* compiled from: RaiseChargeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.electric.viewmodel.RaiseChargeViewModel$initArgs$1", f = "RaiseChargeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nRaiseChargeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RaiseChargeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/RaiseChargeViewModel$initArgs$1\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,148:1\n96#2:149\n230#3,5:150\n*S KotlinDebug\n*F\n+ 1 RaiseChargeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/RaiseChargeViewModel$initArgs$1\n*L\n65#1:149\n75#1:150,5\n*E\n"})
/* loaded from: classes3.dex */
public final class RaiseChargeViewModel$initArgs$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $screenArgs;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ RaiseChargeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RaiseChargeViewModel$initArgs$1(String str, RaiseChargeViewModel raiseChargeViewModel, Continuation<? super RaiseChargeViewModel$initArgs$1> continuation) {
        super(2, continuation);
        this.$screenArgs = str;
        this.this$0 = raiseChargeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        RaiseChargeViewModel$initArgs$1 raiseChargeViewModel$initArgs$1 = new RaiseChargeViewModel$initArgs$1(this.$screenArgs, this.this$0, continuation);
        raiseChargeViewModel$initArgs$1.L$0 = obj;
        return raiseChargeViewModel$initArgs$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((RaiseChargeViewModel$initArgs$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        List emptyList;
        String empty;
        RaiseChargeUiState value;
        RaiseChargeUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        try {
            Json.Companion companion = Json.INSTANCE;
            String str = this.$screenArgs;
            companion.getSerializersModule();
            emptyList = (List) companion.decodeFromString(new ArrayListSerializer(ElectricInstructionsAndHintsModel.INSTANCE.serializer()), str);
        } catch (Exception unused) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        ElectricInstructionsAndHintsModel electricInstructionsAndHintsModel = (ElectricInstructionsAndHintsModel) CollectionsKt___CollectionsKt.firstOrNull(emptyList);
        if (electricInstructionsAndHintsModel == null || (empty = electricInstructionsAndHintsModel.getTextInstructions()) == null) {
            empty = AnyExtensionKt.empty(coroutineScope);
        }
        List listOf = CollectionsKt__CollectionsJVMKt.listOf(new GameInstructionsItem(R.drawable.img_instructions_raise_charge, empty));
        MutableStateFlow<? extends RaiseChargeUiState> mutableStateFlow = this.this$0.get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r20 & 1) != 0 ? r3.instructionsAndHints : emptyList, (r20 & 2) != 0 ? r3.gameInstructionsItemList : listOf, (r20 & 4) != 0 ? r3.isInstructionsShow : true, (r20 & 8) != 0 ? r3.isHintShow : false, (r20 & 16) != 0 ? r3.isHandShow : false, (r20 & 32) != 0 ? r3.countHint : 0, (r20 & 64) != 0 ? r3.isFirstGame : false, (r20 & 128) != 0 ? r3.isWin : null, (r20 & 256) != 0 ? value.count : 0);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        return Unit.INSTANCE;
    }
}
