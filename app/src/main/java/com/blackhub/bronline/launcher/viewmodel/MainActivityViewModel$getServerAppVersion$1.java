package com.blackhub.bronline.launcher.viewmodel;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
/* compiled from: MainActivityViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel", f = "MainActivityViewModel.kt", i = {}, l = {512}, m = "getServerAppVersion", n = {}, s = {})
/* loaded from: classes4.dex */
public final class MainActivityViewModel$getServerAppVersion$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MainActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityViewModel$getServerAppVersion$1(MainActivityViewModel mainActivityViewModel, Continuation<? super MainActivityViewModel$getServerAppVersion$1> continuation) {
        super(continuation);
        this.this$0 = mainActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object serverAppVersion;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        serverAppVersion = this.this$0.getServerAppVersion(this);
        return serverAppVersion;
    }
}
