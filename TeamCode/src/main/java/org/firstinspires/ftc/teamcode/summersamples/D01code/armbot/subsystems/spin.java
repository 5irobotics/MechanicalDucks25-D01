package org.firstinspires.ftc.teamcode.summersamples.D01code.armbot.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class spin extends OpMode {
    public void JoystickMove(double joystick, DcMotor motor, double pwr) {
        motor.setPower(joystick*pwr);
    }

    public void ButtonMove(boolean outbutton, boolean inbutton, DcMotor motor, Double pwr){
        if(outbutton){
            motor.setPower(pwr);
        }
        else if(inbutton){
            motor.setPower(-pwr);
        }
        else{
            motor.setPower(0);
        }
    }

    @Override
    public void init() {

    }

    @Override
    public void loop() {

    }
}
