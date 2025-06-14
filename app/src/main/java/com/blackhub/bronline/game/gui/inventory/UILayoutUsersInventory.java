package com.blackhub.bronline.game.gui.inventory;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.InventoryLayoutUsersInventoryBinding;
import com.blackhub.bronline.game.common.UILayout;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.inventory.adapters.InventoryActionButtonsAdapter;
import com.blackhub.bronline.game.gui.inventory.adapters.InventoryItemsAdapter;
import com.blackhub.bronline.game.gui.inventory.adapters.InventoryItemsInSlotAdapter;
import com.blackhub.bronline.game.gui.inventory.adapters.InventoryPlayersStatesAdapter;
import com.blackhub.bronline.game.gui.inventory.data.InvActionButtonsData;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.gui.inventory.data.InvPlayersStateData;
import com.blackhub.bronline.game.gui.inventory.data.InvSizeAndItemsObj;
import com.blackhub.bronline.game.gui.inventory.network.CarTrunkOrClosetActionsWithJSON;
import com.blackhub.bronline.game.gui.inventory.network.InvActionWithJSON;
import com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel;
import com.blackhub.bronline.game.gui.playerslist.utils.PlayersListUtilsKt;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.caverock.androidsvg.SVG;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UILayoutUsersInventory.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007¢\u0006\u0002\u0010\nJ\u0016\u0010W\u001a\u00020\u00172\f\u0010X\u001a\b\u0012\u0004\u0012\u00020M04H\u0002J\u0006\u0010Y\u001a\u00020\u0017J\u0006\u0010Z\u001a\u00020\u0017J\b\u0010[\u001a\u00020\u0017H\u0002J\b\u0010\\\u001a\u00020\u0017H\u0002J\u0006\u0010]\u001a\u00020\u0017J\u0006\u0010^\u001a\u00020\u0017J\n\u0010_\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010`\u001a\u00020\u0017H\u0002J\b\u0010a\u001a\u00020\u0017H\u0002J\b\u0010b\u001a\u00020\u0017H\u0002J\b\u0010c\u001a\u00020\u0017H\u0002J\b\u0010d\u001a\u00020\u0017H\u0002J\b\u0010e\u001a\u00020\u0017H\u0002J\b\u0010f\u001a\u00020\u0017H\u0002J\u000e\u0010g\u001a\u00020\u00172\u0006\u0010h\u001a\u00020\fJ\u0006\u0010i\u001a\u00020\u0017J\u0006\u0010j\u001a\u00020\u0017J\u001c\u0010k\u001a\u0004\u0018\u00010\u00152\u0006\u0010l\u001a\u00020m2\b\u0010n\u001a\u0004\u0018\u00010oH\u0016J\b\u0010p\u001a\u00020\u0017H\u0016J\b\u0010q\u001a\u00020\u0017H\u0016J\b\u0010r\u001a\u00020\u0017H\u0002J\u0010\u0010s\u001a\u00020\u00172\u0006\u0010t\u001a\u00020\fH\u0002J\u0010\u0010u\u001a\u00020\u00172\u0006\u0010N\u001a\u00020MH\u0002J\u0010\u0010v\u001a\u00020\u00172\u0006\u0010w\u001a\u00020\fH\u0002J\u0006\u0010x\u001a\u00020\u0017J\b\u0010y\u001a\u00020\u0017H\u0002J\u0010\u0010z\u001a\u00020\u00172\u0006\u0010{\u001a\u00020\fH\u0002J\u0010\u0010|\u001a\u00020\u00172\u0006\u0010}\u001a\u00020\fH\u0002J\u0010\u0010~\u001a\u00020\u00172\u0006\u0010\u007f\u001a\u00020\bH\u0002J\t\u0010\u0080\u0001\u001a\u00020\u0017H\u0002J\u0012\u0010\u0081\u0001\u001a\u00020\u00172\u0007\u0010\u0082\u0001\u001a\u00020\fH\u0002J\u0012\u0010\u0083\u0001\u001a\u00020\u00172\u0007\u0010\u0084\u0001\u001a\u00020\fH\u0002J\u0012\u0010\u0085\u0001\u001a\u00020\u00172\u0007\u0010\u0086\u0001\u001a\u00020\fH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000RF\u0010\u000f\u001a:\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0010j\u0004\u0018\u0001`\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020504X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u00106\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b7\u00108R\u001b\u0010;\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b<\u00108R\u001b\u0010>\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010:\u001a\u0004\b?\u00108R\u000e\u0010A\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010G\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KRF\u0010L\u001a:\u0012\u0013\u0012\u00110M¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(O\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0010j\u0004\u0018\u0001`PX\u0082\u000e¢\u0006\u0002\n\u0000RF\u0010Q\u001a:\u0012\u0013\u0012\u00110M¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(O\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0010j\u0004\u0018\u0001`PX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010R\u001a\u0004\u0018\u00010SX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0087\u0001"}, d2 = {"Lcom/blackhub/bronline/game/gui/inventory/UILayoutUsersInventory;", "Lcom/blackhub/bronline/game/common/UILayout;", "mainRoot", "Lcom/blackhub/bronline/game/gui/inventory/GUIUsersInventory;", "inventoryAndExchangeViewModel", "Lcom/blackhub/bronline/game/gui/inventory/viewmodel/InventoryAndExchangeViewModel;", "itemRender", "Landroidx/collection/ArrayMap;", "", "Landroid/graphics/Bitmap;", "(Lcom/blackhub/bronline/game/gui/inventory/GUIUsersInventory;Lcom/blackhub/bronline/game/gui/inventory/viewmodel/InventoryAndExchangeViewModel;Landroidx/collection/ArrayMap;)V", "actionBlockCounter", "", "actionBlockTimer", "", "actionClickListener", "Lkotlin/Function2;", "Lcom/blackhub/bronline/game/gui/inventory/data/InvActionButtonsData;", "Lkotlin/ParameterName;", "name", "actionButton", "Landroid/view/View;", SVG.View.NODE_NAME, "", "Lcom/blackhub/bronline/game/gui/inventory/adapters/OnActionButtonsClickListener;", "actionsAdapter", "Lcom/blackhub/bronline/game/gui/inventory/adapters/InventoryActionButtonsAdapter;", "anim", "Landroid/view/animation/Animation;", "binding", "Lcom/blackhub/bronline/databinding/InventoryLayoutUsersInventoryBinding;", "currentContext", "Landroid/content/Context;", "intermediateOldPositionInInvIfUsed", "getIntermediateOldPositionInInvIfUsed", "()I", "setIntermediateOldPositionInInvIfUsed", "(I)V", "intermediatePositionInInv", "intermediatePositionInSlot", "getIntermediatePositionInSlot", "setIntermediatePositionInSlot", "invDialogDelete", "Lcom/blackhub/bronline/game/gui/inventory/InvDialogDelete;", "inventoryItemsAdapter", "Lcom/blackhub/bronline/game/gui/inventory/adapters/InventoryItemsAdapter;", "isFirstShowInv", "", "isFirstShowSlot", "itemsInSlotAdapter", "Lcom/blackhub/bronline/game/gui/inventory/adapters/InventoryItemsInSlotAdapter;", "listPlayersStates", "", "Lcom/blackhub/bronline/game/gui/inventory/data/InvPlayersStateData;", "messageErrorFromRes", "getMessageErrorFromRes", "()Ljava/lang/String;", "messageErrorFromRes$delegate", "Lkotlin/Lazy;", "messageErrorItemNotCheck", "getMessageErrorItemNotCheck", "messageErrorItemNotCheck$delegate", "messagePleaseWait", "getMessagePleaseWait", "messagePleaseWait$delegate", "migrateCounter", "oldInvId", "oldInvValue", "oldPositionWithItem", "oldSlotId", "oldSlotValue", "oldTimeWithMigrateAndUsed", "getOldTimeWithMigrateAndUsed", "()J", "setOldTimeWithMigrateAndUsed", "(J)V", "onItemsClickListener", "Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", "item", "position", "Lcom/blackhub/bronline/game/gui/inventory/OnItemsClickListener;", "onItemsInSlotClickListener", "playersStatesAdapter", "Lcom/blackhub/bronline/game/gui/inventory/adapters/InventoryPlayersStatesAdapter;", "positionFromSlot", "positionInInventory", "timerBlockCheck", "changeStatusWhoseItem", "myList", "clearInfoAboutInv", "clearInfoAboutSlot", "clearInfoIfEmptyValue", "clearItemsInfo", "deleteItem", "deleteThisItem", "getView", "initActionClickListener", "initDataInInventoryInView", "initDataInSlotsView", "initDataPlayersButtonsActionInView", "initDataPlayersStateInfoInView", "initItemsClickListener", "initSlotsClickListener", "migrateDataFromInvToSlot", "newPosition", "migrateDataFromSlotToInv", "migrateDataInInv", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onLayoutClose", "onLayoutShown", "removeObservers", "renderMainSkin", "modelId", "setInfoAboutItem", "setMaxWeight", "maxWeight", "setNullableParameters", "setObservers", "setPlayersId", "playersId", "setPlayersLevel", "level", "setPlayersNick", PlayersListUtilsKt.KEY_GET_PLAYER_NICK, "setStartParams", "setThisWeight", "thisWeight", "setVIPStatus", "vipStatus", "updateHungerParameter", "newValueDinner", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NotifyDataSetChanged"})
@SourceDebugExtension({"SMAP\nUILayoutUsersInventory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UILayoutUsersInventory.kt\ncom/blackhub/bronline/game/gui/inventory/UILayoutUsersInventory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,763:1\n1#2:764\n*E\n"})
/* loaded from: classes3.dex */
public final class UILayoutUsersInventory extends UILayout {
    public static final int $stable = 8;
    public int actionBlockCounter;
    public long actionBlockTimer;

    @Nullable
    public Function2<? super InvActionButtonsData, ? super View, Unit> actionClickListener;

    @Nullable
    public InventoryActionButtonsAdapter actionsAdapter;

    @Nullable
    public Animation anim;

    @Nullable
    public InventoryLayoutUsersInventoryBinding binding;

    @Nullable
    public Context currentContext;
    public int intermediateOldPositionInInvIfUsed;
    public int intermediatePositionInInv;
    public int intermediatePositionInSlot;

    @Nullable
    public InvDialogDelete invDialogDelete;

    @Nullable
    public final InventoryAndExchangeViewModel inventoryAndExchangeViewModel;

    @Nullable
    public InventoryItemsAdapter inventoryItemsAdapter;
    public boolean isFirstShowInv;
    public boolean isFirstShowSlot;

    @NotNull
    public final ArrayMap<String, Bitmap> itemRender;

    @Nullable
    public InventoryItemsInSlotAdapter itemsInSlotAdapter;

    @NotNull
    public final List<InvPlayersStateData> listPlayersStates;

    @NotNull
    public final GUIUsersInventory mainRoot;

    /* renamed from: messageErrorFromRes$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy messageErrorFromRes;

    /* renamed from: messageErrorItemNotCheck$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy messageErrorItemNotCheck;

    /* renamed from: messagePleaseWait$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy messagePleaseWait;
    public int migrateCounter;
    public int oldInvId;
    public int oldInvValue;
    public int oldPositionWithItem;
    public int oldSlotId;
    public int oldSlotValue;
    public long oldTimeWithMigrateAndUsed;

    @Nullable
    public Function2<? super InvItems, ? super Integer, Unit> onItemsClickListener;

    @Nullable
    public Function2<? super InvItems, ? super Integer, Unit> onItemsInSlotClickListener;

    @Nullable
    public InventoryPlayersStatesAdapter playersStatesAdapter;
    public int positionFromSlot;
    public int positionInInventory;
    public long timerBlockCheck;

    public UILayoutUsersInventory(@NotNull GUIUsersInventory mainRoot, @Nullable InventoryAndExchangeViewModel inventoryAndExchangeViewModel, @NotNull ArrayMap<String, Bitmap> itemRender) {
        Intrinsics.checkNotNullParameter(mainRoot, "mainRoot");
        Intrinsics.checkNotNullParameter(itemRender, "itemRender");
        this.mainRoot = mainRoot;
        this.inventoryAndExchangeViewModel = inventoryAndExchangeViewModel;
        this.itemRender = itemRender;
        this.positionInInventory = -1;
        this.oldPositionWithItem = -1;
        this.intermediatePositionInInv = -1;
        this.intermediateOldPositionInInvIfUsed = -1;
        this.intermediatePositionInSlot = -1;
        this.positionFromSlot = -1;
        this.isFirstShowInv = true;
        this.isFirstShowSlot = true;
        this.messageErrorFromRes = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$messageErrorFromRes$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return UILayoutUsersInventory.this.getContext().getString(R.string.inv_trunk_message_error);
            }
        });
        this.messageErrorItemNotCheck = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$messageErrorItemNotCheck$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return UILayoutUsersInventory.this.getContext().getString(R.string.inv_text_item_not_check);
            }
        });
        this.messagePleaseWait = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$messagePleaseWait$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return UILayoutUsersInventory.this.getContext().getString(R.string.inv_text_please_wait);
            }
        });
        this.listPlayersStates = CollectionsKt__CollectionsKt.mutableListOf(new InvPlayersStateData(0, 0, 0, R.drawable.ic_bug_white), new InvPlayersStateData(1, 0, 100, R.drawable.ic_dinner));
    }

    public final int getIntermediateOldPositionInInvIfUsed() {
        return this.intermediateOldPositionInInvIfUsed;
    }

    public final void setIntermediateOldPositionInInvIfUsed(int i) {
        this.intermediateOldPositionInInvIfUsed = i;
    }

    public final int getIntermediatePositionInSlot() {
        return this.intermediatePositionInSlot;
    }

    public final void setIntermediatePositionInSlot(int i) {
        this.intermediatePositionInSlot = i;
    }

    public final long getOldTimeWithMigrateAndUsed() {
        return this.oldTimeWithMigrateAndUsed;
    }

    public final void setOldTimeWithMigrateAndUsed(long j) {
        this.oldTimeWithMigrateAndUsed = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getMessageErrorFromRes() {
        return (String) this.messageErrorFromRes.getValue();
    }

    public final String getMessageErrorItemNotCheck() {
        return (String) this.messageErrorItemNotCheck.getValue();
    }

    public final String getMessagePleaseWait() {
        return (String) this.messagePleaseWait.getValue();
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @Nullable
    /* renamed from: getView */
    public View getMViewRoot() {
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        if (inventoryLayoutUsersInventoryBinding != null) {
            return inventoryLayoutUsersInventoryBinding.getRoot();
        }
        return null;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        LinearLayout root;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        InventoryLayoutUsersInventoryBinding inflate = InventoryLayoutUsersInventoryBinding.inflate(inflater);
        this.binding = inflate;
        this.currentContext = (inflate == null || (root = inflate.getRoot()) == null) ? null : root.getContext();
        this.anim = AnimationUtils.loadAnimation(getContext(), R.anim.button_click);
        this.invDialogDelete = new InvDialogDelete(this);
        initItemsClickListener();
        initActionClickListener();
        initSlotsClickListener();
        initDataPlayersButtonsActionInView();
        initDataPlayersStateInfoInView();
        initDataInInventoryInView();
        initDataInSlotsView();
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        if (inventoryLayoutUsersInventoryBinding != null) {
            return inventoryLayoutUsersInventoryBinding.getRoot();
        }
        return null;
    }

    public final void initItemsClickListener() {
        this.onItemsClickListener = new Function2<InvItems, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$initItemsClickListener$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InvItems invItems, Integer num) {
                invoke(invItems, num.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull InvItems item, int position) {
                long j;
                InventoryItemsAdapter inventoryItemsAdapter;
                InventoryItemsInSlotAdapter inventoryItemsInSlotAdapter;
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                int i11;
                int i12;
                int i13;
                int i14;
                String messageErrorFromRes;
                int i15;
                int i16;
                int i17;
                int unused;
                Intrinsics.checkNotNullParameter(item, "item");
                long currentTimeMillis = System.currentTimeMillis();
                j = UILayoutUsersInventory.this.timerBlockCheck;
                if (currentTimeMillis - j > 500) {
                    UILayoutUsersInventory.this.timerBlockCheck = System.currentTimeMillis();
                    item.setCheck(true);
                    UILayoutUsersInventory.this.positionInInventory = position;
                    inventoryItemsAdapter = UILayoutUsersInventory.this.inventoryItemsAdapter;
                    if (inventoryItemsAdapter != null) {
                        inventoryItemsAdapter.setCheckOnlyElement(position);
                    }
                    inventoryItemsInSlotAdapter = UILayoutUsersInventory.this.itemsInSlotAdapter;
                    if (inventoryItemsInSlotAdapter != null) {
                        inventoryItemsInSlotAdapter.setCheckOnlyElement(-1);
                    }
                    UILayoutUsersInventory.this.setInfoAboutItem(item);
                    if (item.getItemsValue() != 0) {
                        UILayoutUsersInventory.this.oldPositionWithItem = position;
                        UILayoutUsersInventory.this.oldInvValue = item.getItemsValue();
                        UILayoutUsersInventory.this.oldInvId = item.getId();
                        UILayoutUsersInventory.this.clearInfoAboutSlot();
                        return;
                    }
                    i = UILayoutUsersInventory.this.oldPositionWithItem;
                    if (i != -1) {
                        i12 = UILayoutUsersInventory.this.oldInvValue;
                        if (i12 != 0) {
                            if (System.currentTimeMillis() - UILayoutUsersInventory.this.getOldTimeWithMigrateAndUsed() <= 1000) {
                                i13 = UILayoutUsersInventory.this.migrateCounter;
                                if (i13 == 0) {
                                    CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON = CarTrunkOrClosetActionsWithJSON.INSTANCE;
                                    messageErrorFromRes = UILayoutUsersInventory.this.getMessageErrorFromRes();
                                    Intrinsics.checkNotNullExpressionValue(messageErrorFromRes, "access$getMessageErrorFromRes(...)");
                                    carTrunkOrClosetActionsWithJSON.sendMessageError(messageErrorFromRes);
                                }
                                UILayoutUsersInventory uILayoutUsersInventory = UILayoutUsersInventory.this;
                                i14 = uILayoutUsersInventory.migrateCounter;
                                uILayoutUsersInventory.migrateCounter = i14 + 1;
                                unused = uILayoutUsersInventory.migrateCounter;
                                return;
                            }
                            UILayoutUsersInventory.this.setOldTimeWithMigrateAndUsed(System.currentTimeMillis());
                            UILayoutUsersInventory.this.intermediatePositionInInv = position;
                            UILayoutUsersInventory uILayoutUsersInventory2 = UILayoutUsersInventory.this;
                            i15 = uILayoutUsersInventory2.oldPositionWithItem;
                            uILayoutUsersInventory2.setIntermediateOldPositionInInvIfUsed(i15);
                            InvActionWithJSON invActionWithJSON = InvActionWithJSON.INSTANCE;
                            i16 = UILayoutUsersInventory.this.oldInvId;
                            i17 = UILayoutUsersInventory.this.oldPositionWithItem;
                            invActionWithJSON.sendIdWithOldAndNewPositionsToServer(23, i16, i17, position);
                            UILayoutUsersInventory.this.migrateCounter = 0;
                            return;
                        }
                    }
                    i2 = UILayoutUsersInventory.this.positionFromSlot;
                    if (i2 != -1) {
                        i3 = UILayoutUsersInventory.this.oldSlotValue;
                        if (i3 != 0) {
                            i4 = UILayoutUsersInventory.this.oldSlotId;
                            if (i4 == 58) {
                                UILayoutUsersInventory.this.intermediatePositionInInv = position;
                                UILayoutUsersInventory uILayoutUsersInventory3 = UILayoutUsersInventory.this;
                                i5 = uILayoutUsersInventory3.positionFromSlot;
                                uILayoutUsersInventory3.setIntermediatePositionInSlot(i5);
                                InvActionWithJSON invActionWithJSON2 = InvActionWithJSON.INSTANCE;
                                i6 = UILayoutUsersInventory.this.oldSlotId;
                                invActionWithJSON2.sendIdAndPositionToServer(32, i6, position);
                                return;
                            }
                            if (i4 != 134) {
                                UILayoutUsersInventory.this.intermediatePositionInInv = position;
                                UILayoutUsersInventory uILayoutUsersInventory4 = UILayoutUsersInventory.this;
                                i9 = uILayoutUsersInventory4.positionFromSlot;
                                uILayoutUsersInventory4.setIntermediatePositionInSlot(i9);
                                i10 = UILayoutUsersInventory.this.positionFromSlot;
                                InvActionWithJSON invActionWithJSON3 = InvActionWithJSON.INSTANCE;
                                i11 = UILayoutUsersInventory.this.oldSlotId;
                                invActionWithJSON3.sendIdWithOldAndNewPositionsToServer(4, i11, i10 - 2, position);
                                return;
                            }
                            UILayoutUsersInventory.this.intermediatePositionInInv = position;
                            UILayoutUsersInventory uILayoutUsersInventory5 = UILayoutUsersInventory.this;
                            i7 = uILayoutUsersInventory5.positionFromSlot;
                            uILayoutUsersInventory5.setIntermediatePositionInSlot(i7);
                            InvActionWithJSON invActionWithJSON4 = InvActionWithJSON.INSTANCE;
                            i8 = UILayoutUsersInventory.this.oldSlotId;
                            invActionWithJSON4.sendIdWithOldAndNewPositionsToServer(4, i8, 6, position);
                        }
                    }
                }
            }
        };
    }

    public final void initActionClickListener() {
        this.actionClickListener = new Function2<InvActionButtonsData, View, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$initActionClickListener$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InvActionButtonsData invActionButtonsData, View view) {
                invoke2(invActionButtonsData, view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(@NotNull InvActionButtonsData actionButton, @NotNull View view) {
                long j;
                int i;
                String messagePleaseWait;
                int i2;
                Animation animation;
                int i3;
                InvDialogDelete invDialogDelete;
                String messageErrorItemNotCheck;
                int i4;
                String messageErrorItemNotCheck2;
                int i5;
                int i6;
                int i7;
                int i8;
                int unused;
                Intrinsics.checkNotNullParameter(actionButton, "actionButton");
                Intrinsics.checkNotNullParameter(view, "view");
                long currentTimeMillis = System.currentTimeMillis();
                j = UILayoutUsersInventory.this.actionBlockTimer;
                if (currentTimeMillis - j <= 1000) {
                    i = UILayoutUsersInventory.this.actionBlockCounter;
                    if (i == 0) {
                        CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON = CarTrunkOrClosetActionsWithJSON.INSTANCE;
                        messagePleaseWait = UILayoutUsersInventory.this.getMessagePleaseWait();
                        Intrinsics.checkNotNullExpressionValue(messagePleaseWait, "access$getMessagePleaseWait(...)");
                        carTrunkOrClosetActionsWithJSON.sendMessageError(messagePleaseWait);
                        UILayoutUsersInventory uILayoutUsersInventory = UILayoutUsersInventory.this;
                        i2 = uILayoutUsersInventory.actionBlockCounter;
                        uILayoutUsersInventory.actionBlockCounter = i2 + 1;
                        unused = uILayoutUsersInventory.actionBlockCounter;
                        return;
                    }
                    return;
                }
                UILayoutUsersInventory.this.actionBlockTimer = System.currentTimeMillis();
                animation = UILayoutUsersInventory.this.anim;
                view.startAnimation(animation);
                UILayoutUsersInventory.this.actionBlockCounter = 0;
                int typeMenu = actionButton.getTypeMenu();
                if (typeMenu == 7) {
                    InvActionWithJSON.INSTANCE.sendPressButton(25);
                    return;
                }
                if (typeMenu == 9) {
                    i3 = UILayoutUsersInventory.this.oldPositionWithItem;
                    if (i3 != -1) {
                        invDialogDelete = UILayoutUsersInventory.this.invDialogDelete;
                        if (invDialogDelete != null) {
                            invDialogDelete.showDialogDelete();
                            return;
                        }
                        return;
                    }
                    CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON2 = CarTrunkOrClosetActionsWithJSON.INSTANCE;
                    messageErrorItemNotCheck = UILayoutUsersInventory.this.getMessageErrorItemNotCheck();
                    Intrinsics.checkNotNullExpressionValue(messageErrorItemNotCheck, "access$getMessageErrorItemNotCheck(...)");
                    carTrunkOrClosetActionsWithJSON2.sendMessageError(messageErrorItemNotCheck);
                    return;
                }
                if (typeMenu != 19) {
                    return;
                }
                i4 = UILayoutUsersInventory.this.oldPositionWithItem;
                if (i4 != -1) {
                    i5 = UILayoutUsersInventory.this.oldInvValue;
                    if (i5 != 0) {
                        UILayoutUsersInventory uILayoutUsersInventory2 = UILayoutUsersInventory.this;
                        i6 = uILayoutUsersInventory2.oldPositionWithItem;
                        uILayoutUsersInventory2.setIntermediateOldPositionInInvIfUsed(i6);
                        InvActionWithJSON invActionWithJSON = InvActionWithJSON.INSTANCE;
                        i7 = UILayoutUsersInventory.this.oldInvId;
                        i8 = UILayoutUsersInventory.this.oldPositionWithItem;
                        invActionWithJSON.sendIdAndPositionToServer(19, i7, i8);
                        return;
                    }
                }
                CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON3 = CarTrunkOrClosetActionsWithJSON.INSTANCE;
                messageErrorItemNotCheck2 = UILayoutUsersInventory.this.getMessageErrorItemNotCheck();
                Intrinsics.checkNotNullExpressionValue(messageErrorItemNotCheck2, "access$getMessageErrorItemNotCheck(...)");
                carTrunkOrClosetActionsWithJSON3.sendMessageError(messageErrorItemNotCheck2);
            }
        };
    }

    public final void initSlotsClickListener() {
        this.onItemsInSlotClickListener = new Function2<InvItems, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$initSlotsClickListener$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InvItems invItems, Integer num) {
                invoke(invItems, num.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull InvItems item, int position) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                InventoryItemsInSlotAdapter inventoryItemsInSlotAdapter;
                Intrinsics.checkNotNullParameter(item, "item");
                if (item.getItemsValue() != 0) {
                    UILayoutUsersInventory.this.positionFromSlot = position;
                    UILayoutUsersInventory uILayoutUsersInventory = UILayoutUsersInventory.this;
                    uILayoutUsersInventory.oldSlotValue = item.getItemsValue();
                    uILayoutUsersInventory.oldSlotId = item.getId();
                    uILayoutUsersInventory.setInfoAboutItem(item);
                    item.setCheck(true);
                    UILayoutUsersInventory.this.clearInfoAboutInv();
                    inventoryItemsInSlotAdapter = UILayoutUsersInventory.this.itemsInSlotAdapter;
                    if (inventoryItemsInSlotAdapter != null) {
                        inventoryItemsInSlotAdapter.notifyItemChanged(position);
                        inventoryItemsInSlotAdapter.setCheckOnlyElement(position);
                        return;
                    }
                    return;
                }
                i = UILayoutUsersInventory.this.oldPositionWithItem;
                if (i != -1) {
                    i2 = UILayoutUsersInventory.this.oldInvValue;
                    if (i2 != 0) {
                        UILayoutUsersInventory uILayoutUsersInventory2 = UILayoutUsersInventory.this;
                        i3 = uILayoutUsersInventory2.oldPositionWithItem;
                        uILayoutUsersInventory2.setIntermediateOldPositionInInvIfUsed(i3);
                        InvActionWithJSON invActionWithJSON = InvActionWithJSON.INSTANCE;
                        i4 = UILayoutUsersInventory.this.oldInvId;
                        i5 = UILayoutUsersInventory.this.oldPositionWithItem;
                        invActionWithJSON.sendIdAndPositionToServer(19, i4, i5);
                    }
                }
            }
        };
    }

    public final void initDataPlayersButtonsActionInView() {
        this.actionsAdapter = new InventoryActionButtonsAdapter(InventoryUtilsKt.getListActionButtons(), this.actionClickListener);
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        if (inventoryLayoutUsersInventoryBinding != null) {
            RecyclerView recyclerView = inventoryLayoutUsersInventoryBinding.playersButtonsAction;
            recyclerView.setLayoutManager(new LinearLayoutManager(inventoryLayoutUsersInventoryBinding.getRoot().getContext(), 1, false));
            recyclerView.setAdapter(this.actionsAdapter);
        }
    }

    public final void initDataPlayersStateInfoInView() {
        this.playersStatesAdapter = new InventoryPlayersStatesAdapter(this.listPlayersStates);
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        if (inventoryLayoutUsersInventoryBinding != null) {
            RecyclerView recyclerView = inventoryLayoutUsersInventoryBinding.playersStateInfo;
            recyclerView.setLayoutManager(new LinearLayoutManager(inventoryLayoutUsersInventoryBinding.getRoot().getContext(), 0, false));
            recyclerView.setAdapter(this.playersStatesAdapter);
        }
    }

    public final void initDataInInventoryInView() {
        this.inventoryItemsAdapter = new InventoryItemsAdapter(this.onItemsClickListener, this, this.itemRender);
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        if (inventoryLayoutUsersInventoryBinding != null) {
            RecyclerView recyclerView = inventoryLayoutUsersInventoryBinding.invListItemsInInventory;
            recyclerView.setLayoutManager(new GridLayoutManager(inventoryLayoutUsersInventoryBinding.getRoot().getContext(), 4));
            recyclerView.setAdapter(this.inventoryItemsAdapter);
        }
    }

    private final void initDataInSlotsView() {
        this.itemsInSlotAdapter = new InventoryItemsInSlotAdapter(this.onItemsInSlotClickListener, true, this.itemRender);
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        if (inventoryLayoutUsersInventoryBinding != null) {
            RecyclerView recyclerView = inventoryLayoutUsersInventoryBinding.playersSlots;
            recyclerView.setLayoutManager(new LinearLayoutManager(inventoryLayoutUsersInventoryBinding.getRoot().getContext(), 1, false));
            recyclerView.setAdapter(this.itemsInSlotAdapter);
        }
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
        setStartParams();
        setObservers();
        clearItemsInfo();
    }

    private final void setObservers() {
        LifecycleOwner viewLifecycleOwner = this.mainRoot.getViewLifecycleOwner();
        final InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel;
        if (inventoryAndExchangeViewModel != null) {
            inventoryAndExchangeViewModel.getNewPlayersNick().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String str) {
                    UILayoutUsersInventory uILayoutUsersInventory = UILayoutUsersInventory.this;
                    Intrinsics.checkNotNull(str);
                    uILayoutUsersInventory.setPlayersNick(str);
                }
            }));
            inventoryAndExchangeViewModel.getNewPlayersLevel().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$2
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
                    UILayoutUsersInventory uILayoutUsersInventory = UILayoutUsersInventory.this;
                    Intrinsics.checkNotNull(num);
                    uILayoutUsersInventory.setPlayersLevel(num.intValue());
                }
            }));
            inventoryAndExchangeViewModel.getNewPlayersId().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$3
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
                    UILayoutUsersInventory uILayoutUsersInventory = UILayoutUsersInventory.this;
                    Intrinsics.checkNotNull(num);
                    uILayoutUsersInventory.setPlayersId(num.intValue());
                }
            }));
            inventoryAndExchangeViewModel.getNewCurrentWeight().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$4
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
                    UILayoutUsersInventory uILayoutUsersInventory = UILayoutUsersInventory.this;
                    Intrinsics.checkNotNull(num);
                    uILayoutUsersInventory.setThisWeight(num.intValue());
                }
            }));
            inventoryAndExchangeViewModel.getNewMaxWeight().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$5
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
                    UILayoutUsersInventory uILayoutUsersInventory = UILayoutUsersInventory.this;
                    Intrinsics.checkNotNull(num);
                    uILayoutUsersInventory.setMaxWeight(num.intValue());
                }
            }));
            inventoryAndExchangeViewModel.getNewHungerParameter().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$6
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
                    UILayoutUsersInventory uILayoutUsersInventory = UILayoutUsersInventory.this;
                    Intrinsics.checkNotNull(num);
                    uILayoutUsersInventory.updateHungerParameter(num.intValue());
                }
            }));
            inventoryAndExchangeViewModel.getNewVIPStatus().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$7
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
                    UILayoutUsersInventory uILayoutUsersInventory = UILayoutUsersInventory.this;
                    Intrinsics.checkNotNull(num);
                    uILayoutUsersInventory.setVIPStatus(num.intValue());
                }
            }));
            inventoryAndExchangeViewModel.getNewMediatorInvItemsAndSize().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<InvSizeAndItemsObj, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$8
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
                    InventoryItemsAdapter inventoryItemsAdapter;
                    z = UILayoutUsersInventory.this.isFirstShowInv;
                    if (!z || invSizeAndItemsObj.getItemsList() == null || invSizeAndItemsObj.getSizeActiveSlots() == null) {
                        return;
                    }
                    UILayoutUsersInventory.this.isFirstShowInv = false;
                    UILayoutUsersInventory uILayoutUsersInventory = UILayoutUsersInventory.this;
                    List<InvItems> itemsList = invSizeAndItemsObj.getItemsList();
                    Intrinsics.checkNotNull(itemsList);
                    uILayoutUsersInventory.changeStatusWhoseItem(itemsList);
                    inventoryItemsAdapter = UILayoutUsersInventory.this.inventoryItemsAdapter;
                    if (inventoryItemsAdapter != null) {
                        List<InvItems> itemsList2 = invSizeAndItemsObj.getItemsList();
                        if (itemsList2 == null) {
                            itemsList2 = CollectionsKt__CollectionsKt.emptyList();
                        }
                        int orZero = IntExtensionKt.getOrZero(invSizeAndItemsObj.getSizeActiveSlots());
                        List<SkinsDTO> value = inventoryAndExchangeViewModel.getSkinItems().getValue();
                        if (value == null) {
                            value = CollectionsKt__CollectionsKt.emptyList();
                        }
                        inventoryItemsAdapter.setItems(itemsList2, orZero, value);
                    }
                }
            }));
            inventoryAndExchangeViewModel.getNewSlotItems().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<List<InvItems>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$9
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
                    z = UILayoutUsersInventory.this.isFirstShowSlot;
                    if (z) {
                        UILayoutUsersInventory.this.isFirstShowSlot = false;
                        inventoryItemsInSlotAdapter = UILayoutUsersInventory.this.itemsInSlotAdapter;
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
            inventoryAndExchangeViewModel.getNewSkinModelId().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$10
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
                    UILayoutUsersInventory uILayoutUsersInventory = UILayoutUsersInventory.this;
                    Intrinsics.checkNotNull(num);
                    uILayoutUsersInventory.renderMainSkin(num.intValue());
                }
            }));
            inventoryAndExchangeViewModel.getNewOldInvPosition().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$11
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
                    InventoryItemsAdapter inventoryItemsAdapter;
                    inventoryItemsAdapter = UILayoutUsersInventory.this.inventoryItemsAdapter;
                    if (inventoryItemsAdapter != null) {
                        Intrinsics.checkNotNull(num);
                        inventoryItemsAdapter.notifyItemChanged(num.intValue());
                    }
                }
            }));
            inventoryAndExchangeViewModel.getNewNewInvPosition().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$12
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
                    InventoryItemsAdapter inventoryItemsAdapter;
                    inventoryItemsAdapter = UILayoutUsersInventory.this.inventoryItemsAdapter;
                    if (inventoryItemsAdapter != null) {
                        Intrinsics.checkNotNull(num);
                        inventoryItemsAdapter.notifyItemChanged(num.intValue());
                    }
                }
            }));
            inventoryAndExchangeViewModel.getNewNewSlotPosition().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$13
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
                    inventoryItemsInSlotAdapter = UILayoutUsersInventory.this.itemsInSlotAdapter;
                    if (inventoryItemsInSlotAdapter != null) {
                        Intrinsics.checkNotNull(num);
                        inventoryItemsInSlotAdapter.notifyItemChanged(num.intValue());
                    }
                }
            }));
            inventoryAndExchangeViewModel.getNewSlotsInInventory().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<List<Integer>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$14
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<Integer> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
                
                    r1 = r3.this$0.inventoryItemsAdapter;
                 */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void invoke2(java.util.List<java.lang.Integer> r4) {
                    /*
                        r3 = this;
                        int r0 = r4.size()
                        r1 = 2
                        if (r0 != r1) goto L34
                        r0 = 0
                        java.lang.Object r1 = r4.get(r0)
                        java.lang.Number r1 = (java.lang.Number) r1
                        int r1 = r1.intValue()
                        r2 = 1
                        java.lang.Object r2 = r4.get(r2)
                        java.lang.Number r2 = (java.lang.Number) r2
                        int r2 = r2.intValue()
                        if (r1 == r2) goto L34
                        com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory r1 = com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory.this
                        com.blackhub.bronline.game.gui.inventory.adapters.InventoryItemsAdapter r1 = com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory.access$getInventoryItemsAdapter$p(r1)
                        if (r1 == 0) goto L34
                        java.lang.Object r4 = r4.get(r0)
                        java.lang.Number r4 = (java.lang.Number) r4
                        int r4 = r4.intValue()
                        r1.updateActiveSlots(r4)
                    L34:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$14.invoke2(java.util.List):void");
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPlayersNick(String nick) {
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        TextView textView = inventoryLayoutUsersInventoryBinding != null ? inventoryLayoutUsersInventoryBinding.playersNameValue : null;
        if (textView == null) {
            return;
        }
        textView.setText(nick);
    }

    public final void setPlayersLevel(int level) {
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        TextView textView = inventoryLayoutUsersInventoryBinding != null ? inventoryLayoutUsersInventoryBinding.playersLevel : null;
        if (textView == null) {
            return;
        }
        Context context = this.currentContext;
        textView.setText(context != null ? context.getString(R.string.common_level_with_value, Integer.valueOf(level)) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPlayersId(int playersId) {
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        TextView textView = inventoryLayoutUsersInventoryBinding != null ? inventoryLayoutUsersInventoryBinding.playersIdValue : null;
        if (textView == null) {
            return;
        }
        Context context = this.currentContext;
        textView.setText(context != null ? context.getString(R.string.common_number_in_baskets, Integer.valueOf(playersId)) : null);
    }

    public final void setThisWeight(int thisWeight) {
        this.listPlayersStates.get(0).setThisValueState(thisWeight);
        InventoryPlayersStatesAdapter inventoryPlayersStatesAdapter = this.playersStatesAdapter;
        if (inventoryPlayersStatesAdapter != null) {
            inventoryPlayersStatesAdapter.notifyItemChanged(0);
        }
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        TextView textView = inventoryLayoutUsersInventoryBinding != null ? inventoryLayoutUsersInventoryBinding.invTitleActualWeight : null;
        if (textView == null) {
            return;
        }
        textView.setText(String.valueOf(thisWeight));
    }

    public final void setMaxWeight(int maxWeight) {
        this.listPlayersStates.get(0).setMaxValueState(maxWeight);
        InventoryPlayersStatesAdapter inventoryPlayersStatesAdapter = this.playersStatesAdapter;
        if (inventoryPlayersStatesAdapter != null) {
            inventoryPlayersStatesAdapter.notifyItemChanged(0);
        }
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        TextView textView = inventoryLayoutUsersInventoryBinding != null ? inventoryLayoutUsersInventoryBinding.invTitleMaxWeight : null;
        if (textView == null) {
            return;
        }
        textView.setText(String.valueOf(maxWeight));
    }

    public final void updateHungerParameter(int newValueDinner) {
        this.listPlayersStates.get(1).setThisValueState(newValueDinner);
        InventoryPlayersStatesAdapter inventoryPlayersStatesAdapter = this.playersStatesAdapter;
        if (inventoryPlayersStatesAdapter != null) {
            inventoryPlayersStatesAdapter.notifyItemChanged(1);
        }
    }

    public final void setVIPStatus(int vipStatus) {
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        if (inventoryLayoutUsersInventoryBinding != null) {
            if (vipStatus == 0) {
                inventoryLayoutUsersInventoryBinding.playersDonateStatusIcon.setImageResource(R.drawable.ic_crown_unknown_s20);
                return;
            }
            if (vipStatus == 1) {
                inventoryLayoutUsersInventoryBinding.playersDonateStatusIcon.setImageResource(R.drawable.ic_crown_silver_s30);
            } else if (vipStatus == 2) {
                inventoryLayoutUsersInventoryBinding.playersDonateStatusIcon.setImageResource(R.drawable.ic_crown_gold_s30);
            } else {
                if (vipStatus != 3) {
                    return;
                }
                inventoryLayoutUsersInventoryBinding.playersDonateStatusIcon.setImageResource(R.drawable.ic_crown_platinum_s30);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeStatusWhoseItem(List<InvItems> myList) {
        for (InvItems invItems : myList) {
            if (invItems.getItemsValue() != 0) {
                invItems.setWhoseItem(0);
            }
        }
    }

    public final void renderMainSkin(int modelId) {
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        if (inventoryLayoutUsersInventoryBinding != null) {
            Useful useful = Useful.INSTANCE;
            FrameLayout playersSkinView = inventoryLayoutUsersInventoryBinding.playersSkinView;
            Intrinsics.checkNotNullExpressionValue(playersSkinView, "playersSkinView");
            useful.renderSkin(2, 134, modelId, 1, playersSkinView);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setInfoAboutItem(com.blackhub.bronline.game.gui.inventory.data.InvItems r19) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory.setInfoAboutItem(com.blackhub.bronline.game.gui.inventory.data.InvItems):void");
    }

    public final void migrateDataFromSlotToInv() {
        int i;
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel;
        int i2 = this.intermediatePositionInSlot;
        if (i2 != -1 && (i = this.intermediatePositionInInv) != -1 && (inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel) != null) {
            inventoryAndExchangeViewModel.migrateItemFromSlotToInv(i2, i);
        }
        clearInfoAboutInv();
        clearInfoAboutSlot();
    }

    public final void migrateDataFromInvToSlot(int newPosition) {
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel;
        int i = this.intermediateOldPositionInInvIfUsed;
        if (i != -1 && (inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel) != null) {
            inventoryAndExchangeViewModel.migrateItemFromInvToSlot(i, newPosition);
        }
        clearInfoAboutSlot();
        clearInfoAboutInv();
        clearItemsInfo();
    }

    public final void migrateDataInInv() {
        int i;
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel;
        int i2 = this.intermediateOldPositionInInvIfUsed;
        if (i2 != -1 && (i = this.intermediatePositionInInv) != -1 && (inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel) != null) {
            inventoryAndExchangeViewModel.migrateItem(i, i2);
        }
        clearInfoAboutInv();
    }

    public final void deleteThisItem() {
        int i = this.oldPositionWithItem;
        if (i != -1) {
            this.intermediateOldPositionInInvIfUsed = i;
            InvActionWithJSON.INSTANCE.sendIdAndPositionToServer(18, this.oldInvId, i);
        }
    }

    public final void deleteItem() {
        int i = this.intermediateOldPositionInInvIfUsed;
        if (i != -1) {
            InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel;
            if (inventoryAndExchangeViewModel != null) {
                inventoryAndExchangeViewModel.useOrDeleteTheItem(i);
            }
            clearInfoIfEmptyValue();
        }
    }

    public final void clearInfoIfEmptyValue() {
        int i;
        switch (this.oldInvId) {
            case Constants.ID_TACKLE_1 /* 642 */:
            case Constants.ID_TACKLE_2 /* 643 */:
            case Constants.ID_TACKLE_3 /* 644 */:
            case Constants.ID_TACKLE_4 /* 645 */:
            case Constants.ID_TACKLE_5 /* 646 */:
                i = 0;
                break;
            default:
                i = this.oldInvValue - 1;
                break;
        }
        this.oldInvValue = i;
        if (i == 0) {
            clearItemsInfo();
            clearInfoAboutInv();
        }
    }

    public final void clearItemsInfo() {
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        if (inventoryLayoutUsersInventoryBinding != null) {
            inventoryLayoutUsersInventoryBinding.invIconThisItem.setImageBitmap(null);
            inventoryLayoutUsersInventoryBinding.invTitleThisItem.setText("");
            inventoryLayoutUsersInventoryBinding.invInfoThisItem.setText("");
            inventoryLayoutUsersInventoryBinding.invValueItemsWeight.setVisibility(4);
        }
    }

    public final void setStartParams() {
        clearInfoAboutSlot();
        clearInfoAboutInv();
        this.oldTimeWithMigrateAndUsed = 0L;
        this.timerBlockCheck = 0L;
        this.migrateCounter = 0;
        this.actionBlockCounter = 0;
        this.actionBlockTimer = 0L;
        this.isFirstShowInv = true;
        this.isFirstShowSlot = true;
    }

    public final void clearInfoAboutSlot() {
        this.oldSlotValue = 0;
        this.oldSlotId = 0;
        this.positionFromSlot = -1;
        this.intermediatePositionInSlot = -1;
        InventoryItemsInSlotAdapter inventoryItemsInSlotAdapter = this.itemsInSlotAdapter;
        if (inventoryItemsInSlotAdapter != null) {
            inventoryItemsInSlotAdapter.setCheckOnlyElement(-1);
        }
    }

    public final void clearInfoAboutInv() {
        this.oldPositionWithItem = -1;
        this.positionInInventory = -1;
        this.intermediateOldPositionInInvIfUsed = -1;
        this.intermediatePositionInInv = -1;
        this.oldInvValue = 0;
        this.oldInvId = 0;
        InventoryItemsAdapter inventoryItemsAdapter = this.inventoryItemsAdapter;
        if (inventoryItemsAdapter != null) {
            inventoryItemsAdapter.setCheckOnlyElement(-1);
        }
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
        InvDialogDelete invDialogDelete = this.invDialogDelete;
        if (invDialogDelete != null) {
            invDialogDelete.closeDialogDelete();
        }
        removeObservers();
    }

    private final void removeObservers() {
        LifecycleOwner viewLifecycleOwner = this.mainRoot.getViewLifecycleOwner();
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel;
        if (inventoryAndExchangeViewModel != null) {
            inventoryAndExchangeViewModel.getNewPlayersNick().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewPlayersLevel().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewPlayersId().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewCurrentWeight().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewMaxWeight().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewHungerParameter().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewVIPStatus().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewMediatorInvItemsAndSize().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewSlotItems().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewSkinModelId().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewOldInvPosition().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewNewInvPosition().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewNewSlotPosition().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewSlotsInInventory().removeObservers(viewLifecycleOwner);
        }
    }

    public final void setNullableParameters() {
        InvDialogDelete invDialogDelete = this.invDialogDelete;
        if (invDialogDelete != null) {
            invDialogDelete.closeDialogDelete();
        }
        this.binding = null;
        this.actionClickListener = null;
        this.actionsAdapter = null;
        this.playersStatesAdapter = null;
        this.anim = null;
        this.onItemsClickListener = null;
        this.inventoryItemsAdapter = null;
        this.itemsInSlotAdapter = null;
        this.onItemsInSlotClickListener = null;
        this.invDialogDelete = null;
        this.currentContext = null;
    }
}
