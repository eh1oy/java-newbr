package com.blackhub.bronline.game.gui.tuning.ui;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.TuningFragmentDiagnosticsBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.TimeChecker;
import com.blackhub.bronline.game.gui.tuning.adapters.TuningDetailsInDiagnosticAdapter;
import com.blackhub.bronline.game.gui.tuning.data.TuningDetailDiagnosticItemObj;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel;
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

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UILayoutTuningDiagnostics.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J\b\u0010#\u001a\u00020!H\u0002J\b\u0010$\u001a\u00020\u0002H\u0016J\b\u0010%\u001a\u00020!H\u0002J\b\u0010&\u001a\u00020!H\u0002J\b\u0010'\u001a\u00020!H\u0002J\b\u0010(\u001a\u00020!H\u0002J\b\u0010)\u001a\u00020!H\u0002J\b\u0010*\u001a\u00020!H\u0002J\b\u0010+\u001a\u00020!H\u0016J\b\u0010,\u001a\u00020!H\u0016J\b\u0010-\u001a\u00020!H\u0002J\b\u0010.\u001a\u00020!H\u0003J\u0010\u0010/\u001a\u00020!2\u0006\u00100\u001a\u00020\u0007H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001d\u0010\u001e¨\u00061"}, d2 = {"Lcom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningDiagnostics;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/TuningFragmentDiagnosticsBinding;", "()V", "clickDetailInDiagnosticItem", "Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningDetailsInDiagnosticAdapter$OnClickDetailInDiagnosticItem;", "costDiagnostic", "", "detailsAdapter", "Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningDetailsInDiagnosticAdapter;", "detailsCost", "diagnosticViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningDiagnosticViewModel;", "getDiagnosticViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningDiagnosticViewModel;", "diagnosticViewModel$delegate", "Lkotlin/Lazy;", "ifInitItems", "", "params", "Landroid/widget/RelativeLayout$LayoutParams;", "repairDetailId", "statusDiagnostics", "timeChecker", "Lcom/blackhub/bronline/game/common/TimeChecker;", "tuningDialogApply", "Lcom/blackhub/bronline/game/gui/tuning/ui/TuningDialogApply;", "tuningViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningMainViewModel;", "getTuningViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningMainViewModel;", "tuningViewModel$delegate", "buyDetail", "", "changeViewButton", "closeDialogs", "getViewBinding", "initDetailsAndAttachToView", "initDialogApply", "initDialogApplyClickListener", "initListeners", "initObjects", "initOnClickDetailInDiagnosticItem", "initViews", "onDestroyView", "setNullableParameters", "setObservers", "setStatusOfDiagnostic", "status", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUILayoutTuningDiagnostics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UILayoutTuningDiagnostics.kt\ncom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningDiagnostics\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,254:1\n106#2,15:255\n106#2,15:270\n*S KotlinDebug\n*F\n+ 1 UILayoutTuningDiagnostics.kt\ncom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningDiagnostics\n*L\n34#1:255,15\n35#1:270,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UILayoutTuningDiagnostics extends BaseFragment<TuningFragmentDiagnosticsBinding> {
    public static final int $stable = 8;

    @Nullable
    public TuningDetailsInDiagnosticAdapter.OnClickDetailInDiagnosticItem clickDetailInDiagnosticItem;
    public int costDiagnostic;

    @Nullable
    public TuningDetailsInDiagnosticAdapter detailsAdapter;
    public int detailsCost;

    /* renamed from: diagnosticViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy diagnosticViewModel;
    public boolean ifInitItems;

    @Nullable
    public RelativeLayout.LayoutParams params;
    public int repairDetailId;
    public int statusDiagnostics;

    @NotNull
    public final TimeChecker timeChecker;

    @Nullable
    public TuningDialogApply tuningDialogApply;

    /* renamed from: tuningViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy tuningViewModel;

    public UILayoutTuningDiagnostics() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$diagnosticViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UILayoutTuningDiagnostics.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$special$$inlined$viewModels$default$1
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
        this.diagnosticViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningDiagnosticViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function03 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$tuningViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UILayoutTuningDiagnostics.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$special$$inlined$viewModels$default$5
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
        this.tuningViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$special$$inlined$viewModels$default$6
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$special$$inlined$viewModels$default$7
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
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$special$$inlined$viewModels$default$8
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
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = Fragment.this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.timeChecker = new TimeChecker();
        this.statusDiagnostics = -1;
        this.repairDetailId = -1;
        this.ifInitItems = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TuningDiagnosticViewModel getDiagnosticViewModel() {
        return (TuningDiagnosticViewModel) this.diagnosticViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TuningMainViewModel getTuningViewModel() {
        return (TuningMainViewModel) this.tuningViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public TuningFragmentDiagnosticsBinding getViewBinding() {
        TuningFragmentDiagnosticsBinding inflate = TuningFragmentDiagnosticsBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        initObjects();
        setObservers();
        initDetailsAndAttachToView();
        initListeners();
    }

    private final void initObjects() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        this.params = layoutParams;
        layoutParams.addRule(19, R.id.help_view_in_diagnostic);
        layoutParams.addRule(8, R.id.help_view_in_diagnostic);
        initDialogApply();
    }

    private final void initDialogApply() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        this.tuningDialogApply = new TuningDialogApply(requireActivity);
        initDialogApplyClickListener();
    }

    private final void initDialogApplyClickListener() {
        TuningDialogApply tuningDialogApply = this.tuningDialogApply;
        if (tuningDialogApply == null) {
            return;
        }
        tuningDialogApply.setMyClickListener(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$initDialogApplyClickListener$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                TuningDiagnosticViewModel diagnosticViewModel;
                if (z) {
                    UILayoutTuningDiagnostics.this.buyDetail();
                } else {
                    if (z) {
                        return;
                    }
                    diagnosticViewModel = UILayoutTuningDiagnostics.this.getDiagnosticViewModel();
                    diagnosticViewModel.setStatusOfApplyRepair(false);
                }
            }
        });
    }

    public final void buyDetail() {
        int i = this.statusDiagnostics;
        if (i == 0) {
            getDiagnosticViewModel().sendApplyDiagnostic();
        } else {
            if (i != 1) {
                return;
            }
            getDiagnosticViewModel().sendRepairDetailForBuy(this.repairDetailId);
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private final void setObservers() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new UILayoutTuningDiagnostics$setObservers$1(this, null));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2).launchWhenStarted(new UILayoutTuningDiagnostics$setObservers$2(this, null));
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3).launchWhenStarted(new UILayoutTuningDiagnostics$setObservers$3(this, null));
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner4).launchWhenStarted(new UILayoutTuningDiagnostics$setObservers$4(this, null));
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner5).launchWhenStarted(new UILayoutTuningDiagnostics$setObservers$5(this, null));
    }

    public final void changeViewButton(int statusDiagnostics) {
        Drawable drawable;
        int i;
        if (statusDiagnostics == 0) {
            drawable = ContextCompat.getDrawable(requireActivity(), R.drawable.tuning_icon_diagnostics);
            i = R.string.common_diagnostic;
        } else {
            drawable = ContextCompat.getDrawable(requireActivity(), R.drawable.tuning_repair);
            i = R.string.tuning_submenu_button_repeat;
        }
        AppCompatButton appCompatButton = getBinding().tuningDiagnostics;
        appCompatButton.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        appCompatButton.setText(i);
    }

    public final void setStatusOfDiagnostic(int status) {
        Drawable drawable;
        int i;
        if (status == 0) {
            drawable = ContextCompat.getDrawable(requireActivity(), R.drawable.tuning_bg_not_actual_diagnostics);
            i = R.string.tuning_diagnostic_status_no_actual;
        } else {
            drawable = ContextCompat.getDrawable(requireActivity(), R.drawable.tuning_bg_actual_diagnostics);
            i = R.string.tuning_diagnostic_status_actual;
        }
        TextView textView = getBinding().titleActualDiagnostics;
        textView.setText(i);
        textView.setBackground(drawable);
    }

    public final void initDetailsAndAttachToView() {
        initOnClickDetailInDiagnosticItem();
        this.detailsAdapter = new TuningDetailsInDiagnosticAdapter(this.clickDetailInDiagnosticItem);
        RecyclerView recyclerView = getBinding().recvDetailsListDiagnostics;
        recyclerView.setLayoutManager(new LinearLayoutManager(getBinding().getRoot().getContext(), 0, false));
        recyclerView.setAdapter(this.detailsAdapter);
    }

    public final void initOnClickDetailInDiagnosticItem() {
        this.clickDetailInDiagnosticItem = new TuningDetailsInDiagnosticAdapter.OnClickDetailInDiagnosticItem() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$initOnClickDetailInDiagnosticItem$1
            @Override // com.blackhub.bronline.game.gui.tuning.adapters.TuningDetailsInDiagnosticAdapter.OnClickDetailInDiagnosticItem
            public void clickInDiagnostic(@NotNull TuningDetailDiagnosticItemObj detailsItem, int getPosition, @Nullable View view) {
                TimeChecker timeChecker;
                TuningDetailsInDiagnosticAdapter tuningDetailsInDiagnosticAdapter;
                Intrinsics.checkNotNullParameter(detailsItem, "detailsItem");
                timeChecker = UILayoutTuningDiagnostics.this.timeChecker;
                if (timeChecker.ifAccess(250L)) {
                    detailsItem.setChecked(true);
                    tuningDetailsInDiagnosticAdapter = UILayoutTuningDiagnostics.this.detailsAdapter;
                    if (tuningDetailsInDiagnosticAdapter != null) {
                        tuningDetailsInDiagnosticAdapter.notifyItemChanged(getPosition);
                        tuningDetailsInDiagnosticAdapter.setOnlyItemClickable(getPosition);
                    }
                    UILayoutTuningDiagnostics.this.detailsCost = detailsItem.getCost();
                    UILayoutTuningDiagnostics.this.repairDetailId = detailsItem.getId();
                }
            }
        };
    }

    private final void initListeners() {
        AppCompatButton tuningDiagnostics = getBinding().tuningDiagnostics;
        Intrinsics.checkNotNullExpressionValue(tuningDiagnostics, "tuningDiagnostics");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, tuningDiagnostics, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$initListeners$1
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
                int i;
                int i2;
                int i3;
                TuningDiagnosticViewModel diagnosticViewModel;
                int i4;
                TuningDialogApply tuningDialogApply;
                int i5;
                i = UILayoutTuningDiagnostics.this.statusDiagnostics;
                if (i == 0) {
                    tuningDialogApply = UILayoutTuningDiagnostics.this.tuningDialogApply;
                    if (tuningDialogApply != null) {
                        i5 = UILayoutTuningDiagnostics.this.costDiagnostic;
                        tuningDialogApply.showDialogApply(2, i5, 0);
                        return;
                    }
                    return;
                }
                i2 = UILayoutTuningDiagnostics.this.statusDiagnostics;
                if (i2 == 1) {
                    i3 = UILayoutTuningDiagnostics.this.detailsCost;
                    if (i3 != 0) {
                        diagnosticViewModel = UILayoutTuningDiagnostics.this.getDiagnosticViewModel();
                        i4 = UILayoutTuningDiagnostics.this.repairDetailId;
                        diagnosticViewModel.sendRepairDetailForCheck(i4);
                    }
                }
            }
        }, 1, null);
        AppCompatButton backToSubmenuDiagnostics = getBinding().backToSubmenuDiagnostics;
        Intrinsics.checkNotNullExpressionValue(backToSubmenuDiagnostics, "backToSubmenuDiagnostics");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, backToSubmenuDiagnostics, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$initListeners$2
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
                TuningMainViewModel tuningViewModel;
                tuningViewModel = UILayoutTuningDiagnostics.this.getTuningViewModel();
                tuningViewModel.setCurrentLayout(2);
            }
        }, 1, null);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        closeDialogs();
        setNullableParameters();
        super.onDestroyView();
    }

    private final void closeDialogs() {
        TuningDialogApply tuningDialogApply = this.tuningDialogApply;
        if (tuningDialogApply != null) {
            tuningDialogApply.closeDialog();
        }
    }

    private final void setNullableParameters() {
        this.detailsAdapter = null;
        this.params = null;
        this.clickDetailInDiagnosticItem = null;
        this.tuningDialogApply = null;
    }
}
