package com.blackhub.bronline.game.gui.blackpass.viewmodel;

import androidx.media3.common.C;
import com.blackhub.bronline.game.gui.blackpass.BlackPassMainUIState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$levelUp$1", f = "BlackPassMainViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nBlackPassMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel$levelUp$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1001:1\n230#2,5:1002\n*S KotlinDebug\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel$levelUp$1\n*L\n454#1:1002,5\n*E\n"})
/* loaded from: classes3.dex */
public final class BlackPassMainViewModel$levelUp$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $bpLevel;
    public final /* synthetic */ int $valueOfExperience;
    public int label;
    public final /* synthetic */ BlackPassMainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackPassMainViewModel$levelUp$1(int i, int i2, BlackPassMainViewModel blackPassMainViewModel, Continuation<? super BlackPassMainViewModel$levelUp$1> continuation) {
        super(2, continuation);
        this.$valueOfExperience = i;
        this.$bpLevel = i2;
        this.this$0 = blackPassMainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BlackPassMainViewModel$levelUp$1(this.$valueOfExperience, this.$bpLevel, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BlackPassMainViewModel$levelUp$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        List updateRewardsList;
        BlackPassMainUIState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int i = this.$valueOfExperience;
        if (i == -1) {
            i = 0;
        }
        int i2 = this.$bpLevel;
        if (i2 == -1) {
            i2 = this.this$0.get_uiState().getValue().getBpLevel() + 1;
        }
        int i3 = i2;
        updateRewardsList = this.this$0.updateRewardsList(i3 - 1);
        MutableStateFlow<? extends BlackPassMainUIState> mutableStateFlow = this.this$0.get_uiState();
        while (true) {
            BlackPassMainUIState value = mutableStateFlow.getValue();
            MutableStateFlow<? extends BlackPassMainUIState> mutableStateFlow2 = mutableStateFlow;
            copy = r3.copy((r60 & 1) != 0 ? r3.bpLevel : i3, (r60 & 2) != 0 ? r3.maxBpLevel : 0, (r60 & 4) != 0 ? r3.selectedLayout : 0, (r60 & 8) != 0 ? r3.seasonName : null, (r60 & 16) != 0 ? r3.seasonBg : null, (r60 & 32) != 0 ? r3.seasonColor : 0, (r60 & 64) != 0 ? r3.timerDaysAndHours : null, (r60 & 128) != 0 ? r3.valueOfExperience : i, (r60 & 256) != 0 ? r3.maxLevelExp : 0, (r60 & 512) != 0 ? r3.bpProperties : null, (r60 & 1024) != 0 ? r3.premiumBitmapImage : null, (r60 & 2048) != 0 ? r3.seasonBitmapImage : null, (r60 & 4096) != 0 ? r3.seasonBitmapImageForRewards : null, (r60 & 8192) != 0 ? r3.vipState : null, (r60 & 16384) != 0 ? r3.rewardsList : updateRewardsList, (r60 & 32768) != 0 ? r3.standardLevelArray : null, (r60 & 65536) != 0 ? r3.premiumLevelArray : null, (r60 & 131072) != 0 ? r3.myPlaceInRating : 0, (r60 & 262144) != 0 ? r3.ratingList : null, (r60 & 524288) != 0 ? r3.ratingBgImage : null, (r60 & 1048576) != 0 ? r3.bpExpBitmap : null, (r60 & 2097152) != 0 ? r3.selectedCategoryTask : (byte) 0, (r60 & 4194304) != 0 ? r3.tasksFromJsonList : null, (r60 & 8388608) != 0 ? r3.specialTasksList : null, (r60 & 16777216) != 0 ? r3.dailyTasksList : null, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r3.specialCategoryImageBitmap : null, (r60 & 67108864) != 0 ? r3.dailyCategoryImageBitmap : null, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.weeklyTimerForEndCategory : null, (r60 & 268435456) != 0 ? r3.imgRubBitmap : null, (r60 & 536870912) != 0 ? r3.activatePremiumCounter : 0, (r60 & 1073741824) != 0 ? r3.premiumStatus : 0, (r60 & Integer.MIN_VALUE) != 0 ? r3.premiumPriceInt : 0, (r61 & 1) != 0 ? r3.premiumPrice : null, (r61 & 2) != 0 ? r3.premiumDeluxePriceInt : 0, (r61 & 4) != 0 ? r3.premiumDeluxePrice : null, (r61 & 8) != 0 ? r3.imgOfferSplit : null, (r61 & 16) != 0 ? r3.imgDeluxeCar : null, (r61 & 32) != 0 ? r3.nameDeluxeCar : null, (r61 & 64) != 0 ? r3.activatePremiumSubtitle : null, (r61 & 128) != 0 ? r3.activatePremiumDeluxeSubtitle : null, (r61 & 256) != 0 ? r3.bannerTitlePrize1 : null, (r61 & 512) != 0 ? value.imageDustBitmap : null);
            if (mutableStateFlow2.compareAndSet(value, copy)) {
                return Unit.INSTANCE;
            }
            mutableStateFlow = mutableStateFlow2;
        }
    }
}
