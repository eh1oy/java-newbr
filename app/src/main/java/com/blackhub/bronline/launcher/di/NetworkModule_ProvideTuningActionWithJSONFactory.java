package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.game.gui.tuning.network.TuningActionWithJSON;
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
public final class NetworkModule_ProvideTuningActionWithJSONFactory implements Factory<TuningActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideTuningActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public TuningActionWithJSON get() {
        return provideTuningActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideTuningActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideTuningActionWithJSONFactory(module);
    }

    public static TuningActionWithJSON provideTuningActionWithJSON(NetworkModule instance) {
        return (TuningActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideTuningActionWithJSON());
    }
}
