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
public class FishSpinner extends LoaderView {
    public Circle[] circles;
    public final int numberOfCircle = 5;
    public final float[] rotates = new float[5];

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void initializeObjects() {
        float min = Math.min(this.width, this.height) / 10.0f;
        this.circles = new Circle[this.numberOfCircle];
        for (int i = 0; i < this.numberOfCircle; i++) {
            this.circles[i] = new Circle();
            this.circles[i].setCenter(this.center.x, min);
            this.circles[i].setColor(this.color);
            this.circles[i].setRadius(min - ((i * min) / 6.0f));
        }
    }

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void setUpAnimation() {
        for (final int i = 0; i < this.numberOfCircle; i++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
            ofFloat.setRepeatCount(-1);
            ofFloat.setDuration(1700L);
            ofFloat.setStartDelay(i * 100);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.common.mkloader.type.FishSpinner$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    FishSpinner.this.lambda$setUpAnimation$0(i, valueAnimator);
                }
            });
            ofFloat.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpAnimation$0(int i, ValueAnimator valueAnimator) {
        this.rotates[i] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        InvalidateListener invalidateListener = this.invalidateListener;
        if (invalidateListener != null) {
            invalidateListener.reDraw();
        }
    }

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void draw(Canvas canvas) {
        for (int i = 0; i < this.numberOfCircle; i++) {
            canvas.save();
            float f = this.rotates[i];
            PointF pointF = this.center;
            canvas.rotate(f, pointF.x, pointF.y);
            this.circles[i].draw(canvas);
            canvas.restore();
        }
    }
}
