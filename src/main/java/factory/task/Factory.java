package factory.task;

import factory.task.cars.*;

public interface Factory {

   Car buildBMW(BMWModel model);
   Car buildFord(FordModel model);

}
