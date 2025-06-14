package com.blackhub.bronline.game.gui.blackpass.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.LayoutBlackPassPremiumActivateBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.blackpass.utils.BlackPassUtils;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassActivateViewModel;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassPrizeListViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateDepositCoinsViewModel;
import kotlin.Deprecated;
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

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UIBlackPassActivateNew.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u001fH\u0002J\b\u0010#\u001a\u00020\u001fH\u0002J\u0010\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001aH\u0002J\b\u0010&\u001a\u00020\u001fH\u0016J\b\u0010'\u001a\u00020\u001fH\u0016J\b\u0010(\u001a\u00020\u001fH\u0002J\u0010\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u001cH\u0002J\u0010\u0010+\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020\u001fH\u0002J\b\u0010.\u001a\u00020\u001fH\u0002J\b\u0010/\u001a\u00020\u001fH\u0002J\b\u00100\u001a\u00020\u001fH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/blackhub/bronline/game/gui/blackpass/ui/UIBlackPassActivateNew;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/LayoutBlackPassPremiumActivateBinding;", "()V", "activateViewModel", "Lcom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassActivateViewModel;", "getActivateViewModel", "()Lcom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassActivateViewModel;", "activateViewModel$delegate", "Lkotlin/Lazy;", "blackPassPrizeListViewModel", "Lcom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassPrizeListViewModel;", "getBlackPassPrizeListViewModel", "()Lcom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassPrizeListViewModel;", "blackPassPrizeListViewModel$delegate", "blackPassViewModel", "Lcom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel;", "getBlackPassViewModel", "()Lcom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel;", "blackPassViewModel$delegate", "depositCoinsViewModel", "Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateDepositCoinsViewModel;", "getDepositCoinsViewModel", "()Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateDepositCoinsViewModel;", "depositCoinsViewModel$delegate", "isActivePremium", "", "premiumDeluxePrice", "", "premiumPrice", "clearViewModel", "", "getViewBinding", "initClickListeners", "initComposeAnimateBlock", "initDefaultPrices", "initPremiumClickListener", "isActiveButton", "initViews", "onDestroyView", "setObservers", "setPremiumDeluxePrice", "value", "setPremiumPrice", "", "showPrizesList", "updateDeluxePrize", "updatePrizeText", "updateTextTitle", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(message = "удалить после тестов")
@SourceDebugExtension({"SMAP\nUIBlackPassActivateNew.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIBlackPassActivateNew.kt\ncom/blackhub/bronline/game/gui/blackpass/ui/UIBlackPassActivateNew\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n1#1,288:1\n106#2,15:289\n106#2,15:304\n106#2,15:319\n106#2,15:334\n41#3,2:349\n115#3:351\n74#3,2:352\n87#3:354\n74#3,4:355\n76#3,2:359\n43#3:361\n41#3,2:362\n115#3:364\n74#3,2:365\n87#3:367\n74#3,4:368\n76#3,2:372\n43#3:374\n41#3,2:375\n115#3:377\n74#3,2:378\n87#3:380\n74#3,4:381\n76#3,2:385\n43#3:387\n*S KotlinDebug\n*F\n+ 1 UIBlackPassActivateNew.kt\ncom/blackhub/bronline/game/gui/blackpass/ui/UIBlackPassActivateNew\n*L\n33#1:289,15\n34#1:304,15\n35#1:319,15\n36#1:334,15\n100#1:349,2\n102#1:351\n102#1:352,2\n103#1:354\n103#1:355,4\n102#1:359,2\n100#1:361\n109#1:362,2\n111#1:364\n111#1:365,2\n112#1:367\n112#1:368,4\n111#1:372,2\n109#1:374\n121#1:375,2\n125#1:377\n125#1:378,2\n126#1:380\n126#1:381,4\n125#1:385,2\n121#1:387\n*E\n"})
/* loaded from: classes3.dex */
public final class UIBlackPassActivateNew extends BaseFragment<LayoutBlackPassPremiumActivateBinding> {
    public static final int $stable = 8;

    /* renamed from: activateViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy activateViewModel;

    /* renamed from: blackPassPrizeListViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy blackPassPrizeListViewModel;

    /* renamed from: blackPassViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy blackPassViewModel;

    /* renamed from: depositCoinsViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy depositCoinsViewModel;
    public boolean isActivePremium;
    public int premiumDeluxePrice;
    public int premiumPrice;

    public UIBlackPassActivateNew() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$activateViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UIBlackPassActivateNew.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$1
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
        this.activateViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BlackPassActivateViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function03 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$depositCoinsViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UIBlackPassActivateNew.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$5
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
        this.depositCoinsViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DonateDepositCoinsViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$6
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$7
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$8
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
        final Function0<ViewModelStoreOwner> function04 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$blackPassViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UIBlackPassActivateNew.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy3 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$9
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
        this.blackPassViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BlackPassMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$12
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
        final Function0<ViewModelStoreOwner> function05 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$blackPassPrizeListViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UIBlackPassActivateNew.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy4 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$13
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
        this.blackPassPrizeListViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BlackPassPrizeListViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$14
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$15
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$16
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
        this.premiumPrice = 599;
        this.premiumDeluxePrice = BlackPassUtils.DEFAULT_DELUXE_PRICE;
    }

    public final BlackPassActivateViewModel getActivateViewModel() {
        return (BlackPassActivateViewModel) this.activateViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DonateDepositCoinsViewModel getDepositCoinsViewModel() {
        return (DonateDepositCoinsViewModel) this.depositCoinsViewModel.getValue();
    }

    public final BlackPassMainViewModel getBlackPassViewModel() {
        return (BlackPassMainViewModel) this.blackPassViewModel.getValue();
    }

    private final BlackPassPrizeListViewModel getBlackPassPrizeListViewModel() {
        return (BlackPassPrizeListViewModel) this.blackPassPrizeListViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public LayoutBlackPassPremiumActivateBinding getViewBinding() {
        LayoutBlackPassPremiumActivateBinding inflate = LayoutBlackPassPremiumActivateBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        updateDeluxePrize();
        initDefaultPrices();
        updateTextTitle();
        updatePrizeText();
        setObservers();
        initClickListeners();
        initComposeAnimateBlock();
        getBinding().getRoot().setClickable(true);
        getBinding().getRoot().setFocusable(true);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        clearViewModel();
        super.onDestroyView();
    }

    private final void clearViewModel() {
        getActivateViewModel().clearViewModel();
    }

    public final void updateDeluxePrize() {
        getBinding().bannerBonusTitleText4.setText((CharSequence) UtilsKt.buildTypeMerge(getString(R.string.banner_title_prize_deluxe_site), getString(R.string.banner_title_prize_deluxe_market)));
    }

    public final void initDefaultPrices() {
        ImageView imageView = getBinding().bannerBonusIcon5;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        imageView.setImageBitmap(BitmapUtilsKt.getBitmapFromZip$default(requireContext, "ic_dust.svg", ImageTypePathInCDNEnum.ICON, 0.0f, 0.0f, 24, null));
        getBinding().btnPurchasePremium.setEnabled(false);
        getBinding().btnPurchasePremiumDeluxe.setEnabled(false);
        String string = getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(Integer.valueOf(this.premiumPrice)));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        setPremiumPrice(string);
        setPremiumDeluxePrice(this.premiumDeluxePrice);
    }

    public final void setPremiumPrice(String value) {
        getBinding().btnPurchasePremium.setText(value);
    }

    public final void setPremiumDeluxePrice(int value) {
        getBinding().btnPurchasePremiumDeluxe.setText(getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(Integer.valueOf(value))));
    }

    public final void updateTextTitle() {
        LayoutBlackPassPremiumActivateBinding binding = getBinding();
        TextView textView = binding.tvPremiumSubtitle;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) getString(R.string.black_pass_premium_subtitle_1));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ResourcesCompat.getColor(getResources(), R.color.yellow, null));
        int length = spannableStringBuilder.length();
        StyleSpan styleSpan = new StyleSpan(1);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) getString(R.string.black_pass_premium_subtitle_2));
        spannableStringBuilder.setSpan(styleSpan, length2, spannableStringBuilder.length(), 17);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        textView.setText(new SpannedString(spannableStringBuilder));
        TextView textView2 = binding.tvPremiumDeluxeSubtitle;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) getString(R.string.black_pass_premium_deluxe_subtitle_1));
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(ResourcesCompat.getColor(getResources(), R.color.yellow, null));
        int length3 = spannableStringBuilder2.length();
        StyleSpan styleSpan2 = new StyleSpan(1);
        int length4 = spannableStringBuilder2.length();
        spannableStringBuilder2.append((CharSequence) getString(R.string.black_pass_premium_title));
        spannableStringBuilder2.setSpan(styleSpan2, length4, spannableStringBuilder2.length(), 17);
        spannableStringBuilder2.setSpan(foregroundColorSpan2, length3, spannableStringBuilder2.length(), 17);
        textView2.setText(new SpannedString(spannableStringBuilder2));
    }

    public final void updatePrizeText() {
        TextView textView = getBinding().bannerBonusTitleText1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) getString(R.string.banner_title_prize_1_1));
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilder.append('\n'), "append(...)");
        spannableStringBuilder.append((CharSequence) getString(R.string.banner_title_prize_1_3));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ResourcesCompat.getColor(getResources(), R.color.red, null));
        int length = spannableStringBuilder.length();
        StyleSpan styleSpan = new StyleSpan(1);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) getString(R.string.banner_title_prize_1_4));
        spannableStringBuilder.setSpan(styleSpan, length2, spannableStringBuilder.length(), 17);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        textView.setText(new SpannedString(spannableStringBuilder));
    }

    private final void setObservers() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UIBlackPassActivateNew$setObservers$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UIBlackPassActivateNew$setObservers$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UIBlackPassActivateNew$setObservers$3(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UIBlackPassActivateNew$setObservers$4(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UIBlackPassActivateNew$setObservers$5(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UIBlackPassActivateNew$setObservers$6(this, null), 3, null);
    }

    public final void initPremiumClickListener(final boolean isActiveButton) {
        TextView btnPurchasePremium = getBinding().btnPurchasePremium;
        Intrinsics.checkNotNullExpressionValue(btnPurchasePremium, "btnPurchasePremium");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, btnPurchasePremium, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$initPremiumClickListener$1
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
                BlackPassMainViewModel blackPassViewModel;
                int i;
                DonateDepositCoinsViewModel depositCoinsViewModel;
                int i2;
                if (isActiveButton) {
                    blackPassViewModel = this.getBlackPassViewModel();
                    String string = this.getString(R.string.black_pass_activate_text_body);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    i = this.premiumPrice;
                    String string2 = this.getString(R.string.common_bc);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    String string3 = this.getString(R.string.common_confirmation);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    String string4 = this.getString(R.string.common_yes);
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    String string5 = this.getString(R.string.common_no);
                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                    BlackPassMainViewModel.showDialogConfirmation$default(blackPassViewModel, null, string, i, null, string2, string3, string4, string5, 3, 9, null);
                    depositCoinsViewModel = this.getDepositCoinsViewModel();
                    i2 = this.premiumPrice;
                    depositCoinsViewModel.saveIntermediatePremiumPrice(i2);
                }
            }
        }, 1, null);
    }

    private final void initClickListeners() {
        LayoutBlackPassPremiumActivateBinding binding = getBinding();
        TextView btnPurchasePremiumDeluxe = binding.btnPurchasePremiumDeluxe;
        Intrinsics.checkNotNullExpressionValue(btnPurchasePremiumDeluxe, "btnPurchasePremiumDeluxe");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, btnPurchasePremiumDeluxe, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$initClickListeners$1$1
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
                BlackPassMainViewModel blackPassViewModel;
                int i;
                DonateDepositCoinsViewModel depositCoinsViewModel;
                int i2;
                blackPassViewModel = UIBlackPassActivateNew.this.getBlackPassViewModel();
                String string = UIBlackPassActivateNew.this.getString(R.string.black_pass_activate_text_body);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                i = UIBlackPassActivateNew.this.premiumDeluxePrice;
                String string2 = UIBlackPassActivateNew.this.getString(R.string.common_bc);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String string3 = UIBlackPassActivateNew.this.getString(R.string.common_confirmation);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                String string4 = UIBlackPassActivateNew.this.getString(R.string.common_yes);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                String string5 = UIBlackPassActivateNew.this.getString(R.string.common_no);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                BlackPassMainViewModel.showDialogConfirmation$default(blackPassViewModel, null, string, i, null, string2, string3, string4, string5, 4, 9, null);
                depositCoinsViewModel = UIBlackPassActivateNew.this.getDepositCoinsViewModel();
                i2 = UIBlackPassActivateNew.this.premiumDeluxePrice;
                depositCoinsViewModel.saveIntermediatePremiumPrice(i2);
            }
        }, 1, null);
        ImageButton imgbShowPremiumPrizes = binding.imgbShowPremiumPrizes;
        Intrinsics.checkNotNullExpressionValue(imgbShowPremiumPrizes, "imgbShowPremiumPrizes");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, imgbShowPremiumPrizes, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$initClickListeners$1$2
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
                UIBlackPassActivateNew.this.showPrizesList();
            }
        }, 1, null);
        ImageButton imgbShowPremiumDeluxePrizes = binding.imgbShowPremiumDeluxePrizes;
        Intrinsics.checkNotNullExpressionValue(imgbShowPremiumDeluxePrizes, "imgbShowPremiumDeluxePrizes");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, imgbShowPremiumDeluxePrizes, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$initClickListeners$1$3
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
                UIBlackPassActivateNew.this.showPrizesList();
            }
        }, 1, null);
    }

    public final void showPrizesList() {
        getBlackPassPrizeListViewModel().isNeedShowDialog();
    }

    public final void initComposeAnimateBlock() {
        ComposeView composeView = getBinding().composeViewBlackPassBgEffect;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableSingletons$UIBlackPassActivateNewKt.INSTANCE.m6864getLambda1$app_siteRelease());
    }
}
