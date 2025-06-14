package com.blackhub.bronline.game.gui.inventory.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.blackhub.bronline.game.gui.inventory.InventoryUtilsKt;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: InventoryAndExchangeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$migrateItemFromSlotToInv$1", f = "InventoryAndExchangeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class InventoryAndExchangeViewModel$migrateItemFromSlotToInv$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $newPosInInv;
    public final /* synthetic */ int $posFromSlot;
    public int label;
    public final /* synthetic */ InventoryAndExchangeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InventoryAndExchangeViewModel$migrateItemFromSlotToInv$1(InventoryAndExchangeViewModel inventoryAndExchangeViewModel, int i, int i2, Continuation<? super InventoryAndExchangeViewModel$migrateItemFromSlotToInv$1> continuation) {
        super(2, continuation);
        this.this$0 = inventoryAndExchangeViewModel;
        this.$newPosInInv = i;
        this.$posFromSlot = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new InventoryAndExchangeViewModel$migrateItemFromSlotToInv$1(this.this$0, this.$newPosInInv, this.$posFromSlot, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InventoryAndExchangeViewModel$migrateItemFromSlotToInv$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        MutableLiveData mutableLiveData3;
        MutableLiveData mutableLiveData4;
        MutableLiveData mutableLiveData5;
        MutableLiveData mutableLiveData6;
        MutableLiveData mutableLiveData7;
        MutableLiveData mutableLiveData8;
        MutableLiveData mutableLiveData9;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                mutableLiveData = this.this$0.mutableInvItems;
                List list = (List) mutableLiveData.getValue();
                mutableLiveData2 = this.this$0.mutableSlotItems;
                List list2 = (List) mutableLiveData2.getValue();
                mutableLiveData3 = this.this$0.mutableSavedInitPosInInv;
                List list3 = (List) mutableLiveData3.getValue();
                if (list != null) {
                    int i = this.$newPosInInv;
                    int i2 = this.$posFromSlot;
                    InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.this$0;
                    if (list2 != null) {
                        list.set(i, InventoryUtilsKt.getFinalItem((InvItems) list2.get(i2), ((InvItems) list2.get(i2)).getItemsValue()));
                        list2.set(i2, InventoryUtilsKt.emptyItem());
                        mutableLiveData4 = inventoryAndExchangeViewModel.mutableItemFromSlot;
                        mutableLiveData4.postValue(list.get(i));
                        mutableLiveData5 = inventoryAndExchangeViewModel.mutableInvItems;
                        mutableLiveData5.postValue(list);
                        mutableLiveData6 = inventoryAndExchangeViewModel.mutableSlotItems;
                        mutableLiveData6.postValue(list2);
                        mutableLiveData7 = inventoryAndExchangeViewModel.mutableNewInvPosition;
                        mutableLiveData7.postValue(Boxing.boxInt(i));
                        mutableLiveData8 = inventoryAndExchangeViewModel.mutableNewSlotPosition;
                        mutableLiveData8.postValue(Boxing.boxInt(i2));
                        if (list3 != null) {
                            list3.set(i, Boxing.boxInt(1));
                            mutableLiveData9 = inventoryAndExchangeViewModel.mutableSavedInitPosInInv;
                            mutableLiveData9.postValue(list3);
                        }
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
