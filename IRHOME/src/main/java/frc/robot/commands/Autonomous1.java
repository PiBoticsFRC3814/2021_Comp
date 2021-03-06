// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;



import com.analog.adis16448.frc.ADIS16448_IMU;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.*;


// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class Autonomous1 extends SequentialCommandGroup {

  /**
   * Creates a new Autonomous1.
   */
  public Autonomous1(DriveTrain piboticsdrive, Limelight limeLight, Shooter piboticsShooter, IntakeMaintain intake, ADIS16448_IMU gyroscope) {
   addCommands(
    //new CrossLine(piboticsdrive, gyroscope),
    new AutonomousShoot1(limeLight, piboticsShooter, piboticsdrive, intake, gyroscope),
    new AutonomousShoot2(limeLight, piboticsShooter, piboticsdrive, intake, gyroscope),
    new AutonomousShoot3(limeLight, piboticsShooter, piboticsdrive, intake, gyroscope) 
    );
  }
}