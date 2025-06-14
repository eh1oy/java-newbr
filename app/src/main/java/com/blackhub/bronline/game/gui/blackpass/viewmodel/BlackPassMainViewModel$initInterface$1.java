package com.blackhub.bronline.game.gui.blackpass.viewmodel;

import android.graphics.Bitmap;
import androidx.media3.common.C;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.gui.blackpass.BlackPassMainUIState;
import com.blackhub.bronline.game.gui.blackpass.data.TimerDaysAndHours;
import com.blackhub.bronline.game.gui.blackpass.enums.VIPStateEnum;
import com.blackhub.bronline.game.gui.blackpass.utils.BlackPassKeys;
import com.blackhub.bronline.game.model.remote.response.blackpass.BlackPassProperties;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: BlackPassMainViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$initInterface$1", f = "BlackPassMainViewModel.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {271}, m = "invokeSuspend", n = {"properties", "seasonBg", "premiumBitmapImage", "seasonBitmapImage", "seasonBitmapImageForRewards", "rewardsList", "ratingBgImage", "dailyCategoryImageBitmap", "specialCategoryImageBitmap", "bpExpBitmap", "imgRubBitmap", "timerDaysAndHours", "vipState", "level", "valueOfExperience", "maxLevelExp"}, s = {"L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "I$1", "I$2", "I$3"})
@SourceDebugExtension({"SMAP\nBlackPassMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel$initInterface$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1001:1\n230#2,5:1002\n*S KotlinDebug\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel$initInterface$1\n*L\n273#1:1002,5\n*E\n"})
/* loaded from: classes3.dex */
public final class BlackPassMainViewModel$initInterface$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public final /* synthetic */ List<BpRewardsAwardsDto> $listOfAwardsTypes;
    public final /* synthetic */ int $premiumStatus;
    public final /* synthetic */ List<SkinsDTO> $skinsList;
    public final /* synthetic */ List<VehiclesDTO> $vehiclesList;
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public Object L$0;
    public Object L$1;
    public Object L$10;
    public Object L$11;
    public Object L$12;
    public Object L$13;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;
    public final /* synthetic */ BlackPassMainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackPassMainViewModel$initInterface$1(BlackPassMainViewModel blackPassMainViewModel, JSONObject jSONObject, List<BpRewardsAwardsDto> list, List<VehiclesDTO> list2, List<SkinsDTO> list3, int i, Continuation<? super BlackPassMainViewModel$initInterface$1> continuation) {
        super(2, continuation);
        this.this$0 = blackPassMainViewModel;
        this.$json = jSONObject;
        this.$listOfAwardsTypes = list;
        this.$vehiclesList = list2;
        this.$skinsList = list3;
        this.$premiumStatus = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BlackPassMainViewModel$initInterface$1(this.this$0, this.$json, this.$listOfAwardsTypes, this.$vehiclesList, this.$skinsList, this.$premiumStatus, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BlackPassMainViewModel$initInterface$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Ref.ObjectRef objectRef;
        TimerDaysAndHours timerDaysAndHours;
        BlackPassProperties blackPassProperties;
        Ref.ObjectRef objectRef2;
        BlackPassMainViewModel blackPassMainViewModel;
        int i;
        int i2;
        int i3;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        int i4;
        Ref.ObjectRef objectRef6;
        Ref.ObjectRef objectRef7;
        Ref.ObjectRef objectRef8;
        VIPStateEnum vIPStateEnum;
        Ref.ObjectRef objectRef9;
        Ref.ObjectRef objectRef10;
        BlackPassMainUIState copy;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = this.label;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            BlackPassProperties bpProperties = this.this$0.get_uiState().getValue().getBpProperties();
            if (bpProperties != null) {
                JSONObject jSONObject = this.$json;
                BlackPassMainViewModel blackPassMainViewModel2 = this.this$0;
                List<BpRewardsAwardsDto> list = this.$listOfAwardsTypes;
                List<VehiclesDTO> list2 = this.$vehiclesList;
                List<SkinsDTO> list3 = this.$skinsList;
                int i6 = this.$premiumStatus;
                Ref.ObjectRef objectRef11 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef12 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef13 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef14 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef15 = new Ref.ObjectRef();
                objectRef15.element = CollectionsKt__CollectionsKt.emptyList();
                Ref.ObjectRef objectRef16 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef17 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef18 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef19 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef20 = new Ref.ObjectRef();
                int optInt = jSONObject.optInt("lv");
                int optInt2 = jSONObject.optInt("td");
                TimerDaysAndHours timerDaysAndHours2 = new TimerDaysAndHours(optInt2 / 86400, (optInt2 % 86400) / 3600);
                int optInt3 = jSONObject.optInt(BlackPassKeys.EC_GET_VALUE_OF_EXPERIENCE);
                int levelExp = bpProperties.getLevelExp();
                VIPStateEnum fromInt = VIPStateEnum.INSTANCE.fromInt(jSONObject.optInt("a"));
                List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Deferred[]{ViewModelExtensionKt.asyncOnIO$default(blackPassMainViewModel2, null, new BlackPassMainViewModel$initInterface$1$1$deferredTasks$1(objectRef13, blackPassMainViewModel2, bpProperties, null), 1, null), ViewModelExtensionKt.asyncOnIO$default(blackPassMainViewModel2, null, new BlackPassMainViewModel$initInterface$1$1$deferredTasks$2(objectRef14, blackPassMainViewModel2, null), 1, null), ViewModelExtensionKt.asyncOnIO$default(blackPassMainViewModel2, null, new BlackPassMainViewModel$initInterface$1$1$deferredTasks$3(objectRef11, blackPassMainViewModel2, bpProperties, null), 1, null), ViewModelExtensionKt.asyncOnIO$default(blackPassMainViewModel2, null, new BlackPassMainViewModel$initInterface$1$1$deferredTasks$4(objectRef12, blackPassMainViewModel2, null), 1, null), ViewModelExtensionKt.asyncOnIO$default(blackPassMainViewModel2, null, new BlackPassMainViewModel$initInterface$1$1$deferredTasks$5(objectRef17, blackPassMainViewModel2, null), 1, null), ViewModelExtensionKt.asyncOnIO$default(blackPassMainViewModel2, null, new BlackPassMainViewModel$initInterface$1$1$deferredTasks$6(objectRef18, blackPassMainViewModel2, null), 1, null), ViewModelExtensionKt.asyncOnIO$default(blackPassMainViewModel2, null, new BlackPassMainViewModel$initInterface$1$1$deferredTasks$7(objectRef19, blackPassMainViewModel2, list, null), 1, null), ViewModelExtensionKt.asyncOnIO$default(blackPassMainViewModel2, null, new BlackPassMainViewModel$initInterface$1$1$deferredTasks$8(objectRef15, blackPassMainViewModel2, fromInt, optInt, jSONObject, list2, list3, list, null), 1, null), ViewModelExtensionKt.asyncOnIO$default(blackPassMainViewModel2, null, new BlackPassMainViewModel$initInterface$1$1$deferredTasks$9(objectRef16, blackPassMainViewModel2, null), 1, null), ViewModelExtensionKt.asyncOnIO$default(blackPassMainViewModel2, null, new BlackPassMainViewModel$initInterface$1$1$deferredTasks$10(list, objectRef20, blackPassMainViewModel2, null), 1, null)});
                this.L$0 = blackPassMainViewModel2;
                this.L$1 = bpProperties;
                objectRef = objectRef11;
                this.L$2 = objectRef;
                this.L$3 = objectRef12;
                this.L$4 = objectRef13;
                this.L$5 = objectRef14;
                this.L$6 = objectRef15;
                this.L$7 = objectRef16;
                this.L$8 = objectRef17;
                this.L$9 = objectRef18;
                this.L$10 = objectRef19;
                this.L$11 = objectRef20;
                timerDaysAndHours = timerDaysAndHours2;
                this.L$12 = timerDaysAndHours;
                this.L$13 = fromInt;
                this.I$0 = i6;
                this.I$1 = optInt;
                this.I$2 = optInt3;
                this.I$3 = levelExp;
                this.label = 1;
                if (AwaitKt.awaitAll(listOf, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                blackPassProperties = bpProperties;
                objectRef2 = objectRef12;
                blackPassMainViewModel = blackPassMainViewModel2;
                i = optInt;
                i2 = levelExp;
                i3 = i6;
                objectRef3 = objectRef19;
                objectRef4 = objectRef14;
                objectRef5 = objectRef17;
                i4 = optInt3;
                objectRef6 = objectRef15;
                objectRef7 = objectRef16;
                objectRef8 = objectRef20;
                vIPStateEnum = fromInt;
                objectRef9 = objectRef13;
                objectRef10 = objectRef18;
            }
            return Unit.INSTANCE;
        }
        if (i5 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i7 = this.I$3;
        i4 = this.I$2;
        i = this.I$1;
        int i8 = this.I$0;
        vIPStateEnum = (VIPStateEnum) this.L$13;
        TimerDaysAndHours timerDaysAndHours3 = (TimerDaysAndHours) this.L$12;
        objectRef8 = (Ref.ObjectRef) this.L$11;
        objectRef3 = (Ref.ObjectRef) this.L$10;
        objectRef10 = (Ref.ObjectRef) this.L$9;
        objectRef5 = (Ref.ObjectRef) this.L$8;
        objectRef7 = (Ref.ObjectRef) this.L$7;
        objectRef6 = (Ref.ObjectRef) this.L$6;
        Ref.ObjectRef objectRef21 = (Ref.ObjectRef) this.L$5;
        Ref.ObjectRef objectRef22 = (Ref.ObjectRef) this.L$4;
        Ref.ObjectRef objectRef23 = (Ref.ObjectRef) this.L$3;
        i2 = i7;
        Ref.ObjectRef objectRef24 = (Ref.ObjectRef) this.L$2;
        blackPassProperties = (BlackPassProperties) this.L$1;
        blackPassMainViewModel = (BlackPassMainViewModel) this.L$0;
        ResultKt.throwOnFailure(obj);
        i3 = i8;
        objectRef2 = objectRef23;
        objectRef9 = objectRef22;
        objectRef4 = objectRef21;
        timerDaysAndHours = timerDaysAndHours3;
        objectRef = objectRef24;
        MutableStateFlow<? extends BlackPassMainUIState> mutableStateFlow = blackPassMainViewModel.get_uiState();
        int i9 = i3;
        while (true) {
            BlackPassMainUIState value = mutableStateFlow.getValue();
            BlackPassMainUIState blackPassMainUIState = value;
            Bitmap bitmap = (Bitmap) objectRef3.element;
            Bitmap bitmap2 = (Bitmap) objectRef7.element;
            Bitmap bitmap3 = (Bitmap) objectRef5.element;
            Bitmap bitmap4 = (Bitmap) objectRef10.element;
            String seasonName = blackPassProperties.getSeasonName();
            if (seasonName == null) {
                seasonName = "";
            }
            copy = blackPassMainUIState.copy((r60 & 1) != 0 ? blackPassMainUIState.bpLevel : i, (r60 & 2) != 0 ? blackPassMainUIState.maxBpLevel : 0, (r60 & 4) != 0 ? blackPassMainUIState.selectedLayout : 0, (r60 & 8) != 0 ? blackPassMainUIState.seasonName : seasonName, (r60 & 16) != 0 ? blackPassMainUIState.seasonBg : (Bitmap) objectRef.element, (r60 & 32) != 0 ? blackPassMainUIState.seasonColor : 0, (r60 & 64) != 0 ? blackPassMainUIState.timerDaysAndHours : timerDaysAndHours, (r60 & 128) != 0 ? blackPassMainUIState.valueOfExperience : i4, (r60 & 256) != 0 ? blackPassMainUIState.maxLevelExp : i2, (r60 & 512) != 0 ? blackPassMainUIState.bpProperties : null, (r60 & 1024) != 0 ? blackPassMainUIState.premiumBitmapImage : (Bitmap) objectRef2.element, (r60 & 2048) != 0 ? blackPassMainUIState.seasonBitmapImage : (Bitmap) objectRef9.element, (r60 & 4096) != 0 ? blackPassMainUIState.seasonBitmapImageForRewards : (Bitmap) objectRef4.element, (r60 & 8192) != 0 ? blackPassMainUIState.vipState : vIPStateEnum, (r60 & 16384) != 0 ? blackPassMainUIState.rewardsList : (List) objectRef6.element, (r60 & 32768) != 0 ? blackPassMainUIState.standardLevelArray : null, (r60 & 65536) != 0 ? blackPassMainUIState.premiumLevelArray : null, (r60 & 131072) != 0 ? blackPassMainUIState.myPlaceInRating : 0, (r60 & 262144) != 0 ? blackPassMainUIState.ratingList : null, (r60 & 524288) != 0 ? blackPassMainUIState.ratingBgImage : bitmap2, (r60 & 1048576) != 0 ? blackPassMainUIState.bpExpBitmap : bitmap, (r60 & 2097152) != 0 ? blackPassMainUIState.selectedCategoryTask : (byte) 0, (r60 & 4194304) != 0 ? blackPassMainUIState.tasksFromJsonList : null, (r60 & 8388608) != 0 ? blackPassMainUIState.specialTasksList : null, (r60 & 16777216) != 0 ? blackPassMainUIState.dailyTasksList : null, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? blackPassMainUIState.specialCategoryImageBitmap : bitmap4, (r60 & 67108864) != 0 ? blackPassMainUIState.dailyCategoryImageBitmap : bitmap3, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? blackPassMainUIState.weeklyTimerForEndCategory : null, (r60 & 268435456) != 0 ? blackPassMainUIState.imgRubBitmap : (Bitmap) objectRef8.element, (r60 & 536870912) != 0 ? blackPassMainUIState.activatePremiumCounter : 0, (r60 & 1073741824) != 0 ? blackPassMainUIState.premiumStatus : i9, (r60 & Integer.MIN_VALUE) != 0 ? blackPassMainUIState.premiumPriceInt : 0, (r61 & 1) != 0 ? blackPassMainUIState.premiumPrice : null, (r61 & 2) != 0 ? blackPassMainUIState.premiumDeluxePriceInt : 0, (r61 & 4) != 0 ? blackPassMainUIState.premiumDeluxePrice : null, (r61 & 8) != 0 ? blackPassMainUIState.imgOfferSplit : null, (r61 & 16) != 0 ? blackPassMainUIState.imgDeluxeCar : null, (r61 & 32) != 0 ? blackPassMainUIState.nameDeluxeCar : null, (r61 & 64) != 0 ? blackPassMainUIState.activatePremiumSubtitle : null, (r61 & 128) != 0 ? blackPassMainUIState.activatePremiumDeluxeSubtitle : null, (r61 & 256) != 0 ? blackPassMainUIState.bannerTitlePrize1 : null, (r61 & 512) != 0 ? blackPassMainUIState.imageDustBitmap : null);
            int i10 = i4;
            if (mutableStateFlow.compareAndSet(value, copy)) {
                break;
            }
            i4 = i10;
        }
        return Unit.INSTANCE;
    }
}
