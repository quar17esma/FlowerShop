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
}
