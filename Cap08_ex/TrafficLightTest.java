// Exercício 8.10

public class TrafficLightTest {
    public static void main(String[] args) {
        System.out.println("Traffic Lights:");
        for (TrafficLight light : TrafficLight.values())
            System.out.printf("%6s %17s %-6s%n",light,"light duration is",light.getDuration());
    }
}
