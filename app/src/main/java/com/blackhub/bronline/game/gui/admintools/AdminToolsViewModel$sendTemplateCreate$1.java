package com.blackhub.bronline.game.gui.admintools;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: AdminToolsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendTemplateCreate$1", f = "AdminToolsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nAdminToolsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$sendTemplateCreate$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,467:1\n230#2,5:468\n*S KotlinDebug\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$sendTemplateCreate$1\n*L\n348#1:468,5\n*E\n"})
/* loaded from: classes3.dex */
public final class AdminToolsViewModel$sendTemplateCreate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $templateDesc;
    public final /* synthetic */ Integer $templateTime;
    public final /* synthetic */ String $templateTitle;
    public int label;
    public final /* synthetic */ AdminToolsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdminToolsViewModel$sendTemplateCreate$1(AdminToolsViewModel adminToolsViewModel, String str, String str2, Integer num, Continuation<? super AdminToolsViewModel$sendTemplateCreate$1> continuation) {
        super(2, continuation);
        this.this$0 = adminToolsViewModel;
        this.$templateTitle = str;
        this.$templateDesc = str2;
        this.$templateTime = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AdminToolsViewModel$sendTemplateCreate$1(this.this$0, this.$templateTitle, this.$templateDesc, this.$templateTime, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AdminToolsViewModel$sendTemplateCreate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AdminToolsActionWithJSON adminToolsActionWithJSON;
        AdminToolsUiState value;
        AdminToolsUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            adminToolsActionWithJSON = this.this$0.actionWithJSON;
            adminToolsActionWithJSON.sendTemplateCreate(this.$templateTitle, this.$templateDesc, this.$templateTime);
            MutableStateFlow<? extends AdminToolsUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                copy = r3.copy((r34 & 1) != 0 ? r3.screenType : 6, (r34 & 2) != 0 ? r3.playerId : 0, (r34 & 4) != 0 ? r3.playerName : null, (r34 & 8) != 0 ? r3.playerReport : null, (r34 & 16) != 0 ? r3.playerInfoList : null, (r34 & 32) != 0 ? r3.tableTitle : null, (r34 & 64) != 0 ? r3.templateTitle : null, (r34 & 128) != 0 ? r3.categoryTitle : null, (r34 & 256) != 0 ? r3.categoryId : 0, (r34 & 512) != 0 ? r3.templateList : null, (r34 & 1024) != 0 ? r3.currentTemplate : null, (r34 & 2048) != 0 ? r3.isShowTable : false, (r34 & 4096) != 0 ? r3.isShowConfirmation : false, (r34 & 8192) != 0 ? r3.isInterfaceVisible : false, (r34 & 16384) != 0 ? r3.isNeedClose : false, (r34 & 32768) != 0 ? value.isBlockingLoading : false);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
