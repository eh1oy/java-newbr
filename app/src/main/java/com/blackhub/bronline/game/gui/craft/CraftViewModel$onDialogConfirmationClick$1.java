package com.blackhub.bronline.game.gui.craft;

import com.blackhub.bronline.game.gui.craft.model.CraftDialogConfirmationAttachment;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$onDialogConfirmationClick$1", f = "CraftViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class CraftViewModel$onDialogConfirmationClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ CraftViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CraftViewModel$onDialogConfirmationClick$1(CraftViewModel craftViewModel, Continuation<? super CraftViewModel$onDialogConfirmationClick$1> continuation) {
        super(2, continuation);
        this.this$0 = craftViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CraftViewModel$onDialogConfirmationClick$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CraftViewModel$onDialogConfirmationClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CraftActionWithJSON craftActionWithJSON;
        CraftActionWithJSON craftActionWithJSON2;
        CraftActionWithJSON craftActionWithJSON3;
        CraftActionWithJSON craftActionWithJSON4;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CraftDialogConfirmationAttachment dialogConfirmationAttachment = this.this$0.getUiState().getValue().getDialogConfirmationAttachment();
        int typeOfDialog = dialogConfirmationAttachment.getTypeOfDialog();
        if (typeOfDialog == 1) {
            craftActionWithJSON = this.this$0.actionWithJSON;
            craftActionWithJSON.sendCancelCreation(dialogConfirmationAttachment.getIdSelectedElement());
        } else if (typeOfDialog == 2) {
            craftActionWithJSON2 = this.this$0.actionWithJSON;
            craftActionWithJSON2.sendStartCreation(dialogConfirmationAttachment.getIdSelectedElement(), dialogConfirmationAttachment.getValueOfElements());
        } else if (typeOfDialog == 3) {
            craftActionWithJSON3 = this.this$0.actionWithJSON;
            craftActionWithJSON3.receivingElement(Boxing.boxInt(dialogConfirmationAttachment.getIdSelectedElement()));
        } else if (typeOfDialog == 4) {
            craftActionWithJSON4 = this.this$0.actionWithJSON;
            CraftActionWithJSON.receivingElement$default(craftActionWithJSON4, null, 1, null);
        }
        this.this$0.closeDialogConfirmation();
        return Unit.INSTANCE;
    }
}
