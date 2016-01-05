package com.techhounds.subsystems;


import static com.techhounds.RobotMap.Lobber.*;

import com.techhounds.Robot;
import com.techhounds.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class LobberSubsystem extends Subsystem {
	
	private boolean isEnabled;
	
	private static LobberSubsystem humanInstance;
	private static LobberSubsystem robotInstance;
	
	private Victor lobber;
	
	private LobberSubsystem(boolean lobber1) {
		super("LOBBER SUBSYSTEM");
		
		if(lobber1)
			lobber = new Victor(LOBBER_1_MOTOR);
		else
			lobber = new Victor(LOBBER_2_MOTOR);
	}
	
	public void initDefaultCommand() {
		
	}
	public static LobberSubsystem getInstance(boolean lobber1) {
		if (humanInstance == null) {
			humanInstance = new LobberSubsystem(HUMAN_LOBBER);
		}
		if(robotInstance == null){
			robotInstance = new LobberSubsystem(ROBOT_LOBBER);
		}
		return lobber1 ? humanInstance : robotInstance;
		
	}
	
	public double getPower() {
		return isEnabled ? Math.abs(lobber.get()) : 0;
	}
	
	public void setPower(double power) {
		SmartDashboard.putNumber("Here", power);
		lobber.set(Robot.checkRange(power, -1, 1));
	}
	
}
