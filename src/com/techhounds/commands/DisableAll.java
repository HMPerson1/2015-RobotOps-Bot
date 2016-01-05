package com.techhounds.commands;

import com.techhounds.RobotMap;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DisableAll extends CommandGroup {
    
    public  DisableAll() {
    	super.setRunWhenDisabled(true);
    	addParallel(new SetCollectorPower(0));
    	addParallel(new SetHumanLauncherPower(0));
    	addParallel(new SetRobotLauncherPower(0));
    	addParallel(new SetRampPosition(RobotMap.DOWN));
    	addParallel(new SetCollectorPosition(RobotMap.DOWN));
    	addParallel(new SetServos(RobotMap.UP));
    	SmartDashboard.putString("We are doing Stuf", "NO absolutely not");
    	
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
