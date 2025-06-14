package com.blackhub.bronline.game.gui.admintools;

import com.blackhub.bronline.game.gui.admintools.model.ATTemplateModel;
import java.util.Iterator;
import java.util.List;
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

/* compiled from: AdminToolsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$closeTableAndOpenTemplate$1", f = "AdminToolsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nAdminToolsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$closeTableAndOpenTemplate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,467:1\n288#2,2:468\n230#3,5:470\n*S KotlinDebug\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$closeTableAndOpenTemplate$1\n*L\n386#1:468,2\n387#1:470,5\n*E\n"})
/* loaded from: classes3.dex */
public final class AdminToolsViewModel$closeTableAndOpenTemplate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $buttonId;
    public int label;
    public final /* synthetic */ AdminToolsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdminToolsViewModel$closeTableAndOpenTemplate$1(AdminToolsViewModel adminToolsViewModel, int i, Continuation<? super AdminToolsViewModel$closeTableAndOpenTemplate$1> continuation) {
        super(2, continuation);
        this.this$0 = adminToolsViewModel;
        this.$buttonId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AdminToolsViewModel$closeTableAndOpenTemplate$1(this.this$0, this.$buttonId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AdminToolsViewModel$closeTableAndOpenTemplate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object obj2;
        AdminToolsUiState value;
        AdminToolsUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<ATTemplateModel> templateList = this.this$0.get_uiState().getValue().getTemplateList();
        int i = this.$buttonId;
        Iterator<T> it = templateList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((ATTemplateModel) obj2).getTemplateId() == i) {
                break;
            }
        }
        ATTemplateModel aTTemplateModel = (ATTemplateModel) obj2;
        MutableStateFlow<? extends AdminToolsUiState> mutableStateFlow = this.this$0.get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r4.copy((r34 & 1) != 0 ? r4.screenType : 32, (r34 & 2) != 0 ? r4.playerId : 0, (r34 & 4) != 0 ? r4.playerName : null, (r34 & 8) != 0 ? r4.playerReport : null, (r34 & 16) != 0 ? r4.playerInfoList : null, (r34 & 32) != 0 ? r4.tableTitle : null, (r34 & 64) != 0 ? r4.templateTitle : null, (r34 & 128) != 0 ? r4.categoryTitle : null, (r34 & 256) != 0 ? r4.categoryId : 0, (r34 & 512) != 0 ? r4.templateList : null, (r34 & 1024) != 0 ? r4.currentTemplate : aTTemplateModel, (r34 & 2048) != 0 ? r4.isShowTable : false, (r34 & 4096) != 0 ? r4.isShowConfirmation : false, (r34 & 8192) != 0 ? r4.isInterfaceVisible : false, (r34 & 16384) != 0 ? r4.isNeedClose : false, (r34 & 32768) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        return Unit.INSTANCE;
    }
}
