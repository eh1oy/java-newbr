package com.blackhub.bronline.game.gui.bprewards;

import android.app.Application;
import android.graphics.Bitmap;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.AnnotatedString;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.resources.BitmapResource;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsFilterStateEnum;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsText;
import com.blackhub.bronline.game.gui.craft.model.response.CraftJsonItemCategoryFilter;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import com.blackhub.bronline.game.ui.bprewards.BpRewardsFilterButtonImageItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: BpRewardsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$initJson$1", f = "BpRewardsViewModel.kt", i = {}, l = {214}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nBpRewardsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$initJson$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,736:1\n1559#2:737\n1590#2,4:738\n230#3,5:742\n*S KotlinDebug\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$initJson$1\n*L\n158#1:737\n158#1:738,4\n203#1:742,5\n*E\n"})
/* loaded from: classes3.dex */
public final class BpRewardsViewModel$initJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ List<InvItems> $invItemsFromJson;
    public final /* synthetic */ JSONObject $json;
    public final /* synthetic */ List<BpRewardsAwardsDto> $listOfAwardsTypes;
    public final /* synthetic */ List<CraftJsonItemCategoryFilter> $marketDeliveryFilters;
    public final /* synthetic */ int $sizeOfImage;
    public final /* synthetic */ List<SkinsDTO> $skinsList;
    public final /* synthetic */ List<VehiclesDTO> $vehiclesList;
    public int label;
    public final /* synthetic */ BpRewardsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BpRewardsViewModel$initJson$1(JSONObject jSONObject, BpRewardsViewModel bpRewardsViewModel, List<CraftJsonItemCategoryFilter> list, List<BpRewardsAwardsDto> list2, List<InvItems> list3, List<VehiclesDTO> list4, List<SkinsDTO> list5, int i, Continuation<? super BpRewardsViewModel$initJson$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = bpRewardsViewModel;
        this.$marketDeliveryFilters = list;
        this.$listOfAwardsTypes = list2;
        this.$invItemsFromJson = list3;
        this.$vehiclesList = list4;
        this.$skinsList = list5;
        this.$sizeOfImage = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BpRewardsViewModel$initJson$1(this.$json, this.this$0, this.$marketDeliveryFilters, this.$listOfAwardsTypes, this.$invItemsFromJson, this.$vehiclesList, this.$skinsList, this.$sizeOfImage, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BpRewardsViewModel$initJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AnnotatedString titleText;
        AnnotatedString tutorialOpenCasesText;
        BitmapResource bitmapResource;
        List list;
        Bitmap bitmap;
        Application application;
        List list2;
        List list3;
        BpRewardsUiState value;
        BpRewardsUiState copy;
        Object parseJsonAndGetListOfItems;
        BitmapResource bitmapResource2;
        BitmapResource bitmapResource3;
        BitmapResource bitmapResource4;
        BitmapResource bitmapResource5;
        BitmapResource bitmapResource6;
        BitmapResource bitmapResource7;
        BitmapResource bitmapResource8;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            boolean isZero = IntExtensionKt.isZero(Boxing.boxInt(this.$json.optInt("t")));
            titleText = this.this$0.getTitleText(isZero);
            tutorialOpenCasesText = this.this$0.getTutorialOpenCasesText();
            BpRewardsText bpRewardsText = new BpRewardsText(titleText, tutorialOpenCasesText);
            bitmapResource = this.this$0.bitmapResource;
            Bitmap bitmap2 = bitmapResource.getBitmap(R.drawable.ic_refresh);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (isZero) {
                int filterState = BpRewardsFilterStateEnum.ALL.getFilterState();
                bitmapResource2 = this.this$0.bitmapResource;
                Bitmap bitmap3 = bitmapResource2.getBitmap(R.drawable.ic_all);
                Color.Companion companion = Color.INSTANCE;
                BpRewardsFilterButtonImageItem bpRewardsFilterButtonImageItem = new BpRewardsFilterButtonImageItem(filterState, bitmap3, companion.m3814getWhite0d7_KjU(), null);
                int filterState2 = BpRewardsFilterStateEnum.SKINS.getFilterState();
                bitmapResource3 = this.this$0.bitmapResource;
                BpRewardsFilterButtonImageItem bpRewardsFilterButtonImageItem2 = new BpRewardsFilterButtonImageItem(filterState2, bitmapResource3.getBitmap(R.drawable.ic_skins), companion.m3814getWhite0d7_KjU(), null);
                int filterState3 = BpRewardsFilterStateEnum.VIP.getFilterState();
                bitmapResource4 = this.this$0.bitmapResource;
                BpRewardsFilterButtonImageItem bpRewardsFilterButtonImageItem3 = new BpRewardsFilterButtonImageItem(filterState3, bitmapResource4.getBitmap(R.drawable.ic_vip), companion.m3814getWhite0d7_KjU(), null);
                int filterState4 = BpRewardsFilterStateEnum.ACCESSORISES.getFilterState();
                bitmapResource5 = this.this$0.bitmapResource;
                BpRewardsFilterButtonImageItem bpRewardsFilterButtonImageItem4 = new BpRewardsFilterButtonImageItem(filterState4, bitmapResource5.getBitmap(R.drawable.ic_acces), companion.m3814getWhite0d7_KjU(), null);
                int filterState5 = BpRewardsFilterStateEnum.CARS.getFilterState();
                bitmapResource6 = this.this$0.bitmapResource;
                BpRewardsFilterButtonImageItem bpRewardsFilterButtonImageItem5 = new BpRewardsFilterButtonImageItem(filterState5, bitmapResource6.getBitmap(R.drawable.ic_auto), companion.m3814getWhite0d7_KjU(), null);
                int filterState6 = BpRewardsFilterStateEnum.CURRENCIES.getFilterState();
                bitmapResource7 = this.this$0.bitmapResource;
                BpRewardsFilterButtonImageItem bpRewardsFilterButtonImageItem6 = new BpRewardsFilterButtonImageItem(filterState6, bitmapResource7.getBitmap(R.drawable.ic_currency), companion.m3814getWhite0d7_KjU(), null);
                int filterState7 = BpRewardsFilterStateEnum.OTHER.getFilterState();
                bitmapResource8 = this.this$0.bitmapResource;
                list = CollectionsKt__CollectionsKt.listOf((Object[]) new BpRewardsFilterButtonImageItem[]{bpRewardsFilterButtonImageItem, bpRewardsFilterButtonImageItem2, bpRewardsFilterButtonImageItem3, bpRewardsFilterButtonImageItem4, bpRewardsFilterButtonImageItem5, bpRewardsFilterButtonImageItem6, new BpRewardsFilterButtonImageItem(filterState7, bitmapResource8.getBitmap(R.drawable.ic_else), companion.m3814getWhite0d7_KjU(), null)});
            } else {
                List<CraftJsonItemCategoryFilter> list4 = this.$marketDeliveryFilters;
                BpRewardsViewModel bpRewardsViewModel = this.this$0;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                int i2 = 0;
                for (Object obj2 : list4) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    CraftJsonItemCategoryFilter craftJsonItemCategoryFilter = (CraftJsonItemCategoryFilter) obj2;
                    int filterId = craftJsonItemCategoryFilter.getFilterId();
                    String iconCDN = craftJsonItemCategoryFilter.getIconCDN();
                    if (iconCDN != null) {
                        application = bpRewardsViewModel.application;
                        bitmap = BitmapUtilsKt.getBitmapFromZip$default(application, iconCDN, ImageTypePathInCDNEnum.ICON, 0.0f, 0.0f, 24, null);
                    } else {
                        bitmap = null;
                    }
                    Bitmap bitmap4 = bitmap;
                    if (i2 % 2 != 0) {
                        arrayList.add(craftJsonItemCategoryFilter.getFilterName());
                    } else {
                        arrayList2.add(craftJsonItemCategoryFilter.getFilterName());
                    }
                    arrayList3.add(new BpRewardsFilterButtonImageItem(filterId, bitmap4, ColorKt.Color(android.graphics.Color.parseColor(craftJsonItemCategoryFilter.getColor())), null));
                    i2 = i3;
                }
                list = arrayList3;
            }
            if (isZero) {
                list2 = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{this.this$0.getStringResource().getString(R.string.bp_rewards_tutorial_btn_skins), this.this$0.getStringResource().getString(R.string.common_accessories), this.this$0.getStringResource().getString(R.string.bp_rewards_tutorial_btn_currency)});
            } else {
                list2 = CollectionsKt___CollectionsKt.toList(arrayList);
            }
            if (isZero) {
                list3 = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{this.this$0.getStringResource().getString(R.string.bp_rewards_tutorial_btn_all), this.this$0.getStringResource().getString(R.string.bp_rewards_tutorial_btn_vip), this.this$0.getStringResource().getString(R.string.common_transport), this.this$0.getStringResource().getString(R.string.bp_rewards_tutorial_btn_else)});
            } else {
                list3 = CollectionsKt___CollectionsKt.toList(arrayList2);
            }
            MutableStateFlow<? extends BpRewardsUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                copy = r13.copy((r38 & 1) != 0 ? r13.isBpRewardsScreen : isZero, (r38 & 2) != 0 ? r13.annotatedText : bpRewardsText, (r38 & 4) != 0 ? r13.bpRewardsLists : null, (r38 & 8) != 0 ? r13.imagesForFilterList : list, (r38 & 16) != 0 ? r13.topHintList : list2, (r38 & 32) != 0 ? r13.bottomHintList : list3, (r38 & 64) != 0 ? r13.refreshButtonBitmap : bitmap2, (r38 & 128) != 0 ? r13.sizeOfImage : 0, (r38 & 256) != 0 ? r13.isNeedToShowDialog : false, (r38 & 512) != 0 ? r13.isSprayForDialog : false, (r38 & 1024) != 0 ? r13.rewardNameForDialog : null, (r38 & 2048) != 0 ? r13.idForDialog : 0, (r38 & 4096) != 0 ? r13.sprayPriceForDialog : null, (r38 & 8192) != 0 ? r13.sprayTextForDialog : null, (r38 & 16384) != 0 ? r13.filterState : 0, (r38 & 32768) != 0 ? r13.isHasTanpin : false, (r38 & 65536) != 0 ? r13.isTutorialEnabled : false, (r38 & 131072) != 0 ? r13.isButtonFilterBlocked : false, (r38 & 262144) != 0 ? r13.isScreenBlocked : false, (r38 & 524288) != 0 ? value.isNeedClose : false);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            BpRewardsViewModel bpRewardsViewModel2 = this.this$0;
            JSONObject jSONObject = this.$json;
            List<BpRewardsAwardsDto> list5 = this.$listOfAwardsTypes;
            List<InvItems> list6 = this.$invItemsFromJson;
            List<VehiclesDTO> list7 = this.$vehiclesList;
            List<SkinsDTO> list8 = this.$skinsList;
            int i4 = this.$sizeOfImage;
            this.label = 1;
            parseJsonAndGetListOfItems = bpRewardsViewModel2.parseJsonAndGetListOfItems(jSONObject, (r19 & 2) != 0 ? bpRewardsViewModel2.get_uiState().getValue().getBpRewardsLists().getListOfAwardsTypes() : list5, (r19 & 4) != 0 ? bpRewardsViewModel2.get_uiState().getValue().getBpRewardsLists().getInvItemsFromJson() : list6, (r19 & 8) != 0 ? bpRewardsViewModel2.get_uiState().getValue().getBpRewardsLists().getVehiclesList() : list7, (r19 & 16) != 0 ? bpRewardsViewModel2.get_uiState().getValue().getBpRewardsLists().getSkinsList() : list8, (r19 & 32) != 0 ? bpRewardsViewModel2.get_uiState().getValue().getSizeOfImage() : i4, (r19 & 64) != 0 ? false : false, this);
            if (parseJsonAndGetListOfItems == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
