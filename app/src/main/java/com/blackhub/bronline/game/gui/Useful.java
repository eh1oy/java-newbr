package com.blackhub.bronline.game.gui;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.core.JNIActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Useful.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0018J\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0018J\u001a\u0010!\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0018H\u0002J©\u0001\u0010#\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u00042\b\u0010%\u001a\u0004\u0018\u00010\u00042\b\u0010&\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00042\u0006\u0010(\u001a\u00020)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u000b2\u0016\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u000103\u0018\u000102¢\u0006\u0002\u00104JL\u00105\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00182\u0006\u00108\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)2\u0014\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u000103022\u0006\u00109\u001a\u00020\u0018J.\u0010:\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020;R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/blackhub/bronline/game/gui/Useful;", "", "()V", "ALPHA_FULL_VISIBLE", "", "ALPHA_HALF_VISIBLE", "COLOR_DEFAULT", "COLOR_IF_CAR", "COLOR_IF_OBJECT", "COLOR_IF_SKIN", "ROT_X_DEFAULT", "", "ROT_Y_DEFAULT", "ROT_Z_DEFAULT", "ZOOM_DEFAULT", "ZOOM_FOR_CARS", "ZOOM_FOR_SKINS", "closeAndroidsInterface", "", "popup", "Landroid/widget/PopupWindow;", "getDrawableByName", "Landroid/graphics/drawable/Drawable;", "name", "", "getTextWithHtmlStyles", "Landroid/text/Spanned;", "currentText", "jsonStringToBundle", "Landroid/os/Bundle;", "jsonString", "Lorg/json/JSONObject;", "currentTag", "jsonToBundle", "jsonObject", "renderItem", "type", "id", "modelId", "color", "thisObject", "Landroid/widget/ImageView;", "x", "y", "z", "zoom", "shiftX", "shiftY", "shiftZ", "currentCollection", "Landroidx/collection/ArrayMap;", "Landroid/graphics/Bitmap;", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/widget/ImageView;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Landroidx/collection/ArrayMap;)V", "renderPlate", "itemsId", "number", "region", "currentKey", "renderSkin", "Landroid/widget/FrameLayout;", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUseful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Useful.kt\ncom/blackhub/bronline/game/gui/Useful\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n1#2:361\n*E\n"})
/* loaded from: classes3.dex */
public final class Useful {
    public static final int $stable = 0;
    public static final int ALPHA_FULL_VISIBLE = 255;
    public static final int ALPHA_HALF_VISIBLE = 128;
    public static final int COLOR_DEFAULT = 0;
    public static final int COLOR_IF_CAR = 1;
    public static final int COLOR_IF_OBJECT = 3;
    public static final int COLOR_IF_SKIN = 1;

    @NotNull
    public static final Useful INSTANCE = new Useful();
    public static final float ROT_X_DEFAULT = 20.0f;
    public static final float ROT_Y_DEFAULT = 180.0f;
    public static final float ROT_Z_DEFAULT = 45.0f;
    public static final float ZOOM_DEFAULT = 0.78f;
    public static final float ZOOM_FOR_CARS = 0.85f;
    public static final float ZOOM_FOR_SKINS = 1.0f;

    @Nullable
    public final Drawable getDrawableByName(@Nullable String name) {
        JNIActivity context = JNIActivity.getContext();
        int identifier = name == null ? 0 : context.getResources().getIdentifier(name, "drawable", context.getPackageName());
        if (identifier == 0) {
            return ResourcesCompat.getDrawable(context.getResources(), R.drawable.img_logo_br_big, null);
        }
        return ResourcesCompat.getDrawable(context.getResources(), identifier, null);
    }

    public final void renderItem(@Nullable Integer type, @Nullable Integer id, @Nullable Integer modelId, @Nullable Integer color, @NotNull ImageView thisObject, @Nullable Float x, @Nullable Float y, @Nullable Float z, @Nullable Float zoom, @Nullable Float shiftX, @Nullable Float shiftY, @Nullable Float shiftZ, @Nullable ArrayMap<String, Bitmap> currentCollection) {
        Intrinsics.checkNotNullParameter(thisObject, "thisObject");
        int intValue = type != null ? type.intValue() : 0;
        int intValue2 = id != null ? id.intValue() : 0;
        int intValue3 = modelId != null ? modelId.intValue() : 0;
        int intValue4 = color != null ? color.intValue() : 0;
        float floatValue = x != null ? x.floatValue() : 20.0f;
        float floatValue2 = y != null ? y.floatValue() : 180.0f;
        float floatValue3 = z != null ? z.floatValue() : 45.0f;
        float floatValue4 = zoom != null ? zoom.floatValue() : 0.78f;
        GameRender.getInstance().SetOffsets(shiftX != null ? shiftX.floatValue() : 0.0f, shiftY != null ? shiftY.floatValue() : 0.0f, shiftZ != null ? shiftZ.floatValue() : 0.0f);
        thisObject.setAlpha(0.0f);
        GameRender.getInstance().RequestRender(intValue, intValue2, intValue3, intValue4, intValue4, floatValue, floatValue2, floatValue3, floatValue4, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.gui.Useful$$ExternalSyntheticLambda1
            public final /* synthetic */ ImageView f$0;
            public final /* synthetic */ ArrayMap f$1;
            public final /* synthetic */ Integer f$2;

            public /* synthetic */ Useful$$ExternalSyntheticLambda1(ImageView thisObject2, ArrayMap currentCollection2, Integer modelId2) {
                r1 = thisObject2;
                r2 = currentCollection2;
                r3 = modelId2;
            }

            @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
            public final void OnRenderComplete(int i, Bitmap bitmap) {
                Useful.renderItem$lambda$3(r1, r2, r3, i, bitmap);
            }
        });
    }

    public static final void renderItem$lambda$3(ImageView thisObject, ArrayMap arrayMap, Integer num, int i, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(thisObject, "$thisObject");
        JNIActivity.getContext().runOnUiThread(new Runnable() { // from class: com.blackhub.bronline.game.gui.Useful$$ExternalSyntheticLambda5
            public final /* synthetic */ ImageView f$1;
            public final /* synthetic */ Bitmap f$2;
            public final /* synthetic */ ArrayMap f$3;
            public final /* synthetic */ Integer f$4;

            public /* synthetic */ Useful$$ExternalSyntheticLambda5(ImageView thisObject2, Bitmap bitmap2, ArrayMap arrayMap2, Integer num2) {
                r2 = thisObject2;
                r3 = bitmap2;
                r4 = arrayMap2;
                r5 = num2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Useful.renderItem$lambda$3$lambda$2$lambda$1(Useful.this, r2, r3, r4, r5);
            }
        });
    }

    public static final void renderItem$lambda$3$lambda$2$lambda$1(Useful this_run, ImageView thisObject, Bitmap bitmap, ArrayMap arrayMap, Integer num) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        Intrinsics.checkNotNullParameter(thisObject, "$thisObject");
        thisObject.setImageBitmap(bitmap);
        if (arrayMap != null) {
            arrayMap.put(String.valueOf(num), bitmap);
        }
        thisObject.animate().alpha(1.0f).setDuration(300L);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.gui.Useful$$ExternalSyntheticLambda0.<init>(com.blackhub.bronline.game.core.JNIActivity, android.widget.FrameLayout):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:290)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:193)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public final void renderSkin(int r15, int r16, int r17, int r18, @org.jetbrains.annotations.NotNull android.widget.FrameLayout r19) {
        /*
            r14 = this;
            r0 = r19
            java.lang.String r1 = "thisObject"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            com.blackhub.bronline.game.core.JNIActivity r1 = com.blackhub.bronline.game.core.JNIActivity.getContext()
            r2 = 0
            r0.setAlpha(r2)
            com.blackhub.bronline.game.GameRender r3 = com.blackhub.bronline.game.GameRender.getInstance()
            com.blackhub.bronline.game.gui.Useful$$ExternalSyntheticLambda0 r13 = new com.blackhub.bronline.game.gui.Useful$$ExternalSyntheticLambda0
            r13.<init>()
            r9 = 1101004800(0x41a00000, float:20.0)
            r10 = 1127481344(0x43340000, float:180.0)
            r11 = 0
            r12 = 1063675494(0x3f666666, float:0.9)
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r18
            r3.RequestRender(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.Useful.renderSkin(int, int, int, int, android.widget.FrameLayout):void");
    }

    public static final void renderSkin$lambda$8(JNIActivity jNIActivity, FrameLayout thisObject, int i, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(thisObject, "$thisObject");
        jNIActivity.runOnUiThread(new Runnable() { // from class: com.blackhub.bronline.game.gui.Useful$$ExternalSyntheticLambda7
            public final /* synthetic */ JNIActivity f$1;
            public final /* synthetic */ Bitmap f$2;
            public final /* synthetic */ FrameLayout f$3;

            public /* synthetic */ Useful$$ExternalSyntheticLambda7(JNIActivity jNIActivity2, Bitmap bitmap2, FrameLayout thisObject2) {
                r2 = jNIActivity2;
                r3 = bitmap2;
                r4 = thisObject2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Useful.renderSkin$lambda$8$lambda$7$lambda$6(Useful.this, r2, r3, r4);
            }
        });
    }

    public static final void renderSkin$lambda$8$lambda$7$lambda$6(Useful this_run, JNIActivity jNIActivity, Bitmap bitmap, FrameLayout thisObject) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        Intrinsics.checkNotNullParameter(thisObject, "$thisObject");
        thisObject.setBackground(new BitmapDrawable(jNIActivity.getResources(), bitmap));
        thisObject.animate().alpha(1.0f).setDuration(150L);
    }

    public final void renderPlate(int type, int itemsId, @NotNull String number, @NotNull String region, @NotNull ImageView thisObject, @NotNull ArrayMap<String, Bitmap> currentCollection, @NotNull String currentKey) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(thisObject, "thisObject");
        Intrinsics.checkNotNullParameter(currentCollection, "currentCollection");
        Intrinsics.checkNotNullParameter(currentKey, "currentKey");
        GameRender.getInstance().RequestTexturePlate(type, itemsId, number, region, 0.0f, 180.0f, 0.0f, 0.78f, new GameRender.GameTextureListener() { // from class: com.blackhub.bronline.game.gui.Useful$$ExternalSyntheticLambda2
            public final /* synthetic */ ImageView f$1;
            public final /* synthetic */ ArrayMap f$2;
            public final /* synthetic */ String f$3;

            public /* synthetic */ Useful$$ExternalSyntheticLambda2(ImageView thisObject2, ArrayMap currentCollection2, String currentKey2) {
                r2 = thisObject2;
                r3 = currentCollection2;
                r4 = currentKey2;
            }

            @Override // com.blackhub.bronline.game.GameRender.GameTextureListener
            public final void OnTextureGet(int i, Bitmap bitmap) {
                Useful.renderPlate$lambda$12(JNIActivity.this, r2, r3, r4, i, bitmap);
            }
        });
    }

    public static final void renderPlate$lambda$12(JNIActivity jNIActivity, ImageView thisObject, ArrayMap currentCollection, String currentKey, int i, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(thisObject, "$thisObject");
        Intrinsics.checkNotNullParameter(currentCollection, "$currentCollection");
        Intrinsics.checkNotNullParameter(currentKey, "$currentKey");
        jNIActivity.runOnUiThread(new Runnable() { // from class: com.blackhub.bronline.game.gui.Useful$$ExternalSyntheticLambda6
            public final /* synthetic */ ImageView f$1;
            public final /* synthetic */ Bitmap f$2;
            public final /* synthetic */ ArrayMap f$3;
            public final /* synthetic */ String f$4;

            public /* synthetic */ Useful$$ExternalSyntheticLambda6(ImageView thisObject2, Bitmap bitmap2, ArrayMap currentCollection2, String currentKey2) {
                r2 = thisObject2;
                r3 = bitmap2;
                r4 = currentCollection2;
                r5 = currentKey2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Useful.renderPlate$lambda$12$lambda$11$lambda$10(Useful.this, r2, r3, r4, r5);
            }
        });
    }

    public static final void renderPlate$lambda$12$lambda$11$lambda$10(Useful this_run, ImageView thisObject, Bitmap bitmap, ArrayMap currentCollection, String currentKey) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        Intrinsics.checkNotNullParameter(thisObject, "$thisObject");
        Intrinsics.checkNotNullParameter(currentCollection, "$currentCollection");
        Intrinsics.checkNotNullParameter(currentKey, "$currentKey");
        thisObject.setImageBitmap(bitmap);
        currentCollection.put(currentKey, bitmap);
    }

    public final void closeAndroidsInterface(@Nullable PopupWindow popup) {
        JNIActivity context = JNIActivity.getContext();
        context.getParentLayout().postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.Useful$$ExternalSyntheticLambda3
            public final /* synthetic */ PopupWindow f$0;
            public final /* synthetic */ JNIActivity f$1;

            public /* synthetic */ Useful$$ExternalSyntheticLambda3(PopupWindow popup2, JNIActivity context2) {
                r1 = popup2;
                r2 = context2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Useful.closeAndroidsInterface$lambda$16(r1, r2);
            }
        }, 300L);
    }

    public static final void closeAndroidsInterface$lambda$16(PopupWindow popupWindow, JNIActivity jNIActivity) {
        if (popupWindow != null) {
            try {
                UsefulKt.hideSystemUI(popupWindow.getContentView());
            } catch (Exception unused) {
                jNIActivity.getParentLayout().postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.Useful$$ExternalSyntheticLambda4
                    public final /* synthetic */ PopupWindow f$0;

                    public /* synthetic */ Useful$$ExternalSyntheticLambda4(PopupWindow popupWindow2) {
                        r1 = popupWindow2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Useful.closeAndroidsInterface$lambda$16$lambda$15(r1);
                    }
                }, 1000L);
            }
        }
    }

    public static final void closeAndroidsInterface$lambda$16$lambda$15(PopupWindow popupWindow) {
        if (popupWindow != null) {
            UsefulKt.hideSystemUI(popupWindow.getContentView());
        }
    }

    @Nullable
    public final Bundle jsonStringToBundle(@NotNull JSONObject jsonString, @NotNull String currentTag) {
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        Intrinsics.checkNotNullParameter(currentTag, "currentTag");
        try {
            return jsonToBundle(jsonString, currentTag);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final Bundle jsonToBundle(JSONObject jsonObject, String currentTag) throws JSONException {
        Bundle bundle;
        if (JNIActivity.getContext().getMainBundle() != null) {
            bundle = JNIActivity.getContext().getMainBundle();
        } else {
            bundle = new Bundle();
        }
        bundle.putString(currentTag, jsonObject.toString());
        return bundle;
    }

    @NotNull
    public final Spanned getTextWithHtmlStyles(@NotNull String currentText) {
        Intrinsics.checkNotNullParameter(currentText, "currentText");
        Spanned fromHtml = Html.fromHtml(currentText, 0);
        Intrinsics.checkNotNull(fromHtml);
        return fromHtml;
    }
}
