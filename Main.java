
public class Main {

public static void main(String[]args) {

System.out.println("Hello, Comrades.");  
System.out.println("This is the error detector." + '\n'); 

String[] modules = {
    "Front Left",
    "Front Right",
    "Back Left",
    "Back Right"
};


double[] targetAngles = {90, 180, 0, 270};
double[] actualAngles = {92, 165, 8, 250};


double errorThreshold = 10.0;



//check each module for alignment

// Left Front Module
if(Math.abs(targetAngles[0] - actualAngles[0]) > errorThreshold) {
    System.out.println(modules[0] + " module is out of alignment.");    
double error = targetAngles[0] - actualAngles[0];
    System.out.println("Error: " + error + " degrees." + '\n');

}else {
    System.out.println(modules[0] + " module is aligned." + '\n');

}


// Right Front Module
if(Math.abs(targetAngles[1] - actualAngles[1]) > errorThreshold) {
    System.out.println(modules[1] + " module is out of alignment." );    
double error = targetAngles[1] - actualAngles[1];
    System.out.println("Error: " + error + " degrees." + '\n');

}else {
    System.out.println(modules[1] + " module is aligned.");
}


// Left Back Module
if(Math.abs(targetAngles[2] - actualAngles[2]) > errorThreshold) {
    System.out.println(modules[2] + " module is out of alignment." );    
    double error = targetAngles[2] - actualAngles[2];
    System.out.println("Error: " + error + " degrees."+ '\n');
}else {
    System.out.println(modules[2] + " module is aligned." + '\n');
}


// Right Back Module
if(Math.abs(targetAngles[3] - actualAngles[3]) > errorThreshold) {
    System.out.println(modules[3] + " module is out of alignment.");    
double error = targetAngles[3] - actualAngles[3];
    System.out.println("Error: " + error + " degrees." + '\n');
}else {
    System.out.println(modules[3] + " module is aligned." + '\n');
}

System.out.println(" Comrade Error detection complete.");

}





}



