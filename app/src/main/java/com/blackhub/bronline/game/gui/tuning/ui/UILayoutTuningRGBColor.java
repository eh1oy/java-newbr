package com.blackhub.bronline.game.gui.tuning.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.TuningFragmentRgbColorBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.colorpickerview.ColorEnvelope;
import com.blackhub.bronline.game.common.colorpickerview.listeners.ColorEnvelopeListener;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.tuning.TuningConstants;
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
import kotlin.text.CharsKt__CharJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UILayoutTuningRGBColor.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u000e\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010 \u001a\u00020!H\u0002J\u0012\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010$\u001a\u00020\u0002H\u0016J\u0010\u0010%\u001a\u00020!2\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u0010\u0010&\u001a\u00020!2\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u0010\u0010'\u001a\u00020!2\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u0010\u0010(\u001a\u00020!2\u0006\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010)\u001a\u00020!H\u0002J\b\u0010*\u001a\u00020!H\u0002J\b\u0010+\u001a\u00020!H\u0016J\b\u0010,\u001a\u00020!H\u0016J\u0010\u0010-\u001a\u00020!2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010.\u001a\u00020!H\u0002J\b\u0010/\u001a\u00020!H\u0002J\u0010\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020\u000fH\u0002J\u001e\u00102\u001a\u00020!2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f042\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u0010\u00105\u001a\u00020!2\u0006\u00106\u001a\u00020\u0005H\u0002J\u0010\u00107\u001a\u00020!2\u0006\u00108\u001a\u00020\u0005H\u0002J\u001e\u00109\u001a\u00020!2\u0006\u0010\r\u001a\u00020\u00052\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000504H\u0002J\u0010\u0010;\u001a\u00020!2\u0006\u0010<\u001a\u00020\u0005H\u0002J\u0010\u0010=\u001a\u00020!2\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u0010\u0010>\u001a\u00020!2\u0006\u0010<\u001a\u00020\u0005H\u0002J\u0010\u0010?\u001a\u00020!2\u0006\u0010<\u001a\u00020\u0005H\u0002J\u0010\u0010@\u001a\u00020!2\u0006\u0010<\u001a\u00020\u0005H\u0002J\u0010\u0010A\u001a\u00020!2\u0006\u0010<\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b\u001d\u0010\u001e¨\u0006B"}, d2 = {"Lcom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningRGBColor;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/TuningFragmentRgbColorBinding;", "()V", "carId", "", "colorCost", "colorListViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningColorListViewModel;", "getColorListViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningColorListViewModel;", "colorListViewModel$delegate", "Lkotlin/Lazy;", "currentSelector", "currentTitle", "", "dialogResetDetails", "Lcom/blackhub/bronline/game/gui/tuning/ui/TuningDialogResetDetails;", "hexColor", "intValueOfTransparency", "tuningDialogApply", "Lcom/blackhub/bronline/game/gui/tuning/ui/TuningDialogApply;", "tuningViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningMainViewModel;", "getTuningViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningMainViewModel;", "tuningViewModel$delegate", "viewCarViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningViewCarViewModel;", "getViewCarViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningViewCarViewModel;", "viewCarViewModel$delegate", "closeDialogs", "", "getStartData", "jsonString", "getViewBinding", "initDialogApply", "initDialogApplyCLickListener", "initDialogReset", "initDialogResetClickListener", "initListeners", "initObjects", "initViews", "onDestroyView", "setColorCost", "setNullableParameters", "setObservers", "setStartColorForSelector", "colorHex", "setStartInitialColor", "startColors", "", "setTextInViewWithTransparency", "currentValue", "setTransparencyToView", "valueOfTransparency", "setValueOfTransparency", "listWithValueOfTransparency", "setVisibleBlockWithPrice", "isVisible", "setVisibleBlockWithSeekbarAndResetButton", "setVisibleBlockWithTransparency", "setVisibleRBGBlock", "setVisibleResetButton", "setVisibleRootView", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUILayoutTuningRGBColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UILayoutTuningRGBColor.kt\ncom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningRGBColor\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,351:1\n106#2,15:352\n106#2,15:367\n106#2,15:382\n*S KotlinDebug\n*F\n+ 1 UILayoutTuningRGBColor.kt\ncom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningRGBColor\n*L\n54#1:352,15\n55#1:367,15\n56#1:382,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UILayoutTuningRGBColor extends BaseFragment<TuningFragmentRgbColorBinding> {
    public static final int $stable = 8;
    public int carId;
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

    @Nullable
    public TuningDialogApply tuningDialogApply;

    /* renamed from: tuningViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy tuningViewModel;

    /* renamed from: viewCarViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewCarViewModel;

    public UILayoutTuningRGBColor() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$colorListViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UILayoutTuningRGBColor.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$special$$inlined$viewModels$default$1
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
        this.colorListViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningColorListViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function03 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$tuningViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UILayoutTuningRGBColor.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$special$$inlined$viewModels$default$5
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
        this.tuningViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$special$$inlined$viewModels$default$6
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$special$$inlined$viewModels$default$7
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$special$$inlined$viewModels$default$8
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
        final Function0<ViewModelStoreOwner> function04 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$viewCarViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UILayoutTuningRGBColor.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy3 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$special$$inlined$viewModels$default$9
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
        this.viewCarViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningViewCarViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$special$$inlined$viewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$special$$inlined$viewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$special$$inlined$viewModels$default$12
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
    public TuningFragmentRgbColorBinding getViewBinding() {
        TuningFragmentRgbColorBinding inflate = TuningFragmentRgbColorBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        Bundle arguments = getArguments();
        getStartData(arguments != null ? arguments.getString(TuningConstants.JSON_OBJECT) : null);
        initObjects();
        setObservers();
        setVisibleBlockWithSeekbarAndResetButton(this.currentSelector);
        initListeners();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        closeDialogs();
        setNullableParameters();
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

    private final void initDialogApply(int currentSelector) {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        this.tuningDialogApply = new TuningDialogApply(requireActivity);
        initDialogApplyCLickListener(currentSelector);
    }

    private final void initDialogApplyCLickListener(final int currentSelector) {
        TuningDialogApply tuningDialogApply = this.tuningDialogApply;
        if (tuningDialogApply == null) {
            return;
        }
        tuningDialogApply.setMyClickListener(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$initDialogApplyCLickListener$1
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
                    colorListViewModel = UILayoutTuningRGBColor.this.getColorListViewModel();
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

    private final void initDialogResetClickListener(final int currentSelector) {
        TuningDialogResetDetails tuningDialogResetDetails = this.dialogResetDetails;
        if (tuningDialogResetDetails == null) {
            return;
        }
        tuningDialogResetDetails.setResetClickListener(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$initDialogResetClickListener$1
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
                    tuningViewModel = UILayoutTuningRGBColor.this.getTuningViewModel();
                    TuningMainViewModel.applyResetDetails$default(tuningViewModel, currentSelector, 0, 2, null);
                    tuningViewModel.clearCarStatus();
                }
            }
        });
    }

    private final void setObservers() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutTuningRGBColor$setObservers$1(this, null), 3, null);
        int i = this.currentSelector;
        if (i == 3 || i == 4) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutTuningRGBColor$setObservers$2(this, null), 3, null);
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutTuningRGBColor$setObservers$3(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutTuningRGBColor$setObservers$4(this, null), 3, null);
    }

    public final void setStartInitialColor(List<String> startColors, int currentSelector) {
        if (startColors.size() == 8) {
            if (currentSelector == 0) {
                setStartColorForSelector(startColors.get(0));
                return;
            }
            if (currentSelector != 1) {
                if (currentSelector == 3) {
                    setStartColorForSelector(startColors.get(2));
                    return;
                }
                if (currentSelector == 4) {
                    setStartColorForSelector(startColors.get(3));
                    return;
                }
                if (currentSelector != 32) {
                    switch (currentSelector) {
                        case 10:
                            setStartColorForSelector(startColors.get(4));
                            break;
                        case 11:
                            setStartColorForSelector(startColors.get(5));
                            break;
                        case 12:
                            setStartColorForSelector(startColors.get(6));
                            break;
                        case 13:
                            setStartColorForSelector(startColors.get(7));
                            break;
                    }
                    return;
                }
            }
            setStartColorForSelector(startColors.get(1));
        }
    }

    public final void setStartColorForSelector(String colorHex) {
        getBinding().colorPickerRgb.setInitialColor((int) Long.parseLong(colorHex, CharsKt__CharJVMKt.checkRadix(16)));
    }

    /* JADX INFO: Access modifiers changed from: private */
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

    private final void setTransparencyToView(int valueOfTransparency) {
        getBinding().tuningSeekbarRgbTransparency.setProgress(valueOfTransparency);
        setTextInViewWithTransparency(valueOfTransparency);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextInViewWithTransparency(int currentValue) {
        getBinding().valueTransparencyColor.setText(requireActivity().getString(R.string.common_value_and_percent, Integer.valueOf(currentValue)));
    }

    public final void setColorCost(int colorCost) {
        getBinding().tuningValuePriceRgbColor.setText(getString(R.string.common_string_with_ruble, UsefulKt.getPriceWithSpaces(Integer.valueOf(colorCost))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVisibleRootView(int isVisible) {
        RelativeLayout root = getBinding().getRoot();
        root.setVisibility(isVisible);
        if (isVisible == 0) {
            root.bringToFront();
        }
    }

    private final void setVisibleBlockWithSeekbarAndResetButton(int currentSelector) {
        if (currentSelector == 3 || currentSelector == 4) {
            setVisibleResetButton(0);
        } else {
            setVisibleResetButton(4);
        }
    }

    private final void setVisibleResetButton(int isVisible) {
        getBinding().buttonResetToningRgb.setVisibility(isVisible);
    }

    private final void initListeners() {
        TuningFragmentRgbColorBinding binding = getBinding();
        binding.listReadyColorsRgbColor.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UILayoutTuningRGBColor.initListeners$lambda$3$lambda$1(UILayoutTuningRGBColor.this, view);
            }
        });
        AppCompatButton buttonViewCarRgbColor = binding.buttonViewCarRgbColor;
        Intrinsics.checkNotNullExpressionValue(buttonViewCarRgbColor, "buttonViewCarRgbColor");
        setOnClickListenerWithAnimAndDelay(buttonViewCarRgbColor, 500L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$initListeners$1$2
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
                tuningViewModel = UILayoutTuningRGBColor.this.getTuningViewModel();
                tuningViewModel.setCurrentLayout(1);
                tuningViewModel2 = UILayoutTuningRGBColor.this.getTuningViewModel();
                tuningViewModel2.isViewFromMainMenu(false);
            }
        });
        AppCompatButton backToSubmenuRgbColor = binding.backToSubmenuRgbColor;
        Intrinsics.checkNotNullExpressionValue(backToSubmenuRgbColor, "backToSubmenuRgbColor");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, backToSubmenuRgbColor, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$initListeners$1$3
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
                tuningViewModel = UILayoutTuningRGBColor.this.getTuningViewModel();
                tuningViewModel.clearCarStatus();
                tuningViewModel.setCurrentLayout(2);
            }
        }, 1, null);
        ConstraintLayout tuningPriceRgbColor = binding.tuningPriceRgbColor;
        Intrinsics.checkNotNullExpressionValue(tuningPriceRgbColor, "tuningPriceRgbColor");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, tuningPriceRgbColor, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$initListeners$1$4
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
                tuningDialogApply = UILayoutTuningRGBColor.this.tuningDialogApply;
                if (tuningDialogApply != null) {
                    i = UILayoutTuningRGBColor.this.colorCost;
                    tuningDialogApply.showDialogApply(1, i, 0);
                }
            }
        }, 1, null);
        AppCompatButton buttonResetToningRgb = binding.buttonResetToningRgb;
        Intrinsics.checkNotNullExpressionValue(buttonResetToningRgb, "buttonResetToningRgb");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonResetToningRgb, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$initListeners$1$5
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
                tuningDialogResetDetails = UILayoutTuningRGBColor.this.dialogResetDetails;
                if (tuningDialogResetDetails != null) {
                    tuningDialogResetDetails.showDialogReset();
                }
            }
        }, 1, null);
        ConstraintLayout blockWithThisRgbColor = binding.blockWithThisRgbColor;
        Intrinsics.checkNotNullExpressionValue(blockWithThisRgbColor, "blockWithThisRgbColor");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, blockWithThisRgbColor, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$initListeners$1$6
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
                UILayoutTuningRGBColor.this.setVisibleRBGBlock(0);
                UILayoutTuningRGBColor.this.setVisibleBlockWithPrice(4);
                UILayoutTuningRGBColor.this.setVisibleBlockWithTransparency(4);
            }
        }, 1, null);
        ConstraintLayout blockWithThisRgbColor2 = binding.blockWithThisRgbColor;
        Intrinsics.checkNotNullExpressionValue(blockWithThisRgbColor2, "blockWithThisRgbColor");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, blockWithThisRgbColor2, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$initListeners$1$7
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
                UILayoutTuningRGBColor.this.setVisibleRBGBlock(0);
                UILayoutTuningRGBColor.this.setVisibleBlockWithPrice(4);
                UILayoutTuningRGBColor.this.setVisibleBlockWithTransparency(4);
            }
        }, 1, null);
        AppCompatButton buttonSelectedColor = binding.buttonSelectedColor;
        Intrinsics.checkNotNullExpressionValue(buttonSelectedColor, "buttonSelectedColor");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonSelectedColor, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$initListeners$1$8
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
                UILayoutTuningRGBColor.this.setVisibleRBGBlock(4);
                UILayoutTuningRGBColor.this.setVisibleBlockWithPrice(0);
                i = UILayoutTuningRGBColor.this.currentSelector;
                if (i != 3) {
                    i2 = UILayoutTuningRGBColor.this.currentSelector;
                    if (i2 != 4) {
                        return;
                    }
                }
                UILayoutTuningRGBColor.this.setVisibleBlockWithTransparency(0);
            }
        }, 1, null);
        binding.colorPickerRgb.setColorListener(new ColorEnvelopeListener() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$$ExternalSyntheticLambda1
            @Override // com.blackhub.bronline.game.common.colorpickerview.listeners.ColorEnvelopeListener
            public final void onColorSelected(ColorEnvelope colorEnvelope, boolean z) {
                UILayoutTuningRGBColor.initListeners$lambda$3$lambda$2(UILayoutTuningRGBColor.this, colorEnvelope, z);
            }
        });
        binding.colorPickerRgb.attachBrightnessSlider(getBinding().tuningSeekbarRgbColor);
        binding.tuningSeekbarRgbTransparency.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor$initListeners$1$10
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(@Nullable SeekBar p0) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(@Nullable SeekBar p0) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(@NotNull SeekBar p0, int p1, boolean p2) {
                TuningColorListViewModel colorListViewModel;
                String str;
                int i;
                Intrinsics.checkNotNullParameter(p0, "p0");
                UILayoutTuningRGBColor.this.setTextInViewWithTransparency(p1);
                UILayoutTuningRGBColor.this.intValueOfTransparency = p0.getMax() - p1;
                colorListViewModel = UILayoutTuningRGBColor.this.getColorListViewModel();
                str = UILayoutTuningRGBColor.this.hexColor;
                i = UILayoutTuningRGBColor.this.intValueOfTransparency;
                colorListViewModel.setColorObjToBuy(str, i);
            }
        });
    }

    public static final void initListeners$lambda$3$lambda$1(UILayoutTuningRGBColor this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        view.setEnabled(false);
        this$0.getTuningViewModel().setCurrentLayout(5);
    }

    public static final void initListeners$lambda$3$lambda$2(UILayoutTuningRGBColor this$0, ColorEnvelope envelope, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(envelope, "envelope");
        this$0.getBinding().alphaTileViewRgbColor.setPaintColor(envelope.getColor());
        String hexCode = envelope.getHexCode();
        Intrinsics.checkNotNullExpressionValue(hexCode, "getHexCode(...)");
        String substring = hexCode.substring(2);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        this$0.hexColor = substring;
        this$0.getColorListViewModel().setColorObjToBuy(this$0.hexColor, this$0.intValueOfTransparency);
    }

    public final void setVisibleRBGBlock(int isVisible) {
        getBinding().menuBlockRadialColor.setVisibility(isVisible);
        getBinding().seekbarViewRgbColor.setVisibility(isVisible);
    }

    public final void setVisibleBlockWithPrice(int isVisible) {
        getBinding().menuBlockRgbColor.setVisibility(isVisible);
    }

    public final void setVisibleBlockWithTransparency(int isVisible) {
        getBinding().seekbarBlockRgbTransparency.setVisibility(isVisible);
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

    private final void setNullableParameters() {
        this.tuningDialogApply = null;
        this.dialogResetDetails = null;
    }
}
