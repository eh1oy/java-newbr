package com.blackhub.bronline.game.core.viewmodel;

import com.blackhub.bronline.game.core.constants.LogTagConstants;
import com.blackhub.bronline.game.core.utils.UtilsKt;
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
/* compiled from: JNIActivityViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$connectPurchases$1", f = "JNIActivityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class JNIActivityViewModel$connectPurchases$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ boolean $isNeedToShowDonatePackage;
    public final /* synthetic */ boolean $isWithDouble;
    public int label;
    public final /* synthetic */ JNIActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JNIActivityViewModel$connectPurchases$1(boolean z, boolean z2, JNIActivityViewModel jNIActivityViewModel, Continuation<? super JNIActivityViewModel$connectPurchases$1> continuation) {
        super(2, continuation);
        this.$isWithDouble = z;
        this.$isNeedToShowDonatePackage = z2;
        this.this$0 = jNIActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new JNIActivityViewModel$connectPurchases$1(this.$isWithDouble, this.$isNeedToShowDonatePackage, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((JNIActivityViewModel$connectPurchases$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        UtilsKt.crashlyticsLog("connectPurchases, buildVariant site isWithDouble=" + this.$isWithDouble + ", isNeedToShowDonatePackage=" + this.$isNeedToShowDonatePackage, LogTagConstants.MARKET_BILLING_TAG);
        if (UtilsKt.isMarketBuildVariant() && this.$isNeedToShowDonatePackage) {
            this.this$0.displayProducts(this.$isWithDouble);
        }
        if (UtilsKt.isRustoreBuildVariant() && this.$isNeedToShowDonatePackage) {
            this.this$0.displayRustoreProducts(this.$isWithDouble);
        }
        return Unit.INSTANCE;
    }
}
