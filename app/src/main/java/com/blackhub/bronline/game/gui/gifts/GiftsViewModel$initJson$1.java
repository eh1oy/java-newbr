package com.blackhub.bronline.game.gui.gifts;

import android.app.Application;
import android.graphics.Bitmap;
import com.blackhub.bronline.game.core.constants.resources.SvgConstantsId69;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.gifts.model.GiftsPreviewItemModel;
import com.blackhub.bronline.game.model.remote.response.gifts.GiftLegendaryDto;
import com.blackhub.bronline.game.model.remote.response.gifts.GiftNormalDto;
import com.blackhub.bronline.game.model.remote.response.gifts.GiftsResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.gifts.GiftsViewModel$initJson$1", f = "GiftsViewModel.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {91, 97}, m = "invokeSuspend", n = {"bgImage", "eventId", "valueOfBc", "valueOfStandardGifts", "valueOfLegendaryGifts", "priceOfLegendaryGift", "bgImage", "standardGifts", "eventId", "valueOfBc", "valueOfStandardGifts", "valueOfLegendaryGifts", "priceOfLegendaryGift"}, s = {"L$0", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "I$0", "I$1", "I$2", "I$3", "I$4"})
@SourceDebugExtension({"SMAP\nGiftsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel$initJson$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,463:1\n1549#2:464\n1620#2,3:465\n1549#2:468\n1620#2,3:469\n230#3,5:472\n*S KotlinDebug\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel$initJson$1\n*L\n91#1:464\n91#1:465,3\n97#1:468\n97#1:469,3\n104#1:472,5\n*E\n"})
/* loaded from: classes3.dex */
public final class GiftsViewModel$initJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ GiftsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftsViewModel$initJson$1(JSONObject jSONObject, GiftsViewModel giftsViewModel, Continuation<? super GiftsViewModel$initJson$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = giftsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        GiftsViewModel$initJson$1 giftsViewModel$initJson$1 = new GiftsViewModel$initJson$1(this.$json, this.this$0, continuation);
        giftsViewModel$initJson$1.L$0 = obj;
        return giftsViewModel$initJson$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((GiftsViewModel$initJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        int optInt;
        int optInt2;
        String str;
        Application application;
        Object giftResponse;
        Bitmap bitmap;
        int i;
        int i2;
        int i3;
        ArrayList arrayList;
        Object giftResponse2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Bitmap bitmap2;
        List list;
        List<GiftNormalDto> giftNormalDto;
        int randomIcon;
        GiftsResponse giftsResponse;
        ArrayList arrayList2;
        MutableStateFlow<? extends GiftsUiState> mutableStateFlow;
        GiftsUiState value;
        GiftsUiState copy;
        List<GiftLegendaryDto> giftLegendaryDto;
        int randomIcon2;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.label;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            int optInt3 = this.$json.optInt("te", 1);
            optInt = this.$json.optInt("d");
            int optInt4 = this.$json.optInt(GiftsKeys.GET_VALUE_OF_STANDARD_GIFTS_KEY);
            optInt2 = this.$json.optInt("pc");
            int optInt5 = this.$json.optInt("lc");
            if (optInt3 == 0) {
                str = SvgConstantsId69.BG_CHRISTMAS_TREE_PRIZES;
            } else if (optInt3 == 1) {
                str = SvgConstantsId69.BG_HOST_MACHINE_PRIZES;
            } else {
                str = AnyExtensionKt.empty(coroutineScope);
            }
            String str2 = str;
            application = this.this$0.application;
            Bitmap bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(application, str2, ImageTypePathInCDNEnum.BACKGROUND, 0.0f, 0.0f, 24, null);
            GiftsViewModel giftsViewModel = this.this$0;
            this.L$0 = bitmapFromZip$default;
            this.I$0 = optInt3;
            this.I$1 = optInt;
            this.I$2 = optInt4;
            this.I$3 = optInt2;
            this.I$4 = optInt5;
            this.label = 1;
            giftResponse = giftsViewModel.getGiftResponse(this);
            if (giftResponse == coroutine_suspended) {
                return coroutine_suspended;
            }
            bitmap = bitmapFromZip$default;
            i = optInt5;
            i2 = optInt3;
            i3 = optInt4;
        } else {
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i4 = this.I$4;
                i8 = this.I$3;
                i5 = this.I$2;
                i6 = this.I$1;
                i7 = this.I$0;
                list = (List) this.L$1;
                bitmap2 = (Bitmap) this.L$0;
                ResultKt.throwOnFailure(obj);
                giftResponse2 = obj;
                giftsResponse = (GiftsResponse) giftResponse2;
                if (giftsResponse != null || (giftLegendaryDto = giftsResponse.getGiftLegendaryDto()) == null) {
                    arrayList2 = null;
                } else {
                    List<GiftLegendaryDto> list2 = giftLegendaryDto;
                    GiftsViewModel giftsViewModel2 = this.this$0;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    for (GiftLegendaryDto giftLegendaryDto2 : list2) {
                        randomIcon2 = giftsViewModel2.getRandomIcon();
                        String str3 = (String) UtilsKt.buildTypeMerge(giftLegendaryDto2.getDescription(), giftLegendaryDto2.getDescriptionStore());
                        if (str3 == null) {
                            str3 = "";
                        }
                        arrayList3.add(new GiftsPreviewItemModel(null, randomIcon2, str3, 1, null));
                    }
                    arrayList2 = arrayList3;
                }
                mutableStateFlow = this.this$0.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    copy = r22.copy((r39 & 1) != 0 ? r22.eventId : i7, (r39 & 2) != 0 ? r22.screen : 1, (r39 & 4) != 0 ? r22.bgImage : bitmap2, (r39 & 8) != 0 ? r22.valueOfBC : i6, (r39 & 16) != 0 ? r22.valueOfStandardGifts : i5, (r39 & 32) != 0 ? r22.valueOfLegendaryGifts : i8, (r39 & 64) != 0 ? r22.priceOfLegendaryGift : i4, (r39 & 128) != 0 ? r22.standardGifts : list, (r39 & 256) != 0 ? r22.legendaryGifts : arrayList2, (r39 & 512) != 0 ? r22.isVisibleButtonBack : false, (r39 & 1024) != 0 ? r22.isOpeningBox : false, (r39 & 2048) != 0 ? r22.giftFirst : null, (r39 & 4096) != 0 ? r22.giftSecond : null, (r39 & 8192) != 0 ? r22.isStandard : false, (r39 & 16384) != 0 ? r22.isSecondGiftVisible : false, (r39 & 32768) != 0 ? r22.isButtonGetVisible : false, (r39 & 65536) != 0 ? r22.valueOfOpenedGifts : 0, (r39 & 131072) != 0 ? r22.isHideBlockWithBC : false, (r39 & 262144) != 0 ? r22.isNeedClose : false, (r39 & 524288) != 0 ? r22.isBlockingLoading : false, (r39 & 1048576) != 0 ? value.isClickedOpenCase : false);
                } while (!mutableStateFlow.compareAndSet(value, copy));
                return Unit.INSTANCE;
            }
            i = this.I$4;
            int i10 = this.I$3;
            i3 = this.I$2;
            optInt = this.I$1;
            i2 = this.I$0;
            Bitmap bitmap3 = (Bitmap) this.L$0;
            ResultKt.throwOnFailure(obj);
            bitmap = bitmap3;
            optInt2 = i10;
            giftResponse = obj;
        }
        GiftsResponse giftsResponse2 = (GiftsResponse) giftResponse;
        if (giftsResponse2 == null || (giftNormalDto = giftsResponse2.getGiftNormalDto()) == null) {
            arrayList = null;
        } else {
            List<GiftNormalDto> list3 = giftNormalDto;
            GiftsViewModel giftsViewModel3 = this.this$0;
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            for (GiftNormalDto giftNormalDto2 : list3) {
                randomIcon = giftsViewModel3.getRandomIcon();
                String str4 = (String) UtilsKt.buildTypeMerge(giftNormalDto2.getDescription(), giftNormalDto2.getDescriptionStore());
                arrayList.add(new GiftsPreviewItemModel(null, randomIcon, str4 == null ? "" : str4, 1, null));
            }
        }
        GiftsViewModel giftsViewModel4 = this.this$0;
        this.L$0 = bitmap;
        this.L$1 = arrayList;
        this.I$0 = i2;
        this.I$1 = optInt;
        this.I$2 = i3;
        this.I$3 = optInt2;
        this.I$4 = i;
        this.label = 2;
        giftResponse2 = giftsViewModel4.getGiftResponse(this);
        if (giftResponse2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        i4 = i;
        i5 = i3;
        i6 = optInt;
        i7 = i2;
        i8 = optInt2;
        bitmap2 = bitmap;
        list = arrayList;
        giftsResponse = (GiftsResponse) giftResponse2;
        if (giftsResponse != null) {
        }
        arrayList2 = null;
        mutableStateFlow = this.this$0.get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r22.copy((r39 & 1) != 0 ? r22.eventId : i7, (r39 & 2) != 0 ? r22.screen : 1, (r39 & 4) != 0 ? r22.bgImage : bitmap2, (r39 & 8) != 0 ? r22.valueOfBC : i6, (r39 & 16) != 0 ? r22.valueOfStandardGifts : i5, (r39 & 32) != 0 ? r22.valueOfLegendaryGifts : i8, (r39 & 64) != 0 ? r22.priceOfLegendaryGift : i4, (r39 & 128) != 0 ? r22.standardGifts : list, (r39 & 256) != 0 ? r22.legendaryGifts : arrayList2, (r39 & 512) != 0 ? r22.isVisibleButtonBack : false, (r39 & 1024) != 0 ? r22.isOpeningBox : false, (r39 & 2048) != 0 ? r22.giftFirst : null, (r39 & 4096) != 0 ? r22.giftSecond : null, (r39 & 8192) != 0 ? r22.isStandard : false, (r39 & 16384) != 0 ? r22.isSecondGiftVisible : false, (r39 & 32768) != 0 ? r22.isButtonGetVisible : false, (r39 & 65536) != 0 ? r22.valueOfOpenedGifts : 0, (r39 & 131072) != 0 ? r22.isHideBlockWithBC : false, (r39 & 262144) != 0 ? r22.isNeedClose : false, (r39 & 524288) != 0 ? r22.isBlockingLoading : false, (r39 & 1048576) != 0 ? value.isClickedOpenCase : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        return Unit.INSTANCE;
    }
}
