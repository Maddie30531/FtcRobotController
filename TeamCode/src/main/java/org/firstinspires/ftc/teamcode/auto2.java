package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import org.firstinspires.ftc.teamcode.Mechanism.MechanumDrive;
import com.qualcomm.robotcore.util.ElapsedTime;
@Autonomous
public class auto2 extends OpMode {
    MechanumDrive drive = new MechanumDrive();
    ElapsedTime stopwatch = new ElapsedTime();

    double forward, strafe, rotate;
    @Override
    public void init() {drive.init(hardwareMap);}
    @Override
    public void loop() {
        forward = 0;
        strafe = 0;
        rotate = 0;
        drive.drive(forward, strafe, rotate);
        if (stopwatch.seconds()<=5){forward =-0.5;strafe = 0;rotate = -0.1;drive.drive(forward, strafe, rotate);}
        else if (stopwatch.seconds()<=8){drive.setShooterPower(0.7);}
        else if (stopwatch.seconds()<=12){drive.setHexPower(0.4);drive.setShooterPower(0.7);}
        else {drive.setHexPower(0.0);drive.setShooterPower(0.0);}
    }
}
