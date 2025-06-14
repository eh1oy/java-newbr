package com.blackhub.bronline.game.gui.brdialogwindow;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.ISAMPGUI;
import com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public class BrDialogWindow implements ISAMPGUI {
    public GUIManager mManager = null;
    public PopupWindow mWindow = null;
    public JNIActivity mActivity = null;
    public View mView = null;
    public View mSelectedButton = null;
    public TextView mOrigButton = null;
    public int mClickedButton = -1;
    public CustomEditTextWithBackPressEvent mEditText = null;
    public String mListitemToSend = null;
    public boolean mIsTab = false;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 10;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(JSONObject json) {
    }

    public static ISAMPGUI newInstance() {
        return new BrDialogWindow();
    }

    public final String[] getSplittedStrings(String content) {
        return content.split(Pattern.quote(StringUtils.LF));
    }

    public final String[] getSplittedTabs(String content) {
        return content.split(Pattern.quote("\t"));
    }

    public float[] calcuteStringsLength(TextView textView, String[] strings) {
        float[] fArr = new float[strings.length];
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(textView.getTextSize());
        textPaint.setTypeface(textView.getTypeface());
        for (int i = 0; i < strings.length; i++) {
            fArr[i] = new StaticLayout(UsefulKt.transformColors(strings[i]), textPaint, 10000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getLineWidth(0) + 5.0f;
        }
        return fArr;
    }

    public final TextView createButtonFromOrig(TextView btn_orig, boolean margin, boolean tabbed) {
        TextView textView = new TextView(this.mActivity);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (margin) {
            layoutParams.topMargin = IntExtensionKt.dpToPx(6, this.mActivity);
        }
        textView.setLayoutParams(layoutParams);
        textView.setBackground(btn_orig.getBackground());
        textView.setTypeface(btn_orig.getTypeface());
        textView.setGravity(btn_orig.getGravity());
        if (!tabbed) {
            textView.setPadding(btn_orig.getPaddingLeft(), btn_orig.getPaddingTop(), btn_orig.getPaddingRight(), btn_orig.getPaddingBottom());
        }
        textView.setAllCaps(false);
        textView.setTextColor(btn_orig.getTextColors().getDefaultColor());
        textView.setTextSize(0, btn_orig.getTextSize());
        return textView;
    }

    public final float[][] getColumnsWidth(TextView textView, String[] strings) {
        float[][] fArr = new float[strings.length][];
        for (int i = 0; i < strings.length; i++) {
            String[] splittedTabs = getSplittedTabs(strings[i]);
            fArr[i] = new float[splittedTabs.length];
            for (int i2 = 0; i2 < splittedTabs.length; i2++) {
                textView.setText(UsefulKt.transformColors(splittedTabs[i2]));
                fArr[i][i2] = UsefulKt.getTextLength(textView) + IntExtensionKt.dpToPx(54, this.mActivity);
            }
        }
        return fArr;
    }

    public final float[] getMaxWidths(float[][] floats) {
        float[] fArr = new float[5];
        for (int i = 0; i < 5; i++) {
            fArr[i] = -1.0f;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            for (float[] fArr2 : floats) {
                if (i2 < fArr2.length) {
                    float f = fArr2[i2];
                    if (f >= fArr[i2]) {
                        fArr[i2] = f;
                    }
                }
            }
        }
        return fArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03ba A[Catch: Exception -> 0x0055, TryCatch #4 {Exception -> 0x0055, blocks: (B:3:0x0008, B:5:0x0014, B:6:0x0058, B:20:0x0097, B:22:0x00e1, B:24:0x00e7, B:34:0x00fe, B:39:0x03dc, B:41:0x03f6, B:48:0x041c, B:50:0x0431, B:52:0x0133, B:54:0x0157, B:55:0x0166, B:57:0x016a, B:58:0x0177, B:60:0x017f, B:62:0x018c, B:63:0x0192, B:65:0x0195, B:67:0x019e, B:68:0x01a3, B:70:0x01a9, B:73:0x01b4, B:75:0x01b7, B:78:0x01d4, B:80:0x01da, B:83:0x01df, B:84:0x01e2, B:86:0x01e5, B:90:0x01ec, B:93:0x01ef, B:95:0x0209, B:96:0x020c, B:98:0x020f, B:100:0x021b, B:102:0x0223, B:103:0x0228, B:104:0x0265, B:107:0x026a, B:109:0x027b, B:110:0x0284, B:111:0x02b6, B:113:0x02b9, B:117:0x02f3, B:118:0x030e, B:120:0x0318, B:122:0x0324, B:127:0x02e5, B:128:0x02ec, B:130:0x032d, B:134:0x033a, B:136:0x0368, B:140:0x038d, B:141:0x03ba, B:43:0x0412), top: B:2:0x0008, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1 A[Catch: Exception -> 0x0055, TryCatch #4 {Exception -> 0x0055, blocks: (B:3:0x0008, B:5:0x0014, B:6:0x0058, B:20:0x0097, B:22:0x00e1, B:24:0x00e7, B:34:0x00fe, B:39:0x03dc, B:41:0x03f6, B:48:0x041c, B:50:0x0431, B:52:0x0133, B:54:0x0157, B:55:0x0166, B:57:0x016a, B:58:0x0177, B:60:0x017f, B:62:0x018c, B:63:0x0192, B:65:0x0195, B:67:0x019e, B:68:0x01a3, B:70:0x01a9, B:73:0x01b4, B:75:0x01b7, B:78:0x01d4, B:80:0x01da, B:83:0x01df, B:84:0x01e2, B:86:0x01e5, B:90:0x01ec, B:93:0x01ef, B:95:0x0209, B:96:0x020c, B:98:0x020f, B:100:0x021b, B:102:0x0223, B:103:0x0228, B:104:0x0265, B:107:0x026a, B:109:0x027b, B:110:0x0284, B:111:0x02b6, B:113:0x02b9, B:117:0x02f3, B:118:0x030e, B:120:0x0318, B:122:0x0324, B:127:0x02e5, B:128:0x02ec, B:130:0x032d, B:134:0x033a, B:136:0x0368, B:140:0x038d, B:141:0x03ba, B:43:0x0412), top: B:2:0x0008, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03f6 A[Catch: Exception -> 0x0055, TRY_LEAVE, TryCatch #4 {Exception -> 0x0055, blocks: (B:3:0x0008, B:5:0x0014, B:6:0x0058, B:20:0x0097, B:22:0x00e1, B:24:0x00e7, B:34:0x00fe, B:39:0x03dc, B:41:0x03f6, B:48:0x041c, B:50:0x0431, B:52:0x0133, B:54:0x0157, B:55:0x0166, B:57:0x016a, B:58:0x0177, B:60:0x017f, B:62:0x018c, B:63:0x0192, B:65:0x0195, B:67:0x019e, B:68:0x01a3, B:70:0x01a9, B:73:0x01b4, B:75:0x01b7, B:78:0x01d4, B:80:0x01da, B:83:0x01df, B:84:0x01e2, B:86:0x01e5, B:90:0x01ec, B:93:0x01ef, B:95:0x0209, B:96:0x020c, B:98:0x020f, B:100:0x021b, B:102:0x0223, B:103:0x0228, B:104:0x0265, B:107:0x026a, B:109:0x027b, B:110:0x0284, B:111:0x02b6, B:113:0x02b9, B:117:0x02f3, B:118:0x030e, B:120:0x0318, B:122:0x0324, B:127:0x02e5, B:128:0x02ec, B:130:0x032d, B:134:0x033a, B:136:0x0368, B:140:0x038d, B:141:0x03ba, B:43:0x0412), top: B:2:0x0008, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0431 A[Catch: Exception -> 0x0055, TRY_LEAVE, TryCatch #4 {Exception -> 0x0055, blocks: (B:3:0x0008, B:5:0x0014, B:6:0x0058, B:20:0x0097, B:22:0x00e1, B:24:0x00e7, B:34:0x00fe, B:39:0x03dc, B:41:0x03f6, B:48:0x041c, B:50:0x0431, B:52:0x0133, B:54:0x0157, B:55:0x0166, B:57:0x016a, B:58:0x0177, B:60:0x017f, B:62:0x018c, B:63:0x0192, B:65:0x0195, B:67:0x019e, B:68:0x01a3, B:70:0x01a9, B:73:0x01b4, B:75:0x01b7, B:78:0x01d4, B:80:0x01da, B:83:0x01df, B:84:0x01e2, B:86:0x01e5, B:90:0x01ec, B:93:0x01ef, B:95:0x0209, B:96:0x020c, B:98:0x020f, B:100:0x021b, B:102:0x0223, B:103:0x0228, B:104:0x0265, B:107:0x026a, B:109:0x027b, B:110:0x0284, B:111:0x02b6, B:113:0x02b9, B:117:0x02f3, B:118:0x030e, B:120:0x0318, B:122:0x0324, B:127:0x02e5, B:128:0x02ec, B:130:0x032d, B:134:0x033a, B:136:0x0368, B:140:0x038d, B:141:0x03ba, B:43:0x0412), top: B:2:0x0008, inners: #2 }] */
    @Override // com.blackhub.bronline.game.ISAMPGUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void show(org.json.JSONObject r18, com.blackhub.bronline.game.GUIManager r19, final com.blackhub.bronline.game.core.JNIActivity r20) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.brdialogwindow.BrDialogWindow.show(org.json.JSONObject, com.blackhub.bronline.game.GUIManager, com.blackhub.bronline.game.core.JNIActivity):void");
    }

    public final /* synthetic */ void lambda$show$0(JNIActivity jNIActivity) {
        UtilsKt.crashlyticsLog("BrDialogWindow getCurrentState2: " + jNIActivity.getLifecycle().getState());
        if (UsefulKt.isActivityValid(jNIActivity)) {
            UtilsKt.crashlyticsLog("BrDialogWindow activity is VALID. SHOW()");
            this.mWindow.showAtLocation(jNIActivity.getParentLayout(), 17, 0, 0);
        }
    }

    public final void sendResponse(int button) {
        int i;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("r", button);
            String str = this.mListitemToSend;
            if (str != null) {
                String str2 = getSplittedTabs(str)[0];
                for (int i2 = 0; i2 < str2.length(); i2++) {
                    if (str2.charAt(i2) == '{' && (i = i2 + 7) < str2.length() && str2.charAt(i) == '}') {
                        str2 = str2.replaceAll(Pattern.quote(str2.substring(i2, i2 + 8)), "");
                    }
                }
                jSONObject.put("i", str2);
                this.mListitemToSend = null;
            } else {
                jSONObject.put("i", this.mEditText.getText().toString());
            }
            jSONObject.put("l", this.mClickedButton);
        } catch (Exception unused) {
        }
        this.mManager.sendJsonData(10, jSONObject);
        this.mManager.closeSAMPWindow(null);
        this.mClickedButton = -1;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void close(JSONObject json) {
        PopupWindow popupWindow = this.mWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public boolean isShowingGui() {
        PopupWindow popupWindow = this.mWindow;
        if (popupWindow == null) {
            return false;
        }
        return popupWindow.isShowing();
    }
}
