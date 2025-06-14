package com.blackhub.bronline.game.gui.donate;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.DialogNoNavBar;
import com.blackhub.bronline.game.gui.UsefulKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CircleProgressDialog.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/blackhub/bronline/game/gui/donate/CircleProgressDialog;", "Lcom/blackhub/bronline/game/common/DialogNoNavBar;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "closeProgress", "", "showProgressDialog", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CircleProgressDialog extends DialogNoNavBar {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleProgressDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setDimAmount(0.4f);
        }
        setCancelable(false);
        setContentView(R.layout.donate_dialog_progress);
    }

    public final void showProgressDialog() {
        show();
        Window window = getWindow();
        UsefulKt.hideSystemUI(window != null ? window.getDecorView() : null);
    }

    public final void closeProgress() {
        dismiss();
    }
}
