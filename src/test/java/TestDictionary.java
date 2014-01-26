import de._0x29.xkpasswd.Dictionary;

import java.io.IOException;

/**
 * Created by christian on 1/26/14.
 */
public class TestDictionary {

    public static void main(String... args) {
        try {
            new Dictionary();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
