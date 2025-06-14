package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public final class TuningColorItemBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final View tuningColorItemBorder;

    @NonNull
    public final View tuningColorItemCheckedStartColor;

    @NonNull
    public final View tuningColorItemColor;

    public TuningColorItemBinding(@NonNull ConstraintLayout rootView, @NonNull View tuningColorItemBorder, @NonNull View tuningColorItemCheckedStartColor, @NonNull View tuningColorItemColor) {
        this.rootView = rootView;
        this.tuningColorItemBorder = tuningColorItemBorder;
        this.tuningColorItemCheckedStartColor = tuningColorItemCheckedStartColor;
        this.tuningColorItemColor = tuningColorItemColor;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static TuningColorItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static TuningColorItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.tuning_color_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static TuningColorItemBinding bind(@NonNull View rootView) {
        int i = R.id.tuning_color_item_border;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.tuning_color_item_border);
        if (findChildViewById != null) {
            i = R.id.tuning_color_item_checked_start_color;
            View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.tuning_color_item_checked_start_color);
            if (findChildViewById2 != null) {
                i = R.id.tuning_color_item_color;
                View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.tuning_color_item_color);
                if (findChildViewById3 != null) {
                    return new TuningColorItemBinding((ConstraintLayout) rootView, findChildViewById, findChildViewById2, findChildViewById3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
