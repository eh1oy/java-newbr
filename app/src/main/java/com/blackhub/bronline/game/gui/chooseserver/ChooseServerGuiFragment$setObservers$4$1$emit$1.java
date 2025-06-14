package com.blackhub.bronline.game.gui.chooseserver;

import androidx.media3.extractor.ts.H262Reader;
import com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$setObservers$4;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChooseServerGuiFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$setObservers$4$1", f = "ChooseServerGuiFragment.kt", i = {0}, l = {H262Reader.START_GROUP}, m = "emit", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class ChooseServerGuiFragment$setObservers$4$1$emit$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ChooseServerGuiFragment$setObservers$4.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChooseServerGuiFragment$setObservers$4$1$emit$1(ChooseServerGuiFragment$setObservers$4.AnonymousClass1<? super T> anonymousClass1, Continuation<? super ChooseServerGuiFragment$setObservers$4$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(0, this);
    }
}
