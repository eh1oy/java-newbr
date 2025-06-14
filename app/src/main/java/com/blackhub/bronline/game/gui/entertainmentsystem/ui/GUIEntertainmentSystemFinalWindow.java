package com.blackhub.bronline.game.gui.entertainmentsystem.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.EntertainmentSystemFinalWindowBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.FinalWindowViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUIEntertainmentSystemFinalWindow.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\u0012\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!H\u0002R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\""}, d2 = {"Lcom/blackhub/bronline/game/gui/entertainmentsystem/ui/GUIEntertainmentSystemFinalWindow;", "Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragment;", "Lcom/blackhub/bronline/databinding/EntertainmentSystemFinalWindowBinding;", "()V", "finalWindowFactory", "Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/viewmodel/FinalWindowViewModel;", "getFinalWindowFactory", "()Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "setFinalWindowFactory", "(Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;)V", "finalWindowViewModel", "getFinalWindowViewModel", "()Lcom/blackhub/bronline/game/gui/entertainmentsystem/viewmodel/FinalWindowViewModel;", "finalWindowViewModel$delegate", "Lkotlin/Lazy;", "getGuiId", "", "getViewBinding", "initClickListener", "", "initViewsISAMPGUI", "newBackPress", "onAttach", "context", "Landroid/content/Context;", "onDestroyView", "onPacketIncoming", "json", "Lorg/json/JSONObject;", "setObservers", "setTextStyle", "thisText", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGUIEntertainmentSystemFinalWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUIEntertainmentSystemFinalWindow.kt\ncom/blackhub/bronline/game/gui/entertainmentsystem/ui/GUIEntertainmentSystemFinalWindow\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,87:1\n106#2,15:88\n*S KotlinDebug\n*F\n+ 1 GUIEntertainmentSystemFinalWindow.kt\ncom/blackhub/bronline/game/gui/entertainmentsystem/ui/GUIEntertainmentSystemFinalWindow\n*L\n27#1:88,15\n*E\n"})
/* loaded from: classes3.dex */
public final class GUIEntertainmentSystemFinalWindow extends BaseISAMPGUIFragment<EntertainmentSystemFinalWindowBinding> {
    public static final int $stable = 8;

    @Inject
    public MainViewModelFactory<FinalWindowViewModel> finalWindowFactory;

    /* renamed from: finalWindowViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy finalWindowViewModel;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 43;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
    }

    @NotNull
    public final MainViewModelFactory<FinalWindowViewModel> getFinalWindowFactory() {
        MainViewModelFactory<FinalWindowViewModel> mainViewModelFactory = this.finalWindowFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("finalWindowFactory");
        return null;
    }

    public final void setFinalWindowFactory(@NotNull MainViewModelFactory<FinalWindowViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.finalWindowFactory = mainViewModelFactory;
    }

    public final FinalWindowViewModel getFinalWindowViewModel() {
        return (FinalWindowViewModel) this.finalWindowViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() {
        getFinalWindowViewModel().updateResult(getJsonObj());
        setObservers();
        initClickListener();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public EntertainmentSystemFinalWindowBinding getViewBinding() {
        EntertainmentSystemFinalWindowBinding inflate = EntertainmentSystemFinalWindowBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    private final void setObservers() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new GUIEntertainmentSystemFinalWindow$setObservers$1(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTextStyle(String thisText) {
        String string = requireContext().getString(R.string.common_you);
        SpannableString spannableString = new SpannableString(thisText);
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(requireActivity(), R.color.red)), 0, thisText.length(), 33);
        Unit unit = Unit.INSTANCE;
        ((EntertainmentSystemFinalWindowBinding) getBinding()).gamesStatus.setText(TextUtils.concat(string, spannableString));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initClickListener() {
        AppCompatImageButton closeFinalWindow = ((EntertainmentSystemFinalWindowBinding) getBinding()).closeFinalWindow;
        Intrinsics.checkNotNullExpressionValue(closeFinalWindow, "closeFinalWindow");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, closeFinalWindow, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.GUIEntertainmentSystemFinalWindow$initClickListener$1
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
                GUIEntertainmentSystemFinalWindow.this.closeFragment();
            }
        }, 1, null);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getFinalWindowViewModel().sendPressButton(3);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        App.INSTANCE.appComponent().inject(this);
    }

    public GUIEntertainmentSystemFinalWindow() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.GUIEntertainmentSystemFinalWindow$finalWindowViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return GUIEntertainmentSystemFinalWindow.this;
            }
        };
        Function0<ViewModelProvider.Factory> function02 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.GUIEntertainmentSystemFinalWindow$finalWindowViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return GUIEntertainmentSystemFinalWindow.this.getFinalWindowFactory();
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.GUIEntertainmentSystemFinalWindow$special$$inlined$viewModels$default$1
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
        this.finalWindowViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(FinalWindowViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.GUIEntertainmentSystemFinalWindow$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.GUIEntertainmentSystemFinalWindow$special$$inlined$viewModels$default$3
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
