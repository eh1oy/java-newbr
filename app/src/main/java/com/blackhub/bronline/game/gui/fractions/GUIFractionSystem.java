package com.blackhub.bronline.game.gui.fractions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
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
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.FractionMainContainerBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.core.JNILib;
import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.fractions.data.FractionControlListOfPlayers;
import com.blackhub.bronline.game.gui.fractions.data.FractionControlPlayerInfo;
import com.blackhub.bronline.game.gui.fractions.data.FractionsNewRankRewardItem;
import com.blackhub.bronline.game.gui.fractions.data.FractionsProgressStaffItem;
import com.blackhub.bronline.game.gui.fractions.data.FractionsTestingResult;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsControlViewModel;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsDocumentsViewModel;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsMainViewModel;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsQuestsViewModel;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsShopViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.apache.ivy.osgi.updatesite.xml.FeatureParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUIFractionSystem.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010A\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0013H\u0002J\u0010\u0010B\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0013H\u0002J\b\u0010C\u001a\u00020\u0013H\u0016J\u0016\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00130E2\u0006\u0010\u001c\u001a\u00020\u0013H\u0002J\u0016\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00130E2\u0006\u0010G\u001a\u00020HH\u0003J\b\u0010I\u001a\u00020\u0002H\u0016J\b\u0010J\u001a\u00020KH\u0002J\b\u0010L\u001a\u00020KH\u0016J\u0010\u0010M\u001a\u00020K2\u0006\u0010N\u001a\u00020\u0013H\u0002J.\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u001e2\u000e\u0010Q\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010\u001e2\u000e\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001eH\u0002J\b\u0010S\u001a\u00020KH\u0016J\u0010\u0010T\u001a\u00020K2\u0006\u0010U\u001a\u00020VH\u0016J\b\u0010W\u001a\u00020KH\u0016J\u0012\u0010X\u001a\u00020K2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0016J\u0018\u0010[\u001a\u00020K2\u000e\u0010\\\u001a\n\u0012\u0006\b\u0001\u0012\u00020^0]H\u0002J\u0012\u0010_\u001a\u00020K2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0002J\b\u0010`\u001a\u00020KH\u0002J\u0010\u0010a\u001a\u00020K2\u0006\u0010b\u001a\u00020\u0013H\u0002J\b\u0010c\u001a\u00020KH\u0002J\b\u0010d\u001a\u00020KH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\fR\u001b\u0010\u0018\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001c\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\n\"\u0004\b\"\u0010\fR\u001b\u0010#\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0011\u001a\u0004\b$\u0010%R$\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\n\"\u0004\b*\u0010\fR\u001b\u0010+\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0011\u001a\u0004\b,\u0010-R$\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\n\"\u0004\b2\u0010\fR\u001b\u00103\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0011\u001a\u0004\b4\u00105R$\u00107\u001a\b\u0012\u0004\u0012\u0002080\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\n\"\u0004\b:\u0010\fR\u001b\u0010;\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\u0011\u001a\u0004\b<\u0010=R\u0010\u0010?\u001a\u0004\u0018\u00010@X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006e"}, d2 = {"Lcom/blackhub/bronline/game/gui/fractions/GUIFractionSystem;", "Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragment;", "Lcom/blackhub/bronline/databinding/FractionMainContainerBinding;", "()V", "buyTokensDialog", "Lcom/blackhub/bronline/game/gui/fractions/UIBuyTokensDialog;", "controlVMFactory", "Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsControlViewModel;", "getControlVMFactory", "()Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "setControlVMFactory", "(Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;)V", "controlViewModel", "getControlViewModel", "()Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsControlViewModel;", "controlViewModel$delegate", "Lkotlin/Lazy;", "currentLayout", "", "documentsVMFactory", "Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsDocumentsViewModel;", "getDocumentsVMFactory", "setDocumentsVMFactory", "documentsViewModel", "getDocumentsViewModel", "()Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsDocumentsViewModel;", "documentsViewModel$delegate", "fractionId", "listOfImages", "", "mainActivityFactory", "Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "getMainActivityFactory", "setMainActivityFactory", "mainActivityViewModel", "getMainActivityViewModel", "()Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "mainActivityViewModel$delegate", "mainVMFactory", "Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsMainViewModel;", "getMainVMFactory", "setMainVMFactory", "mainViewModel", "getMainViewModel", "()Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsMainViewModel;", "mainViewModel$delegate", "questsVMFactory", "Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsQuestsViewModel;", "getQuestsVMFactory", "setQuestsVMFactory", "questsViewModel", "getQuestsViewModel", "()Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsQuestsViewModel;", "questsViewModel$delegate", "shopVMFactory", "Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsShopViewModel;", "getShopVMFactory", "setShopVMFactory", "shopViewModel", "getShopViewModel", "()Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsShopViewModel;", "shopViewModel$delegate", "testResultDialog", "Lcom/blackhub/bronline/game/gui/fractions/UIFractionsTestResultDialog;", "getFractionNameTitle", "getFractionTitleIcon", "getGuiId", "getListOfImagesForAdapter", "", "getListOfImagesFunction", "link", "", "getViewBinding", "initDialogs", "", "initViewsISAMPGUI", "listenerLayout", "thisLayout", "makeListOfPlayersControlInterface", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionControlListOfPlayers;", "listOfNicknames", "listOfValues", "newBackPress", "onAttach", "context", "Landroid/content/Context;", "onDestroyView", "onPacketIncoming", "json", "Lorg/json/JSONObject;", "replaceFragment", FeatureParser.PluginHandler.FRAGMENT, "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "setDataFromJson", "setObservers", "setupButtonClickListener", TtmlNode.TAG_LAYOUT, "setupButtonClickListeners", "setupMainLayoutObservers", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGUIFractionSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUIFractionSystem.kt\ncom/blackhub/bronline/game/gui/fractions/GUIFractionSystem\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,638:1\n172#2,9:639\n106#2,15:648\n106#2,15:663\n106#2,15:678\n106#2,15:693\n106#2,15:708\n*S KotlinDebug\n*F\n+ 1 GUIFractionSystem.kt\ncom/blackhub/bronline/game/gui/fractions/GUIFractionSystem\n*L\n115#1:639,9\n121#1:648,15\n127#1:663,15\n132#1:678,15\n137#1:693,15\n143#1:708,15\n*E\n"})
/* loaded from: classes3.dex */
public final class GUIFractionSystem extends BaseISAMPGUIFragment<FractionMainContainerBinding> {
    public static final int $stable = 8;

    @Nullable
    public UIBuyTokensDialog buyTokensDialog;

    @Inject
    public MainViewModelFactory<FractionsControlViewModel> controlVMFactory;

    /* renamed from: controlViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy controlViewModel;

    @Inject
    public MainViewModelFactory<FractionsDocumentsViewModel> documentsVMFactory;

    /* renamed from: documentsViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy documentsViewModel;
    public int fractionId;

    @Inject
    public MainViewModelFactory<JNIActivityViewModel> mainActivityFactory;

    /* renamed from: mainActivityViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainActivityViewModel;

    @Inject
    public MainViewModelFactory<FractionsMainViewModel> mainVMFactory;

    /* renamed from: mainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainViewModel;

    @Inject
    public MainViewModelFactory<FractionsQuestsViewModel> questsVMFactory;

    /* renamed from: questsViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy questsViewModel;

    @Inject
    public MainViewModelFactory<FractionsShopViewModel> shopVMFactory;

    /* renamed from: shopViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy shopViewModel;

    @Nullable
    public UIFractionsTestResultDialog testResultDialog;
    public int currentLayout = -1;

    @Nullable
    public List<Integer> listOfImages = new ArrayList();

    public final int getFractionNameTitle(int fractionId) {
        if (fractionId == 11) {
            return R.string.fractions_fsin_title;
        }
        switch (fractionId) {
            case 1:
                return R.string.fractions_government_title;
            case 2:
                return R.string.fractions_defense_department_title;
            case 3:
                return R.string.fractions_hospital_title;
            case 4:
                return R.string.fractions_mass_media_title;
            case 5:
                return R.string.fractions_dps_title;
            case 6:
                return R.string.fractions_mvd_title;
            case 7:
                return R.string.fractions_fsb_title;
            default:
                return -1;
        }
    }

    public final int getFractionTitleIcon(int fractionId) {
        return fractionId != 1 ? fractionId != 2 ? fractionId != 3 ? fractionId != 5 ? fractionId != 6 ? fractionId != 7 ? fractionId != 11 ? R.drawable.img_fractions_title_mass_media : R.drawable.img_fractions_title_fsin : R.drawable.img_fractions_title_fsb : R.drawable.img_fractions_title_mvd : R.drawable.img_fractions_title_dps : R.drawable.img_fractions_title_hospital : R.drawable.ic_fractions_title_army : R.drawable.img_fractions_title_government;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 46;
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
    public final MainViewModelFactory<FractionsMainViewModel> getMainVMFactory() {
        MainViewModelFactory<FractionsMainViewModel> mainViewModelFactory = this.mainVMFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mainVMFactory");
        return null;
    }

    public final void setMainVMFactory(@NotNull MainViewModelFactory<FractionsMainViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.mainVMFactory = mainViewModelFactory;
    }

    public final FractionsMainViewModel getMainViewModel() {
        return (FractionsMainViewModel) this.mainViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<FractionsQuestsViewModel> getQuestsVMFactory() {
        MainViewModelFactory<FractionsQuestsViewModel> mainViewModelFactory = this.questsVMFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("questsVMFactory");
        return null;
    }

    public final void setQuestsVMFactory(@NotNull MainViewModelFactory<FractionsQuestsViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.questsVMFactory = mainViewModelFactory;
    }

    public final FractionsQuestsViewModel getQuestsViewModel() {
        return (FractionsQuestsViewModel) this.questsViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<FractionsDocumentsViewModel> getDocumentsVMFactory() {
        MainViewModelFactory<FractionsDocumentsViewModel> mainViewModelFactory = this.documentsVMFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("documentsVMFactory");
        return null;
    }

    public final void setDocumentsVMFactory(@NotNull MainViewModelFactory<FractionsDocumentsViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.documentsVMFactory = mainViewModelFactory;
    }

    public final FractionsDocumentsViewModel getDocumentsViewModel() {
        return (FractionsDocumentsViewModel) this.documentsViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<FractionsShopViewModel> getShopVMFactory() {
        MainViewModelFactory<FractionsShopViewModel> mainViewModelFactory = this.shopVMFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shopVMFactory");
        return null;
    }

    public final void setShopVMFactory(@NotNull MainViewModelFactory<FractionsShopViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.shopVMFactory = mainViewModelFactory;
    }

    public final FractionsShopViewModel getShopViewModel() {
        return (FractionsShopViewModel) this.shopViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<FractionsControlViewModel> getControlVMFactory() {
        MainViewModelFactory<FractionsControlViewModel> mainViewModelFactory = this.controlVMFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controlVMFactory");
        return null;
    }

    public final void setControlVMFactory(@NotNull MainViewModelFactory<FractionsControlViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.controlVMFactory = mainViewModelFactory;
    }

    public final FractionsControlViewModel getControlViewModel() {
        return (FractionsControlViewModel) this.controlViewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
        setDataFromJson(json);
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() {
        initDialogs();
        setDataFromJson(getJsonObj());
        setupMainLayoutObservers();
        setupButtonClickListeners();
        setObservers();
        JNILib.toggleDrawing2dStuff(true);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FractionMainContainerBinding getViewBinding() {
        FractionMainContainerBinding inflate = FractionMainContainerBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    public final void initDialogs() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        this.buyTokensDialog = new UIBuyTokensDialog(requireActivity, getMainViewModel());
        FragmentActivity requireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
        this.testResultDialog = new UIFractionsTestResultDialog(requireActivity2, getDocumentsViewModel());
    }

    private final void setObservers() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUIFractionSystem$setObservers$1(this, null), 3, null);
    }

    public final void setDataFromJson(JSONObject json) {
        List<Integer> list;
        int i;
        List<Integer> list2;
        List<Integer> list3;
        if (json == null || json.optInt("c") == 1) {
        }
        if (json.optInt(Const.FRACTION_TOKENS) == 1) {
            getMainViewModel().setFractionTokens(json.optInt(Const.FRACTION_TOKENS_VALUE));
        }
        getMainViewModel().setAddTokensPrice(json.optInt(Const.FRACTION_ADD_TOKENS_PRICE));
        if (json.optInt("t") == 4) {
            JSONArray optJSONArray = json.optJSONArray(Const.FRACTION_CONTROL_T_LIST_OF_NICKNAMES);
            List<String> mutableStringList = optJSONArray != null ? JsonArrayExtensionKt.toMutableStringList(optJSONArray) : null;
            JSONArray optJSONArray2 = json.optJSONArray("rs");
            if (optJSONArray2 != null) {
                Intrinsics.checkNotNull(optJSONArray2);
                list3 = JsonArrayExtensionKt.toMutableIntList(optJSONArray2);
            } else {
                list3 = null;
            }
            getControlViewModel().setStaffListLiveData(makeListOfPlayersControlInterface(mutableStringList, list3));
        }
        this.currentLayout = json.optInt(Const.PAGE_KEY);
        switch (json.optInt(Const.PAGE_KEY)) {
            case 1:
                this.fractionId = json.optInt(Const.FRACTION_ID);
                JSONArray optJSONArray3 = json.optJSONArray(Const.RANK_STATUS);
                if (optJSONArray3 != null) {
                    Intrinsics.checkNotNull(optJSONArray3);
                    list = JsonArrayExtensionKt.toMutableIntList(optJSONArray3);
                } else {
                    list = null;
                }
                JSONArray optJSONArray4 = json.optJSONArray(Const.RANK_PROGRESS);
                if (optJSONArray4 != null) {
                    Intrinsics.checkNotNull(optJSONArray4);
                    r3 = JsonArrayExtensionKt.toMutableIntList(optJSONArray4);
                }
                getMainViewModel().setFractionId(this.fractionId);
                getDocumentsViewModel().setFractionId(this.fractionId);
                getControlViewModel().setFractionId(this.fractionId);
                if (list != null && r3 != null) {
                    getMainViewModel().setFractionsProgressStaffItem(new FractionsProgressStaffItem(this.fractionId, list, r3));
                }
                listenerLayout(11);
                break;
            case 2:
                JSONArray optJSONArray5 = json.optJSONArray(Const.FRACTION_NEW_RANK_REWARD);
                r3 = optJSONArray5 != null ? JsonArrayExtensionKt.toMutableIntList(optJSONArray5) : null;
                int optInt = json.optInt("new_rank");
                if (r3 != null) {
                    List<Integer> list4 = this.listOfImages;
                    if (list4 != null && list4.isEmpty() && (list2 = this.listOfImages) != null) {
                        list2.addAll(getListOfImagesForAdapter(this.fractionId));
                    }
                    if (this.listOfImages == null || !(!r0.isEmpty())) {
                        i = 0;
                    } else {
                        List<Integer> list5 = this.listOfImages;
                        Intrinsics.checkNotNull(list5);
                        i = list5.get(optInt - 1).intValue();
                    }
                    getMainViewModel().setFractionsNewRankRewardItem(new FractionsNewRankRewardItem(this.fractionId, r3, optInt, i));
                    break;
                }
                break;
            case 3:
                int optInt2 = json.optInt(Const.FRACTION_TASK_RANK);
                if (1 <= optInt2 && optInt2 < 11) {
                    getQuestsViewModel().setQuestsList(this.fractionId, optInt2);
                    listenerLayout(6);
                    break;
                } else {
                    Log.v(Const.LOG_FRACTION_S, "INTERFACE_QUESTS playersRank == " + optInt2);
                    break;
                }
            case 4:
                JSONArray optJSONArray6 = json.optJSONArray(Const.FRACTION_DOCUMENTS_BUTTON_ACQUAINTED);
                r3 = optJSONArray6 != null ? JsonArrayExtensionKt.toMutableIntList(optJSONArray6) : null;
                if (r3 != null) {
                    getDocumentsViewModel().setDisplayButtonAcquainted(r3);
                }
                listenerLayout(5);
                break;
            case 5:
                listenerLayout(9);
                break;
            case 6:
                getDocumentsViewModel().setTestingResult(new FractionsTestingResult(json.optInt(Const.FRACTION_TESTING_RESULT), json.optInt(Const.FRACTION_TESTING_TOTAL), json.optInt(Const.FRACTION_TESTING_QUESTIONS_TOTAL)));
                UIFractionsTestResultDialog uIFractionsTestResultDialog = this.testResultDialog;
                if (uIFractionsTestResultDialog != null) {
                    uIFractionsTestResultDialog.showDialog();
                    break;
                }
                break;
            case 7:
                if (json.optInt("type") == 2) {
                    getMainViewModel().setBCValue(json.optInt(Const.FRACTION_ADD_TOKENS_BC_VALUE));
                }
                UIBuyTokensDialog uIBuyTokensDialog = this.buyTokensDialog;
                Intrinsics.checkNotNull(uIBuyTokensDialog);
                uIBuyTokensDialog.showDialog();
                break;
            case 8:
                listenerLayout(3);
                break;
            case 9:
                int optInt3 = json.optInt("type");
                if (optInt3 == 1) {
                    listenerLayout(4);
                    break;
                } else if (optInt3 == 2) {
                    FractionsControlViewModel controlViewModel = getControlViewModel();
                    String optString = json.optString(Const.FRACTION_CONTROL_PLAYER_NICKNAME);
                    Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                    int optInt4 = json.optInt(Const.FRACTION_CONTROL_PLAYER_SKIN_ID);
                    int optInt5 = json.optInt("level");
                    String optString2 = json.optString(Const.FRACTION_CONTROL_PLAYER_RANK_NAME);
                    Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
                    int optInt6 = json.optInt(Const.FRACTION_CONTROL_PLAYER_RANK);
                    int optInt7 = json.optInt(Const.FRACTION_CONTROL_PLAYER_REPRIMAND);
                    String optString3 = json.optString("phone");
                    Intrinsics.checkNotNullExpressionValue(optString3, "optString(...)");
                    controlViewModel.setInfoAboutPlayer(new FractionControlPlayerInfo(optString, optInt4, optInt5, optString2, optInt6, optInt7, optString3));
                    break;
                } else if (optInt3 == 3) {
                    getControlViewModel().setNewPlayersRankLiveData(json.optInt("new_rank"));
                    FractionsControlViewModel controlViewModel2 = getControlViewModel();
                    String optString4 = json.optString(Const.FRACTION_CONTROL_PLAYER_NEW_POSITION);
                    Intrinsics.checkNotNullExpressionValue(optString4, "optString(...)");
                    controlViewModel2.setNewPlayersPosition(optString4);
                    break;
                } else if (optInt3 == 4) {
                    getControlViewModel().setNewPlayersReprimandLiveData(json.optInt(Const.FRACTION_CONTROL_PLAYER_NEW_REPRIMAND));
                    break;
                } else if (optInt3 == 5) {
                    getControlViewModel().dismissPlayerFromFraction(json.optInt(Const.FRACTION_CONTROL_DISMISSED_PLAYER_ID));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setupMainLayoutObservers() {
        final FractionMainContainerBinding fractionMainContainerBinding = (FractionMainContainerBinding) getBinding();
        getMainViewModel().getFractionIdLiveData().observe(getViewLifecycleOwner(), new GUIFractionSystem$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$setupMainLayoutObservers$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) {
                int fractionTitleIcon;
                int fractionNameTitle;
                GUIFractionSystem gUIFractionSystem = GUIFractionSystem.this;
                Intrinsics.checkNotNull(num);
                gUIFractionSystem.fractionId = num.intValue();
                ImageView imageView = fractionMainContainerBinding.iconTitleFraction;
                fractionTitleIcon = GUIFractionSystem.this.getFractionTitleIcon(num.intValue());
                imageView.setImageResource(fractionTitleIcon);
                TextView textView = fractionMainContainerBinding.textTitleFraction;
                fractionNameTitle = GUIFractionSystem.this.getFractionNameTitle(num.intValue());
                textView.setText(fractionNameTitle);
            }
        }));
        getMainViewModel().getFractionTokensLiveData().observe(getViewLifecycleOwner(), new GUIFractionSystem$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$setupMainLayoutObservers$1$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) {
                FractionMainContainerBinding.this.moneyValue.setText(UsefulKt.getPriceWithSpaces(num));
            }
        }));
        getMainViewModel().getNewRankRewardItemLiveData().observe(getViewLifecycleOwner(), new GUIFractionSystem$sam$androidx_lifecycle_Observer$0(new Function1<FractionsNewRankRewardItem, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$setupMainLayoutObservers$1$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FractionsNewRankRewardItem fractionsNewRankRewardItem) {
                invoke2(fractionsNewRankRewardItem);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable FractionsNewRankRewardItem fractionsNewRankRewardItem) {
                FragmentActivity activity;
                FractionsMainViewModel mainViewModel;
                if (fractionsNewRankRewardItem == null || (activity = GUIFractionSystem.this.getActivity()) == null) {
                    return;
                }
                mainViewModel = GUIFractionSystem.this.getMainViewModel();
                new UIGetNewRankDialog(activity, fractionsNewRankRewardItem, mainViewModel).showDialog();
            }
        }));
    }

    public final void setupButtonClickListener(int layout) {
        getMainViewModel().sendButtonPressed(this.currentLayout, layout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setupButtonClickListeners() {
        FractionMainContainerBinding fractionMainContainerBinding = (FractionMainContainerBinding) getBinding();
        AppCompatButton buttonClose = fractionMainContainerBinding.buttonClose;
        Intrinsics.checkNotNullExpressionValue(buttonClose, "buttonClose");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonClose, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$setupButtonClickListeners$1$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                GUIFractionSystem.this.closeFragment();
            }
        }, 1, null);
        ImageButton buttonBack = fractionMainContainerBinding.buttonBack;
        Intrinsics.checkNotNullExpressionValue(buttonBack, "buttonBack");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonBack, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$setupButtonClickListeners$1$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                GUIFractionSystem.this.setupButtonClickListener(11);
            }
        }, 1, null);
        ImageButton buttonFractionsSetting = fractionMainContainerBinding.buttonFractionsSetting;
        Intrinsics.checkNotNullExpressionValue(buttonFractionsSetting, "buttonFractionsSetting");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonFractionsSetting, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$setupButtonClickListeners$1$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                GUIFractionSystem.this.setupButtonClickListener(4);
            }
        }, 1, null);
        ImageButton buttonFractionsDocuments = fractionMainContainerBinding.buttonFractionsDocuments;
        Intrinsics.checkNotNullExpressionValue(buttonFractionsDocuments, "buttonFractionsDocuments");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonFractionsDocuments, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$setupButtonClickListeners$1$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                GUIFractionSystem.this.setupButtonClickListener(5);
            }
        }, 1, null);
        ImageButton buttonMoneyShop = fractionMainContainerBinding.buttonMoneyShop;
        Intrinsics.checkNotNullExpressionValue(buttonMoneyShop, "buttonMoneyShop");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonMoneyShop, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$setupButtonClickListeners$1$5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                GUIFractionSystem.this.setupButtonClickListener(3);
            }
        }, 1, null);
        ImageButton buttonAddMoney = fractionMainContainerBinding.buttonAddMoney;
        Intrinsics.checkNotNullExpressionValue(buttonAddMoney, "buttonAddMoney");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonAddMoney, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$setupButtonClickListeners$1$6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                GUIFractionSystem.this.setupButtonClickListener(2);
            }
        }, 1, null);
    }

    private final void replaceFragment(Class<? extends Fragment> fragment) {
        getChildFragmentManager().beginTransaction().replace(R.id.main_container, fragment, (Bundle) null).commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void listenerLayout(int thisLayout) {
        if (thisLayout != 11) {
            ((FractionMainContainerBinding) getBinding()).buttonBack.setVisibility(0);
        } else {
            ((FractionMainContainerBinding) getBinding()).buttonBack.setVisibility(4);
        }
        if (thisLayout == 3) {
            replaceFragment(UIFractionsShopLayout.class);
            return;
        }
        if (thisLayout == 4) {
            replaceFragment(UIFractionsControlLayout.class);
            return;
        }
        if (thisLayout == 5) {
            FractionMainContainerBinding fractionMainContainerBinding = (FractionMainContainerBinding) getBinding();
            fractionMainContainerBinding.buttonFractionsDocuments.setVisibility(0);
            fractionMainContainerBinding.buttonFractionsSetting.setVisibility(0);
            fractionMainContainerBinding.buttonMoneyShop.setVisibility(0);
            replaceFragment(UIFractionsDocumentsLayout.class);
            return;
        }
        if (thisLayout == 6) {
            replaceFragment(UIFractionQuestsLayout.class);
            return;
        }
        if (thisLayout == 9) {
            FractionMainContainerBinding fractionMainContainerBinding2 = (FractionMainContainerBinding) getBinding();
            fractionMainContainerBinding2.buttonFractionsDocuments.setVisibility(4);
            fractionMainContainerBinding2.buttonFractionsSetting.setVisibility(4);
            fractionMainContainerBinding2.buttonMoneyShop.setVisibility(4);
            replaceFragment(UIFractionsTestingLayout.class);
            return;
        }
        if (thisLayout != 11) {
            return;
        }
        FractionMainContainerBinding fractionMainContainerBinding3 = (FractionMainContainerBinding) getBinding();
        fractionMainContainerBinding3.buttonFractionsDocuments.setVisibility(0);
        fractionMainContainerBinding3.buttonFractionsSetting.setVisibility(0);
        fractionMainContainerBinding3.buttonMoneyShop.setVisibility(0);
        replaceFragment(UIFractionMainLayout.class);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        JNILib.toggleDrawing2dStuff(false);
        getMainViewModel().sendButtonPressed(this.currentLayout, 1);
        List<Integer> list = this.listOfImages;
        if (list != null) {
            list.clear();
        }
        this.listOfImages = null;
        super.onDestroyView();
    }

    public final List<FractionControlListOfPlayers> makeListOfPlayersControlInterface(List<String> listOfNicknames, List<Integer> listOfValues) {
        List<Integer> list;
        ArrayList arrayList = new ArrayList();
        List<String> list2 = listOfNicknames;
        if (list2 != null && !list2.isEmpty() && (list = listOfValues) != null && !list.isEmpty()) {
            int size = listOfNicknames.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                int i3 = i2 * 3;
                ArrayList arrayList2 = new ArrayList();
                for (int i4 = i3 - 3; i4 < i3; i4++) {
                    arrayList2.add(listOfValues.get(i4));
                }
                arrayList.add(new FractionControlListOfPlayers(((Number) arrayList2.get(0)).intValue(), listOfNicknames.get(i), ((Number) arrayList2.get(1)).intValue(), ((Number) arrayList2.get(2)).intValue()));
                i = i2;
            }
        }
        return arrayList;
    }

    public final List<Integer> getListOfImagesForAdapter(int fractionId) {
        if (fractionId != 11) {
            switch (fractionId) {
                case 1:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_GOVERNMENT);
                case 2:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_DEPARTMENT);
                case 3:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_HOSPITAL);
                case 4:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_MASS_MEDIA);
                case 5:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_MVD);
                case 6:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_MVD);
                case 7:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_MVD);
                default:
                    return new ArrayList();
            }
        }
        return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_MVD);
    }

    @SuppressLint({"DiscouragedApi"})
    public final List<Integer> getListOfImagesFunction(String link) {
        Resources resources;
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < 11; i++) {
            String str = link + i;
            FragmentActivity activity = getActivity();
            if (activity != null && (resources = activity.getResources()) != null) {
                arrayList.add(Integer.valueOf(resources.getIdentifier(str, "drawable", activity.getPackageName())));
            }
        }
        return arrayList;
    }

    public GUIFractionSystem() {
        final Function0 function0 = null;
        this.mainActivityViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(JNIActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$mainActivityViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity requireActivity = GUIFractionSystem.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                return (ViewModelProvider.Factory) new ViewModelProvider(requireActivity, GUIFractionSystem.this.getMainActivityFactory()).get(JNIActivityViewModel.class);
            }
        });
        final Function0<ViewModelStoreOwner> function02 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$mainViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return GUIFractionSystem.this;
            }
        };
        Function0<ViewModelProvider.Factory> function03 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$mainViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return GUIFractionSystem.this.getMainVMFactory();
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$special$$inlined$viewModels$default$1
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
        this.mainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(FractionsMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$special$$inlined$viewModels$default$3
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
        }, function03);
        final Function0<ViewModelStoreOwner> function04 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$questsViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return GUIFractionSystem.this;
            }
        };
        Function0<ViewModelProvider.Factory> function05 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$questsViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return GUIFractionSystem.this.getQuestsVMFactory();
            }
        };
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$special$$inlined$viewModels$default$5
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
        this.questsViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(FractionsQuestsViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$special$$inlined$viewModels$default$6
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$special$$inlined$viewModels$default$7
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
                Function0 function06 = Function0.this;
                if (function06 != null && (creationExtras = (CreationExtras) function06.invoke()) != null) {
                    return creationExtras;
                }
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function05);
        final Function0<ViewModelStoreOwner> function06 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$documentsViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return GUIFractionSystem.this;
            }
        };
        Function0<ViewModelProvider.Factory> function07 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$documentsViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return GUIFractionSystem.this.getDocumentsVMFactory();
            }
        };
        final Lazy lazy3 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$special$$inlined$viewModels$default$9
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
        this.documentsViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(FractionsDocumentsViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$special$$inlined$viewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$special$$inlined$viewModels$default$11
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
                Function0 function08 = Function0.this;
                if (function08 != null && (creationExtras = (CreationExtras) function08.invoke()) != null) {
                    return creationExtras;
                }
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function07);
        final Function0<ViewModelStoreOwner> function08 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$shopViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return GUIFractionSystem.this;
            }
        };
        Function0<ViewModelProvider.Factory> function09 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$shopViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return GUIFractionSystem.this.getShopVMFactory();
            }
        };
        final Lazy lazy4 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$special$$inlined$viewModels$default$13
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
        this.shopViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(FractionsShopViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$special$$inlined$viewModels$default$14
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$special$$inlined$viewModels$default$15
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
                Function0 function010 = Function0.this;
                if (function010 != null && (creationExtras = (CreationExtras) function010.invoke()) != null) {
                    return creationExtras;
                }
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy4);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function09);
        final Function0<ViewModelStoreOwner> function010 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$controlViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return GUIFractionSystem.this;
            }
        };
        Function0<ViewModelProvider.Factory> function011 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$controlViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return GUIFractionSystem.this.getControlVMFactory();
            }
        };
        final Lazy lazy5 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$special$$inlined$viewModels$default$17
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
        this.controlViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(FractionsControlViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$special$$inlined$viewModels$default$18
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.fractions.GUIFractionSystem$special$$inlined$viewModels$default$19
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
                Function0 function012 = Function0.this;
                if (function012 != null && (creationExtras = (CreationExtras) function012.invoke()) != null) {
                    return creationExtras;
                }
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy5);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function011);
    }
}
