package org.firstinspires.ftc.teamcode.season.Tele;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.teamcode.summersamples.D01code.armbot.subsystems.spin;
import org.firstinspires.ftc.teamcode.summersamples.D01code.armbot.subsystems.driveTeleOpClone;

@TeleOp
public class MainTeleOp extends OpMode {
    /*

    declare variables

     */

    public DcMotor FLeft;
    public DcMotor FRight;
    public DcMotor BLeft;
    public DcMotor BRight;
    public DcMotor Spin;

    // subsystems

    private final driveTeleOpClone driveSubsystem = new driveTeleOpClone();
    private final spin spinSubsystem = new spin();


    public void init() {
        FLeft  = hardwareMap.get(DcMotor.class, "FLeft");
        FRight  = hardwareMap.get(DcMotor.class, "FRight");
        BLeft  = hardwareMap.get(DcMotor.class, "BLeft");
        BRight  = hardwareMap.get(DcMotor.class, "BRight");

        FLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        FRight.setDirection(DcMotorSimple.Direction.FORWARD);
        BLeft.setDirection(DcMotorSimple.Direction.FORWARD);
        BRight.setDirection(DcMotorSimple.Direction.FORWARD);
        Spin = hardwareMap.get(DcMotor.class,"spin");

        FLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        FRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        BLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        BRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        FLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        FRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        BLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        BRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }

    public void loop(){
        driveSubsystem.Move(gamepad1.right_stick_y,
                            gamepad1.right_stick_x,
                            FLeft, BLeft, FRight, BRight);
        driveSubsystem.DPAD(gamepad1.dpad_up,
                  gamepad1.dpad_right,
                  gamepad1.dpad_down,
                  gamepad1.dpad_left,
                  FLeft, BLeft, FRight, BRight);
        driveSubsystem.rotation(gamepad1.right_bumper, gamepad1.left_bumper,
                FLeft, BLeft, FRight, BRight);
        spinSubsystem.JoystickMove(gamepad2.right_stick_y, Spin, 0.5);
    }
}
