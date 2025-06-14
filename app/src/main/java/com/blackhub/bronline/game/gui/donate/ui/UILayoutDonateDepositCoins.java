package com.blackhub.bronline.game.gui.donate.ui;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
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
import com.blackhub.bronline.databinding.DonateCoinsDepositLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.core.JNIHelper;
import com.blackhub.bronline.game.core.preferences.Preferences;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateDepositCoinsViewModel;
import com.blackhub.bronline.launcher.App;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
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
import kotlin.text.CharsKt__CharKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UILayoutDonateDepositCoins.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0013H\u0002J\b\u0010\u001d\u001a\u00020\u0013H\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0002J\b\u0010\u001f\u001a\u00020\u0013H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/blackhub/bronline/game/gui/donate/ui/UILayoutDonateDepositCoins;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/DonateCoinsDepositLayoutBinding;", "()V", "depositCoinsViewModel", "Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateDepositCoinsViewModel;", "getDepositCoinsViewModel", "()Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateDepositCoinsViewModel;", "depositCoinsViewModel$delegate", "Lkotlin/Lazy;", "handlerConnect", "Landroid/os/Handler;", "jniActivityViewModel", "Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "getJniActivityViewModel", "()Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "jniActivityViewModel$delegate", "getViewBinding", "initOnButtonClickListener", "", "initViews", "onDestroyView", "setButtonEnabled", "enable", "", "setEmailInEditText", "emailString", "", "setOnEmailEnteredListener", "setOnPriceEnteredListener", "setupObservers", "showOldUIWithEmail", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUILayoutDonateDepositCoins.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UILayoutDonateDepositCoins.kt\ncom/blackhub/bronline/game/gui/donate/ui/UILayoutDonateDepositCoins\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,352:1\n106#2,15:353\n106#2,15:368\n58#3,23:383\n93#3,3:406\n58#3,23:409\n93#3,3:432\n*S KotlinDebug\n*F\n+ 1 UILayoutDonateDepositCoins.kt\ncom/blackhub/bronline/game/gui/donate/ui/UILayoutDonateDepositCoins\n*L\n53#1:353,15\n54#1:368,15\n274#1:383,23\n274#1:406,3\n313#1:409,23\n313#1:432,3\n*E\n"})
/* loaded from: classes3.dex */
public final class UILayoutDonateDepositCoins extends BaseFragment<DonateCoinsDepositLayoutBinding> {
    public static final int $stable = 8;

    /* renamed from: depositCoinsViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy depositCoinsViewModel;

    @Nullable
    public Handler handlerConnect;

    /* renamed from: jniActivityViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy jniActivityViewModel;

    public UILayoutDonateDepositCoins() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$depositCoinsViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UILayoutDonateDepositCoins.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$special$$inlined$viewModels$default$1
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
        this.depositCoinsViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DonateDepositCoinsViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function03 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$jniActivityViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                FragmentActivity requireActivity = UILayoutDonateDepositCoins.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                return requireActivity;
            }
        };
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$special$$inlined$viewModels$default$5
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
        this.jniActivityViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(JNIActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$special$$inlined$viewModels$default$6
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$special$$inlined$viewModels$default$7
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$special$$inlined$viewModels$default$8
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DonateDepositCoinsViewModel getDepositCoinsViewModel() {
        return (DonateDepositCoinsViewModel) this.depositCoinsViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JNIActivityViewModel getJniActivityViewModel() {
        return (JNIActivityViewModel) this.jniActivityViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public DonateCoinsDepositLayoutBinding getViewBinding() {
        DonateCoinsDepositLayoutBinding inflate = DonateCoinsDepositLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        if (this.handlerConnect == null) {
            this.handlerConnect = new Handler(Looper.getMainLooper());
        }
        setupObservers();
        if (UtilsKt.isRustoreBuildVariant()) {
            getJniActivityViewModel().getRustoreBillingPurchasesWithoutRequirementAuthorization();
        }
        getBinding().sales.setVisibility(8);
        JNIHelper.fixEditTextForAndroid10Xiaomi(getBinding().value);
        JNIHelper.fixEditTextForAndroid10Xiaomi(getBinding().email);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Handler handler = this.handlerConnect;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.handlerConnect = null;
        super.onDestroyView();
    }

    public final void setupObservers() {
        getDepositCoinsViewModel().getDoubleDonateLiveData().observe(getViewLifecycleOwner(), new UILayoutDonateDepositCoinsKt$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke2(bool);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool) {
                DonateCoinsDepositLayoutBinding binding;
                DonateCoinsDepositLayoutBinding binding2;
                Intrinsics.checkNotNull(bool);
                if (bool.booleanValue()) {
                    binding2 = UILayoutDonateDepositCoins.this.getBinding();
                    binding2.hot.setVisibility(8);
                } else {
                    binding = UILayoutDonateDepositCoins.this.getBinding();
                    binding.groupX2.setVisibility(8);
                }
            }
        }));
        getDepositCoinsViewModel().getEmailLiveData().observe(getViewLifecycleOwner(), new UILayoutDonateDepositCoinsKt$sam$androidx_lifecycle_Observer$0(new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                UILayoutDonateDepositCoins uILayoutDonateDepositCoins = UILayoutDonateDepositCoins.this;
                Intrinsics.checkNotNull(str);
                uILayoutDonateDepositCoins.setEmailInEditText(str);
            }
        }));
        getDepositCoinsViewModel().getCoinsLiveData().observe(getViewLifecycleOwner(), new UILayoutDonateDepositCoinsKt$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) {
                DonateCoinsDepositLayoutBinding binding;
                DonateCoinsDepositLayoutBinding binding2;
                DonateCoinsDepositLayoutBinding binding3;
                Intrinsics.checkNotNull(num);
                if (num.intValue() > 0) {
                    binding2 = UILayoutDonateDepositCoins.this.getBinding();
                    binding2.sales.setText(UILayoutDonateDepositCoins.this.getString(R.string.donate_with_shares, UsefulKt.getPriceWithSpaces(num)));
                    binding3 = UILayoutDonateDepositCoins.this.getBinding();
                    binding3.sales.setVisibility(0);
                    return;
                }
                binding = UILayoutDonateDepositCoins.this.getBinding();
                binding.sales.setVisibility(8);
            }
        }));
        getDepositCoinsViewModel().getInputCoinsLiveData().observe(getViewLifecycleOwner(), new UILayoutDonateDepositCoinsKt$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) {
                DonateCoinsDepositLayoutBinding binding;
                Intrinsics.checkNotNull(num);
                if (num.intValue() > 0) {
                    binding = UILayoutDonateDepositCoins.this.getBinding();
                    binding.value.setText(UILayoutDonateDepositCoins.this.getString(R.string.common_number_value, num));
                }
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutDonateDepositCoins$setupObservers$5(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutDonateDepositCoins$setupObservers$6(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutDonateDepositCoins$setupObservers$7(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutDonateDepositCoins$setupObservers$8(this, null), 3, null);
    }

    public final void showOldUIWithEmail() {
        getBinding().mlDonateCoinsDeposit.setVisibility(0);
        getBinding().progressBar.setVisibility(8);
        setOnPriceEnteredListener();
        setOnEmailEnteredListener();
        initOnButtonClickListener();
    }

    public final void initOnButtonClickListener() {
        getBinding().button.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UILayoutDonateDepositCoins.initOnButtonClickListener$lambda$0(UILayoutDonateDepositCoins.this, view);
            }
        });
    }

    public static final void initOnButtonClickListener$lambda$0(UILayoutDonateDepositCoins this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Integer value = this$0.getDepositCoinsViewModel().getServerNumberLiveData().getValue();
            String value2 = this$0.getDepositCoinsViewModel().getNicknameLiveData().getValue();
            String str = "https://blackrussia.online/donate_v2/pay_choice.php?is_mobile=true&server=server" + value + "&account=" + ((Object) value2) + "&mail=" + StringsKt__StringsJVMKt.replace$default(this$0.getBinding().email.getText().toString(), "@", "%40", false, 4, (Object) null) + "&summa=" + ((Object) this$0.getBinding().value.getText());
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            build.launchUrl(this$0.requireActivity(), Uri.parse(str));
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
            Toast.makeText(App.INSTANCE.getInstance(), this$0.requireActivity().getString(R.string.error_message_about_browser), 1).show();
        }
    }

    public final void setOnPriceEnteredListener() {
        EditText value = getBinding().value;
        Intrinsics.checkNotNullExpressionValue(value, "value");
        value.addTextChangedListener(new TextWatcher() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setOnPriceEnteredListener$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                DonateCoinsDepositLayoutBinding binding;
                DonateCoinsDepositLayoutBinding binding2;
                DonateCoinsDepositLayoutBinding binding3;
                DonateCoinsDepositLayoutBinding binding4;
                DonateDepositCoinsViewModel depositCoinsViewModel;
                if (s == null || s.length() <= 0) {
                    UILayoutDonateDepositCoins.this.setButtonEnabled(false);
                    binding = UILayoutDonateDepositCoins.this.getBinding();
                    binding.button.setText(UILayoutDonateDepositCoins.this.getString(R.string.common_string_with_ruble, "0"));
                    return;
                }
                int parseInt = Integer.parseInt(s.toString());
                int i = 0;
                for (int i2 = 0; i2 < s.length(); i2++) {
                    i += CharsKt__CharKt.digitToInt(s.charAt(i2));
                }
                binding2 = UILayoutDonateDepositCoins.this.getBinding();
                Editable text = binding2.email.getText();
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                if (text.length() <= 0 || i <= 0) {
                    UILayoutDonateDepositCoins.this.setButtonEnabled(false);
                    binding3 = UILayoutDonateDepositCoins.this.getBinding();
                    binding3.button.setText(UILayoutDonateDepositCoins.this.getString(R.string.common_string_with_ruble, "0"));
                } else {
                    UILayoutDonateDepositCoins.this.setButtonEnabled(true);
                    depositCoinsViewModel = UILayoutDonateDepositCoins.this.getDepositCoinsViewModel();
                    if (!depositCoinsViewModel.sendBuyTokens(parseInt)) {
                        UILayoutDonateDepositCoins.this.setButtonEnabled(false);
                    }
                }
                binding4 = UILayoutDonateDepositCoins.this.getBinding();
                binding4.button.setText(UILayoutDonateDepositCoins.this.getString(R.string.common_string_with_ruble, UsefulKt.getPriceWithSpaces(Integer.valueOf(parseInt))));
            }
        });
    }

    public final void setOnEmailEnteredListener() {
        EditText email = getBinding().email;
        Intrinsics.checkNotNullExpressionValue(email, "email");
        email.addTextChangedListener(new TextWatcher() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setOnEmailEnteredListener$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                DonateCoinsDepositLayoutBinding binding;
                if (s != null && s.length() > 0) {
                    binding = UILayoutDonateDepositCoins.this.getBinding();
                    Editable text = binding.value.getText();
                    Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                    if (text.length() > 0) {
                        UILayoutDonateDepositCoins.this.setButtonEnabled(true);
                        Preferences.putString(App.INSTANCE.getInstance(), Preferences.EMAIL, String.valueOf(s));
                    }
                }
                UILayoutDonateDepositCoins.this.setButtonEnabled(false);
                Preferences.putString(App.INSTANCE.getInstance(), Preferences.EMAIL, String.valueOf(s));
            }
        });
    }

    public final void setButtonEnabled(boolean enable) {
        AppCompatButton appCompatButton = getBinding().button;
        if (enable) {
            appCompatButton.setBackground(ResourcesCompat.getDrawable(requireContext().getResources(), R.drawable.bg_button_red_cr5_t1_white, null));
            appCompatButton.setEnabled(true);
        } else {
            appCompatButton.setBackground(ResourcesCompat.getDrawable(requireContext().getResources(), R.drawable.bg_button_gray_cr5_t1_white, null));
            appCompatButton.setEnabled(false);
        }
    }

    public final void setEmailInEditText(String emailString) {
        if (!Intrinsics.areEqual(emailString, "0")) {
            getBinding().email.setText(emailString);
            return;
        }
        String string = Preferences.getString(App.INSTANCE.getInstance(), Preferences.EMAIL);
        if (string != null) {
            getBinding().email.setText(string);
        }
    }
}
