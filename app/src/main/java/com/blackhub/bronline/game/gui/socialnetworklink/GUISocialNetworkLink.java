package com.blackhub.bronline.game.gui.socialnetworklink;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.SocialNetworkLinkLayoutBinding;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragmentWithState;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.game.gui.socialnetworklink.adapters.SocialButtonAdapter;
import com.blackhub.bronline.game.gui.socialnetworklink.viewmodel.SocialNetworkLinkViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUISocialNetworkLink.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0014H\u0016J\u0012\u0010\u001f\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0014H\u0002J&\u0010#\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u00038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006("}, d2 = {"Lcom/blackhub/bronline/game/gui/socialnetworklink/GUISocialNetworkLink;", "Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragmentWithState;", "Lcom/blackhub/bronline/game/gui/socialnetworklink/SocialNetworkLinkUiState;", "Lcom/blackhub/bronline/game/gui/socialnetworklink/viewmodel/SocialNetworkLinkViewModel;", "Lcom/blackhub/bronline/databinding/SocialNetworkLinkLayoutBinding;", "()V", "buttonAdapter", "Lcom/blackhub/bronline/game/gui/socialnetworklink/adapters/SocialButtonAdapter;", "mainFactory", "Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "getMainFactory", "()Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "setMainFactory", "(Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;)V", "viewModel", "getViewModel", "()Lcom/blackhub/bronline/game/gui/socialnetworklink/viewmodel/SocialNetworkLinkViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "attachButtons", "", "getGuiId", "", "handleUiState", "uiState", "initViewsISAMPGUI", "newBackPress", "onAttach", "context", "Landroid/content/Context;", "onDestroyView", "onPacketIncoming", "json", "Lorg/json/JSONObject;", "setNullableParameters", "show", "manager", "Lcom/blackhub/bronline/game/GUIManager;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Lcom/blackhub/bronline/game/core/JNIActivity;", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGUISocialNetworkLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUISocialNetworkLink.kt\ncom/blackhub/bronline/game/gui/socialnetworklink/GUISocialNetworkLink\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,107:1\n106#2,15:108\n*S KotlinDebug\n*F\n+ 1 GUISocialNetworkLink.kt\ncom/blackhub/bronline/game/gui/socialnetworklink/GUISocialNetworkLink\n*L\n32#1:108,15\n*E\n"})
/* loaded from: classes3.dex */
public final class GUISocialNetworkLink extends BaseISAMPGUIFragmentWithState<SocialNetworkLinkUiState, SocialNetworkLinkViewModel, SocialNetworkLinkLayoutBinding> {
    public static final int $stable = 8;

    @Nullable
    public SocialButtonAdapter buttonAdapter;

    @Inject
    public MainViewModelFactory<SocialNetworkLinkViewModel> mainFactory;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 52;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragmentWithState, com.blackhub.bronline.game.ISAMPGUI
    public void show(@Nullable JSONObject json, @Nullable GUIManager manager, @Nullable JNIActivity activity) {
    }

    public GUISocialNetworkLink() {
        super(R.layout.social_network_link_layout);
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.socialnetworklink.GUISocialNetworkLink$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                GUISocialNetworkLink gUISocialNetworkLink = GUISocialNetworkLink.this;
                return (ViewModelProvider.Factory) new ViewModelProvider(gUISocialNetworkLink, gUISocialNetworkLink.getMainFactory()).get(SocialNetworkLinkViewModel.class);
            }
        };
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.blackhub.bronline.game.gui.socialnetworklink.GUISocialNetworkLink$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.socialnetworklink.GUISocialNetworkLink$special$$inlined$viewModels$default$2
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
        final Function0 function03 = null;
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(SocialNetworkLinkViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.socialnetworklink.GUISocialNetworkLink$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.socialnetworklink.GUISocialNetworkLink$special$$inlined$viewModels$default$4
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
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function0);
    }

    @NotNull
    public final MainViewModelFactory<SocialNetworkLinkViewModel> getMainFactory() {
        MainViewModelFactory<SocialNetworkLinkViewModel> mainViewModelFactory = this.mainFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mainFactory");
        return null;
    }

    public final void setMainFactory(@NotNull MainViewModelFactory<SocialNetworkLinkViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.mainFactory = mainViewModelFactory;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    @NotNull
    public SocialNetworkLinkViewModel getViewModel() {
        return (SocialNetworkLinkViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragmentWithState
    public void initViewsISAMPGUI() {
        JSONObject jsonObj = getJsonObj();
        if (jsonObj != null) {
            getViewModel().initInterface(jsonObj);
        }
        attachButtons();
        final SocialNetworkLinkLayoutBinding socialNetworkLinkLayoutBinding = (SocialNetworkLinkLayoutBinding) getBinding();
        AppCompatButton socialNetworkLinkButtonClose = socialNetworkLinkLayoutBinding.socialNetworkLinkButtonClose;
        Intrinsics.checkNotNullExpressionValue(socialNetworkLinkButtonClose, "socialNetworkLinkButtonClose");
        ViewExtensionKt.setOnDebounceAndAnimateClickListener$default(socialNetworkLinkButtonClose, 0L, new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.socialnetworklink.GUISocialNetworkLink$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUISocialNetworkLink.initViewsISAMPGUI$lambda$4$lambda$1(GUISocialNetworkLink.this, view);
            }
        }, 1, null);
        socialNetworkLinkLayoutBinding.socialNetworkLinkCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.blackhub.bronline.game.gui.socialnetworklink.GUISocialNetworkLink$$ExternalSyntheticLambda1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                GUISocialNetworkLink.initViewsISAMPGUI$lambda$4$lambda$2(GUISocialNetworkLink.this, compoundButton, z);
            }
        });
        socialNetworkLinkLayoutBinding.socialNetworkLinkCheckboxText.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.socialnetworklink.GUISocialNetworkLink$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUISocialNetworkLink.initViewsISAMPGUI$lambda$4$lambda$3(SocialNetworkLinkLayoutBinding.this, view);
            }
        });
    }

    public static final void initViewsISAMPGUI$lambda$4$lambda$1(GUISocialNetworkLink this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().closeInterface();
    }

    public static final void initViewsISAMPGUI$lambda$4$lambda$2(GUISocialNetworkLink this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().updateCheckBox(z);
    }

    public static final void initViewsISAMPGUI$lambda$4$lambda$3(SocialNetworkLinkLayoutBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        this_with.socialNetworkLinkCheckbox.setChecked(!r0.isChecked());
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState, androidx.fragment.app.Fragment
    public void onDestroyView() {
        setNullableParameters();
        super.onDestroyView();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    public void handleUiState(@NotNull SocialNetworkLinkUiState uiState) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        if (uiState.isNeedClose()) {
            closeFragment();
        }
        if (!uiState.getSocialButtons().isEmpty()) {
            SocialButtonAdapter socialButtonAdapter = this.buttonAdapter;
            if (socialButtonAdapter != null) {
                socialButtonAdapter.initButtons(uiState.getSocialButtons());
            }
            getViewModel().clearButtonList();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void attachButtons() {
        SocialButtonAdapter socialButtonAdapter = new SocialButtonAdapter();
        socialButtonAdapter.setOnButtonClickListener(new GUISocialNetworkLink$attachButtons$1$1(this));
        this.buttonAdapter = socialButtonAdapter;
        RecyclerView recyclerView = ((SocialNetworkLinkLayoutBinding) getBinding()).socialNetworkLinkButtons;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        recyclerView.setAdapter(this.buttonAdapter);
    }

    private final void setNullableParameters() {
        this.buttonAdapter = null;
    }
}
