package com.blackhub.bronline.game.gui.minigameevents;

import android.os.Handler;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.UILayout;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperKeys;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class UILayoutMiniGameEventsGameUnTie extends UILayout {
    public Boolean isClosed;
    public Boolean isEnded;
    public final GUIMiniGameEventsGame mRoot;
    public View mViewRoot = null;
    public ProgressBar mProgressBar = null;
    public TextView mProgress = null;
    public TextView mInfo = null;
    public Handler mHandler = null;
    public int maxValue = 100;
    public int maxValueForProgressBar = 100;
    public int currentStatus = 0;
    public int tick = 10;
    public int timer = 50;

    public UILayoutMiniGameEventsGameUnTie(GUIMiniGameEventsGame root) {
        Boolean bool = Boolean.FALSE;
        this.isEnded = bool;
        this.isClosed = bool;
        this.mRoot = root;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    /* renamed from: getView */
    public View getMViewRoot() {
        return this.mViewRoot;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public View onCreateView(LayoutInflater inflater, ViewGroup container) {
        View inflate = inflater.inflate(R.layout.halloween_game_untie, container, false);
        this.mViewRoot = inflate;
        this.mProgressBar = (ProgressBar) inflate.findViewById(2131363856);
        this.mProgress = (TextView) this.mViewRoot.findViewById(R.id.progress);
        this.mInfo = (TextView) this.mViewRoot.findViewById(2131363243);
        this.maxValue = 100;
        this.currentStatus = 0;
        this.tick = 10;
        this.timer = 50;
        return this.mViewRoot;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
        initStartData(this.mRoot.getJson());
        startProgressBar();
    }

    public final void initStartData(JSONObject mainJson) {
        this.currentStatus = mainJson.optInt(MiniGamesHelperKeys.CURRENT_PROGRESS_BAR_STATUS_KEY);
        if (mainJson.optInt(MiniGamesHelperKeys.MAX_VALUE_KEY) != 0) {
            this.maxValue = mainJson.optInt(MiniGamesHelperKeys.MAX_VALUE_KEY);
        }
        if (mainJson.optInt(MiniGamesHelperKeys.MAX_BAR_PROGRESS_KEY) != 0) {
            this.maxValueForProgressBar = mainJson.optInt(MiniGamesHelperKeys.MAX_BAR_PROGRESS_KEY);
        }
        if (mainJson.optInt(MiniGamesHelperKeys.TICK_KEY) != 0) {
            this.tick = mainJson.optInt(MiniGamesHelperKeys.TICK_KEY);
        }
        if (mainJson.optInt(MiniGamesHelperKeys.TIMER_KEY) != 0) {
            this.timer = mainJson.optInt(MiniGamesHelperKeys.TIMER_KEY);
        }
        this.mProgressBar.setMax(this.maxValueForProgressBar);
        this.mProgressBar.setProgress(this.currentStatus);
        this.mProgress.setText(getContext().getString(R.string.common_value_and_percent, Integer.valueOf(this.mProgressBar.getProgress())));
        this.mInfo.setText(mainJson.optString(MiniGamesHelperKeys.PROGRESS_BAR_TITLE_KEY));
    }

    public final void startProgressBar() {
        this.mHandler = new Handler();
        new Thread(new Runnable() { // from class: com.blackhub.bronline.game.gui.minigameevents.UILayoutMiniGameEventsGameUnTie$$ExternalSyntheticLambda1
            public /* synthetic */ UILayoutMiniGameEventsGameUnTie$$ExternalSyntheticLambda1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                UILayoutMiniGameEventsGameUnTie.this.lambda$startProgressBar$1();
            }
        }).start();
    }

    public final /* synthetic */ void lambda$startProgressBar$1() {
        while (this.currentStatus < this.maxValue && !this.isClosed.booleanValue()) {
            this.currentStatus += this.tick;
            SystemClock.sleep(this.timer);
            this.mHandler.post(new Runnable() { // from class: com.blackhub.bronline.game.gui.minigameevents.UILayoutMiniGameEventsGameUnTie$$ExternalSyntheticLambda2
                public /* synthetic */ UILayoutMiniGameEventsGameUnTie$$ExternalSyntheticLambda2() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UILayoutMiniGameEventsGameUnTie.this.lambda$startProgressBar$0();
                }
            });
        }
    }

    public final /* synthetic */ void lambda$startProgressBar$0() {
        int min = Math.min(this.currentStatus, this.maxValue);
        this.mProgressBar.setProgress(min);
        this.mProgress.setText(getContext().getString(R.string.common_value_and_percent, Integer.valueOf(min)));
        if (this.currentStatus >= this.maxValue) {
            onProgressEnd();
            this.isEnded = Boolean.TRUE;
        }
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
        this.isClosed = Boolean.TRUE;
    }

    public void onProgressEnd() {
        if (this.isEnded.booleanValue()) {
            return;
        }
        new Handler().postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.minigameevents.UILayoutMiniGameEventsGameUnTie$$ExternalSyntheticLambda0
            public /* synthetic */ UILayoutMiniGameEventsGameUnTie$$ExternalSyntheticLambda0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                UILayoutMiniGameEventsGameUnTie.this.lambda$onProgressEnd$2();
            }
        }, this.timer);
    }

    public final /* synthetic */ void lambda$onProgressEnd$2() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", 1);
            this.mRoot.close(jSONObject);
        } catch (Exception e) {
            String message = e.getMessage();
            Objects.requireNonNull(message);
            UtilsKt.crashlyticsRecordNewException(message);
        }
    }
}
