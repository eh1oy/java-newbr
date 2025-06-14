package com.blackhub.bronline.launcher.database;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.android.billingclient.api.BillingFlowParams;
import com.blackhub.bronline.game.core.utils.payment.model.BillingPurchaseRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
/* loaded from: classes4.dex */
public final class PurchaseDao_Impl implements PurchaseDao {
    public final RoomDatabase __db;
    public final EntityInsertionAdapter<BillingPurchaseRequest> __insertionAdapterOfBillingPurchaseRequest;

    public PurchaseDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfBillingPurchaseRequest = new EntityInsertionAdapter<BillingPurchaseRequest>(__db) { // from class: com.blackhub.bronline.launcher.database.PurchaseDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            @NonNull
            public String createQuery() {
                return "INSERT OR IGNORE INTO `BillingPurchases` (`systemPaymentId`,`account`,`paymentMethod`,`server`,`summa`,`currency`,`bc`,`source`,`productId`,`accountId`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(@NonNull final SupportSQLiteStatement statement, @NonNull final BillingPurchaseRequest entity) {
                statement.bindString(1, entity.getSystemPaymentId());
                statement.bindString(2, entity.getAccount());
                statement.bindString(3, entity.getPaymentMethod());
                statement.bindLong(4, entity.getServer());
                statement.bindString(5, entity.getSumma());
                statement.bindString(6, entity.getCurrency());
                statement.bindLong(7, entity.getBc());
                statement.bindString(8, entity.getSource());
                statement.bindString(9, entity.getProductId());
                statement.bindLong(10, entity.getAccountId());
            }
        };
    }

    @Override // com.blackhub.bronline.launcher.database.PurchaseDao
    public void insertAll(final List<BillingPurchaseRequest> purchasesList) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfBillingPurchaseRequest.insert(purchasesList);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.blackhub.bronline.launcher.database.PurchaseDao
    public List<BillingPurchaseRequest> getAllPurchases() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM BillingPurchases", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "systemPaymentId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "account");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "paymentMethod");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "server");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "summa");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, FirebaseAnalytics.Param.CURRENCY);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "bc");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "source");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "productId");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID);
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new BillingPurchaseRequest(query.getString(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getString(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getString(columnIndexOrThrow5), query.getString(columnIndexOrThrow6), query.getInt(columnIndexOrThrow7), query.getString(columnIndexOrThrow8), query.getString(columnIndexOrThrow9), query.getInt(columnIndexOrThrow10)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.blackhub.bronline.launcher.database.PurchaseDao
    public BillingPurchaseRequest getPurchaseByToken(final String systemPaymentId) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM BillingPurchases WHERE systemPaymentId LIKE ?", 1);
        acquire.bindString(1, systemPaymentId);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            return query.moveToFirst() ? new BillingPurchaseRequest(query.getString(CursorUtil.getColumnIndexOrThrow(query, "systemPaymentId")), query.getString(CursorUtil.getColumnIndexOrThrow(query, "account")), query.getString(CursorUtil.getColumnIndexOrThrow(query, "paymentMethod")), query.getInt(CursorUtil.getColumnIndexOrThrow(query, "server")), query.getString(CursorUtil.getColumnIndexOrThrow(query, "summa")), query.getString(CursorUtil.getColumnIndexOrThrow(query, FirebaseAnalytics.Param.CURRENCY)), query.getInt(CursorUtil.getColumnIndexOrThrow(query, "bc")), query.getString(CursorUtil.getColumnIndexOrThrow(query, "source")), query.getString(CursorUtil.getColumnIndexOrThrow(query, "productId")), query.getInt(CursorUtil.getColumnIndexOrThrow(query, BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID))) : null;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
