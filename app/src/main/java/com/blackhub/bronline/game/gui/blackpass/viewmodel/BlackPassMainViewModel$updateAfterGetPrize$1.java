package com.blackhub.bronline.game.gui.blackpass.viewmodel;

import androidx.media3.common.C;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState;
import com.blackhub.bronline.game.gui.blackpass.BlackPassMainUIState;
import com.blackhub.bronline.game.gui.blackpass.data.RewardModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
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
import org.json.JSONObject;

/* compiled from: BlackPassMainViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$updateAfterGetPrize$1", f = "BlackPassMainViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nBlackPassMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel$updateAfterGetPrize$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1001:1\n1559#2:1002\n1590#2,4:1003\n230#3,5:1007\n*S KotlinDebug\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel$updateAfterGetPrize$1\n*L\n487#1:1002\n487#1:1003,4\n524#1:1007,5\n*E\n"})
/* loaded from: classes3.dex */
public final class BlackPassMainViewModel$updateAfterGetPrize$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ BlackPassMainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackPassMainViewModel$updateAfterGetPrize$1(JSONObject jSONObject, BlackPassMainViewModel blackPassMainViewModel, Continuation<? super BlackPassMainViewModel$updateAfterGetPrize$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = blackPassMainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BlackPassMainViewModel$updateAfterGetPrize$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BlackPassMainViewModel$updateAfterGetPrize$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        BlackPassMainUIState copy;
        CommonRewardModel standardReward;
        CommonRewardModel premiumReward;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        boolean isOne = IntExtensionKt.isOne(Boxing.boxInt(this.$json.optInt("p")));
        int optInt = this.$json.optInt("id");
        int bpLevel = this.this$0.get_uiState().getValue().getBpLevel() - 1;
        List<RewardModel> rewardsList = this.this$0.get_uiState().getValue().getRewardsList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(rewardsList, 10));
        int i = 0;
        for (Object obj2 : rewardsList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            RewardModel rewardModel = (RewardModel) obj2;
            if (i == bpLevel) {
                if (!isOne) {
                    if (rewardModel.getStandardReward().getRewardId() == optInt) {
                        standardReward = r16.copy((r36 & 1) != 0 ? r16.rewardId : 0, (r36 & 2) != 0 ? r16.rewardName : null, (r36 & 4) != 0 ? r16.rewardDescription : null, (r36 & 8) != 0 ? r16.bottomText : null, (r36 & 16) != 0 ? r16.image : null, (r36 & 32) != 0 ? r16.typeId : 0, (r36 & 64) != 0 ? r16.awardId : 0, (r36 & 128) != 0 ? r16.imageNameFromCdn : null, (r36 & 256) != 0 ? r16.isSuperReward : false, (r36 & 512) != 0 ? r16.isNeedToShowLvl : false, (r36 & 1024) != 0 ? r16.lvl : 0, (r36 & 2048) != 0 ? r16.mainRewardState : CommonRewardState.NORM_RECEIVED, (r36 & 4096) != 0 ? r16.bonusRewardState : null, (r36 & 8192) != 0 ? r16.isCalendarReward : false, (r36 & 16384) != 0 ? r16.isBpOrEventsReward : false, (r36 & 32768) != 0 ? r16.rarityState : null, (r36 & 65536) != 0 ? r16.fromList : 0, (r36 & 131072) != 0 ? rewardModel.getStandardReward().imageModel : null);
                    } else {
                        standardReward = rewardModel.getStandardReward();
                    }
                } else {
                    standardReward = rewardModel.getStandardReward();
                }
                if (isOne) {
                    if (rewardModel.getPremiumReward().getRewardId() == optInt) {
                        premiumReward = r16.copy((r36 & 1) != 0 ? r16.rewardId : 0, (r36 & 2) != 0 ? r16.rewardName : null, (r36 & 4) != 0 ? r16.rewardDescription : null, (r36 & 8) != 0 ? r16.bottomText : null, (r36 & 16) != 0 ? r16.image : null, (r36 & 32) != 0 ? r16.typeId : 0, (r36 & 64) != 0 ? r16.awardId : 0, (r36 & 128) != 0 ? r16.imageNameFromCdn : null, (r36 & 256) != 0 ? r16.isSuperReward : false, (r36 & 512) != 0 ? r16.isNeedToShowLvl : false, (r36 & 1024) != 0 ? r16.lvl : 0, (r36 & 2048) != 0 ? r16.mainRewardState : CommonRewardState.NORM_RECEIVED, (r36 & 4096) != 0 ? r16.bonusRewardState : null, (r36 & 8192) != 0 ? r16.isCalendarReward : false, (r36 & 16384) != 0 ? r16.isBpOrEventsReward : false, (r36 & 32768) != 0 ? r16.rarityState : null, (r36 & 65536) != 0 ? r16.fromList : 0, (r36 & 131072) != 0 ? rewardModel.getPremiumReward().imageModel : null);
                    } else {
                        premiumReward = rewardModel.getPremiumReward();
                    }
                } else {
                    premiumReward = rewardModel.getPremiumReward();
                }
                rewardModel = rewardModel.copy(standardReward, premiumReward);
            }
            arrayList.add(rewardModel);
            i = i2;
        }
        MutableStateFlow<? extends BlackPassMainUIState> mutableStateFlow = this.this$0.get_uiState();
        while (true) {
            BlackPassMainUIState value = mutableStateFlow.getValue();
            ArrayList arrayList2 = arrayList;
            copy = r5.copy((r60 & 1) != 0 ? r5.bpLevel : 0, (r60 & 2) != 0 ? r5.maxBpLevel : 0, (r60 & 4) != 0 ? r5.selectedLayout : 0, (r60 & 8) != 0 ? r5.seasonName : null, (r60 & 16) != 0 ? r5.seasonBg : null, (r60 & 32) != 0 ? r5.seasonColor : 0, (r60 & 64) != 0 ? r5.timerDaysAndHours : null, (r60 & 128) != 0 ? r5.valueOfExperience : 0, (r60 & 256) != 0 ? r5.maxLevelExp : 0, (r60 & 512) != 0 ? r5.bpProperties : null, (r60 & 1024) != 0 ? r5.premiumBitmapImage : null, (r60 & 2048) != 0 ? r5.seasonBitmapImage : null, (r60 & 4096) != 0 ? r5.seasonBitmapImageForRewards : null, (r60 & 8192) != 0 ? r5.vipState : null, (r60 & 16384) != 0 ? r5.rewardsList : arrayList2, (r60 & 32768) != 0 ? r5.standardLevelArray : null, (r60 & 65536) != 0 ? r5.premiumLevelArray : null, (r60 & 131072) != 0 ? r5.myPlaceInRating : 0, (r60 & 262144) != 0 ? r5.ratingList : null, (r60 & 524288) != 0 ? r5.ratingBgImage : null, (r60 & 1048576) != 0 ? r5.bpExpBitmap : null, (r60 & 2097152) != 0 ? r5.selectedCategoryTask : (byte) 0, (r60 & 4194304) != 0 ? r5.tasksFromJsonList : null, (r60 & 8388608) != 0 ? r5.specialTasksList : null, (r60 & 16777216) != 0 ? r5.dailyTasksList : null, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r5.specialCategoryImageBitmap : null, (r60 & 67108864) != 0 ? r5.dailyCategoryImageBitmap : null, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r5.weeklyTimerForEndCategory : null, (r60 & 268435456) != 0 ? r5.imgRubBitmap : null, (r60 & 536870912) != 0 ? r5.activatePremiumCounter : 0, (r60 & 1073741824) != 0 ? r5.premiumStatus : 0, (r60 & Integer.MIN_VALUE) != 0 ? r5.premiumPriceInt : 0, (r61 & 1) != 0 ? r5.premiumPrice : null, (r61 & 2) != 0 ? r5.premiumDeluxePriceInt : 0, (r61 & 4) != 0 ? r5.premiumDeluxePrice : null, (r61 & 8) != 0 ? r5.imgOfferSplit : null, (r61 & 16) != 0 ? r5.imgDeluxeCar : null, (r61 & 32) != 0 ? r5.nameDeluxeCar : null, (r61 & 64) != 0 ? r5.activatePremiumSubtitle : null, (r61 & 128) != 0 ? r5.activatePremiumDeluxeSubtitle : null, (r61 & 256) != 0 ? r5.bannerTitlePrize1 : null, (r61 & 512) != 0 ? value.imageDustBitmap : null);
            if (mutableStateFlow.compareAndSet(value, copy)) {
                return Unit.INSTANCE;
            }
            arrayList = arrayList2;
        }
    }
}
