package com.blackhub.bronline.game.gui.craft;

import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.blackhub.bronline.game.gui.craft.enums.CraftScreenTypeEnum;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$updateJson$1", f = "CraftViewModel.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {353, 590, 599}, m = "invokeSuspend", n = {"newMap", "money", "id", CatchStreamerKeys.COUNT_KEY, "listOfLevelUpElements", "newMapWithItems", "newMapWithFlattenedItems", "levelOfSkill", "isNeedToShowLevelUpDialog", "queueMax", "quantityInStorage", "storageMax", "quantityInQueue", "percentOfSkill", "listOfLevelUpElements", "newMapWithItems", "listWithStorageItems", "levelOfSkill", "isNeedToShowLevelUpDialog", "queueMax", "quantityInStorage", "storageMax", "quantityInQueue", "percentOfSkill"}, s = {"L$0", "I$0", "I$1", "I$2", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6"})
@SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$updateJson$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 6 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 7 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 8 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n*L\n1#1,1753:1\n1#2:1754\n1360#3:1755\n1446#3,5:1756\n1179#3,2:1761\n1253#3,4:1763\n1238#3,2:1775\n1549#3:1777\n1620#3,2:1778\n1549#3:1780\n1620#3,3:1781\n1622#3:1793\n1241#3:1794\n1549#3:1795\n1620#3,3:1796\n766#3:1804\n857#3,2:1805\n1194#3,2:1852\n1222#3,4:1854\n1238#3,2:1860\n1549#3:1862\n1620#3,2:1863\n1549#3:1865\n1620#3,3:1866\n1622#3:1878\n1241#3:1879\n1238#3,2:1917\n1549#3:1919\n1620#3,2:1920\n1747#3,3:1922\n1622#3:1925\n1241#3:1926\n1194#3,2:1927\n1222#3,4:1929\n1549#3:1933\n1620#3,3:1934\n288#3,2:1937\n33#4,6:1767\n86#4,2:1784\n33#4,6:1786\n88#4:1792\n86#4,2:1869\n33#4,6:1871\n88#4:1877\n453#5:1773\n403#5:1774\n453#5:1858\n403#5:1859\n453#5:1915\n403#5:1916\n230#6,5:1799\n230#6,5:1807\n230#6,5:1812\n230#6,5:1817\n230#6,5:1822\n230#6,5:1880\n230#6,5:1885\n230#6,5:1939\n51#7,5:1827\n56#7,11:1841\n51#7,5:1890\n56#7,11:1904\n8#8,9:1832\n8#8,9:1895\n*S KotlinDebug\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$updateJson$1\n*L\n311#1:1755\n311#1:1756,5\n312#1:1761,2\n312#1:1763,4\n324#1:1775,2\n325#1:1777\n325#1:1778,2\n327#1:1780\n327#1:1781,3\n325#1:1793\n324#1:1794\n355#1:1795\n355#1:1796,3\n413#1:1804\n413#1:1805,2\n465#1:1852,2\n465#1:1854,4\n493#1:1860,2\n494#1:1862\n494#1:1863,2\n496#1:1865\n496#1:1866,3\n494#1:1878\n493#1:1879\n575#1:1917,2\n576#1:1919\n576#1:1920,2\n577#1:1922,3\n576#1:1925\n575#1:1926\n587#1:1927,2\n587#1:1929,4\n591#1:1933\n591#1:1934,3\n601#1:1937,2\n315#1:1767,6\n336#1:1784,2\n336#1:1786,6\n336#1:1792\n502#1:1869,2\n502#1:1871,6\n502#1:1877\n324#1:1773\n324#1:1774\n493#1:1858\n493#1:1859\n575#1:1915\n575#1:1916\n394#1:1799,5\n418#1:1807,5\n426#1:1812,5\n439#1:1817,5\n448#1:1822,5\n517#1:1880,5\n528#1:1885,5\n614#1:1939,5\n464#1:1827,5\n464#1:1841,11\n569#1:1890,5\n569#1:1904,11\n464#1:1832,9\n569#1:1895,9\n*E\n"})
/* loaded from: classes3.dex */
public final class CraftViewModel$updateJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public int I$5;
    public int I$6;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ CraftViewModel this$0;

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: CraftViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CraftScreenTypeEnum.values().length];
            try {
                iArr[CraftScreenTypeEnum.CRAFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CraftScreenTypeEnum.STASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CraftScreenTypeEnum.PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CraftViewModel$updateJson$1(JSONObject jSONObject, CraftViewModel craftViewModel, Continuation<? super CraftViewModel$updateJson$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = craftViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CraftViewModel$updateJson$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CraftViewModel$updateJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:285:0x06e9, code lost:
    
        r13 = r11.copy((r24 & 1) != 0 ? r11.id : 0, (r24 & 2) != 0 ? r11.rarity : null, (r24 & 4) != 0 ? r11.name : null, (r24 & 8) != 0 ? r11.description : null, (r24 & 16) != 0 ? r11.imageName : null, (r24 & 32) != 0 ? r11.imageType : 0, (r24 & 64) != 0 ? r11.count : 0, (r24 & 128) != 0 ? r11.quantityNeeded : 0, (r24 & 256) != 0 ? r11.quantityInStock : r13.getQuantity(), (r24 & 512) != 0 ? r11.isInWork : false, (r24 & 1024) != 0 ? r11.isInStorage : false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0c37, code lost:
    
        r14 = r12.copy((r24 & 1) != 0 ? r12.id : 0, (r24 & 2) != 0 ? r12.rarity : null, (r24 & 4) != 0 ? r12.name : null, (r24 & 8) != 0 ? r12.description : null, (r24 & 16) != 0 ? r12.imageName : null, (r24 & 32) != 0 ? r12.imageType : 0, (r24 & 64) != 0 ? r12.count : 0, (r24 & 128) != 0 ? r12.quantityNeeded : 0, (r24 & 256) != 0 ? r12.quantityInStock : r14.intValue(), (r24 & 512) != 0 ? r12.isInWork : false, (r24 & 1024) != 0 ? r12.isInStorage : false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x03dc, code lost:
    
        r7 = r9.copy((r34 & 1) != 0 ? r9.elementId : 0, (r34 & 2) != 0 ? r9.serverId : 0, (r34 & 4) != 0 ? r9.imageName : null, (r34 & 8) != 0 ? r9.imageType : 0, (r34 & 16) != 0 ? r9.timeUntilItemPreparation : 0, (r34 & 32) != 0 ? r9.preparationTime : 0, (r34 & 64) != 0 ? r9.timeWhenElementCreated : null, (r34 & 128) != 0 ? r9.elementRarity : null, (r34 & 256) != 0 ? r9.elementState : null, (r34 & 512) != 0 ? r9.valueOfPipeline : 0, (r34 & 1024) != 0 ? r9.textBlock : null, (r34 & 2048) != 0 ? r9.componentsList : r7.getComponentsList(), (r34 & 4096) != 0 ? r9.valueOfPercent : 0, (r34 & 8192) != 0 ? r9.valueOfTimer : null, (r34 & 16384) != 0 ? r9.craftingCost : 0, (r34 & 32768) != 0 ? r9.itemCategory : 0);
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0de8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0dfb  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0e39  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0e3c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0df6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0dae  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x034f A[LOOP:7: B:187:0x0349->B:189:0x034f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0389 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0208 A[Catch: Exception -> 0x0210, TRY_LEAVE, TryCatch #0 {Exception -> 0x0210, blocks: (B:229:0x01cc, B:237:0x0208, B:243:0x01f7), top: B:228:0x01cc }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0212 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05fe A[LOOP:12: B:270:0x05f8->B:272:0x05fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0467 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x043e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0d0c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0d9e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r72) {
        /*
            Method dump skipped, instructions count: 3842
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.craft.CraftViewModel$updateJson$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
