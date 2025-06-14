package com.blackhub.bronline.game.gui.cases;

import androidx.compose.ui.text.AnnotatedString;
import com.blackhub.bronline.game.gui.cases.model.BonusRewardWithStatus;
import com.blackhub.bronline.game.gui.cases.model.Case;
import com.blackhub.bronline.game.gui.cases.model.CaseBonus;
import com.blackhub.bronline.game.gui.cases.model.CasePricesModel;
import com.blackhub.bronline.game.gui.cases.model.CaseWithStatusModel;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.cases.CasesResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CasesViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$initInterface$1$deferredTasks$2", f = "CasesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$initInterface$1$deferredTasks$2\n+ 2 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 3 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n*L\n1#1,1945:1\n51#2,5:1946\n56#2,11:1960\n51#2,5:1971\n56#2,11:1985\n8#3,9:1951\n8#3,9:1976\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$initInterface$1$deferredTasks$2\n*L\n300#1:1946,5\n300#1:1960,11\n305#1:1971,5\n305#1:1985,11\n300#1:1951,9\n305#1:1976,9\n*E\n"})
/* loaded from: classes3.dex */
public final class CasesViewModel$initInterface$1$deferredTasks$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Ref.ObjectRef<List<BonusRewardWithStatus>> $arrayBonusRewardsWithStatus;
    public final /* synthetic */ Ref.ObjectRef<List<CaseWithStatusModel>> $arrayCasesWithStatus;
    public final /* synthetic */ List<BpRewardsAwardsDto> $awards;
    public final /* synthetic */ Ref.ObjectRef<AnnotatedString> $bcAmountString;
    public final /* synthetic */ Ref.ObjectRef<CasePricesModel> $casePrices;
    public final /* synthetic */ Ref.ObjectRef<CasePricesModel> $casePricesForGuide;
    public final /* synthetic */ Ref.ObjectRef<List<Case>> $casesList;
    public final /* synthetic */ CasesResponse $casesResponse;
    public final /* synthetic */ Ref.IntRef $dailyCaseId;
    public final /* synthetic */ Ref.ObjectRef<List<Float>> $dpProgress;
    public final /* synthetic */ List<InvItems> $inventoryList;
    public final /* synthetic */ Ref.BooleanRef $isShowingTutorial;
    public final /* synthetic */ JSONObject $json;
    public final /* synthetic */ Ref.IntRef $legendaryCaseId;
    public final /* synthetic */ Ref.ObjectRef<List<CaseBonus>> $selectedBonuses;
    public final /* synthetic */ Ref.ObjectRef<Case> $selectedCase;
    public final /* synthetic */ Ref.IntRef $selectedCaseId;
    public final /* synthetic */ Ref.IntRef $selectedCasePos;
    public final /* synthetic */ Ref.IntRef $selectedIndex;
    public final /* synthetic */ Ref.IntRef $valueOfBc;
    public final /* synthetic */ Ref.IntRef $valueOfCurrentDust;
    public final /* synthetic */ Ref.IntRef $valueOfMaxDust;
    public final /* synthetic */ Ref.IntRef $valueOfOpenedCases;
    public int label;
    public final /* synthetic */ CasesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CasesViewModel$initInterface$1$deferredTasks$2(Ref.IntRef intRef, CasesResponse casesResponse, Ref.IntRef intRef2, Ref.IntRef intRef3, Ref.IntRef intRef4, JSONObject jSONObject, Ref.ObjectRef<AnnotatedString> objectRef, CasesViewModel casesViewModel, Ref.IntRef intRef5, Ref.BooleanRef booleanRef, Ref.IntRef intRef6, Ref.IntRef intRef7, Ref.ObjectRef<List<CaseWithStatusModel>> objectRef2, Ref.ObjectRef<List<BonusRewardWithStatus>> objectRef3, Ref.ObjectRef<List<Case>> objectRef4, List<BpRewardsAwardsDto> list, List<InvItems> list2, Ref.ObjectRef<Case> objectRef5, Ref.IntRef intRef8, Ref.IntRef intRef9, Ref.ObjectRef<List<CaseBonus>> objectRef6, Ref.ObjectRef<CasePricesModel> objectRef7, Ref.ObjectRef<CasePricesModel> objectRef8, Ref.ObjectRef<List<Float>> objectRef9, Continuation<? super CasesViewModel$initInterface$1$deferredTasks$2> continuation) {
        super(2, continuation);
        this.$valueOfMaxDust = intRef;
        this.$casesResponse = casesResponse;
        this.$legendaryCaseId = intRef2;
        this.$dailyCaseId = intRef3;
        this.$valueOfBc = intRef4;
        this.$json = jSONObject;
        this.$bcAmountString = objectRef;
        this.this$0 = casesViewModel;
        this.$valueOfCurrentDust = intRef5;
        this.$isShowingTutorial = booleanRef;
        this.$valueOfOpenedCases = intRef6;
        this.$selectedCaseId = intRef7;
        this.$arrayCasesWithStatus = objectRef2;
        this.$arrayBonusRewardsWithStatus = objectRef3;
        this.$casesList = objectRef4;
        this.$awards = list;
        this.$inventoryList = list2;
        this.$selectedCase = objectRef5;
        this.$selectedIndex = intRef8;
        this.$selectedCasePos = intRef9;
        this.$selectedBonuses = objectRef6;
        this.$casePrices = objectRef7;
        this.$casePricesForGuide = objectRef8;
        this.$dpProgress = objectRef9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CasesViewModel$initInterface$1$deferredTasks$2(this.$valueOfMaxDust, this.$casesResponse, this.$legendaryCaseId, this.$dailyCaseId, this.$valueOfBc, this.$json, this.$bcAmountString, this.this$0, this.$valueOfCurrentDust, this.$isShowingTutorial, this.$valueOfOpenedCases, this.$selectedCaseId, this.$arrayCasesWithStatus, this.$arrayBonusRewardsWithStatus, this.$casesList, this.$awards, this.$inventoryList, this.$selectedCase, this.$selectedIndex, this.$selectedCasePos, this.$selectedBonuses, this.$casePrices, this.$casePricesForGuide, this.$dpProgress, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CasesViewModel$initInterface$1$deferredTasks$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00f6  */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, androidx.compose.ui.text.AnnotatedString] */
    /* JADX WARN: Type inference failed for: r0v32, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v34, types: [T, com.blackhub.bronline.game.gui.cases.model.Case] */
    /* JADX WARN: Type inference failed for: r0v43, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v78, types: [T, com.blackhub.bronline.game.gui.cases.model.CasePricesModel] */
    /* JADX WARN: Type inference failed for: r0v80, types: [T, com.blackhub.bronline.game.gui.cases.model.CasePricesModel] */
    /* JADX WARN: Type inference failed for: r0v82, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [T] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [T] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.cases.CasesViewModel$initInterface$1$deferredTasks$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
