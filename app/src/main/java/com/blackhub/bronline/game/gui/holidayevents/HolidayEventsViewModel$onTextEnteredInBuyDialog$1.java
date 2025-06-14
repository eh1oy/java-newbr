package com.blackhub.bronline.game.gui.holidayevents;

import android.text.TextUtils;
import androidx.compose.ui.text.AnnotatedString;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.gui.Useful;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HolidayEventsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onTextEnteredInBuyDialog$1", f = "HolidayEventsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nHolidayEventsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$onTextEnteredInBuyDialog$1\n+ 2 CharSequence.kt\nandroidx/core/text/CharSequenceKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1302:1\n28#2:1303\n230#3,5:1304\n*S KotlinDebug\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$onTextEnteredInBuyDialog$1\n*L\n876#1:1303\n922#1:1304,5\n*E\n"})
/* loaded from: classes3.dex */
public final class HolidayEventsViewModel$onTextEnteredInBuyDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $textValue;
    public int label;
    public final /* synthetic */ HolidayEventsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HolidayEventsViewModel$onTextEnteredInBuyDialog$1(String str, HolidayEventsViewModel holidayEventsViewModel, Continuation<? super HolidayEventsViewModel$onTextEnteredInBuyDialog$1> continuation) {
        super(2, continuation);
        this.$textValue = str;
        this.this$0 = holidayEventsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new HolidayEventsViewModel$onTextEnteredInBuyDialog$1(this.$textValue, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((HolidayEventsViewModel$onTextEnteredInBuyDialog$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [T, androidx.compose.ui.text.AnnotatedString] */
    /* JADX WARN: Type inference failed for: r3v16, types: [T, androidx.compose.ui.text.AnnotatedString] */
    /* JADX WARN: Type inference failed for: r4v16, types: [T, androidx.compose.ui.text.AnnotatedString] */
    /* JADX WARN: Type inference failed for: r6v11, types: [T, androidx.compose.ui.text.AnnotatedString] */
    /* JADX WARN: Type inference failed for: r6v7, types: [T, androidx.compose.ui.text.AnnotatedString] */
    /* JADX WARN: Type inference failed for: r8v0, types: [T, androidx.compose.ui.text.AnnotatedString] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String empty;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        objectRef.element = new AnnotatedString(AnyExtensionKt.empty(stringCompanionObject), null, null, 6, null);
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = new AnnotatedString(AnyExtensionKt.empty(stringCompanionObject), null, null, 6, null);
        if (TextUtils.isDigitsOnly(this.$textValue)) {
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(this.$textValue);
            if (intOrNull != null) {
                HolidayEventsViewModel holidayEventsViewModel = this.this$0;
                int intValue = intOrNull.intValue();
                if (intValue > 100) {
                    Useful useful = Useful.INSTANCE;
                    objectRef.element = ComposeExtensionKt.toAnnotatedString(useful.getTextWithHtmlStyles(holidayEventsViewModel.getStringResource().getString(R.string.holiday_events_you_spend, Boxing.boxInt(holidayEventsViewModel.getUiState().getValue().getOfferCost() * 100))));
                    objectRef2.element = ComposeExtensionKt.toAnnotatedString(useful.getTextWithHtmlStyles(holidayEventsViewModel.getStringResource().getString(R.string.holiday_events_you_get, Boxing.boxInt(holidayEventsViewModel.getUiState().getValue().getOfferValue() * 100))));
                    empty = "100";
                } else if (intValue < 1) {
                    empty = AnyExtensionKt.empty(stringCompanionObject);
                } else {
                    Useful useful2 = Useful.INSTANCE;
                    objectRef.element = ComposeExtensionKt.toAnnotatedString(useful2.getTextWithHtmlStyles(holidayEventsViewModel.getStringResource().getString(R.string.holiday_events_you_spend, Boxing.boxInt(holidayEventsViewModel.getUiState().getValue().getOfferCost() * intValue))));
                    objectRef2.element = ComposeExtensionKt.toAnnotatedString(useful2.getTextWithHtmlStyles(holidayEventsViewModel.getStringResource().getString(R.string.holiday_events_you_get, Boxing.boxInt(holidayEventsViewModel.getUiState().getValue().getOfferValue() * intValue))));
                    empty = String.valueOf(intValue);
                }
            } else {
                empty = null;
            }
            if (empty == null) {
                empty = "";
            }
        } else {
            empty = AnyExtensionKt.empty(stringCompanionObject);
        }
        MutableStateFlow<? extends HolidayEventsUiState> mutableStateFlow = this.this$0.get_uiState();
        while (true) {
            HolidayEventsUiState value = mutableStateFlow.getValue();
            MutableStateFlow<? extends HolidayEventsUiState> mutableStateFlow2 = mutableStateFlow;
            if (mutableStateFlow2.compareAndSet(value, HolidayEventsUiState.m6942copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, empty, (AnnotatedString) objectRef.element, (AnnotatedString) objectRef2.element, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -1879048193, 1073741823, null))) {
                return Unit.INSTANCE;
            }
            mutableStateFlow = mutableStateFlow2;
        }
    }
}
