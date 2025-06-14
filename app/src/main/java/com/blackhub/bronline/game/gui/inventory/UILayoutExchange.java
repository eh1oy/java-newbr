package com.blackhub.bronline.game.gui.inventory;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.InventoryLayoutExchangeWithUserBinding;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.common.UILayout;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.blackhub.bronline.game.gui.inventory.adapters.InventoryExchangeAndTrunkAdapter;
import com.blackhub.bronline.game.gui.inventory.adapters.InventoryItemsInSlotAdapter;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.gui.inventory.data.InvMessageObj;
import com.blackhub.bronline.game.gui.inventory.data.InvSizeAndItemsObj;
import com.blackhub.bronline.game.gui.inventory.network.CarTrunkOrClosetActionsWithJSON;
import com.blackhub.bronline.game.gui.inventory.network.InvActionWithJSON;
import com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel;
import com.blackhub.bronline.game.gui.playerslist.utils.PlayersListUtilsKt;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UILayoutExchange.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007¢\u0006\u0002\u0010\nJ\u0010\u0010f\u001a\u00020\u00172\u0006\u0010g\u001a\u00020\u000eH\u0002J\u0016\u0010h\u001a\u00020\u00172\f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u001f0JH\u0002J\u0006\u0010j\u001a\u00020\u0017J\u0006\u0010k\u001a\u00020\u0017J\b\u0010l\u001a\u00020\u0017H\u0002J\b\u0010m\u001a\u00020\u0017H\u0002J\b\u0010n\u001a\u00020\u0017H\u0002J\b\u0010o\u001a\u00020\u0017H\u0002J\n\u0010p\u001a\u0004\u0018\u00010qH\u0016J\b\u0010r\u001a\u00020\u0017H\u0002J\b\u0010s\u001a\u00020\u0017H\u0002J\b\u0010t\u001a\u00020\u0017H\u0002J\b\u0010u\u001a\u00020\u0017H\u0002J\b\u0010v\u001a\u00020\u0017H\u0002J\b\u0010w\u001a\u00020\u0017H\u0002J\b\u0010x\u001a\u00020\u0017H\u0002J\b\u0010y\u001a\u00020\u0017H\u0002J\b\u0010z\u001a\u00020\u0017H\u0002J\u0006\u0010{\u001a\u00020\u0017J\u0006\u0010|\u001a\u00020\u0017J\b\u0010}\u001a\u00020\u0017H\u0002J\u0006\u0010~\u001a\u00020\u0017J\b\u0010\u007f\u001a\u00020\u0017H\u0002J\t\u0010\u0080\u0001\u001a\u00020\u0017H\u0002J!\u0010\u0081\u0001\u001a\u0004\u0018\u00010q2\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\n\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0085\u0001H\u0016J\t\u0010\u0086\u0001\u001a\u00020\u0017H\u0016J\t\u0010\u0087\u0001\u001a\u00020\u0017H\u0016J\u0007\u0010\u0088\u0001\u001a\u00020\u0017J\t\u0010\u0089\u0001\u001a\u00020\u0017H\u0002J\t\u0010\u008a\u0001\u001a\u00020\u0017H\u0002J\t\u0010\u008b\u0001\u001a\u00020\u0017H\u0002J\t\u0010\u008c\u0001\u001a\u00020\u0017H\u0002J\t\u0010\u008d\u0001\u001a\u00020\u0017H\u0002J\t\u0010\u008e\u0001\u001a\u00020\u0017H\u0002J\u0012\u0010\u008f\u0001\u001a\u00020\u00172\u0007\u0010\u0090\u0001\u001a\u00020\u000eH\u0002J\u0012\u0010\u0091\u0001\u001a\u00020\u00172\u0007\u0010\u0092\u0001\u001a\u00020\u0011H\u0002J\u0012\u0010\u0093\u0001\u001a\u00020\u00172\u0007\u0010\u0094\u0001\u001a\u00020\u0011H\u0002J\u0007\u0010\u0095\u0001\u001a\u00020\u0017J\t\u0010\u0096\u0001\u001a\u00020\u0017H\u0002J\u001a\u0010\u0097\u0001\u001a\u00020\u00172\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0003\u0010\u0098\u0001J\u0014\u0010\u0099\u0001\u001a\u00020\u00172\t\u0010\u009a\u0001\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\u009b\u0001\u001a\u00020\u00172\u0007\u0010\u0092\u0001\u001a\u00020\u0011H\u0002J\u0012\u0010\u009c\u0001\u001a\u00020\u00172\u0007\u0010\u009d\u0001\u001a\u00020\u0011H\u0002J\t\u0010\u009e\u0001\u001a\u00020\u0017H\u0002J\u0010\u0010\u009f\u0001\u001a\u00020\u00172\u0007\u0010 \u0001\u001a\u00020\u0011J\u0010\u0010¡\u0001\u001a\u00020\u00172\u0007\u0010¢\u0001\u001a\u00020\u0011J\u0013\u0010£\u0001\u001a\u00020\u00172\b\u0010¤\u0001\u001a\u00030¥\u0001H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R[\u0010\u000f\u001aO\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0010j\u0004\u0018\u0001`\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000RF\u0010\u001d\u001a:\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001ej\u0004\u0018\u0001`\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u00105\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b6\u00107R\u001b\u0010:\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b;\u00107R\u001b\u0010=\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00109\u001a\u0004\b>\u00107R\u001b\u0010@\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u00109\u001a\u0004\bA\u00107R\u001b\u0010C\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u00109\u001a\u0004\bD\u00107R\u000e\u0010F\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00110JX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020LX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020LX\u0082\u000e¢\u0006\u0002\n\u0000RF\u0010N\u001a:\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001ej\u0004\u0018\u0001`\"X\u0082\u000e¢\u0006\u0002\n\u0000RF\u0010O\u001a:\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001ej\u0004\u0018\u0001`\"X\u0082\u000e¢\u0006\u0002\n\u0000RF\u0010P\u001a:\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001ej\u0004\u0018\u0001`\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010Q\u001a\u0004\u0018\u00010RX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00110JX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010^\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010_\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010d\u001a\u0004\u0018\u00010RX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010e\u001a\u0004\u0018\u00010RX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006¦\u0001"}, d2 = {"Lcom/blackhub/bronline/game/gui/inventory/UILayoutExchange;", "Lcom/blackhub/bronline/game/common/UILayout;", "mainRoot", "Lcom/blackhub/bronline/game/gui/inventory/GUIUsersInventory;", "inventoryAndExchangeViewModel", "Lcom/blackhub/bronline/game/gui/inventory/viewmodel/InventoryAndExchangeViewModel;", "itemRender", "Landroidx/collection/ArrayMap;", "", "Landroid/graphics/Bitmap;", "(Lcom/blackhub/bronline/game/gui/inventory/GUIUsersInventory;Lcom/blackhub/bronline/game/gui/inventory/viewmodel/InventoryAndExchangeViewModel;Landroidx/collection/ArrayMap;)V", "binding", "Lcom/blackhub/bronline/databinding/InventoryLayoutExchangeWithUserBinding;", "blockStatus", "", "clickListenerDialogForMigrateItems", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "migrateValue", "action", "applyAction", "", "Lcom/blackhub/bronline/game/gui/inventory/NewActionListenerFromDialogApply;", "dialogChat", "Lcom/blackhub/bronline/game/gui/inventory/UIChat;", "dialogForMigrateItem", "Lcom/blackhub/bronline/game/gui/inventory/NewDialogForMigrateItems;", "emptyClickListener", "Lkotlin/Function2;", "Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", "item", "position", "Lcom/blackhub/bronline/game/gui/inventory/OnItemsClickListener;", "exchangeStatus", "exchangeYourMoney", "idFromExchange", "idFromInv", "idFromSlot", "ifFirstShow", "ifFirstShowOrClearMyExchangeItems", "ifFirstShowOrClearOtherExchangeItems", "initInvSize", "intermediatePositionFromSlot", "intermediatePositionWithExchangeItem", "intermediatePositionWithItem", "isFirstShowInv", "isFirstShowSlot", "itemInExchange", "itemInInv", "itemsInSlotAdapter", "Lcom/blackhub/bronline/game/gui/inventory/adapters/InventoryItemsInSlotAdapter;", "messageCantExchangeMoreMoney", "getMessageCantExchangeMoreMoney", "()Ljava/lang/String;", "messageCantExchangeMoreMoney$delegate", "Lkotlin/Lazy;", "messageCantTakeOffClothes", "getMessageCantTakeOffClothes", "messageCantTakeOffClothes$delegate", "messageChangeField", "getMessageChangeField", "messageChangeField$delegate", "messageErrorFromRes", "getMessageErrorFromRes", "messageErrorFromRes$delegate", "messageNotEnoughMoney", "getMessageNotEnoughMoney", "messageNotEnoughMoney$delegate", "modelIdFromExchange", "modelIdFromInv", "modelIdFromSlot", "myInitInvItemsPos", "", "oldTimeAfterCheck", "", "oldTimeWithMigrate", "onItemsInSlotClickListener", "onYourExchangeItemsClickListener", "onYourItemsClickListener", "otherPlayersItemsAndTrunkAdapter", "Lcom/blackhub/bronline/game/gui/inventory/adapters/InventoryExchangeAndTrunkAdapter;", "positionFromSlot", "positionWithExchangeItem", "positionWithItem", "saveExchangeYourMoney", "savedPosInInv", "sendCounter", "setInitState", "simCardNumberFromExchange", "simCardNumberFromInv", "startThisWeight", "statusViewExchange", "textIsFromOtherPlayer", "textIsFromYou", "valueFromExchange", "valueFromInv", "valueFromSlot", "yourAllMoney", "yourExchangeItemsAndTrunkAdapter", "yourItemsAndTrunkAdapter", "changeButtonAndHelpInfo", "isBothApply", "changeStatusWhoseItem", "myList", "clearInfoAboutExchange", "clearInfoAboutInv", "clearInfoAboutSlot", "clearMyInterface", "closeChat", "closePopupWindows", "getView", "Landroid/view/View;", "initDataExchangeItemsInView", "initDataInSlotsView", "initDataYourItemsInView", "initDialogForMigrateItems", "initForEmptyClickListener", "initLogicForDialogMigrateItems", "initSlotClickListener", "initYourExchangeItemsClickListener", "initYourItemsClickListener", "migrateFromExchangeToInv", "migrateFromSlotToInventory", "migrateItemFromExchange", "migrateItemFromInvToExchange", "migrateItemFromInventory", "migrateItemFromSlotToInventory", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onLayoutClose", "onLayoutShown", "removeFocusableForEditText", "removeObservers", "returnToTheOldValueOfMoney", "saveTheOldValueOfMoney", "setClearClickInLists", "setDefaultParams", "setEmptyListOtherPlayers", "setEnableForEditText", "ifEnable", "setMaxWeightInventory", "size", "setMyMoney", "money", "setNullableParameters", "setObservers", "setOtherPlayersMoney", "(Ljava/lang/Integer;)V", "setPlayersNick", PlayersListUtilsKt.KEY_GET_PLAYER_NICK, "setThisWeightInventory", "setViewExchangeList", "thisView", "showChat", "updateChangeStatus", "getStatus", "updateCountWithNewMessages", CatchStreamerKeys.COUNT_KEY, "updateNewMessage", "newMessage", "Lcom/blackhub/bronline/game/gui/inventory/data/InvMessageObj;", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NotifyDataSetChanged"})
/* loaded from: classes3.dex */
public final class UILayoutExchange extends UILayout {
    public static final int $stable = 8;

    @Nullable
    public InventoryLayoutExchangeWithUserBinding binding;
    public boolean blockStatus;

    @Nullable
    public Function3<? super Integer, ? super Integer, ? super Integer, Unit> clickListenerDialogForMigrateItems;

    @Nullable
    public UIChat dialogChat;

    @Nullable
    public NewDialogForMigrateItems dialogForMigrateItem;

    @Nullable
    public Function2<? super InvItems, ? super Integer, Unit> emptyClickListener;
    public int exchangeStatus;
    public int exchangeYourMoney;
    public int idFromExchange;
    public int idFromInv;
    public int idFromSlot;
    public boolean ifFirstShow;
    public boolean ifFirstShowOrClearMyExchangeItems;
    public boolean ifFirstShowOrClearOtherExchangeItems;
    public int initInvSize;
    public int intermediatePositionFromSlot;
    public int intermediatePositionWithExchangeItem;
    public int intermediatePositionWithItem;

    @Nullable
    public final InventoryAndExchangeViewModel inventoryAndExchangeViewModel;
    public boolean isFirstShowInv;
    public boolean isFirstShowSlot;

    @Nullable
    public InvItems itemInExchange;

    @Nullable
    public InvItems itemInInv;

    @NotNull
    public final ArrayMap<String, Bitmap> itemRender;

    @Nullable
    public InventoryItemsInSlotAdapter itemsInSlotAdapter;

    @NotNull
    public final GUIUsersInventory mainRoot;

    /* renamed from: messageCantExchangeMoreMoney$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy messageCantExchangeMoreMoney;

    /* renamed from: messageCantTakeOffClothes$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy messageCantTakeOffClothes;

    /* renamed from: messageChangeField$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy messageChangeField;

    /* renamed from: messageErrorFromRes$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy messageErrorFromRes;

    /* renamed from: messageNotEnoughMoney$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy messageNotEnoughMoney;
    public int modelIdFromExchange;
    public int modelIdFromInv;
    public int modelIdFromSlot;

    @NotNull
    public List<Integer> myInitInvItemsPos;
    public long oldTimeAfterCheck;
    public long oldTimeWithMigrate;

    @Nullable
    public Function2<? super InvItems, ? super Integer, Unit> onItemsInSlotClickListener;

    @Nullable
    public Function2<? super InvItems, ? super Integer, Unit> onYourExchangeItemsClickListener;

    @Nullable
    public Function2<? super InvItems, ? super Integer, Unit> onYourItemsClickListener;

    @Nullable
    public InventoryExchangeAndTrunkAdapter otherPlayersItemsAndTrunkAdapter;
    public int positionFromSlot;
    public int positionWithExchangeItem;
    public int positionWithItem;
    public int saveExchangeYourMoney;

    @NotNull
    public List<Integer> savedPosInInv;
    public int sendCounter;
    public boolean setInitState;
    public int simCardNumberFromExchange;
    public int simCardNumberFromInv;
    public int startThisWeight;
    public int statusViewExchange;

    @Nullable
    public String textIsFromOtherPlayer;

    @Nullable
    public String textIsFromYou;
    public int valueFromExchange;
    public int valueFromInv;
    public int valueFromSlot;
    public int yourAllMoney;

    @Nullable
    public InventoryExchangeAndTrunkAdapter yourExchangeItemsAndTrunkAdapter;

    @Nullable
    public InventoryExchangeAndTrunkAdapter yourItemsAndTrunkAdapter;

    public UILayoutExchange(@NotNull GUIUsersInventory mainRoot, @Nullable InventoryAndExchangeViewModel inventoryAndExchangeViewModel, @NotNull ArrayMap<String, Bitmap> itemRender) {
        Intrinsics.checkNotNullParameter(mainRoot, "mainRoot");
        Intrinsics.checkNotNullParameter(itemRender, "itemRender");
        this.mainRoot = mainRoot;
        this.inventoryAndExchangeViewModel = inventoryAndExchangeViewModel;
        this.itemRender = itemRender;
        this.positionWithItem = -1;
        this.intermediatePositionWithItem = -1;
        this.positionWithExchangeItem = -1;
        this.intermediatePositionWithExchangeItem = -1;
        this.positionFromSlot = -1;
        this.intermediatePositionFromSlot = -1;
        this.myInitInvItemsPos = new ArrayList();
        this.savedPosInInv = new ArrayList();
        this.textIsFromOtherPlayer = "";
        this.textIsFromYou = "";
        this.ifFirstShow = true;
        this.isFirstShowSlot = true;
        this.isFirstShowInv = true;
        this.ifFirstShowOrClearMyExchangeItems = true;
        this.ifFirstShowOrClearOtherExchangeItems = true;
        this.messageErrorFromRes = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$messageErrorFromRes$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return UILayoutExchange.this.getContext().getString(R.string.inv_trunk_message_error);
            }
        });
        this.messageChangeField = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$messageChangeField$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return UILayoutExchange.this.getContext().getString(R.string.inv_text_change_field);
            }
        });
        this.messageCantTakeOffClothes = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$messageCantTakeOffClothes$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return UILayoutExchange.this.getContext().getString(R.string.inv_text_take_off_clothes);
            }
        });
        this.messageCantExchangeMoreMoney = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$messageCantExchangeMoreMoney$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return UILayoutExchange.this.getContext().getString(R.string.inv_text_cant_exchange_more_money);
            }
        });
        this.messageNotEnoughMoney = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$messageNotEnoughMoney$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return UILayoutExchange.this.getContext().getString(R.string.inv_text_not_enough_money);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getMessageErrorFromRes() {
        return (String) this.messageErrorFromRes.getValue();
    }

    public final String getMessageChangeField() {
        return (String) this.messageChangeField.getValue();
    }

    public final String getMessageCantTakeOffClothes() {
        return (String) this.messageCantTakeOffClothes.getValue();
    }

    public final String getMessageCantExchangeMoreMoney() {
        return (String) this.messageCantExchangeMoreMoney.getValue();
    }

    public final String getMessageNotEnoughMoney() {
        return (String) this.messageNotEnoughMoney.getValue();
    }

    public final void changeStatusWhoseItem(List<InvItems> myList) {
        for (InvItems invItems : myList) {
            if (invItems.getItemsValue() != 0) {
                invItems.setWhoseItem(0);
            }
        }
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @Nullable
    /* renamed from: getView */
    public View getMViewRoot() {
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        if (inventoryLayoutExchangeWithUserBinding != null) {
            return inventoryLayoutExchangeWithUserBinding.getRoot();
        }
        return null;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.binding = InventoryLayoutExchangeWithUserBinding.inflate(inflater);
        initDialogForMigrateItems();
        initYourItemsClickListener();
        initYourExchangeItemsClickListener();
        initForEmptyClickListener();
        initSlotClickListener();
        initDataYourItemsInView();
        initDataExchangeItemsInView();
        initDataInSlotsView();
        setOtherPlayersMoney(0);
        setMyMoney(0);
        final InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        if (inventoryLayoutExchangeWithUserBinding != null) {
            inventoryLayoutExchangeWithUserBinding.exchangeBgValuesForBag.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UILayoutExchange.onCreateView$lambda$5$lambda$0(UILayoutExchange.this, view);
                }
            });
            inventoryLayoutExchangeWithUserBinding.exchangeButtonCancel.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UILayoutExchange.onCreateView$lambda$5$lambda$1(view);
                }
            });
            inventoryLayoutExchangeWithUserBinding.exchangeButtonApply.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UILayoutExchange.onCreateView$lambda$5$lambda$2(UILayoutExchange.this, view);
                }
            });
            CustomEditText customEditText = inventoryLayoutExchangeWithUserBinding.exchangeEdittextMoney;
            customEditText.setGUIManager(GUIManager.INSTANCE.getInstance());
            customEditText.setMainRoot(this.mainRoot);
            inventoryLayoutExchangeWithUserBinding.exchangeEdittextMoney.addTextChangedListener(new TextWatcher() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$onCreateView$1$5
                @Override // android.text.TextWatcher
                public void afterTextChanged(@Nullable Editable p0) {
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(@Nullable CharSequence p0, int p1, int p2, int p3) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(@Nullable CharSequence p0, int p1, int p2, int p3) {
                    int i;
                    int i2;
                    String valueOf = String.valueOf(p0);
                    UILayoutExchange uILayoutExchange = UILayoutExchange.this;
                    int i3 = 0;
                    if (valueOf.length() > 0 && valueOf.charAt(0) != '0') {
                        i3 = Integer.parseInt(valueOf);
                    }
                    uILayoutExchange.exchangeYourMoney = i3;
                    i = UILayoutExchange.this.exchangeYourMoney;
                    if (i == 0) {
                        inventoryLayoutExchangeWithUserBinding.exchangeTextMoney.setText("");
                        return;
                    }
                    TextView textView = inventoryLayoutExchangeWithUserBinding.exchangeTextMoney;
                    i2 = UILayoutExchange.this.exchangeYourMoney;
                    textView.setText(UsefulKt.getPriceWithSpaces(Integer.valueOf(i2)));
                }
            });
            inventoryLayoutExchangeWithUserBinding.exchangeBgButtonChat.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UILayoutExchange.onCreateView$lambda$5$lambda$4(UILayoutExchange.this, view);
                }
            });
        }
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding2 = this.binding;
        if (inventoryLayoutExchangeWithUserBinding2 != null) {
            return inventoryLayoutExchangeWithUserBinding2.getRoot();
        }
        return null;
    }

    public static final void onCreateView$lambda$5$lambda$0(UILayoutExchange this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = this$0.statusViewExchange == 0 ? 1 : 0;
        this$0.statusViewExchange = i;
        this$0.setViewExchangeList(i);
    }

    public static final void onCreateView$lambda$5$lambda$1(View view) {
        InvActionWithJSON.INSTANCE.sendPressButton(7);
    }

    public static final void onCreateView$lambda$5$lambda$2(UILayoutExchange this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = this$0.exchangeYourMoney;
        if (i > 20000000) {
            CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON = CarTrunkOrClosetActionsWithJSON.INSTANCE;
            String messageCantExchangeMoreMoney = this$0.getMessageCantExchangeMoreMoney();
            Intrinsics.checkNotNullExpressionValue(messageCantExchangeMoreMoney, "<get-messageCantExchangeMoreMoney>(...)");
            carTrunkOrClosetActionsWithJSON.sendMessageError(messageCantExchangeMoreMoney);
            return;
        }
        if (this$0.yourAllMoney < i) {
            CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON2 = CarTrunkOrClosetActionsWithJSON.INSTANCE;
            String messageNotEnoughMoney = this$0.getMessageNotEnoughMoney();
            Intrinsics.checkNotNullExpressionValue(messageNotEnoughMoney, "<get-messageNotEnoughMoney>(...)");
            carTrunkOrClosetActionsWithJSON2.sendMessageError(messageNotEnoughMoney);
            return;
        }
        int i2 = this$0.exchangeStatus;
        if (i2 == 0) {
            InvActionWithJSON.INSTANCE.sendPressButton(8);
            InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this$0.inventoryAndExchangeViewModel;
            if (inventoryAndExchangeViewModel != null) {
                inventoryAndExchangeViewModel.setBlockStatus(true);
                return;
            }
            return;
        }
        if (i2 != 2) {
            return;
        }
        InvActionWithJSON.INSTANCE.sendPressButton(9);
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel2 = this$0.inventoryAndExchangeViewModel;
        if (inventoryAndExchangeViewModel2 != null) {
            inventoryAndExchangeViewModel2.setBlockStatus(true);
        }
    }

    public static final void onCreateView$lambda$5$lambda$4(UILayoutExchange this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showChat();
        this$0.mainRoot.closeAndroidInterface();
        this$0.mainRoot.setCounter(0);
        this$0.updateCountWithNewMessages(this$0.mainRoot.getCounter());
    }

    private final void initDialogForMigrateItems() {
        initLogicForDialogMigrateItems();
        this.dialogForMigrateItem = new NewDialogForMigrateItems(this.clickListenerDialogForMigrateItems, this.itemRender);
    }

    private final void initLogicForDialogMigrateItems() {
        this.clickListenerDialogForMigrateItems = new Function3<Integer, Integer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$initLogicForDialogMigrateItems$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3) {
                invoke(num.intValue(), num2.intValue(), num3.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(int migrateValue, int action, int applyAction) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                NewDialogForMigrateItems newDialogForMigrateItems;
                int i6;
                int i7;
                int i8;
                int i9;
                List list;
                int i10;
                if (action != 4) {
                    if (action == 5 && applyAction == 11) {
                        i6 = UILayoutExchange.this.positionWithExchangeItem;
                        if (i6 != -1) {
                            UILayoutExchange uILayoutExchange = UILayoutExchange.this;
                            i7 = uILayoutExchange.positionWithExchangeItem;
                            uILayoutExchange.intermediatePositionWithExchangeItem = i7;
                            UILayoutExchange.this.valueFromExchange = migrateValue;
                            InvActionWithJSON invActionWithJSON = InvActionWithJSON.INSTANCE;
                            i8 = UILayoutExchange.this.idFromExchange;
                            i9 = UILayoutExchange.this.valueFromExchange;
                            list = UILayoutExchange.this.savedPosInInv;
                            i10 = UILayoutExchange.this.positionWithExchangeItem;
                            invActionWithJSON.sendIdWithCountToServer(24, i8, i9, ((Number) list.get(i10)).intValue());
                        }
                    }
                } else if (applyAction == 11) {
                    i = UILayoutExchange.this.positionWithItem;
                    if (i != -1) {
                        UILayoutExchange uILayoutExchange2 = UILayoutExchange.this;
                        i2 = uILayoutExchange2.positionWithItem;
                        uILayoutExchange2.intermediatePositionWithItem = i2;
                        UILayoutExchange.this.valueFromInv = migrateValue;
                        InvActionWithJSON invActionWithJSON2 = InvActionWithJSON.INSTANCE;
                        i3 = UILayoutExchange.this.idFromInv;
                        i4 = UILayoutExchange.this.valueFromInv;
                        i5 = UILayoutExchange.this.positionWithItem;
                        invActionWithJSON2.sendIdWithCountAndSlotToServer(5, i3, i4, i5);
                    }
                }
                newDialogForMigrateItems = UILayoutExchange.this.dialogForMigrateItem;
                if (newDialogForMigrateItems != null) {
                    newDialogForMigrateItems.closeDialogForMigrate();
                }
            }
        };
    }

    public final void initYourItemsClickListener() {
        this.onYourItemsClickListener = new Function2<InvItems, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$initYourItemsClickListener$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InvItems invItems, Integer num) {
                invoke(invItems, num.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull InvItems item, int position) {
                boolean z;
                long j;
                long j2;
                int i;
                int i2;
                int i3;
                List list;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                String messageCantTakeOffClothes;
                int i10;
                int i11;
                long j3;
                int i12;
                int i13;
                String messageErrorFromRes;
                long j4;
                int i14;
                int i15;
                int i16;
                List list2;
                int i17;
                int i18;
                NewDialogForMigrateItems newDialogForMigrateItems;
                InvItems invItems;
                InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter;
                int unused;
                Intrinsics.checkNotNullParameter(item, "item");
                z = UILayoutExchange.this.blockStatus;
                if (z) {
                    return;
                }
                j = UILayoutExchange.this.oldTimeAfterCheck;
                if (j != System.currentTimeMillis()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    j2 = UILayoutExchange.this.oldTimeAfterCheck;
                    if (currentTimeMillis - j2 > 500) {
                        UILayoutExchange.this.oldTimeAfterCheck = System.currentTimeMillis();
                        UILayoutExchange.this.positionWithItem = position;
                        if (item.getItemsValue() != 0) {
                            UILayoutExchange.this.clearInfoAboutSlot();
                            UILayoutExchange.this.clearInfoAboutExchange();
                            UILayoutExchange uILayoutExchange = UILayoutExchange.this;
                            item.setCheck(true);
                            uILayoutExchange.idFromInv = item.getId();
                            uILayoutExchange.modelIdFromInv = item.getModelid();
                            uILayoutExchange.valueFromInv = item.getItemsValue();
                            if (!Intrinsics.areEqual(item.getTextIfException(), "") && item.getId() == 58) {
                                uILayoutExchange.simCardNumberFromInv = Integer.parseInt(item.getTextIfException());
                            }
                            uILayoutExchange.itemInInv = item;
                            inventoryExchangeAndTrunkAdapter = UILayoutExchange.this.yourItemsAndTrunkAdapter;
                            if (inventoryExchangeAndTrunkAdapter != null) {
                                inventoryExchangeAndTrunkAdapter.notifyItemChanged(position);
                                inventoryExchangeAndTrunkAdapter.setCheckOnlyElement(position);
                                return;
                            }
                            return;
                        }
                        i = UILayoutExchange.this.positionWithExchangeItem;
                        if (i != -1) {
                            i10 = UILayoutExchange.this.valueFromExchange;
                            if (i10 != 0) {
                                i11 = UILayoutExchange.this.idFromExchange;
                                switch (i11) {
                                    case Constants.ID_TACKLE_1 /* 642 */:
                                    case Constants.ID_TACKLE_2 /* 643 */:
                                    case Constants.ID_TACKLE_3 /* 644 */:
                                    case Constants.ID_TACKLE_4 /* 645 */:
                                    case Constants.ID_TACKLE_5 /* 646 */:
                                        break;
                                    default:
                                        i18 = UILayoutExchange.this.valueFromExchange;
                                        if (i18 != 1) {
                                            newDialogForMigrateItems = UILayoutExchange.this.dialogForMigrateItem;
                                            if (newDialogForMigrateItems != null) {
                                                invItems = UILayoutExchange.this.itemInExchange;
                                                newDialogForMigrateItems.showDialogForMigrateItem(invItems, 5);
                                                return;
                                            }
                                            return;
                                        }
                                        break;
                                }
                                j3 = UILayoutExchange.this.oldTimeWithMigrate;
                                if (j3 != System.currentTimeMillis()) {
                                    long currentTimeMillis2 = System.currentTimeMillis();
                                    j4 = UILayoutExchange.this.oldTimeWithMigrate;
                                    if (currentTimeMillis2 - j4 > 1000) {
                                        UILayoutExchange.this.oldTimeWithMigrate = System.currentTimeMillis();
                                        i14 = UILayoutExchange.this.idFromExchange;
                                        int i19 = i14 != 58 ? i14 != 134 ? UILayoutExchange.this.valueFromExchange : UILayoutExchange.this.modelIdFromExchange : UILayoutExchange.this.simCardNumberFromExchange;
                                        UILayoutExchange uILayoutExchange2 = UILayoutExchange.this;
                                        i15 = uILayoutExchange2.positionWithExchangeItem;
                                        uILayoutExchange2.intermediatePositionWithExchangeItem = i15;
                                        InvActionWithJSON invActionWithJSON = InvActionWithJSON.INSTANCE;
                                        i16 = UILayoutExchange.this.idFromExchange;
                                        list2 = UILayoutExchange.this.savedPosInInv;
                                        i17 = UILayoutExchange.this.positionWithExchangeItem;
                                        invActionWithJSON.sendIdWithCountToServer(24, i16, i19, ((Number) list2.get(i17)).intValue());
                                        UILayoutExchange.this.sendCounter = 0;
                                        return;
                                    }
                                }
                                i12 = UILayoutExchange.this.sendCounter;
                                if (i12 == 0) {
                                    CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON = CarTrunkOrClosetActionsWithJSON.INSTANCE;
                                    messageErrorFromRes = UILayoutExchange.this.getMessageErrorFromRes();
                                    Intrinsics.checkNotNullExpressionValue(messageErrorFromRes, "access$getMessageErrorFromRes(...)");
                                    carTrunkOrClosetActionsWithJSON.sendMessageError(messageErrorFromRes);
                                }
                                UILayoutExchange uILayoutExchange3 = UILayoutExchange.this;
                                i13 = uILayoutExchange3.sendCounter;
                                uILayoutExchange3.sendCounter = i13 + 1;
                                unused = uILayoutExchange3.sendCounter;
                                return;
                            }
                        }
                        i2 = UILayoutExchange.this.positionFromSlot;
                        if (i2 != -1) {
                            i3 = UILayoutExchange.this.valueFromSlot;
                            if (i3 != 0) {
                                list = UILayoutExchange.this.myInitInvItemsPos;
                                i4 = UILayoutExchange.this.positionWithItem;
                                if (((Number) list.get(i4)).intValue() == 0) {
                                    i5 = UILayoutExchange.this.positionFromSlot;
                                    if (i5 != 0) {
                                        i6 = UILayoutExchange.this.positionFromSlot;
                                        if (i6 == 1) {
                                            CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON2 = CarTrunkOrClosetActionsWithJSON.INSTANCE;
                                            messageCantTakeOffClothes = UILayoutExchange.this.getMessageCantTakeOffClothes();
                                            Intrinsics.checkNotNullExpressionValue(messageCantTakeOffClothes, "access$getMessageCantTakeOffClothes(...)");
                                            carTrunkOrClosetActionsWithJSON2.sendMessageError(messageCantTakeOffClothes);
                                            return;
                                        }
                                        UILayoutExchange uILayoutExchange4 = UILayoutExchange.this;
                                        i7 = uILayoutExchange4.positionFromSlot;
                                        uILayoutExchange4.intermediatePositionFromSlot = i7;
                                        UILayoutExchange.this.intermediatePositionWithItem = position;
                                        i8 = UILayoutExchange.this.positionFromSlot;
                                        InvActionWithJSON invActionWithJSON2 = InvActionWithJSON.INSTANCE;
                                        i9 = UILayoutExchange.this.idFromSlot;
                                        invActionWithJSON2.sendIdWithOldAndNewPositionsToServer(27, i9, i8 - 2, position);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                        UILayoutExchange.this.clearInfoAboutInv();
                    }
                }
            }
        };
    }

    public final void initYourExchangeItemsClickListener() {
        this.onYourExchangeItemsClickListener = new Function2<InvItems, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$initYourExchangeItemsClickListener$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InvItems invItems, Integer num) {
                invoke(invItems, num.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull InvItems item, int position) {
                boolean z;
                long j;
                long j2;
                int i;
                int i2;
                int i3;
                long j3;
                int i4;
                int i5;
                String messageErrorFromRes;
                long j4;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                NewDialogForMigrateItems newDialogForMigrateItems;
                InvItems invItems;
                InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter;
                int unused;
                Intrinsics.checkNotNullParameter(item, "item");
                z = UILayoutExchange.this.blockStatus;
                if (z) {
                    return;
                }
                j = UILayoutExchange.this.oldTimeAfterCheck;
                if (j != System.currentTimeMillis()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    j2 = UILayoutExchange.this.oldTimeAfterCheck;
                    if (currentTimeMillis - j2 > 500) {
                        UILayoutExchange.this.oldTimeAfterCheck = System.currentTimeMillis();
                        UILayoutExchange.this.positionWithExchangeItem = position;
                        if (item.getItemsValue() == 0) {
                            i = UILayoutExchange.this.positionWithItem;
                            if (i != -1) {
                                i2 = UILayoutExchange.this.valueFromInv;
                                if (i2 != 0) {
                                    i3 = UILayoutExchange.this.idFromInv;
                                    switch (i3) {
                                        case Constants.ID_TACKLE_1 /* 642 */:
                                        case Constants.ID_TACKLE_2 /* 643 */:
                                        case Constants.ID_TACKLE_3 /* 644 */:
                                        case Constants.ID_TACKLE_4 /* 645 */:
                                        case Constants.ID_TACKLE_5 /* 646 */:
                                            break;
                                        default:
                                            i10 = UILayoutExchange.this.valueFromInv;
                                            if (i10 != 1) {
                                                newDialogForMigrateItems = UILayoutExchange.this.dialogForMigrateItem;
                                                if (newDialogForMigrateItems != null) {
                                                    invItems = UILayoutExchange.this.itemInInv;
                                                    newDialogForMigrateItems.showDialogForMigrateItem(invItems, 4);
                                                    return;
                                                }
                                                return;
                                            }
                                            break;
                                    }
                                    j3 = UILayoutExchange.this.oldTimeWithMigrate;
                                    if (j3 != System.currentTimeMillis()) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        j4 = UILayoutExchange.this.oldTimeWithMigrate;
                                        if (currentTimeMillis2 - j4 > 1000) {
                                            UILayoutExchange.this.oldTimeWithMigrate = System.currentTimeMillis();
                                            i6 = UILayoutExchange.this.idFromInv;
                                            int i11 = i6 != 58 ? i6 != 134 ? UILayoutExchange.this.valueFromInv : UILayoutExchange.this.modelIdFromInv : UILayoutExchange.this.simCardNumberFromInv;
                                            UILayoutExchange uILayoutExchange = UILayoutExchange.this;
                                            i7 = uILayoutExchange.positionWithItem;
                                            uILayoutExchange.intermediatePositionWithItem = i7;
                                            InvActionWithJSON invActionWithJSON = InvActionWithJSON.INSTANCE;
                                            i8 = UILayoutExchange.this.idFromInv;
                                            i9 = UILayoutExchange.this.positionWithItem;
                                            invActionWithJSON.sendIdWithCountAndSlotToServer(5, i8, i11, i9);
                                            UILayoutExchange.this.sendCounter = 0;
                                            return;
                                        }
                                    }
                                    i4 = UILayoutExchange.this.sendCounter;
                                    if (i4 == 0) {
                                        CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON = CarTrunkOrClosetActionsWithJSON.INSTANCE;
                                        messageErrorFromRes = UILayoutExchange.this.getMessageErrorFromRes();
                                        Intrinsics.checkNotNullExpressionValue(messageErrorFromRes, "access$getMessageErrorFromRes(...)");
                                        carTrunkOrClosetActionsWithJSON.sendMessageError(messageErrorFromRes);
                                    }
                                    UILayoutExchange uILayoutExchange2 = UILayoutExchange.this;
                                    i5 = uILayoutExchange2.sendCounter;
                                    uILayoutExchange2.sendCounter = i5 + 1;
                                    unused = uILayoutExchange2.sendCounter;
                                    UILayoutExchange.this.clearInfoAboutSlot();
                                    UILayoutExchange.this.clearInfoAboutExchange();
                                    UILayoutExchange.this.clearInfoAboutInv();
                                    return;
                                }
                            }
                            UILayoutExchange.this.clearInfoAboutExchange();
                            return;
                        }
                        UILayoutExchange.this.clearInfoAboutInv();
                        UILayoutExchange.this.clearInfoAboutSlot();
                        UILayoutExchange uILayoutExchange3 = UILayoutExchange.this;
                        item.setCheck(true);
                        uILayoutExchange3.idFromExchange = item.getId();
                        uILayoutExchange3.modelIdFromExchange = item.getModelid();
                        uILayoutExchange3.valueFromExchange = item.getItemsValue();
                        if (!Intrinsics.areEqual(item.getTextIfException(), "") && item.getId() == 58) {
                            uILayoutExchange3.simCardNumberFromExchange = Integer.parseInt(item.getTextIfException());
                        }
                        uILayoutExchange3.itemInExchange = item;
                        inventoryExchangeAndTrunkAdapter = UILayoutExchange.this.yourExchangeItemsAndTrunkAdapter;
                        if (inventoryExchangeAndTrunkAdapter != null) {
                            inventoryExchangeAndTrunkAdapter.notifyItemChanged(position);
                            inventoryExchangeAndTrunkAdapter.setCheckOnlyElement(position);
                        }
                    }
                }
            }
        };
    }

    public final void initForEmptyClickListener() {
        this.emptyClickListener = new Function2<InvItems, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$initForEmptyClickListener$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InvItems invItems, Integer num) {
                invoke(invItems, num.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull InvItems item, int position) {
                InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter;
                int i;
                int i2;
                String messageChangeField;
                Intrinsics.checkNotNullParameter(item, "item");
                inventoryExchangeAndTrunkAdapter = UILayoutExchange.this.otherPlayersItemsAndTrunkAdapter;
                if (inventoryExchangeAndTrunkAdapter != null) {
                    inventoryExchangeAndTrunkAdapter.setCheckOnlyElement(position);
                }
                i = UILayoutExchange.this.positionWithItem;
                if (i != -1) {
                    i2 = UILayoutExchange.this.valueFromInv;
                    if (i2 != 0) {
                        CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON = CarTrunkOrClosetActionsWithJSON.INSTANCE;
                        messageChangeField = UILayoutExchange.this.getMessageChangeField();
                        Intrinsics.checkNotNullExpressionValue(messageChangeField, "access$getMessageChangeField(...)");
                        carTrunkOrClosetActionsWithJSON.sendMessageError(messageChangeField);
                    }
                }
            }
        };
    }

    private final void initSlotClickListener() {
        this.onItemsInSlotClickListener = new Function2<InvItems, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$initSlotClickListener$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InvItems invItems, Integer num) {
                invoke(invItems, num.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull InvItems item, int position) {
                int i;
                InventoryItemsInSlotAdapter inventoryItemsInSlotAdapter;
                Intrinsics.checkNotNullParameter(item, "item");
                i = UILayoutExchange.this.exchangeStatus;
                if (i == 0) {
                    UILayoutExchange.this.positionFromSlot = position;
                    UILayoutExchange.this.clearInfoAboutInv();
                    UILayoutExchange.this.clearInfoAboutExchange();
                    if (item.getItemsValue() != 0) {
                        UILayoutExchange uILayoutExchange = UILayoutExchange.this;
                        item.setCheck(true);
                        uILayoutExchange.idFromSlot = item.getId();
                        uILayoutExchange.modelIdFromSlot = item.getModelid();
                        uILayoutExchange.valueFromSlot = item.getItemsValue();
                        inventoryItemsInSlotAdapter = UILayoutExchange.this.itemsInSlotAdapter;
                        if (inventoryItemsInSlotAdapter != null) {
                            inventoryItemsInSlotAdapter.notifyItemChanged(position);
                            inventoryItemsInSlotAdapter.setCheckOnlyElement(position);
                        }
                    }
                }
            }
        };
    }

    public final void initDataYourItemsInView() {
        this.yourItemsAndTrunkAdapter = new InventoryExchangeAndTrunkAdapter(this.onYourItemsClickListener, 0, this.itemRender);
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        if (inventoryLayoutExchangeWithUserBinding != null) {
            RecyclerView recyclerView = inventoryLayoutExchangeWithUserBinding.exchangeListItemsInInventory;
            recyclerView.setLayoutManager(new GridLayoutManager(inventoryLayoutExchangeWithUserBinding.getRoot().getContext(), 4));
            recyclerView.setAdapter(this.yourItemsAndTrunkAdapter);
        }
    }

    public final void initDataExchangeItemsInView() {
        this.yourExchangeItemsAndTrunkAdapter = new InventoryExchangeAndTrunkAdapter(this.onYourExchangeItemsClickListener, 1, this.itemRender);
        this.otherPlayersItemsAndTrunkAdapter = new InventoryExchangeAndTrunkAdapter(this.emptyClickListener, 2, this.itemRender);
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        if (inventoryLayoutExchangeWithUserBinding != null) {
            RecyclerView recyclerView = inventoryLayoutExchangeWithUserBinding.exchangeListItemsInCar;
            recyclerView.setLayoutManager(new GridLayoutManager(inventoryLayoutExchangeWithUserBinding.getRoot().getContext(), 4));
            recyclerView.setAdapter(this.yourExchangeItemsAndTrunkAdapter);
        }
    }

    private final void initDataInSlotsView() {
        this.itemsInSlotAdapter = new InventoryItemsInSlotAdapter(this.onItemsInSlotClickListener, false, this.itemRender);
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        if (inventoryLayoutExchangeWithUserBinding != null) {
            RecyclerView recyclerView = inventoryLayoutExchangeWithUserBinding.playersSlotsInExchange;
            recyclerView.setLayoutManager(new LinearLayoutManager(inventoryLayoutExchangeWithUserBinding.getRoot().getContext(), 1, false));
            recyclerView.setAdapter(this.itemsInSlotAdapter);
        }
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
        clearInfoAboutExchange();
        clearInfoAboutInv();
        clearInfoAboutSlot();
        setDefaultParams();
        setObservers();
        changeButtonAndHelpInfo(false);
    }

    private final void setObservers() {
        LifecycleOwner viewLifecycleOwner = this.mainRoot.getViewLifecycleOwner();
        final InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel;
        if (inventoryAndExchangeViewModel != null) {
            inventoryAndExchangeViewModel.getNewOtherPlayersNick().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable String str) {
                    int i;
                    GUIUsersInventory gUIUsersInventory;
                    GUIUsersInventory gUIUsersInventory2;
                    GUIUsersInventory gUIUsersInventory3;
                    GUIUsersInventory gUIUsersInventory4;
                    InventoryAndExchangeViewModel inventoryAndExchangeViewModel2;
                    UILayoutExchange.this.setPlayersNick(str);
                    UILayoutExchange.this.statusViewExchange = 0;
                    UILayoutExchange uILayoutExchange = UILayoutExchange.this;
                    i = uILayoutExchange.statusViewExchange;
                    uILayoutExchange.setViewExchangeList(i);
                    gUIUsersInventory = UILayoutExchange.this.mainRoot;
                    gUIUsersInventory.setCounter(0);
                    gUIUsersInventory2 = UILayoutExchange.this.mainRoot;
                    gUIUsersInventory3 = UILayoutExchange.this.mainRoot;
                    gUIUsersInventory2.updateCountWithNewMessages(gUIUsersInventory3.getCounter());
                    UILayoutExchange uILayoutExchange2 = UILayoutExchange.this;
                    gUIUsersInventory4 = UILayoutExchange.this.mainRoot;
                    inventoryAndExchangeViewModel2 = UILayoutExchange.this.inventoryAndExchangeViewModel;
                    uILayoutExchange2.dialogChat = new UIChat(gUIUsersInventory4, str, inventoryAndExchangeViewModel2);
                }
            }));
            inventoryAndExchangeViewModel.getNewCurrentWeight().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke2(num);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Integer num) {
                    boolean z;
                    UILayoutExchange uILayoutExchange = UILayoutExchange.this;
                    Intrinsics.checkNotNull(num);
                    uILayoutExchange.setThisWeightInventory(num.intValue());
                    z = UILayoutExchange.this.ifFirstShow;
                    if (z) {
                        UILayoutExchange.this.ifFirstShow = false;
                        UILayoutExchange.this.startThisWeight = num.intValue();
                    }
                }
            }));
            inventoryAndExchangeViewModel.getNewMaxWeight().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke2(num);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Integer num) {
                    UILayoutExchange uILayoutExchange = UILayoutExchange.this;
                    Intrinsics.checkNotNull(num);
                    uILayoutExchange.setMaxWeightInventory(num.intValue());
                }
            }));
            inventoryAndExchangeViewModel.getNewMyMoney().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$4
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke2(num);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Integer num) {
                    UILayoutExchange uILayoutExchange = UILayoutExchange.this;
                    Intrinsics.checkNotNull(num);
                    uILayoutExchange.setMyMoney(num.intValue());
                }
            }));
            inventoryAndExchangeViewModel.getNewSlotItems().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<List<InvItems>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<InvItems> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<InvItems> list) {
                    boolean z;
                    InventoryItemsInSlotAdapter inventoryItemsInSlotAdapter;
                    z = UILayoutExchange.this.isFirstShowSlot;
                    if (z) {
                        UILayoutExchange.this.isFirstShowSlot = false;
                        inventoryItemsInSlotAdapter = UILayoutExchange.this.itemsInSlotAdapter;
                        if (inventoryItemsInSlotAdapter != null) {
                            Intrinsics.checkNotNull(list);
                            List<SkinsDTO> value = inventoryAndExchangeViewModel.getSkinItems().getValue();
                            if (value == null) {
                                value = CollectionsKt__CollectionsKt.emptyList();
                            }
                            inventoryItemsInSlotAdapter.setSlotItems(list, value);
                        }
                    }
                }
            }));
            inventoryAndExchangeViewModel.getNewMediatorInvItemsAndSize().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<InvSizeAndItemsObj, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InvSizeAndItemsObj invSizeAndItemsObj) {
                    invoke2(invSizeAndItemsObj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(InvSizeAndItemsObj invSizeAndItemsObj) {
                    boolean z;
                    InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter;
                    InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding;
                    int i;
                    int i2;
                    RecyclerView recyclerView;
                    int i3;
                    z = UILayoutExchange.this.isFirstShowInv;
                    if (!z || invSizeAndItemsObj.getItemsList() == null || invSizeAndItemsObj.getSizeActiveSlots() == null) {
                        return;
                    }
                    UILayoutExchange.this.isFirstShowInv = false;
                    UILayoutExchange uILayoutExchange = UILayoutExchange.this;
                    List<InvItems> itemsList = invSizeAndItemsObj.getItemsList();
                    Intrinsics.checkNotNull(itemsList);
                    uILayoutExchange.changeStatusWhoseItem(itemsList);
                    UILayoutExchange uILayoutExchange2 = UILayoutExchange.this;
                    Integer sizeActiveSlots = invSizeAndItemsObj.getSizeActiveSlots();
                    Intrinsics.checkNotNull(sizeActiveSlots);
                    uILayoutExchange2.initInvSize = sizeActiveSlots.intValue() + 1;
                    inventoryExchangeAndTrunkAdapter = UILayoutExchange.this.yourItemsAndTrunkAdapter;
                    if (inventoryExchangeAndTrunkAdapter != null) {
                        List<InvItems> itemsList2 = invSizeAndItemsObj.getItemsList();
                        Intrinsics.checkNotNull(itemsList2);
                        i3 = UILayoutExchange.this.initInvSize;
                        List<VehiclesDTO> value = inventoryAndExchangeViewModel.getVehicleItems().getValue();
                        if (value == null) {
                            value = CollectionsKt__CollectionsKt.emptyList();
                        }
                        List<SkinsDTO> value2 = inventoryAndExchangeViewModel.getSkinItems().getValue();
                        if (value2 == null) {
                            value2 = CollectionsKt__CollectionsKt.emptyList();
                        }
                        inventoryExchangeAndTrunkAdapter.setItems(itemsList2, i3, value, value2);
                    }
                    inventoryLayoutExchangeWithUserBinding = UILayoutExchange.this.binding;
                    if (inventoryLayoutExchangeWithUserBinding != null && (recyclerView = inventoryLayoutExchangeWithUserBinding.exchangeListItemsInInventory) != null) {
                        List<InvItems> itemsList3 = invSizeAndItemsObj.getItemsList();
                        Intrinsics.checkNotNull(itemsList3);
                        recyclerView.setItemViewCacheSize(itemsList3.size());
                    }
                    InventoryAndExchangeViewModel inventoryAndExchangeViewModel2 = inventoryAndExchangeViewModel;
                    i = UILayoutExchange.this.initInvSize;
                    inventoryAndExchangeViewModel2.initMyExchangeItems(i);
                    InventoryAndExchangeViewModel inventoryAndExchangeViewModel3 = inventoryAndExchangeViewModel;
                    i2 = UILayoutExchange.this.initInvSize;
                    inventoryAndExchangeViewModel3.initOtherExchangeItems(i2);
                    InventoryAndExchangeViewModel inventoryAndExchangeViewModel4 = inventoryAndExchangeViewModel;
                    List<InvItems> itemsList4 = invSizeAndItemsObj.getItemsList();
                    Intrinsics.checkNotNull(itemsList4);
                    inventoryAndExchangeViewModel4.initSavedPos(itemsList4);
                }
            }));
            inventoryAndExchangeViewModel.getNewMyExchangeItems().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<List<InvItems>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<InvItems> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<InvItems> list) {
                    boolean z;
                    InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter;
                    InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter2;
                    int i;
                    z = UILayoutExchange.this.ifFirstShowOrClearMyExchangeItems;
                    if (z) {
                        UILayoutExchange.this.ifFirstShowOrClearMyExchangeItems = false;
                        inventoryExchangeAndTrunkAdapter2 = UILayoutExchange.this.yourExchangeItemsAndTrunkAdapter;
                        if (inventoryExchangeAndTrunkAdapter2 != null) {
                            Intrinsics.checkNotNull(list);
                            i = UILayoutExchange.this.initInvSize;
                            List<VehiclesDTO> value = inventoryAndExchangeViewModel.getVehicleItems().getValue();
                            if (value == null) {
                                value = CollectionsKt__CollectionsKt.emptyList();
                            }
                            List<SkinsDTO> value2 = inventoryAndExchangeViewModel.getSkinItems().getValue();
                            if (value2 == null) {
                                value2 = CollectionsKt__CollectionsKt.emptyList();
                            }
                            inventoryExchangeAndTrunkAdapter2.setItems(list, i, value, value2);
                            return;
                        }
                        return;
                    }
                    inventoryExchangeAndTrunkAdapter = UILayoutExchange.this.yourExchangeItemsAndTrunkAdapter;
                    if (inventoryExchangeAndTrunkAdapter != null) {
                        Intrinsics.checkNotNull(list);
                        inventoryExchangeAndTrunkAdapter.updateItems(list);
                    }
                }
            }));
            inventoryAndExchangeViewModel.getNewOtherExchangeItems().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<List<InvItems>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<InvItems> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<InvItems> list) {
                    boolean z;
                    InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter;
                    InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter2;
                    int i;
                    z = UILayoutExchange.this.ifFirstShowOrClearOtherExchangeItems;
                    if (z) {
                        UILayoutExchange.this.ifFirstShowOrClearOtherExchangeItems = false;
                        inventoryExchangeAndTrunkAdapter2 = UILayoutExchange.this.otherPlayersItemsAndTrunkAdapter;
                        if (inventoryExchangeAndTrunkAdapter2 != null) {
                            Intrinsics.checkNotNull(list);
                            i = UILayoutExchange.this.initInvSize;
                            List<VehiclesDTO> value = inventoryAndExchangeViewModel.getVehicleItems().getValue();
                            if (value == null) {
                                value = CollectionsKt__CollectionsKt.emptyList();
                            }
                            List<SkinsDTO> value2 = inventoryAndExchangeViewModel.getSkinItems().getValue();
                            if (value2 == null) {
                                value2 = CollectionsKt__CollectionsKt.emptyList();
                            }
                            inventoryExchangeAndTrunkAdapter2.setItems(list, i, value, value2);
                            return;
                        }
                        return;
                    }
                    inventoryExchangeAndTrunkAdapter = UILayoutExchange.this.otherPlayersItemsAndTrunkAdapter;
                    if (inventoryExchangeAndTrunkAdapter != null) {
                        Intrinsics.checkNotNull(list);
                        inventoryExchangeAndTrunkAdapter.updateItems(list);
                    }
                }
            }));
            inventoryAndExchangeViewModel.getNewOtherMoney().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$9
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke2(num);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable Integer num) {
                    UILayoutExchange.this.setOtherPlayersMoney(num);
                }
            }));
            inventoryAndExchangeViewModel.getNewOtherExchangeItemPos().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$10
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke2(num);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Integer num) {
                    InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter;
                    inventoryExchangeAndTrunkAdapter = UILayoutExchange.this.otherPlayersItemsAndTrunkAdapter;
                    if (inventoryExchangeAndTrunkAdapter != null) {
                        Intrinsics.checkNotNull(num);
                        inventoryExchangeAndTrunkAdapter.notifyItemChanged(num.intValue());
                    }
                }
            }));
            inventoryAndExchangeViewModel.getNewNewMessage().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<InvMessageObj, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$11
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InvMessageObj invMessageObj) {
                    invoke2(invMessageObj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(InvMessageObj invMessageObj) {
                    GUIUsersInventory gUIUsersInventory;
                    GUIUsersInventory gUIUsersInventory2;
                    UILayoutExchange uILayoutExchange = UILayoutExchange.this;
                    Intrinsics.checkNotNull(invMessageObj);
                    uILayoutExchange.updateNewMessage(invMessageObj);
                    gUIUsersInventory = UILayoutExchange.this.mainRoot;
                    gUIUsersInventory2 = UILayoutExchange.this.mainRoot;
                    gUIUsersInventory.updateCountWithNewMessages(gUIUsersInventory2.getCounter());
                }
            }));
            inventoryAndExchangeViewModel.getNewMyExchangeItemPos().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$12
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke2(num);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Integer num) {
                    InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter;
                    inventoryExchangeAndTrunkAdapter = UILayoutExchange.this.yourExchangeItemsAndTrunkAdapter;
                    if (inventoryExchangeAndTrunkAdapter != null) {
                        Intrinsics.checkNotNull(num);
                        inventoryExchangeAndTrunkAdapter.notifyItemChanged(num.intValue());
                    }
                }
            }));
            inventoryAndExchangeViewModel.getNewSavedInitPosInInv().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<List<Integer>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$13
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<Integer> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<Integer> list) {
                    UILayoutExchange uILayoutExchange = UILayoutExchange.this;
                    Intrinsics.checkNotNull(list);
                    uILayoutExchange.myInitInvItemsPos = list;
                }
            }));
            inventoryAndExchangeViewModel.getNewOldPosFromInv().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<List<Integer>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$14
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<Integer> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<Integer> list) {
                    UILayoutExchange uILayoutExchange = UILayoutExchange.this;
                    Intrinsics.checkNotNull(list);
                    uILayoutExchange.savedPosInInv = list;
                }
            }));
            inventoryAndExchangeViewModel.getNewNewInvPosition().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$15
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke2(num);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Integer num) {
                    InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter;
                    inventoryExchangeAndTrunkAdapter = UILayoutExchange.this.yourItemsAndTrunkAdapter;
                    if (inventoryExchangeAndTrunkAdapter != null) {
                        Intrinsics.checkNotNull(num);
                        inventoryExchangeAndTrunkAdapter.notifyItemChanged(num.intValue());
                    }
                }
            }));
            inventoryAndExchangeViewModel.getNewOldInvPosition().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$16
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke2(num);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Integer num) {
                    InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter;
                    inventoryExchangeAndTrunkAdapter = UILayoutExchange.this.yourItemsAndTrunkAdapter;
                    if (inventoryExchangeAndTrunkAdapter != null) {
                        Intrinsics.checkNotNull(num);
                        inventoryExchangeAndTrunkAdapter.notifyItemChanged(num.intValue());
                    }
                }
            }));
            inventoryAndExchangeViewModel.getNewNewSlotPosition().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$17
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke2(num);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Integer num) {
                    InventoryItemsInSlotAdapter inventoryItemsInSlotAdapter;
                    inventoryItemsInSlotAdapter = UILayoutExchange.this.itemsInSlotAdapter;
                    if (inventoryItemsInSlotAdapter != null) {
                        Intrinsics.checkNotNull(num);
                        inventoryItemsInSlotAdapter.notifyItemChanged(num.intValue());
                    }
                }
            }));
            inventoryAndExchangeViewModel.getNewSlotsInInventory().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<List<Integer>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$18
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<Integer> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<Integer> list) {
                    InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter;
                    if (list.size() != 2 || list.get(0).intValue() == list.get(1).intValue()) {
                        return;
                    }
                    UILayoutExchange.this.initInvSize = list.get(0).intValue();
                    inventoryExchangeAndTrunkAdapter = UILayoutExchange.this.yourItemsAndTrunkAdapter;
                    if (inventoryExchangeAndTrunkAdapter != null) {
                        inventoryExchangeAndTrunkAdapter.updateSize(list.get(0).intValue());
                    }
                }
            }));
            inventoryAndExchangeViewModel.getNewExchangeStatus().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$19
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke2(num);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Integer num) {
                    UILayoutExchange uILayoutExchange = UILayoutExchange.this;
                    Intrinsics.checkNotNull(num);
                    uILayoutExchange.exchangeStatus = num.intValue();
                }
            }));
            inventoryAndExchangeViewModel.getNewBlockStatus().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$20
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke2(bool);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Boolean bool) {
                    boolean z;
                    UILayoutExchange uILayoutExchange = UILayoutExchange.this;
                    Intrinsics.checkNotNull(bool);
                    uILayoutExchange.blockStatus = bool.booleanValue();
                    UILayoutExchange uILayoutExchange2 = UILayoutExchange.this;
                    z = uILayoutExchange2.blockStatus;
                    uILayoutExchange2.setEnableForEditText(z);
                }
            }));
            inventoryAndExchangeViewModel.getNewInvItems().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<List<InvItems>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$21
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<InvItems> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<InvItems> list) {
                    boolean z;
                    InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter;
                    int i;
                    z = UILayoutExchange.this.setInitState;
                    if (z) {
                        UILayoutExchange.this.setInitState = false;
                        inventoryExchangeAndTrunkAdapter = UILayoutExchange.this.yourItemsAndTrunkAdapter;
                        if (inventoryExchangeAndTrunkAdapter != null) {
                            Intrinsics.checkNotNull(list);
                            i = UILayoutExchange.this.initInvSize;
                            List<VehiclesDTO> value = inventoryAndExchangeViewModel.getVehicleItems().getValue();
                            if (value == null) {
                                value = CollectionsKt__CollectionsKt.emptyList();
                            }
                            List<SkinsDTO> value2 = inventoryAndExchangeViewModel.getSkinItems().getValue();
                            if (value2 == null) {
                                value2 = CollectionsKt__CollectionsKt.emptyList();
                            }
                            inventoryExchangeAndTrunkAdapter.setItems(list, i, value, value2);
                        }
                    }
                }
            }));
            inventoryAndExchangeViewModel.getSaveTheOldValueOfMoney().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$22
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke2(bool);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Boolean bool) {
                    UILayoutExchange.this.saveTheOldValueOfMoney();
                }
            }));
            inventoryAndExchangeViewModel.getReturnToTheOldValueOfMoney().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$23
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke2(bool);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Boolean bool) {
                    UILayoutExchange.this.returnToTheOldValueOfMoney();
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPlayersNick(String nick) {
        if (nick == null) {
            nick = "";
        }
        this.textIsFromOtherPlayer = getContext().getString(R.string.inv_title_other_player_exchange, nick);
        this.textIsFromYou = getContext().getString(R.string.inv_title_your_exchange, nick);
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        TextView textView = inventoryLayoutExchangeWithUserBinding != null ? inventoryLayoutExchangeWithUserBinding.exchangeMoneyFromText : null;
        if (textView == null) {
            return;
        }
        textView.setText(nick);
    }

    public final void setThisWeightInventory(int size) {
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        TextView textView = inventoryLayoutExchangeWithUserBinding != null ? inventoryLayoutExchangeWithUserBinding.exchangeTitleActualWeightUsers : null;
        if (textView == null) {
            return;
        }
        textView.setText(String.valueOf(size));
    }

    public final void setMaxWeightInventory(int size) {
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        TextView textView = inventoryLayoutExchangeWithUserBinding != null ? inventoryLayoutExchangeWithUserBinding.exchangeTitleMaxWeightUsers : null;
        if (textView == null) {
            return;
        }
        textView.setText(String.valueOf(size));
    }

    public final void setMyMoney(int money) {
        this.yourAllMoney = money;
        String string = getContext().getString(R.string.common_string_with_ruble, UsefulKt.getPriceWithSpaces(Integer.valueOf(money)));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        TextView textView = inventoryLayoutExchangeWithUserBinding != null ? inventoryLayoutExchangeWithUserBinding.exchangeValueMyMoney : null;
        if (textView == null) {
            return;
        }
        textView.setText(string);
    }

    public final void setOtherPlayersMoney(Integer money) {
        String string = getContext().getString(R.string.common_string_with_ruble, UsefulKt.getPriceWithSpaces(Integer.valueOf(money != null ? money.intValue() : 0)));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        TextView textView = inventoryLayoutExchangeWithUserBinding != null ? inventoryLayoutExchangeWithUserBinding.exchangeValueMoneyFrom : null;
        if (textView == null) {
            return;
        }
        textView.setText(string);
    }

    public final void setEmptyListOtherPlayers() {
        this.ifFirstShowOrClearOtherExchangeItems = true;
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel;
        if (inventoryAndExchangeViewModel != null) {
            inventoryAndExchangeViewModel.initOtherExchangeItems(this.initInvSize);
        }
    }

    public final void setEnableForEditText(boolean ifEnable) {
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        CustomEditText customEditText = inventoryLayoutExchangeWithUserBinding != null ? inventoryLayoutExchangeWithUserBinding.exchangeEdittextMoney : null;
        if (customEditText == null) {
            return;
        }
        customEditText.setEnabled(!ifEnable);
    }

    public final void saveTheOldValueOfMoney() {
        this.saveExchangeYourMoney = this.exchangeYourMoney;
    }

    public final void returnToTheOldValueOfMoney() {
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        if (inventoryLayoutExchangeWithUserBinding != null) {
            int i = this.saveExchangeYourMoney;
            if (i == 0) {
                Editable text = inventoryLayoutExchangeWithUserBinding.exchangeEdittextMoney.getText();
                if (text != null) {
                    text.clear();
                }
                inventoryLayoutExchangeWithUserBinding.exchangeTextMoney.setText("");
                return;
            }
            inventoryLayoutExchangeWithUserBinding.exchangeEdittextMoney.setText(String.valueOf(i));
            inventoryLayoutExchangeWithUserBinding.exchangeTextMoney.setText(UsefulKt.getPriceWithSpaces(Integer.valueOf(this.saveExchangeYourMoney)));
        }
    }

    public final void migrateFromExchangeToInv() {
        migrateItemFromExchange();
        clearInfoAboutExchange();
        clearInfoAboutInv();
    }

    public final void migrateItemFromExchange() {
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel;
        int i = this.intermediatePositionWithExchangeItem;
        if (i == -1 || (inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel) == null) {
            return;
        }
        inventoryAndExchangeViewModel.migrateItemFromExchangeToInv(i, this.valueFromExchange);
    }

    public final void migrateItemFromInvToExchange() {
        migrateItemFromInventory();
        clearInfoAboutInv();
        clearInfoAboutExchange();
    }

    public final void migrateItemFromInventory() {
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel;
        int i = this.intermediatePositionWithItem;
        if (i == -1 || (inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel) == null) {
            return;
        }
        inventoryAndExchangeViewModel.migrateItemFromInvToExchange(i, this.valueFromInv);
    }

    public final void setViewExchangeList(int thisView) {
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        if (inventoryLayoutExchangeWithUserBinding != null) {
            if (thisView == 0) {
                inventoryLayoutExchangeWithUserBinding.exchangeTextPlayersNick.setText(this.textIsFromYou);
                inventoryLayoutExchangeWithUserBinding.exchangeBgPlayersName.setBackgroundResource(R.drawable.bg_rectangle_orange_hgr_cr3);
                inventoryLayoutExchangeWithUserBinding.exchangeListItemsInCar.setAdapter(this.yourExchangeItemsAndTrunkAdapter);
            } else {
                if (thisView != 1) {
                    return;
                }
                inventoryLayoutExchangeWithUserBinding.exchangeTextPlayersNick.setText(this.textIsFromOtherPlayer);
                inventoryLayoutExchangeWithUserBinding.exchangeBgPlayersName.setBackgroundResource(R.drawable.bg_rectangle_dark_green_vgr_cr3);
                inventoryLayoutExchangeWithUserBinding.exchangeListItemsInCar.setAdapter(this.otherPlayersItemsAndTrunkAdapter);
            }
        }
    }

    public final void migrateFromSlotToInventory() {
        migrateItemFromSlotToInventory();
        clearInfoAboutSlot();
        clearInfoAboutInv();
    }

    public final void migrateItemFromSlotToInventory() {
        int i;
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel;
        int i2 = this.intermediatePositionFromSlot;
        if (i2 == -1 || (i = this.intermediatePositionWithItem) == -1 || (inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel) == null) {
            return;
        }
        inventoryAndExchangeViewModel.migrateItemFromSlotToInv(i2, i);
    }

    public final void changeButtonAndHelpInfo(boolean isBothApply) {
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        if (inventoryLayoutExchangeWithUserBinding != null) {
            if (isBothApply) {
                inventoryLayoutExchangeWithUserBinding.exchangeButtonApply.setText(getContext().getText(R.string.common_apply));
                inventoryLayoutExchangeWithUserBinding.exchangeTextInfo.setText(getContext().getText(R.string.inv_text_info_if_apply_exchange));
            } else {
                inventoryLayoutExchangeWithUserBinding.exchangeButtonApply.setText(getContext().getText(R.string.inv_title_button_exchange));
                inventoryLayoutExchangeWithUserBinding.exchangeTextInfo.setText(getContext().getText(R.string.inv_text_info));
            }
        }
    }

    public final void setClearClickInLists() {
        InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = this.yourItemsAndTrunkAdapter;
        if (inventoryExchangeAndTrunkAdapter != null) {
            inventoryExchangeAndTrunkAdapter.setCheckOnlyElement(-1);
        }
        InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter2 = this.yourExchangeItemsAndTrunkAdapter;
        if (inventoryExchangeAndTrunkAdapter2 != null) {
            inventoryExchangeAndTrunkAdapter2.setCheckOnlyElement(-1);
        }
        InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter3 = this.otherPlayersItemsAndTrunkAdapter;
        if (inventoryExchangeAndTrunkAdapter3 != null) {
            inventoryExchangeAndTrunkAdapter3.setCheckOnlyElement(-1);
        }
        this.intermediatePositionWithItem = -1;
        this.intermediatePositionWithExchangeItem = -1;
        this.intermediatePositionFromSlot = -1;
        this.positionWithItem = -1;
        this.positionWithExchangeItem = -1;
        this.positionFromSlot = -1;
    }

    public final void updateChangeStatus(int getStatus) {
        if (getStatus == 1) {
            InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel;
            if (inventoryAndExchangeViewModel != null) {
                inventoryAndExchangeViewModel.setBlockStatus(true);
                inventoryAndExchangeViewModel.updateExchangeStatus(1);
            }
            changeButtonAndHelpInfo(false);
            return;
        }
        if (getStatus == 2) {
            InventoryAndExchangeViewModel inventoryAndExchangeViewModel2 = this.inventoryAndExchangeViewModel;
            if (inventoryAndExchangeViewModel2 != null) {
                inventoryAndExchangeViewModel2.setBlockStatus(false);
                inventoryAndExchangeViewModel2.updateExchangeStatus(0);
            }
            changeButtonAndHelpInfo(false);
            return;
        }
        if (getStatus == 3) {
            InventoryAndExchangeViewModel inventoryAndExchangeViewModel3 = this.inventoryAndExchangeViewModel;
            if (inventoryAndExchangeViewModel3 != null) {
                inventoryAndExchangeViewModel3.setBlockStatus(false);
                inventoryAndExchangeViewModel3.updateExchangeStatus(0);
            }
            clearMyInterface();
            return;
        }
        if (getStatus == 4) {
            InventoryAndExchangeViewModel inventoryAndExchangeViewModel4 = this.inventoryAndExchangeViewModel;
            if (inventoryAndExchangeViewModel4 != null) {
                inventoryAndExchangeViewModel4.setBlockStatus(false);
            }
            this.mainRoot.layoutListener(0, false);
            return;
        }
        if (getStatus == 5) {
            InventoryAndExchangeViewModel inventoryAndExchangeViewModel5 = this.inventoryAndExchangeViewModel;
            if (inventoryAndExchangeViewModel5 != null) {
                inventoryAndExchangeViewModel5.setBlockStatus(false);
            }
            setEmptyListOtherPlayers();
            InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = this.otherPlayersItemsAndTrunkAdapter;
            if (inventoryExchangeAndTrunkAdapter != null) {
                inventoryExchangeAndTrunkAdapter.notifyDataSetChanged();
            }
            setOtherPlayersMoney(0);
            return;
        }
        if (getStatus == 8) {
            InventoryAndExchangeViewModel inventoryAndExchangeViewModel6 = this.inventoryAndExchangeViewModel;
            if (inventoryAndExchangeViewModel6 != null) {
                inventoryAndExchangeViewModel6.setBlockStatus(true);
                inventoryAndExchangeViewModel6.updateExchangeStatus(1);
            }
            setClearClickInLists();
            return;
        }
        if (getStatus != 26) {
            return;
        }
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel7 = this.inventoryAndExchangeViewModel;
        if (inventoryAndExchangeViewModel7 != null) {
            inventoryAndExchangeViewModel7.setBlockStatus(true);
            inventoryAndExchangeViewModel7.updateExchangeStatus(2);
        }
        changeButtonAndHelpInfo(true);
    }

    public final void clearMyInterface() {
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        if (inventoryLayoutExchangeWithUserBinding != null) {
            Editable text = inventoryLayoutExchangeWithUserBinding.exchangeEdittextMoney.getText();
            if (text != null) {
                text.clear();
            }
            inventoryLayoutExchangeWithUserBinding.exchangeTextMoney.setText("");
            inventoryLayoutExchangeWithUserBinding.exchangeTitleActualWeightUsers.setText(String.valueOf(this.startThisWeight));
        }
        this.ifFirstShowOrClearMyExchangeItems = true;
        this.setInitState = true;
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel;
        if (inventoryAndExchangeViewModel != null) {
            inventoryAndExchangeViewModel.setInitState();
        }
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
        closePopupWindows();
        closeChat();
        this.dialogChat = null;
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel;
        if (inventoryAndExchangeViewModel != null) {
            inventoryAndExchangeViewModel.setInitState();
        }
        removeObservers();
    }

    public final void removeObservers() {
        LifecycleOwner viewLifecycleOwner = this.mainRoot.getViewLifecycleOwner();
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel;
        if (inventoryAndExchangeViewModel != null) {
            inventoryAndExchangeViewModel.getNewOtherPlayersNick().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewCurrentWeight().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewMaxWeight().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewMyMoney().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewSlotItems().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewMediatorInvItemsAndSize().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewMyExchangeItems().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewOtherExchangeItems().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewOtherMoney().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewOtherExchangeItemPos().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewNewMessage().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewMyExchangeItemPos().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewSavedInitPosInInv().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewOldPosFromInv().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewNewInvPosition().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewOldInvPosition().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewNewSlotPosition().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewItemFromSlot().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewSlotsInInventory().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewExchangeStatus().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewBlockStatus().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewInvItems().removeObservers(viewLifecycleOwner);
        }
    }

    public final void updateCountWithNewMessages(int count) {
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        if (inventoryLayoutExchangeWithUserBinding != null) {
            if (count > 0) {
                inventoryLayoutExchangeWithUserBinding.exchangeTextValueMessage.setVisibility(0);
                inventoryLayoutExchangeWithUserBinding.exchangeTextValueMessage.setText(String.valueOf(count));
            } else {
                inventoryLayoutExchangeWithUserBinding.exchangeTextValueMessage.setVisibility(4);
            }
        }
    }

    public final void removeFocusableForEditText() {
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        if (inventoryLayoutExchangeWithUserBinding != null) {
            Object systemService = this.mainRoot.requireActivity().getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(inventoryLayoutExchangeWithUserBinding.getRoot().getWindowToken(), 0);
            inventoryLayoutExchangeWithUserBinding.exchangeEdittextMoney.setFocusable(false);
            inventoryLayoutExchangeWithUserBinding.exchangeEdittextMoney.setFocusableInTouchMode(true);
        }
    }

    public final void showChat() {
        UIChat uIChat = this.dialogChat;
        if (uIChat != null) {
            uIChat.showDialogChat();
        }
    }

    public final void updateNewMessage(InvMessageObj newMessage) {
        UIChat uIChat = this.dialogChat;
        if (uIChat != null) {
            uIChat.setNewMessage(newMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearInfoAboutSlot() {
        this.idFromSlot = 0;
        this.modelIdFromSlot = 0;
        this.valueFromSlot = 0;
        this.intermediatePositionFromSlot = -1;
        this.positionFromSlot = -1;
        InventoryItemsInSlotAdapter inventoryItemsInSlotAdapter = this.itemsInSlotAdapter;
        if (inventoryItemsInSlotAdapter != null) {
            inventoryItemsInSlotAdapter.setCheckOnlyElement(-1);
        }
    }

    public final void clearInfoAboutInv() {
        this.itemInInv = null;
        this.idFromInv = 0;
        this.modelIdFromInv = 0;
        this.valueFromInv = 0;
        this.simCardNumberFromInv = 0;
        this.positionWithItem = -1;
        this.intermediatePositionWithItem = -1;
        InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = this.yourItemsAndTrunkAdapter;
        if (inventoryExchangeAndTrunkAdapter != null) {
            inventoryExchangeAndTrunkAdapter.setCheckOnlyElement(-1);
        }
    }

    public final void clearInfoAboutExchange() {
        this.itemInExchange = null;
        this.idFromExchange = 0;
        this.modelIdFromExchange = 0;
        this.valueFromExchange = 0;
        this.simCardNumberFromExchange = 0;
        this.intermediatePositionWithExchangeItem = -1;
        this.positionWithExchangeItem = -1;
        InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = this.yourExchangeItemsAndTrunkAdapter;
        if (inventoryExchangeAndTrunkAdapter != null) {
            inventoryExchangeAndTrunkAdapter.setCheckOnlyElement(-1);
        }
    }

    public final void setDefaultParams() {
        this.startThisWeight = 0;
        this.textIsFromOtherPlayer = "";
        this.textIsFromYou = "";
        this.exchangeYourMoney = 0;
        this.oldTimeWithMigrate = 0L;
        this.oldTimeAfterCheck = 0L;
        this.sendCounter = 0;
        this.yourAllMoney = 0;
        this.initInvSize = 0;
        this.ifFirstShow = true;
        this.isFirstShowSlot = true;
        this.isFirstShowInv = true;
        this.ifFirstShowOrClearMyExchangeItems = true;
        this.ifFirstShowOrClearOtherExchangeItems = true;
        this.blockStatus = false;
        this.setInitState = false;
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel;
        if (inventoryAndExchangeViewModel != null) {
            inventoryAndExchangeViewModel.setOtherMoney(null);
        }
    }

    public final void setNullableParameters() {
        closePopupWindows();
        closeChat();
        this.binding = null;
        this.dialogForMigrateItem = null;
        this.clickListenerDialogForMigrateItems = null;
        this.itemInInv = null;
        this.itemInExchange = null;
        this.yourItemsAndTrunkAdapter = null;
        this.yourExchangeItemsAndTrunkAdapter = null;
        this.otherPlayersItemsAndTrunkAdapter = null;
        this.onYourItemsClickListener = null;
        this.onYourExchangeItemsClickListener = null;
        this.emptyClickListener = null;
        this.itemsInSlotAdapter = null;
        this.onItemsInSlotClickListener = null;
    }

    private final void closePopupWindows() {
        NewDialogForMigrateItems newDialogForMigrateItems = this.dialogForMigrateItem;
        if (newDialogForMigrateItems != null) {
            newDialogForMigrateItems.closeDialogForMigrate();
        }
    }

    public final void closeChat() {
        UIChat uIChat = this.dialogChat;
        if (uIChat != null) {
            uIChat.closeChat();
        }
    }
}
