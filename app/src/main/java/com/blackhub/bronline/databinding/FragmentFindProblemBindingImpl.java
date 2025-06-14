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
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBindingKtx;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.utils.ViewDataBindingAdaptersKt;
import com.blackhub.bronline.game.gui.electric.state.FindProblemUiState;
import com.blackhub.bronline.game.gui.electric.view.FindProblemView;
import com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel;
import com.blackhub.bronline.generated.callback.OnClickListener;
import kotlinx.coroutines.flow.StateFlow;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public class FragmentFindProblemBindingImpl extends FragmentFindProblemBinding implements OnClickListener.Listener {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    public static final SparseIntArray sViewsWithIds;

    @Nullable
    public final View.OnClickListener mCallback21;

    @Nullable
    public final View.OnClickListener mCallback22;

    @Nullable
    public final View.OnClickListener mCallback23;

    @Nullable
    public final View.OnClickListener mCallback24;

    @Nullable
    public final View.OnClickListener mCallback25;

    @Nullable
    public final View.OnClickListener mCallback26;

    @Nullable
    public final View.OnClickListener mCallback27;

    @Nullable
    public final View.OnClickListener mCallback28;

    @Nullable
    public final View.OnClickListener mCallback29;

    @Nullable
    public final View.OnClickListener mCallback30;

    @Nullable
    public final View.OnClickListener mCallback31;
    public long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.tvFindProblemTitle, 38);
        sparseIntArray.put(R.id.tvFindProblemHelp, 39);
        sparseIntArray.put(R.id.blockFindProblemLeft, 40);
        sparseIntArray.put(R.id.blockFindProblemCustomView, 41);
        sparseIntArray.put(R.id.cvFindProblemView, 42);
        sparseIntArray.put(R.id.tvFindProblemTargetOhm, 43);
        sparseIntArray.put(R.id.blockFindProblemRight, 44);
        sparseIntArray.put(R.id.blockFindProblemElementOne, 45);
        sparseIntArray.put(R.id.ivFindProblemElementTwoFour, 46);
        sparseIntArray.put(R.id.ivFindProblemElementTwoThree, 47);
        sparseIntArray.put(R.id.ivFindProblemElementTwoTwo, 48);
        sparseIntArray.put(R.id.ivFindProblemElementTwoOne, 49);
        sparseIntArray.put(R.id.ivFindProblemMultimeter, 50);
    }

    public FragmentFindProblemBindingImpl(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 51, sIncludes, sViewsWithIds));
    }

    public FragmentFindProblemBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (FrameLayout) bindings[41], (FrameLayout) bindings[32], (FrameLayout) bindings[45], (FrameLayout) bindings[22], (FrameLayout) bindings[20], (LinearLayout) bindings[33], (View) bindings[40], (FrameLayout) bindings[26], (FrameLayout) bindings[28], (View) bindings[44], (FrameLayout) bindings[18], (ImageButton) bindings[31], (ImageButton) bindings[34], (TextView) bindings[35], (AppCompatButton) bindings[30], (FindProblemView) bindings[42], (Group) bindings[36], (AppCompatImageView) bindings[19], (AppCompatImageView) bindings[23], (AppCompatImageView) bindings[46], (AppCompatImageView) bindings[49], (AppCompatImageView) bindings[21], (AppCompatImageView) bindings[47], (AppCompatImageView) bindings[48], (ImageView) bindings[15], (ImageView) bindings[6], (ImageView) bindings[12], (ImageView) bindings[9], (ImageView) bindings[16], (ImageView) bindings[7], (ImageView) bindings[13], (ImageView) bindings[10], (ImageView) bindings[17], (ImageView) bindings[8], (ImageView) bindings[14], (ImageView) bindings[11], (ImageView) bindings[37], (AppCompatImageView) bindings[50], (AppCompatImageView) bindings[24], (AppCompatImageView) bindings[27], (AppCompatImageView) bindings[29], (ImageView) bindings[1], (ImageView) bindings[5], (ImageView) bindings[2], (ImageView) bindings[4], (ImageView) bindings[3], (ConstraintLayout) bindings[0], (TextView) bindings[39], (TextView) bindings[25], (TextView) bindings[43], (TextView) bindings[38]);
        this.mDirtyFlags = -1L;
        this.blockFindProblemDark.setTag(null);
        this.blockFindProblemElementThree.setTag(null);
        this.blockFindProblemElementTwo.setTag(null);
        this.blockFindProblemHint.setTag(null);
        this.blockFindProblemProbeBlack.setTag(null);
        this.blockFindProblemProbeRed.setTag(null);
        this.blockFindProblemTargetOhm.setTag(null);
        this.btnFindProblemHint.setTag(null);
        this.btnFindProblemHintClose.setTag(null);
        this.btnFindProblemHintDesc.setTag(null);
        this.btnFindProblemNext.setTag(null);
        this.groupMultimeterFull.setTag(null);
        this.ivFindProblemElementOne.setTag(null);
        this.ivFindProblemElementThree.setTag(null);
        this.ivFindProblemElementTwoStable.setTag(null);
        this.ivFindProblemFuseBlackFour.setTag(null);
        this.ivFindProblemFuseBlackOne.setTag(null);
        this.ivFindProblemFuseBlackThree.setTag(null);
        this.ivFindProblemFuseBlackTwo.setTag(null);
        this.ivFindProblemFuseGrayFour.setTag(null);
        this.ivFindProblemFuseGrayOne.setTag(null);
        this.ivFindProblemFuseGrayThree.setTag(null);
        this.ivFindProblemFuseGrayTwo.setTag(null);
        this.ivFindProblemFuseRedFour.setTag(null);
        this.ivFindProblemFuseRedOne.setTag(null);
        this.ivFindProblemFuseRedThree.setTag(null);
        this.ivFindProblemFuseRedTwo.setTag(null);
        this.ivFindProblemHand.setTag(null);
        this.ivFindProblemMultimeterDisplay.setTag(null);
        this.ivFindProblemProbeBlack.setTag(null);
        this.ivFindProblemProbeRed.setTag(null);
        this.ivFindProblemVoltagePointBlack.setTag(null);
        this.ivFindProblemVoltagePointRedFour.setTag(null);
        this.ivFindProblemVoltagePointRedOne.setTag(null);
        this.ivFindProblemVoltagePointRedThree.setTag(null);
        this.ivFindProblemVoltagePointRedTwo.setTag(null);
        this.mlFindProblem.setTag(null);
        this.tvFindProblemMultimeterText.setTag(null);
        setRootTag(root);
        this.mCallback27 = new OnClickListener(this, 7);
        this.mCallback30 = new OnClickListener(this, 10);
        this.mCallback28 = new OnClickListener(this, 8);
        this.mCallback31 = new OnClickListener(this, 11);
        this.mCallback25 = new OnClickListener(this, 5);
        this.mCallback26 = new OnClickListener(this, 6);
        this.mCallback23 = new OnClickListener(this, 3);
        this.mCallback24 = new OnClickListener(this, 4);
        this.mCallback21 = new OnClickListener(this, 1);
        this.mCallback29 = new OnClickListener(this, 9);
        this.mCallback22 = new OnClickListener(this, 2);
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
        setVm((FindProblemViewModel) variable);
        return true;
    }

    @Override // com.blackhub.bronline.databinding.FragmentFindProblemBinding
    public void setVm(@Nullable FindProblemViewModel Vm) {
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

    private boolean onChangeVmUiState(StateFlow<FindProblemUiState> VmUiState, int fieldId) {
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
        long j2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        String str;
        String str2;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        String str3;
        String str4;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        FindProblemViewModel findProblemViewModel = this.mVm;
        long j3 = 7 & j;
        float f13 = 0.0f;
        boolean z30 = false;
        if (j3 != 0) {
            StateFlow<FindProblemUiState> uiState = findProblemViewModel != null ? findProblemViewModel.getUiState() : null;
            ViewDataBindingKtx.updateStateFlowRegistration(this, 0, uiState);
            FindProblemUiState value = uiState != null ? uiState.getValue() : null;
            if (value != null) {
                z30 = value.isFuseRedFourWithProbeVisible();
                boolean isFuseGrayThreeVisible = value.isFuseGrayThreeVisible();
                float elevationHintEight = value.getElevationHintEight();
                z20 = value.isHandViewShow();
                z21 = value.isFuseRedTwoWithProbeVisible();
                z22 = value.isFuseGrayFourVisible();
                z23 = value.isShowHintFourOrFive();
                z7 = value.isHintShow();
                z24 = value.isHintBtnCloseVisible();
                f8 = value.getElevationHintFourOrFive();
                z25 = value.isFuseGrayTwoVisible();
                z26 = value.isFuseRedOneWithProbeVisible();
                z27 = value.isMultimeterVisible();
                f5 = value.getElevationHintSeven();
                f9 = value.getElevationHintTwo();
                f10 = value.getElevationHintFour();
                z28 = value.isFuseRedThreeWithProbeVisible();
                f11 = value.getElevationHintOne();
                z29 = value.isFuseGrayOneVisible();
                str3 = value.getTextMultimeter();
                str4 = value.getHintText();
                f12 = value.getElevationHintThreeOrSeven();
                f = value.getElevationHintSix();
                z19 = isFuseGrayThreeVisible;
                f13 = elevationHintEight;
            } else {
                f = 0.0f;
                f8 = 0.0f;
                f5 = 0.0f;
                f9 = 0.0f;
                f10 = 0.0f;
                f11 = 0.0f;
                f12 = 0.0f;
                z19 = false;
                z20 = false;
                z21 = false;
                z22 = false;
                z23 = false;
                z7 = false;
                z24 = false;
                z25 = false;
                z26 = false;
                z27 = false;
                z28 = false;
                z29 = false;
                str3 = null;
                str4 = null;
            }
            boolean z31 = !z30;
            z13 = z30;
            z10 = z19;
            z17 = z20;
            z16 = z21;
            z18 = z23;
            z3 = z24;
            f3 = f8;
            z12 = z25;
            z14 = z26;
            z4 = z27;
            f7 = f9;
            f6 = f10;
            z15 = z28;
            z8 = z29;
            str2 = str3;
            f2 = f12;
            z11 = !z21;
            z6 = !z26;
            z5 = !z27;
            z9 = !z28;
            j2 = j;
            f4 = f13;
            z2 = z22;
            f13 = f11;
            str = str4;
            z = z31;
        } else {
            j2 = j;
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
            f4 = 0.0f;
            f5 = 0.0f;
            f6 = 0.0f;
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
            z7 = false;
            z8 = false;
            z9 = false;
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
            z16 = false;
            z17 = false;
            z18 = false;
            str = null;
            str2 = null;
            f7 = 0.0f;
        }
        if (j3 != 0) {
            ViewDataBindingAdaptersKt.setVisible(this.blockFindProblemDark, z7);
            ViewDataBindingAdaptersKt.setElevation(this.blockFindProblemElementThree, f13);
            ViewDataBindingAdaptersKt.setVisible(this.blockFindProblemElementThree, z5);
            ViewDataBindingAdaptersKt.setElevation(this.blockFindProblemElementTwo, f);
            ViewDataBindingAdaptersKt.setVisible(this.blockFindProblemHint, z7);
            ViewDataBindingAdaptersKt.setElevation(this.blockFindProblemProbeBlack, f7);
            ViewDataBindingAdaptersKt.setElevation(this.blockFindProblemProbeRed, f2);
            ViewDataBindingAdaptersKt.setElevation(this.blockFindProblemTargetOhm, f3);
            ViewDataBindingAdaptersKt.setVisible(this.btnFindProblemHintClose, z3);
            ViewDataBindingAdaptersKt.setTextHtml(this.btnFindProblemHintDesc, str);
            ViewDataBindingAdaptersKt.setElevation(this.btnFindProblemNext, f4);
            ViewDataBindingAdaptersKt.setVisible(this.groupMultimeterFull, z4);
            ViewDataBindingAdaptersKt.setElevation(this.ivFindProblemFuseBlackOne, f);
            ViewDataBindingAdaptersKt.setElevation(this.ivFindProblemFuseBlackTwo, f);
            ViewDataBindingAdaptersKt.setEnable(this.ivFindProblemFuseGrayFour, z);
            ViewDataBindingAdaptersKt.setVisible(this.ivFindProblemFuseGrayFour, z2);
            ViewDataBindingAdaptersKt.setElevation(this.ivFindProblemFuseGrayOne, f3);
            ViewDataBindingAdaptersKt.setEnable(this.ivFindProblemFuseGrayOne, z6);
            ViewDataBindingAdaptersKt.setVisible(this.ivFindProblemFuseGrayOne, z8);
            ViewDataBindingAdaptersKt.setEnable(this.ivFindProblemFuseGrayThree, z9);
            ViewDataBindingAdaptersKt.setVisible(this.ivFindProblemFuseGrayThree, z10);
            ViewDataBindingAdaptersKt.setEnable(this.ivFindProblemFuseGrayTwo, z11);
            ViewDataBindingAdaptersKt.setVisible(this.ivFindProblemFuseGrayTwo, z12);
            ViewDataBindingAdaptersKt.setVisible(this.ivFindProblemFuseRedFour, z13);
            ViewDataBindingAdaptersKt.setElevation(this.ivFindProblemFuseRedOne, f6);
            ViewDataBindingAdaptersKt.setVisible(this.ivFindProblemFuseRedOne, z14);
            ViewDataBindingAdaptersKt.setVisible(this.ivFindProblemFuseRedThree, z15);
            ViewDataBindingAdaptersKt.setVisible(this.ivFindProblemFuseRedTwo, z16);
            ViewDataBindingAdaptersKt.setVisible(this.ivFindProblemHand, z17);
            ViewDataBindingAdaptersKt.setElevation(this.ivFindProblemMultimeterDisplay, f3);
            ViewDataBindingAdaptersKt.setVisible(this.ivFindProblemMultimeterDisplay, z18);
            ViewDataBindingAdaptersKt.setElevation(this.ivFindProblemProbeBlack, f7);
            ViewDataBindingAdaptersKt.setElevation(this.ivFindProblemProbeRed, f2);
            ViewDataBindingAdaptersKt.setElevation(this.ivFindProblemVoltagePointBlack, f7);
            float f14 = f5;
            ViewDataBindingAdaptersKt.setElevation(this.ivFindProblemVoltagePointRedFour, f14);
            ViewDataBindingAdaptersKt.setElevation(this.ivFindProblemVoltagePointRedOne, f2);
            ViewDataBindingAdaptersKt.setElevation(this.ivFindProblemVoltagePointRedThree, f14);
            ViewDataBindingAdaptersKt.setElevation(this.ivFindProblemVoltagePointRedTwo, f14);
            TextViewBindingAdapter.setText(this.tvFindProblemMultimeterText, str2);
            ViewDataBindingAdaptersKt.setElevation(this.tvFindProblemMultimeterText, f3);
        }
        if ((j2 & 4) != 0) {
            ViewDataBindingAdaptersKt.setOnClickListener(this.blockFindProblemDark, this.mCallback30, null);
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.btnFindProblemHint, this.mCallback29, null);
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.btnFindProblemHintClose, this.mCallback31, null);
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.btnFindProblemNext, this.mCallback28, null);
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.ivFindProblemElementOne, this.mCallback25, null);
            ViewDataBindingAdaptersKt.setOnClickListener(this.ivFindProblemElementThree, this.mCallback27, null);
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.ivFindProblemElementTwoStable, this.mCallback26, null);
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.ivFindProblemFuseGrayFour, this.mCallback24, null);
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.ivFindProblemFuseGrayOne, this.mCallback21, null);
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.ivFindProblemFuseGrayThree, this.mCallback23, null);
            ViewDataBindingAdaptersKt.setOnClickListenerWithAnimate(this.ivFindProblemFuseGrayTwo, this.mCallback22, null);
            if (ViewDataBinding.getBuildSdkInt() >= 4) {
                this.btnFindProblemHint.setContentDescription(null);
                this.ivFindProblemFuseBlackFour.setContentDescription(null);
                this.ivFindProblemFuseBlackOne.setContentDescription(null);
                this.ivFindProblemFuseBlackThree.setContentDescription(null);
                this.ivFindProblemFuseBlackTwo.setContentDescription(null);
                this.ivFindProblemFuseGrayFour.setContentDescription(null);
                this.ivFindProblemFuseGrayOne.setContentDescription(null);
                this.ivFindProblemFuseGrayThree.setContentDescription(null);
                this.ivFindProblemFuseGrayTwo.setContentDescription(null);
                this.ivFindProblemFuseRedFour.setContentDescription(null);
                this.ivFindProblemFuseRedOne.setContentDescription(null);
                this.ivFindProblemFuseRedThree.setContentDescription(null);
                this.ivFindProblemFuseRedTwo.setContentDescription(null);
                this.ivFindProblemHand.setContentDescription(null);
                this.ivFindProblemVoltagePointBlack.setContentDescription(null);
                this.ivFindProblemVoltagePointRedFour.setContentDescription(null);
                this.ivFindProblemVoltagePointRedOne.setContentDescription(null);
                this.ivFindProblemVoltagePointRedThree.setContentDescription(null);
                this.ivFindProblemVoltagePointRedTwo.setContentDescription(null);
            }
        }
    }

    @Override // com.blackhub.bronline.generated.callback.OnClickListener.Listener
    public final void _internalCallbackOnClick(int sourceId, View callbackArg_0) {
        switch (sourceId) {
            case 1:
                FindProblemViewModel findProblemViewModel = this.mVm;
                if (findProblemViewModel != null) {
                    findProblemViewModel.onFuseGrayClick(1);
                    break;
                }
                break;
            case 2:
                FindProblemViewModel findProblemViewModel2 = this.mVm;
                if (findProblemViewModel2 != null) {
                    findProblemViewModel2.onFuseGrayClick(2);
                    break;
                }
                break;
            case 3:
                FindProblemViewModel findProblemViewModel3 = this.mVm;
                if (findProblemViewModel3 != null) {
                    findProblemViewModel3.onFuseGrayClick(3);
                    break;
                }
                break;
            case 4:
                FindProblemViewModel findProblemViewModel4 = this.mVm;
                if (findProblemViewModel4 != null) {
                    findProblemViewModel4.onFuseGrayClick(4);
                    break;
                }
                break;
            case 5:
                FindProblemViewModel findProblemViewModel5 = this.mVm;
                if (findProblemViewModel5 != null) {
                    findProblemViewModel5.showErrorMessageForBulb();
                    break;
                }
                break;
            case 6:
                FindProblemViewModel findProblemViewModel6 = this.mVm;
                if (findProblemViewModel6 != null) {
                    findProblemViewModel6.showErrorMessageForFuse();
                    break;
                }
                break;
            case 7:
                FindProblemViewModel findProblemViewModel7 = this.mVm;
                if (findProblemViewModel7 != null) {
                    findProblemViewModel7.changeMultimeterVisible(true);
                    break;
                }
                break;
            case 8:
                FindProblemViewModel findProblemViewModel8 = this.mVm;
                if (findProblemViewModel8 != null) {
                    findProblemViewModel8.selectNextGame();
                    break;
                }
                break;
            case 9:
                FindProblemViewModel findProblemViewModel9 = this.mVm;
                if (findProblemViewModel9 != null) {
                    findProblemViewModel9.showHint();
                    break;
                }
                break;
            case 10:
                FindProblemViewModel findProblemViewModel10 = this.mVm;
                if (findProblemViewModel10 != null) {
                    findProblemViewModel10.onDarkClick();
                    break;
                }
                break;
            case 11:
                FindProblemViewModel findProblemViewModel11 = this.mVm;
                if (findProblemViewModel11 != null) {
                    findProblemViewModel11.closeHint();
                    break;
                }
                break;
        }
    }
}
