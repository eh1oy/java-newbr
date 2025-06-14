package com.blackhub.bronline.game.gui.menu.viewModel;

import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.extension.BooleanExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.gui.menu.MenuUiState;
import com.blackhub.bronline.game.gui.menu.model.ButtonsConfigResponse;
import com.blackhub.bronline.game.gui.menu.model.MenuListModel;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsProperties;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsResponse;
import com.blackhub.bronline.launcher.Settings;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: MenuViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.menu.viewModel.MenuViewModel$initJson$1", f = "MenuViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMenuViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuViewModel.kt\ncom/blackhub/bronline/game/gui/menu/viewModel/MenuViewModel$initJson$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,266:1\n230#2,5:267\n*S KotlinDebug\n*F\n+ 1 MenuViewModel.kt\ncom/blackhub/bronline/game/gui/menu/viewModel/MenuViewModel$initJson$1\n*L\n95#1:267,5\n*E\n"})
/* loaded from: classes3.dex */
public final class MenuViewModel$initJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ButtonsConfigResponse $buttonsConfig;
    public final /* synthetic */ HolidayEventsResponse $holidayEventsJson;
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ MenuViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuViewModel$initJson$1(MenuViewModel menuViewModel, JSONObject jSONObject, ButtonsConfigResponse buttonsConfigResponse, HolidayEventsResponse holidayEventsResponse, Continuation<? super MenuViewModel$initJson$1> continuation) {
        super(2, continuation);
        this.this$0 = menuViewModel;
        this.$json = jSONObject;
        this.$buttonsConfig = buttonsConfigResponse;
        this.$holidayEventsJson = holidayEventsResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MenuViewModel$initJson$1(this.this$0, this.$json, this.$buttonsConfig, this.$holidayEventsJson, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MenuViewModel$initJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MenuUiState value;
        Boolean IS_DEBUG_ENABLED;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<MenuListModel> listOfMainItems = this.this$0.get_uiState().getValue().getListOfMainItems();
        if (this.$json.optBoolean("f")) {
            listOfMainItems.add(new MenuListModel(10, R.drawable.ic_menu_family, R.string.menu_action_family));
        }
        if (BooleanExtensionKt.getOrFalse(this.$buttonsConfig.isShowSimButton())) {
            listOfMainItems.add(new MenuListModel(11, R.drawable.ic_menu_sim, R.string.menu_action_sim));
        }
        if (BooleanExtensionKt.getOrFalse(this.$buttonsConfig.isShowTanpinButton())) {
            listOfMainItems.add(new MenuListModel(15, R.drawable.ic_token, R.string.menu_action_tokens));
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        HolidayEventsProperties holidayEventsProperties = (HolidayEventsProperties) CollectionsKt___CollectionsKt.firstOrNull((List) this.$holidayEventsJson.getProperties());
        List<Integer> dates = holidayEventsProperties != null ? holidayEventsProperties.getDates() : null;
        if (dates == null) {
            dates = CollectionsKt__CollectionsKt.emptyList();
        }
        int orZero = IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.firstOrNull((List) dates));
        boolean z = false;
        if (currentTimeMillis <= IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.lastOrNull((List) dates)) && orZero <= currentTimeMillis) {
            z = true;
        }
        BooleanExtensionKt.ifTrue(Boxing.boxBoolean(z), new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.menu.viewModel.MenuViewModel$initJson$1.1
            public final /* synthetic */ List<MenuListModel> $list;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(List<MenuListModel> listOfMainItems2) {
                super(0);
                r1 = listOfMainItems2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                r1.add(new MenuListModel(17, R.drawable.ic_event_menu, R.string.menu_action_holiday_event));
            }
        });
        MutableStateFlow<? extends MenuUiState> mutableStateFlow = this.this$0.get_uiState();
        do {
            value = mutableStateFlow.getValue();
            IS_DEBUG_ENABLED = Settings.IS_DEBUG_ENABLED;
            Intrinsics.checkNotNullExpressionValue(IS_DEBUG_ENABLED, "IS_DEBUG_ENABLED");
        } while (!mutableStateFlow.compareAndSet(value, MenuUiState.copy$default(value, false, false, false, false, listOfMainItems2, null, IS_DEBUG_ENABLED.booleanValue(), 47, null)));
        return Unit.INSTANCE;
    }

    /* compiled from: MenuViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.menu.viewModel.MenuViewModel$initJson$1$1 */
    public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ List<MenuListModel> $list;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<MenuListModel> listOfMainItems2) {
            super(0);
            r1 = listOfMainItems2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            r1.add(new MenuListModel(17, R.drawable.ic_event_menu, R.string.menu_action_holiday_event));
        }
    }
}
