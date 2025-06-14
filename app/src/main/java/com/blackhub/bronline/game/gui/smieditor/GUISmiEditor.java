package com.blackhub.bronline.game.gui.smieditor;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.SmiDialogBinding;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.smieditor.adapters.SmiEditorAdapter;
import com.blackhub.bronline.game.gui.smieditor.adapters.SmiEditorCarsAndAccessoriesAdapter;
import com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj;
import com.blackhub.bronline.game.gui.smieditor.data.SmiInfo;
import com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUISmiEditor.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J$\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u0001072\u0010\u00108\u001a\f\u0012\u0006\b\u0001\u0012\u00020:\u0018\u000109H\u0002J\b\u0010;\u001a\u000205H\u0002J\u0010\u0010<\u001a\u0002052\u0006\u0010=\u001a\u00020'H\u0002J\u0010\u0010>\u001a\u0002052\u0006\u0010?\u001a\u00020\u0007H\u0002J\b\u0010@\u001a\u000205H\u0002J\b\u0010A\u001a\u000205H\u0002J\b\u0010B\u001a\u000205H\u0002J\b\u0010C\u001a\u000205H\u0002J\b\u0010D\u001a\u00020'H\u0016J\b\u0010E\u001a\u00020\u0002H\u0016J\b\u0010F\u001a\u000205H\u0002J\b\u0010G\u001a\u000205H\u0002J\b\u0010H\u001a\u000205H\u0002J\b\u0010I\u001a\u000205H\u0002J\u0016\u0010J\u001a\u0002052\f\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u0010H\u0002J\b\u0010M\u001a\u000205H\u0002J\b\u0010N\u001a\u000205H\u0002J\u0016\u0010O\u001a\u0002052\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\u0016\u0010P\u001a\u0002052\f\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u0010H\u0002J\b\u0010Q\u001a\u000205H\u0016J\b\u0010R\u001a\u000205H\u0016J\u0010\u0010S\u001a\u0002052\u0006\u0010T\u001a\u00020UH\u0016J\b\u0010V\u001a\u000205H\u0016J\u0012\u0010W\u001a\u0002052\b\u0010X\u001a\u0004\u0018\u00010YH\u0016J\b\u0010Z\u001a\u000205H\u0002J\b\u0010[\u001a\u000205H\u0002J\b\u0010\\\u001a\u000205H\u0002J\b\u0010]\u001a\u000205H\u0002J\u0018\u0010^\u001a\u0002052\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020\u0014H\u0002J\u0010\u0010b\u001a\u0002052\u0006\u0010c\u001a\u00020\u0014H\u0002J\u0010\u0010d\u001a\u0002052\u0006\u0010c\u001a\u00020\u0014H\u0002J\u0010\u0010e\u001a\u0002052\u0006\u0010f\u001a\u00020'H\u0002J\u0010\u0010g\u001a\u0002052\u0006\u0010h\u001a\u00020'H\u0002J\u0010\u0010i\u001a\u0002052\u0006\u0010h\u001a\u00020'H\u0002J\u0016\u0010j\u001a\u0002052\f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00140lH\u0002J\b\u0010m\u001a\u000205H\u0002J\b\u0010n\u001a\u000205H\u0002J\u0010\u0010o\u001a\u0002052\u0006\u0010p\u001a\u00020qH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u000e\u0010#\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001dR\u001b\u0010-\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b.\u0010/R\u000e\u00101\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006r"}, d2 = {"Lcom/blackhub/bronline/game/gui/smieditor/GUISmiEditor;", "Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragment;", "Lcom/blackhub/bronline/databinding/SmiDialogBinding;", "()V", "carOrAccessoriesAdapter", "Lcom/blackhub/bronline/game/gui/smieditor/adapters/SmiEditorCarsAndAccessoriesAdapter;", "changeTextForAdIfCarOrAccessories", "", "clickListenerCarOrAccessories", "Lcom/blackhub/bronline/game/gui/smieditor/adapters/SmiEditorCarsAndAccessoriesAdapter$OnUserClickCarsAndAccessories;", "clickListenerFirst", "Lcom/blackhub/bronline/game/gui/smieditor/adapters/SmiEditorAdapter$OnUserClickListenerSmiEditor;", "emptyAdapter", "Lcom/blackhub/bronline/game/gui/smieditor/adapters/SmiEditorAdapter;", "firstAdapter", "firstColumn", "", "Lcom/blackhub/bronline/game/gui/smieditor/data/SmiEditorBodyObj;", "fourthAdapter", "getStartTextAd", "", "ifUnlockFromSwitch", "isShowStartAd", "mainActivityFactory", "Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "getMainActivityFactory", "()Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "setMainActivityFactory", "(Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;)V", "mainActivityViewModel", "getMainActivityViewModel", "()Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "mainActivityViewModel$delegate", "Lkotlin/Lazy;", "myCustomFinalTextForAd", "myCustomTextFromEditTextForAd", "myCustomTextFromSwitchForAd", "oldColumn", "", "secondAdapter", "smiEditorFactory", "Lcom/blackhub/bronline/game/gui/smieditor/viewmodel/SmiEditorViewModel;", "getSmiEditorFactory", "setSmiEditorFactory", "smiEditorViewModel", "getSmiEditorViewModel", "()Lcom/blackhub/bronline/game/gui/smieditor/viewmodel/SmiEditorViewModel;", "smiEditorViewModel$delegate", "statusForCustomPrice", "thirdAdapter", "valueOfPrice", "attachAdapterToView", "", "currentRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "currentAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "backFromFourthToThirdColumn", "changeParamForFirstColumn", "currentPos", "changeViewAds", "ifStartText", "clearEditTexts", "clearInterfaceAfterGettingNewStartText", "clearSecondAndThirdAndFourthColumns", "clearThirdAndFourthColumns", "getGuiId", "getViewBinding", "initAdapters", "initClickListenerCarOrAccessories", "initClickListenerFirst", "initFirstColumn", "initFourthColumn", "data", "", "initInterface", "initListeners", "initSecondColumn", "initThirdColumn", "initViewsISAMPGUI", "newBackPress", "onAttach", "context", "Landroid/content/Context;", "onDestroyView", "onPacketIncoming", "json", "Lorg/json/JSONObject;", "sendTextToServer", "setInitProperty", "setNullableParameters", "setObservers", "setTextInView", "title", "", "textForAd", "setTitleForSecondColumn", "currentTitle", "setTitleForThirdColumn", "setValueQueueInView", "valueOfQueue", "setVisibleButtonBackToThirdColumn", "isVisible", "setVisibleForBlockWithCustomPrice", "transformCollectionWithTextToStringForAd", "currentCollection", "", "unlockButtonApply", "updateFinalPhraseWithPrice", "updateStatusForButtonApply", "newStatus", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGUISmiEditor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUISmiEditor.kt\ncom/blackhub/bronline/game/gui/smieditor/GUISmiEditor\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,626:1\n172#2,9:627\n106#2,15:636\n*S KotlinDebug\n*F\n+ 1 GUISmiEditor.kt\ncom/blackhub/bronline/game/gui/smieditor/GUISmiEditor\n*L\n58#1:627,9\n63#1:636,15\n*E\n"})
/* loaded from: classes3.dex */
public final class GUISmiEditor extends BaseISAMPGUIFragment<SmiDialogBinding> {
    public static final int $stable = 8;

    @Nullable
    public SmiEditorCarsAndAccessoriesAdapter carOrAccessoriesAdapter;
    public boolean changeTextForAdIfCarOrAccessories;

    @Nullable
    public SmiEditorCarsAndAccessoriesAdapter.OnUserClickCarsAndAccessories clickListenerCarOrAccessories;

    @Nullable
    public SmiEditorAdapter.OnUserClickListenerSmiEditor clickListenerFirst;

    @Nullable
    public SmiEditorAdapter emptyAdapter;

    @Nullable
    public SmiEditorAdapter firstAdapter;

    @NotNull
    public final List<SmiEditorBodyObj> firstColumn;

    @Nullable
    public SmiEditorAdapter fourthAdapter;

    @NotNull
    public String getStartTextAd;
    public boolean ifUnlockFromSwitch;
    public boolean isShowStartAd;

    @Inject
    public MainViewModelFactory<JNIActivityViewModel> mainActivityFactory;

    /* renamed from: mainActivityViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainActivityViewModel;

    @NotNull
    public String myCustomFinalTextForAd;

    @NotNull
    public String myCustomTextFromEditTextForAd;

    @NotNull
    public String myCustomTextFromSwitchForAd;
    public int oldColumn;

    @Nullable
    public SmiEditorAdapter secondAdapter;

    @Inject
    public MainViewModelFactory<SmiEditorViewModel> smiEditorFactory;

    /* renamed from: smiEditorViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy smiEditorViewModel;
    public int statusForCustomPrice;

    @Nullable
    public SmiEditorAdapter thirdAdapter;

    @NotNull
    public String valueOfPrice;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 24;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    @NotNull
    public final MainViewModelFactory<JNIActivityViewModel> getMainActivityFactory() {
        MainViewModelFactory<JNIActivityViewModel> mainViewModelFactory = this.mainActivityFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mainActivityFactory");
        return null;
    }

    public final void setMainActivityFactory(@NotNull MainViewModelFactory<JNIActivityViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.mainActivityFactory = mainViewModelFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JNIActivityViewModel getMainActivityViewModel() {
        return (JNIActivityViewModel) this.mainActivityViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<SmiEditorViewModel> getSmiEditorFactory() {
        MainViewModelFactory<SmiEditorViewModel> mainViewModelFactory = this.smiEditorFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("smiEditorFactory");
        return null;
    }

    public final void setSmiEditorFactory(@NotNull MainViewModelFactory<SmiEditorViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.smiEditorFactory = mainViewModelFactory;
    }

    public final SmiEditorViewModel getSmiEditorViewModel() {
        return (SmiEditorViewModel) this.smiEditorViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
        if (json != null) {
            int optInt = json.optInt("t");
            if (optInt != 0 && optInt != 1) {
                if (optInt != 2) {
                    return;
                }
                getSmiEditorViewModel().updateValueOfQueue(json);
                return;
            }
            String optString = json.optString("d");
            Intrinsics.checkNotNull(optString);
            if (optString.length() > 0) {
                clearInterfaceAfterGettingNewStartText();
                getSmiEditorViewModel().setNewStartText(optString);
            } else {
                closeFragment();
            }
        }
    }

    public final void clearInterfaceAfterGettingNewStartText() {
        setInitProperty();
        clearEditTexts();
        changeParamForFirstColumn(-1);
        clearSecondAndThirdAndFourthColumns();
        SmiEditorAdapter smiEditorAdapter = this.firstAdapter;
        if (smiEditorAdapter != null) {
            smiEditorAdapter.refreshCheck();
        }
        setVisibleForBlockWithCustomPrice(4);
        unlockButtonApply();
    }

    public final void setInitProperty() {
        this.getStartTextAd = "";
        this.myCustomTextFromSwitchForAd = "";
        this.myCustomFinalTextForAd = "";
        this.myCustomTextFromEditTextForAd = "";
        this.oldColumn = 0;
        this.isShowStartAd = true;
        this.changeTextForAdIfCarOrAccessories = false;
        this.valueOfPrice = "";
        this.statusForCustomPrice = -1;
        this.ifUnlockFromSwitch = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void clearEditTexts() {
        ((SmiDialogBinding) getBinding()).personalSmiWriter.setText("");
        ((SmiDialogBinding) getBinding()).valuePrice.setText("");
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() {
        try {
            getSmiEditorViewModel().setInitData(getJsonObj());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        setObservers();
        initInterface();
        initListeners();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public SmiDialogBinding getViewBinding() {
        SmiDialogBinding inflate = SmiDialogBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    private final void setObservers() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUISmiEditor$setObservers$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUISmiEditor$setObservers$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUISmiEditor$setObservers$3(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUISmiEditor$setObservers$4(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUISmiEditor$setObservers$5(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUISmiEditor$setObservers$6(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUISmiEditor$setObservers$7(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUISmiEditor$setObservers$8(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUISmiEditor$setObservers$9(this, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setValueQueueInView(int valueOfQueue) {
        ((SmiDialogBinding) getBinding()).valueQueue.setText(requireActivity().getString(R.string.common_number_value, Integer.valueOf(valueOfQueue)));
    }

    public final void changeViewAds(boolean ifStartText) {
        CharSequence text;
        String str;
        if (ifStartText) {
            text = requireActivity().getText(R.string.smi_dialog_header_start_ad);
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            str = this.getStartTextAd;
        } else {
            text = requireActivity().getText(R.string.smi_dialog_header_edit_ad);
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            str = this.myCustomTextFromEditTextForAd;
            if (str.length() == 0) {
                str = this.myCustomFinalTextForAd;
            }
        }
        setTextInView(text, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTextInView(CharSequence title, String textForAd) {
        ((SmiDialogBinding) getBinding()).headerStartText.setText(title);
        ((SmiDialogBinding) getBinding()).textInHeader.setText(textForAd);
    }

    public final void transformCollectionWithTextToStringForAd(List<String> currentCollection) {
        this.myCustomTextFromSwitchForAd = "";
        for (String str : currentCollection) {
            this.myCustomTextFromSwitchForAd = this.myCustomTextFromSwitchForAd + " " + str;
        }
        updateFinalPhraseWithPrice();
        changeViewAds(this.isShowStartAd);
    }

    public final void updateFinalPhraseWithPrice() {
        String str = "";
        this.myCustomFinalTextForAd = "";
        if (this.myCustomTextFromSwitchForAd.length() > 0) {
            int i = this.statusForCustomPrice;
            if (i == 0) {
                if (this.valueOfPrice.length() > 0) {
                    str = requireActivity().getString(R.string.smi_dialog_price_for_buy_if_not_empty, this.valueOfPrice);
                } else {
                    str = requireActivity().getString(R.string.smi_dialog_price_for_buy_if_empty);
                }
                Intrinsics.checkNotNull(str);
            } else if (i == 1) {
                if (this.valueOfPrice.length() > 0) {
                    str = requireActivity().getString(R.string.smi_dialog_price_for_sell_if_not_empty, this.valueOfPrice);
                } else {
                    str = requireActivity().getString(R.string.smi_dialog_price_for_sell_if_empty);
                }
                Intrinsics.checkNotNull(str);
            }
            this.myCustomFinalTextForAd = this.myCustomTextFromSwitchForAd + str;
        }
    }

    public final void initInterface() {
        initAdapters();
        initFirstColumn();
    }

    public final void initAdapters() {
        initClickListenerCarOrAccessories();
        initClickListenerFirst();
        this.firstAdapter = new SmiEditorAdapter(this.clickListenerFirst);
        this.secondAdapter = new SmiEditorAdapter(this.clickListenerFirst);
        this.thirdAdapter = new SmiEditorAdapter(this.clickListenerFirst);
        this.fourthAdapter = new SmiEditorAdapter(this.clickListenerFirst);
        this.carOrAccessoriesAdapter = new SmiEditorCarsAndAccessoriesAdapter(this.clickListenerCarOrAccessories);
    }

    public final void initClickListenerCarOrAccessories() {
        this.clickListenerCarOrAccessories = new SmiEditorCarsAndAccessoriesAdapter.OnUserClickCarsAndAccessories() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$initClickListenerCarOrAccessories$1
            @Override // com.blackhub.bronline.game.gui.smieditor.adapters.SmiEditorCarsAndAccessoriesAdapter.OnUserClickCarsAndAccessories
            public void userClick(@NotNull SmiInfo smiInfo, int getPosition) {
                boolean z;
                SmiEditorViewModel smiEditorViewModel;
                int i;
                SmiEditorViewModel smiEditorViewModel2;
                int i2;
                int i3;
                int unused;
                Intrinsics.checkNotNullParameter(smiInfo, "smiInfo");
                z = GUISmiEditor.this.changeTextForAdIfCarOrAccessories;
                if (!z) {
                    GUISmiEditor.this.changeTextForAdIfCarOrAccessories = true;
                    GUISmiEditor gUISmiEditor = GUISmiEditor.this;
                    i3 = gUISmiEditor.oldColumn;
                    gUISmiEditor.oldColumn = i3 + 1;
                    unused = gUISmiEditor.oldColumn;
                }
                if (smiInfo.isChecked()) {
                    smiEditorViewModel2 = GUISmiEditor.this.getSmiEditorViewModel();
                    String str = (String) UtilsKt.buildTypeMerge(smiInfo.getName(), smiInfo.getNameStore());
                    i2 = GUISmiEditor.this.oldColumn;
                    smiEditorViewModel2.updateFinalText(str, i2);
                } else {
                    smiEditorViewModel = GUISmiEditor.this.getSmiEditorViewModel();
                    i = GUISmiEditor.this.oldColumn;
                    smiEditorViewModel.updateFinalText(null, i);
                }
                String str2 = (String) UtilsKt.buildTypeMerge(smiInfo.getName(), smiInfo.getNameStore());
                if (str2 == null) {
                    str2 = "";
                }
                Log.v(SmiEditorConstants.SMI_EDITOR, str2);
            }
        };
    }

    public final void initClickListenerFirst() {
        this.clickListenerFirst = new SmiEditorAdapter.OnUserClickListenerSmiEditor() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$initClickListenerFirst$1
            @Override // com.blackhub.bronline.game.gui.smieditor.adapters.SmiEditorAdapter.OnUserClickListenerSmiEditor
            public void clickable(@NotNull SmiEditorBodyObj dataSmiInfoAll, int getPosition) {
                SmiEditorViewModel smiEditorViewModel;
                SmiEditorViewModel smiEditorViewModel2;
                SmiEditorViewModel smiEditorViewModel3;
                int i;
                SmiEditorViewModel smiEditorViewModel4;
                Intrinsics.checkNotNullParameter(dataSmiInfoAll, "dataSmiInfoAll");
                GUISmiEditor.this.changeTextForAdIfCarOrAccessories = false;
                Integer column = dataSmiInfoAll.getColumn();
                if (column != null && column.intValue() == 0) {
                    if (!dataSmiInfoAll.getIsChecked()) {
                        GUISmiEditor.this.changeParamForFirstColumn(-1);
                        GUISmiEditor.this.clearSecondAndThirdAndFourthColumns();
                    } else {
                        GUISmiEditor.this.clearThirdAndFourthColumns();
                        GUISmiEditor.this.changeParamForFirstColumn(getPosition);
                        smiEditorViewModel4 = GUISmiEditor.this.getSmiEditorViewModel();
                        smiEditorViewModel4.setSecondColumn(getPosition);
                    }
                } else if (column != null && column.intValue() == 1) {
                    if (!dataSmiInfoAll.getIsChecked()) {
                        GUISmiEditor.this.clearThirdAndFourthColumns();
                    } else {
                        GUISmiEditor.this.setVisibleForBlockWithCustomPrice(0);
                        GUISmiEditor.this.ifUnlockFromSwitch = true;
                        smiEditorViewModel2 = GUISmiEditor.this.getSmiEditorViewModel();
                        smiEditorViewModel2.setThirdColumn(dataSmiInfoAll);
                        GUISmiEditor.this.unlockButtonApply();
                    }
                } else if (column != null && column.intValue() == 2) {
                    smiEditorViewModel = GUISmiEditor.this.getSmiEditorViewModel();
                    smiEditorViewModel.setFourthColumn(dataSmiInfoAll);
                }
                Integer column2 = dataSmiInfoAll.getColumn();
                if (column2 != null) {
                    GUISmiEditor.this.oldColumn = column2.intValue();
                }
                String textForAd = dataSmiInfoAll.getIsChecked() ? dataSmiInfoAll.getTextForAd() : null;
                smiEditorViewModel3 = GUISmiEditor.this.getSmiEditorViewModel();
                i = GUISmiEditor.this.oldColumn;
                smiEditorViewModel3.updateFinalText(textForAd, i);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void clearSecondAndThirdAndFourthColumns() {
        attachAdapterToView(((SmiDialogBinding) getBinding()).rvSecondColumn, this.emptyAdapter);
        clearThirdAndFourthColumns();
        getSmiEditorViewModel().clearTitleForSecondAndThirdColumn();
        setVisibleButtonBackToThirdColumn(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void clearThirdAndFourthColumns() {
        attachAdapterToView(((SmiDialogBinding) getBinding()).rvThirdColumn, this.emptyAdapter);
        getSmiEditorViewModel().clearTitleForThirdColumn();
        setVisibleButtonBackToThirdColumn(4);
        setVisibleForBlockWithCustomPrice(4);
        this.ifUnlockFromSwitch = false;
        unlockButtonApply();
    }

    public final void changeParamForFirstColumn(int currentPos) {
        int i;
        if (currentPos != 0) {
            i = 1;
            if (currentPos != 1) {
                i = 2;
                if (currentPos != 2) {
                    i = -1;
                }
            }
        } else {
            i = 0;
        }
        this.statusForCustomPrice = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initFirstColumn() {
        SmiEditorAdapter smiEditorAdapter = this.firstAdapter;
        if (smiEditorAdapter != null) {
            smiEditorAdapter.initItems(this.firstColumn);
        }
        attachAdapterToView(((SmiDialogBinding) getBinding()).typeAds, this.firstAdapter);
    }

    public final void attachAdapterToView(RecyclerView currentRecycler, RecyclerView.Adapter<? extends RecyclerView.ViewHolder> currentAdapter) {
        if (currentRecycler != null) {
            currentRecycler.setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
            currentRecycler.setAdapter(currentAdapter);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initSecondColumn(List<SmiEditorBodyObj> data) {
        SmiEditorAdapter smiEditorAdapter = this.secondAdapter;
        if (smiEditorAdapter != null) {
            smiEditorAdapter.initItems(data);
            smiEditorAdapter.refreshCheck();
        }
        attachAdapterToView(((SmiDialogBinding) getBinding()).rvSecondColumn, this.secondAdapter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initThirdColumn(List<? extends Object> data) {
        List<? extends Object> list = data;
        if ((!list.isEmpty()) && (data.get(0) instanceof SmiEditorBodyObj)) {
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj>");
            SmiEditorAdapter smiEditorAdapter = this.thirdAdapter;
            if (smiEditorAdapter != null) {
                smiEditorAdapter.initItems(data);
                smiEditorAdapter.refreshCheck();
            }
            attachAdapterToView(((SmiDialogBinding) getBinding()).rvThirdColumn, this.thirdAdapter);
        } else if ((!list.isEmpty()) && (data.get(0) instanceof SmiInfo)) {
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.blackhub.bronline.game.gui.smieditor.data.SmiInfo>");
            SmiEditorCarsAndAccessoriesAdapter smiEditorCarsAndAccessoriesAdapter = this.carOrAccessoriesAdapter;
            if (smiEditorCarsAndAccessoriesAdapter != null) {
                smiEditorCarsAndAccessoriesAdapter.initItems(data);
                smiEditorCarsAndAccessoriesAdapter.refreshCheck();
            }
            attachAdapterToView(((SmiDialogBinding) getBinding()).rvThirdColumn, this.carOrAccessoriesAdapter);
        }
        setVisibleButtonBackToThirdColumn(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initFourthColumn(List<? extends Object> data) {
        List<? extends Object> list = data;
        if ((!list.isEmpty()) && (data.get(0) instanceof SmiEditorBodyObj)) {
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj>");
            SmiEditorAdapter smiEditorAdapter = this.fourthAdapter;
            if (smiEditorAdapter != null) {
                smiEditorAdapter.initItems(data);
                smiEditorAdapter.refreshCheck();
            }
            attachAdapterToView(((SmiDialogBinding) getBinding()).rvThirdColumn, this.fourthAdapter);
            return;
        }
        if ((!list.isEmpty()) && (data.get(0) instanceof SmiInfo)) {
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.blackhub.bronline.game.gui.smieditor.data.SmiInfo>");
            SmiEditorCarsAndAccessoriesAdapter smiEditorCarsAndAccessoriesAdapter = this.carOrAccessoriesAdapter;
            if (smiEditorCarsAndAccessoriesAdapter != null) {
                smiEditorCarsAndAccessoriesAdapter.initItems(data);
                smiEditorCarsAndAccessoriesAdapter.refreshCheck();
            }
            attachAdapterToView(((SmiDialogBinding) getBinding()).rvThirdColumn, this.carOrAccessoriesAdapter);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setVisibleButtonBackToThirdColumn(int isVisible) {
        ((SmiDialogBinding) getBinding()).buttonBackToMenuInThirdColumn.setVisibility(isVisible);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTitleForSecondColumn(String currentTitle) {
        ((SmiDialogBinding) getBinding()).headerSecondColumn.setText(currentTitle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTitleForThirdColumn(String currentTitle) {
        ((SmiDialogBinding) getBinding()).headerThirdsColumn.setText(currentTitle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initListeners() {
        SmiDialogBinding smiDialogBinding = (SmiDialogBinding) getBinding();
        smiDialogBinding.buttonBackToMenuInThirdColumn.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUISmiEditor.initListeners$lambda$13$lambda$8(GUISmiEditor.this, view);
            }
        });
        smiDialogBinding.buttonChangeViewAds.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUISmiEditor.initListeners$lambda$13$lambda$9(GUISmiEditor.this, view);
            }
        });
        smiDialogBinding.valuePrice.addTextChangedListener(new TextWatcher() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$initListeners$1$3
            @Override // android.text.TextWatcher
            public void afterTextChanged(@NotNull Editable editable) {
                Intrinsics.checkNotNullParameter(editable, "editable");
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@NotNull CharSequence charSequence, int i, int i1, int i2) {
                Intrinsics.checkNotNullParameter(charSequence, "charSequence");
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@NotNull CharSequence charSequence, int i, int i1, int i2) {
                boolean z;
                Intrinsics.checkNotNullParameter(charSequence, "charSequence");
                String obj = charSequence.toString();
                GUISmiEditor gUISmiEditor = GUISmiEditor.this;
                String str = "";
                if (obj.length() > 0 && obj.charAt(0) != '0') {
                    str = UsefulKt.getPriceWithSpaces(Long.valueOf(Long.parseLong(obj)));
                }
                gUISmiEditor.valueOfPrice = str;
                GUISmiEditor.this.updateFinalPhraseWithPrice();
                GUISmiEditor gUISmiEditor2 = GUISmiEditor.this;
                z = gUISmiEditor2.isShowStartAd;
                gUISmiEditor2.changeViewAds(z);
            }
        });
        smiDialogBinding.personalSmiWriter.addTextChangedListener(new TextWatcher() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$initListeners$1$4
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable p0) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence p0, int p1, int p2, int p3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence p0, int p1, int p2, int p3) {
                String str;
                boolean z;
                GUISmiEditor gUISmiEditor = GUISmiEditor.this;
                if (p0 == null || (str = p0.toString()) == null) {
                    str = "";
                }
                gUISmiEditor.myCustomTextFromEditTextForAd = str;
                GUISmiEditor gUISmiEditor2 = GUISmiEditor.this;
                z = gUISmiEditor2.isShowStartAd;
                gUISmiEditor2.changeViewAds(z);
                GUISmiEditor.this.unlockButtonApply();
            }
        });
        smiDialogBinding.buttonSendInfoSmi.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUISmiEditor.initListeners$lambda$13$lambda$10(GUISmiEditor.this, view);
            }
        });
        smiDialogBinding.buttonDeleteInfoSmi.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUISmiEditor.initListeners$lambda$13$lambda$11(GUISmiEditor.this, view);
            }
        });
        smiDialogBinding.buttonReplaceSmiInfo.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUISmiEditor.initListeners$lambda$13$lambda$12(GUISmiEditor.this, view);
            }
        });
    }

    public static final void initListeners$lambda$13$lambda$8(GUISmiEditor this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.backFromFourthToThirdColumn();
    }

    public static final void initListeners$lambda$13$lambda$9(GUISmiEditor this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getStartTextAd.length() > 0) {
            view.startAnimation(this$0.getAnim());
            boolean z = !this$0.isShowStartAd;
            this$0.isShowStartAd = z;
            this$0.changeViewAds(z);
        }
    }

    public static final void initListeners$lambda$13$lambda$10(GUISmiEditor this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (view.getAlpha() == 1.0f) {
            view.startAnimation(this$0.getAnim());
            this$0.sendTextToServer();
        }
    }

    public static final void initListeners$lambda$13$lambda$11(GUISmiEditor this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        view.startAnimation(this$0.getAnim());
        this$0.getSmiEditorViewModel().putInfoForClickCancelOrNextOrDismiss(0);
    }

    public static final void initListeners$lambda$13$lambda$12(GUISmiEditor this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        view.startAnimation(this$0.getAnim());
        this$0.getSmiEditorViewModel().putInfoForClickCancelOrNextOrDismiss(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void backFromFourthToThirdColumn() {
        SmiEditorAdapter smiEditorAdapter = this.thirdAdapter;
        if (smiEditorAdapter != null) {
            smiEditorAdapter.refreshCheck();
        }
        attachAdapterToView(((SmiDialogBinding) getBinding()).rvThirdColumn, this.thirdAdapter);
        setVisibleButtonBackToThirdColumn(4);
        getSmiEditorViewModel().backFromFourthToThirdColumnForTitleOfColumn();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setVisibleForBlockWithCustomPrice(int isVisible) {
        if (this.statusForCustomPrice != 2) {
            ((SmiDialogBinding) getBinding()).fourthColumn.setVisibility(isVisible);
        }
    }

    public final void unlockButtonApply() {
        if (this.myCustomTextFromEditTextForAd.length() > 14) {
            updateStatusForButtonApply(1.0f);
        } else if (this.myCustomTextFromEditTextForAd.length() == 0 && this.ifUnlockFromSwitch) {
            updateStatusForButtonApply(1.0f);
        } else {
            updateStatusForButtonApply(0.5f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateStatusForButtonApply(float newStatus) {
        ((SmiDialogBinding) getBinding()).buttonSendInfoSmi.setAlpha(newStatus);
    }

    public final void sendTextToServer() {
        String str;
        if (this.myCustomTextFromEditTextForAd.length() > 0 && this.myCustomTextFromEditTextForAd.length() > 14) {
            str = this.myCustomTextFromEditTextForAd;
        } else {
            str = this.myCustomFinalTextForAd;
        }
        getSmiEditorViewModel().putDataToServer(str);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getSmiEditorViewModel().putInfoForClickCancelOrNextOrDismiss(3);
        setNullableParameters();
        super.onDestroyView();
    }

    private final void setNullableParameters() {
        this.clickListenerFirst = null;
        this.clickListenerCarOrAccessories = null;
        this.firstAdapter = null;
        this.secondAdapter = null;
        this.thirdAdapter = null;
        this.fourthAdapter = null;
        this.carOrAccessoriesAdapter = null;
        this.emptyAdapter = null;
    }

    public GUISmiEditor() {
        final Function0 function0 = null;
        this.mainActivityViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(JNIActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = Fragment.this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = Function0.this;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$mainActivityViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity requireActivity = GUISmiEditor.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                return (ViewModelProvider.Factory) new ViewModelProvider(requireActivity, GUISmiEditor.this.getMainActivityFactory()).get(JNIActivityViewModel.class);
            }
        });
        Function0<ViewModelProvider.Factory> function02 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$smiEditorViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                GUISmiEditor gUISmiEditor = GUISmiEditor.this;
                return (ViewModelProvider.Factory) new ViewModelProvider(gUISmiEditor, gUISmiEditor.getSmiEditorFactory()).get(SmiEditorViewModel.class);
            }
        };
        final Function0<Fragment> function03 = new Function0<Fragment>() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) Function0.this.invoke();
            }
        });
        this.smiEditorViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(SmiEditorViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStoreOwner m6502viewModels$lambda1;
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(Lazy.this);
                return m6502viewModels$lambda1.getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                ViewModelStoreOwner m6502viewModels$lambda1;
                CreationExtras creationExtras;
                Function0 function04 = Function0.this;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function02);
        this.getStartTextAd = "";
        this.myCustomTextFromSwitchForAd = "";
        this.myCustomFinalTextForAd = "";
        this.myCustomTextFromEditTextForAd = "";
        this.isShowStartAd = true;
        this.valueOfPrice = "";
        this.statusForCustomPrice = -1;
        this.firstColumn = CollectionsKt__CollectionsKt.listOf((Object[]) new SmiEditorBodyObj[]{new SmiEditorBodyObj("Куплю", "Куплю", 0, 0, null), new SmiEditorBodyObj("Продам", "Продам", 0, 0, null), new SmiEditorBodyObj("Собеседование", "Проходит собеседование", 0, 0, null)});
    }
}
