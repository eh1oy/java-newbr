package com.blackhub.bronline.game.gui.donate.viewmodel;

import com.blackhub.bronline.game.gui.donate.data.ItemForDialogConfirmation;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel$showDialogConfirmation$1", f = "DonateMainViewModel.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class DonateMainViewModel$showDialogConfirmation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $bodyMessage;
    public final /* synthetic */ String $butNO;
    public final /* synthetic */ String $butOK;
    public final /* synthetic */ String $caption;
    public final /* synthetic */ Integer $carColor;
    public final /* synthetic */ int $price;
    public final /* synthetic */ String $priceText;
    public int label;
    public final /* synthetic */ DonateMainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DonateMainViewModel$showDialogConfirmation$1(DonateMainViewModel donateMainViewModel, String str, int i, String str2, String str3, String str4, String str5, Integer num, Continuation<? super DonateMainViewModel$showDialogConfirmation$1> continuation) {
        super(2, continuation);
        this.this$0 = donateMainViewModel;
        this.$bodyMessage = str;
        this.$price = i;
        this.$priceText = str2;
        this.$caption = str3;
        this.$butOK = str4;
        this.$butNO = str5;
        this.$carColor = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DonateMainViewModel$showDialogConfirmation$1(this.this$0, this.$bodyMessage, this.$price, this.$priceText, this.$caption, this.$butOK, this.$butNO, this.$carColor, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DonateMainViewModel$showDialogConfirmation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableSharedFlow mutableSharedFlow;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableSharedFlow = this.this$0.mutableItemForDialogConfirmation;
            ItemForDialogConfirmation itemForDialogConfirmation = new ItemForDialogConfirmation(null, this.$bodyMessage, this.$price, null, this.$priceText, this.$caption, this.$butOK, this.$butNO, this.$carColor, null, 521, null);
            this.label = 1;
            if (mutableSharedFlow.emit(itemForDialogConfirmation, this) == coroutine_suspended) {
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
