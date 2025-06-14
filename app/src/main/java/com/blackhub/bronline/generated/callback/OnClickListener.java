package com.blackhub.bronline.generated.callback;

import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
/* loaded from: classes4.dex */
public final class OnClickListener implements View.OnClickListener {
    public final Listener mListener;
    public final int mSourceId;

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
    public interface Listener {
        void _internalCallbackOnClick(int sourceId, View callbackArg_0);
    }

    public OnClickListener(Listener listener, int sourceId) {
        this.mListener = listener;
        this.mSourceId = sourceId;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View callbackArg_0) {
        this.mListener._internalCallbackOnClick(this.mSourceId, callbackArg_0);
    }
}
