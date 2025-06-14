package com.blackhub.bronline.game.gui.tuning.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.tuning.CostCalculation;
import com.blackhub.bronline.game.gui.tuning.TuningConstants;
import com.blackhub.bronline.game.gui.tuning.data.TuneGuiNodeObj;
import com.blackhub.bronline.game.gui.tuning.data.TuneObj;
import com.blackhub.bronline.game.gui.tuning.data.TuneVinylsObj;
import com.blackhub.bronline.game.gui.tuning.data.TuningBoxItemObj;
import com.blackhub.bronline.game.gui.tuning.network.TuningActionWithJSON;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TuningDetailsListViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ \u0010>\u001a\u00020\u00112\u0006\u0010?\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u00142\u0006\u0010A\u001a\u00020\u0014H\u0002J\u001c\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00140\u00102\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010H\u0002J\"\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00140\u00102\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010H\u0082@¢\u0006\u0002\u0010EJ\u0016\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00160\u00192\u0006\u0010G\u001a\u00020\u0014H\u0002J\u000e\u0010H\u001a\u00020IH\u0082@¢\u0006\u0002\u0010JJ\u000e\u0010K\u001a\u00020I2\u0006\u0010@\u001a\u00020\u0014J\u001e\u0010L\u001a\u00020I2\u0006\u0010M\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010NJ\u0014\u0010O\u001a\u00020I2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010J\u0014\u0010Q\u001a\u00020I2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020$0\u0010J,\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010M\u001a\u00020\u00112\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00140\u00102\u0006\u0010@\u001a\u00020\u0014H\u0002J\u0016\u0010U\u001a\u00020I2\u0006\u0010V\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010WJ\u000e\u0010X\u001a\u00020I2\u0006\u0010Y\u001a\u00020\u0014J\u000e\u0010Z\u001a\u00020I2\u0006\u0010[\u001a\u00020\u0014J\u000e\u0010\\\u001a\u00020I2\u0006\u0010]\u001a\u00020\u0014J\u000e\u0010^\u001a\u00020I2\u0006\u0010_\u001a\u00020\u001eJ\u000e\u0010`\u001a\u00020I2\u0006\u0010a\u001a\u00020bJ\u0006\u0010c\u001a\u00020IJ\u0016\u0010c\u001a\u00020\u00142\f\u0010d\u001a\b\u0012\u0004\u0012\u00020$0\u0010H\u0002J\u000e\u0010e\u001a\u00020I2\u0006\u0010f\u001a\u00020\u0014J\u000e\u0010g\u001a\u00020I2\u0006\u0010h\u001a\u00020\u0014J\u000e\u0010i\u001a\u00020I2\u0006\u0010f\u001a\u00020\u0014J\u0016\u0010j\u001a\u00020I2\u0006\u0010M\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u0014J*\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00160\u00192\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00140\u00102\f\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010H\u0002J\u000e\u0010n\u001a\u00020I2\u0006\u0010G\u001a\u00020\u0014J\u0010\u0010o\u001a\u00020I2\b\u0010p\u001a\u0004\u0018\u00010qJ\u000e\u0010r\u001a\u00020I2\u0006\u0010s\u001a\u00020bJ\u0010\u0010t\u001a\u00020I2\b\u0010a\u001a\u0004\u0018\u00010bJ\u000e\u0010u\u001a\u00020I2\u0006\u0010v\u001a\u00020\rJ\u000e\u0010w\u001a\u00020I2\u0006\u0010_\u001a\u00020\u001eJ/\u0010w\u001a\u00020\u00142\f\u0010d\u001a\b\u0012\u0004\u0012\u00020$0\u00102\b\u0010_\u001a\u0004\u0018\u00010\u001e2\b\u0010h\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0002\u0010xJ&\u0010y\u001a\u00020I2\u0006\u0010z\u001a\u00020\u00142\u0006\u0010{\u001a\u00020\u00142\u0006\u0010|\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010}J&\u0010~\u001a\u00020I2\u0006\u0010z\u001a\u00020\u00142\u0006\u0010{\u001a\u00020\u00142\u0006\u0010|\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010}J\u001f\u0010\u007f\u001a\u00020I2\u0006\u0010a\u001a\u00020b2\u0006\u0010|\u001a\u00020\u0014H\u0082@¢\u0006\u0003\u0010\u0080\u0001J\u0017\u0010\u0081\u0001\u001a\u00020I2\u0006\u0010a\u001a\u00020b2\u0006\u0010|\u001a\u00020\u0014J\u000f\u0010\u0082\u0001\u001a\u00020I2\u0006\u0010a\u001a\u00020bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00100\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00190\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00100\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00100\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00100\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00100\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00100\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0019\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160+¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001d\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00100'¢\u0006\b\n\u0000\u001a\u0004\b/\u0010)R\u001d\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00100+¢\u0006\b\n\u0000\u001a\u0004\b1\u0010-R\u001d\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00100+¢\u0006\b\n\u0000\u001a\u0004\b3\u0010-R\u001d\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00100+¢\u0006\b\n\u0000\u001a\u0004\b5\u0010-R\u001d\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00100+¢\u0006\b\n\u0000\u001a\u0004\b7\u0010-R\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\u00140'¢\u0006\b\n\u0000\u001a\u0004\b9\u0010)R\u001d\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00100'¢\u0006\b\n\u0000\u001a\u0004\b;\u0010)R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0+¢\u0006\b\n\u0000\u001a\u0004\b=\u0010-R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0083\u0001"}, d2 = {"Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningDetailsListViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "actionWithJson", "Lcom/blackhub/bronline/game/gui/tuning/network/TuningActionWithJSON;", "costCalculation", "Lcom/blackhub/bronline/game/gui/tuning/CostCalculation;", "stringResources", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "(Lcom/blackhub/bronline/game/gui/tuning/network/TuningActionWithJSON;Lcom/blackhub/bronline/game/gui/tuning/CostCalculation;Lcom/blackhub/bronline/game/core/resources/StringResource;Lcom/blackhub/bronline/game/common/LocalNotification;)V", "ifInitSelectors", "", "mutableAllItemsForSubmenu", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneGuiNodeObj;", "mutableAllSelectors", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "mutableCurrentBox", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneObj;", "mutableDetailsList", "mutableDetailsWithIdAndStatus", "", "mutableGosCost", "mutableItemsForBox", "Lcom/blackhub/bronline/game/gui/tuning/data/TuningBoxItemObj;", "mutableNamePresent", "", "mutableNewAndOldDetails", "mutableNewAndOldVinyls", "mutableTuneItems", "mutableVinylCost", "mutableVinylsList", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneVinylsObj;", "mutableVisibleDialogBox", "newAllItemsForSubmenu", "Lkotlinx/coroutines/flow/SharedFlow;", "getNewAllItemsForSubmenu", "()Lkotlinx/coroutines/flow/SharedFlow;", "newCurrentBox", "Lkotlinx/coroutines/flow/StateFlow;", "getNewCurrentBox", "()Lkotlinx/coroutines/flow/StateFlow;", "newDetailsList", "getNewDetailsList", "newItemsForBox", "getNewItemsForBox", "newNamePresent", "getNewNamePresent", "newNewAndOldDetails", "getNewNewAndOldDetails", "newNewAndOldVinyls", "getNewNewAndOldVinyls", "newVinylCost", "getNewVinylCost", "newVinylsList", "getNewVinylsList", "newVisibleDialogBox", "getNewVisibleDialogBox", "changeIcons", IconCompat.EXTRA_OBJ, "carId", "selectorId", "getAllSelectorsWithDef1", "tuneItemsFromJSON", "getCurrentSelectors", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTuneItemsForCurrentSelector", "selector", "initCurrentSelectors", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initItemsForBoxList", "initItemsForSubmenu", "tuningType", "(Lcom/blackhub/bronline/game/gui/tuning/data/TuneGuiNodeObj;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initTuneItemsFromJson", FirebaseAnalytics.Param.ITEMS, "initVinyls", "tuneVinyls", "lInitItems", "allSelectors", "newInitDetailsList", "currentSelector", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openBox", "boxId", "playSound", "soundTuneId", "previewDetail", "detailTuneId", "previewVinyl", "vinylName", "resetDetail", "json", "Lorg/json/JSONObject;", "resetVinyl", "allVinyls", "sendBuyNewDetail", "detailId", "sendBuyVinyl", "vinylId", "sendSetDetail", "setAllSelectors", "setCorrectDetailsListFormatTune", "listCorrectDetailsWithCostAndStatus", "detailsItems", "setCurrentSelector", "setDetailsWithIdAndStatus", "jsonArray", "Lorg/json/JSONArray;", "setGosCost", "jsonObject", "setNewPresent", "setNewStatusForDialogBox", "newStatus", "setStartVinyl", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)I", "updateCurrentDetails", "newId", "oldId", "newCurrentStatus", "(IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateDetailInfo", "updateItemStatus", "(Lorg/json/JSONObject;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateItemsAfterPurchaseOrSet", "updateVinylsAfterEstablished", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TuningDetailsListViewModel extends ViewModel implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final TuningActionWithJSON actionWithJson;

    @NotNull
    public final CostCalculation costCalculation;
    public boolean ifInitSelectors;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final MutableSharedFlow<List<TuneGuiNodeObj>> mutableAllItemsForSubmenu;

    @NotNull
    public final MutableStateFlow<List<Integer>> mutableAllSelectors;

    @NotNull
    public final MutableStateFlow<TuneObj> mutableCurrentBox;

    @NotNull
    public final MutableSharedFlow<List<TuneObj>> mutableDetailsList;

    @NotNull
    public final MutableSharedFlow<List<Integer>> mutableDetailsWithIdAndStatus;

    @NotNull
    public final MutableStateFlow<Integer> mutableGosCost;

    @NotNull
    public final MutableStateFlow<List<TuningBoxItemObj>> mutableItemsForBox;

    @NotNull
    public final MutableStateFlow<List<String>> mutableNamePresent;

    @NotNull
    public final MutableStateFlow<List<Integer>> mutableNewAndOldDetails;

    @NotNull
    public final MutableStateFlow<List<Integer>> mutableNewAndOldVinyls;

    @NotNull
    public final MutableStateFlow<List<TuneObj>> mutableTuneItems;

    @NotNull
    public final MutableStateFlow<Integer> mutableVinylCost;

    @NotNull
    public final MutableSharedFlow<List<TuneVinylsObj>> mutableVinylsList;

    @NotNull
    public final MutableStateFlow<Boolean> mutableVisibleDialogBox;

    @NotNull
    public final SharedFlow<List<TuneGuiNodeObj>> newAllItemsForSubmenu;

    @NotNull
    public final StateFlow<TuneObj> newCurrentBox;

    @NotNull
    public final SharedFlow<List<TuneObj>> newDetailsList;

    @NotNull
    public final StateFlow<List<TuningBoxItemObj>> newItemsForBox;

    @NotNull
    public final StateFlow<List<String>> newNamePresent;

    @NotNull
    public final StateFlow<List<Integer>> newNewAndOldDetails;

    @NotNull
    public final StateFlow<List<Integer>> newNewAndOldVinyls;

    @NotNull
    public final SharedFlow<Integer> newVinylCost;

    @NotNull
    public final SharedFlow<List<TuneVinylsObj>> newVinylsList;

    @NotNull
    public final StateFlow<Boolean> newVisibleDialogBox;

    @NotNull
    public final StringResource stringResources;

    @Inject
    public TuningDetailsListViewModel(@NotNull TuningActionWithJSON actionWithJson, @NotNull CostCalculation costCalculation, @NotNull StringResource stringResources, @NotNull LocalNotification localNotification) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        Intrinsics.checkNotNullParameter(costCalculation, "costCalculation");
        Intrinsics.checkNotNullParameter(stringResources, "stringResources");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        this.actionWithJson = actionWithJson;
        this.costCalculation = costCalculation;
        this.stringResources = stringResources;
        this.localNotification = localNotification;
        this.mutableTuneItems = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableGosCost = StateFlowKt.MutableStateFlow(0);
        this.mutableDetailsWithIdAndStatus = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        MutableSharedFlow<List<TuneObj>> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableDetailsList = MutableSharedFlow$default;
        this.newDetailsList = MutableSharedFlow$default;
        MutableStateFlow<List<Integer>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableNewAndOldDetails = MutableStateFlow;
        this.newNewAndOldDetails = MutableStateFlow;
        MutableSharedFlow<List<TuneVinylsObj>> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableVinylsList = MutableSharedFlow$default2;
        this.newVinylsList = MutableSharedFlow$default2;
        MutableStateFlow<List<Integer>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableNewAndOldVinyls = MutableStateFlow2;
        this.newNewAndOldVinyls = MutableStateFlow2;
        MutableStateFlow<Integer> MutableStateFlow3 = StateFlowKt.MutableStateFlow(0);
        this.mutableVinylCost = MutableStateFlow3;
        this.newVinylCost = MutableStateFlow3;
        MutableStateFlow<TuneObj> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.mutableCurrentBox = MutableStateFlow4;
        this.newCurrentBox = MutableStateFlow4;
        MutableStateFlow<List<TuningBoxItemObj>> MutableStateFlow5 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableItemsForBox = MutableStateFlow5;
        this.newItemsForBox = MutableStateFlow5;
        MutableStateFlow<Boolean> MutableStateFlow6 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.mutableVisibleDialogBox = MutableStateFlow6;
        this.newVisibleDialogBox = MutableStateFlow6;
        MutableStateFlow<List<String>> MutableStateFlow7 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableNamePresent = MutableStateFlow7;
        this.newNamePresent = MutableStateFlow7;
        this.mutableAllSelectors = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        MutableSharedFlow<List<TuneGuiNodeObj>> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableAllItemsForSubmenu = MutableSharedFlow$default3;
        this.newAllItemsForSubmenu = MutableSharedFlow$default3;
    }

    @NotNull
    public final SharedFlow<List<TuneObj>> getNewDetailsList() {
        return this.newDetailsList;
    }

    @NotNull
    public final StateFlow<List<Integer>> getNewNewAndOldDetails() {
        return this.newNewAndOldDetails;
    }

    @NotNull
    public final SharedFlow<List<TuneVinylsObj>> getNewVinylsList() {
        return this.newVinylsList;
    }

    @NotNull
    public final StateFlow<List<Integer>> getNewNewAndOldVinyls() {
        return this.newNewAndOldVinyls;
    }

    @NotNull
    public final SharedFlow<Integer> getNewVinylCost() {
        return this.newVinylCost;
    }

    @NotNull
    public final StateFlow<TuneObj> getNewCurrentBox() {
        return this.newCurrentBox;
    }

    @NotNull
    public final StateFlow<List<TuningBoxItemObj>> getNewItemsForBox() {
        return this.newItemsForBox;
    }

    @NotNull
    public final StateFlow<Boolean> getNewVisibleDialogBox() {
        return this.newVisibleDialogBox;
    }

    @NotNull
    public final StateFlow<List<String>> getNewNamePresent() {
        return this.newNamePresent;
    }

    @NotNull
    public final SharedFlow<List<TuneGuiNodeObj>> getNewAllItemsForSubmenu() {
        return this.newAllItemsForSubmenu;
    }

    public final void setCurrentSelector(int selector) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new TuningDetailsListViewModel$setCurrentSelector$1(selector, this, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object newInitDetailsList(int r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$newInitDetailsList$1
            if (r0 == 0) goto L13
            r0 = r7
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$newInitDetailsList$1 r0 = (com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$newInitDetailsList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$newInitDetailsList$1 r0 = new com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$newInitDetailsList$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r7)
            goto L69
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r6 = r0.I$0
            java.lang.Object r2 = r0.L$0
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel r2 = (com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L51
        L3e:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.flow.MutableSharedFlow<java.util.List<java.lang.Integer>> r7 = r5.mutableDetailsWithIdAndStatus
            r0.L$0 = r5
            r0.I$0 = r6
            r0.label = r4
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.first(r7, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            java.util.List r7 = (java.util.List) r7
            java.util.List r6 = r2.getTuneItemsForCurrentSelector(r6)
            java.util.List r6 = r2.setCorrectDetailsListFormatTune(r7, r6)
            kotlinx.coroutines.flow.MutableSharedFlow<java.util.List<com.blackhub.bronline.game.gui.tuning.data.TuneObj>> r7 = r2.mutableDetailsList
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L69
            return r1
        L69:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel.newInitDetailsList(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void initTuneItemsFromJson(@NotNull List<TuneObj> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new TuningDetailsListViewModel$initTuneItemsFromJson$1(this, items, null), 2, null);
    }

    public final void setGosCost(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new TuningDetailsListViewModel$setGosCost$1(jsonObject, this, null), 2, null);
    }

    public final void setDetailsWithIdAndStatus(@Nullable JSONArray jsonArray) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new TuningDetailsListViewModel$setDetailsWithIdAndStatus$1(jsonArray, this, null), 2, null);
    }

    public final List<TuneObj> setCorrectDetailsListFormatTune(List<Integer> listCorrectDetailsWithCostAndStatus, List<TuneObj> detailsItems) {
        ArrayList arrayList = new ArrayList();
        int size = detailsItems.size();
        for (int i = 0; i < size; i++) {
            int id = detailsItems.get(i).getId();
            int i2 = 1;
            if (detailsItems.get(i).getDef() == 1) {
                int i3 = 0;
                while (i3 < listCorrectDetailsWithCostAndStatus.size()) {
                    if (id == listCorrectDetailsWithCostAndStatus.get(i3).intValue()) {
                        if (i2 < listCorrectDetailsWithCostAndStatus.size()) {
                            detailsItems.get(i).setThisLocation(listCorrectDetailsWithCostAndStatus.get(i2).intValue());
                        } else {
                            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                            firebaseCrashlytics.log("idFromList = " + id + ", listCorrectDetailsWithCostAndStatus.size = " + listCorrectDetailsWithCostAndStatus.size() + ", locationPosition = " + i2);
                            firebaseCrashlytics.recordException(new Throwable());
                        }
                    }
                    i3 += 2;
                    i2 += 2;
                }
                detailsItems.get(i).setChecked(false);
                arrayList.add(detailsItems.get(i));
            } else {
                int i4 = 0;
                while (i4 < listCorrectDetailsWithCostAndStatus.size()) {
                    int intValue = listCorrectDetailsWithCostAndStatus.get(i4).intValue();
                    int intValue2 = listCorrectDetailsWithCostAndStatus.get(i2).intValue();
                    if (id == intValue) {
                        detailsItems.get(i).setThisLocation(intValue2);
                        detailsItems.get(i).setChecked(false);
                        arrayList.add(detailsItems.get(i));
                    }
                    i4 += 2;
                    i2 += 2;
                }
            }
        }
        return arrayList;
    }

    public final List<TuneObj> getTuneItemsForCurrentSelector(int selector) {
        ArrayList arrayList = new ArrayList();
        List<TuneObj> value = this.mutableTuneItems.getValue();
        if (!value.isEmpty()) {
            int intValue = this.mutableGosCost.getValue().intValue();
            int size = value.size();
            for (int i = 0; i < size; i++) {
                if (value.get(i).getSelector() == selector) {
                    arrayList.add(value.get(i));
                }
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((TuneObj) arrayList.get(i2)).setCost(this.costCalculation.getDetailPrice(((TuneObj) arrayList.get(i2)).getType(), intValue, ((TuneObj) arrayList.get(i2)).getTuneId()));
            }
        }
        return arrayList;
    }

    public final void sendBuyNewDetail(int detailId) {
        this.actionWithJson.putIntegerDataToServer(7, detailId);
    }

    public final void sendSetDetail(int detailId) {
        if (detailId != -1) {
            this.actionWithJson.putIntegerDataToServer(10, detailId);
            return;
        }
        this.localNotification.showErrorNotification(this.stringResources.tuningError());
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        firebaseCrashlytics.log("sendSetDetail, t = 10, detailId(d) = -1");
        firebaseCrashlytics.recordException(new Throwable());
    }

    public final void updateItemsAfterPurchaseOrSet(@NotNull JSONObject json, int newCurrentStatus) {
        Intrinsics.checkNotNullParameter(json, "json");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new TuningDetailsListViewModel$updateItemsAfterPurchaseOrSet$1(this, json, newCurrentStatus, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateItemStatus(org.json.JSONObject r6, int r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$updateItemStatus$1
            if (r0 == 0) goto L13
            r0 = r8
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$updateItemStatus$1 r0 = (com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$updateItemStatus$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$updateItemStatus$1 r0 = new com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$updateItemStatus$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r8)
            goto L73
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r6 = r0.I$2
            int r7 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$0
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel r4 = (com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel) r4
            kotlin.ResultKt.throwOnFailure(r8)
            goto L67
        L42:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.String r8 = "p"
            int r8 = r6.optInt(r8)
            java.lang.String r2 = "r"
            int r6 = r6.optInt(r2)
            r0.L$0 = r5
            r0.I$0 = r7
            r0.I$1 = r8
            r0.I$2 = r6
            r0.label = r4
            java.lang.Object r2 = r5.updateCurrentDetails(r8, r6, r7, r0)
            if (r2 != r1) goto L64
            return r1
        L64:
            r4 = r5
            r2 = r7
            r7 = r8
        L67:
            r8 = 0
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r6 = r4.updateDetailInfo(r7, r6, r2, r0)
            if (r6 != r1) goto L73
            return r1
        L73:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel.updateItemStatus(org.json.JSONObject, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1 A[EDGE_INSN: B:43:0x00a1->B:33:0x00a1 BREAK  A[LOOP:1: B:27:0x008d->B:42:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateCurrentDetails(int r12, int r13, int r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel.updateCurrentDetails(int, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateDetailInfo(int r10, int r11, int r12, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$updateDetailInfo$1
            if (r0 == 0) goto L13
            r0 = r13
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$updateDetailInfo$1 r0 = (com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$updateDetailInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$updateDetailInfo$1 r0 = new com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$updateDetailInfo$1
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.throwOnFailure(r13)
            goto Lbb
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            int r12 = r0.I$2
            int r11 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r2 = r0.L$0
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel r2 = (com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel) r2
            kotlin.ResultKt.throwOnFailure(r13)
            goto L5a
        L43:
            kotlin.ResultKt.throwOnFailure(r13)
            kotlinx.coroutines.flow.MutableSharedFlow<java.util.List<java.lang.Integer>> r13 = r9.mutableDetailsWithIdAndStatus
            r0.L$0 = r9
            r0.I$0 = r10
            r0.I$1 = r11
            r0.I$2 = r12
            r0.label = r4
            java.lang.Object r13 = kotlinx.coroutines.flow.FlowKt.first(r13, r0)
            if (r13 != r1) goto L59
            return r1
        L59:
            r2 = r9
        L5a:
            java.util.List r13 = (java.util.List) r13
            r5 = 0
            r7 = r4
            r6 = r5
        L5f:
            int r8 = r13.size()
            if (r5 >= r8) goto L9d
            java.lang.Object r8 = r13.get(r5)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 != r10) goto L79
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r12)
            r13.set(r7, r6)
            r6 = r4
        L79:
            java.lang.Object r8 = r13.get(r5)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 != r11) goto L98
            java.lang.Object r8 = r13.get(r7)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 != r3) goto L98
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
            r13.set(r7, r8)
        L98:
            int r5 = r5 + 2
            int r7 = r7 + 2
            goto L5f
        L9d:
            if (r6 != 0) goto Lad
            java.lang.Integer r10 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r10)
            r13.add(r10)
            java.lang.Integer r10 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r12)
            r13.add(r10)
        Lad:
            kotlinx.coroutines.flow.MutableSharedFlow<java.util.List<java.lang.Integer>> r10 = r2.mutableDetailsWithIdAndStatus
            r11 = 0
            r0.L$0 = r11
            r0.label = r3
            java.lang.Object r10 = r10.emit(r13, r0)
            if (r10 != r1) goto Lbb
            return r1
        Lbb:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel.updateDetailInfo(int, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void previewDetail(int detailTuneId) {
        this.actionWithJson.putDetailOrCollapseToClient(22, detailTuneId);
    }

    public final void playSound(int soundTuneId) {
        this.actionWithJson.putSoundToClient(29, soundTuneId);
    }

    public final void resetDetail(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new TuningDetailsListViewModel$resetDetail$1(json, this, null), 2, null);
    }

    public final void initVinyls(@NotNull List<TuneVinylsObj> tuneVinyls) {
        Intrinsics.checkNotNullParameter(tuneVinyls, "tuneVinyls");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new TuningDetailsListViewModel$initVinyls$1(this, tuneVinyls, null), 2, null);
    }

    public final void setStartVinyl(@NotNull String vinylName) {
        Intrinsics.checkNotNullParameter(vinylName, "vinylName");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new TuningDetailsListViewModel$setStartVinyl$1(this, vinylName, null), 2, null);
    }

    public final void resetVinyl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new TuningDetailsListViewModel$resetVinyl$1(this, null), 2, null);
    }

    public final int resetVinyl(List<TuneVinylsObj> allVinyls) {
        Object obj;
        Iterator<T> it = allVinyls.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((TuneVinylsObj) obj).getStartVinyl()) {
                break;
            }
        }
        TuneVinylsObj tuneVinylsObj = (TuneVinylsObj) obj;
        if (tuneVinylsObj == null) {
            return -1;
        }
        tuneVinylsObj.setStartVinyl(false);
        return allVinyls.indexOf(tuneVinylsObj);
    }

    public final int setStartVinyl(List<TuneVinylsObj> allVinyls, String vinylName, Integer vinylId) {
        Object obj;
        boolean z;
        Iterator<T> it = allVinyls.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            TuneVinylsObj tuneVinylsObj = (TuneVinylsObj) obj;
            if (vinylName != null) {
                z = Intrinsics.areEqual(tuneVinylsObj.getNameVinyl(), vinylName);
            } else {
                z = vinylId != null && tuneVinylsObj.getId() == vinylId.intValue();
            }
            if (z) {
                break;
            }
        }
        TuneVinylsObj tuneVinylsObj2 = (TuneVinylsObj) obj;
        if (tuneVinylsObj2 == null) {
            return -1;
        }
        tuneVinylsObj2.setStartVinyl(true);
        return allVinyls.indexOf(tuneVinylsObj2);
    }

    public final void sendBuyVinyl(int vinylId) {
        this.actionWithJson.putIntegerDataToServer(3, vinylId);
    }

    public final void previewVinyl(@NotNull String vinylName) {
        Intrinsics.checkNotNullParameter(vinylName, "vinylName");
        this.actionWithJson.putVinylToClient(25, vinylName);
    }

    public final void updateVinylsAfterEstablished(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new TuningDetailsListViewModel$updateVinylsAfterEstablished$1(this, json, null), 2, null);
    }

    public final void initItemsForBoxList(int carId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new TuningDetailsListViewModel$initItemsForBoxList$1(carId, this, null), 2, null);
    }

    public final void openBox(int boxId) {
        this.actionWithJson.putIntegerDataToServer(11, boxId);
    }

    public final void setNewStatusForDialogBox(boolean newStatus) {
        this.mutableVisibleDialogBox.setValue(Boolean.valueOf(newStatus));
    }

    public final void setNewPresent(@Nullable JSONObject json) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new TuningDetailsListViewModel$setNewPresent$1(json, this, null), 2, null);
    }

    public final void setAllSelectors(@NotNull TuneGuiNodeObj tuningType, int carId) {
        Intrinsics.checkNotNullParameter(tuningType, "tuningType");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new TuningDetailsListViewModel$setAllSelectors$1(this, tuningType, carId, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object initItemsForSubmenu(com.blackhub.bronline.game.gui.tuning.data.TuneGuiNodeObj r7, int r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$initItemsForSubmenu$1
            if (r0 == 0) goto L13
            r0 = r9
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$initItemsForSubmenu$1 r0 = (com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$initItemsForSubmenu$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$initItemsForSubmenu$1 r0 = new com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$initItemsForSubmenu$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L45
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.ResultKt.throwOnFailure(r9)
            goto L8e
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            int r8 = r0.I$0
            java.lang.Object r7 = r0.L$1
            com.blackhub.bronline.game.gui.tuning.data.TuneGuiNodeObj r7 = (com.blackhub.bronline.game.gui.tuning.data.TuneGuiNodeObj) r7
            java.lang.Object r2 = r0.L$0
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel r2 = (com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L80
        L45:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L6d
        L49:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.Integer>> r9 = r6.mutableAllSelectors
            java.lang.Object r9 = r9.getValue()
            java.util.List r9 = (java.util.List) r9
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r5
            if (r2 == 0) goto L70
            java.util.List r7 = r6.lInitItems(r7, r9, r8)
            kotlinx.coroutines.flow.MutableSharedFlow<java.util.List<com.blackhub.bronline.game.gui.tuning.data.TuneGuiNodeObj>> r8 = r6.mutableAllItemsForSubmenu
            r0.label = r5
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L6d
            return r1
        L6d:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L70:
            r0.L$0 = r6
            r0.L$1 = r7
            r0.I$0 = r8
            r0.label = r4
            java.lang.Object r9 = r6.initCurrentSelectors(r0)
            if (r9 != r1) goto L7f
            return r1
        L7f:
            r2 = r6
        L80:
            r9 = 0
            r0.L$0 = r9
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r7 = r2.initItemsForSubmenu(r7, r8, r0)
            if (r7 != r1) goto L8e
            return r1
        L8e:
            com.google.firebase.crashlytics.FirebaseCrashlytics r7 = com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance()
            java.lang.String r8 = "initItemsForSubmenu recursion"
            r7.log(r8)
            com.google.firebase.crashlytics.FirebaseCrashlytics r7 = com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance()
            java.lang.Throwable r8 = new java.lang.Throwable
            r8.<init>()
            r7.recordException(r8)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel.initItemsForSubmenu(com.blackhub.bronline.game.gui.tuning.data.TuneGuiNodeObj, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final List<TuneGuiNodeObj> lInitItems(TuneGuiNodeObj tuningType, List<Integer> allSelectors, int carId) {
        ArrayList arrayList = new ArrayList();
        int size = tuningType.getNames().size();
        for (int i = 0; i < size; i++) {
            int selectorId = tuningType.getNames().get(i).getSelectorId();
            if (tuningType.getNames().get(i).getOpensType() == 2 && selectorId != 2) {
                int size2 = allSelectors.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (selectorId == allSelectors.get(i2).intValue()) {
                        TuneGuiNodeObj tuneGuiNodeObj = tuningType.getNames().get(i);
                        Intrinsics.checkNotNullExpressionValue(tuneGuiNodeObj, "get(...)");
                        arrayList.add(changeIcons(tuneGuiNodeObj, carId, selectorId));
                    }
                }
            } else if (selectorId == 2) {
                int size3 = TuningConstants.INSTANCE.getCarIdWithoutVinyls().size();
                int i3 = 0;
                while (true) {
                    if (i3 < size3) {
                        if (carId == TuningConstants.INSTANCE.getCarIdWithoutVinyls().get(i3).intValue()) {
                            break;
                        }
                        i3++;
                    } else {
                        TuneGuiNodeObj tuneGuiNodeObj2 = tuningType.getNames().get(i);
                        Intrinsics.checkNotNullExpressionValue(tuneGuiNodeObj2, "get(...)");
                        arrayList.add(tuneGuiNodeObj2);
                        break;
                    }
                }
            } else {
                TuneGuiNodeObj tuneGuiNodeObj3 = tuningType.getNames().get(i);
                Intrinsics.checkNotNullExpressionValue(tuneGuiNodeObj3, "get(...)");
                arrayList.add(tuneGuiNodeObj3);
            }
        }
        return arrayList;
    }

    public final TuneGuiNodeObj changeIcons(TuneGuiNodeObj obj, int carId, int selectorId) {
        Iterator<Integer> it = TuningConstants.INSTANCE.getElectronicCars().iterator();
        int i = 0;
        boolean z = false;
        while (it.hasNext()) {
            if (carId == it.next().intValue()) {
                z = true;
            }
        }
        int size = TuningConstants.INSTANCE.getActiveSelectorListForInfoBrake().size();
        while (true) {
            if (i >= size) {
                break;
            }
            TuningConstants tuningConstants = TuningConstants.INSTANCE;
            if (selectorId != tuningConstants.getActiveSelectorListForInfoBrake().get(i).intValue()) {
                i++;
            } else if (z) {
                obj.setName(tuningConstants.getTitleItemForElectronicCars().get(i));
                obj.setImageId(tuningConstants.getResForElectronicCars().get(i));
            } else {
                obj.setName(tuningConstants.getTitleItemsForDVSCars().get(i));
                obj.setImageId(tuningConstants.getResForDVSCars().get(i));
            }
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object initCurrentSelectors(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$initCurrentSelectors$1
            if (r0 == 0) goto L13
            r0 = r5
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$initCurrentSelectors$1 r0 = (com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$initCurrentSelectors$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$initCurrentSelectors$1 r0 = new com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$initCurrentSelectors$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.L$0
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel r0 = (com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L61
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            kotlin.ResultKt.throwOnFailure(r5)
            kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.blackhub.bronline.game.gui.tuning.data.TuneObj>> r5 = r4.mutableTuneItems
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            r2 = r5
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r3
            if (r2 == 0) goto L7f
            java.util.List r2 = r4.getAllSelectorsWithDef1(r5)
            r0.L$0 = r4
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r5 = r4.getCurrentSelectors(r5, r0)
            if (r5 != r1) goto L5f
            return r1
        L5f:
            r0 = r4
            r1 = r2
        L61:
            java.util.List r5 = (java.util.List) r5
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            r2.addAll(r1)
            java.util.Collection r5 = (java.util.Collection) r5
            r2.addAll(r5)
            kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.Integer>> r5 = r0.mutableAllSelectors
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            r5.setValue(r1)
            r0.ifInitSelectors = r3
            goto L95
        L7f:
            com.google.firebase.crashlytics.FirebaseCrashlytics r5 = com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance()
            java.lang.String r0 = "tuneItems empty"
            r5.log(r0)
            com.google.firebase.crashlytics.FirebaseCrashlytics r5 = com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance()
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            r5.recordException(r0)
        L95:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel.initCurrentSelectors(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final List<Integer> getAllSelectorsWithDef1(List<TuneObj> tuneItemsFromJSON) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (TuneObj tuneObj : tuneItemsFromJSON) {
            if (tuneObj.getDef() == 1) {
                linkedHashSet.add(Integer.valueOf(tuneObj.getSelector()));
            }
        }
        return new ArrayList(linkedHashSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getCurrentSelectors(java.util.List<com.blackhub.bronline.game.gui.tuning.data.TuneObj> r7, kotlin.coroutines.Continuation<? super java.util.List<java.lang.Integer>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$getCurrentSelectors$1
            if (r0 == 0) goto L13
            r0 = r8
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$getCurrentSelectors$1 r0 = (com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$getCurrentSelectors$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$getCurrentSelectors$1 r0 = new com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$getCurrentSelectors$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.L$0
            java.util.List r7 = (java.util.List) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L45
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.flow.MutableSharedFlow<java.util.List<java.lang.Integer>> r8 = r6.mutableDetailsWithIdAndStatus
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.first(r8, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            java.util.List r8 = (java.util.List) r8
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            kotlin.jvm.internal.Ref$IntRef r1 = new kotlin.jvm.internal.Ref$IntRef
            r1.<init>()
        L51:
            int r2 = r1.element
            int r3 = r8.size()
            if (r2 >= r3) goto L9b
            r2 = r7
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L60:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L80
            java.lang.Object r3 = r2.next()
            r4 = r3
            com.blackhub.bronline.game.gui.tuning.data.TuneObj r4 = (com.blackhub.bronline.game.gui.tuning.data.TuneObj) r4
            int r4 = r4.getId()
            int r5 = r1.element
            java.lang.Object r5 = r8.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r4 != r5) goto L60
            goto L81
        L80:
            r3 = 0
        L81:
            com.blackhub.bronline.game.gui.tuning.data.TuneObj r3 = (com.blackhub.bronline.game.gui.tuning.data.TuneObj) r3
            if (r3 == 0) goto L94
            int r2 = r3.getSelector()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)
            boolean r2 = r0.add(r2)
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
        L94:
            int r2 = r1.element
            int r2 = r2 + 2
            r1.element = r2
            goto L51
        L9b:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel.getCurrentSelectors(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
