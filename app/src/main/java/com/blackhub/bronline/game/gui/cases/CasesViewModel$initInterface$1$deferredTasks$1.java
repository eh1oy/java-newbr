package com.blackhub.bronline.game.gui.cases;

import android.app.Application;
import android.graphics.Bitmap;
import androidx.compose.ui.text.AnnotatedString;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.constants.resources.PngConstantsId73;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.attachment.tutorial.CommonTutorialTextsWithImage;
import com.blackhub.bronline.game.gui.cases.model.CasesBonusHintAttachment;
import com.blackhub.bronline.game.gui.cases.model.CasesText;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CasesViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$initInterface$1$deferredTasks$1", f = "CasesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class CasesViewModel$initInterface$1$deferredTasks$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Ref.ObjectRef<Bitmap> $bgImage;
    public final /* synthetic */ Ref.ObjectRef<CasesBonusHintAttachment> $casesBonusHintAttachment;
    public final /* synthetic */ Ref.ObjectRef<CasesText> $casesStrings;
    public final /* synthetic */ Ref.ObjectRef<Map<String, Bitmap>> $images;
    public int label;
    public final /* synthetic */ CasesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CasesViewModel$initInterface$1$deferredTasks$1(Ref.ObjectRef<Map<String, Bitmap>> objectRef, CasesViewModel casesViewModel, Ref.ObjectRef<Bitmap> objectRef2, Ref.ObjectRef<CasesText> objectRef3, Ref.ObjectRef<CasesBonusHintAttachment> objectRef4, Continuation<? super CasesViewModel$initInterface$1$deferredTasks$1> continuation) {
        super(2, continuation);
        this.$images = objectRef;
        this.this$0 = casesViewModel;
        this.$bgImage = objectRef2;
        this.$casesStrings = objectRef3;
        this.$casesBonusHintAttachment = objectRef4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CasesViewModel$initInterface$1$deferredTasks$1(this.$images, this.this$0, this.$bgImage, this.$casesStrings, this.$casesBonusHintAttachment, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CasesViewModel$initInterface$1$deferredTasks$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [T, com.blackhub.bronline.game.gui.cases.model.CasesText] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r9v21, types: [T, com.blackhub.bronline.game.gui.cases.model.CasesBonusHintAttachment] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Application application;
        Application application2;
        StringResource stringResource;
        StringResource stringResource2;
        StringResource stringResource3;
        StringResource stringResource4;
        StringResource stringResource5;
        StringResource stringResource6;
        StringResource stringResource7;
        StringResource stringResource8;
        StringResource stringResource9;
        StringResource stringResource10;
        StringResource stringResource11;
        StringResource stringResource12;
        StringResource stringResource13;
        StringResource stringResource14;
        StringResource stringResource15;
        StringResource stringResource16;
        StringResource stringResource17;
        StringResource stringResource18;
        StringResource stringResource19;
        StringResource stringResource20;
        StringResource stringResource21;
        StringResource stringResource22;
        StringResource stringResource23;
        StringResource stringResource24;
        StringResource stringResource25;
        StringResource stringResource26;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{PngConstantsId73.IMG_CASES_HINT_1, PngConstantsId73.IMG_CASES_HINT_2, PngConstantsId73.IMG_CASES_HINT_3, PngConstantsId73.IMG_CASES_HINT_4, PngConstantsId73.IMG_CASES_BONUS_HINT, PngConstantsId73.IMG_LEGENDARY_CASE});
        Ref.ObjectRef<Map<String, Bitmap>> objectRef = this.$images;
        application = this.this$0.application;
        objectRef.element = BitmapUtilsKt.getBitmapMapFromZip(application, listOf, ImageTypePathInCDNEnum.IMAGE);
        Ref.ObjectRef<Bitmap> objectRef2 = this.$bgImage;
        application2 = this.this$0.application;
        objectRef2.element = BitmapUtilsKt.getBitmapFromZip$default(application2, PngConstantsId73.BG_BONUS_CASE, ImageTypePathInCDNEnum.BACKGROUND, 0.0f, 0.0f, 24, null);
        Ref.ObjectRef<CasesText> objectRef3 = this.$casesStrings;
        stringResource = this.this$0.stringResources;
        AnnotatedString htmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(stringResource.getString(R.string.cases_hint_sale_one));
        stringResource2 = this.this$0.stringResources;
        AnnotatedString htmlTextToAnnotatedString2 = StringExtensionKt.htmlTextToAnnotatedString(stringResource2.getString(R.string.cases_hint_sale_ten));
        stringResource3 = this.this$0.stringResources;
        AnnotatedString htmlTextToAnnotatedString3 = StringExtensionKt.htmlTextToAnnotatedString(stringResource3.getString(R.string.cases_hint_unique_case));
        stringResource4 = this.this$0.stringResources;
        AnnotatedString htmlTextToAnnotatedString4 = StringExtensionKt.htmlTextToAnnotatedString(stringResource4.getString(R.string.cases_hint_scale_hint));
        Bitmap bitmap = this.$images.element.get(PngConstantsId73.IMG_CASES_HINT_1);
        stringResource5 = this.this$0.stringResources;
        AnnotatedString htmlTextToAnnotatedString5 = StringExtensionKt.htmlTextToAnnotatedString(stringResource5.getString(R.string.cases_main_hint_title_first));
        stringResource6 = this.this$0.stringResources;
        AnnotatedString htmlTextToAnnotatedString6 = StringExtensionKt.htmlTextToAnnotatedString(stringResource6.getString(R.string.cases_main_hint_text_first_1));
        stringResource7 = this.this$0.stringResources;
        AnnotatedString htmlTextToAnnotatedString7 = StringExtensionKt.htmlTextToAnnotatedString(stringResource7.getString(R.string.cases_main_hint_text_first_2));
        stringResource8 = this.this$0.stringResources;
        CommonTutorialTextsWithImage commonTutorialTextsWithImage = new CommonTutorialTextsWithImage(bitmap, htmlTextToAnnotatedString5, htmlTextToAnnotatedString6, htmlTextToAnnotatedString7, null, stringResource8.getString(R.string.cases_press_for_next), 16, null);
        Bitmap bitmap2 = this.$images.element.get(PngConstantsId73.IMG_CASES_HINT_2);
        stringResource9 = this.this$0.stringResources;
        AnnotatedString htmlTextToAnnotatedString8 = StringExtensionKt.htmlTextToAnnotatedString(stringResource9.getString(R.string.cases_main_hint_title_second));
        stringResource10 = this.this$0.stringResources;
        AnnotatedString htmlTextToAnnotatedString9 = StringExtensionKt.htmlTextToAnnotatedString(stringResource10.getString(R.string.cases_main_hint_text_second_1));
        stringResource11 = this.this$0.stringResources;
        AnnotatedString htmlTextToAnnotatedString10 = StringExtensionKt.htmlTextToAnnotatedString(stringResource11.getString(R.string.cases_main_hint_text_second_2));
        stringResource12 = this.this$0.stringResources;
        AnnotatedString htmlTextToAnnotatedString11 = StringExtensionKt.htmlTextToAnnotatedString(stringResource12.getString(R.string.cases_main_hint_text_second_3));
        stringResource13 = this.this$0.stringResources;
        CommonTutorialTextsWithImage commonTutorialTextsWithImage2 = new CommonTutorialTextsWithImage(bitmap2, htmlTextToAnnotatedString8, htmlTextToAnnotatedString9, htmlTextToAnnotatedString10, htmlTextToAnnotatedString11, stringResource13.getString(R.string.cases_press_for_next));
        Bitmap bitmap3 = this.$images.element.get(PngConstantsId73.IMG_CASES_HINT_3);
        stringResource14 = this.this$0.stringResources;
        AnnotatedString htmlTextToAnnotatedString12 = StringExtensionKt.htmlTextToAnnotatedString(stringResource14.getString(R.string.cases_main_hint_title_third));
        stringResource15 = this.this$0.stringResources;
        AnnotatedString htmlTextToAnnotatedString13 = StringExtensionKt.htmlTextToAnnotatedString(stringResource15.getString(R.string.cases_main_hint_text_third_1));
        stringResource16 = this.this$0.stringResources;
        AnnotatedString htmlTextToAnnotatedString14 = StringExtensionKt.htmlTextToAnnotatedString(stringResource16.getString(R.string.cases_main_hint_text_third_2));
        stringResource17 = this.this$0.stringResources;
        CommonTutorialTextsWithImage commonTutorialTextsWithImage3 = new CommonTutorialTextsWithImage(bitmap3, htmlTextToAnnotatedString12, htmlTextToAnnotatedString13, htmlTextToAnnotatedString14, null, stringResource17.getString(R.string.cases_press_for_next), 16, null);
        Bitmap bitmap4 = this.$images.element.get(PngConstantsId73.IMG_CASES_HINT_4);
        stringResource18 = this.this$0.stringResources;
        AnnotatedString htmlTextToAnnotatedString15 = StringExtensionKt.htmlTextToAnnotatedString(stringResource18.getString(R.string.cases_main_hint_title_fourth));
        stringResource19 = this.this$0.stringResources;
        AnnotatedString htmlTextToAnnotatedString16 = StringExtensionKt.htmlTextToAnnotatedString(stringResource19.getString(R.string.cases_main_hint_text_fourth_1));
        stringResource20 = this.this$0.stringResources;
        AnnotatedString htmlTextToAnnotatedString17 = StringExtensionKt.htmlTextToAnnotatedString(stringResource20.getString(R.string.cases_main_hint_text_fourth_2));
        stringResource21 = this.this$0.stringResources;
        objectRef3.element = new CasesText(htmlTextToAnnotatedString, htmlTextToAnnotatedString2, htmlTextToAnnotatedString3, htmlTextToAnnotatedString4, null, null, CollectionsKt__CollectionsKt.listOf((Object[]) new CommonTutorialTextsWithImage[]{commonTutorialTextsWithImage, commonTutorialTextsWithImage2, commonTutorialTextsWithImage3, new CommonTutorialTextsWithImage(bitmap4, htmlTextToAnnotatedString15, htmlTextToAnnotatedString16, htmlTextToAnnotatedString17, null, stringResource21.getString(R.string.cases_press_for_close), 16, null)}), 48, null);
        Ref.ObjectRef<CasesBonusHintAttachment> objectRef4 = this.$casesBonusHintAttachment;
        Bitmap bitmap5 = this.$images.element.get(PngConstantsId73.IMG_CASES_BONUS_HINT);
        stringResource22 = this.this$0.stringResources;
        String upperCase = stringResource22.getString(R.string.cases_bonus_hint).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        stringResource23 = this.this$0.stringResources;
        AnnotatedString htmlTextToAnnotatedString18 = StringExtensionKt.htmlTextToAnnotatedString(stringResource23.getString(R.string.cases_bonus_hint_text_1));
        stringResource24 = this.this$0.stringResources;
        String string = stringResource24.getString(R.string.cases_bonus_hint_text_2);
        stringResource25 = this.this$0.stringResources;
        AnnotatedString htmlTextToAnnotatedString19 = StringExtensionKt.htmlTextToAnnotatedString(stringResource25.getString(R.string.cases_bonus_hint_text_3));
        stringResource26 = this.this$0.stringResources;
        objectRef4.element = new CasesBonusHintAttachment(bitmap5, upperCase, htmlTextToAnnotatedString18, string, htmlTextToAnnotatedString19, StringExtensionKt.htmlTextToAnnotatedString(stringResource26.getString(R.string.cases_bonus_hint_text_4)));
        return Unit.INSTANCE;
    }
}
