package com.blackhub.bronline.game.gui.registration;

import android.text.Html;
import android.text.InputFilter;
import android.text.method.DigitsKeyListener;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent;
import com.blackhub.bronline.game.common.UIContainer;
import com.blackhub.bronline.game.common.UILayout;
import com.blackhub.bronline.game.core.JNIActivity;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class UILayoutRegistrationCreatePassword extends UILayout {
    public LinearLayout butBack;
    public Button butt;
    public CustomEditTextWithBackPressEvent edit1;
    public CustomEditTextWithBackPressEvent edit2;
    public CustomEditTextWithBackPressEvent edit3;
    public GUIRegistration mRoot;
    public UILayoutRegistrationGeneral mUIParent;
    public View mViewRoot = null;
    public TextView textHeader;
    public TextView textRestore;

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
    }

    public UILayoutRegistrationCreatePassword(GUIRegistration root) {
        this.mRoot = root;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    /* renamed from: getView */
    public View getMViewRoot() {
        return this.mViewRoot;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public View onCreateView(LayoutInflater inflater, ViewGroup container) {
        this.mViewRoot = inflater.inflate(R.layout.registration_create_password, (ViewGroup) null, false);
        this.mUIParent = (UILayoutRegistrationGeneral) this.mRoot.mContainer.getLayout(0);
        this.butBack = (LinearLayout) this.mViewRoot.findViewById(R.id.back_butt);
        this.textHeader = (TextView) this.mViewRoot.findViewById(R.id.header_text);
        this.textRestore = (TextView) this.mViewRoot.findViewById(R.id.restore_text);
        this.butt = (Button) this.mViewRoot.findViewById(R.id.reg_butt);
        this.edit1 = (CustomEditTextWithBackPressEvent) this.mViewRoot.findViewById(R.id.edit1);
        this.edit2 = (CustomEditTextWithBackPressEvent) this.mViewRoot.findViewById(R.id.edit2);
        this.edit3 = (CustomEditTextWithBackPressEvent) this.mViewRoot.findViewById(R.id.edit3);
        return this.mViewRoot;
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$1 */
    public class AnonymousClass1 implements ViewTreeObserver.OnGlobalLayoutListener {
        public AnonymousClass1() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            UILayoutRegistrationCreatePassword.this.butt.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) UILayoutRegistrationCreatePassword.this.butt.getLayoutParams();
            int width = (int) (UILayoutRegistrationCreatePassword.this.butt.getWidth() * 0.16f);
            layoutParams.height = width;
            UILayoutRegistrationCreatePassword.this.butt.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) UILayoutRegistrationCreatePassword.this.edit1.getLayoutParams();
            layoutParams2.height = width;
            UILayoutRegistrationCreatePassword.this.edit1.setLayoutParams(layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) UILayoutRegistrationCreatePassword.this.edit2.getLayoutParams();
            layoutParams3.height = width;
            UILayoutRegistrationCreatePassword.this.edit2.setLayoutParams(layoutParams3);
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) UILayoutRegistrationCreatePassword.this.edit3.getLayoutParams();
            layoutParams4.height = width;
            UILayoutRegistrationCreatePassword.this.edit3.setLayoutParams(layoutParams4);
        }
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
        this.butt.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.1
            public AnonymousClass1() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                UILayoutRegistrationCreatePassword.this.butt.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) UILayoutRegistrationCreatePassword.this.butt.getLayoutParams();
                int width = (int) (UILayoutRegistrationCreatePassword.this.butt.getWidth() * 0.16f);
                layoutParams.height = width;
                UILayoutRegistrationCreatePassword.this.butt.setLayoutParams(layoutParams);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) UILayoutRegistrationCreatePassword.this.edit1.getLayoutParams();
                layoutParams2.height = width;
                UILayoutRegistrationCreatePassword.this.edit1.setLayoutParams(layoutParams2);
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) UILayoutRegistrationCreatePassword.this.edit2.getLayoutParams();
                layoutParams3.height = width;
                UILayoutRegistrationCreatePassword.this.edit2.setLayoutParams(layoutParams3);
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) UILayoutRegistrationCreatePassword.this.edit3.getLayoutParams();
                layoutParams4.height = width;
                UILayoutRegistrationCreatePassword.this.edit3.setLayoutParams(layoutParams4);
            }
        });
        GUIRegistration gUIRegistration = this.mRoot;
        if (gUIRegistration.mIsRegistration) {
            RegistrationSet();
            return;
        }
        int i = gUIRegistration.mRestoreSet;
        if (i == 0) {
            RestoreSet();
            return;
        }
        if (i == 1) {
            RestoreNewSet();
        } else if (i == 2) {
            PinSet();
        } else {
            if (i != 3) {
                return;
            }
            PinRestoreSet();
        }
    }

    public final void RegistrationSet() {
        this.butt.setText("Зарегистрироваться");
        this.edit1.setVisibility(0);
        this.edit1.setHint("Электронная почта (необязательно)");
        this.edit2.setVisibility(0);
        this.edit2.setHint("Пароль");
        this.edit3.setVisibility(0);
        this.edit3.setHint("Повторите пароль");
        this.textHeader.setVisibility(8);
        this.textRestore.setVisibility(8);
        this.edit1.setKeyListener(DigitsKeyListener.getInstance(getContext().getString(R.string.common_edittext_allowed_characters)));
        this.edit1.setRawInputType(1);
        this.edit2.setKeyListener(DigitsKeyListener.getInstance(getContext().getString(R.string.common_edittext_allowed_characters)));
        this.edit2.setRawInputType(128);
        this.edit2.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.edit3.setKeyListener(DigitsKeyListener.getInstance(getContext().getString(R.string.common_edittext_allowed_characters)));
        this.edit3.setRawInputType(128);
        this.edit3.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.butt.setAlpha(0.5f);
        this.edit1.setText("");
        this.edit2.setText("");
        this.edit3.setText("");
        this.edit1.setOnBackPressListener(new CustomEditTextWithBackPressEvent.MyEditTextListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.2
            public AnonymousClass2() {
            }

            @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
            public void callback() {
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
            }
        });
        this.edit2.setOnKeyListener(new View.OnKeyListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.3
            public AnonymousClass3() {
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (UILayoutRegistrationCreatePassword.this.edit2.getText().length() >= 6 && UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit3.getText().toString())) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                    return false;
                }
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                return false;
            }
        });
        this.edit2.setOnBackPressListener(new CustomEditTextWithBackPressEvent.MyEditTextListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.4
            public AnonymousClass4() {
            }

            @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
            public void callback() {
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                UILayoutRegistrationCreatePassword.this.edit2.setFocusable(false);
                UILayoutRegistrationCreatePassword.this.edit2.setFocusableInTouchMode(true);
            }
        });
        this.edit3.setOnKeyListener(new View.OnKeyListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.5
            public AnonymousClass5() {
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (UILayoutRegistrationCreatePassword.this.edit3.getText().length() >= 6 && UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit3.getText().toString())) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                } else {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                }
                if (i != 66) {
                    return false;
                }
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                view.setFocusable(false);
                view.setFocusableInTouchMode(true);
                return true;
            }
        });
        this.edit3.setOnBackPressListener(new CustomEditTextWithBackPressEvent.MyEditTextListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.6
            public AnonymousClass6() {
            }

            @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
            public void callback() {
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                UILayoutRegistrationCreatePassword.this.edit3.setFocusable(false);
                UILayoutRegistrationCreatePassword.this.edit3.setFocusableInTouchMode(true);
            }
        });
        this.butBack.setVisibility(4);
        this.butBack.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.7
            public AnonymousClass7() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
                boolean z = UILayoutRegistrationCreatePassword.this.mRoot.mIsRegistration;
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
                UILayoutRegistrationCreatePassword.this.edit2.setFocusable(false);
                UILayoutRegistrationCreatePassword.this.edit2.setFocusableInTouchMode(true);
                UILayoutRegistrationCreatePassword.this.edit3.setFocusable(false);
                UILayoutRegistrationCreatePassword.this.edit3.setFocusableInTouchMode(true);
                return false;
            }
        });
        this.butt.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.8
            public AnonymousClass8() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (UILayoutRegistrationCreatePassword.this.edit3.getText().length() >= 6 && UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit3.getText().toString())) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                } else {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                }
                if (view.getAlpha() < 1.0f) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("d", 3);
                        jSONObject.put("t", 2);
                        jSONObject.put("s", -99);
                        if (!UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit3.getText().toString())) {
                            jSONObject.put("i", "Пароли не совпадают");
                        } else if (UILayoutRegistrationCreatePassword.this.edit2.getText().length() == 0) {
                            jSONObject.put("i", "Придумайте пароль");
                        } else {
                            jSONObject.put("i", "Пароль слишком короткий");
                        }
                        UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.showGUI(13, jSONObject);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
                if (UILayoutRegistrationCreatePassword.this.mRoot.mIsRegistration) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("t", 1);
                        jSONObject2.put("s", UILayoutRegistrationCreatePassword.this.edit1.getText().toString());
                        jSONObject2.put("p", UILayoutRegistrationCreatePassword.this.edit2.getText().toString());
                        UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject2);
                    } catch (Exception unused2) {
                    }
                }
            }
        });
        this.mUIParent.textHint.setText(Html.fromHtml("<b>Для начала игры, заполни все поля</b>\n<ul><li>Пароль должен состоять от 6 до 16 символов</li><li>Пароль чувствителен к регистру</li></ul>"));
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$2 */
    public class AnonymousClass2 implements CustomEditTextWithBackPressEvent.MyEditTextListener {
        public AnonymousClass2() {
        }

        @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
        public void callback() {
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$3 */
    public class AnonymousClass3 implements View.OnKeyListener {
        public AnonymousClass3() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (UILayoutRegistrationCreatePassword.this.edit2.getText().length() >= 6 && UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit3.getText().toString())) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                return false;
            }
            UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            return false;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$4 */
    public class AnonymousClass4 implements CustomEditTextWithBackPressEvent.MyEditTextListener {
        public AnonymousClass4() {
        }

        @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
        public void callback() {
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            UILayoutRegistrationCreatePassword.this.edit2.setFocusable(false);
            UILayoutRegistrationCreatePassword.this.edit2.setFocusableInTouchMode(true);
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$5 */
    public class AnonymousClass5 implements View.OnKeyListener {
        public AnonymousClass5() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (UILayoutRegistrationCreatePassword.this.edit3.getText().length() >= 6 && UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit3.getText().toString())) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
            } else {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            }
            if (i != 66) {
                return false;
            }
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            view.setFocusable(false);
            view.setFocusableInTouchMode(true);
            return true;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$6 */
    public class AnonymousClass6 implements CustomEditTextWithBackPressEvent.MyEditTextListener {
        public AnonymousClass6() {
        }

        @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
        public void callback() {
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            UILayoutRegistrationCreatePassword.this.edit3.setFocusable(false);
            UILayoutRegistrationCreatePassword.this.edit3.setFocusableInTouchMode(true);
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$7 */
    public class AnonymousClass7 implements View.OnTouchListener {
        public AnonymousClass7() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
            boolean z = UILayoutRegistrationCreatePassword.this.mRoot.mIsRegistration;
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
            UILayoutRegistrationCreatePassword.this.edit2.setFocusable(false);
            UILayoutRegistrationCreatePassword.this.edit2.setFocusableInTouchMode(true);
            UILayoutRegistrationCreatePassword.this.edit3.setFocusable(false);
            UILayoutRegistrationCreatePassword.this.edit3.setFocusableInTouchMode(true);
            return false;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$8 */
    public class AnonymousClass8 implements View.OnClickListener {
        public AnonymousClass8() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (UILayoutRegistrationCreatePassword.this.edit3.getText().length() >= 6 && UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit3.getText().toString())) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
            } else {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            }
            if (view.getAlpha() < 1.0f) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("d", 3);
                    jSONObject.put("t", 2);
                    jSONObject.put("s", -99);
                    if (!UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit3.getText().toString())) {
                        jSONObject.put("i", "Пароли не совпадают");
                    } else if (UILayoutRegistrationCreatePassword.this.edit2.getText().length() == 0) {
                        jSONObject.put("i", "Придумайте пароль");
                    } else {
                        jSONObject.put("i", "Пароль слишком короткий");
                    }
                    UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.showGUI(13, jSONObject);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
            if (UILayoutRegistrationCreatePassword.this.mRoot.mIsRegistration) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("t", 1);
                    jSONObject2.put("s", UILayoutRegistrationCreatePassword.this.edit1.getText().toString());
                    jSONObject2.put("p", UILayoutRegistrationCreatePassword.this.edit2.getText().toString());
                    UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject2);
                } catch (Exception unused2) {
                }
            }
        }
    }

    public final void RestoreSet() {
        String str;
        this.textHeader.setVisibility(0);
        this.textHeader.setText("Код восстановления:");
        this.butt.setText("Подтвердить");
        this.edit1.setVisibility(0);
        this.edit1.setHint("Введите код");
        this.edit2.setVisibility(8);
        this.edit3.setVisibility(8);
        this.textRestore.setVisibility(8);
        this.edit1.setKeyListener(DigitsKeyListener.getInstance(getContext().getString(R.string.common_edittext_allowed_characters)));
        this.edit1.setRawInputType(128);
        this.edit1.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        this.edit1.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.edit1.setText("");
        this.edit2.setText("");
        this.butt.setAlpha(0.5f);
        this.edit1.setOnKeyListener(new View.OnKeyListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.9
            public AnonymousClass9() {
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() > 0) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                } else {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                }
                if (i != 66) {
                    return false;
                }
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                view.setFocusable(false);
                view.setFocusableInTouchMode(true);
                return true;
            }
        });
        this.edit1.setOnBackPressListener(new CustomEditTextWithBackPressEvent.MyEditTextListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.10
            public AnonymousClass10() {
            }

            @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
            public void callback() {
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
            }
        });
        this.butBack.setVisibility(0);
        this.butBack.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.11
            public AnonymousClass11() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
                UIContainer uIContainer = UILayoutRegistrationCreatePassword.this.mUIParent.mContainer;
                UILayoutRegistrationGeneral unused = UILayoutRegistrationCreatePassword.this.mUIParent;
                uIContainer.setCurrentLayout(4);
                return false;
            }
        });
        this.butt.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.12
            public AnonymousClass12() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() > 0) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                } else {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                }
                if (view.getAlpha() < 1.0f) {
                    return;
                }
                view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("t", 8);
                    jSONObject.put("r", UILayoutRegistrationCreatePassword.this.edit1.getText().toString());
                    jSONObject.put("tt", 0);
                    UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
                } catch (Exception unused) {
                }
            }
        });
        int i = this.mRoot.mRestoreMethod;
        if (i == 1) {
            str = "вам в Telegram";
        } else if (i != 2) {
            str = "на ваш e-mail";
        } else {
            str = "вам в VK";
        }
        this.mUIParent.textHint.setText(Html.fromHtml("Забыли свой пароль? Мы выслали код восстановления" + str + ". Проверьте указанное место и введите код в поле справа."));
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$9 */
    public class AnonymousClass9 implements View.OnKeyListener {
        public AnonymousClass9() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() > 0) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
            } else {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            }
            if (i != 66) {
                return false;
            }
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            view.setFocusable(false);
            view.setFocusableInTouchMode(true);
            return true;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$10 */
    public class AnonymousClass10 implements CustomEditTextWithBackPressEvent.MyEditTextListener {
        public AnonymousClass10() {
        }

        @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
        public void callback() {
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$11 */
    public class AnonymousClass11 implements View.OnTouchListener {
        public AnonymousClass11() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
            UIContainer uIContainer = UILayoutRegistrationCreatePassword.this.mUIParent.mContainer;
            UILayoutRegistrationGeneral unused = UILayoutRegistrationCreatePassword.this.mUIParent;
            uIContainer.setCurrentLayout(4);
            return false;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$12 */
    public class AnonymousClass12 implements View.OnClickListener {
        public AnonymousClass12() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() > 0) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
            } else {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            }
            if (view.getAlpha() < 1.0f) {
                return;
            }
            view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("t", 8);
                jSONObject.put("r", UILayoutRegistrationCreatePassword.this.edit1.getText().toString());
                jSONObject.put("tt", 0);
                UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    public final void RestoreNewSet() {
        this.textHeader.setVisibility(8);
        this.butt.setText("Подтвердить");
        this.edit1.setVisibility(0);
        this.edit1.setHint("Новый пароль");
        this.edit2.setVisibility(0);
        this.edit2.setHint("Повторите новый пароль");
        this.edit3.setVisibility(8);
        this.textRestore.setVisibility(8);
        this.edit1.setKeyListener(DigitsKeyListener.getInstance(getContext().getString(R.string.common_edittext_allowed_characters)));
        this.edit1.setRawInputType(128);
        this.edit1.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.edit1.setFilters(new InputFilter[]{new InputFilter.LengthFilter(16)});
        this.edit2.setKeyListener(DigitsKeyListener.getInstance(getContext().getString(R.string.common_edittext_allowed_characters)));
        this.edit2.setRawInputType(128);
        this.edit2.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.edit2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(16)});
        this.edit1.setText("");
        this.edit2.setText("");
        this.butt.setAlpha(0.5f);
        this.edit1.setOnKeyListener(new View.OnKeyListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.13
            public AnonymousClass13() {
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() >= 6 && UILayoutRegistrationCreatePassword.this.edit1.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit2.getText().toString())) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                    return false;
                }
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                return false;
            }
        });
        this.edit1.setOnBackPressListener(new CustomEditTextWithBackPressEvent.MyEditTextListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.14
            public AnonymousClass14() {
            }

            @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
            public void callback() {
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
            }
        });
        this.edit2.setOnKeyListener(new View.OnKeyListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.15
            public AnonymousClass15() {
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (UILayoutRegistrationCreatePassword.this.edit2.getText().length() >= 6 && UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit1.getText().toString())) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                } else {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                }
                if (i != 66) {
                    return false;
                }
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                view.setFocusable(false);
                view.setFocusableInTouchMode(true);
                return true;
            }
        });
        this.edit2.setOnBackPressListener(new CustomEditTextWithBackPressEvent.MyEditTextListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.16
            public AnonymousClass16() {
            }

            @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
            public void callback() {
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                UILayoutRegistrationCreatePassword.this.edit2.setFocusable(false);
                UILayoutRegistrationCreatePassword.this.edit2.setFocusableInTouchMode(true);
            }
        });
        this.butBack.setVisibility(0);
        this.butBack.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.17
            public AnonymousClass17() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
                UIContainer uIContainer = UILayoutRegistrationCreatePassword.this.mUIParent.mContainer;
                UILayoutRegistrationGeneral unused = UILayoutRegistrationCreatePassword.this.mUIParent;
                uIContainer.setCurrentLayout(4);
                return false;
            }
        });
        this.butt.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.18
            public AnonymousClass18() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (UILayoutRegistrationCreatePassword.this.edit2.getText().length() >= 6 && UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit1.getText().toString())) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                } else {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                }
                if (view.getAlpha() < 1.0f) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("d", 3);
                        jSONObject.put("t", 2);
                        jSONObject.put("s", -99);
                        if (!UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit1.getText().toString())) {
                            jSONObject.put("i", "Пароли не совпадают");
                        } else if (UILayoutRegistrationCreatePassword.this.edit2.getText().length() == 0) {
                            jSONObject.put("i", "Придумайте пароль");
                        } else {
                            jSONObject.put("i", "Пароль слишком короткий");
                        }
                        UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.showGUI(13, jSONObject);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("t", 8);
                    jSONObject2.put("r", UILayoutRegistrationCreatePassword.this.edit1.getText().toString());
                    jSONObject2.put("tt", 4);
                    UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject2);
                } catch (Exception unused2) {
                }
            }
        });
        this.mUIParent.textHint.setText(Html.fromHtml("Отлично! Код подошел. Теперь придумайте новый пароль, а затем повторите его."));
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$13 */
    public class AnonymousClass13 implements View.OnKeyListener {
        public AnonymousClass13() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() >= 6 && UILayoutRegistrationCreatePassword.this.edit1.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit2.getText().toString())) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                return false;
            }
            UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            return false;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$14 */
    public class AnonymousClass14 implements CustomEditTextWithBackPressEvent.MyEditTextListener {
        public AnonymousClass14() {
        }

        @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
        public void callback() {
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$15 */
    public class AnonymousClass15 implements View.OnKeyListener {
        public AnonymousClass15() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (UILayoutRegistrationCreatePassword.this.edit2.getText().length() >= 6 && UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit1.getText().toString())) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
            } else {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            }
            if (i != 66) {
                return false;
            }
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            view.setFocusable(false);
            view.setFocusableInTouchMode(true);
            return true;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$16 */
    public class AnonymousClass16 implements CustomEditTextWithBackPressEvent.MyEditTextListener {
        public AnonymousClass16() {
        }

        @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
        public void callback() {
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            UILayoutRegistrationCreatePassword.this.edit2.setFocusable(false);
            UILayoutRegistrationCreatePassword.this.edit2.setFocusableInTouchMode(true);
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$17 */
    public class AnonymousClass17 implements View.OnTouchListener {
        public AnonymousClass17() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
            UIContainer uIContainer = UILayoutRegistrationCreatePassword.this.mUIParent.mContainer;
            UILayoutRegistrationGeneral unused = UILayoutRegistrationCreatePassword.this.mUIParent;
            uIContainer.setCurrentLayout(4);
            return false;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$18 */
    public class AnonymousClass18 implements View.OnClickListener {
        public AnonymousClass18() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (UILayoutRegistrationCreatePassword.this.edit2.getText().length() >= 6 && UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit1.getText().toString())) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
            } else {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            }
            if (view.getAlpha() < 1.0f) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("d", 3);
                    jSONObject.put("t", 2);
                    jSONObject.put("s", -99);
                    if (!UILayoutRegistrationCreatePassword.this.edit2.getText().toString().equals(UILayoutRegistrationCreatePassword.this.edit1.getText().toString())) {
                        jSONObject.put("i", "Пароли не совпадают");
                    } else if (UILayoutRegistrationCreatePassword.this.edit2.getText().length() == 0) {
                        jSONObject.put("i", "Придумайте пароль");
                    } else {
                        jSONObject.put("i", "Пароль слишком короткий");
                    }
                    UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.showGUI(13, jSONObject);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("t", 8);
                jSONObject2.put("r", UILayoutRegistrationCreatePassword.this.edit1.getText().toString());
                jSONObject2.put("tt", 4);
                UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject2);
            } catch (Exception unused2) {
            }
        }
    }

    public final void PinSet() {
        this.textHeader.setVisibility(0);
        this.textHeader.setText("Введите пин-код:");
        this.butt.setText("Подтвердить");
        this.edit1.setVisibility(0);
        this.edit1.setHint("Введите пин-код");
        this.edit2.setVisibility(8);
        this.edit3.setVisibility(8);
        this.textRestore.setVisibility(0);
        this.butBack.setVisibility(4);
        this.textRestore.setVisibility(0);
        this.textRestore.setText(Html.fromHtml("<u>Восстановить пин-код</u>"));
        this.edit1.setKeyListener(DigitsKeyListener.getInstance(getContext().getString(R.string.common_edittext_allowed_characters)));
        this.edit1.setRawInputType(2);
        this.edit1.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.edit1.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
        this.edit1.setText("");
        this.edit2.setText("");
        this.butt.setAlpha(0.5f);
        this.edit1.setOnKeyListener(new View.OnKeyListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.19
            public AnonymousClass19() {
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() >= 4) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                } else {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                }
                if (i != 66) {
                    return false;
                }
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                view.setFocusable(false);
                view.setFocusableInTouchMode(true);
                return true;
            }
        });
        this.edit1.setOnBackPressListener(new CustomEditTextWithBackPressEvent.MyEditTextListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.20
            public AnonymousClass20() {
            }

            @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
            public void callback() {
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
            }
        });
        this.textRestore.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.21
            public AnonymousClass21() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("t", 7);
                    jSONObject.put("r", 1);
                    UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
                } catch (Exception unused) {
                }
            }
        });
        this.butt.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.22
            public AnonymousClass22() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() >= 4) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                } else {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                }
                if (view.getAlpha() < 1.0f) {
                    return;
                }
                view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("t", 8);
                    jSONObject.put("r", UILayoutRegistrationCreatePassword.this.edit1.getText().toString());
                    jSONObject.put("tt", 1);
                    UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
                } catch (Exception unused) {
                }
            }
        });
        this.mUIParent.textHint.setText(Html.fromHtml("Если вы забыли свой пин-код вы можете восстановить его. Нажмите на «Восстановить пин-код» и мы отправим его на ваш e-mail.."));
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$19 */
    public class AnonymousClass19 implements View.OnKeyListener {
        public AnonymousClass19() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() >= 4) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
            } else {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            }
            if (i != 66) {
                return false;
            }
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            view.setFocusable(false);
            view.setFocusableInTouchMode(true);
            return true;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$20 */
    public class AnonymousClass20 implements CustomEditTextWithBackPressEvent.MyEditTextListener {
        public AnonymousClass20() {
        }

        @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
        public void callback() {
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$21 */
    public class AnonymousClass21 implements View.OnClickListener {
        public AnonymousClass21() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("t", 7);
                jSONObject.put("r", 1);
                UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$22 */
    public class AnonymousClass22 implements View.OnClickListener {
        public AnonymousClass22() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() >= 4) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
            } else {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            }
            if (view.getAlpha() < 1.0f) {
                return;
            }
            view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("t", 8);
                jSONObject.put("r", UILayoutRegistrationCreatePassword.this.edit1.getText().toString());
                jSONObject.put("tt", 1);
                UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    public final void PinRestoreSet() {
        this.textHeader.setVisibility(0);
        this.textHeader.setText("Введите код аутентификатора:");
        this.butt.setText("Подтвердить");
        this.edit1.setVisibility(0);
        this.edit1.setHint("Введите код");
        this.edit2.setVisibility(8);
        this.edit3.setVisibility(8);
        this.textRestore.setVisibility(0);
        this.edit1.setKeyListener(DigitsKeyListener.getInstance(getContext().getString(R.string.common_edittext_allowed_characters)));
        this.edit1.setRawInputType(128);
        this.edit1.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.edit1.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        if (this.mRoot.mT != 2) {
            this.butBack.setVisibility(0);
        } else {
            this.butBack.setVisibility(4);
        }
        this.textRestore.setVisibility(0);
        this.textRestore.setText(Html.fromHtml("<u>Восстановить код</u>"));
        this.edit1.setText("");
        this.edit2.setText("");
        this.butt.setAlpha(0.5f);
        this.edit1.setOnKeyListener(new View.OnKeyListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.23
            public AnonymousClass23() {
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() > 0) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                } else {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                }
                if (i != 66) {
                    return false;
                }
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                view.setFocusable(false);
                view.setFocusableInTouchMode(true);
                return true;
            }
        });
        this.edit1.setOnBackPressListener(new CustomEditTextWithBackPressEvent.MyEditTextListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.24
            public AnonymousClass24() {
            }

            @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
            public void callback() {
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
            }
        });
        this.butBack.setVisibility(0);
        this.butBack.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.25
            public AnonymousClass25() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                UILayoutRegistrationCreatePassword.this.mRoot.mRestoreSet = 2;
                UILayoutRegistrationCreatePassword.this.PinSet();
                return false;
            }
        });
        this.textRestore.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.26
            public AnonymousClass26() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (UILayoutRegistrationCreatePassword.this.mRoot.mT != 2) {
                    view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
                }
                UILayoutRegistrationCreatePassword.this.mRoot.mRestoreSet = 4;
                UILayoutRegistrationCreatePassword.this.PinAuthSet();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("t", 7);
                    jSONObject.put("r", 2);
                    UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
                } catch (Exception unused) {
                }
            }
        });
        this.butt.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.27
            public AnonymousClass27() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() > 0) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                } else {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                }
                if (view.getAlpha() < 1.0f) {
                    return;
                }
                view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("t", 8);
                    jSONObject.put("r", UILayoutRegistrationCreatePassword.this.edit1.getText().toString());
                    jSONObject.put("tt", 2);
                    UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
                } catch (Exception unused) {
                }
            }
        });
        this.mUIParent.textHint.setText(Html.fromHtml("Введите код Google Authenticator в поле справа."));
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$23 */
    public class AnonymousClass23 implements View.OnKeyListener {
        public AnonymousClass23() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() > 0) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
            } else {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            }
            if (i != 66) {
                return false;
            }
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            view.setFocusable(false);
            view.setFocusableInTouchMode(true);
            return true;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$24 */
    public class AnonymousClass24 implements CustomEditTextWithBackPressEvent.MyEditTextListener {
        public AnonymousClass24() {
        }

        @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
        public void callback() {
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$25 */
    public class AnonymousClass25 implements View.OnTouchListener {
        public AnonymousClass25() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            UILayoutRegistrationCreatePassword.this.mRoot.mRestoreSet = 2;
            UILayoutRegistrationCreatePassword.this.PinSet();
            return false;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$26 */
    public class AnonymousClass26 implements View.OnClickListener {
        public AnonymousClass26() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (UILayoutRegistrationCreatePassword.this.mRoot.mT != 2) {
                view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
            }
            UILayoutRegistrationCreatePassword.this.mRoot.mRestoreSet = 4;
            UILayoutRegistrationCreatePassword.this.PinAuthSet();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("t", 7);
                jSONObject.put("r", 2);
                UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$27 */
    public class AnonymousClass27 implements View.OnClickListener {
        public AnonymousClass27() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() > 0) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
            } else {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            }
            if (view.getAlpha() < 1.0f) {
                return;
            }
            view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("t", 8);
                jSONObject.put("r", UILayoutRegistrationCreatePassword.this.edit1.getText().toString());
                jSONObject.put("tt", 2);
                UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    public final void PinAuthSet() {
        this.textHeader.setVisibility(0);
        this.textHeader.setText("Введите код отключения:");
        this.butt.setText("Подтвердить");
        this.edit1.setVisibility(0);
        this.edit1.setHint("Введите код");
        this.edit2.setVisibility(8);
        this.edit3.setVisibility(8);
        this.textRestore.setVisibility(0);
        this.butBack.setVisibility(0);
        this.textRestore.setVisibility(8);
        this.edit1.setInputType(128);
        this.edit1.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        this.edit1.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.edit1.setText("");
        this.edit2.setText("");
        this.butt.setAlpha(0.5f);
        this.edit1.setOnKeyListener(new View.OnKeyListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.28
            public AnonymousClass28() {
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() > 0) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                } else {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                }
                if (i != 66) {
                    return false;
                }
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                view.setFocusable(false);
                view.setFocusableInTouchMode(true);
                return true;
            }
        });
        this.edit1.setOnBackPressListener(new CustomEditTextWithBackPressEvent.MyEditTextListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.29
            public AnonymousClass29() {
            }

            @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
            public void callback() {
                JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
                ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
                UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
            }
        });
        this.butBack.setVisibility(0);
        this.butBack.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.30
            public AnonymousClass30() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (UILayoutRegistrationCreatePassword.this.mRoot.mT != 2) {
                    view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
                }
                UILayoutRegistrationCreatePassword.this.mRoot.mRestoreSet = 3;
                UILayoutRegistrationCreatePassword.this.PinRestoreSet();
                return false;
            }
        });
        this.butt.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword.31
            public AnonymousClass31() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() > 0) {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
                } else {
                    UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
                }
                if (view.getAlpha() < 1.0f) {
                    return;
                }
                view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("t", 8);
                    jSONObject.put("r", UILayoutRegistrationCreatePassword.this.edit1.getText().toString());
                    jSONObject.put("tt", 3);
                    UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
                } catch (Exception unused) {
                }
            }
        });
        this.mUIParent.textHint.setText(Html.fromHtml("На вашу почту был отправлен код отключения Google Authenticator. Введите его в поле справа."));
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$28 */
    public class AnonymousClass28 implements View.OnKeyListener {
        public AnonymousClass28() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() > 0) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
            } else {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            }
            if (i != 66) {
                return false;
            }
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            view.setFocusable(false);
            view.setFocusableInTouchMode(true);
            return true;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$29 */
    public class AnonymousClass29 implements CustomEditTextWithBackPressEvent.MyEditTextListener {
        public AnonymousClass29() {
        }

        @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
        public void callback() {
            JNIActivity jNIActivity = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            JNIActivity jNIActivity2 = UILayoutRegistrationCreatePassword.this.mRoot.mActivity;
            ((InputMethodManager) jNIActivity.getSystemService("input_method")).hideSoftInputFromWindow(UILayoutRegistrationCreatePassword.this.mViewRoot.getWindowToken(), 0);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusable(false);
            UILayoutRegistrationCreatePassword.this.edit1.setFocusableInTouchMode(true);
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$30 */
    public class AnonymousClass30 implements View.OnTouchListener {
        public AnonymousClass30() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (UILayoutRegistrationCreatePassword.this.mRoot.mT != 2) {
                view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
            }
            UILayoutRegistrationCreatePassword.this.mRoot.mRestoreSet = 3;
            UILayoutRegistrationCreatePassword.this.PinRestoreSet();
            return false;
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.registration.UILayoutRegistrationCreatePassword$31 */
    public class AnonymousClass31 implements View.OnClickListener {
        public AnonymousClass31() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (UILayoutRegistrationCreatePassword.this.edit1.getText().length() > 0) {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(1.0f);
            } else {
                UILayoutRegistrationCreatePassword.this.butt.setAlpha(0.5f);
            }
            if (view.getAlpha() < 1.0f) {
                return;
            }
            view.startAnimation(UILayoutRegistrationCreatePassword.this.mRoot.mAnim);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("t", 8);
                jSONObject.put("r", UILayoutRegistrationCreatePassword.this.edit1.getText().toString());
                jSONObject.put("tt", 3);
                UILayoutRegistrationCreatePassword.this.mRoot.mGUIManager.sendJsonData(38, jSONObject);
            } catch (Exception unused) {
            }
        }
    }
}
