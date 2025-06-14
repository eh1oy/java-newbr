package com.blackhub.bronline.game.gui.gasmangame.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.FragmentGasmanMainContainerBinding;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanChildViewModel;
import com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanParentViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import com.caverock.androidsvg.SVG;
import java.util.List;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUIGasmanGame.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u001cH\u0016J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0016J\u0012\u0010\"\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0019H\u0002J\u0018\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0019H\u0002J\b\u0010+\u001a\u00020\u001cH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006,"}, d2 = {"Lcom/blackhub/bronline/game/gui/gasmangame/ui/GUIGasmanGame;", "Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragment;", "Lcom/blackhub/bronline/databinding/FragmentGasmanMainContainerBinding;", "()V", "childViewModel", "Lcom/blackhub/bronline/game/gui/gasmangame/viewmodel/GasmanChildViewModel;", "getChildViewModel", "()Lcom/blackhub/bronline/game/gui/gasmangame/viewmodel/GasmanChildViewModel;", "childViewModel$delegate", "Lkotlin/Lazy;", "parentViewModel", "Lcom/blackhub/bronline/game/gui/gasmangame/viewmodel/GasmanParentViewModel;", "getParentViewModel", "()Lcom/blackhub/bronline/game/gui/gasmangame/viewmodel/GasmanParentViewModel;", "parentViewModel$delegate", "vmChildFactory", "Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "getVmChildFactory", "()Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "setVmChildFactory", "(Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;)V", "vmParentFactory", "getVmParentFactory", "setVmParentFactory", "getGuiId", "", "getViewBinding", "initViewModel", "", "initViewsISAMPGUI", "newBackPress", "onAttach", "context", "Landroid/content/Context;", "onPacketIncoming", "json", "Lorg/json/JSONObject;", "replaceChildFragment", "fragmentNumber", "setResultDrawable", SVG.View.NODE_NAME, "Landroid/view/View;", "quantityOfChecks", "showExitDialog", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGUIGasmanGame.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUIGasmanGame.kt\ncom/blackhub/bronline/game/gui/gasmangame/ui/GUIGasmanGame\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n*L\n1#1,174:1\n106#2,15:175\n106#2,15:190\n28#3,12:205\n*S KotlinDebug\n*F\n+ 1 GUIGasmanGame.kt\ncom/blackhub/bronline/game/gui/gasmangame/ui/GUIGasmanGame\n*L\n35#1:175,15\n40#1:190,15\n156#1:205,12\n*E\n"})
/* loaded from: classes3.dex */
public final class GUIGasmanGame extends BaseISAMPGUIFragment<FragmentGasmanMainContainerBinding> {
    public static final int $stable = 8;

    /* renamed from: childViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy childViewModel;

    /* renamed from: parentViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy parentViewModel;

    @Inject
    public MainViewModelFactory<GasmanChildViewModel> vmChildFactory;

    @Inject
    public MainViewModelFactory<GasmanParentViewModel> vmParentFactory;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 58;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FragmentGasmanMainContainerBinding access$getBinding(GUIGasmanGame gUIGasmanGame) {
        return (FragmentGasmanMainContainerBinding) gUIGasmanGame.getBinding();
    }

    @NotNull
    public final MainViewModelFactory<GasmanParentViewModel> getVmParentFactory() {
        MainViewModelFactory<GasmanParentViewModel> mainViewModelFactory = this.vmParentFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vmParentFactory");
        return null;
    }

    public final void setVmParentFactory(@NotNull MainViewModelFactory<GasmanParentViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.vmParentFactory = mainViewModelFactory;
    }

    public final GasmanParentViewModel getParentViewModel() {
        return (GasmanParentViewModel) this.parentViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<GasmanChildViewModel> getVmChildFactory() {
        MainViewModelFactory<GasmanChildViewModel> mainViewModelFactory = this.vmChildFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vmChildFactory");
        return null;
    }

    public final void setVmChildFactory(@NotNull MainViewModelFactory<GasmanChildViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.vmChildFactory = mainViewModelFactory;
    }

    public final GasmanChildViewModel getChildViewModel() {
        return (GasmanChildViewModel) this.childViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FragmentGasmanMainContainerBinding getViewBinding() {
        FragmentGasmanMainContainerBinding inflate = FragmentGasmanMainContainerBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
        showExitDialog();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() {
        UsefulKt.hideSystemUI(((FragmentGasmanMainContainerBinding) getBinding()).getRoot());
        initViewModel();
        ConstraintLayout root = ((FragmentGasmanMainContainerBinding) getBinding()).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewExtensionKt.addViewObserver(root, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$initViewsISAMPGUI$1
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
                GasmanParentViewModel parentViewModel;
                int width = GUIGasmanGame.access$getBinding(GUIGasmanGame.this).getRoot().getWidth();
                parentViewModel = GUIGasmanGame.this.getParentViewModel();
                parentViewModel.setTubesSizes(width);
            }
        });
        getChildFragmentManager().beginTransaction().replace(R.id.fragmentContainer, UIGasmanLoadingFragment.class, (Bundle) null).commit();
        ImageButton ibExit = ((FragmentGasmanMainContainerBinding) getBinding()).ibExit;
        Intrinsics.checkNotNullExpressionValue(ibExit, "ibExit");
        setOnClickListenerWithAnimAndDelay(ibExit, 250L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$initViewsISAMPGUI$2
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
                GUIGasmanGame.this.showExitDialog();
            }
        });
        ImageButton ibInfo = ((FragmentGasmanMainContainerBinding) getBinding()).ibInfo;
        Intrinsics.checkNotNullExpressionValue(ibInfo, "ibInfo");
        setOnClickListenerWithAnimAndDelay(ibInfo, 250L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$initViewsISAMPGUI$3
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
                FragmentActivity activity = GUIGasmanGame.this.getActivity();
                if (activity != null) {
                    new UIGasmanHintDialog(activity).show();
                }
            }
        });
        getParentViewModel().setResultOfGames(getJsonObj());
        getParentViewModel().setNeedToShowDialog(getJsonObj());
    }

    public final void initViewModel() {
        getChildViewModel();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUIGasmanGame$initViewModel$1(this, null), 3, null);
    }

    public final void setResultDrawable(View view, int quantityOfChecks) {
        if (getContext() != null) {
            List<Integer> listResultOfCheck = getParentViewModel().getUiState().getValue().getListResultOfCheck();
            if ((!listResultOfCheck.isEmpty()) && listResultOfCheck.size() == 3) {
                if (listResultOfCheck.get(quantityOfChecks - 1).intValue() == 1) {
                    ViewExtensionKt.loadBackground$default(view, Integer.valueOf(R.drawable.bg_gasman_result_of_check_green), null, null, 6, null);
                } else {
                    ViewExtensionKt.loadBackground$default(view, Integer.valueOf(R.drawable.bg_gasman_result_of_check_red), null, null, 6, null);
                }
            }
        }
    }

    public final void replaceChildFragment(int fragmentNumber) {
        Class<? extends Fragment> cls = UIGasmanGame1Fragment.class;
        switch (fragmentNumber) {
            case 2:
                cls = UIGasmanGame2Fragment.class;
                break;
            case 3:
                cls = UIGasmanGame3Fragment.class;
                break;
            case 4:
                cls = UIGasmanGame4Fragment.class;
                break;
            case 5:
                cls = UIGasmanGame5Fragment.class;
                break;
            case 6:
                cls = UIGasmanGame6Fragment.class;
                break;
            case 7:
                cls = UIGasmanGame7Fragment.class;
                break;
            case 8:
                cls = UIGasmanGame8Fragment.class;
                break;
            case 9:
                cls = UIGasmanGame9Fragment.class;
                break;
            case 10:
                cls = UIGasmanGame10Fragment.class;
                break;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(beginTransaction, "beginTransaction()");
        beginTransaction.setReorderingAllowed(true);
        beginTransaction.replace(R.id.fragmentContainer, cls, (Bundle) null);
        beginTransaction.commit();
        getParentViewModel().setCurrentFragmentNumber(fragmentNumber);
    }

    public final void showExitDialog() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            UIGasmanExitDialog uIGasmanExitDialog = new UIGasmanExitDialog(activity);
            uIGasmanExitDialog.setOnOkButtonClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$showExitDialog$1$1$1
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
                    GasmanParentViewModel parentViewModel;
                    parentViewModel = GUIGasmanGame.this.getParentViewModel();
                    parentViewModel.sendButtonExitPressed();
                }
            });
            uIGasmanExitDialog.show();
        }
    }

    public GUIGasmanGame() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$parentViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return GUIGasmanGame.this;
            }
        };
        Function0<ViewModelProvider.Factory> function02 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$parentViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return GUIGasmanGame.this.getVmParentFactory();
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$special$$inlined$viewModels$default$1
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
        this.parentViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(GasmanParentViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$special$$inlined$viewModels$default$3
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
        final Function0<ViewModelStoreOwner> function04 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$childViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return GUIGasmanGame.this;
            }
        };
        Function0<ViewModelProvider.Factory> function05 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$childViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return GUIGasmanGame.this.getVmChildFactory();
            }
        };
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$special$$inlined$viewModels$default$5
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
        this.childViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(GasmanChildViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$special$$inlined$viewModels$default$6
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$special$$inlined$viewModels$default$7
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
                Function0 function06 = Function0.this;
                if (function06 != null && (creationExtras = (CreationExtras) function06.invoke()) != null) {
                    return creationExtras;
                }
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function05);
    }
}
