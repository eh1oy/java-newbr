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
public final class LauncherDialogNotEnoughSpaceBinding implements ViewBinding {

    @NonNull
    public final View bgEffectShadow;

    @NonNull
    public final AppCompatButton buttonNo;

    @NonNull
    public final View mainViewDialogNotEnoughSpace;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView textViewNeedToFree;

    @NonNull
    public final TextView textViewNotEnoughSpaceTitle;

    public LauncherDialogNotEnoughSpaceBinding(@NonNull ConstraintLayout rootView, @NonNull View bgEffectShadow, @NonNull AppCompatButton buttonNo, @NonNull View mainViewDialogNotEnoughSpace, @NonNull TextView textViewNeedToFree, @NonNull TextView textViewNotEnoughSpaceTitle) {
        this.rootView = rootView;
        this.bgEffectShadow = bgEffectShadow;
        this.buttonNo = buttonNo;
        this.mainViewDialogNotEnoughSpace = mainViewDialogNotEnoughSpace;
        this.textViewNeedToFree = textViewNeedToFree;
        this.textViewNotEnoughSpaceTitle = textViewNotEnoughSpaceTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LauncherDialogNotEnoughSpaceBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LauncherDialogNotEnoughSpaceBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.launcher_dialog_not_enough_space, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static LauncherDialogNotEnoughSpaceBinding bind(@NonNull View rootView) {
        int i = R.id.bg_effect_shadow;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_effect_shadow);
        if (findChildViewById != null) {
            i = R.id.button_no;
            AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_no);
            if (appCompatButton != null) {
                i = R.id.main_view_dialog_not_enough_space;
                View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.main_view_dialog_not_enough_space);
                if (findChildViewById2 != null) {
                    i = R.id.text_view_need_to_free;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_need_to_free);
                    if (textView != null) {
                        i = R.id.text_view_not_enough_space_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_not_enough_space_title);
                        if (textView2 != null) {
                            return new LauncherDialogNotEnoughSpaceBinding((ConstraintLayout) rootView, findChildViewById, appCompatButton, findChildViewById2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
