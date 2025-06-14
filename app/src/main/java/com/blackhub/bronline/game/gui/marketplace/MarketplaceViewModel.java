package com.blackhub.bronline.game.gui.marketplace;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.C;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.blackhub.bronline.game.gui.craft.model.response.CraftItemCategoryFilter;
import com.blackhub.bronline.game.gui.craft.model.response.CraftJsonCategoryFilter;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceNotificationEnum;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceRarityEnum;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceTypeProductCardEnum;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceBottomSheetInfo;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceProduct;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceSortFilter;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceTab;
import com.blackhub.bronline.game.model.remote.response.marketplace.MarketplaceConfig;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: MarketplaceViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ,\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\"\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u001bH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001bH\u0002J\u0006\u0010#\u001a\u00020!J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&H\u0002J8\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00172\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00172\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u0017J\u0012\u00101\u001a\u00020!2\b\u00102\u001a\u0004\u0018\u000103H\u0002J\u000e\u00104\u001a\u00020!2\u0006\u00105\u001a\u00020\u001bJ\u0006\u00106\u001a\u00020!J\u0006\u00107\u001a\u00020!J\u0006\u00108\u001a\u00020!J\u0006\u00109\u001a\u00020!J\u0006\u0010:\u001a\u00020!J\u000e\u0010;\u001a\u00020!2\u0006\u0010<\u001a\u00020=J\u000e\u0010>\u001a\u00020!2\u0006\u0010?\u001a\u00020=J\u000e\u0010@\u001a\u00020!2\u0006\u0010A\u001a\u00020=J\u0006\u0010B\u001a\u00020!J\u0006\u0010C\u001a\u00020!J\u000e\u0010D\u001a\u00020!2\u0006\u0010E\u001a\u00020\u001bJ\u000e\u0010F\u001a\u00020!2\u0006\u0010G\u001a\u00020\u0018J\u0006\u0010H\u001a\u00020!J\u0006\u0010I\u001a\u00020!J\u000e\u0010J\u001a\u00020!2\u0006\u0010K\u001a\u00020=J\u000e\u0010L\u001a\u00020!2\u0006\u0010A\u001a\u00020=J\u0006\u0010M\u001a\u00020!J\u0006\u0010N\u001a\u00020!J\u000e\u0010O\u001a\u00020!2\u0006\u0010P\u001a\u00020\u001bJ\u0006\u0010Q\u001a\u00020!J\u000e\u0010R\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001bJ\u0006\u0010S\u001a\u00020!J\u0006\u0010T\u001a\u00020!J\b\u0010U\u001a\u00020!H\u0002J\b\u0010V\u001a\u00020!H\u0002J\b\u0010W\u001a\u00020!H\u0002J\b\u0010X\u001a\u00020!H\u0002J\b\u0010Y\u001a\u00020!H\u0002J\u000e\u0010Z\u001a\u00020!2\u0006\u0010[\u001a\u00020\\J\u0006\u0010]\u001a\u00020!J\u000e\u0010^\u001a\u00020!2\u0006\u0010)\u001a\u00020*J\u0006\u0010_\u001a\u00020!R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006`"}, d2 = {"Lcom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/marketplace/MarketplaceUiState;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/marketplace/MarketplaceActionWithJson;", "stringResources", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "application", "Landroid/app/Application;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "(Lcom/blackhub/bronline/game/gui/marketplace/MarketplaceActionWithJson;Lcom/blackhub/bronline/game/core/resources/StringResource;Landroid/app/Application;Lcom/blackhub/bronline/game/common/LocalNotification;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getLocalNotification", "()Lcom/blackhub/bronline/game/common/LocalNotification;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "addVipProductCard", "", "Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceProduct;", "products", FirebaseAnalytics.Param.PRICE, "", "timeVipCard", "calculatePaginatorPagesToShow", "currentPage", "totalPages", "changeTabStatus", "", "tabValue", "closeScreen", "getCountTemplate", CatchStreamerKeys.COUNT_KEY, "", "getTrimmedCount", "initJson", "json", "Lorg/json/JSONObject;", "marketplaceCategoriesFilters", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftJsonCategoryFilter;", "inventoryItems", "Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", "marketplaceConfigList", "Lcom/blackhub/bronline/game/model/remote/response/marketplace/MarketplaceConfig;", "joinLikes", "likedProductsIds", "Lorg/json/JSONArray;", "onClickCardMainButton", "productIndex", "onClickCheckBox", "onClickCloseBottomSheet", "onClickCloseInfo", "onClickConfirmFilters", "onClickConfirmInModalWindow", "onClickConfirmSearch", "word", "", "onClickDoneInCountTextField", "textCount", "onClickDoneInPriceTextField", "textPrice", "onClickFilterButton", "onClickGreenButtonInBottomSheet", "onClickHistoryProduct", "indexElement", "onClickLike", "likedProduct", "onClickMinusButton", "onClickPlusButton", "onClickSetForceCount", "text", "onClickSetPrice", "onClickSort", "onClickToDonat", "onClickToPage", "pageValue", "onClickToPlusButton", "onClickToTab", "onClickWithdrawFromSale", "onCloseModalWindow", "onConfirmBuy", "onConfirmDeleteCard", "onConfirmEdit", "onConfirmPublish", "onConfirmSendLike", "onFilterCheckboxClick", "checkBox", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftItemCategoryFilter;", "onInfoClick", "onPacketIncoming", "onResetFilterButtonClick", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1769:1\n230#2,5:1770\n230#2,5:1775\n230#2,5:1780\n230#2,5:1785\n230#2,5:1790\n230#2,5:1796\n230#2,5:1801\n230#2,5:1806\n230#2,5:1811\n230#2,5:1820\n230#2,5:1825\n230#2,5:1834\n230#2,5:1841\n1#3:1795\n1549#4:1816\n1620#4,3:1817\n1549#4:1830\n1620#4,3:1831\n1855#4,2:1839\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel\n*L\n1250#1:1770,5\n1401#1:1775,5\n1409#1:1780,5\n1417#1:1785,5\n1435#1:1790,5\n1500#1:1796,5\n1530#1:1801,5\n1554#1:1806,5\n1563#1:1811,5\n1599#1:1820,5\n1614#1:1825,5\n1639#1:1834,5\n1757#1:1841,5\n1590#1:1816\n1590#1:1817,3\n1634#1:1830\n1634#1:1831,3\n1728#1:1839,2\n*E\n"})
/* loaded from: classes3.dex */
public final class MarketplaceViewModel extends BaseViewModel<MarketplaceUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<MarketplaceUiState> _uiState;

    @NotNull
    public final MarketplaceActionWithJson actionWithJSON;

    @NotNull
    public final Application application;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final StringResource stringResources;

    @NotNull
    public final StateFlow<MarketplaceUiState> uiState;

    public final int getCountTemplate(long count) {
        return count < 1000 ? R.string.common_just_string : count < 1000000 ? R.string.common_thousand_with_dot : count < 1000000000 ? R.string.common_million_with_dot : count < 1000000000000L ? R.string.common_billion_with_dot : R.string.common_trillion_with_dot;
    }

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Inject
    public MarketplaceViewModel(@NotNull MarketplaceActionWithJson actionWithJSON, @NotNull StringResource stringResources, @NotNull Application application, @NotNull LocalNotification localNotification) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(stringResources, "stringResources");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        this.actionWithJSON = actionWithJSON;
        this.stringResources = stringResources;
        this.application = application;
        this.localNotification = localNotification;
        this._uiState = StateFlowKt.MutableStateFlow(new MarketplaceUiState(null, null, null, 0, false, null, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, -1, 3, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends MarketplaceUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<MarketplaceUiState> getUiState() {
        return this.uiState;
    }

    public final void initJson(@NotNull JSONObject json, @NotNull List<CraftJsonCategoryFilter> marketplaceCategoriesFilters, @NotNull List<InvItems> inventoryItems, @NotNull List<MarketplaceConfig> marketplaceConfigList) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(marketplaceCategoriesFilters, "marketplaceCategoriesFilters");
        Intrinsics.checkNotNullParameter(inventoryItems, "inventoryItems");
        Intrinsics.checkNotNullParameter(marketplaceConfigList, "marketplaceConfigList");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new MarketplaceViewModel$initJson$1(this, json, inventoryItems, marketplaceConfigList, marketplaceCategoriesFilters, null), 1, null);
    }

    public final void onPacketIncoming(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnIO$default(this, null, new MarketplaceViewModel$onPacketIncoming$1(json, this, null), 1, null);
    }

    public final void onClickCheckBox() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new MarketplaceViewModel$onClickCheckBox$1(this, null), 1, null);
    }

    public final void onClickSetPrice(@NotNull String textPrice) {
        Intrinsics.checkNotNullParameter(textPrice, "textPrice");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new MarketplaceViewModel$onClickSetPrice$1(textPrice, this, null), 1, null);
    }

    public final void onClickDoneInPriceTextField(@NotNull String textPrice) {
        Intrinsics.checkNotNullParameter(textPrice, "textPrice");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new MarketplaceViewModel$onClickDoneInPriceTextField$1(textPrice, this, null), 1, null);
    }

    public final void onClickDoneInCountTextField(@NotNull String textCount) {
        Intrinsics.checkNotNullParameter(textCount, "textCount");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new MarketplaceViewModel$onClickDoneInCountTextField$1(this, textCount, null), 1, null);
    }

    public final void onClickMinusButton() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new MarketplaceViewModel$onClickMinusButton$1(this, null), 1, null);
    }

    public final void onClickPlusButton() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new MarketplaceViewModel$onClickPlusButton$1(this, null), 1, null);
    }

    public final void onClickSetForceCount(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new MarketplaceViewModel$onClickSetForceCount$1(text, this, null), 1, null);
    }

    public final void onClickWithdrawFromSale() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new MarketplaceViewModel$onClickWithdrawFromSale$1(this, null), 1, null);
    }

    public final void onClickGreenButtonInBottomSheet() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new MarketplaceViewModel$onClickGreenButtonInBottomSheet$1(this, null), 1, null);
    }

    public final void onClickHistoryProduct(int indexElement) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new MarketplaceViewModel$onClickHistoryProduct$1(this, indexElement, null), 1, null);
    }

    public final void onClickToTab(int tabValue) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new MarketplaceViewModel$onClickToTab$1(this, tabValue, null), 1, null);
    }

    public final void onClickCardMainButton(int productIndex) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new MarketplaceViewModel$onClickCardMainButton$1(this, productIndex, null), 1, null);
    }

    public final void onClickToPage(int pageValue) {
        if (pageValue != get_uiState().getValue().getCurrentPage()) {
            ViewModelExtensionKt.launchOnIO$default(this, null, new MarketplaceViewModel$onClickToPage$1(this, pageValue, null), 1, null);
        }
    }

    public final void onClickToDonat() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new MarketplaceViewModel$onClickToDonat$1(this, null), 1, null);
    }

    public final void onClickFilterButton() {
        MarketplaceUiState value;
        MarketplaceUiState copy;
        MutableStateFlow<? extends MarketplaceUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r52 & 1) != 0 ? r2.profileInfo : null, (r52 & 2) != 0 ? r2.bottomSheetInfo : null, (r52 & 4) != 0 ? r2.marketplaceLimits : null, (r52 & 8) != 0 ? r2.money : 0, (r52 & 16) != 0 ? r2.isHasPlatinumVip : false, (r52 & 32) != 0 ? r2.allInventoryItems : null, (r52 & 64) != 0 ? r2.products : null, (r52 & 128) != 0 ? r2.inventoryProducts : null, (r52 & 256) != 0 ? r2.tabs : null, (r52 & 512) != 0 ? r2.filterList : null, (r52 & 1024) != 0 ? r2.listOfChosenFilterIds : null, (r52 & 2048) != 0 ? r2.likedList : null, (r52 & 4096) != 0 ? r2.selectedTab : null, (r52 & 8192) != 0 ? r2.selectedProduct : null, (r52 & 16384) != 0 ? r2.currentPage : 0, (r52 & 32768) != 0 ? r2.totalPages : 0, (r52 & 65536) != 0 ? r2.priceVip : 0, (r52 & 131072) != 0 ? r2.typeVip : 0, (r52 & 262144) != 0 ? r2.timeVipCard : 0, (r52 & 524288) != 0 ? r2.pagesToShow : null, (r52 & 1048576) != 0 ? r2.currentSortFilter : null, (r52 & 2097152) != 0 ? r2.bestMarketplaceProduct : null, (r52 & 4194304) != 0 ? r2.modalBottomWindowText : null, (r52 & 8388608) != 0 ? r2.modalWindowState : null, (r52 & 16777216) != 0 ? r2.isModalWindowVisible : false, (r52 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.isScrollBarVisible : false, (r52 & 67108864) != 0 ? r2.isBottomSheetBlockVisible : false, (r52 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isNeedToShowFilter : !r2.isNeedToShowFilter(), (r52 & 268435456) != 0 ? r2.isHintsOpened : false, (r52 & 536870912) != 0 ? r2.isWithIndicationFilter : false, (r52 & 1073741824) != 0 ? r2.isWaitingServerResponseForPublishing : false, (r52 & Integer.MIN_VALUE) != 0 ? r2.isCanPublishProductCards : false, (r53 & 1) != 0 ? r2.bgMarketplace : null, (r53 & 2) != 0 ? value.isNeedClose : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onClickConfirmFilters() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new MarketplaceViewModel$onClickConfirmFilters$1(this, null), 1, null);
    }

    public final void onFilterCheckboxClick(@NotNull CraftItemCategoryFilter checkBox) {
        Intrinsics.checkNotNullParameter(checkBox, "checkBox");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new MarketplaceViewModel$onFilterCheckboxClick$1(checkBox, this, null), 1, null);
    }

    public final void onResetFilterButtonClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new MarketplaceViewModel$onResetFilterButtonClick$1(this, null), 1, null);
    }

    public final void onClickToPlusButton() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new MarketplaceViewModel$onClickToPlusButton$1(this, null), 1, null);
    }

    public final void onClickConfirmInModalWindow() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new MarketplaceViewModel$onClickConfirmInModalWindow$1(this, null), 1, null);
    }

    public final void onClickLike(@NotNull MarketplaceProduct likedProduct) {
        Intrinsics.checkNotNullParameter(likedProduct, "likedProduct");
        ViewModelExtensionKt.launchOnIO$default(this, null, new MarketplaceViewModel$onClickLike$1(likedProduct, this, null), 1, null);
    }

    public final void onInfoClick() {
        MarketplaceUiState value;
        MarketplaceUiState copy;
        MutableStateFlow<? extends MarketplaceUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r52 & 1) != 0 ? r2.profileInfo : null, (r52 & 2) != 0 ? r2.bottomSheetInfo : null, (r52 & 4) != 0 ? r2.marketplaceLimits : null, (r52 & 8) != 0 ? r2.money : 0, (r52 & 16) != 0 ? r2.isHasPlatinumVip : false, (r52 & 32) != 0 ? r2.allInventoryItems : null, (r52 & 64) != 0 ? r2.products : null, (r52 & 128) != 0 ? r2.inventoryProducts : null, (r52 & 256) != 0 ? r2.tabs : null, (r52 & 512) != 0 ? r2.filterList : null, (r52 & 1024) != 0 ? r2.listOfChosenFilterIds : null, (r52 & 2048) != 0 ? r2.likedList : null, (r52 & 4096) != 0 ? r2.selectedTab : null, (r52 & 8192) != 0 ? r2.selectedProduct : null, (r52 & 16384) != 0 ? r2.currentPage : 0, (r52 & 32768) != 0 ? r2.totalPages : 0, (r52 & 65536) != 0 ? r2.priceVip : 0, (r52 & 131072) != 0 ? r2.typeVip : 0, (r52 & 262144) != 0 ? r2.timeVipCard : 0, (r52 & 524288) != 0 ? r2.pagesToShow : null, (r52 & 1048576) != 0 ? r2.currentSortFilter : null, (r52 & 2097152) != 0 ? r2.bestMarketplaceProduct : null, (r52 & 4194304) != 0 ? r2.modalBottomWindowText : null, (r52 & 8388608) != 0 ? r2.modalWindowState : null, (r52 & 16777216) != 0 ? r2.isModalWindowVisible : false, (r52 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.isScrollBarVisible : false, (r52 & 67108864) != 0 ? r2.isBottomSheetBlockVisible : false, (r52 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isNeedToShowFilter : false, (r52 & 268435456) != 0 ? r2.isHintsOpened : true, (r52 & 536870912) != 0 ? r2.isWithIndicationFilter : false, (r52 & 1073741824) != 0 ? r2.isWaitingServerResponseForPublishing : false, (r52 & Integer.MIN_VALUE) != 0 ? r2.isCanPublishProductCards : false, (r53 & 1) != 0 ? r2.bgMarketplace : null, (r53 & 2) != 0 ? value.isNeedClose : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onCloseModalWindow() {
        MarketplaceUiState value;
        MarketplaceUiState copy;
        MutableStateFlow<? extends MarketplaceUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r52 & 1) != 0 ? r2.profileInfo : null, (r52 & 2) != 0 ? r2.bottomSheetInfo : null, (r52 & 4) != 0 ? r2.marketplaceLimits : null, (r52 & 8) != 0 ? r2.money : 0, (r52 & 16) != 0 ? r2.isHasPlatinumVip : false, (r52 & 32) != 0 ? r2.allInventoryItems : null, (r52 & 64) != 0 ? r2.products : null, (r52 & 128) != 0 ? r2.inventoryProducts : null, (r52 & 256) != 0 ? r2.tabs : null, (r52 & 512) != 0 ? r2.filterList : null, (r52 & 1024) != 0 ? r2.listOfChosenFilterIds : null, (r52 & 2048) != 0 ? r2.likedList : null, (r52 & 4096) != 0 ? r2.selectedTab : null, (r52 & 8192) != 0 ? r2.selectedProduct : null, (r52 & 16384) != 0 ? r2.currentPage : 0, (r52 & 32768) != 0 ? r2.totalPages : 0, (r52 & 65536) != 0 ? r2.priceVip : 0, (r52 & 131072) != 0 ? r2.typeVip : 0, (r52 & 262144) != 0 ? r2.timeVipCard : 0, (r52 & 524288) != 0 ? r2.pagesToShow : null, (r52 & 1048576) != 0 ? r2.currentSortFilter : null, (r52 & 2097152) != 0 ? r2.bestMarketplaceProduct : null, (r52 & 4194304) != 0 ? r2.modalBottomWindowText : null, (r52 & 8388608) != 0 ? r2.modalWindowState : null, (r52 & 16777216) != 0 ? r2.isModalWindowVisible : false, (r52 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.isScrollBarVisible : false, (r52 & 67108864) != 0 ? r2.isBottomSheetBlockVisible : false, (r52 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isNeedToShowFilter : false, (r52 & 268435456) != 0 ? r2.isHintsOpened : false, (r52 & 536870912) != 0 ? r2.isWithIndicationFilter : false, (r52 & 1073741824) != 0 ? r2.isWaitingServerResponseForPublishing : false, (r52 & Integer.MIN_VALUE) != 0 ? r2.isCanPublishProductCards : false, (r53 & 1) != 0 ? r2.bgMarketplace : null, (r53 & 2) != 0 ? value.isNeedClose : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onClickCloseInfo() {
        MarketplaceUiState value;
        MarketplaceUiState copy;
        MutableStateFlow<? extends MarketplaceUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r52 & 1) != 0 ? r2.profileInfo : null, (r52 & 2) != 0 ? r2.bottomSheetInfo : null, (r52 & 4) != 0 ? r2.marketplaceLimits : null, (r52 & 8) != 0 ? r2.money : 0, (r52 & 16) != 0 ? r2.isHasPlatinumVip : false, (r52 & 32) != 0 ? r2.allInventoryItems : null, (r52 & 64) != 0 ? r2.products : null, (r52 & 128) != 0 ? r2.inventoryProducts : null, (r52 & 256) != 0 ? r2.tabs : null, (r52 & 512) != 0 ? r2.filterList : null, (r52 & 1024) != 0 ? r2.listOfChosenFilterIds : null, (r52 & 2048) != 0 ? r2.likedList : null, (r52 & 4096) != 0 ? r2.selectedTab : null, (r52 & 8192) != 0 ? r2.selectedProduct : null, (r52 & 16384) != 0 ? r2.currentPage : 0, (r52 & 32768) != 0 ? r2.totalPages : 0, (r52 & 65536) != 0 ? r2.priceVip : 0, (r52 & 131072) != 0 ? r2.typeVip : 0, (r52 & 262144) != 0 ? r2.timeVipCard : 0, (r52 & 524288) != 0 ? r2.pagesToShow : null, (r52 & 1048576) != 0 ? r2.currentSortFilter : null, (r52 & 2097152) != 0 ? r2.bestMarketplaceProduct : null, (r52 & 4194304) != 0 ? r2.modalBottomWindowText : null, (r52 & 8388608) != 0 ? r2.modalWindowState : null, (r52 & 16777216) != 0 ? r2.isModalWindowVisible : false, (r52 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.isScrollBarVisible : false, (r52 & 67108864) != 0 ? r2.isBottomSheetBlockVisible : false, (r52 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isNeedToShowFilter : false, (r52 & 268435456) != 0 ? r2.isHintsOpened : false, (r52 & 536870912) != 0 ? r2.isWithIndicationFilter : false, (r52 & 1073741824) != 0 ? r2.isWaitingServerResponseForPublishing : false, (r52 & Integer.MIN_VALUE) != 0 ? r2.isCanPublishProductCards : false, (r53 & 1) != 0 ? r2.bgMarketplace : null, (r53 & 2) != 0 ? value.isNeedClose : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onClickCloseBottomSheet() {
        MarketplaceUiState value;
        MarketplaceUiState copy;
        if (get_uiState().getValue().getSelectedTab().getTabValue() == 5) {
            ViewModelExtensionKt.launchOnIO$default(this, null, new MarketplaceViewModel$onClickCloseBottomSheet$1(this, null), 1, null);
        }
        MutableStateFlow<? extends MarketplaceUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r52 & 1) != 0 ? r3.profileInfo : null, (r52 & 2) != 0 ? r3.bottomSheetInfo : null, (r52 & 4) != 0 ? r3.marketplaceLimits : null, (r52 & 8) != 0 ? r3.money : 0, (r52 & 16) != 0 ? r3.isHasPlatinumVip : false, (r52 & 32) != 0 ? r3.allInventoryItems : null, (r52 & 64) != 0 ? r3.products : null, (r52 & 128) != 0 ? r3.inventoryProducts : null, (r52 & 256) != 0 ? r3.tabs : null, (r52 & 512) != 0 ? r3.filterList : null, (r52 & 1024) != 0 ? r3.listOfChosenFilterIds : null, (r52 & 2048) != 0 ? r3.likedList : null, (r52 & 4096) != 0 ? r3.selectedTab : null, (r52 & 8192) != 0 ? r3.selectedProduct : null, (r52 & 16384) != 0 ? r3.currentPage : 0, (r52 & 32768) != 0 ? r3.totalPages : 0, (r52 & 65536) != 0 ? r3.priceVip : 0, (r52 & 131072) != 0 ? r3.typeVip : 0, (r52 & 262144) != 0 ? r3.timeVipCard : 0, (r52 & 524288) != 0 ? r3.pagesToShow : null, (r52 & 1048576) != 0 ? r3.currentSortFilter : null, (r52 & 2097152) != 0 ? r3.bestMarketplaceProduct : null, (r52 & 4194304) != 0 ? r3.modalBottomWindowText : null, (r52 & 8388608) != 0 ? r3.modalWindowState : null, (r52 & 16777216) != 0 ? r3.isModalWindowVisible : false, (r52 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r3.isScrollBarVisible : false, (r52 & 67108864) != 0 ? r3.isBottomSheetBlockVisible : false, (r52 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.isNeedToShowFilter : false, (r52 & 268435456) != 0 ? r3.isHintsOpened : false, (r52 & 536870912) != 0 ? r3.isWithIndicationFilter : false, (r52 & 1073741824) != 0 ? r3.isWaitingServerResponseForPublishing : false, (r52 & Integer.MIN_VALUE) != 0 ? r3.isCanPublishProductCards : false, (r53 & 1) != 0 ? r3.bgMarketplace : null, (r53 & 2) != 0 ? value.isNeedClose : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void closeScreen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new MarketplaceViewModel$closeScreen$1(this, null), 1, null);
    }

    public final void onClickSort() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new MarketplaceViewModel$onClickSort$1(this, null), 1, null);
    }

    public final void onClickConfirmSearch(@NotNull String word) {
        Intrinsics.checkNotNullParameter(word, "word");
        ViewModelExtensionKt.launchOnIO$default(this, null, new MarketplaceViewModel$onClickConfirmSearch$1(this, word, null), 1, null);
    }

    public final void joinLikes(JSONArray likedProductsIds) {
        MarketplaceUiState copy;
        Object obj;
        if (likedProductsIds == null) {
            return;
        }
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) get_uiState().getValue().getProducts());
        ArrayList arrayList = new ArrayList();
        int length = likedProductsIds.length();
        for (int i = 0; i < length; i++) {
            int optInt = likedProductsIds.optInt(i);
            arrayList.add(Integer.valueOf(optInt));
            Iterator it = mutableList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((MarketplaceProduct) obj).getId() == optInt) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            MarketplaceProduct marketplaceProduct = (MarketplaceProduct) obj;
            if (marketplaceProduct != null) {
                marketplaceProduct.setHaveLike(true);
            }
        }
        MutableStateFlow<? extends MarketplaceUiState> mutableStateFlow = get_uiState();
        while (true) {
            MarketplaceUiState value = mutableStateFlow.getValue();
            ArrayList arrayList2 = arrayList;
            copy = r2.copy((r52 & 1) != 0 ? r2.profileInfo : null, (r52 & 2) != 0 ? r2.bottomSheetInfo : null, (r52 & 4) != 0 ? r2.marketplaceLimits : null, (r52 & 8) != 0 ? r2.money : 0, (r52 & 16) != 0 ? r2.isHasPlatinumVip : false, (r52 & 32) != 0 ? r2.allInventoryItems : null, (r52 & 64) != 0 ? r2.products : mutableList, (r52 & 128) != 0 ? r2.inventoryProducts : null, (r52 & 256) != 0 ? r2.tabs : null, (r52 & 512) != 0 ? r2.filterList : null, (r52 & 1024) != 0 ? r2.listOfChosenFilterIds : null, (r52 & 2048) != 0 ? r2.likedList : arrayList, (r52 & 4096) != 0 ? r2.selectedTab : null, (r52 & 8192) != 0 ? r2.selectedProduct : null, (r52 & 16384) != 0 ? r2.currentPage : 0, (r52 & 32768) != 0 ? r2.totalPages : 0, (r52 & 65536) != 0 ? r2.priceVip : 0, (r52 & 131072) != 0 ? r2.typeVip : 0, (r52 & 262144) != 0 ? r2.timeVipCard : 0, (r52 & 524288) != 0 ? r2.pagesToShow : null, (r52 & 1048576) != 0 ? r2.currentSortFilter : null, (r52 & 2097152) != 0 ? r2.bestMarketplaceProduct : null, (r52 & 4194304) != 0 ? r2.modalBottomWindowText : null, (r52 & 8388608) != 0 ? r2.modalWindowState : null, (r52 & 16777216) != 0 ? r2.isModalWindowVisible : false, (r52 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.isScrollBarVisible : false, (r52 & 67108864) != 0 ? r2.isBottomSheetBlockVisible : false, (r52 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isNeedToShowFilter : false, (r52 & 268435456) != 0 ? r2.isHintsOpened : false, (r52 & 536870912) != 0 ? r2.isWithIndicationFilter : false, (r52 & 1073741824) != 0 ? r2.isWaitingServerResponseForPublishing : false, (r52 & Integer.MIN_VALUE) != 0 ? r2.isCanPublishProductCards : false, (r53 & 1) != 0 ? r2.bgMarketplace : null, (r53 & 2) != 0 ? value.isNeedClose : false);
            if (mutableStateFlow.compareAndSet(value, copy)) {
                return;
            } else {
                arrayList = arrayList2;
            }
        }
    }

    public final void onConfirmPublish() {
        MarketplaceUiState value;
        MarketplaceUiState copy;
        MarketplaceProduct copy2;
        MarketplaceBottomSheetInfo bottomSheetInfo = get_uiState().getValue().getBottomSheetInfo();
        boolean z = false;
        if (get_uiState().getValue().getMarketplaceLimits().getPriceForPublish() + (bottomSheetInfo.isCheckBoxChecked() ? get_uiState().getValue().getMarketplaceLimits().getHotTicketCost() : 0) <= get_uiState().getValue().getMoney()) {
            copy2 = r3.copy((r44 & 1) != 0 ? r3.isPlatinumVipProduct : false, (r44 & 2) != 0 ? r3.name : null, (r44 & 4) != 0 ? r3.imageName : null, (r44 & 8) != 0 ? r3.rarity : null, (r44 & 16) != 0 ? r3.typeProductCard : null, (r44 & 32) != 0 ? r3.id : 0, (r44 & 64) != 0 ? r3.notificationType : null, (r44 & 128) != 0 ? r3.timeVipCard : 0, (r44 & 256) != 0 ? r3.time : 0, (r44 & 512) != 0 ? r3.timeTemplate : 0, (r44 & 1024) != 0 ? r3.inventoryId : 0, (r44 & 2048) != 0 ? r3.price : bottomSheetInfo.getPrice(), (r44 & 4096) != 0 ? r3.count : bottomSheetInfo.getProductCount(), (r44 & 8192) != 0 ? r3.seller : null, (r44 & 16384) != 0 ? r3.description : null, (r44 & 32768) != 0 ? r3.timeText : null, (r44 & 65536) != 0 ? r3.weight : 0.0d, (r44 & 131072) != 0 ? r3.typeTextRes : 0, (262144 & r44) != 0 ? r3.statusForHistory : null, (r44 & 524288) != 0 ? r3.isSelected : false, (r44 & 1048576) != 0 ? r3.isUser : false, (r44 & 2097152) != 0 ? r3.isPublished : false, (r44 & 4194304) != 0 ? r3.isHaveLike : false, (r44 & 8388608) != 0 ? get_uiState().getValue().getSelectedProduct().renderInfo : null);
            this.actionWithJSON.sendConfirmPublishProductLot(copy2, bottomSheetInfo.isCheckBoxChecked());
            z = true;
        } else {
            getLocalNotification().showErrorNotification(this.stringResources.getString(R.string.black_pass_not_enough_money));
        }
        MutableStateFlow<? extends MarketplaceUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r4.copy((r52 & 1) != 0 ? r4.profileInfo : null, (r52 & 2) != 0 ? r4.bottomSheetInfo : null, (r52 & 4) != 0 ? r4.marketplaceLimits : null, (r52 & 8) != 0 ? r4.money : 0, (r52 & 16) != 0 ? r4.isHasPlatinumVip : false, (r52 & 32) != 0 ? r4.allInventoryItems : null, (r52 & 64) != 0 ? r4.products : null, (r52 & 128) != 0 ? r4.inventoryProducts : null, (r52 & 256) != 0 ? r4.tabs : null, (r52 & 512) != 0 ? r4.filterList : null, (r52 & 1024) != 0 ? r4.listOfChosenFilterIds : null, (r52 & 2048) != 0 ? r4.likedList : null, (r52 & 4096) != 0 ? r4.selectedTab : null, (r52 & 8192) != 0 ? r4.selectedProduct : null, (r52 & 16384) != 0 ? r4.currentPage : 0, (r52 & 32768) != 0 ? r4.totalPages : 0, (r52 & 65536) != 0 ? r4.priceVip : 0, (r52 & 131072) != 0 ? r4.typeVip : 0, (r52 & 262144) != 0 ? r4.timeVipCard : 0, (r52 & 524288) != 0 ? r4.pagesToShow : null, (r52 & 1048576) != 0 ? r4.currentSortFilter : null, (r52 & 2097152) != 0 ? r4.bestMarketplaceProduct : null, (r52 & 4194304) != 0 ? r4.modalBottomWindowText : null, (r52 & 8388608) != 0 ? r4.modalWindowState : null, (r52 & 16777216) != 0 ? r4.isModalWindowVisible : false, (r52 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r4.isScrollBarVisible : false, (r52 & 67108864) != 0 ? r4.isBottomSheetBlockVisible : false, (r52 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r4.isNeedToShowFilter : false, (r52 & 268435456) != 0 ? r4.isHintsOpened : false, (r52 & 536870912) != 0 ? r4.isWithIndicationFilter : false, (r52 & 1073741824) != 0 ? r4.isWaitingServerResponseForPublishing : z, (r52 & Integer.MIN_VALUE) != 0 ? r4.isCanPublishProductCards : false, (r53 & 1) != 0 ? r4.bgMarketplace : null, (r53 & 2) != 0 ? value.isNeedClose : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onConfirmEdit() {
        MarketplaceUiState value;
        MarketplaceUiState copy;
        MarketplaceProduct copy2;
        MarketplaceUiState value2;
        MarketplaceUiState copy3;
        MarketplaceBottomSheetInfo bottomSheetInfo = get_uiState().getValue().getBottomSheetInfo();
        if (get_uiState().getValue().getMarketplaceLimits().getPriceForPublish() + (bottomSheetInfo.isCheckBoxChecked() ? get_uiState().getValue().getMarketplaceLimits().getHotTicketCost() : 0) <= get_uiState().getValue().getMoney()) {
            copy2 = r3.copy((r44 & 1) != 0 ? r3.isPlatinumVipProduct : false, (r44 & 2) != 0 ? r3.name : null, (r44 & 4) != 0 ? r3.imageName : null, (r44 & 8) != 0 ? r3.rarity : null, (r44 & 16) != 0 ? r3.typeProductCard : null, (r44 & 32) != 0 ? r3.id : 0, (r44 & 64) != 0 ? r3.notificationType : null, (r44 & 128) != 0 ? r3.timeVipCard : 0, (r44 & 256) != 0 ? r3.time : 0, (r44 & 512) != 0 ? r3.timeTemplate : 0, (r44 & 1024) != 0 ? r3.inventoryId : 0, (r44 & 2048) != 0 ? r3.price : bottomSheetInfo.getPrice(), (r44 & 4096) != 0 ? r3.count : 0, (r44 & 8192) != 0 ? r3.seller : null, (r44 & 16384) != 0 ? r3.description : null, (r44 & 32768) != 0 ? r3.timeText : null, (r44 & 65536) != 0 ? r3.weight : 0.0d, (r44 & 131072) != 0 ? r3.typeTextRes : 0, (262144 & r44) != 0 ? r3.statusForHistory : null, (r44 & 524288) != 0 ? r3.isSelected : false, (r44 & 1048576) != 0 ? r3.isUser : false, (r44 & 2097152) != 0 ? r3.isPublished : false, (r44 & 4194304) != 0 ? r3.isHaveLike : false, (r44 & 8388608) != 0 ? get_uiState().getValue().getSelectedProduct().renderInfo : null);
            this.actionWithJSON.sendConfirmEdit(copy2, bottomSheetInfo.isCheckBoxChecked());
            MutableStateFlow<? extends MarketplaceUiState> mutableStateFlow = get_uiState();
            do {
                value2 = mutableStateFlow.getValue();
                copy3 = r3.copy((r52 & 1) != 0 ? r3.profileInfo : null, (r52 & 2) != 0 ? r3.bottomSheetInfo : null, (r52 & 4) != 0 ? r3.marketplaceLimits : null, (r52 & 8) != 0 ? r3.money : 0, (r52 & 16) != 0 ? r3.isHasPlatinumVip : false, (r52 & 32) != 0 ? r3.allInventoryItems : null, (r52 & 64) != 0 ? r3.products : null, (r52 & 128) != 0 ? r3.inventoryProducts : null, (r52 & 256) != 0 ? r3.tabs : null, (r52 & 512) != 0 ? r3.filterList : null, (r52 & 1024) != 0 ? r3.listOfChosenFilterIds : null, (r52 & 2048) != 0 ? r3.likedList : null, (r52 & 4096) != 0 ? r3.selectedTab : null, (r52 & 8192) != 0 ? r3.selectedProduct : null, (r52 & 16384) != 0 ? r3.currentPage : 0, (r52 & 32768) != 0 ? r3.totalPages : 0, (r52 & 65536) != 0 ? r3.priceVip : 0, (r52 & 131072) != 0 ? r3.typeVip : 0, (r52 & 262144) != 0 ? r3.timeVipCard : 0, (r52 & 524288) != 0 ? r3.pagesToShow : null, (r52 & 1048576) != 0 ? r3.currentSortFilter : null, (r52 & 2097152) != 0 ? r3.bestMarketplaceProduct : null, (r52 & 4194304) != 0 ? r3.modalBottomWindowText : null, (r52 & 8388608) != 0 ? r3.modalWindowState : null, (r52 & 16777216) != 0 ? r3.isModalWindowVisible : false, (r52 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r3.isScrollBarVisible : false, (r52 & 67108864) != 0 ? r3.isBottomSheetBlockVisible : false, (r52 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.isNeedToShowFilter : false, (r52 & 268435456) != 0 ? r3.isHintsOpened : false, (r52 & 536870912) != 0 ? r3.isWithIndicationFilter : false, (r52 & 1073741824) != 0 ? r3.isWaitingServerResponseForPublishing : false, (r52 & Integer.MIN_VALUE) != 0 ? r3.isCanPublishProductCards : false, (r53 & 1) != 0 ? r3.bgMarketplace : null, (r53 & 2) != 0 ? value2.isNeedClose : false);
            } while (!mutableStateFlow.compareAndSet(value2, copy3));
            return;
        }
        getLocalNotification().showErrorNotification(this.stringResources.getString(R.string.black_pass_not_enough_money));
        MutableStateFlow<? extends MarketplaceUiState> mutableStateFlow2 = get_uiState();
        do {
            value = mutableStateFlow2.getValue();
            copy = r3.copy((r52 & 1) != 0 ? r3.profileInfo : null, (r52 & 2) != 0 ? r3.bottomSheetInfo : null, (r52 & 4) != 0 ? r3.marketplaceLimits : null, (r52 & 8) != 0 ? r3.money : 0, (r52 & 16) != 0 ? r3.isHasPlatinumVip : false, (r52 & 32) != 0 ? r3.allInventoryItems : null, (r52 & 64) != 0 ? r3.products : null, (r52 & 128) != 0 ? r3.inventoryProducts : null, (r52 & 256) != 0 ? r3.tabs : null, (r52 & 512) != 0 ? r3.filterList : null, (r52 & 1024) != 0 ? r3.listOfChosenFilterIds : null, (r52 & 2048) != 0 ? r3.likedList : null, (r52 & 4096) != 0 ? r3.selectedTab : null, (r52 & 8192) != 0 ? r3.selectedProduct : null, (r52 & 16384) != 0 ? r3.currentPage : 0, (r52 & 32768) != 0 ? r3.totalPages : 0, (r52 & 65536) != 0 ? r3.priceVip : 0, (r52 & 131072) != 0 ? r3.typeVip : 0, (r52 & 262144) != 0 ? r3.timeVipCard : 0, (r52 & 524288) != 0 ? r3.pagesToShow : null, (r52 & 1048576) != 0 ? r3.currentSortFilter : null, (r52 & 2097152) != 0 ? r3.bestMarketplaceProduct : null, (r52 & 4194304) != 0 ? r3.modalBottomWindowText : null, (r52 & 8388608) != 0 ? r3.modalWindowState : null, (r52 & 16777216) != 0 ? r3.isModalWindowVisible : false, (r52 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r3.isScrollBarVisible : false, (r52 & 67108864) != 0 ? r3.isBottomSheetBlockVisible : false, (r52 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.isNeedToShowFilter : false, (r52 & 268435456) != 0 ? r3.isHintsOpened : false, (r52 & 536870912) != 0 ? r3.isWithIndicationFilter : false, (r52 & 1073741824) != 0 ? r3.isWaitingServerResponseForPublishing : false, (r52 & Integer.MIN_VALUE) != 0 ? r3.isCanPublishProductCards : false, (r53 & 1) != 0 ? r3.bgMarketplace : null, (r53 & 2) != 0 ? value.isNeedClose : false);
        } while (!mutableStateFlow2.compareAndSet(value, copy));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d5, code lost:
    
        r5 = r5.copy((r44 & 1) != 0 ? r5.isPlatinumVipProduct : false, (r44 & 2) != 0 ? r5.name : null, (r44 & 4) != 0 ? r5.imageName : null, (r44 & 8) != 0 ? r5.rarity : null, (r44 & 16) != 0 ? r5.typeProductCard : null, (r44 & 32) != 0 ? r5.id : 0, (r44 & 64) != 0 ? r5.notificationType : null, (r44 & 128) != 0 ? r5.timeVipCard : 0, (r44 & 256) != 0 ? r5.time : 0, (r44 & 512) != 0 ? r5.timeTemplate : 0, (r44 & 1024) != 0 ? r5.inventoryId : 0, (r44 & 2048) != 0 ? r5.price : 0, (r44 & 4096) != 0 ? r5.count : r2, (r44 & 8192) != 0 ? r5.seller : null, (r44 & 16384) != 0 ? r5.description : null, (r44 & 32768) != 0 ? r5.timeText : null, (r44 & 65536) != 0 ? r5.weight : 0.0d, (r44 & 131072) != 0 ? r5.typeTextRes : 0, (262144 & r44) != 0 ? r5.statusForHistory : null, (r44 & 524288) != 0 ? r5.isSelected : false, (r44 & 1048576) != 0 ? r5.isUser : false, (r44 & 2097152) != 0 ? r5.isPublished : false, (r44 & 4194304) != 0 ? r5.isHaveLike : false, (r44 & 8388608) != 0 ? r5.renderInfo : null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onConfirmBuy() {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel.onConfirmBuy():void");
    }

    public final void onConfirmDeleteCard() {
        MarketplaceUiState copy;
        this.actionWithJSON.sendDeleteProductLot();
        MarketplaceSortFilter marketplaceSortFilter = MarketplaceSortFilter.DESCENDING;
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) get_uiState().getValue().getProducts());
        mutableList.remove(get_uiState().getValue().getSelectedProduct());
        MutableStateFlow<? extends MarketplaceUiState> mutableStateFlow = get_uiState();
        while (true) {
            MarketplaceUiState value = mutableStateFlow.getValue();
            MutableStateFlow<? extends MarketplaceUiState> mutableStateFlow2 = mutableStateFlow;
            List list = mutableList;
            copy = r2.copy((r52 & 1) != 0 ? r2.profileInfo : null, (r52 & 2) != 0 ? r2.bottomSheetInfo : null, (r52 & 4) != 0 ? r2.marketplaceLimits : null, (r52 & 8) != 0 ? r2.money : 0, (r52 & 16) != 0 ? r2.isHasPlatinumVip : false, (r52 & 32) != 0 ? r2.allInventoryItems : null, (r52 & 64) != 0 ? r2.products : mutableList, (r52 & 128) != 0 ? r2.inventoryProducts : null, (r52 & 256) != 0 ? r2.tabs : null, (r52 & 512) != 0 ? r2.filterList : null, (r52 & 1024) != 0 ? r2.listOfChosenFilterIds : null, (r52 & 2048) != 0 ? r2.likedList : null, (r52 & 4096) != 0 ? r2.selectedTab : null, (r52 & 8192) != 0 ? r2.selectedProduct : null, (r52 & 16384) != 0 ? r2.currentPage : 0, (r52 & 32768) != 0 ? r2.totalPages : 0, (r52 & 65536) != 0 ? r2.priceVip : 0, (r52 & 131072) != 0 ? r2.typeVip : 0, (r52 & 262144) != 0 ? r2.timeVipCard : 0, (r52 & 524288) != 0 ? r2.pagesToShow : null, (r52 & 1048576) != 0 ? r2.currentSortFilter : marketplaceSortFilter, (r52 & 2097152) != 0 ? r2.bestMarketplaceProduct : null, (r52 & 4194304) != 0 ? r2.modalBottomWindowText : null, (r52 & 8388608) != 0 ? r2.modalWindowState : null, (r52 & 16777216) != 0 ? r2.isModalWindowVisible : false, (r52 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.isScrollBarVisible : false, (r52 & 67108864) != 0 ? r2.isBottomSheetBlockVisible : false, (r52 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isNeedToShowFilter : false, (r52 & 268435456) != 0 ? r2.isHintsOpened : false, (r52 & 536870912) != 0 ? r2.isWithIndicationFilter : false, (r52 & 1073741824) != 0 ? r2.isWaitingServerResponseForPublishing : false, (r52 & Integer.MIN_VALUE) != 0 ? r2.isCanPublishProductCards : false, (r53 & 1) != 0 ? r2.bgMarketplace : null, (r53 & 2) != 0 ? value.isNeedClose : false);
            if (mutableStateFlow2.compareAndSet(value, copy)) {
                return;
            }
            mutableStateFlow = mutableStateFlow2;
            mutableList = list;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0072, code lost:
    
        r4 = r11.copy((r44 & 1) != 0 ? r11.isPlatinumVipProduct : false, (r44 & 2) != 0 ? r11.name : null, (r44 & 4) != 0 ? r11.imageName : null, (r44 & 8) != 0 ? r11.rarity : null, (r44 & 16) != 0 ? r11.typeProductCard : null, (r44 & 32) != 0 ? r11.id : 0, (r44 & 64) != 0 ? r11.notificationType : null, (r44 & 128) != 0 ? r11.timeVipCard : 0, (r44 & 256) != 0 ? r11.time : 0, (r44 & 512) != 0 ? r11.timeTemplate : 0, (r44 & 1024) != 0 ? r11.inventoryId : 0, (r44 & 2048) != 0 ? r11.price : 0, (r44 & 4096) != 0 ? r11.count : 0, (r44 & 8192) != 0 ? r11.seller : null, (r44 & 16384) != 0 ? r11.description : null, (r44 & 32768) != 0 ? r11.timeText : null, (r44 & 65536) != 0 ? r11.weight : 0.0d, (r44 & 131072) != 0 ? r11.typeTextRes : 0, (262144 & r44) != 0 ? r11.statusForHistory : null, (r44 & 524288) != 0 ? r11.isSelected : false, (r44 & 1048576) != 0 ? r11.isUser : false, (r44 & 2097152) != 0 ? r11.isPublished : false, (r44 & 4194304) != 0 ? r11.isHaveLike : !r3.isHaveLike(), (r44 & 8388608) != 0 ? r11.renderInfo : null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onConfirmSendLike() {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel.onConfirmSendLike():void");
    }

    public final int getTrimmedCount(long count) {
        if (count >= 1000) {
            if (count < 1000000) {
                count /= 1000;
            } else if (count < 1000000000) {
                count /= 1000000;
            } else {
                count /= 1000000000;
            }
        }
        return (int) count;
    }

    public static /* synthetic */ List calculatePaginatorPagesToShow$default(MarketplaceViewModel marketplaceViewModel, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = marketplaceViewModel.get_uiState().getValue().getCurrentPage();
        }
        if ((i3 & 2) != 0) {
            i2 = marketplaceViewModel.getUiState().getValue().getTotalPages();
        }
        return marketplaceViewModel.calculatePaginatorPagesToShow(i, i2);
    }

    public final List<Integer> calculatePaginatorPagesToShow(int currentPage, int totalPages) {
        int i = currentPage - 2;
        int i2 = 1;
        if (i <= 0) {
            i = 1;
        }
        int i3 = i + 4;
        if (i3 > totalPages) {
            int i4 = totalPages - 4;
            if (i4 > 0) {
                i2 = i4;
            }
        } else {
            i2 = i;
            totalPages = i3;
        }
        return CollectionsKt___CollectionsKt.toList(new IntRange(i2, totalPages));
    }

    public final List<MarketplaceProduct> addVipProductCard(List<MarketplaceProduct> products, int price, int timeVipCard) {
        int i = products.size() == 0 ? 0 : 1;
        List<MarketplaceProduct> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) products);
        mutableList.add(i, new MarketplaceProduct(true, this.stringResources.getString(R.string.craft_is_with_vip_platinum), null, MarketplaceRarityEnum.SPECIAL, MarketplaceTypeProductCardEnum.BEST, 0, MarketplaceNotificationEnum.THE_BEST, timeVipCard, 0, 0, 0, price, 999, this.stringResources.getString(R.string.common_black_russia), this.stringResources.getString(R.string.marketplace_vip_description), null, 0.0d, 0, null, false, false, false, false, null, 16746276, null));
        return mutableList;
    }

    public final void changeTabStatus(int tabValue) {
        MarketplaceSortFilter marketplaceSortFilter;
        MarketplaceUiState value;
        MarketplaceUiState copy;
        char c;
        MarketplaceTab copy2;
        int tabValue2 = get_uiState().getValue().getSelectedTab().getTabValue();
        MarketplaceSortFilter currentSortFilter = get_uiState().getValue().getCurrentSortFilter();
        if (tabValue == 3) {
            marketplaceSortFilter = MarketplaceSortFilter.NEW;
        } else {
            marketplaceSortFilter = MarketplaceSortFilter.DESCENDING;
        }
        List<MarketplaceTab> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) get_uiState().getValue().getTabs());
        MarketplaceTab marketplaceTab = null;
        for (MarketplaceTab marketplaceTab2 : mutableList) {
            int tabValue3 = marketplaceTab2.getTabValue();
            if (tabValue3 == tabValue) {
                copy2 = marketplaceTab2.copy((r18 & 1) != 0 ? marketplaceTab2.isHasPlatinumVip : false, (r18 & 2) != 0 ? marketplaceTab2.tabValue : 0, (r18 & 4) != 0 ? marketplaceTab2.tabName : null, (r18 & 8) != 0 ? marketplaceTab2.icon : 0, (r18 & 16) != 0 ? marketplaceTab2.titleIcon : 0, (r18 & 32) != 0 ? marketplaceTab2.isSelected : true, (r18 & 64) != 0 ? marketplaceTab2.isHaveUpdates : false, (r18 & 128) != 0 ? marketplaceTab2.savedSortFilter : null);
                marketplaceTab2.setSelected(true);
                marketplaceTab2.setHaveUpdates(false);
                marketplaceTab = copy2;
                c = 3;
                marketplaceSortFilter = marketplaceTab2.getSavedSortFilter();
            } else if (tabValue3 == tabValue2) {
                marketplaceTab2.setSelected(false);
                c = 3;
                if (marketplaceTab2.getTabValue() == 3) {
                    marketplaceTab2.setSavedSortFilter(currentSortFilter);
                }
            } else {
                c = 3;
                marketplaceTab2.setSelected(false);
            }
        }
        MarketplaceBottomSheetInfo marketplaceBottomSheetInfo = new MarketplaceBottomSheetInfo(marketplaceTab != null ? marketplaceTab.getTabValue() : 2, false, 0, 0L, 0L, 0, 0, 126, null);
        if (marketplaceTab != null) {
            MutableStateFlow<? extends MarketplaceUiState> mutableStateFlow = get_uiState();
            do {
                value = mutableStateFlow.getValue();
                copy = r6.copy((r52 & 1) != 0 ? r6.profileInfo : null, (r52 & 2) != 0 ? r6.bottomSheetInfo : marketplaceBottomSheetInfo, (r52 & 4) != 0 ? r6.marketplaceLimits : null, (r52 & 8) != 0 ? r6.money : 0, (r52 & 16) != 0 ? r6.isHasPlatinumVip : false, (r52 & 32) != 0 ? r6.allInventoryItems : null, (r52 & 64) != 0 ? r6.products : CollectionsKt__CollectionsKt.emptyList(), (r52 & 128) != 0 ? r6.inventoryProducts : null, (r52 & 256) != 0 ? r6.tabs : mutableList, (r52 & 512) != 0 ? r6.filterList : null, (r52 & 1024) != 0 ? r6.listOfChosenFilterIds : null, (r52 & 2048) != 0 ? r6.likedList : null, (r52 & 4096) != 0 ? r6.selectedTab : marketplaceTab, (r52 & 8192) != 0 ? r6.selectedProduct : null, (r52 & 16384) != 0 ? r6.currentPage : 1, (r52 & 32768) != 0 ? r6.totalPages : 0, (r52 & 65536) != 0 ? r6.priceVip : 0, (r52 & 131072) != 0 ? r6.typeVip : 0, (r52 & 262144) != 0 ? r6.timeVipCard : 0, (r52 & 524288) != 0 ? r6.pagesToShow : null, (r52 & 1048576) != 0 ? r6.currentSortFilter : marketplaceSortFilter, (r52 & 2097152) != 0 ? r6.bestMarketplaceProduct : null, (r52 & 4194304) != 0 ? r6.modalBottomWindowText : null, (r52 & 8388608) != 0 ? r6.modalWindowState : null, (r52 & 16777216) != 0 ? r6.isModalWindowVisible : false, (r52 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r6.isScrollBarVisible : false, (r52 & 67108864) != 0 ? r6.isBottomSheetBlockVisible : false, (r52 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r6.isNeedToShowFilter : false, (r52 & 268435456) != 0 ? r6.isHintsOpened : false, (r52 & 536870912) != 0 ? r6.isWithIndicationFilter : false, (r52 & 1073741824) != 0 ? r6.isWaitingServerResponseForPublishing : false, (r52 & Integer.MIN_VALUE) != 0 ? r6.isCanPublishProductCards : false, (r53 & 1) != 0 ? r6.bgMarketplace : null, (r53 & 2) != 0 ? value.isNeedClose : false);
            } while (!mutableStateFlow.compareAndSet(value, copy));
        }
    }
}
