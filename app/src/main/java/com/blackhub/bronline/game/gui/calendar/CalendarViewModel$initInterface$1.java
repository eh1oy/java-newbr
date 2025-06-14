package com.blackhub.bronline.game.gui.calendar;

import android.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.media3.common.C;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState;
import com.blackhub.bronline.game.gui.calendar.model.CalendarBonusRewardState;
import com.blackhub.bronline.game.gui.calendar.model.CalendarScreenType;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.calendar.CalendarPropertiesDto;
import com.blackhub.bronline.game.model.remote.response.calendar.CalendarResponse;
import com.blackhub.bronline.game.model.remote.response.calendar.CalendarRewardsDto;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CalendarViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.calendar.CalendarViewModel$initInterface$1", f = "CalendarViewModel.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {MatroskaExtractor.ID_CUE_CLUSTER_POSITION}, m = "invokeSuspend", n = {"seasonName", "comebackSeasonName", "bgOfEventBitmapName", "icOfEventBitmapName", "comeBackSubtitle", "bgComeBackCalendarName", "icComeBackCalendarName", "rewardPosWithTimer", "mainRewards", "comeBackMainRewards", "lastOpenedMainReward", "lastOpenedComeBackMainReward", "bonusRewards", "comeBackBonusRewards", "lastOpenedBonusReward", "lastOpenedComeBackBonusReward", "seasonColor", "textSeasonFirstColor", "textSeasonSecondColor", "totalDaysMain", "totalDaysComeBack", "isShowingNewSeasonBpState", "isShowingTutorialState", "daysForEndSeasonMain", "daysForEndSeasonComeBack", "secondsForNewDay", "secondsForReward", "isAllRewardsReceived", "mainDaysGame", "comeBackDaysGame", "minLevel", "currentLevel", "isFinishedSeason"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "J$0", "J$1", "J$2", "I$0", "I$1", "Z$0", "Z$1", "I$2", "I$3", "I$4", "I$5", "I$6", "I$7", "I$8", "I$9", "I$10", "Z$2"})
@SourceDebugExtension({"SMAP\nCalendarViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarViewModel.kt\ncom/blackhub/bronline/game/gui/calendar/CalendarViewModel$initInterface$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,899:1\n1747#2,3:900\n1747#2,3:903\n1747#2,3:906\n1747#2,3:909\n230#3,5:912\n*S KotlinDebug\n*F\n+ 1 CalendarViewModel.kt\ncom/blackhub/bronline/game/gui/calendar/CalendarViewModel$initInterface$1\n*L\n243#1:900,3\n245#1:903,3\n249#1:906,3\n251#1:909,3\n271#1:912,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CalendarViewModel$initInterface$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ CalendarResponse $calendarInfo;
    public final /* synthetic */ JSONObject $json;
    public final /* synthetic */ List<BpRewardsAwardsDto> $listOfAwardsTypes;
    public final /* synthetic */ CalendarScreenType $savedPage;
    public final /* synthetic */ List<SkinsDTO> $skinsList;
    public final /* synthetic */ List<VehiclesDTO> $vehiclesList;
    public int I$0;
    public int I$1;
    public int I$10;
    public int I$2;
    public int I$3;
    public int I$4;
    public int I$5;
    public int I$6;
    public int I$7;
    public int I$8;
    public int I$9;
    public long J$0;
    public long J$1;
    public long J$2;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$10;
    public Object L$11;
    public Object L$12;
    public Object L$13;
    public Object L$14;
    public Object L$15;
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
    public boolean Z$2;
    public int label;
    public final /* synthetic */ CalendarViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarViewModel$initInterface$1(CalendarResponse calendarResponse, JSONObject jSONObject, CalendarScreenType calendarScreenType, CalendarViewModel calendarViewModel, List<VehiclesDTO> list, List<SkinsDTO> list2, List<BpRewardsAwardsDto> list3, Continuation<? super CalendarViewModel$initInterface$1> continuation) {
        super(2, continuation);
        this.$calendarInfo = calendarResponse;
        this.$json = jSONObject;
        this.$savedPage = calendarScreenType;
        this.this$0 = calendarViewModel;
        this.$vehiclesList = list;
        this.$skinsList = list2;
        this.$listOfAwardsTypes = list3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        CalendarViewModel$initInterface$1 calendarViewModel$initInterface$1 = new CalendarViewModel$initInterface$1(this.$calendarInfo, this.$json, this.$savedPage, this.this$0, this.$vehiclesList, this.$skinsList, this.$listOfAwardsTypes, continuation);
        calendarViewModel$initInterface$1.L$0 = obj;
        return calendarViewModel$initInterface$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CalendarViewModel$initInterface$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r5v23, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v25, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Deferred async$default;
        Deferred async$default2;
        Deferred async$default3;
        Deferred async$default4;
        Deferred async$default5;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        int i;
        Ref.ObjectRef objectRef3;
        String str;
        Ref.IntRef intRef;
        String str2;
        Ref.ObjectRef objectRef4;
        Ref.IntRef intRef2;
        String str3;
        Ref.IntRef intRef3;
        int i2;
        Ref.IntRef intRef4;
        boolean z;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        long j;
        long j2;
        long j3;
        String str4;
        String str5;
        int i11;
        String str6;
        String str7;
        Ref.IntRef intRef5;
        String str8;
        boolean z4;
        boolean z5;
        boolean z6;
        CalendarUiState m6879copySbi3iaU;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            CalendarPropertiesDto properties = this.$calendarInfo.getProperties();
            List list = (List) UtilsKt.buildTypeMerge(this.$calendarInfo.getMainDays(), this.$calendarInfo.getMainDaysStore());
            List list2 = (List) UtilsKt.buildTypeMerge(this.$calendarInfo.getBonusDays(), this.$calendarInfo.getBonusDaysStore());
            List<CalendarRewardsDto> comeBackMainDays = this.$calendarInfo.getComeBackMainDays();
            List<CalendarRewardsDto> comeBackBonusDays = this.$calendarInfo.getComeBackBonusDays();
            long Color = ColorKt.Color(Color.parseColor(properties.getSeasonColor()));
            long Color2 = ColorKt.Color(Color.parseColor(properties.getDaysColorOne()));
            long Color3 = ColorKt.Color(Color.parseColor(properties.getDaysColorTwo()));
            String seasonName = properties.getSeasonName();
            String returnName = properties.getReturnName();
            int seasonDays = properties.getSeasonDays();
            int returnDays = properties.getReturnDays();
            String bgSeasonCalendar = properties.getBgSeasonCalendar();
            String icSeasonCalendar = properties.getIcSeasonCalendar();
            String returnSubtitle = properties.getReturnSubtitle();
            String bgComeBackCalendar = properties.getBgComeBackCalendar();
            String icComeBackCalendar = properties.getIcComeBackCalendar();
            boolean isOne = IntExtensionKt.isOne(Boxing.boxInt(this.$json.optInt("bn")));
            boolean isOne2 = IntExtensionKt.isOne(Boxing.boxInt(this.$json.optInt("i")));
            JSONArray optJSONArray = this.$json.optJSONArray("ml");
            List<Integer> mutableIntList = optJSONArray != null ? JsonArrayExtensionKt.toMutableIntList(optJSONArray) : null;
            if (mutableIntList == null) {
                mutableIntList = CollectionsKt__CollectionsKt.emptyList();
            }
            JSONArray optJSONArray2 = this.$json.optJSONArray(CalendarKeys.COME_BACK_STATUS_MAIN_REWARDS_KEY);
            List<Integer> mutableIntList2 = optJSONArray2 != null ? JsonArrayExtensionKt.toMutableIntList(optJSONArray2) : null;
            int optInt = this.$json.optInt("d");
            int optInt2 = this.$json.optInt(CalendarKeys.COME_BACK_DAYS_FOR_END_SEASON_KEY);
            int optInt3 = this.$json.optInt(CalendarKeys.SECONDS_FOR_NEW_DAY_KEY);
            int optInt4 = this.$json.optInt("tp");
            int i13 = optInt4 == -1 ? 1 : 0;
            int optInt5 = this.$json.optInt(CalendarKeys.DAYS_GAME_KEY);
            int optInt6 = this.$json.optInt(CalendarKeys.COME_BACK_DAYS_GAME_KEY);
            int optInt7 = this.$json.optInt("pl");
            int optInt8 = this.$json.optInt("lv");
            boolean isZero = IntExtensionKt.isZero(Boxing.boxInt(optInt));
            Ref.IntRef intRef6 = new Ref.IntRef();
            Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
            objectRef5.element = CollectionsKt__CollectionsKt.emptyList();
            Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
            objectRef6.element = CollectionsKt__CollectionsKt.emptyList();
            Ref.IntRef intRef7 = new Ref.IntRef();
            Ref.IntRef intRef8 = new Ref.IntRef();
            Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
            objectRef7.element = CollectionsKt__CollectionsKt.emptyList();
            Ref.ObjectRef objectRef8 = new Ref.ObjectRef();
            objectRef8.element = CollectionsKt__CollectionsKt.emptyList();
            Ref.IntRef intRef9 = new Ref.IntRef();
            Ref.IntRef intRef10 = new Ref.IntRef();
            int i14 = i13;
            async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CalendarViewModel$initInterface$1$deferredTasks$1(intRef6, this.this$0, mutableIntList, null), 3, null);
            async$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CalendarViewModel$initInterface$1$deferredTasks$2(objectRef5, this.this$0, optInt7, mutableIntList, list, this.$vehiclesList, this.$skinsList, this.$listOfAwardsTypes, intRef7, null), 3, null);
            async$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CalendarViewModel$initInterface$1$deferredTasks$3(objectRef6, mutableIntList2, intRef8, this.this$0, optInt7, comeBackMainDays, this.$vehiclesList, this.$skinsList, this.$listOfAwardsTypes, null), 3, null);
            async$default4 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CalendarViewModel$initInterface$1$deferredTasks$4(objectRef7, this.this$0, optInt7, this.$json, list2, this.$vehiclesList, this.$skinsList, this.$listOfAwardsTypes, intRef9, null), 3, null);
            async$default5 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CalendarViewModel$initInterface$1$deferredTasks$5(objectRef8, this.$json, intRef10, this.this$0, optInt7, comeBackBonusDays, this.$vehiclesList, this.$skinsList, this.$listOfAwardsTypes, null), 3, null);
            List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Deferred[]{async$default, async$default2, async$default3, async$default4, async$default5});
            this.L$0 = seasonName;
            this.L$1 = returnName;
            this.L$2 = bgSeasonCalendar;
            this.L$3 = icSeasonCalendar;
            this.L$4 = returnSubtitle;
            this.L$5 = bgComeBackCalendar;
            this.L$6 = icComeBackCalendar;
            this.L$7 = intRef6;
            this.L$8 = objectRef5;
            objectRef = objectRef6;
            this.L$9 = objectRef;
            this.L$10 = intRef7;
            this.L$11 = intRef8;
            objectRef2 = objectRef7;
            this.L$12 = objectRef2;
            this.L$13 = objectRef8;
            this.L$14 = intRef9;
            this.L$15 = intRef10;
            this.J$0 = Color;
            this.J$1 = Color2;
            this.J$2 = Color3;
            this.I$0 = seasonDays;
            this.I$1 = returnDays;
            this.Z$0 = isOne;
            this.Z$1 = isOne2;
            this.I$2 = optInt;
            this.I$3 = optInt2;
            this.I$4 = optInt3;
            this.I$5 = optInt4;
            this.I$6 = i14;
            this.I$7 = optInt5;
            this.I$8 = optInt6;
            this.I$9 = optInt7;
            this.I$10 = optInt8;
            this.Z$2 = isZero;
            this.label = 1;
            if (AwaitKt.awaitAll(listOf, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i = returnDays;
            objectRef3 = objectRef8;
            str = icComeBackCalendar;
            intRef = intRef6;
            str2 = returnSubtitle;
            objectRef4 = objectRef5;
            intRef2 = intRef7;
            str3 = bgComeBackCalendar;
            intRef3 = intRef10;
            i2 = optInt7;
            intRef4 = intRef9;
            z = isOne;
            z2 = isOne2;
            i3 = i14;
            z3 = isZero;
            i4 = optInt;
            i5 = optInt2;
            i6 = optInt3;
            i7 = optInt4;
            i8 = optInt5;
            i9 = optInt6;
            i10 = optInt8;
            j = Color3;
            j2 = Color2;
            j3 = Color;
            str4 = icSeasonCalendar;
            str5 = bgSeasonCalendar;
            i11 = seasonDays;
            str6 = returnName;
            str7 = seasonName;
            intRef5 = intRef8;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z7 = this.Z$2;
            int i15 = this.I$10;
            int i16 = this.I$9;
            int i17 = this.I$8;
            int i18 = this.I$7;
            int i19 = this.I$6;
            int i20 = this.I$5;
            int i21 = this.I$4;
            int i22 = this.I$3;
            int i23 = this.I$2;
            boolean z8 = this.Z$1;
            boolean z9 = this.Z$0;
            int i24 = this.I$1;
            int i25 = this.I$0;
            long j4 = this.J$2;
            long j5 = this.J$1;
            long j6 = this.J$0;
            intRef3 = (Ref.IntRef) this.L$15;
            Ref.IntRef intRef11 = (Ref.IntRef) this.L$14;
            objectRef3 = (Ref.ObjectRef) this.L$13;
            Ref.ObjectRef objectRef9 = (Ref.ObjectRef) this.L$12;
            Ref.IntRef intRef12 = (Ref.IntRef) this.L$11;
            Ref.IntRef intRef13 = (Ref.IntRef) this.L$10;
            Ref.ObjectRef objectRef10 = (Ref.ObjectRef) this.L$9;
            Ref.ObjectRef objectRef11 = (Ref.ObjectRef) this.L$8;
            Ref.IntRef intRef14 = (Ref.IntRef) this.L$7;
            String str9 = (String) this.L$6;
            String str10 = (String) this.L$5;
            String str11 = (String) this.L$4;
            String str12 = (String) this.L$3;
            String str13 = (String) this.L$2;
            String str14 = (String) this.L$1;
            String str15 = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
            i10 = i15;
            i2 = i16;
            i9 = i17;
            i8 = i18;
            i3 = i19;
            i7 = i20;
            i6 = i21;
            i5 = i22;
            i4 = i23;
            z2 = z8;
            z = z9;
            i = i24;
            z3 = z7;
            i11 = i25;
            j = j4;
            j2 = j5;
            j3 = j6;
            intRef4 = intRef11;
            objectRef2 = objectRef9;
            intRef5 = intRef12;
            intRef2 = intRef13;
            objectRef = objectRef10;
            intRef = intRef14;
            str = str9;
            str3 = str10;
            str2 = str11;
            str4 = str12;
            str5 = str13;
            str6 = str14;
            str7 = str15;
            objectRef4 = objectRef11;
        }
        Iterable iterable = (Iterable) objectRef4.element;
        String str16 = str3;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                CommonRewardModel commonRewardModel = (CommonRewardModel) it.next();
                Iterator it2 = it;
                str8 = str4;
                if (commonRewardModel.getMainRewardState() == CommonRewardState.NORM_AVAILABLE || commonRewardModel.getMainRewardState() == CommonRewardState.EPIC_AVAILABLE_NORW_LEVEL) {
                    break;
                }
                it = it2;
                str4 = str8;
            }
        }
        str8 = str4;
        Iterable iterable2 = (Iterable) objectRef2.element;
        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
            Iterator it3 = iterable2.iterator();
            while (it3.hasNext()) {
                if (((CommonRewardModel) it3.next()).getBonusRewardState() == CalendarBonusRewardState.AVAILABLE_NORM_LEVEL) {
                    z4 = true;
                }
            }
        }
        z4 = false;
        Iterable iterable3 = (Iterable) objectRef.element;
        if (!(iterable3 instanceof Collection) || !((Collection) iterable3).isEmpty()) {
            Iterator it4 = iterable3.iterator();
            while (it4.hasNext()) {
                CommonRewardModel commonRewardModel2 = (CommonRewardModel) it4.next();
                Iterator it5 = it4;
                z5 = z4;
                if (commonRewardModel2.getMainRewardState() == CommonRewardState.NORM_AVAILABLE || commonRewardModel2.getMainRewardState() == CommonRewardState.EPIC_AVAILABLE_NORW_LEVEL) {
                    break;
                }
                it4 = it5;
                z4 = z5;
            }
        }
        z5 = z4;
        Iterable iterable4 = (Iterable) objectRef3.element;
        if (!(iterable4 instanceof Collection) || !((Collection) iterable4).isEmpty()) {
            Iterator it6 = iterable4.iterator();
            while (it6.hasNext()) {
                if (((CommonRewardModel) it6.next()).getBonusRewardState() == CalendarBonusRewardState.AVAILABLE_NORM_LEVEL) {
                    z6 = true;
                }
            }
        }
        z6 = false;
        boolean z10 = (((Collection) objectRef.element).isEmpty() ^ true) && (((Collection) objectRef3.element).isEmpty() ^ true);
        CalendarScreenType calendarScreenType = this.$savedPage;
        boolean z11 = z6;
        if (calendarScreenType == CalendarScreenType.NONE) {
            if (z10) {
                calendarScreenType = CalendarScreenType.COME_BACK;
            } else {
                calendarScreenType = CalendarScreenType.MAIN;
            }
        } else if (!z10) {
            calendarScreenType = CalendarScreenType.MAIN;
        }
        MutableStateFlow<? extends CalendarUiState> mutableStateFlow = this.this$0.get_uiState();
        while (true) {
            CalendarUiState value = mutableStateFlow.getValue();
            Ref.IntRef intRef15 = intRef;
            Ref.ObjectRef objectRef12 = objectRef4;
            Ref.ObjectRef objectRef13 = objectRef3;
            Ref.IntRef intRef16 = intRef5;
            m6879copySbi3iaU = r16.m6879copySbi3iaU((r72 & 1) != 0 ? r16.isInitInterface : true, (r72 & 2) != 0 ? r16.nameOfEvent : str7, (r72 & 4) != 0 ? r16.nameOfComebackEvent : str6, (r72 & 8) != 0 ? r16.bgOfEventBitmapName : str5, (r72 & 16) != 0 ? r16.icOfEventBitmapName : str8, (r72 & 32) != 0 ? r16.bgComeBackEventBitmapName : str16, (r72 & 64) != 0 ? r16.icComeBackEventBitmapName : str, (r72 & 128) != 0 ? r16.colorOfEvent : j3, (r72 & 256) != 0 ? r16.textSeasonFirstColor : j2, (r72 & 512) != 0 ? r16.textSeasonSecondColor : j, (r72 & 1024) != 0 ? r16.isNeedShowAllRewards : false, (r72 & 2048) != 0 ? r16.isNeedShowRewardDialog : false, (r72 & 4096) != 0 ? r16.itemForPreviewDialog : null, (r72 & 8192) != 0 ? r16.posItemForPreviewDialog : 0, (r72 & 16384) != 0 ? r16.rewardList : 0, (r72 & 32768) != 0 ? r16.isNeedGetReward : false, (r72 & 65536) != 0 ? r16.daysForEndSeasonMain : i4, (r72 & 131072) != 0 ? r16.daysForEndSeasonComeBack : i5, (r72 & 262144) != 0 ? r16.secondsForNewDay : i6, (r72 & 524288) != 0 ? r16.secondsForReward : i7, (r72 & 1048576) != 0 ? r16.minRewardLevel : i2, (r72 & 2097152) != 0 ? r16.currentLevel : i10, (r72 & 4194304) != 0 ? r16.minComeBackRewardLevel : 0, (r72 & 8388608) != 0 ? r16.mainDaysGame : i8, (r72 & 16777216) != 0 ? r16.comeBackDaysGame : i9, (r72 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r16.rewardIndexWithTimer : intRef.element, (r72 & 67108864) != 0 ? r16.comeBackSubtitle : str2, (r72 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r16.totalDaysMain : i11, (r72 & 268435456) != 0 ? r16.totalDaysComeBack : i, (r72 & 536870912) != 0 ? r16.selectedPage : calendarScreenType, (r72 & 1073741824) != 0 ? r16.mainRewardsList : (List) objectRef4.element, (r72 & Integer.MIN_VALUE) != 0 ? r16.bonusRewardsList : (List) objectRef2.element, (r73 & 1) != 0 ? r16.comeBackMainRewardsList : (List) objectRef.element, (r73 & 2) != 0 ? r16.comeBackBonusRewardsList : (List) objectRef3.element, (r73 & 4) != 0 ? r16.lastOpenedMainReward : intRef2.element, (r73 & 8) != 0 ? r16.lastOpenedBonusReward : intRef4.element, (r73 & 16) != 0 ? r16.lastOpenedComeBackMainReward : intRef5.element, (r73 & 32) != 0 ? r16.lastOpenedComeBackBonusReward : intRef3.element, (r73 & 64) != 0 ? r16.isNeedToShowComebackButton : z10, (r73 & 128) != 0 ? r16.isNeedToShowNotificationMain : z5, (r73 & 256) != 0 ? r16.isNeedToShowNotificationComeBack : z11, (r73 & 512) != 0 ? r16.isFinishedSeason : z3, (r73 & 1024) != 0 ? r16.isAllRewardsReceived : i3 != 0, (r73 & 2048) != 0 ? r16.isShowingNewSeasonBp : z, (r73 & 4096) != 0 ? r16.isNeedShowingBpLottieAnimation : z, (r73 & 8192) != 0 ? r16.isShowingTutorial : z2, (r73 & 16384) != 0 ? r16.isShowingMainTutorial : z2, (r73 & 32768) != 0 ? r16.isShowingBonusTutorial : false, (r73 & 65536) != 0 ? value.isNeedClose : false);
            if (mutableStateFlow.compareAndSet(value, m6879copySbi3iaU)) {
                return Unit.INSTANCE;
            }
            intRef = intRef15;
            objectRef4 = objectRef12;
            objectRef3 = objectRef13;
            intRef5 = intRef16;
        }
    }
}
