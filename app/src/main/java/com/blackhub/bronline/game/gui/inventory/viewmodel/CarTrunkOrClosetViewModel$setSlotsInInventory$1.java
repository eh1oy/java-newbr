package com.blackhub.bronline.game.gui.inventory.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.blackhub.bronline.game.gui.inventory.InventoryUtilsKt;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CarTrunkOrClosetViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.inventory.viewmodel.CarTrunkOrClosetViewModel$setSlotsInInventory$1", f = "CarTrunkOrClosetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCarTrunkOrClosetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarTrunkOrClosetViewModel.kt\ncom/blackhub/bronline/game/gui/inventory/viewmodel/CarTrunkOrClosetViewModel$setSlotsInInventory$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
/* loaded from: classes3.dex */
public final class CarTrunkOrClosetViewModel$setSlotsInInventory$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $newSlotsInInventory;
    public int label;
    public final /* synthetic */ CarTrunkOrClosetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarTrunkOrClosetViewModel$setSlotsInInventory$1(CarTrunkOrClosetViewModel carTrunkOrClosetViewModel, int i, Continuation<? super CarTrunkOrClosetViewModel$setSlotsInInventory$1> continuation) {
        super(2, continuation);
        this.this$0 = carTrunkOrClosetViewModel;
        this.$newSlotsInInventory = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CarTrunkOrClosetViewModel$setSlotsInInventory$1(this.this$0, this.$newSlotsInInventory, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CarTrunkOrClosetViewModel$setSlotsInInventory$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        int intValue;
        MutableLiveData mutableLiveData3;
        MutableLiveData mutableLiveData4;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                mutableLiveData = this.this$0.mutableSlotsInInventory;
                Integer num = (Integer) mutableLiveData.getValue();
                mutableLiveData2 = this.this$0.mutablePlayerItems;
                List list = (List) mutableLiveData2.getValue();
                if (num != null) {
                    if (num.intValue() != this.$newSlotsInInventory && list != null) {
                        boolean z = this.$newSlotsInInventory > num.intValue();
                        if (z) {
                            for (int intValue2 = Boxing.boxInt(num.intValue() - 1).intValue(); intValue2 < this.$newSlotsInInventory; intValue2++) {
                                list.add(InventoryUtilsKt.emptyItem());
                            }
                        } else if (!z && this.$newSlotsInInventory <= (intValue = Boxing.boxInt(num.intValue() - 1).intValue())) {
                            while (true) {
                                list.remove(intValue);
                                if (intValue == this.$newSlotsInInventory) {
                                    break;
                                }
                                intValue--;
                            }
                        }
                        mutableLiveData3 = this.this$0.mutableSlotsInInventory;
                        mutableLiveData3.postValue(Boxing.boxInt(this.$newSlotsInInventory));
                        mutableLiveData4 = this.this$0.mutablePlayerItems;
                        mutableLiveData4.postValue(list);
                    }
                }
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
