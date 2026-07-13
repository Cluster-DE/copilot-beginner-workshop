package de.workshop.modul1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit-Tests für {@link EmailValidator#isValid(String)}.
 */
class EmailValidatorTest {

    // --- gültige Adressen ---

    @ParameterizedTest
    @ValueSource(strings = {
            "user@example.com",
            "user.name@example.com",
            "user+tag@sub.domain.org",
            "a@b.de"
    })
    void isValid_validEmails_returnsTrue(String email) {
        assertThat(EmailValidator.isValid(email)).isTrue();
    }

    // --- ungültige Adressen ---

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"   "})
    void isValid_blankOrNull_returnsFalse(String email) {
        assertThat(EmailValidator.isValid(email)).isFalse();
    }

    @Test
    void isValid_missingAtSign_returnsFalse() {
        assertThat(EmailValidator.isValid("userexample.com")).isFalse();
    }

    @Test
    void isValid_emptyLocalPart_returnsFalse() {
        assertThat(EmailValidator.isValid("@example.com")).isFalse();
    }

    @Test
    void isValid_multipleAtSigns_returnsFalse() {
        assertThat(EmailValidator.isValid("user@@example.com")).isFalse();
        assertThat(EmailValidator.isValid("us@er@example.com")).isFalse();
    }

    @Test
    void isValid_missingDotInDomain_returnsFalse() {
        assertThat(EmailValidator.isValid("user@examplecom")).isFalse();
    }

    @Test
    void isValid_dotAtStartOfDomain_returnsFalse() {
        assertThat(EmailValidator.isValid("user@.example.com")).isFalse();
    }

    @Test
    void isValid_dotAtEndOfDomain_returnsFalse() {
        assertThat(EmailValidator.isValid("user@example.")).isFalse();
    }

    @Test
    void isValid_emptyDomain_returnsFalse() {
        assertThat(EmailValidator.isValid("user@")).isFalse();
    }
}
