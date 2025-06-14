package com.blackhub.bronline.game.gui.blackpass.viewmodel;

import android.graphics.Color;
import androidx.media3.common.C;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.gui.blackpass.BlackPassMainUIState;
import com.blackhub.bronline.game.model.remote.response.blackpass.BlackPassItems;
import com.blackhub.bronline.game.model.remote.response.blackpass.BlackPassProperties;
import com.blackhub.bronline.game.model.remote.response.blackpass.LevelsInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: BlackPassMainViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$initDataFromJson$1", f = "BlackPassMainViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nBlackPassMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel$initDataFromJson$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1001:1\n230#2,5:1002\n*S KotlinDebug\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel$initDataFromJson$1\n*L\n144#1:1002,5\n*E\n"})
/* loaded from: classes3.dex */
public final class BlackPassMainViewModel$initDataFromJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ BlackPassItems $blackPassItems;
    public final /* synthetic */ String $calendarSeasonColor;
    public int label;
    public final /* synthetic */ BlackPassMainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackPassMainViewModel$initDataFromJson$1(BlackPassItems blackPassItems, BlackPassMainViewModel blackPassMainViewModel, String str, Continuation<? super BlackPassMainViewModel$initDataFromJson$1> continuation) {
        super(2, continuation);
        this.$blackPassItems = blackPassItems;
        this.this$0 = blackPassMainViewModel;
        this.$calendarSeasonColor = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BlackPassMainViewModel$initDataFromJson$1(this.$blackPassItems, this.this$0, this.$calendarSeasonColor, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BlackPassMainViewModel$initDataFromJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableStateFlow mutableStateFlow;
        BlackPassMainUIState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<BlackPassProperties> bpProperties = this.$blackPassItems.getBpProperties();
        BlackPassProperties blackPassProperties = bpProperties != null ? (BlackPassProperties) CollectionsKt___CollectionsKt.getOrNull(bpProperties, 0) : null;
        mutableStateFlow = this.this$0._priceForBPLevel;
        mutableStateFlow.setValue(Boxing.boxInt(IntExtensionKt.getOrZero(blackPassProperties != null ? Boxing.boxInt(blackPassProperties.getLevelPrice()) : null)));
        int parseColor = Color.parseColor(this.$calendarSeasonColor);
        MutableStateFlow<? extends BlackPassMainUIState> mutableStateFlow2 = this.this$0.get_uiState();
        BlackPassItems blackPassItems = this.$blackPassItems;
        while (true) {
            BlackPassMainUIState value = mutableStateFlow2.getValue();
            BlackPassMainUIState blackPassMainUIState = value;
            ArrayList<LevelsInfo> standardLevel = blackPassItems.getStandardLevel();
            int orZero = IntExtensionKt.getOrZero(standardLevel != null ? Boxing.boxInt(standardLevel.size()) : null);
            ArrayList<LevelsInfo> standardLevel2 = blackPassItems.getStandardLevel();
            ArrayList<LevelsInfo> premiumLevel = blackPassItems.getPremiumLevel();
            List tasks = blackPassItems.getTasks();
            if (tasks == null) {
                tasks = CollectionsKt__CollectionsKt.emptyList();
            }
            BlackPassItems blackPassItems2 = blackPassItems;
            MutableStateFlow<? extends BlackPassMainUIState> mutableStateFlow3 = mutableStateFlow2;
            copy = blackPassMainUIState.copy((r60 & 1) != 0 ? blackPassMainUIState.bpLevel : 0, (r60 & 2) != 0 ? blackPassMainUIState.maxBpLevel : orZero, (r60 & 4) != 0 ? blackPassMainUIState.selectedLayout : 0, (r60 & 8) != 0 ? blackPassMainUIState.seasonName : null, (r60 & 16) != 0 ? blackPassMainUIState.seasonBg : null, (r60 & 32) != 0 ? blackPassMainUIState.seasonColor : parseColor, (r60 & 64) != 0 ? blackPassMainUIState.timerDaysAndHours : null, (r60 & 128) != 0 ? blackPassMainUIState.valueOfExperience : 0, (r60 & 256) != 0 ? blackPassMainUIState.maxLevelExp : 0, (r60 & 512) != 0 ? blackPassMainUIState.bpProperties : blackPassProperties, (r60 & 1024) != 0 ? blackPassMainUIState.premiumBitmapImage : null, (r60 & 2048) != 0 ? blackPassMainUIState.seasonBitmapImage : null, (r60 & 4096) != 0 ? blackPassMainUIState.seasonBitmapImageForRewards : null, (r60 & 8192) != 0 ? blackPassMainUIState.vipState : null, (r60 & 16384) != 0 ? blackPassMainUIState.rewardsList : null, (r60 & 32768) != 0 ? blackPassMainUIState.standardLevelArray : standardLevel2, (r60 & 65536) != 0 ? blackPassMainUIState.premiumLevelArray : premiumLevel, (r60 & 131072) != 0 ? blackPassMainUIState.myPlaceInRating : 0, (r60 & 262144) != 0 ? blackPassMainUIState.ratingList : null, (r60 & 524288) != 0 ? blackPassMainUIState.ratingBgImage : null, (r60 & 1048576) != 0 ? blackPassMainUIState.bpExpBitmap : null, (r60 & 2097152) != 0 ? blackPassMainUIState.selectedCategoryTask : (byte) 0, (r60 & 4194304) != 0 ? blackPassMainUIState.tasksFromJsonList : tasks, (r60 & 8388608) != 0 ? blackPassMainUIState.specialTasksList : null, (r60 & 16777216) != 0 ? blackPassMainUIState.dailyTasksList : null, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? blackPassMainUIState.specialCategoryImageBitmap : null, (r60 & 67108864) != 0 ? blackPassMainUIState.dailyCategoryImageBitmap : null, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? blackPassMainUIState.weeklyTimerForEndCategory : null, (r60 & 268435456) != 0 ? blackPassMainUIState.imgRubBitmap : null, (r60 & 536870912) != 0 ? blackPassMainUIState.activatePremiumCounter : 0, (r60 & 1073741824) != 0 ? blackPassMainUIState.premiumStatus : 0, (r60 & Integer.MIN_VALUE) != 0 ? blackPassMainUIState.premiumPriceInt : 0, (r61 & 1) != 0 ? blackPassMainUIState.premiumPrice : null, (r61 & 2) != 0 ? blackPassMainUIState.premiumDeluxePriceInt : 0, (r61 & 4) != 0 ? blackPassMainUIState.premiumDeluxePrice : null, (r61 & 8) != 0 ? blackPassMainUIState.imgOfferSplit : null, (r61 & 16) != 0 ? blackPassMainUIState.imgDeluxeCar : null, (r61 & 32) != 0 ? blackPassMainUIState.nameDeluxeCar : null, (r61 & 64) != 0 ? blackPassMainUIState.activatePremiumSubtitle : null, (r61 & 128) != 0 ? blackPassMainUIState.activatePremiumDeluxeSubtitle : null, (r61 & 256) != 0 ? blackPassMainUIState.bannerTitlePrize1 : null, (r61 & 512) != 0 ? blackPassMainUIState.imageDustBitmap : null);
            if (mutableStateFlow3.compareAndSet(value, copy)) {
                return Unit.INSTANCE;
            }
            mutableStateFlow2 = mutableStateFlow3;
            blackPassItems = blackPassItems2;
        }
    }
}
