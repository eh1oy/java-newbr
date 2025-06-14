package com.blackhub.bronline.game.core.extension;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewModelExtension.kt */
@Metadata(d1 = {"\u0000X\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a9\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001aG\u0010\b\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\b\b\u0002\u0010\t\u001a\u00020\n2'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0010H\u0086@¢\u0006\u0002\u0010\u0011\u001aG\u0010\u0012\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\b\b\u0002\u0010\t\u001a\u00020\n2'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0010H\u0086@¢\u0006\u0002\u0010\u0011\u001aG\u0010\u0013\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\b\b\u0002\u0010\t\u001a\u00020\n2'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0010H\u0086@¢\u0006\u0002\u0010\u0011\u001aX\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0015\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0010H\u0002¢\u0006\u0002\u0010\u0018\u001aN\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0015\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00172'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\u0010\u001a\u001aN\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0015\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00172'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\u0010\u001a\u001aN\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0015\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00172'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\u0010\u001a\u001a\u001d\u0010\u001d\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u001f\u001aL\u0010 \u001a\u00020!*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0010H\u0002¢\u0006\u0002\u0010#\u001aB\u0010$\u001a\u00020!*\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00172'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\u0010%\u001aB\u0010&\u001a\u00020!*\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00172'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\u0010%\u001aB\u0010'\u001a\u00020!*\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00172'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\u0010%\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, d2 = {"daggerViewModel", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "key", "", "viewModelInstanceCreator", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;", "doOnDefault", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doOnIO", "doOnMain", "asyncOn", "Lkotlinx/coroutines/Deferred;", TtmlNode.START, "Lkotlinx/coroutines/CoroutineStart;", "(Landroidx/lifecycle/ViewModel;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Deferred;", "asyncOnDefault", "(Landroidx/lifecycle/ViewModel;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Deferred;", "asyncOnIO", "asyncOnMain", "getNotNull", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)Ljava/lang/Object;", "launchOn", "Lkotlinx/coroutines/Job;", "", "(Landroidx/lifecycle/ViewModel;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "launchOnDefault", "(Landroidx/lifecycle/ViewModel;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "launchOnIO", "launchOnMain", "app_siteRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewModelExtensionKt {
    public static /* synthetic */ Job launchOnIO$default(ViewModel viewModel, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return launchOnIO(viewModel, coroutineStart, function2);
    }

    @NotNull
    public static final Job launchOnIO(@NotNull ViewModel viewModel, @NotNull CoroutineStart start, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(viewModel, "<this>");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        return launchOn(viewModel, Dispatchers.getIO(), start, block);
    }

    public static /* synthetic */ Job launchOnDefault$default(ViewModel viewModel, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return launchOnDefault(viewModel, coroutineStart, function2);
    }

    @NotNull
    public static final Job launchOnDefault(@NotNull ViewModel viewModel, @NotNull CoroutineStart start, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(viewModel, "<this>");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        return launchOn(viewModel, Dispatchers.getDefault(), start, block);
    }

    public static /* synthetic */ Job launchOnMain$default(ViewModel viewModel, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return launchOnMain(viewModel, coroutineStart, function2);
    }

    @NotNull
    public static final Job launchOnMain(@NotNull ViewModel viewModel, @NotNull CoroutineStart start, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(viewModel, "<this>");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        return launchOn(viewModel, Dispatchers.getMain(), start, block);
    }

    public static /* synthetic */ Deferred asyncOnIO$default(ViewModel viewModel, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return asyncOnIO(viewModel, coroutineStart, function2);
    }

    @NotNull
    public static final <T> Deferred<T> asyncOnIO(@NotNull ViewModel viewModel, @NotNull CoroutineStart start, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(viewModel, "<this>");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        return asyncOn(viewModel, Dispatchers.getIO(), start, block);
    }

    public static /* synthetic */ Deferred asyncOnDefault$default(ViewModel viewModel, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return asyncOnDefault(viewModel, coroutineStart, function2);
    }

    @NotNull
    public static final <T> Deferred<T> asyncOnDefault(@NotNull ViewModel viewModel, @NotNull CoroutineStart start, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(viewModel, "<this>");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        return asyncOn(viewModel, Dispatchers.getDefault(), start, block);
    }

    public static /* synthetic */ Deferred asyncOnMain$default(ViewModel viewModel, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return asyncOnMain(viewModel, coroutineStart, function2);
    }

    @NotNull
    public static final <T> Deferred<T> asyncOnMain(@NotNull ViewModel viewModel, @NotNull CoroutineStart start, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(viewModel, "<this>");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        return asyncOn(viewModel, Dispatchers.getMain(), start, block);
    }

    public static /* synthetic */ Object doOnDefault$default(CoroutineDispatcher coroutineDispatcher, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineDispatcher = Dispatchers.getDefault();
        }
        return doOnDefault(coroutineDispatcher, function2, continuation);
    }

    @Nullable
    public static final <T> Object doOnDefault(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return BuildersKt.withContext(coroutineDispatcher, new ViewModelExtensionKt$doOnDefault$2(function2, null), continuation);
    }

    public static /* synthetic */ Object doOnIO$default(CoroutineDispatcher coroutineDispatcher, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineDispatcher = Dispatchers.getIO();
        }
        return doOnIO(coroutineDispatcher, function2, continuation);
    }

    @Nullable
    public static final <T> Object doOnIO(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return BuildersKt.withContext(coroutineDispatcher, new ViewModelExtensionKt$doOnIO$2(function2, null), continuation);
    }

    public static /* synthetic */ Object doOnMain$default(CoroutineDispatcher coroutineDispatcher, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        return doOnMain(coroutineDispatcher, function2, continuation);
    }

    @Nullable
    public static final <T> Object doOnMain(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return BuildersKt.withContext(coroutineDispatcher, new ViewModelExtensionKt$doOnMain$2(function2, null), continuation);
    }

    public static /* synthetic */ Job launchOn$default(ViewModel viewModel, CoroutineDispatcher coroutineDispatcher, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return launchOn(viewModel, coroutineDispatcher, coroutineStart, function2);
    }

    public static final Job launchOn(ViewModel viewModel, CoroutineDispatcher coroutineDispatcher, CoroutineStart coroutineStart, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return BuildersKt.launch(ViewModelKt.getViewModelScope(viewModel), coroutineDispatcher, coroutineStart, function2);
    }

    public static /* synthetic */ Deferred asyncOn$default(ViewModel viewModel, CoroutineDispatcher coroutineDispatcher, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return asyncOn(viewModel, coroutineDispatcher, coroutineStart, function2);
    }

    public static final <T> Deferred<T> asyncOn(ViewModel viewModel, CoroutineDispatcher coroutineDispatcher, CoroutineStart coroutineStart, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        return BuildersKt.async(ViewModelKt.getViewModelScope(viewModel), coroutineDispatcher, coroutineStart, function2);
    }

    public static final <T> T getNotNull(@NotNull SavedStateHandle savedStateHandle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        T t = (T) savedStateHandle.get(key);
        if (t != null) {
            return t;
        }
        throw new NullPointerException(key + " doesn't exist in SavedStateHandler");
    }

    @Composable
    public static final /* synthetic */ <T extends ViewModel> T daggerViewModel(String str, Function0<? extends T> viewModelInstanceCreator, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(viewModelInstanceCreator, "viewModelInstanceCreator");
        composer.startReplaceableGroup(1943963386);
        if ((i2 & 1) != 0) {
            str = null;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        T t = (T) androidx.lifecycle.viewmodel.compose.ViewModelKt.viewModel(ViewModel.class, null, str, new ViewModelProvider.Factory() { // from class: com.blackhub.bronline.game.core.extension.ViewModelExtensionKt$daggerViewModel$1
            public final /* synthetic */ Function0<T> $viewModelInstanceCreator;

            /* JADX WARN: Multi-variable type inference failed */
            public ViewModelExtensionKt$daggerViewModel$1(Function0<? extends T> viewModelInstanceCreator2) {
                r1 = viewModelInstanceCreator2;
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            @NotNull
            public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                Object invoke = r1.invoke();
                Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type T of com.blackhub.bronline.game.core.extension.ViewModelExtensionKt.daggerViewModel.<no name provided>.create");
                return (T) invoke;
            }
        }, null, composer, ((i << 6) & 896) | 8, 18);
        composer.endReplaceableGroup();
        return t;
    }
}
