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
public final class FractionsTestingResultLayoutBinding implements ViewBinding {

    @NonNull
    public final View bgEffectShadow;

    @NonNull
    public final View bgViewEllipse;

    @NonNull
    public final View bgViewRays;

    @NonNull
    public final AppCompatButton buttonNext;

    @NonNull
    public final ImageView imageViewSun;

    @NonNull
    public final View mainViewTestingResult;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView textViewCorrectAnswers;

    @NonNull
    public final TextView textViewDescriptionOfResult;

    @NonNull
    public final TextView textViewTitleOfResult;

    public FractionsTestingResultLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull View bgEffectShadow, @NonNull View bgViewEllipse, @NonNull View bgViewRays, @NonNull AppCompatButton buttonNext, @NonNull ImageView imageViewSun, @NonNull View mainViewTestingResult, @NonNull TextView textViewCorrectAnswers, @NonNull TextView textViewDescriptionOfResult, @NonNull TextView textViewTitleOfResult) {
        this.rootView = rootView;
        this.bgEffectShadow = bgEffectShadow;
        this.bgViewEllipse = bgViewEllipse;
        this.bgViewRays = bgViewRays;
        this.buttonNext = buttonNext;
        this.imageViewSun = imageViewSun;
        this.mainViewTestingResult = mainViewTestingResult;
        this.textViewCorrectAnswers = textViewCorrectAnswers;
        this.textViewDescriptionOfResult = textViewDescriptionOfResult;
        this.textViewTitleOfResult = textViewTitleOfResult;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FractionsTestingResultLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FractionsTestingResultLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fractions_testing_result_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static FractionsTestingResultLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.bg_effect_shadow;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_effect_shadow);
        if (findChildViewById != null) {
            i = R.id.bg_view_ellipse;
            View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.bg_view_ellipse);
            if (findChildViewById2 != null) {
                i = R.id.bg_view_rays;
                View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.bg_view_rays);
                if (findChildViewById3 != null) {
                    i = R.id.button_next;
                    AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_next);
                    if (appCompatButton != null) {
                        i = R.id.image_view_sun;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image_view_sun);
                        if (imageView != null) {
                            i = R.id.main_view_testing_result;
                            View findChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.main_view_testing_result);
                            if (findChildViewById4 != null) {
                                i = R.id.text_view_correct_answers;
                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_correct_answers);
                                if (textView != null) {
                                    i = R.id.text_view_description_of_result;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_description_of_result);
                                    if (textView2 != null) {
                                        i = R.id.text_view_title_of_result;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_title_of_result);
                                        if (textView3 != null) {
                                            return new FractionsTestingResultLayoutBinding((ConstraintLayout) rootView, findChildViewById, findChildViewById2, findChildViewById3, appCompatButton, imageView, findChildViewById4, textView, textView2, textView3);
                                        }
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
