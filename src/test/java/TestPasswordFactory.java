import de._0x29.xkpasswd.PasswordFactory;

/**
 * Created by christian on 1/26/14.
 */
public class TestPasswordFactory {

    public static void main(String... args) {
        String randomPass = new PasswordFactory().setNumberOfWords(4).setMinimumWordLength(5).
                setMaximumWordLength(9).setWordDelimiter(" ").create();
        System.out.println(randomPass);
    }

}
