package com.blackhub.bronline.game.core.utils.payment.rustore;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.blackhub.bronline.BuildConfig;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.preferences.Preferences;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.utils.payment.BillingInfo;
import com.blackhub.bronline.game.core.utils.payment.rustore.model.RustoreBillingPurchaseRequest;
import com.blackhub.bronline.game.gui.donate.data.BillingItem;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.billingclient.RuStoreBillingClient;
import ru.rustore.sdk.billingclient.RuStoreBillingClientFactory;
import ru.rustore.sdk.billingclient.model.purchase.PaymentResult;
import ru.rustore.sdk.billingclient.model.purchase.Purchase;
import ru.rustore.sdk.billingclient.model.purchase.PurchaseState;
import ru.rustore.sdk.billingclient.model.user.UserAuthorizationStatus;
import ru.rustore.sdk.billingclient.usecase.PurchasesUseCase;
import ru.rustore.sdk.billingclient.usecase.UserInfoUseCase;
import ru.rustore.sdk.core.tasks.OnFailureListener;
import ru.rustore.sdk.core.tasks.OnSuccessListener;
import ru.rustore.sdk.core.tasks.Task;

/* compiled from: RustoreBillingClientWrapper.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bJ0\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u000e\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$J%\u0010%\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010&\u001a\u00020'2\b\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\u0002\u0010(R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006)"}, d2 = {"Lcom/blackhub/bronline/game/core/utils/payment/rustore/RustoreBillingClientWrapper;", "", "appContext", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_unconfirmedPayment", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/blackhub/bronline/game/core/utils/payment/rustore/model/RustoreBillingPurchaseRequest;", "billingClient", "Lru/rustore/sdk/billingclient/RuStoreBillingClient;", "getBillingClient", "()Lru/rustore/sdk/billingclient/RuStoreBillingClient;", "setBillingClient", "(Lru/rustore/sdk/billingclient/RuStoreBillingClient;)V", "unconfirmedPayment", "Lkotlinx/coroutines/flow/StateFlow;", "getUnconfirmedPayment", "()Lkotlinx/coroutines/flow/StateFlow;", "confirmPurchase", "", "purchaseId", "", "deletePurchase", "deleteRequestAfterSuccessOrError", "getRustoreBillingPurchases", "context", "Landroid/content/Context;", "getRustoreBillingPurchasesWithoutRequirementAuthorization", "mapProductToRustoreBillingPurchaseRequest", "productId", FirebaseAnalytics.Param.PRICE, "", "invoiceId", "onNewIntent", "intent", "Landroid/content/Intent;", "purchaseProduct", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "(Ljava/lang/String;Landroidx/fragment/app/FragmentActivity;Ljava/lang/Integer;)V", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRustoreBillingClientWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RustoreBillingClientWrapper.kt\ncom/blackhub/bronline/game/core/utils/payment/rustore/RustoreBillingClientWrapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,252:1\n1#2:253\n1549#3:254\n1620#3,3:255\n1549#3:258\n1620#3,3:259\n*S KotlinDebug\n*F\n+ 1 RustoreBillingClientWrapper.kt\ncom/blackhub/bronline/game/core/utils/payment/rustore/RustoreBillingClientWrapper\n*L\n70#1:254\n70#1:255,3\n93#1:258\n93#1:259,3\n*E\n"})
/* loaded from: classes3.dex */
public final class RustoreBillingClientWrapper {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<List<RustoreBillingPurchaseRequest>> _unconfirmedPayment;

    @Nullable
    public RuStoreBillingClient billingClient;

    @NotNull
    public final StateFlow<List<RustoreBillingPurchaseRequest>> unconfirmedPayment;

    @Inject
    public RustoreBillingClientWrapper(@NotNull Application appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        MutableStateFlow<List<RustoreBillingPurchaseRequest>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this._unconfirmedPayment = MutableStateFlow;
        this.unconfirmedPayment = FlowKt.asStateFlow(MutableStateFlow);
        if (UtilsKt.isRustoreBuildVariant()) {
            this.billingClient = RuStoreBillingClientFactory.create$default(RuStoreBillingClientFactory.INSTANCE, appContext, BuildConfig.RUSTORE_APP_ID, "com.launcher.brgame-rustore-billing", new BillingClientThemeProviderImpl(), null, false, null, 64, null);
        }
    }

    @Nullable
    public final RuStoreBillingClient getBillingClient() {
        return this.billingClient;
    }

    public final void setBillingClient(@Nullable RuStoreBillingClient ruStoreBillingClient) {
        this.billingClient = ruStoreBillingClient;
    }

    @NotNull
    public final StateFlow<List<RustoreBillingPurchaseRequest>> getUnconfirmedPayment() {
        return this.unconfirmedPayment;
    }

    /* compiled from: RustoreBillingClientWrapper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/blackhub/bronline/game/core/utils/payment/rustore/PaymentLogger;", "tag", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$1 */
    public static final class AnonymousClass1 extends Lambda implements Function1<String, PaymentLogger> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final PaymentLogger invoke(@NotNull String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            return new PaymentLogger(RustoreBillingClientWrapperKt.PaymentLoggerTag, tag);
        }
    }

    public final void getRustoreBillingPurchases(@NotNull Context context) {
        UserInfoUseCase userInfo;
        Task<UserAuthorizationStatus> authorizationStatus;
        Task<UserAuthorizationStatus> addOnSuccessListener;
        Intrinsics.checkNotNullParameter(context, "context");
        RuStoreBillingClient ruStoreBillingClient = this.billingClient;
        if (ruStoreBillingClient == null || (userInfo = ruStoreBillingClient.getUserInfo()) == null || (authorizationStatus = userInfo.getAuthorizationStatus()) == null || (addOnSuccessListener = authorizationStatus.addOnSuccessListener(new OnSuccessListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda2
            public final /* synthetic */ Context f$1;

            public /* synthetic */ RustoreBillingClientWrapper$$ExternalSyntheticLambda2(Context context2) {
                r2 = context2;
            }

            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RustoreBillingClientWrapper.getRustoreBillingPurchases$lambda$4(RustoreBillingClientWrapper.this, r2, (UserAuthorizationStatus) obj);
            }
        })) == null) {
            return;
        }
        addOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda3
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RustoreBillingClientWrapper.getRustoreBillingPurchases$lambda$5(th);
            }
        });
    }

    public static final void getRustoreBillingPurchases$lambda$4(RustoreBillingClientWrapper this$0, Context context, UserAuthorizationStatus authorizationStatus) {
        PurchasesUseCase purchases;
        Task<List<Purchase>> purchases2;
        Task<List<Purchase>> addOnSuccessListener;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(authorizationStatus, "authorizationStatus");
        if (authorizationStatus.getAuthorized()) {
            RuStoreBillingClient ruStoreBillingClient = this$0.billingClient;
            if (ruStoreBillingClient == null || (purchases = ruStoreBillingClient.getPurchases()) == null || (purchases2 = purchases.getPurchases()) == null || (addOnSuccessListener = purchases2.addOnSuccessListener(new OnSuccessListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda8
                public final /* synthetic */ Context f$1;

                public /* synthetic */ RustoreBillingClientWrapper$$ExternalSyntheticLambda8(Context context2) {
                    r2 = context2;
                }

                @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    RustoreBillingClientWrapper.getRustoreBillingPurchases$lambda$4$lambda$2(RustoreBillingClientWrapper.this, r2, (List) obj);
                }
            })) == null) {
                return;
            }
            addOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda9
                @Override // ru.rustore.sdk.core.tasks.OnFailureListener
                public final void onFailure(Throwable th) {
                    RustoreBillingClientWrapper.getRustoreBillingPurchases$lambda$4$lambda$3(th);
                }
            });
            return;
        }
        UtilsKt.crashlyticsLog("Игрок НЕ авторизован при входе на сервер");
    }

    public static final void getRustoreBillingPurchases$lambda$4$lambda$2(RustoreBillingClientWrapper this$0, Context context, List purchaseList) {
        Integer num;
        Object obj;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(purchaseList, "purchaseList");
        MutableStateFlow<List<RustoreBillingPurchaseRequest>> mutableStateFlow = this$0._unconfirmedPayment;
        List<Purchase> list = purchaseList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Purchase purchase : list) {
            String productId = purchase.getProductId();
            String invoiceId = purchase.getInvoiceId();
            String str = invoiceId == null ? "" : invoiceId;
            String purchaseId = purchase.getPurchaseId();
            String str2 = purchaseId == null ? "" : purchaseId;
            Iterator<T> it = BillingInfo.INSTANCE.getBillingObj().iterator();
            while (true) {
                num = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((BillingItem) obj).getProductId(), purchase.getProductId())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            BillingItem billingItem = (BillingItem) obj;
            if (billingItem != null) {
                num = Integer.valueOf(billingItem.getOldPrice());
            }
            arrayList.add(this$0.mapProductToRustoreBillingPurchaseRequest(context, productId, IntExtensionKt.getOrZero(num), str, str2));
        }
        mutableStateFlow.setValue(arrayList);
        UtilsKt.crashlyticsLog("Игрок авторизован при входе на сервер. Размер списка платежей: " + this$0._unconfirmedPayment.getValue().size());
    }

    public static final void getRustoreBillingPurchases$lambda$4$lambda$3(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        UtilsKt.crashlyticsRecordNewException("getPurchases addOnFailureListener " + t);
    }

    public static final void getRustoreBillingPurchases$lambda$5(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        UtilsKt.crashlyticsRecordNewException("getAuthorizationStatus addOnFailureListener " + t);
    }

    public final void getRustoreBillingPurchasesWithoutRequirementAuthorization(@NotNull Context context) {
        PurchasesUseCase purchases;
        Task<List<Purchase>> purchases2;
        Task<List<Purchase>> addOnSuccessListener;
        Intrinsics.checkNotNullParameter(context, "context");
        RuStoreBillingClient ruStoreBillingClient = this.billingClient;
        if (ruStoreBillingClient == null || (purchases = ruStoreBillingClient.getPurchases()) == null || (purchases2 = purchases.getPurchases()) == null || (addOnSuccessListener = purchases2.addOnSuccessListener(new OnSuccessListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda4
            public final /* synthetic */ Context f$1;

            public /* synthetic */ RustoreBillingClientWrapper$$ExternalSyntheticLambda4(Context context2) {
                r2 = context2;
            }

            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RustoreBillingClientWrapper.getRustoreBillingPurchasesWithoutRequirementAuthorization$lambda$8(RustoreBillingClientWrapper.this, r2, (List) obj);
            }
        })) == null) {
            return;
        }
        addOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda5
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RustoreBillingClientWrapper.getRustoreBillingPurchasesWithoutRequirementAuthorization$lambda$9(th);
            }
        });
    }

    public static final void getRustoreBillingPurchasesWithoutRequirementAuthorization$lambda$8(RustoreBillingClientWrapper this$0, Context context, List purchaseList) {
        Integer num;
        Object obj;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(purchaseList, "purchaseList");
        MutableStateFlow<List<RustoreBillingPurchaseRequest>> mutableStateFlow = this$0._unconfirmedPayment;
        List<Purchase> list = purchaseList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Purchase purchase : list) {
            String productId = purchase.getProductId();
            String invoiceId = purchase.getInvoiceId();
            String str = invoiceId == null ? "" : invoiceId;
            String purchaseId = purchase.getPurchaseId();
            String str2 = purchaseId == null ? "" : purchaseId;
            Iterator<T> it = BillingInfo.INSTANCE.getBillingObj().iterator();
            while (true) {
                num = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((BillingItem) obj).getProductId(), purchase.getProductId())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            BillingItem billingItem = (BillingItem) obj;
            if (billingItem != null) {
                num = Integer.valueOf(billingItem.getOldPrice());
            }
            arrayList.add(this$0.mapProductToRustoreBillingPurchaseRequest(context, productId, IntExtensionKt.getOrZero(num), str, str2));
        }
        mutableStateFlow.setValue(arrayList);
        UtilsKt.crashlyticsLog("getRustoreBillingPurchasesWithoutRequirementAuthorization _unconfirmedPayment size " + this$0._unconfirmedPayment.getValue().size());
    }

    public static final void getRustoreBillingPurchasesWithoutRequirementAuthorization$lambda$9(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        UtilsKt.crashlyticsRecordNewException("getRustoreBillingPurchasesWithoutRequirementAuthorization addOnFailureListener " + t);
    }

    public final void purchaseProduct(@NotNull String productId, @NotNull FragmentActivity r6, @Nullable Integer r7) {
        Task<PaymentResult> purchaseProduct;
        Task<PaymentResult> addOnSuccessListener;
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(r6, "activity");
        RuStoreBillingClient ruStoreBillingClient = this.billingClient;
        PurchasesUseCase purchases = ruStoreBillingClient != null ? ruStoreBillingClient.getPurchases() : null;
        if (purchases == null || (purchaseProduct = purchases.purchaseProduct(productId, UUID.randomUUID().toString(), 1, null)) == null || (addOnSuccessListener = purchaseProduct.addOnSuccessListener(new OnSuccessListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda12
            public final /* synthetic */ Integer f$1;
            public final /* synthetic */ FragmentActivity f$2;
            public final /* synthetic */ String f$3;

            public /* synthetic */ RustoreBillingClientWrapper$$ExternalSyntheticLambda12(Integer r72, FragmentActivity r62, String productId2) {
                r2 = r72;
                r3 = r62;
                r4 = productId2;
            }

            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RustoreBillingClientWrapper.purchaseProduct$lambda$12(RustoreBillingClientWrapper.this, r2, r3, r4, (PaymentResult) obj);
            }
        })) == null) {
            return;
        }
        addOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda13
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RustoreBillingClientWrapper.purchaseProduct$lambda$13(th);
            }
        });
    }

    public static final void purchaseProduct$lambda$12(RustoreBillingClientWrapper this$0, Integer num, FragmentActivity activity, String productId, PaymentResult paymentResult) {
        PurchasesUseCase purchases;
        Task<Purchase> purchaseInfo;
        Task<Purchase> addOnSuccessListener;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(productId, "$productId");
        Intrinsics.checkNotNullParameter(paymentResult, "paymentResult");
        if (Intrinsics.areEqual(paymentResult, PaymentResult.InvalidPaymentState.INSTANCE)) {
            UtilsKt.crashlyticsRecordNewException("Rustore: purchaseProduct: PaymentResult.InvalidPaymentState");
            return;
        }
        if (paymentResult instanceof PaymentResult.Cancelled) {
            UtilsKt.crashlyticsLog("Rustore: purchaseProduct: PaymentResult.Cancelled " + ((PaymentResult.Cancelled) paymentResult).getPurchaseId() + " ");
            return;
        }
        if (paymentResult instanceof PaymentResult.Failure) {
            PaymentResult.Failure failure = (PaymentResult.Failure) paymentResult;
            UtilsKt.crashlyticsRecordNewException("Rustore: purchaseProduct: PaymentResult.Failure " + failure.getErrorCode() + " " + failure.getOrderId());
            return;
        }
        if (paymentResult instanceof PaymentResult.Success) {
            UtilsKt.crashlyticsLog("purchaseProduct: Success " + paymentResult);
            RuStoreBillingClient ruStoreBillingClient = this$0.billingClient;
            if (ruStoreBillingClient == null || (purchases = ruStoreBillingClient.getPurchases()) == null || (purchaseInfo = purchases.getPurchaseInfo(((PaymentResult.Success) paymentResult).getPurchaseId())) == null || (addOnSuccessListener = purchaseInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda6
                public final /* synthetic */ RustoreBillingClientWrapper f$1;
                public final /* synthetic */ Integer f$2;
                public final /* synthetic */ FragmentActivity f$3;
                public final /* synthetic */ String f$4;

                public /* synthetic */ RustoreBillingClientWrapper$$ExternalSyntheticLambda6(RustoreBillingClientWrapper this$02, Integer num2, FragmentActivity activity2, String productId2) {
                    r2 = this$02;
                    r3 = num2;
                    r4 = activity2;
                    r5 = productId2;
                }

                @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    RustoreBillingClientWrapper.purchaseProduct$lambda$12$lambda$10(PaymentResult.this, r2, r3, r4, r5, (Purchase) obj);
                }
            })) == null) {
                return;
            }
            addOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda7
                public /* synthetic */ RustoreBillingClientWrapper$$ExternalSyntheticLambda7() {
                }

                @Override // ru.rustore.sdk.core.tasks.OnFailureListener
                public final void onFailure(Throwable th) {
                    RustoreBillingClientWrapper.purchaseProduct$lambda$12$lambda$11(PaymentResult.this, th);
                }
            });
        }
    }

    public static final void purchaseProduct$lambda$12$lambda$10(PaymentResult paymentResult, RustoreBillingClientWrapper this$0, Integer num, FragmentActivity activity, String productId, Purchase purchase) {
        Intrinsics.checkNotNullParameter(paymentResult, "$paymentResult");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(productId, "$productId");
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        UtilsKt.crashlyticsLog("purchaseProduct:getPurchaseInfo: Success " + paymentResult + " " + purchase);
        if (purchase.getPurchaseState() != PurchaseState.INVOICE_CREATED) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this$0.unconfirmedPayment.getValue());
            if (num != null) {
                PaymentResult.Success success = (PaymentResult.Success) paymentResult;
                arrayList.add(this$0.mapProductToRustoreBillingPurchaseRequest(activity, productId, num.intValue(), success.getInvoiceId(), success.getPurchaseId()));
            } else {
                PaymentResult.Success success2 = (PaymentResult.Success) paymentResult;
                UtilsKt.crashlyticsRecordNewException("Rustore: purchaseProduct: getPurchaseInfo: price == null paymentResult.invoiceId " + success2.getInvoiceId() + " purchaseId " + success2.getPurchaseId());
            }
            UtilsKt.crashlyticsLog("purchaseProduct:getPurchaseInfo: Success список: " + arrayList);
            this$0._unconfirmedPayment.setValue(arrayList);
        }
    }

    public static final void purchaseProduct$lambda$12$lambda$11(PaymentResult paymentResult, Throwable throwable) {
        Intrinsics.checkNotNullParameter(paymentResult, "$paymentResult");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        UtilsKt.crashlyticsRecordNewException("Rustore: purchaseProduct: getPurchaseInfo: addOnFailureListener purchaseId" + ((PaymentResult.Success) paymentResult).getPurchaseId() + " " + throwable);
    }

    public static final void purchaseProduct$lambda$13(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        UtilsKt.crashlyticsRecordNewException("Rustore: purchaseProduct: addOnFailureListener " + throwable);
    }

    public final void deleteRequestAfterSuccessOrError(@NotNull String purchaseId) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.unconfirmedPayment.getValue());
        arrayList.removeIf(new Predicate() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda14
            public /* synthetic */ RustoreBillingClientWrapper$$ExternalSyntheticLambda14() {
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean deleteRequestAfterSuccessOrError$lambda$16$lambda$15;
                deleteRequestAfterSuccessOrError$lambda$16$lambda$15 = RustoreBillingClientWrapper.deleteRequestAfterSuccessOrError$lambda$16$lambda$15(Function1.this, obj);
                return deleteRequestAfterSuccessOrError$lambda$16$lambda$15;
            }
        });
        this._unconfirmedPayment.setValue(arrayList);
    }

    public static final boolean deleteRequestAfterSuccessOrError$lambda$16$lambda$15(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    public final void confirmPurchase(@NotNull String purchaseId) {
        PurchasesUseCase purchases;
        Task confirmPurchase$default;
        Task addOnSuccessListener;
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        RuStoreBillingClient ruStoreBillingClient = this.billingClient;
        if (ruStoreBillingClient == null || (purchases = ruStoreBillingClient.getPurchases()) == null || (confirmPurchase$default = PurchasesUseCase.confirmPurchase$default(purchases, purchaseId, null, 2, null)) == null || (addOnSuccessListener = confirmPurchase$default.addOnSuccessListener(new OnSuccessListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda10
            public final /* synthetic */ String f$0;

            public /* synthetic */ RustoreBillingClientWrapper$$ExternalSyntheticLambda10(String purchaseId2) {
                r1 = purchaseId2;
            }

            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RustoreBillingClientWrapper.confirmPurchase$lambda$17(r1, (Unit) obj);
            }
        })) == null) {
            return;
        }
        addOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda11
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RustoreBillingClientWrapper.confirmPurchase$lambda$18(th);
            }
        });
    }

    public static final void confirmPurchase$lambda$17(String purchaseId, Unit it) {
        Intrinsics.checkNotNullParameter(purchaseId, "$purchaseId");
        Intrinsics.checkNotNullParameter(it, "it");
        UtilsKt.crashlyticsLog("confirmPurchase " + purchaseId);
    }

    public static final void confirmPurchase$lambda$18(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        UtilsKt.crashlyticsRecordNewException("confirmPurchase: FAILURE " + t);
    }

    public final void deletePurchase(@NotNull String purchaseId) {
        PurchasesUseCase purchases;
        Task<Unit> deletePurchase;
        Task<Unit> addOnSuccessListener;
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        RuStoreBillingClient ruStoreBillingClient = this.billingClient;
        if (ruStoreBillingClient == null || (purchases = ruStoreBillingClient.getPurchases()) == null || (deletePurchase = purchases.deletePurchase(purchaseId)) == null || (addOnSuccessListener = deletePurchase.addOnSuccessListener(new OnSuccessListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda0
            public final /* synthetic */ String f$0;

            public /* synthetic */ RustoreBillingClientWrapper$$ExternalSyntheticLambda0(String purchaseId2) {
                r1 = purchaseId2;
            }

            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RustoreBillingClientWrapper.deletePurchase$lambda$19(r1, (Unit) obj);
            }
        })) == null) {
            return;
        }
        addOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda1
            public final /* synthetic */ String f$0;

            public /* synthetic */ RustoreBillingClientWrapper$$ExternalSyntheticLambda1(String purchaseId2) {
                r1 = purchaseId2;
            }

            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RustoreBillingClientWrapper.deletePurchase$lambda$20(r1, th);
            }
        });
    }

    public static final void deletePurchase$lambda$19(String purchaseId, Unit it) {
        Intrinsics.checkNotNullParameter(purchaseId, "$purchaseId");
        Intrinsics.checkNotNullParameter(it, "it");
        UtilsKt.crashlyticsLog("deletePurchase addOnSuccessListener " + purchaseId);
    }

    public static final void deletePurchase$lambda$20(String purchaseId, Throwable t) {
        Intrinsics.checkNotNullParameter(purchaseId, "$purchaseId");
        Intrinsics.checkNotNullParameter(t, "t");
        UtilsKt.crashlyticsRecordNewException("deletePurchase addOnFailureListener " + t + " " + purchaseId);
    }

    public final void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        RuStoreBillingClient ruStoreBillingClient = this.billingClient;
        if (ruStoreBillingClient != null) {
            ruStoreBillingClient.onNewIntent(intent);
        }
    }

    public final RustoreBillingPurchaseRequest mapProductToRustoreBillingPurchaseRequest(Context context, String productId, int r13, String invoiceId, String purchaseId) {
        String string = Preferences.getString(context, NewMenuConstants.PLAYERS_NICK);
        String string2 = Preferences.getString(context, Preferences.USER_APPMETRICA_DEVICE_ID);
        if (string2.length() == 0) {
            string2 = null;
        }
        String str = string2;
        int integer = Preferences.getInteger(context, Preferences.USER_SERVER, -2);
        int integer2 = Preferences.getInteger(context, Preferences.USER_ACCOUNT_ID, -1);
        if (integer < 200) {
            integer++;
        }
        int i = integer;
        Intrinsics.checkNotNull(string);
        return new RustoreBillingPurchaseRequest(string, integer2, productId, i, r13, invoiceId, str, purchaseId);
    }
}
