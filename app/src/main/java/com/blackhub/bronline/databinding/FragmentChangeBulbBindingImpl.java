package com.blackhub.bronline.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.gui.electric.state.ChangeBulbUiState;
import com.blackhub.bronline.game.gui.electric.view.CircleView;
import com.blackhub.bronline.game.gui.electric.viewmodel.ChangeBulbViewModel;
import com.blackhub.bronline.generated.callback.OnClickListener;
import kotlinx.coroutines.flow.StateFlow;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public class FragmentChangeBulbBindingImpl extends FragmentChangeBulbBinding implements OnClickListener.Listener {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    public static final SparseIntArray sViewsWithIds;

    @Nullable
    public final View.OnClickListener mCallback18;

    @Nullable
    public final View.OnClickListener mCallback19;

    @Nullable
    public final View.OnClickListener mCallback20;
    public long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.tvChangeBulbTitle, 11);
        sparseIntArray.put(R.id.tvChangeBulbHelp, 12);
        sparseIntArray.put(R.id.blockChangeBulbRight, 13);
        sparseIntArray.put(R.id.cvChangeBulbGlassBig, 14);
        sparseIntArray.put(R.id.cvChangeBulbGlassSmall, 15);
        sparseIntArray.put(R.id.ivChangeBulbLeg, 16);
        sparseIntArray.put(R.id.ivChangeBulbNeck, 17);
    }

    public FragmentChangeBulbBindingImpl(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }

    public FragmentChangeBulbBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (FrameLayout) bindings[6], (FrameLayout) bindings[1], (LinearLayout) bindings[7], (View) bindings[13], (ImageButton) bindings[5], (ImageButton) bindings[8], (TextView) bindings[9], (ConstraintLayout) bindings[0], (CircleView) bindings[14], (CircleView) bindings[15], (Group) bindings[10], (AppCompatImageView) bindings[3], (AppCompatImageView) bindings[4], (AppCompatImageView) bindings[2], (AppCompatImageView) bindings[16], (AppCompatImageView) bindings[17], (TextView) bindings[12], (TextView) bindings[11]);
        this.mDirtyFlags = -1L;
        this.blockChangeBulbDark.setTag(null);
        this.blockChangeBulbElementOne.setTag(null);
        this.blockChangeBulbHint.setTag(null);
        this.btnChangeBulbHint.setTag(null);
        this.btnChangeBulbHintClose.setTag(null);
        this.btnChangeBulbHintDesc.setTag(null);
        this.constraintLayout.setTag(null);
        this.groupChangeBulb.setTag(null);
        this.ivChangeBulbBulbBroke.setTag(null);
        this.ivChangeBulbBulbFull.setTag(null);
        this.ivChangeBulbElementOne.setTag(null);
        setRootTag(root);
        this.mCallback19 = new OnClickListener(this, 2);
        this.mCallback20 = new OnClickListener(this, 3);
        this.mCallback18 = new OnClickListener(this, 1);
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
        setVm((ChangeBulbViewModel) variable);
        return true;
    }

    @Override // com.blackhub.bronline.databinding.FragmentChangeBulbBinding
    public void setVm(@Nullable ChangeBulbViewModel Vm) {
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

    public final boolean onChangeVmUiState(StateFlow<ChangeBulbUiState> VmUiState, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void executeBindings() {
        /*
            r13 = this;
            monitor-enter(r13)
            long r0 = r13.mDirtyFlags     // Catch: java.lang.Throwable -> Laf
            r2 = 0
            r13.mDirtyFlags = r2     // Catch: java.lang.Throwable -> Laf
            monitor-exit(r13)     // Catch: java.lang.Throwable -> Laf
            com.blackhub.bronline.game.gui.electric.viewmodel.ChangeBulbViewModel r4 = r13.mVm
            r5 = 7
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L47
            if (r4 == 0) goto L1a
            kotlinx.coroutines.flow.StateFlow r4 = r4.getUiState()
            goto L1b
        L1a:
            r4 = r7
        L1b:
            androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(r13, r6, r4)
            if (r4 == 0) goto L27
            java.lang.Object r4 = r4.getValue()
            com.blackhub.bronline.game.gui.electric.state.ChangeBulbUiState r4 = (com.blackhub.bronline.game.gui.electric.state.ChangeBulbUiState) r4
            goto L28
        L27:
            r4 = r7
        L28:
            if (r4 == 0) goto L47
            boolean r6 = r4.isHintShow()
            boolean r8 = r4.isBulbBrokeVisible()
            java.lang.String r9 = r4.getHintText()
            boolean r10 = r4.isBulbFullVisible()
            float r11 = r4.getElevationHint()
            boolean r12 = r4.isHintBtnCloseVisible()
            float r4 = r4.getElevationBulbFull()
            goto L4d
        L47:
            r11 = 0
            r8 = r6
            r10 = r8
            r12 = r10
            r9 = r7
            r4 = r11
        L4d:
            if (r5 == 0) goto L81
            android.widget.FrameLayout r5 = r13.blockChangeBulbDark
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setVisible(r5, r6)
            android.widget.FrameLayout r5 = r13.blockChangeBulbElementOne
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setElevation(r5, r4)
            android.widget.LinearLayout r5 = r13.blockChangeBulbHint
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setVisible(r5, r6)
            android.widget.ImageButton r5 = r13.btnChangeBulbHintClose
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setVisible(r5, r12)
            android.widget.TextView r5 = r13.btnChangeBulbHintDesc
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setTextHtml(r5, r9)
            androidx.constraintlayout.widget.Group r5 = r13.groupChangeBulb
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setElevation(r5, r11)
            androidx.appcompat.widget.AppCompatImageView r5 = r13.ivChangeBulbBulbBroke
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setVisible(r5, r8)
            androidx.appcompat.widget.AppCompatImageView r5 = r13.ivChangeBulbBulbFull
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setElevation(r5, r4)
            androidx.appcompat.widget.AppCompatImageView r5 = r13.ivChangeBulbBulbFull
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setVisible(r5, r10)
            androidx.appcompat.widget.AppCompatImageView r5 = r13.ivChangeBulbElementOne
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setElevation(r5, r4)
        L81:
            r4 = 4
            long r0 = r0 & r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lae
            int r0 = androidx.databinding.ViewDataBinding.getBuildSdkInt()
            r1 = 4
            if (r0 < r1) goto L99
            android.widget.ImageButton r0 = r13.btnChangeBulbHint
            r0.setContentDescription(r7)
            android.widget.ImageButton r0 = r13.btnChangeBulbHintClose
            r0.setContentDescription(r7)
        L99:
            android.widget.ImageButton r0 = r13.btnChangeBulbHint
            android.view.View$OnClickListener r1 = r13.mCallback19
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(r0, r1, r7)
            android.widget.ImageButton r0 = r13.btnChangeBulbHintClose
            android.view.View$OnClickListener r1 = r13.mCallback20
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(r0, r1, r7)
            androidx.appcompat.widget.AppCompatImageView r0 = r13.ivChangeBulbBulbBroke
            android.view.View$OnClickListener r1 = r13.mCallback18
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setOnClickListener(r0, r1, r7)
        Lae:
            return
        Laf:
            r0 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> Laf
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.databinding.FragmentChangeBulbBindingImpl.executeBindings():void");
    }

    @Override // com.blackhub.bronline.generated.callback.OnClickListener.Listener
    public final void _internalCallbackOnClick(int sourceId, View callbackArg_0) {
        ChangeBulbViewModel changeBulbViewModel;
        if (sourceId == 1) {
            ChangeBulbViewModel changeBulbViewModel2 = this.mVm;
            if (changeBulbViewModel2 != null) {
                changeBulbViewModel2.setBulbBrokeInvisible();
                return;
            }
            return;
        }
        if (sourceId != 2) {
            if (sourceId == 3 && (changeBulbViewModel = this.mVm) != null) {
                changeBulbViewModel.closeHint();
                return;
            }
            return;
        }
        ChangeBulbViewModel changeBulbViewModel3 = this.mVm;
        if (changeBulbViewModel3 != null) {
            changeBulbViewModel3.showHint();
        }
    }
}
