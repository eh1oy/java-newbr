package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.game.gui.tutorialhints.TutorialHintActionWithJSON;
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
public final class NetworkModule_ProvideTutorialHintActionWithJSONFactory implements Factory<TutorialHintActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideTutorialHintActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public TutorialHintActionWithJSON get() {
        return provideTutorialHintActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideTutorialHintActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideTutorialHintActionWithJSONFactory(module);
    }

    public static TutorialHintActionWithJSON provideTutorialHintActionWithJSON(NetworkModule instance) {
        return (TutorialHintActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideTutorialHintActionWithJSON());
    }
}
