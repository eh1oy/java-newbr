package com.blackhub.bronline.game.gui.donate.viewmodel;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.apache.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: DonateTileViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel", f = "DonateTileViewModel.kt", i = {0, 0, 1, 1}, l = {HttpStatus.SC_LENGTH_REQUIRED, 418}, m = "lRemoveSaleItemInfo", n = {"this", "itemId", "this", "itemId"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes3.dex */
public final class DonateTileViewModel$lRemoveSaleItemInfo$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DonateTileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DonateTileViewModel$lRemoveSaleItemInfo$1(DonateTileViewModel donateTileViewModel, Continuation<? super DonateTileViewModel$lRemoveSaleItemInfo$1> continuation) {
        super(continuation);
        this.this$0 = donateTileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object lRemoveSaleItemInfo;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        lRemoveSaleItemInfo = this.this$0.lRemoveSaleItemInfo(0, this);
        return lRemoveSaleItemInfo;
    }
}
