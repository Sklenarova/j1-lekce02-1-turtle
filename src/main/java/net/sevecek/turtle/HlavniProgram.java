package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        zofka.move(60);
        zofka.turnLeft(45);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(45);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(50);
    }
}
