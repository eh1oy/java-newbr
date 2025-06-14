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
import kotlin.coroutines.jvm.internal.Boxing;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.inventory.viewmodel.CarTrunkOrClosetViewModel$initPlayerItems$1", f = "CarTrunkOrClosetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class CarTrunkOrClosetViewModel$initPlayerItems$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ List<InvItems> $allItemsFromJSON;
    public final /* synthetic */ JSONArray $playersItemsInInventoryArray;
    public final /* synthetic */ int $sizeInventory;
    public int label;
    public final /* synthetic */ CarTrunkOrClosetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarTrunkOrClosetViewModel$initPlayerItems$1(CarTrunkOrClosetViewModel carTrunkOrClosetViewModel, JSONArray jSONArray, int i, List<InvItems> list, Continuation<? super CarTrunkOrClosetViewModel$initPlayerItems$1> continuation) {
        super(2, continuation);
        this.this$0 = carTrunkOrClosetViewModel;
        this.$playersItemsInInventoryArray = jSONArray;
        this.$sizeInventory = i;
        this.$allItemsFromJSON = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CarTrunkOrClosetViewModel$initPlayerItems$1(this.this$0, this.$playersItemsInInventoryArray, this.$sizeInventory, this.$allItemsFromJSON, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CarTrunkOrClosetViewModel$initPlayerItems$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MigrateItemsFromAny migrateItemsFromAny;
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                migrateItemsFromAny = this.this$0.actionWithJSONArray;
                List<InvItems> newMigrateDataFromAnyToObject = migrateItemsFromAny.newMigrateDataFromAnyToObject(this.$playersItemsInInventoryArray, this.$sizeInventory, false, this.$allItemsFromJSON);
                mutableLiveData = this.this$0.mutablePlayerItems;
                mutableLiveData.postValue(newMigrateDataFromAnyToObject);
                mutableLiveData2 = this.this$0.mutableSlotsInInventory;
                mutableLiveData2.postValue(Boxing.boxInt(this.$sizeInventory));
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
