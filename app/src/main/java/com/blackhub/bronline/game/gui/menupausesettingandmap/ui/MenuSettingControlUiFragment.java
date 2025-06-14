package com.blackhub.bronline.game.gui.menupausesettingandmap.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.CustomItemDecorator;
import com.blackhub.bronline.game.common.TwoButtonsAndTextWithDescriptionDialog;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.BooleanExtensionKt;
import com.blackhub.bronline.game.core.extension.FloatExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import com.blackhub.bronline.game.gui.menupausesettingandmap.adapters.MenuSettingControlAdapter;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingControlViewModel;
import com.blackhub.bronline.launcher.activities.MainActivity;
import com.google.android.material.slider.Slider;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: MenuSettingControlUiFragment.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0002J\b\u0010#\u001a\u00020\u0002H\u0016J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0002J\b\u0010'\u001a\u00020%H\u0002J\b\u0010(\u001a\u00020%H\u0002J\b\u0010)\u001a\u00020%H\u0002J\b\u0010*\u001a\u00020%H\u0002J\b\u0010+\u001a\u00020%H\u0002J\b\u0010,\u001a\u00020%H\u0002J\b\u0010-\u001a\u00020%H\u0016J\u0018\u0010.\u001a\u00020%2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u001cH\u0002J\b\u00102\u001a\u00020%H\u0016J\u0010\u00103\u001a\u00020%2\u0006\u00104\u001a\u000205H\u0002J\u0010\u00106\u001a\u00020%2\u0006\u00104\u001a\u000205H\u0002J\u0010\u00107\u001a\u00020%2\u0006\u00104\u001a\u000205H\u0002J\u0010\u00108\u001a\u00020%2\u0006\u00104\u001a\u000205H\u0002J\u0006\u00109\u001a\u00020%J\b\u0010:\u001a\u00020%H\u0002J\b\u0010;\u001a\u00020%H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\t\u001a\u0004\b\u001d\u0010\u001e¨\u0006="}, d2 = {"Lcom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuSettingControlUiFragment;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/FragmentMenuSettingControlBinding;", "()V", "brContext", "Landroid/content/Context;", "getBrContext", "()Landroid/content/Context;", "brContext$delegate", "Lkotlin/Lazy;", "chatSpinnerList", "", "", "[Ljava/lang/String;", "chatVersionAdapter", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/adapters/MenuSettingControlAdapter;", "hudSpinnerList", "hudVersionAdapter", "joystickControlAdapter", "joystickSpinnerList", "keyboardSpinnerList", "keyboardVersionAdapter", "menuSettingControlViewModel", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingControlViewModel;", "getMenuSettingControlViewModel", "()Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingControlViewModel;", "menuSettingControlViewModel$delegate", "screenArgs", "", "getScreenArgs", "()Z", "screenArgs$delegate", "getFormattedFloat", "", "currentValue", "getViewBinding", "initChangeWidget", "", "initControlAimingCamSensibilityX", "initControlAimingCamSensibilityY", "initControlCamSensibilityX", "initControlCamSensibilityY", "initControlCarSensibility", "initSpinner", "initTextView", "initViews", "initialSwitch", "currentSwitch", "Landroidx/appcompat/widget/SwitchCompat;", "status", "onStart", "setChatVisibleSpinner", "setVisible", "", "setHudVisibleSpinner", "setJoystickVisibleSpinner", "setKeyboardVisibleSpinner", "setNullableParameters", "setObservers", "setSwitchListener", "Companion", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMenuSettingControlUiFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuSettingControlUiFragment.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuSettingControlUiFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,478:1\n106#2,15:479\n*S KotlinDebug\n*F\n+ 1 MenuSettingControlUiFragment.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuSettingControlUiFragment\n*L\n40#1:479,15\n*E\n"})
/* loaded from: classes3.dex */
public final class MenuSettingControlUiFragment extends BaseFragment<FragmentMenuSettingControlBinding> {
    public static final int SCROLL_DELAY = 700;

    /* renamed from: brContext$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy brContext;

    @Nullable
    public String[] chatSpinnerList;

    @Nullable
    public MenuSettingControlAdapter chatVersionAdapter;

    @Nullable
    public String[] hudSpinnerList;

    @Nullable
    public MenuSettingControlAdapter hudVersionAdapter;

    @Nullable
    public MenuSettingControlAdapter joystickControlAdapter;

    @Nullable
    public String[] joystickSpinnerList;

    @Nullable
    public String[] keyboardSpinnerList;

    @Nullable
    public MenuSettingControlAdapter keyboardVersionAdapter;

    /* renamed from: menuSettingControlViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy menuSettingControlViewModel;

    /* renamed from: screenArgs$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy screenArgs;
    public static final int $stable = 8;

    public MenuSettingControlUiFragment() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$menuSettingControlViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = MenuSettingControlUiFragment.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) Function0.this.invoke();
            }
        });
        final Function0 function02 = null;
        this.menuSettingControlViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MenuSettingControlViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStoreOwner m6502viewModels$lambda1;
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(Lazy.this);
                return m6502viewModels$lambda1.getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                ViewModelStoreOwner m6502viewModels$lambda1;
                CreationExtras creationExtras;
                Function0 function03 = Function0.this;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelStoreOwner m6502viewModels$lambda1;
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = Fragment.this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.brContext = LazyKt__LazyJVMKt.lazy(new Function0<Context>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$brContext$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Context invoke() {
                return MenuSettingControlUiFragment.this.requireContext();
            }
        });
        this.screenArgs = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$screenArgs$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                Bundle arguments = MenuSettingControlUiFragment.this.getArguments();
                return Boolean.valueOf(BooleanExtensionKt.getOrFalse(arguments != null ? Boolean.valueOf(arguments.getBoolean(NewMenuConstants.NEW_MENU_SETTING_LAYOUT_SCROLL_TO_SWITCH_ARGS)) : null));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MenuSettingControlViewModel getMenuSettingControlViewModel() {
        return (MenuSettingControlViewModel) this.menuSettingControlViewModel.getValue();
    }

    public final Context getBrContext() {
        return (Context) this.brContext.getValue();
    }

    private final boolean getScreenArgs() {
        return ((Boolean) this.screenArgs.getValue()).booleanValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FragmentMenuSettingControlBinding getViewBinding() {
        FragmentMenuSettingControlBinding inflate = FragmentMenuSettingControlBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        initTextView();
        initSpinner();
        setSwitchListener();
        initControlCarSensibility();
        initControlCamSensibilityX();
        initControlCamSensibilityY();
        initControlAimingCamSensibilityX();
        initControlAimingCamSensibilityY();
        initChangeWidget();
        setObservers();
        final FragmentMenuSettingControlBinding binding = getBinding();
        binding.settingMenuCarControlSpinner.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MenuSettingControlUiFragment.initViews$lambda$4$lambda$0(MenuSettingControlUiFragment.this, view);
            }
        });
        binding.tvSettingMenuSwitchHudSpinner.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MenuSettingControlUiFragment.initViews$lambda$4$lambda$1(MenuSettingControlUiFragment.this, view);
            }
        });
        binding.tvSettingMenuSwitchChatSpinner.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MenuSettingControlUiFragment.initViews$lambda$4$lambda$2(MenuSettingControlUiFragment.this, view);
            }
        });
        binding.tvSettingMenuSwitchKeyboardSpinner.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MenuSettingControlUiFragment.initViews$lambda$4$lambda$3(MenuSettingControlUiFragment.this, view);
            }
        });
        BooleanExtensionKt.ifTrue(Boolean.valueOf(getScreenArgs()), new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initViews$1$5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                NestedScrollView nsvNewMenuControlLayout = FragmentMenuSettingControlBinding.this.nsvNewMenuControlLayout;
                Intrinsics.checkNotNullExpressionValue(nsvNewMenuControlLayout, "nsvNewMenuControlLayout");
                final FragmentMenuSettingControlBinding fragmentMenuSettingControlBinding = FragmentMenuSettingControlBinding.this;
                ViewExtensionKt.addViewObserver(nsvNewMenuControlLayout, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initViews$1$5.1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        FragmentMenuSettingControlBinding fragmentMenuSettingControlBinding2 = FragmentMenuSettingControlBinding.this;
                        fragmentMenuSettingControlBinding2.nsvNewMenuControlLayout.smoothScrollTo(0, fragmentMenuSettingControlBinding2.tvSettingMenuSwitchKeyboardTitle.getBottom(), 700);
                    }
                });
            }
        });
    }

    public static final void initViews$lambda$4$lambda$0(MenuSettingControlUiFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setJoystickVisibleSpinner(0);
    }

    public static final void initViews$lambda$4$lambda$1(MenuSettingControlUiFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setHudVisibleSpinner(0);
        this$0.setChatVisibleSpinner(4);
        this$0.setKeyboardVisibleSpinner(4);
    }

    public static final void initViews$lambda$4$lambda$2(MenuSettingControlUiFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setChatVisibleSpinner(0);
        this$0.setHudVisibleSpinner(4);
        this$0.setKeyboardVisibleSpinner(4);
    }

    public static final void initViews$lambda$4$lambda$3(MenuSettingControlUiFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setChatVisibleSpinner(4);
        this$0.setHudVisibleSpinner(4);
        this$0.setKeyboardVisibleSpinner(0);
    }

    public final void initControlCarSensibility() {
        Slider slider = getBinding().seekBarsSettingsCarControlSensibility;
        slider.addOnChangeListener(new Slider.OnChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$$ExternalSyntheticLambda7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.BaseOnChangeListener
            public final void onValueChange(Slider slider2, float f, boolean z) {
                MenuSettingControlUiFragment.initControlCarSensibility$lambda$6$lambda$5(MenuSettingControlUiFragment.this, slider2, f, z);
            }
        });
        slider.addOnSliderTouchListener(new Slider.OnSliderTouchListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initControlCarSensibility$1$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStartTrackingTouch(@NotNull Slider slider2) {
                Intrinsics.checkNotNullParameter(slider2, "slider");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStopTrackingTouch(@NotNull Slider slider2) {
                MenuSettingControlViewModel menuSettingControlViewModel;
                float formattedFloat;
                Intrinsics.checkNotNullParameter(slider2, "slider");
                menuSettingControlViewModel = MenuSettingControlUiFragment.this.getMenuSettingControlViewModel();
                formattedFloat = MenuSettingControlUiFragment.this.getFormattedFloat(slider2.getValue());
                menuSettingControlViewModel.saveInPreferencesFloatParams(NewMenuConstants.CAR_CONTROL_SENSIBILITY, formattedFloat);
            }
        });
    }

    public static final void initControlCarSensibility$lambda$6$lambda$5(MenuSettingControlUiFragment this$0, Slider slider, float f, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(slider, "<anonymous parameter 0>");
        this$0.getMenuSettingControlViewModel().setValueOfCarControlSensibility(this$0.getFormattedFloat(f));
    }

    public final void initControlCamSensibilityX() {
        Slider slider = getBinding().seekBarsSettingsCarCamSensX;
        slider.addOnChangeListener(new Slider.OnChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$$ExternalSyntheticLambda0
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.BaseOnChangeListener
            public final void onValueChange(Slider slider2, float f, boolean z) {
                MenuSettingControlUiFragment.initControlCamSensibilityX$lambda$8$lambda$7(MenuSettingControlUiFragment.this, slider2, f, z);
            }
        });
        slider.addOnSliderTouchListener(new Slider.OnSliderTouchListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initControlCamSensibilityX$1$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStartTrackingTouch(@NotNull Slider slider2) {
                Intrinsics.checkNotNullParameter(slider2, "slider");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStopTrackingTouch(@NotNull Slider slider2) {
                MenuSettingControlViewModel menuSettingControlViewModel;
                float formattedFloat;
                Intrinsics.checkNotNullParameter(slider2, "slider");
                menuSettingControlViewModel = MenuSettingControlUiFragment.this.getMenuSettingControlViewModel();
                formattedFloat = MenuSettingControlUiFragment.this.getFormattedFloat(slider2.getValue());
                menuSettingControlViewModel.saveInPreferencesFloatParams(NewMenuConstants.CAR_CAMERA_X_SENSIBILITY, formattedFloat);
            }
        });
    }

    public static final void initControlCamSensibilityX$lambda$8$lambda$7(MenuSettingControlUiFragment this$0, Slider slider, float f, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(slider, "<anonymous parameter 0>");
        this$0.getMenuSettingControlViewModel().setValueOfCamXSensibility(this$0.getFormattedFloat(f));
    }

    public final void initControlCamSensibilityY() {
        Slider slider = getBinding().seekBarsSettingsCarCamSensY;
        slider.addOnChangeListener(new Slider.OnChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$$ExternalSyntheticLambda10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.BaseOnChangeListener
            public final void onValueChange(Slider slider2, float f, boolean z) {
                MenuSettingControlUiFragment.initControlCamSensibilityY$lambda$10$lambda$9(MenuSettingControlUiFragment.this, slider2, f, z);
            }
        });
        slider.addOnSliderTouchListener(new Slider.OnSliderTouchListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initControlCamSensibilityY$1$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStartTrackingTouch(@NotNull Slider slider2) {
                Intrinsics.checkNotNullParameter(slider2, "slider");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStopTrackingTouch(@NotNull Slider slider2) {
                MenuSettingControlViewModel menuSettingControlViewModel;
                float formattedFloat;
                Intrinsics.checkNotNullParameter(slider2, "slider");
                menuSettingControlViewModel = MenuSettingControlUiFragment.this.getMenuSettingControlViewModel();
                formattedFloat = MenuSettingControlUiFragment.this.getFormattedFloat(slider2.getValue());
                menuSettingControlViewModel.saveInPreferencesFloatParams(NewMenuConstants.CAR_CAMERA_Y_SENSIBILITY, formattedFloat);
            }
        });
    }

    public static final void initControlCamSensibilityY$lambda$10$lambda$9(MenuSettingControlUiFragment this$0, Slider slider, float f, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(slider, "<anonymous parameter 0>");
        this$0.getMenuSettingControlViewModel().setValueOfCamYSensibility(this$0.getFormattedFloat(f));
    }

    public final void initControlAimingCamSensibilityX() {
        Slider slider = getBinding().seekBarsSettingsAimingCamSensX;
        slider.addOnChangeListener(new Slider.OnChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$$ExternalSyntheticLambda1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.BaseOnChangeListener
            public final void onValueChange(Slider slider2, float f, boolean z) {
                MenuSettingControlUiFragment.initControlAimingCamSensibilityX$lambda$12$lambda$11(MenuSettingControlUiFragment.this, slider2, f, z);
            }
        });
        slider.addOnSliderTouchListener(new Slider.OnSliderTouchListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initControlAimingCamSensibilityX$1$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStartTrackingTouch(@NotNull Slider slider2) {
                Intrinsics.checkNotNullParameter(slider2, "slider");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStopTrackingTouch(@NotNull Slider slider2) {
                MenuSettingControlViewModel menuSettingControlViewModel;
                float formattedFloat;
                Intrinsics.checkNotNullParameter(slider2, "slider");
                menuSettingControlViewModel = MenuSettingControlUiFragment.this.getMenuSettingControlViewModel();
                formattedFloat = MenuSettingControlUiFragment.this.getFormattedFloat(slider2.getValue());
                menuSettingControlViewModel.saveInPreferencesFloatParams(NewMenuConstants.AIMING_CAMERA_X_SENSIBILITY, formattedFloat);
            }
        });
    }

    public static final void initControlAimingCamSensibilityX$lambda$12$lambda$11(MenuSettingControlUiFragment this$0, Slider slider, float f, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(slider, "<anonymous parameter 0>");
        this$0.getMenuSettingControlViewModel().setValueOfAimingCamXSensibility(this$0.getFormattedFloat(f));
    }

    public final void initControlAimingCamSensibilityY() {
        Slider slider = getBinding().seekBarsSettingsAimingCamSensY;
        slider.addOnChangeListener(new Slider.OnChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$$ExternalSyntheticLambda2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.BaseOnChangeListener
            public final void onValueChange(Slider slider2, float f, boolean z) {
                MenuSettingControlUiFragment.initControlAimingCamSensibilityY$lambda$14$lambda$13(MenuSettingControlUiFragment.this, slider2, f, z);
            }
        });
        slider.addOnSliderTouchListener(new Slider.OnSliderTouchListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initControlAimingCamSensibilityY$1$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStartTrackingTouch(@NotNull Slider slider2) {
                Intrinsics.checkNotNullParameter(slider2, "slider");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStopTrackingTouch(@NotNull Slider slider2) {
                MenuSettingControlViewModel menuSettingControlViewModel;
                float formattedFloat;
                Intrinsics.checkNotNullParameter(slider2, "slider");
                menuSettingControlViewModel = MenuSettingControlUiFragment.this.getMenuSettingControlViewModel();
                formattedFloat = MenuSettingControlUiFragment.this.getFormattedFloat(slider2.getValue());
                menuSettingControlViewModel.saveInPreferencesFloatParams(NewMenuConstants.AIMING_CAMERA_Y_SENSIBILITY, formattedFloat);
            }
        });
    }

    public static final void initControlAimingCamSensibilityY$lambda$14$lambda$13(MenuSettingControlUiFragment this$0, Slider slider, float f, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(slider, "<anonymous parameter 0>");
        this$0.getMenuSettingControlViewModel().setValueOfAimingCamYSensibility(this$0.getFormattedFloat(f));
    }

    public final float getFormattedFloat(float currentValue) {
        return FloatExtensionKt.roundToIntSafely(currentValue * 100.0f) / 100.0f;
    }

    public final void initTextView() {
        String[] stringArray = getResources().getStringArray(R.array.new_menu_setting_title_parameters_controls);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        if (stringArray.length == 2) {
            getBinding().settingMenuCarControlTitle.setText(stringArray[0]);
            getBinding().newMenuSettingTitleLookBack.setText(stringArray[1]);
        }
    }

    public final void initSpinner() {
        this.joystickSpinnerList = getResources().getStringArray(R.array.new_menu_setting_value_parameters_controls);
        this.hudSpinnerList = getResources().getStringArray(R.array.new_menu_setting_value_parameters_switch_new_old);
        this.chatSpinnerList = getResources().getStringArray(R.array.new_menu_setting_value_parameters_switch_new_old);
        this.keyboardSpinnerList = getResources().getStringArray(R.array.new_menu_setting_value_parameters_switch_new_old);
        Drawable drawable = AppCompatResources.getDrawable(getBrContext(), R.drawable.bg_rectangle_gray_t1);
        String[] strArr = this.joystickSpinnerList;
        if (strArr != null) {
            MenuSettingControlAdapter menuSettingControlAdapter = new MenuSettingControlAdapter(strArr);
            menuSettingControlAdapter.setOnItemClickListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initSpinner$1$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i) {
                    MenuSettingControlViewModel menuSettingControlViewModel;
                    menuSettingControlViewModel = MenuSettingControlUiFragment.this.getMenuSettingControlViewModel();
                    menuSettingControlViewModel.setCarControl(i);
                    MenuSettingControlUiFragment.this.setJoystickVisibleSpinner(4);
                }
            });
            this.joystickControlAdapter = menuSettingControlAdapter;
            if (drawable != null) {
                getBinding().rvSettingMenuSwitchControl.addItemDecoration(new CustomItemDecorator(drawable));
            }
            RecyclerView recyclerView = getBinding().rvSettingMenuSwitchControl;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.setAdapter(this.joystickControlAdapter);
        }
        String[] strArr2 = this.hudSpinnerList;
        if (strArr2 != null) {
            MenuSettingControlAdapter menuSettingControlAdapter2 = new MenuSettingControlAdapter(strArr2);
            menuSettingControlAdapter2.setOnItemClickListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initSpinner$2$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i) {
                    MenuSettingControlViewModel menuSettingControlViewModel;
                    menuSettingControlViewModel = MenuSettingControlUiFragment.this.getMenuSettingControlViewModel();
                    menuSettingControlViewModel.setHudVersion(i);
                    MenuSettingControlUiFragment.this.setHudVisibleSpinner(4);
                    GUIManager.INSTANCE.getInstance().migrateNotifications();
                }
            });
            this.hudVersionAdapter = menuSettingControlAdapter2;
            if (drawable != null) {
                getBinding().rvSettingMenuSwitchHud.addItemDecoration(new CustomItemDecorator(drawable));
            }
            RecyclerView recyclerView2 = getBinding().rvSettingMenuSwitchHud;
            recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 1, false));
            recyclerView2.setAdapter(this.hudVersionAdapter);
        }
        String[] strArr3 = this.chatSpinnerList;
        if (strArr3 != null) {
            MenuSettingControlAdapter menuSettingControlAdapter3 = new MenuSettingControlAdapter(strArr3);
            menuSettingControlAdapter3.setOnItemClickListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initSpinner$3$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i) {
                    MenuSettingControlViewModel menuSettingControlViewModel;
                    menuSettingControlViewModel = MenuSettingControlUiFragment.this.getMenuSettingControlViewModel();
                    menuSettingControlViewModel.setChatVersion(i);
                    MenuSettingControlUiFragment.this.setChatVisibleSpinner(4);
                }
            });
            this.chatVersionAdapter = menuSettingControlAdapter3;
            if (drawable != null) {
                getBinding().rvSettingMenuSwitchChat.addItemDecoration(new CustomItemDecorator(drawable));
            }
            RecyclerView recyclerView3 = getBinding().rvSettingMenuSwitchChat;
            recyclerView3.setLayoutManager(new LinearLayoutManager(recyclerView3.getContext(), 1, false));
            recyclerView3.setAdapter(this.chatVersionAdapter);
        }
        String[] strArr4 = this.keyboardSpinnerList;
        if (strArr4 != null) {
            MenuSettingControlAdapter menuSettingControlAdapter4 = new MenuSettingControlAdapter(strArr4);
            menuSettingControlAdapter4.setOnItemClickListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initSpinner$4$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i) {
                    MenuSettingControlViewModel menuSettingControlViewModel;
                    menuSettingControlViewModel = MenuSettingControlUiFragment.this.getMenuSettingControlViewModel();
                    menuSettingControlViewModel.setKeyboardVersion(i);
                    MenuSettingControlUiFragment.this.setKeyboardVisibleSpinner(4);
                }
            });
            this.keyboardVersionAdapter = menuSettingControlAdapter4;
            if (drawable != null) {
                getBinding().rvSettingMenuSwitchKeyboard.addItemDecoration(new CustomItemDecorator(drawable));
            }
            RecyclerView recyclerView4 = getBinding().rvSettingMenuSwitchKeyboard;
            recyclerView4.setLayoutManager(new LinearLayoutManager(recyclerView4.getContext(), 1, false));
            recyclerView4.setAdapter(this.keyboardVersionAdapter);
        }
    }

    public final void setSwitchListener() {
        getBinding().newMenuSettingSwitchLookBack.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$$ExternalSyntheticLambda9
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MenuSettingControlUiFragment.setSwitchListener$lambda$31(MenuSettingControlUiFragment.this, compoundButton, z);
            }
        });
    }

    public static final void setSwitchListener$lambda$31(MenuSettingControlUiFragment this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMenuSettingControlViewModel().setLookBack(z);
    }

    public final void initChangeWidget() {
        getBinding().newMenuSettingButtonChangeWidget.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MenuSettingControlUiFragment.initChangeWidget$lambda$34(MenuSettingControlUiFragment.this, view);
            }
        });
    }

    public static final void initChangeWidget$lambda$34(final MenuSettingControlUiFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(this$0.requireActivity().getClass(), MainActivity.class)) {
            FragmentActivity requireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            TwoButtonsAndTextWithDescriptionDialog twoButtonsAndTextWithDescriptionDialog = new TwoButtonsAndTextWithDescriptionDialog(requireActivity);
            twoButtonsAndTextWithDescriptionDialog.setOnOkButtonClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initChangeWidget$1$1$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            });
            twoButtonsAndTextWithDescriptionDialog.setOnCancelButtonClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initChangeWidget$1$1$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    FragmentMenuSettingControlBinding binding;
                    binding = MenuSettingControlUiFragment.this.getBinding();
                    UsefulKt.hideSystemUI(binding.getRoot());
                }
            });
            twoButtonsAndTextWithDescriptionDialog.show();
            String string = this$0.getString(R.string.common_unavailable);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            twoButtonsAndTextWithDescriptionDialog.setTitle(string);
            String string2 = this$0.getString(R.string.new_menu_setting_error_change_widget);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            twoButtonsAndTextWithDescriptionDialog.setDescription(string2);
            twoButtonsAndTextWithDescriptionDialog.setVisibilityOfOKButton(8);
            twoButtonsAndTextWithDescriptionDialog.setCancelable(true);
            UsefulKt.hideSystemUI(this$0.getBinding().getRoot());
            return;
        }
        String string3 = this$0.getString(R.string.new_menu_setting_apply_change_widget_body);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        FragmentActivity requireActivity2 = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
        TwoButtonsAndTextWithDescriptionDialog twoButtonsAndTextWithDescriptionDialog2 = new TwoButtonsAndTextWithDescriptionDialog(requireActivity2);
        twoButtonsAndTextWithDescriptionDialog2.setOnOkButtonClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initChangeWidget$1$2$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MenuSettingControlViewModel menuSettingControlViewModel;
                menuSettingControlViewModel = MenuSettingControlUiFragment.this.getMenuSettingControlViewModel();
                menuSettingControlViewModel.changeWidget();
            }
        });
        twoButtonsAndTextWithDescriptionDialog2.setOnCancelButtonClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initChangeWidget$1$2$2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
        twoButtonsAndTextWithDescriptionDialog2.show();
        String string4 = this$0.getString(R.string.new_menu_setting_apply_change_widget_title);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        twoButtonsAndTextWithDescriptionDialog2.setTitle(string4);
        twoButtonsAndTextWithDescriptionDialog2.setDescription(Useful.INSTANCE.getTextWithHtmlStyles(string3));
        twoButtonsAndTextWithDescriptionDialog2.setCancelable(true);
        UsefulKt.hideSystemUI(this$0.getBinding().getRoot());
    }

    private final void setObservers() {
        getMenuSettingControlViewModel().getNewCarControl().observe(getViewLifecycleOwner(), new MenuSettingControlUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$setObservers$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) {
                String[] strArr;
                FragmentMenuSettingControlBinding binding;
                strArr = MenuSettingControlUiFragment.this.joystickSpinnerList;
                if (strArr != null) {
                    binding = MenuSettingControlUiFragment.this.getBinding();
                    TextView textView = binding.settingMenuCarControlSpinner;
                    Intrinsics.checkNotNull(num);
                    String str = (String) ArraysKt___ArraysKt.getOrNull(strArr, num.intValue());
                    if (str == null) {
                        str = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                    }
                    textView.setText(str);
                }
            }
        }));
        getMenuSettingControlViewModel().getHudVersion().observe(getViewLifecycleOwner(), new MenuSettingControlUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$setObservers$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) {
                String[] strArr;
                FragmentMenuSettingControlBinding binding;
                strArr = MenuSettingControlUiFragment.this.hudSpinnerList;
                if (strArr != null) {
                    binding = MenuSettingControlUiFragment.this.getBinding();
                    TextView textView = binding.tvSettingMenuSwitchHudSpinner;
                    Intrinsics.checkNotNull(num);
                    String str = (String) ArraysKt___ArraysKt.getOrNull(strArr, num.intValue());
                    if (str == null) {
                        str = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                    }
                    textView.setText(str);
                }
            }
        }));
        getMenuSettingControlViewModel().getChatVersion().observe(getViewLifecycleOwner(), new MenuSettingControlUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$setObservers$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) {
                String[] strArr;
                FragmentMenuSettingControlBinding binding;
                strArr = MenuSettingControlUiFragment.this.chatSpinnerList;
                if (strArr != null) {
                    binding = MenuSettingControlUiFragment.this.getBinding();
                    TextView textView = binding.tvSettingMenuSwitchChatSpinner;
                    Intrinsics.checkNotNull(num);
                    String str = (String) ArraysKt___ArraysKt.getOrNull(strArr, num.intValue());
                    if (str == null) {
                        str = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                    }
                    textView.setText(str);
                }
            }
        }));
        getMenuSettingControlViewModel().getKeyboardVersion().observe(getViewLifecycleOwner(), new MenuSettingControlUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$setObservers$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) {
                String[] strArr;
                FragmentMenuSettingControlBinding binding;
                strArr = MenuSettingControlUiFragment.this.keyboardSpinnerList;
                if (strArr != null) {
                    binding = MenuSettingControlUiFragment.this.getBinding();
                    TextView textView = binding.tvSettingMenuSwitchKeyboardSpinner;
                    Intrinsics.checkNotNull(num);
                    String str = (String) ArraysKt___ArraysKt.getOrNull(strArr, num.intValue());
                    if (str == null) {
                        str = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                    }
                    textView.setText(str);
                }
            }
        }));
        getMenuSettingControlViewModel().getValueOfCarControlSensibility().observe(getViewLifecycleOwner(), new MenuSettingControlUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$setObservers$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                invoke2(f);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
            
                if (r0 < r1.seekBarsSettingsCarControlSensibility.getValueFrom()) goto L6;
             */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void invoke2(java.lang.Float r3) {
                /*
                    r2 = this;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                    float r0 = r3.floatValue()
                    com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment r1 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.this
                    com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding r1 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.access$getBinding(r1)
                    com.google.android.material.slider.Slider r1 = r1.seekBarsSettingsCarControlSensibility
                    float r1 = r1.getValueTo()
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 > 0) goto L2b
                    float r0 = r3.floatValue()
                    com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment r1 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.this
                    com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding r1 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.access$getBinding(r1)
                    com.google.android.material.slider.Slider r1 = r1.seekBarsSettingsCarControlSensibility
                    float r1 = r1.getValueFrom()
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 >= 0) goto L3b
                L2b:
                    com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment r3 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.this
                    com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding r3 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.access$getBinding(r3)
                    com.google.android.material.slider.Slider r3 = r3.seekBarsSettingsCarControlSensibility
                    float r3 = r3.getValueTo()
                    java.lang.Float r3 = java.lang.Float.valueOf(r3)
                L3b:
                    com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment r0 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.this
                    com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding r0 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.access$getBinding(r0)
                    com.google.android.material.slider.Slider r0 = r0.seekBarsSettingsCarControlSensibility
                    float r1 = r3.floatValue()
                    r0.setValue(r1)
                    com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment r0 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.this
                    com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding r0 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.access$getBinding(r0)
                    android.widget.TextView r0 = r0.settingsMenuCarControlSensibilityValue
                    java.lang.String r3 = java.lang.String.valueOf(r3)
                    r0.setText(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$setObservers$5.invoke2(java.lang.Float):void");
            }
        }));
        getMenuSettingControlViewModel().getValueOfCamXSensibility().observe(getViewLifecycleOwner(), new MenuSettingControlUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$setObservers$6
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                invoke2(f);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
            
                if (r0 < r1.seekBarsSettingsCarCamSensX.getValueFrom()) goto L6;
             */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void invoke2(java.lang.Float r3) {
                /*
                    r2 = this;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                    float r0 = r3.floatValue()
                    com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment r1 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.this
                    com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding r1 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.access$getBinding(r1)
                    com.google.android.material.slider.Slider r1 = r1.seekBarsSettingsCarCamSensX
                    float r1 = r1.getValueTo()
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 > 0) goto L2b
                    float r0 = r3.floatValue()
                    com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment r1 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.this
                    com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding r1 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.access$getBinding(r1)
                    com.google.android.material.slider.Slider r1 = r1.seekBarsSettingsCarCamSensX
                    float r1 = r1.getValueFrom()
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 >= 0) goto L3b
                L2b:
                    com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment r3 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.this
                    com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding r3 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.access$getBinding(r3)
                    com.google.android.material.slider.Slider r3 = r3.seekBarsSettingsCarControlSensibility
                    float r3 = r3.getValueTo()
                    java.lang.Float r3 = java.lang.Float.valueOf(r3)
                L3b:
                    com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment r0 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.this
                    com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding r0 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.access$getBinding(r0)
                    com.google.android.material.slider.Slider r0 = r0.seekBarsSettingsCarCamSensX
                    float r1 = r3.floatValue()
                    r0.setValue(r1)
                    com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment r0 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.this
                    com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding r0 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.access$getBinding(r0)
                    android.widget.TextView r0 = r0.settingsMenuCarControlCamSensXValue
                    java.lang.String r3 = java.lang.String.valueOf(r3)
                    r0.setText(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$setObservers$6.invoke2(java.lang.Float):void");
            }
        }));
        getMenuSettingControlViewModel().getValueOfCamYSensibility().observe(getViewLifecycleOwner(), new MenuSettingControlUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$setObservers$7
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                invoke2(f);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
            
                if (r0 < r1.seekBarsSettingsCarCamSensY.getValueFrom()) goto L6;
             */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void invoke2(java.lang.Float r3) {
                /*
                    r2 = this;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                    float r0 = r3.floatValue()
                    com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment r1 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.this
                    com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding r1 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.access$getBinding(r1)
                    com.google.android.material.slider.Slider r1 = r1.seekBarsSettingsCarCamSensY
                    float r1 = r1.getValueTo()
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 > 0) goto L2b
                    float r0 = r3.floatValue()
                    com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment r1 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.this
                    com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding r1 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.access$getBinding(r1)
                    com.google.android.material.slider.Slider r1 = r1.seekBarsSettingsCarCamSensY
                    float r1 = r1.getValueFrom()
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 >= 0) goto L3b
                L2b:
                    com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment r3 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.this
                    com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding r3 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.access$getBinding(r3)
                    com.google.android.material.slider.Slider r3 = r3.seekBarsSettingsCarControlSensibility
                    float r3 = r3.getValueTo()
                    java.lang.Float r3 = java.lang.Float.valueOf(r3)
                L3b:
                    com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment r0 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.this
                    com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding r0 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.access$getBinding(r0)
                    com.google.android.material.slider.Slider r0 = r0.seekBarsSettingsCarCamSensY
                    float r1 = r3.floatValue()
                    r0.setValue(r1)
                    com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment r0 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.this
                    com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding r0 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.access$getBinding(r0)
                    android.widget.TextView r0 = r0.settingsMenuCarControlCamSensYValue
                    java.lang.String r3 = java.lang.String.valueOf(r3)
                    r0.setText(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$setObservers$7.invoke2(java.lang.Float):void");
            }
        }));
        getMenuSettingControlViewModel().getValueOfAimingCamXSensibility().observe(getViewLifecycleOwner(), new MenuSettingControlUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$setObservers$8
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                invoke2(f);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
            
                if (r0 < r1.seekBarsSettingsAimingCamSensX.getValueFrom()) goto L6;
             */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void invoke2(java.lang.Float r3) {
                /*
                    r2 = this;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                    float r0 = r3.floatValue()
                    com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment r1 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.this
                    com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding r1 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.access$getBinding(r1)
                    com.google.android.material.slider.Slider r1 = r1.seekBarsSettingsAimingCamSensX
                    float r1 = r1.getValueTo()
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 > 0) goto L2b
                    float r0 = r3.floatValue()
                    com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment r1 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.this
                    com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding r1 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.access$getBinding(r1)
                    com.google.android.material.slider.Slider r1 = r1.seekBarsSettingsAimingCamSensX
                    float r1 = r1.getValueFrom()
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 >= 0) goto L3b
                L2b:
                    com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment r3 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.this
                    com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding r3 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.access$getBinding(r3)
                    com.google.android.material.slider.Slider r3 = r3.seekBarsSettingsAimingCamSensX
                    float r3 = r3.getValueTo()
                    java.lang.Float r3 = java.lang.Float.valueOf(r3)
                L3b:
                    com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment r0 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.this
                    com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding r0 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.access$getBinding(r0)
                    com.google.android.material.slider.Slider r0 = r0.seekBarsSettingsAimingCamSensX
                    float r1 = r3.floatValue()
                    r0.setValue(r1)
                    com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment r0 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.this
                    com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding r0 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.access$getBinding(r0)
                    android.widget.TextView r0 = r0.settingsMenuControlAimingCamSensXValue
                    java.lang.String r3 = java.lang.String.valueOf(r3)
                    r0.setText(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$setObservers$8.invoke2(java.lang.Float):void");
            }
        }));
        getMenuSettingControlViewModel().getValueOfAimingCamYSensibility().observe(getViewLifecycleOwner(), new MenuSettingControlUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$setObservers$9
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                invoke2(f);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
            
                if (r0 < r1.seekBarsSettingsAimingCamSensY.getValueFrom()) goto L6;
             */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void invoke2(java.lang.Float r3) {
                /*
                    r2 = this;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                    float r0 = r3.floatValue()
                    com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment r1 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.this
                    com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding r1 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.access$getBinding(r1)
                    com.google.android.material.slider.Slider r1 = r1.seekBarsSettingsAimingCamSensY
                    float r1 = r1.getValueTo()
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 > 0) goto L2b
                    float r0 = r3.floatValue()
                    com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment r1 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.this
                    com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding r1 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.access$getBinding(r1)
                    com.google.android.material.slider.Slider r1 = r1.seekBarsSettingsAimingCamSensY
                    float r1 = r1.getValueFrom()
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 >= 0) goto L3b
                L2b:
                    com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment r3 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.this
                    com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding r3 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.access$getBinding(r3)
                    com.google.android.material.slider.Slider r3 = r3.seekBarsSettingsAimingCamSensY
                    float r3 = r3.getValueTo()
                    java.lang.Float r3 = java.lang.Float.valueOf(r3)
                L3b:
                    com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment r0 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.this
                    com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding r0 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.access$getBinding(r0)
                    com.google.android.material.slider.Slider r0 = r0.seekBarsSettingsAimingCamSensY
                    float r1 = r3.floatValue()
                    r0.setValue(r1)
                    com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment r0 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.this
                    com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding r0 = com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.access$getBinding(r0)
                    android.widget.TextView r0 = r0.settingsMenuControlAimingCamSensYValue
                    java.lang.String r3 = java.lang.String.valueOf(r3)
                    r0.setText(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$setObservers$9.invoke2(java.lang.Float):void");
            }
        }));
        getMenuSettingControlViewModel().getNewLookBack().observe(getViewLifecycleOwner(), new MenuSettingControlUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$setObservers$10
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke2(bool);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool) {
                FragmentMenuSettingControlBinding binding;
                MenuSettingControlUiFragment menuSettingControlUiFragment = MenuSettingControlUiFragment.this;
                binding = menuSettingControlUiFragment.getBinding();
                SwitchCompat newMenuSettingSwitchLookBack = binding.newMenuSettingSwitchLookBack;
                Intrinsics.checkNotNullExpressionValue(newMenuSettingSwitchLookBack, "newMenuSettingSwitchLookBack");
                Intrinsics.checkNotNull(bool);
                menuSettingControlUiFragment.initialSwitch(newMenuSettingSwitchLookBack, bool.booleanValue());
            }
        }));
    }

    public final void initialSwitch(SwitchCompat currentSwitch, boolean status) {
        if (status) {
            currentSwitch.setThumbResource(R.drawable.bg_oval_red_s12);
            currentSwitch.setTrackResource(R.drawable.bg_rectangle_white15_cr6_1);
        } else {
            currentSwitch.setThumbResource(R.drawable.bg_oval_gray_s15);
            currentSwitch.setTrackResource(R.drawable.bg_rectangle_gray_cr6);
        }
        currentSwitch.setChecked(status);
    }

    public final void setJoystickVisibleSpinner(int setVisible) {
        getBinding().rvSettingMenuSwitchControl.setVisibility(setVisible);
    }

    public final void setHudVisibleSpinner(int setVisible) {
        getBinding().rvSettingMenuSwitchHud.setVisibility(setVisible);
    }

    public final void setChatVisibleSpinner(int setVisible) {
        getBinding().rvSettingMenuSwitchChat.setVisibility(setVisible);
    }

    public final void setKeyboardVisibleSpinner(int setVisible) {
        getBinding().rvSettingMenuSwitchKeyboard.setVisibility(setVisible);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        setJoystickVisibleSpinner(4);
    }

    public final void setNullableParameters() {
        this.joystickControlAdapter = null;
        this.hudVersionAdapter = null;
        this.chatVersionAdapter = null;
        this.keyboardVersionAdapter = null;
        this.joystickSpinnerList = null;
        this.hudSpinnerList = null;
        this.chatSpinnerList = null;
        this.keyboardSpinnerList = null;
    }
}
