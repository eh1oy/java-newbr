package com.blackhub.bronline.game.gui.smieditor.viewmodel;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: SmiEditorViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel", f = "SmiEditorViewModel.kt", i = {0, 0, 0}, l = {236, SnappyCompressorOutputStream.TWO_SIZE_BYTE_MARKER}, m = "lUpdateFinalText", n = {"this", "newValueOfText", "currentPos"}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes3.dex */
public final class SmiEditorViewModel$lUpdateFinalText$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SmiEditorViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmiEditorViewModel$lUpdateFinalText$1(SmiEditorViewModel smiEditorViewModel, Continuation<? super SmiEditorViewModel$lUpdateFinalText$1> continuation) {
        super(continuation);
        this.this$0 = smiEditorViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object lUpdateFinalText;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        lUpdateFinalText = this.this$0.lUpdateFinalText(null, 0, this);
        return lUpdateFinalText;
    }
}
