package com.blackhub.bronline.game.core.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.core.content.res.ResourcesCompat;
import androidx.multidex.MultiDexExtractor;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.constants.FileFormats;
import com.blackhub.bronline.game.core.constants.PathConstants;
import com.blackhub.bronline.game.core.enums.ImageFormatTypeEnum;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.FloatExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.launcher.di.AppContext;
import com.caverock.androidsvg.SVG;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: BitmapUtils.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u0006\u001a\u0018\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u0006\u001a\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002\u001a6\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u001a4\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00182\b\b\u0001\u0010\b\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u0012\u001a\u00020\u0013\u001a\"\u0010\u001b\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013\u001a\"\u0010\u001c\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013\u001a2\u0010\u001d\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015\u001a\"\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¨\u0006!"}, d2 = {"decodeBitmapFromZip", "Landroid/graphics/Bitmap;", "zipFilePath", "", "imageName", "inSampleSize", "", "drawableToBitmap", "context", "Landroid/content/Context;", "drawableId", "getBitmap", "resources", "Landroid/content/res/Resources;", "drawableRes", "getBitmapFromDisk", "key", "getBitmapFromZip", "imageType", "Lcom/blackhub/bronline/game/core/enums/ImageTypePathInCDNEnum;", "height", "", "width", "getBitmapMapFromZip", "", "imgNameList", "", "getPngBitmapFromZip", "getSvgBitmapFromZip", "getSvgBitmapFromZipWithSize", "saveBitmapToDisk", "", "bitmap", "app_siteRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBitmapUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapUtils.kt\ncom/blackhub/bronline/game/core/utils/BitmapUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,358:1\n1271#2,2:359\n1285#2,4:361\n*S KotlinDebug\n*F\n+ 1 BitmapUtils.kt\ncom/blackhub/bronline/game/core/utils/BitmapUtilsKt\n*L\n308#1:359,2\n308#1:361,4\n*E\n"})
/* loaded from: classes3.dex */
public final class BitmapUtilsKt {
    @NotNull
    public static final Bitmap getBitmap(@NotNull Resources resources, @DrawableRes int i) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Drawable drawable = ResourcesCompat.getDrawable(resources, i, null);
        Canvas canvas = new Canvas();
        Bitmap createBitmap = Bitmap.createBitmap(IntExtensionKt.getOrOne(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null), IntExtensionKt.getOrOne(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        canvas.setBitmap(createBitmap);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
        return createBitmap;
    }

    @Nullable
    public static final Bitmap drawableToBitmap(@AppContext @NotNull Context context, @DrawableRes int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Drawable drawable = ResourcesCompat.getDrawable(context.getResources(), i, null);
            if (drawable == null) {
                return null;
            }
            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Exception e) {
            UtilsKt.crashlyticsRecordNewException("Failed drawableToBitmap() - transform drawableId " + i + " to Bitmap: " + e);
            return null;
        }
    }

    @Nullable
    public static final Bitmap getPngBitmapFromZip(@AppContext @NotNull Context context, @NotNull String imageName, @NotNull ImageTypePathInCDNEnum imageType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        Intrinsics.checkNotNullParameter(imageType, "imageType");
        if (imageName.length() > 0) {
            Bitmap bitmapFromDisk = getBitmapFromDisk(context, imageName);
            if (bitmapFromDisk != null) {
                return bitmapFromDisk;
            }
            File externalFilesDir = context.getExternalFilesDir(null);
            String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
            String str = absolutePath + PathConstants.RESOURCES_IMAGES_PATH + imageType.getType() + StringsKt__StringsKt.removeSuffix(imageName, (CharSequence) ImageFormatTypeEnum.PNG.getDotType()) + MultiDexExtractor.EXTRACTED_SUFFIX;
            for (int i = 1; i <= 8; i *= 2) {
                try {
                    Bitmap decodeBitmapFromZip = decodeBitmapFromZip(str, imageName, i);
                    if (decodeBitmapFromZip != null) {
                        saveBitmapToDisk(context, decodeBitmapFromZip, imageName);
                        return decodeBitmapFromZip;
                    }
                    return drawableToBitmap(context, R.drawable.img_not_found);
                } catch (FileNotFoundException unused) {
                    UtilsKt.crashlyticsRecordNewException("Failed getPngBitmapFromZip() - imageName: " + imageName + " throw FileNotFoundException: " + str + " after several attempts");
                    return drawableToBitmap(context, R.drawable.img_not_found);
                } catch (Exception e) {
                    UtilsKt.crashlyticsRecordNewException("Failed getPngBitmapFromZip() - imageName: " + imageName + " throw: " + e + " path: " + str + " after several attempts");
                    return null;
                } catch (OutOfMemoryError unused2) {
                    UtilsKt.crashlyticsRecordNewException("Failed getPngBitmapFromZip() - imageName: " + imageName + " throw OutOfMemoryError: " + str + " inSampleSize: " + i);
                }
            }
        }
        return null;
    }

    @Nullable
    public static final Bitmap getSvgBitmapFromZip(@AppContext @NotNull Context context, @NotNull String imageName, @NotNull ImageTypePathInCDNEnum imageType) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        Intrinsics.checkNotNullParameter(imageType, "imageType");
        Bitmap bitmapFromDisk = getBitmapFromDisk(context, imageName);
        if (bitmapFromDisk != null) {
            return bitmapFromDisk;
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
        String str = absolutePath + PathConstants.RESOURCES_IMAGES_PATH + imageType.getType() + StringsKt__StringsKt.removeSuffix(imageName, (CharSequence) ImageFormatTypeEnum.SVG.getDotType()) + MultiDexExtractor.EXTRACTED_SUFFIX;
        try {
            ZipFile zipFile = new ZipFile(str);
            try {
                ZipEntry entry = zipFile.getEntry(imageName);
                if (entry != null) {
                    Intrinsics.checkNotNull(entry);
                    String name = entry.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    if (StringsKt__StringsJVMKt.endsWith$default(name, FileFormats.SVG_FORMAT, false, 2, null)) {
                        InputStream inputStream = zipFile.getInputStream(entry);
                        try {
                            SVG fromInputStream = SVG.getFromInputStream(inputStream);
                            if (StringsKt__StringsJVMKt.startsWith$default(imageName, "bg", false, 2, null)) {
                                float coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(fromInputStream.getDocumentHeight(), 1.0f) * 2.5f;
                                float coerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(fromInputStream.getDocumentWidth(), 1.0f) * 2.5f;
                                fromInputStream.setDocumentHeight(coerceAtLeast);
                                fromInputStream.setDocumentWidth(coerceAtLeast2);
                            }
                            bitmap = Bitmap.createBitmap(FloatExtensionKt.roundToIntSafely(RangesKt___RangesKt.coerceAtLeast(fromInputStream.getDocumentWidth(), 1.0f)), FloatExtensionKt.roundToIntSafely(RangesKt___RangesKt.coerceAtLeast(fromInputStream.getDocumentHeight(), 1.0f)), Bitmap.Config.ARGB_8888);
                            Intrinsics.checkNotNullExpressionValue(bitmap, "createBitmap(...)");
                            fromInputStream.renderToCanvas(new Canvas(bitmap));
                            CloseableKt.closeFinally(inputStream, null);
                        } finally {
                        }
                    } else {
                        throw new FileNotFoundException();
                    }
                } else {
                    bitmap = null;
                }
                CloseableKt.closeFinally(zipFile, null);
                saveBitmapToDisk(context, bitmap, imageName);
                return bitmap;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(zipFile, th);
                    throw th2;
                }
            }
        } catch (FileNotFoundException unused) {
            UtilsKt.crashlyticsRecordNewException("Failed getSvgBitmapFromZip() - imageName: " + imageName + " throw FileNotFoundException: " + str);
            return drawableToBitmap(context, R.drawable.img_not_found);
        } catch (Exception e) {
            UtilsKt.crashlyticsRecordNewException("Failed getSvgBitmapFromZip() - imageName: " + imageName + " throw: " + e);
            return null;
        }
    }

    @Nullable
    public static final Bitmap getSvgBitmapFromZipWithSize(@AppContext @NotNull Context context, @NotNull String imageName, @NotNull ImageTypePathInCDNEnum imageType, float f, float f2) {
        Bitmap drawableToBitmap;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        Intrinsics.checkNotNullParameter(imageType, "imageType");
        Bitmap bitmapFromDisk = getBitmapFromDisk(context, imageName);
        if (bitmapFromDisk != null) {
            return bitmapFromDisk;
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
        String str = absolutePath + PathConstants.RESOURCES_IMAGES_PATH + imageType.getType() + StringsKt__StringsKt.removeSuffix(imageName, (CharSequence) ImageFormatTypeEnum.SVG.getDotType()) + MultiDexExtractor.EXTRACTED_SUFFIX;
        try {
            ZipFile zipFile = new ZipFile(str);
            try {
                ZipEntry entry = zipFile.getEntry(imageName);
                if (entry != null) {
                    InputStream inputStream = zipFile.getInputStream(entry);
                    try {
                        SVG fromInputStream = SVG.getFromInputStream(inputStream);
                        fromInputStream.setDocumentHeight(f);
                        fromInputStream.setDocumentWidth(f2);
                        drawableToBitmap = Bitmap.createBitmap(IntExtensionKt.getOrZero(Integer.valueOf(FloatExtensionKt.roundToIntSafely(RangesKt___RangesKt.coerceAtLeast(fromInputStream.getDocumentWidth(), 1.0f)))), IntExtensionKt.getOrZero(Integer.valueOf(FloatExtensionKt.roundToIntSafely(RangesKt___RangesKt.coerceAtLeast(fromInputStream.getDocumentHeight(), 1.0f)))), Bitmap.Config.ARGB_8888);
                        Intrinsics.checkNotNullExpressionValue(drawableToBitmap, "createBitmap(...)");
                        fromInputStream.renderToCanvas(new Canvas(drawableToBitmap));
                        CloseableKt.closeFinally(inputStream, null);
                    } finally {
                    }
                } else {
                    UtilsKt.crashlyticsRecordNewException("Failed getSvgBitmapFromZipWithSize() - imageName: " + imageName + " NotFound in zip: " + str);
                    drawableToBitmap = drawableToBitmap(context, R.drawable.img_not_found);
                }
                CloseableKt.closeFinally(zipFile, null);
                saveBitmapToDisk(context, drawableToBitmap, imageName);
                return drawableToBitmap;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(zipFile, th);
                    throw th2;
                }
            }
        } catch (FileNotFoundException unused) {
            UtilsKt.crashlyticsRecordNewException("Failed getSvgBitmapFromZipWithSize() - imageName: " + imageName + " throw FileNotFoundException: " + str);
            return drawableToBitmap(context, R.drawable.img_not_found);
        } catch (Exception e) {
            UtilsKt.crashlyticsRecordNewException("Failed to getSvgBitmapFromZipWithSizew(), imageName: " + imageName + " throw: " + e);
            return null;
        }
    }

    public static /* synthetic */ Bitmap getBitmapFromZip$default(Context context, String str, ImageTypePathInCDNEnum imageTypePathInCDNEnum, float f, float f2, int i, Object obj) {
        if ((i & 8) != 0) {
            f = 0.0f;
        }
        if ((i & 16) != 0) {
            f2 = 0.0f;
        }
        return getBitmapFromZip(context, str, imageTypePathInCDNEnum, f, f2);
    }

    @Nullable
    public static final Bitmap getBitmapFromZip(@AppContext @NotNull Context context, @NotNull String imageName, @NotNull ImageTypePathInCDNEnum imageType, float f, float f2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        Intrinsics.checkNotNullParameter(imageType, "imageType");
        UtilsKt.crashlyticsLog("getBitmapFromZip, imageName=" + imageName + ", imageType=" + imageType.getType());
        if (StringsKt__StringsJVMKt.endsWith$default(imageName, ".png", false, 2, null)) {
            return getPngBitmapFromZip(context, imageName, imageType);
        }
        if (!StringsKt__StringsJVMKt.endsWith$default(imageName, FileFormats.SVG_FORMAT, false, 2, null)) {
            return null;
        }
        if (f != 0.0f) {
            return getSvgBitmapFromZipWithSize(context, imageName, imageType, f, f2);
        }
        return getSvgBitmapFromZip(context, imageName, imageType);
    }

    @NotNull
    public static final Map<String, Bitmap> getBitmapMapFromZip(@AppContext @NotNull Context context, @NotNull List<String> imgNameList, @NotNull ImageTypePathInCDNEnum imageType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imgNameList, "imgNameList");
        Intrinsics.checkNotNullParameter(imageType, "imageType");
        List<String> list = imgNameList;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(obj, getBitmapFromZip$default(context, (String) obj, imageType, 0.0f, 0.0f, 24, null));
        }
        return linkedHashMap;
    }

    public static /* synthetic */ Bitmap decodeBitmapFromZip$default(String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        return decodeBitmapFromZip(str, str2, i);
    }

    public static final Bitmap decodeBitmapFromZip(String str, String str2, int i) {
        Bitmap bitmap;
        ZipFile zipFile = new ZipFile(str);
        try {
            ZipEntry entry = zipFile.getEntry(str2);
            if (entry != null) {
                Intrinsics.checkNotNull(entry);
                String name = entry.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (StringsKt__StringsJVMKt.endsWith$default(name, ".png", false, 2, null)) {
                    InputStream inputStream = zipFile.getInputStream(entry);
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = i;
                        bitmap = BitmapFactory.decodeStream(inputStream, null, options);
                        CloseableKt.closeFinally(inputStream, null);
                        CloseableKt.closeFinally(zipFile, null);
                        return bitmap;
                    } finally {
                    }
                }
            }
            bitmap = null;
            CloseableKt.closeFinally(zipFile, null);
            return bitmap;
        } finally {
        }
    }

    public static final void saveBitmapToDisk(Context context, Bitmap bitmap, String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(context.getCacheDir(), str));
            if (bitmap != null) {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            UtilsKt.crashlyticsRecordNewException("Failed to saveBitmapToDisk() key: " + str + " throw: " + e);
        }
    }

    public static final Bitmap getBitmapFromDisk(Context context, String str) {
        try {
            File file = new File(context.getCacheDir(), str);
            if (file.exists()) {
                return BitmapFactory.decodeFile(file.getAbsolutePath());
            }
            return null;
        } catch (IOException e) {
            UtilsKt.crashlyticsRecordNewException("Failed to getBitmapFromDisk() key: " + str + " throw: " + e);
            return null;
        }
    }
}
