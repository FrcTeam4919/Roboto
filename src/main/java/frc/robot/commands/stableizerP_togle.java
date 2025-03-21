// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.stableizerP;
import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class stableizerP_togle extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final stableizerP m_stableizerP;

  /**
   * Creates a new ExampleCommand.
   *
   * @param climbPistons The subsystem used by this command.
   */
  public stableizerP_togle(stableizerP rPiston) {
    m_stableizerP = rPiston;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(rPiston);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_stableizerP.OutnIn();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
