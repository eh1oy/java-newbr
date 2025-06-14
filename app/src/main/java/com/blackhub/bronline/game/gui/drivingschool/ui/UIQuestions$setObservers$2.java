package com.blackhub.bronline.game.gui.drivingschool.ui;

import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.DrivingSchoolQuestionsLayoutBinding;
import com.blackhub.bronline.game.gui.drivingschool.data.CurrentAndAllQuestions;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolQuestsViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UIQuestions.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$setObservers$2", f = "UIQuestions.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class UIQuestions$setObservers$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ UIQuestions this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIQuestions$setObservers$2(UIQuestions uIQuestions, Continuation<? super UIQuestions$setObservers$2> continuation) {
        super(2, continuation);
        this.this$0 = uIQuestions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UIQuestions$setObservers$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UIQuestions$setObservers$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        DrivingSchoolQuestsViewModel questsViewModel;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            questsViewModel = this.this$0.getQuestsViewModel();
            StateFlow<CurrentAndAllQuestions> valueOfQuestions = questsViewModel.getValueOfQuestions();
            final UIQuestions uIQuestions = this.this$0;
            FlowCollector<? super CurrentAndAllQuestions> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$setObservers$2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((CurrentAndAllQuestions) obj2, (Continuation<? super Unit>) continuation);
                }

                @Nullable
                public final Object emit(@NotNull CurrentAndAllQuestions currentAndAllQuestions, @NotNull Continuation<? super Unit> continuation) {
                    DrivingSchoolQuestionsLayoutBinding binding;
                    binding = UIQuestions.this.getBinding();
                    binding.valueCorrectAnswers.setText(UIQuestions.this.requireActivity().getString(R.string.common_current_and_max_values_with_spaces, Boxing.boxInt(currentAndAllQuestions.getCurrentValueOfQuestion()), Boxing.boxInt(currentAndAllQuestions.getAllValueOfQuestions())));
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (valueOfQuestions.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
