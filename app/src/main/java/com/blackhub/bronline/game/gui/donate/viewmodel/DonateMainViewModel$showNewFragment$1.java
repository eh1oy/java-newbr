package com.blackhub.bronline.game.gui.donate.viewmodel;

import androidx.core.location.GpsStatusWrapper;
import com.blackhub.bronline.game.gui.donate.data.FragmentIDWithStatusOfReplay;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel$showNewFragment$1", f = "DonateMainViewModel.kt", i = {}, l = {GpsStatusWrapper.QZSS_SVID_MIN}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class DonateMainViewModel$showNewFragment$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $fragmentID;
    public final /* synthetic */ boolean $ifReplace;
    public final /* synthetic */ boolean $isOnlyLocalChange;
    public int label;
    public final /* synthetic */ DonateMainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DonateMainViewModel$showNewFragment$1(DonateMainViewModel donateMainViewModel, int i, boolean z, boolean z2, Continuation<? super DonateMainViewModel$showNewFragment$1> continuation) {
        super(2, continuation);
        this.this$0 = donateMainViewModel;
        this.$fragmentID = i;
        this.$ifReplace = z;
        this.$isOnlyLocalChange = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DonateMainViewModel$showNewFragment$1(this.this$0, this.$fragmentID, this.$ifReplace, this.$isOnlyLocalChange, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DonateMainViewModel$showNewFragment$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableSharedFlow mutableSharedFlow;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableSharedFlow = this.this$0.mutableFragmentID;
            FragmentIDWithStatusOfReplay fragmentIDWithStatusOfReplay = new FragmentIDWithStatusOfReplay(this.$fragmentID, this.$ifReplace, this.$isOnlyLocalChange);
            this.label = 1;
            if (mutableSharedFlow.emit(fragmentIDWithStatusOfReplay, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
