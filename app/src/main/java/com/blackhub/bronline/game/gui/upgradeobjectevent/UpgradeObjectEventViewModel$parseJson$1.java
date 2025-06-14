package com.blackhub.bronline.game.gui.upgradeobjectevent;

import androidx.media3.extractor.mkv.MatroskaExtractor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UpgradeObjectEventViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel", f = "UpgradeObjectEventViewModel.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {MatroskaExtractor.ID_TIME_CODE}, m = "parseJson", n = {"this", "json", "servers", "serverName", "isUpdating", "type", "upgradeObjectLevel", "currencyEvent", "currencySpent", "countGift", "serverId", "upgradePosition", "isPlayerNotThreeLevel"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6", "I$7"})
/* loaded from: classes3.dex */
public final class UpgradeObjectEventViewModel$parseJson$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public int I$5;
    public int I$6;
    public int I$7;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ UpgradeObjectEventViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeObjectEventViewModel$parseJson$1(UpgradeObjectEventViewModel upgradeObjectEventViewModel, Continuation<? super UpgradeObjectEventViewModel$parseJson$1> continuation) {
        super(continuation);
        this.this$0 = upgradeObjectEventViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object parseJson;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        parseJson = this.this$0.parseJson(null, false, null, this);
        return parseJson;
    }
}
