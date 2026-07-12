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
            "a@b.de",
            "firstname.lastname@company.co.uk"
    })
    void gueltigeEmailsGeben_true(String email) {
        assertThat(EmailValidator.isValid(email)).isTrue();
    }

    // --- ungültige Adressen ---

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {
            "kein-at-zeichen",
            "@kein-local-part.de",
            "doppelt@@example.com",
            "user@",
            "user@ohnepoint",
            "user@.anfang.de",
            "user@domain."
    })
    void ungueltigeEmailsGeben_false(String email) {
        assertThat(EmailValidator.isValid(email)).isFalse();
    }

    @Test
    void leerzeichenOhneAtGibtFalse() {
        assertThat(EmailValidator.isValid("   ")).isFalse();
    }

    @Test
    void nurAtZeichenGibtFalse() {
        assertThat(EmailValidator.isValid("@")).isFalse();
    }
}
