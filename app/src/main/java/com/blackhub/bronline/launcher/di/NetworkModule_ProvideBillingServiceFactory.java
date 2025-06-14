package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.launcher.network.PaymentApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class NetworkModule_ProvideBillingServiceFactory implements Factory<PaymentApi> {
    public final NetworkModule module;

    public NetworkModule_ProvideBillingServiceFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public PaymentApi get() {
        return provideBillingService(this.module);
    }

    public static NetworkModule_ProvideBillingServiceFactory create(NetworkModule module) {
        return new NetworkModule_ProvideBillingServiceFactory(module);
    }

    public static PaymentApi provideBillingService(NetworkModule instance) {
        return (PaymentApi) Preconditions.checkNotNullFromProvides(instance.provideBillingService());
    }
}
