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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CarTrunkOrClosetViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.inventory.viewmodel.CarTrunkOrClosetViewModel$migrateItemFromOtherToInv$1", f = "CarTrunkOrClosetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCarTrunkOrClosetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarTrunkOrClosetViewModel.kt\ncom/blackhub/bronline/game/gui/inventory/viewmodel/CarTrunkOrClosetViewModel$migrateItemFromOtherToInv$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
/* loaded from: classes3.dex */
public final class CarTrunkOrClosetViewModel$migrateItemFromOtherToInv$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $migrateValue;
    public final /* synthetic */ int $posInInv;
    public final /* synthetic */ int $posInOther;
    public int label;
    public final /* synthetic */ CarTrunkOrClosetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarTrunkOrClosetViewModel$migrateItemFromOtherToInv$1(CarTrunkOrClosetViewModel carTrunkOrClosetViewModel, int i, int i2, int i3, Continuation<? super CarTrunkOrClosetViewModel$migrateItemFromOtherToInv$1> continuation) {
        super(2, continuation);
        this.this$0 = carTrunkOrClosetViewModel;
        this.$posInInv = i;
        this.$posInOther = i2;
        this.$migrateValue = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CarTrunkOrClosetViewModel$migrateItemFromOtherToInv$1(this.this$0, this.$posInInv, this.$posInOther, this.$migrateValue, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CarTrunkOrClosetViewModel$migrateItemFromOtherToInv$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        int i;
        InvItems invItems;
        InvItems updateItemAfterMigrate;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                mutableLiveData = this.this$0.mutableOtherItems;
                List list = (List) mutableLiveData.getValue();
                mutableLiveData2 = this.this$0.mutablePlayerItems;
                List list2 = (List) mutableLiveData2.getValue();
                int i2 = this.$posInInv;
                if (list != null && list2 != null) {
                    InvItems invItems2 = (InvItems) list.get(this.$posInOther);
                    if (invItems2.getFold() == 0) {
                        int size = list2.size();
                        i = 0;
                        while (i < size) {
                            if (invItems2.getId() == ((InvItems) list2.get(i)).getId()) {
                                invItems = (InvItems) list2.get(i);
                                break;
                            }
                            i++;
                        }
                    }
                    i = i2;
                    invItems = null;
                    if (invItems == null) {
                        invItems = (InvItems) list2.get(i);
                    }
                    updateItemAfterMigrate = this.this$0.updateItemAfterMigrate(invItems2, invItems, this.$migrateValue);
                    if (invItems2.getItemsValue() - this.$migrateValue == 0) {
                        invItems2 = InventoryUtilsKt.emptyItem();
                    } else {
                        invItems2.setItemsValue(invItems2.getItemsValue() - this.$migrateValue);
                    }
                    list.set(this.$posInOther, invItems2);
                    list2.set(i, updateItemAfterMigrate);
                    i2 = i;
                }
                mutableLiveData3 = this.this$0.mutableInvPos;
                mutableLiveData3.postValue(Boxing.boxInt(i2));
                mutableLiveData4 = this.this$0.mutableOtherPos;
                mutableLiveData4.postValue(Boxing.boxInt(this.$posInOther));
                if (list2 != null) {
                    mutableLiveData6 = this.this$0.mutablePlayerItems;
                    mutableLiveData6.postValue(list2);
                }
                if (list != null) {
                    mutableLiveData5 = this.this$0.mutableOtherItems;
                    mutableLiveData5.postValue(list);
                }
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
