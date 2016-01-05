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
import com.techhounds.subsystems.LobberSubsystem;

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
	
	int turnOnHumanLobberInt = ControllerMap.A;
	int turnOffHumanLobberInt = ControllerMap.Y;
	int turnOnRobotLobberInt = ControllerMap.X;
	int turnOffRobotLobberInt = ControllerMap.B;
	int setPanelsUpInt = ControllerMap.UP;
	int setPanelsDownInt = ControllerMap.DOWN;
	int setRampUp = ControllerMap.RT;
	int toggleCollector = ControllerMap.LT;
	
	Button turnOnHumanLobber;
	Button turnOffHumanLobber;
	Button turnOnRobotLobber;
	Button turnOffRobotLobber;
	Button setPanelsUp;
	Button setPanelsDown;
	Button toggleCollect;
	
	public void initButtons(){
		
		toggleCollect = driver.createButton(toggleCollector);
		toggleCollect.whenPressed(new SetServos(RobotMap.DOWN));
		toggleCollect.whenPressed(new SetCollectorPower(0.3));
		toggleCollect.whenReleased(new SetCollectorPower(0.0));
		toggleCollect.whenReleased(new SetServos(RobotMap.UP));
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
		
		
		
		SmartDashboard.putData(LobberSubsystem.getInstance());
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
