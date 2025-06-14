package com.blackhub.bronline.game.gui.inventory;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Animation;
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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.InventoryCarTrunkBinding;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.JNILib;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.inventory.adapters.InventoryExchangeAndTrunkAdapter;
import com.blackhub.bronline.game.gui.inventory.adapters.InventoryItemsInSlotAdapter;
import com.blackhub.bronline.game.gui.inventory.adapters.MainButtonsAdapter;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.gui.inventory.data.InvMainButtonsData;
import com.blackhub.bronline.game.gui.inventory.network.CarTrunkOrClosetActionsWithJSON;
import com.blackhub.bronline.game.gui.inventory.viewmodel.CarTrunkOrClosetViewModel;
import com.blackhub.bronline.game.gui.inventory.viewmodel.CarTrunkOrClosetViewModelFactory;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUICarsTrunkOrCloset.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010V\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020\bH\u0002J\b\u0010X\u001a\u00020\u000eH\u0002J\b\u0010Y\u001a\u00020\u000eH\u0002J\b\u0010Z\u001a\u00020\u000eH\u0002J\b\u0010[\u001a\u00020\bH\u0016J\u0010\u0010\\\u001a\u00020\u000e2\u0006\u0010]\u001a\u00020^H\u0002J\b\u0010_\u001a\u00020\u0002H\u0016J\b\u0010`\u001a\u00020\u000eH\u0002J\b\u0010a\u001a\u00020\u000eH\u0002J\b\u0010b\u001a\u00020\u000eH\u0002J\b\u0010c\u001a\u00020\u000eH\u0002J\b\u0010d\u001a\u00020\u000eH\u0002J\b\u0010e\u001a\u00020\u000eH\u0002J\u0010\u0010f\u001a\u00020\u000e2\u0006\u0010]\u001a\u00020^H\u0002J\b\u0010g\u001a\u00020\u000eH\u0002J\b\u0010h\u001a\u00020\u000eH\u0002J\b\u0010i\u001a\u00020\u000eH\u0002J\b\u0010j\u001a\u00020\u000eH\u0002J\b\u0010k\u001a\u00020\u000eH\u0002J\b\u0010l\u001a\u00020\u000eH\u0016J\b\u0010m\u001a\u00020\u0011H\u0016J\u0010\u00102\u001a\u00020\u000e2\u0006\u0010n\u001a\u00020\bH\u0002J\b\u0010o\u001a\u00020\u000eH\u0016J\b\u0010p\u001a\u00020\u000eH\u0016J\u0012\u0010q\u001a\u00020\u000e2\b\u0010]\u001a\u0004\u0018\u00010^H\u0016J\b\u0010r\u001a\u00020\u000eH\u0002J\u0012\u0010s\u001a\u00020\u000e2\b\u0010t\u001a\u0004\u0018\u00010\u0002H\u0003R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R[\u0010\u0006\u001aO\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007j\u0004\u0018\u0001`\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000RF\u0010\u001e\u001a:\u0012\u0013\u0012\u00110 ¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001fj\u0004\u0018\u0001`#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020 0%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0006\u0012\u0004\u0018\u00010+0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000RF\u00102\u001a:\u0012\u0013\u0012\u001103¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(4\u0012\u0013\u0012\u001105¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001fj\u0004\u0018\u0001`7X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u00108\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b:\u0010;R\u001b\u0010>\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010=\u001a\u0004\b?\u0010@R\u000e\u0010B\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010I\u001a\u0004\u0018\u00010JX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020LX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020LX\u0082\u000e¢\u0006\u0002\n\u0000RF\u0010N\u001a:\u0012\u0013\u0012\u00110 ¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001fj\u0004\u0018\u0001`#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010O\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000RF\u0010P\u001a:\u0012\u0013\u0012\u00110 ¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001fj\u0004\u0018\u0001`#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006u"}, d2 = {"Lcom/blackhub/bronline/game/gui/inventory/GUICarsTrunkOrCloset;", "Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragment;", "Lcom/blackhub/bronline/databinding/InventoryCarTrunkBinding;", "()V", "carsTrunkOrClosetViewModel", "Lcom/blackhub/bronline/game/gui/inventory/viewmodel/CarTrunkOrClosetViewModel;", "clickListenerDialogForMigrateItems", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "migrateValue", "action", "applyAction", "", "Lcom/blackhub/bronline/game/gui/inventory/NewActionListenerFromDialogApply;", "firstShowInv", "", "firstShowOther", "firstShowSlot", "idInInv", "idInOther", "idInSlots", "ifClickOtherButtonWithDismiss", "ifNeedToResize", "intermediatePositionFromOtherList", "intermediatePositionFromSlot", "intermediatePositionFromUsersList", "invAdapter", "Lcom/blackhub/bronline/game/gui/inventory/adapters/InventoryExchangeAndTrunkAdapter;", "invItemClickListener", "Lkotlin/Function2;", "Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", "item", "position", "Lcom/blackhub/bronline/game/gui/inventory/OnItemsClickListener;", "invItemsFromJson", "", "itemFromInv", "itemFromOther", "itemRender", "Landroidx/collection/ArrayMap;", "", "Landroid/graphics/Bitmap;", "itemsInSlotAdapter", "Lcom/blackhub/bronline/game/gui/inventory/adapters/InventoryItemsInSlotAdapter;", "mainActivity", "Lcom/blackhub/bronline/game/core/JNIActivity;", "mainButtonsAdapter", "Lcom/blackhub/bronline/game/gui/inventory/adapters/MainButtonsAdapter;", "mainButtonsClickListener", "Lcom/blackhub/bronline/game/gui/inventory/data/InvMainButtonsData;", "mainButton", "Landroid/view/View;", SVG.View.NODE_NAME, "Lcom/blackhub/bronline/game/gui/inventory/OnMainButtonsClickListener;", "mainViewModel", "Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "getMainViewModel", "()Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "messageErrorFromRes", "getMessageErrorFromRes", "()Ljava/lang/String;", "messageErrorFromRes$delegate", "migrateCounter", "migrateValueFromInv", "migrateValueFromOther", "migrateValueFromSlots", "modelIdInInv", "modelIdInOther", "modelIdInSlots", "newDialogForMigrateItems", "Lcom/blackhub/bronline/game/gui/inventory/NewDialogForMigrateItems;", "oldTimeAfterCheck", "", "oldTimeMigrate", "onItemsInSlotClickListener", "otherAdapter", "otherItemClickListener", "positionFromOtherList", "positionFromSlot", "positionFromUsersList", "positionIfThereIsFoldZero", "statusCarOrHome", "changeViewInterface", "typeInterface", "clearInfoAboutOtherItem", "clearInfoAboutSlot", "clearInfoAboutUsersItem", "getGuiId", "getStartData", "json", "Lorg/json/JSONObject;", "getViewBinding", "initCarsItemClickListener", "initDataInOtherList", "initDataInSlotsView", "initDataInUsersList", "initDataMainButtons", "initDialogForMigrateItems", "initItemsFromJson", "initLogicForDialogMigrateItems", "initMainButtonsClickListener", "initSlotClickListener", "initUsersItemClickListener", "initViewModel", "initViewsISAMPGUI", "isShowingGui", "typeButton", "newBackPress", "onDestroy", "onPacketIncoming", "setNullableParameters", "setObservers", "binding", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGUICarsTrunkOrCloset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUICarsTrunkOrCloset.kt\ncom/blackhub/bronline/game/gui/inventory/GUICarsTrunkOrCloset\n+ 2 ArrayMap.kt\nandroidx/collection/ArrayMapKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,845:1\n26#2:846\n172#3,9:847\n*S KotlinDebug\n*F\n+ 1 GUICarsTrunkOrCloset.kt\ncom/blackhub/bronline/game/gui/inventory/GUICarsTrunkOrCloset\n*L\n140#1:846\n146#1:847,9\n*E\n"})
/* loaded from: classes3.dex */
public final class GUICarsTrunkOrCloset extends BaseISAMPGUIFragment<InventoryCarTrunkBinding> {
    public static final int $stable = 8;

    @Nullable
    public CarTrunkOrClosetViewModel carsTrunkOrClosetViewModel;

    @Nullable
    public Function3<? super Integer, ? super Integer, ? super Integer, Unit> clickListenerDialogForMigrateItems;
    public int idInInv;
    public int idInOther;
    public int idInSlots;
    public boolean ifClickOtherButtonWithDismiss;
    public boolean ifNeedToResize;

    @Nullable
    public InventoryExchangeAndTrunkAdapter invAdapter;

    @Nullable
    public Function2<? super InvItems, ? super Integer, Unit> invItemClickListener;

    @Nullable
    public InvItems itemFromInv;

    @Nullable
    public InvItems itemFromOther;

    @Nullable
    public InventoryItemsInSlotAdapter itemsInSlotAdapter;

    @Nullable
    public JNIActivity mainActivity;

    @Nullable
    public MainButtonsAdapter mainButtonsAdapter;

    @Nullable
    public Function2<? super InvMainButtonsData, ? super View, Unit> mainButtonsClickListener;

    /* renamed from: mainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainViewModel;
    public int migrateCounter;
    public int migrateValueFromInv;
    public int migrateValueFromOther;
    public int migrateValueFromSlots;
    public int modelIdInInv;
    public int modelIdInOther;
    public int modelIdInSlots;

    @Nullable
    public NewDialogForMigrateItems newDialogForMigrateItems;
    public long oldTimeAfterCheck;
    public long oldTimeMigrate;

    @Nullable
    public Function2<? super InvItems, ? super Integer, Unit> onItemsInSlotClickListener;

    @Nullable
    public InventoryExchangeAndTrunkAdapter otherAdapter;

    @Nullable
    public Function2<? super InvItems, ? super Integer, Unit> otherItemClickListener;
    public int statusCarOrHome;
    public int positionFromUsersList = -1;
    public int intermediatePositionFromUsersList = -1;
    public int positionFromOtherList = -1;
    public int intermediatePositionFromOtherList = -1;
    public int positionFromSlot = -1;
    public int intermediatePositionFromSlot = -1;
    public int positionIfThereIsFoldZero = -1;
    public boolean firstShowInv = true;
    public boolean firstShowOther = true;
    public boolean firstShowSlot = true;

    @NotNull
    public final ArrayMap<String, Bitmap> itemRender = new ArrayMap<>();

    /* renamed from: messageErrorFromRes$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy messageErrorFromRes = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$messageErrorFromRes$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return JNIActivity.getContext().getString(R.string.inv_trunk_message_error);
        }
    });

    @NotNull
    public List<InvItems> invItemsFromJson = CollectionsKt__CollectionsKt.emptyList();

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 34;
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment, com.blackhub.bronline.game.ISAMPGUI
    public boolean isShowingGui() {
        return true;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    public final String getMessageErrorFromRes() {
        return (String) this.messageErrorFromRes.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JNIActivityViewModel getMainViewModel() {
        return (JNIActivityViewModel) this.mainViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
        int i;
        CarTrunkOrClosetViewModel carTrunkOrClosetViewModel;
        int i2;
        CarTrunkOrClosetViewModel carTrunkOrClosetViewModel2;
        int i3;
        CarTrunkOrClosetViewModel carTrunkOrClosetViewModel3;
        int i4;
        int i5;
        CarTrunkOrClosetViewModel carTrunkOrClosetViewModel4;
        if (json != null) {
            int optInt = json.optInt("t");
            int optInt2 = json.optInt("s");
            if (optInt == 0) {
                if (optInt2 != 1) {
                    return;
                }
                CarTrunkOrClosetViewModel carTrunkOrClosetViewModel5 = this.carsTrunkOrClosetViewModel;
                if (carTrunkOrClosetViewModel5 != null) {
                    carTrunkOrClosetViewModel5.setThisPlayersWeight(json.optInt("w"));
                    carTrunkOrClosetViewModel5.setOtherWeight(json.optInt(KeyForCarTrunkOrCloset.KEY_BW));
                }
                int i6 = this.intermediatePositionFromOtherList;
                if (i6 == -1 || (i = this.intermediatePositionFromUsersList) == -1 || (carTrunkOrClosetViewModel = this.carsTrunkOrClosetViewModel) == null) {
                    return;
                }
                carTrunkOrClosetViewModel.migrateItemFromInvToOther(i, i6, this.migrateValueFromInv);
                return;
            }
            if (optInt == 1) {
                if (optInt2 != 1) {
                    return;
                }
                this.ifNeedToResize = true;
                CarTrunkOrClosetViewModel carTrunkOrClosetViewModel6 = this.carsTrunkOrClosetViewModel;
                if (carTrunkOrClosetViewModel6 != null) {
                    carTrunkOrClosetViewModel6.setThisPlayersWeight(json.optInt("w"));
                    carTrunkOrClosetViewModel6.setOtherWeight(json.optInt(KeyForCarTrunkOrCloset.KEY_BW));
                }
                int i7 = this.intermediatePositionFromOtherList;
                if (i7 == -1 || (i2 = this.intermediatePositionFromUsersList) == -1 || (carTrunkOrClosetViewModel2 = this.carsTrunkOrClosetViewModel) == null) {
                    return;
                }
                carTrunkOrClosetViewModel2.migrateItemFromOtherToInv(i7, i2, this.migrateValueFromOther);
                return;
            }
            if (optInt != 2) {
                if (optInt != 9 || optInt2 != 1 || (i4 = this.intermediatePositionFromUsersList) == -1 || (i5 = this.intermediatePositionFromSlot) == -1 || (carTrunkOrClosetViewModel4 = this.carsTrunkOrClosetViewModel) == null) {
                    return;
                }
                carTrunkOrClosetViewModel4.migrateItemFromSlotToInv(i5, i4);
                return;
            }
            if (optInt2 != 1) {
                return;
            }
            CarTrunkOrClosetViewModel carTrunkOrClosetViewModel7 = this.carsTrunkOrClosetViewModel;
            if (carTrunkOrClosetViewModel7 != null) {
                carTrunkOrClosetViewModel7.setMaxPlayersWeight(json.optInt("nw"));
                carTrunkOrClosetViewModel7.setSlotsInInventory(json.optInt("ns"));
            }
            int i8 = this.intermediatePositionFromUsersList;
            if (i8 == -1 || (i3 = this.intermediatePositionFromSlot) == -1 || (carTrunkOrClosetViewModel3 = this.carsTrunkOrClosetViewModel) == null) {
                return;
            }
            carTrunkOrClosetViewModel3.migrateItemFromSlotToInv(i3, i8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() {
        this.mainActivity = JNIActivity.getContext();
        initViewModel();
        setObservers((InventoryCarTrunkBinding) getBinding());
        JNILib.toggleDrawing2dStuff(true);
        JNILib.toggleBloor(true);
        initMainButtonsClickListener();
        initDataMainButtons();
        initDialogForMigrateItems();
        initUsersItemClickListener();
        initCarsItemClickListener();
        initSlotClickListener();
        initDataInUsersList();
        initDataInOtherList();
        initDataInSlotsView();
        JSONObject jsonObj = getJsonObj();
        if (jsonObj != null) {
            initItemsFromJson(jsonObj);
        }
        ((InventoryCarTrunkBinding) getBinding()).carTrunkMainButtonExit.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUICarsTrunkOrCloset.initViewsISAMPGUI$lambda$5(GUICarsTrunkOrCloset.this, view);
            }
        });
    }

    public static final void initViewsISAMPGUI$lambda$5(GUICarsTrunkOrCloset this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.ifClickOtherButtonWithDismiss = false;
        this$0.closeFragment();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public InventoryCarTrunkBinding getViewBinding() {
        InventoryCarTrunkBinding inflate = InventoryCarTrunkBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    public final void initItemsFromJson(JSONObject json) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new GUICarsTrunkOrCloset$initItemsFromJson$1(this, json, null));
    }

    private final void initViewModel() {
        this.carsTrunkOrClosetViewModel = (CarTrunkOrClosetViewModel) new ViewModelProvider(this, new CarTrunkOrClosetViewModelFactory()).get(CarTrunkOrClosetViewModel.class);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setObservers(final InventoryCarTrunkBinding binding) {
        if (binding != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            CarTrunkOrClosetViewModel carTrunkOrClosetViewModel = this.carsTrunkOrClosetViewModel;
            if (carTrunkOrClosetViewModel != null) {
                carTrunkOrClosetViewModel.getNewTypeInterface().observe(viewLifecycleOwner, new GUICarsTrunkOrCloset$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$setObservers$1$1$1$1
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
                        GUICarsTrunkOrCloset gUICarsTrunkOrCloset = GUICarsTrunkOrCloset.this;
                        Intrinsics.checkNotNull(num);
                        gUICarsTrunkOrCloset.changeViewInterface(num.intValue());
                    }
                }));
                carTrunkOrClosetViewModel.getNewThisPlayersWeight().observe(viewLifecycleOwner, new GUICarsTrunkOrCloset$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$setObservers$1$1$1$2
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
                        InventoryCarTrunkBinding.this.carTrunkTitleActualWeightUsers.setText(String.valueOf(num));
                    }
                }));
                carTrunkOrClosetViewModel.getNewMaxPlayersWeight().observe(viewLifecycleOwner, new GUICarsTrunkOrCloset$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$setObservers$1$1$1$3
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
                        InventoryCarTrunkBinding.this.carTrunkTitleMaxWeightUsers.setText(String.valueOf(num));
                    }
                }));
                carTrunkOrClosetViewModel.getNewOtherWeight().observe(viewLifecycleOwner, new GUICarsTrunkOrCloset$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$setObservers$1$1$1$4
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
                        InventoryCarTrunkBinding.this.carTrunkTitleActualWeight.setText(String.valueOf(num));
                    }
                }));
                carTrunkOrClosetViewModel.getNewMaxOtherWeight().observe(viewLifecycleOwner, new GUICarsTrunkOrCloset$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$setObservers$1$1$1$5
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
                        InventoryCarTrunkBinding.this.carTrunkTitleMaxWeight.setText(String.valueOf(num));
                    }
                }));
                carTrunkOrClosetViewModel.getNewPlayerItems().observe(viewLifecycleOwner, new GUICarsTrunkOrCloset$sam$androidx_lifecycle_Observer$0(new Function1<List<InvItems>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$setObservers$1$1$1$6
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
                        boolean z2;
                        InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter;
                        InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter2;
                        JNIActivityViewModel mainViewModel;
                        JNIActivityViewModel mainViewModel2;
                        z = GUICarsTrunkOrCloset.this.firstShowInv;
                        if (z) {
                            GUICarsTrunkOrCloset.this.firstShowInv = false;
                            inventoryExchangeAndTrunkAdapter2 = GUICarsTrunkOrCloset.this.invAdapter;
                            if (inventoryExchangeAndTrunkAdapter2 != null) {
                                Intrinsics.checkNotNull(list);
                                int size = list.size();
                                mainViewModel = GUICarsTrunkOrCloset.this.getMainViewModel();
                                List<VehiclesDTO> vehiclesFromJson = mainViewModel.getConfigurationJsons().getValue().getVehiclesFromJson();
                                mainViewModel2 = GUICarsTrunkOrCloset.this.getMainViewModel();
                                inventoryExchangeAndTrunkAdapter2.setItems(list, size, vehiclesFromJson, mainViewModel2.getConfigurationJsons().getValue().getSkinsFromJson());
                            }
                            binding.carTrunkListItemsInInventory.setItemViewCacheSize(list.size());
                            return;
                        }
                        z2 = GUICarsTrunkOrCloset.this.ifNeedToResize;
                        if (z2) {
                            GUICarsTrunkOrCloset.this.ifNeedToResize = false;
                            inventoryExchangeAndTrunkAdapter = GUICarsTrunkOrCloset.this.invAdapter;
                            if (inventoryExchangeAndTrunkAdapter != null) {
                                inventoryExchangeAndTrunkAdapter.notifyDataSetChanged();
                                return;
                            }
                            return;
                        }
                        GUICarsTrunkOrCloset.this.clearInfoAboutUsersItem();
                    }
                }));
                carTrunkOrClosetViewModel.getNewInvPos().observe(viewLifecycleOwner, new GUICarsTrunkOrCloset$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$setObservers$1$1$1$7
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
                        inventoryExchangeAndTrunkAdapter = GUICarsTrunkOrCloset.this.invAdapter;
                        if (inventoryExchangeAndTrunkAdapter != null) {
                            Intrinsics.checkNotNull(num);
                            inventoryExchangeAndTrunkAdapter.notifyItemChanged(num.intValue());
                        }
                    }
                }));
                carTrunkOrClosetViewModel.getNewOtherItems().observe(viewLifecycleOwner, new GUICarsTrunkOrCloset$sam$androidx_lifecycle_Observer$0(new Function1<List<InvItems>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$setObservers$1$1$1$8
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
                        JNIActivityViewModel mainViewModel;
                        JNIActivityViewModel mainViewModel2;
                        z = GUICarsTrunkOrCloset.this.firstShowOther;
                        if (z) {
                            GUICarsTrunkOrCloset.this.firstShowOther = false;
                            inventoryExchangeAndTrunkAdapter = GUICarsTrunkOrCloset.this.otherAdapter;
                            if (inventoryExchangeAndTrunkAdapter != null) {
                                Intrinsics.checkNotNull(list);
                                int size = list.size();
                                mainViewModel = GUICarsTrunkOrCloset.this.getMainViewModel();
                                List<VehiclesDTO> vehiclesFromJson = mainViewModel.getConfigurationJsons().getValue().getVehiclesFromJson();
                                mainViewModel2 = GUICarsTrunkOrCloset.this.getMainViewModel();
                                inventoryExchangeAndTrunkAdapter.setItems(list, size, vehiclesFromJson, mainViewModel2.getConfigurationJsons().getValue().getSkinsFromJson());
                            }
                            binding.carTrunkListItemsInCar.setItemViewCacheSize(list.size());
                            return;
                        }
                        GUICarsTrunkOrCloset.this.clearInfoAboutOtherItem();
                    }
                }));
                carTrunkOrClosetViewModel.getNewOtherPos().observe(viewLifecycleOwner, new GUICarsTrunkOrCloset$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$setObservers$1$1$1$9
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
                        inventoryExchangeAndTrunkAdapter = GUICarsTrunkOrCloset.this.otherAdapter;
                        if (inventoryExchangeAndTrunkAdapter != null) {
                            Intrinsics.checkNotNull(num);
                            inventoryExchangeAndTrunkAdapter.notifyItemChanged(num.intValue());
                        }
                    }
                }));
                carTrunkOrClosetViewModel.getNewSlotItems().observe(viewLifecycleOwner, new GUICarsTrunkOrCloset$sam$androidx_lifecycle_Observer$0(new Function1<List<InvItems>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$setObservers$1$1$1$10
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
                        JNIActivityViewModel mainViewModel;
                        z = GUICarsTrunkOrCloset.this.firstShowSlot;
                        if (z) {
                            GUICarsTrunkOrCloset.this.firstShowSlot = false;
                            inventoryItemsInSlotAdapter = GUICarsTrunkOrCloset.this.itemsInSlotAdapter;
                            if (inventoryItemsInSlotAdapter != null) {
                                Intrinsics.checkNotNull(list);
                                mainViewModel = GUICarsTrunkOrCloset.this.getMainViewModel();
                                inventoryItemsInSlotAdapter.setSlotItems(list, mainViewModel.getConfigurationJsons().getValue().getSkinsFromJson());
                            }
                        }
                        GUICarsTrunkOrCloset.this.clearInfoAboutSlot();
                    }
                }));
                carTrunkOrClosetViewModel.getNewSlotPos().observe(viewLifecycleOwner, new GUICarsTrunkOrCloset$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$setObservers$1$1$1$11
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
                        inventoryItemsInSlotAdapter = GUICarsTrunkOrCloset.this.itemsInSlotAdapter;
                        if (inventoryItemsInSlotAdapter != null) {
                            Intrinsics.checkNotNull(num);
                            inventoryItemsInSlotAdapter.notifyItemChanged(num.intValue());
                        }
                    }
                }));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void changeViewInterface(int typeInterface) {
        InventoryCarTrunkBinding inventoryCarTrunkBinding = (InventoryCarTrunkBinding) getBinding();
        JNIActivity jNIActivity = this.mainActivity;
        if (jNIActivity != null) {
            if (typeInterface == 0) {
                inventoryCarTrunkBinding.carTrunkTextNameCar.setText(jNIActivity.getText(R.string.inv_text_car_trunk));
                inventoryCarTrunkBinding.familyBg.setVisibility(8);
                inventoryCarTrunkBinding.getRoot().setBackgroundColor(jNIActivity.getResources().getColor(2131100871, null));
                this.statusCarOrHome = 1;
                inventoryCarTrunkBinding.carTrunkMainButtons.setVisibility(0);
                return;
            }
            if (typeInterface == 1) {
                inventoryCarTrunkBinding.carTrunkTextNameCar.setText(jNIActivity.getText(R.string.inv_text_closet));
                inventoryCarTrunkBinding.familyBg.setVisibility(8);
                inventoryCarTrunkBinding.getRoot().setBackgroundColor(jNIActivity.getResources().getColor(2131100871, null));
                this.statusCarOrHome = 3;
                inventoryCarTrunkBinding.carTrunkMainButtons.setVisibility(0);
                return;
            }
            if (typeInterface == 2) {
                inventoryCarTrunkBinding.carTrunkTextNameCar.setText(jNIActivity.getText(R.string.common_family_safe));
                inventoryCarTrunkBinding.familyBg.setVisibility(0);
                inventoryCarTrunkBinding.getRoot().setBackgroundColor(jNIActivity.getResources().getColor(R.color.black, null));
                inventoryCarTrunkBinding.carTrunkMainButtons.setVisibility(4);
                return;
            }
            if (typeInterface != 3) {
                return;
            }
            inventoryCarTrunkBinding.carTrunkTextNameCar.setText(jNIActivity.getText(R.string.inv_text_ship_trunk));
            inventoryCarTrunkBinding.familyBg.setVisibility(8);
            inventoryCarTrunkBinding.getRoot().setBackgroundColor(jNIActivity.getResources().getColor(2131100871, null));
            this.statusCarOrHome = 1;
            inventoryCarTrunkBinding.carTrunkMainButtons.setVisibility(0);
        }
    }

    public final void initMainButtonsClickListener() {
        this.mainButtonsClickListener = new Function2<InvMainButtonsData, View, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$initMainButtonsClickListener$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InvMainButtonsData invMainButtonsData, View view) {
                invoke2(invMainButtonsData, view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(@NotNull InvMainButtonsData mainButton, @NotNull View view) {
                Animation anim;
                Intrinsics.checkNotNullParameter(mainButton, "mainButton");
                Intrinsics.checkNotNullParameter(view, "view");
                anim = GUICarsTrunkOrCloset.this.getAnim();
                view.startAnimation(anim);
                int typeMenu = mainButton.getTypeMenu();
                if (typeMenu == 0) {
                    GUICarsTrunkOrCloset.this.mainButtonsClickListener(3);
                    return;
                }
                if (typeMenu == 1) {
                    GUICarsTrunkOrCloset.this.mainButtonsClickListener(4);
                    return;
                }
                if (typeMenu == 2) {
                    GUICarsTrunkOrCloset.this.mainButtonsClickListener(5);
                    return;
                }
                if (typeMenu == 3) {
                    CarTrunkOrClosetActionsWithJSON.INSTANCE.openRadialMenu();
                    GUICarsTrunkOrCloset.this.mainButtonsClickListener(6);
                } else {
                    if (typeMenu != 4) {
                        return;
                    }
                    GUICarsTrunkOrCloset.this.mainButtonsClickListener(7);
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initDataMainButtons() {
        this.mainButtonsAdapter = new MainButtonsAdapter(InventoryUtilsKt.getListButtons(), this.mainButtonsClickListener);
        RecyclerView recyclerView = ((InventoryCarTrunkBinding) getBinding()).carTrunkMainButtons;
        recyclerView.setLayoutManager(new LinearLayoutManager(((InventoryCarTrunkBinding) getBinding()).getRoot().getContext(), 1, false));
        recyclerView.setAdapter(this.mainButtonsAdapter);
    }

    public final void initDialogForMigrateItems() {
        initLogicForDialogMigrateItems();
        this.newDialogForMigrateItems = new NewDialogForMigrateItems(this.clickListenerDialogForMigrateItems, this.itemRender);
    }

    public final void initLogicForDialogMigrateItems() {
        this.clickListenerDialogForMigrateItems = new Function3<Integer, Integer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$initLogicForDialogMigrateItems$1
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
                int i6;
                int i7;
                int i8;
                NewDialogForMigrateItems newDialogForMigrateItems;
                int i9;
                int i10;
                int i11;
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                if (action != 1) {
                    if (action == 2 && applyAction == 11) {
                        i9 = GUICarsTrunkOrCloset.this.positionFromOtherList;
                        if (i9 != -1) {
                            i10 = GUICarsTrunkOrCloset.this.positionFromUsersList;
                            if (i10 != -1) {
                                GUICarsTrunkOrCloset.this.migrateValueFromOther = migrateValue;
                                GUICarsTrunkOrCloset gUICarsTrunkOrCloset = GUICarsTrunkOrCloset.this;
                                i11 = gUICarsTrunkOrCloset.positionFromUsersList;
                                gUICarsTrunkOrCloset.intermediatePositionFromUsersList = i11;
                                GUICarsTrunkOrCloset gUICarsTrunkOrCloset2 = GUICarsTrunkOrCloset.this;
                                i12 = gUICarsTrunkOrCloset2.positionFromOtherList;
                                gUICarsTrunkOrCloset2.intermediatePositionFromOtherList = i12;
                                CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON = CarTrunkOrClosetActionsWithJSON.INSTANCE;
                                i13 = GUICarsTrunkOrCloset.this.idInOther;
                                i14 = GUICarsTrunkOrCloset.this.positionFromOtherList;
                                i15 = GUICarsTrunkOrCloset.this.positionFromUsersList;
                                i16 = GUICarsTrunkOrCloset.this.migrateValueFromOther;
                                carTrunkOrClosetActionsWithJSON.sendIdWithOldAndNewPositionsAndValueToServer(1, i13, i14, i15, i16);
                            }
                        }
                    }
                } else if (applyAction == 11) {
                    i = GUICarsTrunkOrCloset.this.positionFromUsersList;
                    if (i != -1) {
                        i2 = GUICarsTrunkOrCloset.this.positionFromOtherList;
                        if (i2 != -1) {
                            GUICarsTrunkOrCloset.this.migrateValueFromInv = migrateValue;
                            GUICarsTrunkOrCloset gUICarsTrunkOrCloset3 = GUICarsTrunkOrCloset.this;
                            i3 = gUICarsTrunkOrCloset3.positionFromUsersList;
                            gUICarsTrunkOrCloset3.intermediatePositionFromUsersList = i3;
                            GUICarsTrunkOrCloset gUICarsTrunkOrCloset4 = GUICarsTrunkOrCloset.this;
                            i4 = gUICarsTrunkOrCloset4.positionFromOtherList;
                            gUICarsTrunkOrCloset4.intermediatePositionFromOtherList = i4;
                            CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON2 = CarTrunkOrClosetActionsWithJSON.INSTANCE;
                            i5 = GUICarsTrunkOrCloset.this.idInInv;
                            i6 = GUICarsTrunkOrCloset.this.positionFromUsersList;
                            i7 = GUICarsTrunkOrCloset.this.positionFromOtherList;
                            i8 = GUICarsTrunkOrCloset.this.migrateValueFromInv;
                            carTrunkOrClosetActionsWithJSON2.sendIdWithOldAndNewPositionsAndValueToServer(0, i5, i6, i7, i8);
                        }
                    }
                }
                newDialogForMigrateItems = GUICarsTrunkOrCloset.this.newDialogForMigrateItems;
                if (newDialogForMigrateItems != null) {
                    newDialogForMigrateItems.closeDialogForMigrate();
                }
            }
        };
    }

    public final void initUsersItemClickListener() {
        this.invItemClickListener = new Function2<InvItems, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$initUsersItemClickListener$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InvItems invItems, Integer num) {
                invoke(invItems, num.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull InvItems item, int position) {
                long j;
                long j2;
                InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter;
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
                long j3;
                int i13;
                int i14;
                String messageErrorFromRes;
                long j4;
                int i15;
                int i16;
                int i17;
                int i18;
                int i19;
                NewDialogForMigrateItems newDialogForMigrateItems;
                InvItems invItems;
                InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter2;
                int unused;
                Intrinsics.checkNotNullParameter(item, "item");
                j = GUICarsTrunkOrCloset.this.oldTimeAfterCheck;
                if (j != System.currentTimeMillis()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    j2 = GUICarsTrunkOrCloset.this.oldTimeAfterCheck;
                    if (currentTimeMillis - j2 > 500) {
                        GUICarsTrunkOrCloset.this.oldTimeAfterCheck = System.currentTimeMillis();
                        GUICarsTrunkOrCloset.this.positionFromUsersList = position;
                        inventoryExchangeAndTrunkAdapter = GUICarsTrunkOrCloset.this.invAdapter;
                        if (inventoryExchangeAndTrunkAdapter != null) {
                            inventoryExchangeAndTrunkAdapter.setCheckOnlyElement(position);
                        }
                        GUICarsTrunkOrCloset gUICarsTrunkOrCloset = GUICarsTrunkOrCloset.this;
                        gUICarsTrunkOrCloset.migrateValueFromInv = item.getItemsValue();
                        gUICarsTrunkOrCloset.idInInv = item.getId();
                        gUICarsTrunkOrCloset.modelIdInInv = item.getModelid();
                        gUICarsTrunkOrCloset.itemFromInv = item;
                        if (item.getItemsValue() == 0) {
                            i = GUICarsTrunkOrCloset.this.positionFromOtherList;
                            if (i != -1) {
                                i11 = GUICarsTrunkOrCloset.this.migrateValueFromOther;
                                if (i11 != 0) {
                                    i12 = GUICarsTrunkOrCloset.this.idInOther;
                                    switch (i12) {
                                        case Constants.ID_TACKLE_1 /* 642 */:
                                        case Constants.ID_TACKLE_2 /* 643 */:
                                        case Constants.ID_TACKLE_3 /* 644 */:
                                        case Constants.ID_TACKLE_4 /* 645 */:
                                        case Constants.ID_TACKLE_5 /* 646 */:
                                            break;
                                        default:
                                            i19 = GUICarsTrunkOrCloset.this.migrateValueFromOther;
                                            if (i19 != 1) {
                                                newDialogForMigrateItems = GUICarsTrunkOrCloset.this.newDialogForMigrateItems;
                                                if (newDialogForMigrateItems != null) {
                                                    invItems = GUICarsTrunkOrCloset.this.itemFromOther;
                                                    newDialogForMigrateItems.showDialogForMigrateItem(invItems, 2);
                                                    return;
                                                }
                                                return;
                                            }
                                            break;
                                    }
                                    j3 = GUICarsTrunkOrCloset.this.oldTimeMigrate;
                                    if (j3 != System.currentTimeMillis()) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        j4 = GUICarsTrunkOrCloset.this.oldTimeMigrate;
                                        if (currentTimeMillis2 - j4 > 1000) {
                                            GUICarsTrunkOrCloset.this.oldTimeMigrate = System.currentTimeMillis();
                                            i15 = GUICarsTrunkOrCloset.this.idInOther;
                                            int i20 = i15 == 134 ? GUICarsTrunkOrCloset.this.modelIdInOther : GUICarsTrunkOrCloset.this.migrateValueFromOther;
                                            GUICarsTrunkOrCloset gUICarsTrunkOrCloset2 = GUICarsTrunkOrCloset.this;
                                            i16 = gUICarsTrunkOrCloset2.positionFromOtherList;
                                            gUICarsTrunkOrCloset2.intermediatePositionFromOtherList = i16;
                                            GUICarsTrunkOrCloset.this.intermediatePositionFromUsersList = position;
                                            CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON = CarTrunkOrClosetActionsWithJSON.INSTANCE;
                                            i17 = GUICarsTrunkOrCloset.this.idInOther;
                                            i18 = GUICarsTrunkOrCloset.this.positionFromOtherList;
                                            carTrunkOrClosetActionsWithJSON.sendIdWithOldAndNewPositionsAndValueToServer(1, i17, i18, position, i20);
                                            GUICarsTrunkOrCloset.this.migrateCounter = 0;
                                            return;
                                        }
                                    }
                                    i13 = GUICarsTrunkOrCloset.this.migrateCounter;
                                    if (i13 == 0) {
                                        CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON2 = CarTrunkOrClosetActionsWithJSON.INSTANCE;
                                        messageErrorFromRes = GUICarsTrunkOrCloset.this.getMessageErrorFromRes();
                                        Intrinsics.checkNotNullExpressionValue(messageErrorFromRes, "access$getMessageErrorFromRes(...)");
                                        carTrunkOrClosetActionsWithJSON2.sendMessageError(messageErrorFromRes);
                                    }
                                    GUICarsTrunkOrCloset gUICarsTrunkOrCloset3 = GUICarsTrunkOrCloset.this;
                                    i14 = gUICarsTrunkOrCloset3.migrateCounter;
                                    gUICarsTrunkOrCloset3.migrateCounter = i14 + 1;
                                    unused = gUICarsTrunkOrCloset3.migrateCounter;
                                    GUICarsTrunkOrCloset.this.clearInfoAboutOtherItem();
                                    GUICarsTrunkOrCloset.this.clearInfoAboutSlot();
                                    GUICarsTrunkOrCloset.this.clearInfoAboutUsersItem();
                                    return;
                                }
                            }
                            i2 = GUICarsTrunkOrCloset.this.positionFromSlot;
                            if (i2 != -1) {
                                i3 = GUICarsTrunkOrCloset.this.migrateValueFromSlots;
                                if (i3 != 0) {
                                    i4 = GUICarsTrunkOrCloset.this.idInSlots;
                                    if (i4 == 58) {
                                        GUICarsTrunkOrCloset.this.intermediatePositionFromUsersList = position;
                                        GUICarsTrunkOrCloset gUICarsTrunkOrCloset4 = GUICarsTrunkOrCloset.this;
                                        i5 = gUICarsTrunkOrCloset4.positionFromSlot;
                                        gUICarsTrunkOrCloset4.intermediatePositionFromSlot = i5;
                                        CarTrunkOrClosetActionsWithJSON.INSTANCE.sendPositionToServer(9, position);
                                        return;
                                    }
                                    if (i4 != 134) {
                                        i8 = GUICarsTrunkOrCloset.this.positionFromSlot;
                                        GUICarsTrunkOrCloset.this.intermediatePositionFromUsersList = position;
                                        GUICarsTrunkOrCloset gUICarsTrunkOrCloset5 = GUICarsTrunkOrCloset.this;
                                        i9 = gUICarsTrunkOrCloset5.positionFromSlot;
                                        gUICarsTrunkOrCloset5.intermediatePositionFromSlot = i9;
                                        CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON3 = CarTrunkOrClosetActionsWithJSON.INSTANCE;
                                        i10 = GUICarsTrunkOrCloset.this.idInSlots;
                                        carTrunkOrClosetActionsWithJSON3.sendIdWithOldAndNewPositionsToServer(2, i10, i8 - 2, position);
                                        return;
                                    }
                                    GUICarsTrunkOrCloset.this.intermediatePositionFromUsersList = position;
                                    GUICarsTrunkOrCloset gUICarsTrunkOrCloset6 = GUICarsTrunkOrCloset.this;
                                    i6 = gUICarsTrunkOrCloset6.positionFromSlot;
                                    gUICarsTrunkOrCloset6.intermediatePositionFromSlot = i6;
                                    CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON4 = CarTrunkOrClosetActionsWithJSON.INSTANCE;
                                    i7 = GUICarsTrunkOrCloset.this.idInSlots;
                                    carTrunkOrClosetActionsWithJSON4.sendIdWithOldAndNewPositionsToServer(2, i7, 6, position);
                                    return;
                                }
                            }
                            GUICarsTrunkOrCloset.this.clearInfoAboutOtherItem();
                            return;
                        }
                        item.setCheck(true);
                        inventoryExchangeAndTrunkAdapter2 = GUICarsTrunkOrCloset.this.invAdapter;
                        if (inventoryExchangeAndTrunkAdapter2 != null) {
                            inventoryExchangeAndTrunkAdapter2.notifyItemChanged(position);
                            inventoryExchangeAndTrunkAdapter2.setCheckOnlyElement(position);
                        }
                        GUICarsTrunkOrCloset.this.clearInfoAboutOtherItem();
                        GUICarsTrunkOrCloset.this.clearInfoAboutSlot();
                    }
                }
            }
        };
    }

    public final void initCarsItemClickListener() {
        this.otherItemClickListener = new Function2<InvItems, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$initCarsItemClickListener$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InvItems invItems, Integer num) {
                invoke(invItems, num.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull InvItems item, int position) {
                long j;
                long j2;
                InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter;
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
                InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter2;
                int unused;
                Intrinsics.checkNotNullParameter(item, "item");
                j = GUICarsTrunkOrCloset.this.oldTimeAfterCheck;
                if (j != System.currentTimeMillis()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    j2 = GUICarsTrunkOrCloset.this.oldTimeAfterCheck;
                    if (currentTimeMillis - j2 > 500) {
                        GUICarsTrunkOrCloset.this.oldTimeAfterCheck = System.currentTimeMillis();
                        GUICarsTrunkOrCloset.this.positionFromOtherList = position;
                        inventoryExchangeAndTrunkAdapter = GUICarsTrunkOrCloset.this.otherAdapter;
                        if (inventoryExchangeAndTrunkAdapter != null) {
                            inventoryExchangeAndTrunkAdapter.setCheckOnlyElement(position);
                        }
                        GUICarsTrunkOrCloset gUICarsTrunkOrCloset = GUICarsTrunkOrCloset.this;
                        gUICarsTrunkOrCloset.migrateValueFromOther = item.getItemsValue();
                        gUICarsTrunkOrCloset.idInOther = item.getId();
                        gUICarsTrunkOrCloset.modelIdInOther = item.getModelid();
                        gUICarsTrunkOrCloset.itemFromOther = item;
                        if (item.getItemsValue() == 0) {
                            i = GUICarsTrunkOrCloset.this.positionFromUsersList;
                            if (i != -1) {
                                i2 = GUICarsTrunkOrCloset.this.migrateValueFromInv;
                                if (i2 != 0) {
                                    i3 = GUICarsTrunkOrCloset.this.idInInv;
                                    switch (i3) {
                                        case Constants.ID_TACKLE_1 /* 642 */:
                                        case Constants.ID_TACKLE_2 /* 643 */:
                                        case Constants.ID_TACKLE_3 /* 644 */:
                                        case Constants.ID_TACKLE_4 /* 645 */:
                                        case Constants.ID_TACKLE_5 /* 646 */:
                                            break;
                                        default:
                                            i10 = GUICarsTrunkOrCloset.this.migrateValueFromInv;
                                            if (i10 != 1) {
                                                newDialogForMigrateItems = GUICarsTrunkOrCloset.this.newDialogForMigrateItems;
                                                if (newDialogForMigrateItems != null) {
                                                    invItems = GUICarsTrunkOrCloset.this.itemFromInv;
                                                    newDialogForMigrateItems.showDialogForMigrateItem(invItems, 1);
                                                    return;
                                                }
                                                return;
                                            }
                                            break;
                                    }
                                    j3 = GUICarsTrunkOrCloset.this.oldTimeMigrate;
                                    if (j3 != System.currentTimeMillis()) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        j4 = GUICarsTrunkOrCloset.this.oldTimeMigrate;
                                        if (currentTimeMillis2 - j4 > 1000) {
                                            GUICarsTrunkOrCloset.this.oldTimeMigrate = System.currentTimeMillis();
                                            i6 = GUICarsTrunkOrCloset.this.idInInv;
                                            int i11 = i6 == 134 ? GUICarsTrunkOrCloset.this.modelIdInInv : GUICarsTrunkOrCloset.this.migrateValueFromInv;
                                            GUICarsTrunkOrCloset gUICarsTrunkOrCloset2 = GUICarsTrunkOrCloset.this;
                                            i7 = gUICarsTrunkOrCloset2.positionFromUsersList;
                                            gUICarsTrunkOrCloset2.intermediatePositionFromUsersList = i7;
                                            GUICarsTrunkOrCloset.this.intermediatePositionFromOtherList = position;
                                            CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON = CarTrunkOrClosetActionsWithJSON.INSTANCE;
                                            i8 = GUICarsTrunkOrCloset.this.idInInv;
                                            i9 = GUICarsTrunkOrCloset.this.positionFromUsersList;
                                            carTrunkOrClosetActionsWithJSON.sendIdWithOldAndNewPositionsAndValueToServer(0, i8, i9, position, i11);
                                            GUICarsTrunkOrCloset.this.migrateCounter = 0;
                                            return;
                                        }
                                    }
                                    i4 = GUICarsTrunkOrCloset.this.migrateCounter;
                                    if (i4 == 0) {
                                        CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON2 = CarTrunkOrClosetActionsWithJSON.INSTANCE;
                                        messageErrorFromRes = GUICarsTrunkOrCloset.this.getMessageErrorFromRes();
                                        Intrinsics.checkNotNullExpressionValue(messageErrorFromRes, "access$getMessageErrorFromRes(...)");
                                        carTrunkOrClosetActionsWithJSON2.sendMessageError(messageErrorFromRes);
                                    }
                                    GUICarsTrunkOrCloset gUICarsTrunkOrCloset3 = GUICarsTrunkOrCloset.this;
                                    i5 = gUICarsTrunkOrCloset3.migrateCounter;
                                    gUICarsTrunkOrCloset3.migrateCounter = i5 + 1;
                                    unused = gUICarsTrunkOrCloset3.migrateCounter;
                                    GUICarsTrunkOrCloset.this.clearInfoAboutOtherItem();
                                    GUICarsTrunkOrCloset.this.clearInfoAboutSlot();
                                    GUICarsTrunkOrCloset.this.clearInfoAboutUsersItem();
                                    return;
                                }
                            }
                            GUICarsTrunkOrCloset.this.clearInfoAboutUsersItem();
                            return;
                        }
                        item.setCheck(true);
                        inventoryExchangeAndTrunkAdapter2 = GUICarsTrunkOrCloset.this.otherAdapter;
                        if (inventoryExchangeAndTrunkAdapter2 != null) {
                            inventoryExchangeAndTrunkAdapter2.notifyItemChanged(position);
                            inventoryExchangeAndTrunkAdapter2.setCheckOnlyElement(position);
                        }
                        GUICarsTrunkOrCloset.this.clearInfoAboutUsersItem();
                        GUICarsTrunkOrCloset.this.clearInfoAboutSlot();
                    }
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initDataInUsersList() {
        this.invAdapter = new InventoryExchangeAndTrunkAdapter(this.invItemClickListener, 0, this.itemRender);
        RecyclerView recyclerView = ((InventoryCarTrunkBinding) getBinding()).carTrunkListItemsInInventory;
        recyclerView.setLayoutManager(new GridLayoutManager(((InventoryCarTrunkBinding) getBinding()).getRoot().getContext(), 4));
        recyclerView.setAdapter(this.invAdapter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initDataInOtherList() {
        this.otherAdapter = new InventoryExchangeAndTrunkAdapter(this.otherItemClickListener, 1, this.itemRender);
        RecyclerView recyclerView = ((InventoryCarTrunkBinding) getBinding()).carTrunkListItemsInCar;
        recyclerView.setLayoutManager(new GridLayoutManager(((InventoryCarTrunkBinding) getBinding()).getRoot().getContext(), 4));
        recyclerView.setAdapter(this.otherAdapter);
    }

    public final void getStartData(JSONObject json) {
        CarTrunkOrClosetViewModel carTrunkOrClosetViewModel = this.carsTrunkOrClosetViewModel;
        if (carTrunkOrClosetViewModel != null) {
            carTrunkOrClosetViewModel.setTypeInterface(json.optInt("tb"));
            carTrunkOrClosetViewModel.setThisPlayersWeight(json.optInt("w"));
            carTrunkOrClosetViewModel.setMaxPlayersWeight(json.optInt("mw"));
            carTrunkOrClosetViewModel.setOtherWeight(json.optInt(KeyForCarTrunkOrCloset.KEY_BW));
            carTrunkOrClosetViewModel.setMaxOtherWeight(json.optInt(KeyForCarTrunkOrCloset.KEY_CW));
            carTrunkOrClosetViewModel.initPlayerItems(json.optJSONArray("it"), this.invItemsFromJson, json.optInt("sl"));
            carTrunkOrClosetViewModel.initOtherItems(json.optJSONArray(KeyForCarTrunkOrCloset.KEY_IC), this.invItemsFromJson, json.optInt("sb"));
            carTrunkOrClosetViewModel.initSlotItems(json.optJSONArray("ai"), this.invItemsFromJson, json.optInt("nm"));
        }
    }

    public final void initSlotClickListener() {
        this.onItemsInSlotClickListener = new Function2<InvItems, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$initSlotClickListener$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InvItems invItems, Integer num) {
                invoke(invItems, num.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull InvItems item, int position) {
                InventoryItemsInSlotAdapter inventoryItemsInSlotAdapter;
                Intrinsics.checkNotNullParameter(item, "item");
                GUICarsTrunkOrCloset.this.positionFromSlot = position;
                GUICarsTrunkOrCloset.this.clearInfoAboutOtherItem();
                GUICarsTrunkOrCloset.this.clearInfoAboutUsersItem();
                GUICarsTrunkOrCloset gUICarsTrunkOrCloset = GUICarsTrunkOrCloset.this;
                if (item.getItemsValue() != 0) {
                    item.setCheck(true);
                    gUICarsTrunkOrCloset.migrateValueFromSlots = item.getItemsValue();
                    gUICarsTrunkOrCloset.idInSlots = item.getId();
                    gUICarsTrunkOrCloset.modelIdInSlots = item.getModelid();
                    inventoryItemsInSlotAdapter = gUICarsTrunkOrCloset.itemsInSlotAdapter;
                    if (inventoryItemsInSlotAdapter != null) {
                        inventoryItemsInSlotAdapter.notifyItemChanged(position);
                        inventoryItemsInSlotAdapter.setCheckOnlyElement(position);
                    }
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initDataInSlotsView() {
        this.itemsInSlotAdapter = new InventoryItemsInSlotAdapter(this.onItemsInSlotClickListener, false, this.itemRender);
        RecyclerView recyclerView = ((InventoryCarTrunkBinding) getBinding()).playersSlotsInCarTrunk;
        recyclerView.setLayoutManager(new LinearLayoutManager(((InventoryCarTrunkBinding) getBinding()).getRoot().getContext(), 1, false));
        recyclerView.setAdapter(this.itemsInSlotAdapter);
    }

    public final void clearInfoAboutOtherItem() {
        this.migrateValueFromOther = 0;
        this.idInOther = 0;
        this.positionFromOtherList = -1;
        this.modelIdInOther = 0;
        this.intermediatePositionFromOtherList = -1;
        this.itemFromOther = null;
        this.positionIfThereIsFoldZero = -1;
        InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = this.otherAdapter;
        if (inventoryExchangeAndTrunkAdapter != null) {
            inventoryExchangeAndTrunkAdapter.setCheckOnlyElement(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearInfoAboutSlot() {
        this.idInSlots = 0;
        this.migrateValueFromSlots = 0;
        this.modelIdInSlots = 0;
        this.positionFromSlot = -1;
        this.intermediatePositionFromSlot = -1;
        InventoryItemsInSlotAdapter inventoryItemsInSlotAdapter = this.itemsInSlotAdapter;
        if (inventoryItemsInSlotAdapter != null) {
            inventoryItemsInSlotAdapter.setCheckOnlyElement(-1);
        }
    }

    public final void clearInfoAboutUsersItem() {
        this.migrateValueFromInv = 0;
        this.idInInv = 0;
        this.positionFromUsersList = -1;
        this.modelIdInInv = 0;
        this.intermediatePositionFromUsersList = -1;
        this.itemFromInv = null;
        this.positionIfThereIsFoldZero = -1;
        InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = this.invAdapter;
        if (inventoryExchangeAndTrunkAdapter != null) {
            inventoryExchangeAndTrunkAdapter.setCheckOnlyElement(-1);
        }
    }

    public final void mainButtonsClickListener(int typeButton) {
        this.ifClickOtherButtonWithDismiss = true;
        CarTrunkOrClosetActionsWithJSON.INSTANCE.sendPressButton(typeButton);
        closeFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        JNILib.toggleDrawing2dStuff(false);
        JNILib.toggleBloor(false);
        if (!this.ifClickOtherButtonWithDismiss) {
            CarTrunkOrClosetActionsWithJSON.INSTANCE.sendPressButton(8);
        }
        NewDialogForMigrateItems newDialogForMigrateItems = this.newDialogForMigrateItems;
        if (newDialogForMigrateItems != null) {
            newDialogForMigrateItems.closeDialogForMigrate();
        }
        setNullableParameters();
    }

    private final void setNullableParameters() {
        this.mainActivity = null;
        this.mainButtonsAdapter = null;
        this.otherAdapter = null;
        this.invAdapter = null;
        this.invItemClickListener = null;
        this.otherItemClickListener = null;
        this.itemsInSlotAdapter = null;
        this.onItemsInSlotClickListener = null;
    }

    public GUICarsTrunkOrCloset() {
        final Function0 function0 = null;
        this.mainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(JNIActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = Fragment.this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = Function0.this;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$mainViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity requireActivity = GUICarsTrunkOrCloset.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                return (ViewModelProvider.Factory) new ViewModelProvider(requireActivity).get(JNIActivityViewModel.class);
            }
        });
    }
}
