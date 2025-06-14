package com.blackhub.bronline.game.gui.registration;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.RegistrationMainframeBinding;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.common.GUIPopupWindow;
import com.blackhub.bronline.game.common.UIContainer;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.JNILib;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class GUIRegistration extends BaseISAMPGUIFragment<RegistrationMainframeBinding> {
    public static final int REGISTATION_LAYOUT_CHOOSE_SEX = 1;
    public static final int REGISTATION_LAYOUT_GENERAL = 0;
    public static final int REGISTATION_LAYOUT_PERSON = 2;
    public static final int REGISTRATION_RESTORE = 0;
    public static final int REGISTRATION_RESTORE_NEW = 1;
    public static final int REGISTRATION_RESTORE_PIN = 2;
    public static final int REGISTRATION_RESTORE_PIN_AUTH = 4;
    public static final int REGISTRATION_RESTORE_PIN_NEW = 3;
    public int mT;
    public UILayoutRegistrationGeneral uiGeneral;

    @Nullable
    public JNIActivity mActivity = null;

    @Nullable
    public GUIManager mGUIManager = null;
    public GUIPopupWindow mPopup = null;

    @Nullable
    public UIContainer mContainer = null;

    @Nullable
    public JNIActivityViewModel jniActivityViewModel = null;

    @Nullable
    public Bitmap mLogoBitmap = null;

    @Nullable
    public Animation mAnim = null;
    public boolean mIsRegistration = false;
    public boolean mHasFingerprint = false;
    public boolean mNeedPasswordNow = false;
    public boolean mHasMail = false;
    public int mRestoreSet = -1;
    public boolean isMale = true;
    public int mRestoreMethod = 0;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 38;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment, com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.mGUIManager = GUIManager.getInstance();
        this.mActivity = JNIActivity.getContext();
        this.mAnim = AnimationUtils.loadAnimation(requireContext(), R.anim.button_click);
        this.jniActivityViewModel = (JNIActivityViewModel) new ViewModelProvider(requireActivity()).get(JNIActivityViewModel.class);
        if (getJsonObj() != null) {
            this.mIsRegistration = getJsonObj().optInt("r") == 0;
            this.mHasFingerprint = getJsonObj().optInt("f", 0) != 0;
            this.mNeedPasswordNow = getJsonObj().optInt("f", 0) == 2;
            this.mHasMail = getJsonObj().optInt("p", 0) != 0;
        }
        UIContainer uIContainer = ((RegistrationMainframeBinding) getBinding()).container;
        this.mContainer = uIContainer;
        uIContainer.addLayout(0, new UILayoutRegistrationGeneral(this));
        this.mContainer.addLayout(1, new UILayoutRegistrationSex(this));
        this.mContainer.addLayout(2, new UILayoutRegistrationPerson(this));
        this.uiGeneral = (UILayoutRegistrationGeneral) this.mContainer.getLayout(0);
        this.mContainer.setCurrentLayout(0);
        JNILib.toggleDrawing2dStuff(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(JSONObject json) {
        int optInt = json.optInt("t");
        this.mT = optInt;
        UILayoutRegistrationGeneral uILayoutRegistrationGeneral = this.uiGeneral;
        if (uILayoutRegistrationGeneral == null) {
            UtilsKt.crashlyticsRecordNewException("Зачем мне json, если уже закрылся интерфейс? json = " + json);
            return;
        }
        if (optInt != 0) {
            if (optInt == 1) {
                this.mRestoreSet = 2;
                uILayoutRegistrationGeneral.mContainer.setCurrentLayout(1);
                return;
            }
            if (optInt == 2) {
                this.mRestoreSet = 3;
                uILayoutRegistrationGeneral.mContainer.setCurrentLayout(1);
                return;
            }
            if (optInt != 3) {
                if (optInt != 4) {
                    return;
                }
                this.mRestoreMethod = json.optInt("m");
                this.mRestoreSet = 0;
                this.uiGeneral.mContainer.setCurrentLayout(1);
                return;
            }
            this.mIsRegistration = true;
            uILayoutRegistrationGeneral.mContainer.setCurrentLayout(3);
            UIContainer uIContainer = this.mContainer;
            if (uIContainer != null) {
                uIContainer.setCurrentLayout(1);
                return;
            }
            return;
        }
        if (this.mIsRegistration) {
            if (uILayoutRegistrationGeneral.mContainer.getCurrentLayoutId() != 3) {
                if (this.uiGeneral.mContainer.getCurrentLayoutId() == 1) {
                    JNIActivity jNIActivity = this.mActivity;
                    Objects.requireNonNull(jNIActivity);
                    if (!jNIActivity.isSupportFingerPrint) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("t", 2);
                            jSONObject.put("s", "");
                            jSONObject.put("r", 0);
                            GUIManager gUIManager = this.mGUIManager;
                            if (gUIManager != null) {
                                gUIManager.sendJsonData(38, jSONObject);
                            }
                        } catch (Exception e) {
                            String message = e.getMessage();
                            Objects.requireNonNull(message);
                            UtilsKt.crashlyticsRecordNewException(message);
                        }
                        this.uiGeneral.mContainer.setCurrentLayout(3);
                        return;
                    }
                }
                UIContainer uIContainer2 = this.uiGeneral.mContainer;
                uIContainer2.setCurrentLayout(uIContainer2.getCurrentLayoutId() + 1);
                return;
            }
            UIContainer uIContainer3 = this.mContainer;
            if (uIContainer3 != null) {
                if (uIContainer3.getCurrentLayoutId() != 1) {
                    this.mContainer.setCurrentLayout(1);
                    return;
                } else {
                    this.mContainer.setCurrentLayout(2);
                    ((RegistrationMainframeBinding) getBinding()).getRoot().setBackground(null);
                    return;
                }
            }
            return;
        }
        if (uILayoutRegistrationGeneral.mContainer.getCurrentLayoutId() == 1) {
            int i = this.mRestoreSet;
            if (i == 0) {
                this.mRestoreSet = i + 1;
                this.uiGeneral.mContainer.setCurrentLayout(1);
                return;
            } else {
                closeFragment();
                return;
            }
        }
        closeFragment();
    }

    public void showPopup(String header, String content, String button, View.OnClickListener closeListener, View.OnClickListener okListener) {
        GUIPopupWindow gUIPopupWindow = this.mPopup;
        if (gUIPopupWindow != null) {
            gUIPopupWindow.dismiss();
        }
        View inflate = ((LayoutInflater) this.mActivity.getSystemService("layout_inflater")).inflate(R.layout.mini_game_events_popup_dialog, (ViewGroup) null, false);
        GUIPopupWindow gUIPopupWindow2 = new GUIPopupWindow(inflate, -1, -1, true);
        this.mPopup = gUIPopupWindow2;
        gUIPopupWindow2.setClippingEnabled(false);
        inflate.findViewById(R.id.mini_games_apply_two).setOnClickListener(okListener);
        View findViewById = inflate.findViewById(R.id.mini_games_close);
        if (closeListener == null) {
            closeListener = new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.GUIRegistration$$ExternalSyntheticLambda0
                public /* synthetic */ GUIRegistration$$ExternalSyntheticLambda0() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GUIRegistration.this.lambda$showPopup$0(view);
                }
            };
        }
        findViewById.setOnClickListener(closeListener);
        if (okListener != null) {
            inflate.findViewById(R.id.mini_games_apply_two).setOnClickListener(okListener);
        } else {
            inflate.findViewById(R.id.mini_games_apply_two).setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.GUIRegistration.1
                public AnonymousClass1() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (GUIRegistration.this.mPopup != null) {
                        GUIRegistration.this.mPopup.dismiss();
                    }
                }
            });
        }
        ((TextView) inflate.findViewById(R.id.mini_games_header)).setText(header);
        ((TextView) inflate.findViewById(R.id.mini_games_content)).setText(content);
        ((Button) inflate.findViewById(R.id.mini_games_apply_two)).setText(button);
        this.mPopup.showAtLocation(getView(), 17, 0, 0);
    }

    public final /* synthetic */ void lambda$showPopup$0(View view) {
        GUIPopupWindow gUIPopupWindow = this.mPopup;
        if (gUIPopupWindow != null) {
            gUIPopupWindow.dismiss();
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.GUIRegistration$1 */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GUIRegistration.this.mPopup != null) {
                GUIRegistration.this.mPopup.dismiss();
            }
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NonNull
    public RegistrationMainframeBinding getViewBinding() {
        return RegistrationMainframeBinding.inflate(getLayoutInflater());
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.mGUIManager.notifyGUIClosed(getScreenId());
        JNILib.toggleDrawing2dStuff(false);
        setNullableParams();
        super.onDestroyView();
    }

    public final void setNullableParams() {
        this.mActivity = null;
        this.mGUIManager = null;
        this.mPopup = null;
        this.mContainer = null;
        this.mLogoBitmap = null;
        this.mAnim = null;
        this.jniActivityViewModel = null;
    }
}
