package com.blackhub.bronline.game.gui.electric.viewmodel;

import androidx.media3.common.C;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsItem;
import com.blackhub.bronline.game.gui.electric.model.ElectricInstructionsAndHintsModel;
import com.blackhub.bronline.game.gui.electric.state.FindProblemUiState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FindProblemViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel$initArgs$1", f = "FindProblemViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nFindProblemViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindProblemViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel$initArgs$1\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,526:1\n96#2:527\n230#3,5:528\n*S KotlinDebug\n*F\n+ 1 FindProblemViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel$initArgs$1\n*L\n89#1:527\n100#1:528,5\n*E\n"})
/* loaded from: classes3.dex */
public final class FindProblemViewModel$initArgs$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $levelCounter;
    public final /* synthetic */ String $screenArgs;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ FindProblemViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FindProblemViewModel$initArgs$1(String str, FindProblemViewModel findProblemViewModel, int i, Continuation<? super FindProblemViewModel$initArgs$1> continuation) {
        super(2, continuation);
        this.$screenArgs = str;
        this.this$0 = findProblemViewModel;
        this.$levelCounter = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FindProblemViewModel$initArgs$1 findProblemViewModel$initArgs$1 = new FindProblemViewModel$initArgs$1(this.$screenArgs, this.this$0, this.$levelCounter, continuation);
        findProblemViewModel$initArgs$1.L$0 = obj;
        return findProblemViewModel$initArgs$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FindProblemViewModel$initArgs$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String empty;
        String empty2;
        FindProblemUiState copy;
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
        GameInstructionsItem gameInstructionsItem = new GameInstructionsItem(R.drawable.img_instructions_find_problem, empty);
        ElectricInstructionsAndHintsModel electricInstructionsAndHintsModel2 = (ElectricInstructionsAndHintsModel) CollectionsKt___CollectionsKt.lastOrNull(list);
        if (electricInstructionsAndHintsModel2 == null || (empty2 = electricInstructionsAndHintsModel2.getTextInstructions()) == null) {
            empty2 = AnyExtensionKt.empty(coroutineScope);
        }
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new GameInstructionsItem[]{gameInstructionsItem, new GameInstructionsItem(R.drawable.img_instructions_change_bulb, empty2)});
        MutableStateFlow<? extends FindProblemUiState> mutableStateFlow = this.this$0.get_uiState();
        String str2 = this.$screenArgs;
        int i = this.$levelCounter;
        while (true) {
            FindProblemUiState value = mutableStateFlow.getValue();
            int i2 = i;
            String str3 = str2;
            MutableStateFlow<? extends FindProblemUiState> mutableStateFlow2 = mutableStateFlow;
            copy = r3.copy((r50 & 1) != 0 ? r3.screenArgs : str2, (r50 & 2) != 0 ? r3.instructionsAndHints : list, (r50 & 4) != 0 ? r3.gameInstructionsItemList : listOf, (r50 & 8) != 0 ? r3.isInstructionsShow : i == 1, (r50 & 16) != 0 ? r3.isHintShow : false, (r50 & 32) != 0 ? r3.isHandShow : false, (r50 & 64) != 0 ? r3.countHint : 0, (r50 & 128) != 0 ? r3.textOhmOnTable : null, (r50 & 256) != 0 ? r3.textOhmOnMultimeter : null, (r50 & 512) != 0 ? r3.probeBlackOnTarget : false, (r50 & 1024) != 0 ? r3.probeRedOnTarget : false, (r50 & 2048) != 0 ? r3.isMultimeterVisible : false, (r50 & 4096) != 0 ? r3.isFuseRedOneWithProbeVisible : false, (r50 & 8192) != 0 ? r3.isFuseRedTwoWithProbeVisible : false, (r50 & 16384) != 0 ? r3.isFuseRedThreeWithProbeVisible : false, (r50 & 32768) != 0 ? r3.isFuseRedFourWithProbeVisible : false, (r50 & 65536) != 0 ? r3.isFuseGrayOneVisible : false, (r50 & 131072) != 0 ? r3.isFuseGrayTwoVisible : false, (r50 & 262144) != 0 ? r3.isFuseGrayThreeVisible : false, (r50 & 524288) != 0 ? r3.isFuseGrayFourVisible : false, (r50 & 1048576) != 0 ? r3.isFuseFillOne : false, (r50 & 2097152) != 0 ? r3.isFuseFillTwo : false, (r50 & 4194304) != 0 ? r3.isFuseFillThree : false, (r50 & 8388608) != 0 ? r3.isFuseFillFour : false, (r50 & 16777216) != 0 ? r3.isElementTwoOneHasListener : false, (r50 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r3.isElementTwoTwoHasListener : false, (r50 & 67108864) != 0 ? r3.isElementTwoThreeHasListener : false, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.isElementTwoFourHasListener : false, (r50 & 268435456) != 0 ? r3.isFirstGame : false, (r50 & 536870912) != 0 ? r3.isNextGame : false, (r50 & 1073741824) != 0 ? r3.isWin : false, (r50 & Integer.MIN_VALUE) != 0 ? value.isBlockingLoading : false);
            if (mutableStateFlow2.compareAndSet(value, copy)) {
                return Unit.INSTANCE;
            }
            mutableStateFlow = mutableStateFlow2;
            i = i2;
            str2 = str3;
        }
    }
}
