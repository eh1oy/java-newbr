package com.blackhub.bronline.game.gui.entertainmentsystem;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.EntertainmentSystemMainBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo;
import com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout;
import com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIPlayersTop;
import com.blackhub.bronline.game.gui.entertainmentsystem.utils.EntertainmentConstants;
import com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import java.util.List;
import javax.inject.Inject;
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
import org.apache.ivy.osgi.updatesite.xml.FeatureParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUIEntertainmentSystem.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0016J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0015H\u0016J\u0012\u0010#\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0018\u0010$\u001a\u00020\u00152\u000e\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020'0&H\u0002J\b\u0010(\u001a\u00020\u0015H\u0002J\b\u0010)\u001a\u00020\u0015H\u0002J\u0010\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0019H\u0002J\u0010\u0010,\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0019H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/blackhub/bronline/game/gui/entertainmentsystem/GUIEntertainmentSystem;", "Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragment;", "Lcom/blackhub/bronline/databinding/EntertainmentSystemMainBinding;", "()V", "dialogGameInfo", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/ui/DialogGameInfo;", "gamesFactory", "Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/viewmodel/EntertainmentGamesViewModel;", "getGamesFactory", "()Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "setGamesFactory", "(Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;)V", "gamesViewModel", "getGamesViewModel", "()Lcom/blackhub/bronline/game/gui/entertainmentsystem/viewmodel/EntertainmentGamesViewModel;", "gamesViewModel$delegate", "Lkotlin/Lazy;", "isThePlayerClosed", "", "addAllData", "", "json", "Lorg/json/JSONObject;", "getGuiId", "", "getViewBinding", "initClickListeners", "initDialogGameInfo", "initViewsISAMPGUI", "newBackPress", "onAttach", "context", "Landroid/content/Context;", "onDestroyView", "onPacketIncoming", "replaceFragment", FeatureParser.PluginHandler.FRAGMENT, "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "setNullableParameters", "setObservers", "setVisibleForButtonBack", "visibleValue", "setVisibleForButtonInfo", "Companion", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGUIEntertainmentSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUIEntertainmentSystem.kt\ncom/blackhub/bronline/game/gui/entertainmentsystem/GUIEntertainmentSystem\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,177:1\n106#2,15:178\n*S KotlinDebug\n*F\n+ 1 GUIEntertainmentSystem.kt\ncom/blackhub/bronline/game/gui/entertainmentsystem/GUIEntertainmentSystem\n*L\n44#1:178,15\n*E\n"})
/* loaded from: classes3.dex */
public final class GUIEntertainmentSystem extends BaseISAMPGUIFragment<EntertainmentSystemMainBinding> {

    @Nullable
    public DialogGameInfo dialogGameInfo;

    @Inject
    public MainViewModelFactory<EntertainmentGamesViewModel> gamesFactory;

    /* renamed from: gamesViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy gamesViewModel;
    public boolean isThePlayerClosed;
    public static final int $stable = 8;

    @NotNull
    public static final List<Integer> resourcesList = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_battleground), Integer.valueOf(R.drawable.img_rubilovo), Integer.valueOf(R.drawable.img_flatout), Integer.valueOf(R.drawable.img_tank), Integer.valueOf(R.drawable.img_guns), Integer.valueOf(R.drawable.img_rice)});

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 42;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    @NotNull
    public final MainViewModelFactory<EntertainmentGamesViewModel> getGamesFactory() {
        MainViewModelFactory<EntertainmentGamesViewModel> mainViewModelFactory = this.gamesFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gamesFactory");
        return null;
    }

    public final void setGamesFactory(@NotNull MainViewModelFactory<EntertainmentGamesViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.gamesFactory = mainViewModelFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EntertainmentGamesViewModel getGamesViewModel() {
        return (EntertainmentGamesViewModel) this.gamesViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
        if (json != null) {
            getGamesViewModel().onPacketIncoming(json);
        }
        Integer valueOf = json != null ? Integer.valueOf(json.optInt("t")) : null;
        if (valueOf != null && valueOf.intValue() == 3) {
            this.isThePlayerClosed = false;
            closeFragment();
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() {
        getGamesViewModel();
        addAllData(getJsonObj());
        setObservers();
        initDialogGameInfo();
        initClickListeners();
        replaceFragment(UIGamesLayout.class);
    }

    public final void addAllData(JSONObject json) {
        EntertainmentGamesViewModel gamesViewModel = getGamesViewModel();
        JSONArray optJSONArray = json != null ? json.optJSONArray("ps") : null;
        String[] stringArray = requireActivity().getResources().getStringArray(R.array.entertainment_system_all_games);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        String[] stringArray2 = requireActivity().getResources().getStringArray(R.array.entertainment_system_all_descriptions);
        Intrinsics.checkNotNullExpressionValue(stringArray2, "getStringArray(...)");
        gamesViewModel.initGamesList(optJSONArray, stringArray, stringArray2, resourcesList);
        gamesViewModel.setPlayersNick(json != null ? json.optString(EntertainmentConstants.KEY_GET_ARR_WITH_CURRENT_TOP_NICK) : null);
    }

    private final void setObservers() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new GUIEntertainmentSystem$setObservers$1(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setVisibleForButtonInfo(int visibleValue) {
        ((EntertainmentSystemMainBinding) getBinding()).buttonInfo.setVisibility(visibleValue);
    }

    public final void initDialogGameInfo() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        this.dialogGameInfo = new DialogGameInfo(requireActivity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initClickListeners() {
        EntertainmentSystemMainBinding entertainmentSystemMainBinding = (EntertainmentSystemMainBinding) getBinding();
        AppCompatButton buttonClose = entertainmentSystemMainBinding.buttonClose;
        Intrinsics.checkNotNullExpressionValue(buttonClose, "buttonClose");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonClose, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.GUIEntertainmentSystem$initClickListeners$1$1
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
                GUIEntertainmentSystem.this.closeFragment();
            }
        }, 1, null);
        AppCompatButton buttonBack = entertainmentSystemMainBinding.buttonBack;
        Intrinsics.checkNotNullExpressionValue(buttonBack, "buttonBack");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonBack, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.GUIEntertainmentSystem$initClickListeners$1$2
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
                EntertainmentGamesViewModel gamesViewModel;
                GUIEntertainmentSystem.this.replaceFragment(UIGamesLayout.class);
                GUIEntertainmentSystem.this.setVisibleForButtonBack(4);
                gamesViewModel = GUIEntertainmentSystem.this.getGamesViewModel();
                gamesViewModel.setVisibleButtonInfo(true);
            }
        }, 1, null);
        AppCompatButton buttonInfo = entertainmentSystemMainBinding.buttonInfo;
        Intrinsics.checkNotNullExpressionValue(buttonInfo, "buttonInfo");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonInfo, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.GUIEntertainmentSystem$initClickListeners$1$3
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
                DialogGameInfo dialogGameInfo;
                dialogGameInfo = GUIEntertainmentSystem.this.dialogGameInfo;
                if (dialogGameInfo != null) {
                    GUIEntertainmentSystem gUIEntertainmentSystem = GUIEntertainmentSystem.this;
                    if (dialogGameInfo.isVisible()) {
                        return;
                    }
                    dialogGameInfo.show(gUIEntertainmentSystem.getChildFragmentManager(), GUIEntertainmentSystemKt.DIALOG_INFO_TAG);
                }
            }
        }, 1, null);
        AppCompatImageButton buttonTop = entertainmentSystemMainBinding.buttonTop;
        Intrinsics.checkNotNullExpressionValue(buttonTop, "buttonTop");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonTop, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.GUIEntertainmentSystem$initClickListeners$1$4
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
                EntertainmentGamesViewModel gamesViewModel;
                EntertainmentGamesViewModel gamesViewModel2;
                GUIEntertainmentSystem.this.replaceFragment(UIPlayersTop.class);
                GUIEntertainmentSystem.this.setVisibleForButtonBack(0);
                gamesViewModel = GUIEntertainmentSystem.this.getGamesViewModel();
                gamesViewModel.sendPressButton(4);
                gamesViewModel2 = GUIEntertainmentSystem.this.getGamesViewModel();
                gamesViewModel2.setVisibleButtonInfo(false);
            }
        }, 1, null);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public EntertainmentSystemMainBinding getViewBinding() {
        EntertainmentSystemMainBinding inflate = EntertainmentSystemMainBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void replaceFragment(Class<? extends Fragment> fragment) {
        getChildFragmentManager().beginTransaction().replace(((EntertainmentSystemMainBinding) getBinding()).myContainer.getId(), fragment, (Bundle) null).commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setVisibleForButtonBack(int visibleValue) {
        ((EntertainmentSystemMainBinding) getBinding()).buttonBack.setVisibility(visibleValue);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (this.isThePlayerClosed) {
            getGamesViewModel().sendPressButton(3);
        }
        setNullableParameters();
        super.onDestroyView();
    }

    private final void setNullableParameters() {
        this.dialogGameInfo = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        App.INSTANCE.appComponent().inject(this);
    }

    public GUIEntertainmentSystem() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.GUIEntertainmentSystem$gamesViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return GUIEntertainmentSystem.this;
            }
        };
        Function0<ViewModelProvider.Factory> function02 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.GUIEntertainmentSystem$gamesViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return GUIEntertainmentSystem.this.getGamesFactory();
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.GUIEntertainmentSystem$special$$inlined$viewModels$default$1
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
        this.gamesViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EntertainmentGamesViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.GUIEntertainmentSystem$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.GUIEntertainmentSystem$special$$inlined$viewModels$default$3
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
        }, function02);
        this.isThePlayerClosed = true;
    }
}
