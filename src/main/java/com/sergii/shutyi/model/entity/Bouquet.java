package com.sergii.shutyi.model.entity;

import com.sergii.shutyi.model.entity.accessory.Base;
import com.sergii.shutyi.model.entity.accessory.Basket;
import com.sergii.shutyi.model.entity.accessory.Tape;
import com.sergii.shutyi.model.entity.accessory.Wrapper;
import com.sergii.shutyi.model.entity.plant.Flower;
import com.sergii.shutyi.model.enums.*;

import java.util.ArrayList;

public class Bouquet {
    Price price;
    Use use;
    Stems stems;
    Size size;
    Freshness freshness;

    Wrapper wrapper;
    Basket basket;
    Tape tape;
    Base base;

    ArrayList<Flower> flowers;


    //getters and setters
    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Use getUse() {
        return use;
    }

    public void setUse(Use use) {
        this.use = use;
    }

    public Stems getStems() {
        return stems;
    }

    public void setStems(Stems stems) {
        this.stems = stems;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Freshness getFreshness() {
        return freshness;
    }

    public void setFreshness(Freshness freshness) {
        this.freshness = freshness;
    }

    public Wrapper getWrapper() {
        return wrapper;
    }

    public void setWrapper(Wrapper wrapper) {
        this.wrapper = wrapper;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Tape getTape() {
        return tape;
    }

    public void setTape(Tape tape) {
        this.tape = tape;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }
}
