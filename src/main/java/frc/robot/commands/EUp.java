// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Elevator;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.RobotContainer;


/** An example command that uses an example subsystem. */
public class EUp extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final Elevator m_elevator;

  /**
   * Creates a new ExampleCommand.
   *
   * @param Elevator The subsystem used by this command.
   */
  public EUp(Elevator Elevator) {
    m_elevator = Elevator;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Elevator);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if(RobotContainer.Limit==false){
    m_elevator.up();
  }
  else{
    m_elevator.LBup();
  }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_elevator.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
   
    return false;
  }
}
