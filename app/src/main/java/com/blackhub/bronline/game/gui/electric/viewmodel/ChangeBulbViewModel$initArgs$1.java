package com.blackhub.bronline.game.gui.electric.viewmodel;

import com.blackhub.bronline.game.gui.electric.model.ElectricInstructionsAndHintsModel;
import com.blackhub.bronline.game.gui.electric.state.ChangeBulbUiState;
import java.util.List;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChangeBulbViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.electric.viewmodel.ChangeBulbViewModel$initArgs$1", f = "ChangeBulbViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nChangeBulbViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeBulbViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/ChangeBulbViewModel$initArgs$1\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,111:1\n96#2:112\n230#3,5:113\n*S KotlinDebug\n*F\n+ 1 ChangeBulbViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/ChangeBulbViewModel$initArgs$1\n*L\n66#1:112\n67#1:113,5\n*E\n"})
/* loaded from: classes3.dex */
public final class ChangeBulbViewModel$initArgs$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $screenArgs;
    public int label;
    public final /* synthetic */ ChangeBulbViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeBulbViewModel$initArgs$1(String str, ChangeBulbViewModel changeBulbViewModel, Continuation<? super ChangeBulbViewModel$initArgs$1> continuation) {
        super(2, continuation);
        this.$screenArgs = str;
        this.this$0 = changeBulbViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ChangeBulbViewModel$initArgs$1(this.$screenArgs, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ChangeBulbViewModel$initArgs$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ChangeBulbUiState value;
        ChangeBulbUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Json.Companion companion = Json.INSTANCE;
        String str = this.$screenArgs;
        companion.getSerializersModule();
        List list = (List) companion.decodeFromString(new ArrayListSerializer(ElectricInstructionsAndHintsModel.INSTANCE.serializer()), str);
        MutableStateFlow<? extends ChangeBulbUiState> mutableStateFlow = this.this$0.get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r0.copy((r18 & 1) != 0 ? r0.instructionsAndHints : list, (r18 & 2) != 0 ? r0.isHintShow : false, (r18 & 4) != 0 ? r0.isHandShow : false, (r18 & 8) != 0 ? r0.countHint : 0, (r18 & 16) != 0 ? r0.isBulbBrokeVisible : false, (r18 & 32) != 0 ? r0.isBulbFullVisible : false, (r18 & 64) != 0 ? r0.isFirstGame : false, (r18 & 128) != 0 ? value.isWin : null);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        return Unit.INSTANCE;
    }
}
