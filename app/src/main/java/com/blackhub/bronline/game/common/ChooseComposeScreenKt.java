package com.blackhub.bronline.game.common;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.blackhub.bronline.game.ui.activetask.ActiveTaskGuiKt;
import com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt;
import com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt;
import com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt;
import com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt;
import com.blackhub.bronline.game.ui.calendar.CalendarGuiKt;
import com.blackhub.bronline.game.ui.cases.CasesGuiKt;
import com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerGuiKt;
import com.blackhub.bronline.game.ui.chat.ChatGuiKt;
import com.blackhub.bronline.game.ui.clicker.ClickerGuiKt;
import com.blackhub.bronline.game.ui.craft.CraftGuiKt;
import com.blackhub.bronline.game.ui.fishing.FishingGuiKt;
import com.blackhub.bronline.game.ui.gifts.GiftsGuiKt;
import com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardGuiKt;
import com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGuiKt;
import com.blackhub.bronline.game.ui.interactionwithnpc.InteractionWithNpcGuiKt;
import com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt;
import com.blackhub.bronline.game.ui.menu.MenuGuiKt;
import com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperGuiKt;
import com.blackhub.bronline.game.ui.moduledialog.ModuleDialogGuiKt;
import com.blackhub.bronline.game.ui.panelinfo.PanelInfoGuiKt;
import com.blackhub.bronline.game.ui.plates.PlatesGuiKt;
import com.blackhub.bronline.game.ui.rateapp.RateAppGuiKt;
import com.blackhub.bronline.game.ui.rating.RatingGuiKt;
import com.blackhub.bronline.game.ui.rent.RentGuiKt;
import com.blackhub.bronline.game.ui.tanpinbanner.TanpinBannerGuiKt;
import com.blackhub.bronline.game.ui.taxiorder.TaxiOrderGuiKt;
import com.blackhub.bronline.game.ui.taxirating.TaxiRatingGuiKt;
import com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt;
import com.blackhub.bronline.game.ui.videoplayer.VideoPlayerGuiKt;
import com.blackhub.bronline.game.ui.youtubeplayer.YoutubePlayerGuiKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: ChooseComposeScreen.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"ChooseComposeScreen", "", "screenId", "", "(ILandroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChooseComposeScreenKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ChooseComposeScreen(final int i, @Nullable Composer composer, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1112113334);
        if ((i2 & 14) == 0) {
            i3 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1112113334, i3, -1, "com.blackhub.bronline.game.common.ChooseComposeScreen (ChooseComposeScreen.kt:67)");
            }
            if (i == 1) {
                startRestartGroup.startReplaceableGroup(1957407132);
                PlatesGuiKt.PlatesGui(startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
            } else if (i == 6) {
                startRestartGroup.startReplaceableGroup(1957407097);
                RentGuiKt.RentGui(startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
            } else if (i == 14) {
                startRestartGroup.startReplaceableGroup(1957407064);
                MenuGuiKt.MenuGui(startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
            } else if (i == 35) {
                startRestartGroup.startReplaceableGroup(1957406698);
                BlackPassBannerGuiKt.BlackPassBannerGui(startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
            } else if (i == 49) {
                startRestartGroup.startReplaceableGroup(1957407625);
                CraftGuiKt.CraftGui(startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
            } else if (i == 57) {
                startRestartGroup.startReplaceableGroup(1957406464);
                CatchStreamerGuiKt.CatchStreamerGui(startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
            } else if (i == 59) {
                startRestartGroup.startReplaceableGroup(1957406791);
                FishingGuiKt.FishingGui(startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
            } else if (i == 61) {
                startRestartGroup.startReplaceableGroup(1957406522);
                YoutubePlayerGuiKt.YoutubePlayerGui(null, startRestartGroup, 0, 1);
                startRestartGroup.endReplaceableGroup();
            } else if (i == 17) {
                startRestartGroup.startReplaceableGroup(1957407254);
                TaxiOrderGuiKt.TaxiOrderGui(startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
            } else if (i == 18) {
                startRestartGroup.startReplaceableGroup(1957407487);
                TaxiRatingGuiKt.TaxiRatingGui(startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
            } else if (i == 30) {
                startRestartGroup.startReplaceableGroup(1957407302);
                HolidayEventsGuiKt.HolidayEventsGui(startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
            } else if (i != 31) {
                switch (i) {
                    case 63:
                        startRestartGroup.startReplaceableGroup(1957406580);
                        InteractionWithNpcGuiKt.InteractionWithNpcGui(startRestartGroup, 0);
                        startRestartGroup.endReplaceableGroup();
                        break;
                    case 64:
                        startRestartGroup.startReplaceableGroup(1957406638);
                        PurchaseOfferAwardGuiKt.PurchaseOfferAwardGui(startRestartGroup, 0);
                        startRestartGroup.endReplaceableGroup();
                        break;
                    case 65:
                        startRestartGroup.startReplaceableGroup(1957406749);
                        ActiveTaskGuiKt.ActiveTaskGui(startRestartGroup, 0);
                        startRestartGroup.endReplaceableGroup();
                        break;
                    case 66:
                        startRestartGroup.startReplaceableGroup(1957406834);
                        AdminToolsGuiKt.AdminToolsGui(startRestartGroup, 0);
                        startRestartGroup.endReplaceableGroup();
                        break;
                    case 67:
                        startRestartGroup.startReplaceableGroup(1957406882);
                        BrSimBannerGuiKt.BrSimBannerGui(startRestartGroup, 0);
                        startRestartGroup.endReplaceableGroup();
                        break;
                    case 68:
                        startRestartGroup.startReplaceableGroup(1957406938);
                        UpgradeObjectEventGuiKt.UpgradeObjectEventGui(null, startRestartGroup, 0, 1);
                        startRestartGroup.endReplaceableGroup();
                        break;
                    case 69:
                        startRestartGroup.startReplaceableGroup(1957406986);
                        GiftsGuiKt.GiftsGui(startRestartGroup, 0);
                        startRestartGroup.endReplaceableGroup();
                        break;
                    case 70:
                        startRestartGroup.startReplaceableGroup(1957407026);
                        PanelInfoGuiKt.PanelInfoGui(startRestartGroup, 0);
                        startRestartGroup.endReplaceableGroup();
                        break;
                    case 71:
                        startRestartGroup.startReplaceableGroup(1957407211);
                        CalendarGuiKt.CalendarGui(startRestartGroup, 0);
                        startRestartGroup.endReplaceableGroup();
                        break;
                    case 72:
                        startRestartGroup.startReplaceableGroup(1957407171);
                        RateAppGuiKt.RateAppGui(startRestartGroup, 0);
                        startRestartGroup.endReplaceableGroup();
                        break;
                    case 73:
                        startRestartGroup.startReplaceableGroup(1957407402);
                        CasesGuiKt.CasesGui(startRestartGroup, 0);
                        startRestartGroup.endReplaceableGroup();
                        break;
                    case 74:
                        startRestartGroup.startReplaceableGroup(1957407442);
                        BpRewardsGuiKt.BpRewardsGui(startRestartGroup, 0);
                        startRestartGroup.endReplaceableGroup();
                        break;
                    case 75:
                        startRestartGroup.startReplaceableGroup(1957407535);
                        TanpinBannerGuiKt.TanpinBannerGui(startRestartGroup, 0);
                        startRestartGroup.endReplaceableGroup();
                        break;
                    case 76:
                        startRestartGroup.startReplaceableGroup(1957407584);
                        VideoPlayerGuiKt.VideoPlayerGui(startRestartGroup, 0);
                        startRestartGroup.endReplaceableGroup();
                        break;
                    case 77:
                        startRestartGroup.startReplaceableGroup(1957407666);
                        MarketplaceGuiKt.MarketplaceGui(startRestartGroup, 0);
                        startRestartGroup.endReplaceableGroup();
                        break;
                    default:
                        switch (i) {
                            case 79:
                                startRestartGroup.startReplaceableGroup(1957407709);
                                ClickerGuiKt.ClickerGUI(startRestartGroup, 0);
                                startRestartGroup.endReplaceableGroup();
                                break;
                            case 80:
                                startRestartGroup.startReplaceableGroup(1957407745);
                                ChatGuiKt.ChatGui(startRestartGroup, 0);
                                startRestartGroup.endReplaceableGroup();
                                break;
                            case 81:
                                startRestartGroup.startReplaceableGroup(1957407787);
                                ModuleDialogGuiKt.ModuleDialogGui(startRestartGroup, 0);
                                startRestartGroup.endReplaceableGroup();
                                break;
                            case 82:
                                startRestartGroup.startReplaceableGroup(1957407830);
                                RatingGuiKt.RatingGui(startRestartGroup, 0);
                                startRestartGroup.endReplaceableGroup();
                                break;
                            default:
                                startRestartGroup.startReplaceableGroup(1957407858);
                                startRestartGroup.endReplaceableGroup();
                                break;
                        }
                }
            } else {
                startRestartGroup.startReplaceableGroup(1957407357);
                MiniGamesHelperGuiKt.MiniGamesHelperGui(startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.common.ChooseComposeScreenKt$ChooseComposeScreen$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i4) {
                    ChooseComposeScreenKt.ChooseComposeScreen(i, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }
}
