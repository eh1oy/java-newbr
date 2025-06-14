package com.blackhub.bronline.game.gui.blackpass.viewmodel;

import com.blackhub.bronline.game.gui.donate.data.ItemForDialogConfirmation;
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
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: BlackPassMainViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$showDialogConfirmation$1", f = "BlackPassMainViewModel.kt", i = {}, l = {340, 354}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class BlackPassMainViewModel$showDialogConfirmation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $action;
    public final /* synthetic */ String $bodyMessage;
    public final /* synthetic */ String $caption;
    public final /* synthetic */ Integer $levels;
    public final /* synthetic */ int $price;
    public final /* synthetic */ String $priceText;
    public final /* synthetic */ Integer $taskId;
    public final /* synthetic */ String $textForButtonCancel;
    public final /* synthetic */ String $textForButtonOK;
    public int label;
    public final /* synthetic */ BlackPassMainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackPassMainViewModel$showDialogConfirmation$1(int i, Integer num, BlackPassMainViewModel blackPassMainViewModel, int i2, String str, String str2, String str3, String str4, Integer num2, String str5, Continuation<? super BlackPassMainViewModel$showDialogConfirmation$1> continuation) {
        super(2, continuation);
        this.$action = i;
        this.$levels = num;
        this.this$0 = blackPassMainViewModel;
        this.$price = i2;
        this.$priceText = str;
        this.$caption = str2;
        this.$textForButtonOK = str3;
        this.$textForButtonCancel = str4;
        this.$taskId = num2;
        this.$bodyMessage = str5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BlackPassMainViewModel$showDialogConfirmation$1(this.$action, this.$levels, this.this$0, this.$price, this.$priceText, this.$caption, this.$textForButtonOK, this.$textForButtonCancel, this.$taskId, this.$bodyMessage, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BlackPassMainViewModel$showDialogConfirmation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableSharedFlow mutableSharedFlow;
        String str;
        MutableSharedFlow mutableSharedFlow2;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$action != 0) {
                mutableSharedFlow = this.this$0.mutableObjForDialogConfirmation;
                ItemForDialogConfirmation itemForDialogConfirmation = new ItemForDialogConfirmation(this.$taskId, this.$bodyMessage, this.$price, this.$levels, this.$priceText, this.$caption, this.$textForButtonOK, this.$textForButtonCancel, null, Boxing.boxInt(this.$action));
                this.label = 2;
                if (mutableSharedFlow.emit(itemForDialogConfirmation, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                Integer num = this.$levels;
                if (num != null) {
                    BlackPassMainViewModel blackPassMainViewModel = this.this$0;
                    str = blackPassMainViewModel.getStringResource().bpDialogConfirmationLastChanceBodyMessage(num.intValue());
                } else {
                    str = null;
                }
                mutableSharedFlow2 = this.this$0.mutableObjForDialogConfirmation;
                if (str == null) {
                    str = "";
                }
                ItemForDialogConfirmation itemForDialogConfirmation2 = new ItemForDialogConfirmation(null, str, this.$price, this.$levels, this.$priceText, this.$caption, this.$textForButtonOK, this.$textForButtonCancel, null, Boxing.boxInt(this.$action), 1, null);
                this.label = 1;
                if (mutableSharedFlow2.emit(itemForDialogConfirmation2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
