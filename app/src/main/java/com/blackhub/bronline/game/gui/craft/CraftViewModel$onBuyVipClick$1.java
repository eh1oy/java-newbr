package com.blackhub.bronline.game.gui.craft;

import androidx.media3.common.C;
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
/* compiled from: CraftViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$onBuyVipClick$1", f = "CraftViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$onBuyVipClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1753:1\n230#2,5:1754\n*S KotlinDebug\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$onBuyVipClick$1\n*L\n1478#1:1754,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CraftViewModel$onBuyVipClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ CraftViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CraftViewModel$onBuyVipClick$1(CraftViewModel craftViewModel, Continuation<? super CraftViewModel$onBuyVipClick$1> continuation) {
        super(2, continuation);
        this.this$0 = craftViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CraftViewModel$onBuyVipClick$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CraftViewModel$onBuyVipClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CraftActionWithJSON craftActionWithJSON;
        CraftUiState value;
        CraftUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            craftActionWithJSON = this.this$0.actionWithJSON;
            craftActionWithJSON.sendBuyVipClick();
            MutableStateFlow<? extends CraftUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                copy = r3.copy((r60 & 1) != 0 ? r3.currentScreen : null, (r60 & 2) != 0 ? r3.craftScreenTypeObject : null, (r60 & 4) != 0 ? r3.craftItemTextBlock : null, (r60 & 8) != 0 ? r3.craftIconAlarmText : null, (r60 & 16) != 0 ? r3.stashIconAlarmText : null, (r60 & 32) != 0 ? r3.progressIconAlarmText : null, (r60 & 64) != 0 ? r3.workbenchLevel : 0, (r60 & 128) != 0 ? r3.levelOfSkill : 0, (r60 & 256) != 0 ? r3.percentOfSkill : 0, (r60 & 512) != 0 ? r3.quantityInQueue : 0, (r60 & 1024) != 0 ? r3.queueMax : 0, (r60 & 2048) != 0 ? r3.quantityInStorage : 0, (r60 & 4096) != 0 ? r3.storageMax : 0, (r60 & 8192) != 0 ? r3.isPlayerHasVip : false, (r60 & 16384) != 0 ? r3.quantityOfNewItemsInStorage : 0, (r60 & 32768) != 0 ? r3.mapOfCraftElements : null, (r60 & 65536) != 0 ? r3.listWithStorageItems : null, (r60 & 131072) != 0 ? r3.listWithProductionItems : null, (r60 & 262144) != 0 ? r3.listOfLevelUpElements : null, (r60 & 524288) != 0 ? r3.backgroundImage : null, (r60 & 1048576) != 0 ? r3.buttonAnimatedAttachment : null, (r60 & 2097152) != 0 ? r3.isNeedToShowFilter : false, (r60 & 4194304) != 0 ? r3.isNeedToShowTutorial : false, (r60 & 8388608) != 0 ? r3.isNeedToShowHints : false, (r60 & 16777216) != 0 ? r3.isNeedToShowLevelUpDialog : false, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r3.isNeedToShowSplit : false, (r60 & 67108864) != 0 ? r3.isNeedClose : true, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.isWithIndicationFilter : false, (r60 & 268435456) != 0 ? r3.selectedElement : null, (r60 & 536870912) != 0 ? r3.allElementsForCraftAfterFilter : null, (r60 & 1073741824) != 0 ? r3.categories : null, (r60 & Integer.MIN_VALUE) != 0 ? r3.selectedCategory : null, (r61 & 1) != 0 ? r3.filterList : null, (r61 & 2) != 0 ? r3.buttonWithLineText : null, (r61 & 4) != 0 ? r3.craftingControlInfo : null, (r61 & 8) != 0 ? r3.valueOfRubles : 0, (r61 & 16) != 0 ? r3.selectedCategoryIndex : 0, (r61 & 32) != 0 ? r3.isNeedToShowDialogConfirmation : false, (r61 & 64) != 0 ? r3.dialogConfirmationAttachment : null, (r61 & 128) != 0 ? r3.isNeedToShowForcedTutorial : false, (r61 & 256) != 0 ? r3.forcedTutorialAttachment : null, (r61 & 512) != 0 ? value.isBlockingLoading : false);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
