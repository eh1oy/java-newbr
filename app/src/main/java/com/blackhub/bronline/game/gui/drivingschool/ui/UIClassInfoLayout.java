package com.blackhub.bronline.game.gui.drivingschool.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.Display;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.widget.NestedScrollView;
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
import com.blackhub.bronline.databinding.DrivingSchoolClassInfoLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.gui.CustomTypefaceSpanTextStyleBold;
import com.blackhub.bronline.game.gui.drivingschool.adapters.DrivingSchoolInfoSignAdapter;
import com.blackhub.bronline.game.gui.drivingschool.adapters.DrivingSchoolRadialMenuInfoAdapter;
import com.blackhub.bronline.game.gui.drivingschool.data.DrivingMainType;
import com.blackhub.bronline.game.gui.drivingschool.data.SignObj;
import com.blackhub.bronline.game.gui.drivingschool.utils.DrivingSchoolCategoriesKt;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolClassInfoViewModel;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolViewModel;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UIClassInfoLayout.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0016J\u0010\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010'\u001a\u00020!H\u0016J\b\u0010(\u001a\u00020!H\u0002J\b\u0010)\u001a\u00020!H\u0002J\u0010\u0010*\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010+\u001a\u00020!2\u0006\u0010$\u001a\u00020,H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/blackhub/bronline/game/gui/drivingschool/ui/UIClassInfoLayout;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/DrivingSchoolClassInfoLayoutBinding;", "()V", "classInfoViewModel", "Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolClassInfoViewModel;", "getClassInfoViewModel", "()Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolClassInfoViewModel;", "classInfoViewModel$delegate", "Lkotlin/Lazy;", "fragmentContext", "Landroid/content/Context;", "getFragmentContext", "()Landroid/content/Context;", "fragmentContext$delegate", "ifStartTest", "", "mainActivity", "Landroidx/fragment/app/FragmentActivity;", "getMainActivity", "()Landroidx/fragment/app/FragmentActivity;", "mainActivity$delegate", "mainViewModel", "Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolViewModel;", "getMainViewModel", "()Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolViewModel;", "mainViewModel$delegate", "radialMenuAdapter", "Lcom/blackhub/bronline/game/gui/drivingschool/adapters/DrivingSchoolRadialMenuInfoAdapter;", "signAdapter", "Lcom/blackhub/bronline/game/gui/drivingschool/adapters/DrivingSchoolInfoSignAdapter;", "getViewBinding", "initClickListeners", "", "initViews", "initialRadialMenuRecyclerView", "currentCategory", "", "initialSignRecyclerView", "onDestroyView", "setNullableParameters", "setObservers", "setSpannable", "setStartView", "Lcom/blackhub/bronline/game/gui/drivingschool/data/DrivingMainType;", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUIClassInfoLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIClassInfoLayout.kt\ncom/blackhub/bronline/game/gui/drivingschool/ui/UIClassInfoLayout\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,198:1\n106#2,15:199\n106#2,15:214\n*S KotlinDebug\n*F\n+ 1 UIClassInfoLayout.kt\ncom/blackhub/bronline/game/gui/drivingschool/ui/UIClassInfoLayout\n*L\n41#1:199,15\n42#1:214,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UIClassInfoLayout extends BaseFragment<DrivingSchoolClassInfoLayoutBinding> {
    public static final int $stable = 8;

    /* renamed from: classInfoViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy classInfoViewModel;

    /* renamed from: fragmentContext$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy fragmentContext;
    public boolean ifStartTest;

    /* renamed from: mainActivity$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainActivity;

    /* renamed from: mainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainViewModel;

    @Nullable
    public DrivingSchoolRadialMenuInfoAdapter radialMenuAdapter;

    @Nullable
    public DrivingSchoolInfoSignAdapter signAdapter;

    public UIClassInfoLayout() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIClassInfoLayout$mainViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UIClassInfoLayout.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIClassInfoLayout$special$$inlined$viewModels$default$1
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
        this.mainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DrivingSchoolViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIClassInfoLayout$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIClassInfoLayout$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIClassInfoLayout$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function03 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIClassInfoLayout$classInfoViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UIClassInfoLayout.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIClassInfoLayout$special$$inlined$viewModels$default$5
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
        this.classInfoViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DrivingSchoolClassInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIClassInfoLayout$special$$inlined$viewModels$default$6
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIClassInfoLayout$special$$inlined$viewModels$default$7
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIClassInfoLayout$special$$inlined$viewModels$default$8
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
        this.mainActivity = LazyKt__LazyJVMKt.lazy(new Function0<FragmentActivity>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIClassInfoLayout$mainActivity$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FragmentActivity invoke() {
                return UIClassInfoLayout.this.requireActivity();
            }
        });
        this.fragmentContext = LazyKt__LazyJVMKt.lazy(new Function0<Context>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIClassInfoLayout$fragmentContext$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Context invoke() {
                return UIClassInfoLayout.this.requireContext();
            }
        });
    }

    public final DrivingSchoolViewModel getMainViewModel() {
        return (DrivingSchoolViewModel) this.mainViewModel.getValue();
    }

    public final DrivingSchoolClassInfoViewModel getClassInfoViewModel() {
        return (DrivingSchoolClassInfoViewModel) this.classInfoViewModel.getValue();
    }

    public final FragmentActivity getMainActivity() {
        return (FragmentActivity) this.mainActivity.getValue();
    }

    private final Context getFragmentContext() {
        return (Context) this.fragmentContext.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        setObservers();
        initClickListeners();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public DrivingSchoolClassInfoLayoutBinding getViewBinding() {
        DrivingSchoolClassInfoLayoutBinding inflate = DrivingSchoolClassInfoLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    private final void setObservers() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new UIClassInfoLayout$setObservers$1(this, null));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2).launchWhenStarted(new UIClassInfoLayout$setObservers$2(this, null));
    }

    public final void setStartView(DrivingMainType currentCategory) {
        getBinding().typeTutorInfoTitle.setText(currentCategory.getName());
        initialRadialMenuRecyclerView(currentCategory.getId());
        initialSignRecyclerView(currentCategory.getId());
        setSpannable(currentCategory.getId());
    }

    public final void initialRadialMenuRecyclerView(int currentCategory) {
        DrivingSchoolRadialMenuInfoAdapter drivingSchoolRadialMenuInfoAdapter;
        if (currentCategory == 0 || currentCategory == 1 || currentCategory == 2 || currentCategory == 3) {
            List<SignObj> radialMenuInfoCategoriesABCD = DrivingSchoolCategoriesKt.getRadialMenuInfoCategoriesABCD();
            Context fragmentContext = getFragmentContext();
            Intrinsics.checkNotNullExpressionValue(fragmentContext, "<get-fragmentContext>(...)");
            drivingSchoolRadialMenuInfoAdapter = new DrivingSchoolRadialMenuInfoAdapter(radialMenuInfoCategoriesABCD, fragmentContext);
        } else if (currentCategory != 4) {
            drivingSchoolRadialMenuInfoAdapter = null;
        } else {
            List<SignObj> radialMenuInfoCategoriesShip = DrivingSchoolCategoriesKt.getRadialMenuInfoCategoriesShip();
            Context fragmentContext2 = getFragmentContext();
            Intrinsics.checkNotNullExpressionValue(fragmentContext2, "<get-fragmentContext>(...)");
            drivingSchoolRadialMenuInfoAdapter = new DrivingSchoolRadialMenuInfoAdapter(radialMenuInfoCategoriesShip, fragmentContext2);
        }
        this.radialMenuAdapter = drivingSchoolRadialMenuInfoAdapter;
        RecyclerView recyclerView = getBinding().radialMenuItems;
        recyclerView.setLayoutManager(new LinearLayoutManager(getBinding().getRoot().getContext(), 1, false));
        recyclerView.setAdapter(this.radialMenuAdapter);
    }

    public final void initialSignRecyclerView(int currentCategory) {
        DrivingSchoolInfoSignAdapter drivingSchoolInfoSignAdapter;
        if (currentCategory == 0 || currentCategory == 1) {
            List<SignObj> roadSignsCategoriesAB = DrivingSchoolCategoriesKt.getRoadSignsCategoriesAB();
            Context fragmentContext = getFragmentContext();
            Intrinsics.checkNotNullExpressionValue(fragmentContext, "<get-fragmentContext>(...)");
            drivingSchoolInfoSignAdapter = new DrivingSchoolInfoSignAdapter(roadSignsCategoriesAB, fragmentContext);
        } else if (currentCategory == 2) {
            List<SignObj> roadSignsCategoriesC = DrivingSchoolCategoriesKt.getRoadSignsCategoriesC();
            Context fragmentContext2 = getFragmentContext();
            Intrinsics.checkNotNullExpressionValue(fragmentContext2, "<get-fragmentContext>(...)");
            drivingSchoolInfoSignAdapter = new DrivingSchoolInfoSignAdapter(roadSignsCategoriesC, fragmentContext2);
        } else if (currentCategory == 3) {
            List<SignObj> roadSignsCategoriesD = DrivingSchoolCategoriesKt.getRoadSignsCategoriesD();
            Context fragmentContext3 = getFragmentContext();
            Intrinsics.checkNotNullExpressionValue(fragmentContext3, "<get-fragmentContext>(...)");
            drivingSchoolInfoSignAdapter = new DrivingSchoolInfoSignAdapter(roadSignsCategoriesD, fragmentContext3);
        } else if (currentCategory != 4) {
            drivingSchoolInfoSignAdapter = null;
        } else {
            List<SignObj> roadSignsCategoriesShip = DrivingSchoolCategoriesKt.getRoadSignsCategoriesShip();
            Context fragmentContext4 = getFragmentContext();
            Intrinsics.checkNotNullExpressionValue(fragmentContext4, "<get-fragmentContext>(...)");
            drivingSchoolInfoSignAdapter = new DrivingSchoolInfoSignAdapter(roadSignsCategoriesShip, fragmentContext4);
        }
        this.signAdapter = drivingSchoolInfoSignAdapter;
        RecyclerView recyclerView = getBinding().signItems;
        recyclerView.setLayoutManager(new LinearLayoutManager(getBinding().getRoot().getContext(), 1, false));
        recyclerView.setAdapter(this.signAdapter);
    }

    public final void setSpannable(int currentCategory) {
        CustomTypefaceSpanTextStyleBold customTypefaceSpanTextStyleBold;
        SpannableString spannableString;
        SpannableString spannableString2 = new SpannableString(getFragmentContext().getString(R.string.driving_school_class_info_title_1));
        Typeface font = ResourcesCompat.getFont(getFragmentContext(), R.font.montserrat_bold);
        if (font != null) {
            Intrinsics.checkNotNull(font);
            customTypefaceSpanTextStyleBold = new CustomTypefaceSpanTextStyleBold("", font);
        } else {
            customTypefaceSpanTextStyleBold = null;
        }
        spannableString2.setSpan(customTypefaceSpanTextStyleBold, 0, spannableString2.length(), 33);
        Unit unit = Unit.INSTANCE;
        CharSequence concat = TextUtils.concat(spannableString2, getFragmentContext().getString(R.string.driving_school_class_info_title_2));
        if (currentCategory == 4) {
            spannableString = new SpannableString(getFragmentContext().getString(R.string.driving_school_class_info_for_ship));
        } else {
            spannableString = new SpannableString(getFragmentContext().getString(R.string.driving_school_class_info_for_car));
        }
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getFragmentContext(), R.color.light_green)), 0, spannableString.length(), 33);
        CharSequence concat2 = TextUtils.concat(getFragmentContext().getString(R.string.driving_school_class_info_sing), spannableString);
        DrivingSchoolClassInfoLayoutBinding binding = getBinding();
        binding.radialTextInfo1.setText(concat);
        binding.titleTrafficSigns.setText(concat2);
    }

    private final void initClickListeners() {
        AppCompatButton buttonStartPracticeOnSchool = getBinding().buttonStartPracticeOnSchool;
        Intrinsics.checkNotNullExpressionValue(buttonStartPracticeOnSchool, "buttonStartPracticeOnSchool");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonStartPracticeOnSchool, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIClassInfoLayout$initClickListeners$1
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
                boolean z;
                DrivingSchoolViewModel mainViewModel;
                z = UIClassInfoLayout.this.ifStartTest;
                if (z) {
                    return;
                }
                mainViewModel = UIClassInfoLayout.this.getMainViewModel();
                mainViewModel.pressButton(2);
                UIClassInfoLayout.this.ifStartTest = true;
            }
        }, 1, null);
        Display defaultDisplay = getMainActivity().getWindowManager().getDefaultDisplay();
        Intrinsics.checkNotNullExpressionValue(defaultDisplay, "getDefaultDisplay(...)");
        final int height = defaultDisplay.getHeight() / 3;
        getBinding().rootNestedScroll.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIClassInfoLayout$$ExternalSyntheticLambda0
            @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
            public final void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                UIClassInfoLayout.initClickListeners$lambda$7(UIClassInfoLayout.this, height, nestedScrollView, i, i2, i3, i4);
            }
        });
    }

    public static final void initClickListeners$lambda$7(UIClassInfoLayout this$0, int i, NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(nestedScrollView, "<anonymous parameter 0>");
        if (this$0.getBinding().iconScroll.getVisibility() == 0 && i3 > i) {
            this$0.getBinding().iconScroll.setVisibility(4);
        } else {
            if (this$0.getBinding().iconScroll.getVisibility() != 4 || i3 >= i) {
                return;
            }
            this$0.getBinding().iconScroll.setVisibility(0);
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getClassInfoViewModel().clearInfoAboutCategory();
        setNullableParameters();
        super.onDestroyView();
    }

    private final void setNullableParameters() {
        this.signAdapter = null;
        this.radialMenuAdapter = null;
    }
}
