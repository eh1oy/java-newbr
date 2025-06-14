package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperWithJSON;
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
public final class NetworkModule_ProvideMiniGamesHelperActionWithJSONFactory implements Factory<MiniGamesHelperWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideMiniGamesHelperActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public MiniGamesHelperWithJSON get() {
        return provideMiniGamesHelperActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideMiniGamesHelperActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideMiniGamesHelperActionWithJSONFactory(module);
    }

    public static MiniGamesHelperWithJSON provideMiniGamesHelperActionWithJSON(NetworkModule instance) {
        return (MiniGamesHelperWithJSON) Preconditions.checkNotNullFromProvides(instance.provideMiniGamesHelperActionWithJSON());
    }
}
