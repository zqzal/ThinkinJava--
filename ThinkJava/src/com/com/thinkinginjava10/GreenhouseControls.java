package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/22.
 */
public class GreenhouseControls extends Controller {

    private boolean light = false;
    public class LightOn extends Event{

        protected LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = true;
        }

        @Override
        public String toString() {
            return "Light is on";
        }
    }


    public class LightOff extends Event{

        protected LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = false;
        }

        @Override
        public String toString() {
            return "Light is off";
        }
    }


    private boolean  water = false;
    public class WaterOn extends Event{

        protected WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = true;
        }

        @Override
        public String toString() {
            return "Greenhouse water is on";
        }
    }

    public class Wateroff extends Event{

        protected Wateroff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = false;
        }

        @Override
        public String toString() {
            return "Greenhouse water is off";
        }
    }

    private String thermostat = "Day";
    public class ThermostatNight extends Event{

        protected ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Night";
        }

        @Override
        public String toString() {
            return "Themostatat on night setting";
        }
    }

    public class ThermostatDay extends Event{

        protected ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Day";
        }

        @Override
        public String toString() {
            return "Thermostat on day setting";
        }
    }

    //
    public class Bell extends Event{

        protected Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }

        @Override
        public String toString() {
            return "Bing!";
        }
    }

    public class Restart extends Event{
        private Event[] eventList;

        protected Restart(long delayTime,Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList){
                addEvent(e);
            }
        }

        @Override
        public void action() {
            for (Event e: eventList){
                e.start();//返回每个Event
                addEvent(e);
            }
            start(); //返回当前Event
            addEvent(this);
        }

        @Override
        public String toString() {
            return "Restarting system";
        }
    }

    public static class Terminate extends Event{

        protected Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }

        @Override
        public String toString() {
            return "Terminating";
        }
    }

}
