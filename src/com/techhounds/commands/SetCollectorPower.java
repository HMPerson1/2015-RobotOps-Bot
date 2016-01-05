package com.techhounds.commands;

import com.techhounds.subsystems.CollectorSubsystem;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class SetCollectorPower extends Command {
	
	CollectorSubsystem collector;
	double power;

    public SetCollectorPower(double power) {
    	
    	collector = CollectorSubsystem.getInstance();
    	this.power = power;
    	requires(collector);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	SmartDashboard.putNumber("We are doing Stuff", power);
    	collector.setPower(power);
    	SmartDashboard.putNumber("We are doing Stuff", power);
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
