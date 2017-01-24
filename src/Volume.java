public class Volume {
    public static void main(String[] args) {
        final double PI = 3.1414;
        int h =10;
        int r = 7;
        double V = PI * Math.pow(r, 2) * h;
        double S = 2 * PI * r * ( r + h );

//        double s = PI * Math.pow(r, 2);
        System.out.println(V);
        System.out.println(S);

    }

}
