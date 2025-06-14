package com.blackhub.bronline.game.core.extension;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.Group;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewbinding.ViewBinding;
import coil.Coil;
import coil.ImageLoader;
import coil.request.Disposable;
import coil.request.ImageRequest;
import coil.target.Target;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.utils.AnimatedOnClickListener;
import com.blackhub.bronline.game.core.utils.DebouncedAndAnimatedOnClickListener;
import com.blackhub.bronline.game.core.utils.DebouncedOnClickListener;
import com.blackhub.bronline.game.core.utils.ViewDragShadowBuilder;
import com.blackhub.bronline.game.core.utils.draganddrop.enums.PointViewListenerEnum;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DataDragAndDrop;
import com.blackhub.bronline.game.core.utils.draganddrop.model.PointFloat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.ivy.osgi.obr.xml.OBRXMLParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewExtension.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\n\u0010\t\u001a\u00020\n*\u00020\u0002\u001a*\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b\u001a\u0016\u0010\u0010\u001a\u00020\u0011*\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u001a\n\u0010\u0014\u001a\u00020\u0011*\u00020\u0002\u001a\n\u0010\u0015\u001a\u00020\n*\u00020\u0002\u001a\n\u0010\u0016\u001a\u00020\u0011*\u00020\u0002\u001a8\u0010\u0017\u001a\u00020\u0001\"\b\b\u0000\u0010\u0018*\u00020\u0002*\u0002H\u00182\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u00020\u00010\u001a¢\u0006\u0002\b\u001bH\u0086\nø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a8\u0010\u0017\u001a\u00020\u0001\"\b\b\u0000\u0010\u0018*\u00020\u001d*\u0002H\u00182\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u00020\u00010\u001a¢\u0006\u0002\b\u001bH\u0086\nø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a9\u0010\u001f\u001a\u00020 *\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00010\u001a¢\u0006\u0002\b\u001b\u001a9\u0010'\u001a\u00020\u0001*\u00020(2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010)\u001a\u00020*2\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00010\u001a¢\u0006\u0002\b\u001b\u001a\u0014\u0010+\u001a\u00020\u0001*\u00020,2\b\b\u0001\u0010-\u001a\u00020*\u001a\u0014\u0010.\u001a\u00020\u0001*\u00020\u00022\b\u0010/\u001a\u0004\u0018\u000100\u001a\u0016\u00101\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u00102\u001a\u000203H\u0007\u001a2\u00104\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u00105\u001a\u00020*2\b\b\u0002\u00106\u001a\u00020*2\b\b\u0002\u00107\u001a\u00020*2\b\b\u0002\u00108\u001a\u00020*\u001a\u001e\u00109\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010:\u001a\u00020;2\b\u0010/\u001a\u0004\u0018\u000100\u001a\u001e\u0010<\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010:\u001a\u00020;2\b\u0010/\u001a\u0004\u0018\u000100\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006="}, d2 = {"addViewObserver", "", "Landroid/view/View;", "function", "Lkotlin/Function0;", "animateAlphaForAll", "Landroidx/constraintlayout/widget/Group;", "alpha", "", "getGlobalCenterPoint", "Lcom/blackhub/bronline/game/core/utils/draganddrop/model/PointFloat;", "getGlobalPointCustomView", "pointX", "pointY", "halfWidth", "halfHeight", "getPositionListener", "Landroid/graphics/Point;", "pointViewListenerEnum", "Lcom/blackhub/bronline/game/core/utils/draganddrop/enums/PointViewListenerEnum;", "getSizeWithScaleAndRotate", "getStartLocationViewInWindow", "getStartLocationViewOnScreen", "invoke", ExifInterface.GPS_DIRECTION_TRUE, "binding", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "Landroidx/viewbinding/ViewBinding;", "(Landroidx/viewbinding/ViewBinding;Lkotlin/jvm/functions/Function1;)V", "loadBackground", "Lcoil/request/Disposable;", OBRXMLParser.ResourceHandler.RESOURCE, "", "imageLoader", "Lcoil/ImageLoader;", "builder", "Lcoil/request/ImageRequest$Builder;", "loadImage", "Landroid/widget/ImageView;", "defaultResourceId", "", "setBackgroundDrawableWithPadding", "Landroidx/appcompat/widget/AppCompatButton;", "resId", "setBeforeAnimateClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "setDragAndDrop", "data", "Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DataDragAndDrop;", "setMargins", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "setOnDebounceAndAnimateClickListener", "debounceMillis", "", "setOnDebounceClickListener", "app_siteRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExtension.kt\ncom/blackhub/bronline/game/core/extension/ViewExtensionKt\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 Extensions.kt\ncoil/-SingletonExtensions\n+ 5 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,280:1\n338#2:281\n347#2:282\n356#2:283\n365#2:284\n13330#3,2:285\n54#4,3:287\n24#4:290\n59#4,6:291\n24#4:306\n845#5,9:297\n*S KotlinDebug\n*F\n+ 1 ViewExtension.kt\ncom/blackhub/bronline/game/core/extension/ViewExtensionKt\n*L\n117#1:281\n118#1:282\n119#1:283\n120#1:284\n127#1:285,2\n260#1:287,3\n260#1:290\n260#1:291,6\n268#1:306\n273#1:297,9\n*E\n"})
/* loaded from: classes3.dex */
public final class ViewExtensionKt {

    /* compiled from: ViewExtension.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointViewListenerEnum.values().length];
            try {
                iArr[PointViewListenerEnum.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointViewListenerEnum.TOP_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointViewListenerEnum.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PointViewListenerEnum.BOTTOM_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PointViewListenerEnum.BOTTOM_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final <T extends ViewBinding> void invoke(@NotNull T t, @NotNull Function1<? super T, Unit> binding) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(binding, "binding");
        binding.invoke(t);
    }

    public static final <T extends View> void invoke(@NotNull T t, @NotNull Function1<? super T, Unit> binding) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(binding, "binding");
        binding.invoke(t);
    }

    @NotNull
    public static final Point getSizeWithScaleAndRotate(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        double radians = Math.toRadians(view.getRotation());
        int width = (int) (view.getWidth() * view.getScaleX());
        int height = (int) (view.getHeight() * view.getScaleY());
        double abs = Math.abs(Math.sin(radians));
        double abs2 = Math.abs(Math.cos(radians));
        double d = width;
        double d2 = height;
        return new Point((int) ((d * abs2) + (d2 * abs)), (int) ((d * abs) + (d2 * abs2)));
    }

    public static /* synthetic */ void setOnDebounceClickListener$default(View view, long j, View.OnClickListener onClickListener, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        setOnDebounceClickListener(view, j, onClickListener);
    }

    public static final void setOnDebounceClickListener(@NotNull View view, long j, @Nullable View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setOnClickListener(new DebouncedOnClickListener(j) { // from class: com.blackhub.bronline.game.core.extension.ViewExtensionKt$setOnDebounceClickListener$1
            public final /* synthetic */ View.OnClickListener $listener;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewExtensionKt$setOnDebounceClickListener$1(long j2, View.OnClickListener onClickListener2) {
                super(j2);
                r3 = onClickListener2;
            }

            @Override // com.blackhub.bronline.game.core.utils.DebouncedOnClickListener
            public void onDebouncedClick(@Nullable View v) {
                View.OnClickListener onClickListener2 = r3;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(v);
                }
            }
        });
    }

    public static /* synthetic */ void setOnDebounceAndAnimateClickListener$default(View view, long j, View.OnClickListener onClickListener, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        setOnDebounceAndAnimateClickListener(view, j, onClickListener);
    }

    public static final void setOnDebounceAndAnimateClickListener(@NotNull View view, long j, @Nullable View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setOnClickListener(new DebouncedAndAnimatedOnClickListener(j) { // from class: com.blackhub.bronline.game.core.extension.ViewExtensionKt$setOnDebounceAndAnimateClickListener$1
            public final /* synthetic */ View.OnClickListener $listener;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewExtensionKt$setOnDebounceAndAnimateClickListener$1(long j2, View.OnClickListener onClickListener2) {
                super(j2);
                r3 = onClickListener2;
            }

            @Override // com.blackhub.bronline.game.core.utils.DebouncedAndAnimatedOnClickListener
            public void onDebouncedClick(@Nullable View r2) {
                View.OnClickListener onClickListener2 = r3;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(r2);
                }
            }
        });
    }

    public static final void setBeforeAnimateClickListener(@NotNull View view, @Nullable View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setOnClickListener(new AnimatedOnClickListener() { // from class: com.blackhub.bronline.game.core.extension.ViewExtensionKt$setBeforeAnimateClickListener$1
            public final /* synthetic */ View.OnClickListener $listener;

            public ViewExtensionKt$setBeforeAnimateClickListener$1(View.OnClickListener onClickListener2) {
                r1 = onClickListener2;
            }

            @Override // com.blackhub.bronline.game.core.utils.AnimatedOnClickListener
            public void onAnimateClick(@Nullable View r2) {
                View.OnClickListener onClickListener2 = r1;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(r2);
                }
            }
        });
    }

    @NotNull
    public static final Point getStartLocationViewOnScreen(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    @NotNull
    public static final PointFloat getStartLocationViewInWindow(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.getLocationInWindow(new int[2]);
        return new PointFloat(ArraysKt___ArraysKt.first(r0), ArraysKt___ArraysKt.last(r0));
    }

    public static final void addViewObserver(@NotNull View view, @NotNull Function0<Unit> function) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(function, "function");
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.blackhub.bronline.game.core.extension.ViewExtensionKt$addViewObserver$1
            public final /* synthetic */ Function0<Unit> $function;
            public final /* synthetic */ View $view;

            public ViewExtensionKt$addViewObserver$1(View view2, Function0<Unit> function2) {
                r1 = view2;
                r2 = function2;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                r1.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                r2.invoke();
            }
        });
    }

    public static final void setMargins(@NotNull View view, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(i, i2, i3, i4);
        view.setLayoutParams(marginLayoutParams);
    }

    public static final void animateAlphaForAll(@NotNull Group group, float f) {
        Intrinsics.checkNotNullParameter(group, "<this>");
        int[] referencedIds = group.getReferencedIds();
        Intrinsics.checkNotNullExpressionValue(referencedIds, "getReferencedIds(...)");
        for (int i : referencedIds) {
            ViewPropertyAnimator animate = group.getRootView().findViewById(i).animate();
            animate.setDuration(200L);
            animate.alpha(f);
        }
    }

    public static /* synthetic */ Point getPositionListener$default(View view, PointViewListenerEnum pointViewListenerEnum, int i, Object obj) {
        if ((i & 1) != 0) {
            pointViewListenerEnum = PointViewListenerEnum.CENTER;
        }
        return getPositionListener(view, pointViewListenerEnum);
    }

    @NotNull
    public static final Point getPositionListener(@NotNull View view, @Nullable PointViewListenerEnum pointViewListenerEnum) {
        Point point;
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.getHeight();
        view.getScaleY();
        view.getWidth();
        view.getScaleX();
        int x = (int) view.getX();
        int y = (int) view.getY();
        int i = pointViewListenerEnum == null ? -1 : WhenMappings.$EnumSwitchMapping$0[pointViewListenerEnum.ordinal()];
        if (i == 1) {
            return new Point(x, y);
        }
        if (i == 2) {
            point = new Point(x + (view.getWidth() / 2), y);
        } else if (i == 3) {
            point = new Point(x + (view.getWidth() / 2), y + (view.getHeight() / 2));
        } else if (i == 4) {
            point = new Point(x, y + view.getHeight());
        } else if (i == 5) {
            point = new Point(x + view.getWidth(), y + view.getHeight());
        } else {
            return new Point();
        }
        return point;
    }

    public static /* synthetic */ void setDragAndDrop$default(View view, DataDragAndDrop dataDragAndDrop, int i, Object obj) {
        if ((i & 1) != 0) {
            dataDragAndDrop = new DataDragAndDrop(0.0f, 0.0f, 0, 7, null);
        }
        setDragAndDrop(view, dataDragAndDrop);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public static final void setDragAndDrop(@NotNull View view, @NotNull DataDragAndDrop data) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.core.extension.ViewExtensionKt$$ExternalSyntheticLambda0
            public final /* synthetic */ View f$1;

            public /* synthetic */ ViewExtensionKt$$ExternalSyntheticLambda0(View view2) {
                r2 = view2;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean dragAndDrop$lambda$3;
                dragAndDrop$lambda$3 = ViewExtensionKt.setDragAndDrop$lambda$3(DataDragAndDrop.this, r2, view2, motionEvent);
                return dragAndDrop$lambda$3;
            }
        });
    }

    public static final boolean setDragAndDrop$lambda$3(DataDragAndDrop data, View this_setDragAndDrop, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(this_setDragAndDrop, "$this_setDragAndDrop");
        int action = motionEvent.getAction();
        if (action != 0) {
            return action == 1 || action == 2 || action == 3 || action == 5 || action == 6 || action == 11;
        }
        view.setRotation(data.getNewRotate());
        view.setScaleX(data.getNewScale());
        view.setScaleY(data.getNewScale());
        Intrinsics.checkNotNull(view);
        view.startDragAndDrop(ClipData.newPlainText(AnyExtensionKt.empty(this_setDragAndDrop), AnyExtensionKt.empty(this_setDragAndDrop)), new ViewDragShadowBuilder(view), view, 512);
        return true;
    }

    @NotNull
    public static final PointFloat getGlobalPointCustomView(@NotNull View view, float f, float f2, float f3, float f4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewParent parent = view.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).getLocationInWindow(new int[2]);
        return new PointFloat(ArraysKt___ArraysKt.first(r0) + f + f3, ArraysKt___ArraysKt.last(r0) + f2 + f4);
    }

    @NotNull
    public static final PointFloat getGlobalCenterPoint(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewParent parent = view.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).getLocationInWindow(new int[2]);
        return new PointFloat(ArraysKt___ArraysKt.first(r2) + view.getX() + (view.getWidth() / 2), ArraysKt___ArraysKt.last(r2) + view.getY() + (view.getHeight() / 2));
    }

    public static final void setBackgroundDrawableWithPadding(@NotNull AppCompatButton appCompatButton, @DrawableRes int i) {
        Intrinsics.checkNotNullParameter(appCompatButton, "<this>");
        int paddingStart = appCompatButton.getPaddingStart();
        int paddingTop = appCompatButton.getPaddingTop();
        int paddingEnd = appCompatButton.getPaddingEnd();
        int paddingBottom = appCompatButton.getPaddingBottom();
        appCompatButton.setBackgroundResource(i);
        appCompatButton.setPadding(paddingStart, paddingTop, paddingEnd, paddingBottom);
    }

    public static /* synthetic */ void loadImage$default(ImageView imageView, Object obj, int i, Function1 function1, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            i = R.drawable.img_logo_br_big;
        }
        if ((i2 & 4) != 0) {
            function1 = ViewExtensionKt$loadImage$1.INSTANCE;
        }
        loadImage(imageView, obj, i, function1);
    }

    public static /* synthetic */ Disposable loadBackground$default(View view, Object obj, ImageLoader imageLoader, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            imageLoader = Coil.imageLoader(context);
        }
        if ((i & 4) != 0) {
            function1 = ViewExtensionKt$loadBackground$1.INSTANCE;
        }
        return loadBackground(view, obj, imageLoader, function1);
    }

    @NotNull
    public static final Disposable loadBackground(@NotNull View view, @Nullable Object obj, @NotNull ImageLoader imageLoader, @NotNull Function1<? super ImageRequest.Builder, Unit> builder) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ImageRequest.Builder target = new ImageRequest.Builder(context).data(obj).target(new Target() { // from class: com.blackhub.bronline.game.core.extension.ViewExtensionKt$loadBackground$$inlined$target$default$1
            public final /* synthetic */ View $this_loadBackground$inlined;

            @Override // coil.target.Target
            public void onError(@Nullable Drawable error) {
            }

            @Override // coil.target.Target
            public void onStart(@Nullable Drawable placeholder) {
            }

            public ViewExtensionKt$loadBackground$$inlined$target$default$1(View view2) {
                r1 = view2;
            }

            @Override // coil.target.Target
            public void onSuccess(@NotNull Drawable result) {
                r1.setBackground(result);
            }
        });
        builder.invoke(target);
        return imageLoader.enqueue(target.build());
    }

    public static /* synthetic */ void setMargins$default(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            i = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        }
        if ((i5 & 2) != 0) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            i2 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
        }
        if ((i5 & 4) != 0) {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            i3 = marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0;
        }
        if ((i5 & 8) != 0) {
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            i4 = marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0;
        }
        setMargins(view, i, i2, i3, i4);
    }

    public static final void loadImage(@NotNull ImageView imageView, @Nullable Object obj, int i, @NotNull Function1<? super ImageRequest.Builder, Unit> builder) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder target = new ImageRequest.Builder(imageView.getContext()).data(obj).target(imageView);
        builder.invoke(target);
        target.error(i);
        imageLoader.enqueue(target.build());
    }
}
