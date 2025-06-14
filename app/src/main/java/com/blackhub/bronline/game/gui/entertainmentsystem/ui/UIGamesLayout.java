package com.blackhub.bronline.game.gui.entertainmentsystem.ui;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.EntertainmentSystemGamesLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.gui.entertainmentsystem.adapters.EntertainmentSystemActionsAdapter;
import com.blackhub.bronline.game.gui.entertainmentsystem.data.EntertainmentGameData;
import com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UIGamesLayout.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/blackhub/bronline/game/gui/entertainmentsystem/ui/UIGamesLayout;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/EntertainmentSystemGamesLayoutBinding;", "()V", "gamesAdapter", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/adapters/EntertainmentSystemActionsAdapter;", "gamesViewModel", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/viewmodel/EntertainmentGamesViewModel;", "getGamesViewModel", "()Lcom/blackhub/bronline/game/gui/entertainmentsystem/viewmodel/EntertainmentGamesViewModel;", "gamesViewModel$delegate", "Lkotlin/Lazy;", "ifBlockButtons", "", "oldPosForCheckedGame", "", "getViewBinding", "initAdapterClickListeners", "", "initViews", "onDestroyView", "setGlobalDescription", "action", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/data/EntertainmentGameData;", "setItemsInGameList", "setNullableParameters", "setObservers", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUIGamesLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIGamesLayout.kt\ncom/blackhub/bronline/game/gui/entertainmentsystem/ui/UIGamesLayout\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,122:1\n106#2,15:123\n*S KotlinDebug\n*F\n+ 1 UIGamesLayout.kt\ncom/blackhub/bronline/game/gui/entertainmentsystem/ui/UIGamesLayout\n*L\n17#1:123,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UIGamesLayout extends BaseFragment<EntertainmentSystemGamesLayoutBinding> {
    public static final int $stable = 8;

    @Nullable
    public EntertainmentSystemActionsAdapter gamesAdapter;

    /* renamed from: gamesViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy gamesViewModel;
    public boolean ifBlockButtons;
    public int oldPosForCheckedGame;

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$special$$inlined$viewModels$default$2.<init>(kotlin.Lazy):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:290)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:193)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public UIGamesLayout() {
        /*
            r5 = this;
            r5.<init>()
            com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$gamesViewModel$2 r0 = new com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$gamesViewModel$2
            r0.<init>()
            kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.NONE
            com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$special$$inlined$viewModels$default$1 r2 = new com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$special$$inlined$viewModels$default$1
            r2.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r1, r2)
            java.lang.Class<com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel> r1 = com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel.class
            kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
            com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$special$$inlined$viewModels$default$2 r2 = new com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$special$$inlined$viewModels$default$2
            r2.<init>()
            com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$special$$inlined$viewModels$default$3 r3 = new com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$special$$inlined$viewModels$default$3
            r4 = 0
            r3.<init>()
            com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$special$$inlined$viewModels$default$4 r4 = new com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$special$$inlined$viewModels$default$4
            r4.<init>()
            kotlin.Lazy r0 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r5, r1, r2, r3, r4)
            r5.gamesViewModel = r0
            r0 = -1
            r5.oldPosForCheckedGame = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout.<init>():void");
    }

    public final EntertainmentGamesViewModel getGamesViewModel() {
        return (EntertainmentGamesViewModel) this.gamesViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        setItemsInGameList();
        setObservers();
    }

    public final void setItemsInGameList() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        this.gamesAdapter = new EntertainmentSystemActionsAdapter(requireActivity);
        initAdapterClickListeners();
        RecyclerView recyclerView = getBinding().listWithGames;
        recyclerView.setLayoutManager(new GridLayoutManager(getBinding().getRoot().getContext(), 3));
        recyclerView.setAdapter(this.gamesAdapter);
    }

    public final void initAdapterClickListeners() {
        EntertainmentSystemActionsAdapter entertainmentSystemActionsAdapter = this.gamesAdapter;
        if (entertainmentSystemActionsAdapter != null) {
            entertainmentSystemActionsAdapter.setActionsClickListener(new Function2<EntertainmentGameData, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$initAdapterClickListeners$1
                public UIGamesLayout$initAdapterClickListeners$1() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EntertainmentGameData entertainmentGameData, Integer num) {
                    invoke(entertainmentGameData, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull EntertainmentGameData action, int i) {
                    EntertainmentSystemActionsAdapter entertainmentSystemActionsAdapter2;
                    Intrinsics.checkNotNullParameter(action, "action");
                    if (!action.isClicked()) {
                        action.setClicked(true);
                        entertainmentSystemActionsAdapter2 = UIGamesLayout.this.gamesAdapter;
                        if (entertainmentSystemActionsAdapter2 != null) {
                            entertainmentSystemActionsAdapter2.notifyItemChanged(i);
                            entertainmentSystemActionsAdapter2.setCheckOnlyElement(i);
                        }
                    }
                    UIGamesLayout.this.setGlobalDescription(action);
                }
            });
        }
        EntertainmentSystemActionsAdapter entertainmentSystemActionsAdapter2 = this.gamesAdapter;
        if (entertainmentSystemActionsAdapter2 == null) {
            return;
        }
        entertainmentSystemActionsAdapter2.setButtonClickListener(new Function3<EntertainmentGameData, Integer, View, Unit>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$initAdapterClickListeners$2
            public UIGamesLayout$initAdapterClickListeners$2() {
                super(3);
            }

            /* compiled from: UIGamesLayout.kt */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$initAdapterClickListeners$2$1 */
            public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
                public final /* synthetic */ int $position;
                public final /* synthetic */ UIGamesLayout this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(UIGamesLayout uIGamesLayout, int i) {
                    super(0);
                    r2 = uIGamesLayout;
                    r3 = i;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() {
                    boolean z;
                    int i;
                    EntertainmentGamesViewModel gamesViewModel;
                    EntertainmentGamesViewModel gamesViewModel2;
                    EntertainmentGameData.this.setClicked(true);
                    z = r2.ifBlockButtons;
                    if (z) {
                        i = r2.oldPosForCheckedGame;
                        if (i == r3) {
                            gamesViewModel = r2.getGamesViewModel();
                            gamesViewModel.sendPressButton(2);
                        }
                    } else {
                        EntertainmentGameData entertainmentGameData = EntertainmentGameData.this;
                        gamesViewModel2 = r2.getGamesViewModel();
                        gamesViewModel2.sendGetLobby(entertainmentGameData.getId());
                        gamesViewModel2.saveGameIdForTop(Integer.valueOf(entertainmentGameData.getId()));
                        r2.oldPosForCheckedGame = r3;
                    }
                    r2.setGlobalDescription(EntertainmentGameData.this);
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(EntertainmentGameData entertainmentGameData, Integer num, View view) {
                invoke(entertainmentGameData, num.intValue(), view);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull EntertainmentGameData action, int i, @NotNull View view) {
                Intrinsics.checkNotNullParameter(action, "action");
                Intrinsics.checkNotNullParameter(view, "view");
                UIGamesLayout uIGamesLayout = UIGamesLayout.this;
                uIGamesLayout.startAnimAndDelay(view, 1000L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$initAdapterClickListeners$2.1
                    public final /* synthetic */ int $position;
                    public final /* synthetic */ UIGamesLayout this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(UIGamesLayout uIGamesLayout2, int i2) {
                        super(0);
                        r2 = uIGamesLayout2;
                        r3 = i2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2() {
                        boolean z;
                        int i2;
                        EntertainmentGamesViewModel gamesViewModel;
                        EntertainmentGamesViewModel gamesViewModel2;
                        EntertainmentGameData.this.setClicked(true);
                        z = r2.ifBlockButtons;
                        if (z) {
                            i2 = r2.oldPosForCheckedGame;
                            if (i2 == r3) {
                                gamesViewModel = r2.getGamesViewModel();
                                gamesViewModel.sendPressButton(2);
                            }
                        } else {
                            EntertainmentGameData entertainmentGameData = EntertainmentGameData.this;
                            gamesViewModel2 = r2.getGamesViewModel();
                            gamesViewModel2.sendGetLobby(entertainmentGameData.getId());
                            gamesViewModel2.saveGameIdForTop(Integer.valueOf(entertainmentGameData.getId()));
                            r2.oldPosForCheckedGame = r3;
                        }
                        r2.setGlobalDescription(EntertainmentGameData.this);
                    }
                });
            }
        });
    }

    private final void setObservers() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new UIGamesLayout$setObservers$1(this, null));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2).launchWhenStarted(new UIGamesLayout$setObservers$2(this, null));
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3).launchWhenStarted(new UIGamesLayout$setObservers$3(this, null));
    }

    public final void setGlobalDescription(EntertainmentGameData action) {
        EntertainmentGamesViewModel gamesViewModel = getGamesViewModel();
        gamesViewModel.checkCurrentGame(action);
        gamesViewModel.setVisibleButtonInfo(true);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        setNullableParameters();
        super.onDestroyView();
    }

    private final void setNullableParameters() {
        this.gamesAdapter = null;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public EntertainmentSystemGamesLayoutBinding getViewBinding() {
        EntertainmentSystemGamesLayoutBinding inflate = EntertainmentSystemGamesLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }
}
