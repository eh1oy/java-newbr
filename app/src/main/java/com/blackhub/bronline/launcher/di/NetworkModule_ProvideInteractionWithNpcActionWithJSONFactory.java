package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcActionWithJSON;
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
public final class NetworkModule_ProvideInteractionWithNpcActionWithJSONFactory implements Factory<InteractionWithNpcActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideInteractionWithNpcActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public InteractionWithNpcActionWithJSON get() {
        return provideInteractionWithNpcActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideInteractionWithNpcActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideInteractionWithNpcActionWithJSONFactory(module);
    }

    public static InteractionWithNpcActionWithJSON provideInteractionWithNpcActionWithJSON(NetworkModule instance) {
        return (InteractionWithNpcActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideInteractionWithNpcActionWithJSON());
    }
}
