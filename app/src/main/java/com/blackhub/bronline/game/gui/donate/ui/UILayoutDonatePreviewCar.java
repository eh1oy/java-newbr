package com.blackhub.bronline.game.gui.donate.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
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
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.DonateCarPreviewLayoutBinding;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.donate.adapters.DonateCarColorAdapter;
import com.blackhub.bronline.game.gui.donate.data.CarColorItem;
import com.blackhub.bronline.game.gui.donate.data.DonateItem;
import com.blackhub.bronline.game.gui.donate.utils.DonateUtilsKt;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UILayoutDonatePreviewCar.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0012\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0016J\b\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0002J*\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u0014H\u0002J\b\u0010)\u001a\u00020\u001bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006*"}, d2 = {"Lcom/blackhub/bronline/game/gui/donate/ui/UILayoutDonatePreviewCar;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/DonateCarPreviewLayoutBinding;", "()V", "blockTimer", "", "donateCarColorAdapter", "Lcom/blackhub/bronline/game/gui/donate/adapters/DonateCarColorAdapter;", "donateMainViewModel", "Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateMainViewModel;", "getDonateMainViewModel", "()Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateMainViewModel;", "donateMainViewModel$delegate", "Lkotlin/Lazy;", "jniActivityViewModel", "Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "getJniActivityViewModel", "()Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "jniActivityViewModel$delegate", FirebaseAnalytics.Param.PRICE, "", "getPrice", "()I", "setPrice", "(I)V", "getViewBinding", "initOnClickListeners", "", "initOnColorClickListenerFromAdapter", "initRecyclerView", "initStartData", "initViews", "onDestroyView", "setDonateMainVMObservers", "setImageForItem", "image", "Landroid/widget/ImageView;", "item", "Lcom/blackhub/bronline/game/gui/donate/data/DonateItem;", "color1", "color2", "setupJNIActivityVMObservers", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUILayoutDonatePreviewCar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UILayoutDonatePreviewCar.kt\ncom/blackhub/bronline/game/gui/donate/ui/UILayoutDonatePreviewCar\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,223:1\n172#2,9:224\n106#2,15:233\n*S KotlinDebug\n*F\n+ 1 UILayoutDonatePreviewCar.kt\ncom/blackhub/bronline/game/gui/donate/ui/UILayoutDonatePreviewCar\n*L\n30#1:224,9\n31#1:233,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UILayoutDonatePreviewCar extends BaseFragment<DonateCarPreviewLayoutBinding> {
    public static final int $stable = 8;
    public long blockTimer;

    @Nullable
    public DonateCarColorAdapter donateCarColorAdapter;

    /* renamed from: donateMainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy donateMainViewModel;

    /* renamed from: jniActivityViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy jniActivityViewModel;
    public int price;

    public UILayoutDonatePreviewCar() {
        final Function0 function0 = null;
        this.jniActivityViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(JNIActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = Fragment.this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = Function0.this;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = Fragment.this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        final Function0<ViewModelStoreOwner> function02 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$donateMainViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UILayoutDonatePreviewCar.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$special$$inlined$viewModels$default$1
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
        this.donateMainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DonateMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$special$$inlined$viewModels$default$4
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JNIActivityViewModel getJniActivityViewModel() {
        return (JNIActivityViewModel) this.jniActivityViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DonateMainViewModel getDonateMainViewModel() {
        return (DonateMainViewModel) this.donateMainViewModel.getValue();
    }

    public final int getPrice() {
        return this.price;
    }

    public final void setPrice(int i) {
        this.price = i;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public DonateCarPreviewLayoutBinding getViewBinding() {
        DonateCarPreviewLayoutBinding inflate = DonateCarPreviewLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        setupJNIActivityVMObservers();
        this.blockTimer = System.currentTimeMillis();
        setDonateMainVMObservers();
        initRecyclerView();
        initOnClickListeners();
        initStartData();
    }

    public final void setupJNIActivityVMObservers() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutDonatePreviewCar$setupJNIActivityVMObservers$1(this, null), 3, null);
    }

    public final void setDonateMainVMObservers() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutDonatePreviewCar$setDonateMainVMObservers$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutDonatePreviewCar$setDonateMainVMObservers$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutDonatePreviewCar$setDonateMainVMObservers$3(this, null), 3, null);
    }

    public final void initOnClickListeners() {
        AppCompatButton donateButtonBack = getBinding().donateButtonBack;
        Intrinsics.checkNotNullExpressionValue(donateButtonBack, "donateButtonBack");
        setOnClickListenerWithAnimAndDelay(donateButtonBack, 1000L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$initOnClickListeners$1
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
                UILayoutDonatePreviewCar.this.getParentFragmentManager().popBackStack();
            }
        });
        AppCompatButton button = getBinding().button;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, button, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$initOnClickListeners$2
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
                DonateMainViewModel donateMainViewModel2;
                JNIActivityViewModel jniActivityViewModel;
                DonateCarColorAdapter donateCarColorAdapter;
                donateMainViewModel = UILayoutDonatePreviewCar.this.getDonateMainViewModel();
                String string = UILayoutDonatePreviewCar.this.getString(R.string.donate_action_buy_item);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                int price = UILayoutDonatePreviewCar.this.getPrice();
                donateMainViewModel2 = UILayoutDonatePreviewCar.this.getDonateMainViewModel();
                String priceText = DonateUtilsKt.getPriceText(donateMainViewModel2.getCurrentItem().getValue());
                String string2 = UILayoutDonatePreviewCar.this.getString(R.string.common_confirmation);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String string3 = UILayoutDonatePreviewCar.this.getString(R.string.common_yes);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                String string4 = UILayoutDonatePreviewCar.this.getString(R.string.common_no);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                jniActivityViewModel = UILayoutDonatePreviewCar.this.getJniActivityViewModel();
                List<CarColorItem> carColorItems = jniActivityViewModel.getConfigurationJsons().getValue().getCarColorItems();
                donateCarColorAdapter = UILayoutDonatePreviewCar.this.donateCarColorAdapter;
                CarColorItem carColorItem = (CarColorItem) CollectionsKt___CollectionsKt.getOrNull(carColorItems, donateCarColorAdapter != null ? donateCarColorAdapter.getSelected() : 0);
                donateMainViewModel.showDialogConfirmation(string, price, priceText, string2, string3, string4, carColorItem != null ? Integer.valueOf(carColorItem.getGameColor()) : null);
            }
        }, 1, null);
    }

    public final void initRecyclerView() {
        DonateCarColorAdapter donateCarColorAdapter = new DonateCarColorAdapter();
        this.donateCarColorAdapter = donateCarColorAdapter;
        initOnColorClickListenerFromAdapter(donateCarColorAdapter);
        getBinding().colorSelectRV.setAdapter(this.donateCarColorAdapter);
    }

    public final void initOnColorClickListenerFromAdapter(DonateCarColorAdapter donateCarColorAdapter) {
        if (donateCarColorAdapter == null) {
            return;
        }
        donateCarColorAdapter.setOnColorClickListener(new Function2<Integer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$initOnColorClickListenerFromAdapter$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
                invoke(num.intValue(), num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i, int i2) {
                DonateMainViewModel donateMainViewModel;
                DonateMainViewModel donateMainViewModel2;
                DonateMainViewModel donateMainViewModel3;
                DonateCarPreviewLayoutBinding binding;
                DonateCarPreviewLayoutBinding binding2;
                DonateMainViewModel donateMainViewModel4;
                DonateCarPreviewLayoutBinding binding3;
                DonateMainViewModel donateMainViewModel5;
                DonateMainViewModel donateMainViewModel6;
                DonateMainViewModel donateMainViewModel7;
                Integer num;
                DonateCarPreviewLayoutBinding binding4;
                DonateMainViewModel donateMainViewModel8;
                if (i > 0) {
                    UILayoutDonatePreviewCar uILayoutDonatePreviewCar = UILayoutDonatePreviewCar.this;
                    donateMainViewModel5 = uILayoutDonatePreviewCar.getDonateMainViewModel();
                    uILayoutDonatePreviewCar.setPrice(donateMainViewModel5.getCarPriceWithColor().getValue().intValue());
                    donateMainViewModel6 = UILayoutDonatePreviewCar.this.getDonateMainViewModel();
                    if (donateMainViewModel6.getCurrentItem().getValue().getSalePercent() != 0) {
                        donateMainViewModel7 = UILayoutDonatePreviewCar.this.getDonateMainViewModel();
                        Integer basePrice = donateMainViewModel7.getCurrentItem().getValue().getBasePrice();
                        if (basePrice != null) {
                            int intValue = basePrice.intValue();
                            donateMainViewModel8 = UILayoutDonatePreviewCar.this.getDonateMainViewModel();
                            num = Integer.valueOf(intValue + donateMainViewModel8.getColorPrice().getValue().intValue());
                        } else {
                            num = null;
                        }
                        binding4 = UILayoutDonatePreviewCar.this.getBinding();
                        binding4.priceStroked.setText(UILayoutDonatePreviewCar.this.getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(num)));
                    }
                } else {
                    UILayoutDonatePreviewCar uILayoutDonatePreviewCar2 = UILayoutDonatePreviewCar.this;
                    donateMainViewModel = uILayoutDonatePreviewCar2.getDonateMainViewModel();
                    uILayoutDonatePreviewCar2.setPrice(donateMainViewModel.getCurrentPrice().getValue().intValue());
                    donateMainViewModel2 = UILayoutDonatePreviewCar.this.getDonateMainViewModel();
                    if (donateMainViewModel2.getCurrentItem().getValue().getSalePercent() != 0) {
                        donateMainViewModel3 = UILayoutDonatePreviewCar.this.getDonateMainViewModel();
                        Integer basePrice2 = donateMainViewModel3.getCurrentItem().getValue().getBasePrice();
                        binding = UILayoutDonatePreviewCar.this.getBinding();
                        binding.priceStroked.setText(UILayoutDonatePreviewCar.this.getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(basePrice2)));
                    }
                }
                UILayoutDonatePreviewCar uILayoutDonatePreviewCar3 = UILayoutDonatePreviewCar.this;
                binding2 = uILayoutDonatePreviewCar3.getBinding();
                ImageView donateCarPreviewImage = binding2.donateCarPreviewImage;
                Intrinsics.checkNotNullExpressionValue(donateCarPreviewImage, "donateCarPreviewImage");
                donateMainViewModel4 = UILayoutDonatePreviewCar.this.getDonateMainViewModel();
                uILayoutDonatePreviewCar3.setImageForItem(donateCarPreviewImage, donateMainViewModel4.getCurrentItem().getValue(), i2, i2);
                binding3 = UILayoutDonatePreviewCar.this.getBinding();
                AppCompatButton appCompatButton = binding3.button;
                UILayoutDonatePreviewCar uILayoutDonatePreviewCar4 = UILayoutDonatePreviewCar.this;
                appCompatButton.setText(uILayoutDonatePreviewCar4.getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(Integer.valueOf(uILayoutDonatePreviewCar4.getPrice()))));
            }
        });
    }

    public final void initStartData() {
        this.price = getDonateMainViewModel().getCurrentPrice().getValue().intValue();
        ImageView donateCarPreviewImage = getBinding().donateCarPreviewImage;
        Intrinsics.checkNotNullExpressionValue(donateCarPreviewImage, "donateCarPreviewImage");
        setImageForItem(donateCarPreviewImage, getDonateMainViewModel().getCurrentItem().getValue(), 0, 0);
    }

    public final void setImageForItem(final ImageView image, DonateItem item, int color1, int color2) {
        if ((item != null ? item.getType() : null) == null || item.getInternalId() == null || item.getGameId() == null) {
            return;
        }
        image.setAlpha(0.0f);
        GameRender gameRender = GameRender.getInstance();
        Integer type = item.getType();
        Intrinsics.checkNotNull(type);
        int intValue = type.intValue();
        Integer internalId = item.getInternalId();
        Intrinsics.checkNotNull(internalId);
        int intValue2 = internalId.intValue();
        Integer gameId = item.getGameId();
        Intrinsics.checkNotNull(gameId);
        gameRender.RequestRender(intValue, intValue2, gameId.intValue(), color1, color2, 20.0f, 180.0f, 45.0f, 0.85f, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$$ExternalSyntheticLambda0
            @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
            public final void OnRenderComplete(int i, Bitmap bitmap) {
                UILayoutDonatePreviewCar.setImageForItem$lambda$1(UILayoutDonatePreviewCar.this, image, i, bitmap);
            }
        });
    }

    public static final void setImageForItem$lambda$1(UILayoutDonatePreviewCar this$0, final ImageView image, int i, final Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(image, "$image");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UILayoutDonatePreviewCar.setImageForItem$lambda$1$lambda$0(image, bitmap);
                }
            });
        }
    }

    public static final void setImageForItem$lambda$1$lambda$0(ImageView image, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(image, "$image");
        try {
            image.setImageBitmap(bitmap);
            image.animate().alpha(1.0f).setDuration(300L);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.donateCarColorAdapter = null;
        super.onDestroyView();
    }
}
