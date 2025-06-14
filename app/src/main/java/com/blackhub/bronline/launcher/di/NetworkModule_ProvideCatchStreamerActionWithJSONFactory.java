package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerActionWithJSON;
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
public final class NetworkModule_ProvideCatchStreamerActionWithJSONFactory implements Factory<CatchStreamerActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideCatchStreamerActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public CatchStreamerActionWithJSON get() {
        return provideCatchStreamerActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideCatchStreamerActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideCatchStreamerActionWithJSONFactory(module);
    }

    public static CatchStreamerActionWithJSON provideCatchStreamerActionWithJSON(NetworkModule instance) {
        return (CatchStreamerActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideCatchStreamerActionWithJSON());
    }
}
