package pear.gumeniuk.retrofit2;

/**
 * Created by Ваня on 22.03.2017.
 */

public class Contributor {

    String login;
    String html_url;

    int contributions;

    @Override
    public String toString() {
        return  login +" (" + contributions + ") ";
    }

    public String getLogin() {
        return login;
    }

    public int getContributions() {
        return contributions;
    }
}
