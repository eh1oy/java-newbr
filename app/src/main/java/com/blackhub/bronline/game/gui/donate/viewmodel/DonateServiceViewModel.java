package com.blackhub.bronline.game.gui.donate.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.gui.donate.data.DonateItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: DonateServiceViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\u0014\u0010\u0011\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateServiceViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "mutableServiceItems", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/blackhub/bronline/game/gui/donate/data/DonateItem;", "serviceItems", "Lkotlinx/coroutines/flow/StateFlow;", "getServiceItems", "()Lkotlinx/coroutines/flow/StateFlow;", "checkIfFirstItem", "", "currentSize", "", "currentObject", "initServiceItems", "itemsFromJSON", "updateValueOfSelect", "donateItem", "newValueOfSelect", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DonateServiceViewModel extends ViewModel implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<List<DonateItem>> mutableServiceItems;

    @NotNull
    public final StateFlow<List<DonateItem>> serviceItems;

    @Inject
    public DonateServiceViewModel() {
        MutableStateFlow<List<DonateItem>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableServiceItems = MutableStateFlow;
        this.serviceItems = MutableStateFlow;
    }

    @NotNull
    public final StateFlow<List<DonateItem>> getServiceItems() {
        return this.serviceItems;
    }

    public final void initServiceItems(@NotNull List<DonateItem> itemsFromJSON) {
        Intrinsics.checkNotNullParameter(itemsFromJSON, "itemsFromJSON");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new DonateServiceViewModel$initServiceItems$1(itemsFromJSON, this, null), 2, null);
    }

    public final void checkIfFirstItem(int currentSize, DonateItem currentObject) {
        updateValueOfSelect(currentObject, currentSize == 0);
    }

    public final void updateValueOfSelect(DonateItem donateItem, boolean newValueOfSelect) {
        donateItem.setSelected(newValueOfSelect);
    }
}
