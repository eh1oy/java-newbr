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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel", f = "TuningDetailsListViewModel.kt", i = {1, 1, 1}, l = {597, 600, 601}, m = "initItemsForSubmenu", n = {"this", "tuningType", "carId"}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes3.dex */
public final class TuningDetailsListViewModel$initItemsForSubmenu$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TuningDetailsListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TuningDetailsListViewModel$initItemsForSubmenu$1(TuningDetailsListViewModel tuningDetailsListViewModel, Continuation<? super TuningDetailsListViewModel$initItemsForSubmenu$1> continuation) {
        super(continuation);
        this.this$0 = tuningDetailsListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object initItemsForSubmenu;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        initItemsForSubmenu = this.this$0.initItemsForSubmenu(null, 0, this);
        return initItemsForSubmenu;
    }
}
