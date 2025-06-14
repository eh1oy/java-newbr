package com.blackhub.bronline.game.gui.craft;

import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.text.ttml.TtmlParser;
import com.blackhub.bronline.game.gui.craft.model.response.CraftJsonCategoryFilter;
import com.blackhub.bronline.game.gui.craft.model.response.CraftJsonItem;
import com.blackhub.bronline.game.gui.craft.model.response.CraftJsonItemCategory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CraftViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$initJson$1", f = "CraftViewModel.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {164, 176, 178, MatroskaExtractor.ID_TRACK_NUMBER}, m = "invokeSuspend", n = {"componentsArray", "mapOfCraftElements", "craftJsonItem", "newItemsIdsList", "levelOfSkill", "percentOfSkill", "quantityInQueue", "queueMax", "quantityInStorage", "storageMax", "workbenchLevel", "valueOfRubles", "isPlayerHasVip", "quantityOfNewItemsInStorage", "isNeedToShowForcedTutorial", "mapOfCraftElements", TtmlParser.ATTR_IMAGE, "levelOfSkill", "percentOfSkill", "quantityInQueue", "queueMax", "quantityInStorage", "storageMax", "workbenchLevel", "valueOfRubles", "isPlayerHasVip", "quantityOfNewItemsInStorage", "isNeedToShowForcedTutorial", "mapOfCraftElements", TtmlParser.ATTR_IMAGE, "listWithStorageItems", "levelOfSkill", "percentOfSkill", "quantityInQueue", "queueMax", "quantityInStorage", "storageMax", "workbenchLevel", "valueOfRubles", "isPlayerHasVip", "quantityOfNewItemsInStorage", "isNeedToShowForcedTutorial", "mapOfCraftElements", TtmlParser.ATTR_IMAGE, "listWithStorageItems", "listWithProductionItems", "filterList", "levelOfSkill", "percentOfSkill", "quantityInQueue", "queueMax", "quantityInStorage", "storageMax", "workbenchLevel", "valueOfRubles", "isPlayerHasVip", "quantityOfNewItemsInStorage", "isNeedToShowForcedTutorial", "isWithIndicationFilter"}, s = {"L$5", "L$6", "L$8", "L$9", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6", "I$7", "Z$0", "I$8", "Z$1", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6", "I$7", "Z$0", "I$8", "Z$1", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6", "I$7", "Z$0", "I$8", "Z$1", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6", "I$7", "Z$0", "I$8", "Z$1", "I$9"})
@SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$initJson$1\n+ 2 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 3 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1753:1\n51#2,5:1754\n56#2,11:1768\n51#2,5:1779\n56#2,11:1793\n8#3,9:1759\n8#3,9:1784\n1855#4,2:1804\n1549#4:1806\n1620#4,2:1807\n1549#4:1809\n1620#4,3:1810\n1622#4:1813\n1747#4,3:1814\n288#4,2:1822\n533#4,6:1824\n11155#5:1817\n11266#5,4:1818\n230#6,5:1830\n*S KotlinDebug\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$initJson$1\n*L\n136#1:1754,5\n136#1:1768,11\n140#1:1779,5\n140#1:1793,11\n136#1:1759,9\n140#1:1784,9\n149#1:1804,2\n179#1:1806\n179#1:1807,2\n180#1:1809\n180#1:1810,3\n179#1:1813\n212#1:1814,3\n247#1:1822,2\n248#1:1824,6\n231#1:1817\n231#1:1818,4\n254#1:1830,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CraftViewModel$initJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ List<CraftJsonCategoryFilter> $craftCategoriesFilterModel;
    public final /* synthetic */ List<CraftJsonItemCategory> $craftCategoriesModel;
    public final /* synthetic */ JSONObject $json;
    public final /* synthetic */ List<CraftJsonItem> $listOfCraftItems;
    public final /* synthetic */ float $vipProbAdd;
    public float F$0;
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public int I$5;
    public int I$6;
    public int I$7;
    public int I$8;
    public int I$9;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public boolean Z$0;
    public boolean Z$1;
    public int label;
    public final /* synthetic */ CraftViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CraftViewModel$initJson$1(JSONObject jSONObject, List<CraftJsonItem> list, CraftViewModel craftViewModel, List<CraftJsonCategoryFilter> list2, List<CraftJsonItemCategory> list3, float f, Continuation<? super CraftViewModel$initJson$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.$listOfCraftItems = list;
        this.this$0 = craftViewModel;
        this.$craftCategoriesFilterModel = list2;
        this.$craftCategoriesModel = list3;
        this.$vipProbAdd = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CraftViewModel$initJson$1(this.$json, this.$listOfCraftItems, this.this$0, this.$craftCategoriesFilterModel, this.$craftCategoriesModel, this.$vipProbAdd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CraftViewModel$initJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0237 A[Catch: Exception -> 0x023f, TRY_LEAVE, TryCatch #1 {Exception -> 0x023f, blocks: (B:134:0x01fb, B:142:0x0237, B:148:0x0226), top: B:133:0x01fb }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0241 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0275 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02bf A[Catch: Exception -> 0x02c7, TRY_LEAVE, TryCatch #6 {Exception -> 0x02c7, blocks: (B:170:0x0283, B:178:0x02bf, B:184:0x02ae), top: B:169:0x0283 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x07b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0795 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x067b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05fd  */
    /* JADX WARN: Type inference failed for: r0v129, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v95, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v62, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x03f8 -> B:93:0x0412). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r79) {
        /*
            Method dump skipped, instructions count: 2191
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.craft.CraftViewModel$initJson$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
