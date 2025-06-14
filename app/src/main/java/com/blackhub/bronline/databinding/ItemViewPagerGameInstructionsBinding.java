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
public final class ItemViewPagerGameInstructionsBinding implements ViewBinding {

    @NonNull
    public final ImageView ivExample;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView tv;

    public ItemViewPagerGameInstructionsBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView ivExample, @NonNull TextView tv) {
        this.rootView = rootView;
        this.ivExample = ivExample;
        this.tv = tv;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemViewPagerGameInstructionsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemViewPagerGameInstructionsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_view_pager_game_instructions, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static ItemViewPagerGameInstructionsBinding bind(@NonNull View rootView) {
        int i = R.id.ivExample;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivExample);
        if (imageView != null) {
            i = R.id.tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv);
            if (textView != null) {
                return new ItemViewPagerGameInstructionsBinding((ConstraintLayout) rootView, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
