package com.blackhub.bronline.game.gui.brsimbanner;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: BrSimBannerViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0017J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/blackhub/bronline/game/gui/brsimbanner/BrSimBannerViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/brsimbanner/BrSimBannerUIState;", "actionsWithJson", "Lcom/blackhub/bronline/game/gui/brsimbanner/BrSimBannerActionsWithJson;", "application", "Landroid/app/Application;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "stringResources", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "(Lcom/blackhub/bronline/game/gui/brsimbanner/BrSimBannerActionsWithJson;Landroid/app/Application;Lcom/blackhub/bronline/game/common/LocalNotification;Lcom/blackhub/bronline/game/core/resources/StringResource;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getLocalNotification", "()Lcom/blackhub/bronline/game/common/LocalNotification;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "initJsonObject", "", "json", "Lorg/json/JSONObject;", "onClickWatchTariff", "sendButtonPressed", "action", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BrSimBannerViewModel extends BaseViewModel<BrSimBannerUIState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<BrSimBannerUIState> _uiState;

    @NotNull
    public final BrSimBannerActionsWithJson actionsWithJson;

    @NotNull
    public final Application application;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final StringResource stringResources;

    @NotNull
    public final StateFlow<BrSimBannerUIState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Inject
    public BrSimBannerViewModel(@NotNull BrSimBannerActionsWithJson actionsWithJson, @NotNull Application application, @NotNull LocalNotification localNotification, @NotNull StringResource stringResources) {
        Intrinsics.checkNotNullParameter(actionsWithJson, "actionsWithJson");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        Intrinsics.checkNotNullParameter(stringResources, "stringResources");
        this.actionsWithJson = actionsWithJson;
        this.application = application;
        this.localNotification = localNotification;
        this.stringResources = stringResources;
        this._uiState = StateFlowKt.MutableStateFlow(new BrSimBannerUIState(null, null, null, null, null, false, 63, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends BrSimBannerUIState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<BrSimBannerUIState> getUiState() {
        return this.uiState;
    }

    public final void initJsonObject(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new BrSimBannerViewModel$initJsonObject$1(json, this, null), 1, null);
    }

    public final void onClickWatchTariff() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new BrSimBannerViewModel$onClickWatchTariff$1(this, null), 1, null);
    }

    public final void sendButtonPressed(int action) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new BrSimBannerViewModel$sendButtonPressed$1(this, action, null), 1, null);
    }
}
