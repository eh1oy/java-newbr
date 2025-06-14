package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
public final class InventoryButtonActionItemBinding implements ViewBinding {

    @NonNull
    public final View invButtonActionBg;

    @NonNull
    public final ImageView invButtonActionIcon;

    @NonNull
    public final View invButtonActionTitleBg;

    @NonNull
    public final TextView invTitleButtonAction;

    @NonNull
    public final ConstraintLayout rootView;

    public InventoryButtonActionItemBinding(@NonNull ConstraintLayout rootView, @NonNull View invButtonActionBg, @NonNull ImageView invButtonActionIcon, @NonNull View invButtonActionTitleBg, @NonNull TextView invTitleButtonAction) {
        this.rootView = rootView;
        this.invButtonActionBg = invButtonActionBg;
        this.invButtonActionIcon = invButtonActionIcon;
        this.invButtonActionTitleBg = invButtonActionTitleBg;
        this.invTitleButtonAction = invTitleButtonAction;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static InventoryButtonActionItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static InventoryButtonActionItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.inventory_button_action_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static InventoryButtonActionItemBinding bind(@NonNull View rootView) {
        int i = R.id.inv_button_action_bg;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.inv_button_action_bg);
        if (findChildViewById != null) {
            i = R.id.inv_button_action_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.inv_button_action_icon);
            if (imageView != null) {
                i = R.id.inv_button_action_title_bg;
                View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.inv_button_action_title_bg);
                if (findChildViewById2 != null) {
                    i = R.id.inv_title_button_action;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.inv_title_button_action);
                    if (textView != null) {
                        return new InventoryButtonActionItemBinding((ConstraintLayout) rootView, findChildViewById, imageView, findChildViewById2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
