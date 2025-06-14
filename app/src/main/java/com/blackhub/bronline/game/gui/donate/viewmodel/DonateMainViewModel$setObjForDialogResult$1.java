package com.blackhub.bronline.game.gui.donate.viewmodel;

import com.blackhub.bronline.game.gui.donate.data.ObjForResultDialog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: DonateMainViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel$setObjForDialogResult$1", f = "DonateMainViewModel.kt", i = {}, l = {213}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class DonateMainViewModel$setObjForDialogResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ObjForResultDialog $objForResultDialog;
    public int label;
    public final /* synthetic */ DonateMainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DonateMainViewModel$setObjForDialogResult$1(DonateMainViewModel donateMainViewModel, ObjForResultDialog objForResultDialog, Continuation<? super DonateMainViewModel$setObjForDialogResult$1> continuation) {
        super(2, continuation);
        this.this$0 = donateMainViewModel;
        this.$objForResultDialog = objForResultDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DonateMainViewModel$setObjForDialogResult$1(this.this$0, this.$objForResultDialog, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DonateMainViewModel$setObjForDialogResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableSharedFlow mutableSharedFlow;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableSharedFlow = this.this$0.mutableItemForDialogResult;
            ObjForResultDialog objForResultDialog = new ObjForResultDialog(this.$objForResultDialog.getMessage(), this.$objForResultDialog.getSuccess(), this.$objForResultDialog.getBoldMessage(), this.$objForResultDialog.getCaption(), this.$objForResultDialog.getButtonOK(), this.$objForResultDialog.getCurrentAction());
            this.label = 1;
            if (mutableSharedFlow.emit(objForResultDialog, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.showingDialogConfirmation(true);
        return Unit.INSTANCE;
    }
}
