package com.blackhub.bronline.game.gui.blackpass;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskModel;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskState;
import com.blackhub.bronline.game.gui.blackpass.ui.BlackPassTaskInfoDialog;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUIBlackPassMain.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$setObservers$4", f = "GUIBlackPassMain.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class GUIBlackPassMain$setObservers$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ GUIBlackPassMain this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GUIBlackPassMain$setObservers$4(GUIBlackPassMain gUIBlackPassMain, Continuation<? super GUIBlackPassMain$setObservers$4> continuation) {
        super(2, continuation);
        this.this$0 = gUIBlackPassMain;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GUIBlackPassMain$setObservers$4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((GUIBlackPassMain$setObservers$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        BlackPassMainViewModel blackPassMainViewModel;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            blackPassMainViewModel = this.this$0.getBlackPassMainViewModel();
            StateFlow<CommonTaskModel> taskPreviewItem = blackPassMainViewModel.getTaskPreviewItem();
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            Flow flowWithLifecycle = FlowExtKt.flowWithLifecycle(taskPreviewItem, lifecycle, Lifecycle.State.STARTED);
            final GUIBlackPassMain gUIBlackPassMain = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$setObservers$4.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((CommonTaskModel) obj2, (Continuation<? super Unit>) continuation);
                }

                @Nullable
                public final Object emit(@Nullable final CommonTaskModel commonTaskModel, @NotNull Continuation<? super Unit> continuation) {
                    BlackPassTaskInfoDialog blackPassTaskInfoDialog;
                    BlackPassTaskInfoDialog blackPassTaskInfoDialog2;
                    BlackPassTaskInfoDialog blackPassTaskInfoDialog3;
                    blackPassTaskInfoDialog = GUIBlackPassMain.this.taskDialog;
                    if (blackPassTaskInfoDialog != null) {
                        final GUIBlackPassMain gUIBlackPassMain2 = GUIBlackPassMain.this;
                        blackPassTaskInfoDialog.setTaskInfoDialogClickListener(new Function1<CommonTaskModel, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.setObservers.4.1.1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(CommonTaskModel commonTaskModel2) {
                                invoke2(commonTaskModel2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull CommonTaskModel task) {
                                BlackPassMainViewModel blackPassMainViewModel2;
                                Intrinsics.checkNotNullParameter(task, "task");
                                blackPassMainViewModel2 = GUIBlackPassMain.this.getBlackPassMainViewModel();
                                Integer valueOf = Integer.valueOf(task.getId());
                                String string = GUIBlackPassMain.this.getString(R.string.black_pass_task_change_title);
                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                String string2 = GUIBlackPassMain.this.getString(R.string.common_bc);
                                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                String string3 = GUIBlackPassMain.this.getString(R.string.common_confirmation);
                                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                                String string4 = GUIBlackPassMain.this.getString(R.string.common_yes);
                                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                                String string5 = GUIBlackPassMain.this.getString(R.string.common_no);
                                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                                BlackPassMainViewModel.showDialogConfirmation$default(blackPassMainViewModel2, valueOf, string, 10, null, string2, string3, string4, string5, 2, 8, null);
                            }
                        });
                    }
                    if (commonTaskModel != null) {
                        blackPassTaskInfoDialog3 = GUIBlackPassMain.this.taskDialog;
                        if (blackPassTaskInfoDialog3 != null) {
                            boolean z = commonTaskModel.getStateOfTask() != CommonTaskState.TRACK_STATE;
                            final GUIBlackPassMain gUIBlackPassMain3 = GUIBlackPassMain.this;
                            blackPassTaskInfoDialog3.showTaskInfo(commonTaskModel, z, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.setObservers.4.1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    BlackPassTaskInfoDialog blackPassTaskInfoDialog4;
                                    BlackPassMainViewModel blackPassMainViewModel2;
                                    blackPassTaskInfoDialog4 = GUIBlackPassMain.this.taskDialog;
                                    if (blackPassTaskInfoDialog4 != null) {
                                        blackPassTaskInfoDialog4.dismiss();
                                    }
                                    blackPassMainViewModel2 = GUIBlackPassMain.this.getBlackPassMainViewModel();
                                    blackPassMainViewModel2.onTaskClick(commonTaskModel);
                                }
                            });
                        }
                    } else {
                        blackPassTaskInfoDialog2 = GUIBlackPassMain.this.taskDialog;
                        if (blackPassTaskInfoDialog2 != null) {
                            blackPassTaskInfoDialog2.dismiss();
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
