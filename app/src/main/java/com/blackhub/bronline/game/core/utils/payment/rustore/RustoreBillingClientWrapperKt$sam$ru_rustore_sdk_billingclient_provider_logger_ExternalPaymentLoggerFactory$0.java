package com.blackhub.bronline.game.core.utils.payment.rustore;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.billingclient.provider.logger.ExternalPaymentLogger;
import ru.rustore.sdk.billingclient.provider.logger.ExternalPaymentLoggerFactory;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: RustoreBillingClientWrapper.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RustoreBillingClientWrapperKt$sam$ru_rustore_sdk_billingclient_provider_logger_ExternalPaymentLoggerFactory$0 implements ExternalPaymentLoggerFactory, FunctionAdapter {
    public final /* synthetic */ Function1 function;

    public RustoreBillingClientWrapperKt$sam$ru_rustore_sdk_billingclient_provider_logger_ExternalPaymentLoggerFactory$0(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    @Override // ru.rustore.sdk.billingclient.provider.logger.ExternalPaymentLoggerFactory
    public final /* synthetic */ ExternalPaymentLogger create(String str) {
        return (ExternalPaymentLogger) this.function.invoke(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof ExternalPaymentLoggerFactory) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    @NotNull
    public final Function<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
