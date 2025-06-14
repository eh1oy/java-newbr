package com.blackhub.bronline.game.gui.craft;

import androidx.media3.common.C;
import com.blackhub.bronline.game.gui.craft.enums.CraftScreenTypeEnum;
import com.blackhub.bronline.game.gui.craft.model.ButtonAnimatedAttachment;
import com.blackhub.bronline.game.gui.craft.model.CraftScreenTypeObject;
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
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CraftViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$onButtonCraftClick$1", f = "CraftViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$onButtonCraftClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1753:1\n230#2,5:1754\n*S KotlinDebug\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$onButtonCraftClick$1\n*L\n749#1:1754,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CraftViewModel$onButtonCraftClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ButtonAnimatedAttachment $buttonAnimatedAttachment;
    public int label;
    public final /* synthetic */ CraftViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CraftViewModel$onButtonCraftClick$1(CraftViewModel craftViewModel, ButtonAnimatedAttachment buttonAnimatedAttachment, Continuation<? super CraftViewModel$onButtonCraftClick$1> continuation) {
        super(2, continuation);
        this.this$0 = craftViewModel;
        this.$buttonAnimatedAttachment = buttonAnimatedAttachment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CraftViewModel$onButtonCraftClick$1(this.this$0, this.$buttonAnimatedAttachment, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CraftViewModel$onButtonCraftClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CraftUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List sortingList$default = CraftViewModel.sortingList$default(this.this$0, null, null, 3, null);
        MutableStateFlow<? extends CraftUiState> mutableStateFlow = this.this$0.get_uiState();
        CraftViewModel craftViewModel = this.this$0;
        ButtonAnimatedAttachment buttonAnimatedAttachment = this.$buttonAnimatedAttachment;
        while (true) {
            CraftUiState value = mutableStateFlow.getValue();
            ButtonAnimatedAttachment buttonAnimatedAttachment2 = buttonAnimatedAttachment;
            copy = r4.copy((r60 & 1) != 0 ? r4.currentScreen : CraftScreenTypeEnum.CRAFT, (r60 & 2) != 0 ? r4.craftScreenTypeObject : new CraftScreenTypeObject(craftViewModel.get_uiState().getValue().getSelectedCategory().getIconCDN(), craftViewModel.get_uiState().getValue().getSelectedCategory().getCategoryName()), (r60 & 4) != 0 ? r4.craftItemTextBlock : null, (r60 & 8) != 0 ? r4.craftIconAlarmText : null, (r60 & 16) != 0 ? r4.stashIconAlarmText : null, (r60 & 32) != 0 ? r4.progressIconAlarmText : null, (r60 & 64) != 0 ? r4.workbenchLevel : 0, (r60 & 128) != 0 ? r4.levelOfSkill : 0, (r60 & 256) != 0 ? r4.percentOfSkill : 0, (r60 & 512) != 0 ? r4.quantityInQueue : 0, (r60 & 1024) != 0 ? r4.queueMax : 0, (r60 & 2048) != 0 ? r4.quantityInStorage : 0, (r60 & 4096) != 0 ? r4.storageMax : 0, (r60 & 8192) != 0 ? r4.isPlayerHasVip : false, (r60 & 16384) != 0 ? r4.quantityOfNewItemsInStorage : 0, (r60 & 32768) != 0 ? r4.mapOfCraftElements : null, (r60 & 65536) != 0 ? r4.listWithStorageItems : null, (r60 & 131072) != 0 ? r4.listWithProductionItems : null, (r60 & 262144) != 0 ? r4.listOfLevelUpElements : null, (r60 & 524288) != 0 ? r4.backgroundImage : null, (r60 & 1048576) != 0 ? r4.buttonAnimatedAttachment : buttonAnimatedAttachment2, (r60 & 2097152) != 0 ? r4.isNeedToShowFilter : false, (r60 & 4194304) != 0 ? r4.isNeedToShowTutorial : false, (r60 & 8388608) != 0 ? r4.isNeedToShowHints : false, (r60 & 16777216) != 0 ? r4.isNeedToShowLevelUpDialog : false, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r4.isNeedToShowSplit : false, (r60 & 67108864) != 0 ? r4.isNeedClose : false, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r4.isWithIndicationFilter : false, (r60 & 268435456) != 0 ? r4.selectedElement : null, (r60 & 536870912) != 0 ? r4.allElementsForCraftAfterFilter : sortingList$default, (r60 & 1073741824) != 0 ? r4.categories : null, (r60 & Integer.MIN_VALUE) != 0 ? r4.selectedCategory : null, (r61 & 1) != 0 ? r4.filterList : null, (r61 & 2) != 0 ? r4.buttonWithLineText : null, (r61 & 4) != 0 ? r4.craftingControlInfo : null, (r61 & 8) != 0 ? r4.valueOfRubles : 0, (r61 & 16) != 0 ? r4.selectedCategoryIndex : 0, (r61 & 32) != 0 ? r4.isNeedToShowDialogConfirmation : false, (r61 & 64) != 0 ? r4.dialogConfirmationAttachment : null, (r61 & 128) != 0 ? r4.isNeedToShowForcedTutorial : false, (r61 & 256) != 0 ? r4.forcedTutorialAttachment : null, (r61 & 512) != 0 ? value.isBlockingLoading : false);
            if (mutableStateFlow.compareAndSet(value, copy)) {
                return Unit.INSTANCE;
            }
            buttonAnimatedAttachment = buttonAnimatedAttachment2;
        }
    }
}
