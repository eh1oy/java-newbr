package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.R;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public final class DrivingSchoolEndTestBinding implements ViewBinding {

    @NonNull
    public final View bgEndTest;

    @NonNull
    public final View borderEntTest;

    @NonNull
    public final AppCompatButton buttonStartPractice;

    @NonNull
    public final ImageView iconResultFace;

    @NonNull
    public final View radialBgEntTest;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView textResultTest;

    @NonNull
    public final TextView titleResultTest;

    @NonNull
    public final TextView valueResultTest;

    public DrivingSchoolEndTestBinding(@NonNull ConstraintLayout rootView, @NonNull View bgEndTest, @NonNull View borderEntTest, @NonNull AppCompatButton buttonStartPractice, @NonNull ImageView iconResultFace, @NonNull View radialBgEntTest, @NonNull TextView textResultTest, @NonNull TextView titleResultTest, @NonNull TextView valueResultTest) {
        this.rootView = rootView;
        this.bgEndTest = bgEndTest;
        this.borderEntTest = borderEntTest;
        this.buttonStartPractice = buttonStartPractice;
        this.iconResultFace = iconResultFace;
        this.radialBgEntTest = radialBgEntTest;
        this.textResultTest = textResultTest;
        this.titleResultTest = titleResultTest;
        this.valueResultTest = valueResultTest;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DrivingSchoolEndTestBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DrivingSchoolEndTestBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.driving_school_end_test, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static DrivingSchoolEndTestBinding bind(@NonNull View rootView) {
        int i = R.id.bg_end_test;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_end_test);
        if (findChildViewById != null) {
            i = R.id.border_ent_test;
            View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.border_ent_test);
            if (findChildViewById2 != null) {
                i = R.id.button_start_practice;
                AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_start_practice);
                if (appCompatButton != null) {
                    i = R.id.icon_result_face;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_result_face);
                    if (imageView != null) {
                        i = R.id.radial_bg_ent_test;
                        View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.radial_bg_ent_test);
                        if (findChildViewById3 != null) {
                            i = R.id.text_result_test;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_result_test);
                            if (textView != null) {
                                i = R.id.title_result_test;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_result_test);
                                if (textView2 != null) {
                                    i = R.id.value_result_test;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_result_test);
                                    if (textView3 != null) {
                                        return new DrivingSchoolEndTestBinding((ConstraintLayout) rootView, findChildViewById, findChildViewById2, appCompatButton, imageView, findChildViewById3, textView, textView2, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
