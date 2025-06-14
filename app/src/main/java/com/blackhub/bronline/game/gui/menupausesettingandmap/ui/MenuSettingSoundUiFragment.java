package com.blackhub.bronline.game.gui.menupausesettingandmap.ui;

import android.content.Context;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.FragmentMenuSettingSoundBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingSoundViewModel;
import com.google.android.material.slider.Slider;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: MenuSettingSoundUiFragment.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\fH\u0002J\b\u0010\u0017\u001a\u00020\fH\u0002J\b\u0010\u0018\u001a\u00020\fH\u0002J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0011H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuSettingSoundUiFragment;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/FragmentMenuSettingSoundBinding;", "()V", "menuSettingSoundViewModel", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingSoundViewModel;", "getMenuSettingSoundViewModel", "()Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingSoundViewModel;", "menuSettingSoundViewModel$delegate", "Lkotlin/Lazy;", "getViewBinding", "initViews", "", "initialSwitch", "currentSwitch", "Landroidx/appcompat/widget/SwitchCompat;", "status", "", "saveSwitch", "isChecked", "paramTag", "", "setObservers", "setSeekBarListener", "setSwitchListener", "setVisibleSettingMicrophone", "isVisible", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMenuSettingSoundUiFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuSettingSoundUiFragment.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuSettingSoundUiFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,164:1\n106#2,15:165\n*S KotlinDebug\n*F\n+ 1 MenuSettingSoundUiFragment.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuSettingSoundUiFragment\n*L\n20#1:165,15\n*E\n"})
/* loaded from: classes3.dex */
public final class MenuSettingSoundUiFragment extends BaseFragment<FragmentMenuSettingSoundBinding> {
    public static final int $stable = 8;

    /* renamed from: menuSettingSoundViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy menuSettingSoundViewModel;

    public MenuSettingSoundUiFragment() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$menuSettingSoundViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = MenuSettingSoundUiFragment.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$special$$inlined$viewModels$default$1
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
        this.menuSettingSoundViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MenuSettingSoundViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$special$$inlined$viewModels$default$4
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MenuSettingSoundViewModel getMenuSettingSoundViewModel() {
        return (MenuSettingSoundViewModel) this.menuSettingSoundViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FragmentMenuSettingSoundBinding getViewBinding() {
        FragmentMenuSettingSoundBinding inflate = FragmentMenuSettingSoundBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        setSeekBarListener();
        setSwitchListener();
        setObservers();
    }

    public final void setSeekBarListener() {
        getBinding().allSoundSeekBar.addOnChangeListener(new Slider.OnChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$$ExternalSyntheticLambda4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.BaseOnChangeListener
            public final void onValueChange(Slider slider, float f, boolean z) {
                MenuSettingSoundUiFragment.setSeekBarListener$lambda$0(MenuSettingSoundUiFragment.this, slider, f, z);
            }
        });
        getBinding().allSoundSeekBar.addOnSliderTouchListener(new Slider.OnSliderTouchListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$setSeekBarListener$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStartTrackingTouch(@NotNull Slider slider) {
                Intrinsics.checkNotNullParameter(slider, "slider");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStopTrackingTouch(@NotNull Slider slider) {
                MenuSettingSoundViewModel menuSettingSoundViewModel;
                Intrinsics.checkNotNullParameter(slider, "slider");
                menuSettingSoundViewModel = MenuSettingSoundUiFragment.this.getMenuSettingSoundViewModel();
                menuSettingSoundViewModel.saveNewSettingParameter(NewMenuConstants.ALL_SOUNDS, (int) slider.getValue());
            }
        });
        getBinding().seekBarSpeakerVolume.addOnChangeListener(new Slider.OnChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$$ExternalSyntheticLambda5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.BaseOnChangeListener
            public final void onValueChange(Slider slider, float f, boolean z) {
                MenuSettingSoundUiFragment.setSeekBarListener$lambda$1(MenuSettingSoundUiFragment.this, slider, f, z);
            }
        });
        getBinding().seekBarSpeakerVolume.addOnSliderTouchListener(new Slider.OnSliderTouchListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$setSeekBarListener$4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStartTrackingTouch(@NotNull Slider slider) {
                Intrinsics.checkNotNullParameter(slider, "slider");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStopTrackingTouch(@NotNull Slider slider) {
                MenuSettingSoundViewModel menuSettingSoundViewModel;
                Intrinsics.checkNotNullParameter(slider, "slider");
                menuSettingSoundViewModel = MenuSettingSoundUiFragment.this.getMenuSettingSoundViewModel();
                menuSettingSoundViewModel.saveNewSettingParameter(NewMenuConstants.PARAM_1, (int) slider.getValue());
            }
        });
        getBinding().seekBarMuteTheMicrophone.addOnChangeListener(new Slider.OnChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$$ExternalSyntheticLambda6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.BaseOnChangeListener
            public final void onValueChange(Slider slider, float f, boolean z) {
                MenuSettingSoundUiFragment.setSeekBarListener$lambda$2(MenuSettingSoundUiFragment.this, slider, f, z);
            }
        });
        getBinding().seekBarMuteTheMicrophone.addOnSliderTouchListener(new Slider.OnSliderTouchListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$setSeekBarListener$6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStartTrackingTouch(@NotNull Slider slider) {
                Intrinsics.checkNotNullParameter(slider, "slider");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStopTrackingTouch(@NotNull Slider slider) {
                MenuSettingSoundViewModel menuSettingSoundViewModel;
                Intrinsics.checkNotNullParameter(slider, "slider");
                menuSettingSoundViewModel = MenuSettingSoundUiFragment.this.getMenuSettingSoundViewModel();
                menuSettingSoundViewModel.saveNewSettingParameter(NewMenuConstants.PARAM_2, (int) slider.getValue());
            }
        });
    }

    public static final void setSeekBarListener$lambda$0(MenuSettingSoundUiFragment this$0, Slider slider, float f, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(slider, "<anonymous parameter 0>");
        this$0.getMenuSettingSoundViewModel().setAllSound((int) f);
    }

    public static final void setSeekBarListener$lambda$1(MenuSettingSoundUiFragment this$0, Slider slider, float f, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(slider, "<anonymous parameter 0>");
        this$0.getMenuSettingSoundViewModel().setSpeakerVolume((int) f);
    }

    public static final void setSeekBarListener$lambda$2(MenuSettingSoundUiFragment this$0, Slider slider, float f, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(slider, "<anonymous parameter 0>");
        this$0.getMenuSettingSoundViewModel().setTimerMuteTheMicrophone((int) f);
    }

    private final void setSwitchListener() {
        FragmentMenuSettingSoundBinding binding = getBinding();
        binding.newMenuSettingSwitchShowSpeakers.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MenuSettingSoundUiFragment.setSwitchListener$lambda$7$lambda$3(MenuSettingSoundUiFragment.this, compoundButton, z);
            }
        });
        binding.newMenuSettingSwitchShowVoiceChat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$$ExternalSyntheticLambda1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MenuSettingSoundUiFragment.setSwitchListener$lambda$7$lambda$4(MenuSettingSoundUiFragment.this, compoundButton, z);
            }
        });
        binding.newMenuSettingSwitchAlwaysTurnOnVoiceChat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$$ExternalSyntheticLambda2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MenuSettingSoundUiFragment.setSwitchListener$lambda$7$lambda$5(MenuSettingSoundUiFragment.this, compoundButton, z);
            }
        });
        binding.newMenuSettingSwitchRadioWithoutCensorship.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$$ExternalSyntheticLambda3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MenuSettingSoundUiFragment.setSwitchListener$lambda$7$lambda$6(MenuSettingSoundUiFragment.this, compoundButton, z);
            }
        });
    }

    public static final void setSwitchListener$lambda$7$lambda$3(MenuSettingSoundUiFragment this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMenuSettingSoundViewModel().setShowSpeakers(z);
        this$0.saveSwitch(z, NewMenuConstants.PARAM_3);
    }

    public static final void setSwitchListener$lambda$7$lambda$4(MenuSettingSoundUiFragment this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMenuSettingSoundViewModel().setShowVoiceChat(z);
        this$0.saveSwitch(z, NewMenuConstants.PARAM_4);
    }

    public static final void setSwitchListener$lambda$7$lambda$5(MenuSettingSoundUiFragment this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMenuSettingSoundViewModel().setTurnOnVoiceChat(z);
        this$0.saveSwitch(z, NewMenuConstants.PARAM_5);
        this$0.setVisibleSettingMicrophone(!z);
    }

    public static final void setSwitchListener$lambda$7$lambda$6(MenuSettingSoundUiFragment this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMenuSettingSoundViewModel().setRadioWithoutCensorship(z);
        this$0.saveSwitch(z, NewMenuConstants.PARAM_6);
    }

    public final void saveSwitch(boolean isChecked, String paramTag) {
        if (isChecked) {
            getMenuSettingSoundViewModel().saveNewSettingParameter(paramTag, 1);
        } else {
            getMenuSettingSoundViewModel().saveNewSettingParameter(paramTag, 0);
        }
    }

    public final void setVisibleSettingMicrophone(boolean isVisible) {
        int i = isVisible ? 0 : 8;
        FragmentMenuSettingSoundBinding binding = getBinding();
        binding.seekBarMuteTheMicrophone.setVisibility(i);
        binding.newMenuSettingTitleMuteTheMicrophone.setVisibility(i);
    }

    private final void setObservers() {
        getMenuSettingSoundViewModel().getNewAllSound().observe(getViewLifecycleOwner(), new MenuSettingSoundUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$setObservers$1
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
                FragmentMenuSettingSoundBinding binding;
                FragmentMenuSettingSoundBinding binding2;
                binding = MenuSettingSoundUiFragment.this.getBinding();
                binding.allSoundSeekBar.setValue(num.intValue());
                binding2 = MenuSettingSoundUiFragment.this.getBinding();
                binding2.newMenuSettingValueSound.setText(String.valueOf(num));
            }
        }));
        getMenuSettingSoundViewModel().getSpeakerVolume().observe(getViewLifecycleOwner(), new MenuSettingSoundUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$setObservers$2
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
                FragmentMenuSettingSoundBinding binding;
                FragmentMenuSettingSoundBinding binding2;
                binding = MenuSettingSoundUiFragment.this.getBinding();
                binding.seekBarSpeakerVolume.setValue(num.intValue());
                binding2 = MenuSettingSoundUiFragment.this.getBinding();
                binding2.newMenuSettingValueSpeakerVolume.setText(String.valueOf(num));
            }
        }));
        getMenuSettingSoundViewModel().getMuteTheMicrophone().observe(getViewLifecycleOwner(), new MenuSettingSoundUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$setObservers$3
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
                FragmentMenuSettingSoundBinding binding;
                FragmentMenuSettingSoundBinding binding2;
                String str;
                binding = MenuSettingSoundUiFragment.this.getBinding();
                binding.seekBarMuteTheMicrophone.setValue(num.intValue());
                binding2 = MenuSettingSoundUiFragment.this.getBinding();
                TextView textView = binding2.newMenuSettingTitleMuteTheMicrophone;
                Context context = MenuSettingSoundUiFragment.this.getContext();
                if (context == null || (str = context.getString(R.string.new_menu_setting_parameter_mute_the_microphone, num)) == null) {
                    str = "";
                }
                textView.setText(str);
            }
        }));
        getMenuSettingSoundViewModel().isShowSpeakers().observe(getViewLifecycleOwner(), new MenuSettingSoundUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$setObservers$4
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
                FragmentMenuSettingSoundBinding binding;
                MenuSettingSoundUiFragment menuSettingSoundUiFragment = MenuSettingSoundUiFragment.this;
                binding = menuSettingSoundUiFragment.getBinding();
                SwitchCompat newMenuSettingSwitchShowSpeakers = binding.newMenuSettingSwitchShowSpeakers;
                Intrinsics.checkNotNullExpressionValue(newMenuSettingSwitchShowSpeakers, "newMenuSettingSwitchShowSpeakers");
                Intrinsics.checkNotNull(bool);
                menuSettingSoundUiFragment.initialSwitch(newMenuSettingSwitchShowSpeakers, bool.booleanValue());
            }
        }));
        getMenuSettingSoundViewModel().isShowVoiceChat().observe(getViewLifecycleOwner(), new MenuSettingSoundUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$setObservers$5
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
                FragmentMenuSettingSoundBinding binding;
                MenuSettingSoundUiFragment menuSettingSoundUiFragment = MenuSettingSoundUiFragment.this;
                binding = menuSettingSoundUiFragment.getBinding();
                SwitchCompat newMenuSettingSwitchShowVoiceChat = binding.newMenuSettingSwitchShowVoiceChat;
                Intrinsics.checkNotNullExpressionValue(newMenuSettingSwitchShowVoiceChat, "newMenuSettingSwitchShowVoiceChat");
                Intrinsics.checkNotNull(bool);
                menuSettingSoundUiFragment.initialSwitch(newMenuSettingSwitchShowVoiceChat, bool.booleanValue());
            }
        }));
        getMenuSettingSoundViewModel().getAlwaysOnVoiceChat().observe(getViewLifecycleOwner(), new MenuSettingSoundUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$setObservers$6
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
                FragmentMenuSettingSoundBinding binding;
                MenuSettingSoundUiFragment menuSettingSoundUiFragment = MenuSettingSoundUiFragment.this;
                binding = menuSettingSoundUiFragment.getBinding();
                SwitchCompat newMenuSettingSwitchAlwaysTurnOnVoiceChat = binding.newMenuSettingSwitchAlwaysTurnOnVoiceChat;
                Intrinsics.checkNotNullExpressionValue(newMenuSettingSwitchAlwaysTurnOnVoiceChat, "newMenuSettingSwitchAlwaysTurnOnVoiceChat");
                Intrinsics.checkNotNull(bool);
                menuSettingSoundUiFragment.initialSwitch(newMenuSettingSwitchAlwaysTurnOnVoiceChat, bool.booleanValue());
            }
        }));
        getMenuSettingSoundViewModel().getRadioWithoutCensorship().observe(getViewLifecycleOwner(), new MenuSettingSoundUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$setObservers$7
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
                FragmentMenuSettingSoundBinding binding;
                MenuSettingSoundUiFragment menuSettingSoundUiFragment = MenuSettingSoundUiFragment.this;
                binding = menuSettingSoundUiFragment.getBinding();
                SwitchCompat newMenuSettingSwitchRadioWithoutCensorship = binding.newMenuSettingSwitchRadioWithoutCensorship;
                Intrinsics.checkNotNullExpressionValue(newMenuSettingSwitchRadioWithoutCensorship, "newMenuSettingSwitchRadioWithoutCensorship");
                Intrinsics.checkNotNull(bool);
                menuSettingSoundUiFragment.initialSwitch(newMenuSettingSwitchRadioWithoutCensorship, bool.booleanValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
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
}
