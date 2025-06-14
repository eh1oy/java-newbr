package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.UIContainer;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public final class MiniGameEventsContainerBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton btnHalloweenClose;

    @NonNull
    public final AppCompatButton btnHalloweenGameInfo;

    @NonNull
    public final UIContainer container;

    @NonNull
    public final ImageView ivHalloweenBack;

    @NonNull
    public final FrameLayout rootView;

    public MiniGameEventsContainerBinding(@NonNull FrameLayout rootView, @NonNull AppCompatButton btnHalloweenClose, @NonNull AppCompatButton btnHalloweenGameInfo, @NonNull UIContainer container, @NonNull ImageView ivHalloweenBack) {
        this.rootView = rootView;
        this.btnHalloweenClose = btnHalloweenClose;
        this.btnHalloweenGameInfo = btnHalloweenGameInfo;
        this.container = container;
        this.ivHalloweenBack = ivHalloweenBack;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static MiniGameEventsContainerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static MiniGameEventsContainerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.mini_game_events_container, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static MiniGameEventsContainerBinding bind(@NonNull View rootView) {
        int i = R.id.btnHalloweenClose;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.btnHalloweenClose);
        if (appCompatButton != null) {
            i = R.id.btnHalloweenGameInfo;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.btnHalloweenGameInfo);
            if (appCompatButton2 != null) {
                i = 2131362690;
                UIContainer uIContainer = (UIContainer) ViewBindings.findChildViewById(rootView, 2131362690);
                if (uIContainer != null) {
                    i = R.id.ivHalloweenBack;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivHalloweenBack);
                    if (imageView != null) {
                        return new MiniGameEventsContainerBinding((FrameLayout) rootView, appCompatButton, appCompatButton2, uIContainer, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
