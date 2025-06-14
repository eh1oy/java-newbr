package com.blackhub.bronline.game.gui.tuning.ui;

import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningCollapseViewModel;
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
import org.apache.commons.compress.harmony.pack200.BcBands;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UILayoutTuningCollapse.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$1", f = "UILayoutTuningCollapse.kt", i = {}, l = {129, 135, Cea708Decoder.COMMAND_DLY, 147, Cea708Decoder.COMMAND_DF1, 159, MatroskaExtractor.ID_BLOCK_ADDITIONAL, BcBands.LOOKUPSWITCH, 177}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class UILayoutTuningCollapse$setObservers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $currentSelectorId;
    public int label;
    public final /* synthetic */ UILayoutTuningCollapse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UILayoutTuningCollapse$setObservers$1(int i, UILayoutTuningCollapse uILayoutTuningCollapse, Continuation<? super UILayoutTuningCollapse$setObservers$1> continuation) {
        super(2, continuation);
        this.$currentSelectorId = i;
        this.this$0 = uILayoutTuningCollapse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UILayoutTuningCollapse$setObservers$1(this.$currentSelectorId, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UILayoutTuningCollapse$setObservers$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        TuningCollapseViewModel collapseViewModel;
        TuningCollapseViewModel collapseViewModel2;
        TuningCollapseViewModel collapseViewModel3;
        TuningCollapseViewModel collapseViewModel4;
        TuningCollapseViewModel collapseViewModel5;
        TuningCollapseViewModel collapseViewModel6;
        TuningCollapseViewModel collapseViewModel7;
        TuningCollapseViewModel collapseViewModel8;
        TuningCollapseViewModel collapseViewModel9;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                switch (this.$currentSelectorId) {
                    case 22:
                        collapseViewModel = this.this$0.getCollapseViewModel();
                        StateFlow<Integer> newFullClearance = collapseViewModel.getNewFullClearance();
                        final UILayoutTuningCollapse uILayoutTuningCollapse = this.this$0;
                        FlowCollector<? super Integer> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$1.1
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                                return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                            }

                            @Nullable
                            public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                                UILayoutTuningCollapse.this.setParamsInView(i);
                                return Unit.INSTANCE;
                            }
                        };
                        this.label = 1;
                        if (newFullClearance.collect(flowCollector, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        throw new KotlinNothingValueException();
                    case 23:
                        collapseViewModel2 = this.this$0.getCollapseViewModel();
                        StateFlow<Integer> newIndividualClearance = collapseViewModel2.getNewIndividualClearance();
                        final UILayoutTuningCollapse uILayoutTuningCollapse2 = this.this$0;
                        FlowCollector<? super Integer> flowCollector2 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$1.2
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                                return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                            }

                            @Nullable
                            public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                                UILayoutTuningCollapse.this.setParamsInView(i);
                                return Unit.INSTANCE;
                            }
                        };
                        this.label = 2;
                        if (newIndividualClearance.collect(flowCollector2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        throw new KotlinNothingValueException();
                    case 24:
                        collapseViewModel3 = this.this$0.getCollapseViewModel();
                        StateFlow<Integer> newDepartureFrontWheels = collapseViewModel3.getNewDepartureFrontWheels();
                        final UILayoutTuningCollapse uILayoutTuningCollapse3 = this.this$0;
                        FlowCollector<? super Integer> flowCollector3 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$1.3
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                                return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                            }

                            @Nullable
                            public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                                UILayoutTuningCollapse.this.setParamsInView(i);
                                return Unit.INSTANCE;
                            }
                        };
                        this.label = 3;
                        if (newDepartureFrontWheels.collect(flowCollector3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        throw new KotlinNothingValueException();
                    case 25:
                        collapseViewModel4 = this.this$0.getCollapseViewModel();
                        StateFlow<Integer> newDepartureBackWheels = collapseViewModel4.getNewDepartureBackWheels();
                        final UILayoutTuningCollapse uILayoutTuningCollapse4 = this.this$0;
                        FlowCollector<? super Integer> flowCollector4 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$1.4
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                                return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                            }

                            @Nullable
                            public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                                UILayoutTuningCollapse.this.setParamsInView(i);
                                return Unit.INSTANCE;
                            }
                        };
                        this.label = 4;
                        if (newDepartureBackWheels.collect(flowCollector4, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        throw new KotlinNothingValueException();
                    case 26:
                        collapseViewModel5 = this.this$0.getCollapseViewModel();
                        StateFlow<Integer> newCollapseFront = collapseViewModel5.getNewCollapseFront();
                        final UILayoutTuningCollapse uILayoutTuningCollapse5 = this.this$0;
                        FlowCollector<? super Integer> flowCollector5 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$1.5
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                                return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                            }

                            @Nullable
                            public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                                UILayoutTuningCollapse.this.setParamsInView(i);
                                return Unit.INSTANCE;
                            }
                        };
                        this.label = 5;
                        if (newCollapseFront.collect(flowCollector5, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        throw new KotlinNothingValueException();
                    case 27:
                        collapseViewModel6 = this.this$0.getCollapseViewModel();
                        StateFlow<Integer> newCollapseBack = collapseViewModel6.getNewCollapseBack();
                        final UILayoutTuningCollapse uILayoutTuningCollapse6 = this.this$0;
                        FlowCollector<? super Integer> flowCollector6 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$1.6
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                                return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                            }

                            @Nullable
                            public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                                UILayoutTuningCollapse.this.setParamsInView(i);
                                return Unit.INSTANCE;
                            }
                        };
                        this.label = 6;
                        if (newCollapseBack.collect(flowCollector6, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        throw new KotlinNothingValueException();
                    case 28:
                        collapseViewModel7 = this.this$0.getCollapseViewModel();
                        StateFlow<Integer> newWidthFrontWheels = collapseViewModel7.getNewWidthFrontWheels();
                        final UILayoutTuningCollapse uILayoutTuningCollapse7 = this.this$0;
                        FlowCollector<? super Integer> flowCollector7 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$1.7
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                                return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                            }

                            @Nullable
                            public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                                UILayoutTuningCollapse.this.setParamsInView(i);
                                return Unit.INSTANCE;
                            }
                        };
                        this.label = 7;
                        if (newWidthFrontWheels.collect(flowCollector7, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        throw new KotlinNothingValueException();
                    case 29:
                        collapseViewModel8 = this.this$0.getCollapseViewModel();
                        StateFlow<Integer> newWithBackWheels = collapseViewModel8.getNewWithBackWheels();
                        final UILayoutTuningCollapse uILayoutTuningCollapse8 = this.this$0;
                        FlowCollector<? super Integer> flowCollector8 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$1.8
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                                return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                            }

                            @Nullable
                            public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                                UILayoutTuningCollapse.this.setParamsInView(i);
                                return Unit.INSTANCE;
                            }
                        };
                        this.label = 8;
                        if (newWithBackWheels.collect(flowCollector8, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        throw new KotlinNothingValueException();
                    case 30:
                        collapseViewModel9 = this.this$0.getCollapseViewModel();
                        StateFlow<Integer> newRadiusWheels = collapseViewModel9.getNewRadiusWheels();
                        final UILayoutTuningCollapse uILayoutTuningCollapse9 = this.this$0;
                        FlowCollector<? super Integer> flowCollector9 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$1.9
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                                return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                            }

                            @Nullable
                            public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                                UILayoutTuningCollapse.this.setParamsInView(i);
                                return Unit.INSTANCE;
                            }
                        };
                        this.label = 9;
                        if (newRadiusWheels.collect(flowCollector9, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        throw new KotlinNothingValueException();
                    default:
                        return Unit.INSTANCE;
                }
            case 1:
                ResultKt.throwOnFailure(obj);
                throw new KotlinNothingValueException();
            case 2:
                ResultKt.throwOnFailure(obj);
                throw new KotlinNothingValueException();
            case 3:
                ResultKt.throwOnFailure(obj);
                throw new KotlinNothingValueException();
            case 4:
                ResultKt.throwOnFailure(obj);
                throw new KotlinNothingValueException();
            case 5:
                ResultKt.throwOnFailure(obj);
                throw new KotlinNothingValueException();
            case 6:
                ResultKt.throwOnFailure(obj);
                throw new KotlinNothingValueException();
            case 7:
                ResultKt.throwOnFailure(obj);
                throw new KotlinNothingValueException();
            case 8:
                ResultKt.throwOnFailure(obj);
                throw new KotlinNothingValueException();
            case 9:
                ResultKt.throwOnFailure(obj);
                throw new KotlinNothingValueException();
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
