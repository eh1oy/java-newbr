package com.blackhub.bronline.game.gui.menupausesettingandmap.ui;

import android.content.Context;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.FragmentMenuPauseBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.core.JNIHelper;
import com.blackhub.bronline.game.core.JNILib;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import com.blackhub.bronline.game.gui.menupausesettingandmap.adapters.MenuPauseButtonAdapter;
import com.blackhub.bronline.game.gui.menupausesettingandmap.data.MenuPauseButtonObj;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuPauseViewModel;
import com.blackhub.bronline.launcher.Settings;
import com.blackhub.bronline.launcher.network.Server;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MenuPauseUi.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0016\u0010\u0018\u001a\u00020\u00162\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u0006\u0010\u001a\u001a\u00020\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuPauseUi;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/FragmentMenuPauseBinding;", "()V", "buttonsList", "", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/data/MenuPauseButtonObj;", "mainViewModel", "Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "getMainViewModel", "()Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "menuPauseButtonAdapter", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/adapters/MenuPauseButtonAdapter;", "menuPauseViewModel", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuPauseViewModel;", "getMenuPauseViewModel", "()Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuPauseViewModel;", "menuPauseViewModel$delegate", "getViewBinding", "initViews", "", "initialButtons", "initialRecyclerView", "onDestroyView", "setNullableParameters", "setObservers", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMenuPauseUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuPauseUi.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuPauseUi\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,126:1\n106#2,15:127\n172#2,9:142\n*S KotlinDebug\n*F\n+ 1 MenuPauseUi.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuPauseUi\n*L\n28#1:127,15\n29#1:142,9\n*E\n"})
/* loaded from: classes3.dex */
public final class MenuPauseUi extends BaseFragment<FragmentMenuPauseBinding> {
    public static final int $stable = 8;

    @NotNull
    public final List<MenuPauseButtonObj> buttonsList;

    /* renamed from: mainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainViewModel;

    @Nullable
    public MenuPauseButtonAdapter menuPauseButtonAdapter;

    /* renamed from: menuPauseViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy menuPauseViewModel;

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$special$$inlined$viewModels$default$2.<init>(kotlin.Lazy):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:290)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:193)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public MenuPauseUi() {
        /*
            r6 = this;
            r6.<init>()
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$menuPauseViewModel$2 r0 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$menuPauseViewModel$2
            r0.<init>()
            kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.NONE
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$special$$inlined$viewModels$default$1 r2 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$special$$inlined$viewModels$default$1
            r2.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r1, r2)
            java.lang.Class<com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuPauseViewModel> r1 = com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuPauseViewModel.class
            kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$special$$inlined$viewModels$default$2 r2 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$special$$inlined$viewModels$default$2
            r2.<init>()
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$special$$inlined$viewModels$default$3 r3 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$special$$inlined$viewModels$default$3
            r4 = 0
            r3.<init>()
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$special$$inlined$viewModels$default$4 r5 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$special$$inlined$viewModels$default$4
            r5.<init>()
            kotlin.Lazy r0 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r6, r1, r2, r3, r5)
            r6.menuPauseViewModel = r0
            java.lang.Class<com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel> r0 = com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel.class
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$special$$inlined$activityViewModels$default$1 r1 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$special$$inlined$activityViewModels$default$1
            r1.<init>()
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$special$$inlined$activityViewModels$default$2 r2 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$special$$inlined$activityViewModels$default$2
            r2.<init>()
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$special$$inlined$activityViewModels$default$3 r3 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$special$$inlined$activityViewModels$default$3
            r3.<init>()
            kotlin.Lazy r0 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r6, r0, r1, r2, r3)
            r6.mainViewModel = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.buttonsList = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi.<init>():void");
    }

    public final MenuPauseViewModel getMenuPauseViewModel() {
        return (MenuPauseViewModel) this.menuPauseViewModel.getValue();
    }

    private final JNIActivityViewModel getMainViewModel() {
        return (JNIActivityViewModel) this.mainViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FragmentMenuPauseBinding getViewBinding() {
        FragmentMenuPauseBinding inflate = FragmentMenuPauseBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        initialButtons();
        initialRecyclerView(this.buttonsList);
        setObservers();
    }

    public final void initialButtons() {
        FragmentMenuPauseBinding binding = getBinding();
        AppCompatButton newMenuPauseButtonBackToGame = binding.newMenuPauseButtonBackToGame;
        Intrinsics.checkNotNullExpressionValue(newMenuPauseButtonBackToGame, "newMenuPauseButtonBackToGame");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, newMenuPauseButtonBackToGame, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$initialButtons$1$1
            public MenuPauseUi$initialButtons$1$1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                MenuPauseViewModel menuPauseViewModel;
                menuPauseViewModel = MenuPauseUi.this.getMenuPauseViewModel();
                menuPauseViewModel.buttonClicked(3);
            }
        }, 1, null);
        if (UtilsKt.isNotPublicBuildType()) {
            AppCompatButton appCompatButton = binding.btnNativeTools;
            Context requireContext = requireContext();
            Boolean IS_DEBUG_ENABLED = Settings.IS_DEBUG_ENABLED;
            Intrinsics.checkNotNullExpressionValue(IS_DEBUG_ENABLED, "IS_DEBUG_ENABLED");
            appCompatButton.setBackground(AppCompatResources.getDrawable(requireContext, IS_DEBUG_ENABLED.booleanValue() ? R.drawable.bg_button_green : R.drawable.bg_button_red));
            binding.btnNativeTools.setVisibility(0);
            binding.btnNativeTools.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$$ExternalSyntheticLambda0
                public final /* synthetic */ MenuPauseUi f$1;

                public /* synthetic */ MenuPauseUi$$ExternalSyntheticLambda0(MenuPauseUi this) {
                    r2 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MenuPauseUi.initialButtons$lambda$1$lambda$0(FragmentMenuPauseBinding.this, r2, view);
                }
            });
        }
        List<MenuPauseButtonObj> list = this.buttonsList;
        String string = getString(R.string.new_menu_pause_map);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        list.add(new MenuPauseButtonObj(1, string, R.drawable.ic_map));
        String string2 = getString(R.string.common_settings);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        list.add(new MenuPauseButtonObj(2, string2, R.drawable.ic_setting));
    }

    public static final void initialButtons$lambda$1$lambda$0(FragmentMenuPauseBinding this_with, MenuPauseUi this$0, View view) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Boolean IS_DEBUG_ENABLED = Boolean.valueOf(!Settings.IS_DEBUG_ENABLED.booleanValue());
        Settings.IS_DEBUG_ENABLED = IS_DEBUG_ENABLED;
        Intrinsics.checkNotNullExpressionValue(IS_DEBUG_ENABLED, "IS_DEBUG_ENABLED");
        JNILib.setDebugMenuVisible(IS_DEBUG_ENABLED.booleanValue());
        AppCompatButton appCompatButton = this_with.btnNativeTools;
        Context requireContext = this$0.requireContext();
        Boolean IS_DEBUG_ENABLED2 = Settings.IS_DEBUG_ENABLED;
        Intrinsics.checkNotNullExpressionValue(IS_DEBUG_ENABLED2, "IS_DEBUG_ENABLED");
        appCompatButton.setBackground(AppCompatResources.getDrawable(requireContext, IS_DEBUG_ENABLED2.booleanValue() ? R.drawable.bg_button_green : R.drawable.bg_button_red));
    }

    public final void initialRecyclerView(List<MenuPauseButtonObj> buttonsList) {
        MenuPauseButtonAdapter menuPauseButtonAdapter = new MenuPauseButtonAdapter(buttonsList);
        menuPauseButtonAdapter.setButtonClickListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$initialRecyclerView$1$1
            public MenuPauseUi$initialRecyclerView$1$1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                MenuPauseViewModel menuPauseViewModel;
                menuPauseViewModel = MenuPauseUi.this.getMenuPauseViewModel();
                menuPauseViewModel.buttonClicked(i);
            }
        });
        this.menuPauseButtonAdapter = menuPauseButtonAdapter;
        RecyclerView recyclerView = getBinding().newMenuPauseButtons;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(this.menuPauseButtonAdapter);
    }

    private final void setObservers() {
        getMenuPauseViewModel().getNewPlayersNick().observe(getViewLifecycleOwner(), new MenuPauseUi$sam$androidx_lifecycle_Observer$0(new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$setObservers$1
            public MenuPauseUi$setObservers$1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(String str) {
                FragmentMenuPauseBinding binding;
                binding = MenuPauseUi.this.getBinding();
                binding.newMenuPausePlayersNick.setText(MenuPauseUi.this.getString(R.string.common_single_string_value, str));
            }
        }));
        getMainViewModel().getUpdatedServers().observe(getViewLifecycleOwner(), new MenuPauseUi$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends Server>, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$setObservers$2
            public MenuPauseUi$setObservers$2() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends Server> list) {
                invoke2((List<Server>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(List<Server> list) {
                FragmentMenuPauseBinding binding;
                Server server;
                String firstName;
                int currServer = JNIHelper.getCurrServer();
                int size = list != null ? list.size() : 0;
                String str = NewMenuConstants.DEFAULT_VALUE_FOR_SERVER;
                if (currServer < size && list != null && (server = list.get(currServer)) != null && (firstName = server.getFirstName()) != null) {
                    str = firstName;
                }
                binding = MenuPauseUi.this.getBinding();
                binding.newMenuPauseServer.setText(MenuPauseUi.this.getString(R.string.new_menu_pause_server, str));
            }
        }));
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        setNullableParameters();
        super.onDestroyView();
    }

    public final void setNullableParameters() {
        this.menuPauseButtonAdapter = null;
        this.buttonsList.clear();
    }
}
