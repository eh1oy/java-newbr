package com.blackhub.bronline.game.gui.drivingschool.viewmodel;

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
public final class DrivingSchoolClassInfoViewModel_Factory implements Factory<DrivingSchoolClassInfoViewModel> {

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    public static final class InstanceHolder {
        public static final DrivingSchoolClassInfoViewModel_Factory INSTANCE = new DrivingSchoolClassInfoViewModel_Factory();
    }

    @Override // javax.inject.Provider
    public DrivingSchoolClassInfoViewModel get() {
        return newInstance();
    }

    public static DrivingSchoolClassInfoViewModel_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DrivingSchoolClassInfoViewModel newInstance() {
        return new DrivingSchoolClassInfoViewModel();
    }
}
