package com.blackhub.bronline.game.gui.inventory.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.blackhub.bronline.game.gui.inventory.Constants;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$useOrDeleteTheItem$1", f = "InventoryAndExchangeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class InventoryAndExchangeViewModel$useOrDeleteTheItem$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $currentPosition;
    public int label;
    public final /* synthetic */ InventoryAndExchangeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InventoryAndExchangeViewModel$useOrDeleteTheItem$1(InventoryAndExchangeViewModel inventoryAndExchangeViewModel, int i, Continuation<? super InventoryAndExchangeViewModel$useOrDeleteTheItem$1> continuation) {
        super(2, continuation);
        this.this$0 = inventoryAndExchangeViewModel;
        this.$currentPosition = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new InventoryAndExchangeViewModel$useOrDeleteTheItem$1(this.this$0, this.$currentPosition, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InventoryAndExchangeViewModel$useOrDeleteTheItem$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        MutableLiveData mutableLiveData3;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                mutableLiveData = this.this$0.mutableInvItems;
                List list = (List) mutableLiveData.getValue();
                if (list != null) {
                    int i = this.$currentPosition;
                    InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.this$0;
                    switch (((InvItems) list.get(i)).getId()) {
                        case Constants.ID_TACKLE_1 /* 642 */:
                        case Constants.ID_TACKLE_2 /* 643 */:
                        case Constants.ID_TACKLE_3 /* 644 */:
                        case Constants.ID_TACKLE_4 /* 645 */:
                        case Constants.ID_TACKLE_5 /* 646 */:
                            ((InvItems) list.get(i)).setItemsValue(0);
                            break;
                        default:
                            ((InvItems) list.get(i)).setItemsValue(r2.getItemsValue() - 1);
                            break;
                    }
                    if (((InvItems) list.get(i)).getItemsValue() == 0) {
                        list.set(i, InventoryUtilsKt.emptyItem());
                    }
                    mutableLiveData2 = inventoryAndExchangeViewModel.mutableOldInvPosition;
                    mutableLiveData2.postValue(Boxing.boxInt(i));
                    mutableLiveData3 = inventoryAndExchangeViewModel.mutableInvItems;
                    mutableLiveData3.postValue(list);
                }
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
