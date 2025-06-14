package com.blackhub.bronline.game.gui.woundsystem;

import android.content.Context;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.WoundSystemMainLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.core.JNILib;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.woundsystem.ui.PromptDialog;
import com.blackhub.bronline.game.gui.woundsystem.viewmodel.WoundSystemViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import javax.inject.Inject;
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
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUIWoundSystem.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\b\u0010 \u001a\u00020\u001bH\u0002J\b\u0010!\u001a\u00020\u001bH\u0002J\b\u0010\"\u001a\u00020\u001bH\u0016J\b\u0010#\u001a\u00020\bH\u0016J\b\u0010$\u001a\u00020\u001bH\u0016J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u001bH\u0016J\u0012\u0010)\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010*\u001a\u00020\u001bH\u0002J\b\u0010+\u001a\u00020\u001bH\u0002J\b\u0010,\u001a\u00020\u001bH\u0002J\u0018\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\bH\u0002J\u0010\u00101\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u00063"}, d2 = {"Lcom/blackhub/bronline/game/gui/woundsystem/GUIWoundSystem;", "Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragment;", "Lcom/blackhub/bronline/databinding/WoundSystemMainLayoutBinding;", "()V", "alphaIfActive", "", "alphaIfNotActive", "ifHideDialog", "", "ifInformingServerAboutDismiss", "promptDialog", "Lcom/blackhub/bronline/game/gui/woundsystem/ui/PromptDialog;", "woundSystemFactory", "Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "Lcom/blackhub/bronline/game/gui/woundsystem/viewmodel/WoundSystemViewModel;", "getWoundSystemFactory", "()Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "setWoundSystemFactory", "(Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;)V", "woundSystemViewModel", "getWoundSystemViewModel", "()Lcom/blackhub/bronline/game/gui/woundsystem/viewmodel/WoundSystemViewModel;", "woundSystemViewModel$delegate", "Lkotlin/Lazy;", "getGuiId", "", "getStartParameters", "", "json", "Lorg/json/JSONObject;", "getViewBinding", "initClickListeners", "initPromptDialog", "initPromptDialogClickListeners", "initViewsISAMPGUI", "isShowingGui", "newBackPress", "onAttach", "context", "Landroid/content/Context;", "onDestroyView", "onPacketIncoming", "setNullableParameters", "setObservers", "setStyleForText", "setTimerForButton", "seconds", "", "blockBothButtons", "visibleBackground", "visible", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGUIWoundSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUIWoundSystem.kt\ncom/blackhub/bronline/game/gui/woundsystem/GUIWoundSystem\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,212:1\n106#2,15:213\n*S KotlinDebug\n*F\n+ 1 GUIWoundSystem.kt\ncom/blackhub/bronline/game/gui/woundsystem/GUIWoundSystem\n*L\n41#1:213,15\n*E\n"})
/* loaded from: classes3.dex */
public final class GUIWoundSystem extends BaseISAMPGUIFragment<WoundSystemMainLayoutBinding> {
    public static final int $stable = 8;
    public boolean ifHideDialog;

    @Nullable
    public PromptDialog promptDialog;

    @Inject
    public MainViewModelFactory<WoundSystemViewModel> woundSystemFactory;

    /* renamed from: woundSystemViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy woundSystemViewModel;
    public boolean ifInformingServerAboutDismiss = true;
    public final float alphaIfNotActive = 0.5f;
    public final float alphaIfActive = 1.0f;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 40;
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment, com.blackhub.bronline.game.ISAMPGUI
    public boolean isShowingGui() {
        return true;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ WoundSystemMainLayoutBinding access$getBinding(GUIWoundSystem gUIWoundSystem) {
        return (WoundSystemMainLayoutBinding) gUIWoundSystem.getBinding();
    }

    @NotNull
    public final MainViewModelFactory<WoundSystemViewModel> getWoundSystemFactory() {
        MainViewModelFactory<WoundSystemViewModel> mainViewModelFactory = this.woundSystemFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("woundSystemFactory");
        return null;
    }

    public final void setWoundSystemFactory(@NotNull MainViewModelFactory<WoundSystemViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.woundSystemFactory = mainViewModelFactory;
    }

    public final WoundSystemViewModel getWoundSystemViewModel() {
        return (WoundSystemViewModel) this.woundSystemViewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
        Integer valueOf = json != null ? Integer.valueOf(json.optInt("t")) : null;
        if (valueOf != null && valueOf.intValue() == 2) {
            this.ifInformingServerAboutDismiss = false;
            closeFragment();
        } else if (valueOf != null && valueOf.intValue() == 1) {
            setTimerForButton(30L, true);
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() {
        JNILib.toggleDrawing2dStuff(true);
        JSONObject jsonObj = getJsonObj();
        if (jsonObj != null) {
            getStartParameters(jsonObj);
        }
        this.ifInformingServerAboutDismiss = true;
        setStyleForText();
        initPromptDialog();
        initClickListeners();
        setObservers();
        if (this.ifHideDialog) {
            setTimerForButton(15L, false);
            return;
        }
        initPromptDialog();
        PromptDialog promptDialog = this.promptDialog;
        if (promptDialog != null) {
            promptDialog.show();
        }
        visibleBackground(4);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public WoundSystemMainLayoutBinding getViewBinding() {
        WoundSystemMainLayoutBinding inflate = WoundSystemMainLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    private final void setObservers() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new GUIWoundSystem$setObservers$1(this, null));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2).launchWhenStarted(new GUIWoundSystem$setObservers$2(this, null));
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3).launchWhenStarted(new GUIWoundSystem$setObservers$3(this, null));
    }

    private final void getStartParameters(JSONObject json) {
        getWoundSystemViewModel().initData(json);
        this.ifHideDialog = json.optInt("h") == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setStyleForText() {
        TextView textView = ((WoundSystemMainLayoutBinding) getBinding()).titleDamage;
        Useful useful = Useful.INSTANCE;
        String string = requireContext().getString(R.string.wound_system_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        textView.setText(useful.getTextWithHtmlStyles(string));
    }

    public final void initPromptDialog() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        this.promptDialog = new PromptDialog(requireActivity);
        initPromptDialogClickListeners();
    }

    public final void initPromptDialogClickListeners() {
        PromptDialog promptDialog = this.promptDialog;
        if (promptDialog == null) {
            return;
        }
        promptDialog.setDialogResultListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem$initPromptDialogClickListeners$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                WoundSystemViewModel woundSystemViewModel;
                boolean z;
                if (i == 3) {
                    woundSystemViewModel = GUIWoundSystem.this.getWoundSystemViewModel();
                    woundSystemViewModel.pressButton(3);
                } else {
                    if (i != 9) {
                        return;
                    }
                    z = GUIWoundSystem.this.ifInformingServerAboutDismiss;
                    if (z) {
                        GUIWoundSystem.this.visibleBackground(0);
                        GUIWoundSystem.this.setTimerForButton(15L, false);
                    }
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTimerForButton(long seconds, boolean blockBothButtons) {
        if (blockBothButtons) {
            AppCompatButton appCompatButton = ((WoundSystemMainLayoutBinding) getBinding()).buttonNeedHelp;
            appCompatButton.setAlpha(this.alphaIfNotActive);
            appCompatButton.setClickable(false);
        }
        getWoundSystemViewModel().startTimer(seconds);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void visibleBackground(int visible) {
        ((WoundSystemMainLayoutBinding) getBinding()).woundSystemMainGroup.setVisibility(visible);
        ((WoundSystemMainLayoutBinding) getBinding()).woundSystemHospitalTimerGroup.setVisibility(visible);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initClickListeners() {
        AppCompatButton buttonNeedHelp = ((WoundSystemMainLayoutBinding) getBinding()).buttonNeedHelp;
        Intrinsics.checkNotNullExpressionValue(buttonNeedHelp, "buttonNeedHelp");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonNeedHelp, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem$initClickListeners$1
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
                WoundSystemViewModel woundSystemViewModel;
                woundSystemViewModel = GUIWoundSystem.this.getWoundSystemViewModel();
                woundSystemViewModel.pressButton(1);
                GUIWoundSystem.this.setTimerForButton(30L, true);
            }
        }, 1, null);
        AppCompatButton buttonNeedHospital = ((WoundSystemMainLayoutBinding) getBinding()).buttonNeedHospital;
        Intrinsics.checkNotNullExpressionValue(buttonNeedHospital, "buttonNeedHospital");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonNeedHospital, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem$initClickListeners$2
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
                float f;
                WoundSystemViewModel woundSystemViewModel;
                AppCompatButton appCompatButton = GUIWoundSystem.access$getBinding(GUIWoundSystem.this).buttonNeedHospital;
                f = GUIWoundSystem.this.alphaIfNotActive;
                appCompatButton.setAlpha(f);
                appCompatButton.setClickable(false);
                woundSystemViewModel = GUIWoundSystem.this.getWoundSystemViewModel();
                woundSystemViewModel.pressButton(2);
            }
        }, 1, null);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (this.ifInformingServerAboutDismiss) {
            getWoundSystemViewModel().pressButton(4);
        }
        JNILib.toggleDrawing2dStuff(false);
        setNullableParameters();
        super.onDestroyView();
    }

    private final void setNullableParameters() {
        PromptDialog promptDialog = this.promptDialog;
        if (promptDialog != null) {
            promptDialog.dismiss();
        }
        this.promptDialog = null;
    }

    public GUIWoundSystem() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem$woundSystemViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return GUIWoundSystem.this;
            }
        };
        Function0<ViewModelProvider.Factory> function02 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem$woundSystemViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return GUIWoundSystem.this.getWoundSystemFactory();
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem$special$$inlined$viewModels$default$1
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
        final Function0 function03 = null;
        this.woundSystemViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(WoundSystemViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem$special$$inlined$viewModels$default$3
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
                Function0 function04 = Function0.this;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function02);
    }
}
