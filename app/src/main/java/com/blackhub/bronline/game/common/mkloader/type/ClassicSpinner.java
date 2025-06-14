package com.blackhub.bronline.game.common.mkloader.type;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.PointF;
import com.blackhub.bronline.game.common.mkloader.callback.InvalidateListener;
import com.blackhub.bronline.game.common.mkloader.model.Circle;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public class ClassicSpinner extends LoaderView {
    public Circle[] circles;
    public final int circlesSize = 8;

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void initializeObjects() {
        float min = Math.min(this.width, this.height) / 10.0f;
        this.circles = new Circle[this.circlesSize];
        for (int i = 0; i < this.circlesSize; i++) {
            this.circles[i] = new Circle();
            this.circles[i].setCenter(this.center.x, min);
            this.circles[i].setColor(this.color);
            this.circles[i].setAlpha(126);
            this.circles[i].setRadius(min);
        }
    }

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void setUpAnimation() {
        for (final int i = 0; i < this.circlesSize; i++) {
            ValueAnimator ofInt = ValueAnimator.ofInt(126, 255, 126);
            ofInt.setRepeatCount(-1);
            ofInt.setDuration(1000L);
            ofInt.setStartDelay(i * 120);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.common.mkloader.type.ClassicSpinner$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ClassicSpinner.this.lambda$setUpAnimation$0(i, valueAnimator);
                }
            });
            ofInt.start();
        }
    }

    public final /* synthetic */ void lambda$setUpAnimation$0(int i, ValueAnimator valueAnimator) {
        this.circles[i].setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        InvalidateListener invalidateListener = this.invalidateListener;
        if (invalidateListener != null) {
            invalidateListener.reDraw();
        }
    }

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void draw(Canvas canvas) {
        for (int i = 0; i < this.circlesSize; i++) {
            canvas.save();
            PointF pointF = this.center;
            canvas.rotate(i * 45, pointF.x, pointF.y);
            this.circles[i].draw(canvas);
            canvas.restore();
        }
    }
}
