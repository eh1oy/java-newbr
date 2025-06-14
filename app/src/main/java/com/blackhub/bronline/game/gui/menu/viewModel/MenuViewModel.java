package com.blackhub.bronline.game.gui.menu.viewModel;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.JNILib;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.gui.menu.MenuUiState;
import com.blackhub.bronline.game.gui.menu.model.ButtonsConfigResponse;
import com.blackhub.bronline.game.gui.menu.model.MenuListModel;
import com.blackhub.bronline.game.gui.menu.network.MenuActionsWithJson;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsResponse;
import com.blackhub.bronline.launcher.Settings;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: MenuViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\u001e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u001dH\u0002J\u000e\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\u000fJ\u0006\u0010\"\u001a\u00020\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006#"}, d2 = {"Lcom/blackhub/bronline/game/gui/menu/viewModel/MenuViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/menu/MenuUiState;", "menuActionsWithJson", "Lcom/blackhub/bronline/game/gui/menu/network/MenuActionsWithJson;", "(Lcom/blackhub/bronline/game/gui/menu/network/MenuActionsWithJson;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "blockButtons", "", "buttonCloseClicked", "dialogClosed", "initCommunicationSetItems", "", "Lcom/blackhub/bronline/game/gui/menu/model/MenuListModel;", "initJson", "json", "Lorg/json/JSONObject;", "buttonsConfig", "Lcom/blackhub/bronline/game/gui/menu/model/ButtonsConfigResponse;", "holidayEventsJson", "Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsResponse;", "initMainSetItems", "", "itemClicked", FirebaseAnalytics.Param.INDEX, "", "onHeightCalculated", "onNativeButtonClick", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMenuViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuViewModel.kt\ncom/blackhub/bronline/game/gui/menu/viewModel/MenuViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,266:1\n230#2,5:267\n230#2,5:272\n230#2,5:277\n230#2,5:282\n230#2,5:287\n230#2,5:292\n*S KotlinDebug\n*F\n+ 1 MenuViewModel.kt\ncom/blackhub/bronline/game/gui/menu/viewModel/MenuViewModel\n*L\n105#1:267,5\n111#1:272,5\n117#1:277,5\n126#1:282,5\n132#1:287,5\n169#1:292,5\n*E\n"})
/* loaded from: classes3.dex */
public final class MenuViewModel extends BaseViewModel<MenuUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<MenuUiState> _uiState;

    @NotNull
    public final MenuActionsWithJson menuActionsWithJson;

    @Inject
    public MenuViewModel(@NotNull MenuActionsWithJson menuActionsWithJson) {
        Intrinsics.checkNotNullParameter(menuActionsWithJson, "menuActionsWithJson");
        this.menuActionsWithJson = menuActionsWithJson;
        this._uiState = StateFlowKt.MutableStateFlow(new MenuUiState(false, false, false, false, null, null, false, 127, null));
        JNILib.toggleDrawing2dStuff(true);
        ViewModelExtensionKt.launchOnIO$default(this, null, new AnonymousClass1(null), 1, null);
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends MenuUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<MenuUiState> getUiState() {
        return FlowKt.asStateFlow(get_uiState());
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: MenuViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.blackhub.bronline.game.gui.menu.viewModel.MenuViewModel$1", f = "MenuViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.blackhub.bronline.game.gui.menu.viewModel.MenuViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenuViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                MenuViewModel.this.menuActionsWithJson.dialogOpened();
                MenuViewModel.this.get_uiState().getValue().setListOfMainItems(MenuViewModel.this.initMainSetItems());
                MenuViewModel.this.get_uiState().getValue().setSetOfCommunicationItems(MenuViewModel.this.initCommunicationSetItems());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void initJson(@NotNull JSONObject json, @NotNull ButtonsConfigResponse buttonsConfig, @NotNull HolidayEventsResponse holidayEventsJson) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(buttonsConfig, "buttonsConfig");
        Intrinsics.checkNotNullParameter(holidayEventsJson, "holidayEventsJson");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new MenuViewModel$initJson$1(this, json, buttonsConfig, holidayEventsJson, null), 1, null);
    }

    public final void buttonCloseClicked() {
        MenuUiState value;
        MutableStateFlow<? extends MenuUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, MenuUiState.copy$default(value, true, false, false, false, null, null, false, 126, null)));
    }

    public final void onHeightCalculated() {
        MenuUiState value;
        MutableStateFlow<? extends MenuUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, MenuUiState.copy$default(value, false, false, true, false, null, null, false, 123, null)));
    }

    public final void blockButtons() {
        MenuUiState value;
        MutableStateFlow<? extends MenuUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, MenuUiState.copy$default(value, false, false, false, false, null, null, false, 119, null)));
    }

    public final void itemClicked(int index) {
        MenuUiState value;
        MenuUiState value2;
        if (index == 3) {
            MutableStateFlow<? extends MenuUiState> mutableStateFlow = get_uiState();
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, MenuUiState.copy$default(value, false, true, false, true, null, null, false, 117, null)));
        } else if (index == 20) {
            ViewModelExtensionKt.launchOnIO$default(this, null, new MenuViewModel$itemClicked$3(this, null), 1, null);
        } else {
            if (index == 35) {
                MutableStateFlow<? extends MenuUiState> mutableStateFlow2 = get_uiState();
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value2, MenuUiState.copy$default(value2, false, false, false, true, null, null, false, 117, null)));
                return;
            }
            ViewModelExtensionKt.launchOnIO$default(this, null, new MenuViewModel$itemClicked$4(this, index, null), 1, null);
        }
    }

    public final void dialogClosed() {
        JNILib.toggleDrawing2dStuff(false);
        ViewModelExtensionKt.launchOnIO$default(this, null, new MenuViewModel$dialogClosed$1(this, null), 1, null);
    }

    public final void onNativeButtonClick() {
        MenuUiState value;
        Boolean IS_DEBUG_ENABLED;
        Boolean IS_DEBUG_ENABLED2 = Boolean.valueOf(!Settings.IS_DEBUG_ENABLED.booleanValue());
        Settings.IS_DEBUG_ENABLED = IS_DEBUG_ENABLED2;
        Intrinsics.checkNotNullExpressionValue(IS_DEBUG_ENABLED2, "IS_DEBUG_ENABLED");
        JNILib.setDebugMenuVisible(IS_DEBUG_ENABLED2.booleanValue());
        MutableStateFlow<? extends MenuUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            IS_DEBUG_ENABLED = Settings.IS_DEBUG_ENABLED;
            Intrinsics.checkNotNullExpressionValue(IS_DEBUG_ENABLED, "IS_DEBUG_ENABLED");
        } while (!mutableStateFlow.compareAndSet(value, MenuUiState.copy$default(value, false, false, false, false, null, null, IS_DEBUG_ENABLED.booleanValue(), 63, null)));
    }

    public final List<MenuListModel> initMainSetItems() {
        return CollectionsKt__CollectionsKt.mutableListOf(new MenuListModel(0, R.drawable.ic_menu_compass, R.string.menu_action_navigator), new MenuListModel(1, R.drawable.ic_menu_taxi, R.string.menu_action_taxi_call), new MenuListModel(2, R.drawable.ic_menu_menu_red, R.string.menu_action_menu), new MenuListModel(3, R.drawable.ic_menu_chat, R.string.menu_action_communication), new MenuListModel(4, R.drawable.ic_menu_bag, R.string.common_inventory), new MenuListModel(5, R.drawable.ic_menu_anim, R.string.menu_action_animations), new MenuListModel(6, R.drawable.ic_menu_ruble, R.string.common_donate), new MenuListModel(7, R.drawable.ic_menu_car, R.string.menu_action_cars), new MenuListModel(8, R.drawable.ic_menu_gift_box, R.string.menu_action_promo), new MenuListModel(9, R.drawable.ic_menu_help_desk, R.string.menu_action_complaint), new MenuListModel(12, R.drawable.ic_menu_calendar, R.string.menu_action_calendar), new MenuListModel(14, R.drawable.ic_menu_bp_rewards, R.string.menu_action_bp_rewards), new MenuListModel(16, R.drawable.ic_marketplace, R.string.marketplace_title), new MenuListModel(20, R.drawable.ic_settings, R.string.common_settings));
    }

    public final Set<MenuListModel> initCommunicationSetItems() {
        return SetsKt__SetsKt.setOf((Object[]) new MenuListModel[]{new MenuListModel(30, R.drawable.ic_menu_passport, R.string.menu_action_give_passport), new MenuListModel(31, R.drawable.ic_menu_med, R.string.menu_action_give_med_card), new MenuListModel(32, R.drawable.ic_menu_paper, R.string.menu_action_give_licenses), new MenuListModel(33, R.drawable.ic_menu_lic, R.string.menu_action_give_pts), new MenuListModel(34, R.drawable.ic_menu_exchange, R.string.menu_action_make_exchange), new MenuListModel(35, R.drawable.ic_menu_back, R.string.common_back)});
    }
}
