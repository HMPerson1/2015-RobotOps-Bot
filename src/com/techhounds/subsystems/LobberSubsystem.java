package com.techhounds.subsystems;


import static com.techhounds.RobotMap.Lobber.*;

import com.techhounds.Robot;
import com.techhounds.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class LobberSubsystem extends AbstractShooterSubsystem {
	
	static LobberSubsystem instance;
	private LobberSubsystem() {
		super(RobotMap.Lobber.LOBBER, false);
	}
	public static LobberSubsystem getInstance() {
		if(instance == null){
			instance = new LobberSubsystem();
		}
		return instance;
	}
	
}

