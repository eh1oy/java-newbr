package com.blackhub.bronline.launcher.download;

import android.content.Context;
import android.widget.Toast;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.launcher.Settings;
import com.blackhub.bronline.launcher.data.MyFile;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HttpMethod;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.launcher.download.DownloadWorker$downloadFile$2", f = "DownloadWorker.kt", i = {}, l = {322}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nDownloadWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadWorker.kt\ncom/blackhub/bronline/launcher/download/DownloadWorker$downloadFile$2\n+ 2 builders.kt\nio/ktor/client/request/BuildersKt\n+ 3 builders.kt\nio/ktor/client/request/BuildersKt$prepareGet$4\n*L\n1#1,378:1\n404#2,4:379\n279#2:383\n167#2,2:385\n29#2:387\n406#3:384\n*S KotlinDebug\n*F\n+ 1 DownloadWorker.kt\ncom/blackhub/bronline/launcher/download/DownloadWorker$downloadFile$2\n*L\n321#1:379,4\n321#1:383\n321#1:385,2\n321#1:387\n321#1:384\n*E\n"})
/* loaded from: classes4.dex */
public final class DownloadWorker$downloadFile$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MyFile $myFile;
    public int label;
    public final /* synthetic */ DownloadWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadWorker$downloadFile$2(DownloadWorker downloadWorker, MyFile myFile, Continuation<? super DownloadWorker$downloadFile$2> continuation) {
        super(2, continuation);
        this.this$0 = downloadWorker;
        this.$myFile = myFile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DownloadWorker$downloadFile$2(this.this$0, this.$myFile, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DownloadWorker$downloadFile$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String createDirAndReturnPath;
        String str;
        HttpClient client;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                createDirAndReturnPath = this.this$0.createDirAndReturnPath(this.$myFile.getPath());
                str = this.this$0.gamePath;
                File file = new File(str + createDirAndReturnPath + this.$myFile.getName());
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    Boxing.boxBoolean(parentFile.mkdirs());
                }
                file.delete();
                file.createNewFile();
                UtilsKt.crashlyticsLog("start download: " + this.$myFile);
                client = this.this$0.getClient();
                String str2 = Settings.CURRENT_CDN_URL + this.$myFile.getPath() + this.$myFile.getName();
                HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
                HttpRequestKt.url(httpRequestBuilder, str2);
                httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
                HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, client);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(file, this.this$0, this.$myFile, null);
                this.label = 1;
                if (httpStatement.execute(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception unused) {
            this.this$0.getLauncherDatabase().myFileDao().setMyFileDownloadedByPathAndName(false, this.$myFile.getPath(), this.$myFile.getName());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
    /* compiled from: DownloadWorker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "httpResponse", "Lio/ktor/client/statement/HttpResponse;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.blackhub.bronline.launcher.download.DownloadWorker$downloadFile$2$1", f = "DownloadWorker.kt", i = {1, 2, 2, 3, 3}, l = {379, 327, 334, 346, 359}, m = "invokeSuspend", n = {"channel", "channel", "packet", "channel", "packet"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nDownloadWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadWorker.kt\ncom/blackhub/bronline/launcher/download/DownloadWorker$downloadFile$2$1\n+ 2 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 3 TypeInfoJvm.kt\nio/ktor/util/reflect/TypeInfoJvmKt\n+ 4 Packet.kt\nio/ktor/utils/io/core/PacketKt\n*L\n1#1,378:1\n156#2:379\n17#3,3:380\n43#4:383\n*S KotlinDebug\n*F\n+ 1 DownloadWorker.kt\ncom/blackhub/bronline/launcher/download/DownloadWorker$downloadFile$2$1\n*L\n324#1:379\n324#1:380,3\n328#1:383\n*E\n"})
    /* renamed from: com.blackhub.bronline.launcher.download.DownloadWorker$downloadFile$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<HttpResponse, Continuation<? super Unit>, Object> {
        public final /* synthetic */ File $file;
        public final /* synthetic */ MyFile $myFile;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ DownloadWorker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(File file, DownloadWorker downloadWorker, MyFile myFile, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$file = file;
            this.this$0 = downloadWorker;
            this.$myFile = myFile;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$file, this.this$0, this.$myFile, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull HttpResponse httpResponse, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(httpResponse, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Path cross not found for [B:3:0x000f, B:41:0x004d], limit reached: 51 */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0109 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x013e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0107 -> B:16:0x0031). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 420
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.launcher.download.DownloadWorker$downloadFile$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
        /* compiled from: DownloadWorker.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.blackhub.bronline.launcher.download.DownloadWorker$downloadFile$2$1$1", f = "DownloadWorker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.blackhub.bronline.launcher.download.DownloadWorker$downloadFile$2$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ HttpResponse $httpResponse;
            public final /* synthetic */ MyFile $myFile;
            public int label;
            public final /* synthetic */ DownloadWorker this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01161(DownloadWorker downloadWorker, MyFile myFile, HttpResponse httpResponse, Continuation<? super C01161> continuation) {
                super(2, continuation);
                this.this$0 = downloadWorker;
                this.$myFile = myFile;
                this.$httpResponse = httpResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C01161(this.this$0, this.$myFile, this.$httpResponse, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C01161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Context context;
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    context = this.this$0.context;
                    Toast.makeText(context, "failure download: " + this.$myFile.getName() + " - " + this.$httpResponse.getStatus(), 0).show();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
