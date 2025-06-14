package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.game.gui.calendar.network.CalendarActionWithJSON;
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
public final class NetworkModule_ProvideCalendarActionWithJSONFactory implements Factory<CalendarActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideCalendarActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public CalendarActionWithJSON get() {
        return provideCalendarActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideCalendarActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideCalendarActionWithJSONFactory(module);
    }

    public static CalendarActionWithJSON provideCalendarActionWithJSON(NetworkModule instance) {
        return (CalendarActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideCalendarActionWithJSON());
    }
}
