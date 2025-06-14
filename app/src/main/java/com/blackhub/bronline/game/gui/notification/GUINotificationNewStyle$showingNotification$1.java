package com.blackhub.bronline.game.gui.notification;

import android.view.View;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.notification.GUINotificationNewStyle$showingNotification$1", f = "GUINotificationNewStyle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class GUINotificationNewStyle$showingNotification$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ boolean $isShow;
    public int label;
    public final /* synthetic */ GUINotificationNewStyle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GUINotificationNewStyle$showingNotification$1(GUINotificationNewStyle gUINotificationNewStyle, boolean z, Continuation<? super GUINotificationNewStyle$showingNotification$1> continuation) {
        super(2, continuation);
        this.this$0 = gUINotificationNewStyle;
        this.$isShow = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GUINotificationNewStyle$showingNotification$1(this.this$0, this.$isShow, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((GUINotificationNewStyle$showingNotification$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        NotificationNewStyleAdapter notificationNewStyleAdapter;
        NotificationOldStyleAdapter notificationOldStyleAdapter;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.this$0.getActivity() != null && this.this$0.isAdded()) {
            View root = GUINotificationNewStyle.access$getBinding(this.this$0).getRoot();
            boolean z = this.$isShow;
            GUINotificationNewStyle gUINotificationNewStyle = this.this$0;
            int i = z ? 0 : 4;
            if (root.getVisibility() != i) {
                root.setVisibility(i);
                notificationNewStyleAdapter = gUINotificationNewStyle.notificationNewStyleAdapter;
                if (notificationNewStyleAdapter != null) {
                    notificationNewStyleAdapter.notifyItemChanged(10);
                }
                notificationOldStyleAdapter = gUINotificationNewStyle.notificationOldStyleAdapter;
                if (notificationOldStyleAdapter != null) {
                    notificationOldStyleAdapter.notifyItemChanged(10);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
