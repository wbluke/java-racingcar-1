package racingcar.utils;

import racingcar.domain.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertUtils {
    private ConvertUtils() {
    }

    public static List<String> getNamesOfCars(List<Car> cars) {
        return cars.stream()
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    public static String[] trim(String[] inputs) {
        return Arrays.stream(inputs).map(String::trim).toArray(String[]::new);
    }
}