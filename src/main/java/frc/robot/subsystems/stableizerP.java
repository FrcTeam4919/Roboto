package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import frc.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class stableizerP extends SubsystemBase{
    private DoubleSolenoid fourth = Robot.use.makeDoubleSolenoid( 12, 13);
   
  
  
public stableizerP(){}
//better than InnOut, toggle for the stablization piston.
public void OutnIn(){
    fourth.toggle();
   
   
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
