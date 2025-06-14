package com.blackhub.bronline.game.gui.electric.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: ProgressBarWithListener.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/blackhub/bronline/game/gui/electric/view/ProgressBarWithListener;", "Landroid/widget/ProgressBar;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "progressListener", "Lcom/blackhub/bronline/game/gui/electric/view/ProgressBarWithListener$OnProgressChangeListener;", "setOnProgressChangeListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setProgress", "progress", "", "OnProgressChangeListener", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProgressBarWithListener extends ProgressBar {
    public static final int $stable = 8;

    @Nullable
    public OnProgressChangeListener progressListener;

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: ProgressBarWithListener.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/blackhub/bronline/game/gui/electric/view/ProgressBarWithListener$OnProgressChangeListener;", "", "onProgressChanged", "", "progress", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnProgressChangeListener {
        void onProgressChanged(int progress);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressBarWithListener(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    public final void setOnProgressChangeListener(@Nullable OnProgressChangeListener listener) {
        this.progressListener = listener;
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int progress) {
        super.setProgress(progress);
        OnProgressChangeListener onProgressChangeListener = this.progressListener;
        if (onProgressChangeListener != null) {
            onProgressChangeListener.onProgressChanged(progress);
        }
    }
}
