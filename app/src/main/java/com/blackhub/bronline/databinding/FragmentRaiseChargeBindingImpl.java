package com.blackhub.bronline.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.gui.electric.state.RaiseChargeUiState;
import com.blackhub.bronline.game.gui.electric.view.ProgressBarWithListener;
import com.blackhub.bronline.game.gui.electric.viewmodel.RaiseChargeViewModel;
import com.blackhub.bronline.generated.callback.OnClickListener;
import kotlinx.coroutines.flow.StateFlow;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public class FragmentRaiseChargeBindingImpl extends FragmentRaiseChargeBinding implements OnClickListener.Listener {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    public static final SparseIntArray sViewsWithIds;

    @Nullable
    public final View.OnClickListener mCallback13;

    @Nullable
    public final View.OnClickListener mCallback14;
    public long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.tv_raise_charge_help, 14);
        sparseIntArray.put(R.id.markerRaiseChargeOne, 15);
        sparseIntArray.put(R.id.ivRaiseChargeOne, 16);
        sparseIntArray.put(R.id.markerRaiseChargeTwo, 17);
        sparseIntArray.put(R.id.ivRaiseChargeTwo, 18);
        sparseIntArray.put(R.id.pb_raise_charge_three, 19);
        sparseIntArray.put(R.id.marker_raise_charge_three, 20);
        sparseIntArray.put(R.id.iv_raise_charge_three, 21);
        sparseIntArray.put(R.id.pb_raise_charge_four, 22);
        sparseIntArray.put(R.id.marker_raise_charge_four, 23);
        sparseIntArray.put(R.id.iv_raise_charge_four, 24);
        sparseIntArray.put(R.id.gl_raise_charge_one, 25);
        sparseIntArray.put(R.id.gl_raise_charge_two, 26);
        sparseIntArray.put(R.id.gl_raise_charge_three, 27);
        sparseIntArray.put(R.id.gl_raise_charge_four, 28);
        sparseIntArray.put(R.id.gl_raise_charge_five, 29);
        sparseIntArray.put(R.id.gl_raise_charge_six, 30);
        sparseIntArray.put(R.id.blockRaiseChargeHint, 31);
    }

    public FragmentRaiseChargeBindingImpl(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 32, sIncludes, sViewsWithIds));
    }

    public FragmentRaiseChargeBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (ConstraintLayout) bindings[10], (LinearLayout) bindings[31], (AppCompatButton) bindings[3], (ImageView) bindings[1], (ImageView) bindings[2], (ImageButton) bindings[9], (ImageButton) bindings[11], (TextView) bindings[12], (AppCompatButton) bindings[4], (Guideline) bindings[29], (Guideline) bindings[28], (Guideline) bindings[25], (Guideline) bindings[30], (Guideline) bindings[27], (Guideline) bindings[26], (AppCompatImageView) bindings[24], (ImageView) bindings[13], (AppCompatImageView) bindings[16], (AppCompatImageView) bindings[21], (AppCompatImageView) bindings[18], (View) bindings[23], (View) bindings[15], (View) bindings[20], (View) bindings[17], (ConstraintLayout) bindings[0], (ProgressBarWithListener) bindings[22], (ProgressBarWithListener) bindings[6], (ProgressBarWithListener) bindings[8], (ProgressBarWithListener) bindings[5], (ProgressBarWithListener) bindings[19], (ProgressBarWithListener) bindings[7], (TextView) bindings[14]);
        this.mDirtyFlags = -1L;
        this.blockRaiseChargeDark.setTag(null);
        this.btnRaiseChargeAttach.setTag(null);
        this.btnRaiseChargeAttachAnimationOne.setTag(null);
        this.btnRaiseChargeAttachAnimationTwo.setTag(null);
        this.btnRaiseChargeHint.setTag(null);
        this.btnRaiseChargeHintClose.setTag(null);
        this.btnRaiseChargeHintDesc.setTag(null);
        this.btnRaiseChargeRaise.setTag(null);
        this.ivRaiseChargeHand.setTag(null);
        this.mlRaiseCharge.setTag(null);
        this.pbRaiseChargeHintOne.setTag(null);
        this.pbRaiseChargeHintTwo.setTag(null);
        this.pbRaiseChargeOne.setTag(null);
        this.pbRaiseChargeTwo.setTag(null);
        setRootTag(root);
        this.mCallback13 = new OnClickListener(this, 1);
        this.mCallback14 = new OnClickListener(this, 2);
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
        setVm((RaiseChargeViewModel) variable);
        return true;
    }

    @Override // com.blackhub.bronline.databinding.FragmentRaiseChargeBinding
    public void setVm(@Nullable RaiseChargeViewModel Vm) {
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

    private boolean onChangeVmUiState(StateFlow<RaiseChargeUiState> VmUiState, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.databinding.FragmentRaiseChargeBindingImpl.executeBindings():void");
    }

    @Override // com.blackhub.bronline.generated.callback.OnClickListener.Listener
    public final void _internalCallbackOnClick(int sourceId, View callbackArg_0) {
        RaiseChargeViewModel raiseChargeViewModel;
        if (sourceId != 1) {
            if (sourceId == 2 && (raiseChargeViewModel = this.mVm) != null) {
                raiseChargeViewModel.closeHint();
                return;
            }
            return;
        }
        RaiseChargeViewModel raiseChargeViewModel2 = this.mVm;
        if (raiseChargeViewModel2 != null) {
            raiseChargeViewModel2.showHint();
        }
    }
}
