package com.blackhub.bronline.game.gui.tuning.viewmodel;

import android.support.v4.media.session.MediaSessionCompat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TuningDetailsListViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel", f = "TuningDetailsListViewModel.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {306, MediaSessionCompat.MAX_BITMAP_SIZE_IN_DP}, m = "updateCurrentDetails", n = {"this", "newId", "oldId", "newCurrentStatus", "this", "newId", "oldId"}, s = {"L$0", "I$0", "I$1", "I$2", "L$0", "I$0", "I$1"})
/* loaded from: classes3.dex */
public final class TuningDetailsListViewModel$updateCurrentDetails$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public int I$2;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TuningDetailsListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TuningDetailsListViewModel$updateCurrentDetails$1(TuningDetailsListViewModel tuningDetailsListViewModel, Continuation<? super TuningDetailsListViewModel$updateCurrentDetails$1> continuation) {
        super(continuation);
        this.this$0 = tuningDetailsListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object updateCurrentDetails;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        updateCurrentDetails = this.this$0.updateCurrentDetails(0, 0, 0, this);
        return updateCurrentDetails;
    }
}
