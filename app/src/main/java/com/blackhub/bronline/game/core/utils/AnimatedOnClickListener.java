package com.blackhub.bronline.game.core.utils;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: AnimatedOnClickListener.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Lcom/blackhub/bronline/game/core/utils/AnimatedOnClickListener;", "Landroid/view/View$OnClickListener;", "()V", "onAnimateClick", "", SVG.View.NODE_NAME, "Landroid/view/View;", "onClick", "clickedView", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AnimatedOnClickListener implements View.OnClickListener {
    public static final int $stable = 0;

    public abstract void onAnimateClick(@Nullable View view);

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull final View clickedView) {
        Intrinsics.checkNotNullParameter(clickedView, "clickedView");
        Animation loadAnimation = AnimationUtils.loadAnimation(clickedView.getContext(), R.anim.button_click);
        Intrinsics.checkNotNull(loadAnimation);
        AnyExtensionKt.setActionOnAnimationStart(loadAnimation, new Function0<Unit>() { // from class: com.blackhub.bronline.game.core.utils.AnimatedOnClickListener$onClick$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AnimatedOnClickListener.this.onAnimateClick(clickedView);
            }
        });
        clickedView.startAnimation(loadAnimation);
    }
}
