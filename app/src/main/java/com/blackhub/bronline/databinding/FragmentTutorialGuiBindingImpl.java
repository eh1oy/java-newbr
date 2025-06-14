package com.blackhub.bronline.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBindingKtx;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt;
import com.blackhub.bronline.game.gui.tutorialhints.TutorialUiState;
import com.blackhub.bronline.game.gui.tutorialhints.TutorialViewModel;
import kotlinx.coroutines.flow.StateFlow;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public class FragmentTutorialGuiBindingImpl extends FragmentTutorialGuiBinding {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    public static final SparseIntArray sViewsWithIds;
    public long mDirtyFlags;

    @NonNull
    public final FrameLayout mboundView1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.inTutorialHintBottom, 3);
        sparseIntArray.put(R.id.inTutorialUncleCall, 4);
        sparseIntArray.put(R.id.inTutorialHintDrivingSchool, 5);
    }

    public FragmentTutorialGuiBindingImpl(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FragmentTutorialGuiBindingImpl(androidx.databinding.DataBindingComponent r12, android.view.View r13, java.lang.Object[] r14) {
        /*
            r11 = this;
            r0 = 0
            r0 = r14[r0]
            r5 = r0
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            r0 = 2
            r0 = r14[r0]
            r6 = r0
            androidx.compose.ui.platform.ComposeView r6 = (androidx.compose.ui.platform.ComposeView) r6
            r0 = 3
            r0 = r14[r0]
            r10 = 0
            if (r0 == 0) goto L1a
            android.view.View r0 = (android.view.View) r0
            com.blackhub.bronline.databinding.HintBottomBinding r0 = com.blackhub.bronline.databinding.HintBottomBinding.bind(r0)
            r7 = r0
            goto L1b
        L1a:
            r7 = r10
        L1b:
            r0 = 5
            r0 = r14[r0]
            if (r0 == 0) goto L28
            android.view.View r0 = (android.view.View) r0
            com.blackhub.bronline.databinding.HintDrivingSchoolBinding r0 = com.blackhub.bronline.databinding.HintDrivingSchoolBinding.bind(r0)
            r8 = r0
            goto L29
        L28:
            r8 = r10
        L29:
            r0 = 4
            r0 = r14[r0]
            if (r0 == 0) goto L36
            android.view.View r0 = (android.view.View) r0
            com.blackhub.bronline.databinding.UncleCallBinding r0 = com.blackhub.bronline.databinding.UncleCallBinding.bind(r0)
            r9 = r0
            goto L37
        L36:
            r9 = r10
        L37:
            r4 = 1
            r1 = r11
            r2 = r12
            r3 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = -1
            r11.mDirtyFlags = r0
            android.widget.FrameLayout r12 = r11.constraintLayout
            r12.setTag(r10)
            androidx.compose.ui.platform.ComposeView r12 = r11.cvTutorial
            r12.setTag(r10)
            r12 = 1
            r12 = r14[r12]
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            r11.mboundView1 = r12
            r12.setTag(r10)
            r11.setRootTag(r13)
            r11.invalidateAll()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.databinding.FragmentTutorialGuiBindingImpl.<init>(androidx.databinding.DataBindingComponent, android.view.View, java.lang.Object[]):void");
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
        setVm((TutorialViewModel) variable);
        return true;
    }

    @Override // com.blackhub.bronline.databinding.FragmentTutorialGuiBinding
    public void setVm(@Nullable TutorialViewModel Vm) {
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

    private boolean onChangeVmUiState(StateFlow<TutorialUiState> VmUiState, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        boolean z;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        TutorialViewModel tutorialViewModel = this.mVm;
        long j2 = j & 7;
        if (j2 != 0) {
            StateFlow<TutorialUiState> uiState = tutorialViewModel != null ? tutorialViewModel.getUiState() : null;
            ViewDataBindingKtx.updateStateFlowRegistration(this, 0, uiState);
            TutorialUiState value = uiState != null ? uiState.getValue() : null;
            r1 = value != null ? value.isNewVersionVisible() : false;
            z = !r1;
        } else {
            z = false;
        }
        if (j2 != 0) {
            ViewDataBindingAdaptersKt.setVisible(this.cvTutorial, r1);
            ViewDataBindingAdaptersKt.setVisible(this.mboundView1, z);
        }
    }
}
