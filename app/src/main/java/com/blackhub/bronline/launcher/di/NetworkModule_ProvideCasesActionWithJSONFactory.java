package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.game.gui.cases.network.CasesActionWithJSON;
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
public final class NetworkModule_ProvideCasesActionWithJSONFactory implements Factory<CasesActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideCasesActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public CasesActionWithJSON get() {
        return provideCasesActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideCasesActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideCasesActionWithJSONFactory(module);
    }

    public static CasesActionWithJSON provideCasesActionWithJSON(NetworkModule instance) {
        return (CasesActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideCasesActionWithJSON());
    }
}
