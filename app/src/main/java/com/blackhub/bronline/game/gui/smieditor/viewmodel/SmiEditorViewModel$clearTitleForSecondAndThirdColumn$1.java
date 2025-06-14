package com.blackhub.bronline.game.gui.smieditor.viewmodel;

import androidx.media.AudioAttributesCompat;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: SmiEditorViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$clearTitleForSecondAndThirdColumn$1", f = "SmiEditorViewModel.kt", i = {}, l = {AudioAttributesCompat.FLAG_ALL_PUBLIC, DefaultImageHeaderParser.ORIENTATION_TAG_TYPE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class SmiEditorViewModel$clearTitleForSecondAndThirdColumn$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ SmiEditorViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmiEditorViewModel$clearTitleForSecondAndThirdColumn$1(SmiEditorViewModel smiEditorViewModel, Continuation<? super SmiEditorViewModel$clearTitleForSecondAndThirdColumn$1> continuation) {
        super(2, continuation);
        this.this$0 = smiEditorViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SmiEditorViewModel$clearTitleForSecondAndThirdColumn$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SmiEditorViewModel$clearTitleForSecondAndThirdColumn$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object initTitleForSecondColumn;
        Object initTitleForThirdColumn;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SmiEditorViewModel smiEditorViewModel = this.this$0;
            this.label = 1;
            initTitleForSecondColumn = smiEditorViewModel.initTitleForSecondColumn("", this);
            if (initTitleForSecondColumn == coroutine_suspended) {
                return coroutine_suspended;
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
        initTitleForThirdColumn = smiEditorViewModel2.initTitleForThirdColumn("", this);
        if (initTitleForThirdColumn == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
