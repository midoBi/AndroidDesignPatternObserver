package appre.com.androidobserverpattern;

/**
 * Created by mehdi on 20/07/2018.
 */

public interface RepositoryObserver {
    void onUserDataChanged(String fullname, int age);
}
