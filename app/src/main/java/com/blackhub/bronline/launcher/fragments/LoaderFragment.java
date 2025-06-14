package com.blackhub.bronline.launcher.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkContinuation;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.FragmentLoaderBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.TwoButtonsAndTextWithDescriptionDialog;
import com.blackhub.bronline.game.common.composemanager.ComposableProvider;
import com.blackhub.bronline.game.common.composemanager.ComposeViewManager;
import com.blackhub.bronline.game.core.extension.BooleanExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.craft.CraftKeys;
import com.blackhub.bronline.game.ui.launcher.FilesInfoForDownloadKt;
import com.blackhub.bronline.launcher.LauncherConstants;
import com.blackhub.bronline.launcher.Settings;
import com.blackhub.bronline.launcher.activities.MainActivity;
import com.blackhub.bronline.launcher.data.MyFile;
import com.blackhub.bronline.launcher.dialogs.LauncherUpdateAvailableDialog;
import com.blackhub.bronline.launcher.dialogs.NotEnoughSpaceDialog;
import com.blackhub.bronline.launcher.download.DownloadWorker;
import com.blackhub.bronline.launcher.model.FileInfoForDownloadItem;
import com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
/* compiled from: LoaderFragment.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020'H\u0003J\b\u0010)\u001a\u00020'H\u0002J\b\u0010*\u001a\u00020'H\u0002J\u001a\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0017H\u0002J\u0010\u00100\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J\b\u00101\u001a\u00020\u0002H\u0016J\b\u00102\u001a\u00020'H\u0016J\b\u00103\u001a\u00020'H\u0002J\u0010\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u000206H\u0002J\b\u00107\u001a\u00020\u000bH\u0002J\b\u00108\u001a\u00020'H\u0002J\b\u00109\u001a\u00020'H\u0002J\b\u0010:\u001a\u00020'H\u0002J\b\u0010;\u001a\u00020'H\u0016J\b\u0010<\u001a\u00020'H\u0016J\b\u0010=\u001a\u00020'H\u0016J\b\u0010>\u001a\u00020'H\u0016J\b\u0010?\u001a\u00020'H\u0016J\b\u0010@\u001a\u00020'H\u0016J\b\u0010A\u001a\u00020'H\u0002J\u0010\u0010B\u001a\u00020'2\u0006\u0010C\u001a\u00020DH\u0002J\u0018\u0010E\u001a\u00020'2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\rH\u0002J\u0010\u0010F\u001a\u00020'2\u0006\u0010G\u001a\u00020\rH\u0002J\u0010\u0010H\u001a\u00020'2\u0006\u0010I\u001a\u00020JH\u0002J\u0010\u0010K\u001a\u00020'2\u0006\u0010C\u001a\u00020DH\u0002J\b\u0010L\u001a\u00020'H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00170\u00170\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0013\u001a\u0004\b\u001f\u0010 R\u000e\u0010\"\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lcom/blackhub/bronline/launcher/fragments/LoaderFragment;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/FragmentLoaderBinding;", "()V", "connectivityManager", "Landroid/net/ConnectivityManager;", "installAppResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "isInternetAvailable", "", "loaded", "", "mainActivityViewModel", "Lcom/blackhub/bronline/launcher/viewmodel/MainActivityViewModel;", "getMainActivityViewModel", "()Lcom/blackhub/bronline/launcher/viewmodel/MainActivityViewModel;", "mainActivityViewModel$delegate", "Lkotlin/Lazy;", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "requestNotificationPermissionLauncher", "", "thisActivity", "Landroidx/fragment/app/FragmentActivity;", "getThisActivity", "()Landroidx/fragment/app/FragmentActivity;", "thisActivity$delegate", "thisContext", "Landroid/content/Context;", "getThisContext", "()Landroid/content/Context;", "thisContext$delegate", "total", "unknownAppPermissionResult", "workId", "Ljava/util/UUID;", "askNotificationPermission", "", "askPermissionToInstallFromUnknownSource", "createIntentAndLaunchUpdate", "deleteFilesNotFromListAndStartMainFragment", "getInfoAboutApp", "Landroid/content/pm/PackageInfo;", CraftKeys.PERCENT_OF_SKILL_KEY, "Landroid/content/pm/PackageManager;", "fullPath", "getPackageInfo", "getViewBinding", "initViews", "installApk", "isExternalStorageAvailable", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Landroid/app/Activity;", "isLauncherVersionActual", "observeWorkProgress", "onClickCancelButton", "onClickDownloadButton", "onDestroy", "onDestroyView", "onPause", "onResume", "onStart", "onStop", "registerNetworkCallback", "setButtonsYesNoVisibility", "visibility", "", "setLoaded", "setProgressFiles", "percent", "setSizeOfUpdate", "size", "", "setTextViewAndProgressBarVisibility", "setViewModelObservers", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLoaderFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoaderFragment.kt\ncom/blackhub/bronline/launcher/fragments/LoaderFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n+ 5 FragmentTransaction.kt\nandroidx/fragment/app/FragmentTransactionKt\n*L\n1#1,608:1\n172#2,9:609\n1#3:618\n28#4,6:619\n34#4,6:630\n80#5,5:625\n*S KotlinDebug\n*F\n+ 1 LoaderFragment.kt\ncom/blackhub/bronline/launcher/fragments/LoaderFragment\n*L\n83#1:609,9\n397#1:619,6\n397#1:630,6\n399#1:625,5\n*E\n"})
/* loaded from: classes4.dex */
public final class LoaderFragment extends BaseFragment<FragmentLoaderBinding> {
    public static final int $stable = 8;

    @Nullable
    public ConnectivityManager connectivityManager;

    @NotNull
    public final ActivityResultLauncher<Intent> installAppResultLauncher;

    /* renamed from: mainActivityViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainActivityViewModel;

    @Nullable
    public ConnectivityManager.NetworkCallback networkCallback;

    @NotNull
    public final ActivityResultLauncher<String> requestNotificationPermissionLauncher;

    /* renamed from: thisActivity$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy thisActivity;

    /* renamed from: thisContext$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy thisContext;

    @NotNull
    public final ActivityResultLauncher<Intent> unknownAppPermissionResult;

    @Nullable
    public UUID workId;
    public boolean isInternetAvailable = true;
    public float loaded = -1.0f;
    public float total = -1.0f;

    /* JADX INFO: Access modifiers changed from: private */
    public final MainActivityViewModel getMainActivityViewModel() {
        return (MainActivityViewModel) this.mainActivityViewModel.getValue();
    }

    public static final void unknownAppPermissionResult$lambda$0(LoaderFragment this$0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            this$0.createIntentAndLaunchUpdate();
        }
        if (activityResult.getResultCode() == 0) {
            UtilsKt.crashlyticsLog("result.resultCode == Activity.RESULT_CANCELED, startActivity(JNIActivity)");
            this$0.deleteFilesNotFromListAndStartMainFragment();
        }
    }

    public static final void installAppResultLauncher$lambda$1(LoaderFragment this$0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMainActivityViewModel().getSizeOfUpdateFromDB();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getThisContext() {
        return (Context) this.thisContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentActivity getThisActivity() {
        return (FragmentActivity) this.thisActivity.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        askNotificationPermission();
        setViewModelObservers();
        onClickDownloadButton();
        onClickCancelButton();
        registerNetworkCallback();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ConnectivityManager connectivityManager;
        super.onDestroyView();
        ConnectivityManager.NetworkCallback networkCallback = this.networkCallback;
        if (networkCallback != null && (connectivityManager = this.connectivityManager) != null) {
            connectivityManager.unregisterNetworkCallback(networkCallback);
        }
        this.networkCallback = null;
        this.connectivityManager = null;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FragmentLoaderBinding getViewBinding() {
        FragmentLoaderBinding inflate = FragmentLoaderBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    public static final void requestNotificationPermissionLauncher$lambda$3(LoaderFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            return;
        }
        Toast.makeText(this$0.getBinding().getRoot().getContext(), this$0.getString(R.string.launcher_request_notification_disabled), 1).show();
    }

    public final void registerNetworkCallback() {
        Context context = getContext();
        this.connectivityManager = (ConnectivityManager) (context != null ? context.getSystemService("connectivity") : null);
        NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
        ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$registerNetworkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(@NotNull Network network) {
                Intrinsics.checkNotNullParameter(network, "network");
                super.onLost(network);
                Context context2 = LoaderFragment.this.getContext();
                if (context2 != null) {
                    Toast.makeText(context2, context2.getString(R.string.fragment_main_no_internet_short), 0).show();
                    String string = context2.getString(R.string.fragment_main_no_internet_short);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    UtilsKt.crashlyticsLog(string);
                    WorkManager.getInstance(context2).cancelUniqueWork(LauncherConstants.DOWNLOAD_WORK_NAME);
                }
                LoaderFragment.this.isInternetAvailable = false;
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(@NotNull Network network) {
                boolean z;
                Intrinsics.checkNotNullParameter(network, "network");
                super.onAvailable(network);
                z = LoaderFragment.this.isInternetAvailable;
                Boolean valueOf = Boolean.valueOf(z);
                final LoaderFragment loaderFragment = LoaderFragment.this;
                BooleanExtensionKt.ifFalse(valueOf, new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$registerNetworkCallback$1$onAvailable$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Context context2 = LoaderFragment.this.getContext();
                        if (context2 != null) {
                            String string = context2.getString(R.string.fragment_main_connection_restored);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            UtilsKt.crashlyticsLog(string);
                            Toast.makeText(context2, context2.getString(R.string.fragment_main_connection_restored), 0).show();
                        }
                    }
                });
                LoaderFragment.this.isInternetAvailable = true;
            }
        };
        this.networkCallback = networkCallback;
        ConnectivityManager connectivityManager = this.connectivityManager;
        if (connectivityManager != null) {
            connectivityManager.registerNetworkCallback(build, networkCallback);
        }
    }

    public final void askNotificationPermission() {
        if (Build.VERSION.SDK_INT < 33 || ContextCompat.checkSelfPermission(getThisContext(), "android.permission.POST_NOTIFICATIONS") == 0) {
            return;
        }
        if (!shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
            this.requestNotificationPermissionLauncher.launch("android.permission.POST_NOTIFICATIONS");
            return;
        }
        Context thisContext = getThisContext();
        Intrinsics.checkNotNullExpressionValue(thisContext, "<get-thisContext>(...)");
        TwoButtonsAndTextWithDescriptionDialog twoButtonsAndTextWithDescriptionDialog = new TwoButtonsAndTextWithDescriptionDialog(thisContext);
        twoButtonsAndTextWithDescriptionDialog.setOnOkButtonClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$askNotificationPermission$askForNotificationPermissionDialog$1$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ActivityResultLauncher activityResultLauncher;
                activityResultLauncher = LoaderFragment.this.requestNotificationPermissionLauncher;
                activityResultLauncher.launch("android.permission.POST_NOTIFICATIONS");
            }
        });
        twoButtonsAndTextWithDescriptionDialog.setOnCancelButtonClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$askNotificationPermission$askForNotificationPermissionDialog$1$2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
        twoButtonsAndTextWithDescriptionDialog.show();
        String string = getString(R.string.launcher_request_notification_permission_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        twoButtonsAndTextWithDescriptionDialog.setTitle(string);
        String string2 = getString(R.string.launcher_request_notification_permission_description);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        twoButtonsAndTextWithDescriptionDialog.setDescription(string2);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        UtilsKt.crashlyticsLog("LoaderFragment onResume");
        MainActivity.Companion companion = MainActivity.INSTANCE;
        FragmentActivity activity = getActivity();
        Window window = activity != null ? activity.getWindow() : null;
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        companion.hideSystemUI(window, root);
    }

    public final boolean isLauncherVersionActual() {
        PackageManager packageManager = getThisContext().getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        PackageInfo packageInfo = getPackageInfo(packageManager);
        File externalFilesDir = getThisContext().getExternalFilesDir(null);
        String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
        PackageInfo infoAboutApp = getInfoAboutApp(packageManager, absolutePath + Settings.LAUNCHER_NAME);
        return infoAboutApp == null || packageInfo.versionCode >= infoAboutApp.versionCode;
    }

    public final void setViewModelObservers() {
        getMainActivityViewModel().getSizeOfUpdateLiveData().observe(getViewLifecycleOwner(), new LoaderFragment$sam$androidx_lifecycle_Observer$0(new Function1<Long, Unit>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$setViewModelObservers$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                invoke2(l);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Long l) {
                FragmentLoaderBinding binding;
                MainActivityViewModel mainActivityViewModel;
                Context thisContext;
                boolean isLauncherVersionActual;
                Context thisContext2;
                if (l != null && l.longValue() == 0) {
                    isLauncherVersionActual = LoaderFragment.this.isLauncherVersionActual();
                    if (!isLauncherVersionActual) {
                        thisContext2 = LoaderFragment.this.getThisContext();
                        Intrinsics.checkNotNullExpressionValue(thisContext2, "access$getThisContext(...)");
                        LauncherUpdateAvailableDialog launcherUpdateAvailableDialog = new LauncherUpdateAvailableDialog(thisContext2);
                        final LoaderFragment loaderFragment = LoaderFragment.this;
                        launcherUpdateAvailableDialog.setOnOkButtonClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$setViewModelObservers$1$1$1
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                LoaderFragment.this.installApk();
                            }
                        });
                        launcherUpdateAvailableDialog.setOnCancelButtonClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$setViewModelObservers$1$1$2
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                FragmentActivity activity = LoaderFragment.this.getActivity();
                                if (activity != null) {
                                    activity.finish();
                                }
                            }
                        });
                        launcherUpdateAvailableDialog.show();
                        return;
                    }
                    UtilsKt.crashlyticsLog("isLauncherVersionActual(), startActivity(JNIActivity)");
                    LoaderFragment.this.deleteFilesNotFromListAndStartMainFragment();
                    return;
                }
                Intrinsics.checkNotNull(l);
                double longValue = (l.longValue() * 1.0d) / 1048576;
                LoaderFragment.this.setSizeOfUpdate(longValue);
                LoaderFragment.this.setTextViewAndProgressBarVisibility(4);
                binding = LoaderFragment.this.getBinding();
                TextView textView = binding.loadingPercent;
                FragmentActivity activity = LoaderFragment.this.getActivity();
                textView.setText(activity != null ? activity.getString(R.string.common_loaded, Float.valueOf(0.0f), Float.valueOf((l.longValue() * 1.0f) / 1048576)) : null);
                mainActivityViewModel = LoaderFragment.this.getMainActivityViewModel();
                if (mainActivityViewModel.getFreeSpaceLiveData().getValue() == null || longValue <= r10.longValue()) {
                    return;
                }
                thisContext = LoaderFragment.this.getThisContext();
                Intrinsics.checkNotNullExpressionValue(thisContext, "access$getThisContext(...)");
                new NotEnoughSpaceDialog(thisContext, (longValue + LauncherConstants.ADDITIONAL_FREE_SPACE) - r10.longValue()).show();
            }
        }));
        if (UtilsKt.isNotPublicBuildType()) {
            ViewGroup.LayoutParams layoutParams = getBinding().tvSizeOfUpdate.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.horizontalBias = 0.0f;
            getBinding().tvSizeOfUpdate.setLayoutParams(layoutParams2);
            getMainActivityViewModel().getFilesLiveData().observe(getViewLifecycleOwner(), new LoaderFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<MyFile>, Unit>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$setViewModelObservers$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<MyFile> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(final List<MyFile> list) {
                    FragmentLoaderBinding binding;
                    ComposeViewManager composeViewManager = ComposeViewManager.INSTANCE;
                    binding = LoaderFragment.this.getBinding();
                    ComposeView cvFilesInfoList = binding.cvFilesInfoList;
                    Intrinsics.checkNotNullExpressionValue(cvFilesInfoList, "cvFilesInfoList");
                    composeViewManager.setComposableContentForKotlin(cvFilesInfoList, ComposableLambdaKt.composableLambdaInstance(838472097, true, new Function3<ComposableProvider, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$setViewModelObservers$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ComposableProvider composableProvider, Composer composer, Integer num) {
                            invoke(composableProvider, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
                        public final void invoke(@NotNull ComposableProvider setComposableContentForKotlin, @Nullable Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(setComposableContentForKotlin, "$this$setComposableContentForKotlin");
                            if ((i & 81) != 16 || !composer.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(838472097, i, -1, "com.blackhub.bronline.launcher.fragments.LoaderFragment.setViewModelObservers.<anonymous>.<anonymous> (LoaderFragment.kt:287)");
                                }
                                List<MyFile> myFileList = list;
                                Intrinsics.checkNotNullExpressionValue(myFileList, "$myFileList");
                                List<MyFile> list2 = myFileList;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                for (MyFile myFile : list2) {
                                    arrayList.add(new FileInfoForDownloadItem(myFile.getPath() + myFile.getName(), myFile.getSize() / 1048576));
                                }
                                FilesInfoForDownloadKt.FilesInfoForDownload(arrayList, composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer.skipToGroupEnd();
                        }
                    }));
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void installApk() {
        boolean canRequestPackageInstalls;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                canRequestPackageInstalls = getThisContext().getPackageManager().canRequestPackageInstalls();
                if (!canRequestPackageInstalls) {
                    askPermissionToInstallFromUnknownSource();
                } else {
                    createIntentAndLaunchUpdate();
                }
            } else {
                createIntentAndLaunchUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(getThisContext(), getString(R.string.launcher_error_reinstall_app), 1).show();
        }
    }

    private final void createIntentAndLaunchUpdate() {
        File externalFilesDir = getThisContext().getExternalFilesDir(null);
        File file = new File((externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null) + "/launcher.apk");
        Uri.fromFile(file);
        Uri uriForFile = FileProvider.getUriForFile(getThisContext(), getThisContext().getPackageName() + ".provider", file);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
        intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
        intent.setFlags(268435456);
        intent.addFlags(1);
        this.installAppResultLauncher.launch(intent);
    }

    @RequiresApi(26)
    private final void askPermissionToInstallFromUnknownSource() {
        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("package:%s", Arrays.copyOf(new Object[]{getThisContext().getPackageName()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        Intent data = intent.setData(Uri.parse(format));
        Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
        this.unknownAppPermissionResult.launch(data);
    }

    public final void setSizeOfUpdate(double size) {
        TextView textView = getBinding().tvSizeOfUpdate;
        FragmentActivity activity = getActivity();
        textView.setText(activity != null ? activity.getString(R.string.launcher_do_you_want_to_download, Double.valueOf(size)) : null);
        setButtonsYesNoVisibility(0);
    }

    public final void setTextViewAndProgressBarVisibility(int visibility) {
        FragmentLoaderBinding binding = getBinding();
        binding.tvBr.setVisibility(visibility);
        binding.tvBr2.setVisibility(visibility);
        binding.loadingText.setVisibility(visibility);
        binding.progressBar.setVisibility(visibility);
        binding.loadingPercent.setVisibility(visibility);
    }

    public final void setButtonsYesNoVisibility(int visibility) {
        FragmentLoaderBinding binding = getBinding();
        binding.tvSizeOfUpdate.setVisibility(visibility);
        binding.buttonCancel.setVisibility(visibility);
        binding.buttonRepeat.setVisibility(visibility);
    }

    public final void setProgressFiles(float percent) {
        getBinding().progressBar.setProgress(percent);
    }

    public final void setLoaded(float loaded, float total) {
        FragmentLoaderBinding binding = getBinding();
        binding.loadingPercent.setVisibility(0);
        TextView textView = binding.loadingPercent;
        FragmentActivity activity = getActivity();
        textView.setText(activity != null ? activity.getString(R.string.common_loaded, Float.valueOf(loaded), Float.valueOf(total)) : null);
    }

    public final void deleteFilesNotFromListAndStartMainFragment() {
        MainActivityViewModel mainActivityViewModel = getMainActivityViewModel();
        mainActivityViewModel.deleteFilesNotFromList();
        mainActivityViewModel.deleteUnusedEntriesFromDB();
        mainActivityViewModel.m7573getBgImage();
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        FragmentTransaction beginTransaction = parentFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(beginTransaction, "beginTransaction()");
        beginTransaction.setReorderingAllowed(true);
        Intrinsics.checkNotNullExpressionValue(beginTransaction.replace(R.id.fragment_container_view, MainFragment.class, null, null), "replace(containerViewId, F::class.java, args, tag)");
        beginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        beginTransaction.commit();
    }

    public final void observeWorkProgress() {
        Context context = getContext();
        if (context != null) {
            WorkManager.getInstance(context).getWorkInfosForUniqueWorkLiveData(LauncherConstants.DOWNLOAD_WORK_NAME).observe(getViewLifecycleOwner(), new LoaderFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<WorkInfo>, Unit>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$observeWorkProgress$1$1

                /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
                /* compiled from: LoaderFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[WorkInfo.State.values().length];
                        try {
                            iArr[WorkInfo.State.RUNNING.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[WorkInfo.State.SUCCEEDED.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[WorkInfo.State.FAILED.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[WorkInfo.State.CANCELLED.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[WorkInfo.State.BLOCKED.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<WorkInfo> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable List<WorkInfo> list) {
                    WorkInfo workInfo;
                    FragmentActivity thisActivity;
                    FragmentLoaderBinding binding;
                    FragmentLoaderBinding binding2;
                    float f;
                    float f2;
                    float f3;
                    float f4;
                    float f5;
                    float f6;
                    MainActivityViewModel mainActivityViewModel;
                    MainActivityViewModel mainActivityViewModel2;
                    Context thisContext;
                    if (list == null || (workInfo = (WorkInfo) CollectionsKt___CollectionsKt.firstOrNull((List) list)) == null) {
                        return;
                    }
                    LoaderFragment loaderFragment = LoaderFragment.this;
                    long[] longArray = workInfo.getProgress().getLongArray(DownloadWorker.Progress);
                    Long firstOrNull = longArray != null ? ArraysKt___ArraysKt.firstOrNull(longArray) : null;
                    Long orNull = longArray != null ? ArraysKt___ArraysKt.getOrNull(longArray, 1) : null;
                    if (firstOrNull != null) {
                        loaderFragment.loaded = firstOrNull.longValue() / 1048576;
                    }
                    if (orNull != null) {
                        loaderFragment.total = orNull.longValue() / 1048576;
                    }
                    int i = WhenMappings.$EnumSwitchMapping$0[workInfo.getState().ordinal()];
                    if (i == 1) {
                        thisActivity = loaderFragment.getThisActivity();
                        if (thisActivity.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
                            binding = loaderFragment.getBinding();
                            if (binding.buttonRepeat.getVisibility() == 0) {
                                loaderFragment.setButtonsYesNoVisibility(8);
                            }
                            binding2 = loaderFragment.getBinding();
                            if (binding2.progressBar.getVisibility() != 0) {
                                loaderFragment.setTextViewAndProgressBarVisibility(0);
                            }
                            f = loaderFragment.total;
                            if (f > -1.0f) {
                                f2 = loaderFragment.loaded;
                                if (f2 > -1.0f) {
                                    f3 = loaderFragment.loaded;
                                    f4 = loaderFragment.total;
                                    loaderFragment.setProgressFiles(((f3 * 1.0f) / f4) * 100);
                                    f5 = loaderFragment.loaded;
                                    f6 = loaderFragment.total;
                                    loaderFragment.setLoaded(f5, f6);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (i == 2) {
                        UtilsKt.crashlyticsLog("DOWNLOAD_WORKER WorkInfo.State SUCCEED");
                        mainActivityViewModel = loaderFragment.getMainActivityViewModel();
                        mainActivityViewModel.getSizeOfUpdateFromDB();
                        return;
                    }
                    if (i != 3 && i != 4) {
                        if (i != 5) {
                            return;
                        }
                        UtilsKt.crashlyticsLog("DOWNLOAD_WORKER WorkInfo.State BLOCKED");
                        thisContext = loaderFragment.getThisContext();
                        Toast.makeText(thisContext, loaderFragment.getString(R.string.launcher_error_download_forbidden_by_os), 1).show();
                        return;
                    }
                    mainActivityViewModel2 = loaderFragment.getMainActivityViewModel();
                    mainActivityViewModel2.getSizeOfUpdateFromDB();
                    UtilsKt.crashlyticsLog("DOWNLOAD_WORKER ERROR STATE: " + workInfo.getOutputData().getString(LauncherConstants.ERROR_KEY));
                    loaderFragment.setButtonsYesNoVisibility(0);
                    loaderFragment.setTextViewAndProgressBarVisibility(4);
                }
            }));
        }
    }

    public final void onClickDownloadButton() {
        AppCompatButton buttonRepeat = getBinding().buttonRepeat;
        Intrinsics.checkNotNullExpressionValue(buttonRepeat, "buttonRepeat");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonRepeat, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$onClickDownloadButton$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                FragmentLoaderBinding binding;
                FragmentActivity thisActivity;
                boolean isExternalStorageAvailable;
                Context thisContext;
                MainActivityViewModel mainActivityViewModel;
                boolean z;
                Context thisContext2;
                WorkContinuation beginUniqueWork;
                File externalFilesDir;
                LoaderFragment.this.setButtonsYesNoVisibility(8);
                binding = LoaderFragment.this.getBinding();
                binding.tvSizeOfUpdate.setVisibility(8);
                LoaderFragment.this.setTextViewAndProgressBarVisibility(0);
                LoaderFragment loaderFragment = LoaderFragment.this;
                thisActivity = loaderFragment.getThisActivity();
                Intrinsics.checkNotNullExpressionValue(thisActivity, "access$getThisActivity(...)");
                isExternalStorageAvailable = loaderFragment.isExternalStorageAvailable(thisActivity);
                if (isExternalStorageAvailable) {
                    mainActivityViewModel = LoaderFragment.this.getMainActivityViewModel();
                    Long value = mainActivityViewModel.getSizeOfUpdateLiveData().getValue();
                    if (value != null) {
                        LoaderFragment loaderFragment2 = LoaderFragment.this;
                        if (value.longValue() != 0) {
                            z = loaderFragment2.isInternetAvailable;
                            if (!z) {
                                loaderFragment2.setButtonsYesNoVisibility(0);
                                loaderFragment2.setTextViewAndProgressBarVisibility(4);
                                thisContext2 = loaderFragment2.getThisContext();
                                Toast.makeText(thisContext2, loaderFragment2.getString(R.string.fragment_main_no_internet_short), 1).show();
                                return;
                            }
                            FragmentActivity activity = loaderFragment2.getActivity();
                            Data build = new Data.Builder().putLong(DownloadWorker.FinalSize, value.longValue()).putString(DownloadWorker.GamePath, (activity == null || (externalFilesDir = activity.getExternalFilesDir(null)) == null) ? null : externalFilesDir.getAbsolutePath()).build();
                            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                            OneTimeWorkRequest build2 = new OneTimeWorkRequest.Builder(DownloadWorker.class).setInputData(build).setExpedited(OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).build();
                            loaderFragment2.workId = build2.getId();
                            Context context = loaderFragment2.getContext();
                            WorkManager workManager = context != null ? WorkManager.getInstance(context) : null;
                            if (workManager != null && (beginUniqueWork = workManager.beginUniqueWork(LauncherConstants.DOWNLOAD_WORK_NAME, ExistingWorkPolicy.KEEP, build2)) != null) {
                                beginUniqueWork.enqueue();
                            }
                            loaderFragment2.observeWorkProgress();
                            return;
                        }
                        UtilsKt.crashlyticsLog("sizeOfUpdateLiveData == 0L, startActivity(JNIActivity)");
                        loaderFragment2.deleteFilesNotFromListAndStartMainFragment();
                        return;
                    }
                    return;
                }
                thisContext = LoaderFragment.this.getThisContext();
                Toast.makeText(thisContext, LoaderFragment.this.getString(R.string.launcher_error_access_to_storage_is_forbidden), 1).show();
            }
        }, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (kotlin.text.StringsKt__StringsJVMKt.isBlank(r1) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isExternalStorageAvailable(android.app.Activity r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            java.io.File r3 = r5.getExternalFilesDir(r1)     // Catch: java.lang.Exception -> Le
            if (r3 == 0) goto L10
            java.lang.String r1 = r3.getAbsolutePath()     // Catch: java.lang.Exception -> Le
            goto L10
        Le:
            r1 = move-exception
            goto L1b
        L10:
            if (r1 == 0) goto L18
            boolean r5 = kotlin.text.StringsKt__StringsJVMKt.isBlank(r1)     // Catch: java.lang.Exception -> Le
            if (r5 == 0) goto L19
        L18:
            r0 = r2
        L19:
            r0 = r0 ^ r2
            goto L34
        L1b:
            com.google.firebase.crashlytics.FirebaseCrashlytics r3 = com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance()
            r3.recordException(r1)
            android.content.res.Resources r1 = r5.getResources()
            r3 = 2131887137(0x7f120421, float:1.9408873E38)
            java.lang.String r1 = r1.getString(r3)
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r1, r2)
            r5.show()
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.launcher.fragments.LoaderFragment.isExternalStorageAvailable(android.app.Activity):boolean");
    }

    public final void onClickCancelButton() {
        AppCompatButton buttonCancel = getBinding().buttonCancel;
        Intrinsics.checkNotNullExpressionValue(buttonCancel, "buttonCancel");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonCancel, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$onClickCancelButton$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (UtilsKt.isNotPublicBuildType()) {
                    LoaderFragment.this.deleteFilesNotFromListAndStartMainFragment();
                    return;
                }
                FragmentActivity activity = LoaderFragment.this.getActivity();
                if (activity != null) {
                    activity.finishAffinity();
                }
                System.exit(0);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
        }, 1, null);
    }

    public final PackageInfo getPackageInfo(PackageManager pm) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        if (Build.VERSION.SDK_INT >= 33) {
            String str = Settings.CLIENT_PACKAGE;
            of = PackageManager.PackageInfoFlags.of(0L);
            packageInfo = pm.getPackageInfo(str, of);
            Intrinsics.checkNotNull(packageInfo);
            return packageInfo;
        }
        PackageInfo packageInfo2 = pm.getPackageInfo(Settings.CLIENT_PACKAGE, 0);
        Intrinsics.checkNotNull(packageInfo2);
        return packageInfo2;
    }

    public final PackageInfo getInfoAboutApp(PackageManager pm, String fullPath) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageArchiveInfo;
        if (Build.VERSION.SDK_INT >= 33) {
            of = PackageManager.PackageInfoFlags.of(0L);
            packageArchiveInfo = pm.getPackageArchiveInfo(fullPath, of);
            return packageArchiveInfo;
        }
        return pm.getPackageArchiveInfo(fullPath, 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        UtilsKt.crashlyticsLog("LoaderFragment onStart");
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        UtilsKt.crashlyticsLog("LoaderFragment onPause");
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        UtilsKt.crashlyticsLog("LoaderFragment onStop");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        UtilsKt.crashlyticsLog("LoaderFragment onDestroy");
    }

    public LoaderFragment() {
        final Function0 function0 = null;
        this.mainActivityViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MainActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = Fragment.this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = Function0.this;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$mainActivityViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity requireActivity = LoaderFragment.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                return (ViewModelProvider.Factory) new ViewModelProvider(requireActivity).get(MainActivityViewModel.class);
            }
        });
        ActivityResultLauncher<Intent> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$$ExternalSyntheticLambda3
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                LoaderFragment.unknownAppPermissionResult$lambda$0(LoaderFragment.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.unknownAppPermissionResult = registerForActivityResult;
        ActivityResultLauncher<Intent> registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$$ExternalSyntheticLambda4
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                LoaderFragment.installAppResultLauncher$lambda$1(LoaderFragment.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult2, "registerForActivityResult(...)");
        this.installAppResultLauncher = registerForActivityResult2;
        this.thisContext = LazyKt__LazyJVMKt.lazy(new Function0<Context>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$thisContext$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Context invoke() {
                return LoaderFragment.this.requireContext();
            }
        });
        this.thisActivity = LazyKt__LazyJVMKt.lazy(new Function0<FragmentActivity>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$thisActivity$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FragmentActivity invoke() {
                return LoaderFragment.this.requireActivity();
            }
        });
        ActivityResultLauncher<String> registerForActivityResult3 = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$$ExternalSyntheticLambda5
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                LoaderFragment.requestNotificationPermissionLauncher$lambda$3(LoaderFragment.this, ((Boolean) obj).booleanValue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult3, "registerForActivityResult(...)");
        this.requestNotificationPermissionLauncher = registerForActivityResult3;
    }
}
