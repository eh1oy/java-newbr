package com.blackhub.bronline.game.gui.donate.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class DonateServiceViewModel_Factory implements Factory<DonateServiceViewModel> {

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    public static final class InstanceHolder {
        public static final DonateServiceViewModel_Factory INSTANCE = new DonateServiceViewModel_Factory();
    }

    @Override // javax.inject.Provider
    public DonateServiceViewModel get() {
        return newInstance();
    }

    public static DonateServiceViewModel_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DonateServiceViewModel newInstance() {
        return new DonateServiceViewModel();
    }
}
