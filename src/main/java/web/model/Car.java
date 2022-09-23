package web.model;

public class Car {

    private String model;

    private String series;

    private String regNumber;

    public Car() {
    }

    public Car(String model, String series, String regNumber) {
        this.model = model;
        this.series = series;
        this.regNumber = regNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", regNumber='" + regNumber + '\'' +
                '}';
    }

}
