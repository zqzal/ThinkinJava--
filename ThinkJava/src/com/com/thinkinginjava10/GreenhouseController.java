package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/22.
 */
public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls  gc = new GreenhouseControls();
        gc.addEvent(gc.new Bell(900));

        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new Wateroff(800),
                gc.new ThermostatDay(1400)
        };

        gc.addEvent(gc.new Restart(2000,eventList));

        //主动调用终止
        gc.addEvent(new GreenhouseControls.Terminate(1400));

//        if (args.length == 1){
//            gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
//        }
        gc.run();

    }
}
