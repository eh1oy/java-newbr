package com.blackhub.bronline.game.gui.blackpass.viewmodel;

import android.app.Application;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.activetask.ActiveTaskUiState;
import com.blackhub.bronline.game.gui.blackpass.network.BlackPassActionWithJSON;
import com.blackhub.bronline.game.model.remote.response.blackpass.LevelsInfo;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: BlackPassActivateViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u001aJ&\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020/2\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020201j\b\u0012\u0004\u0012\u000202`3J\u000e\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020\u001dJ\b\u00106\u001a\u000207H\u0002R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0014¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0014¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0016¨\u00068"}, d2 = {"Lcom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassActivateViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/activetask/ActiveTaskUiState;", "actionWithJson", "Lcom/blackhub/bronline/game/gui/blackpass/network/BlackPassActionWithJSON;", "application", "Landroid/app/Application;", "stringResource", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "(Lcom/blackhub/bronline/game/gui/blackpass/network/BlackPassActionWithJSON;Landroid/app/Application;Lcom/blackhub/bronline/game/core/resources/StringResource;)V", "_imgDeluxeCar", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroid/graphics/Bitmap;", "_imgOfferSplit", "_nameDeluxeCar", "", "_uiState", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "imgDeluxeCar", "Lkotlinx/coroutines/flow/StateFlow;", "getImgDeluxeCar", "()Lkotlinx/coroutines/flow/StateFlow;", "imgOfferSplit", "getImgOfferSplit", "isCloseInterface", "", "mutableIsCloseInterface", "mutablePremiumDeluxePrice", "", "mutablePremiumPrice", "nameDeluxeCar", "getNameDeluxeCar", "premiumDeluxePrice", "getPremiumDeluxePrice", "premiumPrice", "getPremiumPrice", "getStringResource", "()Lcom/blackhub/bronline/game/core/resources/StringResource;", "uiState", "getUiState", "clearViewModel", "", "closeInterface", "value", "initInterface", "json", "Lorg/json/JSONObject;", "rewards", "Ljava/util/ArrayList;", "Lcom/blackhub/bronline/game/model/remote/response/blackpass/LevelsInfo;", "Lkotlin/collections/ArrayList;", "purchasePremium", "premiumId", "updatePrizeText", "Landroid/text/SpannedString;", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(message = "удалить после тестов")
@SourceDebugExtension({"SMAP\nBlackPassActivateViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassActivateViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassActivateViewModel\n+ 2 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n1#1,107:1\n41#2,2:108\n115#2:110\n74#2,2:111\n87#2:113\n74#2,4:114\n76#2,2:118\n43#2:120\n*S KotlinDebug\n*F\n+ 1 BlackPassActivateViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassActivateViewModel\n*L\n84#1:108,2\n88#1:110\n88#1:111,2\n89#1:113\n89#1:114,4\n88#1:118,2\n84#1:120\n*E\n"})
/* loaded from: classes3.dex */
public final class BlackPassActivateViewModel extends BaseViewModel<ActiveTaskUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<Bitmap> _imgDeluxeCar;

    @NotNull
    public final MutableStateFlow<Bitmap> _imgOfferSplit;

    @NotNull
    public final MutableStateFlow<String> _nameDeluxeCar;

    @NotNull
    public final MutableStateFlow<ActiveTaskUiState> _uiState;

    @NotNull
    public final BlackPassActionWithJSON actionWithJson;

    @NotNull
    public final Application application;

    @NotNull
    public final StateFlow<Bitmap> imgDeluxeCar;

    @NotNull
    public final StateFlow<Bitmap> imgOfferSplit;

    @NotNull
    public final StateFlow<Boolean> isCloseInterface;

    @NotNull
    public final MutableStateFlow<Boolean> mutableIsCloseInterface;

    @NotNull
    public final MutableStateFlow<Integer> mutablePremiumDeluxePrice;

    @NotNull
    public final MutableStateFlow<Integer> mutablePremiumPrice;

    @NotNull
    public final StateFlow<String> nameDeluxeCar;

    @NotNull
    public final StateFlow<Integer> premiumDeluxePrice;

    @NotNull
    public final StateFlow<Integer> premiumPrice;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<ActiveTaskUiState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Inject
    public BlackPassActivateViewModel(@NotNull BlackPassActionWithJSON actionWithJson, @NotNull Application application, @NotNull StringResource stringResource) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        this.actionWithJson = actionWithJson;
        this.application = application;
        this.stringResource = stringResource;
        this._uiState = StateFlowKt.MutableStateFlow(new ActiveTaskUiState(0, null, null, null, null, 0, false, false, false, 511, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.mutablePremiumPrice = MutableStateFlow;
        this.premiumPrice = MutableStateFlow;
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(0);
        this.mutablePremiumDeluxePrice = MutableStateFlow2;
        this.premiumDeluxePrice = MutableStateFlow2;
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.mutableIsCloseInterface = MutableStateFlow3;
        this.isCloseInterface = MutableStateFlow3;
        MutableStateFlow<Bitmap> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this._imgOfferSplit = MutableStateFlow4;
        this.imgOfferSplit = MutableStateFlow4;
        MutableStateFlow<Bitmap> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this._imgDeluxeCar = MutableStateFlow5;
        this.imgDeluxeCar = MutableStateFlow5;
        MutableStateFlow<String> MutableStateFlow6 = StateFlowKt.MutableStateFlow(AnyExtensionKt.empty(StringCompanionObject.INSTANCE));
        this._nameDeluxeCar = MutableStateFlow6;
        this.nameDeluxeCar = MutableStateFlow6;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends ActiveTaskUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<ActiveTaskUiState> getUiState() {
        return this.uiState;
    }

    @NotNull
    public final StateFlow<Integer> getPremiumPrice() {
        return this.premiumPrice;
    }

    @NotNull
    public final StateFlow<Integer> getPremiumDeluxePrice() {
        return this.premiumDeluxePrice;
    }

    @NotNull
    public final StateFlow<Boolean> isCloseInterface() {
        return this.isCloseInterface;
    }

    @NotNull
    public final StateFlow<Bitmap> getImgOfferSplit() {
        return this.imgOfferSplit;
    }

    @NotNull
    public final StateFlow<Bitmap> getImgDeluxeCar() {
        return this.imgDeluxeCar;
    }

    @NotNull
    public final StateFlow<String> getNameDeluxeCar() {
        return this.nameDeluxeCar;
    }

    public final void initInterface(@NotNull JSONObject json, @NotNull ArrayList<LevelsInfo> rewards) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        ViewModelExtensionKt.launchOnIO$default(this, null, new BlackPassActivateViewModel$initInterface$1(this, json, rewards, null), 1, null);
    }

    public final void closeInterface(boolean value) {
        this.mutableIsCloseInterface.setValue(Boolean.valueOf(value));
    }

    public final void purchasePremium(int premiumId) {
        this.actionWithJson.purchasePremium(premiumId);
    }

    public final void clearViewModel() {
        closeInterface(false);
    }

    public final SpannedString updatePrizeText() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) getStringResource().getString(R.string.banner_title_prize_1_1));
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilder.append('\n'), "append(...)");
        spannableStringBuilder.append((CharSequence) getStringResource().getString(R.string.banner_title_prize_1_3));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ResourcesCompat.getColor(this.application.getResources(), R.color.red, null));
        int length = spannableStringBuilder.length();
        StyleSpan styleSpan = new StyleSpan(1);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) getStringResource().getString(R.string.banner_title_prize_1_4));
        spannableStringBuilder.setSpan(styleSpan, length2, spannableStringBuilder.length(), 17);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return new SpannedString(spannableStringBuilder);
    }
}
