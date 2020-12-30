package com.davidsalter.seamsecurity;

import java.util.Random;
import org.jboss.seam.annotations.Create;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.captcha.Captcha;
import org.jboss.seam.captcha.CaptchaResponse;

/**
 * Sample source code for Chapter 10 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */

@Name("org.jboss.seam.captcha.captcha")
public class SubtractCaptcha extends Captcha {

    @Override
    @Create
    public void init() {
        Random random = new Random(1234567890);
        int firstNum = random.nextInt(100);
        int secondNum = random.nextInt(100);
        this.setChallenge(firstNum+"-"+secondNum);
        this.setCorrectResponse(""+(firstNum-secondNum));
    }

    @Override
    @CaptchaResponse(message="Math isn't your strong point is it?")
    public String getResponse() {
        return super.getResponse();
    }
}
