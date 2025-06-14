package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public final class SocialNetworkLinkButtonBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final View socialNetworkLinkButtonAura;

    @NonNull
    public final View socialNetworkLinkButtonBgColorNotActive;

    @NonNull
    public final View socialNetworkLinkButtonBgStyleNotActive;

    @NonNull
    public final View socialNetworkLinkButtonBorder;

    @NonNull
    public final View socialNetworkLinkButtonIcon;

    @NonNull
    public final TextView socialNetworkLinkButtonName;

    public SocialNetworkLinkButtonBinding(@NonNull ConstraintLayout rootView, @NonNull View socialNetworkLinkButtonAura, @NonNull View socialNetworkLinkButtonBgColorNotActive, @NonNull View socialNetworkLinkButtonBgStyleNotActive, @NonNull View socialNetworkLinkButtonBorder, @NonNull View socialNetworkLinkButtonIcon, @NonNull TextView socialNetworkLinkButtonName) {
        this.rootView = rootView;
        this.socialNetworkLinkButtonAura = socialNetworkLinkButtonAura;
        this.socialNetworkLinkButtonBgColorNotActive = socialNetworkLinkButtonBgColorNotActive;
        this.socialNetworkLinkButtonBgStyleNotActive = socialNetworkLinkButtonBgStyleNotActive;
        this.socialNetworkLinkButtonBorder = socialNetworkLinkButtonBorder;
        this.socialNetworkLinkButtonIcon = socialNetworkLinkButtonIcon;
        this.socialNetworkLinkButtonName = socialNetworkLinkButtonName;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SocialNetworkLinkButtonBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static SocialNetworkLinkButtonBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.social_network_link_button, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static SocialNetworkLinkButtonBinding bind(@NonNull View rootView) {
        int i = R.id.social_network_link_button_aura;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.social_network_link_button_aura);
        if (findChildViewById != null) {
            i = R.id.social_network_link_button_bg_color_not_active;
            View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.social_network_link_button_bg_color_not_active);
            if (findChildViewById2 != null) {
                i = R.id.social_network_link_button_bg_style_not_active;
                View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.social_network_link_button_bg_style_not_active);
                if (findChildViewById3 != null) {
                    i = R.id.social_network_link_button_border;
                    View findChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.social_network_link_button_border);
                    if (findChildViewById4 != null) {
                        i = R.id.social_network_link_button_icon;
                        View findChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.social_network_link_button_icon);
                        if (findChildViewById5 != null) {
                            i = R.id.social_network_link_button_name;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.social_network_link_button_name);
                            if (textView != null) {
                                return new SocialNetworkLinkButtonBinding((ConstraintLayout) rootView, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, findChildViewById5, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
