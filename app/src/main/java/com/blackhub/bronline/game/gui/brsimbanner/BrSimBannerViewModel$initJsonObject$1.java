package com.blackhub.bronline.game.gui.brsimbanner;

import android.app.Application;
import android.graphics.Bitmap;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.constants.resources.PngConstantsId67;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.brsimbanner.model.BrSimBannerCarModel;
import com.blackhub.bronline.game.gui.brsimbanner.model.BrSimBannerItem;
import com.blackhub.bronline.game.gui.brsimbanner.model.BrSimBannerItemForRowStateModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: BrSimBannerViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.brsimbanner.BrSimBannerViewModel$initJsonObject$1", f = "BrSimBannerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nBrSimBannerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrSimBannerViewModel.kt\ncom/blackhub/bronline/game/gui/brsimbanner/BrSimBannerViewModel$initJsonObject$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,222:1\n230#2,5:223\n*S KotlinDebug\n*F\n+ 1 BrSimBannerViewModel.kt\ncom/blackhub/bronline/game/gui/brsimbanner/BrSimBannerViewModel$initJsonObject$1\n*L\n188#1:223,5\n*E\n"})
/* loaded from: classes3.dex */
public final class BrSimBannerViewModel$initJsonObject$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ BrSimBannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrSimBannerViewModel$initJsonObject$1(JSONObject jSONObject, BrSimBannerViewModel brSimBannerViewModel, Continuation<? super BrSimBannerViewModel$initJsonObject$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = brSimBannerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BrSimBannerViewModel$initJsonObject$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BrSimBannerViewModel$initJsonObject$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Application application;
        StringResource stringResource;
        StringResource stringResource2;
        StringResource stringResource3;
        Application application2;
        StringResource stringResource4;
        StringResource stringResource5;
        StringResource stringResource6;
        Application application3;
        StringResource stringResource7;
        StringResource stringResource8;
        StringResource stringResource9;
        Application application4;
        StringResource stringResource10;
        StringResource stringResource11;
        StringResource stringResource12;
        Application application5;
        Application application6;
        StringResource stringResource13;
        StringResource stringResource14;
        StringResource stringResource15;
        StringResource stringResource16;
        StringResource stringResource17;
        StringResource stringResource18;
        StringResource stringResource19;
        StringResource stringResource20;
        StringResource stringResource21;
        StringResource stringResource22;
        BrSimBannerUIState value;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String optString = this.$json.optString("l");
        application = this.this$0.application;
        ImageTypePathInCDNEnum imageTypePathInCDNEnum = ImageTypePathInCDNEnum.IMAGE;
        Bitmap pngBitmapFromZip = BitmapUtilsKt.getPngBitmapFromZip(application, PngConstantsId67.BR_SIM_CAR_2, imageTypePathInCDNEnum);
        stringResource = this.this$0.stringResources;
        stringResource2 = this.this$0.stringResources;
        String string = stringResource2.getString(R.string.br_sim_banner_car_2_site);
        stringResource3 = this.this$0.stringResources;
        String str = (String) UtilsKt.buildTypeMerge(string, stringResource3.getString(R.string.br_sim_banner_car_2_store));
        if (str == null) {
            str = "";
        }
        BrSimBannerCarModel brSimBannerCarModel = new BrSimBannerCarModel(pngBitmapFromZip, StringExtensionKt.htmlTextToAnnotatedString(stringResource.getString(R.string.br_sim_banner_car_1, str)));
        application2 = this.this$0.application;
        Bitmap pngBitmapFromZip2 = BitmapUtilsKt.getPngBitmapFromZip(application2, PngConstantsId67.BR_SIM_CAR_3, imageTypePathInCDNEnum);
        stringResource4 = this.this$0.stringResources;
        stringResource5 = this.this$0.stringResources;
        String string2 = stringResource5.getString(R.string.br_sim_banner_car_3_site);
        stringResource6 = this.this$0.stringResources;
        String str2 = (String) UtilsKt.buildTypeMerge(string2, stringResource6.getString(R.string.br_sim_banner_car_3_store));
        if (str2 == null) {
            str2 = "";
        }
        BrSimBannerCarModel brSimBannerCarModel2 = new BrSimBannerCarModel(pngBitmapFromZip2, StringExtensionKt.htmlTextToAnnotatedString(stringResource4.getString(R.string.br_sim_banner_car_2, str2)));
        application3 = this.this$0.application;
        Bitmap pngBitmapFromZip3 = BitmapUtilsKt.getPngBitmapFromZip(application3, PngConstantsId67.BR_SIM_CAR_4, imageTypePathInCDNEnum);
        stringResource7 = this.this$0.stringResources;
        stringResource8 = this.this$0.stringResources;
        String string3 = stringResource8.getString(R.string.br_sim_banner_car_4_site);
        stringResource9 = this.this$0.stringResources;
        String str3 = (String) UtilsKt.buildTypeMerge(string3, stringResource9.getString(R.string.br_sim_banner_car_4_store));
        if (str3 == null) {
            str3 = "";
        }
        BrSimBannerCarModel brSimBannerCarModel3 = new BrSimBannerCarModel(pngBitmapFromZip3, StringExtensionKt.htmlTextToAnnotatedString(stringResource7.getString(R.string.br_sim_banner_car_3, str3)));
        application4 = this.this$0.application;
        Bitmap pngBitmapFromZip4 = BitmapUtilsKt.getPngBitmapFromZip(application4, PngConstantsId67.BR_SIM_CAR_5, imageTypePathInCDNEnum);
        stringResource10 = this.this$0.stringResources;
        stringResource11 = this.this$0.stringResources;
        String string4 = stringResource11.getString(R.string.br_sim_banner_car_5_site);
        stringResource12 = this.this$0.stringResources;
        String str4 = (String) UtilsKt.buildTypeMerge(string4, stringResource12.getString(R.string.br_sim_banner_car_5_store));
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new BrSimBannerCarModel[]{brSimBannerCarModel, brSimBannerCarModel2, brSimBannerCarModel3, new BrSimBannerCarModel(pngBitmapFromZip4, StringExtensionKt.htmlTextToAnnotatedString(stringResource10.getString(R.string.br_sim_banner_car_4, str4 != null ? str4 : "")))});
        application5 = this.this$0.application;
        Bitmap pngBitmapFromZip5 = BitmapUtilsKt.getPngBitmapFromZip(application5, PngConstantsId67.BR_SIM_BG, ImageTypePathInCDNEnum.BACKGROUND);
        application6 = this.this$0.application;
        Bitmap pngBitmapFromZip6 = BitmapUtilsKt.getPngBitmapFromZip(application6, PngConstantsId67.BR_SIM_IMAGE, imageTypePathInCDNEnum);
        stringResource13 = this.this$0.stringResources;
        String string5 = stringResource13.getString(R.string.br_sim_banner_text_for_pager_1);
        stringResource14 = this.this$0.stringResources;
        BrSimBannerItemForRowStateModel brSimBannerItemForRowStateModel = new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(stringResource14.getString(R.string.br_sim_banner_prize_1)), R.color.gray, R.drawable.ic_br_logo_no_white, 0.8f, 0.0f, 16, null);
        stringResource15 = this.this$0.stringResources;
        BrSimBannerItemForRowStateModel brSimBannerItemForRowStateModel2 = new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(stringResource15.getString(R.string.br_sim_banner_prize_2)), R.color.gray, R.drawable.ic_youtube, 0.7f, 0.0f, 16, null);
        stringResource16 = this.this$0.stringResources;
        List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new BrSimBannerItemForRowStateModel[]{brSimBannerItemForRowStateModel, brSimBannerItemForRowStateModel2, new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(stringResource16.getString(R.string.br_sim_banner_prize_3)), R.color.gray, R.drawable.ic_twitch, 0.7f, 0.0f, 16, null)});
        stringResource17 = this.this$0.stringResources;
        BrSimBannerItemForRowStateModel brSimBannerItemForRowStateModel3 = new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(stringResource17.getString(R.string.br_sim_banner_prize_4)), R.color.yellow, R.drawable.vip_gold, 0.9f, 0.0f, 16, null);
        stringResource18 = this.this$0.stringResources;
        BrSimBannerItem brSimBannerItem = new BrSimBannerItem(string5, listOf2, CollectionsKt__CollectionsKt.listOf((Object[]) new BrSimBannerItemForRowStateModel[]{brSimBannerItemForRowStateModel3, new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(stringResource18.getString(R.string.br_sim_banner_prize_5)), R.color.light_blue, R.drawable.x2_cash, 1.5f, 0.0f, 16, null)}));
        stringResource19 = this.this$0.stringResources;
        String string6 = stringResource19.getString(R.string.br_sim_banner_text_for_pager_2);
        stringResource20 = this.this$0.stringResources;
        BrSimBannerItemForRowStateModel brSimBannerItemForRowStateModel4 = new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(stringResource20.getString(R.string.br_sim_banner_prize_6)), R.color.yellow, R.drawable.vip_gold, 0.9f, 0.0f, 16, null);
        stringResource21 = this.this$0.stringResources;
        List listOf3 = CollectionsKt__CollectionsKt.listOf((Object[]) new BrSimBannerItemForRowStateModel[]{brSimBannerItemForRowStateModel4, new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(stringResource21.getString(R.string.br_sim_banner_prize_7)), R.color.light_blue, R.drawable.ic_br_sim_banner_skin, 0.0f, 0.8f, 8, null)});
        stringResource22 = this.this$0.stringResources;
        List listOf4 = CollectionsKt__CollectionsKt.listOf((Object[]) new BrSimBannerItem[]{brSimBannerItem, new BrSimBannerItem(string6, listOf3, CollectionsKt__CollectionsJVMKt.listOf(new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(stringResource22.getString(R.string.br_sim_banner_prize_8)), R.color.dark_orange, R.drawable.ic_br_sim_banner_car_for_month, 0.0f, 1.3f, 8, null)))});
        MutableStateFlow<? extends BrSimBannerUIState> mutableStateFlow = this.this$0.get_uiState();
        do {
            value = mutableStateFlow.getValue();
            Intrinsics.checkNotNull(optString);
        } while (!mutableStateFlow.compareAndSet(value, BrSimBannerUIState.copy$default(value, pngBitmapFromZip5, pngBitmapFromZip6, listOf, listOf4, optString, false, 32, null)));
        return Unit.INSTANCE;
    }
}
