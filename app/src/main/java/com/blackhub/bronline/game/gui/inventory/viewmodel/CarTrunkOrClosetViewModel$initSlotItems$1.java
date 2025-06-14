package com.blackhub.bronline.game.gui.inventory.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.blackhub.bronline.game.gui.inventory.MigrateItemsFromAny;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CarTrunkOrClosetViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.inventory.viewmodel.CarTrunkOrClosetViewModel$initSlotItems$1", f = "CarTrunkOrClosetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class CarTrunkOrClosetViewModel$initSlotItems$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ List<InvItems> $allItemsFromJSON;
    public final /* synthetic */ JSONArray $itemsInSlotArray;
    public final /* synthetic */ int $simCardNumber;
    public int label;
    public final /* synthetic */ CarTrunkOrClosetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarTrunkOrClosetViewModel$initSlotItems$1(JSONArray jSONArray, CarTrunkOrClosetViewModel carTrunkOrClosetViewModel, List<InvItems> list, int i, Continuation<? super CarTrunkOrClosetViewModel$initSlotItems$1> continuation) {
        super(2, continuation);
        this.$itemsInSlotArray = jSONArray;
        this.this$0 = carTrunkOrClosetViewModel;
        this.$allItemsFromJSON = list;
        this.$simCardNumber = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CarTrunkOrClosetViewModel$initSlotItems$1(this.$itemsInSlotArray, this.this$0, this.$allItemsFromJSON, this.$simCardNumber, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CarTrunkOrClosetViewModel$initSlotItems$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MigrateItemsFromAny migrateItemsFromAny;
        MutableLiveData mutableLiveData;
        MigrateItemsFromAny migrateItemsFromAny2;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            JSONArray jSONArray = this.$itemsInSlotArray;
            if (jSONArray != null && jSONArray.length() > 1) {
                migrateItemsFromAny = this.this$0.actionWithJSONArray;
                List<InvItems> newMigrateDataFromAnyToObject = migrateItemsFromAny.newMigrateDataFromAnyToObject(this.$itemsInSlotArray, 8, true, this.$allItemsFromJSON);
                if (this.$simCardNumber != 0) {
                    migrateItemsFromAny2 = this.this$0.actionWithJSONArray;
                    InvItems initSimCard = migrateItemsFromAny2.initSimCard(this.$simCardNumber, this.$allItemsFromJSON);
                    if (initSimCard != null) {
                        newMigrateDataFromAnyToObject.set(0, initSimCard);
                    }
                }
                mutableLiveData = this.this$0.mutableSlotItems;
                mutableLiveData.postValue(newMigrateDataFromAnyToObject);
            }
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
        return Unit.INSTANCE;
    }
}
