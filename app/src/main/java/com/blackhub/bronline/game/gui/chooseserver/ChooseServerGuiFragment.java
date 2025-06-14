package com.blackhub.bronline.game.gui.chooseserver;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.ServerSelectItemBinding;
import com.blackhub.bronline.databinding.ServerSelectWithLoadProgressBinding;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.preferences.Preferences;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.Settings;
import com.blackhub.bronline.launcher.network.Server;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: ChooseServerGuiFragment.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010,\u001a\u00020#H\u0016J\b\u0010-\u001a\u00020\u0002H\u0016J\b\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020/H\u0002J\b\u00101\u001a\u00020/H\u0016J\b\u00102\u001a\u00020/H\u0016J\u0010\u00103\u001a\u00020/2\u0006\u00104\u001a\u00020\u0007H\u0016J\b\u00105\u001a\u00020/H\u0016J\u0010\u00106\u001a\u00020/2\u0006\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u00020/H\u0002J\b\u0010:\u001a\u00020/H\u0002J\u0018\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020#2\u0006\u0010=\u001a\u00020\rH\u0002J\u0010\u0010>\u001a\u00020/2\u0006\u0010?\u001a\u00020#H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/blackhub/bronline/game/gui/chooseserver/ChooseServerGuiFragment;", "Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragment;", "Lcom/blackhub/bronline/databinding/ServerSelectWithLoadProgressBinding;", "()V", "_localBinding", "Lcom/blackhub/bronline/databinding/ServerSelectItemBinding;", "fragmentContext", "Landroid/content/Context;", "getFragmentContext", "()Landroid/content/Context;", "fragmentContext$delegate", "Lkotlin/Lazy;", "isFirstInit", "", "jniActivity", "Lcom/blackhub/bronline/game/core/JNIActivity;", "kotlin.jvm.PlatformType", "getJniActivity", "()Lcom/blackhub/bronline/game/core/JNIActivity;", "jniActivity$delegate", "jniActivityViewModel", "Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "getJniActivityViewModel", "()Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "jniActivityViewModel$delegate", "localBinding", "getLocalBinding", "()Lcom/blackhub/bronline/databinding/ServerSelectItemBinding;", "mGUIManager", "Lcom/blackhub/bronline/game/GUIManager;", "mServers", "", "Lcom/blackhub/bronline/launcher/network/Server;", "mSwitchAfterInitializtion", "mType", "", "percentsOfProgressForNativeLib", "serverIp", "", "serverPort", "stepForProgressLoading", "", "totalValueOfRequests", "valueOfProgressForNativeLib", "getGuiId", "getViewBinding", "initServersView", "", "initUI", "initViewsISAMPGUI", "newBackPress", "onAttach", "context", "onDestroy", "onPacketIncoming", "json", "Lorg/json/JSONObject;", "processMyServer", "setObservers", "setProgress", "progress", "isNativeProgress", "setServerIpAndServerPort", FirebaseAnalytics.Param.INDEX, "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChooseServerGuiFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChooseServerGuiFragment.kt\ncom/blackhub/bronline/game/gui/chooseserver/ChooseServerGuiFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,564:1\n106#2,15:565\n1#3:580\n350#4,7:581\n350#4,7:588\n*S KotlinDebug\n*F\n+ 1 ChooseServerGuiFragment.kt\ncom/blackhub/bronline/game/gui/chooseserver/ChooseServerGuiFragment\n*L\n74#1:565,15\n213#1:581,7\n252#1:588,7\n*E\n"})
/* loaded from: classes3.dex */
public final class ChooseServerGuiFragment extends BaseISAMPGUIFragment<ServerSelectWithLoadProgressBinding> {
    public static final int $stable = 8;

    @Nullable
    public ServerSelectItemBinding _localBinding;
    public boolean isFirstInit;

    /* renamed from: jniActivityViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy jniActivityViewModel;

    @Nullable
    public GUIManager mGUIManager;
    public boolean mSwitchAfterInitializtion;
    public int mType;
    public int percentsOfProgressForNativeLib;
    public int serverPort;
    public float stepForProgressLoading;
    public int totalValueOfRequests;
    public int valueOfProgressForNativeLib;

    @NotNull
    public String serverIp = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);

    @NotNull
    public List<Server> mServers = CollectionsKt__CollectionsKt.emptyList();

    /* renamed from: fragmentContext$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy fragmentContext = LazyKt__LazyJVMKt.lazy(new Function0<Context>() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$fragmentContext$2
        public ChooseServerGuiFragment$fragmentContext$2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Context invoke() {
            return ChooseServerGuiFragment.this.requireContext();
        }
    });

    /* renamed from: jniActivity$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy jniActivity = LazyKt__LazyJVMKt.lazy(ChooseServerGuiFragment$jniActivity$2.INSTANCE);

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 11;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$special$$inlined$viewModels$default$2.<init>(kotlin.Lazy):void, class status: GENERATED_AND_UNLOADED
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
    public ChooseServerGuiFragment() {
        /*
            r5 = this;
            r5.<init>()
            kotlin.jvm.internal.StringCompanionObject r0 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.lang.String r0 = com.blackhub.bronline.game.core.extension.AnyExtensionKt.empty(r0)
            r5.serverIp = r0
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            r5.mServers = r0
            com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$fragmentContext$2 r0 = new com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$fragmentContext$2
            r0.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r0)
            r5.fragmentContext = r0
            com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$jniActivity$2 r0 = com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$jniActivity$2.INSTANCE
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r0)
            r5.jniActivity = r0
            com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$jniActivityViewModel$2 r0 = new com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$jniActivityViewModel$2
            r0.<init>()
            kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.NONE
            com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$special$$inlined$viewModels$default$1 r2 = new com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$special$$inlined$viewModels$default$1
            r2.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r1, r2)
            java.lang.Class<com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel> r1 = com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel.class
            kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
            com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$special$$inlined$viewModels$default$2 r2 = new com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$special$$inlined$viewModels$default$2
            r2.<init>()
            com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$special$$inlined$viewModels$default$3 r3 = new com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$special$$inlined$viewModels$default$3
            r4 = 0
            r3.<init>()
            com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$special$$inlined$viewModels$default$4 r4 = new com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$special$$inlined$viewModels$default$4
            r4.<init>()
            kotlin.Lazy r0 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r5, r1, r2, r3, r4)
            r5.jniActivityViewModel = r0
            r0 = 1
            r5.isFirstInit = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ServerSelectWithLoadProgressBinding access$getBinding(ChooseServerGuiFragment chooseServerGuiFragment) {
        return (ServerSelectWithLoadProgressBinding) chooseServerGuiFragment.getBinding();
    }

    public final Context getFragmentContext() {
        return (Context) this.fragmentContext.getValue();
    }

    public final JNIActivity getJniActivity() {
        return (JNIActivity) this.jniActivity.getValue();
    }

    public final ServerSelectItemBinding getLocalBinding() {
        ServerSelectItemBinding serverSelectItemBinding = this._localBinding;
        if (serverSelectItemBinding != null) {
            return serverSelectItemBinding;
        }
        throw new NullPointerException("ServerSelectItemBinding is not initialized");
    }

    public final JNIActivityViewModel getJniActivityViewModel() {
        return (JNIActivityViewModel) this.jniActivityViewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        App.INSTANCE.appComponent().inject(this);
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        int optInt = json.optInt("t");
        if (optInt != 0) {
            if (optInt != 1) {
                return;
            }
            getJniActivityViewModel().onNativeInitFinish();
        } else {
            Integer valueOf = Integer.valueOf(json.optInt("s"));
            if (valueOf.intValue() >= 100) {
                valueOf = null;
            }
            setProgress(valueOf != null ? valueOf.intValue() : 100, true);
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() {
        this.mGUIManager = GUIManager.INSTANCE.getInstance();
        this.mType = Preferences.getInteger(getFragmentContext(), Preferences.USER_SERVER, -1);
        setObservers();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public ServerSelectWithLoadProgressBinding getViewBinding() {
        ServerSelectWithLoadProgressBinding inflate = ServerSelectWithLoadProgressBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    private final void setObservers() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ChooseServerGuiFragment$setObservers$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ChooseServerGuiFragment$setObservers$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ChooseServerGuiFragment$setObservers$3(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ChooseServerGuiFragment$setObservers$4(this, null), 3, null);
        getJniActivityViewModel().getUpdatedServers().observe(this, new ChooseServerGuiFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends Server>, Unit>() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$setObservers$5
            public ChooseServerGuiFragment$setObservers$5() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends Server> list) {
                invoke2((List<Server>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(List<Server> list) {
                ChooseServerGuiFragment chooseServerGuiFragment = ChooseServerGuiFragment.this;
                Intrinsics.checkNotNull(list);
                chooseServerGuiFragment.mServers = list;
                ChooseServerGuiFragment.this.initUI();
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void processMyServer() {
        if (this.mType >= this.mServers.size()) {
            Iterator<Server> it = this.mServers.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Integer testServerId = it.next().getTestServerId();
                int i2 = this.mType;
                if (testServerId != null && testServerId.intValue() == i2) {
                    break;
                } else {
                    i++;
                }
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf.intValue() <= -1) {
                valueOf = null;
            }
            this.mType = IntExtensionKt.getOrZero(valueOf);
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) this.mServers.get(this.mType).getFirstName(), (CharSequence) "test", false, 2, (Object) null)) {
            ((ServerSelectWithLoadProgressBinding) getBinding()).brServerName.setText(this.mServers.get(this.mType).getFirstName());
            return;
        }
        ((ServerSelectWithLoadProgressBinding) getBinding()).brServerName.setText(this.mServers.get(this.mType).getFirstName());
        ((ServerSelectWithLoadProgressBinding) getBinding()).serverListBackColor.getBackground().setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(Color.parseColor("#" + this.mServers.get(this.mType).getColor()), BlendModeCompat.SRC_ATOP));
        ((ServerSelectWithLoadProgressBinding) getBinding()).brServerProgress.setProgressColor(Color.parseColor("#" + this.mServers.get(this.mType).getColor()));
        ((ServerSelectWithLoadProgressBinding) getBinding()).brServerProgress.setProgress((int) ((Double.parseDouble(this.mServers.get(this.mType).getOnline()) / Double.parseDouble(this.mServers.get(this.mType).getMaxOnline())) * ((double) 100)));
        ((ServerSelectWithLoadProgressBinding) getBinding()).brServerImage.setColorFilter(Color.parseColor("#" + this.mServers.get(this.mType).getColor()), PorterDuff.Mode.SRC_ATOP);
        ((ServerSelectWithLoadProgressBinding) getBinding()).brServerX2.setVisibility(this.mServers.get(this.mType).getX2() ? 0 : 8);
        ((ServerSelectWithLoadProgressBinding) getBinding()).brServerOnline.setText(Useful.INSTANCE.getTextWithHtmlStyles(this.mServers.get(this.mType).getOnline() + "<font color='#808080'>/" + this.mServers.get(this.mType).getMaxOnline()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initUI() {
        if (this.mType >= this.mServers.size() || this.mType < 0) {
            Iterator<Server> it = this.mServers.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Integer testServerId = it.next().getTestServerId();
                int i2 = this.mType;
                if (testServerId != null && testServerId.intValue() == i2) {
                    break;
                } else {
                    i++;
                }
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf.intValue() <= -1) {
                valueOf = null;
            }
            this.mType = valueOf != null ? valueOf.intValue() : -1;
        }
        ((ServerSelectWithLoadProgressBinding) getBinding()).progressBar.setMax(100.0f);
        ((ServerSelectWithLoadProgressBinding) getBinding()).serverMainFrame.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$$ExternalSyntheticLambda1
            public /* synthetic */ ChooseServerGuiFragment$$ExternalSyntheticLambda1() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseServerGuiFragment.initUI$lambda$5(ChooseServerGuiFragment.this, view);
            }
        });
        ((ServerSelectWithLoadProgressBinding) getBinding()).brServersPlay.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$$ExternalSyntheticLambda2
            public /* synthetic */ ChooseServerGuiFragment$$ExternalSyntheticLambda2() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseServerGuiFragment.initUI$lambda$6(ChooseServerGuiFragment.this, view);
            }
        });
        if (this.mType != -1) {
            ((ServerSelectWithLoadProgressBinding) getBinding()).listServersChoose.setAlpha(0.0f);
            ((ServerSelectWithLoadProgressBinding) getBinding()).listServersChoose.setVisibility(8);
            ((ServerSelectWithLoadProgressBinding) getBinding()).mainServersChoose.setVisibility(0);
            ((ServerSelectWithLoadProgressBinding) getBinding()).mainServersChoose.setAlpha(1.0f);
        } else {
            ((ServerSelectWithLoadProgressBinding) getBinding()).mainServersChoose.setAlpha(0.0f);
            ((ServerSelectWithLoadProgressBinding) getBinding()).mainServersChoose.setVisibility(8);
            ((ServerSelectWithLoadProgressBinding) getBinding()).listServersChoose.setVisibility(0);
            ((ServerSelectWithLoadProgressBinding) getBinding()).allServersButton.setVisibility(8);
            ((ServerSelectWithLoadProgressBinding) getBinding()).serversBtnMyServer.setVisibility(8);
        }
        ((ServerSelectWithLoadProgressBinding) getBinding()).serversBtnMyServer.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$$ExternalSyntheticLambda3
            public /* synthetic */ ChooseServerGuiFragment$$ExternalSyntheticLambda3() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseServerGuiFragment.initUI$lambda$7(ChooseServerGuiFragment.this, view);
            }
        });
        ((ServerSelectWithLoadProgressBinding) getBinding()).allServersButton.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$$ExternalSyntheticLambda4
            public /* synthetic */ ChooseServerGuiFragment$$ExternalSyntheticLambda4() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseServerGuiFragment.initUI$lambda$8(ChooseServerGuiFragment.this, view);
            }
        });
        if (this.mType != -1) {
            processMyServer();
        }
        initServersView();
        if (this.mSwitchAfterInitializtion) {
            ((ServerSelectWithLoadProgressBinding) getBinding()).chooseServerRootChoose.setVisibility(0);
            ((ServerSelectWithLoadProgressBinding) getBinding()).chooseServerRootChoose.setAlpha(1.0f);
            ((ServerSelectWithLoadProgressBinding) getBinding()).chooseServerRootLoading.setVisibility(8);
            this.mSwitchAfterInitializtion = false;
        }
    }

    public static final void initUI$lambda$5(ChooseServerGuiFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        view.startAnimation(AnimationUtils.loadAnimation(this$0.getFragmentContext(), R.anim.button_click));
    }

    public static final void initUI$lambda$6(ChooseServerGuiFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        view.startAnimation(AnimationUtils.loadAnimation(this$0.getFragmentContext(), R.anim.button_click));
        this$0.getJniActivity().sendGetRequest(this$0.mServers.get(this$0.mType).getUrl());
        this$0.setServerIpAndServerPort(this$0.mType);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("b", this$0.mType);
        jSONObject.put("i", this$0.serverIp);
        jSONObject.put("p", this$0.serverPort);
        jSONObject.put("u", this$0.mServers.get(this$0.mType).getUrl());
        if (this$0.mServers.get(this$0.mType).getX2cordx() != null) {
            jSONObject.put("2x", this$0.mServers.get(this$0.mType).getX2cordx());
        }
        if (this$0.mServers.get(this$0.mType).getX2cordy() != null) {
            jSONObject.put("2y", this$0.mServers.get(this$0.mType).getX2cordy());
        }
        GUIManager gUIManager = this$0.mGUIManager;
        if (gUIManager != null) {
            gUIManager.sendJsonData(11, jSONObject);
        }
        GUIManager gUIManager2 = this$0.mGUIManager;
        if (gUIManager2 != null) {
            gUIManager2.closeGUI(null, 11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void initUI$lambda$7(ChooseServerGuiFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        view.startAnimation(AnimationUtils.loadAnimation(this$0.getFragmentContext(), R.anim.button_click));
        view.setBackground(ResourcesCompat.getDrawable(this$0.getResources(), R.drawable.bg_rectangle_orange_hgr_cr8_1, null));
        ((ServerSelectWithLoadProgressBinding) this$0.getBinding()).allServersButton.setBackground(ResourcesCompat.getDrawable(this$0.getResources(), R.drawable.bg_button_red_unfilled_ss, null));
        if (((ServerSelectWithLoadProgressBinding) this$0.getBinding()).mainServersChoose.getVisibility() != 0) {
            ((ServerSelectWithLoadProgressBinding) this$0.getBinding()).listServersChoose.animate().alpha(0.0f).setDuration(100L).setListener(new Animator.AnimatorListener() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$initUI$5$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator r2) {
                    Intrinsics.checkNotNullParameter(r2, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@NotNull Animator r2) {
                    Intrinsics.checkNotNullParameter(r2, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@NotNull Animator r2) {
                    Intrinsics.checkNotNullParameter(r2, "animation");
                }

                public ChooseServerGuiFragment$initUI$5$1() {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator r3) {
                    Intrinsics.checkNotNullParameter(r3, "animation");
                    ChooseServerGuiFragment.access$getBinding(ChooseServerGuiFragment.this).listServersChoose.setAlpha(0.0f);
                    ChooseServerGuiFragment.access$getBinding(ChooseServerGuiFragment.this).listServersChoose.setVisibility(8);
                    ChooseServerGuiFragment.access$getBinding(ChooseServerGuiFragment.this).mainServersChoose.setVisibility(0);
                    ChooseServerGuiFragment.access$getBinding(ChooseServerGuiFragment.this).mainServersChoose.setAlpha(0.0f);
                    ChooseServerGuiFragment.access$getBinding(ChooseServerGuiFragment.this).mainServersChoose.animate().alpha(1.0f).setDuration(100L).setListener(null).start();
                }
            }).start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void initUI$lambda$8(ChooseServerGuiFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        view.startAnimation(AnimationUtils.loadAnimation(this$0.getFragmentContext(), R.anim.button_click));
        view.setBackground(ResourcesCompat.getDrawable(this$0.getResources(), R.drawable.bg_rectangle_orange_hgr_cr8_1, null));
        ((ServerSelectWithLoadProgressBinding) this$0.getBinding()).serversBtnMyServer.setBackground(ResourcesCompat.getDrawable(this$0.getResources(), R.drawable.bg_button_red_unfilled_ss, null));
        if (((ServerSelectWithLoadProgressBinding) this$0.getBinding()).listServersChoose.getVisibility() != 0) {
            ((ServerSelectWithLoadProgressBinding) this$0.getBinding()).mainServersChoose.animate().alpha(0.0f).setDuration(100L).setListener(new Animator.AnimatorListener() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$initUI$6$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator r2) {
                    Intrinsics.checkNotNullParameter(r2, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@NotNull Animator r2) {
                    Intrinsics.checkNotNullParameter(r2, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@NotNull Animator r2) {
                    Intrinsics.checkNotNullParameter(r2, "animation");
                }

                public ChooseServerGuiFragment$initUI$6$1() {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator r3) {
                    Intrinsics.checkNotNullParameter(r3, "animation");
                    ChooseServerGuiFragment.access$getBinding(ChooseServerGuiFragment.this).mainServersChoose.setAlpha(0.0f);
                    ChooseServerGuiFragment.access$getBinding(ChooseServerGuiFragment.this).mainServersChoose.setVisibility(8);
                    ChooseServerGuiFragment.access$getBinding(ChooseServerGuiFragment.this).listServersChoose.setVisibility(0);
                    ChooseServerGuiFragment.access$getBinding(ChooseServerGuiFragment.this).listServersChoose.setAlpha(0.0f);
                    ChooseServerGuiFragment.access$getBinding(ChooseServerGuiFragment.this).listServersChoose.animate().alpha(1.0f).setDuration(100L).setListener(null).start();
                }
            }).start();
        }
    }

    public final void setServerIpAndServerPort(int r3) {
        String TEST_SERVER_PORT = Settings.TEST_SERVER_PORT;
        Intrinsics.checkNotNullExpressionValue(TEST_SERVER_PORT, "TEST_SERVER_PORT");
        if (TEST_SERVER_PORT.length() > 0) {
            this.serverIp = "80.66.82.19";
            this.serverPort = Integer.parseInt(Settings.TEST_SERVER_PORT);
        } else {
            this.serverIp = this.mServers.get(r3).getIp();
            this.serverPort = Integer.parseInt(this.mServers.get(r3).getPort());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    public final void initServersView() {
        int i;
        int i2;
        LinearLayout scrollLayoutServers = ((ServerSelectWithLoadProgressBinding) getBinding()).scrollLayoutServers;
        Intrinsics.checkNotNullExpressionValue(scrollLayoutServers, "scrollLayoutServers");
        boolean z = false;
        scrollLayoutServers.setScrollbarFadingEnabled(false);
        scrollLayoutServers.removeAllViews();
        int i3 = 4;
        int size = this.mServers.size() / 4;
        int i4 = size + 1;
        int i5 = 0;
        while (i5 < i4) {
            LinearLayout linearLayout = new LinearLayout(getFragmentContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1 / i4;
            if (i5 < size) {
                Context fragmentContext = getFragmentContext();
                Intrinsics.checkNotNullExpressionValue(fragmentContext, "<get-fragmentContext>(...)");
                layoutParams.setMargins(z ? 1 : 0, z ? 1 : 0, z ? 1 : 0, IntExtensionKt.dpToPx(12, fragmentContext));
            }
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setOrientation(z ? 1 : 0);
            int i6 = z ? 1 : 0;
            ?? r2 = z;
            while (i6 < i3 && (i = (i5 * 4) + i6) < this.mServers.size()) {
                int size2 = (this.mServers.size() - i) - 1;
                this._localBinding = ServerSelectItemBinding.inflate(getLayoutInflater());
                getLocalBinding().getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$$ExternalSyntheticLambda0
                    public final /* synthetic */ int f$1;

                    public /* synthetic */ ChooseServerGuiFragment$$ExternalSyntheticLambda0(int size22) {
                        r2 = size22;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ChooseServerGuiFragment.initServersView$lambda$9(ChooseServerGuiFragment.this, r2, view);
                    }
                });
                getLocalBinding().brServerName.setText(this.mServers.get(size22).getFirstName());
                Context fragmentContext2 = getFragmentContext();
                Intrinsics.checkNotNullExpressionValue(fragmentContext2, "<get-fragmentContext>(...)");
                int dpToPx = IntExtensionKt.dpToPx(160, fragmentContext2);
                Context fragmentContext3 = getFragmentContext();
                Intrinsics.checkNotNullExpressionValue(fragmentContext3, "<get-fragmentContext>(...)");
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(dpToPx, IntExtensionKt.dpToPx(80, fragmentContext3));
                layoutParams2.weight = 0.25f;
                Context fragmentContext4 = getFragmentContext();
                Intrinsics.checkNotNullExpressionValue(fragmentContext4, "<get-fragmentContext>(...)");
                layoutParams2.setMargins(r2, r2, IntExtensionKt.dpToPx(20, fragmentContext4), r2);
                getLocalBinding().getRoot().setLayoutParams(layoutParams2);
                if (getLocalBinding().getRoot().getParent() != null) {
                    ViewParent parent = getLocalBinding().getRoot().getParent();
                    Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeView(getLocalBinding().getRoot());
                }
                if (StringsKt__StringsKt.contains$default(this.mServers.get(size22).getFirstName(), "test", (boolean) r2, 2, (Object) null)) {
                    linearLayout.addView(getLocalBinding().getRoot());
                    i2 = size;
                } else {
                    getLocalBinding().serverListBackColor.getBackground().setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(Color.parseColor("#" + this.mServers.get(size22).getColor()), BlendModeCompat.SRC_ATOP));
                    getLocalBinding().brServerProgress.setProgressColor(Color.parseColor("#" + this.mServers.get(size22).getColor()));
                    getLocalBinding().brServerX2.setVisibility(this.mServers.get(size22).getX2() ? r2 : 8);
                    i2 = size;
                    getLocalBinding().brServerProgress.setProgress((int) ((Double.parseDouble(this.mServers.get(size22).getOnline()) / Double.parseDouble(this.mServers.get(size22).getMaxOnline())) * 100));
                    getLocalBinding().brServerImage.setColorFilter(Color.parseColor("#" + this.mServers.get(size22).getColor()), PorterDuff.Mode.SRC_ATOP);
                    getLocalBinding().brServerOnline.setText(Useful.INSTANCE.getTextWithHtmlStyles(this.mServers.get(size22).getOnline() + "<font color='#808080'>/" + this.mServers.get(size22).getMaxOnline()));
                    linearLayout.addView(getLocalBinding().getRoot());
                }
                i6++;
                size = i2;
                r2 = 0;
                i3 = 4;
            }
            int i7 = size;
            if (linearLayout.getParent() != null) {
                ViewParent parent2 = linearLayout.getParent();
                Intrinsics.checkNotNull(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent2).removeView(linearLayout);
            }
            scrollLayoutServers.addView(linearLayout);
            i5++;
            size = i7;
            z = false;
            i3 = 4;
        }
    }

    public static final void initServersView$lambda$9(ChooseServerGuiFragment this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        view.startAnimation(AnimationUtils.loadAnimation(this$0.getFragmentContext(), R.anim.button_click));
        this$0.getJniActivity().sendGetRequest(this$0.mServers.get(i).getUrl());
        this$0.setServerIpAndServerPort(i);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("b", i);
        jSONObject.put("i", this$0.serverIp);
        jSONObject.put("p", this$0.serverPort);
        jSONObject.put("u", this$0.mServers.get(i).getUrl());
        GUIManager gUIManager = this$0.mGUIManager;
        if (gUIManager != null) {
            gUIManager.sendJsonData(11, jSONObject);
        }
        Context fragmentContext = this$0.getFragmentContext();
        Integer testServerId = this$0.mServers.get(i).getTestServerId();
        if (testServerId != null) {
            i = testServerId.intValue();
        }
        Preferences.putInteger(fragmentContext, Preferences.USER_SERVER, i);
        GUIManager gUIManager2 = this$0.mGUIManager;
        if (gUIManager2 != null) {
            gUIManager2.closeGUI(null, 11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setProgress(int progress, boolean isNativeProgress) {
        int i;
        if (isNativeProgress) {
            progress = (int) (progress * this.stepForProgressLoading);
            this.percentsOfProgressForNativeLib = progress;
            i = getJniActivityViewModel().getCounterOfRequests().getValue().intValue();
        } else {
            i = this.percentsOfProgressForNativeLib;
        }
        int i2 = progress + i;
        if (i2 > 100) {
            i2 = 100;
        }
        ((ServerSelectWithLoadProgressBinding) getBinding()).brLsProgress.setText(getString(R.string.common_value_and_percent, Integer.valueOf(i2)));
        ((ServerSelectWithLoadProgressBinding) getBinding()).progressBar.setProgress(i2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this._localBinding = null;
        this.mGUIManager = null;
        super.onDestroy();
    }
}
