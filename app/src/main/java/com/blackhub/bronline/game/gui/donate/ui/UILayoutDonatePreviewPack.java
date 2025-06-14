package com.blackhub.bronline.game.gui.donate.ui;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.text.HtmlCompat;
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
import com.blackhub.bronline.databinding.DonatePackPreviewLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.donate.adapters.DonatePreviewPackAdapter;
import com.blackhub.bronline.game.gui.donate.data.DonateItem;
import com.blackhub.bronline.game.gui.donate.utils.DonateUtilsKt;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UILayoutDonatePreviewPack.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/blackhub/bronline/game/gui/donate/ui/UILayoutDonatePreviewPack;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/DonatePackPreviewLayoutBinding;", "()V", "donateMainVM", "Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateMainViewModel;", "getDonateMainVM", "()Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateMainViewModel;", "donateMainVM$delegate", "Lkotlin/Lazy;", "jniActivityViewModel", "Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "getJniActivityViewModel", "()Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "jniActivityViewModel$delegate", "getViewBinding", "initViews", "", "setupHeader", "item", "Lcom/blackhub/bronline/game/gui/donate/data/DonateItem;", "setupImage", "setupRecyclerView", "setupSetOnClickListeners", "setupStrokedPrice", "setupVMObservers", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUILayoutDonatePreviewPack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UILayoutDonatePreviewPack.kt\ncom/blackhub/bronline/game/gui/donate/ui/UILayoutDonatePreviewPack\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n106#2,15:131\n172#2,9:146\n1#3:155\n*S KotlinDebug\n*F\n+ 1 UILayoutDonatePreviewPack.kt\ncom/blackhub/bronline/game/gui/donate/ui/UILayoutDonatePreviewPack\n*L\n34#1:131,15\n35#1:146,9\n*E\n"})
/* loaded from: classes3.dex */
public final class UILayoutDonatePreviewPack extends BaseFragment<DonatePackPreviewLayoutBinding> {
    public static final int $stable = 8;

    /* renamed from: donateMainVM$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy donateMainVM;

    /* renamed from: jniActivityViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy jniActivityViewModel;

    public UILayoutDonatePreviewPack() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack$donateMainVM$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UILayoutDonatePreviewPack.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack$special$$inlined$viewModels$default$1
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
        this.donateMainVM = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DonateMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack$special$$inlined$viewModels$default$4
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
        this.jniActivityViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(JNIActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = Function0.this;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack$special$$inlined$activityViewModels$default$3
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
    }

    public final DonateMainViewModel getDonateMainVM() {
        return (DonateMainViewModel) this.donateMainVM.getValue();
    }

    private final JNIActivityViewModel getJniActivityViewModel() {
        return (JNIActivityViewModel) this.jniActivityViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public DonatePackPreviewLayoutBinding getViewBinding() {
        DonatePackPreviewLayoutBinding inflate = DonatePackPreviewLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        setupVMObservers();
        setupSetOnClickListeners();
    }

    public final void setupVMObservers() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutDonatePreviewPack$setupVMObservers$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutDonatePreviewPack$setupVMObservers$2(this, null), 3, null);
    }

    public final void setupHeader(DonateItem item) {
        Integer type;
        Integer type2;
        if (item.getType() != null && (type2 = item.getType()) != null && type2.intValue() == 3) {
            getBinding().header.setText(HtmlCompat.fromHtml("<font color='#FFFFFF'>Набор</font> <font color='#E2310C'>" + UtilsKt.buildTypeMerge(item.getHeader(), item.getHeaderStore()) + "</font>", 0));
        }
        if (item.getType() == null || (type = item.getType()) == null || type.intValue() != 9 || UtilsKt.buildTypeMerge(item.getDesc(), item.getDescStore()) == null) {
            return;
        }
        getBinding().header.setText(UsefulKt.transformColors((String) UtilsKt.buildTypeMerge(item.getDesc(), item.getDescStore())));
    }

    public final void setupImage(DonateItem item) {
        ImageView image = getBinding().image;
        Intrinsics.checkNotNullExpressionValue(image, "image");
        ViewExtensionKt.loadImage$default(image, Useful.INSTANCE.getDrawableByName(item.getImageId()), 0, null, 6, null);
    }

    public final void setupStrokedPrice(DonateItem item) {
        if (item.getSalePercent() != 0) {
            TextView textView = getBinding().strokedPrice;
            textView.setPaintFlags(16);
            textView.setText(getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(item.getBasePrice())));
        }
    }

    public final void setupRecyclerView(DonateItem item) {
        DonateItem donateItem;
        Object obj;
        List<Integer> contains = item.getContains();
        if (contains == null || contains.isEmpty()) {
            FirebaseCrashlytics.getInstance().log("dolbaeb " + item.getInternalId());
            FirebaseCrashlytics.getInstance().recordException(new Throwable());
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<DonateItem> donateItemsFromJson = getJniActivityViewModel().getConfigurationJsons().getValue().getDonateItemsFromJson();
        List<Integer> contains2 = item.getContains();
        IntRange indices = contains2 != null ? CollectionsKt__CollectionsKt.getIndices(contains2) : null;
        Intrinsics.checkNotNull(indices);
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first <= last) {
            while (true) {
                List<Integer> contains3 = item.getContains();
                Integer num = contains3 != null ? contains3.get(first) : null;
                if (donateItemsFromJson != null) {
                    Iterator<T> it = donateItemsFromJson.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (Intrinsics.areEqual(((DonateItem) obj).getInternalId(), num)) {
                                break;
                            }
                        }
                    }
                    donateItem = (DonateItem) obj;
                } else {
                    donateItem = null;
                }
                Integer type = item.getType();
                if (type != null && type.intValue() == 7) {
                    Object buildTypeMerge = UtilsKt.buildTypeMerge(donateItem != null ? donateItem.getHeader() : null, donateItem != null ? donateItem.getHeaderStore() : null);
                    arrayList.add(buildTypeMerge + " " + UtilsKt.buildTypeMerge(donateItem != null ? donateItem.getSubheader() : null, donateItem != null ? donateItem.getSubheaderStore() : null));
                } else {
                    arrayList.add(UtilsKt.buildTypeMerge(donateItem != null ? donateItem.getHeader() : null, donateItem != null ? donateItem.getHeaderStore() : null));
                }
                if (first == last) {
                    break;
                } else {
                    first++;
                }
            }
        }
        RecyclerView recyclerView = getBinding().donatePackRV;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
        recyclerView.setAdapter(new DonatePreviewPackAdapter(arrayList));
    }

    private final void setupSetOnClickListeners() {
        AppCompatButton donateButtonBack = getBinding().donateButtonBack;
        Intrinsics.checkNotNullExpressionValue(donateButtonBack, "donateButtonBack");
        setOnClickListenerWithAnimAndDelay(donateButtonBack, 1000L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack$setupSetOnClickListeners$1
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
                UILayoutDonatePreviewPack.this.getParentFragmentManager().popBackStack();
            }
        });
        AppCompatButton button = getBinding().button;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, button, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack$setupSetOnClickListeners$2
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
                DonateMainViewModel donateMainVM;
                DonateMainViewModel donateMainVM2;
                DonateMainViewModel donateMainVM3;
                donateMainVM = UILayoutDonatePreviewPack.this.getDonateMainVM();
                String string = UILayoutDonatePreviewPack.this.getString(R.string.donate_action_buy_item);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                donateMainVM2 = UILayoutDonatePreviewPack.this.getDonateMainVM();
                int intValue = donateMainVM2.getCurrentPrice().getValue().intValue();
                donateMainVM3 = UILayoutDonatePreviewPack.this.getDonateMainVM();
                String priceText = DonateUtilsKt.getPriceText(donateMainVM3.getCurrentItem().getValue());
                String string2 = UILayoutDonatePreviewPack.this.getString(R.string.common_confirmation);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String string3 = UILayoutDonatePreviewPack.this.getString(R.string.common_yes);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                String string4 = UILayoutDonatePreviewPack.this.getString(R.string.common_no);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                donateMainVM.showDialogConfirmation(string, intValue, priceText, string2, string3, string4, null);
            }
        }, 1, null);
    }
}
