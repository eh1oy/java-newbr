package com.blackhub.bronline.game.gui.tuning.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.core.extension.DoubleExtensionKt;
import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.gui.donate.data.CarColorItem;
import com.blackhub.bronline.game.gui.tuning.CostCalculation;
import com.blackhub.bronline.game.gui.tuning.TuningConstants;
import com.blackhub.bronline.game.gui.tuning.network.TuningActionWithJSON;
import com.caverock.androidsvg.SVGParser;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TuningColorListViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001e\u0010$\u001a\u00020\r2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010&\u001a\u00020\u0011H\u0002J\u0010\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0011H\u0002J\u0016\u0010\u001e\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\rJ&\u0010-\u001a\u00020)2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010,\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020)2\u0006\u0010,\u001a\u00020\rH\u0002J\u000e\u00100\u001a\u00020)2\u0006\u0010,\u001a\u00020\rJ\u000e\u00101\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\u0016\u00102\u001a\u00020\r2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u000e\u00103\u001a\u00020)2\u0006\u0010,\u001a\u00020\rJ\u0010\u00104\u001a\u00020)2\u0006\u00105\u001a\u00020\u0011H\u0002J\u0014\u00106\u001a\u00020)2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0016\u00108\u001a\u00020)2\u0006\u0010(\u001a\u00020\u00112\u0006\u00109\u001a\u00020\rJ\u000e\u0010:\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\u001e\u0010;\u001a\u00020\r2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010,\u001a\u00020\rH\u0002J\u0010\u0010<\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u0016\u0010=\u001a\u00020)2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00110\tH\u0002J\u0010\u0010?\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0011H\u0002J\u0010\u0010@\u001a\u00020\u00112\u0006\u00109\u001a\u00020\rH\u0002J\u001e\u0010A\u001a\u00020\r2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010(\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t0\u0017¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\u0017¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019¨\u0006B"}, d2 = {"Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningColorListViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "actionWithJson", "Lcom/blackhub/bronline/game/gui/tuning/network/TuningActionWithJSON;", "costCalculation", "Lcom/blackhub/bronline/game/gui/tuning/CostCalculation;", "(Lcom/blackhub/bronline/game/gui/tuning/network/TuningActionWithJSON;Lcom/blackhub/bronline/game/gui/tuning/CostCalculation;)V", "lColorItemsFromJson", "", "Lcom/blackhub/bronline/game/gui/donate/data/CarColorItem;", "mutableColorCost", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "mutableColorItems", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "mutableColorObjToBuy", "", "mutableGosCost", "mutableNewAndOldStartColor", "mutableStartColorItems", "mutableValueOfTransparency", "newAndOldStartColor", "Lkotlinx/coroutines/flow/StateFlow;", "getNewAndOldStartColor", "()Lkotlinx/coroutines/flow/StateFlow;", "newColorCost", "getNewColorCost", "newColorItems", "Lkotlinx/coroutines/flow/SharedFlow;", "getNewColorItems", "()Lkotlinx/coroutines/flow/SharedFlow;", "newStartColorItems", "getNewStartColorItems", "newValueOfTransparency", "getNewValueOfTransparency", "changeStartColor", "colorItemsFromJson", "hexColor", "getHexColor", SVGParser.CURRENTCOLOR, "", "jsonObject", "Lorg/json/JSONObject;", "currentSelector", "initColorItems", "(Ljava/util/List;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initGosCost", "initInterface", "initStartColorItems", "resetColorItems", "sendApplyBuyReadyColor", "sendToClientPreviewColor", "finalColor", "setColorItemsFromJson", IFramePlayerOptions.Builder.LIST, "setColorObjToBuy", "valueOfTransparency", "setGosCost", "setStartColor", "setStartColors", "setValueOfTransparency", "startColorItems", "transformColor", "transformTransparency", "updateStartColor", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TuningColorListViewModel extends ViewModel implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final TuningActionWithJSON actionWithJson;

    @NotNull
    public final CostCalculation costCalculation;

    @NotNull
    public List<CarColorItem> lColorItemsFromJson;

    @NotNull
    public final MutableStateFlow<Integer> mutableColorCost;

    @NotNull
    public final MutableSharedFlow<List<CarColorItem>> mutableColorItems;

    @NotNull
    public final MutableStateFlow<String> mutableColorObjToBuy;

    @NotNull
    public final MutableStateFlow<Integer> mutableGosCost;

    @NotNull
    public final MutableStateFlow<List<Integer>> mutableNewAndOldStartColor;

    @NotNull
    public final MutableStateFlow<List<String>> mutableStartColorItems;

    @NotNull
    public final MutableStateFlow<List<Integer>> mutableValueOfTransparency;

    @NotNull
    public final StateFlow<List<Integer>> newAndOldStartColor;

    @NotNull
    public final StateFlow<Integer> newColorCost;

    @NotNull
    public final SharedFlow<List<CarColorItem>> newColorItems;

    @NotNull
    public final StateFlow<List<String>> newStartColorItems;

    @NotNull
    public final StateFlow<List<Integer>> newValueOfTransparency;

    @Inject
    public TuningColorListViewModel(@NotNull TuningActionWithJSON actionWithJson, @NotNull CostCalculation costCalculation) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        Intrinsics.checkNotNullParameter(costCalculation, "costCalculation");
        this.actionWithJson = actionWithJson;
        this.costCalculation = costCalculation;
        this.lColorItemsFromJson = CollectionsKt__CollectionsKt.emptyList();
        this.mutableGosCost = StateFlowKt.MutableStateFlow(0);
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.mutableColorCost = MutableStateFlow;
        this.newColorCost = MutableStateFlow;
        MutableStateFlow<List<String>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableStartColorItems = MutableStateFlow2;
        this.newStartColorItems = MutableStateFlow2;
        MutableSharedFlow<List<CarColorItem>> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableColorItems = MutableSharedFlow$default;
        this.newColorItems = MutableSharedFlow$default;
        MutableStateFlow<List<Integer>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableNewAndOldStartColor = MutableStateFlow3;
        this.newAndOldStartColor = MutableStateFlow3;
        this.mutableColorObjToBuy = StateFlowKt.MutableStateFlow("");
        MutableStateFlow<List<Integer>> MutableStateFlow4 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableValueOfTransparency = MutableStateFlow4;
        this.newValueOfTransparency = MutableStateFlow4;
    }

    @NotNull
    public final StateFlow<Integer> getNewColorCost() {
        return this.newColorCost;
    }

    @NotNull
    public final StateFlow<List<String>> getNewStartColorItems() {
        return this.newStartColorItems;
    }

    @NotNull
    public final SharedFlow<List<CarColorItem>> getNewColorItems() {
        return this.newColorItems;
    }

    @NotNull
    public final StateFlow<List<Integer>> getNewAndOldStartColor() {
        return this.newAndOldStartColor;
    }

    @NotNull
    public final StateFlow<List<Integer>> getNewValueOfTransparency() {
        return this.newValueOfTransparency;
    }

    public final void setColorItemsFromJson(@NotNull List<CarColorItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.lColorItemsFromJson = list;
    }

    public final void setGosCost(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.mutableGosCost.setValue(Integer.valueOf(jsonObject.optInt("j")));
    }

    public final void getNewColorItems(@NotNull JSONObject jsonObject, int currentSelector) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new TuningColorListViewModel$getNewColorItems$1(this, jsonObject, currentSelector, null), 2, null);
    }

    public final void initStartColorItems(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new TuningColorListViewModel$initStartColorItems$1(this, jsonObject, null), 2, null);
    }

    public final void setStartColors(JSONObject jsonObject) {
        if (jsonObject.optJSONArray("a") != null) {
            JSONArray optJSONArray = jsonObject.optJSONArray("a");
            Intrinsics.checkNotNull(optJSONArray);
            List<String> mutableStringList = JsonArrayExtensionKt.toMutableStringList(optJSONArray);
            setValueOfTransparency(mutableStringList);
            this.mutableStartColorItems.setValue(mutableStringList);
        }
    }

    public final void initInterface(int currentSelector) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new TuningColorListViewModel$initInterface$1(this, currentSelector, null), 2, null);
    }

    public final void initGosCost(int currentSelector) {
        this.mutableColorCost.setValue(Integer.valueOf(this.costCalculation.setCost(currentSelector, this.mutableGosCost.getValue().intValue())));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object initColorItems(java.util.List<com.blackhub.bronline.game.gui.donate.data.CarColorItem> r5, int r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel$initColorItems$1
            if (r0 == 0) goto L13
            r0 = r7
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel$initColorItems$1 r0 = (com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel$initColorItems$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel$initColorItems$1 r0 = new com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel$initColorItems$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r5 = r0.I$1
            int r6 = r0.I$0
            java.lang.Object r0 = r0.L$0
            com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel r0 = (com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L5a
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.ResultKt.throwOnFailure(r7)
            if (r5 == 0) goto L6f
            int r7 = r4.resetColorItems(r5)
            int r6 = r4.setStartColor(r5, r6)
            kotlinx.coroutines.flow.MutableSharedFlow<java.util.List<com.blackhub.bronline.game.gui.donate.data.CarColorItem>> r2 = r4.mutableColorItems
            r0.L$0 = r4
            r0.I$0 = r7
            r0.I$1 = r6
            r0.label = r3
            java.lang.Object r5 = r2.emit(r5, r0)
            if (r5 != r1) goto L57
            return r1
        L57:
            r0 = r4
            r5 = r6
            r6 = r7
        L5a:
            kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.Integer>> r7 = r0.mutableNewAndOldStartColor
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r5)
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r6)
            java.lang.Integer[] r5 = new java.lang.Integer[]{r5, r6}
            java.util.List r5 = kotlin.collections.CollectionsKt__CollectionsKt.listOf(r5)
            r7.setValue(r5)
        L6f:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel.initColorItems(java.util.List, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final int resetColorItems(List<CarColorItem> colorItemsFromJson) {
        Object obj;
        Object obj2;
        List<CarColorItem> list = colorItemsFromJson;
        Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((CarColorItem) obj2).getSelected()) {
                break;
            }
        }
        CarColorItem carColorItem = (CarColorItem) obj2;
        if (carColorItem != null) {
            carColorItem.setSelected(false);
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((CarColorItem) next).getStartColor()) {
                obj = next;
                break;
            }
        }
        CarColorItem carColorItem2 = (CarColorItem) obj;
        if (carColorItem2 == null) {
            return -1;
        }
        carColorItem2.setStartColor(false);
        return colorItemsFromJson.indexOf(carColorItem2);
    }

    public final int setStartColor(List<CarColorItem> colorItemsFromJson, int currentSelector) {
        List<String> value = this.mutableStartColorItems.getValue();
        if (value.size() <= currentSelector) {
            return -1;
        }
        if (currentSelector == 0) {
            return updateStartColor(colorItemsFromJson, value.get(0));
        }
        if (currentSelector != 1) {
            if (currentSelector == 3) {
                return updateStartColor(colorItemsFromJson, value.get(2));
            }
            if (currentSelector == 4) {
                return updateStartColor(colorItemsFromJson, value.get(3));
            }
            if (currentSelector != 32) {
                switch (currentSelector) {
                    case 10:
                        return updateStartColor(colorItemsFromJson, value.get(4));
                    case 11:
                        return updateStartColor(colorItemsFromJson, value.get(5));
                    case 12:
                        return updateStartColor(colorItemsFromJson, value.get(6));
                    case 13:
                        return updateStartColor(colorItemsFromJson, value.get(7));
                    default:
                        return -1;
                }
            }
        }
        return updateStartColor(colorItemsFromJson, value.get(1));
    }

    public final int updateStartColor(List<CarColorItem> colorItemsFromJson, String currentColor) {
        return changeStartColor(colorItemsFromJson, getHexColor(currentColor));
    }

    public final String getHexColor(String currentColor) {
        int length = currentColor.length();
        if (length == 1) {
            currentColor = "000000";
        } else if (length == 3) {
            currentColor = currentColor + currentColor;
        } else if (length == 7) {
            currentColor = currentColor.substring(1);
            Intrinsics.checkNotNullExpressionValue(currentColor, "substring(...)");
        } else if (length == 8) {
            currentColor = currentColor.substring(2);
            Intrinsics.checkNotNullExpressionValue(currentColor, "substring(...)");
        }
        return "#" + (Intrinsics.areEqual(currentColor, "0") ? "000000" : currentColor);
    }

    public final int changeStartColor(List<CarColorItem> colorItemsFromJson, String hexColor) {
        Object obj;
        if (!colorItemsFromJson.isEmpty()) {
            Iterator<T> it = colorItemsFromJson.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((CarColorItem) obj).getColor(), hexColor)) {
                    break;
                }
            }
            CarColorItem carColorItem = (CarColorItem) obj;
            if (carColorItem != null) {
                carColorItem.setStartColor(true);
                return colorItemsFromJson.indexOf(carColorItem);
            }
        }
        return -1;
    }

    public final void setValueOfTransparency(List<String> startColorItems) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (String str2 : startColorItems) {
            int length = str2.length();
            int i = 0;
            if (length == 7) {
                String substring = str2.substring(0, 1);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                str = "0" + ((Object) substring);
            } else if (length == 8) {
                str = str2.substring(0, 2);
                Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
            } else {
                str = "00";
            }
            int roundToIntSafely = 100 - DoubleExtensionKt.roundToIntSafely(Double.valueOf(((Integer.valueOf(Integer.parseInt(str, CharsKt__CharJVMKt.checkRadix(16))).doubleValue() - 96.0d) * 100.0d) / 159.0d).doubleValue());
            if (roundToIntSafely >= 0) {
                i = roundToIntSafely > 100 ? 100 : roundToIntSafely;
            }
            arrayList.add(Integer.valueOf(i));
        }
        this.mutableValueOfTransparency.setValue(arrayList);
    }

    public final void setColorObjToBuy(@NotNull String currentColor, int valueOfTransparency) {
        Intrinsics.checkNotNullParameter(currentColor, "currentColor");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TuningColorListViewModel$setColorObjToBuy$1(this, valueOfTransparency, currentColor, null), 3, null);
    }

    public final String transformTransparency(int valueOfTransparency) {
        if (valueOfTransparency != -1) {
            String hexString = Integer.toHexString(((valueOfTransparency * 159) / 100) + 96);
            Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(...)");
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String upperCase = hexString.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (upperCase.length() != 1) {
                return upperCase;
            }
            return "0" + upperCase;
        }
        return TuningConstants.DEFAULT_TRANSPARENCY;
    }

    public final String transformColor(String currentColor) {
        if (!StringsKt__StringsJVMKt.startsWith$default(currentColor, "#", false, 2, null)) {
            return currentColor;
        }
        String substring = currentColor.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final void sendToClientPreviewColor(String finalColor) {
        this.actionWithJson.putColorToClient(23, finalColor);
    }

    public final void sendApplyBuyReadyColor(int currentSelector) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new TuningColorListViewModel$sendApplyBuyReadyColor$1(this, currentSelector, null), 2, null);
    }
}
