package com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NativeKeys;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import com.blackhub.bronline.game.gui.menupausesettingandmap.network.NewMenuActionWithJSON;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: MenuPauseViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tJ\u0006\u0010\u0015\u001a\u00020\u0013J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\tJ\u0006\u0010\u0018\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuPauseViewModel;", "Landroidx/lifecycle/ViewModel;", "preferencesRepository", "Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;", "actionsWithJSON", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/network/NewMenuActionWithJSON;", "(Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;Lcom/blackhub/bronline/game/gui/menupausesettingandmap/network/NewMenuActionWithJSON;)V", "buttonClickedLiveData", "Landroidx/lifecycle/LiveData;", "", "getButtonClickedLiveData", "()Landroidx/lifecycle/LiveData;", "mutableButtonClickedLiveData", "Landroidx/lifecycle/MutableLiveData;", "mutablePlayersNick", "", "newPlayersNick", "getNewPlayersNick", "actionsWithJSONClickButton", "", "buttonId", "applyGameSettings", "buttonClicked", "button", "closeSettings", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMenuPauseViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuPauseViewModel.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuPauseViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,194:1\n1#2:195\n*E\n"})
/* loaded from: classes3.dex */
public final class MenuPauseViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final NewMenuActionWithJSON actionsWithJSON;

    @NotNull
    public final MutableLiveData<Integer> mutableButtonClickedLiveData;

    @NotNull
    public final MutableLiveData<String> mutablePlayersNick;

    @NotNull
    public final LiveData<String> newPlayersNick;

    @NotNull
    public final PreferencesRepository preferencesRepository;

    @Inject
    public MenuPauseViewModel(@NotNull PreferencesRepository preferencesRepository, @NotNull NewMenuActionWithJSON actionsWithJSON) {
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(actionsWithJSON, "actionsWithJSON");
        this.preferencesRepository = preferencesRepository;
        this.actionsWithJSON = actionsWithJSON;
        this.mutableButtonClickedLiveData = new MutableLiveData<>();
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.mutablePlayersNick = mutableLiveData;
        this.newPlayersNick = mutableLiveData;
        String string = preferencesRepository.getString(NewMenuConstants.PLAYERS_NICK);
        mutableLiveData.setValue(string.length() == 0 ? NewMenuConstants.DEFAULT_VALUE_FOR_NICK : string);
    }

    @NotNull
    public final LiveData<Integer> getButtonClickedLiveData() {
        return this.mutableButtonClickedLiveData;
    }

    @NotNull
    public final LiveData<String> getNewPlayersNick() {
        return this.newPlayersNick;
    }

    public final void actionsWithJSONClickButton(int buttonId) {
        this.actionsWithJSON.clickButton(buttonId);
    }

    public final void buttonClicked(int button) {
        this.mutableButtonClickedLiveData.setValue(Integer.valueOf(button));
    }

    public final void closeSettings() {
        this.actionsWithJSON.closeSettings();
    }

    public final void applyGameSettings() {
        int integer$default = PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.RESOLUTION, 0, 2, null);
        int integer$default2 = PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.EFFECT_QUALITY, 0, 2, null);
        int integer$default3 = PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.WATER_QUALITY, 0, 2, null);
        int integer$default4 = PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.SHADOW_QUALITY, 0, 2, null);
        int integer$default5 = PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.REFLECTION_ON_CAR, 0, 2, null);
        int integer$default6 = PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.DISTANCE, 0, 2, null);
        int integer$default7 = PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.VEGETATION, 0, 2, null);
        int integer$default8 = PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.SSAA, 0, 2, null);
        int integer$default9 = PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.FPS, 0, 2, null);
        int integer$default10 = PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.CAR_CONTROL, 0, 2, null);
        float f = this.preferencesRepository.getFloat(NewMenuConstants.CAR_CONTROL_SENSIBILITY);
        float f2 = this.preferencesRepository.getFloat(NewMenuConstants.CAR_CAMERA_X_SENSIBILITY);
        float f3 = this.preferencesRepository.getFloat(NewMenuConstants.CAR_CAMERA_Y_SENSIBILITY);
        float f4 = this.preferencesRepository.getFloat(NewMenuConstants.AIMING_CAMERA_X_SENSIBILITY);
        float f5 = this.preferencesRepository.getFloat(NewMenuConstants.AIMING_CAMERA_Y_SENSIBILITY);
        int integer$default11 = PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.LOOK_BACK, 0, 2, null);
        int integer$default12 = PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.ALL_SOUNDS, 0, 2, null);
        int integer$default13 = PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.PARAM_1, 0, 2, null);
        int integer$default14 = PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.PARAM_2, 0, 2, null);
        int integer$default15 = PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.PARAM_3, 0, 2, null);
        int integer$default16 = PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.PARAM_4, 0, 2, null);
        int integer$default17 = PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.PARAM_5, 0, 2, null);
        int integer$default18 = PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.PARAM_6, 0, 2, null);
        int integer$default19 = PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.HUD_VERSION, 0, 2, null);
        int integer$default20 = PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.CHAT_VERSION, 0, 2, null);
        int integer$default21 = PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.KEYBOARD_VERSION, 0, 2, null);
        this.preferencesRepository.getInteger(NewMenuConstants.SNOW_INTENSITY, 2);
        this.preferencesRepository.getInteger(NewMenuConstants.WINTER_SLIP, 0);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NativeKeys.RESOLUTION_NK, integer$default);
            jSONObject.put(NativeKeys.EFFECT_QUALITY_NK, integer$default2);
            jSONObject.put(NativeKeys.WATER_QUALITY_NK, integer$default3);
            jSONObject.put(NativeKeys.SHADOW_QUALITY_NK, integer$default4);
            jSONObject.put(NativeKeys.REFLECTION_ON_CAR_NK, integer$default5);
            jSONObject.put(NativeKeys.DRAW_DISTANCE_NK, integer$default6);
            jSONObject.put(NewMenuConstants.VEGETATION, integer$default7);
            jSONObject.put(NativeKeys.SSAA_NK, integer$default8);
            jSONObject.put(NativeKeys.FPS_NK, integer$default9);
            jSONObject.put(NativeKeys.CAR_CONTROLS_NK, integer$default10);
            jSONObject.put(NativeKeys.JSOY_SENS_NK, f);
            jSONObject.put(NativeKeys.CAMERA_X_NK, f2);
            jSONObject.put(NativeKeys.CAMERA_Y_NK, f3);
            jSONObject.put(NativeKeys.AIM_CAM_SENS_X_NK, f4);
            jSONObject.put(NativeKeys.AIM_CAM_SENS_Y_NK, f5);
            jSONObject.put(NativeKeys.LOOK_BEHIND_NK, integer$default11);
            jSONObject.put(NativeKeys.EFF_VOLUME_NK, integer$default12);
            jSONObject.put(NativeKeys.SPEAK_VOL_NK, integer$default13);
            jSONObject.put(NativeKeys.CENSORED_RADIO, integer$default18);
            jSONObject.put(NativeKeys.MUTE_MICRO_NK, integer$default17 == 1 ? -1 : integer$default14);
            jSONObject.put(NativeKeys.SHOW_SPEAKERS_NK, integer$default15);
            jSONObject.put(NativeKeys.SHOW_VOICE_CHAT_NK, integer$default16);
            jSONObject.put(NativeKeys.HUD_VERSION_NK, integer$default19);
            jSONObject.put(NativeKeys.CHAT_VERSION_NK, integer$default20);
            jSONObject.put(NativeKeys.KEYBOARD_VERSION_NK, integer$default21);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().log("jsonWithParameters error, e: " + e);
            FirebaseCrashlytics.getInstance().recordException(e);
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("b", 4);
            jSONObject2.put("s", jSONObject);
        } catch (Exception e2) {
            FirebaseCrashlytics.getInstance().log("jsonObject b:4 error, e: " + e2);
            FirebaseCrashlytics.getInstance().recordException(e2);
        }
        GUIManager.INSTANCE.getInstance().sendJsonData(47, jSONObject2);
    }
}
