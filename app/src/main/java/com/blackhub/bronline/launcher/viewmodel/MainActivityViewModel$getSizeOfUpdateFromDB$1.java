package com.blackhub.bronline.launcher.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.blackhub.bronline.launcher.database.LauncherDatabase;
import java.util.Iterator;
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
/* compiled from: MainActivityViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$getSizeOfUpdateFromDB$1", f = "MainActivityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMainActivityViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivityViewModel.kt\ncom/blackhub/bronline/launcher/viewmodel/MainActivityViewModel$getSizeOfUpdateFromDB$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,575:1\n1855#2,2:576\n*S KotlinDebug\n*F\n+ 1 MainActivityViewModel.kt\ncom/blackhub/bronline/launcher/viewmodel/MainActivityViewModel$getSizeOfUpdateFromDB$1\n*L\n166#1:576,2\n*E\n"})
/* loaded from: classes4.dex */
public final class MainActivityViewModel$getSizeOfUpdateFromDB$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ MainActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityViewModel$getSizeOfUpdateFromDB$1(MainActivityViewModel mainActivityViewModel, Continuation<? super MainActivityViewModel$getSizeOfUpdateFromDB$1> continuation) {
        super(2, continuation);
        this.this$0 = mainActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MainActivityViewModel$getSizeOfUpdateFromDB$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MainActivityViewModel$getSizeOfUpdateFromDB$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LauncherDatabase launcherDatabase;
        MutableLiveData mutableLiveData;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            launcherDatabase = this.this$0.launcherDatabase;
            Iterator<T> it = launcherDatabase.myFileDao().getNotDownloadedFilesSize().iterator();
            long j = 0;
            while (it.hasNext()) {
                j += ((Number) it.next()).longValue();
            }
            mutableLiveData = this.this$0.sizeOfUpdateMutableLiveData;
            mutableLiveData.postValue(Boxing.boxLong(j));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
