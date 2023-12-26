package HW_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    private Car car;
    private  Motorcycle moto;

    @BeforeEach
    void init() {
        car = new Car("Audi", "Q8", 2020);
        moto = new Motorcycle("Suzuki", "Q8", 2020);

    }

    @Test
    void isTypeVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    @Test
    void has4Wheels() {
        assertEquals(4, car.getNumWheels());
    }

    @Test
    void has2Wheels() {
        assertEquals(2, moto.getNumWheels());
    }

    @Test
    void speedInTestDriveCar() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    void speedInTestDriveMoto() {
        moto.testDrive();
        assertEquals(75, moto.getSpeed());
    }

    @Test
    void testSpeedInParkCar() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    void testSpeedInParkMoto() {
        moto.testDrive();
        moto.park();
        assertEquals(0, moto.getSpeed());
    }

    void test() {
        Car car = null;
        assertThrows(NullPointerException.class, () -> car.testDrive(),
                "Can`t do testDrive without car initializing");
    }
}