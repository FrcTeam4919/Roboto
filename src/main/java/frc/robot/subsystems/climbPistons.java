package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import frc.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class climbPistons extends SubsystemBase{
    private DoubleSolenoid accendFR = Robot.use.makeDoubleSolenoid(0, 1);
   private DoubleSolenoid accendFL = Robot.use.makeDoubleSolenoid( 2, 3);
   private DoubleSolenoid accendBR = Robot.use.makeDoubleSolenoid( 14, 15);
  
  
public climbPistons(){}

public void Accend(){
    accendFR.toggle();
    accendFL.toggle();
    accendBR.toggle();
   
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
