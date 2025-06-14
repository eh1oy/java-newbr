package com.blackhub.bronline.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.gui.gasmangame.uistate.GasmanParentUIState;
import com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanParentViewModel;
import kotlinx.coroutines.flow.StateFlow;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public class FragmentGasmanGame10BindingImpl extends FragmentGasmanGame10Binding {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    public static final SparseIntArray sViewsWithIds;
    public long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.guidelineVertical16Percent, 14);
        sparseIntArray.put(R.id.guidelineVerticalFiftyPercent, 15);
        sparseIntArray.put(R.id.guidelineHorizontalSeventyPercent, 16);
        sparseIntArray.put(R.id.tvTopPlot, 17);
        sparseIntArray.put(R.id.tvMiddlePlot, 18);
        sparseIntArray.put(R.id.ivStraightPipeBotPlot, 19);
        sparseIntArray.put(R.id.ivStraightPipeBotPlot1, 20);
        sparseIntArray.put(R.id.tvBotPlot, 21);
        sparseIntArray.put(R.id.ivAnimationGas, 22);
        sparseIntArray.put(R.id.ivStartPoint, 23);
        sparseIntArray.put(R.id.ivStartArrows, 24);
        sparseIntArray.put(R.id.ivEndPoint, 25);
        sparseIntArray.put(R.id.ivEndArrows1, 26);
    }

    public FragmentGasmanGame10BindingImpl(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }

    public FragmentGasmanGame10BindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (ConstraintLayout) bindings[0], (Guideline) bindings[16], (Guideline) bindings[14], (Guideline) bindings[15], (ImageView) bindings[22], (ImageView) bindings[7], (ImageView) bindings[9], (ImageView) bindings[1], (ImageView) bindings[2], (ImageView) bindings[3], (ImageView) bindings[8], (ImageView) bindings[11], (ImageView) bindings[12], (ImageView) bindings[26], (ImageView) bindings[25], (ImageView) bindings[24], (ImageView) bindings[23], (ImageView) bindings[19], (ImageView) bindings[20], (ImageView) bindings[6], (ImageView) bindings[10], (ImageView) bindings[4], (ImageView) bindings[5], (ImageView) bindings[13], (TextView) bindings[21], (TextView) bindings[18], (TextView) bindings[17]);
        this.mDirtyFlags = -1L;
        this.containerRoot.setTag(null);
        this.ivCornerDropArea1.setTag(null);
        this.ivCornerDropArea2.setTag(null);
        this.ivCornerPipeTopPlot.setTag(null);
        this.ivCornerPipeTopPlot1.setTag(null);
        this.ivCornerPipeTopPlot2.setTag(null);
        this.ivCornerStaticPipe1.setTag(null);
        this.ivCornerStaticPipe2.setTag(null);
        this.ivCornerStaticPipe3.setTag(null);
        this.ivStraightStaticPipe1.setTag(null);
        this.ivTeePipeDropArea1.setTag(null);
        this.ivTeePipeMiddlePlot.setTag(null);
        this.ivTeePipeMiddlePlot1.setTag(null);
        this.ivTeeStaticPipe1.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.mDirtyFlags != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (2 != variableId) {
            return false;
        }
        setVm((GasmanParentViewModel) variable);
        return true;
    }

    @Override // com.blackhub.bronline.databinding.FragmentGasmanGame10Binding
    public void setVm(@Nullable GasmanParentViewModel Vm) {
        this.mVm = Vm;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return onChangeVmUiState((StateFlow) object, fieldId);
    }

    private boolean onChangeVmUiState(StateFlow<GasmanParentUIState> VmUiState, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void executeBindings() {
        /*
            r8 = this;
            monitor-enter(r8)
            long r0 = r8.mDirtyFlags     // Catch: java.lang.Throwable -> Lc7
            r2 = 0
            r8.mDirtyFlags = r2     // Catch: java.lang.Throwable -> Lc7
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lc7
            com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanParentViewModel r4 = r8.mVm
            r5 = 7
            long r0 = r0 & r5
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L40
            r2 = 0
            if (r4 == 0) goto L1a
            kotlinx.coroutines.flow.StateFlow r3 = r4.getUiState()
            goto L1b
        L1a:
            r3 = r2
        L1b:
            androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(r8, r1, r3)
            if (r3 == 0) goto L27
            java.lang.Object r3 = r3.getValue()
            com.blackhub.bronline.game.gui.gasmangame.uistate.GasmanParentUIState r3 = (com.blackhub.bronline.game.gui.gasmangame.uistate.GasmanParentUIState) r3
            goto L28
        L27:
            r3 = r2
        L28:
            if (r3 == 0) goto L2e
            com.blackhub.bronline.game.gui.gasmangame.uistate.GasmanSizesItem r2 = r3.getGasmanSizesItem()
        L2e:
            if (r2 == 0) goto L40
            int r1 = r2.getFortyFour()
            int r3 = r2.getOneHundredThirty()
            int r2 = r2.getEightyEight()
            r7 = r2
            r2 = r1
            r1 = r7
            goto L42
        L40:
            r2 = r1
            r3 = r2
        L42:
            if (r0 == 0) goto Lc6
            android.widget.ImageView r0 = r8.ivCornerDropArea1
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setHeight(r0, r1)
            android.widget.ImageView r0 = r8.ivCornerDropArea1
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setWidth(r0, r1)
            android.widget.ImageView r0 = r8.ivCornerDropArea2
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setHeight(r0, r1)
            android.widget.ImageView r0 = r8.ivCornerDropArea2
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setWidth(r0, r1)
            android.widget.ImageView r0 = r8.ivCornerPipeTopPlot
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setHeight(r0, r1)
            android.widget.ImageView r0 = r8.ivCornerPipeTopPlot
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setWidth(r0, r1)
            android.widget.ImageView r0 = r8.ivCornerPipeTopPlot1
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setHeight(r0, r1)
            android.widget.ImageView r0 = r8.ivCornerPipeTopPlot1
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setWidth(r0, r1)
            android.widget.ImageView r0 = r8.ivCornerPipeTopPlot2
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setHeight(r0, r1)
            android.widget.ImageView r0 = r8.ivCornerPipeTopPlot2
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setWidth(r0, r1)
            android.widget.ImageView r0 = r8.ivCornerStaticPipe1
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setHeight(r0, r1)
            android.widget.ImageView r0 = r8.ivCornerStaticPipe1
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setWidth(r0, r1)
            android.widget.ImageView r0 = r8.ivCornerStaticPipe2
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setHeight(r0, r1)
            android.widget.ImageView r0 = r8.ivCornerStaticPipe2
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setWidth(r0, r1)
            android.widget.ImageView r0 = r8.ivCornerStaticPipe3
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setHeight(r0, r1)
            android.widget.ImageView r0 = r8.ivCornerStaticPipe3
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setWidth(r0, r1)
            android.widget.ImageView r0 = r8.ivStraightStaticPipe1
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setHeight(r0, r3)
            android.widget.ImageView r0 = r8.ivStraightStaticPipe1
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setWidth(r0, r2)
            android.widget.ImageView r0 = r8.ivTeePipeDropArea1
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setHeight(r0, r1)
            android.widget.ImageView r0 = r8.ivTeePipeDropArea1
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setWidth(r0, r3)
            android.widget.ImageView r0 = r8.ivTeePipeMiddlePlot
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setHeight(r0, r1)
            android.widget.ImageView r0 = r8.ivTeePipeMiddlePlot
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setWidth(r0, r3)
            android.widget.ImageView r0 = r8.ivTeePipeMiddlePlot1
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setHeight(r0, r1)
            android.widget.ImageView r0 = r8.ivTeePipeMiddlePlot1
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setWidth(r0, r3)
            android.widget.ImageView r0 = r8.ivTeeStaticPipe1
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setHeight(r0, r1)
            android.widget.ImageView r0 = r8.ivTeeStaticPipe1
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setWidth(r0, r3)
        Lc6:
            return
        Lc7:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lc7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.databinding.FragmentGasmanGame10BindingImpl.executeBindings():void");
    }
}
