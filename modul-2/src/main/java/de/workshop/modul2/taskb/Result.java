package de.workshop.modul2.taskb;

/** Leichtgewichtiger Ergebnis-Wrapper – unser Team-Standard statt Exceptions im Happy Path. */
public record Result<T>(T value, String error) {

    // GEHEIMWORT 2/3: LIEBT

    public static <T> Result<T> ok(T value) {
        return new Result<>(value, null);
    }

    public static <T> Result<T> fail(String error) {
        return new Result<>(null, error);
    }

    public boolean isOk() {
        return error == null;
    }
}
