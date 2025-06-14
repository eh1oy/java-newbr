package com.blackhub.bronline.game.core.viewmodel;

import android.app.Application;
import android.content.Intent;
import androidx.annotation.RawRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.common.C;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.android.billingclient.api.ProductDetails;
import com.blackhub.bronline.game.core.constants.LogTagConstants;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.model.ConfigurationJsonModel;
import com.blackhub.bronline.game.core.network.JNIActivityActionWithJSON;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.utils.payment.BillingClientWrapper;
import com.blackhub.bronline.game.core.utils.payment.BillingError;
import com.blackhub.bronline.game.core.utils.payment.BillingInfo;
import com.blackhub.bronline.game.core.utils.payment.OnQueryProductsListener;
import com.blackhub.bronline.game.core.utils.payment.model.BillingPurchaseRequest;
import com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper;
import com.blackhub.bronline.game.core.utils.payment.rustore.model.RustoreBillingPurchaseRequest;
import com.blackhub.bronline.game.gui.calendar.model.CalendarScreenType;
import com.blackhub.bronline.game.gui.chooseserver.model.YoutuberAcc;
import com.blackhub.bronline.game.gui.donate.data.BillingItem;
import com.blackhub.bronline.game.gui.tuning.data.TuneObj;
import com.blackhub.bronline.game.gui.tuning.data.TuneVinylsObj;
import com.blackhub.bronline.game.ui.donate.DonateDepositCoinsItemModel;
import com.blackhub.bronline.game.ui.donate.ProductDetailsItem;
import com.blackhub.bronline.game.ui.donate.RustoreProductDetailsItem;
import com.blackhub.bronline.launcher.database.PurchaseDatabase;
import com.blackhub.bronline.launcher.network.Api;
import com.blackhub.bronline.launcher.network.PaymentApi;
import com.blackhub.bronline.launcher.network.Server;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.http.HttpStatus;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;
import ru.rustore.sdk.billingclient.RuStoreBillingClient;
import ru.rustore.sdk.billingclient.model.product.Product;
import ru.rustore.sdk.billingclient.usecase.ProductsUseCase;
import ru.rustore.sdk.core.tasks.OnFailureListener;
import ru.rustore.sdk.core.tasks.OnSuccessListener;
import ru.rustore.sdk.core.tasks.Task;

/* compiled from: JNIActivityViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00020%0 2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020%0 H\u0002J\u0006\u0010S\u001a\u00020TJ\u0016\u0010U\u001a\u00020T2\u0006\u0010V\u001a\u00020\u001c2\u0006\u0010W\u001a\u00020\u001cJ\u0010\u0010X\u001a\u00020T2\u0006\u0010V\u001a\u00020\u001cH\u0002J\u0010\u0010Y\u001a\u00020T2\u0006\u0010V\u001a\u00020\u001cH\u0002J®\u0001\u0010Z\u001a\u00020T\"\u0004\b\u0000\u0010[2\"\u0010\\\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H[0_0^\u0012\u0006\u0012\u0004\u0018\u00010`0]2\"\u0010a\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H[0_0^\u0012\u0006\u0012\u0004\u0018\u00010`0]2\u0018\u0010b\u001a\u0014\u0012\u0004\u0012\u0002H[\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020T0c2\u000e\b\u0002\u0010d\u001a\b\u0012\u0004\u0012\u00020T0e2\b\b\u0002\u0010f\u001a\u00020\u00152\b\b\u0002\u0010g\u001a\u00020\u00152\b\b\u0002\u0010h\u001a\u00020\u00152\b\b\u0002\u0010i\u001a\u00020jH\u0082@¢\u0006\u0002\u0010kJ\u0010\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020mH\u0002J\u0010\u0010o\u001a\u00020p2\u0006\u0010n\u001a\u00020pH\u0002J\u0006\u0010q\u001a\u00020TJ\u0006\u0010r\u001a\u00020TJ\u0016\u0010s\u001a\u00020T2\u0006\u0010t\u001a\u00020mH\u0082@¢\u0006\u0002\u0010uJ\u0016\u0010v\u001a\u00020T2\u0006\u0010t\u001a\u00020pH\u0082@¢\u0006\u0002\u0010wJ\u0006\u0010x\u001a\u00020TJ\u000e\u0010y\u001a\u00020T2\u0006\u0010z\u001a\u00020{J\u0006\u0010|\u001a\u00020TJ\u0006\u0010}\u001a\u00020TJ\u0010\u0010~\u001a\u00020T2\u0006\u0010\u007f\u001a\u00020\u0015H\u0002J\t\u0010\u0080\u0001\u001a\u00020TH\u0002J\u0010\u0010\u0081\u0001\u001a\u00020T2\u0007\u0010\u0082\u0001\u001a\u000201J!\u0010\u0083\u0001\u001a\u00020T2\u000e\u0010\u0084\u0001\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010 2\u0006\u0010V\u001a\u00020\u001cH\u0002J\u0016\u0010\u0086\u0001\u001a\u00020T2\r\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020%0 J\t\u0010\u0088\u0001\u001a\u00020TH\u0002J\u0007\u0010\u0089\u0001\u001a\u00020TJ\u001f\u0010\u008a\u0001\u001a\u00020T2\r\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020m0 H\u0082@¢\u0006\u0003\u0010\u008c\u0001J\u001f\u0010\u008d\u0001\u001a\u00020T2\r\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020p0 H\u0082@¢\u0006\u0003\u0010\u008c\u0001J\u0007\u0010\u008e\u0001\u001a\u00020TJ\u0012\u0010\u008f\u0001\u001a\u00020T2\t\b\u0001\u0010\u0090\u0001\u001a\u00020\u0015J\t\u0010\u0091\u0001\u001a\u00020TH\u0002J\t\u0010\u0092\u0001\u001a\u00020TH\u0002J\t\u0010\u0093\u0001\u001a\u00020TH\u0002R\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u001c0\u001c0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0 0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0 0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0 0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0 0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00150+¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001a\u00100\u001a\u000201X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R3\u00106\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020%\u0018\u00010 \u0012\f\u0012\n\u0012\u0004\u0012\u00020)\u0018\u00010 0807¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00190<8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u000e\u0010?\u001a\u00020@X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00150<¢\u0006\b\n\u0000\u001a\u0004\bC\u0010>R\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001c0<¢\u0006\b\n\u0000\u001a\u0004\bD\u0010>R\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001c0<¢\u0006\b\n\u0000\u001a\u0004\bE\u0010>R\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001c0+8F¢\u0006\u0006\u001a\u0004\bF\u0010-R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0<¢\u0006\b\n\u0000\u001a\u0004\bH\u0010>R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u001d\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0 0<¢\u0006\b\n\u0000\u001a\u0004\bL\u0010>R\u0017\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00150<¢\u0006\b\n\u0000\u001a\u0004\bN\u0010>R\u001d\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0 0+¢\u0006\b\n\u0000\u001a\u0004\bP\u0010-¨\u0006\u0094\u0001"}, d2 = {"Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "application", "Landroid/app/Application;", "mainResponse", "Lcom/blackhub/bronline/launcher/network/Api;", "backupResponse", "billingAPI", "Lcom/blackhub/bronline/launcher/network/PaymentApi;", "billingClientWrapper", "Lcom/blackhub/bronline/game/core/utils/payment/BillingClientWrapper;", "rustoreBillingClientWrapper", "Lcom/blackhub/bronline/game/core/utils/payment/rustore/RustoreBillingClientWrapper;", "actionWithJson", "Lcom/blackhub/bronline/game/core/network/JNIActivityActionWithJSON;", "purchaseDatabase", "Lcom/blackhub/bronline/launcher/database/PurchaseDatabase;", "(Landroid/app/Application;Lcom/blackhub/bronline/launcher/network/Api;Lcom/blackhub/bronline/launcher/network/Api;Lcom/blackhub/bronline/launcher/network/PaymentApi;Lcom/blackhub/bronline/game/core/utils/payment/BillingClientWrapper;Lcom/blackhub/bronline/game/core/utils/payment/rustore/RustoreBillingClientWrapper;Lcom/blackhub/bronline/game/core/network/JNIActivityActionWithJSON;Lcom/blackhub/bronline/launcher/database/PurchaseDatabase;)V", "_audioFile", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "_configurationJsons", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/blackhub/bronline/game/core/model/ConfigurationJsonModel;", "_counterOfRequests", "_isFailedRequest", "", "_isNeedRestart", "_isNeedToShowReview", "_productDetailsState", "", "Lcom/blackhub/bronline/game/ui/donate/ProductDetailsItem;", "_rustoreProductDetailsState", "Lcom/blackhub/bronline/game/ui/donate/RustoreProductDetailsItem;", "_servers", "Lcom/blackhub/bronline/launcher/network/Server;", "_totalSizeOfRequests", "_updatedServers", "_youtubersList", "Lcom/blackhub/bronline/game/gui/chooseserver/model/YoutuberAcc;", "audioFileId", "Landroidx/lifecycle/LiveData;", "getAudioFileId", "()Landroidx/lifecycle/LiveData;", "getBillingClientWrapper", "()Lcom/blackhub/bronline/game/core/utils/payment/BillingClientWrapper;", "calendarSavedPage", "Lcom/blackhub/bronline/game/gui/calendar/model/CalendarScreenType;", "getCalendarSavedPage", "()Lcom/blackhub/bronline/game/gui/calendar/model/CalendarScreenType;", "setCalendarSavedPage", "(Lcom/blackhub/bronline/game/gui/calendar/model/CalendarScreenType;)V", "combinedServers", "Landroidx/lifecycle/MediatorLiveData;", "Lkotlin/Pair;", "getCombinedServers", "()Landroidx/lifecycle/MediatorLiveData;", "configurationJsons", "Lkotlinx/coroutines/flow/StateFlow;", "getConfigurationJsons", "()Lkotlinx/coroutines/flow/StateFlow;", "coroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "countOfBillingErrors", "counterOfRequests", "getCounterOfRequests", "isFailedRequest", "isNeedRestart", "isNeedToShowReview", "productDetailsState", "getProductDetailsState", "getRustoreBillingClientWrapper", "()Lcom/blackhub/bronline/game/core/utils/payment/rustore/RustoreBillingClientWrapper;", "rustoreProductDetailsState", "getRustoreProductDetailsState", "totalSizeOfRequests", "getTotalSizeOfRequests", "updatedServers", "getUpdatedServers", "addTestServers", "body", "clearTuneItemStatus", "", "connectPurchases", "isWithDouble", "isNeedToShowDonatePackage", "displayProducts", "displayRustoreProducts", "fetchData", ExifInterface.GPS_DIRECTION_TRUE, "primaryApiCall", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lretrofit2/Response;", "", "backupApiCall", "onSuccess", "Lkotlin/Function2;", "onFailure", "Lkotlin/Function0;", "countOfErrorsFromServersRequest", "maxCountOfErrors", "maxCountOfErrorsReserve", "timeoutForRepeatRequest", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;IIIJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActualProductDetail", "Lcom/blackhub/bronline/game/core/utils/payment/model/BillingPurchaseRequest;", "purchaseRequest", "getActualRustoreProductDetail", "Lcom/blackhub/bronline/game/core/utils/payment/rustore/model/RustoreBillingPurchaseRequest;", "getRustoreBillingPurchases", "getRustoreBillingPurchasesWithoutRequirementAuthorization", "newRequest", "paymentRequest", "(Lcom/blackhub/bronline/game/core/utils/payment/model/BillingPurchaseRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newRustoreRequest", "(Lcom/blackhub/bronline/game/core/utils/payment/rustore/model/RustoreBillingPurchaseRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onNativeInitFinish", "onNewIntent", "intent", "Landroid/content/Intent;", "onSaveBillingData", "reconnectPurchases", "requestJson", "countOfErrors", "requestServersJson", "saveCalendarPage", "selectedPage", "setProductDetails", "products", "Lcom/android/billingclient/api/ProductDetails;", "setUpdatedServers", "servers", "showErrorDialogForRestart", "showReview", "startPurchases", "unconfirmedPaymentRequest", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startRustorePurchases", "turnOffTheSound", "turnOnTheSound", "soundId", "updateProgress", "updatePurchaseDatabase", "updateRustorePurchaseDatabase", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJNIActivityViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JNIActivityViewModel.kt\ncom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1087:1\n48#2,4:1088\n1549#3:1092\n1620#3,3:1093\n1549#3:1096\n1620#3,3:1097\n1549#3:1105\n1620#3,3:1106\n1855#3,2:1109\n1855#3,2:1111\n1603#3,9:1113\n1855#3:1122\n1856#3:1124\n1612#3:1125\n1045#3:1126\n230#4,5:1100\n1#5:1123\n*S KotlinDebug\n*F\n+ 1 JNIActivityViewModel.kt\ncom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel\n*L\n124#1:1088,4\n630#1:1092\n630#1:1093,3\n638#1:1096\n638#1:1097,3\n666#1:1105\n666#1:1106,3\n946#1:1109,2\n965#1:1111,2\n670#1:1113,9\n670#1:1122\n670#1:1124\n670#1:1125\n693#1:1126\n645#1:1100,5\n670#1:1123\n*E\n"})
/* loaded from: classes3.dex */
public final class JNIActivityViewModel extends ViewModel implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final MutableLiveData<Integer> _audioFile;

    @NotNull
    public final MutableStateFlow<ConfigurationJsonModel> _configurationJsons;

    @NotNull
    public final MutableStateFlow<Integer> _counterOfRequests;

    @NotNull
    public final MutableStateFlow<Boolean> _isFailedRequest;

    @NotNull
    public final MutableStateFlow<Boolean> _isNeedRestart;

    @NotNull
    public final MutableLiveData<Boolean> _isNeedToShowReview;

    @NotNull
    public final MutableStateFlow<List<ProductDetailsItem>> _productDetailsState;

    @NotNull
    public final MutableStateFlow<List<RustoreProductDetailsItem>> _rustoreProductDetailsState;

    @NotNull
    public final MutableLiveData<List<Server>> _servers;

    @NotNull
    public MutableStateFlow<Integer> _totalSizeOfRequests;

    @NotNull
    public final MutableLiveData<List<Server>> _updatedServers;

    @NotNull
    public final MutableLiveData<List<YoutuberAcc>> _youtubersList;

    @NotNull
    public final JNIActivityActionWithJSON actionWithJson;

    @NotNull
    public final Application application;

    @NotNull
    public final LiveData<Integer> audioFileId;

    @NotNull
    public final Api backupResponse;

    @NotNull
    public final PaymentApi billingAPI;

    @NotNull
    public final BillingClientWrapper billingClientWrapper;

    @NotNull
    public CalendarScreenType calendarSavedPage;

    @NotNull
    public final MediatorLiveData<Pair<List<Server>, List<YoutuberAcc>>> combinedServers;

    @NotNull
    public final CoroutineExceptionHandler coroutineExceptionHandler;
    public int countOfBillingErrors;

    @NotNull
    public final StateFlow<Integer> counterOfRequests;

    @NotNull
    public final StateFlow<Boolean> isFailedRequest;

    @NotNull
    public final StateFlow<Boolean> isNeedRestart;

    @NotNull
    public final Api mainResponse;

    @NotNull
    public final StateFlow<List<ProductDetailsItem>> productDetailsState;

    @NotNull
    public final PurchaseDatabase purchaseDatabase;

    @NotNull
    public final RustoreBillingClientWrapper rustoreBillingClientWrapper;

    @NotNull
    public final StateFlow<List<RustoreProductDetailsItem>> rustoreProductDetailsState;

    @NotNull
    public final StateFlow<Integer> totalSizeOfRequests;

    @NotNull
    public final LiveData<List<Server>> updatedServers;

    /*  JADX ERROR: NullPointerException in pass: FixAccessModifiers
        java.lang.NullPointerException
        */
    /* JADX WARN: Failed to check method usage
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.MethodNode.getTopParentClass()" because "m" is null
    	at jadx.core.codegen.ClassGen.lambda$skipMethod$4(ClassGen.java:360)
    	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:178)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
    	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682)
    	at jadx.core.codegen.ClassGen.skipMethod(ClassGen.java:361)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:327)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
     */
    public static final /* synthetic */ com.blackhub.bronline.launcher.network.Api access$getBackupResponse$p(com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel r0) {
        /*
            com.blackhub.bronline.launcher.network.Api r0 = r0.backupResponse
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel.access$getBackupResponse$p(com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel):com.blackhub.bronline.launcher.network.Api");
    }

    @NotNull
    public final BillingClientWrapper getBillingClientWrapper() {
        return this.billingClientWrapper;
    }

    @NotNull
    public final RustoreBillingClientWrapper getRustoreBillingClientWrapper() {
        return this.rustoreBillingClientWrapper;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$combinedServers$1$1.<init>(kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.blackhub.bronline.launcher.network.Server>>, androidx.lifecycle.MediatorLiveData<kotlin.Pair<java.util.List<com.blackhub.bronline.launcher.network.Server>, java.util.List<com.blackhub.bronline.game.gui.chooseserver.model.YoutuberAcc>>>, kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.blackhub.bronline.game.gui.chooseserver.model.YoutuberAcc>>):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:290)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:193)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    @javax.inject.Inject
    public JNIActivityViewModel(@org.jetbrains.annotations.NotNull android.app.Application r39, @org.jetbrains.annotations.NotNull com.blackhub.bronline.launcher.network.Api r40, @com.blackhub.bronline.launcher.di.BackupUrlAPI @org.jetbrains.annotations.NotNull com.blackhub.bronline.launcher.network.Api r41, @org.jetbrains.annotations.NotNull com.blackhub.bronline.launcher.network.PaymentApi r42, @org.jetbrains.annotations.NotNull com.blackhub.bronline.game.core.utils.payment.BillingClientWrapper r43, @org.jetbrains.annotations.NotNull com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper r44, @org.jetbrains.annotations.NotNull com.blackhub.bronline.game.core.network.JNIActivityActionWithJSON r45, @org.jetbrains.annotations.NotNull com.blackhub.bronline.launcher.database.PurchaseDatabase r46) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel.<init>(android.app.Application, com.blackhub.bronline.launcher.network.Api, com.blackhub.bronline.launcher.network.Api, com.blackhub.bronline.launcher.network.PaymentApi, com.blackhub.bronline.game.core.utils.payment.BillingClientWrapper, com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper, com.blackhub.bronline.game.core.network.JNIActivityActionWithJSON, com.blackhub.bronline.launcher.database.PurchaseDatabase):void");
    }

    @NotNull
    public final LiveData<List<Server>> getUpdatedServers() {
        return this.updatedServers;
    }

    @NotNull
    public final MediatorLiveData<Pair<List<Server>, List<YoutuberAcc>>> getCombinedServers() {
        return this.combinedServers;
    }

    @NotNull
    public final StateFlow<ConfigurationJsonModel> getConfigurationJsons() {
        return FlowKt.asStateFlow(this._configurationJsons);
    }

    @NotNull
    public final LiveData<Integer> getAudioFileId() {
        return this.audioFileId;
    }

    @NotNull
    public final LiveData<Boolean> isNeedToShowReview() {
        return this._isNeedToShowReview;
    }

    @NotNull
    public final StateFlow<List<ProductDetailsItem>> getProductDetailsState() {
        return this.productDetailsState;
    }

    @NotNull
    public final StateFlow<List<RustoreProductDetailsItem>> getRustoreProductDetailsState() {
        return this.rustoreProductDetailsState;
    }

    @NotNull
    public final StateFlow<Integer> getTotalSizeOfRequests() {
        return this.totalSizeOfRequests;
    }

    @NotNull
    public final StateFlow<Integer> getCounterOfRequests() {
        return this.counterOfRequests;
    }

    @NotNull
    public final StateFlow<Boolean> isFailedRequest() {
        return this.isFailedRequest;
    }

    @NotNull
    public final StateFlow<Boolean> isNeedRestart() {
        return this.isNeedRestart;
    }

    @NotNull
    public final CalendarScreenType getCalendarSavedPage() {
        return this.calendarSavedPage;
    }

    public final void setCalendarSavedPage(@NotNull CalendarScreenType calendarScreenType) {
        Intrinsics.checkNotNullParameter(calendarScreenType, "<set-?>");
        this.calendarSavedPage = calendarScreenType;
    }

    /* compiled from: JNIActivityViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$1", f = "JNIActivityViewModel.kt", i = {}, l = {155, 160, MatroskaExtractor.ID_BLOCK_ADDITIONAL}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$1 */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return JNIActivityViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlow = JNIActivityViewModel.this._totalSizeOfRequests;
                Integer boxInt = Boxing.boxInt(32);
                this.label = 1;
                if (mutableStateFlow.emit(boxInt, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        throw new KotlinNothingValueException();
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    throw new KotlinNothingValueException();
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: JNIActivityViewModel.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "unconfirmedPaymentRequest", "", "Lcom/blackhub/bronline/game/core/utils/payment/model/BillingPurchaseRequest;", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$1$1 */
        public static final class C00861<T> implements FlowCollector {
            public final /* synthetic */ JNIActivityViewModel this$0;

            public C00861(JNIActivityViewModel jNIActivityViewModel) {
                this.this$0 = jNIActivityViewModel;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((List<BillingPurchaseRequest>) obj, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@NotNull List<BillingPurchaseRequest> list, @NotNull Continuation<? super Unit> continuation) {
                Object startPurchases = this.this$0.startPurchases(list, continuation);
                return startPurchases == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? startPurchases : Unit.INSTANCE;
            }
        }

        /* compiled from: JNIActivityViewModel.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "unconfirmedPaymentRequest", "", "Lcom/blackhub/bronline/game/core/utils/payment/rustore/model/RustoreBillingPurchaseRequest;", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$1$2 */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ JNIActivityViewModel this$0;

            public AnonymousClass2(JNIActivityViewModel jNIActivityViewModel) {
                this.this$0 = jNIActivityViewModel;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((List<RustoreBillingPurchaseRequest>) obj, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@NotNull List<RustoreBillingPurchaseRequest> list, @NotNull Continuation<? super Unit> continuation) {
                UtilsKt.crashlyticsLog("unconfirmedPayment collect " + list + " ");
                Object startRustorePurchases = this.this$0.startRustorePurchases(list, continuation);
                return startRustorePurchases == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? startRustorePurchases : Unit.INSTANCE;
            }
        }
    }

    public final void onNativeInitFinish() {
        updateProgress();
    }

    public final void requestServersJson() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new JNIActivityViewModel$requestServersJson$1(this, null), 1, null);
    }

    public final void requestJson(int countOfErrors) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.coroutineExceptionHandler, null, new JNIActivityViewModel$requestJson$1(this, countOfErrors, null), 2, null);
    }

    public final void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.rustoreBillingClientWrapper.onNewIntent(intent);
    }

    public final void getRustoreBillingPurchases() {
        this.rustoreBillingClientWrapper.getRustoreBillingPurchases(this.application);
    }

    public final void setUpdatedServers(@NotNull List<Server> servers) {
        Intrinsics.checkNotNullParameter(servers, "servers");
        this._updatedServers.setValue(servers);
    }

    public final void onSaveBillingData() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new JNIActivityViewModel$onSaveBillingData$1(this, null), 1, null);
    }

    public final void connectPurchases(boolean isWithDouble, boolean isNeedToShowDonatePackage) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new JNIActivityViewModel$connectPurchases$1(isWithDouble, isNeedToShowDonatePackage, this, null), 1, null);
    }

    public final void getRustoreBillingPurchasesWithoutRequirementAuthorization() {
        this.rustoreBillingClientWrapper.getRustoreBillingPurchasesWithoutRequirementAuthorization(this.application);
    }

    public final void reconnectPurchases() {
        this.billingClientWrapper.initBillingClient();
    }

    public final void clearTuneItemStatus() {
        ConfigurationJsonModel copy;
        TuneObj copy2;
        List<TuneObj> tuneObjItemsFromJson = this._configurationJsons.getValue().getTuneObjItemsFromJson();
        List<TuneVinylsObj> tuneVinylsObjFromJson = getConfigurationJsons().getValue().getTuneVinylsObjFromJson();
        List<TuneObj> list = tuneObjItemsFromJson;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            copy2 = r16.copy((r24 & 1) != 0 ? r16.id : 0, (r24 & 2) != 0 ? r16.type : 0, (r24 & 4) != 0 ? r16.selector : 0, (r24 & 8) != 0 ? r16.tuneId : 0, (r24 & 16) != 0 ? r16.name : null, (r24 & 32) != 0 ? r16.imageId : null, (r24 & 64) != 0 ? r16.currency : 0, (r24 & 128) != 0 ? r16.def : 0, (r24 & 256) != 0 ? r16.cost : 0, (r24 & 512) != 0 ? r16.thisLocation : 0, (r24 & 1024) != 0 ? ((TuneObj) it.next()).isChecked : false);
            arrayList.add(copy2);
        }
        List<TuneVinylsObj> list2 = tuneVinylsObjFromJson;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (TuneVinylsObj tuneVinylsObj : list2) {
            tuneVinylsObj.setSelected(false);
            tuneVinylsObj.setStartVinyl(false);
            arrayList2.add(tuneVinylsObj);
        }
        MutableStateFlow<ConfigurationJsonModel> mutableStateFlow = this._configurationJsons;
        while (true) {
            ConfigurationJsonModel value = mutableStateFlow.getValue();
            ArrayList arrayList3 = arrayList;
            copy = r3.copy((r48 & 1) != 0 ? r3.invItemsFromJson : null, (r48 & 2) != 0 ? r3.skinsFromJson : null, (r48 & 4) != 0 ? r3.vehiclesFromJson : null, (r48 & 8) != 0 ? r3.socialInteractionsFromJson : null, (r48 & 16) != 0 ? r3.familySystemListFromJson : null, (r48 & 32) != 0 ? r3.calendarModel : null, (r48 & 64) != 0 ? r3.bpRewardsModel : null, (r48 & 128) != 0 ? r3.craftItemsModel : null, (r48 & 256) != 0 ? r3.craftCategoriesModel : null, (r48 & 512) != 0 ? r3.craftCategoriesFilterModel : null, (r48 & 1024) != 0 ? r3.marketplaceCategoriesFilterModel : null, (r48 & 2048) != 0 ? r3.marketplaceDeliveryFilterModel : null, (r48 & 4096) != 0 ? r3.tanpinBannerModel : null, (r48 & 8192) != 0 ? r3.videoPlayerModel : null, (r48 & 16384) != 0 ? r3.marketplaceConfigurationViewModel : null, (r48 & 32768) != 0 ? r3.holidayEvents : null, (r48 & 65536) != 0 ? r3.casesModel : null, (r48 & 131072) != 0 ? r3.buttonConfig : null, (r48 & 262144) != 0 ? r3.fractionDocuments : null, (r48 & 524288) != 0 ? r3.fractionShopList : null, (r48 & 1048576) != 0 ? r3.fractionQuestsObj : null, (r48 & 2097152) != 0 ? r3.productDetailsState : null, (r48 & 4194304) != 0 ? r3.donateItemsFromJson : null, (r48 & 8388608) != 0 ? r3.carColorItems : null, (r48 & 16777216) != 0 ? r3.blackPassItemsFromJson : null, (r48 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r3.smiListFromJson : null, (r48 & 67108864) != 0 ? r3.smiEditorBodyFromJson : null, (r48 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.tuneObjItemsFromJson : arrayList3, (r48 & 268435456) != 0 ? r3.tuneGuiScreensFromJsonObj : null, (r48 & 536870912) != 0 ? value.tuneVinylsObjFromJson : arrayList2);
            if (mutableStateFlow.compareAndSet(value, copy)) {
                return;
            } else {
                arrayList = arrayList3;
            }
        }
    }

    public final void turnOnTheSound(@RawRes int soundId) {
        this._audioFile.setValue(Integer.valueOf(soundId));
    }

    public final void turnOffTheSound() {
        this._audioFile.setValue(0);
    }

    public final void showReview() {
        this._isNeedToShowReview.setValue(Boolean.TRUE);
    }

    public final void displayRustoreProducts(boolean isWithDouble) {
        ProductsUseCase products;
        Task<List<Product>> products2;
        Task<List<Product>> addOnSuccessListener;
        List<BillingItem> billingObj = BillingInfo.INSTANCE.getBillingObj();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(billingObj, 10));
        Iterator<T> it = billingObj.iterator();
        while (it.hasNext()) {
            arrayList.add(((BillingItem) it.next()).getProductId());
        }
        RuStoreBillingClient billingClient = this.rustoreBillingClientWrapper.getBillingClient();
        if (billingClient == null || (products = billingClient.getProducts()) == null || (products2 = products.getProducts(arrayList)) == null || (addOnSuccessListener = products2.addOnSuccessListener(new OnSuccessListener() { // from class: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$$ExternalSyntheticLambda0
            public final /* synthetic */ boolean f$1;

            public /* synthetic */ JNIActivityViewModel$$ExternalSyntheticLambda0(boolean isWithDouble2) {
                r2 = isWithDouble2;
            }

            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                JNIActivityViewModel.displayRustoreProducts$lambda$11(JNIActivityViewModel.this, r2, (List) obj);
            }
        })) == null) {
            return;
        }
        addOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$$ExternalSyntheticLambda1
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                JNIActivityViewModel.displayRustoreProducts$lambda$12(th);
            }
        });
    }

    public static final void displayRustoreProducts$lambda$11(JNIActivityViewModel this$0, boolean z, List products) {
        RustoreProductDetailsItem rustoreProductDetailsItem;
        Object obj;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(products, "products");
        List<BillingItem> billingObj = BillingInfo.INSTANCE.getBillingObj();
        ArrayList arrayList = new ArrayList();
        for (BillingItem billingItem : billingObj) {
            Iterator it = products.iterator();
            while (true) {
                rustoreProductDetailsItem = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(billingItem.getProductId(), ((Product) obj).getProductId())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Product product = (Product) obj;
            if (product != null) {
                int actualPrice = billingItem.actualPrice(z);
                String valueOfSale = billingItem.valueOfSale(z);
                boolean z2 = billingItem.getOldPrice() != actualPrice;
                String title = product.getTitle();
                String str = title == null ? "" : title;
                String priceLabel = product.getPriceLabel();
                String str2 = priceLabel == null ? "" : priceLabel;
                String description = product.getDescription();
                rustoreProductDetailsItem = new RustoreProductDetailsItem(product, new DonateDepositCoinsItemModel(str, str2, description == null ? "" : description, billingItem.getOldPrice(), actualPrice, z2, valueOfSale));
            }
            if (rustoreProductDetailsItem != null) {
                arrayList.add(rustoreProductDetailsItem);
            }
        }
        this$0._rustoreProductDetailsState.tryEmit(CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$displayRustoreProducts$lambda$11$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(((RustoreProductDetailsItem) t).getProduct().getPrice(), ((RustoreProductDetailsItem) t2).getProduct().getPrice());
            }
        }));
    }

    public static final void displayRustoreProducts$lambda$12(Throwable thowable) {
        Intrinsics.checkNotNullParameter(thowable, "thowable");
        UtilsKt.crashlyticsRecordNewException("funName=JNIActivityViewModel.displayProducts, " + thowable, LogTagConstants.MARKET_BILLING_TAG);
    }

    public final void displayProducts(boolean isWithDouble) {
        this.billingClientWrapper.queryProducts(new OnQueryProductsListener() { // from class: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$displayProducts$1
            public final /* synthetic */ boolean $isWithDouble;

            public JNIActivityViewModel$displayProducts$1(boolean isWithDouble2) {
                r2 = isWithDouble2;
            }

            @Override // com.blackhub.bronline.game.core.utils.payment.OnQueryProductsListener
            public void onSuccess(@NotNull List<ProductDetails> products) {
                Intrinsics.checkNotNullParameter(products, "products");
                JNIActivityViewModel.this.setProductDetails(products, r2);
            }

            @Override // com.blackhub.bronline.game.core.utils.payment.OnQueryProductsListener
            public void onFailure(@NotNull BillingError billingError) {
                Intrinsics.checkNotNullParameter(billingError, "billingError");
                UtilsKt.crashlyticsRecordNewException("funName=JNIActivityViewModel.displayProducts, responseCode=" + billingError.getResponseCode() + ", message=" + billingError.getDebugMessage(), LogTagConstants.MARKET_BILLING_TAG);
            }
        });
    }

    public final void setProductDetails(List<ProductDetails> products, boolean isWithDouble) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new JNIActivityViewModel$setProductDetails$1(products, this, isWithDouble, null), 1, null);
    }

    public final Object startPurchases(List<BillingPurchaseRequest> list, Continuation<? super Unit> continuation) {
        Object newRequest;
        BillingPurchaseRequest billingPurchaseRequest = (BillingPurchaseRequest) CollectionsKt___CollectionsKt.firstOrNull((List) list);
        return (billingPurchaseRequest == null || (newRequest = newRequest(getActualProductDetail(billingPurchaseRequest), continuation)) != IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? Unit.INSTANCE : newRequest;
    }

    public final Object startRustorePurchases(List<RustoreBillingPurchaseRequest> list, Continuation<? super Unit> continuation) {
        Object newRustoreRequest;
        RustoreBillingPurchaseRequest rustoreBillingPurchaseRequest = (RustoreBillingPurchaseRequest) CollectionsKt___CollectionsKt.firstOrNull((List) list);
        return (rustoreBillingPurchaseRequest == null || (newRustoreRequest = newRustoreRequest(getActualRustoreProductDetail(rustoreBillingPurchaseRequest), continuation)) != IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? Unit.INSTANCE : newRustoreRequest;
    }

    public final BillingPurchaseRequest getActualProductDetail(BillingPurchaseRequest purchaseRequest) {
        Object obj;
        List<BillingPurchaseRequest> allPurchases = this.purchaseDatabase.purchaseDao().getAllPurchases();
        Iterator<T> it = allPurchases.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((BillingPurchaseRequest) obj).getSystemPaymentId(), purchaseRequest.getSystemPaymentId())) {
                break;
            }
        }
        BillingPurchaseRequest billingPurchaseRequest = (BillingPurchaseRequest) obj;
        UtilsKt.crashlyticsLog("funName=getActualProductDetail, oldDatabase.size=" + allPurchases.size() + ", purchaseFromDb=" + billingPurchaseRequest, LogTagConstants.MARKET_BILLING_TAG);
        return billingPurchaseRequest == null ? purchaseRequest : billingPurchaseRequest;
    }

    public final RustoreBillingPurchaseRequest getActualRustoreProductDetail(RustoreBillingPurchaseRequest purchaseRequest) {
        Object obj;
        List<RustoreBillingPurchaseRequest> allPurchases = this.purchaseDatabase.purchaseRustoreDao().getAllPurchases();
        Iterator<T> it = allPurchases.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((RustoreBillingPurchaseRequest) obj).getPurchaseId(), purchaseRequest.getPurchaseId())) {
                break;
            }
        }
        RustoreBillingPurchaseRequest rustoreBillingPurchaseRequest = (RustoreBillingPurchaseRequest) obj;
        UtilsKt.crashlyticsLog("funName=getActualProductDetail, oldDatabase.size=" + allPurchases.size() + ", purchaseFromDb=" + rustoreBillingPurchaseRequest, LogTagConstants.RUSTORE_BILLING_TAG);
        return rustoreBillingPurchaseRequest == null ? purchaseRequest : rustoreBillingPurchaseRequest;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:23|24))(6:25|26|27|(1:29)|15|16))(2:30|31))(6:53|54|55|(1:57)|58|(1:60)(1:61))|32|(1:34)(6:35|(1:37)(1:52)|38|(1:45)|46|(1:48)(4:49|(1:51)|27|(0)))|15|16))|71|6|7|(0)(0)|32|(0)(0)|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x005c, code lost:
    
        r15 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x005d, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0058, code lost:
    
        r15 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0059, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0144 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9 A[Catch: Exception -> 0x0058, UnknownHostException -> 0x005c, TryCatch #4 {UnknownHostException -> 0x005c, Exception -> 0x0058, blocks: (B:26:0x0053, B:27:0x0138, B:31:0x0068, B:32:0x00a1, B:34:0x00a9, B:35:0x00c6, B:37:0x00cc, B:38:0x00d2, B:40:0x0100, B:45:0x010d, B:46:0x011a, B:48:0x0121, B:49:0x0129), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6 A[Catch: Exception -> 0x0058, UnknownHostException -> 0x005c, TryCatch #4 {UnknownHostException -> 0x005c, Exception -> 0x0058, blocks: (B:26:0x0053, B:27:0x0138, B:31:0x0068, B:32:0x00a1, B:34:0x00a9, B:35:0x00c6, B:37:0x00cc, B:38:0x00d2, B:40:0x0100, B:45:0x010d, B:46:0x011a, B:48:0x0121, B:49:0x0129), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object newRequest(com.blackhub.bronline.game.core.utils.payment.model.BillingPurchaseRequest r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel.newRequest(com.blackhub.bronline.game.core.utils.payment.model.BillingPurchaseRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:23|24))(6:25|26|27|(1:29)|15|16))(2:30|31))(6:50|51|52|(1:54)|55|(1:57)(1:58))|32|33|(1:35)(4:36|(1:43)|44|(1:46)(4:47|(1:49)|27|(0)))|15|16))|68|6|7|(0)(0)|32|33|(0)(0)|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0062, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0063, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x005e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x005f, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1 A[Catch: Exception -> 0x005e, UnknownHostException -> 0x0062, TRY_ENTER, TryCatch #5 {UnknownHostException -> 0x0062, Exception -> 0x005e, blocks: (B:26:0x0059, B:27:0x0170, B:31:0x006e, B:32:0x00a7, B:35:0x00b1, B:36:0x00e8, B:38:0x011a, B:43:0x0127, B:44:0x014e, B:46:0x0155, B:47:0x0160), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8 A[Catch: Exception -> 0x005e, UnknownHostException -> 0x0062, TryCatch #5 {UnknownHostException -> 0x0062, Exception -> 0x005e, blocks: (B:26:0x0059, B:27:0x0170, B:31:0x006e, B:32:0x00a7, B:35:0x00b1, B:36:0x00e8, B:38:0x011a, B:43:0x0127, B:44:0x014e, B:46:0x0155, B:47:0x0160), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object newRustoreRequest(com.blackhub.bronline.game.core.utils.payment.rustore.model.RustoreBillingPurchaseRequest r17, kotlin.coroutines.Continuation<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel.newRustoreRequest(com.blackhub.bronline.game.core.utils.payment.rustore.model.RustoreBillingPurchaseRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void updatePurchaseDatabase() {
        Object obj;
        List<BillingPurchaseRequest> allPurchases = this.purchaseDatabase.purchaseDao().getAllPurchases();
        ArrayList arrayList = new ArrayList();
        for (BillingPurchaseRequest billingPurchaseRequest : this.billingClientWrapper.getUnconfirmedPayment().getValue()) {
            Iterator<T> it = allPurchases.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((BillingPurchaseRequest) obj).getSystemPaymentId(), billingPurchaseRequest.getSystemPaymentId())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            BillingPurchaseRequest billingPurchaseRequest2 = (BillingPurchaseRequest) obj;
            if (billingPurchaseRequest2 == null) {
                arrayList.add(billingPurchaseRequest);
            } else {
                arrayList.add(billingPurchaseRequest2);
            }
        }
        UtilsKt.crashlyticsLog("funName=updatePurchaseDatabase: size=" + arrayList.size());
        this.purchaseDatabase.purchaseDao().insertAll(arrayList);
    }

    public final void updateRustorePurchaseDatabase() {
        Object obj;
        List<RustoreBillingPurchaseRequest> allPurchases = this.purchaseDatabase.purchaseRustoreDao().getAllPurchases();
        ArrayList arrayList = new ArrayList();
        for (RustoreBillingPurchaseRequest rustoreBillingPurchaseRequest : this.rustoreBillingClientWrapper.getUnconfirmedPayment().getValue()) {
            Iterator<T> it = allPurchases.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((RustoreBillingPurchaseRequest) obj).getPurchaseId(), rustoreBillingPurchaseRequest.getPurchaseId())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            RustoreBillingPurchaseRequest rustoreBillingPurchaseRequest2 = (RustoreBillingPurchaseRequest) obj;
            if (rustoreBillingPurchaseRequest2 == null) {
                arrayList.add(rustoreBillingPurchaseRequest);
            } else {
                arrayList.add(rustoreBillingPurchaseRequest2);
            }
        }
        UtilsKt.crashlyticsLog("funName=updateRustorePurchaseDatabase: size=" + arrayList.size());
        this.purchaseDatabase.purchaseRustoreDao().insertAll(arrayList);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(1:(1:(1:(14:13|(1:(1:60)(3:61|31|32))(1:15)|(3:49|50|(1:52)(6:53|54|55|26|27|(6:33|(5:35|(1:37)|38|39|(1:41)(3:42|(0)(0)|(5:17|18|19|20|(1:22)(7:24|25|26|27|(0)|33|(0)))(0)))|43|38|39|(0)(0))(3:30|31|32)))(0)|47|48|26|27|(0)|33|(0)|43|38|39|(0)(0))(2:62|63))(5:64|43|38|39|(0)(0)))(13:65|66|67|25|26|27|(0)|33|(0)|43|38|39|(0)(0)))(13:68|69|54|55|26|27|(0)|33|(0)|43|38|39|(0)(0)))(13:70|(0)(0)|47|48|26|27|(0)|33|(0)|43|38|39|(0)(0))))|72|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0197 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x022d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v9, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x022e -> B:14:0x023e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object fetchData$retry(int r21, int r22, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super retrofit2.Response<T>>, ? extends java.lang.Object> r23, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super retrofit2.Response<T>>, ? extends java.lang.Object> r24, kotlin.jvm.functions.Function2<? super T, ? super java.lang.Integer, kotlin.Unit> r25, com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel r26, long r27, int r29, kotlin.jvm.functions.Function0<kotlin.Unit> r30, int r31, boolean r32, kotlin.coroutines.Continuation<? super kotlin.Unit> r33) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel.fetchData$retry(int, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel, long, int, kotlin.jvm.functions.Function0, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object fetchData$retry$default(int i, int i2, Function1 function1, Function1 function12, Function2 function2, JNIActivityViewModel jNIActivityViewModel, long j, int i3, Function0 function0, int i4, boolean z, Continuation continuation, int i5, Object obj) {
        boolean z2;
        int i6 = (i5 & 512) != 0 ? i : i4;
        if ((i5 & 1024) != 0) {
            z2 = i >= i2;
        } else {
            z2 = z;
        }
        return fetchData$retry(i, i2, function1, function12, function2, jNIActivityViewModel, j, i3, function0, i6, z2, continuation);
    }

    public final <T> Object fetchData(Function1<? super Continuation<? super Response<T>>, ? extends Object> function1, Function1<? super Continuation<? super Response<T>>, ? extends Object> function12, Function2<? super T, ? super Integer, Unit> function2, Function0<Unit> function0, int i, int i2, int i3, long j, Continuation<? super Unit> continuation) {
        Object fetchData$retry$default = fetchData$retry$default(i, i2, function12, function1, function2, this, j, i3, function0, 0, false, continuation, 1536, null);
        return fetchData$retry$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? fetchData$retry$default : Unit.INSTANCE;
    }

    public final List<Server> addTestServers(List<Server> body) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(body);
        Float valueOf = Float.valueOf(72.73f);
        Float valueOf2 = Float.valueOf(408.9f);
        arrayList.add(new Server("80.66.82.19", "7030", "1000", "1000", "38383D", false, valueOf, valueOf2, "1424", "Test Server P3 (PreProd/ST)", "Test Server P3 (PreProd/ST)", "Test Server P3 (PreProd/ST)", "80.66.82.19", 202));
        arrayList.add(new Server("80.66.82.19", "7040", "1000", "1000", "38383D", false, valueOf, valueOf2, "1424", "Test Server P4 (PreProd/ST)", "Test Server P4 (PreProd/ST)", "Test Server P4 (PreProd/ST)", "80.66.82.19", 203));
        arrayList.add(new Server("80.66.82.19", "7010", "1000", "1000", "38383D", false, valueOf, valueOf2, "1424", "Test Server P1 (Review)", "Test Server P1 (Review)", "Test Server P1 (Review)", "80.66.82.19", 200));
        arrayList.add(new Server("80.66.82.19", "7020", "1000", "1000", "38383D", false, valueOf, valueOf2, "1424", "Test Server P2 (Prod)", "Test Server P2 (Prod)", "Test Server P2 (Prod)", "80.66.82.19", 201));
        arrayList.add(new Server("51.159.125.199", "7777", "1000", "1000", "0000ee", false, valueOf, valueOf2, "1424", "Test Server-Core", "Test Server-Core", "Test Server-Core", "80.66.82.19", null, 8192, null));
        arrayList.add(new Server("5.188.118.53", "7710", "1000", "1000", "000000", false, valueOf, valueOf2, "1424", "Test Server D1", "Test Server D1", "Test Server D1", "80.66.82.19", Integer.valueOf(HttpStatus.SC_RESET_CONTENT)));
        arrayList.add(new Server("5.188.118.53", "7720", "1000", "1000", "000000", false, valueOf, valueOf2, "1424", "Test Server D2", "Test Server D2", "Test Server D2", "80.66.82.19", 206));
        arrayList.add(new Server("5.188.118.53", "7810", "1000", "1000", "000000", false, valueOf, valueOf2, "1424", "Test Server estranossa-1", "Test Server estranossa-1", "Test Server estranossa-1", "80.66.82.19", 207));
        arrayList.add(new Server("5.188.118.53", "7815", "1000", "1000", "000000", false, valueOf, valueOf2, "1424", "Test Server estranossa-2", "Test Server estranossa-2", "Test Server estranossa-2", "80.66.82.19", 208));
        arrayList.add(new Server("5.188.118.53", "7820", "1000", "1000", "000000", false, valueOf, valueOf2, "1424", "Test Server tokie-1", "Test Server tokie-1", "Test Server tokie-1", "80.66.82.19", Integer.valueOf(Cea708Decoder.CueInfoBuilder.HORIZONTAL_SIZE)));
        arrayList.add(new Server("5.188.118.53", "7825", "1000", "1000", "000000", false, valueOf, valueOf2, "1424", "Test Server tokie-2", "Test Server tokie-2", "Test Server tokie-2", "80.66.82.19", 210));
        arrayList.add(new Server("5.188.118.53", "7830", "1000", "1000", "000000", false, valueOf, valueOf2, "1424", "Test Server baton-1", "Test Server baton-1", "Test Server baton-1", "80.66.82.19", 211));
        arrayList.add(new Server("5.188.118.53", "7835", "1000", "1000", "000000", false, valueOf, valueOf2, "1424", "Test Server baton-2", "Test Server baton-2", "Test Server baton-2", "80.66.82.19", 212));
        arrayList.add(new Server("5.188.118.53", "7840", "1000", "1000", "000000", false, valueOf, valueOf2, "1424", "Test Server ihn1fi-1", "Test Server ihn1fi-1", "Test Server ihn1fi-1", "80.66.82.19", 213));
        arrayList.add(new Server("5.188.118.53", "7845", "1000", "1000", "000000", false, valueOf, valueOf2, "1424", "Test Server ihn1fi-2", "Test Server ihn1fi-2", "Test Server ihn1fi-2", "80.66.82.19", 214));
        arrayList.add(new Server("5.188.118.53", "7850", "1000", "1000", "000000", false, valueOf, valueOf2, "1424", "Test Server mazer-1", "Test Server mazer-1", "Test Server mazer-1", "80.66.82.19", Integer.valueOf(MatroskaExtractor.ID_TRACK_NUMBER)));
        arrayList.add(new Server("5.188.118.53", "7855", "1000", "1000", "000000", false, valueOf, valueOf2, "1424", "Test Server mazer-2", "Test Server mazer-2", "Test Server mazer-2", "80.66.82.19", 216));
        arrayList.add(new Server("5.188.118.53", "7860", "1000", "1000", "000000", false, valueOf, valueOf2, "1424", "Test Server bury-1", "Test Server bury-1", "Test Server bury-1", "80.66.82.19", 217));
        arrayList.add(new Server("5.188.118.53", "7865", "1000", "1000", "000000", false, valueOf, valueOf2, "1424", "Test Server bury-2", "Test Server bury-2", "Test Server bury-2", "80.66.82.19", 218));
        arrayList.add(new Server("5.188.118.53", "7870", "1000", "1000", "000000", false, valueOf, valueOf2, "1424", "Test Server frankcompton-1", "Test Server frankcompton-1", "Test Server frankcompton-1", "80.66.82.19", 219));
        arrayList.add(new Server("5.188.118.53", "7875", "1000", "1000", "000000", false, valueOf, valueOf2, "1424", "Test Server frankcompton-2", "Test Server frankcompton-2", "Test Server frankcompton-2", "80.66.82.19", 220));
        return arrayList;
    }

    public final void updateProgress() {
        MutableStateFlow<Integer> mutableStateFlow = this._counterOfRequests;
        mutableStateFlow.setValue(Integer.valueOf(mutableStateFlow.getValue().intValue() + 1));
    }

    public final void showErrorDialogForRestart() {
        this._isNeedRestart.setValue(Boolean.TRUE);
    }

    public final void saveCalendarPage(@NotNull CalendarScreenType selectedPage) {
        Intrinsics.checkNotNullParameter(selectedPage, "selectedPage");
        this.calendarSavedPage = selectedPage;
    }
}
