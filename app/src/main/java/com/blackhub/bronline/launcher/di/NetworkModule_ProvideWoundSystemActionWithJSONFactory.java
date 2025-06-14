package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.game.gui.woundsystem.network.ActionsWithJSON;
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
public final class NetworkModule_ProvideWoundSystemActionWithJSONFactory implements Factory<ActionsWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideWoundSystemActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public ActionsWithJSON get() {
        return provideWoundSystemActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideWoundSystemActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideWoundSystemActionWithJSONFactory(module);
    }

    public static ActionsWithJSON provideWoundSystemActionWithJSON(NetworkModule instance) {
        return (ActionsWithJSON) Preconditions.checkNotNullFromProvides(instance.provideWoundSystemActionWithJSON());
    }
}
