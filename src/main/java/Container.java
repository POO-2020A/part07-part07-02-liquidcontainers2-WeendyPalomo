/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WENDY
 */
public class Container {

    private int liquid;

    public Container() {
        this.liquid = 0;
    }

    public int contains() {
        return this.liquid;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.liquid = this.liquid + amount;
        } else {
            amount = 0;
        }
        if (this.liquid > 100) {
            this.liquid = 100;
        }
    }

    public void remove(int amount) {
        if (amount >= 0) {
            if (this.liquid < amount) {
                this.liquid = 0;
            } else {
                this.liquid = this.liquid - amount;
            }
        } else {
            this.liquid = liquid;
        }
    }

    @Override
    public String toString() {
        return this.liquid + "/100";
    }
}
