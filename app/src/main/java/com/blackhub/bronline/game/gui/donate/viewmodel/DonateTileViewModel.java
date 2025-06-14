package com.blackhub.bronline.game.gui.donate.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.gui.donate.data.DonateItem;
import com.blackhub.bronline.game.gui.donate.data.DonateTileObj;
import com.blackhub.bronline.game.gui.donate.network.DonateActionWithJSON;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: DonateTileViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\tH\u0002J\u001c\u0010 \u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082@¢\u0006\u0002\u0010\"J\u0006\u0010#\u001a\u00020\u001eJ\u000e\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0016J\u0006\u0010&\u001a\u00020\u001eJ\u001d\u0010'\u001a\u00020\u001e2\b\u0010(\u001a\u0004\u0018\u00010\u00162\u0006\u0010)\u001a\u00020\u0016¢\u0006\u0002\u0010*J\u001e\u0010+\u001a\u00020\u001e2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010-\u001a\u0004\u0018\u00010.J\u0016\u0010/\u001a\u00020\u001e2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\t0\u0015H\u0002J\u0010\u00101\u001a\u00020\u001e2\b\u00102\u001a\u0004\u0018\u00010.J \u00103\u001a\u00020\u001e2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J$\u00104\u001a\b\u0012\u0004\u0012\u00020\t0\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u00106\u001a\u000207H\u0002J\u001e\u00108\u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u00152\u0006\u00109\u001a\u00020\u0016H\u0002J\u0016\u0010:\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010;J\u0010\u0010<\u001a\u00020\u001e2\u0006\u0010=\u001a\u00020\u0016H\u0002J\u001e\u0010>\u001a\u00020\u001e2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010@\u001a\u00020\u000eH\u0002J&\u0010A\u001a\u00020\u001e2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\b\u0010C\u001a\u00020\u001eH\u0014J\u0006\u0010D\u001a\u00020\u001eJ\u000e\u0010E\u001a\u00020\u001e2\u0006\u00102\u001a\u00020.J\u000e\u0010F\u001a\u00020\u001e2\u0006\u0010=\u001a\u00020\u0016J\u001f\u0010G\u001a\u00020\u001e2\b\u0010(\u001a\u0004\u0018\u00010\u00162\u0006\u0010)\u001a\u00020\u0016H\u0002¢\u0006\u0002\u0010*J\u0006\u0010H\u001a\u00020\u001eJ\u0006\u0010I\u001a\u00020\u001eJ \u0010J\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u00162\u0006\u0010L\u001a\u00020\u0016H\u0002J\u000e\u0010M\u001a\u00020\u001e2\u0006\u00102\u001a\u00020.J$\u0010N\u001a\u00020\u001e2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\u000e\u0010P\u001a\u00020\u001e2\u0006\u00102\u001a\u00020.J\u0010\u0010Q\u001a\u00020\u001e2\b\u0010R\u001a\u0004\u0018\u00010SJ\u0016\u0010T\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010;J \u0010U\u001a\u00020\u001e2\u000e\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010W\u001a\u00020\tH\u0002J\u001e\u0010X\u001a\u00020\u001e2\u0006\u0010W\u001a\u00020\t2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\t0\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006Y"}, d2 = {"Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateTileViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "actionWithJson", "Lcom/blackhub/bronline/game/gui/donate/network/DonateActionWithJSON;", "(Lcom/blackhub/bronline/game/gui/donate/network/DonateActionWithJSON;)V", "mutableAccessories", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/blackhub/bronline/game/gui/donate/data/DonateItem;", "mutableCarPacks", "mutableCars", "mutableCurrentItems", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/blackhub/bronline/game/gui/donate/data/DonateTileObj;", "mutableDonateItemsFromJSON", "mutableMoneyPacks", "mutablePacks", "mutableSaleItems", "mutableSkins", "mutableValueOfLimits", "", "", "mutableVipPacks", "mutableVips", "newCurrentItems", "Lkotlinx/coroutines/flow/SharedFlow;", "getNewCurrentItems", "()Lkotlinx/coroutines/flow/SharedFlow;", "changeSaleInfo", "", "currentItem", "checkAndUpdateCurrentItems", "saleItems", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearData", "clearLimit", "itemId", "clickButtonBack", "getCarsOrVIPFromCurrentCategory", "categoryId", "oldPage", "(Ljava/lang/Integer;I)V", "initDonateItemsFromJSON", "allItems", "json", "Lorg/json/JSONObject;", "initOtherMoneyPack", "moneyPacks", "initSaleItems", "jsonObject", "lInitAllItems", "lInitSalesItems", "sales", "ifGoodVersion", "", "lInitSurpriseItem", "timeForOpening", "lRemoveSaleItemInfo", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lSetCurrentPage", "newPage", "lUpdateCurrentCollection", "valueOfLimit", "currentCollection", "lUpdateSaleTime", "newSaleInfo", "onCleared", "openingSurprise", "removeSaleItemInfoAndUpdateLimit", "setCurrentPage", "showCurrentCategory", "showPackGee", "showVIPPlatinumItems", "updateLimitForObj", "currentId", "newLimit", "updateNewSaleItems", "updateOldLimits", "oldLimit", "updateSurpriseAndSalesEveryMinute", "updateValueOfLimit", "jsonArray", "Lorg/json/JSONArray;", "updateValueOfLimitForCurrentItem", "whiteUpTag", "allTags", IconCompat.EXTRA_OBJ, "writeObjToCollection", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDonateTileViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DonateTileViewModel.kt\ncom/blackhub/bronline/game/gui/donate/viewmodel/DonateTileViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,582:1\n1#2:583\n230#3,5:584\n230#3,5:589\n230#3,5:594\n230#3,5:599\n230#3,5:604\n230#3,5:609\n230#3,5:614\n230#3,5:619\n230#3,5:624\n*S KotlinDebug\n*F\n+ 1 DonateTileViewModel.kt\ncom/blackhub/bronline/game/gui/donate/viewmodel/DonateTileViewModel\n*L\n477#1:584,5\n478#1:589,5\n479#1:594,5\n480#1:599,5\n481#1:604,5\n482#1:609,5\n483#1:614,5\n484#1:619,5\n485#1:624,5\n*E\n"})
/* loaded from: classes3.dex */
public final class DonateTileViewModel extends ViewModel implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final DonateActionWithJSON actionWithJson;

    @NotNull
    public final MutableStateFlow<List<DonateItem>> mutableAccessories;

    @NotNull
    public final MutableStateFlow<List<DonateItem>> mutableCarPacks;

    @NotNull
    public final MutableStateFlow<List<DonateItem>> mutableCars;

    @NotNull
    public final MutableSharedFlow<DonateTileObj> mutableCurrentItems;

    @NotNull
    public final MutableStateFlow<List<DonateItem>> mutableDonateItemsFromJSON;

    @NotNull
    public final MutableStateFlow<List<DonateItem>> mutableMoneyPacks;

    @NotNull
    public final MutableStateFlow<List<DonateItem>> mutablePacks;

    @NotNull
    public final MutableStateFlow<List<DonateItem>> mutableSaleItems;

    @NotNull
    public final MutableStateFlow<List<DonateItem>> mutableSkins;

    @NotNull
    public final MutableStateFlow<List<Integer>> mutableValueOfLimits;

    @NotNull
    public final MutableStateFlow<List<DonateItem>> mutableVipPacks;

    @NotNull
    public final MutableStateFlow<List<DonateItem>> mutableVips;

    @NotNull
    public final SharedFlow<DonateTileObj> newCurrentItems;

    @Inject
    public DonateTileViewModel(@NotNull DonateActionWithJSON actionWithJson) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        this.actionWithJson = actionWithJson;
        this.mutableDonateItemsFromJSON = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableSaleItems = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableCars = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableSkins = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutablePacks = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableVips = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableMoneyPacks = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableVipPacks = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableCarPacks = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableAccessories = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        MutableSharedFlow<DonateTileObj> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableCurrentItems = MutableSharedFlow$default;
        this.newCurrentItems = MutableSharedFlow$default;
        this.mutableValueOfLimits = StateFlowKt.MutableStateFlow(new ArrayList());
    }

    @NotNull
    public final SharedFlow<DonateTileObj> getNewCurrentItems() {
        return this.newCurrentItems;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        clearData();
        super.onCleared();
    }

    public final void initDonateItemsFromJSON(@NotNull List<DonateItem> allItems, @Nullable JSONObject json) {
        Intrinsics.checkNotNullParameter(allItems, "allItems");
        this.mutableDonateItemsFromJSON.setValue(allItems);
        lInitAllItems(allItems, json);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0045 A[Catch: Exception -> 0x000f, TryCatch #0 {Exception -> 0x000f, blocks: (B:105:0x0002, B:107:0x000a, B:3:0x0013, B:4:0x003f, B:6:0x0045, B:8:0x0051, B:11:0x0058, B:14:0x005e, B:67:0x00cd, B:70:0x00d5, B:59:0x00bd, B:62:0x00c4, B:52:0x00ae, B:55:0x00b6, B:45:0x00a0, B:48:0x00a7, B:38:0x0092, B:41:0x0099, B:31:0x0084, B:34:0x008b, B:24:0x0076, B:27:0x007d, B:16:0x0068, B:19:0x006f, B:96:0x00da), top: B:104:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void lInitAllItems(java.util.List<com.blackhub.bronline.game.gui.donate.data.DonateItem> r13, org.json.JSONObject r14) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel.lInitAllItems(java.util.List, org.json.JSONObject):void");
    }

    public final void whiteUpTag(List<Integer> allTags, DonateItem obj) {
        if (allTags != null) {
            int i = 0;
            int i2 = 1;
            while (i < allTags.size()) {
                int intValue = allTags.get(i).intValue();
                Integer internalId = obj.getInternalId();
                if (internalId != null && intValue == internalId.intValue()) {
                    obj.setUpTag(allTags.get(i2).intValue());
                }
                i += 2;
                i2 += 2;
            }
            Unit unit = Unit.INSTANCE;
            return;
        }
        new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$whiteUpTag$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                DonateTileViewModel.this.setCurrentPage(2);
                DonateTileViewModel.this.setCurrentPage(4);
            }
        };
    }

    public final void writeObjToCollection(DonateItem obj, List<DonateItem> currentCollection) {
        obj.setAssignedId(currentCollection.size() + 1);
        currentCollection.add(obj);
    }

    public final void initOtherMoneyPack(List<DonateItem> moneyPacks) {
        DonateItem donateItem = new DonateItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, false, -1, null);
        donateItem.setUpTag(200);
        Unit unit = Unit.INSTANCE;
        moneyPacks.add(0, donateItem);
    }

    public final void setCurrentPage(int newPage) {
        try {
            lSetCurrentPage(newPage);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void lSetCurrentPage(int newPage) {
        List<DonateItem> value;
        if (newPage == 0) {
            value = this.mutableSaleItems.getValue();
        } else if (newPage == 1) {
            value = this.mutableCars.getValue();
        } else if (newPage == 2) {
            value = this.mutableSkins.getValue();
        } else if (newPage == 3) {
            value = this.mutablePacks.getValue();
        } else if (newPage == 4) {
            value = this.mutableVips.getValue();
        } else if (newPage == 6) {
            value = this.mutableMoneyPacks.getValue();
        } else if (newPage == 7) {
            value = this.mutableCarPacks.getValue();
        } else if (newPage == 9) {
            value = this.mutableVipPacks.getValue();
        } else if (newPage == 11) {
            value = this.mutableAccessories.getValue();
        } else {
            value = CollectionsKt__CollectionsKt.emptyList();
        }
        lUpdateCurrentCollection(this.mutableValueOfLimits.getValue(), new DonateTileObj(value, newPage));
    }

    public final void initSaleItems(@Nullable JSONObject jsonObject) {
        List<Integer> list;
        if (jsonObject != null) {
            try {
                JSONArray optJSONArray = jsonObject.optJSONArray("s");
                if (optJSONArray != null) {
                    Intrinsics.checkNotNull(optJSONArray);
                    list = JsonArrayExtensionKt.toMutableIntList(optJSONArray);
                } else {
                    list = null;
                }
                if (list != null) {
                    List<DonateItem> lInitSalesItems = lInitSalesItems(list, true);
                    lInitSurpriseItem(lInitSalesItems, jsonObject.optInt("p"));
                    this.mutableSaleItems.setValue(lInitSalesItems);
                    lSetCurrentPage(0);
                }
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
        }
    }

    public final List<DonateItem> lInitSalesItems(List<Integer> sales, boolean ifGoodVersion) {
        MutableStateFlow<List<DonateItem>> mutableStateFlow = this.mutableDonateItemsFromJSON;
        ArrayList arrayList = new ArrayList();
        int i = ifGoodVersion ? 1 : 2;
        int i2 = ifGoodVersion ? 2 : 1;
        int i3 = 0;
        while (i3 < sales.size()) {
            Iterator<DonateItem> it = mutableStateFlow.getValue().iterator();
            while (true) {
                if (it.hasNext()) {
                    DonateItem next = it.next();
                    if (next.getInternalId() != null) {
                        Integer internalId = next.getInternalId();
                        int intValue = sales.get(i3).intValue();
                        if (internalId != null && internalId.intValue() == intValue) {
                            next.setInternalId(sales.get(i3));
                            next.setSaleTime(sales.get(i).intValue());
                            next.setSalePercent(sales.get(i2).intValue());
                            arrayList.add(next);
                            break;
                        }
                    }
                }
            }
            i3 += 3;
            i += 3;
            i2 += 3;
        }
        return arrayList;
    }

    public final void lInitSurpriseItem(List<DonateItem> saleItems, int timeForOpening) {
        DonateItem donateItem = new DonateItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, false, -1, null);
        donateItem.setUpTag(100);
        donateItem.setSaleTime(timeForOpening);
        saleItems.add(0, donateItem);
    }

    public final void updateValueOfLimit(@Nullable JSONArray jsonArray) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new DonateTileViewModel$updateValueOfLimit$1(jsonArray, this, null), 2, null);
    }

    public final void updateOldLimits(List<Integer> oldLimit, List<Integer> newLimit) {
        int i = 0;
        int i2 = 1;
        while (i < oldLimit.size()) {
            int i3 = 0;
            int i4 = 1;
            while (i3 < newLimit.size()) {
                if (oldLimit.get(i).intValue() == newLimit.get(i3).intValue()) {
                    oldLimit.set(i2, newLimit.get(i4));
                }
                i3 += 2;
                i4 += 2;
            }
            i += 2;
            i2 += 2;
        }
    }

    public final void lUpdateCurrentCollection(List<Integer> valueOfLimit, DonateTileObj currentCollection) {
        int i = 1;
        if (!valueOfLimit.isEmpty()) {
            int i2 = 0;
            while (i2 < valueOfLimit.size()) {
                updateLimitForObj(currentCollection, valueOfLimit.get(i2).intValue(), valueOfLimit.get(i).intValue());
                i2 += 2;
                i += 2;
            }
        }
        this.mutableCurrentItems.tryEmit(currentCollection);
    }

    public final void updateLimitForObj(DonateTileObj currentCollection, int currentId, int newLimit) {
        Object obj;
        Iterator<T> it = currentCollection.getItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Integer internalId = ((DonateItem) obj).getInternalId();
            if (internalId != null && internalId.intValue() == currentId) {
                break;
            }
        }
        DonateItem donateItem = (DonateItem) obj;
        if (donateItem != null) {
            donateItem.setLimit(newLimit);
        }
    }

    public final void openingSurprise() {
        this.actionWithJson.openingSurprise();
    }

    public final void showVIPPlatinumItems() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new DonateTileViewModel$showVIPPlatinumItems$1(this, null), 2, null);
    }

    public final void getCarsOrVIPFromCurrentCategory(@Nullable Integer categoryId, int oldPage) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new DonateTileViewModel$getCarsOrVIPFromCurrentCategory$1(this, categoryId, oldPage, null), 2, null);
    }

    public final void showCurrentCategory(Integer categoryId, int oldPage) {
        Object obj;
        List<Integer> contains;
        Object obj2;
        Iterator<T> it = this.mutableDonateItemsFromJSON.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((DonateItem) obj).getInternalId(), categoryId)) {
                    break;
                }
            }
        }
        DonateItem donateItem = (DonateItem) obj;
        if (donateItem == null || (contains = donateItem.getContains()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it2 = contains.iterator();
        while (it2.hasNext()) {
            int intValue = it2.next().intValue();
            Iterator<T> it3 = this.mutableDonateItemsFromJSON.getValue().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it3.next();
                Integer internalId = ((DonateItem) obj2).getInternalId();
                if (internalId != null && internalId.intValue() == intValue) {
                    break;
                }
            }
            DonateItem donateItem2 = (DonateItem) obj2;
            if (donateItem2 != null) {
                arrayList.add(donateItem2);
            }
        }
        lUpdateCurrentCollection(this.mutableValueOfLimits.getValue(), new DonateTileObj(arrayList, oldPage));
    }

    public final void clickButtonBack() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DonateTileViewModel$clickButtonBack$1(this, null), 3, null);
    }

    public final void removeSaleItemInfoAndUpdateLimit(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new DonateTileViewModel$removeSaleItemInfoAndUpdateLimit$1(this, jsonObject, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be A[EDGE_INSN: B:30:0x00be->B:21:0x00be BREAK  A[LOOP:0: B:12:0x00a3->B:28:0x00a3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object lRemoveSaleItemInfo(int r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$lRemoveSaleItemInfo$1
            if (r0 == 0) goto L13
            r0 = r10
            com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$lRemoveSaleItemInfo$1 r0 = (com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$lRemoveSaleItemInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$lRemoveSaleItemInfo$1 r0 = new com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$lRemoveSaleItemInfo$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            int r9 = r0.I$0
            java.lang.Object r0 = r0.L$0
            com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel r0 = (com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto L97
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            int r9 = r0.I$0
            java.lang.Object r2 = r0.L$0
            com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel r2 = (com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel) r2
            kotlin.ResultKt.throwOnFailure(r10)
            goto L58
        L45:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlinx.coroutines.flow.MutableSharedFlow<com.blackhub.bronline.game.gui.donate.data.DonateTileObj> r10 = r8.mutableCurrentItems
            r0.L$0 = r8
            r0.I$0 = r9
            r0.label = r5
            java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt.first(r10, r0)
            if (r10 != r1) goto L57
            return r1
        L57:
            r2 = r8
        L58:
            com.blackhub.bronline.game.gui.donate.data.DonateTileObj r10 = (com.blackhub.bronline.game.gui.donate.data.DonateTileObj) r10
            java.util.List r5 = r10.getItems()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L64:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L7f
            java.lang.Object r6 = r5.next()
            r7 = r6
            com.blackhub.bronline.game.gui.donate.data.DonateItem r7 = (com.blackhub.bronline.game.gui.donate.data.DonateItem) r7
            java.lang.Integer r7 = r7.getInternalId()
            if (r7 != 0) goto L78
            goto L64
        L78:
            int r7 = r7.intValue()
            if (r7 != r9) goto L64
            goto L80
        L7f:
            r6 = r3
        L80:
            com.blackhub.bronline.game.gui.donate.data.DonateItem r6 = (com.blackhub.bronline.game.gui.donate.data.DonateItem) r6
            if (r6 == 0) goto L87
            r2.changeSaleInfo(r6)
        L87:
            kotlinx.coroutines.flow.MutableSharedFlow<com.blackhub.bronline.game.gui.donate.data.DonateTileObj> r5 = r2.mutableCurrentItems
            r0.L$0 = r2
            r0.I$0 = r9
            r0.label = r4
            java.lang.Object r10 = r5.emit(r10, r0)
            if (r10 != r1) goto L96
            return r1
        L96:
            r0 = r2
        L97:
            kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.blackhub.bronline.game.gui.donate.data.DonateItem>> r10 = r0.mutableSaleItems
            java.lang.Object r10 = r10.getValue()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        La3:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto Lbe
            java.lang.Object r1 = r10.next()
            r2 = r1
            com.blackhub.bronline.game.gui.donate.data.DonateItem r2 = (com.blackhub.bronline.game.gui.donate.data.DonateItem) r2
            java.lang.Integer r2 = r2.getInternalId()
            if (r2 != 0) goto Lb7
            goto La3
        Lb7:
            int r2 = r2.intValue()
            if (r2 != r9) goto La3
            r3 = r1
        Lbe:
            com.blackhub.bronline.game.gui.donate.data.DonateItem r3 = (com.blackhub.bronline.game.gui.donate.data.DonateItem) r3
            if (r3 == 0) goto Lc5
            r0.changeSaleInfo(r3)
        Lc5:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel.lRemoveSaleItemInfo(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void changeSaleInfo(DonateItem currentItem) {
        currentItem.setSalePercent(0);
        currentItem.setSaleTime(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088 A[EDGE_INSN: B:21:0x0088->B:18:0x0088 BREAK  A[LOOP:0: B:11:0x005e->B:15:0x0083], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateValueOfLimitForCurrentItem(int r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$updateValueOfLimitForCurrentItem$1
            if (r0 == 0) goto L13
            r0 = r8
            com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$updateValueOfLimitForCurrentItem$1 r0 = (com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$updateValueOfLimitForCurrentItem$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$updateValueOfLimitForCurrentItem$1 r0 = new com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$updateValueOfLimitForCurrentItem$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r7 = r0.I$0
            java.lang.Object r1 = r0.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.L$0
            com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel r0 = (com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5a
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.Integer>> r8 = r6.mutableValueOfLimits
            java.lang.Object r8 = r8.getValue()
            java.util.List r8 = (java.util.List) r8
            kotlinx.coroutines.flow.MutableSharedFlow<com.blackhub.bronline.game.gui.donate.data.DonateTileObj> r2 = r6.mutableCurrentItems
            r0.L$0 = r6
            r0.L$1 = r8
            r0.I$0 = r7
            r0.label = r3
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.first(r2, r0)
            if (r0 != r1) goto L57
            return r1
        L57:
            r1 = r8
            r8 = r0
            r0 = r6
        L5a:
            com.blackhub.bronline.game.gui.donate.data.DonateTileObj r8 = (com.blackhub.bronline.game.gui.donate.data.DonateTileObj) r8
            r2 = 0
            r4 = r3
        L5e:
            int r5 = r1.size()
            if (r2 >= r5) goto L88
            java.lang.Object r5 = r1.get(r2)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 != r7) goto L83
            java.lang.Object r7 = r1.get(r4)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            int r7 = r7 - r3
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r7)
            r1.set(r4, r7)
            goto L88
        L83:
            int r2 = r2 + 2
            int r4 = r4 + 2
            goto L5e
        L88:
            r0.lUpdateCurrentCollection(r1, r8)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel.updateValueOfLimitForCurrentItem(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void updateSurpriseAndSalesEveryMinute(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new DonateTileViewModel$updateSurpriseAndSalesEveryMinute$1(this, jsonObject, null), 2, null);
    }

    public final void clearData() {
        MutableStateFlow<List<DonateItem>> mutableStateFlow = this.mutableDonateItemsFromJSON;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), CollectionsKt__CollectionsKt.emptyList())) {
        }
        MutableStateFlow<List<DonateItem>> mutableStateFlow2 = this.mutableSaleItems;
        while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), CollectionsKt__CollectionsKt.emptyList())) {
        }
        MutableStateFlow<List<DonateItem>> mutableStateFlow3 = this.mutableVips;
        while (!mutableStateFlow3.compareAndSet(mutableStateFlow3.getValue(), CollectionsKt__CollectionsKt.emptyList())) {
        }
        MutableStateFlow<List<DonateItem>> mutableStateFlow4 = this.mutablePacks;
        while (!mutableStateFlow4.compareAndSet(mutableStateFlow4.getValue(), CollectionsKt__CollectionsKt.emptyList())) {
        }
        MutableStateFlow<List<DonateItem>> mutableStateFlow5 = this.mutableSkins;
        while (!mutableStateFlow5.compareAndSet(mutableStateFlow5.getValue(), CollectionsKt__CollectionsKt.emptyList())) {
        }
        MutableStateFlow<List<DonateItem>> mutableStateFlow6 = this.mutableCarPacks;
        while (!mutableStateFlow6.compareAndSet(mutableStateFlow6.getValue(), CollectionsKt__CollectionsKt.emptyList())) {
        }
        MutableStateFlow<List<DonateItem>> mutableStateFlow7 = this.mutableCars;
        while (!mutableStateFlow7.compareAndSet(mutableStateFlow7.getValue(), CollectionsKt__CollectionsKt.emptyList())) {
        }
        MutableStateFlow<List<DonateItem>> mutableStateFlow8 = this.mutableMoneyPacks;
        while (!mutableStateFlow8.compareAndSet(mutableStateFlow8.getValue(), CollectionsKt__CollectionsKt.emptyList())) {
        }
        MutableStateFlow<List<DonateItem>> mutableStateFlow9 = this.mutableAccessories;
        while (!mutableStateFlow9.compareAndSet(mutableStateFlow9.getValue(), CollectionsKt__CollectionsKt.emptyList())) {
        }
    }

    public final void lUpdateSaleTime(List<Integer> newSaleInfo, List<DonateItem> saleItems) {
        Object obj;
        List<Integer> list = newSaleInfo;
        if (list == null || list.isEmpty()) {
            return;
        }
        int i = 0;
        int i2 = 1;
        while (i < newSaleInfo.size()) {
            Iterator<T> it = saleItems.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Integer internalId = ((DonateItem) obj).getInternalId();
                int intValue = newSaleInfo.get(i).intValue();
                if (internalId != null && internalId.intValue() == intValue) {
                    break;
                }
            }
            DonateItem donateItem = (DonateItem) obj;
            if (donateItem != null) {
                donateItem.setSaleTime(newSaleInfo.get(i2).intValue());
            }
            i += 2;
            i2 += 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object checkAndUpdateCurrentItems(java.util.List<com.blackhub.bronline.game.gui.donate.data.DonateItem> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$checkAndUpdateCurrentItems$1
            if (r0 == 0) goto L13
            r0 = r7
            com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$checkAndUpdateCurrentItems$1 r0 = (com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$checkAndUpdateCurrentItems$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$checkAndUpdateCurrentItems$1 r0 = new com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$checkAndUpdateCurrentItems$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r7)
            goto L6e
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$1
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r2 = r0.L$0
            com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel r2 = (com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L53
        L40:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.flow.MutableSharedFlow<com.blackhub.bronline.game.gui.donate.data.DonateTileObj> r7 = r5.mutableCurrentItems
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.first(r7, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r5
        L53:
            com.blackhub.bronline.game.gui.donate.data.DonateTileObj r7 = (com.blackhub.bronline.game.gui.donate.data.DonateTileObj) r7
            int r4 = r7.getPage()
            if (r4 != 0) goto L71
            r7.setItems(r6)
            kotlinx.coroutines.flow.MutableSharedFlow<com.blackhub.bronline.game.gui.donate.data.DonateTileObj> r6 = r2.mutableCurrentItems
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r1) goto L6e
            return r1
        L6e:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L71:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel.checkAndUpdateCurrentItems(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void clearLimit(int itemId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new DonateTileViewModel$clearLimit$1(this, itemId, null), 2, null);
    }

    public final void updateNewSaleItems(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new DonateTileViewModel$updateNewSaleItems$1(this, jsonObject, null), 2, null);
    }

    public final void showPackGee() {
        showCurrentCategory(6, -1);
    }
}
