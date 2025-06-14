package com.blackhub.bronline.game.gui.tuning.viewmodel;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.apache.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TuningDetailsListViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$resetVinyl$1", f = "TuningDetailsListViewModel.kt", i = {1}, l = {HttpStatus.SC_TOO_MANY_REQUESTS, 433}, m = "invokeSuspend", n = {"oldVinylPos"}, s = {"I$0"})
/* loaded from: classes3.dex */
public final class TuningDetailsListViewModel$resetVinyl$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int I$0;
    public int label;
    public final /* synthetic */ TuningDetailsListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TuningDetailsListViewModel$resetVinyl$1(TuningDetailsListViewModel tuningDetailsListViewModel, Continuation<? super TuningDetailsListViewModel$resetVinyl$1> continuation) {
        super(2, continuation);
        this.this$0 = tuningDetailsListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TuningDetailsListViewModel$resetVinyl$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TuningDetailsListViewModel$resetVinyl$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableSharedFlow mutableSharedFlow;
        int resetVinyl;
        MutableSharedFlow mutableSharedFlow2;
        int i;
        MutableStateFlow mutableStateFlow;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        try {
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            mutableSharedFlow = this.this$0.mutableVinylsList;
            this.label = 1;
            obj = FlowKt.first(mutableSharedFlow, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                ResultKt.throwOnFailure(obj);
                mutableStateFlow = this.this$0.mutableNewAndOldVinyls;
                mutableStateFlow.setValue(CollectionsKt__CollectionsJVMKt.listOf(Boxing.boxInt(i)));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        List list = (List) obj;
        resetVinyl = this.this$0.resetVinyl(list);
        mutableSharedFlow2 = this.this$0.mutableVinylsList;
        this.I$0 = resetVinyl;
        this.label = 2;
        if (mutableSharedFlow2.emit(list, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        i = resetVinyl;
        mutableStateFlow = this.this$0.mutableNewAndOldVinyls;
        mutableStateFlow.setValue(CollectionsKt__CollectionsJVMKt.listOf(Boxing.boxInt(i)));
        return Unit.INSTANCE;
    }
}
