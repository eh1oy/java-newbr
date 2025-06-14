package com.blackhub.bronline.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.gui.electric.state.SumContactsUiState;
import com.blackhub.bronline.game.gui.electric.viewmodel.SumContactsViewModel;
import com.blackhub.bronline.generated.callback.OnClickListener;
import kotlinx.coroutines.flow.StateFlow;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public class FragmentSumContactsBindingImpl extends FragmentSumContactsBinding implements OnClickListener.Listener {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    public static final SparseIntArray sViewsWithIds;

    @Nullable
    public final View.OnClickListener mCallback15;

    @Nullable
    public final View.OnClickListener mCallback16;

    @Nullable
    public final View.OnClickListener mCallback17;
    public long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.tvSumContactsTitle, 16);
        sparseIntArray.put(R.id.tvSumContactsHelp, 17);
        sparseIntArray.put(R.id.blockSumContactsMain, 18);
        sparseIntArray.put(R.id.ivSumContactsPipeCurveYellow, 19);
        sparseIntArray.put(R.id.ivSumContactsPipeCurveRed, 20);
        sparseIntArray.put(R.id.ivSumContactsPipeStraightYellow, 21);
        sparseIntArray.put(R.id.iv_sum_contacts_pipe_curve_blue, 22);
        sparseIntArray.put(R.id.ivSumContactsPipeCurveRedReverse, 23);
        sparseIntArray.put(R.id.ivSumContactsPipeStraightBlue, 24);
        sparseIntArray.put(R.id.blockSumContactsRight, 25);
        sparseIntArray.put(R.id.tvSumContactsBlockRightTitle, 26);
        sparseIntArray.put(R.id.blockSumContactsBulbOne, 27);
        sparseIntArray.put(R.id.blockSumContactsBulbTwo, 28);
        sparseIntArray.put(R.id.blockSumContactsBulbThree, 29);
    }

    public FragmentSumContactsBindingImpl(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 30, sIncludes, sViewsWithIds));
    }

    public FragmentSumContactsBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (FrameLayout) bindings[27], (FrameLayout) bindings[29], (FrameLayout) bindings[28], (FrameLayout) bindings[11], (LinearLayout) bindings[12], (View) bindings[18], (View) bindings[25], (ImageButton) bindings[1], (ImageButton) bindings[13], (TextView) bindings[14], (AppCompatImageView) bindings[5], (AppCompatImageView) bindings[7], (AppCompatImageView) bindings[6], (TextView) bindings[2], (TextView) bindings[4], (TextView) bindings[3], (ImageView) bindings[15], (AppCompatImageView) bindings[22], (AppCompatImageView) bindings[20], (AppCompatImageView) bindings[23], (AppCompatImageView) bindings[19], (AppCompatImageView) bindings[24], (AppCompatImageView) bindings[21], (ConstraintLayout) bindings[0], (AppCompatTextView) bindings[26], (TextView) bindings[8], (TextView) bindings[10], (TextView) bindings[9], (TextView) bindings[17], (TextView) bindings[16]);
        this.mDirtyFlags = -1L;
        this.blockSumContactsDark.setTag(null);
        this.blockSumContactsHint.setTag(null);
        this.btnSumContactsHint.setTag(null);
        this.btnSumContactsHintClose.setTag(null);
        this.btnSumContactsHintDesc.setTag(null);
        this.ivSumContactsCircleOne.setTag(null);
        this.ivSumContactsCircleThree.setTag(null);
        this.ivSumContactsCircleTwo.setTag(null);
        this.ivSumContactsCubeOne.setTag(null);
        this.ivSumContactsCubeThree.setTag(null);
        this.ivSumContactsCubeTwo.setTag(null);
        this.ivSumContactsHand.setTag(null);
        this.mlSumContacts.setTag(null);
        this.tvSumContactsBulbOne.setTag(null);
        this.tvSumContactsBulbThree.setTag(null);
        this.tvSumContactsBulbTwo.setTag(null);
        setRootTag(root);
        this.mCallback15 = new OnClickListener(this, 1);
        this.mCallback16 = new OnClickListener(this, 2);
        this.mCallback17 = new OnClickListener(this, 3);
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
        setVm((SumContactsViewModel) variable);
        return true;
    }

    @Override // com.blackhub.bronline.databinding.FragmentSumContactsBinding
    public void setVm(@Nullable SumContactsViewModel Vm) {
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

    private boolean onChangeVmUiState(StateFlow<SumContactsUiState> VmUiState, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.databinding.FragmentSumContactsBindingImpl.executeBindings():void");
    }

    @Override // com.blackhub.bronline.generated.callback.OnClickListener.Listener
    public final void _internalCallbackOnClick(int sourceId, View callbackArg_0) {
        SumContactsViewModel sumContactsViewModel;
        if (sourceId == 1) {
            SumContactsViewModel sumContactsViewModel2 = this.mVm;
            if (sumContactsViewModel2 != null) {
                sumContactsViewModel2.showHint();
                return;
            }
            return;
        }
        if (sourceId != 2) {
            if (sourceId == 3 && (sumContactsViewModel = this.mVm) != null) {
                sumContactsViewModel.closeHint();
                return;
            }
            return;
        }
        SumContactsViewModel sumContactsViewModel3 = this.mVm;
        if (sumContactsViewModel3 != null) {
            sumContactsViewModel3.onDarkClick();
        }
    }
}
