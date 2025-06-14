package com.blackhub.bronline.game.gui.craft;

import androidx.media3.common.C;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.gui.craft.model.CraftElement;
import com.blackhub.bronline.game.gui.craft.model.response.CraftCategoryFilter;
import com.blackhub.bronline.game.gui.craft.model.response.CraftItemCategoryFilter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$refreshFilter$1", f = "CraftViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$refreshFilter$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1753:1\n1549#2:1754\n1620#2,2:1755\n1549#2:1757\n1620#2,3:1758\n1622#2:1761\n230#3,5:1762\n*S KotlinDebug\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$refreshFilter$1\n*L\n1131#1:1754\n1131#1:1755,2\n1132#1:1757\n1132#1:1758,3\n1131#1:1761\n1158#1:1762,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CraftViewModel$refreshFilter$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ CraftViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CraftViewModel$refreshFilter$1(CraftViewModel craftViewModel, Continuation<? super CraftViewModel$refreshFilter$1> continuation) {
        super(2, continuation);
        this.this$0 = craftViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CraftViewModel$refreshFilter$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CraftViewModel$refreshFilter$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CraftUiState copy;
        CraftItemCategoryFilter m6887copyT042LqI;
        PreferencesRepository preferencesRepository;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<CraftCategoryFilter> filterList = this.this$0.getUiState().getValue().getFilterList();
        CraftViewModel craftViewModel = this.this$0;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(filterList, 10));
        for (CraftCategoryFilter craftCategoryFilter : filterList) {
            List<CraftItemCategoryFilter> filters = craftCategoryFilter.getFilters();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(filters, 10));
            for (CraftItemCategoryFilter craftItemCategoryFilter : filters) {
                if (craftItemCategoryFilter.getStateOfCheckBox()) {
                    preferencesRepository = craftViewModel.preferencesRepository;
                    preferencesRepository.putInteger(craftItemCategoryFilter.getPreferenceKey(), 0);
                }
                m6887copyT042LqI = craftItemCategoryFilter.m6887copyT042LqI((r20 & 1) != 0 ? craftItemCategoryFilter.filterId : craftItemCategoryFilter.getFilterId(), (r20 & 2) != 0 ? craftItemCategoryFilter.filterName : craftItemCategoryFilter.getFilterName(), (r20 & 4) != 0 ? craftItemCategoryFilter.color : craftItemCategoryFilter.m6888getColor0d7_KjU(), (r20 & 8) != 0 ? craftItemCategoryFilter.categoryId : craftItemCategoryFilter.getCategoryId(), (r20 & 16) != 0 ? craftItemCategoryFilter.preferenceKey : craftItemCategoryFilter.getPreferenceKey(), (r20 & 32) != 0 ? craftItemCategoryFilter.customEndPadding : craftItemCategoryFilter.getCustomEndPadding(), (r20 & 64) != 0 ? craftItemCategoryFilter.stateOfCheckBox : false, (r20 & 128) != 0 ? craftItemCategoryFilter.iconCDNBitmap : null);
                arrayList2.add(m6887copyT042LqI);
            }
            arrayList.add(craftCategoryFilter.copy(craftCategoryFilter.getCategoryFilterId(), craftCategoryFilter.getCategoryFilterName(), arrayList2));
        }
        MutableStateFlow<? extends CraftUiState> mutableStateFlow = this.this$0.get_uiState();
        CraftViewModel craftViewModel2 = this.this$0;
        while (true) {
            CraftUiState value = mutableStateFlow.getValue();
            CraftUiState craftUiState = value;
            List<CraftElement> list = craftViewModel2.getUiState().getValue().getMapOfCraftElements().get(Boxing.boxInt(craftViewModel2.getUiState().getValue().getSelectedCategory().getCategoryId()));
            if (list == null) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            ArrayList arrayList3 = arrayList;
            copy = craftUiState.copy((r60 & 1) != 0 ? craftUiState.currentScreen : null, (r60 & 2) != 0 ? craftUiState.craftScreenTypeObject : null, (r60 & 4) != 0 ? craftUiState.craftItemTextBlock : null, (r60 & 8) != 0 ? craftUiState.craftIconAlarmText : null, (r60 & 16) != 0 ? craftUiState.stashIconAlarmText : null, (r60 & 32) != 0 ? craftUiState.progressIconAlarmText : null, (r60 & 64) != 0 ? craftUiState.workbenchLevel : 0, (r60 & 128) != 0 ? craftUiState.levelOfSkill : 0, (r60 & 256) != 0 ? craftUiState.percentOfSkill : 0, (r60 & 512) != 0 ? craftUiState.quantityInQueue : 0, (r60 & 1024) != 0 ? craftUiState.queueMax : 0, (r60 & 2048) != 0 ? craftUiState.quantityInStorage : 0, (r60 & 4096) != 0 ? craftUiState.storageMax : 0, (r60 & 8192) != 0 ? craftUiState.isPlayerHasVip : false, (r60 & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : 0, (r60 & 32768) != 0 ? craftUiState.mapOfCraftElements : null, (r60 & 65536) != 0 ? craftUiState.listWithStorageItems : null, (r60 & 131072) != 0 ? craftUiState.listWithProductionItems : null, (r60 & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, (r60 & 524288) != 0 ? craftUiState.backgroundImage : null, (r60 & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : null, (r60 & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, (r60 & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, (r60 & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, (r60 & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, (r60 & 67108864) != 0 ? craftUiState.isNeedClose : false, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : false, (r60 & 268435456) != 0 ? craftUiState.selectedElement : null, (r60 & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : list, (r60 & 1073741824) != 0 ? craftUiState.categories : null, (r60 & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : null, (r61 & 1) != 0 ? craftUiState.filterList : arrayList3, (r61 & 2) != 0 ? craftUiState.buttonWithLineText : null, (r61 & 4) != 0 ? craftUiState.craftingControlInfo : null, (r61 & 8) != 0 ? craftUiState.valueOfRubles : 0, (r61 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (r61 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (r61 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (r61 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : false, (r61 & 256) != 0 ? craftUiState.forcedTutorialAttachment : null, (r61 & 512) != 0 ? craftUiState.isBlockingLoading : false);
            if (mutableStateFlow.compareAndSet(value, copy)) {
                return Unit.INSTANCE;
            }
            arrayList = arrayList3;
        }
    }
}
