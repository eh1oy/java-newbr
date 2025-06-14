package com.blackhub.bronline.game.gui.blackpass.viewmodel;

import android.app.Application;
import android.graphics.Bitmap;
import androidx.compose.ui.text.AnnotatedString;
import androidx.media3.common.C;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.constants.resources.PngConstantsId22;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.blackpass.BlackPassMainUIState;
import com.blackhub.bronline.game.gui.blackpass.utils.BlackPassKeys;
import com.blackhub.bronline.game.model.remote.response.blackpass.LevelsInfo;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: BlackPassMainViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$updateJson$1", f = "BlackPassMainViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nBlackPassMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel$updateJson$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 4 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 7 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1001:1\n1#2:1002\n51#3,5:1003\n56#3,11:1017\n51#3,5:1044\n56#3,11:1058\n8#4,9:1008\n8#4,9:1049\n1855#5:1028\n1856#5:1036\n1045#5:1037\n1045#5:1038\n1559#5:1069\n1590#5,4:1070\n1099#6:1029\n928#6,6:1030\n230#7,5:1039\n230#7,5:1074\n*S KotlinDebug\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel$updateJson$1\n*L\n571#1:1003,5\n571#1:1017,11\n664#1:1044,5\n664#1:1058,11\n571#1:1008,9\n664#1:1049,9\n577#1:1028\n577#1:1036\n633#1:1037\n636#1:1038\n667#1:1069\n667#1:1070,4\n583#1:1029\n586#1:1030,6\n640#1:1039,5\n677#1:1074,5\n*E\n"})
/* loaded from: classes3.dex */
public final class BlackPassMainViewModel$updateJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ List<LevelsInfo> $bpRewards;
    public final /* synthetic */ int $currentLayout;
    public final /* synthetic */ JSONObject $json;
    public final /* synthetic */ List<BpRewardsAwardsDto> $listOfAwardsTypes;
    public int label;
    public final /* synthetic */ BlackPassMainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackPassMainViewModel$updateJson$1(int i, BlackPassMainViewModel blackPassMainViewModel, JSONObject jSONObject, List<LevelsInfo> list, List<BpRewardsAwardsDto> list2, Continuation<? super BlackPassMainViewModel$updateJson$1> continuation) {
        super(2, continuation);
        this.$currentLayout = i;
        this.this$0 = blackPassMainViewModel;
        this.$json = jSONObject;
        this.$bpRewards = list;
        this.$listOfAwardsTypes = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BlackPassMainViewModel$updateJson$1(this.$currentLayout, this.this$0, this.$json, this.$bpRewards, this.$listOfAwardsTypes, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BlackPassMainViewModel$updateJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r59) {
        /*
            Method dump skipped, instructions count: 1175
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$updateJson$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: BlackPassMainViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$updateJson$1$4", f = "BlackPassMainViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nBlackPassMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel$updateJson$1$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1001:1\n1#2:1002\n230#3,5:1003\n*S KotlinDebug\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel$updateJson$1$4\n*L\n736#1:1003,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$updateJson$1$4, reason: invalid class name */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ List<LevelsInfo> $bpRewards;
        public final /* synthetic */ JSONObject $json;
        public final /* synthetic */ List<BpRewardsAwardsDto> $listOfAwardsTypes;
        public int label;
        public final /* synthetic */ BlackPassMainViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(JSONObject jSONObject, BlackPassMainViewModel blackPassMainViewModel, List<LevelsInfo> list, List<BpRewardsAwardsDto> list2, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = blackPassMainViewModel;
            this.$bpRewards = list;
            this.$listOfAwardsTypes = list2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass4(this.$json, this.this$0, this.$bpRewards, this.$listOfAwardsTypes, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String string;
            Object obj2;
            BlackPassMainUIState copy;
            Application application;
            List<String> imageList;
            Application application2;
            Application application3;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int optInt = this.$json.optInt("p");
            if (this.this$0.getUiState().getValue().getIsButtonBuyPremiumEnabled()) {
                string = this.this$0.getStringResource().getString(R.string.common_string_with_bc, Boxing.boxInt(optInt));
            } else {
                string = this.this$0.getStringResource().getString(R.string.common_bought);
            }
            int optInt2 = this.$json.optInt(BlackPassKeys.P_PREMIUM_DELUXE_PRICE);
            String string2 = this.this$0.getStringResource().getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(Boxing.boxInt(optInt2)));
            List<LevelsInfo> list = this.$bpRewards;
            String str = null;
            LevelsInfo levelsInfo = list != null ? (LevelsInfo) CollectionsKt___CollectionsKt.first((List) list) : null;
            String str2 = (String) UtilsKt.buildTypeMerge(levelsInfo != null ? levelsInfo.getName() : null, levelsInfo != null ? levelsInfo.getNameStore() : null);
            String str3 = str2 == null ? "" : str2;
            Bitmap imgOfferSplit = this.this$0.getUiState().getValue().getImgOfferSplit();
            if (imgOfferSplit == null) {
                application3 = this.this$0.application;
                imgOfferSplit = BitmapUtilsKt.getPngBitmapFromZip(application3, PngConstantsId22.IMG_OFFER_SPLIT, ImageTypePathInCDNEnum.IMAGE);
            }
            Bitmap bitmap = imgOfferSplit;
            Bitmap imgDeluxeCar = this.this$0.getUiState().getValue().getImgDeluxeCar();
            if (imgDeluxeCar == null) {
                application2 = this.this$0.application;
                imgDeluxeCar = BitmapUtilsKt.getPngBitmapFromZip(application2, PngConstantsId22.IMG_SPLIT_DELUXE_CAR, ImageTypePathInCDNEnum.IMAGE);
            }
            Bitmap bitmap2 = imgDeluxeCar;
            AnnotatedString htmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(this.this$0.getStringResource().getString(R.string.black_pass_premium_subtitle_html));
            AnnotatedString htmlTextToAnnotatedString2 = StringExtensionKt.htmlTextToAnnotatedString(this.this$0.getStringResource().getString(R.string.black_pass_premium_deluxe_subtitle_html));
            AnnotatedString htmlTextToAnnotatedString3 = StringExtensionKt.htmlTextToAnnotatedString(this.this$0.getStringResource().getString(R.string.banner_title_prize_1_html));
            Iterator<T> it = this.$listOfAwardsTypes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((BpRewardsAwardsDto) obj2).getId() == 21) {
                    break;
                }
            }
            BpRewardsAwardsDto bpRewardsAwardsDto = (BpRewardsAwardsDto) obj2;
            if (bpRewardsAwardsDto != null && (imageList = bpRewardsAwardsDto.getImageList()) != null) {
                str = (String) CollectionsKt___CollectionsKt.firstOrNull((List) imageList);
            }
            String str4 = str == null ? "" : str;
            Bitmap imageDustBitmap = this.this$0.getUiState().getValue().getImageDustBitmap();
            if (imageDustBitmap == null) {
                application = this.this$0.application;
                imageDustBitmap = BitmapUtilsKt.getBitmapFromZip$default(application, str4, ImageTypePathInCDNEnum.ICON, 0.0f, 0.0f, 24, null);
            }
            Bitmap bitmap3 = imageDustBitmap;
            MutableStateFlow<? extends BlackPassMainUIState> mutableStateFlow = this.this$0.get_uiState();
            while (true) {
                BlackPassMainUIState value = mutableStateFlow.getValue();
                MutableStateFlow<? extends BlackPassMainUIState> mutableStateFlow2 = mutableStateFlow;
                copy = r3.copy((r60 & 1) != 0 ? r3.bpLevel : 0, (r60 & 2) != 0 ? r3.maxBpLevel : 0, (r60 & 4) != 0 ? r3.selectedLayout : 0, (r60 & 8) != 0 ? r3.seasonName : null, (r60 & 16) != 0 ? r3.seasonBg : null, (r60 & 32) != 0 ? r3.seasonColor : 0, (r60 & 64) != 0 ? r3.timerDaysAndHours : null, (r60 & 128) != 0 ? r3.valueOfExperience : 0, (r60 & 256) != 0 ? r3.maxLevelExp : 0, (r60 & 512) != 0 ? r3.bpProperties : null, (r60 & 1024) != 0 ? r3.premiumBitmapImage : null, (r60 & 2048) != 0 ? r3.seasonBitmapImage : null, (r60 & 4096) != 0 ? r3.seasonBitmapImageForRewards : null, (r60 & 8192) != 0 ? r3.vipState : null, (r60 & 16384) != 0 ? r3.rewardsList : null, (r60 & 32768) != 0 ? r3.standardLevelArray : null, (r60 & 65536) != 0 ? r3.premiumLevelArray : null, (r60 & 131072) != 0 ? r3.myPlaceInRating : 0, (r60 & 262144) != 0 ? r3.ratingList : null, (r60 & 524288) != 0 ? r3.ratingBgImage : null, (r60 & 1048576) != 0 ? r3.bpExpBitmap : null, (r60 & 2097152) != 0 ? r3.selectedCategoryTask : (byte) 0, (r60 & 4194304) != 0 ? r3.tasksFromJsonList : null, (r60 & 8388608) != 0 ? r3.specialTasksList : null, (r60 & 16777216) != 0 ? r3.dailyTasksList : null, (r60 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r3.specialCategoryImageBitmap : null, (r60 & 67108864) != 0 ? r3.dailyCategoryImageBitmap : null, (r60 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.weeklyTimerForEndCategory : null, (r60 & 268435456) != 0 ? r3.imgRubBitmap : null, (r60 & 536870912) != 0 ? r3.activatePremiumCounter : 0, (r60 & 1073741824) != 0 ? r3.premiumStatus : 0, (r60 & Integer.MIN_VALUE) != 0 ? r3.premiumPriceInt : optInt, (r61 & 1) != 0 ? r3.premiumPrice : string, (r61 & 2) != 0 ? r3.premiumDeluxePriceInt : optInt2, (r61 & 4) != 0 ? r3.premiumDeluxePrice : string2, (r61 & 8) != 0 ? r3.imgOfferSplit : bitmap, (r61 & 16) != 0 ? r3.imgDeluxeCar : bitmap2, (r61 & 32) != 0 ? r3.nameDeluxeCar : str3, (r61 & 64) != 0 ? r3.activatePremiumSubtitle : htmlTextToAnnotatedString, (r61 & 128) != 0 ? r3.activatePremiumDeluxeSubtitle : htmlTextToAnnotatedString2, (r61 & 256) != 0 ? r3.bannerTitlePrize1 : htmlTextToAnnotatedString3, (r61 & 512) != 0 ? value.imageDustBitmap : bitmap3);
                if (mutableStateFlow2.compareAndSet(value, copy)) {
                    return Unit.INSTANCE;
                }
                mutableStateFlow = mutableStateFlow2;
            }
        }
    }
}
