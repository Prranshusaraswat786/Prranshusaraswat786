
import java.util.Scanner;

public class areaandvolume {
    public static void main(String[] args) {
        System.out.println("area of circle= 1\n"
                + "area of square= 2\narea of rectangle= 3\nperimerter of circle= 4\nsurface area of cube= 5\n"
                + "surface area of cuboid= 6\nvolume of cube= 7\nvolume of cuboid= 8\narea of hemisphere= 9\narea of sphere= 10\n"
                +
                "volume of sphere= 11");
        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();
            switch (a) {
                case 1: {
                    System.out.println("Enter the radius:= ");
                    Float r = in.nextFloat();
                    double area = r * 3.14 * r;
                    System.out.println(area);
                    break;
                }
                case 2: {
                    System.out.println("Enter the side:= ");
                    Float s = in.nextFloat();
                    double area = s * s;
                    System.out.println(area);
                    break;
                }
                case 3: {
                    System.out.println("Enter the side L & B:= ");
                    Float L = in.nextFloat();
                    Float B = in.nextFloat();
                    double area = 2 * (L + B);
                    System.out.println(area);
                    break;
                }
                case 4: {
                    System.out.println("Enter the radius:+ ");
                    Float r = in.nextFloat();
                    double peri = 2 * 3.14 * r;
                    System.out.println(peri);
                    break;
                }
                case 5: {
                    System.out.println("Enter the side:= ");
                    Float s = in.nextFloat();
                    double sur = 4 * s * s;
                    System.out.println(sur);
                    break;
                }
                case 6: {
                    System.out.println("Enter the side L & B & H:= ");
                    Float L = in.nextFloat();
                    Float B = in.nextFloat();
                    Float H = in.nextFloat();
                    double sur = 2 * ((L * B) + (B * H) + (H * L));
                    System.out.println(sur);
                    break;
                }
                case 7: {
                    System.out.println("Enter the side := ");
                    Float s = in.nextFloat();
                    double vol = s * s * s;
                    System.out.println(vol);
                    break;
                }
                case 8: {
                    System.out.println("Enter the side L & B & H:= ");
                    Float L = in.nextFloat();
                    Float B = in.nextFloat();
                    Float H = in.nextFloat();
                    double vol = L * B * H;
                    System.out.println(vol);
                    break;
                }
                case 9: {
                    System.out.println("Enter the radius:= ");
                    Float r = in.nextFloat();
                    double area = 2 * (3.14 * r * r) / 3;
                    System.out.println(area);
                    break;
                }
                case 10: {
                    System.out.println("Enter the radius:= ");
                    Float r = in.nextFloat();
                    double area = 4 * (3.14 * r * r) / 3;
                    System.out.println(area);
                    break;
                }
                case 11: {
                    System.out.println("Enter the radius:= ");
                    Float r = in.nextFloat();
                    double vol = 4 * (3.14 * r * r * r) / 3;
                    System.out.println(vol);
                    break;
                }
                default: {
                    System.out.println("Wrong no choose:: :");
                    break;
                }
            }
        }

    }

}
