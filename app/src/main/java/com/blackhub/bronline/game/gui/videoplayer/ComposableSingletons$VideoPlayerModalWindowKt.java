package com.blackhub.bronline.game.gui.videoplayer;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.theme.TypographyStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: VideoPlayerModalWindow.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$VideoPlayerModalWindowKt {

    @NotNull
    public static final ComposableSingletons$VideoPlayerModalWindowKt INSTANCE = new ComposableSingletons$VideoPlayerModalWindowKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f82lambda1 = ComposableLambdaKt.composableLambdaInstance(1795099522, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.videoplayer.ComposableSingletons$VideoPlayerModalWindowKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1795099522, i, -1, "com.blackhub.bronline.game.gui.videoplayer.ComposableSingletons$VideoPlayerModalWindowKt.lambda-1.<anonymous> (VideoPlayerModalWindow.kt:34)");
                }
                Modifier m595height3ABfNKs = SizeKt.m595height3ABfNKs(SizeKt.m614width3ABfNKs(PaddingKt.m564paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer, 6), 7, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._400wdp, composer, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._160wdp, composer, 6));
                Alignment center = Alignment.INSTANCE.getCenter();
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m595height3ABfNKs);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer m3307constructorimpl = Updater.m3307constructorimpl(composer);
                Updater.m3314setimpl(m3307constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m3314setimpl(m3307constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (m3307constructorimpl.getInserting() || !Intrinsics.areEqual(m3307constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3307constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3307constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m3298boximpl(SkippableUpdater.m3299constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TextKt.m2461Text4IGK_g(StringResources_androidKt.stringResource(R.string.videoplayer_hint, composer, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m7285montserratRegularCustomSpbl3sdaw(R.dimen._16wsp, 0L, TextAlign.INSTANCE.m5995getCentere0LSkKk(), 0L, 0.0f, composer, 196614, 26), composer, 0, 0, 65534);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    @NotNull
    /* renamed from: getLambda-1$app_siteRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7201getLambda1$app_siteRelease() {
        return f82lambda1;
    }
}
