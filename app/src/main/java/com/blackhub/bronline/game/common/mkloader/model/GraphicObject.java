package com.blackhub.bronline.game.common.mkloader.model;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public abstract class GraphicObject {
    public Paint paint;

    public abstract void draw(Canvas canvas);

    public GraphicObject() {
        Paint paint = new Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
    }

    public void setColor(int color) {
        this.paint.setColor(color);
    }

    public void setAlpha(int alpha) {
        this.paint.setAlpha(alpha);
    }

    public void setWidth(float width) {
        this.paint.setStrokeWidth(width);
    }

    public void setStyle(Paint.Style style) {
        this.paint.setStyle(style);
    }
}
