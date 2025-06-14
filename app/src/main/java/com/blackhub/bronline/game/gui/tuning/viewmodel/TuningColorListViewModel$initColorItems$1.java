package com.blackhub.bronline.game.gui.tuning.viewmodel;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TuningColorListViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel", f = "TuningColorListViewModel.kt", i = {0, 0, 0}, l = {135}, m = "initColorItems", n = {"this", "oldStartColor", "newStartColor"}, s = {"L$0", "I$0", "I$1"})
/* loaded from: classes3.dex */
public final class TuningColorListViewModel$initColorItems$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TuningColorListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TuningColorListViewModel$initColorItems$1(TuningColorListViewModel tuningColorListViewModel, Continuation<? super TuningColorListViewModel$initColorItems$1> continuation) {
        super(continuation);
        this.this$0 = tuningColorListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object initColorItems;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        initColorItems = this.this$0.initColorItems(null, 0, this);
        return initColorItems;
    }
}
