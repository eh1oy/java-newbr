package com.blackhub.bronline.game.gui.blackpass;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.text.AnnotatedString;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.BlackPassMainNewBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.composemanager.ComposableProvider;
import com.blackhub.bronline.game.common.composemanager.ComposeViewManager;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.utils.attachment.rating.CommonRatingModel;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskModel;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskState;
import com.blackhub.bronline.game.gui.blackpass.data.RewardModel;
import com.blackhub.bronline.game.gui.blackpass.enums.VIPStateEnum;
import com.blackhub.bronline.game.gui.blackpass.ui.BlackPassCustomDialog;
import com.blackhub.bronline.game.gui.blackpass.ui.BlackPassTaskInfoDialog;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassPrizeListViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateDepositCoinsViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel;
import com.blackhub.bronline.game.ui.blackpass.BlackPassMainUIKt;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUIBlackPassMain.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\b\u0010 \u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\u001eH\u0002J\b\u0010\"\u001a\u00020\u001eH\u0002J\b\u0010#\u001a\u00020\u001eH\u0002J\b\u0010$\u001a\u00020\u001eH\u0016J\b\u0010%\u001a\u00020\u001eH\u0016J\b\u0010&\u001a\u00020\u001eH\u0002J\b\u0010'\u001a\u00020\u001eH\u0002J\b\u0010(\u001a\u00020\u001eH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/blackhub/bronline/game/gui/blackpass/GUIBlackPassMain;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/BlackPassMainNewBinding;", "()V", "blackPassMainViewModel", "Lcom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel;", "getBlackPassMainViewModel", "()Lcom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel;", "blackPassMainViewModel$delegate", "Lkotlin/Lazy;", "blackPassPrizeListViewModel", "Lcom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassPrizeListViewModel;", "getBlackPassPrizeListViewModel", "()Lcom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassPrizeListViewModel;", "blackPassPrizeListViewModel$delegate", "customDialog", "Lcom/blackhub/bronline/game/gui/blackpass/ui/BlackPassCustomDialog;", "depositCoinsViewModel", "Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateDepositCoinsViewModel;", "getDepositCoinsViewModel", "()Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateDepositCoinsViewModel;", "depositCoinsViewModel$delegate", "donateMainViewModel", "Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateMainViewModel;", "getDonateMainViewModel", "()Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateMainViewModel;", "donateMainViewModel$delegate", "taskDialog", "Lcom/blackhub/bronline/game/gui/blackpass/ui/BlackPassTaskInfoDialog;", "clearViewModel", "", "getViewBinding", "initCustomDialog", "initCustomDialogClickListener", "initObjects", "initTasksDialog", "initViews", "onDestroyView", "requestInitData", "setNullableParameters", "setObservers", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGUIBlackPassMain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUIBlackPassMain.kt\ncom/blackhub/bronline/game/gui/blackpass/GUIBlackPassMain\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,376:1\n106#2,15:377\n106#2,15:392\n106#2,15:407\n106#2,15:422\n*S KotlinDebug\n*F\n+ 1 GUIBlackPassMain.kt\ncom/blackhub/bronline/game/gui/blackpass/GUIBlackPassMain\n*L\n49#1:377,15\n50#1:392,15\n51#1:407,15\n52#1:422,15\n*E\n"})
/* loaded from: classes3.dex */
public final class GUIBlackPassMain extends BaseFragment<BlackPassMainNewBinding> {
    public static final int $stable = 8;

    /* renamed from: blackPassMainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy blackPassMainViewModel;

    /* renamed from: blackPassPrizeListViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy blackPassPrizeListViewModel;

    @Nullable
    public BlackPassCustomDialog customDialog;

    /* renamed from: depositCoinsViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy depositCoinsViewModel;

    /* renamed from: donateMainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy donateMainViewModel;

    @Nullable
    public BlackPassTaskInfoDialog taskDialog;

    public GUIBlackPassMain() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$blackPassMainViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = GUIBlackPassMain.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$1
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
        this.blackPassMainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BlackPassMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function03 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$donateMainViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = GUIBlackPassMain.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$5
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
        this.donateMainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DonateMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$6
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$7
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$8
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
        final Function0<ViewModelStoreOwner> function04 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$depositCoinsViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = GUIBlackPassMain.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy3 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$9
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
        this.depositCoinsViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DonateDepositCoinsViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$12
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
        final Function0<ViewModelStoreOwner> function05 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$blackPassPrizeListViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = GUIBlackPassMain.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy4 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$13
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
        this.blackPassPrizeListViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BlackPassPrizeListViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$14
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$15
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
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy4);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$16
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
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy4);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = Fragment.this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BlackPassMainViewModel getBlackPassMainViewModel() {
        return (BlackPassMainViewModel) this.blackPassMainViewModel.getValue();
    }

    public final DonateMainViewModel getDonateMainViewModel() {
        return (DonateMainViewModel) this.donateMainViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DonateDepositCoinsViewModel getDepositCoinsViewModel() {
        return (DonateDepositCoinsViewModel) this.depositCoinsViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BlackPassPrizeListViewModel getBlackPassPrizeListViewModel() {
        return (BlackPassPrizeListViewModel) this.blackPassPrizeListViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public BlackPassMainNewBinding getViewBinding() {
        BlackPassMainNewBinding inflate = BlackPassMainNewBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        clearViewModel();
        requestInitData();
        initObjects();
        setObservers();
    }

    private final void initObjects() {
        ComposeViewManager composeViewManager = ComposeViewManager.INSTANCE;
        ComposeView composeViewBlackPassMainFullScreen = getBinding().composeViewBlackPassMainFullScreen;
        Intrinsics.checkNotNullExpressionValue(composeViewBlackPassMainFullScreen, "composeViewBlackPassMainFullScreen");
        composeViewManager.setComposableContentForKotlin(composeViewBlackPassMainFullScreen, ComposableLambdaKt.composableLambdaInstance(464738629, true, new Function3<ComposableProvider, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ComposableProvider composableProvider, Composer composer, Integer num) {
                invoke(composableProvider, composer, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
            public final void invoke(@NotNull ComposableProvider composableProvider, @Nullable Composer composer, int i) {
                BlackPassMainViewModel blackPassMainViewModel;
                Intrinsics.checkNotNullParameter(composableProvider, "$this$null");
                if ((i & 81) != 16 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(464738629, i, -1, "com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initObjects.<anonymous> (GUIBlackPassMain.kt:70)");
                    }
                    blackPassMainViewModel = GUIBlackPassMain.this.getBlackPassMainViewModel();
                    final BlackPassMainUIState blackPassMainUIState = (BlackPassMainUIState) FlowExtKt.collectAsStateWithLifecycle(blackPassMainViewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7).getValue();
                    long Color = ColorKt.Color(blackPassMainUIState.getSeasonColor());
                    String string = GUIBlackPassMain.this.getString(R.string.common_timer_title_1);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String string2 = GUIBlackPassMain.this.getString(R.string.common_timer_title_2, Integer.valueOf(blackPassMainUIState.getTimerDaysAndHours().getDays()), Integer.valueOf(blackPassMainUIState.getTimerDaysAndHours().getHours()));
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    int bpLevel = blackPassMainUIState.getBpLevel();
                    int valueOfExperience = blackPassMainUIState.getValueOfExperience();
                    int maxLevelExp = blackPassMainUIState.getMaxLevelExp();
                    Bitmap seasonBitmapImage = blackPassMainUIState.getSeasonBitmapImage();
                    Bitmap seasonBitmapImageForRewards = blackPassMainUIState.getSeasonBitmapImageForRewards();
                    String seasonName = blackPassMainUIState.getSeasonName();
                    int bpBtnColor = blackPassMainUIState.getBpBtnColor();
                    int bpBtnBg = blackPassMainUIState.getBpBtnBg();
                    int tasksBtnColor = blackPassMainUIState.getTasksBtnColor();
                    int tasksBtnBg = blackPassMainUIState.getTasksBtnBg();
                    int ratingBtnColor = blackPassMainUIState.getRatingBtnColor();
                    int ratingBtnBg = blackPassMainUIState.getRatingBtnBg();
                    int selectedLayout = blackPassMainUIState.getSelectedLayout();
                    Bitmap dailyCategoryImageBitmap = blackPassMainUIState.getDailyCategoryImageBitmap();
                    Bitmap premiumBitmapImage = blackPassMainUIState.getPremiumBitmapImage();
                    VIPStateEnum vipState = blackPassMainUIState.getVipState();
                    boolean isActiveVip = blackPassMainUIState.isActiveVip();
                    List<RewardModel> rewardsList = blackPassMainUIState.getRewardsList();
                    List<CommonTaskModel> specialTasksList = blackPassMainUIState.getSpecialTasksList();
                    List<CommonTaskModel> dailyTasksList = blackPassMainUIState.getDailyTasksList();
                    String weeklyTimerForEndCategory = blackPassMainUIState.getWeeklyTimerForEndCategory();
                    byte selectedCategoryTask = blackPassMainUIState.getSelectedCategoryTask();
                    Bitmap specialCategoryImageBitmap = blackPassMainUIState.getSpecialCategoryImageBitmap();
                    Bitmap dailyCategoryImageBitmap2 = blackPassMainUIState.getDailyCategoryImageBitmap();
                    int myPlaceInRating = blackPassMainUIState.getMyPlaceInRating();
                    List<CommonRatingModel> ratingList = blackPassMainUIState.getRatingList();
                    Bitmap ratingBgImage = blackPassMainUIState.getRatingBgImage();
                    Bitmap bpExpBitmap = blackPassMainUIState.getBpExpBitmap();
                    Bitmap imgOfferSplit = blackPassMainUIState.getImgOfferSplit();
                    AnnotatedString activatePremiumSubtitle = blackPassMainUIState.getActivatePremiumSubtitle();
                    AnnotatedString activatePremiumDeluxeSubtitle = blackPassMainUIState.getActivatePremiumDeluxeSubtitle();
                    String nameDeluxeCar = blackPassMainUIState.getNameDeluxeCar();
                    Bitmap imgDeluxeCar = blackPassMainUIState.getImgDeluxeCar();
                    String premiumPrice = blackPassMainUIState.getPremiumPrice();
                    String premiumDeluxePrice = blackPassMainUIState.getPremiumDeluxePrice();
                    boolean isButtonBuyPremiumEnabled = blackPassMainUIState.getIsButtonBuyPremiumEnabled();
                    AnnotatedString bannerTitlePrize1 = blackPassMainUIState.getBannerTitlePrize1();
                    final GUIBlackPassMain gUIBlackPassMain = GUIBlackPassMain.this;
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1.1
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
                            BlackPassMainViewModel blackPassMainViewModel2;
                            DonateDepositCoinsViewModel depositCoinsViewModel;
                            BlackPassMainViewModel blackPassMainViewModel3;
                            blackPassMainViewModel2 = GUIBlackPassMain.this.getBlackPassMainViewModel();
                            blackPassMainViewModel2.onButtonBuyPremiumClick();
                            depositCoinsViewModel = GUIBlackPassMain.this.getDepositCoinsViewModel();
                            blackPassMainViewModel3 = GUIBlackPassMain.this.getBlackPassMainViewModel();
                            depositCoinsViewModel.saveIntermediatePremiumPrice(blackPassMainViewModel3.getUiState().getValue().getPremiumPriceInt());
                        }
                    };
                    final GUIBlackPassMain gUIBlackPassMain2 = GUIBlackPassMain.this;
                    Function0<Unit> function02 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1.2
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
                            BlackPassMainViewModel blackPassMainViewModel2;
                            DonateDepositCoinsViewModel depositCoinsViewModel;
                            BlackPassMainViewModel blackPassMainViewModel3;
                            blackPassMainViewModel2 = GUIBlackPassMain.this.getBlackPassMainViewModel();
                            blackPassMainViewModel2.onButtonBuyPremiumDeluxeClick();
                            depositCoinsViewModel = GUIBlackPassMain.this.getDepositCoinsViewModel();
                            blackPassMainViewModel3 = GUIBlackPassMain.this.getBlackPassMainViewModel();
                            depositCoinsViewModel.saveIntermediatePremiumPrice(blackPassMainViewModel3.getUiState().getValue().getPremiumDeluxePriceInt());
                        }
                    };
                    final GUIBlackPassMain gUIBlackPassMain3 = GUIBlackPassMain.this;
                    Function0<Unit> function03 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1.3
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
                            BlackPassPrizeListViewModel blackPassPrizeListViewModel;
                            blackPassPrizeListViewModel = GUIBlackPassMain.this.getBlackPassPrizeListViewModel();
                            blackPassPrizeListViewModel.isNeedShowDialog();
                        }
                    };
                    final GUIBlackPassMain gUIBlackPassMain4 = GUIBlackPassMain.this;
                    Function0<Unit> function04 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1.4
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
                            BlackPassMainViewModel blackPassMainViewModel2;
                            blackPassMainViewModel2 = GUIBlackPassMain.this.getBlackPassMainViewModel();
                            blackPassMainViewModel2.onRefreshRatingClick();
                        }
                    };
                    final GUIBlackPassMain gUIBlackPassMain5 = GUIBlackPassMain.this;
                    Function1<Integer, Unit> function1 = new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1.5
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                            invoke(num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(int i2) {
                            BlackPassMainViewModel blackPassMainViewModel2;
                            BlackPassMainViewModel blackPassMainViewModel3;
                            blackPassMainViewModel2 = GUIBlackPassMain.this.getBlackPassMainViewModel();
                            blackPassMainViewModel2.onClickSelectLayout(i2);
                            blackPassMainViewModel3 = GUIBlackPassMain.this.getBlackPassMainViewModel();
                            blackPassMainViewModel3.sendShowCurrentLayout(i2);
                        }
                    };
                    final GUIBlackPassMain gUIBlackPassMain6 = GUIBlackPassMain.this;
                    Function2<CommonRewardModel, Bitmap, Unit> function2 = new Function2<CommonRewardModel, Bitmap, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1.6

                        /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
                        /* compiled from: GUIBlackPassMain.kt */
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$6$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[CommonRewardState.values().length];
                                try {
                                    iArr[CommonRewardState.NORM_AVAILABLE.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[CommonRewardState.NORM_RECEIVED.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(CommonRewardModel commonRewardModel, Bitmap bitmap) {
                            invoke2(commonRewardModel, bitmap);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull CommonRewardModel topRewardModel, @Nullable Bitmap bitmap) {
                            DonateMainViewModel donateMainViewModel;
                            int i2;
                            int i3;
                            Intrinsics.checkNotNullParameter(topRewardModel, "topRewardModel");
                            donateMainViewModel = GUIBlackPassMain.this.getDonateMainViewModel();
                            String rewardDescription = topRewardModel.getRewardDescription();
                            int rewardId = topRewardModel.getRewardId();
                            int i4 = WhenMappings.$EnumSwitchMapping$0[topRewardModel.getMainRewardState().ordinal()];
                            if (i4 == 1) {
                                i2 = 0;
                            } else {
                                if (i4 != 2) {
                                    i3 = 1;
                                    donateMainViewModel.clickPreviewPrize(bitmap, rewardDescription, rewardId, 1, i3, 0, topRewardModel.getTypeId(), topRewardModel.getRarityState());
                                }
                                i2 = 3;
                            }
                            i3 = i2;
                            donateMainViewModel.clickPreviewPrize(bitmap, rewardDescription, rewardId, 1, i3, 0, topRewardModel.getTypeId(), topRewardModel.getRarityState());
                        }
                    };
                    final GUIBlackPassMain gUIBlackPassMain7 = GUIBlackPassMain.this;
                    Function2<CommonRewardModel, Bitmap, Unit> function22 = new Function2<CommonRewardModel, Bitmap, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1.7

                        /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
                        /* compiled from: GUIBlackPassMain.kt */
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$7$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[CommonRewardState.values().length];
                                try {
                                    iArr[CommonRewardState.NORM_AVAILABLE.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[CommonRewardState.NORM_RECEIVED.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(CommonRewardModel commonRewardModel, Bitmap bitmap) {
                            invoke2(commonRewardModel, bitmap);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull CommonRewardModel bottomRewardModel, @Nullable Bitmap bitmap) {
                            DonateMainViewModel donateMainViewModel;
                            int i2;
                            int i3;
                            Intrinsics.checkNotNullParameter(bottomRewardModel, "bottomRewardModel");
                            donateMainViewModel = GUIBlackPassMain.this.getDonateMainViewModel();
                            String rewardDescription = bottomRewardModel.getRewardDescription();
                            int rewardId = bottomRewardModel.getRewardId();
                            int i4 = WhenMappings.$EnumSwitchMapping$0[bottomRewardModel.getMainRewardState().ordinal()];
                            if (i4 == 1) {
                                i2 = 0;
                            } else {
                                if (i4 != 2) {
                                    i3 = 1;
                                    donateMainViewModel.clickPreviewPrize(bitmap, rewardDescription, rewardId, 0, i3, 0, bottomRewardModel.getTypeId(), bottomRewardModel.getRarityState());
                                }
                                i2 = 3;
                            }
                            i3 = i2;
                            donateMainViewModel.clickPreviewPrize(bitmap, rewardDescription, rewardId, 0, i3, 0, bottomRewardModel.getTypeId(), bottomRewardModel.getRarityState());
                        }
                    };
                    final GUIBlackPassMain gUIBlackPassMain8 = GUIBlackPassMain.this;
                    Function0<Unit> function05 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1.8
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
                            DonateMainViewModel donateMainViewModel;
                            donateMainViewModel = GUIBlackPassMain.this.getDonateMainViewModel();
                            donateMainViewModel.setShowLastChanceBPBoostView(true);
                        }
                    };
                    final GUIBlackPassMain gUIBlackPassMain9 = GUIBlackPassMain.this;
                    Function1<Byte, Unit> function12 = new Function1<Byte, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1.9
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Byte b) {
                            invoke(b.byteValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(byte b) {
                            BlackPassMainViewModel blackPassMainViewModel2;
                            blackPassMainViewModel2 = GUIBlackPassMain.this.getBlackPassMainViewModel();
                            blackPassMainViewModel2.onCategoryTaskClick(b);
                        }
                    };
                    final GUIBlackPassMain gUIBlackPassMain10 = GUIBlackPassMain.this;
                    Function1<CommonTaskModel, Unit> function13 = new Function1<CommonTaskModel, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1.10

                        /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
                        /* compiled from: GUIBlackPassMain.kt */
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$10$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[CommonTaskState.values().length];
                                try {
                                    iArr[CommonTaskState.UNAVAILABLE_STATE.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[CommonTaskState.COMPLETED_STATE.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[CommonTaskState.GET_STATE.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(CommonTaskModel commonTaskModel) {
                            invoke2(commonTaskModel);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull CommonTaskModel task) {
                            DonateMainViewModel donateMainViewModel;
                            BlackPassMainViewModel blackPassMainViewModel2;
                            DonateMainViewModel donateMainViewModel2;
                            BlackPassMainViewModel blackPassMainViewModel3;
                            Intrinsics.checkNotNullParameter(task, "task");
                            int i2 = WhenMappings.$EnumSwitchMapping$0[task.getStateOfTask().ordinal()];
                            if (i2 == 1) {
                                donateMainViewModel = GUIBlackPassMain.this.getDonateMainViewModel();
                                DonateMainViewModel.showNewFragment$default(donateMainViewModel, 102, false, false, 4, null);
                                blackPassMainViewModel2 = GUIBlackPassMain.this.getBlackPassMainViewModel();
                                blackPassMainViewModel2.sendShowCurrentLayout(4);
                                return;
                            }
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    blackPassMainViewModel3 = GUIBlackPassMain.this.getBlackPassMainViewModel();
                                    blackPassMainViewModel3.onTaskClick(task);
                                    return;
                                }
                                donateMainViewModel2 = GUIBlackPassMain.this.getDonateMainViewModel();
                                int id = task.getId();
                                String string3 = GUIBlackPassMain.this.getString(R.string.common_string_with_ruble, String.valueOf(blackPassMainUIState.getRubValue()));
                                Bitmap imgRubBitmap = blackPassMainUIState.getImgRubBitmap();
                                CommonRarityEnum commonRarityEnum = CommonRarityEnum.COMMON;
                                Intrinsics.checkNotNull(string3);
                                donateMainViewModel2.clickPreviewPrize(imgRubBitmap, string3, id, 0, 4, 1, (r20 & 64) != 0 ? -1 : 0, (r20 & 128) != 0 ? CommonRarityEnum.COMMON : commonRarityEnum);
                            }
                        }
                    };
                    final GUIBlackPassMain gUIBlackPassMain11 = GUIBlackPassMain.this;
                    BlackPassMainUIKt.m7325BlackPassMainUIpoRtVFs(string, string2, bpLevel, valueOfExperience, maxLevelExp, seasonBitmapImage, seasonBitmapImageForRewards, Color, seasonName, bpBtnColor, bpBtnBg, tasksBtnColor, tasksBtnBg, ratingBtnColor, ratingBtnBg, selectedLayout, dailyCategoryImageBitmap, premiumBitmapImage, vipState, isActiveVip, rewardsList, specialTasksList, dailyTasksList, weeklyTimerForEndCategory, selectedCategoryTask, specialCategoryImageBitmap, dailyCategoryImageBitmap2, myPlaceInRating, ratingList, ratingBgImage, bpExpBitmap, imgOfferSplit, activatePremiumSubtitle, activatePremiumDeluxeSubtitle, nameDeluxeCar, imgDeluxeCar, premiumPrice, premiumDeluxePrice, isButtonBuyPremiumEnabled, bannerTitlePrize1, function0, function02, function03, function04, function1, function2, function22, function05, function12, function13, new Function1<CommonTaskModel, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1.11

                        /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
                        /* compiled from: GUIBlackPassMain.kt */
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$11$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[CommonTaskState.values().length];
                                try {
                                    iArr[CommonTaskState.UNAVAILABLE_STATE.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[CommonTaskState.GET_STATE.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[CommonTaskState.COMPLETED_STATE.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(CommonTaskModel commonTaskModel) {
                            invoke2(commonTaskModel);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull CommonTaskModel task) {
                            DonateMainViewModel donateMainViewModel;
                            BlackPassMainViewModel blackPassMainViewModel2;
                            DonateMainViewModel donateMainViewModel2;
                            BlackPassMainViewModel blackPassMainViewModel3;
                            Intrinsics.checkNotNullParameter(task, "task");
                            int i2 = WhenMappings.$EnumSwitchMapping$0[task.getStateOfTask().ordinal()];
                            if (i2 == 1) {
                                donateMainViewModel = GUIBlackPassMain.this.getDonateMainViewModel();
                                DonateMainViewModel.showNewFragment$default(donateMainViewModel, 102, false, false, 4, null);
                                blackPassMainViewModel2 = GUIBlackPassMain.this.getBlackPassMainViewModel();
                                blackPassMainViewModel2.sendShowCurrentLayout(4);
                                return;
                            }
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    blackPassMainViewModel3 = GUIBlackPassMain.this.getBlackPassMainViewModel();
                                    blackPassMainViewModel3.onShowTaskDialog(task);
                                    return;
                                }
                                return;
                            }
                            donateMainViewModel2 = GUIBlackPassMain.this.getDonateMainViewModel();
                            int id = task.getId();
                            String string3 = GUIBlackPassMain.this.getString(R.string.common_string_with_ruble, String.valueOf(blackPassMainUIState.getRubValue()));
                            Bitmap imgRubBitmap = blackPassMainUIState.getImgRubBitmap();
                            CommonRarityEnum commonRarityEnum = CommonRarityEnum.COMMON;
                            Intrinsics.checkNotNull(string3);
                            donateMainViewModel2.clickPreviewPrize(imgRubBitmap, string3, id, 0, 4, 1, (r20 & 64) != 0 ? -1 : 0, (r20 & 128) != 0 ? CommonRarityEnum.COMMON : commonRarityEnum);
                        }
                    }, composer, 2359296, 18874368, 1210319432, 262216, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }));
        initCustomDialog();
        initTasksDialog();
    }

    public final void initTasksDialog() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        BlackPassTaskInfoDialog blackPassTaskInfoDialog = new BlackPassTaskInfoDialog(requireActivity);
        this.taskDialog = blackPassTaskInfoDialog;
        blackPassTaskInfoDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                GUIBlackPassMain.initTasksDialog$lambda$0(GUIBlackPassMain.this, dialogInterface);
            }
        });
    }

    public static final void initTasksDialog$lambda$0(GUIBlackPassMain this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBlackPassMainViewModel().onShowTaskDialog(null);
    }

    public final void initCustomDialog() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        this.customDialog = new BlackPassCustomDialog(requireActivity);
        initCustomDialogClickListener();
    }

    public final void initCustomDialogClickListener() {
        BlackPassCustomDialog blackPassCustomDialog = this.customDialog;
        if (blackPassCustomDialog == null) {
            return;
        }
        blackPassCustomDialog.setDialogClickListener(new Function3<Integer, Integer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initCustomDialogClickListener$1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3) {
                invoke(num.intValue(), num2, num3);
                return Unit.INSTANCE;
            }

            public final void invoke(int i, @Nullable Integer num, @Nullable Integer num2) {
                BlackPassMainViewModel blackPassMainViewModel;
                DonateMainViewModel donateMainViewModel;
                DonateMainViewModel donateMainViewModel2;
                BlackPassMainViewModel blackPassMainViewModel2;
                BlackPassMainViewModel blackPassMainViewModel3;
                BlackPassMainViewModel blackPassMainViewModel4;
                BlackPassMainViewModel blackPassMainViewModel5;
                if (i == 0) {
                    if (num != null) {
                        blackPassMainViewModel = GUIBlackPassMain.this.getBlackPassMainViewModel();
                        blackPassMainViewModel.customDialogConfirmationLevelUp(num.intValue());
                        donateMainViewModel = GUIBlackPassMain.this.getDonateMainViewModel();
                        donateMainViewModel.setShowLastChanceBPBoostView(false);
                        return;
                    }
                    return;
                }
                if (i == 1) {
                    donateMainViewModel2 = GUIBlackPassMain.this.getDonateMainViewModel();
                    DonateMainViewModel.showNewFragment$default(donateMainViewModel2, 9, false, false, 4, null);
                    return;
                }
                if (i == 2) {
                    blackPassMainViewModel2 = GUIBlackPassMain.this.getBlackPassMainViewModel();
                    blackPassMainViewModel2.onShowTaskDialog(null);
                    blackPassMainViewModel3 = GUIBlackPassMain.this.getBlackPassMainViewModel();
                    blackPassMainViewModel3.sendExchangeTask(IntExtensionKt.getOrZero(num2));
                    return;
                }
                if (i == 3) {
                    blackPassMainViewModel4 = GUIBlackPassMain.this.getBlackPassMainViewModel();
                    blackPassMainViewModel4.purchasePremium(1);
                } else {
                    if (i != 4) {
                        return;
                    }
                    blackPassMainViewModel5 = GUIBlackPassMain.this.getBlackPassMainViewModel();
                    blackPassMainViewModel5.purchasePremium(0);
                }
            }
        });
    }

    public final void requestInitData() {
        getBlackPassMainViewModel().requestInitData();
    }

    private final void setObservers() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUIBlackPassMain$setObservers$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUIBlackPassMain$setObservers$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUIBlackPassMain$setObservers$3(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUIBlackPassMain$setObservers$4(this, null), 3, null);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        clearViewModel();
        setNullableParameters();
        super.onDestroyView();
        getBlackPassMainViewModel().setStartLayout(0);
    }

    public final void clearViewModel() {
        getBlackPassMainViewModel().clearViewModel();
    }

    private final void setNullableParameters() {
        BlackPassCustomDialog blackPassCustomDialog = this.customDialog;
        if (blackPassCustomDialog != null) {
            blackPassCustomDialog.dismissDialog();
        }
        this.customDialog = null;
    }
}
