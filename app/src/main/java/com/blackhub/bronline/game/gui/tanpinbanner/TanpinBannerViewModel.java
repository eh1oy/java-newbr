package com.blackhub.bronline.game.gui.tanpinbanner;

import android.app.Application;
import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.gui.cases.model.CaseReward;
import com.blackhub.bronline.game.gui.cases.model.CasesBannerAttachment;
import com.blackhub.bronline.game.gui.cases.model.CasesBannerSelectedCase;
import com.blackhub.bronline.game.model.remote.response.cases.CasesAwardDto;
import com.blackhub.bronline.game.model.remote.response.tanpin.TanpinBannerData;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TanpinBannerViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001c\u0010\u0017\u001a\u00020\u00182\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0018J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0012J\"\u0010\u001d\u001a\u00020\u001e*\u00020\u00142\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010!0 H\u0002JH\u0010\"\u001a\u00020#*\u00020\u00162\n\b\u0002\u0010$\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010!2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010!0 2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0011H\u0002R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006'"}, d2 = {"Lcom/blackhub/bronline/game/gui/tanpinbanner/TanpinBannerViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/tanpinbanner/TanpinBannerUiState;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/tanpinbanner/TanpinBannerActionWithJSON;", "application", "Landroid/app/Application;", "(Lcom/blackhub/bronline/game/gui/tanpinbanner/TanpinBannerActionWithJSON;Landroid/app/Application;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "getFileNames", "", "", "rewards", "Lcom/blackhub/bronline/game/model/remote/response/cases/CasesAwardDto;", "bannerData", "Lcom/blackhub/bronline/game/model/remote/response/tanpin/TanpinBannerData;", "initJson", "", "onClickToClose", "onClickToOpen", "showErrorMessage", ThrowableDeserializer.PROP_NAME_MESSAGE, "toCaseReward", "Lcom/blackhub/bronline/game/gui/cases/model/CaseReward;", "images", "", "Landroid/graphics/Bitmap;", "toCasesBannerAttachment", "Lcom/blackhub/bronline/game/gui/cases/model/CasesBannerAttachment;", "bgImage", "icImage", "caseRewards", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTanpinBannerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TanpinBannerViewModel.kt\ncom/blackhub/bronline/game/gui/tanpinbanner/TanpinBannerViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1603#2,9:130\n1855#2:139\n1856#2:141\n1612#2:142\n1#3:140\n*S KotlinDebug\n*F\n+ 1 TanpinBannerViewModel.kt\ncom/blackhub/bronline/game/gui/tanpinbanner/TanpinBannerViewModel\n*L\n97#1:130,9\n97#1:139\n97#1:141\n97#1:142\n97#1:140\n*E\n"})
/* loaded from: classes3.dex */
public final class TanpinBannerViewModel extends BaseViewModel<TanpinBannerUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<TanpinBannerUiState> _uiState;

    @NotNull
    public final TanpinBannerActionWithJSON actionWithJSON;

    @NotNull
    public final Application application;

    @NotNull
    public final StateFlow<TanpinBannerUiState> uiState;

    @Inject
    public TanpinBannerViewModel(@NotNull TanpinBannerActionWithJSON actionWithJSON, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(application, "application");
        this.actionWithJSON = actionWithJSON;
        this.application = application;
        this._uiState = StateFlowKt.MutableStateFlow(new TanpinBannerUiState(null, false, 3, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends TanpinBannerUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<TanpinBannerUiState> getUiState() {
        return this.uiState;
    }

    public final void initJson(@NotNull List<CasesAwardDto> rewards, @NotNull TanpinBannerData bannerData) {
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        Intrinsics.checkNotNullParameter(bannerData, "bannerData");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new TanpinBannerViewModel$initJson$1(this, rewards, bannerData, null), 1, null);
    }

    public final void onClickToOpen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new TanpinBannerViewModel$onClickToOpen$1(this, null), 1, null);
    }

    public final void onClickToClose() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new TanpinBannerViewModel$onClickToClose$1(this, null), 1, null);
    }

    public final void showErrorMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        LocalNotification localNotification = getLocalNotification();
        if (localNotification != null) {
            localNotification.showErrorNotification(message);
        }
    }

    public final List<String> getFileNames(List<CasesAwardDto> rewards, TanpinBannerData bannerData) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = rewards.iterator();
        while (it.hasNext()) {
            String renderId = ((CasesAwardDto) it.next()).getRenderId();
            if (renderId != null) {
                arrayList.add(renderId);
            }
        }
        return CollectionsKt___CollectionsKt.plus((Collection) arrayList, (Iterable) CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{bannerData.getBannerBgImage(), bannerData.getBannerCaseImage(), bannerData.getBannerRightImage()}));
    }

    public final CaseReward toCaseReward(CasesAwardDto casesAwardDto, Map<String, Bitmap> map) {
        CommonRarityEnum rarityFromEnum = casesAwardDto.getRarityFromEnum();
        String renderId = casesAwardDto.getRenderId();
        if (renderId == null) {
            renderId = "";
        }
        return new CaseReward(0, 0, null, null, null, null, 0, null, rarityFromEnum, false, false, false, 0, false, null, renderId, 0, 98047, null);
    }

    public final CasesBannerAttachment toCasesBannerAttachment(TanpinBannerData tanpinBannerData, Bitmap bitmap, Bitmap bitmap2, Map<String, Bitmap> map, List<CaseReward> list) {
        return new CasesBannerAttachment(bitmap, bitmap2, map.get(tanpinBannerData.getBannerRightImage()), tanpinBannerData.getCurrentCaseTitle(), tanpinBannerData.getCongratulationText(), tanpinBannerData.getCurrentPrizesText(), StringExtensionKt.htmlTextToAnnotatedString(tanpinBannerData.getTitle()), StringExtensionKt.htmlTextToAnnotatedString(tanpinBannerData.getDescription()), StringExtensionKt.htmlTextToAnnotatedString(tanpinBannerData.getInstructionRight()), tanpinBannerData.getButtonText(), new CasesBannerSelectedCase(list, null, null, null, 14, null));
    }
}
