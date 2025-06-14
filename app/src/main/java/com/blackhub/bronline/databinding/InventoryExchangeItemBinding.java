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
public final class InventoryExchangeItemBinding implements ViewBinding {

    @NonNull
    public final View bgItemsAura;

    @NonNull
    public final View invBgItem;

    @NonNull
    public final View invItemActiveBg;

    @NonNull
    public final ImageView invItemItemsIcon;

    @NonNull
    public final ImageView invLineUpOrDown;

    @NonNull
    public final ImageView invUnderline;

    @NonNull
    public final TextView invValueItems;

    @NonNull
    public final ConstraintLayout rootView;

    public InventoryExchangeItemBinding(@NonNull ConstraintLayout rootView, @NonNull View bgItemsAura, @NonNull View invBgItem, @NonNull View invItemActiveBg, @NonNull ImageView invItemItemsIcon, @NonNull ImageView invLineUpOrDown, @NonNull ImageView invUnderline, @NonNull TextView invValueItems) {
        this.rootView = rootView;
        this.bgItemsAura = bgItemsAura;
        this.invBgItem = invBgItem;
        this.invItemActiveBg = invItemActiveBg;
        this.invItemItemsIcon = invItemItemsIcon;
        this.invLineUpOrDown = invLineUpOrDown;
        this.invUnderline = invUnderline;
        this.invValueItems = invValueItems;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static InventoryExchangeItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static InventoryExchangeItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.inventory_exchange_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static InventoryExchangeItemBinding bind(@NonNull View rootView) {
        int i = R.id.bg_items_aura;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_items_aura);
        if (findChildViewById != null) {
            i = R.id.inv_bg_item;
            View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.inv_bg_item);
            if (findChildViewById2 != null) {
                i = R.id.inv_item_active_bg;
                View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.inv_item_active_bg);
                if (findChildViewById3 != null) {
                    i = R.id.inv_item_items_icon;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.inv_item_items_icon);
                    if (imageView != null) {
                        i = R.id.inv_line_up_or_down;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.inv_line_up_or_down);
                        if (imageView2 != null) {
                            i = R.id.inv_underline;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.inv_underline);
                            if (imageView3 != null) {
                                i = R.id.inv_value_items;
                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.inv_value_items);
                                if (textView != null) {
                                    return new InventoryExchangeItemBinding((ConstraintLayout) rootView, findChildViewById, findChildViewById2, findChildViewById3, imageView, imageView2, imageView3, textView);
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
