package com.blackhub.bronline.game.common;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CountAnimationTextView.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001 B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0016\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007J\b\u0010\u0016\u001a\u00020\u0012H\u0014J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0012H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/blackhub/bronline/game/common/CountAnimationTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isAnimating", "", "mCountAnimationListener", "Lcom/blackhub/bronline/game/common/CountAnimationTextView$CountAnimationListener;", "mCountAnimator", "Landroid/animation/ValueAnimator;", "mDecimalFormat", "Ljava/text/DecimalFormat;", "clearDecimalFormat", "", "countAnimation", "fromValue", "toValue", "onDetachedFromWindow", "setAnimationDuration", "duration", "", "setCountAnimationListener", "setDecimalFormat", "setInterpolator", "value", "Landroid/animation/TimeInterpolator;", "setUpAnimator", "CountAnimationListener", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CountAnimationTextView extends AppCompatTextView {
    public static final int $stable = 8;
    public boolean isAnimating;

    @Nullable
    public CountAnimationListener mCountAnimationListener;

    @Nullable
    public ValueAnimator mCountAnimator;

    @Nullable
    public DecimalFormat mDecimalFormat;

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: CountAnimationTextView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H&J\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/blackhub/bronline/game/common/CountAnimationTextView$CountAnimationListener;", "", "onAnimationEnd", "", "var1", "onAnimationStart", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface CountAnimationListener {
        void onAnimationEnd(@Nullable Object var1);

        void onAnimationStart(@Nullable Object var1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CountAnimationTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CountAnimationTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CountAnimationTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CountAnimationTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setUpAnimator();
    }

    public final void setUpAnimator() {
        ValueAnimator valueAnimator = new ValueAnimator();
        this.mCountAnimator = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.common.CountAnimationTextView$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                CountAnimationTextView.setUpAnimator$lambda$0(CountAnimationTextView.this, valueAnimator2);
            }
        });
        ValueAnimator valueAnimator2 = this.mCountAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.addListener(new Animator.AnimatorListener() { // from class: com.blackhub.bronline.game.common.CountAnimationTextView$setUpAnimator$2
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@NotNull Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                /* JADX WARN: Code restructure failed: missing block: B:3:0x0013, code lost:
                
                    r2 = r1.this$0.mCountAnimationListener;
                 */
                @Override // android.animation.Animator.AnimatorListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onAnimationStart(@org.jetbrains.annotations.NotNull android.animation.Animator r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = "animation"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                        com.blackhub.bronline.game.common.CountAnimationTextView r2 = com.blackhub.bronline.game.common.CountAnimationTextView.this
                        r0 = 1
                        com.blackhub.bronline.game.common.CountAnimationTextView.access$setAnimating$p(r2, r0)
                        com.blackhub.bronline.game.common.CountAnimationTextView r2 = com.blackhub.bronline.game.common.CountAnimationTextView.this
                        com.blackhub.bronline.game.common.CountAnimationTextView$CountAnimationListener r2 = com.blackhub.bronline.game.common.CountAnimationTextView.access$getMCountAnimationListener$p(r2)
                        if (r2 == 0) goto L2c
                        com.blackhub.bronline.game.common.CountAnimationTextView r2 = com.blackhub.bronline.game.common.CountAnimationTextView.this
                        com.blackhub.bronline.game.common.CountAnimationTextView$CountAnimationListener r2 = com.blackhub.bronline.game.common.CountAnimationTextView.access$getMCountAnimationListener$p(r2)
                        if (r2 == 0) goto L2c
                        com.blackhub.bronline.game.common.CountAnimationTextView r0 = com.blackhub.bronline.game.common.CountAnimationTextView.this
                        android.animation.ValueAnimator r0 = com.blackhub.bronline.game.common.CountAnimationTextView.access$getMCountAnimator$p(r0)
                        if (r0 == 0) goto L28
                        java.lang.Object r0 = r0.getAnimatedValue()
                        goto L29
                    L28:
                        r0 = 0
                    L29:
                        r2.onAnimationStart(r0)
                    L2c:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.common.CountAnimationTextView$setUpAnimator$2.onAnimationStart(android.animation.Animator):void");
                }

                /* JADX WARN: Code restructure failed: missing block: B:3:0x0013, code lost:
                
                    r2 = r1.this$0.mCountAnimationListener;
                 */
                @Override // android.animation.Animator.AnimatorListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onAnimationEnd(@org.jetbrains.annotations.NotNull android.animation.Animator r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = "animation"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                        com.blackhub.bronline.game.common.CountAnimationTextView r2 = com.blackhub.bronline.game.common.CountAnimationTextView.this
                        r0 = 0
                        com.blackhub.bronline.game.common.CountAnimationTextView.access$setAnimating$p(r2, r0)
                        com.blackhub.bronline.game.common.CountAnimationTextView r2 = com.blackhub.bronline.game.common.CountAnimationTextView.this
                        com.blackhub.bronline.game.common.CountAnimationTextView$CountAnimationListener r2 = com.blackhub.bronline.game.common.CountAnimationTextView.access$getMCountAnimationListener$p(r2)
                        if (r2 == 0) goto L2c
                        com.blackhub.bronline.game.common.CountAnimationTextView r2 = com.blackhub.bronline.game.common.CountAnimationTextView.this
                        com.blackhub.bronline.game.common.CountAnimationTextView$CountAnimationListener r2 = com.blackhub.bronline.game.common.CountAnimationTextView.access$getMCountAnimationListener$p(r2)
                        if (r2 == 0) goto L2c
                        com.blackhub.bronline.game.common.CountAnimationTextView r0 = com.blackhub.bronline.game.common.CountAnimationTextView.this
                        android.animation.ValueAnimator r0 = com.blackhub.bronline.game.common.CountAnimationTextView.access$getMCountAnimator$p(r0)
                        if (r0 == 0) goto L28
                        java.lang.Object r0 = r0.getAnimatedValue()
                        goto L29
                    L28:
                        r0 = 0
                    L29:
                        r2.onAnimationEnd(r0)
                    L2c:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.common.CountAnimationTextView$setUpAnimator$2.onAnimationEnd(android.animation.Animator):void");
                }
            });
        }
        ValueAnimator valueAnimator3 = this.mCountAnimator;
        if (valueAnimator3 == null) {
            return;
        }
        valueAnimator3.setDuration(1000L);
    }

    public static final void setUpAnimator$lambda$0(CountAnimationTextView this$0, ValueAnimator animation) {
        String format;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animation, "animation");
        DecimalFormat decimalFormat = this$0.mDecimalFormat;
        if (decimalFormat == null) {
            format = animation.getAnimatedValue().toString();
        } else {
            format = decimalFormat != null ? decimalFormat.format(animation.getAnimatedValue()) : null;
        }
        super.setText(format);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.mCountAnimator;
        if (valueAnimator == null || valueAnimator == null) {
            return;
        }
        valueAnimator.cancel();
    }

    public final void countAnimation(int fromValue, int toValue) {
        if (this.isAnimating) {
            return;
        }
        ValueAnimator valueAnimator = this.mCountAnimator;
        if (valueAnimator != null) {
            valueAnimator.setIntValues(fromValue, toValue);
        }
        ValueAnimator valueAnimator2 = this.mCountAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }

    @NotNull
    public final CountAnimationTextView setAnimationDuration(long duration) {
        ValueAnimator valueAnimator = this.mCountAnimator;
        if (valueAnimator != null) {
            valueAnimator.setDuration(duration);
        }
        return this;
    }

    public final CountAnimationTextView setInterpolator(TimeInterpolator value) {
        ValueAnimator valueAnimator = this.mCountAnimator;
        if (valueAnimator != null) {
            valueAnimator.setInterpolator(value);
        }
        return this;
    }

    @NotNull
    public final CountAnimationTextView setDecimalFormat(@Nullable DecimalFormat mDecimalFormat) {
        this.mDecimalFormat = mDecimalFormat;
        return this;
    }

    public final void clearDecimalFormat() {
        this.mDecimalFormat = null;
    }

    @NotNull
    public final CountAnimationTextView setCountAnimationListener(@Nullable CountAnimationListener mCountAnimationListener) {
        this.mCountAnimationListener = mCountAnimationListener;
        return this;
    }
}
