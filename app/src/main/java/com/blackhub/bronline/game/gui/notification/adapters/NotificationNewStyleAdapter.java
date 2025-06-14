package com.blackhub.bronline.game.gui.notification.adapters;

import android.annotation.SuppressLint;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.ItemNewNotificationBinding;
import com.blackhub.bronline.game.gui.notification.data.NotificationObj;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NotificationNewStyleAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014J\b\u0010\u0017\u001a\u00020\rH\u0007J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u000e\u0010\u001a\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0006J\b\u0010\u001b\u001a\u00020\u0006H\u0016J\b\u0010\u001c\u001a\u0004\u0018\u00010\u0014J\u001c\u0010\u001d\u001a\u00020\r2\n\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0006H\u0016J\u001c\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0006H\u0016J\u000e\u0010$\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006Rt\u0010\u0004\u001a\\\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/blackhub/bronline/game/gui/notification/adapters/NotificationNewStyleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/notification/adapters/NotificationNewStyleAdapter$ViewHolder;", "()V", "notificationClickListener", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "type", "id", "subId", "pos", "", "getNotificationClickListener", "()Lkotlin/jvm/functions/Function4;", "setNotificationClickListener", "(Lkotlin/jvm/functions/Function4;)V", "notificationList", "", "Lcom/blackhub/bronline/game/gui/notification/data/NotificationObj;", "addNewNotification", "newNotification", "clearAllNotifications", "clearTimer", "notificationPos", "closeNotificationById", "getItemCount", "getNotActiveNotification", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeItemByPos", "ViewHolder", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationNewStyleAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;
    public Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> notificationClickListener;

    @NotNull
    public final List<NotificationObj> notificationList = new ArrayList();

    @NotNull
    public final Function4<Integer, Integer, Integer, Integer, Unit> getNotificationClickListener() {
        Function4 function4 = this.notificationClickListener;
        if (function4 != null) {
            return function4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("notificationClickListener");
        return null;
    }

    public final void setNotificationClickListener(@NotNull Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> function4) {
        Intrinsics.checkNotNullParameter(function4, "<set-?>");
        this.notificationClickListener = function4;
    }

    /* compiled from: NotificationNewStyleAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/blackhub/bronline/game/gui/notification/adapters/NotificationNewStyleAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/ItemNewNotificationBinding;", "(Lcom/blackhub/bronline/game/gui/notification/adapters/NotificationNewStyleAdapter;Lcom/blackhub/bronline/databinding/ItemNewNotificationBinding;)V", "bind", "", "notification", "Lcom/blackhub/bronline/game/gui/notification/data/NotificationObj;", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final ItemNewNotificationBinding binding;
        public final /* synthetic */ NotificationNewStyleAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull NotificationNewStyleAdapter notificationNewStyleAdapter, ItemNewNotificationBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = notificationNewStyleAdapter;
            this.binding = binding;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.gui.notification.adapters.NotificationNewStyleAdapter$ViewHolder$$ExternalSyntheticLambda0.<init>(com.blackhub.bronline.game.gui.notification.adapters.NotificationNewStyleAdapter, com.blackhub.bronline.game.gui.notification.data.NotificationObj):void, class status: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:290)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
            	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:193)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
            */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0155  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void bind(@org.jetbrains.annotations.NotNull com.blackhub.bronline.game.gui.notification.data.NotificationObj r19) {
            /*
                Method dump skipped, instructions count: 386
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.notification.adapters.NotificationNewStyleAdapter.ViewHolder.bind(com.blackhub.bronline.game.gui.notification.data.NotificationObj):void");
        }

        public static final void bind$lambda$7$lambda$4$lambda$3(NotificationNewStyleAdapter this$0, NotificationObj notification, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(notification, "$notification");
            this$0.getNotificationClickListener().invoke(1, Integer.valueOf(notification.getNotificationId()), Integer.valueOf(notification.getSubId()), Integer.valueOf(CollectionsKt__CollectionsKt.getLastIndex(this$0.notificationList)));
        }

        public static final void bind$lambda$7$lambda$5(NotificationNewStyleAdapter this$0, NotificationObj notification, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(notification, "$notification");
            this$0.getNotificationClickListener().invoke(0, Integer.valueOf(notification.getNotificationId()), Integer.valueOf(notification.getSubId()), Integer.valueOf(CollectionsKt__CollectionsKt.getLastIndex(this$0.notificationList)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemNewNotificationBinding inflate = ItemNewNotificationBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new ViewHolder(this, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSizeInv() {
        return this.notificationList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.notificationList.get(position));
    }

    public final void addNewNotification(@Nullable NotificationObj newNotification) {
        if (newNotification == null || newNotification.getType() == 6) {
            return;
        }
        this.notificationList.add(0, newNotification);
        notifyItemInserted(0);
    }

    @Nullable
    public final NotificationObj getNotActiveNotification() {
        if (this.notificationList.size() == 2) {
            return (NotificationObj) CollectionsKt___CollectionsKt.firstOrNull((List) this.notificationList);
        }
        return null;
    }

    public final void closeNotificationById(int id) {
        for (int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this.notificationList); -1 < lastIndex; lastIndex--) {
            NotificationObj notificationObj = this.notificationList.get(lastIndex);
            if (notificationObj.getSubId() == id) {
                getNotificationClickListener().invoke(2, Integer.valueOf(notificationObj.getNotificationId()), Integer.valueOf(notificationObj.getSubId()), Integer.valueOf(lastIndex));
                return;
            }
        }
    }

    public final void removeItemByPos(int pos) {
        CountDownTimer timer;
        if (pos > -1 && pos < this.notificationList.size()) {
            NotificationObj notificationObj = (NotificationObj) CollectionsKt___CollectionsKt.getOrNull(this.notificationList, pos);
            if (notificationObj != null && (timer = notificationObj.getTimer()) != null) {
                timer.cancel();
            }
            this.notificationList.remove(pos);
            notifyItemRemoved(pos);
        } else {
            getNotificationClickListener().invoke(999, -1, -1, Integer.valueOf(pos));
        }
        if (this.notificationList.size() <= 0 || pos == 0) {
            return;
        }
        notifyItemChanged(0);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void clearAllNotifications() {
        if (this.notificationList.size() == 2) {
            clearTimer(1);
        } else {
            clearTimer(0);
        }
        this.notificationList.clear();
        notifyDataSetChanged();
    }

    public final void clearTimer(int notificationPos) {
        NotificationObj notificationObj = (NotificationObj) CollectionsKt___CollectionsKt.getOrNull(this.notificationList, notificationPos);
        if (notificationObj != null) {
            CountDownTimer timer = notificationObj.getTimer();
            if (timer != null) {
                timer.cancel();
            }
            notificationObj.setTimer(null);
        }
    }
}
