package com.blackhub.bronline.game.gui.craft;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.C;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.attachment.main.CommonButtonCategory;
import com.blackhub.bronline.game.gui.craft.enums.CraftElementStatusEnum;
import com.blackhub.bronline.game.gui.craft.enums.CraftScreenTypeEnum;
import com.blackhub.bronline.game.gui.craft.model.ButtonAnimatedAttachment;
import com.blackhub.bronline.game.gui.craft.model.CraftCraftingControl;
import com.blackhub.bronline.game.gui.craft.model.CraftDialogConfirmationAttachment;
import com.blackhub.bronline.game.gui.craft.model.CraftElement;
import com.blackhub.bronline.game.gui.craft.model.CraftIngredient;
import com.blackhub.bronline.game.gui.craft.model.response.CraftCategoryFilter;
import com.blackhub.bronline.game.gui.craft.model.response.CraftItemCategoryFilter;
import com.blackhub.bronline.game.gui.craft.model.response.CraftJsonCategoryFilter;
import com.blackhub.bronline.game.gui.craft.model.response.CraftJsonComponentItem;
import com.blackhub.bronline.game.gui.craft.model.response.CraftJsonItem;
import com.blackhub.bronline.game.gui.craft.model.response.CraftJsonItemCategory;
import com.blackhub.bronline.game.gui.craft.model.server.CraftComponentServerItem;
import com.blackhub.bronline.game.gui.craft.model.server.CraftItemsWithNotificationServerItem;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.apache.ivy.osgi.updatesite.xml.EclipseUpdateSiteParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CraftViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u0006\u0010\u001e\u001a\u00020\u0019J<\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0 2\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0%H\u0082@¢\u0006\u0002\u0010)JX\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0 2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0 2\f\u00100\u001a\b\u0012\u0004\u0012\u0002010 2\u0006\u00102\u001a\u00020&2\u0006\u00103\u001a\u00020&2\u0006\u00104\u001a\u000205H\u0082@¢\u0006\u0002\u00106J\u000e\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u00020(J>\u00109\u001a\u00020:2\u0006\u0010+\u001a\u00020,2\f\u0010;\u001a\b\u0012\u0004\u0012\u0002010 2\u0006\u00102\u001a\u00020&2\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010 2\u0006\u00103\u001a\u00020&H\u0002J.\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010?\u001a\u00020@2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0 2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0 H\u0002J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020(0 2\u0006\u00102\u001a\u00020&H\u0002J\u0006\u0010B\u001a\u00020\u0019J\u001c\u0010C\u001a\u00020&2\b\b\u0002\u00108\u001a\u00020(2\b\b\u0002\u0010D\u001a\u00020&H\u0002J@\u0010E\u001a\u00020\u00192\u0006\u0010F\u001a\u00020G2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0 2\u0006\u00104\u001a\u0002052\f\u0010H\u001a\b\u0012\u0004\u0012\u00020#0 2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020J0 J\u0006\u0010K\u001a\u00020\u0019J\u0006\u0010L\u001a\u00020\u0019J\u0006\u0010M\u001a\u00020\u0019J\u0010\u0010N\u001a\u00020\u00192\b\b\u0002\u0010O\u001a\u00020PJ\u0006\u0010Q\u001a\u00020\u0019J\u0006\u0010R\u001a\u00020\u0019J\u0006\u0010S\u001a\u00020\u0019J\u0016\u0010T\u001a\u00020\u00192\u0006\u0010U\u001a\u00020!2\u0006\u0010V\u001a\u00020&J\u0006\u0010W\u001a\u00020\u0019J\u0006\u0010X\u001a\u00020\u0019J\u0006\u0010Y\u001a\u00020\u0019J\u0006\u0010Z\u001a\u00020\u0019J\u0006\u0010[\u001a\u00020\u0019J6\u0010\\\u001a\b\u0012\u0004\u0012\u00020(0 2\u0006\u0010F\u001a\u00020G2\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0]H\u0082@¢\u0006\u0002\u0010^J6\u0010_\u001a\b\u0012\u0004\u0012\u00020(0 2\u0006\u0010F\u001a\u00020G2\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0]H\u0082@¢\u0006\u0002\u0010^J\u0006\u0010`\u001a\u00020\u0019J\b\u0010a\u001a\u00020\u0019H\u0002J\u000e\u0010b\u001a\u00020\u00192\u0006\u00108\u001a\u00020(J\u0006\u0010c\u001a\u00020\u0019J.\u0010d\u001a\u00020\u00192\u0006\u0010e\u001a\u00020&2\b\b\u0002\u0010f\u001a\u00020g2\b\b\u0002\u0010h\u001a\u00020&2\b\b\u0002\u0010i\u001a\u00020&H\u0002J\u000e\u0010j\u001a\u00020\u00192\u0006\u0010k\u001a\u00020gJ\u0006\u0010l\u001a\u00020\u0019J\u000e\u0010m\u001a\u00020\u00192\u0006\u0010n\u001a\u00020PJ2\u0010o\u001a\b\u0012\u0004\u0012\u00020(0 2\u0010\b\u0002\u0010p\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010 2\u0010\b\u0002\u0010q\u001a\n\u0012\u0004\u0012\u00020r\u0018\u00010 H\u0002J\u0006\u0010s\u001a\u00020\u0019J\u0018\u0010t\u001a\u00020u2\u0006\u0010v\u001a\u00020P2\u0006\u0010w\u001a\u00020(H\u0002J\u000e\u0010x\u001a\u00020\u00192\u0006\u0010F\u001a\u00020GR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006y"}, d2 = {"Lcom/blackhub/bronline/game/gui/craft/CraftViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/craft/CraftUiState;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/craft/CraftActionWithJSON;", "stringResources", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "application", "Landroid/app/Application;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "preferencesRepository", "Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;", "(Lcom/blackhub/bronline/game/gui/craft/CraftActionWithJSON;Lcom/blackhub/bronline/game/core/resources/StringResource;Landroid/app/Application;Lcom/blackhub/bronline/game/common/LocalNotification;Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getLocalNotification", "()Lcom/blackhub/bronline/game/common/LocalNotification;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "addItemForCrafting", "", "checkFilter", "filterCheckBox", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftItemCategoryFilter;", "closeDialogConfirmation", "closeForcedTutorial", "createCategories", "", "Lcom/blackhub/bronline/game/core/utils/attachment/main/CommonButtonCategory;", "listOfComponentItems", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftJsonItemCategory;", "mapOfCraftElements", "", "", "", "Lcom/blackhub/bronline/game/gui/craft/model/CraftElement;", "(Ljava/util/List;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCraftElement", "craftJsonItem", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftJsonItem;", "listOfCraftItems", "componentsArray", "Lcom/blackhub/bronline/game/gui/craft/model/server/CraftComponentServerItem;", "newItemsIdsList", "Lcom/blackhub/bronline/game/gui/craft/model/server/CraftItemsWithNotificationServerItem;", "levelOfSkill", "workbenchLevel", "vipProbAdd", "", "(Lcom/blackhub/bronline/game/gui/craft/model/response/CraftJsonItem;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteElementFromStash", "element", "determineElementState", "Lcom/blackhub/bronline/game/gui/craft/enums/CraftElementStatusEnum;", "newItemsArray", "componentsList", "Lcom/blackhub/bronline/game/gui/craft/model/CraftIngredient;", "findCraftIngredient", "craftComponent", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftJsonComponentItem;", "getLevelUpElementsList", "getOrAddElementForStorage", "getTextQuantityColor", "newValue", "initJson", "json", "Lorg/json/JSONObject;", "craftCategoriesModel", "craftCategoriesFilterModel", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftJsonCategoryFilter;", "onActionCraftingClick", "onArrowBottomClick", "onArrowTopClick", "onButtonCraftClick", "isButtonsExpanded", "", "onButtonProgressClick", "onButtonStashClick", "onBuyVipClick", "onCategoryClick", EclipseUpdateSiteParser.CategoryHandler.CATEGORY, FirebaseAnalytics.Param.INDEX, "onCloseDialogConfirmationClick", "onCloseHintsClick", "onCloseLevelUpDialog", "onDialogConfirmationClick", "onInfoButtonClicked", "parseListWithProductionItems", "", "(Lorg/json/JSONObject;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseListWithStorageItems", "refreshFilter", "returnToDefaultValueOldSelectedElement", "selectCraftElement", "sendCloseScreen", "showDialogConfirmation", "typeOfDialog", "nameOfSelectedElement", "", "idSelectedElement", "valueOfElements", "showErrorMessage", ThrowableDeserializer.PROP_NAME_MESSAGE, "showOrHideFilter", "showSplit", "value", "sortingList", "selectedList", "filterList", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftCategoryFilter;", "subtractItemForCrafting", "updateCraftCraftingControl", "Lcom/blackhub/bronline/game/gui/craft/model/CraftCraftingControl;", "isAdd", "selectedItem", "updateJson", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 7 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 8 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1753:1\n76#2:1754\n96#2,2:1755\n98#2,3:1760\n766#3:1757\n857#3,2:1758\n1549#3:1798\n1620#3,3:1799\n1549#3:1802\n1620#3,3:1803\n1549#3:1806\n1620#3,3:1807\n1549#3:1819\n1620#3,3:1820\n1238#3,2:1825\n1549#3:1827\n1620#3,3:1828\n1241#3:1831\n533#3,6:1832\n1549#3:1838\n1620#3,3:1839\n1747#3,3:1842\n1549#3:1845\n1620#3,3:1846\n1549#3:1849\n1620#3,3:1850\n1747#3,3:1853\n1549#3:1866\n1620#3,3:1867\n1603#3,9:1895\n1855#3:1904\n1856#3:1907\n1612#3:1908\n1603#3,9:1934\n1855#3:1943\n1856#3:1945\n1612#3:1946\n1747#3,3:1952\n1549#3:1964\n1620#3,3:1965\n766#3:1978\n857#3,2:1979\n1549#3:1981\n1620#3,3:1982\n766#3:1985\n857#3,2:1986\n1549#3:1988\n1620#3,3:1989\n766#3:1992\n857#3,2:1993\n1549#3:1995\n1620#3,3:1996\n1549#3:1999\n1620#3,3:2000\n230#4,5:1763\n230#4,5:1768\n230#4,5:1773\n230#4,5:1778\n230#4,5:1783\n230#4,5:1788\n230#4,5:1793\n230#4,5:1856\n230#4,5:1861\n230#4,5:1947\n230#4,5:1968\n230#4,5:1973\n86#5,2:1810\n33#5,6:1812\n88#5:1818\n86#5,2:1955\n33#5,6:1957\n88#5:1963\n453#6:1823\n403#6:1824\n51#7,5:1870\n56#7,11:1884\n51#7,5:1909\n56#7,11:1923\n8#8,9:1875\n8#8,9:1914\n1#9:1905\n1#9:1906\n1#9:1944\n*S KotlinDebug\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel\n*L\n639#1:1754\n639#1:1755,2\n639#1:1760,3\n640#1:1757\n640#1:1758,2\n877#1:1798\n877#1:1799,3\n884#1:1802\n884#1:1803,3\n891#1:1806\n891#1:1807,3\n984#1:1819\n984#1:1820,3\n995#1:1825,2\n996#1:1827\n996#1:1828,3\n995#1:1831\n1007#1:1832,6\n1013#1:1838\n1013#1:1839,3\n1023#1:1842,3\n1034#1:1845\n1034#1:1846,3\n1044#1:1849\n1044#1:1850,3\n1055#1:1853,3\n1357#1:1866\n1357#1:1867,3\n1410#1:1895,9\n1410#1:1904\n1410#1:1907\n1410#1:1908\n1439#1:1934,9\n1439#1:1943\n1439#1:1945\n1439#1:1946\n1532#1:1952,3\n1543#1:1964\n1543#1:1965,3\n1662#1:1978\n1662#1:1979,2\n1664#1:1981\n1664#1:1982,3\n1667#1:1985\n1667#1:1986,2\n1669#1:1988\n1669#1:1989,3\n1672#1:1992\n1672#1:1993,2\n1674#1:1995\n1674#1:1996,3\n1748#1:1999\n1748#1:2000,3\n710#1:1763,5\n718#1:1768,5\n726#1:1773,5\n734#1:1778,5\n762#1:1783,5\n798#1:1788,5\n835#1:1793,5\n1064#1:1856,5\n1337#1:1861,5\n1468#1:1947,5\n1631#1:1968,5\n1646#1:1973,5\n902#1:1810,2\n902#1:1812,6\n902#1:1818\n1534#1:1955,2\n1534#1:1957,6\n1534#1:1963\n995#1:1823\n995#1:1824\n1408#1:1870,5\n1408#1:1884,11\n1437#1:1909,5\n1437#1:1923,11\n1408#1:1875,9\n1437#1:1914,9\n1410#1:1906\n1439#1:1944\n*E\n"})
/* loaded from: classes3.dex */
public final class CraftViewModel extends BaseViewModel<CraftUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<CraftUiState> _uiState;

    @NotNull
    public final CraftActionWithJSON actionWithJSON;

    @NotNull
    public final Application application;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final PreferencesRepository preferencesRepository;

    @NotNull
    public final StringResource stringResources;

    @NotNull
    public final StateFlow<CraftUiState> uiState;

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: CraftViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CraftScreenTypeEnum.values().length];
            try {
                iArr[CraftScreenTypeEnum.STASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CraftScreenTypeEnum.PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CraftScreenTypeEnum.CRAFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CraftElementStatusEnum.values().length];
            try {
                iArr2[CraftElementStatusEnum.NEW_ELEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CraftElementStatusEnum.IN_THE_PIPELINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CraftElementStatusEnum.IN_THE_QUEUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Inject
    public CraftViewModel(@NotNull CraftActionWithJSON actionWithJSON, @NotNull StringResource stringResources, @NotNull Application application, @NotNull LocalNotification localNotification, @NotNull PreferencesRepository preferencesRepository) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(stringResources, "stringResources");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.actionWithJSON = actionWithJSON;
        this.stringResources = stringResources;
        this.application = application;
        this.localNotification = localNotification;
        this.preferencesRepository = preferencesRepository;
        this._uiState = StateFlowKt.MutableStateFlow(new CraftUiState(null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, null, null, null, null, false, false, false, false, false, false, false, null, null, null, null, null, null, null, 0, 0, false, null, false, null, false, -1, 1023, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends CraftUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<CraftUiState> getUiState() {
        return this.uiState;
    }

    public final void initJson(@NotNull JSONObject json, @NotNull List<CraftJsonItem> listOfCraftItems, float vipProbAdd, @NotNull List<CraftJsonItemCategory> craftCategoriesModel, @NotNull List<CraftJsonCategoryFilter> craftCategoriesFilterModel) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(listOfCraftItems, "listOfCraftItems");
        Intrinsics.checkNotNullParameter(craftCategoriesModel, "craftCategoriesModel");
        Intrinsics.checkNotNullParameter(craftCategoriesFilterModel, "craftCategoriesFilterModel");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new CraftViewModel$initJson$1(json, listOfCraftItems, this, craftCategoriesFilterModel, craftCategoriesModel, vipProbAdd, null), 1, null);
    }

    public final void updateJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new CraftViewModel$updateJson$1(json, this, null), 1, null);
    }

    public final List<CraftElement> getLevelUpElementsList(int levelOfSkill) {
        Map<Integer, List<CraftElement>> mapOfCraftElements = get_uiState().getValue().getMapOfCraftElements();
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Integer, List<CraftElement>>> it = mapOfCraftElements.entrySet().iterator();
        while (it.hasNext()) {
            List<CraftElement> value = it.next().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : value) {
                if (((CraftElement) obj).getElementRarity().getValue() == levelOfSkill) {
                    arrayList2.add(obj);
                }
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, CollectionsKt___CollectionsKt.sortedWith(arrayList2, ComparisonsKt__ComparisonsKt.compareBy(new Function1<CraftElement, Comparable<?>>() { // from class: com.blackhub.bronline.game.gui.craft.CraftViewModel$getLevelUpElementsList$1$2
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Comparable<?> invoke(@NotNull CraftElement it2) {
                    Intrinsics.checkNotNullParameter(it2, "it");
                    return Integer.valueOf(it2.getItemCategory());
                }
            }, new Function1<CraftElement, Comparable<?>>() { // from class: com.blackhub.bronline.game.gui.craft.CraftViewModel$getLevelUpElementsList$1$3
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Comparable<?> invoke(@NotNull CraftElement it2) {
                    Intrinsics.checkNotNullParameter(it2, "it");
                    return Integer.valueOf(it2.getElementId());
                }
            })));
        }
        return arrayList;
    }

    public final void onCategoryClick(@NotNull CommonButtonCategory category, int index) {
        Intrinsics.checkNotNullParameter(category, "category");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new CraftViewModel$onCategoryClick$1(this, index, category, null), 1, null);
    }

    public final void onArrowBottomClick() {
        int selectedCategoryIndex = getUiState().getValue().getSelectedCategoryIndex();
        List<CommonButtonCategory> categories = getUiState().getValue().getCategories();
        int i = selectedCategoryIndex + 1;
        if (i != categories.size()) {
            onCategoryClick(categories.get(i), i);
        }
    }

    public final void onArrowTopClick() {
        int selectedCategoryIndex = getUiState().getValue().getSelectedCategoryIndex();
        List<CommonButtonCategory> categories = getUiState().getValue().getCategories();
        int i = selectedCategoryIndex - 1;
        if (i >= 0) {
            onCategoryClick(categories.get(i), i);
        }
    }

    public final void showOrHideFilter() {
        CraftUiState value;
        CraftUiState copy;
        MutableStateFlow<? extends CraftUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r60 & 1) != 0 ? r2.currentScreen : null, (r60 & 2) != 0 ? r2.craftScreenTypeObject : null, (r60 & 4) != 0 ? r2.craftItemTextBlock : null, (r60 & 8) != 0 ? r2.craftIconAlarmText : null, (r60 & 16) != 0 ? r2.stashIconAlarmText : null, (r60 & 32) != 0 ? r2.progressIconAlarmText : null, (r60 & 64) != 0 ? r2.workbenchLevel : 0, (r60 & 128) != 0 ? r2.levelOfSkill : 0, (r60 & 256) != 0 ? r2.percentOfSkill : 0, (r60 & 512) != 0 ? r2.quantityInQueue : 0, (r60 & 1024) != 0 ? r2.queueMax : 0, (r60 & 2048) != 0 ? r2.quantityInStorage : 0, (r60 & 4096) != 0 ? r2.storageMax : 0, (r60 & 8192) != 0 ? r2.isPlayerHasVip : false, (r60 & 16384) != 0 ? r2.quantityOfNewItemsInStorage : 0, (r60 & 32768) != 0 ? r2.mapOfCraftElements : null, (r60 & 65536) != 0 ? r2.listWithStorageItems : null, (r60 & 131072) != 0 ? r2.listWithProductionItems : null, (r60 & 262144) != 0 ? r2.listOfLevelUpElements : null, (r60 & 524288) != 0 ? r2.backgroundImage : null, (r60 & 1048576) != 0 ? r2.buttonAnimatedAttachment : null, (r60 & 2097152) != 0 ? r2.isNeedToShowFilter : !r2.isNeedToShowFilter(), (r60 & 4194304) != 0 ? r2.isNeedToShowTutorial : false, (r60 & 8388608) != 0 ? r2.isNeedToShowHints : false, (r60 & 16777216) != 0 ? r2.isNeedToShowLevelUpDialog : false, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.isNeedToShowSplit : false, (r60 & 67108864) != 0 ? r2.isNeedClose : false, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isWithIndicationFilter : false, (r60 & 268435456) != 0 ? r2.selectedElement : null, (r60 & 536870912) != 0 ? r2.allElementsForCraftAfterFilter : null, (r60 & 1073741824) != 0 ? r2.categories : null, (r60 & Integer.MIN_VALUE) != 0 ? r2.selectedCategory : null, (r61 & 1) != 0 ? r2.filterList : null, (r61 & 2) != 0 ? r2.buttonWithLineText : null, (r61 & 4) != 0 ? r2.craftingControlInfo : null, (r61 & 8) != 0 ? r2.valueOfRubles : 0, (r61 & 16) != 0 ? r2.selectedCategoryIndex : 0, (r61 & 32) != 0 ? r2.isNeedToShowDialogConfirmation : false, (r61 & 64) != 0 ? r2.dialogConfirmationAttachment : null, (r61 & 128) != 0 ? r2.isNeedToShowForcedTutorial : false, (r61 & 256) != 0 ? r2.forcedTutorialAttachment : null, (r61 & 512) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onInfoButtonClicked() {
        CraftUiState value;
        CraftUiState copy;
        MutableStateFlow<? extends CraftUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r60 & 1) != 0 ? r2.currentScreen : null, (r60 & 2) != 0 ? r2.craftScreenTypeObject : null, (r60 & 4) != 0 ? r2.craftItemTextBlock : null, (r60 & 8) != 0 ? r2.craftIconAlarmText : null, (r60 & 16) != 0 ? r2.stashIconAlarmText : null, (r60 & 32) != 0 ? r2.progressIconAlarmText : null, (r60 & 64) != 0 ? r2.workbenchLevel : 0, (r60 & 128) != 0 ? r2.levelOfSkill : 0, (r60 & 256) != 0 ? r2.percentOfSkill : 0, (r60 & 512) != 0 ? r2.quantityInQueue : 0, (r60 & 1024) != 0 ? r2.queueMax : 0, (r60 & 2048) != 0 ? r2.quantityInStorage : 0, (r60 & 4096) != 0 ? r2.storageMax : 0, (r60 & 8192) != 0 ? r2.isPlayerHasVip : false, (r60 & 16384) != 0 ? r2.quantityOfNewItemsInStorage : 0, (r60 & 32768) != 0 ? r2.mapOfCraftElements : null, (r60 & 65536) != 0 ? r2.listWithStorageItems : null, (r60 & 131072) != 0 ? r2.listWithProductionItems : null, (r60 & 262144) != 0 ? r2.listOfLevelUpElements : null, (r60 & 524288) != 0 ? r2.backgroundImage : null, (r60 & 1048576) != 0 ? r2.buttonAnimatedAttachment : null, (r60 & 2097152) != 0 ? r2.isNeedToShowFilter : false, (r60 & 4194304) != 0 ? r2.isNeedToShowTutorial : false, (r60 & 8388608) != 0 ? r2.isNeedToShowHints : true, (r60 & 16777216) != 0 ? r2.isNeedToShowLevelUpDialog : false, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.isNeedToShowSplit : false, (r60 & 67108864) != 0 ? r2.isNeedClose : false, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isWithIndicationFilter : false, (r60 & 268435456) != 0 ? r2.selectedElement : null, (r60 & 536870912) != 0 ? r2.allElementsForCraftAfterFilter : null, (r60 & 1073741824) != 0 ? r2.categories : null, (r60 & Integer.MIN_VALUE) != 0 ? r2.selectedCategory : null, (r61 & 1) != 0 ? r2.filterList : null, (r61 & 2) != 0 ? r2.buttonWithLineText : null, (r61 & 4) != 0 ? r2.craftingControlInfo : null, (r61 & 8) != 0 ? r2.valueOfRubles : 0, (r61 & 16) != 0 ? r2.selectedCategoryIndex : 0, (r61 & 32) != 0 ? r2.isNeedToShowDialogConfirmation : false, (r61 & 64) != 0 ? r2.dialogConfirmationAttachment : null, (r61 & 128) != 0 ? r2.isNeedToShowForcedTutorial : false, (r61 & 256) != 0 ? r2.forcedTutorialAttachment : null, (r61 & 512) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onCloseHintsClick() {
        CraftUiState value;
        CraftUiState copy;
        MutableStateFlow<? extends CraftUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r60 & 1) != 0 ? r2.currentScreen : null, (r60 & 2) != 0 ? r2.craftScreenTypeObject : null, (r60 & 4) != 0 ? r2.craftItemTextBlock : null, (r60 & 8) != 0 ? r2.craftIconAlarmText : null, (r60 & 16) != 0 ? r2.stashIconAlarmText : null, (r60 & 32) != 0 ? r2.progressIconAlarmText : null, (r60 & 64) != 0 ? r2.workbenchLevel : 0, (r60 & 128) != 0 ? r2.levelOfSkill : 0, (r60 & 256) != 0 ? r2.percentOfSkill : 0, (r60 & 512) != 0 ? r2.quantityInQueue : 0, (r60 & 1024) != 0 ? r2.queueMax : 0, (r60 & 2048) != 0 ? r2.quantityInStorage : 0, (r60 & 4096) != 0 ? r2.storageMax : 0, (r60 & 8192) != 0 ? r2.isPlayerHasVip : false, (r60 & 16384) != 0 ? r2.quantityOfNewItemsInStorage : 0, (r60 & 32768) != 0 ? r2.mapOfCraftElements : null, (r60 & 65536) != 0 ? r2.listWithStorageItems : null, (r60 & 131072) != 0 ? r2.listWithProductionItems : null, (r60 & 262144) != 0 ? r2.listOfLevelUpElements : null, (r60 & 524288) != 0 ? r2.backgroundImage : null, (r60 & 1048576) != 0 ? r2.buttonAnimatedAttachment : null, (r60 & 2097152) != 0 ? r2.isNeedToShowFilter : false, (r60 & 4194304) != 0 ? r2.isNeedToShowTutorial : false, (r60 & 8388608) != 0 ? r2.isNeedToShowHints : false, (r60 & 16777216) != 0 ? r2.isNeedToShowLevelUpDialog : false, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.isNeedToShowSplit : false, (r60 & 67108864) != 0 ? r2.isNeedClose : false, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isWithIndicationFilter : false, (r60 & 268435456) != 0 ? r2.selectedElement : null, (r60 & 536870912) != 0 ? r2.allElementsForCraftAfterFilter : null, (r60 & 1073741824) != 0 ? r2.categories : null, (r60 & Integer.MIN_VALUE) != 0 ? r2.selectedCategory : null, (r61 & 1) != 0 ? r2.filterList : null, (r61 & 2) != 0 ? r2.buttonWithLineText : null, (r61 & 4) != 0 ? r2.craftingControlInfo : null, (r61 & 8) != 0 ? r2.valueOfRubles : 0, (r61 & 16) != 0 ? r2.selectedCategoryIndex : 0, (r61 & 32) != 0 ? r2.isNeedToShowDialogConfirmation : false, (r61 & 64) != 0 ? r2.dialogConfirmationAttachment : null, (r61 & 128) != 0 ? r2.isNeedToShowForcedTutorial : false, (r61 & 256) != 0 ? r2.forcedTutorialAttachment : null, (r61 & 512) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onCloseLevelUpDialog() {
        CraftUiState value;
        CraftUiState copy;
        MutableStateFlow<? extends CraftUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r60 & 1) != 0 ? r2.currentScreen : null, (r60 & 2) != 0 ? r2.craftScreenTypeObject : null, (r60 & 4) != 0 ? r2.craftItemTextBlock : null, (r60 & 8) != 0 ? r2.craftIconAlarmText : null, (r60 & 16) != 0 ? r2.stashIconAlarmText : null, (r60 & 32) != 0 ? r2.progressIconAlarmText : null, (r60 & 64) != 0 ? r2.workbenchLevel : 0, (r60 & 128) != 0 ? r2.levelOfSkill : 0, (r60 & 256) != 0 ? r2.percentOfSkill : 0, (r60 & 512) != 0 ? r2.quantityInQueue : 0, (r60 & 1024) != 0 ? r2.queueMax : 0, (r60 & 2048) != 0 ? r2.quantityInStorage : 0, (r60 & 4096) != 0 ? r2.storageMax : 0, (r60 & 8192) != 0 ? r2.isPlayerHasVip : false, (r60 & 16384) != 0 ? r2.quantityOfNewItemsInStorage : 0, (r60 & 32768) != 0 ? r2.mapOfCraftElements : null, (r60 & 65536) != 0 ? r2.listWithStorageItems : null, (r60 & 131072) != 0 ? r2.listWithProductionItems : null, (r60 & 262144) != 0 ? r2.listOfLevelUpElements : null, (r60 & 524288) != 0 ? r2.backgroundImage : null, (r60 & 1048576) != 0 ? r2.buttonAnimatedAttachment : null, (r60 & 2097152) != 0 ? r2.isNeedToShowFilter : false, (r60 & 4194304) != 0 ? r2.isNeedToShowTutorial : false, (r60 & 8388608) != 0 ? r2.isNeedToShowHints : false, (r60 & 16777216) != 0 ? r2.isNeedToShowLevelUpDialog : false, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.isNeedToShowSplit : false, (r60 & 67108864) != 0 ? r2.isNeedClose : false, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isWithIndicationFilter : false, (r60 & 268435456) != 0 ? r2.selectedElement : null, (r60 & 536870912) != 0 ? r2.allElementsForCraftAfterFilter : null, (r60 & 1073741824) != 0 ? r2.categories : null, (r60 & Integer.MIN_VALUE) != 0 ? r2.selectedCategory : null, (r61 & 1) != 0 ? r2.filterList : null, (r61 & 2) != 0 ? r2.buttonWithLineText : null, (r61 & 4) != 0 ? r2.craftingControlInfo : null, (r61 & 8) != 0 ? r2.valueOfRubles : 0, (r61 & 16) != 0 ? r2.selectedCategoryIndex : 0, (r61 & 32) != 0 ? r2.isNeedToShowDialogConfirmation : false, (r61 & 64) != 0 ? r2.dialogConfirmationAttachment : null, (r61 & 128) != 0 ? r2.isNeedToShowForcedTutorial : false, (r61 & 256) != 0 ? r2.forcedTutorialAttachment : null, (r61 & 512) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public static /* synthetic */ void onButtonCraftClick$default(CraftViewModel craftViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = !craftViewModel.get_uiState().getValue().getButtonAnimatedAttachment().isButtonsExpanded();
        }
        craftViewModel.onButtonCraftClick(z);
    }

    public final void onButtonCraftClick(boolean isButtonsExpanded) {
        CraftUiState value;
        CraftUiState copy;
        ButtonAnimatedAttachment copy$default = ButtonAnimatedAttachment.copy$default(get_uiState().getValue().getButtonAnimatedAttachment(), isButtonsExpanded, false, false, 6, null);
        if (getUiState().getValue().getCurrentScreen() != CraftScreenTypeEnum.CRAFT) {
            ViewModelExtensionKt.launchOnDefault$default(this, null, new CraftViewModel$onButtonCraftClick$1(this, copy$default, null), 1, null);
            return;
        }
        MutableStateFlow<? extends CraftUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r8.copy((r60 & 1) != 0 ? r8.currentScreen : null, (r60 & 2) != 0 ? r8.craftScreenTypeObject : null, (r60 & 4) != 0 ? r8.craftItemTextBlock : null, (r60 & 8) != 0 ? r8.craftIconAlarmText : null, (r60 & 16) != 0 ? r8.stashIconAlarmText : null, (r60 & 32) != 0 ? r8.progressIconAlarmText : null, (r60 & 64) != 0 ? r8.workbenchLevel : 0, (r60 & 128) != 0 ? r8.levelOfSkill : 0, (r60 & 256) != 0 ? r8.percentOfSkill : 0, (r60 & 512) != 0 ? r8.quantityInQueue : 0, (r60 & 1024) != 0 ? r8.queueMax : 0, (r60 & 2048) != 0 ? r8.quantityInStorage : 0, (r60 & 4096) != 0 ? r8.storageMax : 0, (r60 & 8192) != 0 ? r8.isPlayerHasVip : false, (r60 & 16384) != 0 ? r8.quantityOfNewItemsInStorage : 0, (r60 & 32768) != 0 ? r8.mapOfCraftElements : null, (r60 & 65536) != 0 ? r8.listWithStorageItems : null, (r60 & 131072) != 0 ? r8.listWithProductionItems : null, (r60 & 262144) != 0 ? r8.listOfLevelUpElements : null, (r60 & 524288) != 0 ? r8.backgroundImage : null, (r60 & 1048576) != 0 ? r8.buttonAnimatedAttachment : copy$default, (r60 & 2097152) != 0 ? r8.isNeedToShowFilter : false, (r60 & 4194304) != 0 ? r8.isNeedToShowTutorial : false, (r60 & 8388608) != 0 ? r8.isNeedToShowHints : false, (r60 & 16777216) != 0 ? r8.isNeedToShowLevelUpDialog : false, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r8.isNeedToShowSplit : false, (r60 & 67108864) != 0 ? r8.isNeedClose : false, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r8.isWithIndicationFilter : false, (r60 & 268435456) != 0 ? r8.selectedElement : null, (r60 & 536870912) != 0 ? r8.allElementsForCraftAfterFilter : null, (r60 & 1073741824) != 0 ? r8.categories : null, (r60 & Integer.MIN_VALUE) != 0 ? r8.selectedCategory : null, (r61 & 1) != 0 ? r8.filterList : null, (r61 & 2) != 0 ? r8.buttonWithLineText : null, (r61 & 4) != 0 ? r8.craftingControlInfo : null, (r61 & 8) != 0 ? r8.valueOfRubles : 0, (r61 & 16) != 0 ? r8.selectedCategoryIndex : 0, (r61 & 32) != 0 ? r8.isNeedToShowDialogConfirmation : false, (r61 & 64) != 0 ? r8.dialogConfirmationAttachment : null, (r61 & 128) != 0 ? r8.isNeedToShowForcedTutorial : false, (r61 & 256) != 0 ? r8.forcedTutorialAttachment : null, (r61 & 512) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onButtonStashClick() {
        CraftUiState value;
        CraftUiState copy;
        ButtonAnimatedAttachment copy$default = ButtonAnimatedAttachment.copy$default(get_uiState().getValue().getButtonAnimatedAttachment(), !get_uiState().getValue().getButtonAnimatedAttachment().isButtonsExpanded(), false, false, 6, null);
        if (getUiState().getValue().getCurrentScreen() != CraftScreenTypeEnum.STASH) {
            ViewModelExtensionKt.launchOnIO$default(this, null, new CraftViewModel$onButtonStashClick$1(this, copy$default, null), 1, null);
            return;
        }
        MutableStateFlow<? extends CraftUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r9.copy((r60 & 1) != 0 ? r9.currentScreen : null, (r60 & 2) != 0 ? r9.craftScreenTypeObject : null, (r60 & 4) != 0 ? r9.craftItemTextBlock : null, (r60 & 8) != 0 ? r9.craftIconAlarmText : null, (r60 & 16) != 0 ? r9.stashIconAlarmText : null, (r60 & 32) != 0 ? r9.progressIconAlarmText : null, (r60 & 64) != 0 ? r9.workbenchLevel : 0, (r60 & 128) != 0 ? r9.levelOfSkill : 0, (r60 & 256) != 0 ? r9.percentOfSkill : 0, (r60 & 512) != 0 ? r9.quantityInQueue : 0, (r60 & 1024) != 0 ? r9.queueMax : 0, (r60 & 2048) != 0 ? r9.quantityInStorage : 0, (r60 & 4096) != 0 ? r9.storageMax : 0, (r60 & 8192) != 0 ? r9.isPlayerHasVip : false, (r60 & 16384) != 0 ? r9.quantityOfNewItemsInStorage : 0, (r60 & 32768) != 0 ? r9.mapOfCraftElements : null, (r60 & 65536) != 0 ? r9.listWithStorageItems : null, (r60 & 131072) != 0 ? r9.listWithProductionItems : null, (r60 & 262144) != 0 ? r9.listOfLevelUpElements : null, (r60 & 524288) != 0 ? r9.backgroundImage : null, (r60 & 1048576) != 0 ? r9.buttonAnimatedAttachment : copy$default, (r60 & 2097152) != 0 ? r9.isNeedToShowFilter : false, (r60 & 4194304) != 0 ? r9.isNeedToShowTutorial : false, (r60 & 8388608) != 0 ? r9.isNeedToShowHints : false, (r60 & 16777216) != 0 ? r9.isNeedToShowLevelUpDialog : false, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r9.isNeedToShowSplit : false, (r60 & 67108864) != 0 ? r9.isNeedClose : false, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r9.isWithIndicationFilter : false, (r60 & 268435456) != 0 ? r9.selectedElement : null, (r60 & 536870912) != 0 ? r9.allElementsForCraftAfterFilter : null, (r60 & 1073741824) != 0 ? r9.categories : null, (r60 & Integer.MIN_VALUE) != 0 ? r9.selectedCategory : null, (r61 & 1) != 0 ? r9.filterList : null, (r61 & 2) != 0 ? r9.buttonWithLineText : null, (r61 & 4) != 0 ? r9.craftingControlInfo : null, (r61 & 8) != 0 ? r9.valueOfRubles : 0, (r61 & 16) != 0 ? r9.selectedCategoryIndex : 0, (r61 & 32) != 0 ? r9.isNeedToShowDialogConfirmation : false, (r61 & 64) != 0 ? r9.dialogConfirmationAttachment : null, (r61 & 128) != 0 ? r9.isNeedToShowForcedTutorial : false, (r61 & 256) != 0 ? r9.forcedTutorialAttachment : null, (r61 & 512) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onButtonProgressClick() {
        CraftUiState value;
        CraftUiState copy;
        ButtonAnimatedAttachment copy$default = ButtonAnimatedAttachment.copy$default(get_uiState().getValue().getButtonAnimatedAttachment(), !get_uiState().getValue().getButtonAnimatedAttachment().isButtonsExpanded(), false, false, 6, null);
        if (getUiState().getValue().getCurrentScreen() != CraftScreenTypeEnum.PROGRESS) {
            ViewModelExtensionKt.launchOnIO$default(this, null, new CraftViewModel$onButtonProgressClick$1(this, copy$default, null), 1, null);
            return;
        }
        MutableStateFlow<? extends CraftUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r9.copy((r60 & 1) != 0 ? r9.currentScreen : null, (r60 & 2) != 0 ? r9.craftScreenTypeObject : null, (r60 & 4) != 0 ? r9.craftItemTextBlock : null, (r60 & 8) != 0 ? r9.craftIconAlarmText : null, (r60 & 16) != 0 ? r9.stashIconAlarmText : null, (r60 & 32) != 0 ? r9.progressIconAlarmText : null, (r60 & 64) != 0 ? r9.workbenchLevel : 0, (r60 & 128) != 0 ? r9.levelOfSkill : 0, (r60 & 256) != 0 ? r9.percentOfSkill : 0, (r60 & 512) != 0 ? r9.quantityInQueue : 0, (r60 & 1024) != 0 ? r9.queueMax : 0, (r60 & 2048) != 0 ? r9.quantityInStorage : 0, (r60 & 4096) != 0 ? r9.storageMax : 0, (r60 & 8192) != 0 ? r9.isPlayerHasVip : false, (r60 & 16384) != 0 ? r9.quantityOfNewItemsInStorage : 0, (r60 & 32768) != 0 ? r9.mapOfCraftElements : null, (r60 & 65536) != 0 ? r9.listWithStorageItems : null, (r60 & 131072) != 0 ? r9.listWithProductionItems : null, (r60 & 262144) != 0 ? r9.listOfLevelUpElements : null, (r60 & 524288) != 0 ? r9.backgroundImage : null, (r60 & 1048576) != 0 ? r9.buttonAnimatedAttachment : copy$default, (r60 & 2097152) != 0 ? r9.isNeedToShowFilter : false, (r60 & 4194304) != 0 ? r9.isNeedToShowTutorial : false, (r60 & 8388608) != 0 ? r9.isNeedToShowHints : false, (r60 & 16777216) != 0 ? r9.isNeedToShowLevelUpDialog : false, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r9.isNeedToShowSplit : false, (r60 & 67108864) != 0 ? r9.isNeedClose : false, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r9.isWithIndicationFilter : false, (r60 & 268435456) != 0 ? r9.selectedElement : null, (r60 & 536870912) != 0 ? r9.allElementsForCraftAfterFilter : null, (r60 & 1073741824) != 0 ? r9.categories : null, (r60 & Integer.MIN_VALUE) != 0 ? r9.selectedCategory : null, (r61 & 1) != 0 ? r9.filterList : null, (r61 & 2) != 0 ? r9.buttonWithLineText : null, (r61 & 4) != 0 ? r9.craftingControlInfo : null, (r61 & 8) != 0 ? r9.valueOfRubles : 0, (r61 & 16) != 0 ? r9.selectedCategoryIndex : 0, (r61 & 32) != 0 ? r9.isNeedToShowDialogConfirmation : false, (r61 & 64) != 0 ? r9.dialogConfirmationAttachment : null, (r61 & 128) != 0 ? r9.isNeedToShowForcedTutorial : false, (r61 & 256) != 0 ? r9.forcedTutorialAttachment : null, (r61 & 512) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void sendCloseScreen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new CraftViewModel$sendCloseScreen$1(this, null), 1, null);
    }

    public final void selectCraftElement(@NotNull CraftElement element) {
        ArrayList arrayList;
        CraftIngredient copy;
        CraftElement copy2;
        boolean z;
        int i;
        int i2;
        CraftUiState value;
        CraftUiState copy3;
        boolean z2;
        boolean z3;
        ArrayList arrayList2;
        int elementId;
        CraftIngredient copy4;
        CraftIngredient copy5;
        Intrinsics.checkNotNullParameter(element, "element");
        returnToDefaultValueOldSelectedElement();
        CraftScreenTypeEnum currentScreen = getUiState().getValue().getCurrentScreen();
        List<CommonButtonCategory> categories = getUiState().getValue().getCategories();
        CommonButtonCategory selectedCategory = getUiState().getValue().getSelectedCategory();
        if (getUiState().getValue().getMapOfCraftElements().get(Integer.valueOf(getUiState().getValue().getSelectedCategory().getCategoryId())) == null) {
            CollectionsKt__CollectionsKt.emptyList();
        }
        Map<Integer, List<CraftElement>> mapOfCraftElements = getUiState().getValue().getMapOfCraftElements();
        List<CraftElement> listWithStorageItems = getUiState().getValue().getListWithStorageItems();
        List<CraftElement> allElementsForCraftAfterFilter = getUiState().getValue().getAllElementsForCraftAfterFilter();
        ButtonAnimatedAttachment buttonAnimatedAttachment = getUiState().getValue().getButtonAnimatedAttachment();
        int i3 = WhenMappings.$EnumSwitchMapping$0[currentScreen.ordinal()];
        if (i3 == 1) {
            List<CraftIngredient> componentsList = element.getComponentsList();
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(componentsList, 10));
            Iterator<T> it = componentsList.iterator();
            while (it.hasNext()) {
                copy = r27.copy((r24 & 1) != 0 ? r27.id : 0, (r24 & 2) != 0 ? r27.rarity : null, (r24 & 4) != 0 ? r27.name : null, (r24 & 8) != 0 ? r27.description : null, (r24 & 16) != 0 ? r27.imageName : null, (r24 & 32) != 0 ? r27.imageType : 0, (r24 & 64) != 0 ? r27.count : 0, (r24 & 128) != 0 ? r27.quantityNeeded : 0, (r24 & 256) != 0 ? r27.quantityInStock : 0, (r24 & 512) != 0 ? r27.isInWork : false, (r24 & 1024) != 0 ? ((CraftIngredient) it.next()).isInStorage : true);
                arrayList.add(copy);
            }
        } else if (i3 == 2) {
            List<CraftIngredient> componentsList2 = element.getComponentsList();
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(componentsList2, 10));
            Iterator<T> it2 = componentsList2.iterator();
            while (it2.hasNext()) {
                copy4 = r27.copy((r24 & 1) != 0 ? r27.id : 0, (r24 & 2) != 0 ? r27.rarity : null, (r24 & 4) != 0 ? r27.name : null, (r24 & 8) != 0 ? r27.description : null, (r24 & 16) != 0 ? r27.imageName : null, (r24 & 32) != 0 ? r27.imageType : 0, (r24 & 64) != 0 ? r27.count : 0, (r24 & 128) != 0 ? r27.quantityNeeded : 0, (r24 & 256) != 0 ? r27.quantityInStock : 0, (r24 & 512) != 0 ? r27.isInWork : true, (r24 & 1024) != 0 ? ((CraftIngredient) it2.next()).isInStorage : false);
                arrayList.add(copy4);
            }
        } else {
            List<CraftIngredient> componentsList3 = element.getComponentsList();
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(componentsList3, 10));
            Iterator<T> it3 = componentsList3.iterator();
            while (it3.hasNext()) {
                copy5 = r27.copy((r24 & 1) != 0 ? r27.id : 0, (r24 & 2) != 0 ? r27.rarity : null, (r24 & 4) != 0 ? r27.name : null, (r24 & 8) != 0 ? r27.description : null, (r24 & 16) != 0 ? r27.imageName : null, (r24 & 32) != 0 ? r27.imageType : 0, (r24 & 64) != 0 ? r27.count : 0, (r24 & 128) != 0 ? r27.quantityNeeded : 0, (r24 & 256) != 0 ? r27.quantityInStock : 0, (r24 & 512) != 0 ? r27.isInWork : false, (r24 & 1024) != 0 ? ((CraftIngredient) it3.next()).isInStorage : false);
                arrayList.add(copy5);
            }
        }
        ArrayList arrayList3 = arrayList;
        if (WhenMappings.$EnumSwitchMapping$1[element.getElementState().ordinal()] == 1) {
            List<CraftIngredient> componentsList4 = element.getComponentsList();
            int size = componentsList4.size();
            int i4 = 0;
            while (true) {
                if (i4 < size) {
                    if (!componentsList4.get(i4).isEnough()) {
                        break;
                    } else {
                        i4++;
                    }
                } else if (currentScreen == CraftScreenTypeEnum.CRAFT) {
                    copy2 = element.copy((r34 & 1) != 0 ? element.elementId : 0, (r34 & 2) != 0 ? element.serverId : 0, (r34 & 4) != 0 ? element.imageName : null, (r34 & 8) != 0 ? element.imageType : 0, (r34 & 16) != 0 ? element.timeUntilItemPreparation : 0, (r34 & 32) != 0 ? element.preparationTime : 0, (r34 & 64) != 0 ? element.timeWhenElementCreated : null, (r34 & 128) != 0 ? element.elementRarity : null, (r34 & 256) != 0 ? element.elementState : CraftElementStatusEnum.AVAILABLE_FOR_CRAFTING, (r34 & 512) != 0 ? element.valueOfPipeline : 0, (r34 & 1024) != 0 ? element.textBlock : null, (r34 & 2048) != 0 ? element.componentsList : arrayList3, (r34 & 4096) != 0 ? element.valueOfPercent : 0, (r34 & 8192) != 0 ? element.valueOfTimer : null, (r34 & 16384) != 0 ? element.craftingCost : 0, (r34 & 32768) != 0 ? element.itemCategory : 0);
                }
            }
            copy2 = element.copy((r34 & 1) != 0 ? element.elementId : 0, (r34 & 2) != 0 ? element.serverId : 0, (r34 & 4) != 0 ? element.imageName : null, (r34 & 8) != 0 ? element.imageType : 0, (r34 & 16) != 0 ? element.timeUntilItemPreparation : 0, (r34 & 32) != 0 ? element.preparationTime : 0, (r34 & 64) != 0 ? element.timeWhenElementCreated : null, (r34 & 128) != 0 ? element.elementRarity : null, (r34 & 256) != 0 ? element.elementState : CraftElementStatusEnum.DEFAULT, (r34 & 512) != 0 ? element.valueOfPipeline : 0, (r34 & 1024) != 0 ? element.textBlock : null, (r34 & 2048) != 0 ? element.componentsList : arrayList3, (r34 & 4096) != 0 ? element.valueOfPercent : 0, (r34 & 8192) != 0 ? element.valueOfTimer : null, (r34 & 16384) != 0 ? element.craftingCost : 0, (r34 & 32768) != 0 ? element.itemCategory : 0);
            CraftScreenTypeEnum craftScreenTypeEnum = CraftScreenTypeEnum.STASH;
            int i5 = currentScreen == craftScreenTypeEnum ? 7 : 2;
            if (currentScreen == craftScreenTypeEnum) {
                elementId = copy2.getServerId();
            } else {
                elementId = copy2.getElementId();
            }
            this.actionWithJSON.sendNewItemPressed(i5, elementId);
            z = true;
        } else {
            copy2 = element.copy((r34 & 1) != 0 ? element.elementId : 0, (r34 & 2) != 0 ? element.serverId : 0, (r34 & 4) != 0 ? element.imageName : null, (r34 & 8) != 0 ? element.imageType : 0, (r34 & 16) != 0 ? element.timeUntilItemPreparation : 0, (r34 & 32) != 0 ? element.preparationTime : 0, (r34 & 64) != 0 ? element.timeWhenElementCreated : null, (r34 & 128) != 0 ? element.elementRarity : null, (r34 & 256) != 0 ? element.elementState : null, (r34 & 512) != 0 ? element.valueOfPipeline : 0, (r34 & 1024) != 0 ? element.textBlock : null, (r34 & 2048) != 0 ? element.componentsList : arrayList3, (r34 & 4096) != 0 ? element.valueOfPercent : 0, (r34 & 8192) != 0 ? element.valueOfTimer : null, (r34 & 16384) != 0 ? element.craftingCost : 0, (r34 & 32768) != 0 ? element.itemCategory : 0);
            z = false;
        }
        int valueOfRubles = get_uiState().getValue().getValueOfRubles();
        int levelOfSkill = get_uiState().getValue().getLevelOfSkill();
        int workbenchLevel = getUiState().getValue().getWorkbenchLevel();
        boolean z4 = valueOfRubles >= copy2.getCraftingCost();
        boolean isEnoughResources = element.isEnoughResources();
        int value2 = element.getElementRarity().getValue();
        boolean z5 = levelOfSkill < value2;
        boolean z6 = workbenchLevel < value2;
        CraftScreenTypeEnum currentScreen2 = getUiState().getValue().getCurrentScreen();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i6 = iArr[currentScreen2.ordinal()];
        if (i6 != 1) {
            i = 2;
            if (i6 == 2) {
                int i7 = WhenMappings.$EnumSwitchMapping$1[copy2.getElementState().ordinal()];
                i2 = i7 != 2 ? i7 != 3 ? 0 : 4 : 3;
            } else {
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 1;
            }
        } else {
            i = 2;
            i2 = 2;
        }
        Object obj = null;
        CraftCraftingControl copy6 = get_uiState().getValue().getCraftingControlInfo().copy(i2, 1, 10, copy2.getTextBlock().getWeight(), String.valueOf(copy2.getCraftingCost()), copy2.getTimeUntilItemPreparation(), z4, isEnoughResources, z5, z6, z4 && isEnoughResources && !z5 && !z6, getTextQuantityColor$default(this, copy2, 0, i, null));
        if (z) {
            int i8 = iArr[currentScreen.ordinal()];
            if (i8 == 1) {
                List<CraftElement> allElementsForCraftAfterFilter2 = getUiState().getValue().getAllElementsForCraftAfterFilter();
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(allElementsForCraftAfterFilter2, 10));
                for (CraftElement craftElement : allElementsForCraftAfterFilter2) {
                    if (copy2.getServerId() == craftElement.getServerId()) {
                        craftElement = craftElement.copy((r34 & 1) != 0 ? craftElement.elementId : 0, (r34 & 2) != 0 ? craftElement.serverId : 0, (r34 & 4) != 0 ? craftElement.imageName : null, (r34 & 8) != 0 ? craftElement.imageType : 0, (r34 & 16) != 0 ? craftElement.timeUntilItemPreparation : 0, (r34 & 32) != 0 ? craftElement.preparationTime : 0, (r34 & 64) != 0 ? craftElement.timeWhenElementCreated : null, (r34 & 128) != 0 ? craftElement.elementRarity : null, (r34 & 256) != 0 ? craftElement.elementState : copy2.getElementState(), (r34 & 512) != 0 ? craftElement.valueOfPipeline : 0, (r34 & 1024) != 0 ? craftElement.textBlock : null, (r34 & 2048) != 0 ? craftElement.componentsList : null, (r34 & 4096) != 0 ? craftElement.valueOfPercent : 0, (r34 & 8192) != 0 ? craftElement.valueOfTimer : null, (r34 & 16384) != 0 ? craftElement.craftingCost : 0, (r34 & 32768) != 0 ? craftElement.itemCategory : 0);
                    }
                    arrayList4.add(craftElement);
                }
                List<CraftElement> listWithStorageItems2 = getUiState().getValue().getListWithStorageItems();
                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listWithStorageItems2, 10));
                for (CraftElement craftElement2 : listWithStorageItems2) {
                    if (craftElement2.getServerId() == copy2.getServerId()) {
                        craftElement2 = craftElement2.copy((r34 & 1) != 0 ? craftElement2.elementId : 0, (r34 & 2) != 0 ? craftElement2.serverId : 0, (r34 & 4) != 0 ? craftElement2.imageName : null, (r34 & 8) != 0 ? craftElement2.imageType : 0, (r34 & 16) != 0 ? craftElement2.timeUntilItemPreparation : 0, (r34 & 32) != 0 ? craftElement2.preparationTime : 0, (r34 & 64) != 0 ? craftElement2.timeWhenElementCreated : null, (r34 & 128) != 0 ? craftElement2.elementRarity : null, (r34 & 256) != 0 ? craftElement2.elementState : copy2.getElementState(), (r34 & 512) != 0 ? craftElement2.valueOfPipeline : 0, (r34 & 1024) != 0 ? craftElement2.textBlock : null, (r34 & 2048) != 0 ? craftElement2.componentsList : null, (r34 & 4096) != 0 ? craftElement2.valueOfPercent : 0, (r34 & 8192) != 0 ? craftElement2.valueOfTimer : null, (r34 & 16384) != 0 ? craftElement2.craftingCost : 0, (r34 & 32768) != 0 ? craftElement2.itemCategory : 0);
                    }
                    arrayList5.add(craftElement2);
                }
                if (!arrayList5.isEmpty()) {
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        if (((CraftElement) it4.next()).getElementState() == CraftElementStatusEnum.NEW_ELEMENT) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                buttonAnimatedAttachment = ButtonAnimatedAttachment.copy$default(getUiState().getValue().getButtonAnimatedAttachment(), false, false, z2, 3, null);
                allElementsForCraftAfterFilter = arrayList4;
                listWithStorageItems = arrayList5;
            } else if (i8 == 3) {
                List<CraftElement> allElementsForCraftAfterFilter3 = getUiState().getValue().getAllElementsForCraftAfterFilter();
                ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(allElementsForCraftAfterFilter3, 10));
                for (CraftElement craftElement3 : allElementsForCraftAfterFilter3) {
                    if (copy2.getElementId() == craftElement3.getElementId()) {
                        craftElement3 = craftElement3.copy((r34 & 1) != 0 ? craftElement3.elementId : 0, (r34 & 2) != 0 ? craftElement3.serverId : 0, (r34 & 4) != 0 ? craftElement3.imageName : null, (r34 & 8) != 0 ? craftElement3.imageType : 0, (r34 & 16) != 0 ? craftElement3.timeUntilItemPreparation : 0, (r34 & 32) != 0 ? craftElement3.preparationTime : 0, (r34 & 64) != 0 ? craftElement3.timeWhenElementCreated : null, (r34 & 128) != 0 ? craftElement3.elementRarity : null, (r34 & 256) != 0 ? craftElement3.elementState : copy2.getElementState(), (r34 & 512) != 0 ? craftElement3.valueOfPipeline : 0, (r34 & 1024) != 0 ? craftElement3.textBlock : null, (r34 & 2048) != 0 ? craftElement3.componentsList : null, (r34 & 4096) != 0 ? craftElement3.valueOfPercent : 0, (r34 & 8192) != 0 ? craftElement3.valueOfTimer : null, (r34 & 16384) != 0 ? craftElement3.craftingCost : 0, (r34 & 32768) != 0 ? craftElement3.itemCategory : 0);
                    }
                    arrayList6.add(craftElement3);
                }
                Map<Integer, List<CraftElement>> mapOfCraftElements2 = get_uiState().getValue().getMapOfCraftElements();
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(mapOfCraftElements2.size()));
                Iterator<T> it5 = mapOfCraftElements2.entrySet().iterator();
                while (it5.hasNext()) {
                    Map.Entry entry = (Map.Entry) it5.next();
                    Object key = entry.getKey();
                    Iterable<CraftElement> iterable = (Iterable) entry.getValue();
                    ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                    for (CraftElement craftElement4 : iterable) {
                        if (copy2.getElementId() == craftElement4.getElementId()) {
                            craftElement4 = craftElement4.copy((r34 & 1) != 0 ? craftElement4.elementId : 0, (r34 & 2) != 0 ? craftElement4.serverId : 0, (r34 & 4) != 0 ? craftElement4.imageName : null, (r34 & 8) != 0 ? craftElement4.imageType : 0, (r34 & 16) != 0 ? craftElement4.timeUntilItemPreparation : 0, (r34 & 32) != 0 ? craftElement4.preparationTime : 0, (r34 & 64) != 0 ? craftElement4.timeWhenElementCreated : null, (r34 & 128) != 0 ? craftElement4.elementRarity : null, (r34 & 256) != 0 ? craftElement4.elementState : copy2.getElementState(), (r34 & 512) != 0 ? craftElement4.valueOfPipeline : 0, (r34 & 1024) != 0 ? craftElement4.textBlock : null, (r34 & 2048) != 0 ? craftElement4.componentsList : null, (r34 & 4096) != 0 ? craftElement4.valueOfPercent : 0, (r34 & 8192) != 0 ? craftElement4.valueOfTimer : null, (r34 & 16384) != 0 ? craftElement4.craftingCost : 0, (r34 & 32768) != 0 ? craftElement4.itemCategory : 0);
                        }
                        arrayList7.add(craftElement4);
                    }
                    linkedHashMap.put(key, CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList7));
                }
                List list = (List) linkedHashMap.get(Integer.valueOf(selectedCategory.getCategoryId()));
                if (list != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            break;
                        }
                        Object previous = listIterator.previous();
                        if (((CraftElement) previous).getElementState() == CraftElementStatusEnum.NEW_ELEMENT) {
                            obj = previous;
                            break;
                        }
                    }
                    obj = (CraftElement) obj;
                }
                boolean isNotNull = AnyExtensionKt.isNotNull(obj);
                selectedCategory = CommonButtonCategory.copy$default(getUiState().getValue().getSelectedCategory(), 0, null, null, false, isNotNull, null, null, 111, null);
                List<CommonButtonCategory> categories2 = getUiState().getValue().getCategories();
                ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(categories2, 10));
                for (CommonButtonCategory commonButtonCategory : categories2) {
                    if (commonButtonCategory.getCategoryId() == selectedCategory.getCategoryId()) {
                        arrayList2 = arrayList8;
                        commonButtonCategory = CommonButtonCategory.copy$default(commonButtonCategory, 0, null, null, false, isNotNull, null, null, 111, null);
                    } else {
                        arrayList2 = arrayList8;
                    }
                    arrayList2.add(commonButtonCategory);
                    arrayList8 = arrayList2;
                }
                ArrayList arrayList9 = arrayList8;
                if (!arrayList9.isEmpty()) {
                    Iterator it6 = arrayList9.iterator();
                    while (it6.hasNext()) {
                        if (((CommonButtonCategory) it6.next()).getHasUpdates()) {
                            z3 = true;
                            break;
                        }
                    }
                }
                z3 = false;
                buttonAnimatedAttachment = ButtonAnimatedAttachment.copy$default(getUiState().getValue().getButtonAnimatedAttachment(), false, z3, false, 5, null);
                allElementsForCraftAfterFilter = arrayList6;
                categories = arrayList9;
                mapOfCraftElements = linkedHashMap;
            }
        }
        MutableStateFlow<? extends CraftUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy3 = r44.copy((r60 & 1) != 0 ? r44.currentScreen : null, (r60 & 2) != 0 ? r44.craftScreenTypeObject : null, (r60 & 4) != 0 ? r44.craftItemTextBlock : null, (r60 & 8) != 0 ? r44.craftIconAlarmText : null, (r60 & 16) != 0 ? r44.stashIconAlarmText : null, (r60 & 32) != 0 ? r44.progressIconAlarmText : null, (r60 & 64) != 0 ? r44.workbenchLevel : 0, (r60 & 128) != 0 ? r44.levelOfSkill : 0, (r60 & 256) != 0 ? r44.percentOfSkill : 0, (r60 & 512) != 0 ? r44.quantityInQueue : 0, (r60 & 1024) != 0 ? r44.queueMax : 0, (r60 & 2048) != 0 ? r44.quantityInStorage : 0, (r60 & 4096) != 0 ? r44.storageMax : 0, (r60 & 8192) != 0 ? r44.isPlayerHasVip : false, (r60 & 16384) != 0 ? r44.quantityOfNewItemsInStorage : 0, (r60 & 32768) != 0 ? r44.mapOfCraftElements : mapOfCraftElements, (r60 & 65536) != 0 ? r44.listWithStorageItems : listWithStorageItems, (r60 & 131072) != 0 ? r44.listWithProductionItems : null, (r60 & 262144) != 0 ? r44.listOfLevelUpElements : null, (r60 & 524288) != 0 ? r44.backgroundImage : null, (r60 & 1048576) != 0 ? r44.buttonAnimatedAttachment : buttonAnimatedAttachment, (r60 & 2097152) != 0 ? r44.isNeedToShowFilter : false, (r60 & 4194304) != 0 ? r44.isNeedToShowTutorial : false, (r60 & 8388608) != 0 ? r44.isNeedToShowHints : false, (r60 & 16777216) != 0 ? r44.isNeedToShowLevelUpDialog : false, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r44.isNeedToShowSplit : false, (r60 & 67108864) != 0 ? r44.isNeedClose : false, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r44.isWithIndicationFilter : false, (r60 & 268435456) != 0 ? r44.selectedElement : copy2, (r60 & 536870912) != 0 ? r44.allElementsForCraftAfterFilter : allElementsForCraftAfterFilter, (r60 & 1073741824) != 0 ? r44.categories : categories, (r60 & Integer.MIN_VALUE) != 0 ? r44.selectedCategory : selectedCategory, (r61 & 1) != 0 ? r44.filterList : null, (r61 & 2) != 0 ? r44.buttonWithLineText : null, (r61 & 4) != 0 ? r44.craftingControlInfo : copy6, (r61 & 8) != 0 ? r44.valueOfRubles : 0, (r61 & 16) != 0 ? r44.selectedCategoryIndex : 0, (r61 & 32) != 0 ? r44.isNeedToShowDialogConfirmation : false, (r61 & 64) != 0 ? r44.dialogConfirmationAttachment : null, (r61 & 128) != 0 ? r44.isNeedToShowForcedTutorial : false, (r61 & 256) != 0 ? r44.forcedTutorialAttachment : null, (r61 & 512) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy3));
    }

    public final void getOrAddElementForStorage() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new CraftViewModel$getOrAddElementForStorage$1(this, null), 1, null);
    }

    public final void checkFilter(@NotNull CraftItemCategoryFilter filterCheckBox) {
        Intrinsics.checkNotNullParameter(filterCheckBox, "filterCheckBox");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new CraftViewModel$checkFilter$1(filterCheckBox, this, null), 1, null);
    }

    public final void refreshFilter() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new CraftViewModel$refreshFilter$1(this, null), 1, null);
    }

    public final void subtractItemForCrafting() {
        if (get_uiState().getValue().getCraftingControlInfo().getSelectedValueOfItem() > 1) {
            ViewModelExtensionKt.launchOnDefault$default(this, null, new CraftViewModel$subtractItemForCrafting$1(this, null), 1, null);
        }
    }

    public final void addItemForCrafting() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new CraftViewModel$addItemForCrafting$1(this, null), 1, null);
    }

    public final void onActionCraftingClick() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new CraftViewModel$onActionCraftingClick$1(this, null), 1, null);
    }

    public final void onDialogConfirmationClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new CraftViewModel$onDialogConfirmationClick$1(this, null), 1, null);
    }

    public final void onCloseDialogConfirmationClick() {
        closeDialogConfirmation();
    }

    public final void closeForcedTutorial() {
        CraftUiState value;
        CraftUiState copy;
        MutableStateFlow<? extends CraftUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r60 & 1) != 0 ? r2.currentScreen : null, (r60 & 2) != 0 ? r2.craftScreenTypeObject : null, (r60 & 4) != 0 ? r2.craftItemTextBlock : null, (r60 & 8) != 0 ? r2.craftIconAlarmText : null, (r60 & 16) != 0 ? r2.stashIconAlarmText : null, (r60 & 32) != 0 ? r2.progressIconAlarmText : null, (r60 & 64) != 0 ? r2.workbenchLevel : 0, (r60 & 128) != 0 ? r2.levelOfSkill : 0, (r60 & 256) != 0 ? r2.percentOfSkill : 0, (r60 & 512) != 0 ? r2.quantityInQueue : 0, (r60 & 1024) != 0 ? r2.queueMax : 0, (r60 & 2048) != 0 ? r2.quantityInStorage : 0, (r60 & 4096) != 0 ? r2.storageMax : 0, (r60 & 8192) != 0 ? r2.isPlayerHasVip : false, (r60 & 16384) != 0 ? r2.quantityOfNewItemsInStorage : 0, (r60 & 32768) != 0 ? r2.mapOfCraftElements : null, (r60 & 65536) != 0 ? r2.listWithStorageItems : null, (r60 & 131072) != 0 ? r2.listWithProductionItems : null, (r60 & 262144) != 0 ? r2.listOfLevelUpElements : null, (r60 & 524288) != 0 ? r2.backgroundImage : null, (r60 & 1048576) != 0 ? r2.buttonAnimatedAttachment : null, (r60 & 2097152) != 0 ? r2.isNeedToShowFilter : false, (r60 & 4194304) != 0 ? r2.isNeedToShowTutorial : false, (r60 & 8388608) != 0 ? r2.isNeedToShowHints : false, (r60 & 16777216) != 0 ? r2.isNeedToShowLevelUpDialog : false, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.isNeedToShowSplit : false, (r60 & 67108864) != 0 ? r2.isNeedClose : false, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isWithIndicationFilter : false, (r60 & 268435456) != 0 ? r2.selectedElement : null, (r60 & 536870912) != 0 ? r2.allElementsForCraftAfterFilter : null, (r60 & 1073741824) != 0 ? r2.categories : null, (r60 & Integer.MIN_VALUE) != 0 ? r2.selectedCategory : null, (r61 & 1) != 0 ? r2.filterList : null, (r61 & 2) != 0 ? r2.buttonWithLineText : null, (r61 & 4) != 0 ? r2.craftingControlInfo : null, (r61 & 8) != 0 ? r2.valueOfRubles : 0, (r61 & 16) != 0 ? r2.selectedCategoryIndex : 0, (r61 & 32) != 0 ? r2.isNeedToShowDialogConfirmation : false, (r61 & 64) != 0 ? r2.dialogConfirmationAttachment : null, (r61 & 128) != 0 ? r2.isNeedToShowForcedTutorial : false, (r61 & 256) != 0 ? r2.forcedTutorialAttachment : null, (r61 & 512) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void showErrorMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        getLocalNotification().showErrorNotification(message);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object createCraftElement(com.blackhub.bronline.game.gui.craft.model.response.CraftJsonItem r33, java.util.List<com.blackhub.bronline.game.gui.craft.model.response.CraftJsonItem> r34, java.util.List<com.blackhub.bronline.game.gui.craft.model.server.CraftComponentServerItem> r35, java.util.List<com.blackhub.bronline.game.gui.craft.model.server.CraftItemsWithNotificationServerItem> r36, int r37, int r38, float r39, kotlin.coroutines.Continuation<? super com.blackhub.bronline.game.gui.craft.model.CraftElement> r40) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.craft.CraftViewModel.createCraftElement(com.blackhub.bronline.game.gui.craft.model.response.CraftJsonItem, java.util.List, java.util.List, java.util.List, int, int, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object parseListWithStorageItems(org.json.JSONObject r8, java.util.Map<java.lang.Integer, ? extends java.util.List<com.blackhub.bronline.game.gui.craft.model.CraftElement>> r9, kotlin.coroutines.Continuation<? super java.util.List<com.blackhub.bronline.game.gui.craft.model.CraftElement>> r10) {
        /*
            r7 = this;
            java.lang.String r0 = "cs"
            org.json.JSONArray r8 = r8.optJSONArray(r0)
            r0 = 0
            if (r8 == 0) goto L67
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L54
            r1.<init>()     // Catch: java.lang.Exception -> L54
            int r2 = r8.length()     // Catch: java.lang.Exception -> L54
            r3 = 0
        L13:
            if (r3 >= r2) goto L68
            org.json.JSONObject r4 = r8.getJSONObject(r3)     // Catch: java.lang.Exception -> L54
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)     // Catch: java.lang.Exception -> L54
            com.google.gson.Gson r5 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L3a
            r5.<init>()     // Catch: java.lang.Exception -> L3a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L3a
            java.lang.String r6 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)     // Catch: java.lang.Exception -> L3a
            java.lang.CharSequence r4 = kotlin.text.StringsKt__StringsKt.trim(r4)     // Catch: java.lang.Exception -> L3a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L3a
            java.lang.Class<com.blackhub.bronline.game.gui.craft.model.server.CraftStorageServerItem> r6 = com.blackhub.bronline.game.gui.craft.model.server.CraftStorageServerItem.class
            java.lang.Object r4 = r5.fromJson(r4, r6)     // Catch: java.lang.Exception -> L3a
            goto L4a
        L3a:
            r4 = move-exception
            com.google.firebase.crashlytics.FirebaseCrashlytics r5 = com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance()     // Catch: java.lang.Exception -> L54
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Exception -> L54
            r5.log(r6)     // Catch: java.lang.Exception -> L54
            r5.recordException(r4)     // Catch: java.lang.Exception -> L54
            r4 = r0
        L4a:
            if (r4 == 0) goto L56
            boolean r4 = r1.add(r4)     // Catch: java.lang.Exception -> L54
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)     // Catch: java.lang.Exception -> L54
            goto L56
        L54:
            r8 = move-exception
            goto L59
        L56:
            int r3 = r3 + 1
            goto L13
        L59:
            com.google.firebase.crashlytics.FirebaseCrashlytics r1 = com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance()
            java.lang.String r2 = r8.toString()
            r1.log(r2)
            r1.recordException(r8)
        L67:
            r1 = r0
        L68:
            if (r1 != 0) goto L6e
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
        L6e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r1 = r1.iterator()
        L79:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ld3
            java.lang.Object r2 = r1.next()
            com.blackhub.bronline.game.gui.craft.model.server.CraftStorageServerItem r2 = (com.blackhub.bronline.game.gui.craft.model.server.CraftStorageServerItem) r2
            java.util.Collection r3 = r9.values()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r3 = kotlin.collections.CollectionsKt__IterablesKt.flatten(r3)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L95:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lad
            java.lang.Object r4 = r3.next()
            r5 = r4
            com.blackhub.bronline.game.gui.craft.model.CraftElement r5 = (com.blackhub.bronline.game.gui.craft.model.CraftElement) r5
            int r5 = r5.getElementId()
            int r6 = r2.getId()
            if (r5 != r6) goto L95
            goto Lae
        Lad:
            r4 = r0
        Lae:
            com.blackhub.bronline.game.gui.craft.model.CraftElement r4 = (com.blackhub.bronline.game.gui.craft.model.CraftElement) r4
            java.lang.Integer r3 = r2.isItemNew()
            boolean r3 = com.blackhub.bronline.game.core.extension.AnyExtensionKt.isNotNull(r3)
            if (r3 == 0) goto Lbd
            com.blackhub.bronline.game.gui.craft.enums.CraftElementStatusEnum r3 = com.blackhub.bronline.game.gui.craft.enums.CraftElementStatusEnum.NEW_ELEMENT
            goto Lbf
        Lbd:
            com.blackhub.bronline.game.gui.craft.enums.CraftElementStatusEnum r3 = com.blackhub.bronline.game.gui.craft.enums.CraftElementStatusEnum.DEFAULT
        Lbf:
            if (r4 == 0) goto Lcc
            com.blackhub.bronline.game.gui.craft.CraftViewModel$parseListWithStorageItems$listWithStorageElements$1$1$1 r5 = new com.blackhub.bronline.game.gui.craft.CraftViewModel$parseListWithStorageItems$listWithStorageElements$1$1$1
            r5.<init>(r2, r4, r3, r0)
            r2 = 1
            kotlinx.coroutines.Deferred r2 = com.blackhub.bronline.game.core.extension.ViewModelExtensionKt.asyncOnDefault$default(r7, r0, r5, r2, r0)
            goto Lcd
        Lcc:
            r2 = r0
        Lcd:
            if (r2 == 0) goto L79
            r8.add(r2)
            goto L79
        Ld3:
            java.lang.Object r8 = kotlinx.coroutines.AwaitKt.awaitAll(r8, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.craft.CraftViewModel.parseListWithStorageItems(org.json.JSONObject, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object parseListWithProductionItems(org.json.JSONObject r8, java.util.Map<java.lang.Integer, ? extends java.util.List<com.blackhub.bronline.game.gui.craft.model.CraftElement>> r9, kotlin.coroutines.Continuation<? super java.util.List<com.blackhub.bronline.game.gui.craft.model.CraftElement>> r10) {
        /*
            r7 = this;
            java.lang.String r0 = "cp"
            org.json.JSONArray r8 = r8.optJSONArray(r0)
            r0 = 0
            if (r8 == 0) goto L67
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L54
            r1.<init>()     // Catch: java.lang.Exception -> L54
            int r2 = r8.length()     // Catch: java.lang.Exception -> L54
            r3 = 0
        L13:
            if (r3 >= r2) goto L68
            org.json.JSONObject r4 = r8.getJSONObject(r3)     // Catch: java.lang.Exception -> L54
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)     // Catch: java.lang.Exception -> L54
            com.google.gson.Gson r5 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L3a
            r5.<init>()     // Catch: java.lang.Exception -> L3a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L3a
            java.lang.String r6 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)     // Catch: java.lang.Exception -> L3a
            java.lang.CharSequence r4 = kotlin.text.StringsKt__StringsKt.trim(r4)     // Catch: java.lang.Exception -> L3a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L3a
            java.lang.Class<com.blackhub.bronline.game.gui.craft.model.server.CraftProductionServerItem> r6 = com.blackhub.bronline.game.gui.craft.model.server.CraftProductionServerItem.class
            java.lang.Object r4 = r5.fromJson(r4, r6)     // Catch: java.lang.Exception -> L3a
            goto L4a
        L3a:
            r4 = move-exception
            com.google.firebase.crashlytics.FirebaseCrashlytics r5 = com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance()     // Catch: java.lang.Exception -> L54
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Exception -> L54
            r5.log(r6)     // Catch: java.lang.Exception -> L54
            r5.recordException(r4)     // Catch: java.lang.Exception -> L54
            r4 = r0
        L4a:
            if (r4 == 0) goto L56
            boolean r4 = r1.add(r4)     // Catch: java.lang.Exception -> L54
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)     // Catch: java.lang.Exception -> L54
            goto L56
        L54:
            r8 = move-exception
            goto L59
        L56:
            int r3 = r3 + 1
            goto L13
        L59:
            com.google.firebase.crashlytics.FirebaseCrashlytics r1 = com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance()
            java.lang.String r2 = r8.toString()
            r1.log(r2)
            r1.recordException(r8)
        L67:
            r1 = r0
        L68:
            if (r1 != 0) goto L6e
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
        L6e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r1 = r1.iterator()
        L79:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc4
            java.lang.Object r2 = r1.next()
            com.blackhub.bronline.game.gui.craft.model.server.CraftProductionServerItem r2 = (com.blackhub.bronline.game.gui.craft.model.server.CraftProductionServerItem) r2
            java.util.Collection r3 = r9.values()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r3 = kotlin.collections.CollectionsKt__IterablesKt.flatten(r3)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L95:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lad
            java.lang.Object r4 = r3.next()
            r5 = r4
            com.blackhub.bronline.game.gui.craft.model.CraftElement r5 = (com.blackhub.bronline.game.gui.craft.model.CraftElement) r5
            int r5 = r5.getElementId()
            int r6 = r2.getId()
            if (r5 != r6) goto L95
            goto Lae
        Lad:
            r4 = r0
        Lae:
            com.blackhub.bronline.game.gui.craft.model.CraftElement r4 = (com.blackhub.bronline.game.gui.craft.model.CraftElement) r4
            if (r4 == 0) goto Lbd
            com.blackhub.bronline.game.gui.craft.CraftViewModel$parseListWithProductionItems$2$1$1 r3 = new com.blackhub.bronline.game.gui.craft.CraftViewModel$parseListWithProductionItems$2$1$1
            r3.<init>(r2, r4, r0)
            r2 = 1
            kotlinx.coroutines.Deferred r2 = com.blackhub.bronline.game.core.extension.ViewModelExtensionKt.asyncOnDefault$default(r7, r0, r3, r2, r0)
            goto Lbe
        Lbd:
            r2 = r0
        Lbe:
            if (r2 == 0) goto L79
            r8.add(r2)
            goto L79
        Lc4:
            java.lang.Object r8 = kotlinx.coroutines.AwaitKt.awaitAll(r8, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.craft.CraftViewModel.parseListWithProductionItems(org.json.JSONObject, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void showSplit(boolean value) {
        CraftUiState value2;
        CraftUiState copy;
        MutableStateFlow<? extends CraftUiState> mutableStateFlow = get_uiState();
        do {
            value2 = mutableStateFlow.getValue();
            copy = r2.copy((r60 & 1) != 0 ? r2.currentScreen : null, (r60 & 2) != 0 ? r2.craftScreenTypeObject : null, (r60 & 4) != 0 ? r2.craftItemTextBlock : null, (r60 & 8) != 0 ? r2.craftIconAlarmText : null, (r60 & 16) != 0 ? r2.stashIconAlarmText : null, (r60 & 32) != 0 ? r2.progressIconAlarmText : null, (r60 & 64) != 0 ? r2.workbenchLevel : 0, (r60 & 128) != 0 ? r2.levelOfSkill : 0, (r60 & 256) != 0 ? r2.percentOfSkill : 0, (r60 & 512) != 0 ? r2.quantityInQueue : 0, (r60 & 1024) != 0 ? r2.queueMax : 0, (r60 & 2048) != 0 ? r2.quantityInStorage : 0, (r60 & 4096) != 0 ? r2.storageMax : 0, (r60 & 8192) != 0 ? r2.isPlayerHasVip : false, (r60 & 16384) != 0 ? r2.quantityOfNewItemsInStorage : 0, (r60 & 32768) != 0 ? r2.mapOfCraftElements : null, (r60 & 65536) != 0 ? r2.listWithStorageItems : null, (r60 & 131072) != 0 ? r2.listWithProductionItems : null, (r60 & 262144) != 0 ? r2.listOfLevelUpElements : null, (r60 & 524288) != 0 ? r2.backgroundImage : null, (r60 & 1048576) != 0 ? r2.buttonAnimatedAttachment : null, (r60 & 2097152) != 0 ? r2.isNeedToShowFilter : false, (r60 & 4194304) != 0 ? r2.isNeedToShowTutorial : false, (r60 & 8388608) != 0 ? r2.isNeedToShowHints : false, (r60 & 16777216) != 0 ? r2.isNeedToShowLevelUpDialog : false, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.isNeedToShowSplit : value, (r60 & 67108864) != 0 ? r2.isNeedClose : false, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isWithIndicationFilter : false, (r60 & 268435456) != 0 ? r2.selectedElement : null, (r60 & 536870912) != 0 ? r2.allElementsForCraftAfterFilter : null, (r60 & 1073741824) != 0 ? r2.categories : null, (r60 & Integer.MIN_VALUE) != 0 ? r2.selectedCategory : null, (r61 & 1) != 0 ? r2.filterList : null, (r61 & 2) != 0 ? r2.buttonWithLineText : null, (r61 & 4) != 0 ? r2.craftingControlInfo : null, (r61 & 8) != 0 ? r2.valueOfRubles : 0, (r61 & 16) != 0 ? r2.selectedCategoryIndex : 0, (r61 & 32) != 0 ? r2.isNeedToShowDialogConfirmation : false, (r61 & 64) != 0 ? r2.dialogConfirmationAttachment : null, (r61 & 128) != 0 ? r2.isNeedToShowForcedTutorial : false, (r61 & 256) != 0 ? r2.forcedTutorialAttachment : null, (r61 & 512) != 0 ? value2.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value2, copy));
    }

    public final void onBuyVipClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new CraftViewModel$onBuyVipClick$1(this, null), 1, null);
    }

    public final void deleteElementFromStash(@NotNull CraftElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new CraftViewModel$deleteElementFromStash$1(this, element, null), 1, null);
    }

    public final CraftIngredient findCraftIngredient(CraftJsonComponentItem craftComponent, List<CraftJsonItem> listOfCraftItems, List<CraftComponentServerItem> componentsArray) {
        CraftIngredient craftIngredient;
        Object obj;
        Iterator<T> it = listOfCraftItems.iterator();
        do {
            craftIngredient = null;
            craftIngredient = null;
            if (!it.hasNext()) {
                break;
            }
            CraftJsonItem craftJsonItem = (CraftJsonItem) it.next();
            if (craftJsonItem.getItemId() == craftComponent.getComponentId()) {
                int componentId = craftComponent.getComponentId();
                CommonRarityEnum fromInt = CommonRarityEnum.INSTANCE.fromInt(craftJsonItem.getItemClassId());
                String itemName = craftJsonItem.getItemName();
                String itemDescription = craftJsonItem.getItemDescription();
                if (itemDescription == null) {
                    itemDescription = "";
                }
                String str = itemDescription;
                String imageCDN = craftJsonItem.getImageCDN();
                int itemCategory = craftJsonItem.getItemCategory();
                int requiredQuantity = craftComponent.getRequiredQuantity();
                Iterator<T> it2 = componentsArray.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (((CraftComponentServerItem) obj).getId() == craftJsonItem.getItemId()) {
                        break;
                    }
                }
                CraftComponentServerItem craftComponentServerItem = (CraftComponentServerItem) obj;
                craftIngredient = new CraftIngredient(componentId, fromInt, itemName, str, imageCDN, itemCategory, 0, requiredQuantity, IntExtensionKt.getOrZero(craftComponentServerItem != null ? Integer.valueOf(craftComponentServerItem.getQuantity()) : null), false, false, 1600, null);
            }
        } while (craftIngredient == null);
        return craftIngredient;
    }

    public final CraftElementStatusEnum determineElementState(CraftJsonItem craftJsonItem, List<CraftItemsWithNotificationServerItem> newItemsArray, int levelOfSkill, List<CraftIngredient> componentsList, int workbenchLevel) {
        List<CraftItemsWithNotificationServerItem> list = newItemsArray;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((CraftItemsWithNotificationServerItem) it.next()).getId() == craftJsonItem.getItemId()) {
                    return CraftElementStatusEnum.NEW_ELEMENT;
                }
            }
        }
        if (levelOfSkill < craftJsonItem.getItemClassId() || workbenchLevel < craftJsonItem.getItemClassId()) {
            return CraftElementStatusEnum.UNAVAILABLE;
        }
        if (componentsList != null) {
            int size = componentsList.size();
            for (int i = 0; i < size; i++) {
                if (componentsList.get(i).isEnough()) {
                }
            }
            return CraftElementStatusEnum.AVAILABLE_FOR_CRAFTING;
        }
        return CraftElementStatusEnum.DEFAULT;
    }

    public final Object createCategories(List<CraftJsonItemCategory> list, Map<Integer, List<CraftElement>> map, Continuation<? super List<CommonButtonCategory>> continuation) {
        List<CraftJsonItemCategory> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(ViewModelExtensionKt.asyncOnDefault$default(this, null, new CraftViewModel$createCategories$2$1((CraftJsonItemCategory) it.next(), this, map, null), 1, null));
        }
        return AwaitKt.awaitAll(arrayList, continuation);
    }

    public final CraftCraftingControl updateCraftCraftingControl(boolean isAdd, CraftElement selectedItem) {
        int selectedValueOfItem;
        CraftCraftingControl copy;
        int valueOfRubles = get_uiState().getValue().getValueOfRubles();
        CraftCraftingControl craftingControlInfo = get_uiState().getValue().getCraftingControlInfo();
        if (isAdd) {
            selectedValueOfItem = craftingControlInfo.getSelectedValueOfItem() + 1;
        } else {
            selectedValueOfItem = craftingControlInfo.getSelectedValueOfItem() - 1;
        }
        int i = selectedValueOfItem;
        int textQuantityColor$default = getTextQuantityColor$default(this, null, i, 1, null);
        float weight = i * selectedItem.getTextBlock().getWeight();
        int craftingCost = selectedItem.getCraftingCost() * i;
        boolean z = valueOfRubles >= craftingCost;
        boolean isEnoughResources = selectedItem.isEnoughResources();
        int value = selectedItem.getElementRarity().getValue();
        boolean z2 = getUiState().getValue().getLevelOfSkill() < value;
        boolean z3 = getUiState().getValue().getWorkbenchLevel() < value;
        copy = craftingControlInfo.copy((r26 & 1) != 0 ? craftingControlInfo.typeOfBlock : 0, (r26 & 2) != 0 ? craftingControlInfo.selectedValueOfItem : i, (r26 & 4) != 0 ? craftingControlInfo.maxValueOfItems : 0, (r26 & 8) != 0 ? craftingControlInfo.selectedWeight : weight, (r26 & 16) != 0 ? craftingControlInfo.craftingCost : String.valueOf(craftingCost), (r26 & 32) != 0 ? craftingControlInfo.timeUntilItemWillBePrepared : 0, (r26 & 64) != 0 ? craftingControlInfo.isEnoughMoney : z, (r26 & 128) != 0 ? craftingControlInfo.isEnoughResources : isEnoughResources, (r26 & 256) != 0 ? craftingControlInfo.isLowLevel : z2, (r26 & 512) != 0 ? craftingControlInfo.isWorkbenchLevelInsufficient : z3, (r26 & 1024) != 0 ? craftingControlInfo.isEnabledMainButton : z && isEnoughResources && !z2 && !z3, (r26 & 2048) != 0 ? craftingControlInfo.textSelectedValueOfItemColor : textQuantityColor$default);
        return copy;
    }

    public static /* synthetic */ void showDialogConfirmation$default(CraftViewModel craftViewModel, int i, String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        craftViewModel.showDialogConfirmation(i, str, i2, i3);
    }

    public final void showDialogConfirmation(int typeOfDialog, String nameOfSelectedElement, int idSelectedElement, int valueOfElements) {
        String string;
        CraftUiState value;
        CraftUiState copy;
        if (typeOfDialog == 1) {
            string = this.stringResources.getString(R.string.craft_dialog_cancel_creation, nameOfSelectedElement);
        } else if (typeOfDialog == 2) {
            string = this.stringResources.getString(R.string.craft_dialog_start_creation, nameOfSelectedElement, Integer.valueOf(valueOfElements));
        } else if (typeOfDialog == 3) {
            string = this.stringResources.getString(R.string.craft_dialog_receiving_single_item, nameOfSelectedElement);
        } else if (typeOfDialog == 4) {
            string = this.stringResources.getString(R.string.craft_dialog_receiving_all_items);
        } else {
            string = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        }
        String str = string;
        MutableStateFlow<? extends CraftUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r12.copy((r60 & 1) != 0 ? r12.currentScreen : null, (r60 & 2) != 0 ? r12.craftScreenTypeObject : null, (r60 & 4) != 0 ? r12.craftItemTextBlock : null, (r60 & 8) != 0 ? r12.craftIconAlarmText : null, (r60 & 16) != 0 ? r12.stashIconAlarmText : null, (r60 & 32) != 0 ? r12.progressIconAlarmText : null, (r60 & 64) != 0 ? r12.workbenchLevel : 0, (r60 & 128) != 0 ? r12.levelOfSkill : 0, (r60 & 256) != 0 ? r12.percentOfSkill : 0, (r60 & 512) != 0 ? r12.quantityInQueue : 0, (r60 & 1024) != 0 ? r12.queueMax : 0, (r60 & 2048) != 0 ? r12.quantityInStorage : 0, (r60 & 4096) != 0 ? r12.storageMax : 0, (r60 & 8192) != 0 ? r12.isPlayerHasVip : false, (r60 & 16384) != 0 ? r12.quantityOfNewItemsInStorage : 0, (r60 & 32768) != 0 ? r12.mapOfCraftElements : null, (r60 & 65536) != 0 ? r12.listWithStorageItems : null, (r60 & 131072) != 0 ? r12.listWithProductionItems : null, (r60 & 262144) != 0 ? r12.listOfLevelUpElements : null, (r60 & 524288) != 0 ? r12.backgroundImage : null, (r60 & 1048576) != 0 ? r12.buttonAnimatedAttachment : null, (r60 & 2097152) != 0 ? r12.isNeedToShowFilter : false, (r60 & 4194304) != 0 ? r12.isNeedToShowTutorial : false, (r60 & 8388608) != 0 ? r12.isNeedToShowHints : false, (r60 & 16777216) != 0 ? r12.isNeedToShowLevelUpDialog : false, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r12.isNeedToShowSplit : false, (r60 & 67108864) != 0 ? r12.isNeedClose : false, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r12.isWithIndicationFilter : false, (r60 & 268435456) != 0 ? r12.selectedElement : null, (r60 & 536870912) != 0 ? r12.allElementsForCraftAfterFilter : null, (r60 & 1073741824) != 0 ? r12.categories : null, (r60 & Integer.MIN_VALUE) != 0 ? r12.selectedCategory : null, (r61 & 1) != 0 ? r12.filterList : null, (r61 & 2) != 0 ? r12.buttonWithLineText : null, (r61 & 4) != 0 ? r12.craftingControlInfo : null, (r61 & 8) != 0 ? r12.valueOfRubles : 0, (r61 & 16) != 0 ? r12.selectedCategoryIndex : 0, (r61 & 32) != 0 ? r12.isNeedToShowDialogConfirmation : true, (r61 & 64) != 0 ? r12.dialogConfirmationAttachment : new CraftDialogConfirmationAttachment(typeOfDialog, str, idSelectedElement, nameOfSelectedElement, valueOfElements), (r61 & 128) != 0 ? r12.isNeedToShowForcedTutorial : false, (r61 & 256) != 0 ? r12.forcedTutorialAttachment : null, (r61 & 512) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeDialogConfirmation() {
        CraftUiState value;
        CraftUiState copy;
        MutableStateFlow<? extends CraftUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r60 & 1) != 0 ? r2.currentScreen : null, (r60 & 2) != 0 ? r2.craftScreenTypeObject : null, (r60 & 4) != 0 ? r2.craftItemTextBlock : null, (r60 & 8) != 0 ? r2.craftIconAlarmText : null, (r60 & 16) != 0 ? r2.stashIconAlarmText : null, (r60 & 32) != 0 ? r2.progressIconAlarmText : null, (r60 & 64) != 0 ? r2.workbenchLevel : 0, (r60 & 128) != 0 ? r2.levelOfSkill : 0, (r60 & 256) != 0 ? r2.percentOfSkill : 0, (r60 & 512) != 0 ? r2.quantityInQueue : 0, (r60 & 1024) != 0 ? r2.queueMax : 0, (r60 & 2048) != 0 ? r2.quantityInStorage : 0, (r60 & 4096) != 0 ? r2.storageMax : 0, (r60 & 8192) != 0 ? r2.isPlayerHasVip : false, (r60 & 16384) != 0 ? r2.quantityOfNewItemsInStorage : 0, (r60 & 32768) != 0 ? r2.mapOfCraftElements : null, (r60 & 65536) != 0 ? r2.listWithStorageItems : null, (r60 & 131072) != 0 ? r2.listWithProductionItems : null, (r60 & 262144) != 0 ? r2.listOfLevelUpElements : null, (r60 & 524288) != 0 ? r2.backgroundImage : null, (r60 & 1048576) != 0 ? r2.buttonAnimatedAttachment : null, (r60 & 2097152) != 0 ? r2.isNeedToShowFilter : false, (r60 & 4194304) != 0 ? r2.isNeedToShowTutorial : false, (r60 & 8388608) != 0 ? r2.isNeedToShowHints : false, (r60 & 16777216) != 0 ? r2.isNeedToShowLevelUpDialog : false, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r2.isNeedToShowSplit : false, (r60 & 67108864) != 0 ? r2.isNeedClose : false, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.isWithIndicationFilter : false, (r60 & 268435456) != 0 ? r2.selectedElement : null, (r60 & 536870912) != 0 ? r2.allElementsForCraftAfterFilter : null, (r60 & 1073741824) != 0 ? r2.categories : null, (r60 & Integer.MIN_VALUE) != 0 ? r2.selectedCategory : null, (r61 & 1) != 0 ? r2.filterList : null, (r61 & 2) != 0 ? r2.buttonWithLineText : null, (r61 & 4) != 0 ? r2.craftingControlInfo : null, (r61 & 8) != 0 ? r2.valueOfRubles : 0, (r61 & 16) != 0 ? r2.selectedCategoryIndex : 0, (r61 & 32) != 0 ? r2.isNeedToShowDialogConfirmation : false, (r61 & 64) != 0 ? r2.dialogConfirmationAttachment : null, (r61 & 128) != 0 ? r2.isNeedToShowForcedTutorial : false, (r61 & 256) != 0 ? r2.forcedTutorialAttachment : null, (r61 & 512) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List sortingList$default(CraftViewModel craftViewModel, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            list2 = null;
        }
        return craftViewModel.sortingList(list, list2);
    }

    public final List<CraftElement> sortingList(List<CraftElement> selectedList, List<CraftCategoryFilter> filterList) {
        final List list;
        final List list2;
        List<CraftItemCategoryFilter> filters;
        List<CraftItemCategoryFilter> filters2;
        List<CraftItemCategoryFilter> filters3;
        if (selectedList == null && (selectedList = getUiState().getValue().getMapOfCraftElements().get(Integer.valueOf(getUiState().getValue().getSelectedCategory().getCategoryId()))) == null) {
            selectedList = CollectionsKt__CollectionsKt.emptyList();
        }
        Sequence asSequence = CollectionsKt___CollectionsKt.asSequence(selectedList);
        if (filterList == null) {
            filterList = getUiState().getValue().getFilterList();
        }
        CraftCategoryFilter craftCategoryFilter = (CraftCategoryFilter) CollectionsKt___CollectionsKt.firstOrNull((List) filterList);
        final List list3 = null;
        if (craftCategoryFilter == null || (filters3 = craftCategoryFilter.getFilters()) == null) {
            list = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : filters3) {
                if (((CraftItemCategoryFilter) obj).getStateOfCheckBox()) {
                    arrayList.add(obj);
                }
            }
            list = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                list.add(Integer.valueOf(((CraftItemCategoryFilter) it.next()).getFilterId()));
            }
        }
        if (list == null) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        CraftCategoryFilter craftCategoryFilter2 = (CraftCategoryFilter) CollectionsKt___CollectionsKt.getOrNull(filterList, 1);
        if (craftCategoryFilter2 == null || (filters2 = craftCategoryFilter2.getFilters()) == null) {
            list2 = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : filters2) {
                if (((CraftItemCategoryFilter) obj2).getStateOfCheckBox()) {
                    arrayList2.add(obj2);
                }
            }
            list2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                list2.add(Integer.valueOf(((CraftItemCategoryFilter) it2.next()).getFilterId()));
            }
        }
        if (list2 == null) {
            list2 = CollectionsKt__CollectionsKt.emptyList();
        }
        CraftCategoryFilter craftCategoryFilter3 = (CraftCategoryFilter) CollectionsKt___CollectionsKt.getOrNull(filterList, 2);
        if (craftCategoryFilter3 != null && (filters = craftCategoryFilter3.getFilters()) != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : filters) {
                if (((CraftItemCategoryFilter) obj3).getStateOfCheckBox()) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(Integer.valueOf(((CraftItemCategoryFilter) it3.next()).getFilterId()));
            }
            list3 = arrayList4;
        }
        if (list3 == null) {
            list3 = CollectionsKt__CollectionsKt.emptyList();
        }
        if (list.isEmpty() && list2.isEmpty() && list3.isEmpty()) {
            return SequencesKt___SequencesKt.toList(asSequence);
        }
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.filter(SequencesKt___SequencesKt.filter(SequencesKt___SequencesKt.filter(asSequence, new Function1<CraftElement, Boolean>() { // from class: com.blackhub.bronline.game.gui.craft.CraftViewModel$sortingList$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull CraftElement element) {
                Intrinsics.checkNotNullParameter(element, "element");
                return Boolean.valueOf(list.isEmpty() ^ true ? list.contains(Integer.valueOf(element.getElementRarity().getValue())) : true);
            }
        }), new Function1<CraftElement, Boolean>() { // from class: com.blackhub.bronline.game.gui.craft.CraftViewModel$sortingList$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull CraftElement element) {
                Intrinsics.checkNotNullParameter(element, "element");
                boolean z = true;
                if ((!list2.contains(6) || !list2.contains(7)) && (!list2.contains(6) ? !(!list2.contains(7) || element.getElementState() != CraftElementStatusEnum.AVAILABLE_FOR_CRAFTING) : element.getElementState() != CraftElementStatusEnum.AVAILABLE_FOR_CRAFTING)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }), new Function1<CraftElement, Boolean>() { // from class: com.blackhub.bronline.game.gui.craft.CraftViewModel$sortingList$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull CraftElement element) {
                Intrinsics.checkNotNullParameter(element, "element");
                boolean z = true;
                if ((!list3.contains(8) || !list3.contains(9)) && (!list3.contains(8) ? !(!list3.contains(9) || element.getElementState() == CraftElementStatusEnum.UNAVAILABLE) : element.getElementState() == CraftElementStatusEnum.UNAVAILABLE)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }));
    }

    public static /* synthetic */ int getTextQuantityColor$default(CraftViewModel craftViewModel, CraftElement craftElement, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            craftElement = craftViewModel.getUiState().getValue().getSelectedElement();
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return craftViewModel.getTextQuantityColor(craftElement, i);
    }

    public final int getTextQuantityColor(CraftElement element, int newValue) {
        return (element.getCraftingCost() > getUiState().getValue().getValueOfRubles() || !element.isEnoughResources() || getUiState().getValue().getQuantityInQueue() + newValue > getUiState().getValue().getQueueMax() || getUiState().getValue().getQuantityInStorage() + newValue > getUiState().getValue().getStorageMax()) ? R.color.rose_red : R.color.white;
    }

    public final void returnToDefaultValueOldSelectedElement() {
        Object obj;
        Iterator<T> it = get_uiState().getValue().getAllElementsForCraftAfterFilter().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual((CraftElement) obj, get_uiState().getValue().getSelectedElement())) {
                    break;
                }
            }
        }
        CraftElement craftElement = (CraftElement) obj;
        if (craftElement != null) {
            List<CraftIngredient> componentsList = craftElement.getComponentsList();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(componentsList, 10));
            Iterator<T> it2 = componentsList.iterator();
            while (it2.hasNext()) {
                ((CraftIngredient) it2.next()).setCount(1);
                arrayList.add(Unit.INSTANCE);
            }
        }
    }
}
