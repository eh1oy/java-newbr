package com.blackhub.bronline.game.gui.inventory.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.blackhub.bronline.game.gui.inventory.MigrateItemsFromAny;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CarTrunkOrClosetViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\f\u00101\u001a\b\u0012\u0004\u0012\u00020\f022\u0006\u00103\u001a\u00020\u0007J&\u00104\u001a\u00020.2\b\u00105\u001a\u0004\u0018\u0001002\f\u00101\u001a\b\u0012\u0004\u0012\u00020\f022\u0006\u00106\u001a\u00020\u0007J&\u00107\u001a\u00020.2\b\u00108\u001a\u0004\u0018\u0001002\f\u00101\u001a\b\u0012\u0004\u0012\u00020\f022\u0006\u00109\u001a\u00020\u0007J\u001e\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u0007J\u001e\u0010>\u001a\u00020.2\u0006\u0010<\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u0007J\u0016\u0010?\u001a\u00020.2\u0006\u0010@\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0007J\u000e\u0010A\u001a\u00020.2\u0006\u0010\u0019\u001a\u00020\u0007J\u000e\u0010B\u001a\u00020.2\u0006\u0010\u001b\u001a\u00020\u0007J\u000e\u0010C\u001a\u00020.2\u0006\u0010!\u001a\u00020\u0007J\u000e\u0010D\u001a\u00020.2\u0006\u0010E\u001a\u00020\u0007J\u000e\u0010F\u001a\u00020.2\u0006\u0010G\u001a\u00020\u0007J\u000e\u0010H\u001a\u00020.2\u0006\u0010+\u001a\u00020\u0007J \u0010I\u001a\u00020\f2\u0006\u0010J\u001a\u00020\f2\u0006\u0010K\u001a\u00020\f2\u0006\u0010=\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0016¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u001d\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0016¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0018¨\u0006L"}, d2 = {"Lcom/blackhub/bronline/game/gui/inventory/viewmodel/CarTrunkOrClosetViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "actionWithJSONArray", "Lcom/blackhub/bronline/game/gui/inventory/MigrateItemsFromAny;", "mutableInvPos", "Landroidx/lifecycle/MutableLiveData;", "", "mutableMaxOtherWeight", "mutableMaxPlayersWeight", "mutableOtherItems", "", "Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", "mutableOtherPos", "mutableOtherWeight", "mutablePlayerItems", "mutableSlotItems", "mutableSlotPos", "mutableSlotsInInventory", "mutableThisPlayersWeight", "mutableTypeInterface", "newInvPos", "Landroidx/lifecycle/LiveData;", "getNewInvPos", "()Landroidx/lifecycle/LiveData;", "newMaxOtherWeight", "getNewMaxOtherWeight", "newMaxPlayersWeight", "getNewMaxPlayersWeight", "newOtherItems", "getNewOtherItems", "newOtherPos", "getNewOtherPos", "newOtherWeight", "getNewOtherWeight", "newPlayerItems", "getNewPlayerItems", "newSlotItems", "getNewSlotItems", "newSlotPos", "getNewSlotPos", "newThisPlayersWeight", "getNewThisPlayersWeight", "newTypeInterface", "getNewTypeInterface", "initOtherItems", "", "otherItemsArray", "Lorg/json/JSONArray;", "allItemsFromJSON", "", "sizeOtherInv", "initPlayerItems", "playersItemsInInventoryArray", "sizeInventory", "initSlotItems", "itemsInSlotArray", "simCardNumber", "migrateItemFromInvToOther", "posInInv", "posInOther", "migrateValue", "migrateItemFromOtherToInv", "migrateItemFromSlotToInv", "posInSlot", "setMaxOtherWeight", "setMaxPlayersWeight", "setOtherWeight", "setSlotsInInventory", "newSlotsInInventory", "setThisPlayersWeight", "newPlayersWeight", "setTypeInterface", "updateItemAfterMigrate", "migrateItem", "finalItem", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CarTrunkOrClosetViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final MigrateItemsFromAny actionWithJSONArray = new MigrateItemsFromAny();

    @NotNull
    public final MutableLiveData<Integer> mutableInvPos;

    @NotNull
    public final MutableLiveData<Integer> mutableMaxOtherWeight;

    @NotNull
    public final MutableLiveData<Integer> mutableMaxPlayersWeight;

    @NotNull
    public final MutableLiveData<List<InvItems>> mutableOtherItems;

    @NotNull
    public final MutableLiveData<Integer> mutableOtherPos;

    @NotNull
    public final MutableLiveData<Integer> mutableOtherWeight;

    @NotNull
    public final MutableLiveData<List<InvItems>> mutablePlayerItems;

    @NotNull
    public final MutableLiveData<List<InvItems>> mutableSlotItems;

    @NotNull
    public final MutableLiveData<Integer> mutableSlotPos;

    @NotNull
    public final MutableLiveData<Integer> mutableSlotsInInventory;

    @NotNull
    public final MutableLiveData<Integer> mutableThisPlayersWeight;

    @NotNull
    public final MutableLiveData<Integer> mutableTypeInterface;

    @NotNull
    public final LiveData<Integer> newInvPos;

    @NotNull
    public final LiveData<Integer> newMaxOtherWeight;

    @NotNull
    public final LiveData<Integer> newMaxPlayersWeight;

    @NotNull
    public final LiveData<List<InvItems>> newOtherItems;

    @NotNull
    public final LiveData<Integer> newOtherPos;

    @NotNull
    public final LiveData<Integer> newOtherWeight;

    @NotNull
    public final LiveData<List<InvItems>> newPlayerItems;

    @NotNull
    public final LiveData<List<InvItems>> newSlotItems;

    @NotNull
    public final LiveData<Integer> newSlotPos;

    @NotNull
    public final LiveData<Integer> newThisPlayersWeight;

    @NotNull
    public final LiveData<Integer> newTypeInterface;

    public CarTrunkOrClosetViewModel() {
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.mutableTypeInterface = mutableLiveData;
        this.newTypeInterface = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this.mutableThisPlayersWeight = mutableLiveData2;
        this.newThisPlayersWeight = mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3 = new MutableLiveData<>();
        this.mutableMaxPlayersWeight = mutableLiveData3;
        this.newMaxPlayersWeight = mutableLiveData3;
        this.mutableSlotsInInventory = new MutableLiveData<>();
        MutableLiveData<Integer> mutableLiveData4 = new MutableLiveData<>();
        this.mutableOtherWeight = mutableLiveData4;
        this.newOtherWeight = mutableLiveData4;
        MutableLiveData<Integer> mutableLiveData5 = new MutableLiveData<>();
        this.mutableMaxOtherWeight = mutableLiveData5;
        this.newMaxOtherWeight = mutableLiveData5;
        MutableLiveData<List<InvItems>> mutableLiveData6 = new MutableLiveData<>();
        this.mutablePlayerItems = mutableLiveData6;
        this.newPlayerItems = mutableLiveData6;
        MutableLiveData<Integer> mutableLiveData7 = new MutableLiveData<>();
        this.mutableInvPos = mutableLiveData7;
        this.newInvPos = mutableLiveData7;
        MutableLiveData<List<InvItems>> mutableLiveData8 = new MutableLiveData<>();
        this.mutableOtherItems = mutableLiveData8;
        this.newOtherItems = mutableLiveData8;
        MutableLiveData<Integer> mutableLiveData9 = new MutableLiveData<>();
        this.mutableOtherPos = mutableLiveData9;
        this.newOtherPos = mutableLiveData9;
        MutableLiveData<List<InvItems>> mutableLiveData10 = new MutableLiveData<>();
        this.mutableSlotItems = mutableLiveData10;
        this.newSlotItems = mutableLiveData10;
        MutableLiveData<Integer> mutableLiveData11 = new MutableLiveData<>();
        this.mutableSlotPos = mutableLiveData11;
        this.newSlotPos = mutableLiveData11;
    }

    @NotNull
    public final LiveData<Integer> getNewTypeInterface() {
        return this.newTypeInterface;
    }

    @NotNull
    public final LiveData<Integer> getNewThisPlayersWeight() {
        return this.newThisPlayersWeight;
    }

    @NotNull
    public final LiveData<Integer> getNewMaxPlayersWeight() {
        return this.newMaxPlayersWeight;
    }

    @NotNull
    public final LiveData<Integer> getNewOtherWeight() {
        return this.newOtherWeight;
    }

    @NotNull
    public final LiveData<Integer> getNewMaxOtherWeight() {
        return this.newMaxOtherWeight;
    }

    @NotNull
    public final LiveData<List<InvItems>> getNewPlayerItems() {
        return this.newPlayerItems;
    }

    @NotNull
    public final LiveData<Integer> getNewInvPos() {
        return this.newInvPos;
    }

    @NotNull
    public final LiveData<List<InvItems>> getNewOtherItems() {
        return this.newOtherItems;
    }

    @NotNull
    public final LiveData<Integer> getNewOtherPos() {
        return this.newOtherPos;
    }

    @NotNull
    public final LiveData<List<InvItems>> getNewSlotItems() {
        return this.newSlotItems;
    }

    @NotNull
    public final LiveData<Integer> getNewSlotPos() {
        return this.newSlotPos;
    }

    public final void setTypeInterface(int newTypeInterface) {
        this.mutableTypeInterface.postValue(Integer.valueOf(newTypeInterface));
    }

    public final void setThisPlayersWeight(int newPlayersWeight) {
        this.mutableThisPlayersWeight.postValue(Integer.valueOf(newPlayersWeight));
    }

    public final void setMaxPlayersWeight(int newMaxPlayersWeight) {
        this.mutableMaxPlayersWeight.postValue(Integer.valueOf(newMaxPlayersWeight));
    }

    public final void setSlotsInInventory(int newSlotsInInventory) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new CarTrunkOrClosetViewModel$setSlotsInInventory$1(this, newSlotsInInventory, null), 2, null);
    }

    public final void setOtherWeight(int newOtherWeight) {
        this.mutableOtherWeight.postValue(Integer.valueOf(newOtherWeight));
    }

    public final void setMaxOtherWeight(int newMaxOtherWeight) {
        this.mutableMaxOtherWeight.postValue(Integer.valueOf(newMaxOtherWeight));
    }

    public final void initPlayerItems(@Nullable JSONArray playersItemsInInventoryArray, @NotNull List<InvItems> allItemsFromJSON, int sizeInventory) {
        Intrinsics.checkNotNullParameter(allItemsFromJSON, "allItemsFromJSON");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new CarTrunkOrClosetViewModel$initPlayerItems$1(this, playersItemsInInventoryArray, sizeInventory, allItemsFromJSON, null), 2, null);
    }

    public final void initOtherItems(@Nullable JSONArray otherItemsArray, @NotNull List<InvItems> allItemsFromJSON, int sizeOtherInv) {
        Intrinsics.checkNotNullParameter(allItemsFromJSON, "allItemsFromJSON");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new CarTrunkOrClosetViewModel$initOtherItems$1(this, otherItemsArray, sizeOtherInv, allItemsFromJSON, null), 2, null);
    }

    public final void migrateItemFromInvToOther(int posInInv, int posInOther, int migrateValue) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new CarTrunkOrClosetViewModel$migrateItemFromInvToOther$1(this, posInOther, posInInv, migrateValue, null), 2, null);
    }

    public final void migrateItemFromOtherToInv(int posInOther, int posInInv, int migrateValue) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new CarTrunkOrClosetViewModel$migrateItemFromOtherToInv$1(this, posInInv, posInOther, migrateValue, null), 2, null);
    }

    public final InvItems updateItemAfterMigrate(InvItems migrateItem, InvItems finalItem, int migrateValue) {
        finalItem.setId(migrateItem.getId());
        finalItem.set_name(migrateItem.get_name());
        finalItem.set_nameStore(migrateItem.get_nameStore());
        finalItem.setDesc(migrateItem.getDesc());
        finalItem.setImageName(migrateItem.getImageName());
        finalItem.setModelid(migrateItem.getModelid());
        finalItem.setWeight(migrateItem.getWeight());
        finalItem.setAddw(migrateItem.getAddw());
        finalItem.setFold(migrateItem.getFold());
        finalItem.setShiftX(migrateItem.getShiftX());
        finalItem.setShiftY(migrateItem.getShiftY());
        finalItem.setShiftZ(migrateItem.getShiftZ());
        finalItem.setX(migrateItem.getX());
        finalItem.setY(migrateItem.getY());
        finalItem.setZ(migrateItem.getZ());
        finalItem.setZoom(migrateItem.getZoom());
        finalItem.setItemsValue(finalItem.getItemsValue() + migrateValue);
        finalItem.setTextIfException(migrateItem.getTextIfException());
        return finalItem;
    }

    public final void initSlotItems(@Nullable JSONArray itemsInSlotArray, @NotNull List<InvItems> allItemsFromJSON, int simCardNumber) {
        Intrinsics.checkNotNullParameter(allItemsFromJSON, "allItemsFromJSON");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new CarTrunkOrClosetViewModel$initSlotItems$1(itemsInSlotArray, this, allItemsFromJSON, simCardNumber, null), 2, null);
    }

    public final void migrateItemFromSlotToInv(int posInSlot, int posInInv) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new CarTrunkOrClosetViewModel$migrateItemFromSlotToInv$1(this, posInSlot, posInInv, null), 2, null);
    }
}
