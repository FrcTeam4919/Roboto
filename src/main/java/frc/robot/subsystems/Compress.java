// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import org.ejml.concurrency.EjmlConcurrency;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.PneumaticsModuleType;

public class Compress extends SubsystemBase {
  /** Creates a new compressor. */
  
   private Compressor compressfact ;
  
   public Compress() {
   compressfact = new Compressor(1, PneumaticsModuleType.REVPH);
 addChild("CompressFactory",compressfact);
   }

  
  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
