package com.blackhub.bronline.game.gui.donate.viewmodel;

import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.gui.donate.data.DonateTileObj;
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
import org.json.JSONArray;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: DonateTileViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$updateValueOfLimit$1", f = "DonateTileViewModel.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class DonateTileViewModel$updateValueOfLimit$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONArray $jsonArray;
    public Object L$0;
    public int label;
    public final /* synthetic */ DonateTileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DonateTileViewModel$updateValueOfLimit$1(JSONArray jSONArray, DonateTileViewModel donateTileViewModel, Continuation<? super DonateTileViewModel$updateValueOfLimit$1> continuation) {
        super(2, continuation);
        this.$jsonArray = jSONArray;
        this.this$0 = donateTileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DonateTileViewModel$updateValueOfLimit$1(this.$jsonArray, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DonateTileViewModel$updateValueOfLimit$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableSharedFlow mutableSharedFlow;
        DonateTileViewModel donateTileViewModel;
        MutableStateFlow mutableStateFlow3;
        MutableStateFlow mutableStateFlow4;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            JSONArray jSONArray = this.$jsonArray;
            if (jSONArray != null) {
                DonateTileViewModel donateTileViewModel2 = this.this$0;
                List<Integer> mutableIntList = JsonArrayExtensionKt.toMutableIntList(jSONArray);
                mutableStateFlow = donateTileViewModel2.mutableValueOfLimits;
                List list = (List) mutableStateFlow.getValue();
                if (list.isEmpty()) {
                    mutableStateFlow3 = donateTileViewModel2.mutableValueOfLimits;
                    mutableStateFlow3.setValue(mutableIntList);
                } else {
                    donateTileViewModel2.updateOldLimits(list, mutableIntList);
                    mutableStateFlow2 = donateTileViewModel2.mutableValueOfLimits;
                    mutableStateFlow2.setValue(list);
                }
                mutableSharedFlow = donateTileViewModel2.mutableCurrentItems;
                this.L$0 = donateTileViewModel2;
                this.label = 1;
                obj = FlowKt.first(mutableSharedFlow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                donateTileViewModel = donateTileViewModel2;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        donateTileViewModel = (DonateTileViewModel) this.L$0;
        ResultKt.throwOnFailure(obj);
        mutableStateFlow4 = donateTileViewModel.mutableValueOfLimits;
        donateTileViewModel.lUpdateCurrentCollection((List) mutableStateFlow4.getValue(), (DonateTileObj) obj);
        return Unit.INSTANCE;
    }
}
