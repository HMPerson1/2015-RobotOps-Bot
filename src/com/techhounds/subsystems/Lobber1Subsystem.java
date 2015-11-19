package com.techhounds.subsystems;

import static com.techhounds.RobotMap.Lobber1.*;
import com.techhounds.Robot;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Lobber1Subsystem extends Subsystem {
	
	private static final double ON = 0.5, OFF = 0;
	private boolean isEnabled;
	private SpeedController speed;
	
	private static Lobber1Subsystem instance;
	
	private Victor lobber1;
	
	private Lobber1Subsystem() {
		super("LOBBER 1 SUBSYSTEM");
		
		lobber1 = new Victor(LOBBER_1_MOTOR);
	}
	
	public void initDefaultCommand() {
		
	}
	
	public static Lobber1Subsystem getInstance() {
		if (instance == null) {
			instance = new Lobber1Subsystem();
		}
		return instance;
	}
	
	public double getPower() {
		return isEnabled ? speed.get() : 0;
	}
	
	public void setPower(double power) {
		speed.set(Robot.checkRange(power, -1, 1));
	}
}
