package cap07;

public class UsaTelevisor {
    public static void main(String[] args) {
        Televisor tv = new Televisor();
        tv.canal = 150;
        tv.volume = 3;
        tv.aumentarVolume();
        tv.trocarCanal(10);
        tv.mostrar();
    }
}
