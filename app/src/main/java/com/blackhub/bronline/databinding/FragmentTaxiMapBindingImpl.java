package com.blackhub.bronline.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.gui.taximap.TaxiMapUiState;
import com.blackhub.bronline.game.gui.taximap.TaxiMapViewModel;
import com.blackhub.bronline.generated.callback.OnClickListener;
import kotlinx.coroutines.flow.StateFlow;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public class FragmentTaxiMapBindingImpl extends FragmentTaxiMapBinding implements OnClickListener.Listener {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    public static final SparseIntArray sViewsWithIds;

    @Nullable
    public final View.OnClickListener mCallback11;

    @Nullable
    public final View.OnClickListener mCallback12;
    public long mDirtyFlags;

    @NonNull
    public final FrameLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.br_taxi_map_map, 3);
        sparseIntArray.put(R.id.br_taxi_map_dest, 4);
    }

    public FragmentTaxiMapBindingImpl(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }

    public FragmentTaxiMapBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (ImageView) bindings[4], (Button) bindings[2], (RelativeLayout) bindings[3], (Button) bindings[1]);
        this.mDirtyFlags = -1L;
        this.brTaxiMapExit.setTag(null);
        this.brTaxiMapSelect.setTag(null);
        FrameLayout frameLayout = (FrameLayout) bindings[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
        setRootTag(root);
        this.mCallback12 = new OnClickListener(this, 2);
        this.mCallback11 = new OnClickListener(this, 1);
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
        setVm((TaxiMapViewModel) variable);
        return true;
    }

    @Override // com.blackhub.bronline.databinding.FragmentTaxiMapBinding
    public void setVm(@Nullable TaxiMapViewModel Vm) {
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

    private boolean onChangeVmUiState(StateFlow<TaxiMapUiState> VmUiState, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void executeBindings() {
        /*
            r11 = this;
            monitor-enter(r11)
            long r0 = r11.mDirtyFlags     // Catch: java.lang.Throwable -> L61
            r2 = 0
            r11.mDirtyFlags = r2     // Catch: java.lang.Throwable -> L61
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L61
            com.blackhub.bronline.game.gui.taximap.TaxiMapViewModel r4 = r11.mVm
            r5 = 7
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L33
            if (r4 == 0) goto L1a
            kotlinx.coroutines.flow.StateFlow r4 = r4.getUiState()
            goto L1b
        L1a:
            r4 = r7
        L1b:
            androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(r11, r6, r4)
            if (r4 == 0) goto L27
            java.lang.Object r4 = r4.getValue()
            com.blackhub.bronline.game.gui.taximap.TaxiMapUiState r4 = (com.blackhub.bronline.game.gui.taximap.TaxiMapUiState) r4
            goto L28
        L27:
            r4 = r7
        L28:
            if (r4 == 0) goto L33
            float r6 = r4.getButtonAlpha()
            boolean r4 = r4.isButtonEnabled()
            goto L37
        L33:
            r4 = 0
            r10 = r6
            r6 = r4
            r4 = r10
        L37:
            r8 = 4
            long r0 = r0 & r8
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L4c
            android.widget.Button r0 = r11.brTaxiMapExit
            android.view.View$OnClickListener r1 = r11.mCallback12
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(r0, r1, r7)
            android.widget.Button r0 = r11.brTaxiMapSelect
            android.view.View$OnClickListener r1 = r11.mCallback11
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(r0, r1, r7)
        L4c:
            if (r5 == 0) goto L60
            int r0 = androidx.databinding.ViewDataBinding.getBuildSdkInt()
            r1 = 11
            if (r0 < r1) goto L5b
            android.widget.Button r0 = r11.brTaxiMapSelect
            r0.setAlpha(r6)
        L5b:
            android.widget.Button r0 = r11.brTaxiMapSelect
            r0.setEnabled(r4)
        L60:
            return
        L61:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L61
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.databinding.FragmentTaxiMapBindingImpl.executeBindings():void");
    }

    @Override // com.blackhub.bronline.generated.callback.OnClickListener.Listener
    public final void _internalCallbackOnClick(int sourceId, View callbackArg_0) {
        StateFlow<TaxiMapUiState> uiState;
        TaxiMapUiState value;
        TaxiMapViewModel taxiMapViewModel;
        if (sourceId != 1) {
            if (sourceId == 2 && (taxiMapViewModel = this.mVm) != null) {
                taxiMapViewModel.sendCloseScreen();
                return;
            }
            return;
        }
        TaxiMapViewModel taxiMapViewModel2 = this.mVm;
        if (taxiMapViewModel2 == null || (uiState = taxiMapViewModel2.getUiState()) == null || (value = uiState.getValue()) == null) {
            return;
        }
        taxiMapViewModel2.sendCoordinates(value.getCoordinateX(), value.getCoordinateY());
    }
}
