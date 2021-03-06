// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeMaintain;

public class AllIntakeOff extends CommandBase {
  /**
   * Creates a new AllIntakeOff.
   */
  private final IntakeMaintain m_IntakeMaintain;

  public AllIntakeOff(IntakeMaintain intakeMaintain) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_IntakeMaintain = intakeMaintain;
    addRequirements(m_IntakeMaintain);

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_IntakeMaintain.intakeOff();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}