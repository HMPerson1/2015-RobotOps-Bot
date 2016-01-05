package com.techhounds.commands;

import com.techhounds.RobotMap;
import com.techhounds.subsystems.CollectorSolenoidSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SetCollectorPosition extends Command {
	CollectorSolenoidSubsystem mover;
	boolean up;
	
    public SetCollectorPosition(boolean up) {
		this.up = up;
        mover = CollectorSolenoidSubsystem.getInstance();
        requires(mover);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	mover.set(up);
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
    	end();
    }

	
}
