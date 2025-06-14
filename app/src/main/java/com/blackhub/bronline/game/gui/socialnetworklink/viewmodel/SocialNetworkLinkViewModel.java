package com.blackhub.bronline.game.gui.socialnetworklink.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.socialnetworklink.SocialNetworkLinkUiState;
import com.blackhub.bronline.game.gui.socialnetworklink.network.SocialNetworkActionWithJSON;
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
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: SocialNetworkLinkViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0014H\u0002J\u000e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/blackhub/bronline/game/gui/socialnetworklink/viewmodel/SocialNetworkLinkViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/socialnetworklink/SocialNetworkLinkUiState;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/socialnetworklink/network/SocialNetworkActionWithJSON;", "stringResource", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "(Lcom/blackhub/bronline/game/gui/socialnetworklink/network/SocialNetworkActionWithJSON;Lcom/blackhub/bronline/game/core/resources/StringResource;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getStringResource", "()Lcom/blackhub/bronline/game/core/resources/StringResource;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "clearButtonList", "", "clickOnButton", "buttonId", "", "closeInterface", "initInterface", "json", "Lorg/json/JSONObject;", "sendIfActiveCheckbox", "updateCheckBox", "isClicked", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSocialNetworkLinkViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocialNetworkLinkViewModel.kt\ncom/blackhub/bronline/game/gui/socialnetworklink/viewmodel/SocialNetworkLinkViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,110:1\n230#2,5:111\n230#2,5:116\n*S KotlinDebug\n*F\n+ 1 SocialNetworkLinkViewModel.kt\ncom/blackhub/bronline/game/gui/socialnetworklink/viewmodel/SocialNetworkLinkViewModel\n*L\n70#1:111,5\n92#1:116,5\n*E\n"})
/* loaded from: classes3.dex */
public final class SocialNetworkLinkViewModel extends BaseViewModel<SocialNetworkLinkUiState> implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<SocialNetworkLinkUiState> _uiState;

    @NotNull
    public final SocialNetworkActionWithJSON actionWithJSON;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<SocialNetworkLinkUiState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Inject
    public SocialNetworkLinkViewModel(@NotNull SocialNetworkActionWithJSON actionWithJSON, @NotNull StringResource stringResource) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        this.actionWithJSON = actionWithJSON;
        this.stringResource = stringResource;
        this._uiState = StateFlowKt.MutableStateFlow(new SocialNetworkLinkUiState(null, false, false, 7, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends SocialNetworkLinkUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<SocialNetworkLinkUiState> getUiState() {
        return this.uiState;
    }

    public final void initInterface(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new SocialNetworkLinkViewModel$initInterface$1(json, this, null), 1, null);
    }

    public final void updateCheckBox(boolean isClicked) {
        SocialNetworkLinkUiState value;
        MutableStateFlow<? extends SocialNetworkLinkUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, SocialNetworkLinkUiState.copy$default(value, null, isClicked, false, 5, null)));
    }

    public final void closeInterface() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new SocialNetworkLinkViewModel$closeInterface$1(this, null), 1, null);
    }

    public final void clearButtonList() {
        SocialNetworkLinkUiState value;
        MutableStateFlow<? extends SocialNetworkLinkUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, SocialNetworkLinkUiState.copy$default(value, CollectionsKt__CollectionsKt.emptyList(), false, false, 6, null)));
    }

    public final void clickOnButton(int buttonId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new SocialNetworkLinkViewModel$clickOnButton$1(this, buttonId, null), 1, null);
    }

    public final void sendIfActiveCheckbox() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new SocialNetworkLinkViewModel$sendIfActiveCheckbox$1(this, null), 1, null);
    }
}
