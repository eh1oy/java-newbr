package com.blackhub.bronline.game.core.viewmodel;

import com.android.billingclient.api.ProductDetails;
import com.blackhub.bronline.game.core.utils.payment.BillingInfo;
import com.blackhub.bronline.game.gui.donate.data.BillingItem;
import com.blackhub.bronline.game.ui.donate.DonateDepositCoinsItemModel;
import com.blackhub.bronline.game.ui.donate.ProductDetailsItem;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: JNIActivityViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$setProductDetails$1", f = "JNIActivityViewModel.kt", i = {}, l = {743}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nJNIActivityViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JNIActivityViewModel.kt\ncom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel$setProductDetails$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1087:1\n1549#2:1088\n1620#2,2:1089\n288#2,2:1091\n1622#2:1093\n1045#2:1094\n*S KotlinDebug\n*F\n+ 1 JNIActivityViewModel.kt\ncom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel$setProductDetails$1\n*L\n722#1:1088\n722#1:1089,2\n724#1:1091,2\n722#1:1093\n742#1:1094\n*E\n"})
/* loaded from: classes3.dex */
public final class JNIActivityViewModel$setProductDetails$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ boolean $isWithDouble;
    public final /* synthetic */ List<ProductDetails> $products;
    public int label;
    public final /* synthetic */ JNIActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JNIActivityViewModel$setProductDetails$1(List<ProductDetails> list, JNIActivityViewModel jNIActivityViewModel, boolean z, Continuation<? super JNIActivityViewModel$setProductDetails$1> continuation) {
        super(2, continuation);
        this.$products = list;
        this.this$0 = jNIActivityViewModel;
        this.$isWithDouble = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new JNIActivityViewModel$setProductDetails$1(this.$products, this.this$0, this.$isWithDouble, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((JNIActivityViewModel$setProductDetails$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableStateFlow mutableStateFlow;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List<ProductDetails> list = this.$products;
            boolean z = this.$isWithDouble;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (ProductDetails productDetails : list) {
                Iterator<T> it = BillingInfo.INSTANCE.getBillingObj().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (Intrinsics.areEqual(((BillingItem) obj2).getProductId(), productDetails.getProductId())) {
                        break;
                    }
                }
                BillingItem billingItem = (BillingItem) obj2;
                if (billingItem == null) {
                    billingItem = new BillingItem(null, 0, 0, null, 0, 31, null);
                }
                int actualPrice = billingItem.actualPrice(z);
                String valueOfSale = billingItem.valueOfSale(z);
                boolean z2 = billingItem.getOldPrice() != actualPrice;
                String name = productDetails.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                String formattedPrice = oneTimePurchaseOfferDetails != null ? oneTimePurchaseOfferDetails.getFormattedPrice() : null;
                if (formattedPrice == null) {
                    formattedPrice = "";
                }
                String description = productDetails.getDescription();
                Intrinsics.checkNotNullExpressionValue(description, "getDescription(...)");
                arrayList.add(new ProductDetailsItem(productDetails, new DonateDepositCoinsItemModel(name, formattedPrice, description, billingItem.getOldPrice(), actualPrice, z2, valueOfSale)));
            }
            List sortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$setProductDetails$1$invokeSuspend$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((ProductDetailsItem) t).getModel().getOldPrice()), Integer.valueOf(((ProductDetailsItem) t2).getModel().getOldPrice()));
                }
            });
            mutableStateFlow = this.this$0._productDetailsState;
            this.label = 1;
            if (mutableStateFlow.emit(sortedWith, this) == coroutine_suspended) {
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
