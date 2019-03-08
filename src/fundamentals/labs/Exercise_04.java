package fundamentals.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {
        public static void main(String[] args) {
            String name="furkan";
            //System.out.println("The person is "+name+" His age is "+getAge());
            System.out.println("The volume is "+getVolume (3.14, 5,3.14159));
            System.out.println("The surface area is "+getSurfaceArea(3.14,5,3.14159,2));

        }

        public static double getVolume(double radius, double height, double pi) {
            double volume = radius * radius * height * pi;
            return volume;

        }
        public static double getSurfaceArea (double radius, double height, double pi, double x) {
            double surfaceArea = x * radius * radius * pi + x * pi * radius * height;
            return surfaceArea;
    }
}
