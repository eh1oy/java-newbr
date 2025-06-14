package com.blackhub.bronline.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.gui.electric.state.CollectSchemeUiState;
import com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel;
import com.blackhub.bronline.generated.callback.OnClickListener;
import kotlinx.coroutines.flow.StateFlow;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public class FragmentCollectSchemeBindingImpl extends FragmentCollectSchemeBinding implements OnClickListener.Listener {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    public static final SparseIntArray sViewsWithIds;

    @Nullable
    public final View.OnClickListener mCallback10;

    @Nullable
    public final View.OnClickListener mCallback7;

    @Nullable
    public final View.OnClickListener mCallback8;

    @Nullable
    public final View.OnClickListener mCallback9;
    public long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.rbCollectSchemeToggleSwitchOneOne, 12);
        sparseIntArray.put(R.id.rbCollectSchemeToggleSwitchOneTwo, 13);
        sparseIntArray.put(R.id.rbCollectSchemeToggleSwitchOneThree, 14);
        sparseIntArray.put(R.id.rbCollectSchemeToggleSwitchOneFour, 15);
        sparseIntArray.put(R.id.rbCollectSchemeToggleSwitchOneFive, 16);
        sparseIntArray.put(R.id.rbCollectSchemeToggleSwitchTwoOne, 17);
        sparseIntArray.put(R.id.rbCollectSchemeToggleSwitchTwoTwo, 18);
        sparseIntArray.put(R.id.rb_collect_scheme_toggle_switch_two_three, 19);
        sparseIntArray.put(R.id.rb_collect_scheme_toggle_switch_two_four, 20);
        sparseIntArray.put(R.id.rb_collect_scheme_toggle_switch_two_five, 21);
        sparseIntArray.put(R.id.tvCollectSchemeTitle, 22);
        sparseIntArray.put(R.id.tvCollectSchemeTitleScheme, 23);
        sparseIntArray.put(R.id.blockCollectSchemeTarget, 24);
        sparseIntArray.put(R.id.ivCollectSchemeBulbColorSchemeOneOne, 25);
        sparseIntArray.put(R.id.ivCollectSchemeBulbColorSchemeOneTwo, 26);
        sparseIntArray.put(R.id.ivCollectSchemeBulbColorSchemeOneThree, 27);
        sparseIntArray.put(R.id.ivCollectSchemeBulbColorSchemeOneFour, 28);
        sparseIntArray.put(R.id.ivCollectSchemeBulbColorSchemeOneFive, 29);
        sparseIntArray.put(R.id.ivCollectSchemeBulbColorSchemeTwoOne, 30);
        sparseIntArray.put(R.id.ivCollectSchemeBulbColorSchemeTwoTwo, 31);
        sparseIntArray.put(R.id.ivCollectSchemeBulbColorSchemeTwoThree, 32);
        sparseIntArray.put(R.id.ivCollectSchemeBulbColorSchemeTwoFour, 33);
        sparseIntArray.put(R.id.ivCollectSchemeBulbColorSchemeTwoFive, 34);
        sparseIntArray.put(R.id.blockCollectSchemeTimer, 35);
        sparseIntArray.put(R.id.ivCollectSchemeTime, 36);
        sparseIntArray.put(R.id.divCollectSchemeOne, 37);
        sparseIntArray.put(R.id.tvCollectSchemeTime, 38);
        sparseIntArray.put(R.id.blockCollectSchemeCenter, 39);
        sparseIntArray.put(R.id.guidelineCollectSchemeLeft, 40);
        sparseIntArray.put(R.id.guidelineCollectSchemeRight, 41);
    }

    public FragmentCollectSchemeBindingImpl(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 42, sIncludes, sViewsWithIds));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FragmentCollectSchemeBindingImpl(androidx.databinding.DataBindingComponent r50, android.view.View r51, java.lang.Object[] r52) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.databinding.FragmentCollectSchemeBindingImpl.<init>(androidx.databinding.DataBindingComponent, android.view.View, java.lang.Object[]):void");
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
        setVm((CollectSchemeViewModel) variable);
        return true;
    }

    @Override // com.blackhub.bronline.databinding.FragmentCollectSchemeBinding
    public void setVm(@Nullable CollectSchemeViewModel Vm) {
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

    private boolean onChangeVmUiState(StateFlow<CollectSchemeUiState> VmUiState, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void executeBindings() {
        /*
            r17 = this;
            r1 = r17
            monitor-enter(r17)
            long r2 = r1.mDirtyFlags     // Catch: java.lang.Throwable -> Ld0
            r4 = 0
            r1.mDirtyFlags = r4     // Catch: java.lang.Throwable -> Ld0
            monitor-exit(r17)     // Catch: java.lang.Throwable -> Ld0
            com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel r0 = r1.mVm
            r6 = 7
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 0
            r8 = 0
            if (r6 == 0) goto L5a
            if (r0 == 0) goto L1c
            kotlinx.coroutines.flow.StateFlow r0 = r0.getUiState()
            goto L1d
        L1c:
            r0 = r8
        L1d:
            androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(r1, r7, r0)
            if (r0 == 0) goto L29
            java.lang.Object r0 = r0.getValue()
            com.blackhub.bronline.game.gui.electric.state.CollectSchemeUiState r0 = (com.blackhub.bronline.game.gui.electric.state.CollectSchemeUiState) r0
            goto L2a
        L29:
            r0 = r8
        L2a:
            if (r0 == 0) goto L5a
            float r7 = r0.getElevationHintThree()
            float r9 = r0.getElevationHintTwo()
            float r10 = r0.getElevationHint()
            float r11 = r0.getElevationHintOne()
            boolean r12 = r0.isHandViewShow()
            boolean r13 = r0.isHintShow()
            java.lang.String r14 = r0.getHintText()
            boolean r15 = r0.isHintBtnCloseVisible()
            int r0 = r0.getResourceColorTrafficLight()
            r16 = r9
            r9 = r0
            r0 = r7
            r7 = r13
            r13 = r11
            r11 = r10
            r10 = r16
            goto L62
        L5a:
            r0 = 0
            r10 = r0
            r11 = r10
            r13 = r11
            r9 = r7
            r12 = r9
            r15 = r12
            r14 = r8
        L62:
            if (r6 == 0) goto L9b
            android.view.View r6 = r1.blockCollectSchemeDark
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setVisible(r6, r7)
            android.widget.LinearLayout r6 = r1.blockCollectSchemeHint
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setVisible(r6, r7)
            android.view.View r6 = r1.blockCollectSchemeTransparent
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setElevation(r6, r11)
            android.view.View r6 = r1.blockCollectSchemeTransparent
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setVisible(r6, r7)
            android.widget.ImageButton r6 = r1.btnCollectSchemeHintClose
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setVisible(r6, r15)
            android.widget.TextView r6 = r1.btnCollectSchemeHintDesc
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setTextHtml(r6, r14)
            androidx.constraintlayout.widget.Group r6 = r1.groupCollectSchemeHintOne
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setElevation(r6, r13)
            androidx.constraintlayout.widget.Group r6 = r1.groupCollectSchemeHintThree
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setElevation(r6, r0)
            androidx.constraintlayout.widget.Group r0 = r1.groupCollectSchemeHintTwo
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setElevation(r0, r10)
            android.widget.ImageView r0 = r1.ivCollectSchemeHand
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setVisible(r0, r12)
            androidx.appcompat.widget.AppCompatImageView r0 = r1.ivCollectSchemeTrafficLight
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setImageResource(r0, r9)
        L9b:
            r6 = 4
            long r2 = r2 & r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto Lcf
            android.view.View r0 = r1.blockCollectSchemeDark
            android.view.View$OnClickListener r2 = r1.mCallback8
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setOnClickListener(r0, r2, r8)
            android.view.View r0 = r1.blockCollectSchemeTransparent
            android.view.View$OnClickListener r2 = r1.mCallback9
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setOnClickListener(r0, r2, r8)
            android.widget.ImageButton r0 = r1.btnCollectSchemeHint
            android.view.View$OnClickListener r2 = r1.mCallback7
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(r0, r2, r8)
            android.widget.ImageButton r0 = r1.btnCollectSchemeHintClose
            android.view.View$OnClickListener r2 = r1.mCallback10
            com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(r0, r2, r8)
            int r0 = androidx.databinding.ViewDataBinding.getBuildSdkInt()
            r2 = 4
            if (r0 < r2) goto Lcf
            android.widget.ImageButton r0 = r1.btnCollectSchemeHint
            r0.setContentDescription(r8)
            android.widget.ImageView r0 = r1.ivCollectSchemeHand
            r0.setContentDescription(r8)
        Lcf:
            return
        Ld0:
            r0 = move-exception
            monitor-exit(r17)     // Catch: java.lang.Throwable -> Ld0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.databinding.FragmentCollectSchemeBindingImpl.executeBindings():void");
    }

    @Override // com.blackhub.bronline.generated.callback.OnClickListener.Listener
    public final void _internalCallbackOnClick(int sourceId, View callbackArg_0) {
        CollectSchemeViewModel collectSchemeViewModel;
        if (sourceId == 1) {
            CollectSchemeViewModel collectSchemeViewModel2 = this.mVm;
            if (collectSchemeViewModel2 != null) {
                collectSchemeViewModel2.showHint();
                return;
            }
            return;
        }
        if (sourceId == 2) {
            CollectSchemeViewModel collectSchemeViewModel3 = this.mVm;
            if (collectSchemeViewModel3 != null) {
                collectSchemeViewModel3.onBgHintClick();
                return;
            }
            return;
        }
        if (sourceId != 3) {
            if (sourceId == 4 && (collectSchemeViewModel = this.mVm) != null) {
                collectSchemeViewModel.closeHint();
                return;
            }
            return;
        }
        CollectSchemeViewModel collectSchemeViewModel4 = this.mVm;
        if (collectSchemeViewModel4 != null) {
            collectSchemeViewModel4.onBgHintClick();
        }
    }
}
