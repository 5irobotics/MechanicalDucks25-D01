package org.firstinspires.ftc.teamcode.summersamples.D01code.armbot.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class arm {
    public void JoystickMove(double joystick, DcMotor motor, double pwr) {
        motor.setPower(joystick*pwr);
    }

    public void ButtonMove(boolean upbutton, boolean downbutton, DcMotor motor, Double pwr){

    }
}
