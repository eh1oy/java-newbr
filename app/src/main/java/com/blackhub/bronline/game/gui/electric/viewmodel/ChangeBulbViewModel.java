package com.blackhub.bronline.game.gui.electric.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.gui.electric.state.ChangeBulbUiState;
import com.blackhub.bronline.game.gui.electric.utils.ElectricConstants;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
/* compiled from: ChangeBulbViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\"B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000fJ\b\u0010\u001c\u001a\u00020\u0019H\u0002J\u0006\u0010\u001d\u001a\u00020\u0019J\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\u0019R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/blackhub/bronline/game/gui/electric/viewmodel/ChangeBulbViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/electric/state/ChangeBulbUiState;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "preferencesRepository", "Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;", "(Lcom/blackhub/bronline/game/common/LocalNotification;Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "bulbBusyList", "", "", "getBulbBusyList", "()Ljava/util/List;", "getLocalNotification", "()Lcom/blackhub/bronline/game/common/LocalNotification;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "closeHint", "", "initArgs", "screenArgs", "initPreferences", "setBulbBrokeInvisible", "setBulbVisible", "countWin", "", "showHint", "Companion", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChangeBulbViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeBulbViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/ChangeBulbViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,111:1\n230#2,5:112\n230#2,5:117\n230#2,5:122\n*S KotlinDebug\n*F\n+ 1 ChangeBulbViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/ChangeBulbViewModel\n*L\n54#1:112,5\n76#1:117,5\n84#1:122,5\n*E\n"})
/* loaded from: classes3.dex */
public final class ChangeBulbViewModel extends BaseViewModel<ChangeBulbUiState> implements ViewModelProvider.Factory {
    public static final int COUNT_WIN = 2;

    @NotNull
    public final MutableStateFlow<ChangeBulbUiState> _uiState;

    @NotNull
    public final List<String> bulbBusyList;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final PreferencesRepository preferencesRepository;

    @NotNull
    public final StateFlow<ChangeBulbUiState> uiState;
    public static final int $stable = 8;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Inject
    public ChangeBulbViewModel(@NotNull LocalNotification localNotification, @NotNull PreferencesRepository preferencesRepository) {
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.localNotification = localNotification;
        this.preferencesRepository = preferencesRepository;
        this._uiState = StateFlowKt.MutableStateFlow(new ChangeBulbUiState(null, false, false, 0, false, false, false, null, 255, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
        this.bulbBusyList = CollectionsKt__CollectionsKt.mutableListOf(ElectricConstants.BULB_BUSY);
        initPreferences();
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends ChangeBulbUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<ChangeBulbUiState> getUiState() {
        return this.uiState;
    }

    @NotNull
    public final List<String> getBulbBusyList() {
        return this.bulbBusyList;
    }

    public final void setBulbBrokeInvisible() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new ChangeBulbViewModel$setBulbBrokeInvisible$1(this, null), 1, null);
    }

    public final void setBulbVisible(int countWin) {
        ChangeBulbUiState value;
        ChangeBulbUiState copy;
        boolean z = countWin == 2;
        MutableStateFlow<? extends ChangeBulbUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r0.copy((r18 & 1) != 0 ? r0.instructionsAndHints : null, (r18 & 2) != 0 ? r0.isHintShow : false, (r18 & 4) != 0 ? r0.isHandShow : false, (r18 & 8) != 0 ? r0.countHint : 0, (r18 & 16) != 0 ? r0.isBulbBrokeVisible : !z, (r18 & 32) != 0 ? r0.isBulbFullVisible : z, (r18 & 64) != 0 ? r0.isFirstGame : false, (r18 & 128) != 0 ? value.isWin : Boolean.valueOf(z));
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void initArgs(@NotNull String screenArgs) {
        Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new ChangeBulbViewModel$initArgs$1(screenArgs, this, null), 1, null);
    }

    public final void showHint() {
        ChangeBulbUiState value;
        ChangeBulbUiState copy;
        MutableStateFlow<? extends ChangeBulbUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r18 & 1) != 0 ? r2.instructionsAndHints : null, (r18 & 2) != 0 ? r2.isHintShow : true, (r18 & 4) != 0 ? r2.isHandShow : false, (r18 & 8) != 0 ? r2.countHint : 0, (r18 & 16) != 0 ? r2.isBulbBrokeVisible : false, (r18 & 32) != 0 ? r2.isBulbFullVisible : false, (r18 & 64) != 0 ? r2.isFirstGame : false, (r18 & 128) != 0 ? value.isWin : null);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void closeHint() {
        ChangeBulbUiState value;
        ChangeBulbUiState copy;
        MutableStateFlow<? extends ChangeBulbUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r18 & 1) != 0 ? r2.instructionsAndHints : null, (r18 & 2) != 0 ? r2.isHintShow : false, (r18 & 4) != 0 ? r2.isHandShow : false, (r18 & 8) != 0 ? r2.countHint : 0, (r18 & 16) != 0 ? r2.isBulbBrokeVisible : false, (r18 & 32) != 0 ? r2.isBulbFullVisible : false, (r18 & 64) != 0 ? r2.isFirstGame : false, (r18 & 128) != 0 ? value.isWin : null);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void initPreferences() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new ChangeBulbViewModel$initPreferences$1(this, null), 1, null);
    }
}
