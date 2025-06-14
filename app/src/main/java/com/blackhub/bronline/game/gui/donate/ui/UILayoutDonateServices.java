package com.blackhub.bronline.game.gui.donate.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
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
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.DonateServicesLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.gui.donate.adapters.DonateServiceAdapter;
import com.blackhub.bronline.game.gui.donate.adapters.DonateTileAdapter;
import com.blackhub.bronline.game.gui.donate.data.DonateItem;
import com.blackhub.bronline.game.gui.donate.data.DonateTileObj;
import com.blackhub.bronline.game.gui.donate.utils.DonateConstants;
import com.blackhub.bronline.game.gui.donate.utils.DonateUtilsKt;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateServiceViewModel;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
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
/* compiled from: UILayoutDonateServices.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0016\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J\b\u0010!\u001a\u00020\u001cH\u0002J\b\u0010\"\u001a\u00020\u001cH\u0002J\b\u0010#\u001a\u00020\u001cH\u0016J\b\u0010$\u001a\u00020\u001cH\u0016J\b\u0010%\u001a\u00020\u001cH\u0002J\b\u0010&\u001a\u00020\u001cH\u0002J\b\u0010'\u001a\u00020\u001cH\u0002J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020 H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, d2 = {"Lcom/blackhub/bronline/game/gui/donate/ui/UILayoutDonateServices;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/DonateServicesLayoutBinding;", "()V", "donateCurrentService", "Lcom/blackhub/bronline/game/gui/donate/adapters/DonateTileAdapter;", "donateMainViewModel", "Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateMainViewModel;", "getDonateMainViewModel", "()Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateMainViewModel;", "donateMainViewModel$delegate", "Lkotlin/Lazy;", "donateServiceAdapter", "Lcom/blackhub/bronline/game/gui/donate/adapters/DonateServiceAdapter;", "fragmentContext", "Landroid/content/Context;", "getFragmentContext", "()Landroid/content/Context;", "fragmentContext$delegate", "serviceViewModel", "Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateServiceViewModel;", "getServiceViewModel", "()Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateServiceViewModel;", "serviceViewModel$delegate", "getValueOfWidthPixels", "", "getViewBinding", "initAndAttachCurrentService", "", "initAndAttachServices", "serviceItems", "", "Lcom/blackhub/bronline/game/gui/donate/data/DonateItem;", "initButtonClickListener", "initServiceClickListener", "initViews", "onDestroyView", "refreshSelectedItem", "serObservers", "setNullableParameters", "updateCurrentItem", "currentItem", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUILayoutDonateServices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UILayoutDonateServices.kt\ncom/blackhub/bronline/game/gui/donate/ui/UILayoutDonateServices\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,159:1\n106#2,15:160\n106#2,15:175\n*S KotlinDebug\n*F\n+ 1 UILayoutDonateServices.kt\ncom/blackhub/bronline/game/gui/donate/ui/UILayoutDonateServices\n*L\n32#1:160,15\n33#1:175,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UILayoutDonateServices extends BaseFragment<DonateServicesLayoutBinding> {
    public static final int $stable = 8;

    @Nullable
    public DonateTileAdapter donateCurrentService;

    /* renamed from: donateMainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy donateMainViewModel;

    @Nullable
    public DonateServiceAdapter donateServiceAdapter;

    /* renamed from: fragmentContext$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy fragmentContext;

    /* renamed from: serviceViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy serviceViewModel;

    public UILayoutDonateServices() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$donateMainViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UILayoutDonateServices.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$special$$inlined$viewModels$default$1
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
        this.donateMainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DonateMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function03 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$serviceViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UILayoutDonateServices.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$special$$inlined$viewModels$default$5
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
        this.serviceViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DonateServiceViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$special$$inlined$viewModels$default$6
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$special$$inlined$viewModels$default$7
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$special$$inlined$viewModels$default$8
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
        this.fragmentContext = LazyKt__LazyJVMKt.lazy(new Function0<Context>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$fragmentContext$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Context invoke() {
                return UILayoutDonateServices.this.requireContext();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DonateMainViewModel getDonateMainViewModel() {
        return (DonateMainViewModel) this.donateMainViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DonateServiceViewModel getServiceViewModel() {
        return (DonateServiceViewModel) this.serviceViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getFragmentContext() {
        return (Context) this.fragmentContext.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public DonateServicesLayoutBinding getViewBinding() {
        DonateServicesLayoutBinding inflate = DonateServicesLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        serObservers();
    }

    public final void serObservers() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutDonateServices$serObservers$1(this, null), 3, null);
    }

    public final void initAndAttachCurrentService() {
        Context fragmentContext = getFragmentContext();
        Intrinsics.checkNotNullExpressionValue(fragmentContext, "<get-fragmentContext>(...)");
        this.donateCurrentService = new DonateTileAdapter((int) (getValueOfWidthPixels() * 1.4d), true, fragmentContext);
        initButtonClickListener();
        RecyclerView recyclerView = getBinding().donateServiceCurrentItem;
        final Context fragmentContext2 = getFragmentContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(fragmentContext2) { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$initAndAttachCurrentService$1$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        recyclerView.setAdapter(this.donateCurrentService);
    }

    public final int getValueOfWidthPixels() {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        if (Build.VERSION.SDK_INT >= 30) {
            currentWindowMetrics = ((WindowManager) getFragmentContext().getSystemService(WindowManager.class)).getCurrentWindowMetrics();
            Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "getCurrentWindowMetrics(...)");
            bounds = currentWindowMetrics.getBounds();
            return bounds.width();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public final void initButtonClickListener() {
        DonateTileAdapter donateTileAdapter = this.donateCurrentService;
        if (donateTileAdapter == null) {
            return;
        }
        donateTileAdapter.setButtonClickListener(new Function5<Integer, DonateItem, Integer, Integer, View, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$initButtonClickListener$1
            {
                super(5);
            }

            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, DonateItem donateItem, Integer num2, Integer num3, View view) {
                invoke(num.intValue(), donateItem, num2.intValue(), num3.intValue(), view);
                return Unit.INSTANCE;
            }

            public final void invoke(final int i, @NotNull final DonateItem currentItem, int i2, final int i3, @NotNull View view) {
                Intrinsics.checkNotNullParameter(currentItem, "currentItem");
                Intrinsics.checkNotNullParameter(view, "view");
                final UILayoutDonateServices uILayoutDonateServices = UILayoutDonateServices.this;
                uILayoutDonateServices.startAnimAndDelay(view, 500L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$initButtonClickListener$1.1
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
                        Context fragmentContext;
                        Context fragmentContext2;
                        Context fragmentContext3;
                        Context fragmentContext4;
                        donateMainViewModel = UILayoutDonateServices.this.getDonateMainViewModel();
                        DonateItem donateItem = currentItem;
                        int i4 = i3;
                        int i5 = i;
                        UILayoutDonateServices uILayoutDonateServices2 = UILayoutDonateServices.this;
                        donateMainViewModel.setBLockTimer(System.currentTimeMillis());
                        donateMainViewModel.saveCurrentItem(donateItem, i4);
                        if (i5 == 7) {
                            fragmentContext = uILayoutDonateServices2.getFragmentContext();
                            String string = fragmentContext.getString(R.string.donate_action_buy_item);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            String priceText = DonateUtilsKt.getPriceText(donateItem);
                            fragmentContext2 = uILayoutDonateServices2.getFragmentContext();
                            String string2 = fragmentContext2.getString(R.string.common_confirmation);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            fragmentContext3 = uILayoutDonateServices2.getFragmentContext();
                            String string3 = fragmentContext3.getString(R.string.common_yes);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            fragmentContext4 = uILayoutDonateServices2.getFragmentContext();
                            String string4 = fragmentContext4.getString(R.string.common_no);
                            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                            donateMainViewModel.showDialogConfirmation(string, i4, priceText, string2, string3, string4, null);
                        }
                    }
                });
            }
        });
    }

    public final void initAndAttachServices(List<DonateItem> serviceItems) {
        this.donateServiceAdapter = new DonateServiceAdapter(serviceItems);
        RecyclerView recyclerView = getBinding().donateServicesRV;
        recyclerView.setLayoutManager(new LinearLayoutManager(getFragmentContext(), 1, false));
        recyclerView.setAdapter(this.donateServiceAdapter);
        initServiceClickListener();
    }

    public final void initServiceClickListener() {
        DonateServiceAdapter donateServiceAdapter = this.donateServiceAdapter;
        if (donateServiceAdapter == null) {
            return;
        }
        donateServiceAdapter.setServiceItemClickListener(new Function2<DonateItem, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$initServiceClickListener$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(DonateItem donateItem, Integer num) {
                invoke(donateItem, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull DonateItem currentObject, int i) {
                DonateServiceAdapter donateServiceAdapter2;
                Intrinsics.checkNotNullParameter(currentObject, "currentObject");
                donateServiceAdapter2 = UILayoutDonateServices.this.donateServiceAdapter;
                if (donateServiceAdapter2 != null) {
                    donateServiceAdapter2.updateSelectItem(i);
                }
                UILayoutDonateServices.this.updateCurrentItem(currentObject);
                Log.v(DonateConstants.DONATE_LOG, currentObject.toString());
            }
        });
    }

    public final void updateCurrentItem(DonateItem currentItem) {
        DonateTileAdapter donateTileAdapter = this.donateCurrentService;
        if (donateTileAdapter != null) {
            donateTileAdapter.initBodyItems(new DonateTileObj(CollectionsKt__CollectionsJVMKt.listOf(currentItem), 5));
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        refreshSelectedItem();
        setNullableParameters();
        super.onDestroyView();
    }

    public final void refreshSelectedItem() {
        DonateServiceAdapter donateServiceAdapter = this.donateServiceAdapter;
        if (donateServiceAdapter != null) {
            donateServiceAdapter.refreshSelectedItem();
        }
    }

    private final void setNullableParameters() {
        this.donateServiceAdapter = null;
        this.donateCurrentService = null;
    }
}
