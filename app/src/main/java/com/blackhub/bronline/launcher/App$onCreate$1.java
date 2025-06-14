package com.blackhub.bronline.launcher;

import android.content.Context;
import com.blackhub.bronline.common.MarketAnalytic;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.google.firebase.FirebaseApp;
import java.util.Locale;
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
  C:\javanew\classes4.dex
 */
/* compiled from: App.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.launcher.App$onCreate$1", f = "App.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class App$onCreate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ App this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public App$onCreate$1(App app, Continuation<? super App$onCreate$1> continuation) {
        super(2, continuation);
        this.this$0 = app;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new App$onCreate$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((App$onCreate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            FirebaseApp.initializeApp(this.this$0);
            MarketAnalytic.INSTANCE.initialise(this.this$0);
            Settings.CLIENT_PACKAGE = this.this$0.getApplicationContext().getPackageName();
            Settings.LAUNCHER_PACKAGE = this.this$0.getApplicationContext().getPackageName();
            Settings.COUNTRY_MARKET_BY_SYSTEM_LANGUAGE = Locale.getDefault().getCountry();
            Context applicationContext = this.this$0.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            Settings.COUNTRY_MARKET_BY_TELEPHONE_MANAGER = UtilsKt.getNetworkCountry(applicationContext);
        } catch (Exception e) {
            UtilsKt.crashlyticsRecordNewException("App onCreate " + e);
        }
        return Unit.INSTANCE;
    }
}
