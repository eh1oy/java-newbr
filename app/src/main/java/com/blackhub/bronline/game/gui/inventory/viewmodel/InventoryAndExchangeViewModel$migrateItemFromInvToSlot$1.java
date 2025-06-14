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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$migrateItemFromInvToSlot$1", f = "InventoryAndExchangeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class InventoryAndExchangeViewModel$migrateItemFromInvToSlot$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $posFromInv;
    public final /* synthetic */ int $posInSlot;
    public int label;
    public final /* synthetic */ InventoryAndExchangeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InventoryAndExchangeViewModel$migrateItemFromInvToSlot$1(InventoryAndExchangeViewModel inventoryAndExchangeViewModel, int i, int i2, Continuation<? super InventoryAndExchangeViewModel$migrateItemFromInvToSlot$1> continuation) {
        super(2, continuation);
        this.this$0 = inventoryAndExchangeViewModel;
        this.$posInSlot = i;
        this.$posFromInv = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new InventoryAndExchangeViewModel$migrateItemFromInvToSlot$1(this.this$0, this.$posInSlot, this.$posFromInv, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InventoryAndExchangeViewModel$migrateItemFromInvToSlot$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                mutableLiveData = this.this$0.mutableInvItems;
                List list = (List) mutableLiveData.getValue();
                mutableLiveData2 = this.this$0.mutableSlotItems;
                List list2 = (List) mutableLiveData2.getValue();
                if (list != null) {
                    int i = this.$posInSlot;
                    int i2 = this.$posFromInv;
                    InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.this$0;
                    if (list2 != null) {
                        int i3 = i != 6 ? i != 255 ? i + 2 : 0 : 1;
                        if (((InvItems) list2.get(i3)).getItemsValue() != 0) {
                            int id = ((InvItems) list2.get(i3)).getId();
                            if (id == 58) {
                                String textIfException = ((InvItems) list2.get(i3)).getTextIfException();
                                ((InvItems) list2.get(i3)).setTextIfException(((InvItems) list.get(i2)).getTextIfException());
                                ((InvItems) list.get(i2)).setTextIfException(textIfException);
                            } else if (id == 134) {
                                int modelid = ((InvItems) list2.get(i3)).getModelid();
                                ((InvItems) list2.get(i3)).setModelid(((InvItems) list.get(i2)).getModelid());
                                ((InvItems) list.get(i2)).setModelid(modelid);
                            }
                        } else {
                            list2.set(i3, InventoryUtilsKt.getFinalItem((InvItems) list.get(i2), ((InvItems) list.get(i2)).getItemsValue()));
                            list.set(i2, InventoryUtilsKt.emptyItem());
                        }
                        mutableLiveData3 = inventoryAndExchangeViewModel.mutableInvItems;
                        mutableLiveData3.postValue(list);
                        mutableLiveData4 = inventoryAndExchangeViewModel.mutableSlotItems;
                        mutableLiveData4.postValue(list2);
                        mutableLiveData5 = inventoryAndExchangeViewModel.mutableOldInvPosition;
                        mutableLiveData5.postValue(Boxing.boxInt(i2));
                        mutableLiveData6 = inventoryAndExchangeViewModel.mutableNewSlotPosition;
                        mutableLiveData6.postValue(Boxing.boxInt(i3));
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
