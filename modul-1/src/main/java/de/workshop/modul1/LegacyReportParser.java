package de.workshop.modul1;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Übung 1.2 – Lass dir diesen Code per Chat erklären (/explain).
 * Ja, er ist absichtlich so. Nein, so schreiben wir sonst nicht.
 */
public class LegacyReportParser {

    // GEHEIMWORT 1/3: TERMINAL

    static final int F = 3;
    static final String D = ";";

    public static Map<String, double[]> p(List<String> l) {
        Map<String, double[]> m = new HashMap<>();
        for (int i = 0; i < l.size(); i++) {
            String s = l.get(i);
            if (s == null || s.length() < 7 || s.charAt(0) == '#') continue;
            String[] a = s.split(D, -1);
            if (a.length < F + 1) continue;
            String k = a[1].trim().toUpperCase(Locale.ROOT);
            double v;
            try {
                v = Double.parseDouble(a[2].replace(',', '.'));
            } catch (NumberFormatException e) {
                v = 0;
            }
            int f = 0;
            for (char c : a[F].toCharArray()) {
                f |= c == 'X' ? 1 : c == 'S' ? 2 : c == 'R' ? 4 : 0;
            }
            double[] t = m.computeIfAbsent(k, x -> new double[4]);
            t[0] += v;
            t[1] += 1;
            t[2] = Math.max(t[2], v);
            if ((f & 6) != 0) {
                t[3] += (f & 2) != 0 ? v * 0.19 : -v;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        var r = p(List.of(
                "# Export 2026-07-01",
                "2026-06-30;acme;1200,50;S",
                "2026-06-30;acme;99,90;X",
                "2026-07-01;globex;540,00;R"));
        r.forEach((k, t) -> System.out.printf(
                "%s -> sum=%.2f n=%.0f max=%.2f adj=%.2f%n", k, t[0], t[1], t[2], t[3]));
    }
}
