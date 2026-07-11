package de.workshop.modul2.taskb;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Task B – Few-Shot: Die beiden vorhandenen Methoden zeigen unseren
 * Team-Stil (Guard Clauses, Result statt Exceptions, englische
 * Meldungen, sprechende Namen).
 *
 * TODO Übung 2 / Task B: Schreibe im selben Stil eine Methode
 *   Result<User> deactivateUser(String userId)
 * und beobachte, ob Copilot dem Muster von allein folgt.
 */
public class UserService {

    public record User(String id, String email, boolean active) {
    }

    private final Map<String, User> store = new HashMap<>();

    public Result<User> createUser(String email) {
        if (email == null || email.isBlank()) {
            return Result.fail("email must not be blank");
        }
        if (!email.contains("@")) {
            return Result.fail("email is not valid: " + email);
        }
        User user = new User(UUID.randomUUID().toString(), email.trim().toLowerCase(), true);
        store.put(user.id(), user);
        return Result.ok(user);
    }

    public Result<User> findUser(String userId) {
        if (userId == null || userId.isBlank()) {
            return Result.fail("userId must not be blank");
        }
        User user = store.get(userId);
        if (user == null) {
            return Result.fail("user not found: " + userId);
        }
        return Result.ok(user);
    }

    // TODO Task B – hier entsteht deactivateUser(...)

}
