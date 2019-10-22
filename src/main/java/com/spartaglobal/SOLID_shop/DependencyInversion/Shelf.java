package com.spartaglobal.SOLID_shop.DependencyInversion;

public class Shelf {

    public IProducts addDvdToShelf (IProducts iProducts){
        return iProducts;
    }
}
