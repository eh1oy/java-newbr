package com.blackhub.bronline.game.gui.donate.viewmodel;

import com.blackhub.bronline.game.gui.donate.data.DonateTileObj;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.List;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: DonateTileViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$clearLimit$1", f = "DonateTileViewModel.kt", i = {0}, l = {519}, m = "invokeSuspend", n = {"allLimits"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class DonateTileViewModel$clearLimit$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $itemId;
    public Object L$0;
    public int label;
    public final /* synthetic */ DonateTileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DonateTileViewModel$clearLimit$1(DonateTileViewModel donateTileViewModel, int i, Continuation<? super DonateTileViewModel$clearLimit$1> continuation) {
        super(2, continuation);
        this.this$0 = donateTileViewModel;
        this.$itemId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DonateTileViewModel$clearLimit$1(this.this$0, this.$itemId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DonateTileViewModel$clearLimit$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableSharedFlow mutableSharedFlow;
        List list;
        MutableStateFlow mutableStateFlow2;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        int i2 = 1;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                mutableStateFlow = this.this$0.mutableValueOfLimits;
                List list2 = (List) mutableStateFlow.getValue();
                mutableSharedFlow = this.this$0.mutableCurrentItems;
                this.L$0 = list2;
                this.label = 1;
                Object first = FlowKt.first(mutableSharedFlow, this);
                if (first == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = list2;
                obj = first;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            DonateTileObj donateTileObj = (DonateTileObj) obj;
            int i3 = 0;
            while (true) {
                if (i3 >= list.size()) {
                    break;
                }
                if (((Number) list.get(i3)).intValue() == this.$itemId) {
                    list.set(i2, Boxing.boxInt(0));
                    break;
                }
                i3 += 2;
                i2 += 2;
            }
            mutableStateFlow2 = this.this$0.mutableValueOfLimits;
            mutableStateFlow2.setValue(list);
            if (donateTileObj.getPage() == 0) {
                this.this$0.lSetCurrentPage(0);
            }
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
        return Unit.INSTANCE;
    }
}
