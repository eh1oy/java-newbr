package com.blackhub.bronline.game.gui.holidayevents;

import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsResponse;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsResponse;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
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
/* compiled from: HolidayEventsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$initJson$1", f = "HolidayEventsViewModel.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {376, 377, 378}, m = "invokeSuspend", n = {"currentScreenEnum", "properties", "seasonTimer", "seasonName", "backgroundBitmap", "lastChanceImage", "seasonIcon", "bpOfferImage", "offerImage", "seasonCurrencyBitmap", "gainBitmapImage", "rewardsBitmapImage", "treeImage", "specialCategoryImageBitmap", "dailyCategoryImageBitmap", "myRatingBgImage", "deferredListOfButtons", "rewardsList", "holidayEventsGainBlockData", "listOfGames", "deferredTutorialAttachment", "seasonTimerHeader", "rewardLevel", "gainLevel", "currentProgressOfProgressBar", "dailyCurrencyValue", "bcValue", "isWithPremium", "isNeedToShowLastChance", "seasonColor", "seasonColor2", "shadowColorForEventIcon", "offerCost", "offerValue", "maxProgressOfProgressBar", "buttonPlayText", "currentScreenEnum", "properties", "seasonTimer", "seasonName", "backgroundBitmap", "lastChanceImage", "seasonIcon", "bpOfferImage", "offerImage", "seasonCurrencyBitmap", "gainBitmapImage", "rewardsBitmapImage", "treeImage", "specialCategoryImageBitmap", "dailyCategoryImageBitmap", "myRatingBgImage", "rewardsList", "holidayEventsGainBlockData", "listOfGames", "deferredTutorialAttachment", "seasonTimerHeader", "rewardLevel", "gainLevel", "currentProgressOfProgressBar", "dailyCurrencyValue", "bcValue", "isWithPremium", "isNeedToShowLastChance", "seasonColor", "seasonColor2", "shadowColorForEventIcon", "offerCost", "offerValue", "maxProgressOfProgressBar", "buttonPlayText", "currentScreenEnum", "properties", "seasonTimer", "seasonName", "backgroundBitmap", "lastChanceImage", "seasonIcon", "bpOfferImage", "offerImage", "seasonCurrencyBitmap", "gainBitmapImage", "rewardsBitmapImage", "treeImage", "specialCategoryImageBitmap", "dailyCategoryImageBitmap", "myRatingBgImage", "rewardsList", "holidayEventsGainBlockData", "listOfGames", "seasonTimerHeader", "listOfButtons", "rewardLevel", "gainLevel", "currentProgressOfProgressBar", "dailyCurrencyValue", "bcValue", "isWithPremium", "isNeedToShowLastChance", "seasonColor", "seasonColor2", "shadowColorForEventIcon", "offerCost", "offerValue", "maxProgressOfProgressBar", "buttonPlayText"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "L$20", "L$21", "I$0", "I$1", "I$2", "I$3", "I$4", "Z$0", "Z$1", "J$0", "J$1", "J$2", "I$5", "I$6", "I$7", "I$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "L$20", "I$0", "I$1", "I$2", "I$3", "I$4", "Z$0", "Z$1", "J$0", "J$1", "J$2", "I$5", "I$6", "I$7", "I$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "L$20", "I$0", "I$1", "I$2", "I$3", "I$4", "Z$0", "Z$1", "J$0", "J$1", "J$2", "I$5", "I$6", "I$7", "I$8"})
@SourceDebugExtension({"SMAP\nHolidayEventsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$initJson$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1302:1\n1#2:1303\n1559#3:1304\n1590#3,4:1305\n1549#3:1309\n1620#3,3:1310\n1549#3:1313\n1620#3,3:1314\n230#4,5:1317\n*S KotlinDebug\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$initJson$1\n*L\n234#1:1304\n234#1:1305,4\n290#1:1309\n290#1:1310,3\n359#1:1313\n359#1:1314,3\n379#1:1317,5\n*E\n"})
/* loaded from: classes3.dex */
public final class HolidayEventsViewModel$initJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ BpRewardsResponse $awardsJson;
    public final /* synthetic */ HolidayEventsResponse $holidayEventsJson;
    public final /* synthetic */ JSONObject $jsonObject;
    public final /* synthetic */ List<SkinsDTO> $skinsList;
    public final /* synthetic */ List<VehiclesDTO> $vehiclesList;
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public int I$5;
    public int I$6;
    public int I$7;
    public int I$8;
    public long J$0;
    public long J$1;
    public long J$2;
    public Object L$0;
    public Object L$1;
    public Object L$10;
    public Object L$11;
    public Object L$12;
    public Object L$13;
    public Object L$14;
    public Object L$15;
    public Object L$16;
    public Object L$17;
    public Object L$18;
    public Object L$19;
    public Object L$2;
    public Object L$20;
    public Object L$21;
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
    public final /* synthetic */ HolidayEventsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HolidayEventsViewModel$initJson$1(JSONObject jSONObject, HolidayEventsResponse holidayEventsResponse, HolidayEventsViewModel holidayEventsViewModel, BpRewardsResponse bpRewardsResponse, List<VehiclesDTO> list, List<SkinsDTO> list2, Continuation<? super HolidayEventsViewModel$initJson$1> continuation) {
        super(2, continuation);
        this.$jsonObject = jSONObject;
        this.$holidayEventsJson = holidayEventsResponse;
        this.this$0 = holidayEventsViewModel;
        this.$awardsJson = bpRewardsResponse;
        this.$vehiclesList = list;
        this.$skinsList = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new HolidayEventsViewModel$initJson$1(this.$jsonObject, this.$holidayEventsJson, this.this$0, this.$awardsJson, this.$vehiclesList, this.$skinsList, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((HolidayEventsViewModel$initJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0ac4 A[LOOP:0: B:8:0x09b9->B:10:0x0ac4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0ac1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0972 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0973  */
    /* JADX WARN: Type inference failed for: r1v138, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v91, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r129) {
        /*
            Method dump skipped, instructions count: 2784
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$initJson$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
