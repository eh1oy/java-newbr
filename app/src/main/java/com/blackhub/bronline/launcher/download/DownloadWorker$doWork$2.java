package com.blackhub.bronline.launcher.download;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import androidx.work.ListenableWorker;
import com.blackhub.bronline.launcher.LauncherConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
/* compiled from: DownloadWorker.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.launcher.download.DownloadWorker$doWork$2", f = "DownloadWorker.kt", i = {0, 0}, l = {250, 253}, m = "invokeSuspend", n = {"myFiles", "i"}, s = {"L$0", "I$0"})
@SourceDebugExtension({"SMAP\nDownloadWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadWorker.kt\ncom/blackhub/bronline/launcher/download/DownloadWorker$doWork$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,378:1\n1#2:379\n350#3,7:380\n*S KotlinDebug\n*F\n+ 1 DownloadWorker.kt\ncom/blackhub/bronline/launcher/download/DownloadWorker$doWork$2\n*L\n242#1:380,7\n*E\n"})
/* loaded from: classes4.dex */
public final class DownloadWorker$doWork$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {
    public int I$0;
    public int I$1;
    public Object L$0;
    public int label;
    public final /* synthetic */ DownloadWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadWorker$doWork$2(DownloadWorker downloadWorker, Continuation<? super DownloadWorker$doWork$2> continuation) {
        super(2, continuation);
        this.this$0 = downloadWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DownloadWorker$doWork$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ListenableWorker.Result> continuation) {
        return ((DownloadWorker$doWork$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0104 A[Catch: Exception -> 0x0031, TRY_LEAVE, TryCatch #1 {Exception -> 0x0031, blocks: (B:49:0x0139, B:14:0x002c, B:17:0x0104, B:47:0x00f8, B:6:0x0014, B:7:0x0134, B:20:0x011d), top: B:2:0x000e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011d A[Catch: Exception -> 0x0019, TRY_ENTER, TryCatch #0 {Exception -> 0x0019, blocks: (B:6:0x0014, B:7:0x0134, B:20:0x011d), top: B:2:0x000e, outer: #1 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0118 -> B:15:0x011b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.launcher.download.DownloadWorker$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
    /* compiled from: DownloadWorker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.blackhub.bronline.launcher.download.DownloadWorker$doWork$2$1", f = "DownloadWorker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.blackhub.bronline.launcher.download.DownloadWorker$doWork$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;
        public final /* synthetic */ DownloadWorker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DownloadWorker downloadWorker, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = downloadWorker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Context context;
            Context context2;
            NotificationCompat.Builder createDownloadFinishedNotification;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                context = this.this$0.context;
                if (ContextCompat.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") == 0) {
                    context2 = this.this$0.context;
                    NotificationManagerCompat from = NotificationManagerCompat.from(context2);
                    createDownloadFinishedNotification = this.this$0.createDownloadFinishedNotification();
                    from.notify(LauncherConstants.NOTIFICATION_ID_FOR_DOWNLOAD_FINISHED_NOTIFICATION, createDownloadFinishedNotification.build());
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
