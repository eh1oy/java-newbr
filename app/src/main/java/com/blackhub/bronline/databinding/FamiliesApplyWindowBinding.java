package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public final class FamiliesApplyWindowBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton buttonApply;

    @NonNull
    public final AppCompatButton buttonCancel;

    @NonNull
    public final View dialogApplyBgView;

    @NonNull
    public final TextView dialogApplyBodyItem;

    @NonNull
    public final ConstraintLayout rootView;

    public FamiliesApplyWindowBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatButton buttonApply, @NonNull AppCompatButton buttonCancel, @NonNull View dialogApplyBgView, @NonNull TextView dialogApplyBodyItem) {
        this.rootView = rootView;
        this.buttonApply = buttonApply;
        this.buttonCancel = buttonCancel;
        this.dialogApplyBgView = dialogApplyBgView;
        this.dialogApplyBodyItem = dialogApplyBodyItem;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FamiliesApplyWindowBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FamiliesApplyWindowBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.families_apply_window, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static FamiliesApplyWindowBinding bind(@NonNull View rootView) {
        int i = R.id.button_apply;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_apply);
        if (appCompatButton != null) {
            i = 2131362515;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, 2131362515);
            if (appCompatButton2 != null) {
                i = R.id.dialog_apply_bg_view;
                View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.dialog_apply_bg_view);
                if (findChildViewById != null) {
                    i = R.id.dialog_apply_body_item;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialog_apply_body_item);
                    if (textView != null) {
                        return new FamiliesApplyWindowBinding((ConstraintLayout) rootView, appCompatButton, appCompatButton2, findChildViewById, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
