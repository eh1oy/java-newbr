package com.blackhub.bronline.game.gui.craft;

import androidx.media3.common.C;
import com.blackhub.bronline.game.gui.craft.model.CraftCraftingControl;
import com.blackhub.bronline.game.gui.craft.model.CraftElement;
import com.blackhub.bronline.game.gui.craft.model.CraftIngredient;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$addItemForCrafting$1", f = "CraftViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$addItemForCrafting$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1753:1\n1549#2:1754\n1620#2,3:1755\n230#3,5:1758\n*S KotlinDebug\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$addItemForCrafting$1\n*L\n1197#1:1754\n1197#1:1755,3\n1208#1:1758,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CraftViewModel$addItemForCrafting$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ CraftViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CraftViewModel$addItemForCrafting$1(CraftViewModel craftViewModel, Continuation<? super CraftViewModel$addItemForCrafting$1> continuation) {
        super(2, continuation);
        this.this$0 = craftViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CraftViewModel$addItemForCrafting$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CraftViewModel$addItemForCrafting$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CraftElement copy;
        CraftCraftingControl updateCraftCraftingControl;
        CraftUiState value;
        CraftUiState copy2;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<CraftIngredient> componentsList = this.this$0.get_uiState().getValue().getSelectedElement().getComponentsList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(componentsList, 10));
        for (CraftIngredient craftIngredient : componentsList) {
            craftIngredient.setCount(craftIngredient.getCount() + 1);
            arrayList.add(craftIngredient);
        }
        copy = r2.copy((r34 & 1) != 0 ? r2.elementId : 0, (r34 & 2) != 0 ? r2.serverId : 0, (r34 & 4) != 0 ? r2.imageName : null, (r34 & 8) != 0 ? r2.imageType : 0, (r34 & 16) != 0 ? r2.timeUntilItemPreparation : 0, (r34 & 32) != 0 ? r2.preparationTime : 0, (r34 & 64) != 0 ? r2.timeWhenElementCreated : null, (r34 & 128) != 0 ? r2.elementRarity : null, (r34 & 256) != 0 ? r2.elementState : null, (r34 & 512) != 0 ? r2.valueOfPipeline : 0, (r34 & 1024) != 0 ? r2.textBlock : null, (r34 & 2048) != 0 ? r2.componentsList : arrayList, (r34 & 4096) != 0 ? r2.valueOfPercent : 0, (r34 & 8192) != 0 ? r2.valueOfTimer : null, (r34 & 16384) != 0 ? r2.craftingCost : 0, (r34 & 32768) != 0 ? this.this$0.get_uiState().getValue().getSelectedElement().itemCategory : 0);
        updateCraftCraftingControl = this.this$0.updateCraftCraftingControl(true, copy);
        MutableStateFlow<? extends CraftUiState> mutableStateFlow = this.this$0.get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy2 = r21.copy((r60 & 1) != 0 ? r21.currentScreen : null, (r60 & 2) != 0 ? r21.craftScreenTypeObject : null, (r60 & 4) != 0 ? r21.craftItemTextBlock : null, (r60 & 8) != 0 ? r21.craftIconAlarmText : null, (r60 & 16) != 0 ? r21.stashIconAlarmText : null, (r60 & 32) != 0 ? r21.progressIconAlarmText : null, (r60 & 64) != 0 ? r21.workbenchLevel : 0, (r60 & 128) != 0 ? r21.levelOfSkill : 0, (r60 & 256) != 0 ? r21.percentOfSkill : 0, (r60 & 512) != 0 ? r21.quantityInQueue : 0, (r60 & 1024) != 0 ? r21.queueMax : 0, (r60 & 2048) != 0 ? r21.quantityInStorage : 0, (r60 & 4096) != 0 ? r21.storageMax : 0, (r60 & 8192) != 0 ? r21.isPlayerHasVip : false, (r60 & 16384) != 0 ? r21.quantityOfNewItemsInStorage : 0, (r60 & 32768) != 0 ? r21.mapOfCraftElements : null, (r60 & 65536) != 0 ? r21.listWithStorageItems : null, (r60 & 131072) != 0 ? r21.listWithProductionItems : null, (r60 & 262144) != 0 ? r21.listOfLevelUpElements : null, (r60 & 524288) != 0 ? r21.backgroundImage : null, (r60 & 1048576) != 0 ? r21.buttonAnimatedAttachment : null, (r60 & 2097152) != 0 ? r21.isNeedToShowFilter : false, (r60 & 4194304) != 0 ? r21.isNeedToShowTutorial : false, (r60 & 8388608) != 0 ? r21.isNeedToShowHints : false, (r60 & 16777216) != 0 ? r21.isNeedToShowLevelUpDialog : false, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r21.isNeedToShowSplit : false, (r60 & 67108864) != 0 ? r21.isNeedClose : false, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r21.isWithIndicationFilter : false, (r60 & 268435456) != 0 ? r21.selectedElement : copy, (r60 & 536870912) != 0 ? r21.allElementsForCraftAfterFilter : null, (r60 & 1073741824) != 0 ? r21.categories : null, (r60 & Integer.MIN_VALUE) != 0 ? r21.selectedCategory : null, (r61 & 1) != 0 ? r21.filterList : null, (r61 & 2) != 0 ? r21.buttonWithLineText : null, (r61 & 4) != 0 ? r21.craftingControlInfo : updateCraftCraftingControl, (r61 & 8) != 0 ? r21.valueOfRubles : 0, (r61 & 16) != 0 ? r21.selectedCategoryIndex : 0, (r61 & 32) != 0 ? r21.isNeedToShowDialogConfirmation : false, (r61 & 64) != 0 ? r21.dialogConfirmationAttachment : null, (r61 & 128) != 0 ? r21.isNeedToShowForcedTutorial : false, (r61 & 256) != 0 ? r21.forcedTutorialAttachment : null, (r61 & 512) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy2));
        return Unit.INSTANCE;
    }
}
