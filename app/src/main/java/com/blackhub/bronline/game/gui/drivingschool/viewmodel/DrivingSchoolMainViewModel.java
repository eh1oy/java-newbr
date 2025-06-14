package com.blackhub.bronline.game.gui.drivingschool.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.gui.drivingschool.data.DrivingMainType;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: DrivingSchoolMainViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bJ#\u0010\u0014\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\u0010\u001aR\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\fR\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolMainViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "driverLicenseType", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/blackhub/bronline/game/gui/drivingschool/data/DrivingMainType;", "getDriverLicenseType", "()Lkotlinx/coroutines/flow/StateFlow;", "isApplyDriverLicenseType", "Lkotlinx/coroutines/flow/SharedFlow;", "", "()Lkotlinx/coroutines/flow/SharedFlow;", "mutableDriverLicenseType", "Lkotlinx/coroutines/flow/MutableStateFlow;", "mutableIsApplyDriverLicenseType", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "checkDriverLicenseType", "", "status", "initDriverLicenseType", "json", "Lorg/json/JSONObject;", "allDriverLicenseTypes", "", "", "(Lorg/json/JSONObject;[Ljava/lang/String;)V", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DrivingSchoolMainViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final StateFlow<List<DrivingMainType>> driverLicenseType;

    @NotNull
    public final SharedFlow<Boolean> isApplyDriverLicenseType;

    @NotNull
    public final MutableStateFlow<List<DrivingMainType>> mutableDriverLicenseType;

    @NotNull
    public final MutableSharedFlow<Boolean> mutableIsApplyDriverLicenseType;

    @Inject
    public DrivingSchoolMainViewModel() {
        MutableStateFlow<List<DrivingMainType>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableDriverLicenseType = MutableStateFlow;
        this.driverLicenseType = MutableStateFlow;
        MutableSharedFlow<Boolean> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableIsApplyDriverLicenseType = MutableSharedFlow$default;
        this.isApplyDriverLicenseType = MutableSharedFlow$default;
    }

    @NotNull
    public final StateFlow<List<DrivingMainType>> getDriverLicenseType() {
        return this.driverLicenseType;
    }

    @NotNull
    public final SharedFlow<Boolean> isApplyDriverLicenseType() {
        return this.isApplyDriverLicenseType;
    }

    public final void initDriverLicenseType(@Nullable JSONObject json, @NotNull String[] allDriverLicenseTypes) {
        Intrinsics.checkNotNullParameter(allDriverLicenseTypes, "allDriverLicenseTypes");
        if (json != null) {
            JSONArray optJSONArray = json.optJSONArray("a");
            List<Integer> mutableIntList = optJSONArray != null ? JsonArrayExtensionKt.toMutableIntList(optJSONArray) : null;
            JSONArray optJSONArray2 = json.optJSONArray("p");
            List<Integer> mutableIntList2 = optJSONArray2 != null ? JsonArrayExtensionKt.toMutableIntList(optJSONArray2) : null;
            if (mutableIntList == null || mutableIntList2 == null || mutableIntList.size() != mutableIntList2.size()) {
                return;
            }
            this.mutableDriverLicenseType.setValue(CollectionsKt__CollectionsKt.listOf((Object[]) new DrivingMainType[]{new DrivingMainType(0, allDriverLicenseTypes[0], R.drawable.img_moto, mutableIntList2.get(0).intValue(), mutableIntList.get(0).intValue(), false), new DrivingMainType(1, allDriverLicenseTypes[1], R.drawable.img_car, mutableIntList2.get(1).intValue(), mutableIntList.get(1).intValue(), false), new DrivingMainType(2, allDriverLicenseTypes[2], R.drawable.img_cargo_trunk, mutableIntList2.get(2).intValue(), mutableIntList.get(2).intValue(), false), new DrivingMainType(3, allDriverLicenseTypes[3], R.drawable.img_bus, mutableIntList2.get(3).intValue(), mutableIntList.get(3).intValue(), false), new DrivingMainType(4, allDriverLicenseTypes[4], R.drawable.img_ship, mutableIntList2.get(4).intValue(), mutableIntList.get(4).intValue(), false)}));
            return;
        }
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        firebaseCrashlytics.log("json = null");
        firebaseCrashlytics.recordException(new Throwable());
    }

    public final void checkDriverLicenseType(boolean status) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DrivingSchoolMainViewModel$checkDriverLicenseType$1(this, status, null), 3, null);
    }
}
