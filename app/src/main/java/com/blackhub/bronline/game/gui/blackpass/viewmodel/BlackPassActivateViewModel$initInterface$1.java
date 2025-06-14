package com.blackhub.bronline.game.gui.blackpass.viewmodel;

import android.app.Application;
import com.blackhub.bronline.game.core.constants.resources.PngConstantsId22;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.blackpass.utils.BlackPassKeys;
import com.blackhub.bronline.game.model.remote.response.blackpass.LevelsInfo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: BlackPassActivateViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassActivateViewModel$initInterface$1", f = "BlackPassActivateViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class BlackPassActivateViewModel$initInterface$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public final /* synthetic */ ArrayList<LevelsInfo> $rewards;
    public int label;
    public final /* synthetic */ BlackPassActivateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackPassActivateViewModel$initInterface$1(BlackPassActivateViewModel blackPassActivateViewModel, JSONObject jSONObject, ArrayList<LevelsInfo> arrayList, Continuation<? super BlackPassActivateViewModel$initInterface$1> continuation) {
        super(2, continuation);
        this.this$0 = blackPassActivateViewModel;
        this.$json = jSONObject;
        this.$rewards = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BlackPassActivateViewModel$initInterface$1(this.this$0, this.$json, this.$rewards, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BlackPassActivateViewModel$initInterface$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        Application application;
        MutableStateFlow mutableStateFlow4;
        Application application2;
        MutableStateFlow mutableStateFlow5;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.this$0.mutablePremiumPrice;
            mutableStateFlow.setValue(Boxing.boxInt(this.$json.optInt("p")));
            mutableStateFlow2 = this.this$0.mutablePremiumDeluxePrice;
            mutableStateFlow2.setValue(Boxing.boxInt(this.$json.optInt(BlackPassKeys.P_PREMIUM_DELUXE_PRICE)));
            LevelsInfo levelsInfo = this.$rewards.get(0);
            Intrinsics.checkNotNullExpressionValue(levelsInfo, "get(...)");
            LevelsInfo levelsInfo2 = levelsInfo;
            String str = (String) UtilsKt.buildTypeMerge(levelsInfo2.getName(), levelsInfo2.getNameStore());
            if (str == null) {
                str = "";
            }
            mutableStateFlow3 = this.this$0._imgOfferSplit;
            application = this.this$0.application;
            ImageTypePathInCDNEnum imageTypePathInCDNEnum = ImageTypePathInCDNEnum.IMAGE;
            mutableStateFlow3.setValue(BitmapUtilsKt.getPngBitmapFromZip(application, PngConstantsId22.IMG_OFFER_SPLIT, imageTypePathInCDNEnum));
            mutableStateFlow4 = this.this$0._imgDeluxeCar;
            application2 = this.this$0.application;
            mutableStateFlow4.setValue(BitmapUtilsKt.getPngBitmapFromZip(application2, PngConstantsId22.IMG_SPLIT_DELUXE_CAR, imageTypePathInCDNEnum));
            mutableStateFlow5 = this.this$0._nameDeluxeCar;
            mutableStateFlow5.setValue(str);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
