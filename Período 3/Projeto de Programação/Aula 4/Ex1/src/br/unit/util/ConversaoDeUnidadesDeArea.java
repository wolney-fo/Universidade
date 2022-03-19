package br.unit.util;

public class ConversaoDeUnidadesDeArea {
    private double area_size;
    private String convert_from;
    private String convert_to;

    private double x;
    private double result;


    public double getArea_size() {
        return area_size;
    }

    public void setArea_size(double area_size) {
        this.area_size = area_size;
    }

    public String getConvert_from() {
        return convert_from;
    }

    public void setConvert_from(String convert_from) {
        this.convert_from = convert_from;
    }

    public String getConvert_to() {
        return convert_to;
    }

    public void setConvert_to(String convert_to) {
        this.convert_to = convert_to;
    }



    public void converter(){
        switch (getConvert_from()){
            case "m2":
                break;

            case "cm2":
                x = getArea_size() / 10000.0;
                break;

            case "mi2":
                x = getArea_size() * 2589988.11034;
                break;

            case "p2":
                x = getArea_size() / 10.764;
                break;

            case "acre":
                x = getArea_size() * 4046.0;
                break;
        }

        switch (getConvert_to()){
            case "m2":
                result = x;

            case "cm2":
                result = getArea_size() * 10000.0;
                break;

            case "mi2":
                result = getArea_size() * 0.000000386102;
                break;

            case "p2":
                result = getArea_size() * 10.764;
                break;

            case "acre":
                result = getArea_size() / 4047.0;
                break;
        }

        System.out.printf("\n%.4f %s esquivale a %.4f %s", getArea_size(), getConvert_from(), result, getConvert_to());

    }


}
