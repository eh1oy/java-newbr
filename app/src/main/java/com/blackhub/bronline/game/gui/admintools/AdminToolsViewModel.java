package com.blackhub.bronline.game.gui.admintools;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.admintools.model.ATTemplateModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: AdminToolsViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u000e\u0010 \u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u0018J\u0016\u0010#\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010$\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018J\u001e\u0010%\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010&\u001a\u00020'J\u0006\u0010(\u001a\u00020\u0013J\u000e\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020'J\u000e\u0010+\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010,\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010-\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J'\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020'2\u0006\u00100\u001a\u00020'2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u00102J/\u00103\u001a\u00020\u00132\u0006\u00104\u001a\u00020\u00182\u0006\u0010/\u001a\u00020'2\u0006\u00100\u001a\u00020'2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u00105J\u000e\u00106\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u00107\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u00108\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u00109\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006:"}, d2 = {"Lcom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/admintools/AdminToolsUiState;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/admintools/AdminToolsActionWithJSON;", "stringResource", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "(Lcom/blackhub/bronline/game/gui/admintools/AdminToolsActionWithJSON;Lcom/blackhub/bronline/game/core/resources/StringResource;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getStringResource", "()Lcom/blackhub/bronline/game/core/resources/StringResource;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "cancelConfirmationAndOpenTrackingPanel", "", "closeReportTemplateAndOpenTable", "closeTable", "closeTableAndOpenEditTemplate", "buttonId", "", "closeTableAndOpenTemplate", "deleteTemplateInTable", "getButtonsList", "", "Lcom/blackhub/bronline/game/gui/admintools/model/ATTemplateModel;", "json", "Lorg/json/JSONObject;", "initJson", "selectTypeScreen", "screenType", "sendButton", "sendButtonId", "sendButtonIdAndSetCategoryTitle", "categoryTitle", "", "sendCloseScreen", "sendCustomReport", "reportText", "sendReportButton", "sendReportCancelButton", "sendReportTableButton", "sendTemplateCreate", "templateTitle", "templateDesc", "templateTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "sendTemplateEdit", "templateId", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "sendTrackingPanelButton", "sendTrackingPanelCategoryButton", "sendTrackingPanelTableButtonAndCloseTable", "updateJson", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAdminToolsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 4 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n*L\n1#1,467:1\n230#2,5:468\n230#2,5:473\n230#2,5:478\n230#2,5:483\n51#3,5:488\n56#3,11:502\n8#4,9:493\n*S KotlinDebug\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel\n*L\n334#1:468,5\n424#1:473,5\n440#1:478,5\n449#1:483,5\n465#1:488,5\n465#1:502,11\n465#1:493,9\n*E\n"})
/* loaded from: classes3.dex */
public final class AdminToolsViewModel extends BaseViewModel<AdminToolsUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<AdminToolsUiState> _uiState;

    @NotNull
    public final AdminToolsActionWithJSON actionWithJSON;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<AdminToolsUiState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Inject
    public AdminToolsViewModel(@NotNull AdminToolsActionWithJSON actionWithJSON, @NotNull StringResource stringResource) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        this.actionWithJSON = actionWithJSON;
        this.stringResource = stringResource;
        this._uiState = StateFlowKt.MutableStateFlow(new AdminToolsUiState(0, 0, null, null, null, null, null, null, 0, null, null, false, false, false, false, false, 65535, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends AdminToolsUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<AdminToolsUiState> getUiState() {
        return this.uiState;
    }

    public final void initJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new AdminToolsViewModel$initJson$1(json, this, null), 1, null);
    }

    public final void updateJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new AdminToolsViewModel$updateJson$1(json, this, null), 1, null);
    }

    public final void sendTrackingPanelButton(int buttonId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new AdminToolsViewModel$sendTrackingPanelButton$1(this, buttonId, null), 1, null);
    }

    public final void sendTrackingPanelCategoryButton(int buttonId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new AdminToolsViewModel$sendTrackingPanelCategoryButton$1(this, buttonId, null), 1, null);
    }

    public final void sendReportButton(int buttonId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new AdminToolsViewModel$sendReportButton$1(this, buttonId, null), 1, null);
    }

    public final void sendReportCancelButton(int buttonId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new AdminToolsViewModel$sendReportCancelButton$1(this, buttonId, null), 1, null);
    }

    public final void sendButtonId(int screenType, int buttonId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new AdminToolsViewModel$sendButtonId$1(this, screenType, buttonId, null), 1, null);
    }

    public final void sendButtonIdAndSetCategoryTitle(int screenType, int buttonId, @NotNull String categoryTitle) {
        Intrinsics.checkNotNullParameter(categoryTitle, "categoryTitle");
        ViewModelExtensionKt.launchOnIO$default(this, null, new AdminToolsViewModel$sendButtonIdAndSetCategoryTitle$1(this, screenType, buttonId, categoryTitle, null), 1, null);
    }

    public final void sendButton(int screenType, int buttonId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new AdminToolsViewModel$sendButton$1(this, screenType, buttonId, null), 1, null);
    }

    public final void selectTypeScreen(int screenType) {
        AdminToolsUiState value;
        AdminToolsUiState copy;
        MutableStateFlow<? extends AdminToolsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r34 & 1) != 0 ? r2.screenType : screenType, (r34 & 2) != 0 ? r2.playerId : 0, (r34 & 4) != 0 ? r2.playerName : null, (r34 & 8) != 0 ? r2.playerReport : null, (r34 & 16) != 0 ? r2.playerInfoList : null, (r34 & 32) != 0 ? r2.tableTitle : null, (r34 & 64) != 0 ? r2.templateTitle : null, (r34 & 128) != 0 ? r2.categoryTitle : null, (r34 & 256) != 0 ? r2.categoryId : 0, (r34 & 512) != 0 ? r2.templateList : null, (r34 & 1024) != 0 ? r2.currentTemplate : null, (r34 & 2048) != 0 ? r2.isShowTable : false, (r34 & 4096) != 0 ? r2.isShowConfirmation : false, (r34 & 8192) != 0 ? r2.isInterfaceVisible : false, (r34 & 16384) != 0 ? r2.isNeedClose : false, (r34 & 32768) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public static /* synthetic */ void sendTemplateCreate$default(AdminToolsViewModel adminToolsViewModel, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        adminToolsViewModel.sendTemplateCreate(str, str2, num);
    }

    public final void sendTemplateCreate(@NotNull String templateTitle, @NotNull String templateDesc, @Nullable Integer templateTime) {
        Intrinsics.checkNotNullParameter(templateTitle, "templateTitle");
        Intrinsics.checkNotNullParameter(templateDesc, "templateDesc");
        ViewModelExtensionKt.launchOnIO$default(this, null, new AdminToolsViewModel$sendTemplateCreate$1(this, templateTitle, templateDesc, templateTime, null), 1, null);
    }

    public static /* synthetic */ void sendTemplateEdit$default(AdminToolsViewModel adminToolsViewModel, int i, String str, String str2, Integer num, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            num = null;
        }
        adminToolsViewModel.sendTemplateEdit(i, str, str2, num);
    }

    public final void sendTemplateEdit(int templateId, @NotNull String templateTitle, @NotNull String templateDesc, @Nullable Integer templateTime) {
        Intrinsics.checkNotNullParameter(templateTitle, "templateTitle");
        Intrinsics.checkNotNullParameter(templateDesc, "templateDesc");
        this.actionWithJSON.sendTemplateEdit(templateId, templateTitle, templateDesc, templateTime);
    }

    public final void sendTrackingPanelTableButtonAndCloseTable(int buttonId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new AdminToolsViewModel$sendTrackingPanelTableButtonAndCloseTable$1(this, buttonId, null), 1, null);
    }

    public final void sendReportTableButton(int buttonId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new AdminToolsViewModel$sendReportTableButton$1(this, buttonId, null), 1, null);
    }

    public final void closeTableAndOpenTemplate(int buttonId) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new AdminToolsViewModel$closeTableAndOpenTemplate$1(this, buttonId, null), 1, null);
    }

    public final void closeTableAndOpenEditTemplate(int buttonId) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new AdminToolsViewModel$closeTableAndOpenEditTemplate$1(this, buttonId, null), 1, null);
    }

    public final void deleteTemplateInTable(int buttonId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new AdminToolsViewModel$deleteTemplateInTable$1(this, buttonId, null), 1, null);
    }

    public final void closeReportTemplateAndOpenTable() {
        AdminToolsUiState value;
        AdminToolsUiState copy;
        MutableStateFlow<? extends AdminToolsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r34 & 1) != 0 ? r2.screenType : 3, (r34 & 2) != 0 ? r2.playerId : 0, (r34 & 4) != 0 ? r2.playerName : null, (r34 & 8) != 0 ? r2.playerReport : null, (r34 & 16) != 0 ? r2.playerInfoList : null, (r34 & 32) != 0 ? r2.tableTitle : null, (r34 & 64) != 0 ? r2.templateTitle : null, (r34 & 128) != 0 ? r2.categoryTitle : null, (r34 & 256) != 0 ? r2.categoryId : 0, (r34 & 512) != 0 ? r2.templateList : null, (r34 & 1024) != 0 ? r2.currentTemplate : null, (r34 & 2048) != 0 ? r2.isShowTable : true, (r34 & 4096) != 0 ? r2.isShowConfirmation : false, (r34 & 8192) != 0 ? r2.isInterfaceVisible : false, (r34 & 16384) != 0 ? r2.isNeedClose : false, (r34 & 32768) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void sendCustomReport(@NotNull String reportText) {
        Intrinsics.checkNotNullParameter(reportText, "reportText");
        ViewModelExtensionKt.launchOnIO$default(this, null, new AdminToolsViewModel$sendCustomReport$1(this, reportText, null), 1, null);
    }

    public final void cancelConfirmationAndOpenTrackingPanel() {
        AdminToolsUiState value;
        AdminToolsUiState copy;
        MutableStateFlow<? extends AdminToolsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r34 & 1) != 0 ? r2.screenType : 1, (r34 & 2) != 0 ? r2.playerId : 0, (r34 & 4) != 0 ? r2.playerName : null, (r34 & 8) != 0 ? r2.playerReport : null, (r34 & 16) != 0 ? r2.playerInfoList : null, (r34 & 32) != 0 ? r2.tableTitle : null, (r34 & 64) != 0 ? r2.templateTitle : null, (r34 & 128) != 0 ? r2.categoryTitle : null, (r34 & 256) != 0 ? r2.categoryId : 0, (r34 & 512) != 0 ? r2.templateList : null, (r34 & 1024) != 0 ? r2.currentTemplate : null, (r34 & 2048) != 0 ? r2.isShowTable : true, (r34 & 4096) != 0 ? r2.isShowConfirmation : false, (r34 & 8192) != 0 ? r2.isInterfaceVisible : false, (r34 & 16384) != 0 ? r2.isNeedClose : false, (r34 & 32768) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void closeTable() {
        AdminToolsUiState value;
        AdminToolsUiState copy;
        MutableStateFlow<? extends AdminToolsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r34 & 1) != 0 ? r2.screenType : 0, (r34 & 2) != 0 ? r2.playerId : 0, (r34 & 4) != 0 ? r2.playerName : null, (r34 & 8) != 0 ? r2.playerReport : null, (r34 & 16) != 0 ? r2.playerInfoList : null, (r34 & 32) != 0 ? r2.tableTitle : null, (r34 & 64) != 0 ? r2.templateTitle : null, (r34 & 128) != 0 ? r2.categoryTitle : null, (r34 & 256) != 0 ? r2.categoryId : 0, (r34 & 512) != 0 ? r2.templateList : null, (r34 & 1024) != 0 ? r2.currentTemplate : null, (r34 & 2048) != 0 ? r2.isShowTable : false, (r34 & 4096) != 0 ? r2.isShowConfirmation : false, (r34 & 8192) != 0 ? r2.isInterfaceVisible : false, (r34 & 16384) != 0 ? r2.isNeedClose : false, (r34 & 32768) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void sendCloseScreen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new AdminToolsViewModel$sendCloseScreen$1(this, null), 1, null);
    }

    public final List<ATTemplateModel> getButtonsList(JSONObject json) {
        Object obj;
        JSONArray optJSONArray = json.optJSONArray(AdminToolsKeys.ADMIN_TOOLS_BUTTONS_ARRAY_KEY);
        ArrayList arrayList = null;
        if (optJSONArray != null) {
            try {
                ArrayList arrayList2 = new ArrayList();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = optJSONArray.getJSONObject(i);
                    Intrinsics.checkNotNull(jSONObject);
                    try {
                        Gson gson = new Gson();
                        String jSONObject2 = jSONObject.toString();
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
                        obj = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) jSONObject2).toString(), (Class<Object>) ATTemplateModel.class);
                    } catch (Exception e) {
                        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                        firebaseCrashlytics.log(e.toString());
                        firebaseCrashlytics.recordException(e);
                        obj = null;
                    }
                    if (obj != null) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = arrayList2;
            } catch (Exception e2) {
                FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                firebaseCrashlytics2.log(e2.toString());
                firebaseCrashlytics2.recordException(e2);
            }
        }
        return arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
    }
}
