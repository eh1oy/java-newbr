package com.blackhub.bronline.game.gui.fractions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.FractionsControlLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent;
import com.blackhub.bronline.game.gui.CustomTypefaceSpanTextStyleBold;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.fractions.adapters.FractionsControlManagementAdapter;
import com.blackhub.bronline.game.gui.fractions.adapters.FractionsControlSortByAdapter;
import com.blackhub.bronline.game.gui.fractions.adapters.FractionsControlStaffListAdapter;
import com.blackhub.bronline.game.gui.fractions.data.FractionControlListOfPlayers;
import com.blackhub.bronline.game.gui.fractions.data.FractionControlPlayerInfo;
import com.blackhub.bronline.game.gui.fractions.data.FractionsSortByItem;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsControlViewModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UIFractionsControlLayout.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0011\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0014H\u0002J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150!2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150!2\u0006\u0010$\u001a\u00020%H\u0003J\b\u0010&\u001a\u00020\u0002H\u0016J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020(H\u0016J\u001e\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020,2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170!H\u0002J\u0010\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020(H\u0002J\b\u00101\u001a\u00020(H\u0002J\b\u00102\u001a\u00020(H\u0002J\b\u00103\u001a\u00020(H\u0002J\b\u00104\u001a\u00020(H\u0002J\b\u00105\u001a\u00020(H\u0002J\b\u00106\u001a\u00020(H\u0002J\u0018\u00107\u001a\u0002082\u0006\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020%H\u0002J\u0010\u0010;\u001a\u00020(2\u0006\u0010<\u001a\u00020/H\u0002J\u0016\u0010=\u001a\u00020(2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170!H\u0002J\b\u0010>\u001a\u00020(H\u0002J\u0010\u0010?\u001a\u00020(2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\b\u0010@\u001a\u00020(H\u0002J\b\u0010A\u001a\u00020(H\u0002J\u0016\u0010B\u001a\u00020(2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00170!H\u0002J\b\u0010D\u001a\u00020(H\u0002J\b\u0010E\u001a\u00020(H\u0002J\b\u0010F\u001a\u00020(H\u0002J\b\u0010G\u001a\u00020(H\u0002J\b\u0010H\u001a\u00020(H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/blackhub/bronline/game/gui/fractions/UIFractionsControlLayout;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/FractionsControlLayoutBinding;", "()V", "controlManagementAdapter", "Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsControlManagementAdapter;", "controlViewModel", "Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsControlViewModel;", "getControlViewModel", "()Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsControlViewModel;", "controlViewModel$delegate", "Lkotlin/Lazy;", "fractionsControlSortByAdapter", "Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsControlSortByAdapter;", "fragmentContext", "Landroid/content/Context;", "getFragmentContext", "()Landroid/content/Context;", "fragmentContext$delegate", "listOfImagesForAdapter", "", "", "listOfPlayers", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionControlListOfPlayers;", "menuSortedPressed", "sortedListOfPlayers", "staffListAdapter", "Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsControlStaffListAdapter;", "timeOldClickOnPlayerItem", "", "getListForSortByAdapter", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsSortByItem;", "getListOfImagesForAdapter", "", "fractionId", "getListOfImagesFunction", "link", "", "getViewBinding", "initViews", "", "onDestroyView", "setEditTextChangeListener", "enteredTextLocation", "Landroid/text/Editable;", "setInfoAboutPlayer", "clickedItem", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionControlPlayerInfo;", "setLogicForOnMinusRankClickListener", "setLogicForOnMinusReprimandsListener", "setLogicForOnPlayerItemClick", "setLogicForOnPlusRankClickListener", "setLogicForOnPlusReprimandsListener", "setLogicForOnSortByItemClickListener", "setOnDismissFromFractionClickListener", "setTextRegular", "", TypedValues.Custom.S_STRING, "fullText", "setupControlManagementAdapter", "item", "setupEditTextSearch", "setupFractionsControlSortByAdapter", "setupListOfImagesForAdapter", "setupLiveDataObservers", "setupOnClickListeners", "setupStaffListAdapter", IFramePlayerOptions.Builder.LIST, "setupStaffListRecyclerView", "sortAscending", "sortDescending", "sortOnlyOffline", "sortOnlyOnline", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUIFractionsControlLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIFractionsControlLayout.kt\ncom/blackhub/bronline/game/gui/fractions/UIFractionsControlLayout\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,573:1\n106#2,15:574\n58#3,23:589\n93#3,3:612\n1002#4,2:615\n1011#4,2:617\n*S KotlinDebug\n*F\n+ 1 UIFractionsControlLayout.kt\ncom/blackhub/bronline/game/gui/fractions/UIFractionsControlLayout\n*L\n54#1:574,15\n190#1:589,23\n190#1:612,3\n320#1:615,2\n329#1:617,2\n*E\n"})
/* loaded from: classes3.dex */
public final class UIFractionsControlLayout extends BaseFragment<FractionsControlLayoutBinding> {
    public static final int $stable = 8;

    @Nullable
    public FractionsControlManagementAdapter controlManagementAdapter;

    /* renamed from: controlViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy controlViewModel;

    @Nullable
    public FractionsControlSortByAdapter fractionsControlSortByAdapter;

    /* renamed from: fragmentContext$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy fragmentContext;

    @Nullable
    public FractionsControlStaffListAdapter staffListAdapter;
    public long timeOldClickOnPlayerItem;

    @NotNull
    public List<FractionControlListOfPlayers> listOfPlayers = new ArrayList();

    @NotNull
    public List<FractionControlListOfPlayers> sortedListOfPlayers = new ArrayList();
    public int menuSortedPressed = 3;

    @NotNull
    public final List<Integer> listOfImagesForAdapter = new ArrayList();

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$special$$inlined$viewModels$default$2.<init>(kotlin.Lazy):void, class status: GENERATED_AND_UNLOADED
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
    public UIFractionsControlLayout() {
        /*
            r5 = this;
            r5.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.listOfPlayers = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.sortedListOfPlayers = r0
            r0 = 3
            r5.menuSortedPressed = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.listOfImagesForAdapter = r0
            com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$controlViewModel$2 r0 = new com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$controlViewModel$2
            r0.<init>()
            kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.NONE
            com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$special$$inlined$viewModels$default$1 r2 = new com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$special$$inlined$viewModels$default$1
            r2.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r1, r2)
            java.lang.Class<com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsControlViewModel> r1 = com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsControlViewModel.class
            kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
            com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$special$$inlined$viewModels$default$2 r2 = new com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$special$$inlined$viewModels$default$2
            r2.<init>()
            com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$special$$inlined$viewModels$default$3 r3 = new com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$special$$inlined$viewModels$default$3
            r4 = 0
            r3.<init>()
            com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$special$$inlined$viewModels$default$4 r4 = new com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$special$$inlined$viewModels$default$4
            r4.<init>()
            kotlin.Lazy r0 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r5, r1, r2, r3, r4)
            r5.controlViewModel = r0
            com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$fragmentContext$2 r0 = new com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$fragmentContext$2
            r0.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r0)
            r5.fragmentContext = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout.<init>():void");
    }

    public final FractionsControlViewModel getControlViewModel() {
        return (FractionsControlViewModel) this.controlViewModel.getValue();
    }

    private final Context getFragmentContext() {
        return (Context) this.fragmentContext.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FractionsControlLayoutBinding getViewBinding() {
        FractionsControlLayoutBinding inflate = FractionsControlLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        setupLiveDataObservers();
        getControlViewModel().setMenuSortedPressed(3);
        setupStaffListRecyclerView();
        setupOnClickListeners();
        setupFractionsControlSortByAdapter();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getControlViewModel().setStaffListLiveData(new ArrayList());
        getControlViewModel().setSortedStaffListLiveData(new ArrayList());
        getControlViewModel().setInfoAboutPlayer(null);
        getControlViewModel().sendPlayerChosenId(-1);
        this.sortedListOfPlayers = new ArrayList();
        this.listOfPlayers = new ArrayList();
        this.staffListAdapter = null;
        this.controlManagementAdapter = null;
        this.fractionsControlSortByAdapter = null;
        super.onDestroyView();
    }

    public final void setupLiveDataObservers() {
        getControlViewModel().getNewPlayersReprimandLiveData().observe(getViewLifecycleOwner(), new UIFractionsControlLayout$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$setupLiveDataObservers$1
            public UIFractionsControlLayout$setupLiveDataObservers$1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(Integer num) {
                FractionsControlLayoutBinding binding;
                CharSequence textRegular;
                FractionsControlManagementAdapter fractionsControlManagementAdapter;
                FractionsControlManagementAdapter fractionsControlManagementAdapter2;
                Intrinsics.checkNotNull(num);
                if (num.intValue() >= 0) {
                    binding = UIFractionsControlLayout.this.getBinding();
                    TextView textView = binding.textViewPlayersReprimands;
                    UIFractionsControlLayout uIFractionsControlLayout = UIFractionsControlLayout.this;
                    String string = uIFractionsControlLayout.getString(R.string.fractions_control_players_reprimands);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String string2 = UIFractionsControlLayout.this.getString(R.string.fractions_control_players_reprimands, num);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    textRegular = uIFractionsControlLayout.setTextRegular(string, string2);
                    textView.setText(textRegular);
                    fractionsControlManagementAdapter = UIFractionsControlLayout.this.controlManagementAdapter;
                    FractionControlPlayerInfo item = fractionsControlManagementAdapter != null ? fractionsControlManagementAdapter.getItem() : null;
                    if (item != null) {
                        item.setReprimand(num.intValue());
                    }
                    fractionsControlManagementAdapter2 = UIFractionsControlLayout.this.controlManagementAdapter;
                    if (fractionsControlManagementAdapter2 != null) {
                        fractionsControlManagementAdapter2.notifyItemChanged(1);
                    }
                }
            }
        }));
        getControlViewModel().getNewPlayersRankLiveData().observe(getViewLifecycleOwner(), new UIFractionsControlLayout$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$setupLiveDataObservers$2
            public UIFractionsControlLayout$setupLiveDataObservers$2() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(Integer num) {
                FractionsControlLayoutBinding binding;
                CharSequence textRegular;
                FractionsControlManagementAdapter fractionsControlManagementAdapter;
                FractionsControlManagementAdapter fractionsControlManagementAdapter2;
                FractionsControlStaffListAdapter fractionsControlStaffListAdapter;
                FractionControlListOfPlayers fractionControlListOfPlayers;
                FractionsControlStaffListAdapter fractionsControlStaffListAdapter2;
                FractionsControlStaffListAdapter fractionsControlStaffListAdapter3;
                FractionsControlStaffListAdapter fractionsControlStaffListAdapter4;
                List<FractionControlListOfPlayers> list;
                List<FractionControlListOfPlayers> list2;
                List<FractionControlListOfPlayers> list3;
                Object obj;
                Intrinsics.checkNotNull(num);
                int intValue = num.intValue();
                if (1 > intValue || intValue >= 11) {
                    return;
                }
                binding = UIFractionsControlLayout.this.getBinding();
                TextView textView = binding.textViewPlayersRank;
                UIFractionsControlLayout uIFractionsControlLayout = UIFractionsControlLayout.this;
                String string = uIFractionsControlLayout.getString(R.string.fractions_control_players_rank);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = UIFractionsControlLayout.this.getString(R.string.fractions_control_players_rank, num);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                textRegular = uIFractionsControlLayout.setTextRegular(string, string2);
                textView.setText(textRegular);
                fractionsControlManagementAdapter = UIFractionsControlLayout.this.controlManagementAdapter;
                FractionControlListOfPlayers fractionControlListOfPlayers2 = null;
                FractionControlPlayerInfo item = fractionsControlManagementAdapter != null ? fractionsControlManagementAdapter.getItem() : null;
                if (item != null) {
                    item.setRank(num.intValue());
                }
                fractionsControlManagementAdapter2 = UIFractionsControlLayout.this.controlManagementAdapter;
                if (fractionsControlManagementAdapter2 != null) {
                    fractionsControlManagementAdapter2.notifyItemChanged(0);
                }
                fractionsControlStaffListAdapter = UIFractionsControlLayout.this.staffListAdapter;
                if (fractionsControlStaffListAdapter == null || (list3 = fractionsControlStaffListAdapter.getList()) == null) {
                    fractionControlListOfPlayers = null;
                } else {
                    Iterator<T> it = list3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (((FractionControlListOfPlayers) obj).getIsClicked()) {
                                break;
                            }
                        }
                    }
                    fractionControlListOfPlayers = (FractionControlListOfPlayers) obj;
                }
                fractionsControlStaffListAdapter2 = UIFractionsControlLayout.this.staffListAdapter;
                Integer valueOf = (fractionsControlStaffListAdapter2 == null || (list2 = fractionsControlStaffListAdapter2.getList()) == null) ? null : Integer.valueOf(CollectionsKt___CollectionsKt.indexOf((List<? extends FractionControlListOfPlayers>) list2, fractionControlListOfPlayers));
                if (valueOf != null) {
                    fractionsControlStaffListAdapter3 = UIFractionsControlLayout.this.staffListAdapter;
                    if (fractionsControlStaffListAdapter3 != null && (list = fractionsControlStaffListAdapter3.getList()) != null) {
                        fractionControlListOfPlayers2 = list.get(valueOf.intValue());
                    }
                    if (fractionControlListOfPlayers2 != null) {
                        fractionControlListOfPlayers2.setRank(num.intValue());
                    }
                    fractionsControlStaffListAdapter4 = UIFractionsControlLayout.this.staffListAdapter;
                    if (fractionsControlStaffListAdapter4 != null) {
                        fractionsControlStaffListAdapter4.notifyItemChanged(valueOf.intValue());
                    }
                }
            }
        }));
        getControlViewModel().getNewPlayersPosition().observe(getViewLifecycleOwner(), new UIFractionsControlLayout$sam$androidx_lifecycle_Observer$0(new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$setupLiveDataObservers$3
            public UIFractionsControlLayout$setupLiveDataObservers$3() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(String str) {
                FractionsControlLayoutBinding binding;
                CharSequence textRegular;
                if (str == null || str.length() == 0) {
                    return;
                }
                binding = UIFractionsControlLayout.this.getBinding();
                TextView textView = binding.textViewPosition;
                UIFractionsControlLayout uIFractionsControlLayout = UIFractionsControlLayout.this;
                String string = uIFractionsControlLayout.getString(R.string.fractions_control_players_position);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = UIFractionsControlLayout.this.getString(R.string.fractions_control_players_position, str);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                textRegular = uIFractionsControlLayout.setTextRegular(string, string2);
                textView.setText(textRegular);
            }
        }));
        getControlViewModel().getStaffListLiveData().observe(getViewLifecycleOwner(), new UIFractionsControlLayout$sam$androidx_lifecycle_Observer$0(new Function1<List<FractionControlListOfPlayers>, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$setupLiveDataObservers$4
            public UIFractionsControlLayout$setupLiveDataObservers$4() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<FractionControlListOfPlayers> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@Nullable List<FractionControlListOfPlayers> list) {
                int i;
                if (list != null) {
                    UIFractionsControlLayout.this.listOfPlayers = list;
                    UIFractionsControlLayout.this.setupEditTextSearch(list);
                    i = UIFractionsControlLayout.this.menuSortedPressed;
                    if (i == 0) {
                        UIFractionsControlLayout.this.sortOnlyOnline();
                        return;
                    }
                    if (i == 1) {
                        UIFractionsControlLayout.this.sortOnlyOffline();
                    } else if (i == 2) {
                        UIFractionsControlLayout.this.sortAscending();
                    } else {
                        if (i != 3) {
                            return;
                        }
                        UIFractionsControlLayout.this.sortDescending();
                    }
                }
            }
        }));
        getControlViewModel().getSortedStaffListLiveData().observe(getViewLifecycleOwner(), new UIFractionsControlLayout$sam$androidx_lifecycle_Observer$0(new Function1<List<FractionControlListOfPlayers>, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$setupLiveDataObservers$5
            public UIFractionsControlLayout$setupLiveDataObservers$5() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<FractionControlListOfPlayers> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@Nullable List<FractionControlListOfPlayers> list) {
                if (list != null) {
                    UIFractionsControlLayout.this.setupStaffListAdapter(list);
                }
            }
        }));
        getControlViewModel().getMenuSortedPressedLiveData().observe(getViewLifecycleOwner(), new UIFractionsControlLayout$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$setupLiveDataObservers$6
            public UIFractionsControlLayout$setupLiveDataObservers$6() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(Integer num) {
                if (num != null && num.intValue() == 0) {
                    UIFractionsControlLayout uIFractionsControlLayout = UIFractionsControlLayout.this;
                    Intrinsics.checkNotNull(num);
                    uIFractionsControlLayout.menuSortedPressed = num.intValue();
                    UIFractionsControlLayout.this.sortOnlyOnline();
                    return;
                }
                if (num != null && num.intValue() == 1) {
                    UIFractionsControlLayout uIFractionsControlLayout2 = UIFractionsControlLayout.this;
                    Intrinsics.checkNotNull(num);
                    uIFractionsControlLayout2.menuSortedPressed = num.intValue();
                    UIFractionsControlLayout.this.sortOnlyOffline();
                    return;
                }
                if (num != null && num.intValue() == 2) {
                    UIFractionsControlLayout uIFractionsControlLayout3 = UIFractionsControlLayout.this;
                    Intrinsics.checkNotNull(num);
                    uIFractionsControlLayout3.menuSortedPressed = num.intValue();
                    UIFractionsControlLayout.this.sortAscending();
                    return;
                }
                if (num == null || num.intValue() != 3) {
                    UIFractionsControlLayout.this.sortDescending();
                    return;
                }
                UIFractionsControlLayout uIFractionsControlLayout4 = UIFractionsControlLayout.this;
                Intrinsics.checkNotNull(num);
                uIFractionsControlLayout4.menuSortedPressed = num.intValue();
                UIFractionsControlLayout.this.sortDescending();
            }
        }));
        getControlViewModel().getInfoAboutPlayerLiveData().observe(getViewLifecycleOwner(), new UIFractionsControlLayout$sam$androidx_lifecycle_Observer$0(new Function1<FractionControlPlayerInfo, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$setupLiveDataObservers$7
            public UIFractionsControlLayout$setupLiveDataObservers$7() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FractionControlPlayerInfo fractionControlPlayerInfo) {
                invoke2(fractionControlPlayerInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@Nullable FractionControlPlayerInfo fractionControlPlayerInfo) {
                if (fractionControlPlayerInfo != null) {
                    UIFractionsControlLayout.this.setInfoAboutPlayer(fractionControlPlayerInfo);
                }
            }
        }));
        getControlViewModel().getFractionIdLiveData().observe(getViewLifecycleOwner(), new UIFractionsControlLayout$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$setupLiveDataObservers$8
            public UIFractionsControlLayout$setupLiveDataObservers$8() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(Integer num) {
                UIFractionsControlLayout uIFractionsControlLayout = UIFractionsControlLayout.this;
                Intrinsics.checkNotNull(num);
                uIFractionsControlLayout.setupListOfImagesForAdapter(num.intValue());
            }
        }));
    }

    public final void setupStaffListRecyclerView() {
        getBinding().recyclerViewStaffList.setLayoutManager(new LinearLayoutManager(getBinding().getRoot().getContext(), 1, false));
    }

    public final void setupEditTextSearch(List<FractionControlListOfPlayers> sortedListOfPlayers) {
        CustomEditTextWithBackPressEvent editTextSearchPlayer = getBinding().editTextSearchPlayer;
        Intrinsics.checkNotNullExpressionValue(editTextSearchPlayer, "editTextSearchPlayer");
        editTextSearchPlayer.addTextChangedListener(new TextWatcher() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$setupEditTextSearch$$inlined$doAfterTextChanged$1
            public final /* synthetic */ List $sortedListOfPlayers$inlined;

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int r2, int r3, int r4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int r2, int r3, int r4) {
            }

            public UIFractionsControlLayout$setupEditTextSearch$$inlined$doAfterTextChanged$1(List sortedListOfPlayers2) {
                r2 = sortedListOfPlayers2;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                int i;
                if (s == null || StringsKt__StringsJVMKt.isBlank(s)) {
                    i = UIFractionsControlLayout.this.menuSortedPressed;
                    if (i == 0) {
                        UIFractionsControlLayout.this.sortOnlyOnline();
                        return;
                    }
                    if (i == 1) {
                        UIFractionsControlLayout.this.sortOnlyOffline();
                        return;
                    } else if (i == 2) {
                        UIFractionsControlLayout.this.sortAscending();
                        return;
                    } else {
                        if (i != 3) {
                            return;
                        }
                        UIFractionsControlLayout.this.sortDescending();
                        return;
                    }
                }
                UIFractionsControlLayout.this.setEditTextChangeListener(s, r2);
            }
        });
    }

    public final void setEditTextChangeListener(Editable enteredTextLocation, List<FractionControlListOfPlayers> sortedListOfPlayers) {
        ArrayList arrayList = new ArrayList();
        String lowerCase = enteredTextLocation.toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        for (FractionControlListOfPlayers fractionControlListOfPlayers : sortedListOfPlayers) {
            String lowerCase2 = fractionControlListOfPlayers.getNickname().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (StringsKt__StringsKt.contains$default((CharSequence) StringsKt__StringsKt.trim((CharSequence) lowerCase2).toString(), (CharSequence) lowerCase, false, 2, (Object) null)) {
                arrayList.add(fractionControlListOfPlayers);
            }
        }
        getControlViewModel().setSortedStaffListLiveData(arrayList);
    }

    public final void setupOnClickListeners() {
        FractionsControlLayoutBinding binding = getBinding();
        binding.imageButtonSearchPlayer.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$$ExternalSyntheticLambda1
            public final /* synthetic */ FractionsControlLayoutBinding f$1;

            public /* synthetic */ UIFractionsControlLayout$$ExternalSyntheticLambda1(FractionsControlLayoutBinding binding2) {
                r2 = binding2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UIFractionsControlLayout.setupOnClickListeners$lambda$5$lambda$2(UIFractionsControlLayout.this, r2, view);
            }
        });
        binding2.editTextSearchPlayer.setOnBackPressListener(new CustomEditTextWithBackPressEvent.MyEditTextListener() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$$ExternalSyntheticLambda2
            public final /* synthetic */ FractionsControlLayoutBinding f$1;

            public /* synthetic */ UIFractionsControlLayout$$ExternalSyntheticLambda2(FractionsControlLayoutBinding binding2) {
                r2 = binding2;
            }

            @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
            public final void callback() {
                UIFractionsControlLayout.setupOnClickListeners$lambda$5$lambda$3(UIFractionsControlLayout.this, r2);
            }
        });
        binding2.imageButtonSortBy.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$$ExternalSyntheticLambda3
            public final /* synthetic */ FractionsControlLayoutBinding f$1;

            public /* synthetic */ UIFractionsControlLayout$$ExternalSyntheticLambda3(FractionsControlLayoutBinding binding2) {
                r2 = binding2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UIFractionsControlLayout.setupOnClickListeners$lambda$5$lambda$4(UIFractionsControlLayout.this, r2, view);
            }
        });
    }

    public static final void setupOnClickListeners$lambda$5$lambda$2(UIFractionsControlLayout this$0, FractionsControlLayoutBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        view.startAnimation(this$0.getAnim());
        if (this_with.editTextSearchPlayer.getVisibility() == 0) {
            this_with.editTextSearchPlayer.setVisibility(4);
            this_with.imageButtonSortBy.setVisibility(0);
            this_with.textViewFractionStaffTitle.setVisibility(0);
            UsefulKt.hideSystemUI(this$0.getBinding().getRoot());
            return;
        }
        this_with.editTextSearchPlayer.setVisibility(0);
        this_with.editTextSearchPlayer.setFocusable(false);
        this_with.editTextSearchPlayer.setFocusableInTouchMode(true);
        this_with.imageButtonSortBy.setVisibility(4);
        this_with.textViewFractionStaffTitle.setVisibility(4);
        if (this_with.recyclerViewSortBy.getVisibility() == 0) {
            this_with.recyclerViewSortBy.setVisibility(4);
            this_with.imageButtonSortBy.setBackgroundColor(ContextCompat.getColor(this$0.getBinding().getRoot().getContext(), 2131100871));
        }
        UsefulKt.hideSystemUI(this$0.getBinding().getRoot());
        this_with.editTextSearchPlayer.setOnKeyListener(new View.OnKeyListener() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$$ExternalSyntheticLambda0
            public /* synthetic */ UIFractionsControlLayout$$ExternalSyntheticLambda0() {
            }

            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view2, int i, KeyEvent keyEvent) {
                boolean z;
                z = UIFractionsControlLayout.setupOnClickListeners$lambda$5$lambda$2$lambda$1(UIFractionsControlLayout.this, view2, i, keyEvent);
                return z;
            }
        });
    }

    public static final boolean setupOnClickListeners$lambda$5$lambda$2$lambda$1(UIFractionsControlLayout this$0, View view, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i != 66) {
            return false;
        }
        Object systemService = this$0.getFragmentContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(this$0.getBinding().getRoot().getWindowToken(), 0);
        view.setFocusable(false);
        view.setFocusableInTouchMode(true);
        return true;
    }

    public static final void setupOnClickListeners$lambda$5$lambda$3(UIFractionsControlLayout this$0, FractionsControlLayoutBinding this_with) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Object systemService = this$0.getFragmentContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(this$0.getBinding().getRoot().getWindowToken(), 0);
        this_with.editTextSearchPlayer.setFocusable(false);
        this_with.editTextSearchPlayer.setFocusableInTouchMode(true);
    }

    public static final void setupOnClickListeners$lambda$5$lambda$4(UIFractionsControlLayout this$0, FractionsControlLayoutBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        view.startAnimation(this$0.getAnim());
        if (this_with.recyclerViewSortBy.getVisibility() == 0) {
            this_with.recyclerViewSortBy.setVisibility(4);
            this_with.imageButtonSortBy.setBackgroundColor(ContextCompat.getColor(this$0.getFragmentContext(), 2131100871));
        } else {
            this_with.recyclerViewSortBy.setVisibility(0);
            this_with.imageButtonSortBy.setBackgroundColor(ContextCompat.getColor(this$0.getFragmentContext(), 2131099741));
        }
    }

    public final void sortOnlyOnline() {
        this.sortedListOfPlayers.clear();
        for (FractionControlListOfPlayers fractionControlListOfPlayers : this.listOfPlayers) {
            if (fractionControlListOfPlayers.getOnline() == 1) {
                this.sortedListOfPlayers.add(fractionControlListOfPlayers);
            }
        }
        getControlViewModel().setSortedStaffListLiveData(this.sortedListOfPlayers);
    }

    public final void sortOnlyOffline() {
        this.sortedListOfPlayers.clear();
        for (FractionControlListOfPlayers fractionControlListOfPlayers : this.listOfPlayers) {
            if (fractionControlListOfPlayers.getOnline() == 0) {
                this.sortedListOfPlayers.add(fractionControlListOfPlayers);
            }
        }
        getControlViewModel().setSortedStaffListLiveData(this.sortedListOfPlayers);
    }

    public final void sortAscending() {
        List<FractionControlListOfPlayers> list = this.sortedListOfPlayers;
        list.clear();
        list.addAll(this.listOfPlayers);
        if (list.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list, new Comparator() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$sortAscending$lambda$7$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((FractionControlListOfPlayers) t).getRank()), Integer.valueOf(((FractionControlListOfPlayers) t2).getRank()));
                }
            });
        }
        getControlViewModel().setSortedStaffListLiveData(this.sortedListOfPlayers);
    }

    public final void sortDescending() {
        List<FractionControlListOfPlayers> list = this.sortedListOfPlayers;
        list.clear();
        list.addAll(this.listOfPlayers);
        if (list.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list, new Comparator() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$sortDescending$lambda$9$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((FractionControlListOfPlayers) t2).getRank()), Integer.valueOf(((FractionControlListOfPlayers) t).getRank()));
                }
            });
        }
        getControlViewModel().setSortedStaffListLiveData(this.sortedListOfPlayers);
    }

    public final void setLogicForOnPlayerItemClick() {
        FractionsControlStaffListAdapter fractionsControlStaffListAdapter = this.staffListAdapter;
        if (fractionsControlStaffListAdapter == null) {
            return;
        }
        fractionsControlStaffListAdapter.setOnPlayerItemClickListener(new Function2<FractionControlListOfPlayers, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$setLogicForOnPlayerItemClick$1
            public UIFractionsControlLayout$setLogicForOnPlayerItemClick$1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(FractionControlListOfPlayers fractionControlListOfPlayers, Integer num) {
                invoke(fractionControlListOfPlayers, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull FractionControlListOfPlayers clickedItem, int i) {
                long j;
                FractionsControlStaffListAdapter fractionsControlStaffListAdapter2;
                FractionsControlViewModel controlViewModel;
                Intrinsics.checkNotNullParameter(clickedItem, "clickedItem");
                long currentTimeMillis = System.currentTimeMillis();
                j = UIFractionsControlLayout.this.timeOldClickOnPlayerItem;
                if (currentTimeMillis - j > 300) {
                    UIFractionsControlLayout.this.timeOldClickOnPlayerItem = System.currentTimeMillis();
                    clickedItem.setClicked(true);
                    fractionsControlStaffListAdapter2 = UIFractionsControlLayout.this.staffListAdapter;
                    if (fractionsControlStaffListAdapter2 != null) {
                        fractionsControlStaffListAdapter2.setCheckOnlyForOneItem(i);
                        fractionsControlStaffListAdapter2.notifyItemChanged(i);
                    }
                    controlViewModel = UIFractionsControlLayout.this.getControlViewModel();
                    controlViewModel.sendPlayerChosenId(clickedItem.getId());
                }
            }
        });
    }

    public final void setLogicForOnSortByItemClickListener() {
        FractionsControlSortByAdapter fractionsControlSortByAdapter = this.fractionsControlSortByAdapter;
        if (fractionsControlSortByAdapter == null) {
            return;
        }
        fractionsControlSortByAdapter.setOnSortByItemClickListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$setLogicForOnSortByItemClickListener$1
            public UIFractionsControlLayout$setLogicForOnSortByItemClickListener$1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                FractionsControlViewModel controlViewModel;
                controlViewModel = UIFractionsControlLayout.this.getControlViewModel();
                controlViewModel.setMenuSortedPressed(i);
            }
        });
    }

    public final void setLogicForOnMinusRankClickListener() {
        FractionsControlManagementAdapter fractionsControlManagementAdapter = this.controlManagementAdapter;
        if (fractionsControlManagementAdapter == null) {
            return;
        }
        fractionsControlManagementAdapter.setOnMinusRankClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$setLogicForOnMinusRankClickListener$1
            public UIFractionsControlLayout$setLogicForOnMinusRankClickListener$1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                FractionsControlViewModel controlViewModel;
                controlViewModel = UIFractionsControlLayout.this.getControlViewModel();
                controlViewModel.sendChangeRank(0);
            }
        });
    }

    public final void setLogicForOnPlusRankClickListener() {
        FractionsControlManagementAdapter fractionsControlManagementAdapter = this.controlManagementAdapter;
        if (fractionsControlManagementAdapter == null) {
            return;
        }
        fractionsControlManagementAdapter.setOnPlusRankClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$setLogicForOnPlusRankClickListener$1
            public UIFractionsControlLayout$setLogicForOnPlusRankClickListener$1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                FractionsControlViewModel controlViewModel;
                controlViewModel = UIFractionsControlLayout.this.getControlViewModel();
                controlViewModel.sendChangeRank(1);
            }
        });
    }

    public final void setLogicForOnPlusReprimandsListener() {
        FractionsControlManagementAdapter fractionsControlManagementAdapter = this.controlManagementAdapter;
        if (fractionsControlManagementAdapter == null) {
            return;
        }
        fractionsControlManagementAdapter.setOnPlusReprimandsClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$setLogicForOnPlusReprimandsListener$1
            public UIFractionsControlLayout$setLogicForOnPlusReprimandsListener$1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                FractionsControlViewModel controlViewModel;
                controlViewModel = UIFractionsControlLayout.this.getControlViewModel();
                controlViewModel.sendChangeReprimands(1);
            }
        });
    }

    public final void setLogicForOnMinusReprimandsListener() {
        FractionsControlManagementAdapter fractionsControlManagementAdapter = this.controlManagementAdapter;
        if (fractionsControlManagementAdapter == null) {
            return;
        }
        fractionsControlManagementAdapter.setOnMinusReprimandsClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$setLogicForOnMinusReprimandsListener$1
            public UIFractionsControlLayout$setLogicForOnMinusReprimandsListener$1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                FractionsControlViewModel controlViewModel;
                controlViewModel = UIFractionsControlLayout.this.getControlViewModel();
                controlViewModel.sendChangeReprimands(0);
            }
        });
    }

    public final void setOnDismissFromFractionClickListener() {
        FractionsControlManagementAdapter fractionsControlManagementAdapter = this.controlManagementAdapter;
        if (fractionsControlManagementAdapter == null) {
            return;
        }
        fractionsControlManagementAdapter.setOnDismissFromFractionClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsControlLayout$setOnDismissFromFractionClickListener$1
            public UIFractionsControlLayout$setOnDismissFromFractionClickListener$1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                FractionsControlViewModel controlViewModel;
                controlViewModel = UIFractionsControlLayout.this.getControlViewModel();
                controlViewModel.sendButtonPressed(18);
            }
        });
    }

    public final void setInfoAboutPlayer(FractionControlPlayerInfo clickedItem) {
        FractionsControlLayoutBinding binding = getBinding();
        Useful useful = Useful.INSTANCE;
        int skinId = clickedItem.getSkinId();
        FrameLayout frameLayoutRenderSkin = binding.frameLayoutRenderSkin;
        Intrinsics.checkNotNullExpressionValue(frameLayoutRenderSkin, "frameLayoutRenderSkin");
        useful.renderSkin(2, 134, skinId, 1, frameLayoutRenderSkin);
        binding.textViewPlayersNickname.setText(clickedItem.getNickname());
        TextView textView = binding.textViewPlayersLevel;
        String string = getString(R.string.common_level_with_value);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(R.string.common_level_with_value, Integer.valueOf(clickedItem.getLevel()));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        textView.setText(setTextRegular(string, string2));
        TextView textView2 = binding.textViewPosition;
        String string3 = getString(R.string.fractions_control_players_position);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = getString(R.string.fractions_control_players_position, clickedItem.getRankName());
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        textView2.setText(setTextRegular(string3, string4));
        TextView textView3 = binding.textViewPlayersRank;
        String string5 = getString(R.string.fractions_control_players_rank);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String string6 = getString(R.string.fractions_control_players_rank, Integer.valueOf(clickedItem.getRank()));
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        textView3.setText(setTextRegular(string5, string6));
        TextView textView4 = binding.textViewPlayersReprimands;
        String string7 = getString(R.string.fractions_control_players_reprimands);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        String string8 = getString(R.string.fractions_control_players_reprimands, Integer.valueOf(clickedItem.getReprimand()));
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        textView4.setText(setTextRegular(string7, string8));
        TextView textView5 = binding.textViewPlayersPhoneNumber;
        String string9 = getString(R.string.fractions_control_players_phone_number);
        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
        String string10 = getString(R.string.fractions_control_players_phone_number, clickedItem.getPhoneNumber());
        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
        textView5.setText(setTextRegular(string9, string10));
        setupControlManagementAdapter(clickedItem);
    }

    public final CharSequence setTextRegular(String r5, String fullText) {
        Typeface font;
        try {
            int length = r5.length() - 4;
            int length2 = fullText.length();
            if (length > length2 || (font = ResourcesCompat.getFont(getBinding().getRoot().getContext(), R.font.montserrat_regular)) == null) {
                return fullText;
            }
            CustomTypefaceSpanTextStyleBold customTypefaceSpanTextStyleBold = new CustomTypefaceSpanTextStyleBold("", font);
            SpannableString spannableString = new SpannableString(fullText);
            spannableString.setSpan(customTypefaceSpanTextStyleBold, length, length2, 18);
            return spannableString;
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().log("4el tut crashit");
            FirebaseCrashlytics.getInstance().recordException(e);
            return fullText;
        }
    }

    public final void setupFractionsControlSortByAdapter() {
        this.fractionsControlSortByAdapter = new FractionsControlSortByAdapter(getListForSortByAdapter(), 3);
        RecyclerView recyclerView = getBinding().recyclerViewSortBy;
        recyclerView.setLayoutManager(new LinearLayoutManager(getBinding().getRoot().getContext(), 1, false));
        recyclerView.setAdapter(this.fractionsControlSortByAdapter);
        setLogicForOnSortByItemClickListener();
    }

    public final List<FractionsSortByItem> getListForSortByAdapter() {
        Context context = getBinding().getRoot().getContext();
        String string = context.getString(R.string.fractions_control_sort_by_only_online);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        FractionsSortByItem fractionsSortByItem = new FractionsSortByItem(string, false);
        String string2 = context.getString(R.string.fractions_control_sort_by_only_offline);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        FractionsSortByItem fractionsSortByItem2 = new FractionsSortByItem(string2, false);
        String string3 = context.getString(R.string.fractions_control_sort_by_rank_ascending);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        FractionsSortByItem fractionsSortByItem3 = new FractionsSortByItem(string3, false);
        String string4 = context.getString(R.string.fractions_control_sort_by_rank_descending);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return CollectionsKt__CollectionsKt.mutableListOf(fractionsSortByItem, fractionsSortByItem2, fractionsSortByItem3, new FractionsSortByItem(string4, true));
    }

    public final void setupControlManagementAdapter(FractionControlPlayerInfo item) {
        this.controlManagementAdapter = new FractionsControlManagementAdapter(item);
        RecyclerView recyclerView = getBinding().recyclerViewControlFraction;
        recyclerView.setLayoutManager(new LinearLayoutManager(getBinding().getRoot().getContext(), 1, false));
        recyclerView.setAdapter(this.controlManagementAdapter);
        setLogicForOnMinusRankClickListener();
        setLogicForOnPlusRankClickListener();
        setLogicForOnPlusReprimandsListener();
        setLogicForOnMinusReprimandsListener();
        setOnDismissFromFractionClickListener();
    }

    public final void setupStaffListAdapter(List<FractionControlListOfPlayers> r3) {
        this.staffListAdapter = new FractionsControlStaffListAdapter(r3, this.listOfImagesForAdapter);
        getBinding().recyclerViewStaffList.setAdapter(this.staffListAdapter);
        setLogicForOnPlayerItemClick();
    }

    public final void setupListOfImagesForAdapter(int fractionId) {
        this.listOfImagesForAdapter.addAll(getListOfImagesForAdapter(fractionId));
    }

    @SuppressLint({"DiscouragedApi"})
    private final List<Integer> getListOfImagesFunction(String link) {
        Resources resources;
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < 11; i++) {
            String str = link + i;
            Context context = getBinding().getRoot().getContext();
            if (context != null && (resources = context.getResources()) != null) {
                arrayList.add(Integer.valueOf(resources.getIdentifier(str, "drawable", context.getPackageName())));
            }
        }
        return arrayList;
    }

    private final List<Integer> getListOfImagesForAdapter(int fractionId) {
        if (fractionId != 11) {
            switch (fractionId) {
                case 1:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_GOVERNMENT);
                case 2:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_DEPARTMENT_TURNED);
                case 3:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_HOSPITAL);
                case 4:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_MASS_MEDIA);
                case 5:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_MVD_TURNED);
                case 6:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_MVD_TURNED);
                case 7:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_MVD_TURNED);
                default:
                    return new ArrayList();
            }
        }
        return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_MVD_TURNED);
    }
}
