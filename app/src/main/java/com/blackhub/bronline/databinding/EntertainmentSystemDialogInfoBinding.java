package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.R;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public final class EntertainmentSystemDialogInfoBinding implements ViewBinding {

    @NonNull
    public final View dialogInfoBgEffect;

    @NonNull
    public final View dialogInfoBgView;

    @NonNull
    public final TextView dialogInfoBodyItem;

    @NonNull
    public final AppCompatImageButton dialogInfoButtonClose;

    @NonNull
    public final TextView dialogInfoTitleItem;

    @NonNull
    public final ConstraintLayout rootView;

    public EntertainmentSystemDialogInfoBinding(@NonNull ConstraintLayout rootView, @NonNull View dialogInfoBgEffect, @NonNull View dialogInfoBgView, @NonNull TextView dialogInfoBodyItem, @NonNull AppCompatImageButton dialogInfoButtonClose, @NonNull TextView dialogInfoTitleItem) {
        this.rootView = rootView;
        this.dialogInfoBgEffect = dialogInfoBgEffect;
        this.dialogInfoBgView = dialogInfoBgView;
        this.dialogInfoBodyItem = dialogInfoBodyItem;
        this.dialogInfoButtonClose = dialogInfoButtonClose;
        this.dialogInfoTitleItem = dialogInfoTitleItem;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EntertainmentSystemDialogInfoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static EntertainmentSystemDialogInfoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.entertainment_system_dialog_info, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static EntertainmentSystemDialogInfoBinding bind(@NonNull View rootView) {
        int i = R.id.dialog_info_bg_effect;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.dialog_info_bg_effect);
        if (findChildViewById != null) {
            i = R.id.dialog_info_bg_view;
            View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.dialog_info_bg_view);
            if (findChildViewById2 != null) {
                i = R.id.dialog_info_body_item;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialog_info_body_item);
                if (textView != null) {
                    i = R.id.dialog_info_button_close;
                    AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.findChildViewById(rootView, R.id.dialog_info_button_close);
                    if (appCompatImageButton != null) {
                        i = R.id.dialog_info_title_item;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialog_info_title_item);
                        if (textView2 != null) {
                            return new EntertainmentSystemDialogInfoBinding((ConstraintLayout) rootView, findChildViewById, findChildViewById2, textView, appCompatImageButton, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
