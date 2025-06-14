package com.blackhub.bronline.game.gui.craft;

import androidx.media3.common.C;
import com.blackhub.bronline.game.gui.craft.model.CraftElement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
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

/* compiled from: CraftViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$deleteElementFromStash$1", f = "CraftViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$deleteElementFromStash$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1753:1\n766#2:1754\n857#2,2:1755\n230#3,5:1757\n*S KotlinDebug\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$deleteElementFromStash$1\n*L\n1487#1:1754\n1487#1:1755,2\n1491#1:1757,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CraftViewModel$deleteElementFromStash$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ CraftElement $element;
    public int label;
    public final /* synthetic */ CraftViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CraftViewModel$deleteElementFromStash$1(CraftViewModel craftViewModel, CraftElement craftElement, Continuation<? super CraftViewModel$deleteElementFromStash$1> continuation) {
        super(2, continuation);
        this.this$0 = craftViewModel;
        this.$element = craftElement;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CraftViewModel$deleteElementFromStash$1(this.this$0, this.$element, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CraftViewModel$deleteElementFromStash$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CraftUiState value;
        CraftUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<CraftElement> listWithStorageItems = this.this$0.getUiState().getValue().getListWithStorageItems();
        CraftElement craftElement = this.$element;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listWithStorageItems) {
            if (((CraftElement) obj2).getServerId() != craftElement.getServerId()) {
                arrayList.add(obj2);
            }
        }
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        int size = mutableList.size();
        MutableStateFlow<? extends CraftUiState> mutableStateFlow = this.this$0.get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r7.copy((r60 & 1) != 0 ? r7.currentScreen : null, (r60 & 2) != 0 ? r7.craftScreenTypeObject : null, (r60 & 4) != 0 ? r7.craftItemTextBlock : null, (r60 & 8) != 0 ? r7.craftIconAlarmText : null, (r60 & 16) != 0 ? r7.stashIconAlarmText : null, (r60 & 32) != 0 ? r7.progressIconAlarmText : null, (r60 & 64) != 0 ? r7.workbenchLevel : 0, (r60 & 128) != 0 ? r7.levelOfSkill : 0, (r60 & 256) != 0 ? r7.percentOfSkill : 0, (r60 & 512) != 0 ? r7.quantityInQueue : 0, (r60 & 1024) != 0 ? r7.queueMax : 0, (r60 & 2048) != 0 ? r7.quantityInStorage : size, (r60 & 4096) != 0 ? r7.storageMax : 0, (r60 & 8192) != 0 ? r7.isPlayerHasVip : false, (r60 & 16384) != 0 ? r7.quantityOfNewItemsInStorage : 0, (r60 & 32768) != 0 ? r7.mapOfCraftElements : null, (r60 & 65536) != 0 ? r7.listWithStorageItems : mutableList, (r60 & 131072) != 0 ? r7.listWithProductionItems : null, (r60 & 262144) != 0 ? r7.listOfLevelUpElements : null, (r60 & 524288) != 0 ? r7.backgroundImage : null, (r60 & 1048576) != 0 ? r7.buttonAnimatedAttachment : null, (r60 & 2097152) != 0 ? r7.isNeedToShowFilter : false, (r60 & 4194304) != 0 ? r7.isNeedToShowTutorial : false, (r60 & 8388608) != 0 ? r7.isNeedToShowHints : false, (r60 & 16777216) != 0 ? r7.isNeedToShowLevelUpDialog : false, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r7.isNeedToShowSplit : false, (r60 & 67108864) != 0 ? r7.isNeedClose : false, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r7.isWithIndicationFilter : false, (r60 & 268435456) != 0 ? r7.selectedElement : null, (r60 & 536870912) != 0 ? r7.allElementsForCraftAfterFilter : null, (r60 & 1073741824) != 0 ? r7.categories : null, (r60 & Integer.MIN_VALUE) != 0 ? r7.selectedCategory : null, (r61 & 1) != 0 ? r7.filterList : null, (r61 & 2) != 0 ? r7.buttonWithLineText : null, (r61 & 4) != 0 ? r7.craftingControlInfo : null, (r61 & 8) != 0 ? r7.valueOfRubles : 0, (r61 & 16) != 0 ? r7.selectedCategoryIndex : 0, (r61 & 32) != 0 ? r7.isNeedToShowDialogConfirmation : false, (r61 & 64) != 0 ? r7.dialogConfirmationAttachment : null, (r61 & 128) != 0 ? r7.isNeedToShowForcedTutorial : false, (r61 & 256) != 0 ? r7.forcedTutorialAttachment : null, (r61 & 512) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        return Unit.INSTANCE;
    }
}
