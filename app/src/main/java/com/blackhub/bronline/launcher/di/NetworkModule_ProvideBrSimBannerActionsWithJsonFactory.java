package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.game.gui.brsimbanner.BrSimBannerActionsWithJson;
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
public final class NetworkModule_ProvideBrSimBannerActionsWithJsonFactory implements Factory<BrSimBannerActionsWithJson> {
    public final NetworkModule module;

    public NetworkModule_ProvideBrSimBannerActionsWithJsonFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public BrSimBannerActionsWithJson get() {
        return provideBrSimBannerActionsWithJson(this.module);
    }

    public static NetworkModule_ProvideBrSimBannerActionsWithJsonFactory create(NetworkModule module) {
        return new NetworkModule_ProvideBrSimBannerActionsWithJsonFactory(module);
    }

    public static BrSimBannerActionsWithJson provideBrSimBannerActionsWithJson(NetworkModule instance) {
        return (BrSimBannerActionsWithJson) Preconditions.checkNotNullFromProvides(instance.provideBrSimBannerActionsWithJson());
    }
}
