package com.blackhub.bronline.game.gui.donate.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
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
import com.blackhub.bronline.databinding.DonateTileLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.dotrvindicator.DotViewIndicator;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.blackhub.bronline.game.gui.donate.adapters.DonateTileAdapter;
import com.blackhub.bronline.game.gui.donate.data.DonateItem;
import com.blackhub.bronline.game.gui.donate.utils.DonateUtilsKt;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UILayoutDonateTile.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0002H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0012H\u0002J\b\u0010 \u001a\u00020\u0019H\u0002J\u0018\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010#\u001a\u00020\u0019H\u0016J\b\u0010$\u001a\u00020\u0019H\u0016J\b\u0010%\u001a\u00020\u0019H\u0002J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0012H\u0002J\u0010\u0010,\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0012H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/blackhub/bronline/game/gui/donate/ui/UILayoutDonateTile;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/DonateTileLayoutBinding;", "()V", "donateBodyAdapter", "Lcom/blackhub/bronline/game/gui/donate/adapters/DonateTileAdapter;", "donateMainViewModel", "Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateMainViewModel;", "getDonateMainViewModel", "()Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateMainViewModel;", "donateMainViewModel$delegate", "Lkotlin/Lazy;", "donateTileViewModel", "Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateTileViewModel;", "getDonateTileViewModel", "()Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateTileViewModel;", "donateTileViewModel$delegate", "oldPage", "", "oldSize", "getValueOfWidthPixels", "mainActivity", "Landroid/app/Activity;", "getViewBinding", "initAndAttachAdapter", "", "width", "fragmentContext", "Landroid/content/Context;", "initButtonClickListener", "initIndicator", CatchStreamerKeys.COUNT_KEY, "initListeners", "initTitlePage", "newPage", "initViews", "onDestroyView", "setNullableParameters", "setObservers", "setTitlePage", "newTitle", "", "setVisibleButtonBack", "isVisible", "setVisibleIndicator", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUILayoutDonateTile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UILayoutDonateTile.kt\ncom/blackhub/bronline/game/gui/donate/ui/UILayoutDonateTile\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,276:1\n106#2,15:277\n106#2,15:292\n*S KotlinDebug\n*F\n+ 1 UILayoutDonateTile.kt\ncom/blackhub/bronline/game/gui/donate/ui/UILayoutDonateTile\n*L\n54#1:277,15\n55#1:292,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UILayoutDonateTile extends BaseFragment<DonateTileLayoutBinding> {
    public static final int $stable = 8;

    @Nullable
    public DonateTileAdapter donateBodyAdapter;

    /* renamed from: donateMainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy donateMainViewModel;

    /* renamed from: donateTileViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy donateTileViewModel;
    public int oldPage;
    public int oldSize;

    public UILayoutDonateTile() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile$donateTileViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UILayoutDonateTile.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile$special$$inlined$viewModels$default$1
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
        this.donateTileViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DonateTileViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function03 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile$donateMainViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UILayoutDonateTile.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile$special$$inlined$viewModels$default$5
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
        this.donateMainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DonateMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile$special$$inlined$viewModels$default$6
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile$special$$inlined$viewModels$default$7
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile$special$$inlined$viewModels$default$8
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
        this.oldPage = -1;
        this.oldSize = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DonateTileViewModel getDonateTileViewModel() {
        return (DonateTileViewModel) this.donateTileViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DonateMainViewModel getDonateMainViewModel() {
        return (DonateMainViewModel) this.donateMainViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public DonateTileLayoutBinding getViewBinding() {
        DonateTileLayoutBinding inflate = DonateTileLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        initAndAttachAdapter(getValueOfWidthPixels(requireActivity), requireContext);
        setObservers(requireContext);
        initListeners();
    }

    public final void initAndAttachAdapter(int width, Context fragmentContext) {
        DonateTileAdapter donateTileAdapter = new DonateTileAdapter(width, false, fragmentContext);
        donateTileAdapter.setBlockRenderItem(new Function1<Long, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile$initAndAttachAdapter$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                invoke(l.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j) {
                DonateMainViewModel donateMainViewModel;
                donateMainViewModel = UILayoutDonateTile.this.getDonateMainViewModel();
                donateMainViewModel.setBLockTimer(j);
            }
        });
        this.donateBodyAdapter = donateTileAdapter;
        initButtonClickListener(fragmentContext);
        getBinding().mainRV.setAdapter(this.donateBodyAdapter);
        RecyclerView recyclerView = getBinding().mainRV;
        recyclerView.setLayoutManager(new LinearLayoutManager(fragmentContext, 0, false));
        recyclerView.setAdapter(this.donateBodyAdapter);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile$initAndAttachAdapter$2$1
            public int oldPage = -1;

            public final int getOldPage() {
                return this.oldPage;
            }

            public final void setOldPage(int i) {
                this.oldPage = i;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(@NotNull RecyclerView recyclerView2, int newState) {
                DonateTileLayoutBinding binding;
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                super.onScrollStateChanged(recyclerView2, newState);
                if (newState == 0) {
                    Intrinsics.checkNotNull(recyclerView2.getLayoutManager(), "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    int ceil = (int) (Math.ceil(((LinearLayoutManager) r3).findLastVisibleItemPosition() / 4) - 1);
                    if (this.oldPage != ceil) {
                        binding = UILayoutDonateTile.this.getBinding();
                        binding.rvIndicator.setCurrentPosition(ceil);
                    }
                    this.oldPage = ceil;
                }
            }
        });
    }

    public final void initButtonClickListener(final Context fragmentContext) {
        DonateTileAdapter donateTileAdapter = this.donateBodyAdapter;
        if (donateTileAdapter == null) {
            return;
        }
        donateTileAdapter.setButtonClickListener(new Function5<Integer, DonateItem, Integer, Integer, View, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile$initButtonClickListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(5);
            }

            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, DonateItem donateItem, Integer num2, Integer num3, View view) {
                invoke(num.intValue(), donateItem, num2.intValue(), num3.intValue(), view);
                return Unit.INSTANCE;
            }

            public final void invoke(final int i, @NotNull final DonateItem currentItem, final int i2, final int i3, @NotNull View view) {
                Intrinsics.checkNotNullParameter(currentItem, "currentItem");
                Intrinsics.checkNotNullParameter(view, "view");
                final UILayoutDonateTile uILayoutDonateTile = UILayoutDonateTile.this;
                final Context context = fragmentContext;
                uILayoutDonateTile.startAnimAndDelay(view, 500L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile$initButtonClickListener$1.1
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
                        DonateMainViewModel donateMainViewModel;
                        DonateTileViewModel donateTileViewModel;
                        DonateMainViewModel donateMainViewModel2;
                        DonateMainViewModel donateMainViewModel3;
                        DonateTileViewModel donateTileViewModel2;
                        DonateMainViewModel donateMainViewModel4;
                        DonateMainViewModel donateMainViewModel5;
                        DonateMainViewModel donateMainViewModel6;
                        DonateMainViewModel donateMainViewModel7;
                        donateMainViewModel = UILayoutDonateTile.this.getDonateMainViewModel();
                        donateMainViewModel.saveCurrentItem(currentItem, i3);
                        switch (i) {
                            case 0:
                                donateTileViewModel = UILayoutDonateTile.this.getDonateTileViewModel();
                                donateTileViewModel.openingSurprise();
                                break;
                            case 1:
                                donateMainViewModel2 = UILayoutDonateTile.this.getDonateMainViewModel();
                                String string = context.getString(R.string.donate_action_buy_item);
                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                int i4 = i3;
                                String priceText = DonateUtilsKt.getPriceText(currentItem);
                                String string2 = context.getString(R.string.common_confirmation);
                                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                String string3 = context.getString(R.string.common_yes);
                                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                                String string4 = context.getString(R.string.common_no);
                                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                                donateMainViewModel2.showDialogConfirmation(string, i4, priceText, string2, string3, string4, null);
                                break;
                            case 2:
                                donateMainViewModel3 = UILayoutDonateTile.this.getDonateMainViewModel();
                                DonateMainViewModel.showNewFragment$default(donateMainViewModel3, i, false, false, 4, null);
                                break;
                            case 3:
                            case 6:
                                donateTileViewModel2 = UILayoutDonateTile.this.getDonateTileViewModel();
                                donateTileViewModel2.getCarsOrVIPFromCurrentCategory(currentItem.getInternalId(), i2);
                                UILayoutDonateTile.this.setVisibleButtonBack(0);
                                break;
                            case 4:
                                donateMainViewModel4 = UILayoutDonateTile.this.getDonateMainViewModel();
                                DonateMainViewModel.showNewFragment$default(donateMainViewModel4, i, false, false, 4, null);
                                break;
                            case 5:
                                donateMainViewModel5 = UILayoutDonateTile.this.getDonateMainViewModel();
                                DonateMainViewModel.showNewFragment$default(donateMainViewModel5, i, false, false, 4, null);
                                break;
                            case 7:
                                donateMainViewModel6 = UILayoutDonateTile.this.getDonateMainViewModel();
                                String string5 = context.getString(R.string.donate_action_buy_item);
                                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                                int i5 = i3;
                                String priceText2 = DonateUtilsKt.getPriceText(currentItem);
                                String string6 = context.getString(R.string.common_confirmation);
                                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                                String string7 = context.getString(R.string.common_yes);
                                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                                String string8 = context.getString(R.string.common_no);
                                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                                donateMainViewModel6.showDialogConfirmation(string5, i5, priceText2, string6, string7, string8, null);
                                break;
                            case 8:
                                donateMainViewModel7 = UILayoutDonateTile.this.getDonateMainViewModel();
                                donateMainViewModel7.showInputCustomValueOfRublesDialog();
                                break;
                        }
                    }
                });
            }
        });
    }

    public final void setVisibleButtonBack(int isVisible) {
        getBinding().donateButtonBack.setVisibility(isVisible);
    }

    public final void setVisibleIndicator(int isVisible) {
        getBinding().rvIndicator.setVisibility(isVisible);
    }

    public final int getValueOfWidthPixels(Activity mainActivity) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        if (Build.VERSION.SDK_INT >= 30) {
            currentWindowMetrics = ((WindowManager) mainActivity.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
            Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "getCurrentWindowMetrics(...)");
            bounds = currentWindowMetrics.getBounds();
            return bounds.width();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        mainActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public final void setObservers(Context fragmentContext) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutDonateTile$setObservers$1(this, fragmentContext, null), 3, null);
    }

    public final void initIndicator(int count) {
        if (count > 1) {
            setVisibleIndicator(0);
        } else {
            setVisibleIndicator(4);
        }
        DotViewIndicator dotViewIndicator = getBinding().rvIndicator;
        dotViewIndicator.setItemCount(count);
        dotViewIndicator.setCurrentPosition(0);
    }

    public final void initTitlePage(int newPage, Context fragmentContext) {
        String[] stringArray = fragmentContext.getResources().getStringArray(R.array.donate_tile_array_with_title);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        if (stringArray.length == 7) {
            if (newPage == 0) {
                String str = stringArray[0];
                Intrinsics.checkNotNullExpressionValue(str, "get(...)");
                setTitlePage(str);
                return;
            }
            if (newPage == 1) {
                String str2 = stringArray[1];
                Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
                setTitlePage(str2);
                return;
            }
            if (newPage == 2) {
                String str3 = stringArray[2];
                Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
                setTitlePage(str3);
                return;
            }
            if (newPage == 3) {
                String str4 = stringArray[3];
                Intrinsics.checkNotNullExpressionValue(str4, "get(...)");
                setTitlePage(str4);
                return;
            }
            if (newPage == 4) {
                String str5 = stringArray[4];
                Intrinsics.checkNotNullExpressionValue(str5, "get(...)");
                setTitlePage(str5);
            } else if (newPage == 6) {
                String str6 = stringArray[5];
                Intrinsics.checkNotNullExpressionValue(str6, "get(...)");
                setTitlePage(str6);
            } else {
                if (newPage != 11) {
                    return;
                }
                String str7 = stringArray[6];
                Intrinsics.checkNotNullExpressionValue(str7, "get(...)");
                setTitlePage(str7);
            }
        }
    }

    public final void setTitlePage(String newTitle) {
        getBinding().donateTextHeader.setText(newTitle);
    }

    private final void initListeners() {
        AppCompatButton donateButtonBack = getBinding().donateButtonBack;
        Intrinsics.checkNotNullExpressionValue(donateButtonBack, "donateButtonBack");
        setOnClickListenerWithAnimAndDelay(donateButtonBack, 1000L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile$initListeners$1
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
                DonateTileViewModel donateTileViewModel;
                donateTileViewModel = UILayoutDonateTile.this.getDonateTileViewModel();
                donateTileViewModel.clickButtonBack();
                UILayoutDonateTile.this.setVisibleButtonBack(4);
            }
        });
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        setNullableParameters();
        super.onDestroyView();
    }

    private final void setNullableParameters() {
        getBinding().mainRV.setAdapter(null);
        getBinding().mainRV.clearOnScrollListeners();
        this.donateBodyAdapter = null;
    }
}
