package com.blackhub.bronline.game.common.colorpickerview;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public class ColorHsvPalette extends BitmapDrawable {
    public final Paint huePaint;
    public final Paint saturationPaint;

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    public ColorHsvPalette(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
        this.huePaint = new Paint(1);
        this.saturationPaint = new Paint(1);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        int width = getBounds().width();
        float f = width * 0.5f;
        float height = getBounds().height() * 0.5f;
        float min = Math.min(width, r1) * 0.5f;
        this.huePaint.setShader(new SweepGradient(f, height, new int[]{SupportMenu.CATEGORY_MASK, -65281, -16776961, -16711681, -16711936, -256, SupportMenu.CATEGORY_MASK}, new float[]{0.0f, 0.166f, 0.333f, 0.499f, 0.666f, 0.833f, 0.999f}));
        this.saturationPaint.setShader(new RadialGradient(f, height, min, -1, ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.CLAMP));
        canvas.drawCircle(f, height, min, this.huePaint);
        canvas.drawCircle(f, height, min, this.saturationPaint);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.huePaint.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.huePaint.setColorFilter(colorFilter);
    }
}
