package com.blackhub.bronline.game.gui.drivingschool.ui;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.DrivingSchoolMainLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.drivingschool.adapters.DrivingSchoolMainTypeAdapter;
import com.blackhub.bronline.game.gui.drivingschool.data.DrivingMainType;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolClassInfoViewModel;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolMainViewModel;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolViewModel;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UIMainLayout.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0002H\u0016J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020\u001cH\u0016J\b\u0010!\u001a\u00020\u001cH\u0016J\b\u0010\"\u001a\u00020\u001cH\u0002J\b\u0010#\u001a\u00020\u001cH\u0002J\b\u0010$\u001a\u00020\u001cH\u0002J\b\u0010%\u001a\u00020\u001cH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/blackhub/bronline/game/gui/drivingschool/ui/UIMainLayout;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/DrivingSchoolMainLayoutBinding;", "()V", "classInfoViewModel", "Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolClassInfoViewModel;", "getClassInfoViewModel", "()Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolClassInfoViewModel;", "classInfoViewModel$delegate", "Lkotlin/Lazy;", "counter", "", "", "currentCategory", "Lcom/blackhub/bronline/game/gui/drivingschool/data/DrivingMainType;", "currentViewModel", "Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolMainViewModel;", "getCurrentViewModel", "()Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolMainViewModel;", "currentViewModel$delegate", "mainViewModel", "Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolViewModel;", "getMainViewModel", "()Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolViewModel;", "mainViewModel$delegate", "typeSchoolsAdapter", "Lcom/blackhub/bronline/game/gui/drivingschool/adapters/DrivingSchoolMainTypeAdapter;", "clearCounter", "", "getViewBinding", "initClickListeners", "initDriverLicenseType", "initViews", "onDestroyView", "setBackground", "setLogicForItemsClick", "setNullableParameters", "setObservers", "Companion", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUIMainLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIMainLayout.kt\ncom/blackhub/bronline/game/gui/drivingschool/ui/UIMainLayout\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,146:1\n106#2,15:147\n106#2,15:162\n106#2,15:177\n*S KotlinDebug\n*F\n+ 1 UIMainLayout.kt\ncom/blackhub/bronline/game/gui/drivingschool/ui/UIMainLayout\n*L\n23#1:147,15\n24#1:162,15\n25#1:177,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UIMainLayout extends BaseFragment<DrivingSchoolMainLayoutBinding> {
    public static final int DEFAULT_COUNTER = 0;
    public static final int IF_CHECKED = 1;
    public static final int IF_STOP = 2;

    /* renamed from: classInfoViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy classInfoViewModel;

    @NotNull
    public List<Integer> counter;

    @Nullable
    public DrivingMainType currentCategory;

    /* renamed from: currentViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy currentViewModel;

    /* renamed from: mainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainViewModel;

    @Nullable
    public DrivingSchoolMainTypeAdapter typeSchoolsAdapter;
    public static final int $stable = 8;

    public UIMainLayout() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$currentViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UIMainLayout.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$special$$inlined$viewModels$default$1
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
        this.currentViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DrivingSchoolMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function03 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$mainViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UIMainLayout.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$special$$inlined$viewModels$default$5
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
        this.mainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DrivingSchoolViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$special$$inlined$viewModels$default$6
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$special$$inlined$viewModels$default$7
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$special$$inlined$viewModels$default$8
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
        final Function0<ViewModelStoreOwner> function04 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$classInfoViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UIMainLayout.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy3 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$special$$inlined$viewModels$default$9
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
        this.classInfoViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DrivingSchoolClassInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$special$$inlined$viewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$special$$inlined$viewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$special$$inlined$viewModels$default$12
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
        this.counter = CollectionsKt__CollectionsKt.mutableListOf(-1, 0);
    }

    public final DrivingSchoolMainViewModel getCurrentViewModel() {
        return (DrivingSchoolMainViewModel) this.currentViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DrivingSchoolViewModel getMainViewModel() {
        return (DrivingSchoolViewModel) this.mainViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DrivingSchoolClassInfoViewModel getClassInfoViewModel() {
        return (DrivingSchoolClassInfoViewModel) this.classInfoViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public DrivingSchoolMainLayoutBinding getViewBinding() {
        DrivingSchoolMainLayoutBinding inflate = DrivingSchoolMainLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        setBackground();
        initDriverLicenseType();
        setObservers();
        initClickListeners();
    }

    public final void setBackground() {
        TextView textView = getBinding().text2;
        Useful useful = Useful.INSTANCE;
        String string = requireActivity().getString(R.string.driving_school_class_info_main_title_1);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        textView.setText(useful.getTextWithHtmlStyles(string));
        TextView textView2 = getBinding().text3;
        String string2 = requireActivity().getString(R.string.driving_school_class_info_main_subtitle_1);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        textView2.setText(useful.getTextWithHtmlStyles(string2));
    }

    public final void initDriverLicenseType() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        this.typeSchoolsAdapter = new DrivingSchoolMainTypeAdapter(requireActivity);
        setLogicForItemsClick();
        RecyclerView recyclerView = getBinding().blockWitchTypeSchools;
        recyclerView.setLayoutManager(new GridLayoutManager(getBinding().getRoot().getContext(), 2, 1, false));
        recyclerView.setAdapter(this.typeSchoolsAdapter);
    }

    public final void setLogicForItemsClick() {
        DrivingSchoolMainTypeAdapter drivingSchoolMainTypeAdapter = this.typeSchoolsAdapter;
        if (drivingSchoolMainTypeAdapter == null) {
            return;
        }
        drivingSchoolMainTypeAdapter.setMainTypeSchoolClickListener(new Function3<DrivingMainType, Integer, View, Unit>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$setLogicForItemsClick$1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(DrivingMainType drivingMainType, Integer num, View view) {
                invoke(drivingMainType, num.intValue(), view);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final DrivingMainType item, final int i, @NotNull View view) {
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(view, "view");
                final UIMainLayout uIMainLayout = UIMainLayout.this;
                BaseFragment.startAnimAndDelay$default(uIMainLayout, view, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$setLogicForItemsClick$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        List list;
                        DrivingSchoolClassInfoViewModel classInfoViewModel;
                        DrivingSchoolMainTypeAdapter drivingSchoolMainTypeAdapter2;
                        List list2;
                        List list3;
                        DrivingSchoolMainTypeAdapter drivingSchoolMainTypeAdapter3;
                        List list4;
                        List list5;
                        List list6;
                        List list7;
                        DrivingSchoolViewModel mainViewModel;
                        List list8;
                        list = UIMainLayout.this.counter;
                        if (((Number) list.get(1)).intValue() != 2) {
                            classInfoViewModel = UIMainLayout.this.getClassInfoViewModel();
                            classInfoViewModel.saveCategory(item);
                            DrivingMainType drivingMainType = item;
                            drivingMainType.setCheck(drivingMainType.isUnBlock() == 1);
                            drivingSchoolMainTypeAdapter2 = UIMainLayout.this.typeSchoolsAdapter;
                            if (drivingSchoolMainTypeAdapter2 != null) {
                                drivingSchoolMainTypeAdapter2.setOnlyItemCheck(i);
                            }
                            if (item.isCheck()) {
                                drivingSchoolMainTypeAdapter3 = UIMainLayout.this.typeSchoolsAdapter;
                                if (drivingSchoolMainTypeAdapter3 != null) {
                                    drivingSchoolMainTypeAdapter3.notifyItemChanged(i);
                                }
                                int id = item.getId();
                                list4 = UIMainLayout.this.counter;
                                if (id == ((Number) list4.get(0)).intValue()) {
                                    list7 = UIMainLayout.this.counter;
                                    if (((Number) list7.get(1)).intValue() == 1) {
                                        mainViewModel = UIMainLayout.this.getMainViewModel();
                                        mainViewModel.checkType(item.getId());
                                        list8 = UIMainLayout.this.counter;
                                        list8.set(1, 2);
                                        return;
                                    }
                                }
                                list5 = UIMainLayout.this.counter;
                                list5.set(0, Integer.valueOf(item.getId()));
                                list6 = UIMainLayout.this.counter;
                                list6.set(1, 1);
                                UIMainLayout.this.currentCategory = item;
                                return;
                            }
                            list2 = UIMainLayout.this.counter;
                            list2.set(0, -1);
                            list3 = UIMainLayout.this.counter;
                            list3.set(1, 0);
                            UIMainLayout.this.currentCategory = null;
                        }
                    }
                }, 1, null);
            }
        });
    }

    private final void setObservers() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new UIMainLayout$setObservers$1(this, null));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2).launchWhenStarted(new UIMainLayout$setObservers$2(this, null));
    }

    public final void clearCounter() {
        this.counter.set(0, -1);
        this.counter.set(1, 0);
        this.currentCategory = null;
        DrivingSchoolMainTypeAdapter drivingSchoolMainTypeAdapter = this.typeSchoolsAdapter;
        if (drivingSchoolMainTypeAdapter != null) {
            drivingSchoolMainTypeAdapter.setOnlyItemCheck(-1);
        }
    }

    private final void initClickListeners() {
        AppCompatButton buttonStartCourse = getBinding().buttonStartCourse;
        Intrinsics.checkNotNullExpressionValue(buttonStartCourse, "buttonStartCourse");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonStartCourse, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$initClickListeners$1
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
                List list;
                List list2;
                DrivingMainType drivingMainType;
                DrivingSchoolViewModel mainViewModel;
                List list3;
                List list4;
                DrivingMainType drivingMainType2;
                DrivingSchoolViewModel mainViewModel2;
                list = UIMainLayout.this.counter;
                if (((Number) list.get(0)).intValue() != -1) {
                    list2 = UIMainLayout.this.counter;
                    if (((Number) list2.get(1)).intValue() != 2) {
                        drivingMainType = UIMainLayout.this.currentCategory;
                        if (drivingMainType != null) {
                            drivingMainType2 = UIMainLayout.this.currentCategory;
                            if (drivingMainType2 != null) {
                                mainViewModel2 = UIMainLayout.this.getMainViewModel();
                                mainViewModel2.checkType(drivingMainType2.getId());
                            }
                        } else {
                            mainViewModel = UIMainLayout.this.getMainViewModel();
                            list3 = UIMainLayout.this.counter;
                            mainViewModel.checkType(((Number) list3.get(0)).intValue());
                        }
                        list4 = UIMainLayout.this.counter;
                        list4.set(1, 2);
                    }
                }
            }
        }, 1, null);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        setNullableParameters();
        super.onDestroyView();
    }

    private final void setNullableParameters() {
        this.typeSchoolsAdapter = null;
        this.currentCategory = null;
    }
}
