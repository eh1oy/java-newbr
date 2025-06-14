package com.blackhub.bronline.game.gui.notification;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
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
import com.blackhub.bronline.databinding.FragmentNotificationBinding;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragmentWithState;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.notification.adapters.NotificationNewStyleAdapter;
import com.blackhub.bronline.game.gui.notification.adapters.NotificationOldStyleAdapter;
import com.blackhub.bronline.game.gui.notification.data.NotificationObj;
import com.blackhub.bronline.game.gui.notification.state.NotificationUiState;
import com.blackhub.bronline.game.gui.notification.viewmodel.NotificationViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUINotificationNewStyle.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u001a\u0010\u0015\u001a\u00020\u00162\u0010\u0010\u0017\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0019\u0018\u00010\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0002H\u0016J0\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010&\u001a\u00020\u0016H\u0002J\b\u0010'\u001a\u00020\u0016H\u0002J\b\u0010(\u001a\u00020\u0016H\u0016J\b\u0010)\u001a\u00020\u0016H\u0002J\b\u0010*\u001a\u00020\u001eH\u0016J\b\u0010+\u001a\u00020\u0016H\u0016J\u0010\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020\u0016H\u0016J\u0012\u00100\u001a\u00020\u00162\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0010\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u001eH\u0002R$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u00065"}, d2 = {"Lcom/blackhub/bronline/game/gui/notification/GUINotificationNewStyle;", "Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragmentWithState;", "Lcom/blackhub/bronline/game/gui/notification/state/NotificationUiState;", "Lcom/blackhub/bronline/game/gui/notification/viewmodel/NotificationViewModel;", "Lcom/blackhub/bronline/databinding/FragmentNotificationBinding;", "()V", "notificationFactory", "Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "getNotificationFactory", "()Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "setNotificationFactory", "(Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;)V", "notificationNewStyleAdapter", "Lcom/blackhub/bronline/game/gui/notification/adapters/NotificationNewStyleAdapter;", "notificationOldStyleAdapter", "Lcom/blackhub/bronline/game/gui/notification/adapters/NotificationOldStyleAdapter;", "viewModel", "getViewModel", "()Lcom/blackhub/bronline/game/gui/notification/viewmodel/NotificationViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "attachAdapter", "", "myAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getGuiId", "", "getNewNotification", "isNewType", "", "handleUiState", "uiState", "initClickListenerForBothAdapters", "type", "id", "subId", "pos", "initNotificationClickListener", "initNotificationRV", "initViewsISAMPGUI", "isNeedRemovedAllNotifications", "isShowingGui", "newBackPress", "onAttach", "context", "Landroid/content/Context;", "onDestroyView", "onPacketIncoming", "json", "Lorg/json/JSONObject;", "showingNotification", "isShow", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGUINotificationNewStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUINotificationNewStyle.kt\ncom/blackhub/bronline/game/gui/notification/GUINotificationNewStyle\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,254:1\n106#2,15:255\n*S KotlinDebug\n*F\n+ 1 GUINotificationNewStyle.kt\ncom/blackhub/bronline/game/gui/notification/GUINotificationNewStyle\n*L\n53#1:255,15\n*E\n"})
/* loaded from: classes3.dex */
public final class GUINotificationNewStyle extends BaseISAMPGUIFragmentWithState<NotificationUiState, NotificationViewModel, FragmentNotificationBinding> {
    public static final int $stable = 8;

    @Inject
    public MainViewModelFactory<NotificationViewModel> notificationFactory;

    @Nullable
    public NotificationNewStyleAdapter notificationNewStyleAdapter;

    @Nullable
    public NotificationOldStyleAdapter notificationOldStyleAdapter;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 13;
    }

    public GUINotificationNewStyle() {
        super(R.layout.fragment_notification);
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.notification.GUINotificationNewStyle$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return GUINotificationNewStyle.this;
            }
        };
        Function0<ViewModelProvider.Factory> function02 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.notification.GUINotificationNewStyle$viewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return GUINotificationNewStyle.this.getNotificationFactory();
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.notification.GUINotificationNewStyle$special$$inlined$viewModels$default$1
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
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(NotificationViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.notification.GUINotificationNewStyle$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.notification.GUINotificationNewStyle$special$$inlined$viewModels$default$3
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FragmentNotificationBinding access$getBinding(GUINotificationNewStyle gUINotificationNewStyle) {
        return (FragmentNotificationBinding) gUINotificationNewStyle.getBinding();
    }

    @NotNull
    public final MainViewModelFactory<NotificationViewModel> getNotificationFactory() {
        MainViewModelFactory<NotificationViewModel> mainViewModelFactory = this.notificationFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("notificationFactory");
        return null;
    }

    public final void setNotificationFactory(@NotNull MainViewModelFactory<NotificationViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.notificationFactory = mainViewModelFactory;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    @NotNull
    public NotificationViewModel getViewModel() {
        return (NotificationViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
        if (json != null) {
            getViewModel().onPacketIncoming(json);
        }
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
        NotificationViewModel viewModel = getViewModel();
        NotificationNewStyleAdapter notificationNewStyleAdapter = this.notificationNewStyleAdapter;
        viewModel.migrateNotifications(notificationNewStyleAdapter != null ? notificationNewStyleAdapter.getNotActiveNotification() : null);
        NotificationNewStyleAdapter notificationNewStyleAdapter2 = this.notificationNewStyleAdapter;
        if (notificationNewStyleAdapter2 != null) {
            notificationNewStyleAdapter2.clearAllNotifications();
        }
        NotificationOldStyleAdapter notificationOldStyleAdapter = this.notificationOldStyleAdapter;
        if (notificationOldStyleAdapter != null) {
            notificationOldStyleAdapter.clearAllNotifications();
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.notificationNewStyleAdapter = null;
        this.notificationOldStyleAdapter = null;
        super.onDestroyView();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    public void handleUiState(@NotNull NotificationUiState uiState) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        if (!uiState.getBacklogNotification().isEmpty()) {
            if (uiState.isNewHud()) {
                attachAdapter(this.notificationNewStyleAdapter);
                NotificationNewStyleAdapter notificationNewStyleAdapter = this.notificationNewStyleAdapter;
                if (notificationNewStyleAdapter != null) {
                    if (uiState.getBacklogNotification().size() >= 2 && notificationNewStyleAdapter.getItemCount() == 0) {
                        NotificationObj notificationObj = (NotificationObj) CollectionsKt___CollectionsKt.firstOrNull((List) uiState.getBacklogNotification());
                        if (notificationObj != null) {
                            notificationNewStyleAdapter.addNewNotification(notificationObj);
                        }
                        NotificationObj notificationObj2 = (NotificationObj) CollectionsKt___CollectionsKt.getOrNull(uiState.getBacklogNotification(), 1);
                        if (notificationObj2 != null) {
                            notificationNewStyleAdapter.addNewNotification(notificationObj2);
                        }
                        NotificationViewModel.notificationActions$default(getViewModel(), null, 0, 3, 3, null);
                    } else if (notificationNewStyleAdapter.getItemCount() < 2) {
                        NotificationObj notificationObj3 = (NotificationObj) CollectionsKt___CollectionsKt.firstOrNull((List) uiState.getBacklogNotification());
                        if (notificationObj3 != null) {
                            notificationNewStyleAdapter.addNewNotification(notificationObj3);
                        }
                        NotificationViewModel.notificationActions$default(getViewModel(), null, 0, 2, 3, null);
                    }
                }
            } else {
                attachAdapter(this.notificationOldStyleAdapter);
                NotificationOldStyleAdapter notificationOldStyleAdapter = this.notificationOldStyleAdapter;
                if (notificationOldStyleAdapter != null) {
                    if (uiState.getBacklogNotification().size() >= 2 && notificationOldStyleAdapter.getItemCount() <= 2) {
                        NotificationObj notificationObj4 = (NotificationObj) CollectionsKt___CollectionsKt.firstOrNull((List) uiState.getBacklogNotification());
                        if (notificationObj4 != null) {
                            notificationOldStyleAdapter.addNewNotification(notificationObj4);
                        }
                        NotificationObj notificationObj5 = (NotificationObj) CollectionsKt___CollectionsKt.getOrNull(uiState.getBacklogNotification(), 1);
                        if (notificationObj5 != null) {
                            notificationOldStyleAdapter.addNewNotification(notificationObj5);
                        }
                        NotificationViewModel.notificationActions$default(getViewModel(), null, 0, 3, 3, null);
                    } else if (notificationOldStyleAdapter.getItemCount() < 4) {
                        NotificationObj notificationObj6 = (NotificationObj) CollectionsKt___CollectionsKt.firstOrNull((List) uiState.getBacklogNotification());
                        if (notificationObj6 != null) {
                            notificationOldStyleAdapter.addNewNotification(notificationObj6);
                        }
                        NotificationViewModel.notificationActions$default(getViewModel(), null, 0, 2, 3, null);
                    }
                }
            }
        }
        showingNotification(!uiState.isHideInterface());
        if (uiState.isNeedRemoveAllNotifications()) {
            isNeedRemovedAllNotifications();
        }
        if (uiState.getNotificationIdIfNeedRemove() != -1) {
            NotificationNewStyleAdapter notificationNewStyleAdapter2 = this.notificationNewStyleAdapter;
            if (notificationNewStyleAdapter2 != null) {
                notificationNewStyleAdapter2.closeNotificationById(uiState.getNotificationIdIfNeedRemove());
            }
            NotificationOldStyleAdapter notificationOldStyleAdapter2 = this.notificationOldStyleAdapter;
            if (notificationOldStyleAdapter2 != null) {
                notificationOldStyleAdapter2.closeNotificationById(uiState.getNotificationIdIfNeedRemove());
            }
            NotificationViewModel.notificationActions$default(getViewModel(), null, uiState.getNotificationIdIfNeedRemove(), 4, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragmentWithState
    public void initViewsISAMPGUI() {
        super.initViewsISAMPGUI();
        View root = ((FragmentNotificationBinding) getBinding()).getRoot();
        root.setClickable(false);
        root.setFocusable(false);
        NotificationViewModel.notificationActions$default(getViewModel(), getJsonObj(), 0, 1, 2, null);
        initNotificationRV();
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragmentWithState, com.blackhub.bronline.game.ISAMPGUI
    public boolean isShowingGui() {
        NotificationOldStyleAdapter notificationOldStyleAdapter;
        NotificationNewStyleAdapter notificationNewStyleAdapter = this.notificationNewStyleAdapter;
        return (notificationNewStyleAdapter != null && (notificationNewStyleAdapter == null || notificationNewStyleAdapter.getItemCount() != 0)) || ((notificationOldStyleAdapter = this.notificationOldStyleAdapter) != null && (notificationOldStyleAdapter == null || notificationOldStyleAdapter.getItemCount() != 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initNotificationRV() {
        this.notificationNewStyleAdapter = new NotificationNewStyleAdapter();
        this.notificationOldStyleAdapter = new NotificationOldStyleAdapter();
        RecyclerView recyclerView = ((FragmentNotificationBinding) getBinding()).notificationList;
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
        initNotificationClickListener();
    }

    public final void initNotificationClickListener() {
        NotificationNewStyleAdapter notificationNewStyleAdapter = this.notificationNewStyleAdapter;
        if (notificationNewStyleAdapter != null) {
            notificationNewStyleAdapter.setNotificationClickListener(new Function4<Integer, Integer, Integer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.notification.GUINotificationNewStyle$initNotificationClickListener$1
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
                    invoke(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i, int i2, int i3, int i4) {
                    GUINotificationNewStyle.this.initClickListenerForBothAdapters(i, i2, i3, i4, true);
                }
            });
        }
        NotificationOldStyleAdapter notificationOldStyleAdapter = this.notificationOldStyleAdapter;
        if (notificationOldStyleAdapter == null) {
            return;
        }
        notificationOldStyleAdapter.setNotificationClickListener(new Function4<Integer, Integer, Integer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.notification.GUINotificationNewStyle$initNotificationClickListener$2
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
                invoke(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i, int i2, int i3, int i4) {
                GUINotificationNewStyle.this.initClickListenerForBothAdapters(i, i2, i3, i4, false);
            }
        });
    }

    public final void initClickListenerForBothAdapters(int type, int id, int subId, int pos, boolean isNewType) {
        if (type == 6) {
            NotificationViewModel viewModel = getViewModel();
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            viewModel.sendOther(requireActivity);
            return;
        }
        if (type != 999) {
            if (id != -99 && type != 2) {
                getViewModel().clickButton(type, id, subId);
            }
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new GUINotificationNewStyle$initClickListenerForBothAdapters$1(isNewType, this, pos, null), 2, null);
            return;
        }
        UtilsKt.crashlyticsRecordNewException("invalid notification position = " + pos);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void attachAdapter(RecyclerView.Adapter<? extends RecyclerView.ViewHolder> myAdapter) {
        if (Intrinsics.areEqual(((FragmentNotificationBinding) getBinding()).notificationList.getAdapter(), myAdapter)) {
            return;
        }
        ((FragmentNotificationBinding) getBinding()).notificationList.setAdapter(myAdapter);
    }

    public final void getNewNotification(boolean isNewType) {
        getViewModel().getNotificationFromBacklog(isNewType);
    }

    public final void showingNotification(boolean isShow) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new GUINotificationNewStyle$showingNotification$1(this, isShow, null), 2, null);
    }

    public final void isNeedRemovedAllNotifications() {
        getViewModel().removeAllNotifications();
        NotificationNewStyleAdapter notificationNewStyleAdapter = this.notificationNewStyleAdapter;
        if (notificationNewStyleAdapter != null) {
            notificationNewStyleAdapter.clearAllNotifications();
        }
        NotificationOldStyleAdapter notificationOldStyleAdapter = this.notificationOldStyleAdapter;
        if (notificationOldStyleAdapter != null) {
            notificationOldStyleAdapter.clearAllNotifications();
        }
    }
}
