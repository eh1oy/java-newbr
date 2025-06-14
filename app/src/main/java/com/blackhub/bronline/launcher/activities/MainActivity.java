package com.blackhub.bronline.launcher.activities;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStateManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.work.WorkManager;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.ActivityMainBinding;
import com.blackhub.bronline.game.common.composemanager.ComposeViewManager;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.preferences.Preferences;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.GLSurfaceViewForExtensions;
import com.blackhub.bronline.launcher.LauncherConstants;
import com.blackhub.bronline.launcher.fragments.InitializationFragment;
import com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import com.caverock.androidsvg.SVG;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.FirebaseCrashlyticsKt;
import com.google.firebase.crashlytics.KeyValueBuilder;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.AddTrace;
import com.google.firebase.perf.metrics.Trace;
import java.io.File;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.ivy.osgi.updatesite.xml.FeatureParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.core.tasks.OnFailureListener;
import ru.rustore.sdk.core.tasks.OnSuccessListener;
import ru.rustore.sdk.remoteconfig.RemoteConfig;
import ru.rustore.sdk.remoteconfig.RemoteConfigClient;

/* compiled from: MainActivity.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0003J\u0012\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0015J\b\u0010\u001c\u001a\u00020\u0014H\u0014J\b\u0010\u001d\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/blackhub/bronline/launcher/activities/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/blackhub/bronline/databinding/ActivityMainBinding;", "glSurfaceView", "Landroid/opengl/GLSurfaceView;", "mainActivityViewModel", "Lcom/blackhub/bronline/launcher/viewmodel/MainActivityViewModel;", "getMainActivityViewModel", "()Lcom/blackhub/bronline/launcher/viewmodel/MainActivityViewModel;", "mainActivityViewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "getViewModelFactory", "()Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "setViewModelFactory", "(Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;)V", "changeFragment", "", FeatureParser.PluginHandler.FRAGMENT, "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "initGLSurfaceView", "onCreate", FragmentStateManager.SAVED_INSTANCE_STATE_KEY, "Landroid/os/Bundle;", "onDestroy", "setObservers", "Companion", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/blackhub/bronline/launcher/activities/MainActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,190:1\n75#2,13:191\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/blackhub/bronline/launcher/activities/MainActivity\n*L\n56#1:191,13\n*E\n"})
/* loaded from: classes4.dex */
public final class MainActivity extends AppCompatActivity {
    public ActivityMainBinding binding;

    @Nullable
    public GLSurfaceView glSurfaceView;

    /* renamed from: mainActivityViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainActivityViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MainActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.launcher.activities.MainActivity$special$$inlined$viewModels$default$2
        public MainActivity$special$$inlined$viewModels$default$2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelStore invoke() {
            return ComponentActivity.this.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.launcher.activities.MainActivity$mainActivityViewModel$2
        public MainActivity$mainActivityViewModel$2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelProvider.Factory invoke() {
            MainActivity mainActivity = MainActivity.this;
            return (ViewModelProvider.Factory) new ViewModelProvider(mainActivity, mainActivity.getViewModelFactory()).get(MainActivityViewModel.class);
        }
    }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.launcher.activities.MainActivity$special$$inlined$viewModels$default$3
        public final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MainActivity$special$$inlined$viewModels$default$3(ComponentActivity this) {
            super(0);
            r2 = this;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = Function0.this;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? r2.getDefaultViewModelCreationExtras() : creationExtras;
        }
    });

    @Inject
    public MainViewModelFactory<MainActivityViewModel> viewModelFactory;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public final MainViewModelFactory<MainActivityViewModel> getViewModelFactory() {
        MainViewModelFactory<MainActivityViewModel> mainViewModelFactory = this.viewModelFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    public final void setViewModelFactory(@NotNull MainViewModelFactory<MainActivityViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.viewModelFactory = mainViewModelFactory;
    }

    public final MainActivityViewModel getMainActivityViewModel() {
        return (MainActivityViewModel) this.mainActivityViewModel.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @AddTrace(name = "MainActivity onCreate")
    public void onCreate(@Nullable Bundle r7) {
        Trace startTrace = FirebasePerformance.startTrace("MainActivity onCreate");
        App.INSTANCE.appComponent().inject(this);
        super.onCreate(r7);
        UtilsKt.crashlyticsLog("MainActivity onCreate");
        MainActivityViewModel mainActivityViewModel = getMainActivityViewModel();
        ActivityMainBinding activityMainBinding = null;
        File externalFilesDir = getExternalFilesDir(null);
        mainActivityViewModel.setGamePath(externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null);
        ActivityMainBinding inflate = ActivityMainBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        ComposeViewManager composeViewManager = ComposeViewManager.INSTANCE;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        ComposeView cvTestInfo = inflate.cvTestInfo;
        Intrinsics.checkNotNullExpressionValue(cvTestInfo, "cvTestInfo");
        composeViewManager.setComposableContentForKotlin(cvTestInfo, ComposableSingletons$MainActivityKt.INSTANCE.m7562getLambda1$app_siteRelease());
        setObservers();
        overridePendingTransition(0, 0);
        setTheme(R.style.AppTheme_NoActionBar);
        ActivityMainBinding activityMainBinding2 = this.binding;
        if (activityMainBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityMainBinding = activityMainBinding2;
        }
        setContentView(activityMainBinding.getRoot());
        getWindow().addFlags(128);
        getWindow().addFlags(1024);
        initGLSurfaceView();
        FirebaseMessaging.getInstance().subscribeToTopic("all");
        RemoteConfigClient.INSTANCE.getInstance().getRemoteConfig().addOnSuccessListener(new OnSuccessListener() { // from class: com.blackhub.bronline.launcher.activities.MainActivity$$ExternalSyntheticLambda0
            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                MainActivity.onCreate$lambda$0((RemoteConfig) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.blackhub.bronline.launcher.activities.MainActivity$$ExternalSyntheticLambda1
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                MainActivity.onCreate$lambda$1(th);
            }
        });
        String stringExtra = getIntent().getStringExtra("id");
        if (stringExtra != null) {
            FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(getApplicationContext());
            Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(...)");
            Bundle bundle = new Bundle();
            bundle.putString("open", stringExtra);
            firebaseAnalytics.logEvent(LauncherConstants.PUSH, bundle);
        }
        WorkManager.getInstance(this).cancelUniqueWork(LauncherConstants.DOWNLOAD_WORK_NAME);
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseCrashlytics, "getInstance(...)");
        FirebaseCrashlyticsKt.setCustomKeys(firebaseCrashlytics, new Function1<KeyValueBuilder, Unit>() { // from class: com.blackhub.bronline.launcher.activities.MainActivity$onCreate$3
            public MainActivity$onCreate$3() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeyValueBuilder keyValueBuilder) {
                invoke2(keyValueBuilder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull KeyValueBuilder setCustomKeys) {
                Intrinsics.checkNotNullParameter(setCustomKeys, "$this$setCustomKeys");
                String string = Preferences.getString(MainActivity.this, NewMenuConstants.PLAYERS_NICK);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                setCustomKeys.key(NewMenuConstants.PLAYERS_NICK, string);
                setCustomKeys.key("build_variant", "site-release");
            }
        });
        if (r7 == null) {
            UtilsKt.crashlyticsLog("savedInstanceState == null");
            changeFragment(InitializationFragment.class);
        } else {
            UtilsKt.crashlyticsLog("savedInstanceState NOT null");
        }
        startTrace.stop();
    }

    public static final void onCreate$lambda$0(RemoteConfig rc) {
        Intrinsics.checkNotNullParameter(rc, "rc");
        UtilsKt.crashlyticsLog("Rustore remote config success listener " + rc);
    }

    public static final void onCreate$lambda$1(Throwable rc) {
        Intrinsics.checkNotNullParameter(rc, "rc");
        UtilsKt.crashlyticsLog("Rustore remote config failure listener " + rc);
    }

    private final void setObservers() {
        getMainActivityViewModel().getBgImage().observe(this, new MainActivity$sam$androidx_lifecycle_Observer$0(new Function1<Bitmap, Unit>() { // from class: com.blackhub.bronline.launcher.activities.MainActivity$setObservers$1
            public MainActivity$setObservers$1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
                invoke2(bitmap);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@Nullable Bitmap bitmap) {
                ActivityMainBinding activityMainBinding;
                activityMainBinding = MainActivity.this.binding;
                if (activityMainBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityMainBinding = null;
                }
                ImageView imageView = activityMainBinding.ivBackground;
                if (AnyExtensionKt.isNull(bitmap)) {
                    Resources resources = MainActivity.this.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    bitmap = BitmapUtilsKt.getBitmap(resources, R.drawable.bg_welcome_img);
                }
                imageView.setImageBitmap(bitmap);
            }
        }));
    }

    public final void changeFragment(Class<? extends Fragment> r4) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        ActivityMainBinding activityMainBinding = this.binding;
        if (activityMainBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding = null;
        }
        beginTransaction.replace(activityMainBinding.fragmentContainerView.getId(), r4, (Bundle) null).commit();
    }

    @AddTrace(name = "MainActivity initGLSurfaceView()")
    public final void initGLSurfaceView() {
        Trace startTrace = FirebasePerformance.startTrace("MainActivity initGLSurfaceView()");
        GLSurfaceViewForExtensions gLSurfaceViewForExtensions = new GLSurfaceViewForExtensions(this, getMainActivityViewModel());
        this.glSurfaceView = gLSurfaceViewForExtensions;
        gLSurfaceViewForExtensions.setLayoutParams(new LinearLayout.LayoutParams(1, 1));
        ActivityMainBinding activityMainBinding = this.binding;
        if (activityMainBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding = null;
        }
        activityMainBinding.getRoot().addView(this.glSurfaceView);
        startTrace.stop();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        UtilsKt.crashlyticsLog("MainActivity onDestroy");
        WorkManager.getInstance(this).cancelUniqueWork(LauncherConstants.DOWNLOAD_WORK_NAME);
    }

    /* compiled from: MainActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/blackhub/bronline/launcher/activities/MainActivity$Companion;", "", "()V", "hideSystemUI", "", "window", "Landroid/view/Window;", SVG.View.NODE_NAME, "Landroid/view/View;", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void hideSystemUI(@Nullable Window window, @NotNull View r4) {
            Intrinsics.checkNotNullParameter(r4, "view");
            if (Build.VERSION.SDK_INT < 30) {
                View decorView = window != null ? window.getDecorView() : null;
                if (decorView == null) {
                    return;
                }
                decorView.setSystemUiVisibility(7942);
                return;
            }
            if (window != null) {
                WindowCompat.setDecorFitsSystemWindows(window, false);
                WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, r4);
                windowInsetsControllerCompat.hide(WindowInsetsCompat.Type.systemBars());
                windowInsetsControllerCompat.setSystemBarsBehavior(2);
            }
        }
    }
}
