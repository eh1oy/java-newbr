package com.blackhub.bronline.game.gui.tuning.viewmodel;

import com.blackhub.bronline.game.gui.tuning.TuningConstants;
import com.blackhub.bronline.game.gui.tuning.data.TuneObj;
import com.blackhub.bronline.game.gui.tuning.data.TuningBoxItemObj;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TuningDetailsListViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$initItemsForBoxList$1", f = "TuningDetailsListViewModel.kt", i = {}, l = {536}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class TuningDetailsListViewModel$initItemsForBoxList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $carId;
    public int label;
    public final /* synthetic */ TuningDetailsListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TuningDetailsListViewModel$initItemsForBoxList$1(int i, TuningDetailsListViewModel tuningDetailsListViewModel, Continuation<? super TuningDetailsListViewModel$initItemsForBoxList$1> continuation) {
        super(2, continuation);
        this.$carId = i;
        this.this$0 = tuningDetailsListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TuningDetailsListViewModel$initItemsForBoxList$1(this.$carId, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TuningDetailsListViewModel$initItemsForBoxList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean z;
        MutableStateFlow mutableStateFlow;
        List<TuneObj> tuneItemsForCurrentSelector;
        String str;
        MutableStateFlow mutableStateFlow2;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                Iterator<Integer> it = TuningConstants.INSTANCE.getElectronicCars().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (it.next().intValue() == this.$carId) {
                        z = true;
                        break;
                    }
                }
                int size = TuningConstants.INSTANCE.getActiveSelectorListForInfoBrake().size();
                boolean z2 = false;
                for (int i2 = 0; i2 < size; i2++) {
                    tuneItemsForCurrentSelector = this.this$0.getTuneItemsForCurrentSelector(TuningConstants.INSTANCE.getActiveSelectorListForInfoBrake().get(i2).intValue());
                    if (!z2) {
                        mutableStateFlow2 = this.this$0.mutableCurrentBox;
                        mutableStateFlow2.setValue(tuneItemsForCurrentSelector.get(0));
                        z2 = true;
                    }
                    tuneItemsForCurrentSelector.remove(0);
                    for (TuneObj tuneObj : tuneItemsForCurrentSelector) {
                        if (z) {
                            String str2 = TuningConstants.INSTANCE.getTitleItemForElectronicCars().get(i2);
                            str = ((Object) str2) + " " + tuneObj.getName();
                        } else {
                            String str3 = TuningConstants.INSTANCE.getTitleItemsForDVSCars().get(i2);
                            str = ((Object) str3) + " " + tuneObj.getName();
                        }
                        arrayList.add(new TuningBoxItemObj(tuneObj.getId(), str));
                    }
                }
                mutableStateFlow = this.this$0.mutableItemsForBox;
                this.label = 1;
                if (mutableStateFlow.emit(arrayList, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
        return Unit.INSTANCE;
    }
}
