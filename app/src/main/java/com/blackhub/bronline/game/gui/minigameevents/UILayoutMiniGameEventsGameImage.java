package com.blackhub.bronline.game.gui.minigameevents;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.common.UILayout;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: UILayoutMiniGameEventsGameImage.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/blackhub/bronline/game/gui/minigameevents/UILayoutMiniGameEventsGameImage;", "Lcom/blackhub/bronline/game/common/UILayout;", "root", "Lcom/blackhub/bronline/game/gui/minigameevents/GUIMiniGameEventsGame;", "(Lcom/blackhub/bronline/game/gui/minigameevents/GUIMiniGameEventsGame;)V", "mClose", "Landroid/widget/ImageView;", "mImage", "mRoot", "mViewRoot", "Landroid/view/View;", "getView", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onLayoutClose", "", "onLayoutShown", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUILayoutMiniGameEventsGameImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UILayoutMiniGameEventsGameImage.kt\ncom/blackhub/bronline/game/gui/minigameevents/UILayoutMiniGameEventsGameImage\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,74:1\n54#2,3:75\n24#2:78\n59#2,6:79\n*S KotlinDebug\n*F\n+ 1 UILayoutMiniGameEventsGameImage.kt\ncom/blackhub/bronline/game/gui/minigameevents/UILayoutMiniGameEventsGameImage\n*L\n61#1:75,3\n61#1:78\n61#1:79,6\n*E\n"})
/* loaded from: classes3.dex */
public final class UILayoutMiniGameEventsGameImage extends UILayout {
    public static final int $stable = 8;

    @Nullable
    public ImageView mClose;

    @Nullable
    public ImageView mImage;

    @Nullable
    public GUIMiniGameEventsGame mRoot;

    @Nullable
    public View mViewRoot;

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
    }

    public UILayoutMiniGameEventsGameImage(@Nullable GUIMiniGameEventsGame gUIMiniGameEventsGame) {
        this.mRoot = gUIMiniGameEventsGame;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @Nullable
    /* renamed from: getView, reason: from getter */
    public View getMViewRoot() {
        return this.mViewRoot;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @NotNull ViewGroup r4) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(r4, "container");
        View inflate = inflater.inflate(R.layout.halloween_game_image, r4, false);
        this.mViewRoot = inflate;
        this.mImage = inflate != null ? (ImageView) inflate.findViewById(R.id.ivHalloweenGameImage) : null;
        View view = this.mViewRoot;
        this.mClose = view != null ? (ImageView) view.findViewById(R.id.ivHalloweenGameClose) : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("c", 1);
        ImageView imageView = this.mClose;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.minigameevents.UILayoutMiniGameEventsGameImage$$ExternalSyntheticLambda0
                public final /* synthetic */ JSONObject f$1;

                public /* synthetic */ UILayoutMiniGameEventsGameImage$$ExternalSyntheticLambda0(JSONObject jSONObject2) {
                    r2 = jSONObject2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    UILayoutMiniGameEventsGameImage.onCreateView$lambda$0(UILayoutMiniGameEventsGameImage.this, r2, view2);
                }
            });
        }
        return this.mViewRoot;
    }

    public static final void onCreateView$lambda$0(UILayoutMiniGameEventsGameImage this$0, JSONObject jsonObject, View view) {
        GUIManager guiManager;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(jsonObject, "$jsonObject");
        GUIMiniGameEventsGame gUIMiniGameEventsGame = this$0.mRoot;
        if (gUIMiniGameEventsGame != null && (guiManager = gUIMiniGameEventsGame.getGuiManager()) != null) {
            GUIMiniGameEventsGame gUIMiniGameEventsGame2 = this$0.mRoot;
            guiManager.sendJsonData(IntExtensionKt.getOrZero(gUIMiniGameEventsGame2 != null ? Integer.valueOf(gUIMiniGameEventsGame2.getScreenId()) : null), jsonObject);
        }
        GUIMiniGameEventsGame gUIMiniGameEventsGame3 = this$0.mRoot;
        if (gUIMiniGameEventsGame3 != null) {
            gUIMiniGameEventsGame3.close(null);
        }
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
        JNIActivity jNIActivity;
        LifecycleCoroutineScope lifecycleScope;
        JSONObject json;
        GUIMiniGameEventsGame gUIMiniGameEventsGame = this.mRoot;
        String optString = (gUIMiniGameEventsGame == null || (json = gUIMiniGameEventsGame.getJson()) == null) ? null : json.optString("imageName");
        if (optString == null) {
            optString = "";
        }
        String str = optString;
        float dimension = getContext().getResources().getDimension(R.dimen._13wdp);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Bitmap bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(context, str, ImageTypePathInCDNEnum.IMAGE, 0.0f, 0.0f, 24, null);
        ImageView imageView = this.mImage;
        if (imageView != null) {
            ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
            ImageRequest.Builder target = new ImageRequest.Builder(imageView.getContext()).data(bitmapFromZip$default).target(imageView);
            target.transformations(new RoundedCornersTransformation(dimension));
            imageLoader.enqueue(target.build());
        }
        GUIMiniGameEventsGame gUIMiniGameEventsGame2 = this.mRoot;
        if (gUIMiniGameEventsGame2 == null || (jNIActivity = gUIMiniGameEventsGame2.mActivity) == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(jNIActivity)) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new UILayoutMiniGameEventsGameImage$onLayoutShown$2(this, null), 3, null);
    }
}
