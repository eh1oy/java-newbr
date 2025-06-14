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
@DebugMetadata(c = "com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel", f = "MainActivityViewModel.kt", i = {}, l = {524, 528}, m = "isLauncherVersionActual", n = {}, s = {})
/* loaded from: classes4.dex */
public final class MainActivityViewModel$isLauncherVersionActual$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MainActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityViewModel$isLauncherVersionActual$1(MainActivityViewModel mainActivityViewModel, Continuation<? super MainActivityViewModel$isLauncherVersionActual$1> continuation) {
        super(continuation);
        this.this$0 = mainActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object isLauncherVersionActual;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        isLauncherVersionActual = this.this$0.isLauncherVersionActual(this);
        return isLauncherVersionActual;
    }
}
