import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

class KirjahyllyTest {

    @Test
    void lisaaKirjaLisaaKirjanHyllyyn() {
        Kirjahylly kirjahylly = new Kirjahylly();
        kirjahylly.lisaaKirja("Testikirja");

        assertTrue(kirjahylly.onkoKirjaHyllyssa("Testikirja"));
    }

    @Test
    void viimeksiLisattyPalauttaaOikeanKirjan() {
        Kirjahylly kirjahylly = new Kirjahylly();
        kirjahylly.lisaaKirja("Ensimmäinen kirja");
        kirjahylly.lisaaKirja("Toinen kirja");

        assertEquals("Toinen kirja", kirjahylly.viimeksiLisatty());
    }

    @Test
    void onkoKirjaHyllyssaPalauttaaFalseJosKirjaaEiOle() {
        Kirjahylly kirjahylly = new Kirjahylly();
        kirjahylly.lisaaKirja("Kirja hyllyssä");

        assertFalse(kirjahylly.onkoKirjaHyllyssa("Ei ole hyllyssä"));
    }

    @Test
    void getKirjojaHyllyssaPalauttaaOikeanMaaran() {
        Kirjahylly kirjahylly = new Kirjahylly();
        kirjahylly.lisaaKirja("Kirja 1");
        kirjahylly.lisaaKirja("Kirja 2");

        assertEquals(2, kirjahylly.getKirjojaHyllyssa());
    }
}
