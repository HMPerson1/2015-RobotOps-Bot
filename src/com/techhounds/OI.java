package com.techhounds;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import com.techhounds.commands.Drive;
import com.techhounds.commands.ExampleCommand;
import com.techhounds.commands.SetCollectorPosition;
import com.techhounds.commands.SetCollectorPower;
import com.techhounds.commands.SetHumanLauncherPower;
import com.techhounds.commands.SetRampPosition;
import com.techhounds.commands.SetRobotLauncherPower;
import com.techhounds.commands.SetServos;
import com.techhounds.subsystems.CollectorSolenoidSubsystem;
import com.techhounds.subsystems.LobberSubsystem;
import com.techhounds.subsystems.ShooterSubsystem;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public OI(){
		driver = new ControllerMap(new Joystick(0));
		
		initDashboard();
		initButtons();
	}
	
	public static ControllerMap driver;
	
	
	
	int setPanelsUpInt = ControllerMap.UP;
	int setPanelsDownInt = ControllerMap.DOWN;
	int setRampUp = ControllerMap.RT;
	int toggleCollector = ControllerMap.LT;
	
	
	int collectorInButton = ControllerMap.B;
	int collectorOutButton = ControllerMap.X;
	int driverCollectorUpButton = ControllerMap.Y;
	int driverCollectorDownButton = ControllerMap.A;
	
	
	Button setPanelsUp;
	Button setPanelsDown;
	Button toggleCollect;
	
	Button incrementShootSpeed; //Port # 7
	Button decrementShootSpeed;//Port # 8
	Button servoUp;
	Button ServoDown;
	Button collectorUp;
	Button collectorDown;
	Button ramppUp;
	Button rampDown;
	Button driverCollectorUp;
	Button driverCollectorDown;
	Button collectorIn;
	Button collectorOut;
	
	public void initButtons(){
		
		toggleCollect = driver.createButton(toggleCollector);
		toggleCollect.whenPressed(new SetServos(RobotMap.DOWN));
		toggleCollect.whenPressed(new SetCollectorPower(0.3));
		toggleCollect.whenReleased(new SetCollectorPower(0.0));
		toggleCollect.whenReleased(new SetServos(RobotMap.UP));
		
		driverCollectorUp = driver.createButton(driverCollectorUpButton);
		driverCollectorUp.whenPressed(new SetCollectorPosition(RobotMap.UP));
		
		driverCollectorDown = driver.createButton(driverCollectorDownButton);
		driverCollectorDown.whenPressed(new SetCollectorPosition(RobotMap.DOWN) );
		
		collectorIn = driver.createButton(collectorInButton);
		collectorIn.whenPressed(new SetCollectorPower(.3));
		
		collectorOut = driver.createButton(collectorOutButton);
		collectorIn.whenPressed(new SetCollectorPower(-.3));
		
		
		
		
	}
	
	
	public void initDashboard(){
		//SmartDashboard.putData("Start Driving", new Drive());
		SmartDashboard.putData("Set Servos Up", new SetServos(true));
		SmartDashboard.putData("Set Servos Down", new SetServos(false));
		SmartDashboard.putData("Set RobotLauncher Power", new SetRobotLauncherPower(.5));
		SmartDashboard.putData("Set HumanLauncher Power", new SetHumanLauncherPower(.5));
		SmartDashboard.putData("Set Collector", new SetCollectorPower(-.3));
		SmartDashboard.putData("Ramp Up", new SetRampPosition(RobotMap.UP));
		SmartDashboard.putData("Collector Up", new SetCollectorPosition(RobotMap.UP));
		SmartDashboard.putData("Collector", CollectorSolenoidSubsystem.getInstance());
		
		SmartDashboard.putData("Lobber", LobberSubsystem.getInstance());
		SmartDashboard.putData("Shooter", ShooterSubsystem.getInstance());
	}
	public static double getDriverRightXAxis() {
    	return driver.getRightStickX();
    }

    public double getDriverRightYAxis() {
    	return driver.getRightStickY();
    }

    public static double getDriverLeftXAxis() {
    	return driver.getLeftStickX();
    }

    public static double getDriverLeftYAxis() {
    	return driver.getLeftStickY();
    }
    
    

    private static OI instance;

    public static OI getInstance() {
        if (instance == null) {
            instance = new OI();
        }
        return instance;
    }
}
