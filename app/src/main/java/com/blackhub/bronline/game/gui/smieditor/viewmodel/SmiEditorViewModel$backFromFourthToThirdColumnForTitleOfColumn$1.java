package com.blackhub.bronline.game.gui.smieditor.viewmodel;

import com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.apache.commons.compress.compressors.bzip2.BZip2Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: SmiEditorViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$backFromFourthToThirdColumnForTitleOfColumn$1", f = "SmiEditorViewModel.kt", i = {}, l = {BZip2Constants.MAX_ALPHA_SIZE, 260}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class SmiEditorViewModel$backFromFourthToThirdColumnForTitleOfColumn$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ SmiEditorViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmiEditorViewModel$backFromFourthToThirdColumnForTitleOfColumn$1(SmiEditorViewModel smiEditorViewModel, Continuation<? super SmiEditorViewModel$backFromFourthToThirdColumnForTitleOfColumn$1> continuation) {
        super(2, continuation);
        this.this$0 = smiEditorViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SmiEditorViewModel$backFromFourthToThirdColumnForTitleOfColumn$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SmiEditorViewModel$backFromFourthToThirdColumnForTitleOfColumn$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableStateFlow mutableStateFlow;
        Object initTitleForThirdColumn;
        Object lUpdateFinalText;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.this$0.mutableObjForNavigation;
            List list = (List) mutableStateFlow.getValue();
            if (list.size() > 1) {
                SmiEditorViewModel smiEditorViewModel = this.this$0;
                String title = ((SmiEditorBodyObj) list.get(0)).getTitle();
                this.label = 1;
                initTitleForThirdColumn = smiEditorViewModel.initTitleForThirdColumn(title, this);
                if (initTitleForThirdColumn == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        SmiEditorViewModel smiEditorViewModel2 = this.this$0;
        this.label = 2;
        lUpdateFinalText = smiEditorViewModel2.lUpdateFinalText(null, 2, this);
        if (lUpdateFinalText == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
