package com.blackhub.bronline.game.gui.donate;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageButton;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.DonateMainLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.core.extension.FloatExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.blackpass.BlackPassMainUIState;
import com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassActivateViewModel;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassPrizeListViewModel;
import com.blackhub.bronline.game.gui.donate.adapters.DonateHeaderOrFooterAdapter;
import com.blackhub.bronline.game.gui.donate.data.FragmentIDWithStatusOfReplay;
import com.blackhub.bronline.game.gui.donate.data.HeaderOrFooterButtonObj;
import com.blackhub.bronline.game.gui.donate.data.ObjForResultDialog;
import com.blackhub.bronline.game.gui.donate.data.PreviewPrize;
import com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins;
import com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar;
import com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack;
import com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateTile;
import com.blackhub.bronline.game.gui.donate.utils.DonateAllKeys;
import com.blackhub.bronline.game.gui.donate.utils.DonateConstants;
import com.blackhub.bronline.game.gui.donate.utils.DonateDictionaryKt;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateDepositCoinsViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateServiceViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel;
import com.blackhub.bronline.game.ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.apache.ivy.osgi.updatesite.xml.FeatureParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUIDonate.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J \u0010Y\u001a\u00020Z2\u000e\u0010[\u001a\n\u0012\u0006\b\u0001\u0012\u00020]0\\2\u0006\u0010^\u001a\u00020$H\u0002J\b\u0010_\u001a\u00020ZH\u0002J\b\u0010`\u001a\u00020ZH\u0002J\u0018\u0010a\u001a\n\u0012\u0006\b\u0001\u0012\u00020]0\\2\u0006\u0010^\u001a\u00020$H\u0002J\u0012\u0010b\u001a\u00020Z2\b\u0010I\u001a\u0004\u0018\u00010JH\u0002J\b\u0010c\u001a\u00020$H\u0016J\b\u0010d\u001a\u00020\u0002H\u0016J\b\u0010e\u001a\u00020ZH\u0002J\b\u0010f\u001a\u00020ZH\u0002J\b\u0010g\u001a\u00020ZH\u0002J\b\u0010h\u001a\u00020ZH\u0002J\b\u0010i\u001a\u00020ZH\u0002J\b\u0010j\u001a\u00020ZH\u0002J\b\u0010k\u001a\u00020ZH\u0002J\b\u0010l\u001a\u00020ZH\u0002J\b\u0010m\u001a\u00020ZH\u0002J\b\u0010n\u001a\u00020ZH\u0016J\b\u0010o\u001a\u00020HH\u0016J\b\u0010p\u001a\u00020ZH\u0016J\u0010\u0010q\u001a\u00020Z2\u0006\u0010r\u001a\u00020sH\u0016J\b\u0010t\u001a\u00020ZH\u0002J\b\u0010u\u001a\u00020ZH\u0016J\u0010\u0010v\u001a\u00020Z2\u0006\u0010w\u001a\u00020JH\u0016J\b\u0010x\u001a\u00020ZH\u0016J \u0010y\u001a\u00020Z2\u000e\u0010[\u001a\n\u0012\u0006\b\u0001\u0012\u00020]0\\2\u0006\u0010^\u001a\u00020$H\u0002J\b\u0010z\u001a\u00020ZH\u0002J#\u0010{\u001a\u00020Z2\u0006\u0010|\u001a\u00020}2\u0011\u0010~\u001a\r\u0012\u0007\b\u0001\u0012\u00030\u0080\u0001\u0018\u00010\u007fH\u0002J\t\u0010\u0081\u0001\u001a\u00020ZH\u0002J\t\u0010\u0082\u0001\u001a\u00020ZH\u0002J\u0012\u0010\u0083\u0001\u001a\u00020Z2\u0007\u0010\u0084\u0001\u001a\u00020$H\u0002J\u0012\u0010\u0085\u0001\u001a\u00020Z2\u0007\u0010\u0086\u0001\u001a\u00020$H\u0002J\u0013\u0010\u0087\u0001\u001a\u00020Z2\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001H\u0002J\t\u0010\u008a\u0001\u001a\u00020ZH\u0002J\u0013\u0010\u008b\u0001\u001a\u00020Z2\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001H\u0002J\t\u0010\u008e\u0001\u001a\u00020ZH\u0002J\t\u0010\u008f\u0001\u001a\u00020ZH\u0002J\u0013\u0010\u0090\u0001\u001a\u00020Z2\b\u0010\u0091\u0001\u001a\u00030\u0092\u0001H\u0002J\t\u0010\u0093\u0001\u001a\u00020ZH\u0002R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001b\u0010\u0014\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\b\"\u0004\b\u001b\u0010\nR\u001b\u0010\u001c\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\b\"\u0004\b)\u0010\nR\u001b\u0010*\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u000f\u001a\u0004\b+\u0010,R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R$\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\b\"\u0004\b3\u0010\nR$\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\b\"\u0004\b7\u0010\nR$\u00108\u001a\b\u0012\u0004\u0012\u0002090\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\b\"\u0004\b;\u0010\nR\u001b\u0010<\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u000f\u001a\u0004\b=\u0010>R\u001b\u0010@\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010\u000f\u001a\u0004\bA\u0010BR\u0010\u0010D\u001a\u0004\u0018\u00010EX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010EX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020HX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010I\u001a\u0004\u0018\u00010JX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\b\"\u0004\bN\u0010\nR\u001b\u0010O\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010\u000f\u001a\u0004\bP\u0010QR\u001b\u0010S\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010\u000f\u001a\u0004\bT\u0010UR\u0010\u0010W\u001a\u0004\u0018\u00010XX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0094\u0001"}, d2 = {"Lcom/blackhub/bronline/game/gui/donate/GUIDonate;", "Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragment;", "Lcom/blackhub/bronline/databinding/DonateMainLayoutBinding;", "()V", "blackPassActivateFactory", "Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "Lcom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassActivateViewModel;", "getBlackPassActivateFactory", "()Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "setBlackPassActivateFactory", "(Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;)V", "blackPassActivateViewModel", "getBlackPassActivateViewModel", "()Lcom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassActivateViewModel;", "blackPassActivateViewModel$delegate", "Lkotlin/Lazy;", "blackPassMainFactory", "Lcom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel;", "getBlackPassMainFactory", "setBlackPassMainFactory", "blackPassMainViewModel", "getBlackPassMainViewModel", "()Lcom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel;", "blackPassMainViewModel$delegate", "blackPassPrizeListFactory", "Lcom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassPrizeListViewModel;", "getBlackPassPrizeListFactory", "setBlackPassPrizeListFactory", "blackPassPrizeListViewModel", "getBlackPassPrizeListViewModel", "()Lcom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassPrizeListViewModel;", "blackPassPrizeListViewModel$delegate", "blockMessageTimer", "", "blockTimer", "currentFragment", "", "currentPage", "depositCoinsFactory", "Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateDepositCoinsViewModel;", "getDepositCoinsFactory", "setDepositCoinsFactory", "depositCoinsViewModel", "getDepositCoinsViewModel", "()Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateDepositCoinsViewModel;", "depositCoinsViewModel$delegate", "dialogConfirmation", "Lcom/blackhub/bronline/game/gui/donate/DonateCustomDialog;", "donateFactory", "Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateMainViewModel;", "getDonateFactory", "setDonateFactory", "donateServiceFactory", "Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateServiceViewModel;", "getDonateServiceFactory", "setDonateServiceFactory", "donateTileFactory", "Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateTileViewModel;", "getDonateTileFactory", "setDonateTileFactory", "donateTileViewModel", "getDonateTileViewModel", "()Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateTileViewModel;", "donateTileViewModel$delegate", "donateViewModel", "getDonateViewModel", "()Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateMainViewModel;", "donateViewModel$delegate", "footerAdapter", "Lcom/blackhub/bronline/game/gui/donate/adapters/DonateHeaderOrFooterAdapter;", "headerAdapter", "ifEmptyDonateItemsFromJSON", "", "jsonObject", "Lorg/json/JSONObject;", "mainActivityFactory", "Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "getMainActivityFactory", "setMainActivityFactory", "mainActivityViewModel", "getMainActivityViewModel", "()Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "mainActivityViewModel$delegate", "serviceViewModel", "getServiceViewModel", "()Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateServiceViewModel;", "serviceViewModel$delegate", "timeoutRunnable", "Ljava/lang/Runnable;", "addFragment", "", FeatureParser.PluginHandler.FRAGMENT, "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "fragmentId", "closeDialog", "closeTimeout", "getCurrentClassOfFragment", "getDataFromJson", "getGuiId", "getViewBinding", "initDialogClickListeners", "initDialogConfirmation", "initDonateInterface", "initFooterPages", "initHeaderPages", "initLayoutChangeListener", "initListeners", "initObjects", "initPageChangeListener", "initViewsISAMPGUI", "isShowingGui", "newBackPress", "onAttach", "context", "Landroid/content/Context;", "onCLickBpButton", "onDestroyView", "onPacketIncoming", "json", "onResume", "replaceFragment", "setFirstTabForTilePage", "setInitParamsForRecyclerView", "currentRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "currentAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "setNullableParameters", "setObservers", "setValueOfCoinsInView", "valueOfCoins", "setValueOfRublesInView", "valueOfRubles", "showErrorMessage", "newMessage", "", "showMainError", "showNewFragment", "fragmentIDWithStatusOfReplay", "Lcom/blackhub/bronline/game/gui/donate/data/FragmentIDWithStatusOfReplay;", "showOnlyBPActivate", "showOnlyBpTasks", "startActionForTypeOfInterface", "prize", "Lcom/blackhub/bronline/game/gui/donate/data/PreviewPrize;", "startTimeout", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGUIDonate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUIDonate.kt\ncom/blackhub/bronline/game/gui/donate/GUIDonate\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1467:1\n172#2,9:1468\n106#2,15:1477\n106#2,15:1492\n106#2,15:1507\n106#2,15:1522\n106#2,15:1537\n106#2,15:1552\n106#2,15:1567\n256#3,2:1582\n256#3,2:1584\n*S KotlinDebug\n*F\n+ 1 GUIDonate.kt\ncom/blackhub/bronline/game/gui/donate/GUIDonate\n*L\n204#1:1468,9\n210#1:1477,15\n216#1:1492,15\n222#1:1507,15\n228#1:1522,15\n234#1:1537,15\n241#1:1552,15\n248#1:1567,15\n354#1:1582,2\n1452#1:1584,2\n*E\n"})
/* loaded from: classes3.dex */
public final class GUIDonate extends BaseISAMPGUIFragment<DonateMainLayoutBinding> {
    public static final int $stable = 8;

    @Inject
    public MainViewModelFactory<BlackPassActivateViewModel> blackPassActivateFactory;

    /* renamed from: blackPassActivateViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy blackPassActivateViewModel;

    @Inject
    public MainViewModelFactory<BlackPassMainViewModel> blackPassMainFactory;

    /* renamed from: blackPassMainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy blackPassMainViewModel;

    @Inject
    public MainViewModelFactory<BlackPassPrizeListViewModel> blackPassPrizeListFactory;

    /* renamed from: blackPassPrizeListViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy blackPassPrizeListViewModel;
    public long blockMessageTimer;
    public long blockTimer;
    public int currentFragment;
    public int currentPage;

    @Inject
    public MainViewModelFactory<DonateDepositCoinsViewModel> depositCoinsFactory;

    /* renamed from: depositCoinsViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy depositCoinsViewModel;

    @Nullable
    public DonateCustomDialog dialogConfirmation;

    @Inject
    public MainViewModelFactory<DonateMainViewModel> donateFactory;

    @Inject
    public MainViewModelFactory<DonateServiceViewModel> donateServiceFactory;

    @Inject
    public MainViewModelFactory<DonateTileViewModel> donateTileFactory;

    /* renamed from: donateTileViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy donateTileViewModel;

    /* renamed from: donateViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy donateViewModel;

    @Nullable
    public DonateHeaderOrFooterAdapter footerAdapter;

    @Nullable
    public DonateHeaderOrFooterAdapter headerAdapter;
    public boolean ifEmptyDonateItemsFromJSON = true;

    @Nullable
    public JSONObject jsonObject;

    @Inject
    public MainViewModelFactory<JNIActivityViewModel> mainActivityFactory;

    /* renamed from: mainActivityViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainActivityViewModel;

    /* renamed from: serviceViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy serviceViewModel;

    @Nullable
    public Runnable timeoutRunnable;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 22;
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment, com.blackhub.bronline.game.ISAMPGUI
    public boolean isShowingGui() {
        return true;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ DonateMainLayoutBinding access$getBinding(GUIDonate gUIDonate) {
        return (DonateMainLayoutBinding) gUIDonate.getBinding();
    }

    @NotNull
    public final MainViewModelFactory<JNIActivityViewModel> getMainActivityFactory() {
        MainViewModelFactory<JNIActivityViewModel> mainViewModelFactory = this.mainActivityFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mainActivityFactory");
        return null;
    }

    public final void setMainActivityFactory(@NotNull MainViewModelFactory<JNIActivityViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.mainActivityFactory = mainViewModelFactory;
    }

    public final JNIActivityViewModel getMainActivityViewModel() {
        return (JNIActivityViewModel) this.mainActivityViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<DonateMainViewModel> getDonateFactory() {
        MainViewModelFactory<DonateMainViewModel> mainViewModelFactory = this.donateFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("donateFactory");
        return null;
    }

    public final void setDonateFactory(@NotNull MainViewModelFactory<DonateMainViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.donateFactory = mainViewModelFactory;
    }

    public final DonateMainViewModel getDonateViewModel() {
        return (DonateMainViewModel) this.donateViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<DonateTileViewModel> getDonateTileFactory() {
        MainViewModelFactory<DonateTileViewModel> mainViewModelFactory = this.donateTileFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("donateTileFactory");
        return null;
    }

    public final void setDonateTileFactory(@NotNull MainViewModelFactory<DonateTileViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.donateTileFactory = mainViewModelFactory;
    }

    public final DonateTileViewModel getDonateTileViewModel() {
        return (DonateTileViewModel) this.donateTileViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<DonateDepositCoinsViewModel> getDepositCoinsFactory() {
        MainViewModelFactory<DonateDepositCoinsViewModel> mainViewModelFactory = this.depositCoinsFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("depositCoinsFactory");
        return null;
    }

    public final void setDepositCoinsFactory(@NotNull MainViewModelFactory<DonateDepositCoinsViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.depositCoinsFactory = mainViewModelFactory;
    }

    public final DonateDepositCoinsViewModel getDepositCoinsViewModel() {
        return (DonateDepositCoinsViewModel) this.depositCoinsViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<DonateServiceViewModel> getDonateServiceFactory() {
        MainViewModelFactory<DonateServiceViewModel> mainViewModelFactory = this.donateServiceFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("donateServiceFactory");
        return null;
    }

    public final void setDonateServiceFactory(@NotNull MainViewModelFactory<DonateServiceViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.donateServiceFactory = mainViewModelFactory;
    }

    public final DonateServiceViewModel getServiceViewModel() {
        return (DonateServiceViewModel) this.serviceViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<BlackPassMainViewModel> getBlackPassMainFactory() {
        MainViewModelFactory<BlackPassMainViewModel> mainViewModelFactory = this.blackPassMainFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("blackPassMainFactory");
        return null;
    }

    public final void setBlackPassMainFactory(@NotNull MainViewModelFactory<BlackPassMainViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.blackPassMainFactory = mainViewModelFactory;
    }

    public final BlackPassMainViewModel getBlackPassMainViewModel() {
        return (BlackPassMainViewModel) this.blackPassMainViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<BlackPassActivateViewModel> getBlackPassActivateFactory() {
        MainViewModelFactory<BlackPassActivateViewModel> mainViewModelFactory = this.blackPassActivateFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("blackPassActivateFactory");
        return null;
    }

    public final void setBlackPassActivateFactory(@NotNull MainViewModelFactory<BlackPassActivateViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.blackPassActivateFactory = mainViewModelFactory;
    }

    public final BlackPassActivateViewModel getBlackPassActivateViewModel() {
        return (BlackPassActivateViewModel) this.blackPassActivateViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<BlackPassPrizeListViewModel> getBlackPassPrizeListFactory() {
        MainViewModelFactory<BlackPassPrizeListViewModel> mainViewModelFactory = this.blackPassPrizeListFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("blackPassPrizeListFactory");
        return null;
    }

    public final void setBlackPassPrizeListFactory(@NotNull MainViewModelFactory<BlackPassPrizeListViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.blackPassPrizeListFactory = mainViewModelFactory;
    }

    public final BlackPassPrizeListViewModel getBlackPassPrizeListViewModel() {
        return (BlackPassPrizeListViewModel) this.blackPassPrizeListViewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        App.INSTANCE.appComponent().inject(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@NotNull JSONObject json) {
        DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(json, "json");
        int optInt = json.optInt("t");
        int i3 = R.string.donate_result_replenish;
        int i4 = R.string.common_error;
        switch (optInt) {
            case -1:
                Group groupFooter = ((DonateMainLayoutBinding) getBinding()).groupFooter;
                Intrinsics.checkNotNullExpressionValue(groupFooter, "groupFooter");
                groupFooter.setVisibility(8);
                int optInt2 = json.optInt("ty");
                if (optInt2 == -1) {
                    getBlackPassMainViewModel().initInterface(json, getMainActivityViewModel().getConfigurationJsons().getValue().getVehiclesFromJson(), getMainActivityViewModel().getConfigurationJsons().getValue().getSkinsFromJson(), getMainActivityViewModel().getConfigurationJsons().getValue().getBpRewardsModel().getListOfAwardsTypes(), json.optInt("a"));
                    if (json.optInt("sp") == 1) {
                        showOnlyBPActivate();
                        getBlackPassMainViewModel().onClickSelectLayout(4);
                        break;
                    }
                } else if (optInt2 == 0) {
                    int optInt3 = json.optInt("la");
                    if (optInt3 == 4 && (donateHeaderOrFooterAdapter = this.headerAdapter) != null) {
                        donateHeaderOrFooterAdapter.deselectTab();
                    }
                    getBlackPassMainViewModel().updateJson(json, optInt3, getMainActivityViewModel().getConfigurationJsons().getValue().getBlackPassItemsFromJson().getDeluxeRewards(), getMainActivityViewModel().getConfigurationJsons().getValue().getBpRewardsModel().getListOfAwardsTypes());
                    break;
                } else if (optInt2 == 1) {
                    int optInt4 = json.optInt("la");
                    if (optInt4 == 0) {
                        if (json.optInt("s") == 0) {
                            getDepositCoinsViewModel().setInputCoins(0);
                            BlackPassMainViewModel blackPassMainViewModel = getBlackPassMainViewModel();
                            String string = getString(R.string.black_pass_not_enough_money);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            String string2 = getString(R.string.black_pass_top_up_your_account);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            String string3 = getString(R.string.common_error);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            String string4 = getString(R.string.donate_result_replenish);
                            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                            blackPassMainViewModel.showDialogResult(string, 0, string2, string3, string4, 1);
                            break;
                        } else {
                            BlackPassMainViewModel.levelUp$default(getBlackPassMainViewModel(), 0, 0, 3, null);
                            break;
                        }
                    } else if (optInt4 == 1) {
                        if (json.optInt("s") == 0) {
                            getDepositCoinsViewModel().setInputCoins(10);
                            BlackPassMainViewModel blackPassMainViewModel2 = getBlackPassMainViewModel();
                            String string5 = getString(R.string.black_pass_not_enough_money);
                            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                            String string6 = getString(R.string.black_pass_top_up_your_account);
                            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                            String string7 = getString(R.string.common_error);
                            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                            String string8 = getString(R.string.donate_result_replenish);
                            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                            blackPassMainViewModel2.showDialogResult(string5, 0, string6, string7, string8, 1);
                            break;
                        } else {
                            getBlackPassMainViewModel().updateJson(json, 1, getMainActivityViewModel().getConfigurationJsons().getValue().getBlackPassItemsFromJson().getDeluxeRewards(), getMainActivityViewModel().getConfigurationJsons().getValue().getBpRewardsModel().getListOfAwardsTypes());
                            break;
                        }
                    } else if (optInt4 == 3) {
                        getBlackPassMainViewModel().updateMyPosition(json.optInt("p"));
                        break;
                    } else if (optInt4 == 4) {
                        if (json.optInt("s") != 0) {
                            getBlackPassMainViewModel().setPremiumStatusSuccessfullyBought();
                            if (getBlackPassMainViewModel().getUiState().getValue().getTimerDaysAndHours().getDays() < 14 && getBlackPassMainViewModel().getUiState().getValue().getBpLevel() < getBlackPassMainViewModel().getUiState().getValue().getMaxBpLevel()) {
                                getDonateViewModel().setShowBoostLevelsHintBPView(true);
                                break;
                            }
                        } else {
                            getDepositCoinsViewModel().setPriceIfNotPurchasePremium();
                            BlackPassMainViewModel blackPassMainViewModel3 = getBlackPassMainViewModel();
                            String string9 = getString(R.string.black_pass_not_enough_money);
                            Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                            String string10 = getString(R.string.black_pass_top_up_your_account);
                            Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                            String string11 = getString(R.string.common_error);
                            Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                            String string12 = getString(R.string.donate_result_replenish);
                            Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
                            blackPassMainViewModel3.showDialogResult(string9, 0, string10, string11, string12, 1);
                            break;
                        }
                    }
                } else if (optInt2 == 2) {
                    if (json.optInt("la") == 0 && json.optInt("s") == 1) {
                        getBlackPassMainViewModel().updateAfterGetPrize(json);
                        break;
                    }
                } else if (optInt2 == 3 && json.optInt("tb", -2) == -2) {
                    getBlackPassMainViewModel().levelUp(json.optInt("e"), json.optInt("l"));
                    break;
                }
                break;
            case 0:
                if (json.optInt("y") == 1) {
                    DonateMainViewModel donateViewModel = getDonateViewModel();
                    donateViewModel.setValueOfRubles(json.optInt("r"));
                    donateViewModel.setValueOfCoins(json.optInt("s"));
                    i4 = R.string.common_result_done;
                    i2 = 0;
                    i = 1;
                } else if (json.optInt("k") > 0) {
                    getDepositCoinsViewModel().setInputCoins(json.optInt("k"));
                    i = 0;
                    i2 = 1;
                    DonateMainViewModel donateViewModel2 = getDonateViewModel();
                    donateViewModel2.closeTimeoutConfirmationDialog();
                    String optString = json.optString("m");
                    Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                    String optString2 = json.optString("n");
                    Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
                    String string13 = getString(i4);
                    Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
                    String string14 = getString(i3);
                    Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
                    donateViewModel2.setObjForDialogResult(new ObjForResultDialog(optString, i, optString2, string13, string14, i2));
                    getDonateTileViewModel().removeSaleItemInfoAndUpdateLimit(json);
                    break;
                } else if (json.optInt("tb") == 0) {
                    i = 0;
                    i2 = 0;
                }
                i3 = 2131886600;
                DonateMainViewModel donateViewModel22 = getDonateViewModel();
                donateViewModel22.closeTimeoutConfirmationDialog();
                String optString3 = json.optString("m");
                Intrinsics.checkNotNullExpressionValue(optString3, "optString(...)");
                String optString22 = json.optString("n");
                Intrinsics.checkNotNullExpressionValue(optString22, "optString(...)");
                String string132 = getString(i4);
                Intrinsics.checkNotNullExpressionValue(string132, "getString(...)");
                String string142 = getString(i3);
                Intrinsics.checkNotNullExpressionValue(string142, "getString(...)");
                donateViewModel22.setObjForDialogResult(new ObjForResultDialog(optString3, i, optString22, string132, string142, i2));
                getDonateTileViewModel().removeSaleItemInfoAndUpdateLimit(json);
                break;
            case 2:
                getDonateTileViewModel().updateSurpriseAndSalesEveryMinute(json);
                break;
            case 3:
                DonateMainViewModel donateViewModel3 = getDonateViewModel();
                donateViewModel3.setValueOfRubles(json.optInt("s"));
                donateViewModel3.setValueOfCoins(json.optInt("r"));
                break;
            case 5:
                getDepositCoinsViewModel().setCoins(json.optInt("s"));
                break;
            case 6:
                getDonateTileViewModel().clearLimit(json.optInt("id"));
                break;
            case 7:
                getDonateTileViewModel().updateValueOfLimit(json.optJSONArray("b"));
                break;
            case 8:
                getDonateTileViewModel().updateNewSaleItems(json);
                break;
            case 9:
                DonateMainViewModel donateViewModel4 = getDonateViewModel();
                String optString4 = json.optString("m");
                Intrinsics.checkNotNullExpressionValue(optString4, "optString(...)");
                String optString5 = json.optString("n");
                Intrinsics.checkNotNullExpressionValue(optString5, "optString(...)");
                String string15 = getString(R.string.common_error);
                Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
                String string16 = getString(2131886486);
                Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
                donateViewModel4.setObjForDialogResult(new ObjForResultDialog(optString4, 0, optString5, string15, string16, 999));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() {
        getDataFromJson(getJsonObj());
        initObjects();
        setObservers();
        initHeaderPages();
        initFooterPages();
        initListeners();
        ComposeView composeView = ((DonateMainLayoutBinding) getBinding()).composeViewFirstDonateFullScreen;
        ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed disposeOnViewTreeLifecycleDestroyed = ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE;
        composeView.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        ((DonateMainLayoutBinding) getBinding()).composeViewSecondDonateFullScreen.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        ((DonateMainLayoutBinding) getBinding()).composeViewDonate.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        switch (this.currentFragment) {
            case 101:
            case 102:
            case 103:
                ((DonateMainLayoutBinding) getBinding()).composeViewDonate.setVisibility(0);
                break;
        }
        ((DonateMainLayoutBinding) getBinding()).composeViewDonate.setContent(ComposableLambdaKt.composableLambdaInstance(1149016189, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$initViewsISAMPGUI$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@Nullable Composer composer, int i) {
                BlackPassMainViewModel blackPassMainViewModel;
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1149016189, i, -1, "com.blackhub.bronline.game.gui.donate.GUIDonate.initViewsISAMPGUI.<anonymous> (GUIDonate.kt:514)");
                    }
                    blackPassMainViewModel = GUIDonate.this.getBlackPassMainViewModel();
                    ImageBitmapKt.m7555ImageBitmapAy9G7rc(((BlackPassMainUIState) FlowExtKt.collectAsStateWithLifecycle(blackPassMainViewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7).getValue()).getSeasonBg(), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composer, 3128, 116);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }));
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public DonateMainLayoutBinding getViewBinding() {
        DonateMainLayoutBinding inflate = DonateMainLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        setNullableParameters();
        super.onDestroyView();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (UtilsKt.isRustoreBuildVariant() || !getDepositCoinsViewModel().isShowFragment().getValue().booleanValue()) {
            return;
        }
        getDepositCoinsViewModel().closeDepositCoinsFragment(true);
        onCLickBpButton();
    }

    public final void getDataFromJson(JSONObject jsonObject) {
        Unit unit;
        if (jsonObject != null) {
            boolean isOne = IntExtensionKt.isOne(Integer.valueOf(jsonObject.optInt(DonateAllKeys.IS_NEED_SHOW_DONATE_PACKAGE_DU)));
            boolean isOne2 = IntExtensionKt.isOne(Integer.valueOf(jsonObject.optInt("ds")));
            this.jsonObject = jsonObject;
            DonateMainViewModel donateViewModel = getDonateViewModel();
            donateViewModel.setValueOfRubles(jsonObject.optInt("r"));
            donateViewModel.setValueOfCoins(jsonObject.optInt("d"));
            DonateDepositCoinsViewModel depositCoinsViewModel = getDepositCoinsViewModel();
            String optString = jsonObject.optString("em");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            depositCoinsViewModel.setEmail(optString);
            DonateDepositCoinsViewModel depositCoinsViewModel2 = getDepositCoinsViewModel();
            String optString2 = jsonObject.optString("nm");
            Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
            depositCoinsViewModel2.setNickname(optString2);
            getDepositCoinsViewModel().setDoubleDonateValue(isOne2);
            getMainActivityViewModel().connectPurchases(isOne2, isOne);
            getDepositCoinsViewModel().setServerNumber(jsonObject.optInt(DonateAllKeys.KEY_SV_SET_SERVER_NUMBER));
            getDepositCoinsViewModel().setFlagForOpenDonatePackage(isOne);
            int optInt = jsonObject.optInt("lc");
            if (optInt == 2) {
                this.currentFragment = 102;
            } else if (optInt == 3) {
                this.currentFragment = 103;
            } else if (optInt == 4) {
                this.currentFragment = 101;
            } else if (optInt == 5) {
                this.currentFragment = 9;
            } else if (optInt == 6) {
                this.currentFragment = 14;
            }
            this.currentPage = jsonObject.optInt("k");
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            firebaseCrashlytics.log("jsonObject == null");
            firebaseCrashlytics.recordException(new Throwable());
        }
    }

    public final void initObjects() {
        initDialogConfirmation();
        getMainActivityViewModel();
        getDonateViewModel();
        getDonateTileViewModel();
        getDepositCoinsViewModel();
        getServiceViewModel();
        getBlackPassMainViewModel();
        getBlackPassActivateViewModel();
        getBlackPassPrizeListViewModel();
    }

    public final void initDialogConfirmation() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        DonateCustomDialog donateCustomDialog = new DonateCustomDialog(requireActivity);
        donateCustomDialog.setClickListenerInBuyCarDialog(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$initDialogConfirmation$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                DonateMainViewModel donateViewModel;
                donateViewModel = GUIDonate.this.getDonateViewModel();
                donateViewModel.confirmationBuyCar(i);
            }
        });
        this.dialogConfirmation = donateCustomDialog;
        initDialogClickListeners();
    }

    public final void initDialogClickListeners() {
        DonateCustomDialog donateCustomDialog = this.dialogConfirmation;
        if (donateCustomDialog == null) {
            return;
        }
        donateCustomDialog.setResultClickListener(new Function2<Integer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$initDialogClickListeners$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
                invoke(num.intValue(), num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i, int i2) {
                DonateMainViewModel donateViewModel;
                DonateMainViewModel donateViewModel2;
                DonateMainViewModel donateViewModel3;
                DonateMainViewModel donateViewModel4;
                DonateMainViewModel donateViewModel5;
                if (i == 0) {
                    donateViewModel = GUIDonate.this.getDonateViewModel();
                    donateViewModel.closeConfirmationDialog();
                    return;
                }
                if (i == 1) {
                    donateViewModel2 = GUIDonate.this.getDonateViewModel();
                    donateViewModel2.closeConfirmationDialog();
                    GUIDonate.this.onCLickBpButton();
                    return;
                }
                if (i == 2) {
                    donateViewModel3 = GUIDonate.this.getDonateViewModel();
                    donateViewModel3.confirmationBuySkinsOrMoneyOrAccessoriesOrServices();
                    return;
                }
                if (i == 3) {
                    donateViewModel4 = GUIDonate.this.getDonateViewModel();
                    donateViewModel4.sendCustomValueOfRubles(i2);
                } else if (i == 333) {
                    donateViewModel5 = GUIDonate.this.getDonateViewModel();
                    donateViewModel5.setClosedStatusForInputCustomValueOfRublesDialog();
                } else {
                    if (i != 999) {
                        return;
                    }
                    GUIDonate.this.closeFragment();
                }
            }
        });
    }

    public final void startTimeout() {
        View view;
        if (this.timeoutRunnable != null && (view = getView()) != null) {
            view.removeCallbacks(this.timeoutRunnable);
        }
        this.timeoutRunnable = new Runnable() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                GUIDonate.startTimeout$lambda$8(GUIDonate.this);
            }
        };
        View view2 = getView();
        if (view2 != null) {
            view2.postDelayed(this.timeoutRunnable, 3000L);
        }
    }

    public static final void startTimeout$lambda$8(GUIDonate this$0) {
        String str;
        String string;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DonateMainViewModel donateViewModel = this$0.getDonateViewModel();
        FragmentActivity activity = this$0.getActivity();
        String str2 = DonateConstants.DONATE_STUB;
        if (activity == null || (str = activity.getString(R.string.common_error)) == null) {
            str = DonateConstants.DONATE_STUB;
        }
        FragmentActivity activity2 = this$0.getActivity();
        if (activity2 != null && (string = activity2.getString(R.string.donate_error_body)) != null) {
            str2 = string;
        }
        donateViewModel.showLocalError(0, str, str2);
    }

    public final void closeTimeout() {
        if (this.timeoutRunnable != null) {
            View view = getView();
            if (view != null) {
                view.removeCallbacks(this.timeoutRunnable);
            }
            this.timeoutRunnable = null;
        }
    }

    private final void setObservers() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUIDonate$setObservers$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUIDonate$setObservers$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUIDonate$setObservers$3(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUIDonate$setObservers$4(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUIDonate$setObservers$5(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUIDonate$setObservers$6(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUIDonate$setObservers$7(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUIDonate$setObservers$8(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUIDonate$setObservers$9(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUIDonate$setObservers$10(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUIDonate$setObservers$11(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUIDonate$setObservers$12(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUIDonate$setObservers$13(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUIDonate$setObservers$14(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUIDonate$setObservers$15(this, null), 3, null);
    }

    public final void startActionForTypeOfInterface(PreviewPrize prize) {
        if (prize.getFromInterface() == 0) {
            getBlackPassMainViewModel().getPrize(0, prize.getId(), prize.isPremium());
        }
    }

    public final void initDonateInterface() {
        int i = this.currentFragment;
        if (i == 9) {
            DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter = this.headerAdapter;
            if (donateHeaderOrFooterAdapter != null) {
                donateHeaderOrFooterAdapter.deselectTab();
            }
            replaceFragment(UILayoutDonateDepositCoins.class, 9);
            return;
        }
        if (i != 14) {
            switch (i) {
                case 101:
                    replaceFragment(GUIBlackPassMain.class, 101);
                    getBlackPassMainViewModel().onClickSelectLayout(getBlackPassMainViewModel().getStartLayout().getValue().intValue());
                    DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter2 = this.headerAdapter;
                    if (donateHeaderOrFooterAdapter2 != null) {
                        donateHeaderOrFooterAdapter2.setBPTab();
                        break;
                    }
                    break;
                case 102:
                    getBlackPassMainViewModel().setStartLayout(4);
                    addFragment(GUIBlackPassMain.class, 4);
                    showOnlyBPActivate();
                    break;
                case 103:
                    replaceFragment(GUIBlackPassMain.class, 103);
                    showOnlyBpTasks();
                    DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter3 = this.headerAdapter;
                    if (donateHeaderOrFooterAdapter3 != null) {
                        donateHeaderOrFooterAdapter3.setBPTab();
                        break;
                    }
                    break;
                default:
                    replaceFragment(UILayoutDonateTile.class, 10);
                    if (this.currentPage == 92) {
                        DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter4 = this.footerAdapter;
                        if (donateHeaderOrFooterAdapter4 != null) {
                            donateHeaderOrFooterAdapter4.setNewTab(4);
                        }
                        getDonateTileViewModel().showVIPPlatinumItems();
                    }
                    if (this.currentPage == 93) {
                        DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter5 = this.footerAdapter;
                        if (donateHeaderOrFooterAdapter5 != null) {
                            donateHeaderOrFooterAdapter5.setNewTab(3);
                        }
                        getDonateTileViewModel().showPackGee();
                        break;
                    }
                    break;
            }
            return;
        }
        DonateMainViewModel.showNewFragment$default(getDonateViewModel(), 0, true, false, 4, null);
        DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter6 = this.headerAdapter;
        if (donateHeaderOrFooterAdapter6 != null) {
            donateHeaderOrFooterAdapter6.setFirstTab();
        }
        DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter7 = this.footerAdapter;
        if (donateHeaderOrFooterAdapter7 != null) {
            donateHeaderOrFooterAdapter7.deselectTab();
        }
        getDonateTileViewModel().setCurrentPage(6);
    }

    public final void showOnlyBPActivate() {
        getBlackPassMainViewModel().sendShowCurrentLayout(4);
    }

    public final void showOnlyBpTasks() {
        getBlackPassMainViewModel().sendShowCurrentLayout(1);
        getBlackPassMainViewModel().setStartLayout(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setValueOfRublesInView(int valueOfRubles) {
        ((DonateMainLayoutBinding) getBinding()).donateHeaderValueRub.setText(UsefulKt.getPriceWithSpaces(Integer.valueOf(valueOfRubles)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setValueOfCoinsInView(int valueOfCoins) {
        ((DonateMainLayoutBinding) getBinding()).donateHeaderValueBc.setText(UsefulKt.getPriceWithSpaces(Integer.valueOf(valueOfCoins)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showNewFragment(FragmentIDWithStatusOfReplay fragmentIDWithStatusOfReplay) {
        Class<? extends Fragment> currentClassOfFragment = getCurrentClassOfFragment(fragmentIDWithStatusOfReplay.getFragmentID());
        if (fragmentIDWithStatusOfReplay.getFragmentID() != 101) {
            ((DonateMainLayoutBinding) getBinding()).composeViewDonate.setVisibility(8);
        } else {
            ((DonateMainLayoutBinding) getBinding()).composeViewDonate.setVisibility(0);
        }
        if (getParentFragmentManager().findFragmentByTag(DonateDictionaryKt.getFragmentId(fragmentIDWithStatusOfReplay.getFragmentID())) == null) {
            if (fragmentIDWithStatusOfReplay.getIfReplace()) {
                replaceFragment(currentClassOfFragment, fragmentIDWithStatusOfReplay.getFragmentID());
            } else {
                addFragment(currentClassOfFragment, fragmentIDWithStatusOfReplay.getFragmentID());
            }
        }
    }

    public final Class<? extends Fragment> getCurrentClassOfFragment(int fragmentId) {
        if (fragmentId == 2) {
            return UILayoutDonatePreviewCar.class;
        }
        if (fragmentId == 101) {
            return GUIBlackPassMain.class;
        }
        if (fragmentId == 4 || fragmentId == 5) {
            return UILayoutDonatePreviewPack.class;
        }
        switch (fragmentId) {
            case 9:
                DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter = this.headerAdapter;
                if (donateHeaderOrFooterAdapter != null) {
                    donateHeaderOrFooterAdapter.deselectTab();
                    break;
                }
                break;
        }
        return UILayoutDonatePreviewPack.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initHeaderPages() {
        List<HeaderOrFooterButtonObj> emptyList;
        String[] stringArray = getResources().getStringArray(R.array.donate_header_titles);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        if (stringArray.length == 4) {
            String str = stringArray[0];
            Intrinsics.checkNotNullExpressionValue(str, "get(...)");
            HeaderOrFooterButtonObj headerOrFooterButtonObj = new HeaderOrFooterButtonObj(str, 10, true);
            String str2 = stringArray[1];
            Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
            HeaderOrFooterButtonObj headerOrFooterButtonObj2 = new HeaderOrFooterButtonObj(str2, 11, false);
            String str3 = stringArray[2];
            Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
            HeaderOrFooterButtonObj headerOrFooterButtonObj3 = new HeaderOrFooterButtonObj(str3, 12, false);
            String str4 = stringArray[3];
            Intrinsics.checkNotNullExpressionValue(str4, "get(...)");
            emptyList = CollectionsKt__CollectionsKt.listOf((Object[]) new HeaderOrFooterButtonObj[]{headerOrFooterButtonObj, headerOrFooterButtonObj2, headerOrFooterButtonObj3, new HeaderOrFooterButtonObj(str4, 13, false)});
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter = new DonateHeaderOrFooterAdapter();
        donateHeaderOrFooterAdapter.initItemsList(true, emptyList);
        this.headerAdapter = donateHeaderOrFooterAdapter;
        initLayoutChangeListener();
        RecyclerView recyclerView = ((DonateMainLayoutBinding) getBinding()).donateHeaderRV;
        Intrinsics.checkNotNull(recyclerView);
        setInitParamsForRecyclerView(recyclerView, this.headerAdapter);
        recyclerView.setOutlineProvider(new ViewOutlineProvider() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$initHeaderPages$2$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(@Nullable View p0, @Nullable Outline p1) {
                FragmentActivity requireActivity = GUIDonate.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                int dpToPx = FloatExtensionKt.dpToPx(7.0f, requireActivity);
                if (p0 == null || p1 == null) {
                    return;
                }
                p1.setRoundRect(0, 0 - dpToPx, p0.getWidth(), p0.getHeight(), dpToPx);
            }
        });
    }

    public final void initLayoutChangeListener() {
        DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter = this.headerAdapter;
        if (donateHeaderOrFooterAdapter != null) {
            donateHeaderOrFooterAdapter.setButtonClickListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$initLayoutChangeListener$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i) {
                    long j;
                    int i2;
                    DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter2;
                    DonateDepositCoinsViewModel depositCoinsViewModel;
                    long currentTimeMillis = System.currentTimeMillis();
                    j = GUIDonate.this.blockTimer;
                    if (currentTimeMillis - j > 1000) {
                        i2 = GUIDonate.this.currentFragment;
                        if (i2 == 9) {
                            depositCoinsViewModel = GUIDonate.this.getDepositCoinsViewModel();
                            depositCoinsViewModel.closeDepositCoinsFragment(true);
                        }
                        donateHeaderOrFooterAdapter2 = GUIDonate.this.headerAdapter;
                        if (donateHeaderOrFooterAdapter2 != null) {
                            donateHeaderOrFooterAdapter2.setNewTab(i);
                            return;
                        }
                        return;
                    }
                    GUIDonate gUIDonate = GUIDonate.this;
                    String string = gUIDonate.getString(R.string.donate_error_message_if_blocked_change_of_pages_or_tab);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    gUIDonate.showErrorMessage(string);
                }
            });
            donateHeaderOrFooterAdapter.setLayoutOrPageClickListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$initLayoutChangeListener$1$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i) {
                    int i2;
                    DonateMainViewModel donateViewModel;
                    DonateMainViewModel donateViewModel2;
                    BlackPassMainViewModel blackPassMainViewModel;
                    BlackPassMainViewModel blackPassMainViewModel2;
                    BlackPassMainViewModel blackPassMainViewModel3;
                    DonateMainViewModel donateViewModel3;
                    DonateMainViewModel donateViewModel4;
                    DonateDepositCoinsViewModel depositCoinsViewModel;
                    i2 = GUIDonate.this.currentFragment;
                    if (i2 == 9) {
                        depositCoinsViewModel = GUIDonate.this.getDepositCoinsViewModel();
                        depositCoinsViewModel.closeDepositCoinsFragment(true);
                    }
                    switch (i) {
                        case 10:
                            Group groupFooter = GUIDonate.access$getBinding(GUIDonate.this).groupFooter;
                            Intrinsics.checkNotNullExpressionValue(groupFooter, "groupFooter");
                            groupFooter.setVisibility(0);
                            donateViewModel = GUIDonate.this.getDonateViewModel();
                            DonateMainViewModel.showNewFragment$default(donateViewModel, 10, true, false, 4, null);
                            GUIDonate.this.setFirstTabForTilePage();
                            break;
                        case 11:
                            Group groupFooter2 = GUIDonate.access$getBinding(GUIDonate.this).groupFooter;
                            Intrinsics.checkNotNullExpressionValue(groupFooter2, "groupFooter");
                            groupFooter2.setVisibility(8);
                            donateViewModel2 = GUIDonate.this.getDonateViewModel();
                            DonateMainViewModel.showNewFragment$default(donateViewModel2, 11, true, false, 4, null);
                            break;
                        case 12:
                            Group groupFooter3 = GUIDonate.access$getBinding(GUIDonate.this).groupFooter;
                            Intrinsics.checkNotNullExpressionValue(groupFooter3, "groupFooter");
                            groupFooter3.setVisibility(8);
                            blackPassMainViewModel = GUIDonate.this.getBlackPassMainViewModel();
                            blackPassMainViewModel.onClickSelectLayout(0);
                            blackPassMainViewModel2 = GUIDonate.this.getBlackPassMainViewModel();
                            blackPassMainViewModel2.sendShowCurrentLayout(0);
                            blackPassMainViewModel3 = GUIDonate.this.getBlackPassMainViewModel();
                            blackPassMainViewModel3.setStartLayout(0);
                            donateViewModel3 = GUIDonate.this.getDonateViewModel();
                            DonateMainViewModel.showNewFragment$default(donateViewModel3, 101, true, false, 4, null);
                            break;
                        case 13:
                            Group groupFooter4 = GUIDonate.access$getBinding(GUIDonate.this).groupFooter;
                            Intrinsics.checkNotNullExpressionValue(groupFooter4, "groupFooter");
                            groupFooter4.setVisibility(8);
                            donateViewModel4 = GUIDonate.this.getDonateViewModel();
                            donateViewModel4.openHeaderBoxes();
                            GUIDonate.this.closeDialog();
                            break;
                    }
                }
            });
        }
    }

    public final void setFirstTabForTilePage() {
        getDonateTileViewModel().setCurrentPage(0);
        DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter = this.footerAdapter;
        if (donateHeaderOrFooterAdapter != null) {
            donateHeaderOrFooterAdapter.setFirstTab();
        }
    }

    public final void replaceFragment(Class<? extends Fragment> fragment, int fragmentId) {
        getChildFragmentManager().beginTransaction().replace(R.id.donate_body_container, fragment, null, DonateDictionaryKt.getFragmentId(fragmentId)).commit();
    }

    public final void addFragment(Class<? extends Fragment> fragment, int fragmentId) {
        getChildFragmentManager().beginTransaction().addToBackStack(fragment.toString()).add(R.id.donate_body_container, fragment, null, DonateDictionaryKt.getFragmentId(fragmentId)).commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initFooterPages() {
        List<HeaderOrFooterButtonObj> emptyList;
        String[] stringArray = getResources().getStringArray(R.array.donate_footer_titles);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        if (stringArray.length == 6) {
            String str = stringArray[0];
            Intrinsics.checkNotNullExpressionValue(str, "get(...)");
            HeaderOrFooterButtonObj headerOrFooterButtonObj = new HeaderOrFooterButtonObj(str, 0, true);
            String str2 = stringArray[1];
            Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
            HeaderOrFooterButtonObj headerOrFooterButtonObj2 = new HeaderOrFooterButtonObj(str2, 1, false);
            String str3 = stringArray[2];
            Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
            HeaderOrFooterButtonObj headerOrFooterButtonObj3 = new HeaderOrFooterButtonObj(str3, 2, false);
            String str4 = stringArray[3];
            Intrinsics.checkNotNullExpressionValue(str4, "get(...)");
            HeaderOrFooterButtonObj headerOrFooterButtonObj4 = new HeaderOrFooterButtonObj(str4, 3, false);
            String str5 = stringArray[4];
            Intrinsics.checkNotNullExpressionValue(str5, "get(...)");
            HeaderOrFooterButtonObj headerOrFooterButtonObj5 = new HeaderOrFooterButtonObj(str5, 4, false);
            String str6 = stringArray[5];
            Intrinsics.checkNotNullExpressionValue(str6, "get(...)");
            emptyList = CollectionsKt__CollectionsKt.listOf((Object[]) new HeaderOrFooterButtonObj[]{headerOrFooterButtonObj, headerOrFooterButtonObj2, headerOrFooterButtonObj3, headerOrFooterButtonObj4, headerOrFooterButtonObj5, new HeaderOrFooterButtonObj(str6, 11, false)});
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter = new DonateHeaderOrFooterAdapter();
        donateHeaderOrFooterAdapter.initItemsList(false, emptyList);
        this.footerAdapter = donateHeaderOrFooterAdapter;
        initPageChangeListener();
        RecyclerView recyclerView = ((DonateMainLayoutBinding) getBinding()).donateFooterRV;
        Intrinsics.checkNotNull(recyclerView);
        setInitParamsForRecyclerView(recyclerView, this.footerAdapter);
        recyclerView.setOutlineProvider(new ViewOutlineProvider() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$initFooterPages$2$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(@Nullable View p0, @Nullable Outline p1) {
                FragmentActivity requireActivity = GUIDonate.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                int dpToPx = FloatExtensionKt.dpToPx(7.0f, requireActivity);
                if (p0 == null || p1 == null) {
                    return;
                }
                p1.setRoundRect(0, 0, p0.getWidth(), p0.getHeight() + dpToPx, dpToPx);
            }
        });
    }

    public final void initPageChangeListener() {
        DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter = this.footerAdapter;
        if (donateHeaderOrFooterAdapter != null) {
            donateHeaderOrFooterAdapter.setButtonClickListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$initPageChangeListener$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i) {
                    DonateDepositCoinsViewModel depositCoinsViewModel;
                    long j;
                    DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter2;
                    DonateDepositCoinsViewModel depositCoinsViewModel2;
                    DonateMainViewModel donateViewModel;
                    depositCoinsViewModel = GUIDonate.this.getDepositCoinsViewModel();
                    if (depositCoinsViewModel.isShowFragment().getValue().booleanValue()) {
                        depositCoinsViewModel2 = GUIDonate.this.getDepositCoinsViewModel();
                        depositCoinsViewModel2.closeDepositCoinsFragment(true);
                        donateViewModel = GUIDonate.this.getDonateViewModel();
                        donateViewModel.showNewFragment(10, false, true);
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    j = GUIDonate.this.blockTimer;
                    if (currentTimeMillis - j > 1000) {
                        donateHeaderOrFooterAdapter2 = GUIDonate.this.footerAdapter;
                        if (donateHeaderOrFooterAdapter2 != null) {
                            donateHeaderOrFooterAdapter2.setNewTab(i);
                            return;
                        }
                        return;
                    }
                    GUIDonate gUIDonate = GUIDonate.this;
                    String string = gUIDonate.getString(R.string.donate_error_message_if_blocked_change_of_pages_or_tab);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    gUIDonate.showErrorMessage(string);
                }
            });
            donateHeaderOrFooterAdapter.setLayoutOrPageClickListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$initPageChangeListener$1$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i) {
                    DonateDepositCoinsViewModel depositCoinsViewModel;
                    boolean z;
                    DonateTileViewModel donateTileViewModel;
                    DonateDepositCoinsViewModel depositCoinsViewModel2;
                    DonateMainViewModel donateViewModel;
                    depositCoinsViewModel = GUIDonate.this.getDepositCoinsViewModel();
                    if (depositCoinsViewModel.isShowFragment().getValue().booleanValue()) {
                        depositCoinsViewModel2 = GUIDonate.this.getDepositCoinsViewModel();
                        depositCoinsViewModel2.closeDepositCoinsFragment(true);
                        donateViewModel = GUIDonate.this.getDonateViewModel();
                        donateViewModel.showNewFragment(10, false, true);
                    }
                    z = GUIDonate.this.ifEmptyDonateItemsFromJSON;
                    if (!z) {
                        donateTileViewModel = GUIDonate.this.getDonateTileViewModel();
                        donateTileViewModel.setCurrentPage(i);
                    } else {
                        GUIDonate.this.showMainError();
                    }
                }
            });
        }
    }

    public final void showMainError() {
        DonateMainViewModel donateViewModel = getDonateViewModel();
        String string = getString(R.string.donate_main_error_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(R.string.donate_main_error_body);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        donateViewModel.showLocalError(9, string, string2);
    }

    public final void setInitParamsForRecyclerView(RecyclerView currentRecyclerView, final RecyclerView.Adapter<? extends RecyclerView.ViewHolder> currentAdapter) {
        currentRecyclerView.setAdapter(currentAdapter);
        final FragmentActivity requireActivity = requireActivity();
        currentRecyclerView.setLayoutManager(new LinearLayoutManager(requireActivity) { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$setInitParamsForRecyclerView$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean checkLayoutParams(@NotNull RecyclerView.LayoutParams lp) {
                Intrinsics.checkNotNullParameter(lp, "lp");
                int width = getWidth();
                RecyclerView.Adapter<? extends RecyclerView.ViewHolder> adapter = currentAdapter;
                Intrinsics.checkNotNull(adapter);
                ((ViewGroup.MarginLayoutParams) lp).width = width / adapter.getSizeInv();
                return super.checkLayoutParams(lp);
            }
        });
        currentRecyclerView.setClipToOutline(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initListeners() {
        DonateMainLayoutBinding donateMainLayoutBinding = (DonateMainLayoutBinding) getBinding();
        donateMainLayoutBinding.donateHeaderLeft.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIDonate.initListeners$lambda$20$lambda$16(GUIDonate.this, view);
            }
        });
        donateMainLayoutBinding.donateHeaderRight.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIDonate.initListeners$lambda$20$lambda$17(GUIDonate.this, view);
            }
        });
        donateMainLayoutBinding.donateFooterLeft.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIDonate.initListeners$lambda$20$lambda$18(GUIDonate.this, view);
            }
        });
        donateMainLayoutBinding.donateFooterRight.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIDonate.initListeners$lambda$20$lambda$19(GUIDonate.this, view);
            }
        });
        ImageButton donateButtonExit = donateMainLayoutBinding.donateButtonExit;
        Intrinsics.checkNotNullExpressionValue(donateButtonExit, "donateButtonExit");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, donateButtonExit, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$initListeners$1$5
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
                GUIDonate.this.closeDialog();
            }
        }, 1, null);
        ImageButton donateHeaderButtonBc = donateMainLayoutBinding.donateHeaderButtonBc;
        Intrinsics.checkNotNullExpressionValue(donateHeaderButtonBc, "donateHeaderButtonBc");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, donateHeaderButtonBc, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$initListeners$1$6
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
                int i;
                i = GUIDonate.this.currentFragment;
                if (i != 9) {
                    GUIDonate.this.onCLickBpButton();
                }
            }
        }, 1, null);
        ImageButton donateHeaderButtonRub = donateMainLayoutBinding.donateHeaderButtonRub;
        Intrinsics.checkNotNullExpressionValue(donateHeaderButtonRub, "donateHeaderButtonRub");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, donateHeaderButtonRub, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$initListeners$1$7
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
                int i;
                int i2;
                DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter;
                DonateTileViewModel donateTileViewModel;
                DonateMainViewModel donateViewModel;
                DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter2;
                DonateDepositCoinsViewModel depositCoinsViewModel;
                i = GUIDonate.this.currentFragment;
                if (i == 9) {
                    depositCoinsViewModel = GUIDonate.this.getDepositCoinsViewModel();
                    depositCoinsViewModel.closeDepositCoinsFragment(true);
                }
                i2 = GUIDonate.this.currentFragment;
                if (i2 != 0) {
                    donateViewModel = GUIDonate.this.getDonateViewModel();
                    DonateMainViewModel.showNewFragment$default(donateViewModel, 0, true, false, 4, null);
                    donateHeaderOrFooterAdapter2 = GUIDonate.this.headerAdapter;
                    if (donateHeaderOrFooterAdapter2 != null) {
                        donateHeaderOrFooterAdapter2.setFirstTab();
                    }
                }
                donateHeaderOrFooterAdapter = GUIDonate.this.footerAdapter;
                if (donateHeaderOrFooterAdapter != null) {
                    donateHeaderOrFooterAdapter.deselectTab();
                }
                donateTileViewModel = GUIDonate.this.getDonateTileViewModel();
                donateTileViewModel.setCurrentPage(6);
            }
        }, 1, null);
    }

    public static final void initListeners$lambda$20$lambda$16(GUIDonate this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (System.currentTimeMillis() - this$0.blockTimer > 500) {
            this$0.blockTimer = System.currentTimeMillis();
            DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter = this$0.headerAdapter;
            if (donateHeaderOrFooterAdapter != null) {
                donateHeaderOrFooterAdapter.previousTab();
                return;
            }
            return;
        }
        String string = this$0.getString(R.string.donate_error_message_if_blocked_change_of_pages_or_tab);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this$0.showErrorMessage(string);
    }

    public static final void initListeners$lambda$20$lambda$17(GUIDonate this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (System.currentTimeMillis() - this$0.blockTimer > 500) {
            this$0.blockTimer = System.currentTimeMillis();
            DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter = this$0.headerAdapter;
            if (donateHeaderOrFooterAdapter != null) {
                donateHeaderOrFooterAdapter.nextTab();
                return;
            }
            return;
        }
        String string = this$0.getString(R.string.donate_error_message_if_blocked_change_of_pages_or_tab);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this$0.showErrorMessage(string);
    }

    public static final void initListeners$lambda$20$lambda$18(GUIDonate this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (System.currentTimeMillis() - this$0.blockTimer > 500) {
            this$0.blockTimer = System.currentTimeMillis();
            DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter = this$0.footerAdapter;
            if (donateHeaderOrFooterAdapter != null) {
                donateHeaderOrFooterAdapter.previousTab();
                return;
            }
            return;
        }
        String string = this$0.getString(R.string.donate_error_message_if_blocked_change_of_pages_or_tab);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this$0.showErrorMessage(string);
    }

    public static final void initListeners$lambda$20$lambda$19(GUIDonate this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (System.currentTimeMillis() - this$0.blockTimer > 500) {
            this$0.blockTimer = System.currentTimeMillis();
            DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter = this$0.footerAdapter;
            if (donateHeaderOrFooterAdapter != null) {
                donateHeaderOrFooterAdapter.nextTab();
                return;
            }
            return;
        }
        String string = this$0.getString(R.string.donate_error_message_if_blocked_change_of_pages_or_tab);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this$0.showErrorMessage(string);
    }

    public final void showErrorMessage(String newMessage) {
        if (System.currentTimeMillis() - this.blockMessageTimer > 1000) {
            this.blockMessageTimer = System.currentTimeMillis();
            getDonateViewModel().showErrorMessage(newMessage);
        }
    }

    public final void closeDialog() {
        getDonateViewModel().closeDialog();
        closeFragment();
    }

    private final void setNullableParameters() {
        DonateCustomDialog donateCustomDialog = this.dialogConfirmation;
        if (donateCustomDialog != null) {
            donateCustomDialog.dismissDialog();
        }
        getBlackPassMainViewModel().clearData();
        getBlackPassPrizeListViewModel().clearData();
        getDonateTileViewModel().clearData();
        this.headerAdapter = null;
        this.footerAdapter = null;
        this.jsonObject = null;
        this.dialogConfirmation = null;
        this.timeoutRunnable = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCLickBpButton() {
        Group groupFooter = ((DonateMainLayoutBinding) getBinding()).groupFooter;
        Intrinsics.checkNotNullExpressionValue(groupFooter, "groupFooter");
        groupFooter.setVisibility(0);
        DonateMainViewModel.showNewFragment$default(getDonateViewModel(), 10, true, false, 4, null);
        DonateMainViewModel.showNewFragment$default(getDonateViewModel(), 9, false, false, 4, null);
        DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter = this.headerAdapter;
        if (donateHeaderOrFooterAdapter != null) {
            donateHeaderOrFooterAdapter.setFirstTab();
        }
        DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter2 = this.footerAdapter;
        if (donateHeaderOrFooterAdapter2 != null) {
            donateHeaderOrFooterAdapter2.deselectTab();
        }
        getDonateTileViewModel().setCurrentPage(12);
    }

    public GUIDonate() {
        final Function0 function0 = null;
        this.mainActivityViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(JNIActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$mainActivityViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity requireActivity = GUIDonate.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                return (ViewModelProvider.Factory) new ViewModelProvider(requireActivity, GUIDonate.this.getMainActivityFactory()).get(JNIActivityViewModel.class);
            }
        });
        Function0<ViewModelProvider.Factory> function02 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$donateViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                GUIDonate gUIDonate = GUIDonate.this;
                return (ViewModelProvider.Factory) new ViewModelProvider(gUIDonate, gUIDonate.getDonateFactory()).get(DonateMainViewModel.class);
            }
        };
        final Function0<Fragment> function03 = new Function0<Fragment>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$2
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
        this.donateViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DonateMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$4
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
        Function0<ViewModelProvider.Factory> function04 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$donateTileViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                GUIDonate gUIDonate = GUIDonate.this;
                return (ViewModelProvider.Factory) new ViewModelProvider(gUIDonate, gUIDonate.getDonateTileFactory()).get(DonateTileViewModel.class);
            }
        };
        final Function0<Fragment> function05 = new Function0<Fragment>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$6
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
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$7
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
        this.donateTileViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DonateTileViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$8
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$9
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
                Function0 function06 = Function0.this;
                if (function06 != null && (creationExtras = (CreationExtras) function06.invoke()) != null) {
                    return creationExtras;
                }
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function04);
        final Function0<ViewModelStoreOwner> function06 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$depositCoinsViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return GUIDonate.this;
            }
        };
        Function0<ViewModelProvider.Factory> function07 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$depositCoinsViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return GUIDonate.this.getDepositCoinsFactory();
            }
        };
        final Lazy lazy3 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$11
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
        this.depositCoinsViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DonateDepositCoinsViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$12
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$13
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
                Function0 function08 = Function0.this;
                if (function08 != null && (creationExtras = (CreationExtras) function08.invoke()) != null) {
                    return creationExtras;
                }
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function07);
        Function0<ViewModelProvider.Factory> function08 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$serviceViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                GUIDonate gUIDonate = GUIDonate.this;
                return (ViewModelProvider.Factory) new ViewModelProvider(gUIDonate, gUIDonate.getDonateServiceFactory()).get(DonateServiceViewModel.class);
            }
        };
        final Function0<Fragment> function09 = new Function0<Fragment>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$15
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
        final Lazy lazy4 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$16
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
        this.serviceViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DonateServiceViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$17
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$18
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
                Function0 function010 = Function0.this;
                if (function010 != null && (creationExtras = (CreationExtras) function010.invoke()) != null) {
                    return creationExtras;
                }
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy4);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function08);
        final Function0<ViewModelStoreOwner> function010 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$blackPassMainViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return GUIDonate.this;
            }
        };
        Function0<ViewModelProvider.Factory> function011 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$blackPassMainViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return GUIDonate.this.getBlackPassMainFactory();
            }
        };
        final Lazy lazy5 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$20
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
        this.blackPassMainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BlackPassMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$21
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$22
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
                Function0 function012 = Function0.this;
                if (function012 != null && (creationExtras = (CreationExtras) function012.invoke()) != null) {
                    return creationExtras;
                }
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy5);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function011);
        final Function0<ViewModelStoreOwner> function012 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$blackPassActivateViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return GUIDonate.this;
            }
        };
        Function0<ViewModelProvider.Factory> function013 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$blackPassActivateViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return GUIDonate.this.getBlackPassActivateFactory();
            }
        };
        final Lazy lazy6 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$24
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
        this.blackPassActivateViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BlackPassActivateViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$25
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$26
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
                Function0 function014 = Function0.this;
                if (function014 != null && (creationExtras = (CreationExtras) function014.invoke()) != null) {
                    return creationExtras;
                }
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy6);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function013);
        final Function0<ViewModelStoreOwner> function014 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$blackPassPrizeListViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return GUIDonate.this;
            }
        };
        Function0<ViewModelProvider.Factory> function015 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$blackPassPrizeListViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return GUIDonate.this.getBlackPassPrizeListFactory();
            }
        };
        final Lazy lazy7 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$28
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
        this.blackPassPrizeListViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BlackPassPrizeListViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$29
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$30
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
                Function0 function016 = Function0.this;
                if (function016 != null && (creationExtras = (CreationExtras) function016.invoke()) != null) {
                    return creationExtras;
                }
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy7);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function015);
    }
}
