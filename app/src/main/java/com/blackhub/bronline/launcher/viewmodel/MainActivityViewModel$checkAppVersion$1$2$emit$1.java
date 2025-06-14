package com.blackhub.bronline.launcher.viewmodel;

import com.blackhub.bronline.game.model.local.AppConfigModel;
import com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$checkAppVersion$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MainActivityViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$checkAppVersion$1$2", f = "MainActivityViewModel.kt", i = {}, l = {392}, m = "emit", n = {}, s = {})
/* loaded from: classes4.dex */
public final class MainActivityViewModel$checkAppVersion$1$2$emit$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MainActivityViewModel$checkAppVersion$1.AnonymousClass2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MainActivityViewModel$checkAppVersion$1$2$emit$1(MainActivityViewModel$checkAppVersion$1.AnonymousClass2<? super T> anonymousClass2, Continuation<? super MainActivityViewModel$checkAppVersion$1$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((AppConfigModel) null, (Continuation<? super Unit>) this);
    }
}
