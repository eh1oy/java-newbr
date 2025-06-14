package com.blackhub.bronline.game.gui.radialmenuforcar;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.RadialMenuDialogBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.core.JNILib;
import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.gui.radialmenuforcar.viewmodel.RadialMenuViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import java.util.Iterator;
import java.util.List;
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
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUIRadialMenuForCar.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 S2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001SB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0005H\u0002J\u0010\u0010(\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0005H\u0002J\u0010\u0010)\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0005H\u0002J\u0010\u0010*\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0005H\u0002J\u0010\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020\u0002H\u0016J\u0010\u00101\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0005H\u0002J\u0010\u00102\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0005H\u0002J\u0010\u00103\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0005H\u0002J\b\u00104\u001a\u00020&H\u0002J\b\u00105\u001a\u00020&H\u0016J\b\u00106\u001a\u00020\u0005H\u0016J\u0010\u00107\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0005H\u0002J\u0010\u00108\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0005H\u0002J\b\u00109\u001a\u00020&H\u0002J\u0010\u0010:\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0005H\u0002J\b\u0010;\u001a\u00020&H\u0016J\u0010\u0010<\u001a\u00020&2\u0006\u0010=\u001a\u00020>H\u0016J\b\u0010?\u001a\u00020&H\u0016J\u0010\u0010@\u001a\u00020&2\u0006\u0010A\u001a\u00020-H\u0016J\u0010\u0010B\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0005H\u0002J\u0010\u0010C\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0005H\u0002J\u0010\u0010D\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0005H\u0002J\u0010\u0010E\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0005H\u0002J\u0018\u0010F\u001a\u00020&2\u0006\u0010G\u001a\u00020/2\u0006\u0010H\u001a\u00020IH\u0002J\u0010\u0010J\u001a\u00020&2\u0006\u0010K\u001a\u00020/H\u0002J\u0010\u0010L\u001a\u00020&2\u0006\u0010K\u001a\u00020/H\u0002J\u0010\u0010M\u001a\u00020&2\u0006\u0010K\u001a\u00020/H\u0002J\u0010\u0010N\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0005H\u0002J\u0010\u0010O\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0005H\u0002J\u0010\u0010P\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0005H\u0002J\b\u0010Q\u001a\u00020&H\u0002J\b\u0010R\u001a\u00020&H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006T"}, d2 = {"Lcom/blackhub/bronline/game/gui/radialmenuforcar/GUIRadialMenuForCar;", "Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragment;", "Lcom/blackhub/bronline/databinding/RadialMenuDialogBinding;", "()V", "isClickComfortPlus", "", "isClickDoor", "isClickDrift", "isClickEngine", "isClickHeadlights", "isClickHighLight", "isClickHydraulics", "isClickKey", "isClickLaunchControl", "isClickLight", "isClickNeon", "isClickParking", "isClickPnevmo1", "isClickPnevmo2", "isClickPnevmo3", "isClickSport", "isClickSportPlus", "isClickStroboscope", "isClickSuspension", "isClickTurbo", "radialMenuFactory", "Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "Lcom/blackhub/bronline/game/gui/radialmenuforcar/viewmodel/RadialMenuViewModel;", "getRadialMenuFactory", "()Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "setRadialMenuFactory", "(Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;)V", "radialMenuViewModel", "getRadialMenuViewModel", "()Lcom/blackhub/bronline/game/gui/radialmenuforcar/viewmodel/RadialMenuViewModel;", "radialMenuViewModel$delegate", "Lkotlin/Lazy;", "comfortPlusSetClickIsNowNotClickable", "", "value", "doorSetClickIsNowNotClickable", "driftSetClickIsNowNotClickable", "engineSetClickIsNowNotClickable", "getData", "jsonObject", "Lorg/json/JSONObject;", "getGuiId", "", "getViewBinding", "headlightsSetClickIsNowNotClickable", "highLightSetClickIsNowNotClickable", "hydraulicsSetClickIsNowNotClickable", "initClickListener", "initViewsISAMPGUI", "isShowingGui", "keySetClickIsNowNotClickable", "launchSetClickIsNowNotClickable", "lightSetClickableIsClickableInSubmenu", "neonSetClickIsNowNotClickable", "newBackPress", "onAttach", "context", "Landroid/content/Context;", "onDestroyView", "onPacketIncoming", "json", "parkingSetClickIsNowNotClickable", "pnevmo1SetClickIsNowNotClickable", "pnevmo2SetClickIsNowNotClickable", "pnevmo3SetClickIsNowNotClickable", "setDrawables", "resourceId", "currentIV", "Landroid/widget/ImageView;", "setVisibilityForLight", "valueVisible", "setVisibilityForSuspension", "setVisibilityForTurbo", "sportPlusSetClickIsNowNotClickable", "sportSetClickIsNowNotClickable", "stroboscopeSetClickIsNowNotClickable", "suspensionSetClickableIsClickableInSubmenu", "turboSetClickableIsClickableInSubmenu", "Companion", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGUIRadialMenuForCar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUIRadialMenuForCar.kt\ncom/blackhub/bronline/game/gui/radialmenuforcar/GUIRadialMenuForCar\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,565:1\n106#2,15:566\n1#3:581\n*S KotlinDebug\n*F\n+ 1 GUIRadialMenuForCar.kt\ncom/blackhub/bronline/game/gui/radialmenuforcar/GUIRadialMenuForCar\n*L\n74#1:566,15\n*E\n"})
/* loaded from: classes3.dex */
public final class GUIRadialMenuForCar extends BaseISAMPGUIFragment<RadialMenuDialogBinding> {
    public static final int COMFORT_PLUS = 9;
    public static final int DISMISS_WINDOW = 0;
    public static final int DOORS = 3;
    public static final int DRIFT = 8;
    public static final int ENGINE = 6;
    public static final int HEADLIGHT = 14;
    public static final int HIGH_LIGHT = 13;
    public static final int HYDRAULIC = 19;
    public static final int KEY = 2;
    public static final int LAUNCH_CONTROL = 5;
    public static final int NEON = 12;
    public static final int PARKING = 1;
    public static final int PNEWMO_1 = 16;
    public static final int PNEWMO_2 = 17;
    public static final int PNEWMO_3 = 18;
    public static final int SPORT = 10;
    public static final int SPORT_PLUS = 11;
    public static final int STROBOSCOPE = 15;
    public static final int SUSPENSION = 4;
    public static final int TURBO = 7;
    public static final int TYPE_BOAT = 4;
    public static final int TYPE_HELI = 3;
    public static final int TYPE_PLANE = 5;
    public static final int TYPE_TRAILER = 8;
    public boolean isClickComfortPlus;
    public boolean isClickDoor;
    public boolean isClickDrift;
    public boolean isClickEngine;
    public boolean isClickHeadlights;
    public boolean isClickHighLight;
    public boolean isClickHydraulics;
    public boolean isClickKey;
    public boolean isClickLaunchControl;
    public boolean isClickLight;
    public boolean isClickNeon;
    public boolean isClickParking;
    public boolean isClickPnevmo1;
    public boolean isClickPnevmo2;
    public boolean isClickPnevmo3;
    public boolean isClickSport;
    public boolean isClickSportPlus;
    public boolean isClickStroboscope;
    public boolean isClickSuspension;
    public boolean isClickTurbo;

    @Inject
    public MainViewModelFactory<RadialMenuViewModel> radialMenuFactory;

    /* renamed from: radialMenuViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy radialMenuViewModel;
    public static final int $stable = 8;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 27;
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment, com.blackhub.bronline.game.ISAMPGUI
    public boolean isShowingGui() {
        return true;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    @NotNull
    public final MainViewModelFactory<RadialMenuViewModel> getRadialMenuFactory() {
        MainViewModelFactory<RadialMenuViewModel> mainViewModelFactory = this.radialMenuFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("radialMenuFactory");
        return null;
    }

    public final void setRadialMenuFactory(@NotNull MainViewModelFactory<RadialMenuViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.radialMenuFactory = mainViewModelFactory;
    }

    public final RadialMenuViewModel getRadialMenuViewModel() {
        return (RadialMenuViewModel) this.radialMenuViewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        boolean z = json.optInt("s") != 0;
        switch (json.optInt("t")) {
            case 1:
                parkingSetClickIsNowNotClickable(z);
                break;
            case 2:
                keySetClickIsNowNotClickable(z);
                break;
            case 3:
                doorSetClickIsNowNotClickable(z);
                break;
            case 5:
                launchSetClickIsNowNotClickable(z);
                break;
            case 6:
                engineSetClickIsNowNotClickable(z);
                break;
            case 8:
                driftSetClickIsNowNotClickable(z);
                turboSetClickableIsClickableInSubmenu();
                break;
            case 9:
                comfortPlusSetClickIsNowNotClickable(z);
                turboSetClickableIsClickableInSubmenu();
                break;
            case 10:
                sportSetClickIsNowNotClickable(z);
                turboSetClickableIsClickableInSubmenu();
                break;
            case 11:
                sportPlusSetClickIsNowNotClickable(z);
                turboSetClickableIsClickableInSubmenu();
                break;
            case 12:
                neonSetClickIsNowNotClickable(z);
                lightSetClickableIsClickableInSubmenu();
                break;
            case 13:
                highLightSetClickIsNowNotClickable(z);
                lightSetClickableIsClickableInSubmenu();
                break;
            case 14:
                headlightsSetClickIsNowNotClickable(z);
                lightSetClickableIsClickableInSubmenu();
                break;
            case 15:
                stroboscopeSetClickIsNowNotClickable(z);
                lightSetClickableIsClickableInSubmenu();
                break;
            case 16:
                pnevmo1SetClickIsNowNotClickable(z);
                suspensionSetClickableIsClickableInSubmenu();
                break;
            case 17:
                pnevmo2SetClickIsNowNotClickable(z);
                suspensionSetClickableIsClickableInSubmenu();
                break;
            case 18:
                pnevmo3SetClickIsNowNotClickable(z);
                suspensionSetClickableIsClickableInSubmenu();
                break;
            case 19:
                hydraulicsSetClickIsNowNotClickable(z);
                suspensionSetClickableIsClickableInSubmenu();
                break;
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() {
        JSONObject jsonObj = getJsonObj();
        if (jsonObj != null) {
            getData(jsonObj);
        }
        initClickListener();
        setVisibilityForTurbo(8);
        setVisibilityForLight(8);
        setVisibilityForSuspension(8);
        JNILib.toggleDrawing2dStuff(true);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public RadialMenuDialogBinding getViewBinding() {
        RadialMenuDialogBinding inflate = RadialMenuDialogBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    public final void getData(JSONObject jsonObject) {
        JSONArray optJSONArray = jsonObject.optJSONArray("s");
        List<Integer> mutableIntList = optJSONArray != null ? JsonArrayExtensionKt.toMutableIntList(optJSONArray) : null;
        if (mutableIntList != null) {
            Iterator<Integer> it = mutableIntList.iterator();
            while (it.hasNext()) {
                switch (it.next().intValue()) {
                    case 1:
                        parkingSetClickIsNowNotClickable(true);
                        break;
                    case 2:
                        keySetClickIsNowNotClickable(true);
                        break;
                    case 3:
                        doorSetClickIsNowNotClickable(true);
                        break;
                    case 5:
                        launchSetClickIsNowNotClickable(true);
                        break;
                    case 6:
                        engineSetClickIsNowNotClickable(true);
                        break;
                    case 8:
                        driftSetClickIsNowNotClickable(true);
                        turboSetClickableIsClickableInSubmenu();
                        break;
                    case 9:
                        comfortPlusSetClickIsNowNotClickable(true);
                        turboSetClickableIsClickableInSubmenu();
                        break;
                    case 10:
                        sportSetClickIsNowNotClickable(true);
                        turboSetClickableIsClickableInSubmenu();
                        break;
                    case 11:
                        sportPlusSetClickIsNowNotClickable(true);
                        turboSetClickableIsClickableInSubmenu();
                        break;
                    case 12:
                        neonSetClickIsNowNotClickable(true);
                        lightSetClickableIsClickableInSubmenu();
                        break;
                    case 13:
                        highLightSetClickIsNowNotClickable(true);
                        lightSetClickableIsClickableInSubmenu();
                        break;
                    case 14:
                        headlightsSetClickIsNowNotClickable(true);
                        lightSetClickableIsClickableInSubmenu();
                        break;
                    case 15:
                        stroboscopeSetClickIsNowNotClickable(true);
                        lightSetClickableIsClickableInSubmenu();
                        break;
                    case 16:
                        pnevmo1SetClickIsNowNotClickable(true);
                        suspensionSetClickableIsClickableInSubmenu();
                        break;
                    case 17:
                        pnevmo2SetClickIsNowNotClickable(true);
                        suspensionSetClickableIsClickableInSubmenu();
                        break;
                    case 18:
                        pnevmo3SetClickIsNowNotClickable(true);
                        suspensionSetClickableIsClickableInSubmenu();
                        break;
                    case 19:
                        hydraulicsSetClickIsNowNotClickable(true);
                        suspensionSetClickableIsClickableInSubmenu();
                        break;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void parkingSetClickIsNowNotClickable(boolean value) {
        this.isClickParking = value;
        int i = value ? R.drawable.img_radial_parking_checked : R.drawable.img_radial_parking_not_checked;
        ImageView buttonParking = ((RadialMenuDialogBinding) getBinding()).buttonParking;
        Intrinsics.checkNotNullExpressionValue(buttonParking, "buttonParking");
        setDrawables(i, buttonParking);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void keySetClickIsNowNotClickable(boolean value) {
        this.isClickKey = value;
        int i = value ? R.drawable.img_radial_key_checked : R.drawable.img_radial_key_not_checked;
        ImageView buttonKey = ((RadialMenuDialogBinding) getBinding()).buttonKey;
        Intrinsics.checkNotNullExpressionValue(buttonKey, "buttonKey");
        setDrawables(i, buttonKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void doorSetClickIsNowNotClickable(boolean value) {
        this.isClickDoor = value;
        int i = value ? R.drawable.img_radial_door_checked : R.drawable.img_radial_door_not_checked;
        ImageView buttonDoor = ((RadialMenuDialogBinding) getBinding()).buttonDoor;
        Intrinsics.checkNotNullExpressionValue(buttonDoor, "buttonDoor");
        setDrawables(i, buttonDoor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void launchSetClickIsNowNotClickable(boolean value) {
        this.isClickLaunchControl = value;
        int i = value ? R.drawable.img_radial_control_checked : R.drawable.img_radial_control_not_checked;
        ImageView buttonLaunchControl = ((RadialMenuDialogBinding) getBinding()).buttonLaunchControl;
        Intrinsics.checkNotNullExpressionValue(buttonLaunchControl, "buttonLaunchControl");
        setDrawables(i, buttonLaunchControl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void engineSetClickIsNowNotClickable(boolean value) {
        this.isClickEngine = value;
        int i = value ? R.drawable.img_radial_engine_checked : R.drawable.img_radial_engine_not_checked;
        ImageView buttonEngine = ((RadialMenuDialogBinding) getBinding()).buttonEngine;
        Intrinsics.checkNotNullExpressionValue(buttonEngine, "buttonEngine");
        setDrawables(i, buttonEngine);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void driftSetClickIsNowNotClickable(boolean value) {
        this.isClickDrift = value;
        int i = value ? R.drawable.img_radial_drift_checked : R.drawable.img_radial_drift_not_checked;
        ImageView buttonDrift = ((RadialMenuDialogBinding) getBinding()).buttonDrift;
        Intrinsics.checkNotNullExpressionValue(buttonDrift, "buttonDrift");
        setDrawables(i, buttonDrift);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void comfortPlusSetClickIsNowNotClickable(boolean value) {
        this.isClickComfortPlus = value;
        int i = value ? R.drawable.img_radial_comfort_plus_checked : R.drawable.img_radial_comfort_plus_not_checked;
        ImageView buttonComfortPlus = ((RadialMenuDialogBinding) getBinding()).buttonComfortPlus;
        Intrinsics.checkNotNullExpressionValue(buttonComfortPlus, "buttonComfortPlus");
        setDrawables(i, buttonComfortPlus);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void sportSetClickIsNowNotClickable(boolean value) {
        this.isClickSport = value;
        int i = value ? R.drawable.img_radial_sport_checked : R.drawable.img_radial_sport_not_checked;
        ImageView buttonSport = ((RadialMenuDialogBinding) getBinding()).buttonSport;
        Intrinsics.checkNotNullExpressionValue(buttonSport, "buttonSport");
        setDrawables(i, buttonSport);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void sportPlusSetClickIsNowNotClickable(boolean value) {
        this.isClickSportPlus = value;
        int i = value ? R.drawable.img_radial_sport_plus_checked : R.drawable.img_radial_sport_plus_not_checked;
        ImageView buttonSportPlus = ((RadialMenuDialogBinding) getBinding()).buttonSportPlus;
        Intrinsics.checkNotNullExpressionValue(buttonSportPlus, "buttonSportPlus");
        setDrawables(i, buttonSportPlus);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void neonSetClickIsNowNotClickable(boolean value) {
        this.isClickNeon = value;
        int i = value ? R.drawable.img_radial_neon_checked : R.drawable.img_radial_neon_not_checked;
        ImageView buttonNeon = ((RadialMenuDialogBinding) getBinding()).buttonNeon;
        Intrinsics.checkNotNullExpressionValue(buttonNeon, "buttonNeon");
        setDrawables(i, buttonNeon);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void highLightSetClickIsNowNotClickable(boolean value) {
        this.isClickHighLight = value;
        int i = value ? R.drawable.img_radial_high_light_checked : R.drawable.img_radial_high_light_not_checked;
        ImageView buttonHighLight = ((RadialMenuDialogBinding) getBinding()).buttonHighLight;
        Intrinsics.checkNotNullExpressionValue(buttonHighLight, "buttonHighLight");
        setDrawables(i, buttonHighLight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void headlightsSetClickIsNowNotClickable(boolean value) {
        this.isClickHeadlights = value;
        int i = value ? R.drawable.img_radial_headlights_checked : R.drawable.img_radial_headlights_not_checked;
        ImageView buttonHeadlights = ((RadialMenuDialogBinding) getBinding()).buttonHeadlights;
        Intrinsics.checkNotNullExpressionValue(buttonHeadlights, "buttonHeadlights");
        setDrawables(i, buttonHeadlights);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void stroboscopeSetClickIsNowNotClickable(boolean value) {
        this.isClickStroboscope = value;
        int i = value ? R.drawable.img_radial_stroboscope_checked : R.drawable.img_radial_stroboscope_not_checked;
        ImageView buttonStroboscope = ((RadialMenuDialogBinding) getBinding()).buttonStroboscope;
        Intrinsics.checkNotNullExpressionValue(buttonStroboscope, "buttonStroboscope");
        setDrawables(i, buttonStroboscope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void pnevmo1SetClickIsNowNotClickable(boolean value) {
        this.isClickPnevmo1 = value;
        int i = value ? R.drawable.img_radial_pnevmo1_checked : R.drawable.img_radial_pnevmo1_not_checked;
        ImageView buttonPnevmo1 = ((RadialMenuDialogBinding) getBinding()).buttonPnevmo1;
        Intrinsics.checkNotNullExpressionValue(buttonPnevmo1, "buttonPnevmo1");
        setDrawables(i, buttonPnevmo1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void pnevmo2SetClickIsNowNotClickable(boolean value) {
        this.isClickPnevmo2 = value;
        int i = value ? R.drawable.img_radial_pnevmo2_checked : R.drawable.img_radial_pnevmo2_not_checked;
        ImageView buttonPnevmo2 = ((RadialMenuDialogBinding) getBinding()).buttonPnevmo2;
        Intrinsics.checkNotNullExpressionValue(buttonPnevmo2, "buttonPnevmo2");
        setDrawables(i, buttonPnevmo2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void pnevmo3SetClickIsNowNotClickable(boolean value) {
        this.isClickPnevmo3 = value;
        int i = value ? R.drawable.img_radial_pnevmo3_checked : R.drawable.img_radial_pnevmo3_not_checked;
        ImageView buttonPnevmo3 = ((RadialMenuDialogBinding) getBinding()).buttonPnevmo3;
        Intrinsics.checkNotNullExpressionValue(buttonPnevmo3, "buttonPnevmo3");
        setDrawables(i, buttonPnevmo3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void hydraulicsSetClickIsNowNotClickable(boolean value) {
        this.isClickHydraulics = value;
        int i = value ? R.drawable.img_radial_hydraulics_checked : R.drawable.img_radial_hydraulics_not_checked;
        ImageView buttonHydraulics = ((RadialMenuDialogBinding) getBinding()).buttonHydraulics;
        Intrinsics.checkNotNullExpressionValue(buttonHydraulics, "buttonHydraulics");
        setDrawables(i, buttonHydraulics);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setVisibilityForTurbo(int valueVisible) {
        ((RadialMenuDialogBinding) getBinding()).groupTurbo.setVisibility(valueVisible);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setVisibilityForLight(int valueVisible) {
        ((RadialMenuDialogBinding) getBinding()).groupLight.setVisibility(valueVisible);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setVisibilityForSuspension(int valueVisible) {
        ((RadialMenuDialogBinding) getBinding()).groupSuspension.setVisibility(valueVisible);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void turboSetClickableIsClickableInSubmenu() {
        if (this.isClickDrift || this.isClickComfortPlus || this.isClickSportPlus || this.isClickSport) {
            ImageView buttonTurbo = ((RadialMenuDialogBinding) getBinding()).buttonTurbo;
            Intrinsics.checkNotNullExpressionValue(buttonTurbo, "buttonTurbo");
            setDrawables(R.drawable.img_radial_turbo_checked, buttonTurbo);
        } else {
            ImageView buttonTurbo2 = ((RadialMenuDialogBinding) getBinding()).buttonTurbo;
            Intrinsics.checkNotNullExpressionValue(buttonTurbo2, "buttonTurbo");
            setDrawables(R.drawable.img_radial_turbo_not_checked, buttonTurbo2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void lightSetClickableIsClickableInSubmenu() {
        if (this.isClickNeon || this.isClickHighLight || this.isClickHeadlights || this.isClickStroboscope) {
            ImageView buttonLight = ((RadialMenuDialogBinding) getBinding()).buttonLight;
            Intrinsics.checkNotNullExpressionValue(buttonLight, "buttonLight");
            setDrawables(R.drawable.img_radial_light_checked, buttonLight);
        } else {
            ImageView buttonLight2 = ((RadialMenuDialogBinding) getBinding()).buttonLight;
            Intrinsics.checkNotNullExpressionValue(buttonLight2, "buttonLight");
            setDrawables(R.drawable.img_radial_light_not_checked, buttonLight2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void suspensionSetClickableIsClickableInSubmenu() {
        if (this.isClickPnevmo1 || this.isClickPnevmo2 || this.isClickPnevmo3 || this.isClickHydraulics) {
            ImageView buttonSuspension = ((RadialMenuDialogBinding) getBinding()).buttonSuspension;
            Intrinsics.checkNotNullExpressionValue(buttonSuspension, "buttonSuspension");
            setDrawables(R.drawable.img_radial_suspension_checked, buttonSuspension);
        } else {
            ImageView buttonSuspension2 = ((RadialMenuDialogBinding) getBinding()).buttonSuspension;
            Intrinsics.checkNotNullExpressionValue(buttonSuspension2, "buttonSuspension");
            setDrawables(R.drawable.img_radial_suspension_not_checked, buttonSuspension2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initClickListener() {
        RadialMenuDialogBinding radialMenuDialogBinding = (RadialMenuDialogBinding) getBinding();
        ImageView radialClose = radialMenuDialogBinding.radialClose;
        Intrinsics.checkNotNullExpressionValue(radialClose, "radialClose");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, radialClose, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar$initClickListener$1$1
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
                GUIRadialMenuForCar.this.closeFragment();
            }
        }, 1, null);
        radialMenuDialogBinding.buttonParking.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIRadialMenuForCar.initClickListener$lambda$21$lambda$1(GUIRadialMenuForCar.this, view);
            }
        });
        radialMenuDialogBinding.buttonKey.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar$$ExternalSyntheticLambda11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIRadialMenuForCar.initClickListener$lambda$21$lambda$2(GUIRadialMenuForCar.this, view);
            }
        });
        radialMenuDialogBinding.buttonDoor.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar$$ExternalSyntheticLambda12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIRadialMenuForCar.initClickListener$lambda$21$lambda$3(GUIRadialMenuForCar.this, view);
            }
        });
        radialMenuDialogBinding.buttonLaunchControl.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar$$ExternalSyntheticLambda13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIRadialMenuForCar.initClickListener$lambda$21$lambda$4(GUIRadialMenuForCar.this, view);
            }
        });
        radialMenuDialogBinding.buttonEngine.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar$$ExternalSyntheticLambda14
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIRadialMenuForCar.initClickListener$lambda$21$lambda$5(GUIRadialMenuForCar.this, view);
            }
        });
        radialMenuDialogBinding.buttonTurbo.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar$$ExternalSyntheticLambda15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIRadialMenuForCar.initClickListener$lambda$21$lambda$6(GUIRadialMenuForCar.this, view);
            }
        });
        radialMenuDialogBinding.buttonLight.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar$$ExternalSyntheticLambda16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIRadialMenuForCar.initClickListener$lambda$21$lambda$7(GUIRadialMenuForCar.this, view);
            }
        });
        radialMenuDialogBinding.buttonSuspension.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar$$ExternalSyntheticLambda17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIRadialMenuForCar.initClickListener$lambda$21$lambda$8(GUIRadialMenuForCar.this, view);
            }
        });
        radialMenuDialogBinding.buttonDrift.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar$$ExternalSyntheticLambda18
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIRadialMenuForCar.initClickListener$lambda$21$lambda$9(GUIRadialMenuForCar.this, view);
            }
        });
        radialMenuDialogBinding.buttonComfortPlus.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar$$ExternalSyntheticLambda19
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIRadialMenuForCar.initClickListener$lambda$21$lambda$10(GUIRadialMenuForCar.this, view);
            }
        });
        radialMenuDialogBinding.buttonSport.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIRadialMenuForCar.initClickListener$lambda$21$lambda$11(GUIRadialMenuForCar.this, view);
            }
        });
        radialMenuDialogBinding.buttonSportPlus.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIRadialMenuForCar.initClickListener$lambda$21$lambda$12(GUIRadialMenuForCar.this, view);
            }
        });
        radialMenuDialogBinding.buttonNeon.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIRadialMenuForCar.initClickListener$lambda$21$lambda$13(GUIRadialMenuForCar.this, view);
            }
        });
        radialMenuDialogBinding.buttonHighLight.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIRadialMenuForCar.initClickListener$lambda$21$lambda$14(GUIRadialMenuForCar.this, view);
            }
        });
        radialMenuDialogBinding.buttonHeadlights.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIRadialMenuForCar.initClickListener$lambda$21$lambda$15(GUIRadialMenuForCar.this, view);
            }
        });
        radialMenuDialogBinding.buttonStroboscope.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIRadialMenuForCar.initClickListener$lambda$21$lambda$16(GUIRadialMenuForCar.this, view);
            }
        });
        radialMenuDialogBinding.buttonPnevmo1.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIRadialMenuForCar.initClickListener$lambda$21$lambda$17(GUIRadialMenuForCar.this, view);
            }
        });
        radialMenuDialogBinding.buttonPnevmo2.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIRadialMenuForCar.initClickListener$lambda$21$lambda$18(GUIRadialMenuForCar.this, view);
            }
        });
        radialMenuDialogBinding.buttonPnevmo3.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIRadialMenuForCar.initClickListener$lambda$21$lambda$19(GUIRadialMenuForCar.this, view);
            }
        });
        radialMenuDialogBinding.buttonHydraulics.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIRadialMenuForCar.initClickListener$lambda$21$lambda$20(GUIRadialMenuForCar.this, view);
            }
        });
    }

    public static final void initClickListener$lambda$21$lambda$1(GUIRadialMenuForCar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getRadialMenuViewModel().sendServerThisOperation(1);
    }

    public static final void initClickListener$lambda$21$lambda$2(GUIRadialMenuForCar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getRadialMenuViewModel().sendServerThisOperation(2);
    }

    public static final void initClickListener$lambda$21$lambda$3(GUIRadialMenuForCar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getRadialMenuViewModel().sendServerThisOperation(3);
    }

    public static final void initClickListener$lambda$21$lambda$4(GUIRadialMenuForCar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getRadialMenuViewModel().sendServerThisOperation(5);
    }

    public static final void initClickListener$lambda$21$lambda$5(GUIRadialMenuForCar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getRadialMenuViewModel().sendServerThisOperation(6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void initClickListener$lambda$21$lambda$6(GUIRadialMenuForCar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int playerVehicleType = JNILib.getPlayerVehicleType();
        if (playerVehicleType != 3 && playerVehicleType != 4 && playerVehicleType != 5) {
            if (playerVehicleType != 8) {
                int i = !this$0.isClickTurbo ? R.drawable.img_radial_bg_turbo_engine_and_submenu : R.drawable.img_radial_bg_turbo_engine;
                ImageView bgTurboEngine = ((RadialMenuDialogBinding) this$0.getBinding()).bgTurboEngine;
                Intrinsics.checkNotNullExpressionValue(bgTurboEngine, "bgTurboEngine");
                this$0.setDrawables(i, bgTurboEngine);
                this$0.setVisibilityForTurbo(this$0.isClickTurbo ? 8 : 0);
                this$0.isClickTurbo = !this$0.isClickTurbo;
                return;
            }
        }
        this$0.getRadialMenuViewModel().showMessageError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void initClickListener$lambda$21$lambda$7(GUIRadialMenuForCar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = !this$0.isClickLight ? R.drawable.img_radial_bg_door_light_and_submenu : R.drawable.img_radial_bg_door_light;
        ImageView bgDoorLight = ((RadialMenuDialogBinding) this$0.getBinding()).bgDoorLight;
        Intrinsics.checkNotNullExpressionValue(bgDoorLight, "bgDoorLight");
        this$0.setDrawables(i, bgDoorLight);
        this$0.setVisibilityForLight(!this$0.isClickLight ? 0 : 8);
        this$0.isClickLight = !this$0.isClickLight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void initClickListener$lambda$21$lambda$8(GUIRadialMenuForCar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int playerVehicleType = JNILib.getPlayerVehicleType();
        if (playerVehicleType != 3 && playerVehicleType != 4 && playerVehicleType != 5) {
            if (playerVehicleType != 8) {
                int i = !this$0.isClickSuspension ? R.drawable.img_radial_bg_control_suspension_and_submenu : R.drawable.img_radial_bg_control_suspension;
                ImageView bgControlSuspension = ((RadialMenuDialogBinding) this$0.getBinding()).bgControlSuspension;
                Intrinsics.checkNotNullExpressionValue(bgControlSuspension, "bgControlSuspension");
                this$0.setDrawables(i, bgControlSuspension);
                this$0.setVisibilityForSuspension(this$0.isClickSuspension ? 8 : 0);
                this$0.isClickSuspension = !this$0.isClickSuspension;
                return;
            }
        }
        this$0.getRadialMenuViewModel().showMessageError();
    }

    public static final void initClickListener$lambda$21$lambda$9(GUIRadialMenuForCar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.turboSetClickableIsClickableInSubmenu();
        this$0.getRadialMenuViewModel().sendServerThisOperation(8);
    }

    public static final void initClickListener$lambda$21$lambda$10(GUIRadialMenuForCar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.turboSetClickableIsClickableInSubmenu();
        this$0.getRadialMenuViewModel().sendServerThisOperation(9);
    }

    public static final void initClickListener$lambda$21$lambda$11(GUIRadialMenuForCar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.turboSetClickableIsClickableInSubmenu();
        this$0.getRadialMenuViewModel().sendServerThisOperation(10);
    }

    public static final void initClickListener$lambda$21$lambda$12(GUIRadialMenuForCar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.turboSetClickableIsClickableInSubmenu();
        this$0.getRadialMenuViewModel().sendServerThisOperation(11);
    }

    public static final void initClickListener$lambda$21$lambda$13(GUIRadialMenuForCar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.lightSetClickableIsClickableInSubmenu();
        this$0.getRadialMenuViewModel().sendServerThisOperation(12);
    }

    public static final void initClickListener$lambda$21$lambda$14(GUIRadialMenuForCar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.lightSetClickableIsClickableInSubmenu();
        this$0.getRadialMenuViewModel().sendServerThisOperation(13);
    }

    public static final void initClickListener$lambda$21$lambda$15(GUIRadialMenuForCar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.lightSetClickableIsClickableInSubmenu();
        this$0.getRadialMenuViewModel().sendServerThisOperation(14);
    }

    public static final void initClickListener$lambda$21$lambda$16(GUIRadialMenuForCar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.lightSetClickableIsClickableInSubmenu();
        this$0.getRadialMenuViewModel().sendServerThisOperation(15);
    }

    public static final void initClickListener$lambda$21$lambda$17(GUIRadialMenuForCar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.suspensionSetClickableIsClickableInSubmenu();
        this$0.getRadialMenuViewModel().sendServerThisOperation(16);
    }

    public static final void initClickListener$lambda$21$lambda$18(GUIRadialMenuForCar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.suspensionSetClickableIsClickableInSubmenu();
        this$0.getRadialMenuViewModel().sendServerThisOperation(17);
    }

    public static final void initClickListener$lambda$21$lambda$19(GUIRadialMenuForCar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.suspensionSetClickableIsClickableInSubmenu();
        this$0.getRadialMenuViewModel().sendServerThisOperation(18);
    }

    public static final void initClickListener$lambda$21$lambda$20(GUIRadialMenuForCar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.suspensionSetClickableIsClickableInSubmenu();
        this$0.getRadialMenuViewModel().sendServerThisOperation(19);
    }

    public final void setDrawables(int resourceId, ImageView currentIV) {
        currentIV.setImageResource(resourceId);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getRadialMenuViewModel().sendServerThisOperation(0);
        JNILib.toggleDrawing2dStuff(false);
        super.onDestroyView();
    }

    public GUIRadialMenuForCar() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar$radialMenuViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return GUIRadialMenuForCar.this;
            }
        };
        Function0<ViewModelProvider.Factory> function02 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar$radialMenuViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return GUIRadialMenuForCar.this.getRadialMenuFactory();
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar$special$$inlined$viewModels$default$1
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
        this.radialMenuViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(RadialMenuViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar$special$$inlined$viewModels$default$3
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
}
