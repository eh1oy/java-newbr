package com.blackhub.bronline.game.gui.craft;

import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.craft.model.CraftCraftingControl;
import com.blackhub.bronline.game.gui.craft.model.CraftElement;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CraftViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$onActionCraftingClick$1", f = "CraftViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class CraftViewModel$onActionCraftingClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ CraftViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CraftViewModel$onActionCraftingClick$1(CraftViewModel craftViewModel, Continuation<? super CraftViewModel$onActionCraftingClick$1> continuation) {
        super(2, continuation);
        this.this$0 = craftViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CraftViewModel$onActionCraftingClick$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CraftViewModel$onActionCraftingClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        StringResource stringResource;
        StringResource stringResource2;
        StringResource stringResource3;
        StringResource stringResource4;
        StringResource stringResource5;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CraftCraftingControl craftingControlInfo = this.this$0.get_uiState().getValue().getCraftingControlInfo();
        CraftElement selectedElement = this.this$0.get_uiState().getValue().getSelectedElement();
        boolean isQueueFilled = this.this$0.getUiState().getValue().isQueueFilled();
        int workbenchLevel = this.this$0.get_uiState().getValue().getWorkbenchLevel();
        int typeOfBlock = craftingControlInfo.getTypeOfBlock();
        if (typeOfBlock != 1) {
            if (typeOfBlock == 2) {
                int serverId = selectedElement.getServerId();
                CraftViewModel.showDialogConfirmation$default(this.this$0, 3, selectedElement.getTextBlock().getName(), serverId, 0, 8, null);
            } else if (typeOfBlock == 4) {
                int serverId2 = selectedElement.getServerId();
                CraftViewModel.showDialogConfirmation$default(this.this$0, 1, selectedElement.getTextBlock().getName(), serverId2, 0, 8, null);
            }
        } else if (craftingControlInfo.isLowLevel()) {
            LocalNotification localNotification = this.this$0.getLocalNotification();
            stringResource5 = this.this$0.stringResources;
            localNotification.showErrorNotification(stringResource5.getString(R.string.craft_crafting_error_low_level, Boxing.boxInt(selectedElement.getElementRarity().getValue())));
        } else if (craftingControlInfo.isWorkbenchLevelInsufficient()) {
            LocalNotification localNotification2 = this.this$0.getLocalNotification();
            stringResource4 = this.this$0.stringResources;
            localNotification2.showErrorNotification(stringResource4.getString(R.string.craft_crafting_error_insufficient_workbench_level, Boxing.boxInt(workbenchLevel + 1)));
        } else if (!craftingControlInfo.isEnoughResources()) {
            LocalNotification localNotification3 = this.this$0.getLocalNotification();
            stringResource3 = this.this$0.stringResources;
            localNotification3.showErrorNotification(stringResource3.getString(R.string.craft_crafting_error_with_resources));
        } else if (isQueueFilled) {
            LocalNotification localNotification4 = this.this$0.getLocalNotification();
            stringResource2 = this.this$0.stringResources;
            localNotification4.showErrorNotification(stringResource2.getString(R.string.craft_crafting_error_queue));
        } else if (!craftingControlInfo.isEnoughMoney()) {
            LocalNotification localNotification5 = this.this$0.getLocalNotification();
            stringResource = this.this$0.stringResources;
            localNotification5.showErrorNotification(stringResource.getString(R.string.craft_crafting_error_not_enough_money));
        } else {
            int elementId = selectedElement.getElementId();
            this.this$0.showDialogConfirmation(2, selectedElement.getTextBlock().getName(), elementId, craftingControlInfo.getSelectedValueOfItem());
        }
        return Unit.INSTANCE;
    }
}
