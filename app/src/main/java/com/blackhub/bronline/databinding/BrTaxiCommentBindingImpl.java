package com.blackhub.bronline.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.gui.taxi.TaxiUiState;
import com.blackhub.bronline.game.gui.taxi.TaxiViewModel;
import com.blackhub.bronline.generated.callback.OnClickListener;
import kotlinx.coroutines.flow.StateFlow;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public class BrTaxiCommentBindingImpl extends BrTaxiCommentBinding implements OnClickListener.Listener {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    public static final SparseIntArray sViewsWithIds;

    @Nullable
    public final View.OnClickListener mCallback6;
    public long mDirtyFlags;

    @NonNull
    public final FrameLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.br_taxi_comment_title, 3);
    }

    public BrTaxiCommentBindingImpl(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }

    public BrTaxiCommentBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (AppCompatButton) bindings[1], (TextView) bindings[2], (TextView) bindings[3]);
        this.mDirtyFlags = -1L;
        this.brTaxiCommentClose.setTag(null);
        this.brTaxiCommentComm.setTag(null);
        FrameLayout frameLayout = (FrameLayout) bindings[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
        setRootTag(root);
        this.mCallback6 = new OnClickListener(this, 1);
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
        if (1 != variableId) {
            return false;
        }
        setData((TaxiViewModel) variable);
        return true;
    }

    @Override // com.blackhub.bronline.databinding.BrTaxiCommentBinding
    public void setData(@Nullable TaxiViewModel Data) {
        this.mData = Data;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return onChangeDataUiState((StateFlow) object, fieldId);
    }

    public final boolean onChangeDataUiState(StateFlow<TaxiUiState> DataUiState, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void executeBindings() {
        /*
            r9 = this;
            monitor-enter(r9)
            long r0 = r9.mDirtyFlags     // Catch: java.lang.Throwable -> L46
            r2 = 0
            r9.mDirtyFlags = r2     // Catch: java.lang.Throwable -> L46
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L46
            com.blackhub.bronline.game.gui.taxi.TaxiViewModel r4 = r9.mData
            r5 = 7
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 0
            if (r5 == 0) goto L2f
            if (r4 == 0) goto L19
            kotlinx.coroutines.flow.StateFlow r4 = r4.getUiState()
            goto L1a
        L19:
            r4 = r6
        L1a:
            r7 = 0
            androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(r9, r7, r4)
            if (r4 == 0) goto L27
            java.lang.Object r4 = r4.getValue()
            com.blackhub.bronline.game.gui.taxi.TaxiUiState r4 = (com.blackhub.bronline.game.gui.taxi.TaxiUiState) r4
            goto L28
        L27:
            r4 = r6
        L28:
            if (r4 == 0) goto L2f
            java.lang.String r4 = r4.getComment()
            goto L30
        L2f:
            r4 = r6
        L30:
            r7 = 4
            long r0 = r0 & r7
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L3e
            androidx.appcompat.widget.AppCompatButton r0 = r9.brTaxiCommentClose
            android.view.View$OnClickListener r1 = r9.mCallback6
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(r0, r1, r6)
        L3e:
            if (r5 == 0) goto L45
            android.widget.TextView r0 = r9.brTaxiCommentComm
            r0.setText(r4)
        L45:
            return
        L46:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L46
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.databinding.BrTaxiCommentBindingImpl.executeBindings():void");
    }

    @Override // com.blackhub.bronline.generated.callback.OnClickListener.Listener
    public final void _internalCallbackOnClick(int sourceId, View callbackArg_0) {
        TaxiViewModel taxiViewModel = this.mData;
        if (taxiViewModel != null) {
            taxiViewModel.setCommentVisible(false);
        }
    }
}
