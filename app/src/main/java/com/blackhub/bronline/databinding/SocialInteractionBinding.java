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
public final class SocialInteractionBinding implements ViewBinding {

    @NonNull
    public final View bgSocialInteraction;

    @NonNull
    public final View bottomBlackSocial;

    @NonNull
    public final TextView button1;

    @NonNull
    public final TextView button2;

    @NonNull
    public final TextView button3;

    @NonNull
    public final TextView button4;

    @NonNull
    public final TextView button5;

    @NonNull
    public final TextView button6;

    @NonNull
    public final TextView button7;

    @NonNull
    public final TextView buttonWithNickname;

    @NonNull
    public final ImageView closeInteraction;

    @NonNull
    public final TextView helpText1Social;

    @NonNull
    public final TextView helpText2Social;

    @NonNull
    public final View leftBlackSocial;

    @NonNull
    public final View rightBlackSocial;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final View topBlackSocial;

    @NonNull
    public final View windowSocial;

    public SocialInteractionBinding(@NonNull ConstraintLayout rootView, @NonNull View bgSocialInteraction, @NonNull View bottomBlackSocial, @NonNull TextView button1, @NonNull TextView button2, @NonNull TextView button3, @NonNull TextView button4, @NonNull TextView button5, @NonNull TextView button6, @NonNull TextView button7, @NonNull TextView buttonWithNickname, @NonNull ImageView closeInteraction, @NonNull TextView helpText1Social, @NonNull TextView helpText2Social, @NonNull View leftBlackSocial, @NonNull View rightBlackSocial, @NonNull View topBlackSocial, @NonNull View windowSocial) {
        this.rootView = rootView;
        this.bgSocialInteraction = bgSocialInteraction;
        this.bottomBlackSocial = bottomBlackSocial;
        this.button1 = button1;
        this.button2 = button2;
        this.button3 = button3;
        this.button4 = button4;
        this.button5 = button5;
        this.button6 = button6;
        this.button7 = button7;
        this.buttonWithNickname = buttonWithNickname;
        this.closeInteraction = closeInteraction;
        this.helpText1Social = helpText1Social;
        this.helpText2Social = helpText2Social;
        this.leftBlackSocial = leftBlackSocial;
        this.rightBlackSocial = rightBlackSocial;
        this.topBlackSocial = topBlackSocial;
        this.windowSocial = windowSocial;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SocialInteractionBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static SocialInteractionBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.social_interaction, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static SocialInteractionBinding bind(@NonNull View rootView) {
        int i = R.id.bg_social_interaction;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_social_interaction);
        if (findChildViewById != null) {
            i = R.id.bottom_black_social;
            View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.bottom_black_social);
            if (findChildViewById2 != null) {
                i = R.id.button_1;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.button_1);
                if (textView != null) {
                    i = R.id.button_2;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.button_2);
                    if (textView2 != null) {
                        i = R.id.button_3;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.button_3);
                        if (textView3 != null) {
                            i = R.id.button_4;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.button_4);
                            if (textView4 != null) {
                                i = R.id.button_5;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.button_5);
                                if (textView5 != null) {
                                    i = R.id.button_6;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.button_6);
                                    if (textView6 != null) {
                                        i = R.id.button_7;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.button_7);
                                        if (textView7 != null) {
                                            i = R.id.button_with_nickname;
                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.button_with_nickname);
                                            if (textView8 != null) {
                                                i = R.id.close_interaction;
                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.close_interaction);
                                                if (imageView != null) {
                                                    i = R.id.help_text_1_social;
                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.help_text_1_social);
                                                    if (textView9 != null) {
                                                        i = R.id.help_text_2_social;
                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.help_text_2_social);
                                                        if (textView10 != null) {
                                                            i = R.id.left_black_social;
                                                            View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.left_black_social);
                                                            if (findChildViewById3 != null) {
                                                                i = R.id.right_black_social;
                                                                View findChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.right_black_social);
                                                                if (findChildViewById4 != null) {
                                                                    i = R.id.top_black_social;
                                                                    View findChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.top_black_social);
                                                                    if (findChildViewById5 != null) {
                                                                        i = R.id.window_social;
                                                                        View findChildViewById6 = ViewBindings.findChildViewById(rootView, R.id.window_social);
                                                                        if (findChildViewById6 != null) {
                                                                            return new SocialInteractionBinding((ConstraintLayout) rootView, findChildViewById, findChildViewById2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, imageView, textView9, textView10, findChildViewById3, findChildViewById4, findChildViewById5, findChildViewById6);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
