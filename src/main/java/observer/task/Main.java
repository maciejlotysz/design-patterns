package observer.task;

import observer.task.notification.InternetNews;
import observer.task.notification.RadioNews;
import observer.task.notification.TvNews;
import observer.task.weather.WeatherForecast;

public class Main {

    public static void main(String[] args) {

        WeatherForecast weatherForecast = new WeatherForecast(25, 1003);
        InternetNews internetNews = new InternetNews();
        RadioNews radioNews = new RadioNews();
        TvNews tvNews = new TvNews();

        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(tvNews);
        weatherForecast.notifyObservers();

        System.out.println("----------------------------------");

        weatherForecast.unregisterObserver(tvNews);
        weatherForecast.unregisterObserver(radioNews);
        System.out.println("Nowa prognoza pogody tylko dla serwisu internetowego:");
        weatherForecast.updateForecast(18, 1007);

    }
}
