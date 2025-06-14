package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.R;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public final class InventoryButtonItemBinding implements ViewBinding {

    @NonNull
    public final View invDivers;

    @NonNull
    public final ImageView invIconButtonItem;

    @NonNull
    public final TextView invTitleButton;

    @NonNull
    public final RelativeLayout rootView;

    public InventoryButtonItemBinding(@NonNull RelativeLayout rootView, @NonNull View invDivers, @NonNull ImageView invIconButtonItem, @NonNull TextView invTitleButton) {
        this.rootView = rootView;
        this.invDivers = invDivers;
        this.invIconButtonItem = invIconButtonItem;
        this.invTitleButton = invTitleButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static InventoryButtonItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static InventoryButtonItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.inventory_button_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static InventoryButtonItemBinding bind(@NonNull View rootView) {
        int i = R.id.inv_divers;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.inv_divers);
        if (findChildViewById != null) {
            i = R.id.inv_icon_button_item;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.inv_icon_button_item);
            if (imageView != null) {
                i = R.id.inv_title_button;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.inv_title_button);
                if (textView != null) {
                    return new InventoryButtonItemBinding((RelativeLayout) rootView, findChildViewById, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
