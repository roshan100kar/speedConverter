public class SpeedConverter {
    static int kmph_to_mps(double kmph)
    {
        return (int) (0.277778 * kmph);

    }
        static  int mps_to_kmph(double mps) {
        return (int) (3.6 * mps);
        }

    public static void main(String[] args) {
        double kmph = 72.0;
        double mps = 10.0;
        System.out.println("Speed in meter per second = " + kmph_to_mps(kmph) + "speed in kili meter per hour = " + mps_to_kmph(mps));


    }
}
