package com.blackhub.bronline.game.gui.inventory;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.databinding.InventoryDialogValueApplyBinding;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: NewDialogForMigrateItems.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bp\u0012S\u0010\u0002\u001aO\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\nJ\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\u0017\u001a\u00020\nH\u0002J\u0012\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\b\u001a\u00020\u0004R[\u0010\u0002\u001aO\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/blackhub/bronline/game/gui/inventory/NewDialogForMigrateItems;", "", "actionListenerFromDialogApply", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "migrateValue", "action", "applyAction", "", "Lcom/blackhub/bronline/game/gui/inventory/NewActionListenerFromDialogApply;", "itemRender", "Landroidx/collection/ArrayMap;", "", "Landroid/graphics/Bitmap;", "(Lkotlin/jvm/functions/Function3;Landroidx/collection/ArrayMap;)V", "binding", "Lcom/blackhub/bronline/databinding/InventoryDialogValueApplyBinding;", "popupWindow", "Landroid/widget/PopupWindow;", "closeDialogForMigrate", "getActionsFromDialog", "initSeekBar", "setItemView", "item", "Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", "showDialogForMigrateItem", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NewDialogForMigrateItems {
    public static final int $stable = 8;

    @Nullable
    public final Function3<Integer, Integer, Integer, Unit> actionListenerFromDialogApply;

    @NotNull
    public final InventoryDialogValueApplyBinding binding;

    @NotNull
    public final ArrayMap<String, Bitmap> itemRender;

    @NotNull
    public final PopupWindow popupWindow;

    /* JADX WARN: Multi-variable type inference failed */
    public NewDialogForMigrateItems(@Nullable Function3<? super Integer, ? super Integer, ? super Integer, Unit> function3, @NotNull ArrayMap<String, Bitmap> itemRender) {
        Intrinsics.checkNotNullParameter(itemRender, "itemRender");
        this.actionListenerFromDialogApply = function3;
        this.itemRender = itemRender;
        Object systemService = JNIActivity.getContext().getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        InventoryDialogValueApplyBinding inflate = InventoryDialogValueApplyBinding.inflate((LayoutInflater) systemService);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        this.popupWindow = new PopupWindow((View) inflate.getRoot(), -1, -1, true);
    }

    public final void showDialogForMigrateItem(@Nullable InvItems item, int action) {
        setItemView(item);
        initSeekBar();
        getActionsFromDialog(action);
        this.popupWindow.showAtLocation(JNIActivity.getContext().getParentLayout(), 17, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setItemView(com.blackhub.bronline.game.gui.inventory.data.InvItems r22) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.inventory.NewDialogForMigrateItems.setItemView(com.blackhub.bronline.game.gui.inventory.data.InvItems):void");
    }

    public final void initSeekBar() {
        this.binding.dialogValueApplySeekbarWithValue.setProgress(0);
        this.binding.dialogValueApplySeekbarWithValue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.blackhub.bronline.game.gui.inventory.NewDialogForMigrateItems$initSeekBar$1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(@Nullable SeekBar p0) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(@Nullable SeekBar p0) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(@Nullable SeekBar p0, int p1, boolean p2) {
                InventoryDialogValueApplyBinding inventoryDialogValueApplyBinding;
                inventoryDialogValueApplyBinding = NewDialogForMigrateItems.this.binding;
                inventoryDialogValueApplyBinding.dialogValueApplyMinValue.setText(String.valueOf(p1 + 1));
            }
        });
    }

    public final void getActionsFromDialog(final int action) {
        final InventoryDialogValueApplyBinding inventoryDialogValueApplyBinding = this.binding;
        inventoryDialogValueApplyBinding.dialogValueApplyButtonApply.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.inventory.NewDialogForMigrateItems$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewDialogForMigrateItems.getActionsFromDialog$lambda$5$lambda$3(InventoryDialogValueApplyBinding.this, this, action, view);
            }
        });
        inventoryDialogValueApplyBinding.dialogValueApplyButtonClose.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.inventory.NewDialogForMigrateItems$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewDialogForMigrateItems.getActionsFromDialog$lambda$5$lambda$4(InventoryDialogValueApplyBinding.this, this, action, view);
            }
        });
    }

    public static final void getActionsFromDialog$lambda$5$lambda$3(InventoryDialogValueApplyBinding _binding, NewDialogForMigrateItems this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(_binding, "$_binding");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int progress = _binding.dialogValueApplySeekbarWithValue.getProgress() + 1;
        Function3<Integer, Integer, Integer, Unit> function3 = this$0.actionListenerFromDialogApply;
        if (function3 != null) {
            function3.invoke(Integer.valueOf(progress), Integer.valueOf(i), 11);
        }
    }

    public static final void getActionsFromDialog$lambda$5$lambda$4(InventoryDialogValueApplyBinding _binding, NewDialogForMigrateItems this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(_binding, "$_binding");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int progress = _binding.dialogValueApplySeekbarWithValue.getProgress() + 1;
        Function3<Integer, Integer, Integer, Unit> function3 = this$0.actionListenerFromDialogApply;
        if (function3 != null) {
            function3.invoke(Integer.valueOf(progress), Integer.valueOf(i), 10);
        }
    }

    public final void closeDialogForMigrate() {
        this.popupWindow.dismiss();
    }
}
