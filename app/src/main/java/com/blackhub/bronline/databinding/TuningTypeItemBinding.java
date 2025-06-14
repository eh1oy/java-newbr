package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.R;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public final class TuningTypeItemBinding implements ViewBinding {

    @NonNull
    public final View bgClickTitle;

    @NonNull
    public final View bgTitleTypeTuning;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView titleTypeTuning;

    public TuningTypeItemBinding(@NonNull ConstraintLayout rootView, @NonNull View bgClickTitle, @NonNull View bgTitleTypeTuning, @NonNull TextView titleTypeTuning) {
        this.rootView = rootView;
        this.bgClickTitle = bgClickTitle;
        this.bgTitleTypeTuning = bgTitleTypeTuning;
        this.titleTypeTuning = titleTypeTuning;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static TuningTypeItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static TuningTypeItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.tuning_type_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static TuningTypeItemBinding bind(@NonNull View rootView) {
        int i = R.id.bg_click_title;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_click_title);
        if (findChildViewById != null) {
            i = R.id.bg_title_type_tuning;
            View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.bg_title_type_tuning);
            if (findChildViewById2 != null) {
                i = R.id.title_type_tuning;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_type_tuning);
                if (textView != null) {
                    return new TuningTypeItemBinding((ConstraintLayout) rootView, findChildViewById, findChildViewById2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
