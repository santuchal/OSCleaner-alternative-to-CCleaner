/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcleaner;

/**
 *
 * @author Test
 */
import java.io.*;
import java.util.Date;
import javax.swing.JTextArea;

public class cmd {

   public static JTextArea jTextArea = new JTextArea();
   public static String line;
    public static String line1,line2,line3,line4,line5,line6,line7,line8,line9,line10,line11,line12;
    public static void temp_del() {
        try {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "erase \"%TEMP%\\*.*\" /f /s /q");
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
           // String line;

            while (true) {
                line = r.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
               // jTextArea.append(line);
            }
        } catch (Exception e) {

        }
    }

    public static void adv_temp_del_all_user() {
        try {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "for /D %i in (\"%TEMP%\\*\") do RD /S /Q \"%i\"");
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            while (true) {
                line1 = r.readLine();
                if (line1 == null) {
                    break;
                }
                System.out.println(line1);
            }
        } catch (Exception e) {

        }
    }

    public static void adv_firefox() {
        try {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "for /d %x in (%LOCALAPPDATA%\\..\\Roaming\\Mozilla\\Firefox\\Profiles\\*)do del /q /s /f %x\\*sqlite");
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
          
            while (true) {
                line3 = r.readLine();
                if (line3 == null) {
                    break;
                }
                System.out.println(line3);
            }
            System.out.println("Complete");
        } catch (Exception e) {

        }
    }

    public static void firefox() {
        try {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "erase \"%LOCALAPPDATA%\\Mozilla\\Firefox\\Profiles\\*.*\" /f /s /q ");
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
         
            while (true) {
                line8 = r.readLine();
                if (line8 == null) {
                    break;
                }
                System.out.println(line8);
            }
        } catch (Exception e) {

        }
    }

    public static void adv_chrome() {
        try {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "for /D %i in (\"%LOCALAPPDATA%\\Google\\Chrome\\User Data\\*\") do RD /S /Q \"%i\"");
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            while (true) {
                line4 = r.readLine();
                if (line4 == null) {
                    break;
                }
                System.out.println(line4);
            }
        } catch (Exception e) {

        }
    }

    public static void chrome() {
        try {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "erase \"%LOCALAPPDATA%\\Google\\Chrome\\User Data\\*.*\" /f /s /q");
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
           
            while (true) {
                line9 = r.readLine();
                if (line9 == null) {
                    break;
                }
                System.out.println(line9);
            }
        } catch (Exception e) {

        }
    }

    public static void adv_IE() {
        try {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "RunDll32.exe InetCpl.cpl,ClearMyTracksByProcess 255");
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
           
            while (true) {
                line5 = r.readLine();
                if (line5 == null) {
                    break;
                }
                System.out.println(line5);
            }
        } catch (Exception e) {

        }
    }
    
    public static void safari() {
        try {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "erase /q /s /f \"%LOCALAPPDATA%\\Opera Software\\Opera Stable\\*.*\"","rd /s /q \"%LOCALAPPDATA%\\Opera Software\\Opera Stable");
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
           
            while (true) {
                line10 = r.readLine();
                if (line10 == null) {
                    break;
                }
                System.out.println(line10);
            }
        } catch (Exception e) {

        }
    }
    
    public static void adv_safari() {
        try {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "erase /q /s /f \"%LOCALAPPDATA%\\..\\Roaming\\Opera Software\\Opera Stable\\*.*\"","rd /s /q \"%LOCALAPPDATA%\\..\\Roaming\\Opera Software\\Opera Stable\"");
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
           
            while (true) {
                line6 = r.readLine();
                if (line6 == null) {
                    break;
                }
                System.out.println(line6);
            }
        } catch (Exception e) {

        }
    }

    
      public static void opera() {
        try {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "erase /q /s /f \"%LOCALAPPDATA%\\History\"","rd /s /q \"%LOCALAPPDATA%\\History\"");
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
           
            while (true) {
                line11 = r.readLine();
                if (line11 == null) {
                    break;
                }
                System.out.println(line11);
            }
        } catch (Exception e) {

        }
    }
    
    public static void adv_opera() {
        try {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "erase /q /s /f \"%LOCALAPPDATA%\\..\\Roaming\\Applec~1\\Safari\"","rd /s /q \"%LOCALAPPDATA%\\..\\Roaming\\Applec~1\\Safari\"");
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
           
            while (true) {
                line7 = r.readLine();
                if (line7 == null) {
                    break;
                }
                System.out.println(line7);
            }
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) throws Exception {

      

 
    }
}
