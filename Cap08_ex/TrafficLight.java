// Exercício 8.10
public enum TrafficLight {
    RED("Short"),
    GREEN("Medium"),
    YELLOW("Long");

    private final String duration;

    TrafficLight(String lightDuration){
        duration = lightDuration;
    }

    public String getDuration(){
        return duration;
    }
}
