package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.game.gui.entertainmentsystem.network.EntertainmentSystemActionsWithJSON;
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
public final class NetworkModule_ProvideEntertainmentSystemActionsWithJSONFactory implements Factory<EntertainmentSystemActionsWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideEntertainmentSystemActionsWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public EntertainmentSystemActionsWithJSON get() {
        return provideEntertainmentSystemActionsWithJSON(this.module);
    }

    public static NetworkModule_ProvideEntertainmentSystemActionsWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideEntertainmentSystemActionsWithJSONFactory(module);
    }

    public static EntertainmentSystemActionsWithJSON provideEntertainmentSystemActionsWithJSON(NetworkModule instance) {
        return (EntertainmentSystemActionsWithJSON) Preconditions.checkNotNullFromProvides(instance.provideEntertainmentSystemActionsWithJSON());
    }
}
