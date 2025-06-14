package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.game.gui.tanpinbanner.TanpinBannerActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class NetworkModule_ProvideTanpinBannerActionWithJSONFactory implements Factory<TanpinBannerActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideTanpinBannerActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public TanpinBannerActionWithJSON get() {
        return provideTanpinBannerActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideTanpinBannerActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideTanpinBannerActionWithJSONFactory(module);
    }

    public static TanpinBannerActionWithJSON provideTanpinBannerActionWithJSON(NetworkModule instance) {
        return (TanpinBannerActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideTanpinBannerActionWithJSON());
    }
}
