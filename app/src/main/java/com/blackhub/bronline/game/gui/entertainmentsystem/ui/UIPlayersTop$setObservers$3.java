package com.blackhub.bronline.game.gui.entertainmentsystem.ui;

import com.blackhub.bronline.game.gui.entertainmentsystem.adapters.EntertainmentSystemPlayersTopAdapter;
import com.blackhub.bronline.game.gui.entertainmentsystem.data.EntertainmentPlayersData;
import com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
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
/* compiled from: UIPlayersTop.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIPlayersTop$setObservers$3", f = "UIPlayersTop.kt", i = {}, l = {214}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class UIPlayersTop$setObservers$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ UIPlayersTop this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIPlayersTop$setObservers$3(UIPlayersTop uIPlayersTop, Continuation<? super UIPlayersTop$setObservers$3> continuation) {
        super(2, continuation);
        this.this$0 = uIPlayersTop;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UIPlayersTop$setObservers$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UIPlayersTop$setObservers$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        EntertainmentGamesViewModel gamesViewModel;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            gamesViewModel = this.this$0.getGamesViewModel();
            StateFlow<List<EntertainmentPlayersData>> currentPlayerTop = gamesViewModel.getCurrentPlayerTop();
            final UIPlayersTop uIPlayersTop = this.this$0;
            FlowCollector<? super List<EntertainmentPlayersData>> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIPlayersTop$setObservers$3.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List<EntertainmentPlayersData>) obj2, (Continuation<? super Unit>) continuation);
                }

                @Nullable
                public final Object emit(@NotNull List<EntertainmentPlayersData> list, @NotNull Continuation<? super Unit> continuation) {
                    EntertainmentSystemPlayersTopAdapter entertainmentSystemPlayersTopAdapter;
                    String gameName;
                    if (!list.isEmpty()) {
                        entertainmentSystemPlayersTopAdapter = UIPlayersTop.this.currentPlayerTopAdapter;
                        if (entertainmentSystemPlayersTopAdapter != null) {
                            entertainmentSystemPlayersTopAdapter.initTopPlayers(list);
                        }
                        UIPlayersTop uIPlayersTop2 = UIPlayersTop.this;
                        int position = ((EntertainmentPlayersData) CollectionsKt___CollectionsKt.first((List) list)).getPosition();
                        gameName = UIPlayersTop.this.getGameName(((EntertainmentPlayersData) CollectionsKt___CollectionsKt.first((List) list)).getThisGame());
                        uIPlayersTop2.updateMainStatus(position, gameName);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (currentPlayerTop.collect(flowCollector, this) == coroutine_suspended) {
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
