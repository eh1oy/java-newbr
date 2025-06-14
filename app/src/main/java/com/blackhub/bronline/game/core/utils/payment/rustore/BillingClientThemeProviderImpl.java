package com.blackhub.bronline.game.core.utils.payment.rustore;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.billingclient.presentation.BillingClientTheme;
import ru.rustore.sdk.billingclient.provider.BillingClientThemeProvider;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: BillingClientThemeProviderImpl.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/blackhub/bronline/game/core/utils/payment/rustore/BillingClientThemeProviderImpl;", "Lru/rustore/sdk/billingclient/provider/BillingClientThemeProvider;", "()V", "provide", "Lru/rustore/sdk/billingclient/presentation/BillingClientTheme;", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BillingClientThemeProviderImpl implements BillingClientThemeProvider {
    public static final int $stable = 0;

    @Override // ru.rustore.sdk.billingclient.provider.BillingClientThemeProvider
    @NotNull
    public BillingClientTheme provide() {
        return BillingClientTheme.Dark;
    }
}
