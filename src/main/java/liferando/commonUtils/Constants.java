package liferando.commonUtils;

/***
 * This class consists of constants used across all tests.
 * @author uva
 *
 */

public class Constants {
    //Liferando site.
    private static final String liferandoapplink = "https://www.lieferando.de/en/";
 
    public static String getLiferandoApplink() {
	return liferandoapplink;
}
    private static final int waitAfterClick= 3000;

    public static int getWaitAfterClick(){return waitAfterClick;}

    private static final int waitForNewPage = 5000;

    public static int getWaitForNewPage(){return waitForNewPage;}
}