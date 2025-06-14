package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.game.gui.panelinfo.PanelInfoActionWithJSON;
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
public final class NetworkModule_ProvidePanelInfoActionWithJSONFactory implements Factory<PanelInfoActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvidePanelInfoActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public PanelInfoActionWithJSON get() {
        return providePanelInfoActionWithJSON(this.module);
    }

    public static NetworkModule_ProvidePanelInfoActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvidePanelInfoActionWithJSONFactory(module);
    }

    public static PanelInfoActionWithJSON providePanelInfoActionWithJSON(NetworkModule instance) {
        return (PanelInfoActionWithJSON) Preconditions.checkNotNullFromProvides(instance.providePanelInfoActionWithJSON());
    }
}
