package com.blackhub.bronline.game.gui.drivingschool;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.DrivingSchoolMainDialogBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.gui.drivingschool.ui.DialogEndTest;
import com.blackhub.bronline.game.gui.drivingschool.ui.UIClassInfoLayout;
import com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout;
import com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolClassInfoViewModel;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolMainViewModel;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolQuestsViewModel;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolViewModel;
import com.blackhub.bronline.game.gui.moduledialog.ModuleDialogKeys;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.ivy.osgi.updatesite.xml.FeatureParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUIDrivingSchool.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020\u0005H\u0016J\b\u00101\u001a\u00020\u0002H\u0016J\b\u00102\u001a\u00020/H\u0002J\b\u00103\u001a\u00020/H\u0002J\b\u00104\u001a\u00020/H\u0016J\b\u00105\u001a\u00020/H\u0016J\u0010\u00106\u001a\u00020/2\u0006\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u00020/H\u0016J\u0012\u0010:\u001a\u00020/2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0018\u0010=\u001a\u00020/2\u000e\u0010>\u001a\n\u0012\u0006\b\u0001\u0012\u00020@0?H\u0002J\u0010\u0010A\u001a\u00020/2\u0006\u0010B\u001a\u00020\u0005H\u0002J\b\u0010C\u001a\u00020/H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\fR\u001b\u0010\u001a\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\fR\u001b\u0010\"\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0011\u001a\u0004\b#\u0010$R\u001b\u0010&\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0011\u001a\u0004\b'\u0010(R\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lcom/blackhub/bronline/game/gui/drivingschool/GUIDrivingSchool;", "Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragment;", "Lcom/blackhub/bronline/databinding/DrivingSchoolMainDialogBinding;", "()V", "allQuestions", "", "drivingSchoolClassInfoFactory", "Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolClassInfoViewModel;", "getDrivingSchoolClassInfoFactory", "()Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "setDrivingSchoolClassInfoFactory", "(Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;)V", "drivingSchoolClassInfoViewModel", "getDrivingSchoolClassInfoViewModel", "()Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolClassInfoViewModel;", "drivingSchoolClassInfoViewModel$delegate", "Lkotlin/Lazy;", "drivingSchoolFactory", "Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolViewModel;", "getDrivingSchoolFactory", "setDrivingSchoolFactory", "drivingSchoolMainFactory", "Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolMainViewModel;", "getDrivingSchoolMainFactory", "setDrivingSchoolMainFactory", "drivingSchoolMainViewModel", "getDrivingSchoolMainViewModel", "()Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolMainViewModel;", "drivingSchoolMainViewModel$delegate", "drivingSchoolQuestionsFactory", "Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolQuestsViewModel;", "getDrivingSchoolQuestionsFactory", "setDrivingSchoolQuestionsFactory", "drivingSchoolQuestionsViewModel", "getDrivingSchoolQuestionsViewModel", "()Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolQuestsViewModel;", "drivingSchoolQuestionsViewModel$delegate", "drivingSchoolViewModel", "getDrivingSchoolViewModel", "()Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolViewModel;", "drivingSchoolViewModel$delegate", "ifNotInformingAboutDismiss", "", "resultDialog", "Lcom/blackhub/bronline/game/gui/drivingschool/ui/DialogEndTest;", "closePopupWindows", "", "getGuiId", "getViewBinding", "initResultDialog", "initResultDialogClickListener", "initViewsISAMPGUI", "newBackPress", "onAttach", "context", "Landroid/content/Context;", "onDestroyView", "onPacketIncoming", "json", "Lorg/json/JSONObject;", "replaceFragment", FeatureParser.PluginHandler.FRAGMENT, "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "sendToServerClickButton", "type", "setNullableParameters", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGUIDrivingSchool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUIDrivingSchool.kt\ncom/blackhub/bronline/game/gui/drivingschool/GUIDrivingSchool\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,181:1\n106#2,15:182\n106#2,15:197\n106#2,15:212\n106#2,15:227\n*S KotlinDebug\n*F\n+ 1 GUIDrivingSchool.kt\ncom/blackhub/bronline/game/gui/drivingschool/GUIDrivingSchool\n*L\n32#1:182,15\n39#1:197,15\n46#1:212,15\n53#1:227,15\n*E\n"})
/* loaded from: classes3.dex */
public final class GUIDrivingSchool extends BaseISAMPGUIFragment<DrivingSchoolMainDialogBinding> {
    public static final int $stable = 8;
    public int allQuestions;

    @Inject
    public MainViewModelFactory<DrivingSchoolClassInfoViewModel> drivingSchoolClassInfoFactory;

    /* renamed from: drivingSchoolClassInfoViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy drivingSchoolClassInfoViewModel;

    @Inject
    public MainViewModelFactory<DrivingSchoolViewModel> drivingSchoolFactory;

    @Inject
    public MainViewModelFactory<DrivingSchoolMainViewModel> drivingSchoolMainFactory;

    /* renamed from: drivingSchoolMainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy drivingSchoolMainViewModel;

    @Inject
    public MainViewModelFactory<DrivingSchoolQuestsViewModel> drivingSchoolQuestionsFactory;

    /* renamed from: drivingSchoolQuestionsViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy drivingSchoolQuestionsViewModel;

    /* renamed from: drivingSchoolViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy drivingSchoolViewModel;
    public boolean ifNotInformingAboutDismiss;

    @Nullable
    public DialogEndTest resultDialog;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 37;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    @NotNull
    public final MainViewModelFactory<DrivingSchoolViewModel> getDrivingSchoolFactory() {
        MainViewModelFactory<DrivingSchoolViewModel> mainViewModelFactory = this.drivingSchoolFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("drivingSchoolFactory");
        return null;
    }

    public final void setDrivingSchoolFactory(@NotNull MainViewModelFactory<DrivingSchoolViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.drivingSchoolFactory = mainViewModelFactory;
    }

    public final DrivingSchoolViewModel getDrivingSchoolViewModel() {
        return (DrivingSchoolViewModel) this.drivingSchoolViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<DrivingSchoolMainViewModel> getDrivingSchoolMainFactory() {
        MainViewModelFactory<DrivingSchoolMainViewModel> mainViewModelFactory = this.drivingSchoolMainFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("drivingSchoolMainFactory");
        return null;
    }

    public final void setDrivingSchoolMainFactory(@NotNull MainViewModelFactory<DrivingSchoolMainViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.drivingSchoolMainFactory = mainViewModelFactory;
    }

    public final DrivingSchoolMainViewModel getDrivingSchoolMainViewModel() {
        return (DrivingSchoolMainViewModel) this.drivingSchoolMainViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<DrivingSchoolClassInfoViewModel> getDrivingSchoolClassInfoFactory() {
        MainViewModelFactory<DrivingSchoolClassInfoViewModel> mainViewModelFactory = this.drivingSchoolClassInfoFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("drivingSchoolClassInfoFactory");
        return null;
    }

    public final void setDrivingSchoolClassInfoFactory(@NotNull MainViewModelFactory<DrivingSchoolClassInfoViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.drivingSchoolClassInfoFactory = mainViewModelFactory;
    }

    public final DrivingSchoolClassInfoViewModel getDrivingSchoolClassInfoViewModel() {
        return (DrivingSchoolClassInfoViewModel) this.drivingSchoolClassInfoViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<DrivingSchoolQuestsViewModel> getDrivingSchoolQuestionsFactory() {
        MainViewModelFactory<DrivingSchoolQuestsViewModel> mainViewModelFactory = this.drivingSchoolQuestionsFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("drivingSchoolQuestionsFactory");
        return null;
    }

    public final void setDrivingSchoolQuestionsFactory(@NotNull MainViewModelFactory<DrivingSchoolQuestsViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.drivingSchoolQuestionsFactory = mainViewModelFactory;
    }

    public final DrivingSchoolQuestsViewModel getDrivingSchoolQuestionsViewModel() {
        return (DrivingSchoolQuestsViewModel) this.drivingSchoolQuestionsViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
        Integer valueOf = json != null ? Integer.valueOf(json.optInt("t")) : null;
        Integer valueOf2 = json != null ? Integer.valueOf(json.optInt("s")) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            if (valueOf2 != null && valueOf2.intValue() == 0) {
                getDrivingSchoolMainViewModel().checkDriverLicenseType(false);
                return;
            } else {
                if (valueOf2 != null && valueOf2.intValue() == 1) {
                    replaceFragment(UIClassInfoLayout.class);
                    return;
                }
                return;
            }
        }
        if (valueOf != null && valueOf.intValue() == 2) {
            if (valueOf2 != null && valueOf2.intValue() == 0) {
                getDrivingSchoolClassInfoViewModel().checkStartTest(false);
                return;
            } else {
                if (valueOf2 != null && valueOf2.intValue() == 1) {
                    this.allQuestions = json.optInt(ModuleDialogKeys.PLAYERS_IN_QUEUE_KEY);
                    getDrivingSchoolQuestionsViewModel().setMaxValueOfQuestions(this.allQuestions);
                    replaceFragment(UIQuestions.class);
                    return;
                }
                return;
            }
        }
        if (valueOf != null && valueOf.intValue() == 3) {
            DrivingSchoolQuestsViewModel drivingSchoolQuestionsViewModel = getDrivingSchoolQuestionsViewModel();
            drivingSchoolQuestionsViewModel.setCurrentValueOfQuestions(json.optInt("a"));
            drivingSchoolQuestionsViewModel.setQuestionNumber(json.optInt("cq"));
            drivingSchoolQuestionsViewModel.showNewQuest(json.optInt("b"));
            return;
        }
        if (valueOf != null && valueOf.intValue() == 4) {
            int optInt = json.optInt("s");
            int optInt2 = json.optInt("cq");
            DialogEndTest dialogEndTest = this.resultDialog;
            if (dialogEndTest != null) {
                dialogEndTest.showResultDialog(optInt, optInt2, this.allQuestions);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        App.INSTANCE.appComponent().inject(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() {
        getDrivingSchoolViewModel();
        getDrivingSchoolClassInfoViewModel();
        DrivingSchoolQuestsViewModel drivingSchoolQuestionsViewModel = getDrivingSchoolQuestionsViewModel();
        String[] stringArray = requireActivity().getResources().getStringArray(R.array.driving_school_all_quests);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        drivingSchoolQuestionsViewModel.initAllQuests(stringArray);
        DrivingSchoolMainViewModel drivingSchoolMainViewModel = getDrivingSchoolMainViewModel();
        JSONObject jsonObj = getJsonObj();
        String[] stringArray2 = requireActivity().getResources().getStringArray(R.array.driver_license_type);
        Intrinsics.checkNotNullExpressionValue(stringArray2, "getStringArray(...)");
        drivingSchoolMainViewModel.initDriverLicenseType(jsonObj, stringArray2);
        initResultDialog();
        replaceFragment(UIMainLayout.class);
        View drivingSchoolClose = ((DrivingSchoolMainDialogBinding) getBinding()).drivingSchoolClose;
        Intrinsics.checkNotNullExpressionValue(drivingSchoolClose, "drivingSchoolClose");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, drivingSchoolClose, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$initViewsISAMPGUI$1
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
                GUIDrivingSchool.this.closeFragment();
            }
        }, 1, null);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public DrivingSchoolMainDialogBinding getViewBinding() {
        DrivingSchoolMainDialogBinding inflate = DrivingSchoolMainDialogBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    public final void initResultDialog() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        this.resultDialog = new DialogEndTest(requireActivity);
        initResultDialogClickListener();
    }

    public final void initResultDialogClickListener() {
        DialogEndTest dialogEndTest = this.resultDialog;
        if (dialogEndTest == null) {
            return;
        }
        dialogEndTest.setResultDialogClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$initResultDialogClickListener$1
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
                GUIDrivingSchool.this.sendToServerClickButton(5);
                GUIDrivingSchool.this.closeFragment();
            }
        });
    }

    public final void sendToServerClickButton(int type) {
        getDrivingSchoolViewModel().pressButton(type);
        if (type == 5) {
            this.ifNotInformingAboutDismiss = true;
            closeFragment();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void replaceFragment(Class<? extends Fragment> fragment) {
        getChildFragmentManager().beginTransaction().replace(((DrivingSchoolMainDialogBinding) getBinding()).drivingSchoolMainContainer.getId(), fragment, (Bundle) null).commit();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (!this.ifNotInformingAboutDismiss) {
            getDrivingSchoolViewModel().pressButton(0);
        }
        closePopupWindows();
        setNullableParameters();
        super.onDestroyView();
    }

    public final void closePopupWindows() {
        DialogEndTest dialogEndTest = this.resultDialog;
        if (dialogEndTest != null) {
            dialogEndTest.dismiss();
        }
    }

    private final void setNullableParameters() {
        this.resultDialog = null;
    }

    public GUIDrivingSchool() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$drivingSchoolViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return GUIDrivingSchool.this;
            }
        };
        Function0<ViewModelProvider.Factory> function02 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$drivingSchoolViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return GUIDrivingSchool.this.getDrivingSchoolFactory();
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$special$$inlined$viewModels$default$1
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
        this.drivingSchoolViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DrivingSchoolViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$special$$inlined$viewModels$default$3
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
        final Function0<ViewModelStoreOwner> function04 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$drivingSchoolMainViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return GUIDrivingSchool.this;
            }
        };
        Function0<ViewModelProvider.Factory> function05 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$drivingSchoolMainViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return GUIDrivingSchool.this.getDrivingSchoolMainFactory();
            }
        };
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$special$$inlined$viewModels$default$5
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
        this.drivingSchoolMainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DrivingSchoolMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$special$$inlined$viewModels$default$6
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$special$$inlined$viewModels$default$7
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
        }, function05);
        final Function0<ViewModelStoreOwner> function06 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$drivingSchoolClassInfoViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return GUIDrivingSchool.this;
            }
        };
        Function0<ViewModelProvider.Factory> function07 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$drivingSchoolClassInfoViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return GUIDrivingSchool.this.getDrivingSchoolClassInfoFactory();
            }
        };
        final Lazy lazy3 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$special$$inlined$viewModels$default$9
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
        this.drivingSchoolClassInfoViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DrivingSchoolClassInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$special$$inlined$viewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$special$$inlined$viewModels$default$11
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
        final Function0<ViewModelStoreOwner> function08 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$drivingSchoolQuestionsViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return GUIDrivingSchool.this;
            }
        };
        Function0<ViewModelProvider.Factory> function09 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$drivingSchoolQuestionsViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return GUIDrivingSchool.this.getDrivingSchoolQuestionsFactory();
            }
        };
        final Lazy lazy4 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$special$$inlined$viewModels$default$13
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
        this.drivingSchoolQuestionsViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DrivingSchoolQuestsViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$special$$inlined$viewModels$default$14
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$special$$inlined$viewModels$default$15
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
        }, function09);
    }
}
