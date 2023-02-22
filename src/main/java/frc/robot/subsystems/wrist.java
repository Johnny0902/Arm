// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class wrist extends SubsystemBase {
  VictorSPX m_wrist;
  /** Creates a new wrist. */
  public wrist() {
    m_wrist = new VictorSPX(Constants.ArmConstants.wristID);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
