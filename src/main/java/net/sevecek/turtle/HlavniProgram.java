package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();


        //horni rada domu
        zofka.setLocation(100,300);
        nakresliDomecek(zofka);
        zofka.setLocation(200,300);
        nakresliDomecek(zofka);
        zofka.setLocation(300,300);
        nakresliDomecek(zofka);
        zofka.setLocation(400,300);
        nakresliDomecek(zofka);
        zofka.setLocation(500,300);
        nakresliDomecek(zofka);
        //spodni rada domu
        zofka.setLocation(100,410);
        nakresliDomecek(zofka);
        zofka.setLocation(500,410);
        nakresliDomecek(zofka);
        //pismenka
        zofka.setLocation(100,520);
        nakresliL(zofka);
        zofka.setLocation(200,520);
        nakresliI(zofka);
        zofka.setLocation(300,520);
        nakresliD(zofka);
        zofka.setLocation(400,520);
        nakresliK(zofka);
        zofka.setLocation(500,520);
        nakresliA(zofka);
        //prasatko
        zofka.setLocation(280,400);
        nakresliPrasatko(zofka);
        //slunce
        zofka.setLocation(80,80);
        nakresliSlunce(zofka);
    }

    private void nakresliL(Turtle zofka) {
        zofka.move(60);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(20);
        zofka.turnLeft(90);
    }
    private void nakresliI(Turtle zofka) {
        zofka.move(60);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.turnLeft(90);
    }

    private void nakresliD(Turtle zofka) {
        zofka.move(60);
        zofka.turnRight(90);

        for (int i = 0; i < 10; i++) {
            zofka.move(12);
            zofka.turnRight(20);
        }
        zofka.turnRight(70);
    }

    private void nakresliK(Turtle zofka) {
        zofka.move(60);
        zofka.turnLeft(180);
        zofka.move(30);
        zofka.turnLeft(135);
        zofka.move(40.159);
        zofka.turnLeft(180);
        zofka.move(40.159);
        zofka.turnLeft(90);
        zofka.move(40.159);
        zofka.turnLeft(45);
        zofka.penUp();
        zofka.move(30);
        zofka.penDown();
        zofka.turnLeft(90);
    }

    private void nakresliA(Turtle zofka) {
        zofka.turnRight(30);
        zofka.move(60);
        zofka.turnRight(125);
        zofka.move(60);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(30);
        zofka.turnLeft(65);
        zofka.penDown();
        zofka.move(30);
        zofka.turnRight(90);
    }
    private void nakresliSlunce(Turtle zofka) {
        for (int i = 0; i < 25; i++) {
            zofka.move(12);
            zofka.turnLeft(90);
            zofka.move(20);
            zofka.penUp();
            zofka.turnLeft(180);
            zofka.move(20);
            zofka.turnLeft(75);
            zofka.penDown();

        }
    }

    private void nakresliDomecek(Turtle zofka){
        for (int i = 0; i < 4; i++) {
            zofka.move(50);
            zofka.turnRight(90);
        }
        zofka.penUp();
        zofka.move(50) ;
        zofka.penDown();
        zofka.turnRight(30.0);
        zofka.move(50.0);
        zofka.turnRight(120.0);
        zofka.move(50.0);

        zofka.turnRight(30.0);
        zofka.penUp();
        zofka.move(50.0);
        zofka.turnRight(90.0);
        zofka.move(50.0);
        zofka.turnRight(90.0);
        zofka.penDown();

    }

    private void nakresliPrasatko(Turtle zofka) {
        zofka.move(50.0);
        zofka.turnRight(90.0);
        zofka.move(100.0);
        zofka.turnRight(90.0);
        zofka.move(50.0);
        zofka.turnRight(25.0);
        zofka.move(20.0);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(20);
        zofka.turnRight(110);
        zofka.penDown();
        zofka.move(20);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(20);
        zofka.turnRight(315);
        zofka.penDown();
        zofka.move(100);
        zofka.turnLeft(50.0);
        zofka.move(20.0);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(20);
        zofka.turnRight(110);
        zofka.penDown();
        zofka.move(20);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(20);
        zofka.turnRight(315);
        zofka.turnRight(20);
        zofka.penDown();
        zofka.move(45);
        zofka.turnRight(115);
        zofka.move(45);
    }
}
