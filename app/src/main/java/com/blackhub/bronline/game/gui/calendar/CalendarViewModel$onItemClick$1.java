package com.blackhub.bronline.game.gui.calendar;

import android.graphics.Bitmap;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState;
import com.blackhub.bronline.game.gui.calendar.model.CalendarBonusRewardState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CalendarViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.calendar.CalendarViewModel$onItemClick$1", f = "CalendarViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCalendarViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarViewModel.kt\ncom/blackhub/bronline/game/gui/calendar/CalendarViewModel$onItemClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,899:1\n230#2,5:900\n*S KotlinDebug\n*F\n+ 1 CalendarViewModel.kt\ncom/blackhub/bronline/game/gui/calendar/CalendarViewModel$onItemClick$1\n*L\n540#1:900,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CalendarViewModel$onItemClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Bitmap $bitmap;
    public final /* synthetic */ int $index;
    public final /* synthetic */ boolean $isFromMainList;
    public int label;
    public final /* synthetic */ CalendarViewModel this$0;

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: CalendarViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CalendarBonusRewardState.values().length];
            try {
                iArr[CalendarBonusRewardState.AVAILABLE_NORM_LEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CommonRewardState.values().length];
            try {
                iArr2[CommonRewardState.NORM_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[CommonRewardState.EPIC_AVAILABLE_NORW_LEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarViewModel$onItemClick$1(CalendarViewModel calendarViewModel, boolean z, int i, Bitmap bitmap, Continuation<? super CalendarViewModel$onItemClick$1> continuation) {
        super(2, continuation);
        this.this$0 = calendarViewModel;
        this.$isFromMainList = z;
        this.$index = i;
        this.$bitmap = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CalendarViewModel$onItemClick$1(this.this$0, this.$isFromMainList, this.$index, this.$bitmap, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CalendarViewModel$onItemClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0173 A[LOOP:0: B:18:0x00bd->B:20:0x0173, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x017b A[EDGE_INSN: B:21:0x017b->B:23:0x017b BREAK  A[LOOP:0: B:18:0x00bd->B:20:0x0173], SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r78) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.calendar.CalendarViewModel$onItemClick$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
