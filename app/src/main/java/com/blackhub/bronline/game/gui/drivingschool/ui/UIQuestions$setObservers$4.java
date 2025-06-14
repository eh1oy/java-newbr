package com.blackhub.bronline.game.gui.drivingschool.ui;

import com.blackhub.bronline.databinding.DrivingSchoolQuestionsLayoutBinding;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.drivingschool.utils.DrivingSchoolConstants;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolQuestsViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$setObservers$4", f = "UIQuestions.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class UIQuestions$setObservers$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ UIQuestions this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIQuestions$setObservers$4(UIQuestions uIQuestions, Continuation<? super UIQuestions$setObservers$4> continuation) {
        super(2, continuation);
        this.this$0 = uIQuestions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UIQuestions$setObservers$4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UIQuestions$setObservers$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            StateFlow<Integer> currentQuestID = questsViewModel.getCurrentQuestID();
            final UIQuestions uIQuestions = this.this$0;
            FlowCollector<? super Integer> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$setObservers$4.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                }

                @Nullable
                public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                    String str;
                    DrivingSchoolQuestionsLayoutBinding binding;
                    if (i2 != 2 && i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 6) {
                                if (i2 != 7) {
                                    if (i2 != 8) {
                                        if (i2 != 10) {
                                            switch (i2) {
                                                case 37:
                                                case 38:
                                                case 43:
                                                    break;
                                                case 39:
                                                    break;
                                                case 40:
                                                    break;
                                                case 41:
                                                    break;
                                                case 42:
                                                    break;
                                                default:
                                                    str = DrivingSchoolConstants.DRIVING_SCHOOL_ICON_TAG + i2;
                                                    break;
                                            }
                                            binding = UIQuestions.this.getBinding();
                                            binding.questionsIconRes.setImageDrawable(Useful.INSTANCE.getDrawableByName(str));
                                            return Unit.INSTANCE;
                                        }
                                    }
                                    str = "ds_icon_8";
                                    binding = UIQuestions.this.getBinding();
                                    binding.questionsIconRes.setImageDrawable(Useful.INSTANCE.getDrawableByName(str));
                                    return Unit.INSTANCE;
                                }
                                str = "ds_icon_7";
                                binding = UIQuestions.this.getBinding();
                                binding.questionsIconRes.setImageDrawable(Useful.INSTANCE.getDrawableByName(str));
                                return Unit.INSTANCE;
                            }
                            str = "ds_icon_6";
                            binding = UIQuestions.this.getBinding();
                            binding.questionsIconRes.setImageDrawable(Useful.INSTANCE.getDrawableByName(str));
                            return Unit.INSTANCE;
                        }
                        str = "ds_icon_4";
                        binding = UIQuestions.this.getBinding();
                        binding.questionsIconRes.setImageDrawable(Useful.INSTANCE.getDrawableByName(str));
                        return Unit.INSTANCE;
                    }
                    str = "ds_icon_default";
                    binding = UIQuestions.this.getBinding();
                    binding.questionsIconRes.setImageDrawable(Useful.INSTANCE.getDrawableByName(str));
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (currentQuestID.collect(flowCollector, this) == coroutine_suspended) {
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
