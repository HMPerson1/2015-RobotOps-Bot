package com.techhounds.commands;

import com.techhounds.RobotMap;
import com.techhounds.subsystems.LobberSubsystem;
import com.techhounds.subsystems.ShooterSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SetRobotLauncherPower extends Command {
	ShooterSubsystem lobber;
	double power;
    public SetRobotLauncherPower(double power) {
    	lobber = ShooterSubsystem.getInstance();
    	requires(lobber);
    	this.power = power;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	lobber.setPower(-power);
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
