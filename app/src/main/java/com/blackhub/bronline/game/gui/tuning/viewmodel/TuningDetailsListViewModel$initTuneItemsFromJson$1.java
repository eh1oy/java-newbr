package com.blackhub.bronline.game.gui.tuning.viewmodel;

import com.blackhub.bronline.game.gui.tuning.data.TuneObj;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TuningDetailsListViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$initTuneItemsFromJson$1", f = "TuningDetailsListViewModel.kt", i = {}, l = {131, 132}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class TuningDetailsListViewModel$initTuneItemsFromJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ List<TuneObj> $items;
    public int label;
    public final /* synthetic */ TuningDetailsListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TuningDetailsListViewModel$initTuneItemsFromJson$1(TuningDetailsListViewModel tuningDetailsListViewModel, List<TuneObj> list, Continuation<? super TuningDetailsListViewModel$initTuneItemsFromJson$1> continuation) {
        super(2, continuation);
        this.this$0 = tuningDetailsListViewModel;
        this.$items = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TuningDetailsListViewModel$initTuneItemsFromJson$1(this.this$0, this.$items, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TuningDetailsListViewModel$initTuneItemsFromJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableSharedFlow mutableSharedFlow;
        boolean z;
        Object initCurrentSelectors;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.this$0.mutableTuneItems;
            mutableStateFlow.setValue(this.$items);
            mutableStateFlow2 = this.this$0.mutableTuneItems;
            if (!((Collection) mutableStateFlow2.getValue()).isEmpty()) {
                mutableSharedFlow = this.this$0.mutableDetailsWithIdAndStatus;
                this.label = 1;
                obj = FlowKt.first(mutableSharedFlow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        if (!((Collection) obj).isEmpty()) {
            z = this.this$0.ifInitSelectors;
            if (!z) {
                TuningDetailsListViewModel tuningDetailsListViewModel = this.this$0;
                this.label = 2;
                initCurrentSelectors = tuningDetailsListViewModel.initCurrentSelectors(this);
                if (initCurrentSelectors == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
