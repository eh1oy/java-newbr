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
import com.blackhub.bronline.game.common.UIContainer;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public final class DrivingSchoolMainDialogBinding implements ViewBinding {

    @NonNull
    public final View drivingSchoolClose;

    @NonNull
    public final UIContainer drivingSchoolMainContainer;

    @NonNull
    public final ConstraintLayout rootView;

    public DrivingSchoolMainDialogBinding(@NonNull ConstraintLayout rootView, @NonNull View drivingSchoolClose, @NonNull UIContainer drivingSchoolMainContainer) {
        this.rootView = rootView;
        this.drivingSchoolClose = drivingSchoolClose;
        this.drivingSchoolMainContainer = drivingSchoolMainContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DrivingSchoolMainDialogBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DrivingSchoolMainDialogBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.driving_school_main_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static DrivingSchoolMainDialogBinding bind(@NonNull View rootView) {
        int i = R.id.driving_school_close;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.driving_school_close);
        if (findChildViewById != null) {
            i = R.id.driving_school_main_container;
            UIContainer uIContainer = (UIContainer) ViewBindings.findChildViewById(rootView, R.id.driving_school_main_container);
            if (uIContainer != null) {
                return new DrivingSchoolMainDialogBinding((ConstraintLayout) rootView, findChildViewById, uIContainer);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
