package com.blackhub.bronline.game.gui.tuning.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.TuningFragmentColorListBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.TimeChecker;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.donate.data.CarColorItem;
import com.blackhub.bronline.game.gui.tuning.TuningConstants;
import com.blackhub.bronline.game.gui.tuning.adapters.TuningColorAdapter;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningViewCarViewModel;
import java.util.List;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UILayoutTuningColorsList.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010(\u001a\u00020)H\u0002J\u0012\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010,\u001a\u00020\u0002H\u0016J\b\u0010-\u001a\u00020)H\u0002J\b\u0010.\u001a\u00020)H\u0002J\b\u0010/\u001a\u00020)H\u0002J\u0010\u00100\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u0010\u00101\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u0010\u00102\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u0010\u00103\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\b\u00104\u001a\u00020)H\u0002J\b\u00105\u001a\u00020)H\u0002J\b\u00106\u001a\u00020)H\u0016J\b\u00107\u001a\u00020)H\u0016J\u0010\u00108\u001a\u00020)2\u0006\u0010\n\u001a\u00020\u0005H\u0002J\b\u00109\u001a\u00020)H\u0002J\b\u0010:\u001a\u00020)H\u0002J\u0010\u0010;\u001a\u00020)2\u0006\u0010<\u001a\u00020\u0005H\u0002J\u0010\u0010=\u001a\u00020)2\u0006\u0010>\u001a\u00020\u0005H\u0002J\u001e\u0010?\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020\u00052\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00050AH\u0002J\u0010\u0010B\u001a\u00020)2\u0006\u0010C\u001a\u00020\u0005H\u0002J\u0010\u0010D\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u0010\u0010E\u001a\u00020)2\u0006\u0010C\u001a\u00020\u0005H\u0002J\u0010\u0010F\u001a\u00020)2\u0006\u0010C\u001a\u00020\u0005H\u0002J\u0010\u0010G\u001a\u00020)2\u0006\u0010C\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0010\u001a\u0004\b \u0010!R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0010\u001a\u0004\b%\u0010&¨\u0006H"}, d2 = {"Lcom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningColorsList;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/TuningFragmentColorListBinding;", "()V", "carId", "", "colorAdapter", "Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningColorAdapter;", "colorClickListener", "Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningColorAdapter$OnClickColorItem;", "colorCost", "colorListViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningColorListViewModel;", "getColorListViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningColorListViewModel;", "colorListViewModel$delegate", "Lkotlin/Lazy;", "currentSelector", "currentTitle", "", "dialogResetDetails", "Lcom/blackhub/bronline/game/gui/tuning/ui/TuningDialogResetDetails;", "hexColor", "intValueOfTransparency", "isInitInterface", "", "timeChecker", "Lcom/blackhub/bronline/game/common/TimeChecker;", "tuningDialogApply", "Lcom/blackhub/bronline/game/gui/tuning/ui/TuningDialogApply;", "tuningViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningMainViewModel;", "getTuningViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningMainViewModel;", "tuningViewModel$delegate", "viewCarViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningViewCarViewModel;", "getViewCarViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningViewCarViewModel;", "viewCarViewModel$delegate", "closeDialogs", "", "getStartData", "jsonString", "getViewBinding", "initColorAdapterAndAttachToView", "initColorCLickListener", "initColorListInView", "initDialogApply", "initDialogApplyCLickListener", "initDialogReset", "initDialogResetClickListener", "initListeners", "initObjects", "initViews", "onDestroyView", "setColorCostInView", "setNullableParams", "setObservers", "setTextInViewWithTransparency", "currentValue", "setTransparencyToView", "valueOfTransparency", "setValueOfTransparency", "listWithValueOfTransparency", "", "setVisibleBlockWithSeekbar", "isVisible", "setVisibleBlockWithSeekbarAndResetButton", "setVisiblePriceButton", "setVisibleResetButton", "setVisibleRootView", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUILayoutTuningColorsList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UILayoutTuningColorsList.kt\ncom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningColorsList\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,360:1\n106#2,15:361\n106#2,15:376\n106#2,15:391\n*S KotlinDebug\n*F\n+ 1 UILayoutTuningColorsList.kt\ncom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningColorsList\n*L\n44#1:361,15\n45#1:376,15\n46#1:391,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UILayoutTuningColorsList extends BaseFragment<TuningFragmentColorListBinding> {
    public static final int $stable = 8;
    public int carId;

    @Nullable
    public TuningColorAdapter colorAdapter;

    @Nullable
    public TuningColorAdapter.OnClickColorItem colorClickListener;
    public int colorCost;

    /* renamed from: colorListViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy colorListViewModel;
    public int currentSelector;

    @NotNull
    public String currentTitle;

    @Nullable
    public TuningDialogResetDetails dialogResetDetails;

    @NotNull
    public String hexColor;
    public int intValueOfTransparency;
    public boolean isInitInterface;

    @NotNull
    public final TimeChecker timeChecker;

    @Nullable
    public TuningDialogApply tuningDialogApply;

    /* renamed from: tuningViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy tuningViewModel;

    /* renamed from: viewCarViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewCarViewModel;

    public UILayoutTuningColorsList() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$colorListViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UILayoutTuningColorsList.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$special$$inlined$viewModels$default$1
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
        this.colorListViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningColorListViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function03 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$tuningViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UILayoutTuningColorsList.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$special$$inlined$viewModels$default$5
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
        this.tuningViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$special$$inlined$viewModels$default$6
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$special$$inlined$viewModels$default$7
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$special$$inlined$viewModels$default$8
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
        final Function0<ViewModelStoreOwner> function04 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$viewCarViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UILayoutTuningColorsList.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy3 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$special$$inlined$viewModels$default$9
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
        this.viewCarViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningViewCarViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$special$$inlined$viewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$special$$inlined$viewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$special$$inlined$viewModels$default$12
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
        this.timeChecker = new TimeChecker();
        this.currentSelector = -1;
        this.currentTitle = "";
        this.intValueOfTransparency = -1;
        this.hexColor = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TuningColorListViewModel getColorListViewModel() {
        return (TuningColorListViewModel) this.colorListViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TuningMainViewModel getTuningViewModel() {
        return (TuningMainViewModel) this.tuningViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TuningViewCarViewModel getViewCarViewModel() {
        return (TuningViewCarViewModel) this.viewCarViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public TuningFragmentColorListBinding getViewBinding() {
        TuningFragmentColorListBinding inflate = TuningFragmentColorListBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        Bundle arguments = getArguments();
        getStartData(arguments != null ? arguments.getString(TuningConstants.JSON_OBJECT) : null);
        getColorListViewModel().initInterface(this.currentSelector);
        initObjects();
        setObservers();
        setVisibleBlockWithSeekbarAndResetButton(this.currentSelector);
        initColorListInView();
        initListeners();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        closeDialogs();
        setNullableParams();
        super.onDestroyView();
    }

    private final void getStartData(String jsonString) {
        if (jsonString != null) {
            JSONObject jSONObject = new JSONObject(jsonString);
            this.currentSelector = jSONObject.optInt(TuningConstants.SELECTOR_JSON);
            this.carId = jSONObject.optInt(TuningConstants.CAR_ID_JSON);
            String optString = jSONObject.optString(TuningConstants.TITLE_JSON);
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            this.currentTitle = optString;
        }
    }

    private final void initObjects() {
        initDialogApply(this.currentSelector);
        initDialogReset(this.currentSelector);
    }

    public final void initDialogApply(int currentSelector) {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        this.tuningDialogApply = new TuningDialogApply(requireActivity);
        initDialogApplyCLickListener(currentSelector);
    }

    public final void initDialogApplyCLickListener(final int currentSelector) {
        TuningDialogApply tuningDialogApply = this.tuningDialogApply;
        if (tuningDialogApply == null) {
            return;
        }
        tuningDialogApply.setMyClickListener(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$initDialogApplyCLickListener$1
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
                TuningColorListViewModel colorListViewModel;
                if (z) {
                    colorListViewModel = UILayoutTuningColorsList.this.getColorListViewModel();
                    colorListViewModel.sendApplyBuyReadyColor(currentSelector);
                }
            }
        });
    }

    private final void initDialogReset(int currentSelector) {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        this.dialogResetDetails = new TuningDialogResetDetails(requireActivity);
        initDialogResetClickListener(currentSelector);
    }

    public final void initDialogResetClickListener(final int currentSelector) {
        TuningDialogResetDetails tuningDialogResetDetails = this.dialogResetDetails;
        if (tuningDialogResetDetails == null) {
            return;
        }
        tuningDialogResetDetails.setResetClickListener(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$initDialogResetClickListener$1
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
                    tuningViewModel = UILayoutTuningColorsList.this.getTuningViewModel();
                    TuningMainViewModel.applyResetDetails$default(tuningViewModel, currentSelector, 0, 2, null);
                    tuningViewModel.clearCarStatus();
                }
            }
        });
    }

    private final void setObservers() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutTuningColorsList$setObservers$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutTuningColorsList$setObservers$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutTuningColorsList$setObservers$3(this, null), 3, null);
        int i = this.currentSelector;
        if (i == 3 || i == 4) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutTuningColorsList$setObservers$4(this, null), 3, null);
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutTuningColorsList$setObservers$5(this, null), 3, null);
    }

    public final void setColorCostInView(int colorCost) {
        getBinding().tuningPriceColor.setText(getString(R.string.common_string_with_ruble, UsefulKt.getPriceWithSpaces(Integer.valueOf(colorCost))));
    }

    public final void setVisiblePriceButton(int isVisible) {
        getBinding().titlePriceBlockColor.setVisibility(isVisible);
        getBinding().tuningPriceColor.setVisibility(isVisible);
    }

    public final void setValueOfTransparency(int currentSelector, List<Integer> listWithValueOfTransparency) {
        if (currentSelector == 3) {
            setTransparencyToView(listWithValueOfTransparency.get(2).intValue());
        } else {
            if (currentSelector != 4) {
                return;
            }
            setTransparencyToView(listWithValueOfTransparency.get(3).intValue());
        }
    }

    public final void setTransparencyToView(int valueOfTransparency) {
        getBinding().tuningSeekbarColor.setProgress(valueOfTransparency);
        setTextInViewWithTransparency(valueOfTransparency);
    }

    public final void setTextInViewWithTransparency(int currentValue) {
        getBinding().valueTransparencyColor.setText(requireActivity().getString(R.string.common_value_and_percent, Integer.valueOf(currentValue)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVisibleRootView(int isVisible) {
        RelativeLayout root = getBinding().getRoot();
        root.setVisibility(isVisible);
        if (isVisible == 0) {
            root.bringToFront();
        }
    }

    public final void setVisibleBlockWithSeekbarAndResetButton(int currentSelector) {
        if (currentSelector == 3 || currentSelector == 4) {
            setVisibleBlockWithSeekbar(0);
            setVisibleResetButton(0);
        } else {
            setVisibleBlockWithSeekbar(4);
            setVisibleResetButton(4);
        }
    }

    public final void setVisibleBlockWithSeekbar(int isVisible) {
        getBinding().seekbarViewColor.setVisibility(isVisible);
    }

    public final void setVisibleResetButton(int isVisible) {
        getBinding().buttonResetToningReady.setVisibility(isVisible);
    }

    public final void initColorListInView() {
        initColorCLickListener();
        initColorAdapterAndAttachToView();
    }

    public final void initColorCLickListener() {
        this.colorClickListener = new TuningColorAdapter.OnClickColorItem() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$initColorCLickListener$1
            @Override // com.blackhub.bronline.game.gui.tuning.adapters.TuningColorAdapter.OnClickColorItem
            public void click(@NotNull CarColorItem colorItem, int getPosition, @Nullable View view) {
                TimeChecker timeChecker;
                TuningColorAdapter tuningColorAdapter;
                TuningColorListViewModel colorListViewModel;
                String str;
                int i;
                Intrinsics.checkNotNullParameter(colorItem, "colorItem");
                timeChecker = UILayoutTuningColorsList.this.timeChecker;
                if (timeChecker.ifAccess(250L)) {
                    colorItem.setSelected(true);
                    tuningColorAdapter = UILayoutTuningColorsList.this.colorAdapter;
                    if (tuningColorAdapter != null) {
                        tuningColorAdapter.notifyItemChanged(getPosition);
                        tuningColorAdapter.setOnlyColorClickable(getPosition);
                    }
                    if (colorItem.getStartColor()) {
                        UILayoutTuningColorsList.this.setVisiblePriceButton(4);
                    } else {
                        UILayoutTuningColorsList.this.setVisiblePriceButton(0);
                    }
                    UILayoutTuningColorsList.this.hexColor = colorItem.getColor();
                    colorListViewModel = UILayoutTuningColorsList.this.getColorListViewModel();
                    str = UILayoutTuningColorsList.this.hexColor;
                    i = UILayoutTuningColorsList.this.intValueOfTransparency;
                    colorListViewModel.setColorObjToBuy(str, i);
                }
            }
        };
    }

    public final void initColorAdapterAndAttachToView() {
        this.colorAdapter = new TuningColorAdapter(this.colorClickListener);
        RecyclerView recyclerView = getBinding().recvColorsList;
        recyclerView.setLayoutManager(new LinearLayoutManager(getBinding().getRoot().getContext(), 0, false));
        recyclerView.setAdapter(this.colorAdapter);
    }

    private final void initListeners() {
        AppCompatButton backToSubmenuColor = getBinding().backToSubmenuColor;
        Intrinsics.checkNotNullExpressionValue(backToSubmenuColor, "backToSubmenuColor");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, backToSubmenuColor, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$initListeners$1
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
                tuningViewModel = UILayoutTuningColorsList.this.getTuningViewModel();
                tuningViewModel.clearCarStatus();
                tuningViewModel.setCurrentLayout(2);
            }
        }, 1, null);
        AppCompatButton buttonViewCarColor = getBinding().buttonViewCarColor;
        Intrinsics.checkNotNullExpressionValue(buttonViewCarColor, "buttonViewCarColor");
        setOnClickListenerWithAnimAndDelay(buttonViewCarColor, 500L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$initListeners$2
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
                tuningViewModel = UILayoutTuningColorsList.this.getTuningViewModel();
                tuningViewModel.setCurrentLayout(1);
                tuningViewModel2 = UILayoutTuningColorsList.this.getTuningViewModel();
                tuningViewModel2.isViewFromMainMenu(false);
            }
        });
        AppCompatButton buttonResetToningReady = getBinding().buttonResetToningReady;
        Intrinsics.checkNotNullExpressionValue(buttonResetToningReady, "buttonResetToningReady");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonResetToningReady, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$initListeners$3
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
                tuningDialogResetDetails = UILayoutTuningColorsList.this.dialogResetDetails;
                if (tuningDialogResetDetails != null) {
                    tuningDialogResetDetails.showDialogReset();
                }
            }
        }, 1, null);
        TextView tuningPriceColor = getBinding().tuningPriceColor;
        Intrinsics.checkNotNullExpressionValue(tuningPriceColor, "tuningPriceColor");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, tuningPriceColor, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$initListeners$4
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
                tuningDialogApply = UILayoutTuningColorsList.this.tuningDialogApply;
                if (tuningDialogApply != null) {
                    i = UILayoutTuningColorsList.this.colorCost;
                    tuningDialogApply.showDialogApply(1, i, 0);
                }
            }
        }, 1, null);
        getBinding().tuningSeekbarColor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$initListeners$5
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(@NotNull SeekBar seekBar) {
                Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(@NotNull SeekBar seekBar, int i, boolean b) {
                TuningColorListViewModel colorListViewModel;
                String str;
                int i2;
                Intrinsics.checkNotNullParameter(seekBar, "seekBar");
                UILayoutTuningColorsList.this.setTextInViewWithTransparency(i);
                UILayoutTuningColorsList.this.intValueOfTransparency = seekBar.getMax() - i;
                colorListViewModel = UILayoutTuningColorsList.this.getColorListViewModel();
                str = UILayoutTuningColorsList.this.hexColor;
                i2 = UILayoutTuningColorsList.this.intValueOfTransparency;
                colorListViewModel.setColorObjToBuy(str, i2);
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(@NotNull SeekBar seekBar) {
                TuningFragmentColorListBinding binding;
                String str;
                Intrinsics.checkNotNullParameter(seekBar, "seekBar");
                binding = UILayoutTuningColorsList.this.getBinding();
                if (binding.tuningPriceColor.getVisibility() == 4) {
                    str = UILayoutTuningColorsList.this.hexColor;
                    if (Intrinsics.areEqual(str, "")) {
                        return;
                    }
                    UILayoutTuningColorsList.this.setVisiblePriceButton(0);
                }
            }
        });
        getBinding().listRgbColors.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UILayoutTuningColorsList.initListeners$lambda$2(UILayoutTuningColorsList.this, view);
            }
        });
    }

    public static final void initListeners$lambda$2(UILayoutTuningColorsList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        view.setEnabled(false);
        this$0.getTuningViewModel().setCurrentLayout(8);
    }

    private final void closeDialogs() {
        TuningDialogResetDetails tuningDialogResetDetails = this.dialogResetDetails;
        if (tuningDialogResetDetails != null) {
            tuningDialogResetDetails.closeDialogReset();
        }
        TuningDialogApply tuningDialogApply = this.tuningDialogApply;
        if (tuningDialogApply != null) {
            tuningDialogApply.closeDialog();
        }
    }

    private final void setNullableParams() {
        this.colorClickListener = null;
        this.colorAdapter = null;
        this.tuningDialogApply = null;
        this.dialogResetDetails = null;
    }
}
