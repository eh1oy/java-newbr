package com.blackhub.bronline.game.gui.donate.viewmodel;

import androidx.media3.extractor.ts.UserDataReader;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: DonateTileViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel", f = "DonateTileViewModel.kt", i = {0, 0, 0}, l = {UserDataReader.USER_DATA_START_CODE}, m = "updateValueOfLimitForCurrentItem", n = {"this", "valueOfLimits", "itemId"}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes3.dex */
public final class DonateTileViewModel$updateValueOfLimitForCurrentItem$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DonateTileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DonateTileViewModel$updateValueOfLimitForCurrentItem$1(DonateTileViewModel donateTileViewModel, Continuation<? super DonateTileViewModel$updateValueOfLimitForCurrentItem$1> continuation) {
        super(continuation);
        this.this$0 = donateTileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object updateValueOfLimitForCurrentItem;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        updateValueOfLimitForCurrentItem = this.this$0.updateValueOfLimitForCurrentItem(0, this);
        return updateValueOfLimitForCurrentItem;
    }
}
