package com.blackhub.bronline.game.gui.gifts;

import com.blackhub.bronline.game.gui.gifts.model.GiftsOpenPrizeGiftModel;
import com.blackhub.bronline.game.gui.gifts.model.GiftsOpenPrizeModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GiftsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.gifts.GiftsViewModel$updateJson$1", f = "GiftsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nGiftsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel$updateJson$1\n+ 2 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,463:1\n8#2,9:464\n230#3,5:473\n230#3,5:478\n230#3,5:483\n*S KotlinDebug\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel$updateJson$1\n*L\n122#1:464,9\n137#1:473,5\n161#1:478,5\n176#1:483,5\n*E\n"})
/* loaded from: classes3.dex */
public final class GiftsViewModel$updateJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ GiftsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftsViewModel$updateJson$1(JSONObject jSONObject, GiftsViewModel giftsViewModel, Continuation<? super GiftsViewModel$updateJson$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = giftsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GiftsViewModel$updateJson$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((GiftsViewModel$updateJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object obj2;
        GiftsUiState value;
        GiftsUiState copy;
        GiftsUiState value2;
        GiftsUiState copy2;
        GiftsUiState value3;
        GiftsUiState copy3;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        JSONObject jSONObject = this.$json;
        try {
            Gson gson = new Gson();
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            obj2 = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) jSONObject2).toString(), (Class<Object>) GiftsOpenPrizeModel.class);
        } catch (Exception e) {
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            firebaseCrashlytics.log(e.toString());
            firebaseCrashlytics.recordException(e);
            obj2 = null;
        }
        GiftsOpenPrizeModel giftsOpenPrizeModel = (GiftsOpenPrizeModel) obj2;
        if (giftsOpenPrizeModel != null) {
            GiftsViewModel giftsViewModel = this.this$0;
            if (giftsOpenPrizeModel.getStatus() == 1) {
                int screen = giftsOpenPrizeModel.getScreen();
                if (screen == 2) {
                    Integer valueOfStandardGifts = giftsOpenPrizeModel.getValueOfStandardGifts();
                    int intValue = valueOfStandardGifts != null ? valueOfStandardGifts.intValue() : 0;
                    List<GiftsOpenPrizeGiftModel> allGifts = giftsOpenPrizeModel.getAllGifts();
                    boolean z = allGifts != null && allGifts.size() > 1;
                    if (allGifts != null) {
                        giftsViewModel.updateGifts(allGifts);
                    }
                    MutableStateFlow<? extends GiftsUiState> mutableStateFlow = giftsViewModel.get_uiState();
                    do {
                        value2 = mutableStateFlow.getValue();
                        copy2 = r7.copy((r39 & 1) != 0 ? r7.eventId : 0, (r39 & 2) != 0 ? r7.screen : 0, (r39 & 4) != 0 ? r7.bgImage : null, (r39 & 8) != 0 ? r7.valueOfBC : 0, (r39 & 16) != 0 ? r7.valueOfStandardGifts : intValue, (r39 & 32) != 0 ? r7.valueOfLegendaryGifts : 0, (r39 & 64) != 0 ? r7.priceOfLegendaryGift : 0, (r39 & 128) != 0 ? r7.standardGifts : null, (r39 & 256) != 0 ? r7.legendaryGifts : null, (r39 & 512) != 0 ? r7.isVisibleButtonBack : false, (r39 & 1024) != 0 ? r7.isOpeningBox : true, (r39 & 2048) != 0 ? r7.giftFirst : null, (r39 & 4096) != 0 ? r7.giftSecond : null, (r39 & 8192) != 0 ? r7.isStandard : true, (r39 & 16384) != 0 ? r7.isSecondGiftVisible : z, (r39 & 32768) != 0 ? r7.isButtonGetVisible : false, (r39 & 65536) != 0 ? r7.valueOfOpenedGifts : 0, (r39 & 131072) != 0 ? r7.isHideBlockWithBC : false, (r39 & 262144) != 0 ? r7.isNeedClose : false, (r39 & 524288) != 0 ? r7.isBlockingLoading : false, (r39 & 1048576) != 0 ? value2.isClickedOpenCase : false);
                    } while (!mutableStateFlow.compareAndSet(value2, copy2));
                } else if (screen == 3) {
                    Integer valueOfBC = giftsOpenPrizeModel.getValueOfBC();
                    int intValue2 = valueOfBC != null ? valueOfBC.intValue() : 0;
                    Integer valueOfLegendaryGifts = giftsOpenPrizeModel.getValueOfLegendaryGifts();
                    int intValue3 = valueOfLegendaryGifts != null ? valueOfLegendaryGifts.intValue() : 0;
                    List<GiftsOpenPrizeGiftModel> allGifts2 = giftsOpenPrizeModel.getAllGifts();
                    boolean z2 = allGifts2 != null && allGifts2.size() > 1;
                    if (allGifts2 != null) {
                        giftsViewModel.updateGifts(allGifts2);
                    }
                    MutableStateFlow<? extends GiftsUiState> mutableStateFlow2 = giftsViewModel.get_uiState();
                    do {
                        value3 = mutableStateFlow2.getValue();
                        copy3 = r7.copy((r39 & 1) != 0 ? r7.eventId : 0, (r39 & 2) != 0 ? r7.screen : 0, (r39 & 4) != 0 ? r7.bgImage : null, (r39 & 8) != 0 ? r7.valueOfBC : intValue2, (r39 & 16) != 0 ? r7.valueOfStandardGifts : 0, (r39 & 32) != 0 ? r7.valueOfLegendaryGifts : intValue3, (r39 & 64) != 0 ? r7.priceOfLegendaryGift : 0, (r39 & 128) != 0 ? r7.standardGifts : null, (r39 & 256) != 0 ? r7.legendaryGifts : null, (r39 & 512) != 0 ? r7.isVisibleButtonBack : false, (r39 & 1024) != 0 ? r7.isOpeningBox : true, (r39 & 2048) != 0 ? r7.giftFirst : null, (r39 & 4096) != 0 ? r7.giftSecond : null, (r39 & 8192) != 0 ? r7.isStandard : false, (r39 & 16384) != 0 ? r7.isSecondGiftVisible : z2, (r39 & 32768) != 0 ? r7.isButtonGetVisible : false, (r39 & 65536) != 0 ? r7.valueOfOpenedGifts : 0, (r39 & 131072) != 0 ? r7.isHideBlockWithBC : false, (r39 & 262144) != 0 ? r7.isNeedClose : false, (r39 & 524288) != 0 ? r7.isBlockingLoading : false, (r39 & 1048576) != 0 ? value3.isClickedOpenCase : false);
                    } while (!mutableStateFlow2.compareAndSet(value3, copy3));
                }
            } else {
                MutableStateFlow<? extends GiftsUiState> mutableStateFlow3 = giftsViewModel.get_uiState();
                do {
                    value = mutableStateFlow3.getValue();
                    copy = r3.copy((r39 & 1) != 0 ? r3.eventId : 0, (r39 & 2) != 0 ? r3.screen : 0, (r39 & 4) != 0 ? r3.bgImage : null, (r39 & 8) != 0 ? r3.valueOfBC : 0, (r39 & 16) != 0 ? r3.valueOfStandardGifts : 0, (r39 & 32) != 0 ? r3.valueOfLegendaryGifts : 0, (r39 & 64) != 0 ? r3.priceOfLegendaryGift : 0, (r39 & 128) != 0 ? r3.standardGifts : null, (r39 & 256) != 0 ? r3.legendaryGifts : null, (r39 & 512) != 0 ? r3.isVisibleButtonBack : false, (r39 & 1024) != 0 ? r3.isOpeningBox : false, (r39 & 2048) != 0 ? r3.giftFirst : null, (r39 & 4096) != 0 ? r3.giftSecond : null, (r39 & 8192) != 0 ? r3.isStandard : false, (r39 & 16384) != 0 ? r3.isSecondGiftVisible : false, (r39 & 32768) != 0 ? r3.isButtonGetVisible : false, (r39 & 65536) != 0 ? r3.valueOfOpenedGifts : 0, (r39 & 131072) != 0 ? r3.isHideBlockWithBC : false, (r39 & 262144) != 0 ? r3.isNeedClose : false, (r39 & 524288) != 0 ? r3.isBlockingLoading : false, (r39 & 1048576) != 0 ? value.isClickedOpenCase : false);
                } while (!mutableStateFlow3.compareAndSet(value, copy));
            }
        }
        return Unit.INSTANCE;
    }
}
