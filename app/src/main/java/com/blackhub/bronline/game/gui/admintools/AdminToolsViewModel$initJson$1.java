package com.blackhub.bronline.game.gui.admintools;

import com.blackhub.bronline.game.core.JNILib;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.gui.admintools.model.ATPlayerInfoItemModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AdminToolsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$initJson$1", f = "AdminToolsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nAdminToolsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$initJson$1\n+ 2 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 3 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,467:1\n51#2,5:468\n56#2,11:482\n8#3,9:473\n230#4,5:493\n230#4,5:498\n230#4,5:503\n*S KotlinDebug\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$initJson$1\n*L\n58#1:468,5\n58#1:482,11\n58#1:473,9\n60#1:493,5\n77#1:498,5\n90#1:503,5\n*E\n"})
/* loaded from: classes3.dex */
public final class AdminToolsViewModel$initJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ AdminToolsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdminToolsViewModel$initJson$1(JSONObject jSONObject, AdminToolsViewModel adminToolsViewModel, Continuation<? super AdminToolsViewModel$initJson$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = adminToolsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AdminToolsViewModel$initJson$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AdminToolsViewModel$initJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object obj2;
        AdminToolsUiState copy;
        AdminToolsUiState copy2;
        AdminToolsUiState value;
        AdminToolsUiState copy3;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int optInt = this.$json.optInt("t");
        if (IntExtensionKt.isNotZero(Boxing.boxInt(optInt))) {
            if (optInt == 1) {
                int optInt2 = this.$json.optInt("id");
                String optString = this.$json.optString("pn");
                JSONArray optJSONArray = this.$json.optJSONArray("pi");
                List list = null;
                if (optJSONArray != null) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        int length = optJSONArray.length();
                        for (int i = 0; i < length; i++) {
                            JSONObject jSONObject = optJSONArray.getJSONObject(i);
                            Intrinsics.checkNotNull(jSONObject);
                            try {
                                Gson gson = new Gson();
                                String jSONObject2 = jSONObject.toString();
                                Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
                                obj2 = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) jSONObject2).toString(), (Class<Object>) ATPlayerInfoItemModel.class);
                            } catch (Exception e) {
                                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                                firebaseCrashlytics.log(e.toString());
                                firebaseCrashlytics.recordException(e);
                                obj2 = null;
                            }
                            if (obj2 != null) {
                                Boxing.boxBoolean(arrayList.add(obj2));
                            }
                        }
                        list = arrayList;
                    } catch (Exception e2) {
                        FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                        firebaseCrashlytics2.log(e2.toString());
                        firebaseCrashlytics2.recordException(e2);
                    }
                }
                if (list == null) {
                    list = CollectionsKt__CollectionsKt.emptyList();
                }
                List list2 = list;
                MutableStateFlow<? extends AdminToolsUiState> mutableStateFlow = this.this$0.get_uiState();
                while (true) {
                    AdminToolsUiState value2 = mutableStateFlow.getValue();
                    Intrinsics.checkNotNull(optString);
                    MutableStateFlow<? extends AdminToolsUiState> mutableStateFlow2 = mutableStateFlow;
                    copy = r3.copy((r34 & 1) != 0 ? r3.screenType : optInt, (r34 & 2) != 0 ? r3.playerId : optInt2, (r34 & 4) != 0 ? r3.playerName : optString, (r34 & 8) != 0 ? r3.playerReport : null, (r34 & 16) != 0 ? r3.playerInfoList : list2, (r34 & 32) != 0 ? r3.tableTitle : null, (r34 & 64) != 0 ? r3.templateTitle : null, (r34 & 128) != 0 ? r3.categoryTitle : null, (r34 & 256) != 0 ? r3.categoryId : 0, (r34 & 512) != 0 ? r3.templateList : null, (r34 & 1024) != 0 ? r3.currentTemplate : null, (r34 & 2048) != 0 ? r3.isShowTable : false, (r34 & 4096) != 0 ? r3.isShowConfirmation : false, (r34 & 8192) != 0 ? r3.isInterfaceVisible : false, (r34 & 16384) != 0 ? r3.isNeedClose : false, (r34 & 32768) != 0 ? value2.isBlockingLoading : false);
                    if (mutableStateFlow2.compareAndSet(value2, copy)) {
                        break;
                    }
                    mutableStateFlow = mutableStateFlow2;
                }
            } else if (optInt == 3) {
                JNILib.toggleDrawing2dStuff(true);
                int optInt3 = this.$json.optInt("id");
                String optString2 = this.$json.optString("pn");
                String optString3 = this.$json.optString(AdminToolsKeys.ADMIN_TOOLS_PLAYER_TEXT_REPORT_KEY);
                MutableStateFlow<? extends AdminToolsUiState> mutableStateFlow3 = this.this$0.get_uiState();
                while (true) {
                    AdminToolsUiState value3 = mutableStateFlow3.getValue();
                    Intrinsics.checkNotNull(optString2);
                    Intrinsics.checkNotNull(optString3);
                    int i2 = optInt;
                    copy2 = r3.copy((r34 & 1) != 0 ? r3.screenType : optInt, (r34 & 2) != 0 ? r3.playerId : optInt3, (r34 & 4) != 0 ? r3.playerName : optString2, (r34 & 8) != 0 ? r3.playerReport : optString3, (r34 & 16) != 0 ? r3.playerInfoList : null, (r34 & 32) != 0 ? r3.tableTitle : null, (r34 & 64) != 0 ? r3.templateTitle : null, (r34 & 128) != 0 ? r3.categoryTitle : null, (r34 & 256) != 0 ? r3.categoryId : 0, (r34 & 512) != 0 ? r3.templateList : null, (r34 & 1024) != 0 ? r3.currentTemplate : null, (r34 & 2048) != 0 ? r3.isShowTable : false, (r34 & 4096) != 0 ? r3.isShowConfirmation : false, (r34 & 8192) != 0 ? r3.isInterfaceVisible : false, (r34 & 16384) != 0 ? r3.isNeedClose : false, (r34 & 32768) != 0 ? value3.isBlockingLoading : false);
                    if (mutableStateFlow3.compareAndSet(value3, copy2)) {
                        break;
                    }
                    optInt = i2;
                }
            } else if (optInt == 6) {
                JNILib.toggleDrawing2dStuff(true);
                MutableStateFlow<? extends AdminToolsUiState> mutableStateFlow4 = this.this$0.get_uiState();
                do {
                    value = mutableStateFlow4.getValue();
                    copy3 = r3.copy((r34 & 1) != 0 ? r3.screenType : optInt, (r34 & 2) != 0 ? r3.playerId : 0, (r34 & 4) != 0 ? r3.playerName : null, (r34 & 8) != 0 ? r3.playerReport : null, (r34 & 16) != 0 ? r3.playerInfoList : null, (r34 & 32) != 0 ? r3.tableTitle : null, (r34 & 64) != 0 ? r3.templateTitle : null, (r34 & 128) != 0 ? r3.categoryTitle : null, (r34 & 256) != 0 ? r3.categoryId : 0, (r34 & 512) != 0 ? r3.templateList : null, (r34 & 1024) != 0 ? r3.currentTemplate : null, (r34 & 2048) != 0 ? r3.isShowTable : false, (r34 & 4096) != 0 ? r3.isShowConfirmation : false, (r34 & 8192) != 0 ? r3.isInterfaceVisible : false, (r34 & 16384) != 0 ? r3.isNeedClose : false, (r34 & 32768) != 0 ? value.isBlockingLoading : false);
                } while (!mutableStateFlow4.compareAndSet(value, copy3));
            }
        }
        return Unit.INSTANCE;
    }
}
