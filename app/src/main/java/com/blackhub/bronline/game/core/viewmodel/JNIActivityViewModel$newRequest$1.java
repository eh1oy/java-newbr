package com.blackhub.bronline.game.core.viewmodel;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: JNIActivityViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel", f = "JNIActivityViewModel.kt", i = {0, 0, 1, 1, 2, 2}, l = {806, 833, 834}, m = "newRequest", n = {"this", "paymentRequest", "this", "paymentRequest", "this", "paymentRequest"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes3.dex */
public final class JNIActivityViewModel$newRequest$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ JNIActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JNIActivityViewModel$newRequest$1(JNIActivityViewModel jNIActivityViewModel, Continuation<? super JNIActivityViewModel$newRequest$1> continuation) {
        super(continuation);
        this.this$0 = jNIActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object newRequest;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        newRequest = this.this$0.newRequest(null, this);
        return newRequest;
    }
}
