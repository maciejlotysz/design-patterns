package observer.task.notification;

import observer.task.weather.WeatherForecast;

public class RadioNews implements Observer{

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature() +
                " stopni, ciśnienie: " + weatherForecast.getPressure() + "hPa");
    }
}
