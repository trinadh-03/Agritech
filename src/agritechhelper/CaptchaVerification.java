/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agritechhelper;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author mekal
 */
public class CaptchaVerification {
   public String getCaptcha()
    {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder captcha = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(characters.length());
            captcha.append(characters.charAt(index));
        }

        return captcha.toString();
    }
    BufferedImage generateCaptchaImage(String captcha) {
        int width = 160;
        int height = 100;

        // Create an image
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = bufferedImage.createGraphics();

        // Set background color
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);

        // Add noise lines
        g.setColor(Color.BLACK);
        for (int i = 0; i < 15; i++) {
            int x1 = new Random().nextInt(width);
            int y1 = new Random().nextInt(height);
            int x2 = new Random().nextInt(width);
            int y2 = new Random().nextInt(height);
            g.drawLine(x1, y1, x2, y2);
        }

        // Add random filled circles for further obfuscation
        g.setColor(Color.GRAY);
        for (int i = 0; i < 10; i++) {
            int radius = 10 + new Random().nextInt(20);
            int x = new Random().nextInt(width - radius);
            int y = new Random().nextInt(height - radius);
            g.fillOval(x, y, radius, radius);
        }

        // Set font and color for CAPTCHA text
        g.setFont(new Font("Arial", Font.BOLD, 20));
        Random random = new Random();

        // Draw the CAPTCHA string with mosaic-style distortion
        for (int i = 0; i < captcha.length(); i++) {
            g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255))); // Random color
            int charX = 30 * i + 20;
            int charY = 50;

            // Apply a slight rotation to each character
            g.rotate(Math.toRadians(random.nextInt(15) - 7), charX, charY);
            g.drawString(String.valueOf(captcha.charAt(i)), charX, charY);
            g.rotate(-Math.toRadians(random.nextInt(15) - 7), charX, charY);  // Reset rotation
        }

        // Dispose of the graphics context
        g.dispose();

        return bufferedImage;
    }
    // Method to set CAPTCHA image in JLabel6
    void setCaptchaInLabel(JLabel label6, String captcha) {
        BufferedImage captchaImage = generateCaptchaImage(captcha);

        // Set the CAPTCHA image as an icon for JLabel6
        ImageIcon captchaIcon = new ImageIcon(captchaImage);
        label6.setIcon(captchaIcon);
    }
    
}
