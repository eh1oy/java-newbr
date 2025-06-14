package com.blackhub.bronline.game.gui.smieditor.viewmodel;

import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$setFourthColumn$1", f = "SmiEditorViewModel.kt", i = {0}, l = {179, 181, MatroskaExtractor.ID_PIXEL_HEIGHT, TsExtractor.TS_PACKET_SIZE, 192, 194, 198, 200, 204, 206, 210, 212}, m = "invokeSuspend", n = {"oldObjForNavigation"}, s = {"L$1"})
/* loaded from: classes3.dex */
public final class SmiEditorViewModel$setFourthColumn$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ SmiEditorBodyObj $currentObj;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ SmiEditorViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmiEditorViewModel$setFourthColumn$1(SmiEditorBodyObj smiEditorBodyObj, SmiEditorViewModel smiEditorViewModel, Continuation<? super SmiEditorViewModel$setFourthColumn$1> continuation) {
        super(2, continuation);
        this.$currentObj = smiEditorBodyObj;
        this.this$0 = smiEditorViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SmiEditorViewModel$setFourthColumn$1(this.$currentObj, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SmiEditorViewModel$setFourthColumn$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x012e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0161 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0193 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01db A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$setFourthColumn$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
