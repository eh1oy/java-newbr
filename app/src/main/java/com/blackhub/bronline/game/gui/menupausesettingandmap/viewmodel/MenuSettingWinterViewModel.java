package com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import com.blackhub.bronline.game.gui.menupausesettingandmap.state.MenuWinterUiState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: MenuSettingWinterViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u000fJ\b\u0010\u0016\u001a\u00020\u000fH\u0002J\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0018\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingWinterViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/state/MenuWinterUiState;", "preferencesRepository", "Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;", "(Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "initialParameters", "", "sendNewSettingParameter", "currentSettingKey", "", "newParameter", "", "setDefaultParameters", "setInitFlag", "setSnowIntensity", "snowIntensityValue", "setWinterSlip", "isWinterSlip", "", "updateParams", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMenuSettingWinterViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuSettingWinterViewModel.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingWinterViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,95:1\n230#2,5:96\n230#2,5:101\n230#2,5:106\n*S KotlinDebug\n*F\n+ 1 MenuSettingWinterViewModel.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingWinterViewModel\n*L\n69#1:96,5\n80#1:101,5\n89#1:106,5\n*E\n"})
/* loaded from: classes3.dex */
public final class MenuSettingWinterViewModel extends BaseViewModel<MenuWinterUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<MenuWinterUiState> _uiState;

    @NotNull
    public final PreferencesRepository preferencesRepository;

    @NotNull
    public final StateFlow<MenuWinterUiState> uiState;

    @Inject
    public MenuSettingWinterViewModel(@NotNull PreferencesRepository preferencesRepository) {
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.preferencesRepository = preferencesRepository;
        this._uiState = StateFlowKt.MutableStateFlow(new MenuWinterUiState(0, false, false, false, 15, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends MenuWinterUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<MenuWinterUiState> getUiState() {
        return this.uiState;
    }

    public final void initialParameters() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new MenuSettingWinterViewModel$initialParameters$1(this, null), 1, null);
    }

    public final void setDefaultParameters() {
        PreferencesRepository preferencesRepository = this.preferencesRepository;
        preferencesRepository.putInteger(NewMenuConstants.SNOW_INTENSITY, 2);
        preferencesRepository.putInteger(NewMenuConstants.WINTER_SLIP, 0);
        setInitFlag();
        updateParams(2, false);
    }

    public final void setInitFlag() {
        this.preferencesRepository.putInteger(NewMenuConstants.IS_INIT_SETTING_WINTER, 1);
    }

    public final void sendNewSettingParameter(@NotNull String currentSettingKey, int newParameter) {
        Intrinsics.checkNotNullParameter(currentSettingKey, "currentSettingKey");
        this.preferencesRepository.putInteger(currentSettingKey, newParameter);
    }

    public final void setSnowIntensity(int snowIntensityValue) {
        MenuWinterUiState value;
        MutableStateFlow<? extends MenuWinterUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, MenuWinterUiState.copy$default(value, snowIntensityValue, false, false, false, 14, null)));
    }

    public final void updateParams(int snowIntensityValue, boolean isWinterSlip) {
        MenuWinterUiState value;
        MutableStateFlow<? extends MenuWinterUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, MenuWinterUiState.copy$default(value, snowIntensityValue, isWinterSlip, false, false, 12, null)));
    }

    public final void setWinterSlip(boolean isWinterSlip) {
        MenuWinterUiState value;
        MutableStateFlow<? extends MenuWinterUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, MenuWinterUiState.copy$default(value, 0, isWinterSlip, false, false, 13, null)));
    }
}
