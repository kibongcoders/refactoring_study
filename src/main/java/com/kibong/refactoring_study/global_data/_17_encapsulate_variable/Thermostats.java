package com.kibong.refactoring_study.global_data._17_encapsulate_variable;

public class Thermostats {

    //Getter Setter로 변수를 감싸줄 수 있다.
    private Integer targetTemperature = 70;

    private Boolean heating = true;

    private Boolean cooling = false;

    private Boolean readInFahrenheit = true;

    public Integer getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(Integer targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

    public Boolean getHeating() {
        return heating;
    }

    public void setHeating(Boolean heating) {
        this.heating = heating;
    }

    public Boolean getCooling() {
        return cooling;
    }

    public void setCooling(Boolean cooling) {
        this.cooling = cooling;
    }

    public Boolean getReadInFahrenheit() {
        return readInFahrenheit;
    }

    public void setReadInFahrenheit(Boolean readInFahrenheit) {
        this.readInFahrenheit = readInFahrenheit;
    }
}
