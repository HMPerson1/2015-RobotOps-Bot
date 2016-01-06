package com.techhounds.commands;

import com.techhounds.RobotMap;
import com.techhounds.subsystems.LobberSubsystem;
import com.techhounds.subsystems.RampSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SetRampPosition extends Command {
	RampSubsystem ramp;
	LobberSubsystem lobber;
	boolean up;
    public SetRampPosition(boolean up) {
    	ramp = RampSubsystem.getInstance();
    	lobber = LobberSubsystem.getInstance();
    	this.up = up;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if(up){
    		lobber.setPower(0);
    	}else{
    		lobber.setPower(RobotMap.Lobber.LOBBER_SPEED);
    	}
    	ramp.set(up);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
