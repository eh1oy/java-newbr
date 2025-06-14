package com.blackhub.bronline.game.gui.notification;

import com.blackhub.bronline.game.gui.notification.adapters.NotificationNewStyleAdapter;
import com.blackhub.bronline.game.gui.notification.adapters.NotificationOldStyleAdapter;
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
/* compiled from: GUINotificationNewStyle.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.notification.GUINotificationNewStyle$initClickListenerForBothAdapters$1", f = "GUINotificationNewStyle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class GUINotificationNewStyle$initClickListenerForBothAdapters$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ boolean $isNewType;
    public final /* synthetic */ int $pos;
    public int label;
    public final /* synthetic */ GUINotificationNewStyle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GUINotificationNewStyle$initClickListenerForBothAdapters$1(boolean z, GUINotificationNewStyle gUINotificationNewStyle, int i, Continuation<? super GUINotificationNewStyle$initClickListenerForBothAdapters$1> continuation) {
        super(2, continuation);
        this.$isNewType = z;
        this.this$0 = gUINotificationNewStyle;
        this.$pos = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GUINotificationNewStyle$initClickListenerForBothAdapters$1(this.$isNewType, this.this$0, this.$pos, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((GUINotificationNewStyle$initClickListenerForBothAdapters$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        NotificationOldStyleAdapter notificationOldStyleAdapter;
        NotificationNewStyleAdapter notificationNewStyleAdapter;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$isNewType) {
            notificationNewStyleAdapter = this.this$0.notificationNewStyleAdapter;
            if (notificationNewStyleAdapter != null) {
                notificationNewStyleAdapter.removeItemByPos(this.$pos);
            }
        } else {
            notificationOldStyleAdapter = this.this$0.notificationOldStyleAdapter;
            if (notificationOldStyleAdapter != null) {
                notificationOldStyleAdapter.removeItemByPos(this.$pos);
            }
        }
        this.this$0.getNewNotification(this.$isNewType);
        return Unit.INSTANCE;
    }
}
