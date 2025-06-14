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
public final class SocialInteraction3Binding implements ViewBinding {

    @NonNull
    public final TextView button2;

    @NonNull
    public final TextView button3;

    @NonNull
    public final TextView button5;

    @NonNull
    public final TextView button6;

    @NonNull
    public final TextView buttonWithNickname;

    @NonNull
    public final ImageView closeInteraction;

    @NonNull
    public final ConstraintLayout rootView;

    public SocialInteraction3Binding(@NonNull ConstraintLayout rootView, @NonNull TextView button2, @NonNull TextView button3, @NonNull TextView button5, @NonNull TextView button6, @NonNull TextView buttonWithNickname, @NonNull ImageView closeInteraction) {
        this.rootView = rootView;
        this.button2 = button2;
        this.button3 = button3;
        this.button5 = button5;
        this.button6 = button6;
        this.buttonWithNickname = buttonWithNickname;
        this.closeInteraction = closeInteraction;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SocialInteraction3Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static SocialInteraction3Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.social_interaction_3, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static SocialInteraction3Binding bind(@NonNull View rootView) {
        int i = R.id.button_2;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.button_2);
        if (textView != null) {
            i = R.id.button_3;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.button_3);
            if (textView2 != null) {
                i = R.id.button_5;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.button_5);
                if (textView3 != null) {
                    i = R.id.button_6;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.button_6);
                    if (textView4 != null) {
                        i = R.id.button_with_nickname;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.button_with_nickname);
                        if (textView5 != null) {
                            i = R.id.close_interaction;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.close_interaction);
                            if (imageView != null) {
                                return new SocialInteraction3Binding((ConstraintLayout) rootView, textView, textView2, textView3, textView4, textView5, imageView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
