package com.blackhub.bronline.game.gui.tuning.ui;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.TuningFragmentViewCarBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.TimeChecker;
import com.blackhub.bronline.game.core.JNILib;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningViewCarViewModel;
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

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UILayoutTuningViewCar.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0003J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0005H\u0002J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011¨\u0006!"}, d2 = {"Lcom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningViewCar;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/TuningFragmentViewCarBinding;", "()V", "backButtonClicked", "", "timeChecker", "Lcom/blackhub/bronline/game/common/TimeChecker;", "tuningViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningMainViewModel;", "getTuningViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningMainViewModel;", "tuningViewModel$delegate", "Lkotlin/Lazy;", "viewCarViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningViewCarViewModel;", "getViewCarViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningViewCarViewModel;", "viewCarViewModel$delegate", "getViewBinding", "initListeners", "", "initViews", "onDestroyView", "setEffectForDoorSwitch", "resImage", "", "setEffectForLightSwitch", "setObservers", "updateDoorSwitch", "checkDoorSwitch", "updateLightSwitch", "checkLightSwitch", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUILayoutTuningViewCar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UILayoutTuningViewCar.kt\ncom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningViewCar\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,134:1\n106#2,15:135\n106#2,15:150\n*S KotlinDebug\n*F\n+ 1 UILayoutTuningViewCar.kt\ncom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningViewCar\n*L\n18#1:135,15\n19#1:150,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UILayoutTuningViewCar extends BaseFragment<TuningFragmentViewCarBinding> {
    public static final int $stable = 8;
    public boolean backButtonClicked;

    @NotNull
    public final TimeChecker timeChecker;

    /* renamed from: tuningViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy tuningViewModel;

    /* renamed from: viewCarViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewCarViewModel;

    public UILayoutTuningViewCar() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningViewCar$viewCarViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UILayoutTuningViewCar.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningViewCar$special$$inlined$viewModels$default$1
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
        this.viewCarViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningViewCarViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningViewCar$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningViewCar$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningViewCar$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function03 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningViewCar$tuningViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UILayoutTuningViewCar.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningViewCar$special$$inlined$viewModels$default$5
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
        this.tuningViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningViewCar$special$$inlined$viewModels$default$6
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningViewCar$special$$inlined$viewModels$default$7
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningViewCar$special$$inlined$viewModels$default$8
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TuningViewCarViewModel getViewCarViewModel() {
        return (TuningViewCarViewModel) this.viewCarViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TuningMainViewModel getTuningViewModel() {
        return (TuningMainViewModel) this.tuningViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public TuningFragmentViewCarBinding getViewBinding() {
        TuningFragmentViewCarBinding inflate = TuningFragmentViewCarBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        getViewCarViewModel().setShowStatus(true);
        this.backButtonClicked = false;
        getTuningViewModel().updateHideBackToMainMenuButton(true);
        setObservers();
        initListeners();
    }

    private final void setObservers() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new UILayoutTuningViewCar$setObservers$1(this, null));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2).launchWhenStarted(new UILayoutTuningViewCar$setObservers$2(this, null));
    }

    public final void updateDoorSwitch(boolean checkDoorSwitch) {
        if (checkDoorSwitch) {
            setEffectForDoorSwitch(R.drawable.tuning_door_on);
        } else {
            setEffectForDoorSwitch(R.drawable.tuning_door_off);
        }
    }

    public final void setEffectForDoorSwitch(int resImage) {
        getBinding().buttonDoorView.setImageResource(resImage);
    }

    public final void updateLightSwitch(boolean checkLightSwitch) {
        if (checkLightSwitch) {
            setEffectForLightSwitch(R.drawable.tuning_light_on);
        } else {
            setEffectForLightSwitch(R.drawable.tuning_light_off);
        }
    }

    public final void setEffectForLightSwitch(int resImage) {
        getBinding().buttonLightView.setImageResource(resImage);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void initListeners() {
        getBinding().buttonDoorView.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningViewCar$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UILayoutTuningViewCar.initListeners$lambda$0(UILayoutTuningViewCar.this, view);
            }
        });
        getBinding().buttonLightView.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningViewCar$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UILayoutTuningViewCar.initListeners$lambda$1(UILayoutTuningViewCar.this, view);
            }
        });
        AppCompatButton backMenuView = getBinding().backMenuView;
        Intrinsics.checkNotNullExpressionValue(backMenuView, "backMenuView");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, backMenuView, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningViewCar$initListeners$3
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
                tuningViewModel = UILayoutTuningViewCar.this.getTuningViewModel();
                tuningViewModel.closeViewCar();
                UILayoutTuningViewCar.this.requireParentFragment().getChildFragmentManager().beginTransaction().remove(UILayoutTuningViewCar.this).commit();
            }
        }, 1, null);
        getBinding().getRoot().setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningViewCar$$ExternalSyntheticLambda2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean initListeners$lambda$2;
                initListeners$lambda$2 = UILayoutTuningViewCar.initListeners$lambda$2(view, motionEvent);
                return initListeners$lambda$2;
            }
        });
    }

    public static final void initListeners$lambda$0(UILayoutTuningViewCar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        if (this$0.timeChecker.ifAccess(500L)) {
            view.startAnimation(this$0.getAnim());
            this$0.getViewCarViewModel().updateDoorStatus();
        }
    }

    public static final void initListeners$lambda$1(UILayoutTuningViewCar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        if (this$0.timeChecker.ifAccess(500L)) {
            view.startAnimation(this$0.getAnim());
            this$0.getViewCarViewModel().updateLightStatus();
        }
    }

    public static final boolean initListeners$lambda$2(View view, MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < pointerCount; i7++) {
            int pointerId = motionEvent.getPointerId(i7);
            if (pointerId == 0) {
                i = (int) motionEvent.getX(i7);
                i2 = (int) motionEvent.getY(i7);
            } else if (pointerId == 1) {
                i3 = (int) motionEvent.getX(i7);
                i4 = (int) motionEvent.getY(i7);
            } else if (pointerId == 2) {
                i5 = (int) motionEvent.getX(i7);
                i6 = (int) motionEvent.getY(i7);
            }
        }
        JNILib.multiTouchEvent(motionEvent.getActionMasked(), motionEvent.getPointerId(motionEvent.getActionIndex()), i, i2, i3, i4, i5, i6);
        return true;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getViewCarViewModel().setShowStatus(false);
        getTuningViewModel().updateHideBackToMainMenuButton(false);
        super.onDestroyView();
    }
}
