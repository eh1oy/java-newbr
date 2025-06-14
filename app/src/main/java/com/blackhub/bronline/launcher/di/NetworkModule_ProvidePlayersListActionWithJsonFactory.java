package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.game.gui.playerslist.network.PlayersListActionWithJson;
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
public final class NetworkModule_ProvidePlayersListActionWithJsonFactory implements Factory<PlayersListActionWithJson> {
    public final NetworkModule module;

    public NetworkModule_ProvidePlayersListActionWithJsonFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public PlayersListActionWithJson get() {
        return providePlayersListActionWithJson(this.module);
    }

    public static NetworkModule_ProvidePlayersListActionWithJsonFactory create(NetworkModule module) {
        return new NetworkModule_ProvidePlayersListActionWithJsonFactory(module);
    }

    public static PlayersListActionWithJson providePlayersListActionWithJson(NetworkModule instance) {
        return (PlayersListActionWithJson) Preconditions.checkNotNullFromProvides(instance.providePlayersListActionWithJson());
    }
}
