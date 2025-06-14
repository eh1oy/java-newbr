package com.blackhub.bronline.launcher.viewmodel;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.craft.CraftKeys;
import com.blackhub.bronline.game.repository.LauncherRepository;
import com.blackhub.bronline.launcher.LauncherConstants;
import com.blackhub.bronline.launcher.Settings;
import com.blackhub.bronline.launcher.data.MyFile;
import com.blackhub.bronline.launcher.database.LauncherDatabase;
import com.blackhub.bronline.launcher.di.BackupCdnAPI;
import com.blackhub.bronline.launcher.di.CdnAPI;
import com.blackhub.bronline.launcher.network.Api;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.AddTrace;
import com.google.firebase.perf.metrics.Trace;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.appupdate.listener.InstallStateUpdateListener;
import ru.rustore.sdk.appupdate.manager.RuStoreAppUpdateManager;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import ru.rustore.sdk.appupdate.model.AppUpdateOptions;
import ru.rustore.sdk.appupdate.model.InstallState;
import ru.rustore.sdk.core.tasks.OnFailureListener;
import ru.rustore.sdk.core.tasks.OnSuccessListener;

/* compiled from: MainActivityViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0002\u0010\u000eJ\u0006\u0010;\u001a\u00020<J\u001e\u0010=\u001a\u00020<2\u0006\u00104\u001a\u0002052\f\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?H\u0002J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?2\u0006\u0010B\u001a\u000205H\u0002J\b\u0010C\u001a\u00020<H\u0007J\b\u0010D\u001a\u00020<H\u0007J\b\u0010E\u001a\u00020<H\u0007J\u0006\u0010\u001d\u001a\u00020<J\u001a\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u0014H\u0002J\u0016\u0010K\u001a\b\u0012\u0004\u0012\u00020M0L2\u0006\u0010N\u001a\u00020MH\u0003J\u0010\u0010O\u001a\u00020G2\u0006\u0010H\u001a\u00020IH\u0002J\u0010\u0010P\u001a\u0004\u0018\u00010QH\u0082@¢\u0006\u0002\u0010RJ\b\u0010S\u001a\u00020<H\u0007J\u0010\u0010T\u001a\u0002072\u0006\u00104\u001a\u000205H\u0002J\u000e\u0010U\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010RJ\b\u0010V\u001a\u00020<H\u0014J\u000e\u0010W\u001a\u00020<2\u0006\u0010X\u001a\u00020\u0014J\u000e\u0010Y\u001a\u00020<2\u0006\u0010Z\u001a\u00020(J\u0010\u0010[\u001a\u00020<2\b\u0010+\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\\\u001a\u00020<2\u0006\u00104\u001a\u000205H\u0002J&\u0010]\u001a\u00020<2\u0006\u00104\u001a\u0002052\u0006\u0010^\u001a\u00020@2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020 0?H\u0002R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00198F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001d\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0019¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0019¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00160\"¢\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001eR\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020(0\u00198F¢\u0006\u0006\u001a\u0004\b9\u0010\u001eR\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020(0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006_"}, d2 = {"Lcom/blackhub/bronline/launcher/viewmodel/MainActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "stringResource", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "launcherDatabase", "Lcom/blackhub/bronline/launcher/database/LauncherDatabase;", "launcherRepository", "Lcom/blackhub/bronline/game/repository/LauncherRepository;", "application", "Landroid/app/Application;", "mainCdnApi", "Lcom/blackhub/bronline/launcher/network/Api;", "backupCdnApi", "(Lcom/blackhub/bronline/game/core/resources/StringResource;Lcom/blackhub/bronline/launcher/database/LauncherDatabase;Lcom/blackhub/bronline/game/repository/LauncherRepository;Landroid/app/Application;Lcom/blackhub/bronline/launcher/network/Api;Lcom/blackhub/bronline/launcher/network/Api;)V", "_bgImage", "Landroidx/lifecycle/MutableLiveData;", "Landroid/graphics/Bitmap;", "_descriptionForFragmentInitialization", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_isActualVersion", "", "_isNeedToCloseApp", "allFilesLiveData", "Landroidx/lifecycle/LiveData;", "", "Lcom/blackhub/bronline/launcher/data/MyFile;", "bgImage", "getBgImage", "()Landroidx/lifecycle/LiveData;", "countOfErrors", "", "descriptionForFragmentInitialization", "Lkotlinx/coroutines/flow/StateFlow;", "getDescriptionForFragmentInitialization", "()Lkotlinx/coroutines/flow/StateFlow;", "filesLiveData", "getFilesLiveData", "freeSpaceLiveData", "", "getFreeSpaceLiveData", "freeSpaceMutableLiveData", "gamePath", "isActualVersion", "isNeedToCloseApp", "mutableAllFilesLiveData", "mutableCurrentArchitectureFolderMutableLiveData", "mutableFilesLiveData", "mutableOnErrorResponse", "onErrorResponse", "getOnErrorResponse", "ruStoreAppUpdateManager", "Lru/rustore/sdk/appupdate/manager/RuStoreAppUpdateManager;", "rustoreUpdateListener", "Lru/rustore/sdk/appupdate/listener/InstallStateUpdateListener;", "sizeOfUpdateLiveData", "getSizeOfUpdateLiveData", "sizeOfUpdateMutableLiveData", "checkAppVersion", "", "checkRustoreUpdateAvailability", "onSuccessListener", "Lru/rustore/sdk/core/tasks/OnSuccessListener;", "Lru/rustore/sdk/appupdate/model/AppUpdateInfo;", "checkRustoreUpdateAvailabilityListener", "updateManager", "checkUpdate", "deleteFilesNotFromList", "deleteUnusedEntriesFromDB", "getInfoAboutApp", "Landroid/content/pm/PackageInfo;", CraftKeys.PERCENT_OF_SKILL_KEY, "Landroid/content/pm/PackageManager;", "fullPath", "getListOfFiles", "", "Ljava/io/File;", "parentDir", "getPackageInfo", "getServerAppVersion", "Lcom/blackhub/bronline/game/model/remote/response/app/AppVersionResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSizeOfUpdateFromDB", "initInstallStateUpdateListener", "isLauncherVersionActual", "onCleared", "setCurrentArchitectureFolder", "currentFolder", "setFreeSpace", "freeSpace", "setGamePath", "startRustoreApkUpdate", "startRustoreUpdateFlow", "appUpdateInfo", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMainActivityViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivityViewModel.kt\ncom/blackhub/bronline/launcher/viewmodel/MainActivityViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,575:1\n1#2:576\n1855#3,2:577\n48#4,4:579\n*S KotlinDebug\n*F\n+ 1 MainActivityViewModel.kt\ncom/blackhub/bronline/launcher/viewmodel/MainActivityViewModel\n*L\n181#1:577,2\n217#1:579,4\n*E\n"})
/* loaded from: classes4.dex */
public final class MainActivityViewModel extends ViewModel implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final MutableLiveData<Bitmap> _bgImage;

    @NotNull
    public final MutableStateFlow<String> _descriptionForFragmentInitialization;

    @NotNull
    public final MutableLiveData<Boolean> _isActualVersion;

    @NotNull
    public final MutableStateFlow<Boolean> _isNeedToCloseApp;

    @NotNull
    public final LiveData<List<MyFile>> allFilesLiveData;

    @NotNull
    public final Application application;

    @NotNull
    public final Api backupCdnApi;
    public int countOfErrors;

    @NotNull
    public final StateFlow<String> descriptionForFragmentInitialization;

    @NotNull
    public final LiveData<List<MyFile>> filesLiveData;

    @NotNull
    public final LiveData<Long> freeSpaceLiveData;

    @NotNull
    public final MutableLiveData<Long> freeSpaceMutableLiveData;

    @NotNull
    public String gamePath;

    @NotNull
    public final LiveData<Boolean> isActualVersion;

    @NotNull
    public final StateFlow<Boolean> isNeedToCloseApp;

    @NotNull
    public final LauncherDatabase launcherDatabase;

    @NotNull
    public final LauncherRepository launcherRepository;

    @NotNull
    public final Api mainCdnApi;

    @NotNull
    public final MutableLiveData<List<MyFile>> mutableAllFilesLiveData;

    @NotNull
    public final MutableLiveData<String> mutableCurrentArchitectureFolderMutableLiveData;

    @NotNull
    public final MutableLiveData<List<MyFile>> mutableFilesLiveData;

    @NotNull
    public final MutableLiveData<String> mutableOnErrorResponse;

    @NotNull
    public final LiveData<String> onErrorResponse;

    @Nullable
    public RuStoreAppUpdateManager ruStoreAppUpdateManager;

    @Nullable
    public InstallStateUpdateListener rustoreUpdateListener;

    @NotNull
    public final MutableLiveData<Long> sizeOfUpdateMutableLiveData;

    @NotNull
    public final StringResource stringResource;

    @Inject
    public MainActivityViewModel(@NotNull StringResource stringResource, @NotNull LauncherDatabase launcherDatabase, @NotNull LauncherRepository launcherRepository, @NotNull Application application, @CdnAPI @NotNull Api mainCdnApi, @BackupCdnAPI @NotNull Api backupCdnApi) {
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        Intrinsics.checkNotNullParameter(launcherDatabase, "launcherDatabase");
        Intrinsics.checkNotNullParameter(launcherRepository, "launcherRepository");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(mainCdnApi, "mainCdnApi");
        Intrinsics.checkNotNullParameter(backupCdnApi, "backupCdnApi");
        this.stringResource = stringResource;
        this.launcherDatabase = launcherDatabase;
        this.launcherRepository = launcherRepository;
        this.application = application;
        this.mainCdnApi = mainCdnApi;
        this.backupCdnApi = backupCdnApi;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        this.gamePath = AnyExtensionKt.empty(stringCompanionObject);
        this.mutableCurrentArchitectureFolderMutableLiveData = new MutableLiveData<>();
        MutableLiveData<List<MyFile>> mutableLiveData = new MutableLiveData<>();
        this.mutableAllFilesLiveData = mutableLiveData;
        this.allFilesLiveData = mutableLiveData;
        MutableLiveData<List<MyFile>> mutableLiveData2 = new MutableLiveData<>();
        this.mutableFilesLiveData = mutableLiveData2;
        this.filesLiveData = mutableLiveData2;
        MutableLiveData<String> mutableLiveData3 = new MutableLiveData<>();
        this.mutableOnErrorResponse = mutableLiveData3;
        this.onErrorResponse = mutableLiveData3;
        this.sizeOfUpdateMutableLiveData = new MutableLiveData<>();
        MutableLiveData<Long> mutableLiveData4 = new MutableLiveData<>();
        this.freeSpaceMutableLiveData = mutableLiveData4;
        this.freeSpaceLiveData = mutableLiveData4;
        this._bgImage = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>(null);
        this._isActualVersion = mutableLiveData5;
        this.isActualVersion = mutableLiveData5;
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow(AnyExtensionKt.empty(stringCompanionObject));
        this._descriptionForFragmentInitialization = MutableStateFlow;
        this.descriptionForFragmentInitialization = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this._isNeedToCloseApp = MutableStateFlow2;
        this.isNeedToCloseApp = FlowKt.asStateFlow(MutableStateFlow2);
        ViewModelExtensionKt.launchOnIO$default(this, null, new AnonymousClass1(null), 1, null);
    }

    @NotNull
    public final LiveData<List<MyFile>> getFilesLiveData() {
        return this.filesLiveData;
    }

    @NotNull
    public final LiveData<String> getOnErrorResponse() {
        return this.onErrorResponse;
    }

    @NotNull
    public final LiveData<Long> getSizeOfUpdateLiveData() {
        return this.sizeOfUpdateMutableLiveData;
    }

    @NotNull
    public final LiveData<Long> getFreeSpaceLiveData() {
        return this.freeSpaceLiveData;
    }

    @NotNull
    public final LiveData<Bitmap> getBgImage() {
        return this._bgImage;
    }

    @NotNull
    public final LiveData<Boolean> isActualVersion() {
        return this.isActualVersion;
    }

    @NotNull
    public final StateFlow<String> getDescriptionForFragmentInitialization() {
        return this.descriptionForFragmentInitialization;
    }

    @NotNull
    public final StateFlow<Boolean> isNeedToCloseApp() {
        return this.isNeedToCloseApp;
    }

    /* compiled from: MainActivityViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$1", f = "MainActivityViewModel.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$1 */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MainActivityViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LauncherRepository launcherRepository = MainActivityViewModel.this.launcherRepository;
                this.label = 1;
                if (launcherRepository.getAppConfig(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        RuStoreAppUpdateManager ruStoreAppUpdateManager;
        super.onCleared();
        InstallStateUpdateListener installStateUpdateListener = this.rustoreUpdateListener;
        if (installStateUpdateListener != null && (ruStoreAppUpdateManager = this.ruStoreAppUpdateManager) != null) {
            ruStoreAppUpdateManager.unregisterListener(installStateUpdateListener);
        }
        this.ruStoreAppUpdateManager = null;
    }

    /* renamed from: getBgImage */
    public final void m7573getBgImage() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new MainActivityViewModel$getBgImage$1(this, null), 1, null);
    }

    public final void setGamePath(@Nullable String gamePath) {
        this.gamePath = String.valueOf(gamePath);
    }

    public final void setCurrentArchitectureFolder(@NotNull String currentFolder) {
        Intrinsics.checkNotNullParameter(currentFolder, "currentFolder");
        this.mutableCurrentArchitectureFolderMutableLiveData.postValue(currentFolder);
    }

    public final void setFreeSpace(long freeSpace) {
        this.freeSpaceMutableLiveData.setValue(Long.valueOf(freeSpace));
    }

    @AddTrace(name = "MainActivityViewModel getSizeOfUpdateFromDB()")
    public final void getSizeOfUpdateFromDB() {
        Trace startTrace = FirebasePerformance.startTrace("MainActivityViewModel getSizeOfUpdateFromDB()");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new MainActivityViewModel$getSizeOfUpdateFromDB$1(this, null), 2, null);
        startTrace.stop();
    }

    @AddTrace(name = "MainActivityViewModel deleteFilesNotFromList()")
    public final void deleteFilesNotFromList() {
        Trace startTrace = FirebasePerformance.startTrace("MainActivityViewModel deleteFilesNotFromList()");
        String str = StringsKt__StringsJVMKt.replace$default(this.gamePath, "com.br.top/files", AnyExtensionKt.empty(StringCompanionObject.INSTANCE), false, 4, (Object) null) + Settings.CLIENT_PACKAGE;
        for (File file : getListOfFiles(new File(str + LauncherConstants.SLASH_FILES_SLASH))) {
            if (!file.getName().equals(LauncherConstants.CUSTOM_TOUCHSCREEN_NAME) && !file.getName().equals("launcher.apk") && !file.getName().equals(LauncherConstants.GAME_SETTING_JSON) && !file.getName().equals(LauncherConstants.CRASH_LOG_TXT)) {
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                Object obj = null;
                if (StringsKt__StringsKt.contains$default((CharSequence) name, (CharSequence) LauncherConstants.NOLOGO, false, 2, (Object) null) && UtilsKt.isFlavorWithLogo()) {
                    file.delete();
                }
                List<MyFile> value = this.allFilesLiveData.getValue();
                if (value != null) {
                    Intrinsics.checkNotNull(value);
                    Iterator<T> it = value.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        MyFile myFile = (MyFile) next;
                        if (Intrinsics.areEqual(str + "/" + myFile.getPath() + myFile.getName(), file.getPath())) {
                            obj = next;
                            break;
                        }
                    }
                    obj = (MyFile) obj;
                }
                if (obj == null) {
                    file.delete();
                }
            }
        }
        startTrace.stop();
    }

    @AddTrace(name = "MainActivityViewModel deleteUnusedEntriesFromDB()")
    public final void deleteUnusedEntriesFromDB() {
        Trace startTrace = FirebasePerformance.startTrace("MainActivityViewModel deleteUnusedEntriesFromDB()");
        ViewModelExtensionKt.launchOnIO$default(this, null, new MainActivityViewModel$deleteUnusedEntriesFromDB$1(this, null), 1, null);
        startTrace.stop();
    }

    public final void checkAppVersion() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new MainActivityViewModel$checkAppVersion$1(this, null), 1, null);
    }

    public final void checkRustoreUpdateAvailability(RuStoreAppUpdateManager ruStoreAppUpdateManager, OnSuccessListener<AppUpdateInfo> onSuccessListener) {
        ruStoreAppUpdateManager.getAppUpdateInfo().addOnSuccessListener(onSuccessListener).addOnFailureListener(new OnFailureListener() { // from class: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$$ExternalSyntheticLambda6
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                MainActivityViewModel.checkRustoreUpdateAvailability$lambda$4(th);
            }
        });
    }

    public static final void checkRustoreUpdateAvailability$lambda$4(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        UtilsKt.crashlyticsRecordNewException("Rustore getAppUpdateInfo error " + throwable.getMessage());
    }

    public final OnSuccessListener<AppUpdateInfo> checkRustoreUpdateAvailabilityListener(RuStoreAppUpdateManager updateManager) {
        return new OnSuccessListener() { // from class: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$$ExternalSyntheticLambda5
            public final /* synthetic */ RuStoreAppUpdateManager f$1;

            public /* synthetic */ MainActivityViewModel$$ExternalSyntheticLambda5(RuStoreAppUpdateManager updateManager2) {
                r2 = updateManager2;
            }

            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                MainActivityViewModel.checkRustoreUpdateAvailabilityListener$lambda$7(MainActivityViewModel.this, r2, (AppUpdateInfo) obj);
            }
        };
    }

    public static final void checkRustoreUpdateAvailabilityListener$lambda$7(MainActivityViewModel this$0, RuStoreAppUpdateManager updateManager, AppUpdateInfo result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(updateManager, "$updateManager");
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getUpdateAvailability() == 2) {
            this$0.startRustoreUpdateFlow(updateManager, result, new OnSuccessListener() { // from class: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$$ExternalSyntheticLambda2
                public final /* synthetic */ RuStoreAppUpdateManager f$1;

                public /* synthetic */ MainActivityViewModel$$ExternalSyntheticLambda2(RuStoreAppUpdateManager updateManager2) {
                    r2 = updateManager2;
                }

                @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    MainActivityViewModel.checkRustoreUpdateAvailabilityListener$lambda$7$lambda$6(MainActivityViewModel.this, r2, ((Integer) obj).intValue());
                }
            });
        } else {
            this$0._isActualVersion.postValue(Boolean.TRUE);
        }
    }

    public static final void checkRustoreUpdateAvailabilityListener$lambda$7$lambda$6(MainActivityViewModel this$0, RuStoreAppUpdateManager updateManager, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(updateManager, "$updateManager");
        if (i != -1) {
            if (i != 0) {
                return;
            }
            this$0._isNeedToCloseApp.setValue(Boolean.TRUE);
        } else {
            InstallStateUpdateListener initInstallStateUpdateListener = this$0.initInstallStateUpdateListener(updateManager);
            this$0.rustoreUpdateListener = initInstallStateUpdateListener;
            if (initInstallStateUpdateListener != null) {
                updateManager.registerListener(initInstallStateUpdateListener);
            }
        }
    }

    public final void startRustoreUpdateFlow(RuStoreAppUpdateManager ruStoreAppUpdateManager, AppUpdateInfo appUpdateInfo, OnSuccessListener<Integer> onSuccessListener) {
        ruStoreAppUpdateManager.startUpdateFlow(appUpdateInfo, new AppUpdateOptions.Builder().appUpdateType(1).build()).addOnSuccessListener(onSuccessListener).addOnFailureListener(new OnFailureListener() { // from class: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$$ExternalSyntheticLambda3
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                MainActivityViewModel.startRustoreUpdateFlow$lambda$8(th);
            }
        });
    }

    public static final void startRustoreUpdateFlow$lambda$8(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        UtilsKt.crashlyticsLog("startRustoreUpdateFlow addOnFailureListener " + throwable);
    }

    public final void startRustoreApkUpdate(RuStoreAppUpdateManager ruStoreAppUpdateManager) {
        ruStoreAppUpdateManager.completeUpdate(new AppUpdateOptions.Builder().appUpdateType(0).build()).addOnFailureListener(new OnFailureListener() { // from class: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$$ExternalSyntheticLambda1
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                MainActivityViewModel.startRustoreApkUpdate$lambda$9(th);
            }
        });
    }

    public static final void startRustoreApkUpdate$lambda$9(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        UtilsKt.crashlyticsRecordNewException("Rustore startRustoreApkUpdate error " + throwable.getMessage());
    }

    public final InstallStateUpdateListener initInstallStateUpdateListener(RuStoreAppUpdateManager ruStoreAppUpdateManager) {
        return new InstallStateUpdateListener() { // from class: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$$ExternalSyntheticLambda4
            public final /* synthetic */ RuStoreAppUpdateManager f$1;

            public /* synthetic */ MainActivityViewModel$$ExternalSyntheticLambda4(RuStoreAppUpdateManager ruStoreAppUpdateManager2) {
                r2 = ruStoreAppUpdateManager2;
            }

            @Override // ru.rustore.sdk.appupdate.listener.InstallStateUpdateListener
            public final void onStateUpdated(InstallState installState) {
                MainActivityViewModel.initInstallStateUpdateListener$lambda$10(MainActivityViewModel.this, r2, installState);
            }
        };
    }

    public static final void initInstallStateUpdateListener$lambda$10(MainActivityViewModel this$0, RuStoreAppUpdateManager ruStoreAppUpdateManager, InstallState state) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(ruStoreAppUpdateManager, "$ruStoreAppUpdateManager");
        Intrinsics.checkNotNullParameter(state, "state");
        int installStatus = state.getInstallStatus();
        if (installStatus == 1) {
            UtilsKt.crashlyticsLog("initViews:state.installStatus DOWNLOADED");
            this$0.startRustoreApkUpdate(ruStoreAppUpdateManager);
            return;
        }
        if (installStatus != 2) {
            if (installStatus != 3) {
                return;
            }
            UtilsKt.crashlyticsLog("Rustore Downloading apk error " + state.getInstallErrorCode());
            return;
        }
        long totalBytesToDownload = state.getTotalBytesToDownload();
        UtilsKt.crashlyticsLog("initViews:state.installStatus DOWNLOADING " + state.getBytesDownloaded() + " / " + totalBytesToDownload + " ");
    }

    @AddTrace(name = "MainActivityViewModel getListOfFiles()")
    public final List<File> getListOfFiles(File parentDir) {
        Trace startTrace = FirebasePerformance.startTrace("MainActivityViewModel getListOfFiles()");
        ArrayList arrayList = new ArrayList();
        File[] listFiles = parentDir.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    Intrinsics.checkNotNull(file);
                    arrayList.addAll(getListOfFiles(file));
                } else {
                    arrayList.add(file);
                }
            }
        }
        startTrace.stop();
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[Catch: Exception -> 0x002a, TRY_LEAVE, TryCatch #0 {Exception -> 0x002a, blocks: (B:10:0x0026, B:11:0x0042, B:13:0x004c, B:24:0x0037), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getServerAppVersion(kotlin.coroutines.Continuation<? super com.blackhub.bronline.game.model.remote.response.app.AppVersionResponse> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$getServerAppVersion$1
            if (r0 == 0) goto L13
            r0 = r6
            com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$getServerAppVersion$1 r0 = (com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$getServerAppVersion$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$getServerAppVersion$1 r0 = new com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$getServerAppVersion$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Exception -> L2a
            goto L42
        L2a:
            r6 = move-exception
            goto L54
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.ResultKt.throwOnFailure(r6)
            com.blackhub.bronline.game.repository.LauncherRepository r6 = r5.launcherRepository     // Catch: java.lang.Exception -> L2a
            r0.label = r3     // Catch: java.lang.Exception -> L2a
            java.lang.Object r6 = r6.getRemoteAppVersion(r0)     // Catch: java.lang.Exception -> L2a
            if (r6 != r1) goto L42
            return r1
        L42:
            retrofit2.Response r6 = (retrofit2.Response) r6     // Catch: java.lang.Exception -> L2a
            java.lang.Object r0 = r6.body()     // Catch: java.lang.Exception -> L2a
            com.blackhub.bronline.game.model.remote.response.app.AppVersionResponse r0 = (com.blackhub.bronline.game.model.remote.response.app.AppVersionResponse) r0     // Catch: java.lang.Exception -> L2a
            if (r0 == 0) goto L68
            boolean r6 = r6.isSuccessful()     // Catch: java.lang.Exception -> L2a
            if (r6 == 0) goto L68
            r4 = r0
            goto L68
        L54:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getRemoteAppVersion exception: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog(r6)
        L68:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel.getServerAppVersion(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (com.blackhub.bronline.game.core.extension.IntExtensionKt.getOrZero(r11 != null ? r11.getVersionAndroidRuStore() : null) <= 1132) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if (com.blackhub.bronline.game.core.extension.IntExtensionKt.getOrZero(r11 != null ? r11.getVersionAndroidMarket() : null) <= 1132) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ba, code lost:
    
        if (r6 < r3.longValue()) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object isLauncherVersionActual(kotlin.coroutines.Continuation<? super java.lang.Boolean> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$isLauncherVersionActual$1
            if (r0 == 0) goto L13
            r0 = r11
            com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$isLauncherVersionActual$1 r0 = (com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$isLauncherVersionActual$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$isLauncherVersionActual$1 r0 = new com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$isLauncherVersionActual$1
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r0.label
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L59
            r4 = 1132(0x46c, float:1.586E-42)
            if (r0 == r2) goto L47
            r5 = 2
            if (r0 != r5) goto L3f
            kotlin.ResultKt.throwOnFailure(r11)
            com.blackhub.bronline.game.model.remote.response.app.AppVersionResponse r11 = (com.blackhub.bronline.game.model.remote.response.app.AppVersionResponse) r11
            if (r11 == 0) goto L36
            java.lang.Integer r3 = r11.getVersionAndroidRuStore()
        L36:
            int r11 = com.blackhub.bronline.game.core.extension.IntExtensionKt.getOrZero(r3)
            if (r11 > r4) goto Lbe
        L3c:
            r1 = r2
            goto Lbe
        L3f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L47:
            kotlin.ResultKt.throwOnFailure(r11)
            com.blackhub.bronline.game.model.remote.response.app.AppVersionResponse r11 = (com.blackhub.bronline.game.model.remote.response.app.AppVersionResponse) r11
            if (r11 == 0) goto L52
            java.lang.Integer r3 = r11.getVersionAndroidMarket()
        L52:
            int r11 = com.blackhub.bronline.game.core.extension.IntExtensionKt.getOrZero(r3)
            if (r11 > r4) goto Lbe
            goto L3c
        L59:
            kotlin.ResultKt.throwOnFailure(r11)
            android.app.Application r11 = r10.application
            android.content.pm.PackageManager r11 = r11.getPackageManager()
            java.lang.String r0 = "getPackageManager(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            android.content.pm.PackageInfo r0 = r10.getPackageInfo(r11)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 < r5) goto L76
            long r6 = com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$$ExternalSyntheticApiModelOutline0.m(r0)
            goto L79
        L76:
            int r0 = r0.versionCode
            long r6 = (long) r0
        L79:
            android.app.Application r0 = r10.application
            java.io.File r0 = r0.getExternalFilesDir(r3)
            if (r0 == 0) goto L86
            java.lang.String r0 = r0.getAbsolutePath()
            goto L87
        L86:
            r0 = r3
        L87:
            java.lang.String r8 = com.blackhub.bronline.launcher.Settings.LAUNCHER_NAME
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r8)
            java.lang.String r0 = r9.toString()
            android.content.pm.PackageInfo r11 = r10.getInfoAboutApp(r11, r0)
            if (r4 < r5) goto La9
            if (r11 == 0) goto Lb2
            long r3 = com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$$ExternalSyntheticApiModelOutline0.m(r11)
            java.lang.Long r3 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r3)
            goto Lb2
        La9:
            if (r11 == 0) goto Lb2
            int r11 = r11.versionCode
            long r3 = (long) r11
            java.lang.Long r3 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r3)
        Lb2:
            if (r3 == 0) goto L3c
            long r3 = r3.longValue()
            int r11 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r11 < 0) goto Lbe
            goto L3c
        Lbe:
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel.isLauncherVersionActual(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final PackageInfo getPackageInfo(PackageManager r4) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        if (Build.VERSION.SDK_INT >= 33) {
            String str = Settings.CLIENT_PACKAGE;
            of = PackageManager.PackageInfoFlags.of(0L);
            packageInfo = r4.getPackageInfo(str, of);
            Intrinsics.checkNotNull(packageInfo);
            return packageInfo;
        }
        PackageInfo packageInfo2 = r4.getPackageInfo(Settings.CLIENT_PACKAGE, 0);
        Intrinsics.checkNotNull(packageInfo2);
        return packageInfo2;
    }

    public final PackageInfo getInfoAboutApp(PackageManager r3, String fullPath) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageArchiveInfo;
        if (Build.VERSION.SDK_INT >= 33) {
            of = PackageManager.PackageInfoFlags.of(0L);
            packageArchiveInfo = r3.getPackageArchiveInfo(fullPath, of);
            return packageArchiveInfo;
        }
        return r3.getPackageArchiveInfo(fullPath, 0);
    }

    @AddTrace(name = "MainActivityViewModel checkUpdate()")
    public final void checkUpdate() {
        Trace startTrace = FirebasePerformance.startTrace("MainActivityViewModel checkUpdate()");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO().plus(new MainActivityViewModel$checkUpdate$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE, this)), null, new MainActivityViewModel$checkUpdate$1(this, null), 2, null);
        startTrace.stop();
    }
}
