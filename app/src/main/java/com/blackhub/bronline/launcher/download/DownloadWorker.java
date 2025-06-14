package com.blackhub.bronline.launcher.download;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.browser.trusted.NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.util.NotificationUtil$$ExternalSyntheticApiModelOutline1;
import androidx.work.CoroutineWorker;
import androidx.work.ForegroundInfo;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.LauncherConstants;
import com.blackhub.bronline.launcher.activities.MainActivity;
import com.blackhub.bronline.launcher.data.MyFile;
import com.blackhub.bronline.launcher.database.LauncherDatabase;
import io.ktor.client.HttpClient;
import io.ktor.client.HttpClientKt;
import io.ktor.client.engine.android.Android;
import io.ktor.client.plugins.HttpClientPluginKt;
import io.ktor.client.plugins.HttpSend;
import java.io.File;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
/* compiled from: DownloadWorker.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0015H\u0002J\b\u0010\"\u001a\u00020#H\u0002J\u0018\u0010$\u001a\u00020%2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0003J\b\u0010&\u001a\u00020'H\u0003J\u000e\u0010(\u001a\u00020)H\u0096@¢\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020'2\u0006\u0010,\u001a\u00020-H\u0082@¢\u0006\u0002\u0010.J\u000e\u0010/\u001a\u00020%H\u0096@¢\u0006\u0002\u0010*R!\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/blackhub/bronline/launcher/download/DownloadWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "client", "Lio/ktor/client/HttpClient;", "getClient$annotations", "()V", "getClient", "()Lio/ktor/client/HttpClient;", "client$delegate", "Lkotlin/Lazy;", "coroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "countSizeFiles", "", "finalTotalSizeFiles", "gamePath", "", "intentForReturnAppInForeground", "Landroid/content/Intent;", "launcherDatabase", "Lcom/blackhub/bronline/launcher/database/LauncherDatabase;", "getLauncherDatabase", "()Lcom/blackhub/bronline/launcher/database/LauncherDatabase;", "setLauncherDatabase", "(Lcom/blackhub/bronline/launcher/database/LauncherDatabase;)V", "openFragmentPendingIntent", "Landroid/app/PendingIntent;", "createDirAndReturnPath", "myFilePath", "createDownloadFinishedNotification", "Landroidx/core/app/NotificationCompat$Builder;", "createForegroundInfo", "Landroidx/work/ForegroundInfo;", "createNotificationChannel", "", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadFile", "myFile", "Lcom/blackhub/bronline/launcher/data/MyFile;", "(Lcom/blackhub/bronline/launcher/data/MyFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForegroundInfo", "Companion", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDownloadWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadWorker.kt\ncom/blackhub/bronline/launcher/download/DownloadWorker\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,378:1\n48#2,4:379\n37#3,2:383\n*S KotlinDebug\n*F\n+ 1 DownloadWorker.kt\ncom/blackhub/bronline/launcher/download/DownloadWorker\n*L\n105#1:379,4\n293#1:383,2\n*E\n"})
/* loaded from: classes4.dex */
public final class DownloadWorker extends CoroutineWorker {

    @NotNull
    public static final String FinalSize = "TOTAL_SIZE_FILES";

    @NotNull
    public static final String GamePath = "GAME_PATH";

    @NotNull
    public static final String Progress = "Progress";

    /* renamed from: client$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy client;

    @NotNull
    public final Context context;

    @NotNull
    public final CoroutineExceptionHandler coroutineExceptionHandler;
    public long countSizeFiles;
    public long finalTotalSizeFiles;

    @NotNull
    public String gamePath;

    @NotNull
    public final Intent intentForReturnAppInForeground;

    @Inject
    public LauncherDatabase launcherDatabase;

    @NotNull
    public final PendingIntent openFragmentPendingIntent;
    public static final int $stable = 8;

    public static /* synthetic */ void getClient$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadWorker(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.context = context;
        this.gamePath = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        this.finalTotalSizeFiles = -1L;
        this.client = LazyKt__LazyJVMKt.lazy(new Function0<HttpClient>() { // from class: com.blackhub.bronline.launcher.download.DownloadWorker$client$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final HttpClient invoke() {
                HttpClient HttpClient$default = HttpClientKt.HttpClient$default(Android.INSTANCE, null, 2, null);
                if (UtilsKt.isAddBasicAuth()) {
                    ((HttpSend) HttpClientPluginKt.plugin(HttpClient$default, HttpSend.INSTANCE)).intercept(new DownloadWorker$client$2$1$1(null));
                }
                return HttpClient$default;
            }
        });
        this.coroutineExceptionHandler = new DownloadWorker$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE, this);
        App.INSTANCE.appComponent().inject(this);
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(268435456);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        this.intentForReturnAppInForeground = intent;
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        this.openFragmentPendingIntent = activity;
    }

    public final HttpClient getClient() {
        return (HttpClient) this.client.getValue();
    }

    @NotNull
    public final LauncherDatabase getLauncherDatabase() {
        LauncherDatabase launcherDatabase = this.launcherDatabase;
        if (launcherDatabase != null) {
            return launcherDatabase;
        }
        Intrinsics.throwUninitializedPropertyAccessException("launcherDatabase");
        return null;
    }

    public final void setLauncherDatabase(@NotNull LauncherDatabase launcherDatabase) {
        Intrinsics.checkNotNullParameter(launcherDatabase, "<set-?>");
        this.launcherDatabase = launcherDatabase;
    }

    @RequiresApi(26)
    public final void createNotificationChannel() {
        String string = this.context.getString(R.string.notification_download_channel_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = this.context.getString(R.string.notification_download_name);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        NotificationUtil$$ExternalSyntheticApiModelOutline1.m();
        NotificationChannel m = NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m(string, string2, 4);
        Object systemService = this.context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(m);
    }

    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object getForegroundInfo(@NotNull Continuation<? super ForegroundInfo> continuation) {
        return createForegroundInfo(0L, this.finalTotalSizeFiles);
    }

    @SuppressLint({"InlinedApi"})
    public final ForegroundInfo createForegroundInfo(long countSizeFiles, long finalTotalSizeFiles) {
        String string = getApplicationContext().getString(R.string.notification_download_channel_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getApplicationContext().getString(R.string.loading_percent);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        float f = 1048576;
        float f2 = countSizeFiles / f;
        float f3 = finalTotalSizeFiles / f;
        int i = (int) ((f2 / f3) * 100);
        if (i > 100) {
            i = 100;
        }
        String string3 = getApplicationContext().getString(2131886478);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        PendingIntent createCancelPendingIntent = WorkManager.getInstance(getApplicationContext()).createCancelPendingIntent(getId());
        Intrinsics.checkNotNullExpressionValue(createCancelPendingIntent, "createCancelPendingIntent(...)");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            createNotificationChannel();
        }
        Notification build = new NotificationCompat.Builder(getApplicationContext(), string).setContentTitle(string2).setTicker(string2).setContentText(getApplicationContext().getString(R.string.common_loaded, Float.valueOf(f2), Float.valueOf(f3))).setSmallIcon(R.drawable.img_logo_br_small).setProgress(100, i, false).setOngoing(true).setSilent(true).setContentIntent(this.openFragmentPendingIntent).setVisibility(1).setCategory("progress").setAutoCancel(false).addAction(android.R.drawable.ic_delete, string3, createCancelPendingIntent).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        if (i2 >= 29) {
            return new ForegroundInfo(LauncherConstants.NOTIFICATION_ID, build, 1);
        }
        return new ForegroundInfo(LauncherConstants.NOTIFICATION_ID, build);
    }

    public final NotificationCompat.Builder createDownloadFinishedNotification() {
        if (Build.VERSION.SDK_INT >= 26) {
            createNotificationChannel();
        }
        String string = getApplicationContext().getString(R.string.notification_download_channel_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getApplicationContext().getString(R.string.loading_finished);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        NotificationCompat.Builder autoCancel = new NotificationCompat.Builder(getApplicationContext(), string).setContentTitle(string2).setSmallIcon(R.drawable.img_logo_br_small).setContentIntent(this.openFragmentPendingIntent).setVisibility(1).setAutoCancel(true);
        Intrinsics.checkNotNullExpressionValue(autoCancel, "setAutoCancel(...)");
        return autoCancel;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.work.CoroutineWorker
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.blackhub.bronline.launcher.download.DownloadWorker$doWork$1
            if (r0 == 0) goto L13
            r0 = r6
            com.blackhub.bronline.launcher.download.DownloadWorker$doWork$1 r0 = (com.blackhub.bronline.launcher.download.DownloadWorker$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.blackhub.bronline.launcher.download.DownloadWorker$doWork$1 r0 = new com.blackhub.bronline.launcher.download.DownloadWorker$doWork$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4d
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getIO()
            kotlinx.coroutines.CoroutineExceptionHandler r2 = r5.coroutineExceptionHandler
            kotlin.coroutines.CoroutineContext r6 = r6.plus(r2)
            com.blackhub.bronline.launcher.download.DownloadWorker$doWork$2 r2 = new com.blackhub.bronline.launcher.download.DownloadWorker$doWork$2
            r4 = 0
            r2.<init>(r5, r4)
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.launcher.download.DownloadWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String createDirAndReturnPath(String myFilePath) {
        String str;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String empty = AnyExtensionKt.empty(stringCompanionObject);
        String str2 = this.gamePath;
        String substring = str2.substring(0, StringsKt__StringsKt.lastIndexOf$default((CharSequence) str2, "/", 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        if (StringsKt__StringsJVMKt.startsWith$default(myFilePath, LauncherConstants.FILES_SLASH, false, 2, null)) {
            empty = myFilePath.substring(StringsKt__StringsKt.indexOf$default((CharSequence) empty, LauncherConstants.FILES_SLASH, 0, false, 6, (Object) null) + 6);
            Intrinsics.checkNotNullExpressionValue(empty, "substring(...)");
        }
        String[] strArr = (String[]) StringsKt__StringsKt.split$default((CharSequence) empty, new String[]{"/"}, false, 0, 6, (Object) null).toArray(new String[0]);
        String empty2 = AnyExtensionKt.empty(stringCompanionObject);
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                str = "/" + strArr[i];
            } else {
                str = strArr[i];
            }
            empty2 = empty2 + str;
            File file = new File(substring + "/" + empty2);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return empty;
    }

    public final Object downloadFile(MyFile myFile, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO().plus(this.coroutineExceptionHandler), new DownloadWorker$downloadFile$2(this, myFile, null), continuation);
        return withContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
