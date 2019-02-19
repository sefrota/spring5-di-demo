package guru.springframework.services;

/**
 * Created by sergioletras on 13/02/19.
 */
public class GreetingServiceFactory {

    GreetingRepository repository;

    public GreetingServiceFactory(GreetingRepository repository) {
        this.repository = repository;
    }

    public GreetingService createGreetingService(String lang){

        switch (lang){
            case "en":
                return new PrimaryGreetingService(repository);
            case "es":
                return new PrimarySpanishGreetingService(repository);
            case "de":
                return new PrimaryGermanGreetingService(repository);
            default:
                return new PrimaryGreetingService(repository);
        }
    }
}
