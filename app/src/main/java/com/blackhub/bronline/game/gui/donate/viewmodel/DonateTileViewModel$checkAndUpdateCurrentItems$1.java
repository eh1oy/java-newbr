package com.blackhub.bronline.game.gui.donate.viewmodel;

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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel", f = "DonateTileViewModel.kt", i = {0, 0}, l = {507, 511}, m = "checkAndUpdateCurrentItems", n = {"this", "saleItems"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class DonateTileViewModel$checkAndUpdateCurrentItems$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DonateTileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DonateTileViewModel$checkAndUpdateCurrentItems$1(DonateTileViewModel donateTileViewModel, Continuation<? super DonateTileViewModel$checkAndUpdateCurrentItems$1> continuation) {
        super(continuation);
        this.this$0 = donateTileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object checkAndUpdateCurrentItems;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        checkAndUpdateCurrentItems = this.this$0.checkAndUpdateCurrentItems(null, this);
        return checkAndUpdateCurrentItems;
    }
}
