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

    public static class Lobber1 {
    	public static final int LOBBER_1_MOTOR = 0;
    }

    public static class Collector {
        public static final int COLLECTOR_MOTOR = 0;
    }

    public static class CollectorPanels {
        public static final int COLLECTOR_PANEL_UP_MOTOR = 0;
        public static final int COLLECTOR_PANEL_DOWN_MOTOR = 0;
    }

    public static class CollectorMover {
        public static final int COLLECTOR_MOVER_SOLENOID = 0;
    }
    
    public static class Lobber2 {
    	public static final int LOBBER_2_MOTOR = 0;
    }
}
