package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.game.gui.socialnetworklink.network.SocialNetworkActionWithJSON;
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
public final class NetworkModule_ProvideSocialNetworkActionWithJSONFactory implements Factory<SocialNetworkActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideSocialNetworkActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public SocialNetworkActionWithJSON get() {
        return provideSocialNetworkActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideSocialNetworkActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideSocialNetworkActionWithJSONFactory(module);
    }

    public static SocialNetworkActionWithJSON provideSocialNetworkActionWithJSON(NetworkModule instance) {
        return (SocialNetworkActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideSocialNetworkActionWithJSON());
    }
}
