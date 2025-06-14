package com.blackhub.bronline.game.gui.craft;

import android.app.Application;
import android.content.res.Resources;
import android.graphics.Bitmap;
import androidx.media3.common.C;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.gui.craft.enums.CraftScreenTypeEnum;
import com.blackhub.bronline.game.gui.craft.model.ButtonAnimatedAttachment;
import com.blackhub.bronline.game.gui.craft.model.CraftElement;
import com.blackhub.bronline.game.gui.craft.model.CraftScreenTypeObject;
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
import kotlin.jvm.internal.Intrinsics;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$onButtonStashClick$1", f = "CraftViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$onButtonStashClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1753:1\n230#2,5:1754\n*S KotlinDebug\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$onButtonStashClick$1\n*L\n782#1:1754,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CraftViewModel$onButtonStashClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ButtonAnimatedAttachment $buttonAnimatedAttachment;
    public int label;
    public final /* synthetic */ CraftViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CraftViewModel$onButtonStashClick$1(CraftViewModel craftViewModel, ButtonAnimatedAttachment buttonAnimatedAttachment, Continuation<? super CraftViewModel$onButtonStashClick$1> continuation) {
        super(2, continuation);
        this.this$0 = craftViewModel;
        this.$buttonAnimatedAttachment = buttonAnimatedAttachment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CraftViewModel$onButtonStashClick$1(this.this$0, this.$buttonAnimatedAttachment, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CraftViewModel$onButtonStashClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Application application;
        StringResource stringResource;
        StringResource stringResource2;
        CraftUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            application = this.this$0.application;
            Resources resources = application.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            Bitmap bitmap = BitmapUtilsKt.getBitmap(resources, R.drawable.ic_stash);
            stringResource = this.this$0.stringResources;
            String string = stringResource.getString(R.string.craft_get_all_craft);
            MutableStateFlow<? extends CraftUiState> mutableStateFlow = this.this$0.get_uiState();
            CraftViewModel craftViewModel = this.this$0;
            ButtonAnimatedAttachment buttonAnimatedAttachment = this.$buttonAnimatedAttachment;
            while (true) {
                CraftUiState value = mutableStateFlow.getValue();
                CraftUiState craftUiState = value;
                CraftScreenTypeEnum craftScreenTypeEnum = CraftScreenTypeEnum.STASH;
                stringResource2 = craftViewModel.stringResources;
                CraftScreenTypeObject craftScreenTypeObject = new CraftScreenTypeObject(bitmap, stringResource2.getString(R.string.craft_storage));
                List<CraftElement> listWithStorageItems = craftViewModel.getUiState().getValue().getListWithStorageItems();
                CraftElement craftElement = (CraftElement) CollectionsKt___CollectionsKt.firstOrNull((List) craftViewModel.getUiState().getValue().getListWithStorageItems());
                if (craftElement == null) {
                    craftElement = new CraftElement(0, 0, null, 0, 0, 0, null, null, null, 0, null, null, 0, null, 0, 0, 65535, null);
                }
                ButtonAnimatedAttachment buttonAnimatedAttachment2 = buttonAnimatedAttachment;
                CraftViewModel craftViewModel2 = craftViewModel;
                copy = craftUiState.copy((r60 & 1) != 0 ? craftUiState.currentScreen : craftScreenTypeEnum, (r60 & 2) != 0 ? craftUiState.craftScreenTypeObject : craftScreenTypeObject, (r60 & 4) != 0 ? craftUiState.craftItemTextBlock : null, (r60 & 8) != 0 ? craftUiState.craftIconAlarmText : null, (r60 & 16) != 0 ? craftUiState.stashIconAlarmText : null, (r60 & 32) != 0 ? craftUiState.progressIconAlarmText : null, (r60 & 64) != 0 ? craftUiState.workbenchLevel : 0, (r60 & 128) != 0 ? craftUiState.levelOfSkill : 0, (r60 & 256) != 0 ? craftUiState.percentOfSkill : 0, (r60 & 512) != 0 ? craftUiState.quantityInQueue : 0, (r60 & 1024) != 0 ? craftUiState.queueMax : 0, (r60 & 2048) != 0 ? craftUiState.quantityInStorage : 0, (r60 & 4096) != 0 ? craftUiState.storageMax : 0, (r60 & 8192) != 0 ? craftUiState.isPlayerHasVip : false, (r60 & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : 0, (r60 & 32768) != 0 ? craftUiState.mapOfCraftElements : null, (r60 & 65536) != 0 ? craftUiState.listWithStorageItems : null, (r60 & 131072) != 0 ? craftUiState.listWithProductionItems : null, (r60 & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, (r60 & 524288) != 0 ? craftUiState.backgroundImage : null, (r60 & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : buttonAnimatedAttachment2, (r60 & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, (r60 & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, (r60 & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, (r60 & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, (r60 & 67108864) != 0 ? craftUiState.isNeedClose : false, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : false, (r60 & 268435456) != 0 ? craftUiState.selectedElement : craftElement, (r60 & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : listWithStorageItems, (r60 & 1073741824) != 0 ? craftUiState.categories : null, (r60 & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : null, (r61 & 1) != 0 ? craftUiState.filterList : null, (r61 & 2) != 0 ? craftUiState.buttonWithLineText : string, (r61 & 4) != 0 ? craftUiState.craftingControlInfo : null, (r61 & 8) != 0 ? craftUiState.valueOfRubles : 0, (r61 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (r61 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (r61 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (r61 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : false, (r61 & 256) != 0 ? craftUiState.forcedTutorialAttachment : null, (r61 & 512) != 0 ? craftUiState.isBlockingLoading : false);
                if (mutableStateFlow.compareAndSet(value, copy)) {
                    return Unit.INSTANCE;
                }
                buttonAnimatedAttachment = buttonAnimatedAttachment2;
                craftViewModel = craftViewModel2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
