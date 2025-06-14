package com.blackhub.bronline.game.gui.entertainmentsystem.ui;

import android.content.Context;
import android.view.View;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.EntertainmentSystemTopLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.gui.entertainmentsystem.adapters.EntertainmentSystemGamesFilterAdapter;
import com.blackhub.bronline.game.gui.entertainmentsystem.adapters.EntertainmentSystemPlayersTopAdapter;
import com.blackhub.bronline.game.gui.entertainmentsystem.data.EntertainmentGamesFilter;
import com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UIPlayersTop.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0002J\b\u0010#\u001a\u00020!H\u0002J\b\u0010$\u001a\u00020!H\u0002J\b\u0010%\u001a\u00020!H\u0002J\b\u0010&\u001a\u00020!H\u0002J\b\u0010'\u001a\u00020!H\u0016J\b\u0010(\u001a\u00020!H\u0016J\b\u0010)\u001a\u00020!H\u0002J\b\u0010*\u001a\u00020!H\u0002J\u0010\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020\u001eH\u0002J\u0010\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020\u0019H\u0002J\u0010\u0010/\u001a\u00020!2\u0006\u0010,\u001a\u00020\u001eH\u0002J\u0010\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020\u0019H\u0002J\u0018\u00102\u001a\u00020!2\u0006\u00103\u001a\u00020\u001e2\u0006\u00104\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/blackhub/bronline/game/gui/entertainmentsystem/ui/UIPlayersTop;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/EntertainmentSystemTopLayoutBinding;", "()V", "currentGameName", "", "currentPlayerTopAdapter", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/adapters/EntertainmentSystemPlayersTopAdapter;", "fragmentContext", "Landroid/content/Context;", "getFragmentContext", "()Landroid/content/Context;", "fragmentContext$delegate", "Lkotlin/Lazy;", "gamesFilterAdapter", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/adapters/EntertainmentSystemGamesFilterAdapter;", "gamesList", "", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/data/EntertainmentGamesFilter;", "gamesViewModel", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/viewmodel/EntertainmentGamesViewModel;", "getGamesViewModel", "()Lcom/blackhub/bronline/game/gui/entertainmentsystem/viewmodel/EntertainmentGamesViewModel;", "gamesViewModel$delegate", "ifFirstShow", "", "isVisibleFilter", "playersTopAdapter", "getGameName", "gameId", "", "getViewBinding", "initClickListener", "", "initCurrentPlayerTop", "initFilterClickListener", "initGameFilter", "initGameList", "initPlayersTopList", "initViews", "onDestroyView", "setNullableParameters", "setObservers", "setVisibleFirstPosition", "valueOfVisible", "setVisibleForFilter", "ifNowVisible", "setVisibleOtherPosition", "setVisibleTopBlock", "isFirstThreePositions", "updateMainStatus", "thisPosition", "thisGame", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUIPlayersTop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIPlayersTop.kt\ncom/blackhub/bronline/game/gui/entertainmentsystem/ui/UIPlayersTop\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,248:1\n106#2,15:249\n*S KotlinDebug\n*F\n+ 1 UIPlayersTop.kt\ncom/blackhub/bronline/game/gui/entertainmentsystem/ui/UIPlayersTop\n*L\n26#1:249,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UIPlayersTop extends BaseFragment<EntertainmentSystemTopLayoutBinding> {
    public static final int $stable = 8;

    @NotNull
    public String currentGameName;

    @Nullable
    public EntertainmentSystemPlayersTopAdapter currentPlayerTopAdapter;

    /* renamed from: fragmentContext$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy fragmentContext;

    @Nullable
    public EntertainmentSystemGamesFilterAdapter gamesFilterAdapter;

    @NotNull
    public List<EntertainmentGamesFilter> gamesList;

    /* renamed from: gamesViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy gamesViewModel;
    public boolean ifFirstShow;
    public boolean isVisibleFilter;

    @Nullable
    public EntertainmentSystemPlayersTopAdapter playersTopAdapter;

    public UIPlayersTop() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIPlayersTop$gamesViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UIPlayersTop.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIPlayersTop$special$$inlined$viewModels$default$1
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
        this.gamesViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EntertainmentGamesViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIPlayersTop$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIPlayersTop$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIPlayersTop$special$$inlined$viewModels$default$4
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
        this.gamesList = CollectionsKt__CollectionsKt.emptyList();
        this.currentGameName = "";
        this.ifFirstShow = true;
        this.fragmentContext = LazyKt__LazyJVMKt.lazy(new Function0<Context>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIPlayersTop$fragmentContext$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Context invoke() {
                return UIPlayersTop.this.requireContext();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EntertainmentGamesViewModel getGamesViewModel() {
        return (EntertainmentGamesViewModel) this.gamesViewModel.getValue();
    }

    private final Context getFragmentContext() {
        return (Context) this.fragmentContext.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public EntertainmentSystemTopLayoutBinding getViewBinding() {
        EntertainmentSystemTopLayoutBinding inflate = EntertainmentSystemTopLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        initPlayersTopList();
        initCurrentPlayerTop();
        initGameFilter();
        setObservers();
        initClickListener();
    }

    public final void initPlayersTopList() {
        Context fragmentContext = getFragmentContext();
        Intrinsics.checkNotNullExpressionValue(fragmentContext, "<get-fragmentContext>(...)");
        EntertainmentSystemPlayersTopAdapter entertainmentSystemPlayersTopAdapter = new EntertainmentSystemPlayersTopAdapter(fragmentContext);
        this.playersTopAdapter = entertainmentSystemPlayersTopAdapter;
        entertainmentSystemPlayersTopAdapter.setHasStableIds(true);
        RecyclerView recyclerView = getBinding().playersTop;
        recyclerView.setLayoutManager(new LinearLayoutManager(getBinding().getRoot().getContext(), 1, false));
        recyclerView.setAdapter(this.playersTopAdapter);
        recyclerView.setItemViewCacheSize(20);
    }

    public final void initCurrentPlayerTop() {
        Context fragmentContext = getFragmentContext();
        Intrinsics.checkNotNullExpressionValue(fragmentContext, "<get-fragmentContext>(...)");
        this.currentPlayerTopAdapter = new EntertainmentSystemPlayersTopAdapter(fragmentContext);
        RecyclerView recyclerView = getBinding().currentPlayer;
        recyclerView.setLayoutManager(new LinearLayoutManager(getFragmentContext(), 1, false));
        recyclerView.setAdapter(this.currentPlayerTopAdapter);
    }

    public final void setVisibleForFilter(boolean ifNowVisible) {
        if (!ifNowVisible) {
            this.isVisibleFilter = true;
            getBinding().listWithGamesFilter.setVisibility(0);
            getBinding().arrowSubmenu.setImageResource(R.drawable.ic_triangle_up_old);
            getBinding().title3.setBackgroundColor(getFragmentContext().getResources().getColor(R.color.red, null));
            return;
        }
        this.isVisibleFilter = false;
        getBinding().listWithGamesFilter.setVisibility(4);
        getBinding().arrowSubmenu.setImageResource(R.drawable.ic_triangle_down_old);
        getBinding().title3.setBackgroundColor(getFragmentContext().getResources().getColor(2131100871, null));
    }

    public final void initGameFilter() {
        initGameList();
        List<EntertainmentGamesFilter> list = this.gamesList;
        Context fragmentContext = getFragmentContext();
        Intrinsics.checkNotNullExpressionValue(fragmentContext, "<get-fragmentContext>(...)");
        this.gamesFilterAdapter = new EntertainmentSystemGamesFilterAdapter(list, fragmentContext);
        initFilterClickListener();
        RecyclerView recyclerView = getBinding().listWithGamesFilter;
        recyclerView.setLayoutManager(new LinearLayoutManager(getBinding().getRoot().getContext(), 1, false));
        recyclerView.setAdapter(this.gamesFilterAdapter);
    }

    public final void initGameList() {
        String[] stringArray = getFragmentContext().getResources().getStringArray(R.array.entertainment_system_all_games);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        String str = stringArray[0];
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        EntertainmentGamesFilter entertainmentGamesFilter = new EntertainmentGamesFilter(0, str, true);
        String str2 = stringArray[1];
        Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
        EntertainmentGamesFilter entertainmentGamesFilter2 = new EntertainmentGamesFilter(1, str2, false, 4, null);
        String str3 = stringArray[2];
        Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
        EntertainmentGamesFilter entertainmentGamesFilter3 = new EntertainmentGamesFilter(2, str3, false, 4, null);
        String str4 = stringArray[3];
        Intrinsics.checkNotNullExpressionValue(str4, "get(...)");
        EntertainmentGamesFilter entertainmentGamesFilter4 = new EntertainmentGamesFilter(3, str4, false, 4, null);
        String str5 = stringArray[4];
        Intrinsics.checkNotNullExpressionValue(str5, "get(...)");
        EntertainmentGamesFilter entertainmentGamesFilter5 = new EntertainmentGamesFilter(4, str5, false, 4, null);
        String str6 = stringArray[5];
        Intrinsics.checkNotNullExpressionValue(str6, "get(...)");
        this.gamesList = CollectionsKt__CollectionsKt.listOf((Object[]) new EntertainmentGamesFilter[]{entertainmentGamesFilter, entertainmentGamesFilter2, entertainmentGamesFilter3, entertainmentGamesFilter4, entertainmentGamesFilter5, new EntertainmentGamesFilter(5, str6, false, 4, null)});
    }

    public final void initFilterClickListener() {
        EntertainmentSystemGamesFilterAdapter entertainmentSystemGamesFilterAdapter = this.gamesFilterAdapter;
        if (entertainmentSystemGamesFilterAdapter == null) {
            return;
        }
        entertainmentSystemGamesFilterAdapter.setFilterClickListener(new Function2<EntertainmentGamesFilter, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIPlayersTop$initFilterClickListener$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EntertainmentGamesFilter entertainmentGamesFilter, Integer num) {
                invoke(entertainmentGamesFilter, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull EntertainmentGamesFilter game, int i) {
                EntertainmentGamesViewModel gamesViewModel;
                EntertainmentSystemGamesFilterAdapter entertainmentSystemGamesFilterAdapter2;
                boolean z;
                Intrinsics.checkNotNullParameter(game, "game");
                gamesViewModel = UIPlayersTop.this.getGamesViewModel();
                gamesViewModel.showCurrentGameTop(Integer.valueOf(game.getId()));
                game.setClicked(true);
                UIPlayersTop.this.currentGameName = game.getName();
                entertainmentSystemGamesFilterAdapter2 = UIPlayersTop.this.gamesFilterAdapter;
                if (entertainmentSystemGamesFilterAdapter2 != null) {
                    entertainmentSystemGamesFilterAdapter2.notifyItemChanged(i);
                    entertainmentSystemGamesFilterAdapter2.setCheckOnlyElement(i);
                }
                UIPlayersTop uIPlayersTop = UIPlayersTop.this;
                z = uIPlayersTop.isVisibleFilter;
                uIPlayersTop.setVisibleForFilter(z);
            }
        });
    }

    public final void updateMainStatus(int thisPosition, String thisGame) {
        if (thisPosition == 1) {
            setVisibleTopBlock(true);
            getBinding().topIcon.setImageResource(R.drawable.img_top_1);
            getBinding().valueGame.setText(getFragmentContext().getString(R.string.common_string_in_quotes, thisGame));
        } else if (thisPosition == 2) {
            setVisibleTopBlock(true);
            getBinding().topIcon.setImageResource(R.drawable.img_top_2);
            getBinding().valueGame.setText(getFragmentContext().getString(R.string.common_string_in_quotes, thisGame));
        } else if (thisPosition == 3) {
            setVisibleTopBlock(true);
            getBinding().topIcon.setImageResource(R.drawable.img_top_3);
            getBinding().valueGame.setText(getFragmentContext().getString(R.string.common_string_in_quotes, thisGame));
        } else {
            setVisibleTopBlock(false);
            getBinding().valueOtherTop.setText(getFragmentContext().getString(R.string.common_top_position, Integer.valueOf(thisPosition)));
            getBinding().valueGameOther.setText(getFragmentContext().getString(R.string.common_string_in_quotes, thisGame));
        }
    }

    public final void setVisibleTopBlock(boolean isFirstThreePositions) {
        if (isFirstThreePositions) {
            setVisibleFirstPosition(0);
            setVisibleOtherPosition(4);
        } else {
            setVisibleFirstPosition(4);
            setVisibleOtherPosition(0);
        }
    }

    public final void setVisibleFirstPosition(int valueOfVisible) {
        getBinding().topIcon.setVisibility(valueOfVisible);
        getBinding().titleGame.setVisibility(valueOfVisible);
        getBinding().valueGame.setVisibility(valueOfVisible);
    }

    public final void setVisibleOtherPosition(int valueOfVisible) {
        getBinding().titleOtherTop.setVisibility(valueOfVisible);
        getBinding().otherTopIcon.setVisibility(valueOfVisible);
        getBinding().valueOtherTop.setVisibility(valueOfVisible);
        getBinding().titleGameOther.setVisibility(valueOfVisible);
        getBinding().valueGameOther.setVisibility(valueOfVisible);
    }

    private final void setObservers() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new UIPlayersTop$setObservers$1(this, null));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2).launchWhenStarted(new UIPlayersTop$setObservers$2(this, null));
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3).launchWhenStarted(new UIPlayersTop$setObservers$3(this, null));
    }

    public final String getGameName(int gameId) {
        String[] stringArray = getFragmentContext().getResources().getStringArray(R.array.entertainment_system_all_games);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        if (gameId >= stringArray.length) {
            return "";
        }
        String str = stringArray[gameId];
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        return str;
    }

    private final void initClickListener() {
        getBinding().title3.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIPlayersTop$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UIPlayersTop.initClickListener$lambda$3(UIPlayersTop.this, view);
            }
        });
    }

    public static final void initClickListener$lambda$3(UIPlayersTop this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.ifFirstShow) {
            return;
        }
        this$0.setVisibleForFilter(this$0.isVisibleFilter);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        setNullableParameters();
        getGamesViewModel().clearInfo();
        super.onDestroyView();
    }

    private final void setNullableParameters() {
        this.playersTopAdapter = null;
        this.currentPlayerTopAdapter = null;
        this.gamesFilterAdapter = null;
    }
}
