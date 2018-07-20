package appre.com.androidobserverpattern;

/**
 * Created by mehdi on 20/07/2018.
 */

public interface Subject {
    void registerObserver(RepositoryObserver repositoryObserver);
    void removeObserver(RepositoryObserver repositoryObserver);
    void notifyObservers();
}
