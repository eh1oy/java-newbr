package com.blackhub.bronline.game.gui.inventory;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.view.View;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.InventoryDialogBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.common.UIContainer;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.JNILib;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.blackhub.bronline.game.gui.inventory.adapters.MainButtonsAdapter;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.gui.inventory.data.InvMainButtonsData;
import com.blackhub.bronline.game.gui.inventory.data.InvMessageObj;
import com.blackhub.bronline.game.gui.inventory.network.CarTrunkOrClosetActionsWithJSON;
import com.blackhub.bronline.game.gui.inventory.network.InvActionWithJSON;
import com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel;
import com.caverock.androidsvg.SVG;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: GUIUsersInventory.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u00103\u001a\u00020'J\u0006\u00104\u001a\u00020\u0007J\b\u00105\u001a\u00020\u0007H\u0016J\b\u00106\u001a\u0004\u0018\u00010\u0005J\u0010\u00107\u001a\u00020'2\u0006\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u00020\u0002H\u0016J\b\u0010;\u001a\u00020'H\u0002J\u0010\u0010<\u001a\u00020'2\u0006\u00108\u001a\u000209H\u0002J\b\u0010=\u001a\u00020'H\u0002J\b\u0010>\u001a\u00020'H\u0002J\b\u0010?\u001a\u00020'H\u0016J\b\u0010@\u001a\u00020\nH\u0016J\u0016\u0010A\u001a\u00020'2\u0006\u0010B\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\nJ\u0010\u0010\u001f\u001a\u00020'2\u0006\u0010D\u001a\u00020\u0007H\u0002J\b\u0010E\u001a\u00020'H\u0016J\b\u0010F\u001a\u00020'H\u0016J\u0012\u0010G\u001a\u00020'2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0006\u0010H\u001a\u00020'J\u000e\u0010I\u001a\u00020'2\u0006\u0010J\u001a\u00020\u0007J\b\u0010K\u001a\u00020'H\u0002J\b\u0010L\u001a\u00020'H\u0002J\b\u0010M\u001a\u00020'H\u0002J\u000e\u0010N\u001a\u00020'2\u0006\u0010O\u001a\u00020\u0007J\u0010\u0010P\u001a\u00020'2\u0006\u0010Q\u001a\u00020\nH\u0003J\u0010\u0010R\u001a\u00020'2\u0006\u0010S\u001a\u00020\nH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000RF\u0010\u001f\u001a:\u0012\u0013\u0012\u00110!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110%¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020'\u0018\u00010 j\u0004\u0018\u0001`(X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b+\u0010,R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020!02X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006T"}, d2 = {"Lcom/blackhub/bronline/game/gui/inventory/GUIUsersInventory;", "Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragment;", "Lcom/blackhub/bronline/databinding/InventoryDialogBinding;", "()V", "context", "Lcom/blackhub/bronline/game/core/JNIActivity;", "counter", "", "exchangeStatus", "ifClickOtherButtonWithDismiss", "", "getIfClickOtherButtonWithDismiss", "()Z", "setIfClickOtherButtonWithDismiss", "(Z)V", "ifFirstShow", "invItemsFromJson", "", "Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", "inventoryAndExchangeViewModel", "Lcom/blackhub/bronline/game/gui/inventory/viewmodel/InventoryAndExchangeViewModel;", "itemRender", "Landroidx/collection/ArrayMap;", "", "Landroid/graphics/Bitmap;", "layoutExchange", "Lcom/blackhub/bronline/game/gui/inventory/UILayoutExchange;", "layoutUsersInventory", "Lcom/blackhub/bronline/game/gui/inventory/UILayoutUsersInventory;", "mainButtonsAdapter", "Lcom/blackhub/bronline/game/gui/inventory/adapters/MainButtonsAdapter;", "mainButtonsClickListener", "Lkotlin/Function2;", "Lcom/blackhub/bronline/game/gui/inventory/data/InvMainButtonsData;", "Lkotlin/ParameterName;", "name", "mainButton", "Landroid/view/View;", SVG.View.NODE_NAME, "", "Lcom/blackhub/bronline/game/gui/inventory/OnMainButtonsClickListener;", "mainViewModel", "Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "getMainViewModel", "()Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "myContainer", "Lcom/blackhub/bronline/game/common/UIContainer;", "newListWithButtons", "", "closeAndroidInterface", "getCounter", "getGuiId", "getMainContext", "getStartData", "json", "Lorg/json/JSONObject;", "getViewBinding", "initContainer", "initInvItemsFromJson", "initMainButtonsClickListener", "initViewModel", "initViewsISAMPGUI", "isShowingGui", "layoutListener", "selectedLayout", "ifFirstOpen", "typeButton", "newBackPress", "onDestroy", "onPacketIncoming", "removeFocusableForEditText", "setCounter", "newValue", "setMainButtonsInView", "setNullableParameters", "setObservers", "updateCountWithNewMessages", CatchStreamerKeys.COUNT_KEY, "updateMainsButton", "ifHaveButtonBackToTheInventory", "updateStatusForMainButton", "status", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGUIUsersInventory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUIUsersInventory.kt\ncom/blackhub/bronline/game/gui/inventory/GUIUsersInventory\n+ 2 ArrayMap.kt\nandroidx/collection/ArrayMapKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,660:1\n26#2:661\n172#3,9:662\n*S KotlinDebug\n*F\n+ 1 GUIUsersInventory.kt\ncom/blackhub/bronline/game/gui/inventory/GUIUsersInventory\n*L\n127#1:661\n129#1:662,9\n*E\n"})
/* loaded from: classes3.dex */
public final class GUIUsersInventory extends BaseISAMPGUIFragment<InventoryDialogBinding> {
    public static final int $stable = 8;

    @Nullable
    public JNIActivity context;
    public int counter;
    public int exchangeStatus;
    public boolean ifClickOtherButtonWithDismiss;

    @Nullable
    public InventoryAndExchangeViewModel inventoryAndExchangeViewModel;

    @Nullable
    public UILayoutExchange layoutExchange;

    @Nullable
    public UILayoutUsersInventory layoutUsersInventory;

    @Nullable
    public MainButtonsAdapter mainButtonsAdapter;

    @Nullable
    public Function2<? super InvMainButtonsData, ? super View, Unit> mainButtonsClickListener;

    @Nullable
    public UIContainer myContainer;

    @NotNull
    public List<InvMainButtonsData> newListWithButtons = new ArrayList();
    public boolean ifFirstShow = true;

    @NotNull
    public ArrayMap<String, Bitmap> itemRender = new ArrayMap<>();

    /* renamed from: mainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(JNIActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.inventory.GUIUsersInventory$special$$inlined$activityViewModels$default$1
        public GUIUsersInventory$special$$inlined$activityViewModels$default$1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = Fragment.this.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.inventory.GUIUsersInventory$special$$inlined$activityViewModels$default$2
        public final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GUIUsersInventory$special$$inlined$activityViewModels$default$2(Fragment this) {
            super(0);
            r2 = this;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = Function0.this;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = r2.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.inventory.GUIUsersInventory$mainViewModel$2
        public GUIUsersInventory$mainViewModel$2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelProvider.Factory invoke() {
            FragmentActivity requireActivity = GUIUsersInventory.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            return (ViewModelProvider.Factory) new ViewModelProvider(requireActivity).get(JNIActivityViewModel.class);
        }
    });

    @NotNull
    public List<InvItems> invItemsFromJson = CollectionsKt__CollectionsKt.emptyList();

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 33;
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment, com.blackhub.bronline.game.ISAMPGUI
    public boolean isShowingGui() {
        return true;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    public final boolean getIfClickOtherButtonWithDismiss() {
        return this.ifClickOtherButtonWithDismiss;
    }

    public final void setIfClickOtherButtonWithDismiss(boolean z) {
        this.ifClickOtherButtonWithDismiss = z;
    }

    public final JNIActivityViewModel getMainViewModel() {
        return (JNIActivityViewModel) this.mainViewModel.getValue();
    }

    public final void setCounter(int newValue) {
        this.counter = newValue;
    }

    public final int getCounter() {
        return this.counter;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
        UILayoutUsersInventory uILayoutUsersInventory;
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel;
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel2;
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel3;
        UILayoutExchange uILayoutExchange;
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel4;
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel5;
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel6;
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel7;
        UILayoutUsersInventory uILayoutUsersInventory2;
        if (json != null) {
            int optInt = json.optInt("t");
            int optInt2 = json.optInt("s");
            if (optInt == 0) {
                this.counter++;
                InventoryAndExchangeViewModel inventoryAndExchangeViewModel8 = this.inventoryAndExchangeViewModel;
                if (inventoryAndExchangeViewModel8 != null) {
                    inventoryAndExchangeViewModel8.addNewOtherItem(json.optInt("ga"), json.optInt("s"), json.optString("nt"), this.invItemsFromJson);
                }
                return;
            }
            if (optInt == 1) {
                this.counter++;
                InventoryAndExchangeViewModel inventoryAndExchangeViewModel9 = this.inventoryAndExchangeViewModel;
                if (inventoryAndExchangeViewModel9 != null) {
                    inventoryAndExchangeViewModel9.subtractionOtherItem(json.optInt("ga"), json.optInt("s"), json.optString("nt"));
                    return;
                }
                return;
            }
            if (optInt == 23) {
                if (optInt2 != 1 || (uILayoutUsersInventory = this.layoutUsersInventory) == null) {
                    return;
                }
                uILayoutUsersInventory.migrateDataInInv();
                return;
            }
            if (optInt == 24) {
                if (optInt2 == 0) {
                    UILayoutExchange uILayoutExchange2 = this.layoutExchange;
                    if (uILayoutExchange2 != null) {
                        uILayoutExchange2.clearInfoAboutExchange();
                        return;
                    }
                    return;
                }
                if (optInt2 != 1) {
                    return;
                }
                InventoryAndExchangeViewModel inventoryAndExchangeViewModel10 = this.inventoryAndExchangeViewModel;
                if (inventoryAndExchangeViewModel10 != null) {
                    inventoryAndExchangeViewModel10.setCurrentWeight(json.optInt("w"));
                }
                UILayoutExchange uILayoutExchange3 = this.layoutExchange;
                if (uILayoutExchange3 != null) {
                    uILayoutExchange3.migrateFromExchangeToInv();
                    return;
                }
                return;
            }
            if (optInt == 26) {
                UILayoutExchange uILayoutExchange4 = this.layoutExchange;
                if (uILayoutExchange4 != null) {
                    uILayoutExchange4.updateChangeStatus(26);
                    return;
                }
                return;
            }
            if (optInt == 27) {
                if (optInt2 == 1) {
                    int optInt3 = json.optInt("nw");
                    int optInt4 = json.optInt("ns");
                    UILayoutExchange uILayoutExchange5 = this.layoutExchange;
                    if (uILayoutExchange5 != null) {
                        uILayoutExchange5.migrateFromSlotToInventory();
                    }
                    if (optInt3 != 0 && (inventoryAndExchangeViewModel2 = this.inventoryAndExchangeViewModel) != null) {
                        inventoryAndExchangeViewModel2.setMaxWeight(optInt3);
                    }
                    if (optInt4 == 0 || (inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel) == null) {
                        return;
                    }
                    inventoryAndExchangeViewModel.updateActiveSlots(optInt4);
                    return;
                }
                return;
            }
            switch (optInt) {
                case 3:
                    InventoryAndExchangeViewModel inventoryAndExchangeViewModel11 = this.inventoryAndExchangeViewModel;
                    if (inventoryAndExchangeViewModel11 != null) {
                        inventoryAndExchangeViewModel11.setOtherMoney(Integer.valueOf(json.optInt(GetKeys.GM_GET_OTHER_PLAYERS_MONEY)));
                    }
                    this.counter++;
                    break;
                case 4:
                    if (optInt2 == 1) {
                        int optInt5 = json.optInt("ns");
                        UILayoutUsersInventory uILayoutUsersInventory3 = this.layoutUsersInventory;
                        if (uILayoutUsersInventory3 != null) {
                            uILayoutUsersInventory3.migrateDataFromSlotToInv();
                        }
                        InventoryAndExchangeViewModel inventoryAndExchangeViewModel12 = this.inventoryAndExchangeViewModel;
                        if (inventoryAndExchangeViewModel12 != null) {
                            inventoryAndExchangeViewModel12.setMaxWeight(json.optInt("nw"));
                        }
                        if (optInt5 != 0 && (inventoryAndExchangeViewModel3 = this.inventoryAndExchangeViewModel) != null) {
                            inventoryAndExchangeViewModel3.updateActiveSlots(optInt5);
                            break;
                        }
                    } else {
                        UILayoutUsersInventory uILayoutUsersInventory4 = this.layoutUsersInventory;
                        if (uILayoutUsersInventory4 != null) {
                            uILayoutUsersInventory4.clearInfoAboutInv();
                            uILayoutUsersInventory4.clearInfoAboutSlot();
                            break;
                        }
                    }
                    break;
                case 5:
                    if (optInt2 == 0) {
                        UILayoutExchange uILayoutExchange6 = this.layoutExchange;
                        if (uILayoutExchange6 != null) {
                            uILayoutExchange6.clearInfoAboutInv();
                            break;
                        }
                    } else if (optInt2 == 1) {
                        InventoryAndExchangeViewModel inventoryAndExchangeViewModel13 = this.inventoryAndExchangeViewModel;
                        if (inventoryAndExchangeViewModel13 != null) {
                            inventoryAndExchangeViewModel13.setCurrentWeight(json.optInt("w"));
                        }
                        UILayoutExchange uILayoutExchange7 = this.layoutExchange;
                        if (uILayoutExchange7 != null) {
                            uILayoutExchange7.migrateItemFromInvToExchange();
                            break;
                        }
                    }
                    break;
                case 6:
                    if (optInt2 == 1) {
                        InventoryAndExchangeViewModel inventoryAndExchangeViewModel14 = this.inventoryAndExchangeViewModel;
                        if (inventoryAndExchangeViewModel14 != null) {
                            inventoryAndExchangeViewModel14.saveTheOldValueOfMoney();
                            break;
                        }
                    } else {
                        InventoryAndExchangeViewModel inventoryAndExchangeViewModel15 = this.inventoryAndExchangeViewModel;
                        if (inventoryAndExchangeViewModel15 != null) {
                            inventoryAndExchangeViewModel15.returnToTheOldValueOfMoney();
                            break;
                        }
                    }
                    break;
                case 7:
                    UILayoutExchange uILayoutExchange8 = this.layoutExchange;
                    if (uILayoutExchange8 != null) {
                        uILayoutExchange8.updateChangeStatus(optInt2);
                        break;
                    }
                    break;
                case 8:
                    if (optInt2 == 1 && (uILayoutExchange = this.layoutExchange) != null) {
                        uILayoutExchange.updateChangeStatus(8);
                        break;
                    }
                    break;
                default:
                    switch (optInt) {
                        case 16:
                            closeFragment();
                            break;
                        case 17:
                            InventoryAndExchangeViewModel inventoryAndExchangeViewModel16 = this.inventoryAndExchangeViewModel;
                            if (inventoryAndExchangeViewModel16 != null) {
                                inventoryAndExchangeViewModel16.setOtherPlayersNick(json.optString(GetKeys.EN_GET_PLAYERS_NICK_WITH_EXCHANGE));
                            }
                            layoutListener(1, false);
                            break;
                        case 18:
                            if (optInt2 == 1) {
                                int optInt6 = json.optInt("w");
                                UILayoutUsersInventory uILayoutUsersInventory5 = this.layoutUsersInventory;
                                if (uILayoutUsersInventory5 != null) {
                                    uILayoutUsersInventory5.deleteItem();
                                }
                                if (optInt6 != 0 && (inventoryAndExchangeViewModel4 = this.inventoryAndExchangeViewModel) != null) {
                                    inventoryAndExchangeViewModel4.setCurrentWeight(optInt6);
                                    break;
                                }
                            }
                            break;
                        case 19:
                            if (optInt2 == 1) {
                                int optInt7 = json.optInt("w");
                                int optInt8 = json.optInt("i");
                                int optInt9 = json.optInt("nw");
                                int optInt10 = json.optInt("ns");
                                if (optInt7 != 0 && (inventoryAndExchangeViewModel7 = this.inventoryAndExchangeViewModel) != null) {
                                    inventoryAndExchangeViewModel7.setCurrentWeight(optInt7);
                                }
                                if (optInt8 > -1) {
                                    UILayoutUsersInventory uILayoutUsersInventory6 = this.layoutUsersInventory;
                                    if (uILayoutUsersInventory6 != null) {
                                        uILayoutUsersInventory6.migrateDataFromInvToSlot(optInt8);
                                    }
                                } else {
                                    UILayoutUsersInventory uILayoutUsersInventory7 = this.layoutUsersInventory;
                                    if (uILayoutUsersInventory7 != null) {
                                        uILayoutUsersInventory7.deleteItem();
                                    }
                                }
                                if (optInt9 != 0 && (inventoryAndExchangeViewModel6 = this.inventoryAndExchangeViewModel) != null) {
                                    inventoryAndExchangeViewModel6.setMaxWeight(optInt9);
                                }
                                if (optInt10 != 0 && (inventoryAndExchangeViewModel5 = this.inventoryAndExchangeViewModel) != null) {
                                    inventoryAndExchangeViewModel5.updateActiveSlots(optInt10);
                                    break;
                                }
                            }
                            break;
                        case 20:
                            InventoryAndExchangeViewModel inventoryAndExchangeViewModel17 = this.inventoryAndExchangeViewModel;
                            if (inventoryAndExchangeViewModel17 != null) {
                                inventoryAndExchangeViewModel17.setHungerParameter(json.optInt("i"));
                                break;
                            }
                            break;
                        default:
                            switch (optInt) {
                                case 31:
                                    String optString = json.optString("tx");
                                    int i = this.counter + 1;
                                    this.counter = i;
                                    updateCountWithNewMessages(i);
                                    InventoryAndExchangeViewModel inventoryAndExchangeViewModel18 = this.inventoryAndExchangeViewModel;
                                    if (inventoryAndExchangeViewModel18 != null) {
                                        Intrinsics.checkNotNull(optString);
                                        inventoryAndExchangeViewModel18.setNewMessage(new InvMessageObj(false, 0, optString, 0, "", 0));
                                        break;
                                    }
                                    break;
                                case 32:
                                    if (optInt2 == 1 && (uILayoutUsersInventory2 = this.layoutUsersInventory) != null) {
                                        uILayoutUsersInventory2.migrateDataFromSlotToInv();
                                        break;
                                    }
                                    break;
                                case 33:
                                    InventoryAndExchangeViewModel inventoryAndExchangeViewModel19 = this.inventoryAndExchangeViewModel;
                                    if (inventoryAndExchangeViewModel19 != null) {
                                        inventoryAndExchangeViewModel19.setSkinModelId(json.optInt("ps"));
                                        break;
                                    }
                                    break;
                                case 34:
                                    this.ifClickOtherButtonWithDismiss = true;
                                    closeFragment();
                                    break;
                            }
                    }
            }
        }
    }

    @Nullable
    /* renamed from: getMainContext, reason: from getter */
    public final JNIActivity getContext() {
        return this.context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() {
        this.context = JNIActivity.getContext();
        initViewModel();
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel;
        if (inventoryAndExchangeViewModel != null) {
            inventoryAndExchangeViewModel.updateExchangeStatus(0);
        }
        setObservers();
        initContainer();
        ((InventoryDialogBinding) getBinding()).invMainButtonExit.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.inventory.GUIUsersInventory$$ExternalSyntheticLambda0
            public /* synthetic */ GUIUsersInventory$$ExternalSyntheticLambda0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIUsersInventory.initViewsISAMPGUI$lambda$2(GUIUsersInventory.this, view);
            }
        });
        JNILib.toggleDrawing2dStuff(true);
        JNILib.toggleBloor(true);
        updateCountWithNewMessages(this.counter);
        List<InvMainButtonsData> list = this.newListWithButtons;
        list.clear();
        list.addAll(InventoryUtilsKt.getListButtons());
        initMainButtonsClickListener();
        setMainButtonsInView();
        JSONObject jsonObj = getJsonObj();
        if (jsonObj != null) {
            initInvItemsFromJson(jsonObj);
        }
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel2 = this.inventoryAndExchangeViewModel;
        if (inventoryAndExchangeViewModel2 != null) {
            inventoryAndExchangeViewModel2.setSkins(getMainViewModel().getConfigurationJsons().getValue().getSkinsFromJson());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void initViewsISAMPGUI$lambda$2(GUIUsersInventory this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((InventoryDialogBinding) this$0.getBinding()).invMainButtonExit.getAlpha() == 1.0f) {
            Intrinsics.checkNotNull(view);
            BaseFragment.startAnimAndDelay$default(this$0, view, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUIUsersInventory$initViewsISAMPGUI$1$1
                public GUIUsersInventory$initViewsISAMPGUI$1$1() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() {
                    GUIUsersInventory.this.setIfClickOtherButtonWithDismiss(false);
                    GUIUsersInventory.this.closeFragment();
                }
            }, 1, null);
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public InventoryDialogBinding getViewBinding() {
        InventoryDialogBinding inflate = InventoryDialogBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initContainer() {
        this.myContainer = ((InventoryDialogBinding) getBinding()).invContainer;
        UILayoutUsersInventory uILayoutUsersInventory = new UILayoutUsersInventory(this, this.inventoryAndExchangeViewModel, this.itemRender);
        this.layoutUsersInventory = uILayoutUsersInventory;
        UIContainer uIContainer = this.myContainer;
        if (uIContainer != null) {
            uIContainer.addLayout(0, uILayoutUsersInventory);
        }
        UILayoutExchange uILayoutExchange = new UILayoutExchange(this, this.inventoryAndExchangeViewModel, this.itemRender);
        this.layoutExchange = uILayoutExchange;
        UIContainer uIContainer2 = this.myContainer;
        if (uIContainer2 != null) {
            uIContainer2.addLayout(1, uILayoutExchange);
        }
    }

    public final void initInvItemsFromJson(JSONObject json) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUIUsersInventory$initInvItemsFromJson$1(this, json, null), 3, null);
    }

    private final void initViewModel() {
        this.inventoryAndExchangeViewModel = (InventoryAndExchangeViewModel) new ViewModelProvider(this).get(InventoryAndExchangeViewModel.class);
    }

    private final void setObservers() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel;
        if (inventoryAndExchangeViewModel != null) {
            inventoryAndExchangeViewModel.getNewTypeInterface().observe(viewLifecycleOwner, new GUIUsersInventory$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUIUsersInventory$setObservers$1$1$1
                public GUIUsersInventory$setObservers$1$1$1() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke2(num);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2(Integer num) {
                    boolean z;
                    GUIUsersInventory gUIUsersInventory = GUIUsersInventory.this;
                    Intrinsics.checkNotNull(num);
                    int intValue = num.intValue();
                    z = GUIUsersInventory.this.ifFirstShow;
                    gUIUsersInventory.layoutListener(intValue, z);
                    GUIUsersInventory.this.ifFirstShow = false;
                }
            }));
            inventoryAndExchangeViewModel.getNewExchangeStatus().observe(viewLifecycleOwner, new GUIUsersInventory$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUIUsersInventory$setObservers$1$1$2
                public GUIUsersInventory$setObservers$1$1$2() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke2(num);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2(Integer num) {
                    GUIUsersInventory gUIUsersInventory = GUIUsersInventory.this;
                    Intrinsics.checkNotNull(num);
                    gUIUsersInventory.exchangeStatus = num.intValue();
                }
            }));
            inventoryAndExchangeViewModel.getNewBlockStatus().observe(viewLifecycleOwner, new GUIUsersInventory$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUIUsersInventory$setObservers$1$1$3
                public GUIUsersInventory$setObservers$1$1$3() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke2(bool);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2(Boolean bool) {
                    GUIUsersInventory gUIUsersInventory = GUIUsersInventory.this;
                    Intrinsics.checkNotNull(bool);
                    gUIUsersInventory.updateStatusForMainButton(bool.booleanValue());
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateStatusForMainButton(boolean status) {
        if (status) {
            ((InventoryDialogBinding) getBinding()).invMainButtonExit.setAlpha(0.2f);
            ((InventoryDialogBinding) getBinding()).invMainButtons.setAlpha(0.2f);
        } else {
            if (status) {
                return;
            }
            ((InventoryDialogBinding) getBinding()).invMainButtonExit.setAlpha(1.0f);
            ((InventoryDialogBinding) getBinding()).invMainButtons.setAlpha(1.0f);
        }
    }

    private final void initMainButtonsClickListener() {
        this.mainButtonsClickListener = new Function2<InvMainButtonsData, View, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUIUsersInventory$initMainButtonsClickListener$1
            public GUIUsersInventory$initMainButtonsClickListener$1() {
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InvMainButtonsData invMainButtonsData, View view) {
                invoke2(invMainButtonsData, view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public void invoke2(@NotNull InvMainButtonsData mainButton, @NotNull View r10) {
                int i;
                Intrinsics.checkNotNullParameter(mainButton, "mainButton");
                Intrinsics.checkNotNullParameter(r10, "view");
                i = GUIUsersInventory.this.exchangeStatus;
                if (i == 0) {
                    GUIUsersInventory gUIUsersInventory = GUIUsersInventory.this;
                    BaseFragment.startAnimAndDelay$default(gUIUsersInventory, r10, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUIUsersInventory$initMainButtonsClickListener$1$invoke$1
                        public final /* synthetic */ GUIUsersInventory this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public GUIUsersInventory$initMainButtonsClickListener$1$invoke$1(GUIUsersInventory gUIUsersInventory2) {
                            super(0);
                            r2 = gUIUsersInventory2;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke */
                        public final void invoke2() {
                            int typeMenu = InvMainButtonsData.this.getTypeMenu();
                            if (typeMenu == 0) {
                                r2.mainButtonsClickListener(10);
                                r2.closeFragment();
                                return;
                            }
                            if (typeMenu == 1) {
                                r2.mainButtonsClickListener(11);
                                r2.closeFragment();
                                return;
                            }
                            if (typeMenu == 2) {
                                r2.mainButtonsClickListener(12);
                                r2.closeFragment();
                                return;
                            }
                            if (typeMenu == 3) {
                                CarTrunkOrClosetActionsWithJSON.INSTANCE.openRadialMenu();
                                r2.mainButtonsClickListener(13);
                                r2.closeFragment();
                            } else if (typeMenu == 4) {
                                r2.mainButtonsClickListener(14);
                                r2.closeFragment();
                            } else if (typeMenu == 5) {
                                r2.mainButtonsClickListener(15);
                            } else {
                                if (typeMenu != 14) {
                                    return;
                                }
                                r2.mainButtonsClickListener(35);
                                r2.closeFragment();
                            }
                        }
                    }, 1, null);
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setMainButtonsInView() {
        this.mainButtonsAdapter = new MainButtonsAdapter(this.newListWithButtons, this.mainButtonsClickListener);
        RecyclerView recyclerView = ((InventoryDialogBinding) getBinding()).invMainButtons;
        recyclerView.setLayoutManager(new LinearLayoutManager(((InventoryDialogBinding) getBinding()).getRoot().getContext(), 1, false));
        recyclerView.setAdapter(this.mainButtonsAdapter);
    }

    public final void mainButtonsClickListener(int typeButton) {
        if (typeButton != 15) {
            this.ifClickOtherButtonWithDismiss = true;
        }
        InvActionWithJSON.INSTANCE.sendPressButton(typeButton);
    }

    public final void layoutListener(int selectedLayout, boolean ifFirstOpen) {
        if (selectedLayout != 0) {
            if (selectedLayout != 1) {
                return;
            }
            UIContainer uIContainer = this.myContainer;
            if (uIContainer != null) {
                uIContainer.setCurrentLayout(1);
            }
            if (ifFirstOpen) {
                return;
            }
            updateMainsButton(true);
            return;
        }
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel;
        if (inventoryAndExchangeViewModel != null) {
            inventoryAndExchangeViewModel.setBlockStatus(false);
        }
        UIContainer uIContainer2 = this.myContainer;
        if (uIContainer2 != null) {
            uIContainer2.setCurrentLayout(0);
        }
        if (ifFirstOpen) {
            return;
        }
        updateMainsButton(false);
    }

    public final void getStartData(JSONObject json) {
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel;
        if (inventoryAndExchangeViewModel != null) {
            inventoryAndExchangeViewModel.setTypeInterface(json.optInt("i"));
            String optString = json.optString("n");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            inventoryAndExchangeViewModel.setPlayersNick(optString);
            inventoryAndExchangeViewModel.setPlayersLevel(json.optInt("lv"));
            inventoryAndExchangeViewModel.setPlayersId(json.optInt("id"));
            inventoryAndExchangeViewModel.setCurrentWeight(json.optInt("w"));
            inventoryAndExchangeViewModel.setMaxWeight(json.optInt("mw"));
            inventoryAndExchangeViewModel.setHungerParameter(json.optInt("s"));
            inventoryAndExchangeViewModel.setVIPStatus(json.optInt("v"));
            inventoryAndExchangeViewModel.initInvItems(json.optJSONArray("it"), this.invItemsFromJson, json.optInt("sl"));
            inventoryAndExchangeViewModel.initSlotItems(json.optJSONArray("ai"), this.invItemsFromJson, json.optInt("nm"));
            inventoryAndExchangeViewModel.setSkinModelId(json.optInt("ps"));
            inventoryAndExchangeViewModel.setMyMoney(json.optInt("m"));
            inventoryAndExchangeViewModel.setOtherPlayersNick(json.optString(GetKeys.EN_GET_PLAYERS_NICK_WITH_EXCHANGE));
        }
    }

    public final void updateCountWithNewMessages(int r2) {
        UILayoutExchange uILayoutExchange = this.layoutExchange;
        if (uILayoutExchange != null) {
            uILayoutExchange.updateCountWithNewMessages(r2);
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void updateMainsButton(boolean ifHaveButtonBackToTheInventory) {
        if (ifHaveButtonBackToTheInventory) {
            List<InvMainButtonsData> list = this.newListWithButtons;
            list.clear();
            list.addAll(InventoryUtilsKt.getListButtons());
            list.add(new InvMainButtonsData(5, InventoryUtilsKt.getArrayWithMainButtons()[5], R.drawable.ic_bug));
        } else if (!ifHaveButtonBackToTheInventory) {
            List<InvMainButtonsData> list2 = this.newListWithButtons;
            list2.clear();
            list2.addAll(InventoryUtilsKt.getListButtons());
        }
        MainButtonsAdapter mainButtonsAdapter = this.mainButtonsAdapter;
        if (mainButtonsAdapter != null) {
            mainButtonsAdapter.notifyDataSetChanged();
        }
    }

    public final void removeFocusableForEditText() {
        UILayoutExchange uILayoutExchange = this.layoutExchange;
        if (uILayoutExchange != null) {
            uILayoutExchange.removeFocusableForEditText();
        }
        closeAndroidInterface();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void closeAndroidInterface() {
        UsefulKt.hideSystemUI(((InventoryDialogBinding) getBinding()).getRoot());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        JNILib.toggleDrawing2dStuff(false);
        JNILib.toggleBloor(false);
        if (!this.ifClickOtherButtonWithDismiss) {
            InvActionWithJSON.INSTANCE.sendPressButton(16);
        }
        setNullableParameters();
    }

    private final void setNullableParameters() {
        UILayoutExchange uILayoutExchange = this.layoutExchange;
        if (uILayoutExchange != null) {
            uILayoutExchange.setNullableParameters();
        }
        UILayoutUsersInventory uILayoutUsersInventory = this.layoutUsersInventory;
        if (uILayoutUsersInventory != null) {
            uILayoutUsersInventory.setNullableParameters();
        }
        this.context = null;
        this.mainButtonsClickListener = null;
        this.mainButtonsAdapter = null;
        this.myContainer = null;
        this.layoutUsersInventory = null;
        this.layoutExchange = null;
        this.inventoryAndExchangeViewModel = null;
        this.ifClickOtherButtonWithDismiss = false;
        this.ifFirstShow = true;
        this.exchangeStatus = 0;
        this.counter = 0;
    }
}
