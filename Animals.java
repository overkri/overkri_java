package Homework_6;

public class Animals {
    int run_distance_limit;
    double jump_height_limit;
    int swim_distance_limit;

    public Animals() {
        this.run_distance_limit = 0;
        this.jump_height_limit = 0;
        this.swim_distance_limit = 0;
    }


    void run(int a) {
        boolean A;
        if (a < run_distance_limit) {
            A = true;
        } else A = false;
        System.out.println("Result of run : " + A);
        System.out.println();
    }

    void jump(double b) {
        boolean B;
        if (b < jump_height_limit) {
            B = true;
        } else B = false;
        System.out.println("Result of jump : " + B);
        System.out.println();
    }

    void swim(int c) {
        boolean C;
        if (c < swim_distance_limit) {
            C = true;
        } else C = false;
        System.out.println("Result of swim : " + C);
        System.out.println();
    }


}