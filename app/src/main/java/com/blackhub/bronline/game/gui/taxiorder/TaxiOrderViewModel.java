package com.blackhub.bronline.game.gui.taxiorder;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TaxiOrderViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ$\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u0017J\u0006\u0010\u001f\u001a\u00020\u0017J\u0006\u0010 \u001a\u00020\u0017J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%H\u0002J\u000e\u0010&\u001a\u00020\u00172\u0006\u0010$\u001a\u00020%J\u0006\u0010'\u001a\u00020\u0017J\b\u0010(\u001a\u00020\u0017H\u0002J\u000e\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020+J\u0010\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020.H\u0002J\u0016\u0010/\u001a\u00020\u00172\u0006\u0010-\u001a\u00020.2\u0006\u00100\u001a\u000201J \u00102\u001a\u00020\u00172\u0006\u00103\u001a\u00020+2\u0006\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020+H\u0002J\u000e\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020+J\u000e\u00108\u001a\u00020\u00172\u0006\u0010$\u001a\u00020%R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u00069"}, d2 = {"Lcom/blackhub/bronline/game/gui/taxiorder/TaxiOrderViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/taxiorder/TaxiOrderUiState;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "stringResource", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/taxiorder/TaxiOrderActionWithJSON;", "(Lcom/blackhub/bronline/game/common/LocalNotification;Lcom/blackhub/bronline/game/core/resources/StringResource;Lcom/blackhub/bronline/game/gui/taxiorder/TaxiOrderActionWithJSON;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getLocalNotification", "()Lcom/blackhub/bronline/game/common/LocalNotification;", "getStringResource", "()Lcom/blackhub/bronline/game/core/resources/StringResource;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "changeOrderSettings", "", "company", "Lcom/blackhub/bronline/game/gui/taxiorder/TaxiCompanyEnum;", "rate", "Lcom/blackhub/bronline/game/gui/taxiorder/TaxiRateEnum;", "isPaymentChanges", "", "closeMap", "closeScreen", "closeWaitingWindowAndDismissOrder", "extractPrices", "", "", "json", "Lorg/json/JSONObject;", "initJson", "openLocationMenu", "openMap", "orderTaxi", ClientCookie.COMMENT_ATTR, "", "selectAddressAndCountPrices", "coordinates", "Lcom/blackhub/bronline/game/gui/taxiorder/CoordinatesModel;", "selectAddressByMapAndCountPrices", "viewEdgeLength", "", "setOrderInfo", "name", "number", "auto", "showErrorMessage", ThrowableDeserializer.PROP_NAME_MESSAGE, "updateJson", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTaxiOrderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiOrderViewModel.kt\ncom/blackhub/bronline/game/gui/taxiorder/TaxiOrderViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,309:1\n230#2,5:310\n230#2,5:315\n230#2,5:320\n230#2,5:329\n230#2,5:334\n1549#3:325\n1620#3,3:326\n*S KotlinDebug\n*F\n+ 1 TaxiOrderViewModel.kt\ncom/blackhub/bronline/game/gui/taxiorder/TaxiOrderViewModel\n*L\n141#1:310,5\n214#1:315,5\n251#1:320,5\n289#1:329,5\n299#1:334,5\n285#1:325\n285#1:326,3\n*E\n"})
/* loaded from: classes3.dex */
public final class TaxiOrderViewModel extends BaseViewModel<TaxiOrderUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<TaxiOrderUiState> _uiState;

    @NotNull
    public final TaxiOrderActionWithJSON actionWithJSON;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<TaxiOrderUiState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Inject
    public TaxiOrderViewModel(@NotNull LocalNotification localNotification, @NotNull StringResource stringResource, @NotNull TaxiOrderActionWithJSON actionWithJSON) {
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        this.localNotification = localNotification;
        this.stringResource = stringResource;
        this.actionWithJSON = actionWithJSON;
        this._uiState = StateFlowKt.MutableStateFlow(new TaxiOrderUiState(null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, 2097151, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends TaxiOrderUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<TaxiOrderUiState> getUiState() {
        return this.uiState;
    }

    public final void initJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new TaxiOrderViewModel$initJson$1(json, this, null), 1, null);
    }

    public final void updateJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new TaxiOrderViewModel$updateJson$1(json, this, null), 1, null);
    }

    public final void closeScreen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new TaxiOrderViewModel$closeScreen$1(this, null), 1, null);
    }

    public final void showErrorMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        getLocalNotification().showErrorNotification(message);
        closeScreen();
    }

    public final void openLocationMenu() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new TaxiOrderViewModel$openLocationMenu$1(this, null), 1, null);
    }

    public final void closeMap() {
        TaxiOrderUiState value;
        TaxiOrderUiState copy;
        MutableStateFlow<? extends TaxiOrderUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r39 & 1) != 0 ? r2.placeName : null, (r39 & 2) != 0 ? r2.moneyCash : 0, (r39 & 4) != 0 ? r2.moneyCard : 0, (r39 & 8) != 0 ? r2.fastestIndex : null, (r39 & 16) != 0 ? r2.demandedIndex : null, (r39 & 32) != 0 ? r2.prices : null, (r39 & 64) != 0 ? r2.coordinatesCurrent : null, (r39 & 128) != 0 ? r2.coordinates : null, (r39 & 256) != 0 ? r2.selectedCompany : null, (r39 & 512) != 0 ? r2.selectedRate : null, (r39 & 1024) != 0 ? r2.selectedPayment : null, (r39 & 2048) != 0 ? r2.comment : null, (r39 & 4096) != 0 ? r2.driverName : null, (r39 & 8192) != 0 ? r2.driverNumber : null, (r39 & 16384) != 0 ? r2.driverAuto : null, (r39 & 32768) != 0 ? r2.isAddressSelected : false, (r39 & 65536) != 0 ? r2.isMapOpened : false, (r39 & 131072) != 0 ? r2.isNeedClose : false, (r39 & 262144) != 0 ? r2.isPointSelected : false, (r39 & 524288) != 0 ? r2.isWaitingWindowOpened : false, (r39 & 1048576) != 0 ? value.isOrderWindowVisible : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void closeWaitingWindowAndDismissOrder() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new TaxiOrderViewModel$closeWaitingWindowAndDismissOrder$1(this, null), 1, null);
    }

    public final void selectAddressByMapAndCountPrices(@NotNull CoordinatesModel coordinates, float viewEdgeLength) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new TaxiOrderViewModel$selectAddressByMapAndCountPrices$1(coordinates, viewEdgeLength, this, null), 1, null);
    }

    public static /* synthetic */ void changeOrderSettings$default(TaxiOrderViewModel taxiOrderViewModel, TaxiCompanyEnum taxiCompanyEnum, TaxiRateEnum taxiRateEnum, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            taxiCompanyEnum = taxiOrderViewModel.getUiState().getValue().getSelectedCompany();
        }
        if ((i & 2) != 0) {
            taxiRateEnum = taxiOrderViewModel.getUiState().getValue().getSelectedRate();
        }
        if ((i & 4) != 0) {
            z = false;
        }
        taxiOrderViewModel.changeOrderSettings(taxiCompanyEnum, taxiRateEnum, z);
    }

    public final void changeOrderSettings(@NotNull TaxiCompanyEnum company, @NotNull TaxiRateEnum rate, boolean isPaymentChanges) {
        TaxiOrderUiState copy;
        Intrinsics.checkNotNullParameter(company, "company");
        Intrinsics.checkNotNullParameter(rate, "rate");
        TaxiPaymentEnum selectedPayment = getUiState().getValue().getSelectedPayment();
        if (isPaymentChanges) {
            TaxiPaymentEnum taxiPaymentEnum = TaxiPaymentEnum.CASH;
            selectedPayment = selectedPayment == taxiPaymentEnum ? TaxiPaymentEnum.CARD : taxiPaymentEnum;
        }
        MutableStateFlow<? extends TaxiOrderUiState> mutableStateFlow = get_uiState();
        while (true) {
            TaxiOrderUiState value = mutableStateFlow.getValue();
            MutableStateFlow<? extends TaxiOrderUiState> mutableStateFlow2 = mutableStateFlow;
            copy = r1.copy((r39 & 1) != 0 ? r1.placeName : null, (r39 & 2) != 0 ? r1.moneyCash : 0, (r39 & 4) != 0 ? r1.moneyCard : 0, (r39 & 8) != 0 ? r1.fastestIndex : null, (r39 & 16) != 0 ? r1.demandedIndex : null, (r39 & 32) != 0 ? r1.prices : null, (r39 & 64) != 0 ? r1.coordinatesCurrent : null, (r39 & 128) != 0 ? r1.coordinates : null, (r39 & 256) != 0 ? r1.selectedCompany : company, (r39 & 512) != 0 ? r1.selectedRate : rate, (r39 & 1024) != 0 ? r1.selectedPayment : selectedPayment, (r39 & 2048) != 0 ? r1.comment : null, (r39 & 4096) != 0 ? r1.driverName : null, (r39 & 8192) != 0 ? r1.driverNumber : null, (r39 & 16384) != 0 ? r1.driverAuto : null, (r39 & 32768) != 0 ? r1.isAddressSelected : false, (r39 & 65536) != 0 ? r1.isMapOpened : false, (r39 & 131072) != 0 ? r1.isNeedClose : false, (r39 & 262144) != 0 ? r1.isPointSelected : false, (r39 & 524288) != 0 ? r1.isWaitingWindowOpened : false, (r39 & 1048576) != 0 ? value.isOrderWindowVisible : false);
            if (mutableStateFlow2.compareAndSet(value, copy)) {
                return;
            } else {
                mutableStateFlow = mutableStateFlow2;
            }
        }
    }

    public final void orderTaxi(@NotNull String comment) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        ViewModelExtensionKt.launchOnIO$default(this, null, new TaxiOrderViewModel$orderTaxi$1(this, comment, null), 1, null);
    }

    public final void openMap() {
        TaxiOrderUiState value;
        TaxiOrderUiState copy;
        MutableStateFlow<? extends TaxiOrderUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r39 & 1) != 0 ? r2.placeName : null, (r39 & 2) != 0 ? r2.moneyCash : 0, (r39 & 4) != 0 ? r2.moneyCard : 0, (r39 & 8) != 0 ? r2.fastestIndex : null, (r39 & 16) != 0 ? r2.demandedIndex : null, (r39 & 32) != 0 ? r2.prices : null, (r39 & 64) != 0 ? r2.coordinatesCurrent : null, (r39 & 128) != 0 ? r2.coordinates : null, (r39 & 256) != 0 ? r2.selectedCompany : null, (r39 & 512) != 0 ? r2.selectedRate : null, (r39 & 1024) != 0 ? r2.selectedPayment : null, (r39 & 2048) != 0 ? r2.comment : null, (r39 & 4096) != 0 ? r2.driverName : null, (r39 & 8192) != 0 ? r2.driverNumber : null, (r39 & 16384) != 0 ? r2.driverAuto : null, (r39 & 32768) != 0 ? r2.isAddressSelected : false, (r39 & 65536) != 0 ? r2.isMapOpened : true, (r39 & 131072) != 0 ? r2.isNeedClose : false, (r39 & 262144) != 0 ? r2.isPointSelected : false, (r39 & 524288) != 0 ? r2.isWaitingWindowOpened : false, (r39 & 1048576) != 0 ? value.isOrderWindowVisible : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final List<Integer> extractPrices(JSONObject json) {
        JSONArray optJSONArray = json.optJSONArray("p");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(Integer.valueOf(optJSONArray.optInt(i)));
            }
        }
        return arrayList;
    }

    public final void selectAddressAndCountPrices(CoordinatesModel coordinates) {
        TaxiOrderUiState copy;
        double sqrt = Math.sqrt(Math.pow(((float) coordinates.getX()) - getUiState().getValue().getCoordinatesCurrent().getX(), 2.0d) + Math.pow(((float) coordinates.getY()) - getUiState().getValue().getCoordinatesCurrent().getY(), 2.0d)) / 1000.0f;
        List<Integer> prices = getUiState().getValue().getPrices();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(prices, 10));
        Iterator<T> it = prices.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((((int) sqrt) + 3) * ((Number) it.next()).intValue()));
        }
        MutableStateFlow<? extends TaxiOrderUiState> mutableStateFlow = get_uiState();
        while (true) {
            TaxiOrderUiState value = mutableStateFlow.getValue();
            ArrayList arrayList2 = arrayList;
            copy = r3.copy((r39 & 1) != 0 ? r3.placeName : null, (r39 & 2) != 0 ? r3.moneyCash : 0, (r39 & 4) != 0 ? r3.moneyCard : 0, (r39 & 8) != 0 ? r3.fastestIndex : null, (r39 & 16) != 0 ? r3.demandedIndex : null, (r39 & 32) != 0 ? r3.prices : arrayList, (r39 & 64) != 0 ? r3.coordinatesCurrent : null, (r39 & 128) != 0 ? r3.coordinates : coordinates, (r39 & 256) != 0 ? r3.selectedCompany : null, (r39 & 512) != 0 ? r3.selectedRate : null, (r39 & 1024) != 0 ? r3.selectedPayment : null, (r39 & 2048) != 0 ? r3.comment : null, (r39 & 4096) != 0 ? r3.driverName : null, (r39 & 8192) != 0 ? r3.driverNumber : null, (r39 & 16384) != 0 ? r3.driverAuto : null, (r39 & 32768) != 0 ? r3.isAddressSelected : true, (r39 & 65536) != 0 ? r3.isMapOpened : false, (r39 & 131072) != 0 ? r3.isNeedClose : false, (r39 & 262144) != 0 ? r3.isPointSelected : false, (r39 & 524288) != 0 ? r3.isWaitingWindowOpened : false, (r39 & 1048576) != 0 ? value.isOrderWindowVisible : false);
            if (mutableStateFlow.compareAndSet(value, copy)) {
                return;
            } else {
                arrayList = arrayList2;
            }
        }
    }

    public final void setOrderInfo(String name, String number, String auto) {
        TaxiOrderUiState value;
        TaxiOrderUiState copy;
        MutableStateFlow<? extends TaxiOrderUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r39 & 1) != 0 ? r2.placeName : null, (r39 & 2) != 0 ? r2.moneyCash : 0, (r39 & 4) != 0 ? r2.moneyCard : 0, (r39 & 8) != 0 ? r2.fastestIndex : null, (r39 & 16) != 0 ? r2.demandedIndex : null, (r39 & 32) != 0 ? r2.prices : null, (r39 & 64) != 0 ? r2.coordinatesCurrent : null, (r39 & 128) != 0 ? r2.coordinates : null, (r39 & 256) != 0 ? r2.selectedCompany : null, (r39 & 512) != 0 ? r2.selectedRate : null, (r39 & 1024) != 0 ? r2.selectedPayment : null, (r39 & 2048) != 0 ? r2.comment : null, (r39 & 4096) != 0 ? r2.driverName : name, (r39 & 8192) != 0 ? r2.driverNumber : number, (r39 & 16384) != 0 ? r2.driverAuto : auto, (r39 & 32768) != 0 ? r2.isAddressSelected : false, (r39 & 65536) != 0 ? r2.isMapOpened : false, (r39 & 131072) != 0 ? r2.isNeedClose : false, (r39 & 262144) != 0 ? r2.isPointSelected : false, (r39 & 524288) != 0 ? r2.isWaitingWindowOpened : false, (r39 & 1048576) != 0 ? value.isOrderWindowVisible : true);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }
}
