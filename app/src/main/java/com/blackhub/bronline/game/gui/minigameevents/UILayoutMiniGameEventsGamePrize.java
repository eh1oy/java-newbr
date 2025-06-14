package com.blackhub.bronline.game.gui.minigameevents;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.common.UILayout;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperKeys;

/* loaded from: classes3.dex */
public class UILayoutMiniGameEventsGamePrize extends UILayout {
    public final GUIMiniGameEventsGame mRoot;
    public View mViewRoot = null;
    public ImageView mImage = null;
    public TextView mSubHeader = null;
    public TextView mHeader = null;

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
    }

    public UILayoutMiniGameEventsGamePrize(GUIMiniGameEventsGame root) {
        this.mRoot = root;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    /* renamed from: getView */
    public View getMViewRoot() {
        return this.mViewRoot;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public View onCreateView(LayoutInflater inflater, ViewGroup container) {
        View inflate = inflater.inflate(R.layout.halloween_game_prize, container, false);
        this.mViewRoot = inflate;
        this.mImage = (ImageView) inflate.findViewById(2131363174);
        this.mSubHeader = (TextView) this.mViewRoot.findViewById(2131363243);
        this.mHeader = (TextView) this.mViewRoot.findViewById(R.id.header);
        return this.mViewRoot;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
        String optString = this.mRoot.getJson().optString("n");
        int optInt = this.mRoot.getJson().optInt("r", -1);
        this.mSubHeader.setText(this.mRoot.getJson().optString("m"));
        this.mHeader.setText(this.mRoot.getJson().optString("h"));
        if (!optString.equals("null") && !optString.isEmpty()) {
            this.mImage.setImageResource(getContext().getResources().getIdentifier(optString, "drawable", getContext().getPackageName()));
        } else {
            if (optInt == -1) {
                return;
            }
            GameRender.getInstance().RequestRender(this.mRoot.getJson().optInt("s"), 0, optInt, 0, 0, (float) this.mRoot.getJson().optDouble(MiniGamesHelperKeys.ROT_X_KEY), (float) this.mRoot.getJson().optDouble(MiniGamesHelperKeys.ROT_Y_KEY), (float) this.mRoot.getJson().optDouble(MiniGamesHelperKeys.ROT_Z_KEY), (float) this.mRoot.getJson().optDouble("z"), new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.gui.minigameevents.UILayoutMiniGameEventsGamePrize$$ExternalSyntheticLambda0
                public final /* synthetic */ JNIActivity f$1;

                public /* synthetic */ UILayoutMiniGameEventsGamePrize$$ExternalSyntheticLambda0(JNIActivity jNIActivity) {
                    r2 = jNIActivity;
                }

                @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
                public final void OnRenderComplete(int i, Bitmap bitmap) {
                    UILayoutMiniGameEventsGamePrize.this.lambda$onLayoutShown$1(r2, i, bitmap);
                }
            });
        }
    }

    public final /* synthetic */ void lambda$onLayoutShown$1(JNIActivity jNIActivity, int i, Bitmap bitmap) {
        jNIActivity.runOnUiThread(new Runnable() { // from class: com.blackhub.bronline.game.gui.minigameevents.UILayoutMiniGameEventsGamePrize$$ExternalSyntheticLambda1
            public final /* synthetic */ Bitmap f$1;

            public /* synthetic */ UILayoutMiniGameEventsGamePrize$$ExternalSyntheticLambda1(Bitmap bitmap2) {
                r2 = bitmap2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                UILayoutMiniGameEventsGamePrize.this.lambda$onLayoutShown$0(r2);
            }
        });
    }

    public final /* synthetic */ void lambda$onLayoutShown$0(Bitmap bitmap) {
        this.mImage.setImageBitmap(bitmap);
        this.mImage.animate().alpha(1.0f).setDuration(300L);
    }
}
