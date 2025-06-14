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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$setInitState$1", f = "InventoryAndExchangeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class InventoryAndExchangeViewModel$setInitState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ InventoryAndExchangeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InventoryAndExchangeViewModel$setInitState$1(InventoryAndExchangeViewModel inventoryAndExchangeViewModel, Continuation<? super InventoryAndExchangeViewModel$setInitState$1> continuation) {
        super(2, continuation);
        this.this$0 = inventoryAndExchangeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new InventoryAndExchangeViewModel$setInitState$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InventoryAndExchangeViewModel$setInitState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                mutableLiveData = this.this$0.mutableOldPosFromInv;
                List list = (List) mutableLiveData.getValue();
                mutableLiveData2 = this.this$0.mutableInvItems;
                List list2 = (List) mutableLiveData2.getValue();
                mutableLiveData3 = this.this$0.mutableMyExchangeItems;
                List list3 = (List) mutableLiveData3.getValue();
                if (list2 != null) {
                    InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.this$0;
                    if (list3 != null && list != null) {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            if (((Number) list.get(i)).intValue() != -1) {
                                InvItems finalItem = InventoryUtilsKt.getFinalItem((InvItems) list3.get(i), ((InvItems) list3.get(i)).getItemsValue() + ((InvItems) list2.get(((Number) list.get(i)).intValue())).getItemsValue());
                                finalItem.setWhoseItem(0);
                                list2.set(((Number) list.get(i)).intValue(), finalItem);
                                list3.set(i, InventoryUtilsKt.emptyItem());
                                list.set(i, Boxing.boxInt(-1));
                            }
                        }
                        mutableLiveData4 = inventoryAndExchangeViewModel.mutableInvItems;
                        mutableLiveData4.postValue(list2);
                        mutableLiveData5 = inventoryAndExchangeViewModel.mutableMyExchangeItems;
                        mutableLiveData5.postValue(list3);
                        mutableLiveData6 = inventoryAndExchangeViewModel.mutableOldPosFromInv;
                        mutableLiveData6.postValue(list);
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
