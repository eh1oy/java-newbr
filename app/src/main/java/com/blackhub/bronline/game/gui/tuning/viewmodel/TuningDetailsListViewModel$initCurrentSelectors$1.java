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
/* compiled from: TuningDetailsListViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel", f = "TuningDetailsListViewModel.kt", i = {0, 0}, l = {682}, m = "initCurrentSelectors", n = {"this", "selectorsFromJson"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class TuningDetailsListViewModel$initCurrentSelectors$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TuningDetailsListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TuningDetailsListViewModel$initCurrentSelectors$1(TuningDetailsListViewModel tuningDetailsListViewModel, Continuation<? super TuningDetailsListViewModel$initCurrentSelectors$1> continuation) {
        super(continuation);
        this.this$0 = tuningDetailsListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object initCurrentSelectors;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        initCurrentSelectors = this.this$0.initCurrentSelectors(this);
        return initCurrentSelectors;
    }
}
