package com.blackhub.bronline.game.gui.tuning.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.TuningFragmentTypeListBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.gui.tuning.TuningConstants;
import com.blackhub.bronline.game.gui.tuning.adapters.TuningTypeAdapter;
import com.blackhub.bronline.game.gui.tuning.data.TuneGuiNodeObj;
import com.blackhub.bronline.game.gui.tuning.data.TuneGuiScreenObj;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningViewCarViewModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UILayoutTuningMain.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\b\u0010!\u001a\u00020\u0002H\u0016J\b\u0010\"\u001a\u00020\u001eH\u0002J\b\u0010#\u001a\u00020\u001eH\u0002J\b\u0010$\u001a\u00020\u001eH\u0002J\b\u0010%\u001a\u00020\u001eH\u0002J\b\u0010&\u001a\u00020\u001eH\u0016J\b\u0010'\u001a\u00020\u001eH\u0016J\b\u0010(\u001a\u00020\u001eH\u0002J\b\u0010)\u001a\u00020\u001eH\u0002J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001a\u0010\u001b¨\u0006-"}, d2 = {"Lcom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningMain;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/TuningFragmentTypeListBinding;", "()V", "carId", "", "clickListenerSubmenu", "Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningTypeAdapter$OnClickTuningType;", "detailsListViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningDetailsListViewModel;", "getDetailsListViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningDetailsListViewModel;", "detailsListViewModel$delegate", "Lkotlin/Lazy;", "mainButtons", "", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneGuiNodeObj;", "tuningViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningMainViewModel;", "getTuningViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningMainViewModel;", "tuningViewModel$delegate", "typeAdapter", "Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningTypeAdapter;", "viewCarViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningViewCarViewModel;", "getViewCarViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningViewCarViewModel;", "viewCarViewModel$delegate", "getStartData", "", "jsonString", "", "getViewBinding", "initClickListenerSubmenu", "initListeners", "initMainButtons", "initMainSectionsAndAttachToView", "initViews", "onDestroyView", "setNullableParameters", "setObservers", "setVisibleMainView", "isVisible", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUILayoutTuningMain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UILayoutTuningMain.kt\ncom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningMain\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,148:1\n106#2,15:149\n106#2,15:164\n106#2,15:179\n*S KotlinDebug\n*F\n+ 1 UILayoutTuningMain.kt\ncom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningMain\n*L\n32#1:149,15\n33#1:164,15\n34#1:179,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UILayoutTuningMain extends BaseFragment<TuningFragmentTypeListBinding> {
    public static final int $stable = 8;
    public int carId;

    @Nullable
    public TuningTypeAdapter.OnClickTuningType clickListenerSubmenu;

    /* renamed from: detailsListViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy detailsListViewModel;

    @NotNull
    public final List<TuneGuiNodeObj> mainButtons;

    /* renamed from: tuningViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy tuningViewModel;

    @Nullable
    public TuningTypeAdapter typeAdapter;

    /* renamed from: viewCarViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewCarViewModel;

    public UILayoutTuningMain() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningMain$tuningViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UILayoutTuningMain.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningMain$special$$inlined$viewModels$default$1
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
        this.tuningViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningMain$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningMain$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningMain$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function03 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningMain$detailsListViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UILayoutTuningMain.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningMain$special$$inlined$viewModels$default$5
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
        this.detailsListViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningDetailsListViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningMain$special$$inlined$viewModels$default$6
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningMain$special$$inlined$viewModels$default$7
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningMain$special$$inlined$viewModels$default$8
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
        final Function0<ViewModelStoreOwner> function04 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningMain$viewCarViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UILayoutTuningMain.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy3 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningMain$special$$inlined$viewModels$default$9
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
        this.viewCarViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningViewCarViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningMain$special$$inlined$viewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningMain$special$$inlined$viewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningMain$special$$inlined$viewModels$default$12
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
        this.mainButtons = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TuningMainViewModel getTuningViewModel() {
        return (TuningMainViewModel) this.tuningViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TuningDetailsListViewModel getDetailsListViewModel() {
        return (TuningDetailsListViewModel) this.detailsListViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TuningViewCarViewModel getViewCarViewModel() {
        return (TuningViewCarViewModel) this.viewCarViewModel.getValue();
    }

    private final void getStartData(String jsonString) {
        if (jsonString != null) {
            try {
                this.carId = new JSONObject(jsonString).optInt(TuningConstants.CAR_ID_JSON);
            } catch (JSONException e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public TuningFragmentTypeListBinding getViewBinding() {
        TuningFragmentTypeListBinding inflate = TuningFragmentTypeListBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        Bundle arguments = getArguments();
        getStartData(arguments != null ? arguments.getString(TuningConstants.JSON_OBJECT) : null);
        setObservers();
        initMainSectionsAndAttachToView();
        initListeners();
    }

    private final void setObservers() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutTuningMain$setObservers$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutTuningMain$setObservers$2(this, null), 3, null);
    }

    public final void setVisibleMainView(boolean isVisible) {
        RelativeLayout root = getBinding().getRoot();
        if (isVisible) {
            root.setVisibility(0);
            getBinding().buttonViewCarType.setEnabled(true);
            root.bringToFront();
            return;
        }
        root.setVisibility(4);
    }

    public final void initMainSectionsAndAttachToView() {
        initClickListenerSubmenu();
        initMainButtons();
        this.typeAdapter = new TuningTypeAdapter(this.mainButtons, this.clickListenerSubmenu);
        RecyclerView recyclerView = getBinding().recvTypeTuningList;
        recyclerView.setLayoutManager(new LinearLayoutManager(getBinding().getRoot().getContext(), 0, false));
        recyclerView.setAdapter(this.typeAdapter);
    }

    public final void initClickListenerSubmenu() {
        this.clickListenerSubmenu = new TuningTypeAdapter.OnClickTuningType() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningMain$initClickListenerSubmenu$1
            @Override // com.blackhub.bronline.game.gui.tuning.adapters.TuningTypeAdapter.OnClickTuningType
            public void click(@NotNull TuneGuiNodeObj tuningType, int getPosition, @Nullable View view) {
                TuningMainViewModel tuningViewModel;
                TuningDetailsListViewModel detailsListViewModel;
                int i;
                Intrinsics.checkNotNullParameter(tuningType, "tuningType");
                if (tuningType.getOpensType() == 0) {
                    detailsListViewModel = UILayoutTuningMain.this.getDetailsListViewModel();
                    i = UILayoutTuningMain.this.carId;
                    detailsListViewModel.setAllSelectors(tuningType, i);
                } else {
                    tuningViewModel = UILayoutTuningMain.this.getTuningViewModel();
                    tuningViewModel.setCurrentLayout(12);
                }
            }
        };
    }

    public final void initMainButtons() {
        TuningConstants tuningConstants = TuningConstants.INSTANCE;
        if (tuningConstants.getCurrentActiveScreen() != null) {
            TuneGuiScreenObj currentActiveScreen = tuningConstants.getCurrentActiveScreen();
            Intrinsics.checkNotNull(currentActiveScreen);
            Iterator<TuneGuiNodeObj> it = currentActiveScreen.getFooter().iterator();
            while (it.hasNext()) {
                TuneGuiNodeObj next = it.next();
                List<TuneGuiNodeObj> list = this.mainButtons;
                Intrinsics.checkNotNull(next);
                list.add(next);
            }
        }
    }

    private final void initListeners() {
        AppCompatButton buttonViewCarType = getBinding().buttonViewCarType;
        Intrinsics.checkNotNullExpressionValue(buttonViewCarType, "buttonViewCarType");
        setOnClickListenerWithAnimAndDelay(buttonViewCarType, 500L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningMain$initListeners$1
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
                tuningViewModel = UILayoutTuningMain.this.getTuningViewModel();
                tuningViewModel.setCurrentLayout(1);
                tuningViewModel2 = UILayoutTuningMain.this.getTuningViewModel();
                tuningViewModel2.isViewFromMainMenu(true);
            }
        });
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        setNullableParameters();
        super.onDestroyView();
    }

    private final void setNullableParameters() {
        this.typeAdapter = null;
        this.clickListenerSubmenu = null;
    }
}
