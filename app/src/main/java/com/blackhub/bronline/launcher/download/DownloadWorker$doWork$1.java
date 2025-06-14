package com.blackhub.bronline.launcher.download;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DownloadWorker.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.launcher.download.DownloadWorker", f = "DownloadWorker.kt", i = {}, l = {221}, m = "doWork", n = {}, s = {})
/* loaded from: classes4.dex */
public final class DownloadWorker$doWork$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DownloadWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadWorker$doWork$1(DownloadWorker downloadWorker, Continuation<? super DownloadWorker$doWork$1> continuation) {
        super(continuation);
        this.this$0 = downloadWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork(this);
    }
}
