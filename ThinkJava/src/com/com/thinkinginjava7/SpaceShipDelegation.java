package com.com.thinkinginjava7;

/**
 * Created by xuxi on 2019/2/22.
 */
public class SpaceShipDelegation {

    private String name;
    private SpaceShipControls controls = new SpaceShipControls();

    public SpaceShipDelegation(String name){
        this.name = name;
    }

    public void up(int velocity) {
        controls.up(velocity);
    }

    public void left(int velocity) {
        controls.left(velocity);
    }

    public void back(int veloctiy) {
        controls.back(veloctiy);
    }

    public void right(int veloctiy) {
        controls.right(veloctiy);
    }

    public void forward(int veloctiy) {
        controls.forward(veloctiy);
    }

    public void down(int velocity) {
        controls.down(velocity);
    }

    public void turboBoost() {
        controls.turboBoost();
    }

    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation("NSEA Protector");
        protector.forward(100);
    }
}
