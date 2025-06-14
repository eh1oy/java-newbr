package com.blackhub.bronline.game.gui.tuning;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.databinding.TuningDialogBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.core.JNILib;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.tuning.data.TuneGuiNodeObj;
import com.blackhub.bronline.game.gui.tuning.ui.DialogSubmenu;
import com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse;
import com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList;
import com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList;
import com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics;
import com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningMain;
import com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningRGBColor;
import com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningViewCar;
import com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningViewInfoParameters;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningCollapseViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningViewCarViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.apache.ivy.osgi.updatesite.xml.FeatureParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUITuning.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 ~2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001~B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010R\u001a\u00020S2\u000e\u0010T\u001a\n\u0012\u0006\b\u0001\u0012\u00020V0UH\u0002J\b\u0010W\u001a\u00020SH\u0002J\b\u0010X\u001a\u00020SH\u0002J\u001a\u0010Y\u001a\u0004\u0018\u00010Z2\u0006\u0010[\u001a\u00020\u00052\u0006\u0010\\\u001a\u00020>H\u0002J\u0012\u0010]\u001a\u00020S2\b\u0010^\u001a\u0004\u0018\u00010_H\u0002J\b\u0010`\u001a\u00020\u0005H\u0016J\b\u0010a\u001a\u00020\u0002H\u0016J\b\u0010b\u001a\u00020SH\u0002J\b\u0010c\u001a\u00020SH\u0002J\b\u0010d\u001a\u00020SH\u0002J\b\u0010e\u001a\u00020SH\u0002J\b\u0010f\u001a\u00020SH\u0002J\b\u0010g\u001a\u00020SH\u0002J\b\u0010h\u001a\u00020SH\u0016J\u0010\u0010i\u001a\u00020S2\u0006\u0010j\u001a\u00020\u0005H\u0002J\b\u0010k\u001a\u00020SH\u0016J\u0010\u0010l\u001a\u00020S2\u0006\u0010m\u001a\u00020nH\u0016J\b\u0010o\u001a\u00020SH\u0016J\u0010\u0010p\u001a\u00020S2\u0006\u0010q\u001a\u00020_H\u0016J\"\u0010r\u001a\u00020S2\u000e\u0010T\u001a\n\u0012\u0006\b\u0001\u0012\u00020V0U2\b\u0010s\u001a\u0004\u0018\u00010ZH\u0002J\u0010\u0010t\u001a\u00020S2\u0006\u0010u\u001a\u00020\u0005H\u0002J\u0010\u0010v\u001a\u00020S2\u0006\u0010w\u001a\u00020>H\u0002J\u0010\u0010x\u001a\u00020S2\u0006\u0010y\u001a\u00020>H\u0002J\b\u0010z\u001a\u00020SH\u0002J\b\u0010{\u001a\u00020SH\u0002J\u0010\u0010|\u001a\u00020S2\u0006\u0010H\u001a\u00020\u0005H\u0002J\b\u0010}\u001a\u00020SH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u001b\u0010\u0016\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\fR\u001b\u0010\u001f\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0011\u001a\u0004\b \u0010!R$\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\n\"\u0004\b&\u0010\fR\u001b\u0010'\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0011\u001a\u0004\b(\u0010)R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R$\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\n\"\u0004\b6\u0010\fR\u001b\u00107\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\u0011\u001a\u0004\b8\u00109R\u000e\u0010;\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020>X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\n\"\u0004\bC\u0010\fR\u001b\u0010D\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\u0011\u001a\u0004\bE\u0010FR\u000e\u0010H\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R$\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\n\"\u0004\bM\u0010\fR\u001b\u0010N\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010\u0011\u001a\u0004\bO\u0010P¨\u0006\u007f"}, d2 = {"Lcom/blackhub/bronline/game/gui/tuning/GUITuning;", "Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragment;", "Lcom/blackhub/bronline/databinding/TuningDialogBinding;", "()V", "carID", "", "collapseFactory", "Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningCollapseViewModel;", "getCollapseFactory", "()Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "setCollapseFactory", "(Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;)V", "collapseViewModel", "getCollapseViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningCollapseViewModel;", "collapseViewModel$delegate", "Lkotlin/Lazy;", "colorListFactory", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningColorListViewModel;", "getColorListFactory", "setColorListFactory", "colorListViewModel", "getColorListViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningColorListViewModel;", "colorListViewModel$delegate", "counterForViewModel", "detailsListFactory", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningDetailsListViewModel;", "getDetailsListFactory", "setDetailsListFactory", "detailsListViewModel", "getDetailsListViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningDetailsListViewModel;", "detailsListViewModel$delegate", "diagnosticFactory", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningDiagnosticViewModel;", "getDiagnosticFactory", "setDiagnosticFactory", "diagnosticViewModel", "getDiagnosticViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningDiagnosticViewModel;", "diagnosticViewModel$delegate", "dialogSubmenu", "Lcom/blackhub/bronline/game/gui/tuning/ui/DialogSubmenu;", "gosCost", "handler", "Landroid/os/Handler;", "isEmptySubmenu", "", "mActiveSelectorId", "mainActivityFactory", "Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "getMainActivityFactory", "setMainActivityFactory", "mainActivityViewModel", "getMainActivityViewModel", "()Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "mainActivityViewModel$delegate", "progressStatus", "screenType", "textPreView", "", "thisNameWindow", "tuningFactory", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningMainViewModel;", "getTuningFactory", "setTuningFactory", "tuningViewModel", "getTuningViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningMainViewModel;", "tuningViewModel$delegate", "typeLayout", "valueOfViewModel", "viewCarFactory", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningViewCarViewModel;", "getViewCarFactory", "setViewCarFactory", "viewCarViewModel", "getViewCarViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningViewCarViewModel;", "viewCarViewModel$delegate", "addFragment", "", FeatureParser.PluginHandler.FRAGMENT, "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "clearTuneItemStatus", "closeDialogs", "convertDataToBundle", "Landroid/os/Bundle;", "currentSelector", "currentTitle", "getDataFromJson", "jsonObject", "Lorg/json/JSONObject;", "getGuiId", "getViewBinding", "initDialogSubmenu", "initInterface", "initListeners", "initObjects", "initOnClickSubmenuItem", "initTuneItemsFromJson", "initViewsISAMPGUI", "listenerLayout", "idLayout", "newBackPress", "onAttach", "context", "Landroid/content/Context;", "onDestroyView", "onPacketIncoming", "json", "replaceFragment", "currentBundle", "setClickSubmenu", "typeList", "setMoneyInTitle", "valueOfMoney", "setNameCarInTitle", "carName", "setNullableParameters", "setObservers", "setTypeLayout", "startDiagnostic", "Companion", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGUITuning.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUITuning.kt\ncom/blackhub/bronline/game/gui/tuning/GUITuning\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,647:1\n172#2,9:648\n106#2,15:657\n106#2,15:672\n106#2,15:687\n106#2,15:702\n106#2,15:717\n106#2,15:732\n*S KotlinDebug\n*F\n+ 1 GUITuning.kt\ncom/blackhub/bronline/game/gui/tuning/GUITuning\n*L\n111#1:648,9\n116#1:657,15\n121#1:672,15\n126#1:687,15\n131#1:702,15\n136#1:717,15\n141#1:732,15\n*E\n"})
/* loaded from: classes3.dex */
public final class GUITuning extends BaseISAMPGUIFragment<TuningDialogBinding> {
    public static final int COLLAPSE = 4;
    public static final int COLORS_LIST = 1;
    public static final int DETAIL_LIST = 2;
    public static final int NEW_SUBMENU = 0;
    public int carID;

    @Inject
    public MainViewModelFactory<TuningCollapseViewModel> collapseFactory;

    /* renamed from: collapseViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy collapseViewModel;

    @Inject
    public MainViewModelFactory<TuningColorListViewModel> colorListFactory;

    /* renamed from: colorListViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy colorListViewModel;
    public int counterForViewModel;

    @Inject
    public MainViewModelFactory<TuningDetailsListViewModel> detailsListFactory;

    /* renamed from: detailsListViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy detailsListViewModel;

    @Inject
    public MainViewModelFactory<TuningDiagnosticViewModel> diagnosticFactory;

    /* renamed from: diagnosticViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy diagnosticViewModel;

    @Nullable
    public DialogSubmenu dialogSubmenu;
    public int gosCost;

    @Nullable
    public Handler handler;

    @Inject
    public MainViewModelFactory<JNIActivityViewModel> mainActivityFactory;

    /* renamed from: mainActivityViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainActivityViewModel;
    public int progressStatus;
    public int screenType;

    @Inject
    public MainViewModelFactory<TuningMainViewModel> tuningFactory;

    /* renamed from: tuningViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy tuningViewModel;
    public final int valueOfViewModel;

    @Inject
    public MainViewModelFactory<TuningViewCarViewModel> viewCarFactory;

    /* renamed from: viewCarViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewCarViewModel;
    public static final int $stable = 8;
    public int mActiveSelectorId = -1;

    @NotNull
    public String textPreView = "";

    @NotNull
    public String thisNameWindow = "";
    public int typeLayout = -1;
    public boolean isEmptySubmenu = true;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 28;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ TuningDialogBinding access$getBinding(GUITuning gUITuning) {
        return (TuningDialogBinding) gUITuning.getBinding();
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

    /* JADX INFO: Access modifiers changed from: private */
    public final JNIActivityViewModel getMainActivityViewModel() {
        return (JNIActivityViewModel) this.mainActivityViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<TuningMainViewModel> getTuningFactory() {
        MainViewModelFactory<TuningMainViewModel> mainViewModelFactory = this.tuningFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tuningFactory");
        return null;
    }

    public final void setTuningFactory(@NotNull MainViewModelFactory<TuningMainViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.tuningFactory = mainViewModelFactory;
    }

    public final TuningMainViewModel getTuningViewModel() {
        return (TuningMainViewModel) this.tuningViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<TuningViewCarViewModel> getViewCarFactory() {
        MainViewModelFactory<TuningViewCarViewModel> mainViewModelFactory = this.viewCarFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewCarFactory");
        return null;
    }

    public final void setViewCarFactory(@NotNull MainViewModelFactory<TuningViewCarViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.viewCarFactory = mainViewModelFactory;
    }

    public final TuningViewCarViewModel getViewCarViewModel() {
        return (TuningViewCarViewModel) this.viewCarViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<TuningCollapseViewModel> getCollapseFactory() {
        MainViewModelFactory<TuningCollapseViewModel> mainViewModelFactory = this.collapseFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("collapseFactory");
        return null;
    }

    public final void setCollapseFactory(@NotNull MainViewModelFactory<TuningCollapseViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.collapseFactory = mainViewModelFactory;
    }

    public final TuningCollapseViewModel getCollapseViewModel() {
        return (TuningCollapseViewModel) this.collapseViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<TuningDiagnosticViewModel> getDiagnosticFactory() {
        MainViewModelFactory<TuningDiagnosticViewModel> mainViewModelFactory = this.diagnosticFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("diagnosticFactory");
        return null;
    }

    public final void setDiagnosticFactory(@NotNull MainViewModelFactory<TuningDiagnosticViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.diagnosticFactory = mainViewModelFactory;
    }

    public final TuningDiagnosticViewModel getDiagnosticViewModel() {
        return (TuningDiagnosticViewModel) this.diagnosticViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<TuningDetailsListViewModel> getDetailsListFactory() {
        MainViewModelFactory<TuningDetailsListViewModel> mainViewModelFactory = this.detailsListFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("detailsListFactory");
        return null;
    }

    public final void setDetailsListFactory(@NotNull MainViewModelFactory<TuningDetailsListViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.detailsListFactory = mainViewModelFactory;
    }

    public final TuningDetailsListViewModel getDetailsListViewModel() {
        return (TuningDetailsListViewModel) this.detailsListViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<TuningColorListViewModel> getColorListFactory() {
        MainViewModelFactory<TuningColorListViewModel> mainViewModelFactory = this.colorListFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("colorListFactory");
        return null;
    }

    public final void setColorListFactory(@NotNull MainViewModelFactory<TuningColorListViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.colorListFactory = mainViewModelFactory;
    }

    public final TuningColorListViewModel getColorListViewModel() {
        return (TuningColorListViewModel) this.colorListViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        int optInt = json.optInt("t");
        int optInt2 = json.optInt("s");
        if (optInt == 1 || optInt == 2) {
            if (optInt2 != 1) {
                return;
            }
            getTuningViewModel().updateInterfaceAfterBuyColor(json);
        }
        if (optInt == 3) {
            if (optInt2 != 1) {
                return;
            }
            getTuningViewModel().updateInitStatusAfterBuy(json);
            getDetailsListViewModel().updateVinylsAfterEstablished(json);
            return;
        }
        if (optInt == 20) {
            int i = this.typeLayout;
            if (i == 1 || i == 2) {
                getColorListViewModel().getNewColorItems(json, this.mActiveSelectorId);
                return;
            } else {
                getColorListViewModel().initStartColorItems(json);
                return;
            }
        }
        if (optInt == 26) {
            TuningDetailsListViewModel detailsListViewModel = getDetailsListViewModel();
            String optString = json.optString("v");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            detailsListViewModel.setStartVinyl(optString);
            return;
        }
        if (optInt == 28) {
            getCollapseViewModel().initCollapse(json);
            return;
        }
        switch (optInt) {
            case 5:
                if (optInt2 == 1) {
                    int i2 = this.typeLayout;
                    if (i2 != 1 && i2 != 2) {
                        if (i2 == 3) {
                            getDetailsListViewModel().resetDetail(json);
                            getTuningViewModel().saveCarStatusAfterReset();
                            break;
                        } else if (i2 == 4) {
                            getDetailsListViewModel().resetVinyl();
                            getTuningViewModel().saveCarStatusAfterReset();
                            break;
                        } else if (i2 == 5) {
                            getTuningViewModel().saveCarStatusAfterReset();
                            getCollapseViewModel().getCollapseAfterReset();
                            break;
                        }
                    } else {
                        getTuningViewModel().updateInterfaceAfterResetColor();
                        break;
                    }
                }
                break;
            case 6:
                if (optInt2 == 1) {
                    startDiagnostic();
                    getDiagnosticViewModel().updateDetailStatesAfterDiagnostic(json);
                    getTuningViewModel().setPlayerMoney(json);
                    break;
                }
                break;
            case 7:
                if (optInt2 == 1) {
                    getTuningViewModel().updateInitStatusAfterBuy(json);
                    getDetailsListViewModel().updateItemsAfterPurchaseOrSet(json, 2);
                    break;
                }
                break;
            case 8:
                if (optInt2 == 1) {
                    getTuningViewModel().setPlayerMoney(json);
                    getDiagnosticViewModel().repairDetail(json.optInt("p"));
                    break;
                }
                break;
            case 9:
                if (optInt2 == 1) {
                    getDiagnosticViewModel().setStatusOfApplyRepair(true);
                    break;
                }
                break;
            case 10:
                if (optInt2 == 1) {
                    getDetailsListViewModel().updateItemsAfterPurchaseOrSet(json, 2);
                    getTuningViewModel().saveCarStatus();
                    break;
                }
                break;
            case 11:
                if (optInt2 == 1) {
                    getTuningViewModel().setPlayerMoney(json);
                    getDetailsListViewModel().setNewPresent(json);
                    break;
                }
                break;
            case 12:
                if (optInt2 == 1) {
                    getTuningViewModel().updateInitStatusAfterBuy(json);
                    getCollapseViewModel().getCollapse();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void startDiagnostic() {
        ((TuningDialogBinding) getBinding()).processDiagnostic.setVisibility(0);
        this.handler = new Handler(Looper.getMainLooper());
        new Thread(new Runnable() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                GUITuning.startDiagnostic$lambda$2(GUITuning.this);
            }
        }).start();
    }

    public static final void startDiagnostic$lambda$2(final GUITuning this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        while (true) {
            int i = this$0.progressStatus;
            if (i >= 100) {
                break;
            }
            this$0.progressStatus = i + 1;
            SystemClock.sleep(20L);
            Handler handler = this$0.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        GUITuning.startDiagnostic$lambda$2$lambda$0(GUITuning.this);
                    }
                });
            }
        }
        Handler handler2 = this$0.handler;
        if (handler2 != null) {
            handler2.post(new Runnable() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    GUITuning.startDiagnostic$lambda$2$lambda$1(GUITuning.this);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void startDiagnostic$lambda$2$lambda$0(GUITuning this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((TuningDialogBinding) this$0.getBinding()).tuningProgressBar.setProgress(this$0.progressStatus);
        this$0.textPreView = this$0.progressStatus + "%";
        ((TuningDialogBinding) this$0.getBinding()).progressValuePercent.setText(this$0.textPreView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void startDiagnostic$lambda$2$lambda$1(GUITuning this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SystemClock.sleep(200L);
        ((TuningDialogBinding) this$0.getBinding()).processDiagnostic.setVisibility(4);
        this$0.progressStatus = 0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() {
        try {
            getDataFromJson(getJsonObj());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        initObjects();
        setObservers();
        initTuneItemsFromJson();
        initListeners();
        TuningMainViewModel tuningViewModel = getTuningViewModel();
        tuningViewModel.saveCarStatus();
        tuningViewModel.getInitObjects();
        JNILib.toggleDrawing2dStuff(true);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public TuningDialogBinding getViewBinding() {
        TuningDialogBinding inflate = TuningDialogBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    private final void getDataFromJson(JSONObject jsonObject) {
        if (jsonObject != null) {
            this.screenType = jsonObject.optInt("w");
            this.carID = jsonObject.optInt("s");
            this.gosCost = jsonObject.optInt("j");
            getTuningViewModel().getInitData(jsonObject);
            getDetailsListViewModel().setDetailsWithIdAndStatus(jsonObject.optJSONArray("k"));
            getDetailsListViewModel().setGosCost(jsonObject);
            getDiagnosticViewModel().initDiagnostic(jsonObject);
            getCollapseViewModel().setGosCost(jsonObject);
            getColorListViewModel().setGosCost(jsonObject);
        }
    }

    private final void initObjects() {
        getTuningViewModel();
        getViewCarViewModel();
        getCollapseViewModel();
        getDiagnosticViewModel();
        getDetailsListViewModel();
        getColorListViewModel();
        initDialogSubmenu();
    }

    public final void initDialogSubmenu() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        this.dialogSubmenu = new DialogSubmenu(requireActivity, getTuningViewModel());
        initOnClickSubmenuItem();
    }

    public final void initOnClickSubmenuItem() {
        DialogSubmenu dialogSubmenu = this.dialogSubmenu;
        if (dialogSubmenu == null) {
            return;
        }
        dialogSubmenu.setSubmenuClickListener(new Function3<TuneGuiNodeObj, Integer, View, Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$initOnClickSubmenuItem$1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(TuneGuiNodeObj tuneGuiNodeObj, Integer num, View view) {
                invoke(tuneGuiNodeObj, num.intValue(), view);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final TuneGuiNodeObj submenuTuning, int i, @Nullable View view) {
                Intrinsics.checkNotNullParameter(submenuTuning, "submenuTuning");
                if (view != null) {
                    final GUITuning gUITuning = GUITuning.this;
                    BaseFragment.startAnimAndDelay$default(gUITuning, view, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$initOnClickSubmenuItem$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            TuningMainViewModel tuningViewModel;
                            int i2;
                            GUITuning.this.mActiveSelectorId = submenuTuning.getSelectorId();
                            GUITuning.this.thisNameWindow = submenuTuning.getName();
                            tuningViewModel = GUITuning.this.getTuningViewModel();
                            i2 = GUITuning.this.mActiveSelectorId;
                            tuningViewModel.sendToClientCurrentSelector(i2);
                            GUITuning.this.setClickSubmenu(submenuTuning.getOpensType());
                        }
                    }, 1, null);
                }
            }
        });
    }

    public final void setClickSubmenu(int typeList) {
        if (typeList == 1) {
            getTuningViewModel().setCurrentLayout(5);
        } else if (typeList == 2) {
            getTuningViewModel().setCurrentLayout(3);
        } else if (typeList == 4) {
            getTuningViewModel().setCurrentLayout(9);
        }
        DialogSubmenu dialogSubmenu = this.dialogSubmenu;
        if (dialogSubmenu != null) {
            dialogSubmenu.dismiss();
        }
    }

    private final void setObservers() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUITuning$setObservers$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUITuning$setObservers$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUITuning$setObservers$3(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUITuning$setObservers$4(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUITuning$setObservers$5(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUITuning$setObservers$6(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUITuning$setObservers$7(this, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setMoneyInTitle(String valueOfMoney) {
        ((TuningDialogBinding) getBinding()).valuePlayersMoney.setText(valueOfMoney);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setNameCarInTitle(String carName) {
        ((TuningDialogBinding) getBinding()).titleThisCar.setText(carName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void listenerLayout(int idLayout) {
        if (idLayout == 0) {
            this.isEmptySubmenu = false;
            replaceFragment(UILayoutTuningMain.class, null);
            getTuningViewModel().setVisibleMainRoot(true);
            getTuningViewModel().updateHideBackToMainMenuButton(true);
            return;
        }
        if (idLayout == 1) {
            this.isEmptySubmenu = false;
            addFragment(UILayoutTuningViewCar.class);
            getTuningViewModel().startViewCar();
            return;
        }
        if (idLayout == 2) {
            if (this.isEmptySubmenu) {
                getTuningViewModel().setCurrentLayout(0);
                return;
            }
            DialogSubmenu dialogSubmenu = this.dialogSubmenu;
            if (dialogSubmenu != null) {
                dialogSubmenu.backPress();
            }
            replaceFragment(UILayoutTuningMain.class, null);
            return;
        }
        if (idLayout == 3) {
            this.isEmptySubmenu = false;
            setTypeLayout(3);
            getDetailsListViewModel().setCurrentSelector(this.mActiveSelectorId);
            replaceFragment(UILayoutTuningDetailsList.class, convertDataToBundle(this.mActiveSelectorId, this.thisNameWindow));
            getTuningViewModel().updateHideBackToMainMenuButton(false);
            return;
        }
        if (idLayout == 5) {
            this.isEmptySubmenu = false;
            replaceFragment(UILayoutTuningColorsList.class, convertDataToBundle(this.mActiveSelectorId, this.thisNameWindow));
            setTypeLayout(2);
            getTuningViewModel().updateHideBackToMainMenuButton(false);
            return;
        }
        if (idLayout != 12) {
            switch (idLayout) {
                case 8:
                    this.isEmptySubmenu = false;
                    replaceFragment(UILayoutTuningRGBColor.class, convertDataToBundle(this.mActiveSelectorId, this.thisNameWindow));
                    setTypeLayout(1);
                    getTuningViewModel().updateHideBackToMainMenuButton(false);
                    break;
                case 9:
                    this.isEmptySubmenu = false;
                    replaceFragment(UILayoutTuningCollapse.class, convertDataToBundle(this.mActiveSelectorId, this.thisNameWindow));
                    setTypeLayout(5);
                    getTuningViewModel().updateHideBackToMainMenuButton(false);
                    break;
                case 10:
                    this.isEmptySubmenu = false;
                    replaceFragment(UILayoutTuningViewInfoParameters.class, convertDataToBundle(this.mActiveSelectorId, this.thisNameWindow));
                    getTuningViewModel().updateHideBackToMainMenuButton(false);
                    break;
            }
            return;
        }
        this.isEmptySubmenu = true;
        replaceFragment(UILayoutTuningDiagnostics.class, convertDataToBundle(this.mActiveSelectorId, this.thisNameWindow));
        getTuningViewModel().updateHideBackToMainMenuButton(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void replaceFragment(Class<? extends Fragment> fragment, Bundle currentBundle) {
        getChildFragmentManager().beginTransaction().replace(((TuningDialogBinding) getBinding()).tuningMyContainer.getId(), fragment, currentBundle).commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void addFragment(Class<? extends Fragment> fragment) {
        getChildFragmentManager().beginTransaction().add(((TuningDialogBinding) getBinding()).tuningMyContainer.getId(), fragment, (Bundle) null).commit();
    }

    public final void setTypeLayout(int typeLayout) {
        this.typeLayout = typeLayout;
    }

    public final Bundle convertDataToBundle(int currentSelector, String currentTitle) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TuningConstants.SELECTOR_JSON, currentSelector);
        jSONObject.put(TuningConstants.CAR_ID_JSON, this.carID);
        jSONObject.put(TuningConstants.TITLE_JSON, currentTitle);
        return Useful.INSTANCE.jsonStringToBundle(jSONObject, TuningConstants.JSON_OBJECT);
    }

    public final void initTuneItemsFromJson() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUITuning$initTuneItemsFromJson$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initInterface() {
        int i = this.counterForViewModel + 1;
        this.counterForViewModel = i;
        if (i == this.valueOfViewModel) {
            getTuningViewModel().setCurrentLayout(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initListeners() {
        AppCompatButton headerExit = ((TuningDialogBinding) getBinding()).headerExit;
        Intrinsics.checkNotNullExpressionValue(headerExit, "headerExit");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, headerExit, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$initListeners$1
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
                GUITuning.this.closeFragment();
            }
        }, 1, null);
        AppCompatButton headerBackToMainMenu = ((TuningDialogBinding) getBinding()).headerBackToMainMenu;
        Intrinsics.checkNotNullExpressionValue(headerBackToMainMenu, "headerBackToMainMenu");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, headerBackToMainMenu, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$initListeners$2
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
                TuningMainViewModel tuningViewModel;
                tuningViewModel = GUITuning.this.getTuningViewModel();
                tuningViewModel.clickBackToMainMenu();
            }
        }, 1, null);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        clearTuneItemStatus();
        getTuningViewModel().closeInterface();
        JNILib.toggleDrawing2dStuff(false);
        closeDialogs();
        setNullableParameters();
        super.onDestroyView();
    }

    public final void clearTuneItemStatus() {
        getMainActivityViewModel().clearTuneItemStatus();
    }

    public final void closeDialogs() {
        DialogSubmenu dialogSubmenu = this.dialogSubmenu;
        if (dialogSubmenu != null) {
            dialogSubmenu.dismiss();
        }
    }

    private final void setNullableParameters() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        TuningConstants.INSTANCE.setCurrentActiveScreen(null);
        this.dialogSubmenu = null;
        this.handler = null;
    }

    public GUITuning() {
        final Function0 function0 = null;
        this.mainActivityViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(JNIActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$mainActivityViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity requireActivity = GUITuning.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                return (ViewModelProvider.Factory) new ViewModelProvider(requireActivity, GUITuning.this.getMainActivityFactory()).get(JNIActivityViewModel.class);
            }
        });
        Function0<ViewModelProvider.Factory> function02 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$tuningViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                GUITuning gUITuning = GUITuning.this;
                return (ViewModelProvider.Factory) new ViewModelProvider(gUITuning, gUITuning.getTuningFactory()).get(TuningMainViewModel.class);
            }
        };
        final Function0<Fragment> function03 = new Function0<Fragment>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$special$$inlined$viewModels$default$2
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
        this.tuningViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$special$$inlined$viewModels$default$4
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
        Function0<ViewModelProvider.Factory> function04 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$viewCarViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                GUITuning gUITuning = GUITuning.this;
                return (ViewModelProvider.Factory) new ViewModelProvider(gUITuning, gUITuning.getViewCarFactory()).get(TuningViewCarViewModel.class);
            }
        };
        final Function0<Fragment> function05 = new Function0<Fragment>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$special$$inlined$viewModels$default$6
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
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$special$$inlined$viewModels$default$7
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
        this.viewCarViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningViewCarViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$special$$inlined$viewModels$default$8
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$special$$inlined$viewModels$default$9
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
        Function0<ViewModelProvider.Factory> function06 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$collapseViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                GUITuning gUITuning = GUITuning.this;
                return (ViewModelProvider.Factory) new ViewModelProvider(gUITuning, gUITuning.getCollapseFactory()).get(TuningCollapseViewModel.class);
            }
        };
        final Function0<Fragment> function07 = new Function0<Fragment>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$special$$inlined$viewModels$default$11
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
        final Lazy lazy3 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$special$$inlined$viewModels$default$12
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
        this.collapseViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningCollapseViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$special$$inlined$viewModels$default$13
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$special$$inlined$viewModels$default$14
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
        }, function06);
        Function0<ViewModelProvider.Factory> function08 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$diagnosticViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                GUITuning gUITuning = GUITuning.this;
                return (ViewModelProvider.Factory) new ViewModelProvider(gUITuning, gUITuning.getDiagnosticFactory()).get(TuningDiagnosticViewModel.class);
            }
        };
        final Function0<Fragment> function09 = new Function0<Fragment>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$special$$inlined$viewModels$default$16
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
        final Lazy lazy4 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$special$$inlined$viewModels$default$17
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
        this.diagnosticViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningDiagnosticViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$special$$inlined$viewModels$default$18
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$special$$inlined$viewModels$default$19
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
        Function0<ViewModelProvider.Factory> function010 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$detailsListViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                GUITuning gUITuning = GUITuning.this;
                return (ViewModelProvider.Factory) new ViewModelProvider(gUITuning, gUITuning.getDetailsListFactory()).get(TuningDetailsListViewModel.class);
            }
        };
        final Function0<Fragment> function011 = new Function0<Fragment>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$special$$inlined$viewModels$default$21
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
        final Lazy lazy5 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$special$$inlined$viewModels$default$22
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
        this.detailsListViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningDetailsListViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$special$$inlined$viewModels$default$23
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$special$$inlined$viewModels$default$24
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
        }, function010);
        Function0<ViewModelProvider.Factory> function012 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$colorListViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                GUITuning gUITuning = GUITuning.this;
                return (ViewModelProvider.Factory) new ViewModelProvider(gUITuning, gUITuning.getColorListFactory()).get(TuningColorListViewModel.class);
            }
        };
        final Function0<Fragment> function013 = new Function0<Fragment>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$special$$inlined$viewModels$default$26
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
        final Lazy lazy6 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$special$$inlined$viewModels$default$27
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
        this.colorListViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningColorListViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$special$$inlined$viewModels$default$28
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$special$$inlined$viewModels$default$29
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
        }, function012);
        this.valueOfViewModel = 3;
    }
}
