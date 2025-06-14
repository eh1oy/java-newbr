package com.blackhub.bronline.launcher.database;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.android.billingclient.api.BillingFlowParams;
import com.blackhub.bronline.game.core.utils.payment.rustore.model.RustoreBillingPurchaseRequest;
import com.blackhub.bronline.game.gui.fractions.Const;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
/* loaded from: classes4.dex */
public final class PurchaseRustoreDao_Impl implements PurchaseRustoreDao {
    public final RoomDatabase __db;
    public final EntityInsertionAdapter<RustoreBillingPurchaseRequest> __insertionAdapterOfRustoreBillingPurchaseRequest;
    public final SharedSQLiteStatement __preparedStmtOfClearTable;
    public final SharedSQLiteStatement __preparedStmtOfDeletePurchaseByToken;

    public PurchaseRustoreDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfRustoreBillingPurchaseRequest = new EntityInsertionAdapter<RustoreBillingPurchaseRequest>(__db) { // from class: com.blackhub.bronline.launcher.database.PurchaseRustoreDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            @NonNull
            public String createQuery() {
                return "INSERT OR IGNORE INTO `BillingRustorePurchases` (`nickname`,`accountId`,`productIdFromRustore`,`serverId`,`summa`,`invoiceId`,`appmetricaDeviceId`,`purchaseId`) VALUES (?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(@NonNull final SupportSQLiteStatement statement, @NonNull final RustoreBillingPurchaseRequest entity) {
                statement.bindString(1, entity.getNickname());
                statement.bindLong(2, entity.getAccountId());
                statement.bindString(3, entity.getProductIdFromRustore());
                statement.bindLong(4, entity.getServerId());
                statement.bindLong(5, entity.getSumma());
                statement.bindString(6, entity.getInvoiceId());
                if (entity.getAppmetricaDeviceId() == null) {
                    statement.bindNull(7);
                } else {
                    statement.bindString(7, entity.getAppmetricaDeviceId());
                }
                statement.bindString(8, entity.getPurchaseId());
            }
        };
        this.__preparedStmtOfDeletePurchaseByToken = new SharedSQLiteStatement(__db) { // from class: com.blackhub.bronline.launcher.database.PurchaseRustoreDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            @NonNull
            public String createQuery() {
                return "DELETE FROM BillingRustorePurchases WHERE purchaseId LIKE ?";
            }
        };
        this.__preparedStmtOfClearTable = new SharedSQLiteStatement(__db) { // from class: com.blackhub.bronline.launcher.database.PurchaseRustoreDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            @NonNull
            public String createQuery() {
                return "DELETE FROM BillingRustorePurchases";
            }
        };
    }

    @Override // com.blackhub.bronline.launcher.database.PurchaseRustoreDao
    public void insertAll(final List<RustoreBillingPurchaseRequest> purchasesList) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRustoreBillingPurchaseRequest.insert(purchasesList);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.blackhub.bronline.launcher.database.PurchaseRustoreDao
    public void deletePurchaseByToken(final String purchaseId) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDeletePurchaseByToken.acquire();
        acquire.bindString(1, purchaseId);
        try {
            this.__db.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfDeletePurchaseByToken.release(acquire);
        }
    }

    @Override // com.blackhub.bronline.launcher.database.PurchaseRustoreDao
    public void clearTable() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfClearTable.acquire();
        try {
            this.__db.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfClearTable.release(acquire);
        }
    }

    @Override // com.blackhub.bronline.launcher.database.PurchaseRustoreDao
    public List<RustoreBillingPurchaseRequest> getAllPurchases() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM BillingRustorePurchases", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Const.FRACTION_CONTROL_PLAYER_NICKNAME);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "productIdFromRustore");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "serverId");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "summa");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "invoiceId");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "appmetricaDeviceId");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "purchaseId");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new RustoreBillingPurchaseRequest(query.getString(columnIndexOrThrow), query.getInt(columnIndexOrThrow2), query.getString(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.getString(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.getString(columnIndexOrThrow8)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.blackhub.bronline.launcher.database.PurchaseRustoreDao
    public RustoreBillingPurchaseRequest getPurchaseByToken(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM BillingRustorePurchases WHERE purchaseId LIKE ?", 1);
        acquire.bindString(1, str);
        this.__db.assertNotSuspendingTransaction();
        RustoreBillingPurchaseRequest rustoreBillingPurchaseRequest = null;
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Const.FRACTION_CONTROL_PLAYER_NICKNAME);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "productIdFromRustore");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "serverId");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "summa");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "invoiceId");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "appmetricaDeviceId");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "purchaseId");
            if (query.moveToFirst()) {
                rustoreBillingPurchaseRequest = new RustoreBillingPurchaseRequest(query.getString(columnIndexOrThrow), query.getInt(columnIndexOrThrow2), query.getString(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.getString(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.getString(columnIndexOrThrow8));
            }
            return rustoreBillingPurchaseRequest;
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
