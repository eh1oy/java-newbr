package com.blackhub.bronline.game.core.utils.payment;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.android.billingclient.api.BillingFlowParams;
import com.blackhub.bronline.game.gui.fractions.Const;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003¨\u0006\f"}, d2 = {"Migration_2_3", "Landroidx/room/migration/Migration;", "getMigration_2_3", "()Landroidx/room/migration/Migration;", "Migration_3_5", "getMigration_3_5", "Migration_4_5", "getMigration_4_5", "createBillingRustorePurchases", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "app_siteRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UtilsKt {

    @NotNull
    public static final Migration Migration_2_3 = new Migration() { // from class: com.blackhub.bronline.game.core.utils.payment.UtilsKt$Migration_2_3$1
        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("ALTER TABLE BillingPurchases ADD COLUMN accountId INTEGER NOT NULL DEFAULT 0");
        }
    };

    @NotNull
    public static final Migration Migration_3_5 = new Migration() { // from class: com.blackhub.bronline.game.core.utils.payment.UtilsKt$Migration_3_5$1
        @Override // androidx.room.migration.Migration
        @SuppressLint({"SdCardPath"})
        public void migrate(@NotNull SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            try {
                if (new File("/data/data/com.launcher.brgame/databases/BillingRustorePurchases.db").exists()) {
                    SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase("/data/data/com.launcher.brgame/databases/BillingRustorePurchases.db", null, 1);
                    Cursor rawQuery = openDatabase.rawQuery("SELECT * FROM BillingRustorePurchases", null);
                    while (rawQuery.moveToNext()) {
                        try {
                            try {
                                String string = rawQuery.getString(rawQuery.getColumnIndexOrThrow(Const.FRACTION_CONTROL_PLAYER_NICKNAME));
                                int i = rawQuery.getInt(rawQuery.getColumnIndexOrThrow(BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID));
                                db.execSQL("\n                        INSERT INTO BillingRustorePurchases (purchaseId, accountId, productIdFromRustore, serverId, summa, invoiceId, appmetricaDeviceId, nickname)\n                        VALUES (?, ?, ?, ?, ?, ?, ?, ?)\n                    ", new Object[]{rawQuery.getString(rawQuery.getColumnIndexOrThrow("purchaseId")), Integer.valueOf(i), rawQuery.getString(rawQuery.getColumnIndexOrThrow("productIdFromRustore")), Integer.valueOf(rawQuery.getInt(rawQuery.getColumnIndexOrThrow("serverId"))), Integer.valueOf(rawQuery.getInt(rawQuery.getColumnIndexOrThrow("summa"))), rawQuery.getString(rawQuery.getColumnIndexOrThrow("invoiceId")), rawQuery.getString(rawQuery.getColumnIndexOrThrow("appmetricaDeviceId")), string});
                            } catch (Exception e) {
                                com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog("Migration_3_5 " + e);
                                rawQuery.close();
                            }
                        } catch (Throwable th) {
                            rawQuery.close();
                            openDatabase.close();
                            throw th;
                        }
                    }
                    rawQuery.close();
                    openDatabase.close();
                    return;
                }
                Cursor query = db.query("PRAGMA table_info(BillingRustorePurchases)", new Object[0]);
                try {
                    if (query.getCount() == 0) {
                        UtilsKt.createBillingRustorePurchases(db);
                        com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog("Old database not found, created new BillingRustorePurchases table.");
                    } else {
                        com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog("BillingRustorePurchases table already exists.");
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(query, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(query, th2);
                        throw th3;
                    }
                }
            } catch (SQLiteCantOpenDatabaseException e2) {
                com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog("Error during Migration_3_4 SQLiteCantOpenDatabaseException " + e2);
                UtilsKt.createBillingRustorePurchases(db);
            } catch (SQLiteException e3) {
                com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog("Error during Migration_3_4 " + e3);
                UtilsKt.createBillingRustorePurchases(db);
            } catch (Exception e4) {
                com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog("Error during Migration_3_5: " + e4);
                UtilsKt.createBillingRustorePurchases(db);
            }
        }
    };

    @NotNull
    public static final Migration Migration_4_5 = new Migration() { // from class: com.blackhub.bronline.game.core.utils.payment.UtilsKt$Migration_4_5$1
        @Override // androidx.room.migration.Migration
        @SuppressLint({"SdCardPath"})
        public void migrate(@NotNull SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            try {
                db.execSQL("\n                CREATE TABLE BillingRustorePurchases_temp (\n                    purchaseId TEXT PRIMARY KEY,\n                    accountId INTEGER NOT NULL,\n                    productIdFromRustore TEXT NOT NULL,\n                    serverId INTEGER NOT NULL,\n                    summa INTEGER NOT NULL,\n                    invoiceId TEXT NOT NULL,\n                    appmetricaDeviceId TEXT,\n                    nickname TEXT NOT NULL\n                );\n            ");
                db.execSQL("\n                INSERT INTO BillingRustorePurchases_temp (purchaseId, accountId, productIdFromRustore, serverId, summa, invoiceId, appmetricaDeviceId, nickname)\n                SELECT purchaseId, playerId, productId, serverId, summa, invoiceId, appmetricaDeviceId, account\n                FROM BillingRustorePurchases;\n            ");
                db.execSQL("DROP TABLE IF EXISTS BillingRustorePurchases");
                db.execSQL("ALTER TABLE BillingRustorePurchases_temp RENAME TO BillingRustorePurchases");
                com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog("Migration 4 -> 5: Schema updated and data transferred successfully.");
            } catch (SQLiteException e) {
                com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog("Error during Migration_4_5: " + e);
            } catch (Exception e2) {
                com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog("Error during Migration_4_5: " + e2);
            }
        }
    };

    @NotNull
    public static final Migration getMigration_2_3() {
        return Migration_2_3;
    }

    @NotNull
    public static final Migration getMigration_3_5() {
        return Migration_3_5;
    }

    public static final void createBillingRustorePurchases(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        try {
            db.execSQL("\n                    CREATE TABLE IF NOT EXISTS BillingRustorePurchases (\n                        purchaseId TEXT PRIMARY KEY,\n                        accountId INTEGER NOT NULL,\n                        productIdFromRustore TEXT NOT NULL,\n                        serverId INTEGER NOT NULL,\n                        summa INTEGER NOT NULL,\n                        invoiceId TEXT NOT NULL,\n                        appmetricaDeviceId TEXT,\n                        nickname TEXT NOT NULL\n                    )\n                ");
        } catch (Exception e) {
            com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog("createBillingRustorePurchases " + e);
        }
    }

    @NotNull
    public static final Migration getMigration_4_5() {
        return Migration_4_5;
    }
}
