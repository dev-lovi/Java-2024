
public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame () {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isright = false;
        boolean p2isright = false;
        boolean p3isright = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("La maquina piensa un numero entre 0 y 9 ...");

        while(true) {
            System.out.println("El numero a adivinar es " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("El jugador 1 dice " + guessp1);

            guessp2 = p2.number;
            System.out.println("El jugador 2 dice " + guessp2);

            guessp3 = p3.number;
            System.out.println("El jugador 3 dice " + guessp3);

            if (guessp1 == targetNumber) {
                p1isright = true;
            }
            if (guessp2 == targetNumber) {
                p2isright = true;
            }
            if (guessp3 == targetNumber) {
                p3isright = true;
            }

            if (p1isright || p2isright || p3isright) {

                System.out.println("Tenemos un ganador");
                System.out.println("Jugador 1 " + p1isright);
                System.out.println("Jugador 2 " + p2isright);
                System.out.println("Jugador 3 " + p3isright);
                break;
            } else {
                System.out.println("No ganó nadie");
                //break;
            }
        }
    }    
}
