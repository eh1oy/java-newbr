package com.blackhub.bronline.game.gui.inventory.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.blackhub.bronline.game.gui.inventory.MigrateItemsFromAny;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.gui.inventory.data.InvMessageObj;
import com.blackhub.bronline.game.gui.inventory.data.InvSizeAndItemsObj;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: InventoryAndExchangeViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b6\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020\t2\u0006\u0010y\u001a\u00020\t2\b\u0010z\u001a\u0004\u0018\u00010!2\f\u0010{\u001a\b\u0012\u0004\u0012\u00020\u000e0)J&\u0010|\u001a\u00020w2\b\u0010}\u001a\u0004\u0018\u00010~2\f\u0010{\u001a\b\u0012\u0004\u0012\u00020\u000e0)2\u0006\u0010\u007f\u001a\u00020\tJ\u0010\u0010\u0080\u0001\u001a\u00020w2\u0007\u0010\u0081\u0001\u001a\u00020\tJ\u0010\u0010\u0082\u0001\u001a\u00020w2\u0007\u0010\u0081\u0001\u001a\u00020\tJ\u0016\u0010\u0083\u0001\u001a\u00020w2\r\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ)\u0010\u0085\u0001\u001a\u00020w2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010~2\f\u0010{\u001a\b\u0012\u0004\u0012\u00020\u000e0)2\u0007\u0010\u0087\u0001\u001a\u00020\tJ\u0019\u0010\u0088\u0001\u001a\u00020w2\u0007\u0010\u0089\u0001\u001a\u00020\t2\u0007\u0010\u008a\u0001\u001a\u00020\tJ\u0019\u0010\u008b\u0001\u001a\u00020w2\u0007\u0010\u008c\u0001\u001a\u00020\t2\u0007\u0010\u008d\u0001\u001a\u00020\tJ\u0019\u0010\u008e\u0001\u001a\u00020w2\u0007\u0010\u008f\u0001\u001a\u00020\t2\u0007\u0010\u0090\u0001\u001a\u00020\tJ\u0019\u0010\u0091\u0001\u001a\u00020w2\u0007\u0010\u0092\u0001\u001a\u00020\t2\u0007\u0010\u0093\u0001\u001a\u00020\tJ\u0019\u0010\u0094\u0001\u001a\u00020w2\u0007\u0010\u0095\u0001\u001a\u00020\t2\u0007\u0010\u0096\u0001\u001a\u00020\tJ\u0006\u0010n\u001a\u00020wJ\u0006\u0010p\u001a\u00020wJ\u0010\u0010\u0097\u0001\u001a\u00020w2\u0007\u0010\u0098\u0001\u001a\u00020\u0007J\u000f\u0010\u0099\u0001\u001a\u00020w2\u0006\u00106\u001a\u00020\tJ\u000f\u0010\u009a\u0001\u001a\u00020w2\u0006\u0010:\u001a\u00020\tJ\u0007\u0010\u009b\u0001\u001a\u00020wJ\u000f\u0010\u009c\u0001\u001a\u00020w2\u0006\u0010@\u001a\u00020\tJ\u000f\u0010\u009d\u0001\u001a\u00020w2\u0006\u0010H\u001a\u00020\tJ\u0010\u0010\u009e\u0001\u001a\u00020w2\u0007\u0010\u009f\u0001\u001a\u00020\u0019J\u0017\u0010 \u0001\u001a\u00020w2\b\u0010X\u001a\u0004\u0018\u00010\t¢\u0006\u0003\u0010¡\u0001J\u0011\u0010¢\u0001\u001a\u00020w2\b\u0010Z\u001a\u0004\u0018\u00010!J\u000f\u0010£\u0001\u001a\u00020w2\u0006\u0010\\\u001a\u00020\tJ\u000f\u0010¤\u0001\u001a\u00020w2\u0006\u0010^\u001a\u00020\tJ\u000f\u0010¥\u0001\u001a\u00020w2\u0006\u0010`\u001a\u00020!J\u0010\u0010¦\u0001\u001a\u00020w2\u0007\u0010§\u0001\u001a\u00020\tJ\u0016\u0010¨\u0001\u001a\u00020w2\r\u0010©\u0001\u001a\b\u0012\u0004\u0012\u00020*0)J\u000f\u0010ª\u0001\u001a\u00020w2\u0006\u0010j\u001a\u00020\tJ\u000f\u0010«\u0001\u001a\u00020w2\u0006\u0010l\u001a\u00020\tJ$\u0010¬\u0001\u001a\u00020w2\u0007\u0010\u00ad\u0001\u001a\u00020\t2\u0007\u0010®\u0001\u001a\u00020\t2\t\u0010¯\u0001\u001a\u0004\u0018\u00010!J\u000f\u0010°\u0001\u001a\u00020w2\u0006\u0010\u007f\u001a\u00020\tJ\u000f\u0010±\u0001\u001a\u00020w2\u0006\u00108\u001a\u00020\tJ\u0010\u0010²\u0001\u001a\u00020w2\u0007\u0010³\u0001\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010)0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u000703¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\b9\u00105R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\b;\u00105R\u001d\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r03¢\u0006\b\n\u0000\u001a\u0004\b=\u00105R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000e03¢\u0006\b\n\u0000\u001a\u0004\b?\u00105R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\bA\u00105R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001303¢\u0006\b\n\u0000\u001a\u0004\bC\u00105R\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\bE\u00105R\u001d\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r03¢\u0006\b\n\u0000\u001a\u0004\bG\u00105R\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\bI\u00105R\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\bK\u00105R\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020\u001903¢\u0006\b\n\u0000\u001a\u0004\bM\u00105R\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\bO\u00105R\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\bQ\u00105R\u001d\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r03¢\u0006\b\n\u0000\u001a\u0004\bS\u00105R\u0017\u0010T\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\bU\u00105R\u001d\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r03¢\u0006\b\n\u0000\u001a\u0004\bW\u00105R\u0019\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t03¢\u0006\b\n\u0000\u001a\u0004\bY\u00105R\u0019\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!03¢\u0006\b\n\u0000\u001a\u0004\b[\u00105R\u0017\u0010\\\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\b]\u00105R\u0017\u0010^\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\b_\u00105R\u0017\u0010`\u001a\b\u0012\u0004\u0012\u00020!03¢\u0006\b\n\u0000\u001a\u0004\ba\u00105R\u001d\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r03¢\u0006\b\n\u0000\u001a\u0004\bc\u00105R\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\be\u00105R\u001d\u0010f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r03¢\u0006\b\n\u0000\u001a\u0004\bg\u00105R\u001d\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r03¢\u0006\b\n\u0000\u001a\u0004\bi\u00105R\u0017\u0010j\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\bk\u00105R\u0017\u0010l\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\bm\u00105R\u0017\u0010n\u001a\b\u0012\u0004\u0012\u00020\u000703¢\u0006\b\n\u0000\u001a\u0004\bo\u00105R\u0017\u0010p\u001a\b\u0012\u0004\u0012\u00020\u000703¢\u0006\b\n\u0000\u001a\u0004\bq\u00105R\u001d\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)03¢\u0006\b\n\u0000\u001a\u0004\bs\u00105R\u001d\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010)03¢\u0006\b\n\u0000\u001a\u0004\bu\u00105¨\u0006´\u0001"}, d2 = {"Lcom/blackhub/bronline/game/gui/inventory/viewmodel/InventoryAndExchangeViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "actionWithJSONArray", "Lcom/blackhub/bronline/game/gui/inventory/MigrateItemsFromAny;", "mutableBlockStatus", "Landroidx/lifecycle/MutableLiveData;", "", "mutableCurrentWeight", "", "mutableExchangeStatus", "mutableHungerParameter", "mutableInvItems", "", "Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", "mutableItemFromSlot", "mutableMaxWeight", "mutableMediatorInvItemsAndSize", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/blackhub/bronline/game/gui/inventory/data/InvSizeAndItemsObj;", "mutableMyExchangeItemPos", "mutableMyExchangeItems", "mutableMyMoney", "mutableNewInvPosition", "mutableNewMessage", "Lcom/blackhub/bronline/game/gui/inventory/data/InvMessageObj;", "mutableNewSlotPosition", "mutableOldInvPosition", "mutableOldPosFromInv", "mutableOtherExchangeItemPos", "mutableOtherExchangeItems", "mutableOtherMoney", "mutableOtherPlayersNick", "", "mutablePlayersId", "mutablePlayersLevel", "mutablePlayersNick", "mutableReturnToTheOldValueOfMoney", "mutableSaveTheOldValueOfMoney", "mutableSavedInitPosInInv", "mutableSkinItems", "", "Lcom/blackhub/bronline/game/model/remote/response/skins/SkinsDTO;", "mutableSkinModelId", "mutableSlotItems", "mutableSlotsInInventory", "mutableTypeInterface", "mutableVIPStatus", "mutableVehicleItems", "Lcom/blackhub/bronline/game/model/remote/response/vehicles/VehiclesDTO;", "newBlockStatus", "Landroidx/lifecycle/LiveData;", "getNewBlockStatus", "()Landroidx/lifecycle/LiveData;", "newCurrentWeight", "getNewCurrentWeight", "newExchangeStatus", "getNewExchangeStatus", "newHungerParameter", "getNewHungerParameter", "newInvItems", "getNewInvItems", "newItemFromSlot", "getNewItemFromSlot", "newMaxWeight", "getNewMaxWeight", "newMediatorInvItemsAndSize", "getNewMediatorInvItemsAndSize", "newMyExchangeItemPos", "getNewMyExchangeItemPos", "newMyExchangeItems", "getNewMyExchangeItems", "newMyMoney", "getNewMyMoney", "newNewInvPosition", "getNewNewInvPosition", "newNewMessage", "getNewNewMessage", "newNewSlotPosition", "getNewNewSlotPosition", "newOldInvPosition", "getNewOldInvPosition", "newOldPosFromInv", "getNewOldPosFromInv", "newOtherExchangeItemPos", "getNewOtherExchangeItemPos", "newOtherExchangeItems", "getNewOtherExchangeItems", "newOtherMoney", "getNewOtherMoney", "newOtherPlayersNick", "getNewOtherPlayersNick", "newPlayersId", "getNewPlayersId", "newPlayersLevel", "getNewPlayersLevel", "newPlayersNick", "getNewPlayersNick", "newSavedInitPosInInv", "getNewSavedInitPosInInv", "newSkinModelId", "getNewSkinModelId", "newSlotItems", "getNewSlotItems", "newSlotsInInventory", "getNewSlotsInInventory", "newTypeInterface", "getNewTypeInterface", "newVIPStatus", "getNewVIPStatus", "returnToTheOldValueOfMoney", "getReturnToTheOldValueOfMoney", "saveTheOldValueOfMoney", "getSaveTheOldValueOfMoney", "skinItems", "getSkinItems", "vehicleItems", "getVehicleItems", "addNewOtherItem", "", "newItemId", "newItemValue", "newPlateNumber", "allItemsFromJSON", "initInvItems", "playersItemsInInventoryArray", "Lorg/json/JSONArray;", "sizeActiveSlots", "initMyExchangeItems", "inventorySize", "initOtherExchangeItems", "initSavedPos", "allItems", "initSlotItems", "itemsInSlotArray", "simCardNumber", "migrateItem", "newPosition", "oldPosition", "migrateItemFromExchangeToInv", "posFromExchange", "migrateValue", "migrateItemFromInvToExchange", "itemPos", "itemValue", "migrateItemFromInvToSlot", "posFromInv", "posInSlot", "migrateItemFromSlotToInv", "posFromSlot", "newPosInInv", "setBlockStatus", "newStatus", "setCurrentWeight", "setHungerParameter", "setInitState", "setMaxWeight", "setMyMoney", "setNewMessage", "newMessage", "setOtherMoney", "(Ljava/lang/Integer;)V", "setOtherPlayersNick", "setPlayersId", "setPlayersLevel", "setPlayersNick", "setSkinModelId", "newModelId", "setSkins", "skinsList", "setTypeInterface", "setVIPStatus", "subtractionOtherItem", "itemId", "subItemValue", "oldPlateNumber", "updateActiveSlots", "updateExchangeStatus", "useOrDeleteTheItem", "currentPosition", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InventoryAndExchangeViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final MigrateItemsFromAny actionWithJSONArray = new MigrateItemsFromAny();

    @NotNull
    public final MutableLiveData<Boolean> mutableBlockStatus;

    @NotNull
    public final MutableLiveData<Integer> mutableCurrentWeight;

    @NotNull
    public final MutableLiveData<Integer> mutableExchangeStatus;

    @NotNull
    public final MutableLiveData<Integer> mutableHungerParameter;

    @NotNull
    public final MutableLiveData<List<InvItems>> mutableInvItems;

    @NotNull
    public final MutableLiveData<InvItems> mutableItemFromSlot;

    @NotNull
    public final MutableLiveData<Integer> mutableMaxWeight;

    @NotNull
    public final MediatorLiveData<InvSizeAndItemsObj> mutableMediatorInvItemsAndSize;

    @NotNull
    public final MutableLiveData<Integer> mutableMyExchangeItemPos;

    @NotNull
    public final MutableLiveData<List<InvItems>> mutableMyExchangeItems;

    @NotNull
    public final MutableLiveData<Integer> mutableMyMoney;

    @NotNull
    public final MutableLiveData<Integer> mutableNewInvPosition;

    @NotNull
    public final MutableLiveData<InvMessageObj> mutableNewMessage;

    @NotNull
    public final MutableLiveData<Integer> mutableNewSlotPosition;

    @NotNull
    public final MutableLiveData<Integer> mutableOldInvPosition;

    @NotNull
    public final MutableLiveData<List<Integer>> mutableOldPosFromInv;

    @NotNull
    public final MutableLiveData<Integer> mutableOtherExchangeItemPos;

    @NotNull
    public final MutableLiveData<List<InvItems>> mutableOtherExchangeItems;

    @NotNull
    public final MutableLiveData<Integer> mutableOtherMoney;

    @NotNull
    public final MutableLiveData<String> mutableOtherPlayersNick;

    @NotNull
    public final MutableLiveData<Integer> mutablePlayersId;

    @NotNull
    public final MutableLiveData<Integer> mutablePlayersLevel;

    @NotNull
    public final MutableLiveData<String> mutablePlayersNick;

    @NotNull
    public final MutableLiveData<Boolean> mutableReturnToTheOldValueOfMoney;

    @NotNull
    public final MutableLiveData<Boolean> mutableSaveTheOldValueOfMoney;

    @NotNull
    public final MutableLiveData<List<Integer>> mutableSavedInitPosInInv;

    @NotNull
    public final MutableLiveData<List<SkinsDTO>> mutableSkinItems;

    @NotNull
    public final MutableLiveData<Integer> mutableSkinModelId;

    @NotNull
    public final MutableLiveData<List<InvItems>> mutableSlotItems;

    @NotNull
    public final MutableLiveData<List<Integer>> mutableSlotsInInventory;

    @NotNull
    public final MutableLiveData<Integer> mutableTypeInterface;

    @NotNull
    public final MutableLiveData<Integer> mutableVIPStatus;

    @NotNull
    public final MutableLiveData<List<VehiclesDTO>> mutableVehicleItems;

    @NotNull
    public final LiveData<Boolean> newBlockStatus;

    @NotNull
    public final LiveData<Integer> newCurrentWeight;

    @NotNull
    public final LiveData<Integer> newExchangeStatus;

    @NotNull
    public final LiveData<Integer> newHungerParameter;

    @NotNull
    public final LiveData<List<InvItems>> newInvItems;

    @NotNull
    public final LiveData<InvItems> newItemFromSlot;

    @NotNull
    public final LiveData<Integer> newMaxWeight;

    @NotNull
    public final LiveData<InvSizeAndItemsObj> newMediatorInvItemsAndSize;

    @NotNull
    public final LiveData<Integer> newMyExchangeItemPos;

    @NotNull
    public final LiveData<List<InvItems>> newMyExchangeItems;

    @NotNull
    public final LiveData<Integer> newMyMoney;

    @NotNull
    public final LiveData<Integer> newNewInvPosition;

    @NotNull
    public final LiveData<InvMessageObj> newNewMessage;

    @NotNull
    public final LiveData<Integer> newNewSlotPosition;

    @NotNull
    public final LiveData<Integer> newOldInvPosition;

    @NotNull
    public final LiveData<List<Integer>> newOldPosFromInv;

    @NotNull
    public final LiveData<Integer> newOtherExchangeItemPos;

    @NotNull
    public final LiveData<List<InvItems>> newOtherExchangeItems;

    @NotNull
    public final LiveData<Integer> newOtherMoney;

    @NotNull
    public final LiveData<String> newOtherPlayersNick;

    @NotNull
    public final LiveData<Integer> newPlayersId;

    @NotNull
    public final LiveData<Integer> newPlayersLevel;

    @NotNull
    public final LiveData<String> newPlayersNick;

    @NotNull
    public final LiveData<List<Integer>> newSavedInitPosInInv;

    @NotNull
    public final LiveData<Integer> newSkinModelId;

    @NotNull
    public final LiveData<List<InvItems>> newSlotItems;

    @NotNull
    public final LiveData<List<Integer>> newSlotsInInventory;

    @NotNull
    public final LiveData<Integer> newTypeInterface;

    @NotNull
    public final LiveData<Integer> newVIPStatus;

    @NotNull
    public final LiveData<Boolean> returnToTheOldValueOfMoney;

    @NotNull
    public final LiveData<Boolean> saveTheOldValueOfMoney;

    @NotNull
    public final LiveData<List<SkinsDTO>> skinItems;

    @NotNull
    public final LiveData<List<VehiclesDTO>> vehicleItems;

    public InventoryAndExchangeViewModel() {
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.mutableTypeInterface = mutableLiveData;
        this.newTypeInterface = mutableLiveData;
        MutableLiveData<String> mutableLiveData2 = new MutableLiveData<>();
        this.mutablePlayersNick = mutableLiveData2;
        this.newPlayersNick = mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3 = new MutableLiveData<>();
        this.mutablePlayersLevel = mutableLiveData3;
        this.newPlayersLevel = mutableLiveData3;
        MutableLiveData<Integer> mutableLiveData4 = new MutableLiveData<>();
        this.mutablePlayersId = mutableLiveData4;
        this.newPlayersId = mutableLiveData4;
        MutableLiveData<Integer> mutableLiveData5 = new MutableLiveData<>();
        this.mutableCurrentWeight = mutableLiveData5;
        this.newCurrentWeight = mutableLiveData5;
        MutableLiveData<Integer> mutableLiveData6 = new MutableLiveData<>();
        this.mutableMaxWeight = mutableLiveData6;
        this.newMaxWeight = mutableLiveData6;
        MutableLiveData<Integer> mutableLiveData7 = new MutableLiveData<>();
        this.mutableHungerParameter = mutableLiveData7;
        this.newHungerParameter = mutableLiveData7;
        MutableLiveData<Integer> mutableLiveData8 = new MutableLiveData<>();
        this.mutableVIPStatus = mutableLiveData8;
        this.newVIPStatus = mutableLiveData8;
        MutableLiveData<List<Integer>> mutableLiveData9 = new MutableLiveData<>();
        this.mutableSlotsInInventory = mutableLiveData9;
        this.newSlotsInInventory = mutableLiveData9;
        MutableLiveData<List<InvItems>> mutableLiveData10 = new MutableLiveData<>();
        this.mutableInvItems = mutableLiveData10;
        this.newInvItems = mutableLiveData10;
        MediatorLiveData<InvSizeAndItemsObj> mediatorLiveData = new MediatorLiveData<>();
        this.mutableMediatorInvItemsAndSize = mediatorLiveData;
        this.newMediatorInvItemsAndSize = mediatorLiveData;
        MutableLiveData<List<InvItems>> mutableLiveData11 = new MutableLiveData<>();
        this.mutableSlotItems = mutableLiveData11;
        this.newSlotItems = mutableLiveData11;
        MutableLiveData<Integer> mutableLiveData12 = new MutableLiveData<>();
        this.mutableSkinModelId = mutableLiveData12;
        this.newSkinModelId = mutableLiveData12;
        MutableLiveData<Integer> mutableLiveData13 = new MutableLiveData<>();
        this.mutableOldInvPosition = mutableLiveData13;
        this.newOldInvPosition = mutableLiveData13;
        MutableLiveData<Integer> mutableLiveData14 = new MutableLiveData<>();
        this.mutableNewInvPosition = mutableLiveData14;
        this.newNewInvPosition = mutableLiveData14;
        MutableLiveData<Integer> mutableLiveData15 = new MutableLiveData<>();
        this.mutableNewSlotPosition = mutableLiveData15;
        this.newNewSlotPosition = mutableLiveData15;
        MutableLiveData<Integer> mutableLiveData16 = new MutableLiveData<>();
        this.mutableMyMoney = mutableLiveData16;
        this.newMyMoney = mutableLiveData16;
        MutableLiveData<String> mutableLiveData17 = new MutableLiveData<>();
        this.mutableOtherPlayersNick = mutableLiveData17;
        this.newOtherPlayersNick = mutableLiveData17;
        MutableLiveData<List<InvItems>> mutableLiveData18 = new MutableLiveData<>();
        this.mutableMyExchangeItems = mutableLiveData18;
        this.newMyExchangeItems = mutableLiveData18;
        MutableLiveData<List<InvItems>> mutableLiveData19 = new MutableLiveData<>();
        this.mutableOtherExchangeItems = mutableLiveData19;
        this.newOtherExchangeItems = mutableLiveData19;
        MutableLiveData<Integer> mutableLiveData20 = new MutableLiveData<>();
        this.mutableOtherExchangeItemPos = mutableLiveData20;
        this.newOtherExchangeItemPos = mutableLiveData20;
        MutableLiveData<Integer> mutableLiveData21 = new MutableLiveData<>();
        this.mutableOtherMoney = mutableLiveData21;
        this.newOtherMoney = mutableLiveData21;
        MutableLiveData<InvMessageObj> mutableLiveData22 = new MutableLiveData<>();
        this.mutableNewMessage = mutableLiveData22;
        this.newNewMessage = mutableLiveData22;
        MutableLiveData<List<Integer>> mutableLiveData23 = new MutableLiveData<>();
        this.mutableOldPosFromInv = mutableLiveData23;
        this.newOldPosFromInv = mutableLiveData23;
        MutableLiveData<List<Integer>> mutableLiveData24 = new MutableLiveData<>();
        this.mutableSavedInitPosInInv = mutableLiveData24;
        this.newSavedInitPosInInv = mutableLiveData24;
        MutableLiveData<Integer> mutableLiveData25 = new MutableLiveData<>();
        this.mutableMyExchangeItemPos = mutableLiveData25;
        this.newMyExchangeItemPos = mutableLiveData25;
        MutableLiveData<InvItems> mutableLiveData26 = new MutableLiveData<>();
        this.mutableItemFromSlot = mutableLiveData26;
        this.newItemFromSlot = mutableLiveData26;
        MutableLiveData<Integer> mutableLiveData27 = new MutableLiveData<>();
        this.mutableExchangeStatus = mutableLiveData27;
        this.newExchangeStatus = mutableLiveData27;
        MutableLiveData<Boolean> mutableLiveData28 = new MutableLiveData<>();
        this.mutableBlockStatus = mutableLiveData28;
        this.newBlockStatus = mutableLiveData28;
        Boolean bool = Boolean.FALSE;
        MutableLiveData<Boolean> mutableLiveData29 = new MutableLiveData<>(bool);
        this.mutableReturnToTheOldValueOfMoney = mutableLiveData29;
        this.returnToTheOldValueOfMoney = mutableLiveData29;
        MutableLiveData<Boolean> mutableLiveData30 = new MutableLiveData<>(bool);
        this.mutableSaveTheOldValueOfMoney = mutableLiveData30;
        this.saveTheOldValueOfMoney = mutableLiveData30;
        MutableLiveData<List<VehiclesDTO>> mutableLiveData31 = new MutableLiveData<>();
        this.mutableVehicleItems = mutableLiveData31;
        this.vehicleItems = mutableLiveData31;
        MutableLiveData<List<SkinsDTO>> mutableLiveData32 = new MutableLiveData<>();
        this.mutableSkinItems = mutableLiveData32;
        this.skinItems = mutableLiveData32;
        try {
            mediatorLiveData.addSource(mutableLiveData9, new InventoryAndExchangeViewModel$sam$androidx_lifecycle_Observer$0(new Function1<List<Integer>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<Integer> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<Integer> list) {
                    InvSizeAndItemsObj invSizeAndItemsObj = (InvSizeAndItemsObj) InventoryAndExchangeViewModel.this.mutableMediatorInvItemsAndSize.getValue();
                    if (invSizeAndItemsObj == null) {
                        invSizeAndItemsObj = new InvSizeAndItemsObj(null, null);
                    }
                    invSizeAndItemsObj.setSizeActiveSlots(list.get(0));
                    InventoryAndExchangeViewModel.this.mutableMediatorInvItemsAndSize.setValue(invSizeAndItemsObj);
                }
            }));
            mediatorLiveData.addSource(mutableLiveData10, new InventoryAndExchangeViewModel$sam$androidx_lifecycle_Observer$0(new Function1<List<InvItems>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel.2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<InvItems> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<InvItems> list) {
                    InvSizeAndItemsObj invSizeAndItemsObj = (InvSizeAndItemsObj) InventoryAndExchangeViewModel.this.mutableMediatorInvItemsAndSize.getValue();
                    if (invSizeAndItemsObj == null) {
                        invSizeAndItemsObj = new InvSizeAndItemsObj(null, null);
                    }
                    invSizeAndItemsObj.setItemsList(list);
                    InventoryAndExchangeViewModel.this.mutableMediatorInvItemsAndSize.setValue(invSizeAndItemsObj);
                }
            }));
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    @NotNull
    public final LiveData<Integer> getNewTypeInterface() {
        return this.newTypeInterface;
    }

    @NotNull
    public final LiveData<String> getNewPlayersNick() {
        return this.newPlayersNick;
    }

    @NotNull
    public final LiveData<Integer> getNewPlayersLevel() {
        return this.newPlayersLevel;
    }

    @NotNull
    public final LiveData<Integer> getNewPlayersId() {
        return this.newPlayersId;
    }

    @NotNull
    public final LiveData<Integer> getNewCurrentWeight() {
        return this.newCurrentWeight;
    }

    @NotNull
    public final LiveData<Integer> getNewMaxWeight() {
        return this.newMaxWeight;
    }

    @NotNull
    public final LiveData<Integer> getNewHungerParameter() {
        return this.newHungerParameter;
    }

    @NotNull
    public final LiveData<Integer> getNewVIPStatus() {
        return this.newVIPStatus;
    }

    @NotNull
    public final LiveData<List<Integer>> getNewSlotsInInventory() {
        return this.newSlotsInInventory;
    }

    @NotNull
    public final LiveData<List<InvItems>> getNewInvItems() {
        return this.newInvItems;
    }

    @NotNull
    public final LiveData<InvSizeAndItemsObj> getNewMediatorInvItemsAndSize() {
        return this.newMediatorInvItemsAndSize;
    }

    @NotNull
    public final LiveData<List<InvItems>> getNewSlotItems() {
        return this.newSlotItems;
    }

    @NotNull
    public final LiveData<Integer> getNewSkinModelId() {
        return this.newSkinModelId;
    }

    @NotNull
    public final LiveData<Integer> getNewOldInvPosition() {
        return this.newOldInvPosition;
    }

    @NotNull
    public final LiveData<Integer> getNewNewInvPosition() {
        return this.newNewInvPosition;
    }

    @NotNull
    public final LiveData<Integer> getNewNewSlotPosition() {
        return this.newNewSlotPosition;
    }

    @NotNull
    public final LiveData<Integer> getNewMyMoney() {
        return this.newMyMoney;
    }

    @NotNull
    public final LiveData<String> getNewOtherPlayersNick() {
        return this.newOtherPlayersNick;
    }

    @NotNull
    public final LiveData<List<InvItems>> getNewMyExchangeItems() {
        return this.newMyExchangeItems;
    }

    @NotNull
    public final LiveData<List<InvItems>> getNewOtherExchangeItems() {
        return this.newOtherExchangeItems;
    }

    @NotNull
    public final LiveData<Integer> getNewOtherExchangeItemPos() {
        return this.newOtherExchangeItemPos;
    }

    @NotNull
    public final LiveData<Integer> getNewOtherMoney() {
        return this.newOtherMoney;
    }

    @NotNull
    public final LiveData<InvMessageObj> getNewNewMessage() {
        return this.newNewMessage;
    }

    @NotNull
    public final LiveData<List<Integer>> getNewOldPosFromInv() {
        return this.newOldPosFromInv;
    }

    @NotNull
    public final LiveData<List<Integer>> getNewSavedInitPosInInv() {
        return this.newSavedInitPosInInv;
    }

    @NotNull
    public final LiveData<Integer> getNewMyExchangeItemPos() {
        return this.newMyExchangeItemPos;
    }

    @NotNull
    public final LiveData<InvItems> getNewItemFromSlot() {
        return this.newItemFromSlot;
    }

    @NotNull
    public final LiveData<Integer> getNewExchangeStatus() {
        return this.newExchangeStatus;
    }

    @NotNull
    public final LiveData<Boolean> getNewBlockStatus() {
        return this.newBlockStatus;
    }

    @NotNull
    public final LiveData<Boolean> getReturnToTheOldValueOfMoney() {
        return this.returnToTheOldValueOfMoney;
    }

    @NotNull
    public final LiveData<Boolean> getSaveTheOldValueOfMoney() {
        return this.saveTheOldValueOfMoney;
    }

    @NotNull
    public final LiveData<List<VehiclesDTO>> getVehicleItems() {
        return this.vehicleItems;
    }

    @NotNull
    public final LiveData<List<SkinsDTO>> getSkinItems() {
        return this.skinItems;
    }

    public final void setTypeInterface(int newTypeInterface) {
        this.mutableTypeInterface.postValue(Integer.valueOf(newTypeInterface));
    }

    public final void setPlayersNick(@NotNull String newPlayersNick) {
        Intrinsics.checkNotNullParameter(newPlayersNick, "newPlayersNick");
        this.mutablePlayersNick.postValue(newPlayersNick);
    }

    public final void setPlayersLevel(int newPlayersLevel) {
        this.mutablePlayersLevel.postValue(Integer.valueOf(newPlayersLevel));
    }

    public final void setPlayersId(int newPlayersId) {
        this.mutablePlayersId.postValue(Integer.valueOf(newPlayersId));
    }

    public final void setCurrentWeight(int newCurrentWeight) {
        this.mutableCurrentWeight.postValue(Integer.valueOf(newCurrentWeight));
    }

    public final void setMaxWeight(int newMaxWeight) {
        this.mutableMaxWeight.postValue(Integer.valueOf(newMaxWeight));
    }

    public final void setHungerParameter(int newHungerParameter) {
        this.mutableHungerParameter.postValue(Integer.valueOf(newHungerParameter));
    }

    public final void setVIPStatus(int newVIPStatus) {
        this.mutableVIPStatus.postValue(Integer.valueOf(newVIPStatus));
    }

    public final void updateActiveSlots(int sizeActiveSlots) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new InventoryAndExchangeViewModel$updateActiveSlots$1(this, sizeActiveSlots, null), 2, null);
    }

    public final void initInvItems(@Nullable JSONArray playersItemsInInventoryArray, @NotNull List<InvItems> allItemsFromJSON, int sizeActiveSlots) {
        Intrinsics.checkNotNullParameter(allItemsFromJSON, "allItemsFromJSON");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new InventoryAndExchangeViewModel$initInvItems$1(this, playersItemsInInventoryArray, allItemsFromJSON, sizeActiveSlots, null), 2, null);
    }

    public final void initSavedPos(@NotNull List<InvItems> allItems) {
        Intrinsics.checkNotNullParameter(allItems, "allItems");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new InventoryAndExchangeViewModel$initSavedPos$1(allItems, this, null), 2, null);
    }

    public final void initSlotItems(@Nullable JSONArray itemsInSlotArray, @NotNull List<InvItems> allItemsFromJSON, int simCardNumber) {
        Intrinsics.checkNotNullParameter(allItemsFromJSON, "allItemsFromJSON");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new InventoryAndExchangeViewModel$initSlotItems$1(this, itemsInSlotArray, allItemsFromJSON, simCardNumber, null), 2, null);
    }

    public final void setSkinModelId(int newModelId) {
        this.mutableSkinModelId.postValue(Integer.valueOf(newModelId));
    }

    public final void migrateItem(int newPosition, int oldPosition) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new InventoryAndExchangeViewModel$migrateItem$1(this, newPosition, oldPosition, null), 2, null);
    }

    public final void useOrDeleteTheItem(int currentPosition) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new InventoryAndExchangeViewModel$useOrDeleteTheItem$1(this, currentPosition, null), 2, null);
    }

    public final void migrateItemFromSlotToInv(int posFromSlot, int newPosInInv) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new InventoryAndExchangeViewModel$migrateItemFromSlotToInv$1(this, newPosInInv, posFromSlot, null), 2, null);
    }

    public final void migrateItemFromInvToSlot(int posFromInv, int posInSlot) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new InventoryAndExchangeViewModel$migrateItemFromInvToSlot$1(this, posInSlot, posFromInv, null), 2, null);
    }

    public final void setMyMoney(int newMyMoney) {
        this.mutableMyMoney.postValue(Integer.valueOf(newMyMoney));
    }

    public final void setOtherPlayersNick(@Nullable String newOtherPlayersNick) {
        this.mutableOtherPlayersNick.postValue(newOtherPlayersNick);
    }

    public final void initMyExchangeItems(int inventorySize) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new InventoryAndExchangeViewModel$initMyExchangeItems$1(inventorySize, this, null), 2, null);
    }

    public final void initOtherExchangeItems(int inventorySize) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new InventoryAndExchangeViewModel$initOtherExchangeItems$1(inventorySize, this, null), 2, null);
    }

    public final void setOtherMoney(@Nullable Integer newOtherMoney) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new InventoryAndExchangeViewModel$setOtherMoney$1(this, newOtherMoney, null), 2, null);
    }

    public final void addNewOtherItem(int newItemId, int newItemValue, @Nullable String newPlateNumber, @NotNull List<InvItems> allItemsFromJSON) {
        Intrinsics.checkNotNullParameter(allItemsFromJSON, "allItemsFromJSON");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new InventoryAndExchangeViewModel$addNewOtherItem$1(this, newPlateNumber, allItemsFromJSON, newItemId, newItemValue, null), 2, null);
    }

    public final void subtractionOtherItem(int itemId, int subItemValue, @Nullable String oldPlateNumber) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new InventoryAndExchangeViewModel$subtractionOtherItem$1(this, oldPlateNumber, itemId, subItemValue, null), 2, null);
    }

    public final void migrateItemFromInvToExchange(int itemPos, int itemValue) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new InventoryAndExchangeViewModel$migrateItemFromInvToExchange$1(this, itemPos, itemValue, null), 2, null);
    }

    public final void migrateItemFromExchangeToInv(int posFromExchange, int migrateValue) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new InventoryAndExchangeViewModel$migrateItemFromExchangeToInv$1(this, posFromExchange, migrateValue, null), 2, null);
    }

    public final void updateExchangeStatus(int newExchangeStatus) {
        this.mutableExchangeStatus.postValue(Integer.valueOf(newExchangeStatus));
    }

    public final void setBlockStatus(boolean newStatus) {
        this.mutableBlockStatus.setValue(Boolean.valueOf(newStatus));
    }

    public final void setInitState() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new InventoryAndExchangeViewModel$setInitState$1(this, null), 2, null);
    }

    public final void setNewMessage(@NotNull InvMessageObj newMessage) {
        Intrinsics.checkNotNullParameter(newMessage, "newMessage");
        this.mutableNewMessage.postValue(newMessage);
    }

    public final void returnToTheOldValueOfMoney() {
        this.mutableReturnToTheOldValueOfMoney.setValue(Boolean.TRUE);
    }

    public final void saveTheOldValueOfMoney() {
        this.mutableSaveTheOldValueOfMoney.setValue(Boolean.TRUE);
    }

    public final void setSkins(@NotNull List<SkinsDTO> skinsList) {
        Intrinsics.checkNotNullParameter(skinsList, "skinsList");
        this.mutableSkinItems.setValue(skinsList);
    }
}
