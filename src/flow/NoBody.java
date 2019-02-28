package flow;

public class NoBody {
    public static void main(String[] args) {
        int i = 100;
        int j = 200;        // найти середину между i и j
        while (++i < --j) ; // цикл без тела
        System.out.println("Середина: " + i);
    }
}
