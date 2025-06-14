package com.blackhub.bronline.game.gui.gasmangame.ui;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.DialogGasmanHintBinding;
import com.blackhub.bronline.game.common.DialogNoNavBarFullScreen;
import com.blackhub.bronline.game.common.dotrvindicator.DotViewIndicator;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.gasmangame.adapter.AdapterGasmanHint;
import com.blackhub.bronline.game.gui.gasmangame.entitie.GasmanAdapterHintItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UIGasmanHintDialog.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/blackhub/bronline/game/gui/gasmangame/ui/UIGasmanHintDialog;", "Lcom/blackhub/bronline/game/common/DialogNoNavBarFullScreen;", "_context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "adapterGasmanHint", "Lcom/blackhub/bronline/game/gui/gasmangame/adapter/AdapterGasmanHint;", "binding", "Lcom/blackhub/bronline/databinding/DialogGasmanHintBinding;", "getContentView", "Landroid/view/View;", "getTextFor1Hint", "Landroid/text/SpannedString;", "getTextFor2Hint", "getTextFor3Hint", "initListeners", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUIGasmanHintDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIGasmanHintDialog.kt\ncom/blackhub/bronline/game/gui/gasmangame/ui/UIGasmanHintDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n1#1,104:1\n1#2:105\n41#3,3:106\n41#3,3:109\n41#3,3:112\n*S KotlinDebug\n*F\n+ 1 UIGasmanHintDialog.kt\ncom/blackhub/bronline/game/gui/gasmangame/ui/UIGasmanHintDialog\n*L\n73#1:106,3\n83#1:109,3\n93#1:112,3\n*E\n"})
/* loaded from: classes3.dex */
public final class UIGasmanHintDialog extends DialogNoNavBarFullScreen {
    public static final int $stable = 8;

    @NotNull
    public final Context _context;

    @NotNull
    public final AdapterGasmanHint adapterGasmanHint;

    @NotNull
    public final DialogGasmanHintBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIGasmanHintDialog(@NotNull Context _context) {
        super(_context);
        Intrinsics.checkNotNullParameter(_context, "_context");
        this._context = _context;
        Object systemService = _context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        DialogGasmanHintBinding inflate = DialogGasmanHintBinding.inflate((LayoutInflater) systemService);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        AdapterGasmanHint adapterGasmanHint = new AdapterGasmanHint(CollectionsKt__CollectionsKt.listOf((Object[]) new GasmanAdapterHintItem[]{new GasmanAdapterHintItem(ContextCompat.getDrawable(getContext(), R.drawable.ic_gasman_hint_1), getTextFor1Hint()), new GasmanAdapterHintItem(ContextCompat.getDrawable(getContext(), R.drawable.ic_gasman_hint_2), getTextFor2Hint()), new GasmanAdapterHintItem(ContextCompat.getDrawable(getContext(), R.drawable.ic_gasman_hint_3), getTextFor3Hint())}));
        this.adapterGasmanHint = adapterGasmanHint;
        Activity scanForActivity = UtilsKt.scanForActivity(_context);
        if (scanForActivity != null) {
            setOwnerActivity(scanForActivity);
        }
        setCancelable(true);
        ViewPager2 viewPager2 = inflate.vp2;
        viewPager2.setAdapter(adapterGasmanHint);
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanHintDialog$2$1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int position) {
                DialogGasmanHintBinding dialogGasmanHintBinding;
                super.onPageSelected(position);
                dialogGasmanHintBinding = UIGasmanHintDialog.this.binding;
                dialogGasmanHintBinding.anyViewIndicator.setCurrentPosition(position);
            }
        });
        DotViewIndicator dotViewIndicator = inflate.anyViewIndicator;
        dotViewIndicator.setItemCount(3);
        dotViewIndicator.setCurrentPosition(0);
    }

    @Override // com.blackhub.bronline.game.common.DialogNoNavBarFullScreen
    @NotNull
    public View getContentView() {
        ConstraintLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.blackhub.bronline.game.common.DialogNoNavBarFullScreen
    public void initListeners() {
        this.binding.ibClose.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanHintDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UIGasmanHintDialog.initListeners$lambda$0(UIGasmanHintDialog.this, view);
            }
        });
        this.binding.vBgEffectShadow.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanHintDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UIGasmanHintDialog.initListeners$lambda$1(UIGasmanHintDialog.this, view);
            }
        });
    }

    public static final void initListeners$lambda$0(final UIGasmanHintDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getTimeChecker().ifAccess(250L)) {
            AnyExtensionKt.setActionOnAnimationEnd(this$0.getAnim(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanHintDialog$initListeners$1$1
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
                    UIGasmanHintDialog.this.dismiss();
                }
            });
            view.startAnimation(this$0.getAnim());
        }
    }

    public static final void initListeners$lambda$1(UIGasmanHintDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    public final SpannedString getTextFor1Hint() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Useful useful = Useful.INSTANCE;
        String string = getContext().getString(R.string.gasman_hint_text_1_1);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        spannableStringBuilder.append((CharSequence) useful.getTextWithHtmlStyles(string));
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilder.append('\n'), "append(...)");
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilder.append('\n'), "append(...)");
        String string2 = getContext().getString(R.string.gasman_hint_text_1_2);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        spannableStringBuilder.append((CharSequence) useful.getTextWithHtmlStyles(string2));
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilder.append('\n'), "append(...)");
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilder.append('\n'), "append(...)");
        String string3 = getContext().getString(R.string.gasman_hint_text_1_3);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        spannableStringBuilder.append((CharSequence) useful.getTextWithHtmlStyles(string3));
        return new SpannedString(spannableStringBuilder);
    }

    public final SpannedString getTextFor2Hint() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Useful useful = Useful.INSTANCE;
        String string = getContext().getString(R.string.gasman_hint_text_2_1);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        spannableStringBuilder.append((CharSequence) useful.getTextWithHtmlStyles(string));
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilder.append('\n'), "append(...)");
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilder.append('\n'), "append(...)");
        String string2 = getContext().getString(R.string.gasman_hint_text_2_2);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        spannableStringBuilder.append((CharSequence) useful.getTextWithHtmlStyles(string2));
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilder.append('\n'), "append(...)");
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilder.append('\n'), "append(...)");
        String string3 = getContext().getString(R.string.gasman_hint_text_2_3);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        spannableStringBuilder.append((CharSequence) useful.getTextWithHtmlStyles(string3));
        return new SpannedString(spannableStringBuilder);
    }

    public final SpannedString getTextFor3Hint() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Useful useful = Useful.INSTANCE;
        String string = getContext().getString(R.string.gasman_hint_text_3_1);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        spannableStringBuilder.append((CharSequence) useful.getTextWithHtmlStyles(string));
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilder.append('\n'), "append(...)");
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilder.append('\n'), "append(...)");
        String string2 = getContext().getString(R.string.gasman_hint_text_3_2);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        spannableStringBuilder.append((CharSequence) useful.getTextWithHtmlStyles(string2));
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilder.append('\n'), "append(...)");
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilder.append('\n'), "append(...)");
        String string3 = getContext().getString(R.string.gasman_hint_text_3_3);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        spannableStringBuilder.append((CharSequence) useful.getTextWithHtmlStyles(string3));
        return new SpannedString(spannableStringBuilder);
    }
}
