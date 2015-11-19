package com.techhounds;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static class Drive {
        public static final int FRONT_RIGHT_MOTOR = 0;
        public static final int FRONT_LEFT_MOTOR = 0;
        public static final int REAR_RIGHT_MOTOR = 0;
        public static final int REAR_LEFT_MOTOR = 0;
    }
}
