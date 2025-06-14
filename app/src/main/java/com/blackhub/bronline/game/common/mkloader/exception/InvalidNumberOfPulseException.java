package com.blackhub.bronline.game.common.mkloader.exception;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public class InvalidNumberOfPulseException extends Exception {
    @Override // java.lang.Throwable
    public String getMessage() {
        return "The number of pulse must be between 2 and 6";
    }
}
