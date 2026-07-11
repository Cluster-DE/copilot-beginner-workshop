package de.workshop.modul2.taska;

import java.time.LocalDate;

/** Eine Bestellung – Basis für Task A. */
public record Order(String customerId, String product, double amount, LocalDate date) {
}
