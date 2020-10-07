package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class PrintTest extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {

        waitForStart();
        while(opModeIsActive()){
            telemetry.addData("Test Print: ", "Print");
            telemetry.update();
        }
    }
}