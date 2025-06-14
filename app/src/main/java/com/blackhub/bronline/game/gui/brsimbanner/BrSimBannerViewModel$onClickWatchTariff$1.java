package com.blackhub.bronline.game.gui.brsimbanner;

import android.app.Application;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.resources.StringResource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: BrSimBannerViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.brsimbanner.BrSimBannerViewModel$onClickWatchTariff$1", f = "BrSimBannerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class BrSimBannerViewModel$onClickWatchTariff$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ BrSimBannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrSimBannerViewModel$onClickWatchTariff$1(BrSimBannerViewModel brSimBannerViewModel, Continuation<? super BrSimBannerViewModel$onClickWatchTariff$1> continuation) {
        super(2, continuation);
        this.this$0 = brSimBannerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BrSimBannerViewModel$onClickWatchTariff$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BrSimBannerViewModel$onClickWatchTariff$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        StringResource stringResource;
        BrSimBannerActionsWithJson brSimBannerActionsWithJson;
        Application application;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            build.intent.addFlags(268435456);
            Intrinsics.checkNotNullExpressionValue(build, "apply(...)");
            application = this.this$0.application;
            build.launchUrl(application, Uri.parse(this.this$0.get_uiState().getValue().getLink()));
        } catch (Exception unused) {
            LocalNotification localNotification = this.this$0.getLocalNotification();
            stringResource = this.this$0.stringResources;
            localNotification.showErrorNotification(stringResource.getString(R.string.error_message_about_browser));
        }
        brSimBannerActionsWithJson = this.this$0.actionsWithJson;
        brSimBannerActionsWithJson.sendButtonPressed(1);
        return Unit.INSTANCE;
    }
}
