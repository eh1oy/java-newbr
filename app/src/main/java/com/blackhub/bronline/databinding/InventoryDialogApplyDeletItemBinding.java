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
public final class InventoryDialogApplyDeletItemBinding implements ViewBinding {

    @NonNull
    public final View dialogValueApplyBgEffect;

    @NonNull
    public final View dialogValueApplyBgView;

    @NonNull
    public final AppCompatButton dialogValueApplyButtonApply;

    @NonNull
    public final AppCompatButton dialogValueApplyButtonCancel;

    @NonNull
    public final ImageView dialogValueApplyButtonClose;

    @NonNull
    public final TextView dialogValueApplyTitleItem;

    @NonNull
    public final ConstraintLayout rootView;

    public InventoryDialogApplyDeletItemBinding(@NonNull ConstraintLayout rootView, @NonNull View dialogValueApplyBgEffect, @NonNull View dialogValueApplyBgView, @NonNull AppCompatButton dialogValueApplyButtonApply, @NonNull AppCompatButton dialogValueApplyButtonCancel, @NonNull ImageView dialogValueApplyButtonClose, @NonNull TextView dialogValueApplyTitleItem) {
        this.rootView = rootView;
        this.dialogValueApplyBgEffect = dialogValueApplyBgEffect;
        this.dialogValueApplyBgView = dialogValueApplyBgView;
        this.dialogValueApplyButtonApply = dialogValueApplyButtonApply;
        this.dialogValueApplyButtonCancel = dialogValueApplyButtonCancel;
        this.dialogValueApplyButtonClose = dialogValueApplyButtonClose;
        this.dialogValueApplyTitleItem = dialogValueApplyTitleItem;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static InventoryDialogApplyDeletItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static InventoryDialogApplyDeletItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.inventory_dialog_apply_delet_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static InventoryDialogApplyDeletItemBinding bind(@NonNull View rootView) {
        int i = R.id.dialog_value_apply_bg_effect;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.dialog_value_apply_bg_effect);
        if (findChildViewById != null) {
            i = R.id.dialog_value_apply_bg_view;
            View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.dialog_value_apply_bg_view);
            if (findChildViewById2 != null) {
                i = R.id.dialog_value_apply_button_apply;
                AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.dialog_value_apply_button_apply);
                if (appCompatButton != null) {
                    i = R.id.dialog_value_apply_button_cancel;
                    AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.dialog_value_apply_button_cancel);
                    if (appCompatButton2 != null) {
                        i = R.id.dialog_value_apply_button_close;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.dialog_value_apply_button_close);
                        if (imageView != null) {
                            i = R.id.dialog_value_apply_title_item;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialog_value_apply_title_item);
                            if (textView != null) {
                                return new InventoryDialogApplyDeletItemBinding((ConstraintLayout) rootView, findChildViewById, findChildViewById2, appCompatButton, appCompatButton2, imageView, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
