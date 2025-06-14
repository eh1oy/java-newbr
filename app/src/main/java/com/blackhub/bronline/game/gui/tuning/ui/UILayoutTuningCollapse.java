package com.blackhub.bronline.game.gui.tuning.ui;

import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.TuningFragmentCollapseBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.tuning.TuningConstants;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningCollapseViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningViewCarViewModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
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
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UILayoutTuningCollapse.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001f\u001a\u00020 H\u0002J\u0012\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\b\u0010$\u001a\u00020\u0002H\u0016J\b\u0010%\u001a\u00020 H\u0002J\b\u0010&\u001a\u00020 H\u0002J\u0010\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020\u0005H\u0002J\b\u0010)\u001a\u00020 H\u0002J\b\u0010*\u001a\u00020 H\u0002J\u0010\u0010+\u001a\u00020 2\u0006\u0010(\u001a\u00020\u0005H\u0002J\b\u0010,\u001a\u00020 H\u0016J\b\u0010-\u001a\u00020 H\u0016J\b\u0010.\u001a\u00020 H\u0002J\u0010\u0010/\u001a\u00020 2\u0006\u00100\u001a\u00020\u0005H\u0002J\u0010\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020\u0005H\u0002J\u0010\u00103\u001a\u00020 2\u0006\u00104\u001a\u00020\u0005H\u0002J\u0010\u00105\u001a\u00020 2\u0006\u00106\u001a\u00020\u0005H\u0002J\u0010\u00107\u001a\u00020 2\u0006\u00108\u001a\u00020#H\u0002J\u0010\u00109\u001a\u00020 2\u0006\u0010:\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u001c\u0010\u001d¨\u0006;"}, d2 = {"Lcom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningCollapse;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/TuningFragmentCollapseBinding;", "()V", "collapse", "", "collapseViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningCollapseViewModel;", "getCollapseViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningCollapseViewModel;", "collapseViewModel$delegate", "Lkotlin/Lazy;", "detailsCost", "dialogApply", "Lcom/blackhub/bronline/game/gui/tuning/ui/TuningDialogApply;", "dialogResetDetails", "Lcom/blackhub/bronline/game/gui/tuning/ui/TuningDialogResetDetails;", "ifInitValue", "", "initView", "mActiveSelectorId", "tuningViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningMainViewModel;", "getTuningViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningMainViewModel;", "tuningViewModel$delegate", "viewCarViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningViewCarViewModel;", "getViewCarViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningViewCarViewModel;", "viewCarViewModel$delegate", "closeDialogs", "", "getStartData", "jsonString", "", "getViewBinding", "initDialogApply", "initDialogApplyClickListener", "initDialogReset", "currentSelector", "initListeners", "initObjects", "initResetClickListener", "initViews", "onDestroyView", "setNullableParameters", "setObservers", "currentSelectorId", "setParamsInView", "valueParameter", "setPrice", "currentCost", "setProgressInView", "currentValue", "setTitle", "title", "setVisibleRootView", "isVisible", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUILayoutTuningCollapse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UILayoutTuningCollapse.kt\ncom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningCollapse\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,288:1\n106#2,15:289\n106#2,15:304\n106#2,15:319\n*S KotlinDebug\n*F\n+ 1 UILayoutTuningCollapse.kt\ncom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningCollapse\n*L\n40#1:289,15\n41#1:304,15\n42#1:319,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UILayoutTuningCollapse extends BaseFragment<TuningFragmentCollapseBinding> {
    public static final int $stable = 8;
    public int collapse;

    /* renamed from: collapseViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy collapseViewModel;
    public int detailsCost;

    @Nullable
    public TuningDialogApply dialogApply;

    @Nullable
    public TuningDialogResetDetails dialogResetDetails;
    public boolean ifInitValue;
    public boolean initView;
    public int mActiveSelectorId;

    /* renamed from: tuningViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy tuningViewModel;

    /* renamed from: viewCarViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewCarViewModel;

    public UILayoutTuningCollapse() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$tuningViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UILayoutTuningCollapse.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$special$$inlined$viewModels$default$1
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
        this.tuningViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function03 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$collapseViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UILayoutTuningCollapse.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$special$$inlined$viewModels$default$5
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
        this.collapseViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningCollapseViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$special$$inlined$viewModels$default$6
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$special$$inlined$viewModels$default$7
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$special$$inlined$viewModels$default$8
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
        final Function0<ViewModelStoreOwner> function04 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$viewCarViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UILayoutTuningCollapse.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy3 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$special$$inlined$viewModels$default$9
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
        this.viewCarViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningViewCarViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$special$$inlined$viewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$special$$inlined$viewModels$default$11
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
                Function0 function05 = Function0.this;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$special$$inlined$viewModels$default$12
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
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = Fragment.this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.mActiveSelectorId = -1;
        this.initView = true;
        this.ifInitValue = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TuningMainViewModel getTuningViewModel() {
        return (TuningMainViewModel) this.tuningViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TuningCollapseViewModel getCollapseViewModel() {
        return (TuningCollapseViewModel) this.collapseViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TuningViewCarViewModel getViewCarViewModel() {
        return (TuningViewCarViewModel) this.viewCarViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public TuningFragmentCollapseBinding getViewBinding() {
        TuningFragmentCollapseBinding inflate = TuningFragmentCollapseBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        Bundle arguments = getArguments();
        getStartData(arguments != null ? arguments.getString(TuningConstants.JSON_OBJECT) : null);
        getCollapseViewModel().calculateTheCost(this.mActiveSelectorId);
        initObjects();
        setObservers(this.mActiveSelectorId);
        initListeners();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        closeDialogs();
        setNullableParameters();
        super.onDestroyView();
    }

    public final void getStartData(String jsonString) {
        if (jsonString != null) {
            try {
                JSONObject jSONObject = new JSONObject(jsonString);
                this.mActiveSelectorId = jSONObject.optInt(TuningConstants.SELECTOR_JSON);
                String optString = jSONObject.optString(TuningConstants.TITLE_JSON);
                Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                setTitle(optString);
            } catch (JSONException e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
        }
    }

    public final void setTitle(String title) {
        getBinding().seekbarTitleCollapse.setText(title);
    }

    private final void initObjects() {
        initDialogReset(this.mActiveSelectorId);
        initDialogApply();
    }

    public final void initDialogReset(int currentSelector) {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        this.dialogResetDetails = new TuningDialogResetDetails(requireActivity);
        initResetClickListener(currentSelector);
    }

    public final void initResetClickListener(final int currentSelector) {
        TuningDialogResetDetails tuningDialogResetDetails = this.dialogResetDetails;
        if (tuningDialogResetDetails == null) {
            return;
        }
        tuningDialogResetDetails.setResetClickListener(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$initResetClickListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                TuningMainViewModel tuningViewModel;
                if (z) {
                    UILayoutTuningCollapse.this.initView = true;
                    tuningViewModel = UILayoutTuningCollapse.this.getTuningViewModel();
                    TuningMainViewModel.applyResetDetails$default(tuningViewModel, currentSelector, 0, 2, null);
                }
            }
        });
    }

    public final void initDialogApply() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        this.dialogApply = new TuningDialogApply(requireActivity);
        initDialogApplyClickListener();
    }

    public final void initDialogApplyClickListener() {
        TuningDialogApply tuningDialogApply = this.dialogApply;
        if (tuningDialogApply == null) {
            return;
        }
        tuningDialogApply.setMyClickListener(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$initDialogApplyClickListener$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                TuningCollapseViewModel collapseViewModel;
                int i;
                int i2;
                if (z) {
                    collapseViewModel = UILayoutTuningCollapse.this.getCollapseViewModel();
                    i = UILayoutTuningCollapse.this.collapse;
                    i2 = UILayoutTuningCollapse.this.mActiveSelectorId;
                    collapseViewModel.sendBuyCollapse(i, i2);
                }
            }
        });
    }

    public final void setObservers(int currentSelectorId) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new UILayoutTuningCollapse$setObservers$1(currentSelectorId, this, null));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2).launchWhenStarted(new UILayoutTuningCollapse$setObservers$2(this, null));
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3).launchWhenStarted(new UILayoutTuningCollapse$setObservers$3(this, null));
    }

    public final void setParamsInView(int valueParameter) {
        if (this.initView) {
            this.initView = false;
            getBinding().tuningSeekbarCollapse.setProgress(valueParameter);
            setProgressInView(valueParameter);
        }
    }

    public final void setProgressInView(int currentValue) {
        getBinding().valueThisCorner.setText(requireActivity().getString(R.string.common_value_and_percent, Integer.valueOf(currentValue)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPrice(int currentCost) {
        getBinding().tuningValuePriceCollapse.setText(getBinding().getRoot().getContext().getString(R.string.common_string_with_ruble, UsefulKt.getPriceWithSpaces(Integer.valueOf(currentCost))));
    }

    public final void setVisibleRootView(int isVisible) {
        RelativeLayout root = getBinding().getRoot();
        root.setVisibility(isVisible);
        if (isVisible == 0) {
            root.bringToFront();
        }
    }

    private final void initListeners() {
        ConstraintLayout tuningPriceCollapse = getBinding().tuningPriceCollapse;
        Intrinsics.checkNotNullExpressionValue(tuningPriceCollapse, "tuningPriceCollapse");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, tuningPriceCollapse, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$initListeners$1
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
                TuningDialogApply tuningDialogApply;
                int i;
                tuningDialogApply = UILayoutTuningCollapse.this.dialogApply;
                if (tuningDialogApply != null) {
                    i = UILayoutTuningCollapse.this.detailsCost;
                    tuningDialogApply.showDialogApply(4, i, 0);
                }
            }
        }, 1, null);
        AppCompatButton backToSubmenuCollapse = getBinding().backToSubmenuCollapse;
        Intrinsics.checkNotNullExpressionValue(backToSubmenuCollapse, "backToSubmenuCollapse");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, backToSubmenuCollapse, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$initListeners$2
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
                tuningViewModel = UILayoutTuningCollapse.this.getTuningViewModel();
                tuningViewModel.clearCarStatus();
                tuningViewModel.setCurrentLayout(2);
            }
        }, 1, null);
        AppCompatButton buttonViewCarCollapse = getBinding().buttonViewCarCollapse;
        Intrinsics.checkNotNullExpressionValue(buttonViewCarCollapse, "buttonViewCarCollapse");
        setOnClickListenerWithAnimAndDelay(buttonViewCarCollapse, 500L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$initListeners$3
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
                TuningMainViewModel tuningViewModel2;
                tuningViewModel = UILayoutTuningCollapse.this.getTuningViewModel();
                tuningViewModel.setCurrentLayout(1);
                tuningViewModel2 = UILayoutTuningCollapse.this.getTuningViewModel();
                tuningViewModel2.isViewFromMainMenu(false);
            }
        });
        getBinding().tuningSeekbarCollapse.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$initListeners$4
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(@NotNull SeekBar seekBar) {
                Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(@NotNull SeekBar seekBar, int i, boolean b) {
                int i2;
                boolean z;
                TuningCollapseViewModel collapseViewModel;
                int i3;
                Intrinsics.checkNotNullParameter(seekBar, "seekBar");
                UILayoutTuningCollapse.this.collapse = i;
                UILayoutTuningCollapse uILayoutTuningCollapse = UILayoutTuningCollapse.this;
                i2 = uILayoutTuningCollapse.collapse;
                uILayoutTuningCollapse.setProgressInView(i2);
                z = UILayoutTuningCollapse.this.ifInitValue;
                if (z) {
                    return;
                }
                collapseViewModel = UILayoutTuningCollapse.this.getCollapseViewModel();
                i3 = UILayoutTuningCollapse.this.collapse;
                collapseViewModel.updateParamsForPreview(i3);
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(@NotNull SeekBar seekBar) {
                Intrinsics.checkNotNullParameter(seekBar, "seekBar");
                UILayoutTuningCollapse.this.ifInitValue = false;
            }
        });
        AppCompatButton buttonResetCollapse = getBinding().buttonResetCollapse;
        Intrinsics.checkNotNullExpressionValue(buttonResetCollapse, "buttonResetCollapse");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonResetCollapse, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$initListeners$5
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
                TuningDialogResetDetails tuningDialogResetDetails;
                tuningDialogResetDetails = UILayoutTuningCollapse.this.dialogResetDetails;
                if (tuningDialogResetDetails != null) {
                    tuningDialogResetDetails.showDialogReset();
                }
            }
        }, 1, null);
    }

    private final void closeDialogs() {
        TuningDialogResetDetails tuningDialogResetDetails = this.dialogResetDetails;
        if (tuningDialogResetDetails != null) {
            tuningDialogResetDetails.closeDialogReset();
        }
        TuningDialogApply tuningDialogApply = this.dialogApply;
        if (tuningDialogApply != null) {
            tuningDialogApply.closeDialog();
        }
    }

    private final void setNullableParameters() {
        this.dialogApply = null;
        this.dialogResetDetails = null;
    }
}
