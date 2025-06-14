package com.blackhub.bronline.game.gui.drivingschool.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.blackhub.bronline.game.gui.drivingschool.data.DrivingMainType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.apache.ivy.osgi.updatesite.xml.EclipseUpdateSiteParser;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: DrivingSchoolClassInfoViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nJ\u0006\u0010\u0013\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0005R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolClassInfoViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "driverLicenseType", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/blackhub/bronline/game/gui/drivingschool/data/DrivingMainType;", "getDriverLicenseType", "()Lkotlinx/coroutines/flow/StateFlow;", "isApplyStartTest", "Lkotlinx/coroutines/flow/SharedFlow;", "", "()Lkotlinx/coroutines/flow/SharedFlow;", "mutableDriverLicenseType", "Lkotlinx/coroutines/flow/MutableStateFlow;", "mutableIsApplyStartTest", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "checkStartTest", "", "status", "clearInfoAboutCategory", "saveCategory", EclipseUpdateSiteParser.CategoryHandler.CATEGORY, "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DrivingSchoolClassInfoViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final StateFlow<DrivingMainType> driverLicenseType;

    @NotNull
    public final SharedFlow<Boolean> isApplyStartTest;

    @NotNull
    public final MutableStateFlow<DrivingMainType> mutableDriverLicenseType;

    @NotNull
    public final MutableSharedFlow<Boolean> mutableIsApplyStartTest;

    @Inject
    public DrivingSchoolClassInfoViewModel() {
        MutableStateFlow<DrivingMainType> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.mutableDriverLicenseType = MutableStateFlow;
        this.driverLicenseType = MutableStateFlow;
        MutableSharedFlow<Boolean> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableIsApplyStartTest = MutableSharedFlow$default;
        this.isApplyStartTest = MutableSharedFlow$default;
    }

    @NotNull
    public final StateFlow<DrivingMainType> getDriverLicenseType() {
        return this.driverLicenseType;
    }

    @NotNull
    public final SharedFlow<Boolean> isApplyStartTest() {
        return this.isApplyStartTest;
    }

    public final void saveCategory(@NotNull DrivingMainType category) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.mutableDriverLicenseType.setValue(category);
    }

    public final void checkStartTest(boolean status) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DrivingSchoolClassInfoViewModel$checkStartTest$1(this, status, null), 3, null);
    }

    public final void clearInfoAboutCategory() {
        this.mutableDriverLicenseType.setValue(null);
    }
}
