package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.UIContainer;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public final class RegistrationMainframeBinding implements ViewBinding {

    @NonNull
    public final UIContainer container;

    @NonNull
    public final UIContainer rootView;

    public RegistrationMainframeBinding(@NonNull UIContainer rootView, @NonNull UIContainer container) {
        this.rootView = rootView;
        this.container = container;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public UIContainer getRoot() {
        return this.rootView;
    }

    @NonNull
    public static RegistrationMainframeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static RegistrationMainframeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.registration_mainframe, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static RegistrationMainframeBinding bind(@NonNull View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        UIContainer uIContainer = (UIContainer) rootView;
        return new RegistrationMainframeBinding(uIContainer, uIContainer);
    }
}
