package com.techhounds;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static final boolean UP = true;
	public static final boolean DOWN = false;
    public static class Drive {
        public static final int FRONT_RIGHT_MOTOR = 1;
        public static final int FRONT_LEFT_MOTOR = 0;
        public static final int REAR_RIGHT_MOTOR = 3;
        public static final int REAR_LEFT_MOTOR = 2;
    }

    public static class Lobber {
    	public static final boolean ROBOT_LOBBER = false;
    	public static final boolean HUMAN_LOBBER = true;
    	public static final int LOBBER_1_MOTOR = 7;//Human lobber
    	public static final int LOBBER_2_MOTOR = 6;//Robot Lobber
    }

    public static class Collector {
        public static final int COLLECTOR_MOTOR = 5;
    }

    public static class CollectorPanels {
    	public static final double LEFT_DOWN_POSITION = .5;
    	public static final double LEFT_UP_POSITION = 0;
    	public static final double RIGHT_DOWN_POSITION = .3;
    	public static final double RIGHT_UP_POSITION = .9;
        public static final int LEFT_PANEL_SERVO = 8;
        public static final int RIGHT_PANEL_SERVO = 9;
    }

    public static class Solenoids {
    	
    	public static final boolean RAMP = false;
    	public static final boolean COLLECTOR = true;
        public static final int COLLECTOR_MOVER_SOLENOID = 0;
        public static final int RAMP_MOVER_SOLENOID = 0;
    }
    
    public static class Lobber2 {
    	public static final int LOBBER_2_MOTOR = 0;
    }
    
    public static double rangeCheck(double check){
    	if(check > 1){
    		return 1;
    	}else if(check < -1){
    		return -1;
    	}else{
    		return check;
    	}
    }
}
