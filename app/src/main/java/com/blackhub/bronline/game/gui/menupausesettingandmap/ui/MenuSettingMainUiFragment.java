package com.blackhub.bronline.game.gui.menupausesettingandmap.ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.FragmentMenuSettingMainBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import com.blackhub.bronline.game.gui.menupausesettingandmap.adapters.MenuSettingTitleAdapter;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuPauseViewModel;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingControlViewModel;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingGraphicViewModel;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingSoundViewModel;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingWinterViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.ivy.osgi.updatesite.xml.FeatureParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: MenuSettingMainUiFragment.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010<\u001a\u00020\u0005H\u0016J\b\u0010=\u001a\u00020\u0002H\u0016J\b\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020?H\u0002J\b\u0010A\u001a\u00020?H\u0002J\b\u0010B\u001a\u00020?H\u0016J\b\u0010C\u001a\u00020?H\u0016J\u0010\u0010D\u001a\u00020?2\u0006\u0010E\u001a\u00020FH\u0016J\u0012\u0010G\u001a\u00020?2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\b\u0010J\u001a\u00020?H\u0016J$\u0010K\u001a\u00020?2\u000e\u0010L\u001a\n\u0012\u0006\b\u0001\u0012\u00020N0M2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010PH\u0002J\u0010\u0010Q\u001a\u00020?2\u0006\u0010R\u001a\u00020\u0005H\u0002J\u0006\u0010S\u001a\u00020?J\b\u0010T\u001a\u00020?H\u0002J\b\u0010U\u001a\u00020?H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001b\u0010\u0016\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001b\u0010\u001e\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u000b\u001a\u0004\b\u001f\u0010 R$\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0011R\u001b\u0010&\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u000b\u001a\u0004\b'\u0010(R$\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u000f\"\u0004\b-\u0010\u0011R\u001b\u0010.\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u000b\u001a\u0004\b/\u00100R\u001b\u00102\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u000b\u001a\u0004\b4\u00105R\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020908X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006V"}, d2 = {"Lcom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuSettingMainUiFragment;", "Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragment;", "Lcom/blackhub/bronline/databinding/FragmentMenuSettingMainBinding;", "()V", "currentFragment", "", "menuPauseViewModel", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuPauseViewModel;", "getMenuPauseViewModel", "()Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuPauseViewModel;", "menuPauseViewModel$delegate", "Lkotlin/Lazy;", "menuPauseViewModelVMFactory", "Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "getMenuPauseViewModelVMFactory", "()Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "setMenuPauseViewModelVMFactory", "(Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;)V", "menuSettingControlVMFactory", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingControlViewModel;", "getMenuSettingControlVMFactory", "setMenuSettingControlVMFactory", "menuSettingControlViewModel", "getMenuSettingControlViewModel", "()Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingControlViewModel;", "menuSettingControlViewModel$delegate", "menuSettingGraphicVMFactory", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingGraphicViewModel;", "getMenuSettingGraphicVMFactory", "setMenuSettingGraphicVMFactory", "menuSettingGraphicViewModel", "getMenuSettingGraphicViewModel", "()Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingGraphicViewModel;", "menuSettingGraphicViewModel$delegate", "menuSettingSoundVMFactory", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingSoundViewModel;", "getMenuSettingSoundVMFactory", "setMenuSettingSoundVMFactory", "menuSettingSoundViewModel", "getMenuSettingSoundViewModel", "()Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingSoundViewModel;", "menuSettingSoundViewModel$delegate", "menuSettingWinterVMFactory", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingWinterViewModel;", "getMenuSettingWinterVMFactory", "setMenuSettingWinterVMFactory", "menuSettingWinterViewModel", "getMenuSettingWinterViewModel", "()Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingWinterViewModel;", "menuSettingWinterViewModel$delegate", "screenArgs", "", "getScreenArgs", "()Z", "screenArgs$delegate", "settingsList", "", "", "titleAdapter", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/adapters/MenuSettingTitleAdapter;", "getGuiId", "getViewBinding", "initAdapterAndRecyclerView", "", "initFPS", "initParameters", "initViews", "newBackPress", "onAttach", "context", "Landroid/content/Context;", "onPacketIncoming", "json", "Lorg/json/JSONObject;", "onStop", "replaceFragment", FeatureParser.PluginHandler.FRAGMENT, "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "args", "Landroid/os/Bundle;", "setCurrentSetting", "currentSetting", "setNullableParameters", "setOnButtonCloseClickListener", "setOnResetSettingsClickListener", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMenuSettingMainUiFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuSettingMainUiFragment.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuSettingMainUiFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,220:1\n106#2,15:221\n106#2,15:236\n106#2,15:251\n106#2,15:266\n106#2,15:281\n13309#3,2:296\n*S KotlinDebug\n*F\n+ 1 MenuSettingMainUiFragment.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuSettingMainUiFragment\n*L\n40#1:221,15\n45#1:236,15\n50#1:251,15\n55#1:266,15\n60#1:281,15\n148#1:296,2\n*E\n"})
/* loaded from: classes3.dex */
public final class MenuSettingMainUiFragment extends BaseISAMPGUIFragment<FragmentMenuSettingMainBinding> {
    public static final int $stable = 8;
    public int currentFragment;

    /* renamed from: menuPauseViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy menuPauseViewModel;

    @Inject
    public MainViewModelFactory<MenuPauseViewModel> menuPauseViewModelVMFactory;

    @Inject
    public MainViewModelFactory<MenuSettingControlViewModel> menuSettingControlVMFactory;

    /* renamed from: menuSettingControlViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy menuSettingControlViewModel;

    @Inject
    public MainViewModelFactory<MenuSettingGraphicViewModel> menuSettingGraphicVMFactory;

    /* renamed from: menuSettingGraphicViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy menuSettingGraphicViewModel;

    @Inject
    public MainViewModelFactory<MenuSettingSoundViewModel> menuSettingSoundVMFactory;

    /* renamed from: menuSettingSoundViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy menuSettingSoundViewModel;

    @Inject
    public MainViewModelFactory<MenuSettingWinterViewModel> menuSettingWinterVMFactory;

    /* renamed from: menuSettingWinterViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy menuSettingWinterViewModel;

    /* renamed from: screenArgs$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy screenArgs;

    @NotNull
    public final List<String> settingsList;

    @Nullable
    public MenuSettingTitleAdapter titleAdapter;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 47;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
    }

    @NotNull
    public final MainViewModelFactory<MenuSettingGraphicViewModel> getMenuSettingGraphicVMFactory() {
        MainViewModelFactory<MenuSettingGraphicViewModel> mainViewModelFactory = this.menuSettingGraphicVMFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("menuSettingGraphicVMFactory");
        return null;
    }

    public final void setMenuSettingGraphicVMFactory(@NotNull MainViewModelFactory<MenuSettingGraphicViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.menuSettingGraphicVMFactory = mainViewModelFactory;
    }

    public final MenuSettingGraphicViewModel getMenuSettingGraphicViewModel() {
        return (MenuSettingGraphicViewModel) this.menuSettingGraphicViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<MenuSettingSoundViewModel> getMenuSettingSoundVMFactory() {
        MainViewModelFactory<MenuSettingSoundViewModel> mainViewModelFactory = this.menuSettingSoundVMFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("menuSettingSoundVMFactory");
        return null;
    }

    public final void setMenuSettingSoundVMFactory(@NotNull MainViewModelFactory<MenuSettingSoundViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.menuSettingSoundVMFactory = mainViewModelFactory;
    }

    public final MenuSettingSoundViewModel getMenuSettingSoundViewModel() {
        return (MenuSettingSoundViewModel) this.menuSettingSoundViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<MenuSettingControlViewModel> getMenuSettingControlVMFactory() {
        MainViewModelFactory<MenuSettingControlViewModel> mainViewModelFactory = this.menuSettingControlVMFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("menuSettingControlVMFactory");
        return null;
    }

    public final void setMenuSettingControlVMFactory(@NotNull MainViewModelFactory<MenuSettingControlViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.menuSettingControlVMFactory = mainViewModelFactory;
    }

    public final MenuSettingControlViewModel getMenuSettingControlViewModel() {
        return (MenuSettingControlViewModel) this.menuSettingControlViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<MenuSettingWinterViewModel> getMenuSettingWinterVMFactory() {
        MainViewModelFactory<MenuSettingWinterViewModel> mainViewModelFactory = this.menuSettingWinterVMFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("menuSettingWinterVMFactory");
        return null;
    }

    public final void setMenuSettingWinterVMFactory(@NotNull MainViewModelFactory<MenuSettingWinterViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.menuSettingWinterVMFactory = mainViewModelFactory;
    }

    public final MenuSettingWinterViewModel getMenuSettingWinterViewModel() {
        return (MenuSettingWinterViewModel) this.menuSettingWinterViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<MenuPauseViewModel> getMenuPauseViewModelVMFactory() {
        MainViewModelFactory<MenuPauseViewModel> mainViewModelFactory = this.menuPauseViewModelVMFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("menuPauseViewModelVMFactory");
        return null;
    }

    public final void setMenuPauseViewModelVMFactory(@NotNull MainViewModelFactory<MenuPauseViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.menuPauseViewModelVMFactory = mainViewModelFactory;
    }

    public final MenuPauseViewModel getMenuPauseViewModel() {
        return (MenuPauseViewModel) this.menuPauseViewModel.getValue();
    }

    public final boolean getScreenArgs() {
        return ((Boolean) this.screenArgs.getValue()).booleanValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        List<String> list = this.settingsList;
        String string = requireContext().getString(R.string.new_menu_setting_title_controls);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        list.add(string);
        String string2 = requireContext().getString(R.string.new_menu_setting_title_sound);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        list.add(string2);
        String string3 = requireContext().getString(R.string.new_menu_setting_title_graphics);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        list.add(string3);
        initFPS();
        initParameters();
        initAdapterAndRecyclerView();
        setOnResetSettingsClickListener();
        setOnButtonCloseClickListener();
        if (getScreenArgs()) {
            setCurrentSetting(10);
        } else {
            setCurrentSetting(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setOnResetSettingsClickListener() {
        TextView newMenuSettingButtonRefresh = ((FragmentMenuSettingMainBinding) getBinding()).newMenuSettingButtonRefresh;
        Intrinsics.checkNotNullExpressionValue(newMenuSettingButtonRefresh, "newMenuSettingButtonRefresh");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, newMenuSettingButtonRefresh, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$setOnResetSettingsClickListener$1
            public MenuSettingMainUiFragment$setOnResetSettingsClickListener$1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                int i;
                MenuSettingControlViewModel menuSettingControlViewModel;
                MenuSettingSoundViewModel menuSettingSoundViewModel;
                MenuSettingGraphicViewModel menuSettingGraphicViewModel;
                i = MenuSettingMainUiFragment.this.currentFragment;
                if (i == 0) {
                    menuSettingControlViewModel = MenuSettingMainUiFragment.this.getMenuSettingControlViewModel();
                    menuSettingControlViewModel.setDefaultParameters();
                } else if (i == 1) {
                    menuSettingSoundViewModel = MenuSettingMainUiFragment.this.getMenuSettingSoundViewModel();
                    menuSettingSoundViewModel.setDefaultParameters();
                } else {
                    if (i != 2) {
                        return;
                    }
                    menuSettingGraphicViewModel = MenuSettingMainUiFragment.this.getMenuSettingGraphicViewModel();
                    menuSettingGraphicViewModel.setDefaultParameters();
                }
            }
        }, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setOnButtonCloseClickListener() {
        AppCompatButton newMenuSettingButtonBackMenu = ((FragmentMenuSettingMainBinding) getBinding()).newMenuSettingButtonBackMenu;
        Intrinsics.checkNotNullExpressionValue(newMenuSettingButtonBackMenu, "newMenuSettingButtonBackMenu");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, newMenuSettingButtonBackMenu, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$setOnButtonCloseClickListener$1
            public MenuSettingMainUiFragment$setOnButtonCloseClickListener$1() {
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
                if (Intrinsics.areEqual(MenuSettingMainUiFragment.this.requireActivity().getClass(), JNIActivity.class)) {
                    menuPauseViewModel = MenuSettingMainUiFragment.this.getMenuPauseViewModel();
                    menuPauseViewModel.closeSettings();
                } else {
                    MenuSettingMainUiFragment.this.getParentFragmentManager().popBackStack();
                }
            }
        }, 1, null);
    }

    public final void initParameters() {
        getMenuSettingGraphicViewModel().initialParameters();
        getMenuSettingSoundViewModel().initialParameters();
        getMenuSettingControlViewModel().initialParameters();
    }

    public final void initFPS() {
        float refreshRate;
        Float valueOf;
        Display display;
        Display display2;
        Display.Mode[] supportedModes;
        if (Build.VERSION.SDK_INT >= 30) {
            display = requireActivity().getDisplay();
            valueOf = display != null ? Float.valueOf(display.getRefreshRate()) : null;
            display2 = requireActivity().getDisplay();
            refreshRate = 60.0f;
            if (display2 != null && (supportedModes = display2.getSupportedModes()) != null) {
                for (Display.Mode mode : supportedModes) {
                    if (refreshRate < mode.getRefreshRate()) {
                        refreshRate = mode.getRefreshRate();
                    }
                }
            }
        } else {
            refreshRate = requireActivity().getWindowManager().getDefaultDisplay().getRefreshRate();
            valueOf = Float.valueOf(refreshRate);
        }
        getMenuSettingGraphicViewModel().initFPS(valueOf, (int) refreshRate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initAdapterAndRecyclerView() {
        MenuSettingTitleAdapter menuSettingTitleAdapter = new MenuSettingTitleAdapter(this.settingsList);
        menuSettingTitleAdapter.setOnItemClickListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$initAdapterAndRecyclerView$1$1
            public MenuSettingMainUiFragment$initAdapterAndRecyclerView$1$1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                MenuSettingMainUiFragment.this.currentFragment = i;
                MenuSettingMainUiFragment.this.setCurrentSetting(i);
            }
        });
        this.titleAdapter = menuSettingTitleAdapter;
        RecyclerView recyclerView = ((FragmentMenuSettingMainBinding) getBinding()).newMenuSettingTitleButtons;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(this.titleAdapter);
    }

    public static /* synthetic */ void replaceFragment$default(MenuSettingMainUiFragment menuSettingMainUiFragment, Class cls, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        menuSettingMainUiFragment.replaceFragment(cls, bundle);
    }

    public final void replaceFragment(Class<? extends Fragment> r3, Bundle args) {
        getChildFragmentManager().beginTransaction().replace(R.id.new_menu_setting_container, r3, args).commit();
    }

    public final void setCurrentSetting(int currentSetting) {
        if (currentSetting == 0) {
            replaceFragment$default(this, MenuSettingControlUiFragment.class, null, 2, null);
            return;
        }
        if (currentSetting == 1) {
            replaceFragment$default(this, MenuSettingSoundUiFragment.class, null, 2, null);
        } else if (currentSetting == 2) {
            replaceFragment$default(this, MenuSettingGraphicUiFragment.class, null, 2, null);
        } else {
            if (currentSetting != 10) {
                return;
            }
            replaceFragment(MenuSettingControlUiFragment.class, BundleKt.bundleOf(TuplesKt.to(NewMenuConstants.NEW_MENU_SETTING_LAYOUT_SCROLL_TO_SWITCH_ARGS, Boolean.TRUE)));
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (Intrinsics.areEqual(requireActivity().getClass(), JNIActivity.class)) {
            getMenuPauseViewModel().applyGameSettings();
        }
    }

    public final void setNullableParameters() {
        this.titleAdapter = null;
        this.settingsList.clear();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FragmentMenuSettingMainBinding getViewBinding() {
        FragmentMenuSettingMainBinding inflate = FragmentMenuSettingMainBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$1.<init>(kotlin.jvm.functions.Function0):void, class status: GENERATED_AND_UNLOADED
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
    public MenuSettingMainUiFragment() {
        /*
            r7 = this;
            r7.<init>()
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuSettingGraphicViewModel$2 r0 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuSettingGraphicViewModel$2
            r0.<init>()
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuSettingGraphicViewModel$3 r1 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuSettingGraphicViewModel$3
            r1.<init>()
            kotlin.LazyThreadSafetyMode r2 = kotlin.LazyThreadSafetyMode.NONE
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$1 r3 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$1
            r3.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r2, r3)
            java.lang.Class<com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingGraphicViewModel> r3 = com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingGraphicViewModel.class
            kotlin.reflect.KClass r3 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r3)
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$2 r4 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$2
            r4.<init>()
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$3 r5 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$3
            r6 = 0
            r5.<init>()
            kotlin.Lazy r0 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r7, r3, r4, r5, r1)
            r7.menuSettingGraphicViewModel = r0
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuSettingSoundViewModel$2 r0 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuSettingSoundViewModel$2
            r0.<init>()
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuSettingSoundViewModel$3 r1 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuSettingSoundViewModel$3
            r1.<init>()
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$5 r3 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$5
            r3.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r2, r3)
            java.lang.Class<com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingSoundViewModel> r3 = com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingSoundViewModel.class
            kotlin.reflect.KClass r3 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r3)
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$6 r4 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$6
            r4.<init>()
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$7 r5 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$7
            r5.<init>()
            kotlin.Lazy r0 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r7, r3, r4, r5, r1)
            r7.menuSettingSoundViewModel = r0
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuSettingControlViewModel$2 r0 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuSettingControlViewModel$2
            r0.<init>()
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuSettingControlViewModel$3 r1 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuSettingControlViewModel$3
            r1.<init>()
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$9 r3 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$9
            r3.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r2, r3)
            java.lang.Class<com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingControlViewModel> r3 = com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingControlViewModel.class
            kotlin.reflect.KClass r3 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r3)
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$10 r4 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$10
            r4.<init>()
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$11 r5 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$11
            r5.<init>()
            kotlin.Lazy r0 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r7, r3, r4, r5, r1)
            r7.menuSettingControlViewModel = r0
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuSettingWinterViewModel$2 r0 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuSettingWinterViewModel$2
            r0.<init>()
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuSettingWinterViewModel$3 r1 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuSettingWinterViewModel$3
            r1.<init>()
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$13 r3 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$13
            r3.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r2, r3)
            java.lang.Class<com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingWinterViewModel> r3 = com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingWinterViewModel.class
            kotlin.reflect.KClass r3 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r3)
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$14 r4 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$14
            r4.<init>()
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$15 r5 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$15
            r5.<init>()
            kotlin.Lazy r0 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r7, r3, r4, r5, r1)
            r7.menuSettingWinterViewModel = r0
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuPauseViewModel$2 r0 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuPauseViewModel$2
            r0.<init>()
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuPauseViewModel$3 r1 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuPauseViewModel$3
            r1.<init>()
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$17 r3 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$17
            r3.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r2, r3)
            java.lang.Class<com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuPauseViewModel> r2 = com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuPauseViewModel.class
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r2)
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$18 r3 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$18
            r3.<init>()
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$19 r4 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$19
            r4.<init>()
            kotlin.Lazy r0 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r7, r2, r3, r4, r1)
            r7.menuPauseViewModel = r0
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$screenArgs$2 r0 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$screenArgs$2
            r0.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r0)
            r7.screenArgs = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.settingsList = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment.<init>():void");
    }
}
