package com.blackhub.bronline.game.gui.electric.viewmodel;

import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsItem;
import com.blackhub.bronline.game.gui.electric.model.ElectricInstructionsAndHintsModel;
import com.blackhub.bronline.game.gui.electric.state.CollectSchemeUiState;
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

/* compiled from: CollectSchemeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel$initArgs$1", f = "CollectSchemeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCollectSchemeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectSchemeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/CollectSchemeViewModel$initArgs$1\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,186:1\n96#2:187\n230#3,5:188\n*S KotlinDebug\n*F\n+ 1 CollectSchemeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/CollectSchemeViewModel$initArgs$1\n*L\n66#1:187\n73#1:188,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CollectSchemeViewModel$initArgs$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $screenArgs;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ CollectSchemeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectSchemeViewModel$initArgs$1(String str, CollectSchemeViewModel collectSchemeViewModel, Continuation<? super CollectSchemeViewModel$initArgs$1> continuation) {
        super(2, continuation);
        this.$screenArgs = str;
        this.this$0 = collectSchemeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        CollectSchemeViewModel$initArgs$1 collectSchemeViewModel$initArgs$1 = new CollectSchemeViewModel$initArgs$1(this.$screenArgs, this.this$0, continuation);
        collectSchemeViewModel$initArgs$1.L$0 = obj;
        return collectSchemeViewModel$initArgs$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CollectSchemeViewModel$initArgs$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String empty;
        CollectSchemeUiState copy;
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
        List listOf = CollectionsKt__CollectionsJVMKt.listOf(new GameInstructionsItem(R.drawable.img_instructions_collect_scheme, empty));
        MutableStateFlow<? extends CollectSchemeUiState> mutableStateFlow = this.this$0.get_uiState();
        while (true) {
            CollectSchemeUiState value = mutableStateFlow.getValue();
            MutableStateFlow<? extends CollectSchemeUiState> mutableStateFlow2 = mutableStateFlow;
            copy = r3.copy((r24 & 1) != 0 ? r3.instructionsAndHints : list, (r24 & 2) != 0 ? r3.gameInstructionsItemList : listOf, (r24 & 4) != 0 ? r3.isInstructionsShow : true, (r24 & 8) != 0 ? r3.isHintShow : false, (r24 & 16) != 0 ? r3.isHandShow : false, (r24 & 32) != 0 ? r3.countHint : 0, (r24 & 64) != 0 ? r3.isFirstGame : false, (r24 & 128) != 0 ? r3.isTimerStart : false, (r24 & 256) != 0 ? r3.isWin : null, (r24 & 512) != 0 ? r3.colorTrafficLight : null, (r24 & 1024) != 0 ? value.isBlockingLoading : false);
            if (mutableStateFlow2.compareAndSet(value, copy)) {
                return Unit.INSTANCE;
            }
            mutableStateFlow = mutableStateFlow2;
        }
    }
}
