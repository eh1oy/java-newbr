package com.blackhub.bronline.game.gui.blackpassbanner.viewmodel;

import android.app.Application;
import android.graphics.Bitmap;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.model.remote.response.blackpass.BlackPassProperties;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: BlackPassBannerViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.blackpassbanner.viewmodel.BlackPassBannerViewModel$initRewardsAndProperties$1$rightImage$1", f = "BlackPassBannerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class BlackPassBannerViewModel$initRewardsAndProperties$1$rightImage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
    public final /* synthetic */ BlackPassProperties $properties;
    public int label;
    public final /* synthetic */ BlackPassBannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackPassBannerViewModel$initRewardsAndProperties$1$rightImage$1(BlackPassBannerViewModel blackPassBannerViewModel, BlackPassProperties blackPassProperties, Continuation<? super BlackPassBannerViewModel$initRewardsAndProperties$1$rightImage$1> continuation) {
        super(2, continuation);
        this.this$0 = blackPassBannerViewModel;
        this.$properties = blackPassProperties;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BlackPassBannerViewModel$initRewardsAndProperties$1$rightImage$1(this.this$0, this.$properties, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Bitmap> continuation) {
        return ((BlackPassBannerViewModel$initRewardsAndProperties$1$rightImage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Application application;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            application = this.this$0.application;
            BlackPassProperties blackPassProperties = this.$properties;
            String rightImage = blackPassProperties != null ? blackPassProperties.getRightImage() : null;
            if (rightImage == null) {
                rightImage = "";
            }
            return BitmapUtilsKt.getBitmapFromZip$default(application, rightImage, ImageTypePathInCDNEnum.IMAGE, 0.0f, 0.0f, 24, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
