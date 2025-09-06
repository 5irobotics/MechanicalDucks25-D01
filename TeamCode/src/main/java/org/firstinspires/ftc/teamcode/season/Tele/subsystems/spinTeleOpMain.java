package org.firstinspires.ftc.teamcode.season.Tele.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class spinTeleOpMain extends OpMode {
    public void JoystickMove(double joystick, DcMotor motor, double pwr) {
        motor.setPower(joystick*pwr);
    }

    public void ButtonMove(boolean upbutton, boolean downbutton, DcMotor motor, Double pwr){

    }

    @Override
    public void init() {

    }

    @Override
    public void loop() {

    }
}
